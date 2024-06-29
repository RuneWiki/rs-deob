import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class527 extends class551 {

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "Z")
    public static boolean field7072 = false;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public static int field7071 = 1;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "Lhba;")
    public static class10 field7074;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(FI)V")
    public final void method2921(float arg0, int arg1) {
        ++field7070;
        super.field7798 = arg0;
        if (arg1 <= 12) {
            field7074 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII)I")
    public static final int method2922(int arg0, int arg1, int arg2, int arg3) {
        ++field7077;
        if (arg3 > -39) {
            return -27;
        } else {
            int var4 = arg0 / arg2;
            int var5 = arg0 & arg2 - 1;
            int var6 = arg1 / arg2;
            int var7 = arg1 & arg2 - 1;
            int var8 = class604.method3344(19, var6, var4);
            int var9 = class604.method3344(-117, var6, var4 + 1);
            int var10 = class604.method3344(84, var6 + 1, var4);
            int var11 = class604.method3344(19, var6 + 1, var4 + 1);
            int var12 = class404.method2340(arg2, (byte) -38, var8, var5, var9);
            int var13 = class404.method2340(arg2, (byte) 107, var10, var5, var11);
            return class404.method2340(arg2, (byte) 104, var12, var7, var13);
        }
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)Lkda;")
    public static final class391 method2923(int arg0) {
        ++field7076;
        int var1 = 93 % ((arg0 - -68) / 52);
        class13 var2 = null;
        class391 var3 = new class391(class51.field541, 0);
        try {
            class107 var4 = class287.field3823.method4143("", true, 21516);
            while (~var4.field1419 == -1) {
                class267.method1599(0, 1L);
            }
            if (var4.field1419 == 1) {
                var2 = (class13) var4.field1418;
                byte[] var5 = new byte[(int) var2.method49((byte) -112)];
                int var7;
                for (int var6 = 0; ~var5.length < ~var6; var6 += var7) {
                    var7 = var2.method50(var5.length - var6, (byte) -26, var6, var5);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var3 = new class391(new class611(var5), class51.field541, 0);
            }
        } catch (Exception var9) {
        }
        try {
            if (var2 != null) {
                var2.method51(true);
            }
        } catch (Exception var8) {
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(IIIIIF)V")
    public class527(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)V")
    public static void method2924(int arg0) {
        field7074 = null;
        if (arg0 != 1) {
            field7072 = false;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)Z")
    public static final boolean method2925(int arg0, byte arg1) {
        ++field7075;
        if (arg1 > -36) {
            method2923(-63);
        }
        return arg0 == 7 || ~arg0 == -10;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBII)V")
    public final void method2926(int arg0, byte arg1, int arg2, int arg3) {
        super.field7801 = arg0;
        super.field7800 = arg2;
        ++field7073;
        if (arg1 > -120) {
            method2923(-17);
        }
        super.field7793 = arg3;
    }
}
