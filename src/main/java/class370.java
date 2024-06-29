import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class370 extends class1 {

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public int field4534;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "Lrn;")
    public static class633 field4533 = new class633(24, 4);

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "Z")
    public static boolean field4538 = false;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "Loq;")
    public static class775 field4537;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "[I")
    public static int[] field4536;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lwm;ZLjava/lang/String;I)Lff;")
    public static final class607 method2123(class30 arg0, boolean arg1, String arg2, int arg3) {
        field4531++;
        if (arg3 != 5657) {
            method2123(null, true, null, -81);
        }
        int var4 = arg0.method135(0, arg2);
        if (var4 == -1) {
            return new class607(0);
        }
        int[] var5 = arg0.method125(var4, (byte) -48);
        class607 var6 = new class607(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field7691 > var7) {
                class234 var9 = new class234(arg0.method139(var4, (byte) -94, var5[var8++]));
                int var10 = var9.method1497((byte) 74);
                int var11 = var9.method1553((byte) 104);
                int var12 = var9.method1509(true);
                if (!arg1 && var12 == 1) {
                    var6.field7691--;
                } else {
                    var6.field7690[var7] = var10;
                    var6.field7688[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)Lgp;")
    public final class576 method3(byte arg0) {
        if (arg0 >= -15) {
            return null;
        } else {
            field4532++;
            return class682.field8797;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
    public static void method2124(int arg0) {
        field4536 = null;
        field4537 = null;
        if (arg0 <= 81) {
            method2124(-6);
        }
        field4533 = null;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(ILpf;Ldg;III)V")
    public class370(int arg0, class759 arg1, class20 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4534 = arg5;
    }
}
