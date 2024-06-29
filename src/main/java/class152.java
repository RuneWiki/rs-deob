import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class152 {

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIZZI)V", line = 3)
    public static final void method1064(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        field2060++;
        if (class443.field6387 == null) {
            class375.field5490.method529(arg0, arg1, arg5, arg2, -16777216, 1);
        } else if (class625.field8475.field2802 >= 0 && (class102.field1467 * 512) > class625.field8475.field2802 && class625.field8475.field2810 >= 0 && class393.field5663 * 512 > class625.field8475.field2810) {
            class327.field4642++;
            if (class625.field8475 != null && (class625.field8475.field2802 - ((class625.field8475.method2563(-12840) - 1) * 256) >> 9) == class302.field4242 && class625.field8475.field2810 - (class625.field8475.method2563(-12840) - 1) * 256 >> 9 == class15.field148) {
                class302.field4242 = -1;
                class15.field148 = -1;
                class70.method581(-128);
            }
            class122.method884(!arg3);
            if (!arg4) {
                class236.method1501((byte) -9);
            }
            class589.method3311(-32217);
            class170.method1149(arg1, true, 3777, arg0, arg2, arg5);
            int var6 = class539.field7458;
            class72.field972 = class72.field981;
            int var7 = class239.field3170;
            int var8 = class419.field6024;
            int var9 = class698.field9255;
            if (class697.field9252 == 1) {
                int var10 = (int) class294.field4169;
                if (class335.field4729 >> 8 > var10) {
                    var10 = class335.field4729 >> 8;
                }
                if (class422.field6068[4] && (class572.field7795[4] + 128) > var10) {
                    var10 = class572.field7795[4] + 128;
                }
                int var11 = (int) class514.field7144 + class571.field7780 & 0x3FFF;
                class476.method2823(100, ((var10 >> 3) * 3) + 600 << 2, var10, var11, class400.field5722, class439.field6328, var9, class778.method4273(class625.field8475.field2810, (byte) -71, class625.field8475.field2802, class184.field2420) - 200);
            } else if (class697.field9252 == 4) {
                int var12 = (int) class294.field4169;
                if ((class335.field4729 >> 8) > var12) {
                    var12 = class335.field4729 >> 8;
                }
                if (class422.field6068[4] && class572.field7795[4] + 128 > var12) {
                    var12 = class572.field7795[4] + 128;
                }
                int var13 = (int) class514.field7144 & 0x3FFF;
                class476.method2823(100, (var12 >> 3) * 3 + 600 << 2, var12, var13, class400.field5722, class439.field6328, var9, class778.method4273(class265.field3902, (byte) -43, class46.field479, class184.field2420) - 200);
            } else if (class697.field9252 == 5) {
                class767.method4217(var9, 16383);
            }
            int var14 = class435.field6273;
            int var15 = class269.field3926;
            int var16 = class223.field2892;
            int var17 = class74.field1000;
            int var18 = class41.field442;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class422.field6068[var19]) {
                    int var22 = (int) ((double) (-class197.field2554[var19]) + Math.random() * (double) (class197.field2554[var19] * 2 + 1) + Math.sin((double) class333.field4718[var19] / 100.0D * (double) class234.field3114[var19]) * (double) class572.field7795[var19]);
                    if (var19 == 1) {
                        class269.field3926 += var22 << 2;
                    }
                    if (var19 == 2) {
                        class223.field2892 += var22 << 2;
                    }
                    if (var19 == 3) {
                        class41.field442 = class41.field442 + var22 & 0x3FFF;
                    }
                    if (var19 == 4) {
                        class74.field1000 += var22;
                        if (class74.field1000 < 1024) {
                            class74.field1000 = 1024;
                        } else if (class74.field1000 > 3072) {
                            class74.field1000 = 3072;
                        }
                    }
                    if (var19 == 0) {
                        class435.field6273 += var22 << 2;
                    }
                }
            }
            if (class435.field6273 < 0) {
                class435.field6273 = 0;
            }
            if (((class196.field2540 << 9) - 1) < class435.field6273) {
                class435.field6273 = (class196.field2540 << 9) - 1;
            }
            if (class223.field2892 < 0) {
                class223.field2892 = 0;
            }
            if (((class247.field3229 << 9) - 1) < class223.field2892) {
                class223.field2892 = (class247.field3229 << 9) - 1;
            }
            class32.method178(-28035);
            class411.method2465((byte) 111);
            class375.field5490.method453(var8, var7, var8 + var6, var7 + var9);
            class24.method143(true, (byte) 125);
            if (class24.field246) {
                class259.method1759(class224.field2897, 4);
                if (class72.field972 != class143.field1911) {
                    class132.field1818 = true;
                }
                class143.field1911 = class72.field972;
            } else {
                class375.field5490.method547();
                int var20 = class224.field2897;
                if (class126.field1734 == null) {
                    class375.field5490.method493(var20);
                } else {
                    class126.field1734.method2179(var7, class375.field5490, var20, class74.field1000, class627.field8498 << 3, var6, (byte) 119, var9, class41.field442, var8);
                }
            }
            class324.method2095(-88);
            class33.field312.method823(class435.field6273, class269.field3926, class223.field2892, -class74.field1000 & 0x3FFF, -class41.field442 & 0x3FFF, -class476.field6693 & 0x3FFF);
            class375.field5490.method509(class33.field312);
            class375.field5490.method436(var8 + (var6 / 2), var7 - -(var9 / 2), class628.field8507 << 1, class628.field8507 << 1);
            class571.method3245(var6 / 2 + var8, arg3, class628.field8507 << 1, class628.field8507 << 1, var9 / 2 + var7);
            class196.method1286(-class41.field442 & 0x3FFF, class435.field6273, class269.field3926, class223.field2892, -class74.field1000 & 0x3FFF, -class476.field6693 & 0x3FFF, (byte) -85);
            byte var21 = class125.field1721.field5172.method2553(43) == 2 ? (byte) class327.field4642 : 1;
            if (class24.field246) {
                class119.method853(-class476.field6693 & 0x3FFF, -class41.field442 & 0x3FFF, 16384, -class74.field1000 & 0x3FFF);
                class317.method2025(class125.field1721.field5153.method2504(43) == 0, class72.field972, true, class730.field9894, class414.field5958, class435.field6273, class625.field8475.field2810 >> 9, class625.field8475.field2802 >> 9, class23.field237, 0, class625.field8475.field2813 + 1, class304.field4276, class572.field7788, var21, class157.field2114, class223.field2892, class641.field8644, class269.field3926);
            } else {
                class290.method1863(class572.field7788, class435.field6273, class269.field3926, class223.field2892, class641.field8644, class304.field4276, class730.field9894, class157.field2114, class23.field237, class414.field5958, class625.field8475.field2813 + 1, var21, class625.field8475.field2802 >> 9, class625.field8475.field2810 >> 9, class125.field1721.field5153.method2504(43) == 0, true, class408.field5786 ? class72.field972 : -1, 0, false);
            }
            class324.method2095(-64);
            if (class780.field10712 == 10) {
                class620.method3433(256, var7, var6, 256, 1, var8, var9);
                class200.method1313(var6, 256, var7, var9, var8, 256, (byte) 68);
                class459.method2715(-30529, var9, 256, var7, var8, 256, var6);
                class503.method2942(var7, -8, var9, var6, var8);
            }
            class374.method2345();
            class41.field442 = var18;
            class223.field2892 = var16;
            class74.field1000 = var17;
            class435.field6273 = var14;
            class269.field3926 = var15;
            if (class40.field415 && class479.field6732.method55((byte) 5) == 0) {
                class40.field415 = false;
            }
            if (class40.field415) {
                class375.field5490.method529(var9, var7, var6, var8, -16777216, 1);
                class316.method2017(0, false, class58.field709.method365(class55.field647, (byte) 67), class375.field5490, class355.field5157, class166.field2202);
            }
            class24.method143(arg3, (byte) -22);
        } else {
            class375.field5490.method529(arg0, arg1, arg5, arg2, -16777216, 1);
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Ljava/lang/String;[BIB)I", line = 219)
    public static final int method1065(String arg0, byte[] arg1, int arg2, byte arg3) {
        field2059++;
        int var4 = arg2;
        int var5 = arg0.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class611.method3395(arg0.charAt(var6), 0);
            int var8 = var5 <= var6 + 1 ? -1 : class611.method3395(arg0.charAt(var6 + 1), 0);
            int var9 = (var6 + 2) < var5 ? class611.method3395(arg0.charAt(var6 + 2), arg3 ^ 0x7E) : -1;
            int var10 = (var6 + 3) < var5 ? class611.method3395(arg0.charAt(var6 + 3), 0) : -1;
            arg1[arg2++] = (byte) class670.method3699(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class670.method3699(class519.method3018(240, var8 << 4), var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class670.method3699(var10, class519.method3018(192, var9 << 6));
        }
        return arg3 == 126 ? arg2 - var4 : 32;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Ljava/lang/String;BLjava/io/File;)V", line = 264)
    public static final void method1066(String arg0, byte arg1, File arg2) {
        class732.field9911.put(arg0, arg2);
        field2058++;
        if (arg1 != -30) {
            method1064(-92, -97, 30, true, false, -109);
        }
    }
}
