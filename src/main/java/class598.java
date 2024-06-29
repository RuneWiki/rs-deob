import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class598 extends class56 {

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field8404 = new String[100];

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public static int field8407 = 0;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "Z")
    public static boolean field8406 = false;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public static int field8402;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public static int field8403;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    public static int field8405;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    public static int field8408;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    public static int field8409;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)[I", line = 4)
    public final int[] method24(int arg0, boolean arg1) {
        ++field8408;
        if (!arg1) {
            return null;
        } else {
            int[] var3 = super.field673.method3270(arg0, (byte) -42);
            if (super.field673.field8073) {
                for (int var4 = 0; class328.field4576 > var4; ++var4) {
                    this.method3367(arg0, var4, -2048);
                    int[] var5 = this.method367(4463, 0, class251.field3433);
                    var3[var4] = var5[class120.field1448];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILee;I)V", line = 38)
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg2 == 0) {
            super.field674 = arg1.method3750((byte) 35) == 1;
        }
        if (arg0 != 3731) {
            this.method5(-8, -73);
        }
        ++field8403;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V", line = 57)
    public static void method3366(byte arg0) {
        if (arg0 <= -40) {
            field8404 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(III)V", line = 70)
    private final void method3367(int arg0, int arg1, int arg2) {
        ++field8409;
        int var4 = class132.field1945[arg1];
        int var5 = class720.field10000[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (arg2 + var5));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class251.field3433 = arg0;
            class120.field1448 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class120.field1448 = arg0;
            class251.field3433 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class120.field1448 = -arg0 + class328.field4576;
            class251.field3433 = arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class120.field1448 = arg1;
            class251.field3433 = -arg0 + class226.field3050;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class251.field3433 = -arg0 + class226.field3050;
            class120.field1448 = -arg1 + class328.field4576;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class251.field3433 = class226.field3050 - arg1;
            class120.field1448 = -arg0 + class328.field4576;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class251.field3433 = -arg1 + class226.field3050;
            class120.field1448 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class120.field1448 = -arg1 + class328.field4576;
            class251.field3433 = arg0;
        }
        class120.field1448 &= class445.field6318;
        class251.field3433 &= class636.field8759;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 143)
    public class598() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[[I", line = 154)
    public final int[][] method5(int arg0, int arg1) {
        ++field8405;
        if (arg1 != 1) {
            field8404 = null;
        }
        int[][] var3 = super.field668.method3009(0, arg0);
        if (super.field668.field7292) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class328.field4576; ++var7) {
                this.method3367(arg0, var7, arg1 + -2049);
                int[][] var8 = this.method369(class251.field3433, 127, 0);
                var4[var7] = var8[0][class120.field1448];
                var5[var7] = var8[1][class120.field1448];
                var6[var7] = var8[2][class120.field1448];
            }
        }
        return var3;
    }
}
