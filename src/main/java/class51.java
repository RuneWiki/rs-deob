import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class51 {

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    private int field733;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public int field737;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "B")
    public byte field736;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "Lmf;")
    public class51 field740;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field728 = new String[100];

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "[I")
    public static int[] field731 = new int[16384];

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "[I")
    public static int[] field743 = new int[16384];

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "S")
    public static short field746;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public int field732;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public int field742;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public int field744;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public int field747;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    public static int field750;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field743[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field731[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field746 = 1;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)Lmf;", line = 9)
    public final class51 method339(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -12690) {
            this.field738 = -40;
        }
        field748++;
        return new class51(this.field733, arg3, arg0, arg2, this.field736);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)Llv;", line = 22)
    public final class529 method340(int arg0) {
        if (arg0 != -29383) {
            this.method340(39);
        }
        field745++;
        return class16.method118(this.field733, true);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLpg;)V", line = 42)
    public static final void method341(boolean arg0, class333 arg1) {
        field739++;
        if (class203.field2938 == null) {
            class394 var2 = new class394();
            byte[] var3 = var2.method2337(128, 16, 128, 122);
            class203.field2938 = class394.method2336(false, var3, arg0);
        }
        if (class134.field2049 == null) {
            class373 var4 = new class373();
            byte[] var5 = var4.method2239(128, 16, 128, (byte) -120);
            class134.field2049 = class394.method2336(false, var5, false);
        }
        if (arg0) {
            field728 = null;
        }
        class143 var6 = arg1.field4726;
        if (var6.method997(16532) && class363.field5223 == null) {
            byte[] var7 = class372.method2228(50, 8, 0.5F, 16.0F, 0.6F, 128, 16, 4.0F, 128, 4.0F, new class35(419684));
            class363.field5223 = class394.method2336(false, var7, false);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V", line = 105)
    public static void method342(int arg0) {
        field728 = null;
        field743 = null;
        if (arg0 != -329) {
            field728 = null;
        }
        field731 = null;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(IIIIB)V", line = 119)
    public class51(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field733 = arg0;
        this.field735 = arg1;
        this.field737 = arg2;
        this.field738 = arg3;
        this.field736 = arg4;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lmf;I)V", line = 133)
    public class51(class51 arg0, int arg1) {
        this.field740 = arg0;
        this.field738 = this.field740.field738 + arg1;
        this.field736 = this.field740.field736;
        this.field735 = this.field740.field735 + arg1;
        this.field737 = this.field740.field737 + arg1;
        this.field733 = this.field740.field733;
    }
}
