import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class class34 {

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field452 = 0;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field456 = 0;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "Z")
    public static boolean field459 = false;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field454 = 0;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field460 = 0;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "[S")
    public static short[] field455 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field462 = 0;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "[I")
    public static int[] field468 = new int[32];

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public int field450;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "Lje;")
    public static class123 field463;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field451;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method182(int arg0) {
        field464++;
        if (arg0 == 31050) {
            return (this.field450 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)[B", line = 16)
    public static final byte[] method183(int arg0, int arg1) {
        if (arg1 != -14115) {
            method184(16);
        }
        class137 var2 = (class137) class234.field3754.method755((long) arg0, false);
        if (var2 == null) {
            Random var3 = new Random((long) arg0);
            byte[] var4 = new byte[512];
            for (int var5 = 0; var5 < 255; var5++) {
                var4[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class158.method1138(var7, true, var3);
                byte var9 = var4[var8];
                var4[var8] = var4[var7];
                var4[var7] = var4[511 - var6] = var9;
            }
            var2 = new class137(var4);
            class234.field3754.method750(var2, (long) arg0, -18339);
        }
        field453++;
        return var2.field2168;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V", line = 64)
    public static void method184(int arg0) {
        field451 = null;
        field455 = null;
        if (arg0 < -91) {
            field468 = null;
            field463 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Z", line = 81)
    public final boolean method185(byte arg0) {
        field461++;
        int var2 = -127 % ((arg0 + 64) / 54);
        return (this.field450 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Z", line = 94)
    public final boolean method186(byte arg0) {
        field465++;
        if (arg0 < 36) {
            this.method189(true);
        }
        return (this.field450 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lga;IIIIIIZ)V", line = 111)
    public static final void method187(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1520.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field1520[var9] - class298.field4704;
            int var11 = arg0.field1530[var9] - class165.field2753;
            int var12 = arg0.field1522[var9] - class172.field2866;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field1514 != null) {
                class104.field1529[var9] = var13;
                class104.field1515[var9] = var16;
                class104.field1531[var9] = var17;
            }
            class104.field1532[var9] = (var13 << 9) / var17 + class170.field2809;
            class104.field1517[var9] = (var16 << 9) / var17 + class170.field2813;
        }
        class170.field2803 = 0;
        int var19 = arg0.field1535.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field1535[var20];
            int var22 = arg0.field1525[var20];
            int var23 = arg0.field1523[var20];
            int var24 = class104.field1532[var21];
            int var25 = class104.field1532[var22];
            int var26 = class104.field1532[var23];
            int var27 = class104.field1517[var21];
            int var28 = class104.field1517[var22];
            int var29 = class104.field1517[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class116.field1768 && class36.method196(class170.field2809 + class15.field168, class21.field305 + class170.field2813, var27, var28, var29, var24, var25, var26)) {
                    class291.field4650 = arg5;
                    class263.field4213 = arg6;
                }
                if (!class232.field3690 && !arg7) {
                    class170.field2818 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class170.field2805 || var25 > class170.field2805 || var26 > class170.field2805) {
                        class170.field2818 = true;
                    }
                    if (arg0.field1514 == null || arg0.field1514[var20] == -1) {
                        if (arg0.field1519[var20] != 12345678) {
                            class170.method1263(var27, var28, var29, var24, var25, var26, arg0.field1519[var20], arg0.field1518[var20], arg0.field1524[var20]);
                        }
                    } else if (!class8.field123) {
                        int var30 = class170.field2814.method945(arg0.field1514[var20], 255);
                        class170.method1263(var27, var28, var29, var24, var25, var26, class175.method1320(var30, arg0.field1519[var20]), class175.method1320(var30, arg0.field1518[var20]), class175.method1320(var30, arg0.field1524[var20]));
                    } else if (arg0.field1534) {
                        class170.method1258(var27, var28, var29, var24, var25, var26, arg0.field1519[var20], arg0.field1518[var20], arg0.field1524[var20], class104.field1529[0], class104.field1529[1], class104.field1529[3], class104.field1515[0], class104.field1515[1], class104.field1515[3], class104.field1531[0], class104.field1531[1], class104.field1531[3], arg0.field1514[var20]);
                    } else {
                        class170.method1258(var27, var28, var29, var24, var25, var26, arg0.field1519[var20], arg0.field1518[var20], arg0.field1524[var20], class104.field1529[var21], class104.field1529[var22], class104.field1529[var23], class104.field1515[var21], class104.field1515[var22], class104.field1515[var23], class104.field1531[var21], class104.field1531[var22], class104.field1531[var23], arg0.field1514[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IJ)V", line = 223)
    public static final void method188(int arg0, long arg1) {
        class194.field3175.field586 = 0;
        class194.field3175.method257(-2, 21);
        class194.field3175.method255(false, arg1);
        if (arg0 >= -95) {
            method187((class104) null, 29, -67, -102, 36, 51, 9, false);
        }
        class215.field3507 = 0;
        class31.field416 = -3;
        class25.field342 = 0;
        field458++;
        class149.field2318 = 1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)Z", line = 274)
    public final boolean method189(boolean arg0) {
        field467++;
        if (!arg0) {
            this.method189(false);
        }
        return (this.field450 & 0x1) != 0;
    }
}
