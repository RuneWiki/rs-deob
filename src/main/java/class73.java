import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class73 extends class179 {

    @OriginalMember(owner = "client!me", name = "V", descriptor = "Z")
    private boolean field1335 = true;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "Z")
    private boolean field1334 = true;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
    public static int field1330 = 0;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "Lke;")
    public static class256 field1333 = class316.method2202(")4l=", 27626);

    @OriginalMember(owner = "client!me", name = "S", descriptor = "[[I")
    public static int[][] field1332 = new int[104][104];

    @OriginalMember(owner = "client!me", name = "bb", descriptor = "Z")
    public static boolean field1341 = false;

    @OriginalMember(owner = "client!me", name = "eb", descriptor = "[S")
    public static short[] field1344 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!me", name = "R", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!me", name = "cb", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!me", name = "db", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!me", name = "fb", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "Lng;")
    public static class138 field1336;

    @OriginalMember(owner = "client!me", name = "X", descriptor = "Lng;")
    public static class138 field1337;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[I", line = 7)
    public final int[] method41(int arg0, int arg1) {
        field1342++;
        int[] var3 = this.field3157.method1258(-57, arg0);
        if (arg1 != -31598) {
            field1330 = -128;
        }
        if (this.field3157.field3081) {
            int[] var4 = this.method1312(0, this.field1335 ? class19.field255 - arg0 : arg0, (byte) 127);
            if (this.field1334) {
                for (int var5 = 0; var5 < class161.field2858; var5++) {
                    var3[var5] = var4[class285.field4945 - var5];
                }
            } else {
                class299.method2090(var4, 0, var3, 0, class161.field2858);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V", line = 45)
    public class73() {
        super(1, false);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)[[I", line = 49)
    public final int[][] method55(int arg0, int arg1) {
        field1343++;
        if (arg0 != 75) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field3169.method463(arg1, 1);
        if (this.field3169.field1080) {
            int[][] var4 = this.method1314(this.field1335 ? class19.field255 - arg1 : arg1, arg0 + 83, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field1334) {
                for (int var12 = 0; var12 < class161.field2858; var12++) {
                    var8[var12] = var5[class285.field4945 - var12];
                    var9[var12] = var7[class285.field4945 - var12];
                    var10[var12] = var6[class285.field4945 - var12];
                }
            } else {
                for (int var11 = 0; var11 < class161.field2858; var11++) {
                    var8[var11] = var5[var11];
                    var9[var11] = var7[var11];
                    var10[var11] = var6[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILra;I)V", line = 125)
    public final void method54(int arg0, class41 arg1, int arg2) {
        field1345++;
        if (arg2 == 0) {
            this.field1334 = arg1.method357(false) == 1;
        } else if (arg2 == 1) {
            this.field1335 = arg1.method357(false) == 1;
        } else if (arg2 == 2) {
            this.field3153 = arg1.method357(false) == 1;
        }
        if (arg0 < 108) {
            method549(-4);
        }
    }

    @OriginalMember(owner = "client!me", name = "j", descriptor = "(I)V", line = 187)
    public static void method549(int arg0) {
        field1337 = null;
        field1333 = null;
        field1344 = null;
        field1336 = null;
        field1332 = (int[][]) null;
        if (arg0 != -8904) {
            method549(-118);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I[IIII)V", line = 221)
    public static final void method550(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        arg3--;
        field1338++;
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        while (arg3 < var5) {
            int var7 = arg3 + 1;
            arg1[var7] = arg4;
            int var8 = var7 + 1;
            arg1[var8] = arg4;
            int var9 = var8 + 1;
            arg1[var9] = arg4;
            int var10 = var9 + 1;
            arg1[var10] = arg4;
            int var11 = var10 + 1;
            arg1[var11] = arg4;
            int var12 = var11 + 1;
            arg1[var12] = arg4;
            int var13 = var12 + 1;
            arg1[var13] = arg4;
            arg3 = var13 + 1;
            arg1[arg3] = arg4;
        }
        while (arg3 < var6) {
            arg3++;
            arg1[arg3] = arg4;
        }
        if (arg0 != -29903) {
            method549(-23);
        }
    }
}
