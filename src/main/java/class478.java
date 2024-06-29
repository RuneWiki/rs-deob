import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class478 extends class338 {

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public int field6460;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "Lvl;")
    public static class15 field6458 = new class15(55, 8);

    @OriginalMember(owner = "client!la", name = "q", descriptor = "Lfja;")
    public static class783 field6461 = new class783(76, -1);

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field6465 = 0;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2736(String arg0, int arg1) {
        class648.method3634(0, arg0, (byte) -13, "", "", arg1, "");
        field6462++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)Lot;")
    public static final class617 method2737(byte arg0, int arg1) {
        field6456++;
        int var2 = 34 % ((arg0 + 47) / 52);
        class617[] var3 = class682.method3845(-2);
        for (int var4 = 0; var4 < var3.length; var4++) {
            class617 var5 = var3[var4];
            if (var5.field8591 == arg1) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;")
    public static final String[] method2738(String arg0, char arg1, int arg2) {
        field6454++;
        int var3 = class220.method1515(arg0, false, arg1);
        if (arg2 != 14388) {
            field6458 = null;
        }
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0.charAt(var8) != arg1; var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)Laca;")
    public final class758 method228(int arg0) {
        field6459++;
        if (arg0 != 1) {
            field6458 = null;
        }
        return class673.field9342;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(ILeaa;Lcq;III)V")
    public class478(int arg0, class528 arg1, class494 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6460 = arg5;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZI)V")
    public static final void method2739(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field6455++;
            if (class659.method3706(124, arg2)) {
                class555.method3196(class431.field5870[arg2], arg0, (byte) 68);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
    public static void method2740(byte arg0) {
        field6458 = null;
        int var1 = 22 % ((arg0 - 27) / 43);
        field6461 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
    public static final void method2741(int arg0, int arg1, int arg2) {
        field6457++;
        if (arg2 != -1) {
            field6464 = -14;
        }
        class495.method2841(arg0, 16, arg1);
    }
}
