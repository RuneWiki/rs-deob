import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class40 extends class45 {

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "Z")
    public static boolean field584 = false;

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "Ljava/lang/String;")
    public static String field592 = "Hidden";

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "I")
    public int field585;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
    public int field588;

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "Lwf;")
    public class250 field589;

    @OriginalMember(owner = "client!sl", name = "D", descriptor = "Lwf;")
    public class250 field593;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "Ljava/lang/String;")
    public String field579;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "Z")
    public boolean field587;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "[Ljava/lang/Object;")
    public Object[] field581;

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "[[[B")
    public static byte[][][] field590;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)V", line = 5)
    public static final void method260(byte arg0) {
        class173.field2768.method2326(-4);
        field583++;
        if (arg0 != -81) {
            field586 = -69;
        }
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(B)V", line = 18)
    public static void method261(byte arg0) {
        if (arg0 <= -47) {
            field592 = null;
            field590 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)V", line = 30)
    public static final void method262(int arg0, int arg1) {
        field582++;
        short var2 = 256;
        if (var2 < arg1) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class178.field2852 += arg1 * 128;
        if (class196.field3131.length < class178.field2852) {
            class178.field2852 -= class196.field3131.length;
            int var3 = (int) (Math.random() * 12.0D);
            class129.method992(class226.field3725[var3], true);
        }
        int var4 = 0;
        int var5 = (var2 - arg1) * 128;
        int var6 = arg1 * 128;
        if (arg0 != -795) {
            field584 = false;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = class223.field3708[var4 + var6] - (class196.field3131[class196.field3131.length - 1 & class178.field2852 + var4] * arg1 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class223.field3708[var4++] = var8;
        }
        for (int var9 = var2 - arg1; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class223.field3708[var10 + var11] = 255;
                } else {
                    class223.field3708[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < var2 - arg1; var13++) {
            class205.field3237[var13] = class205.field3237[arg1 + var13];
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            class205.field3237[var14] = (int) (Math.sin((double) class354.field5627 / 14.0D) * 16.0D + Math.sin((double) class354.field5627 / 15.0D) * 14.0D + Math.sin((double) class354.field5627 / 16.0D) * 12.0D);
            class354.field5627++;
        }
        class61.field1032 += arg1;
        int var15 = ((class332.field5261 & 0x1) + arg1) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class61.field1032; var16++) {
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (int) (Math.random() * 124.0D) + 2;
            class223.field3708[(var17 << 7) + var18] = 192;
        }
        class61.field1032 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += class223.field3708[var15 + var22 + var21];
                }
                if ((-var15 - (1 - var22)) >= 0) {
                    var20 -= class223.field3708[var21 + var22 - (var15 - -1)];
                }
                if (var22 >= 0) {
                    class350.field5566[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var2) {
                    var24 += class350.field5566[var15 * 128 + var23 + var26];
                }
                if ((var25 - var15 - 1) >= 0) {
                    var24 -= class350.field5566[var23 + var26 - (var15 * 128 + 128)];
                }
                if (var25 >= 0) {
                    class223.field3708[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BIII)I", line = 208)
    public static final int method263(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -102) {
            return 5;
        }
        field594++;
        int var4 = arg2 - 1 & arg1;
        int var5 = arg1 / arg2;
        int var6 = arg3 & arg2 - 1;
        int var7 = arg3 / arg2;
        int var8 = class259.method1982(23633, var7, var5);
        int var9 = class259.method1982(23633, var7, var5 + 1);
        int var10 = class259.method1982(arg0 ^ 0xFFFFA3CB, var7 + 1, var5);
        int var11 = class259.method1982(23633, var7 + 1, var5 + 1);
        int var12 = class76.method632(65536, arg2, var8, var4, var9);
        int var13 = class76.method632(65536, arg2, var10, var4, var11);
        return class76.method632(65536, arg2, var12, var6, var13);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZIII)Ljava/lang/String;", line = 238)
    public static final String method264(boolean arg0, int arg1, int arg2, int arg3) {
        field595++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg0 && arg1 >= 0) {
            int var4 = 2;
            for (int var5 = arg1 / arg2; var5 != 0; var5 /= arg2) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[arg3] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg2;
                int var9 = var8 - (arg1 * arg2);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg2);
        }
    }
}
