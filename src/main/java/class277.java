import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class277 extends class89 {

    @OriginalMember(owner = "client!td", name = "X", descriptor = "Lda;")
    public static class275 field4829 = class255.method1672(120, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!td", name = "S", descriptor = "Lij;")
    public static class85 field4824 = new class85(new byte[5000]);

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "Lda;")
    public static class275 field4832 = class255.method1672(120, "event_opbase");

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "[I")
    public static int[] field4833 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "[I")
    public static int[] field4834 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!td", name = "db", descriptor = "Lrg;")
    public static class84 field4835 = new class84();

    @OriginalMember(owner = "client!td", name = "gb", descriptor = "I")
    public static int field4838 = 0;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        ++field4826;
        if (arg0 != -20503) {
            method1874((class275) null, (class275) null, 68, false);
        }
        if (arg2 == 0) {
            super.field1508 = ~arg1.method564((byte) 98) == -2;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1872(Component arg0, int arg1) {
        arg0.removeMouseListener(class108.field1869);
        arg0.removeMouseMotionListener(class108.field1869);
        arg0.removeFocusListener(class108.field1869);
        if (arg1 == 8) {
            class115.field2035 = 0;
            ++field4827;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class277() {
        super(1, false);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIB)V")
    private final void method1873(int arg0, int arg1, byte arg2) {
        ++field4825;
        int var4 = class185.field3172[arg1];
        int var5 = class91.field1552[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if (arg2 >= 101) {
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class94.field1617 = arg1;
                class84.field1373 = arg0;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class94.field1617 = arg0;
                class84.field1373 = arg1;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class94.field1617 = -arg0 + class65.field1070;
                class84.field1373 = arg1;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class94.field1617 = arg1;
                class84.field1373 = -arg0 + class16.field242;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class84.field1373 = -arg0 + class16.field242;
                class94.field1617 = -arg1 + class65.field1070;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class94.field1617 = -arg0 + class65.field1070;
                class84.field1373 = class16.field242 - arg1;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class84.field1373 = class16.field242 - arg1;
                class94.field1617 = arg0;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class84.field1373 = arg0;
                class94.field1617 = -arg1 + class65.field1070;
            }
            class94.field1617 &= class1.field11;
            class84.field1373 &= field4837;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lda;Lda;IZ)V")
    public static final void method1874(class275 arg0, class275 arg1, int arg2, boolean arg3) {
        class167.method1144(1, arg2, -1, arg1, arg0, (class275) null);
        if (!arg3) {
            field4837 = 82;
        }
        ++field4828;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(III)I")
    public static final int method1875(int arg0, int arg1, int arg2) {
        if (arg2 > -38) {
            return -60;
        } else {
            int var3 = class192.method1263(arg1 - 1, arg0 - 1, true) - (-class192.method1263(arg1 - -1, arg0 + -1, true) - class192.method1263(arg1 + -1, arg0 - -1, true)) + class192.method1263(arg1 - -1, arg0 + 1, true);
            int var4 = class192.method1263(arg1 + -1, arg0, true) - -class192.method1263(arg1 - -1, arg0, true) - (-class192.method1263(arg1, arg0 - 1, true) - class192.method1263(arg1, arg0 + 1, true));
            ++field4830;
            int var5 = class192.method1263(arg1, arg0, true);
            return var5 / 4 + var3 / 16 + var4 / 8;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        if (arg1) {
            method1875(114, 37, -50);
        }
        ++field4831;
        int[] var3 = super.field1503.method229(arg0, (byte) -90);
        if (super.field1503.field664) {
            for (int var4 = 0; var4 < class65.field1070; ++var4) {
                this.method1873(arg0, var4, (byte) 113);
                int[] var5 = this.method645(-127, 0, class84.field1373);
                var3[var4] = var5[class94.field1617];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V")
    public static void method1876(byte arg0) {
        field4832 = null;
        field4824 = null;
        int var1 = -97 % ((-13 - arg0) / 53);
        field4829 = null;
        field4834 = null;
        field4835 = null;
        field4833 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field4823;
        if (!arg0) {
            this.method239(-20, false);
        }
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        if (super.field1512.field2007) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class65.field1070; ++var7) {
                this.method1873(arg1, var7, (byte) 116);
                int[][] var8 = this.method648(true, 0, class84.field1373);
                var4[var7] = var8[0][class94.field1617];
                var5[var7] = var8[1][class94.field1617];
                var6[var7] = var8[2][class94.field1617];
            }
        }
        return var3;
    }
}
