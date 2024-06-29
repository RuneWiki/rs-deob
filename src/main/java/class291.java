import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class291 {

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "[I")
    private int[] field4642;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "[Z")
    public static boolean[] field4640 = new boolean[100];

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field4634 = 0;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4645;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZZ)I")
    public static final int method1951(boolean arg0, boolean arg1) {
        field4638++;
        if (!arg1) {
            method1957(101, 21, -109, -13, -89, -33, 125, 36, 62, 68, 33, -65, -80, -62, -17, 14, 25, -101, -45, -62);
        }
        long var2 = class299.method2006(9594);
        for (class194 var4 = arg0 ? (class194) class107.field1530.method1458(0) : (class194) class107.field1530.method1462(-10000001); var4 != null; var4 = (class194) class107.field1530.method1462(-10000001)) {
            if (var2 > (var4.field2957 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field2957 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2141;
                    class189.field2864[var5] = class31.field470[var5];
                    var4.method962(128);
                    return var5;
                }
                var4.method962(128);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Ljg;")
    public static final class167 method1952(int arg0, int arg1) {
        class167 var2 = (class167) class103.field1475.method950((long) arg1, (byte) -45);
        field4641++;
        if (var2 != null) {
            return var2;
        } else if (arg0 == 0) {
            byte[] var3 = class167.field2394.method2050(arg0 ^ 0x48, class43.method285((byte) -32, arg1), class256.method1672((byte) -94, arg1));
            class167 var4 = new class167();
            var4.field2383 = arg1;
            if (var3 != null) {
                var4.method1069(new class215(var3), false);
            }
            class103.field1475.method942((long) arg1, (byte) 66, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "([I)V")
    public class291(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field4642 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field4642[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field4642[var5 - (-var5 - 1)] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field4642[var5 + var5] = arg0[var4];
            this.field4642[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)I")
    public final int method1953(int arg0, byte arg1) {
        field4636++;
        int var3 = (this.field4642.length >> 1) - 1;
        int var4 = 47 % ((-arg1 - 45) / 44);
        int var5 = var3 & arg0;
        while (true) {
            int var6 = this.field4642[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field4642[var5 + var5] == arg0) {
                return var6;
            }
            var5 = var3 & var5 + 1;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILnh;II)[Ljc;")
    public static final class284[] method1954(int arg0, class305 arg1, int arg2, int arg3) {
        field4639++;
        if (arg3 == -1) {
            return class131.method832(arg2, arg0, arg3 ^ 0x6F, arg1) ? class138.method870(-10633) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIII)V")
    public static final void method1955(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 20683) {
            return;
        }
        field4644++;
        if (class221.field3440 == 0 || arg0 == 0 || class114.field1647 >= 50 || arg1 == -1) {
            return;
        }
        class167.field2389[class114.field1647] = arg1;
        class106.field1515[class114.field1647] = arg0;
        class191.field2910[class114.field1647] = arg3;
        class128.field1791[class114.field1647] = null;
        class200.field3044[class114.field1647] = 0;
        class45.field670[class114.field1647] = arg4;
        class114.field1647++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
    public static void method1956(boolean arg0) {
        if (!arg0) {
            method1952(49, 38);
        }
        field4645 = null;
        field4640 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class165 var20 = new class165(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class246.field3856[var21][arg1][arg2] == null) {
                    class246.field3856[var21][arg1][arg2] = new class91(var21, arg1, arg2);
                }
            }
            class246.field3856[arg0][arg1][arg2].field1341 = var20;
        } else if (arg3 == 1) {
            class165 var22 = new class165(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class246.field3856[var23][arg1][arg2] == null) {
                    class246.field3856[var23][arg1][arg2] = new class91(var23, arg1, arg2);
                }
            }
            class246.field3856[arg0][arg1][arg2].field1341 = var22;
        } else {
            class152 var24 = new class152(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class246.field3856[var25][arg1][arg2] == null) {
                    class246.field3856[var25][arg1][arg2] = new class91(var25, arg1, arg2);
                }
            }
            class246.field3856[arg0][arg1][arg2].field1333 = var24;
        }
    }
}
