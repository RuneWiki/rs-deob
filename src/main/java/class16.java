import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class16 {

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "[Ljava/lang/String;")
    private String[] field221 = new String[0];

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    private int field224 = -1;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "Z")
    private boolean field220 = false;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)I", line = 11)
    private final int method97(int arg0, byte arg1) {
        field225++;
        int var3 = this.field221.length;
        if (arg1 != 12) {
            this.field221 = null;
        }
        while (arg0 >= var3) {
            if (!this.field220) {
                var3 += this.field217;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field217 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)[Ljava/lang/String;", line = 43)
    public final String[] method98(byte arg0) {
        if (arg0 >= -2) {
            this.field220 = false;
        }
        field216++;
        String[] var2 = new String[this.field224 + 1];
        class622.method3594(this.field221, 0, var2, 0, this.field224 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V", line = 57)
    private final void method99(int arg0, int arg1) {
        field218++;
        String[] var3 = new String[this.method97(arg1, (byte) 12)];
        class622.method3594(this.field221, arg0, var3, 0, this.field221.length);
        this.field221 = var3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZIII)V", line = 69)
    public static final void method100(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field226++;
        if (class390.field5454 == null) {
            class359.field5046.method542(arg0, arg4, 3854, -16777216, arg5, arg1);
        } else if (class468.field6748.field644 >= 0 && class174.field2540 * 512 > class468.field6748.field644 && class468.field6748.field648 >= 0 && class468.field6748.field648 < class716.field9999 * 512) {
            class258.field3741++;
            if (class468.field6748 != null && class468.field6748.field644 - (class468.field6748.method482(false) - 1) * 256 >> 9 == class318.field4513 && (class468.field6748.field648 - (class468.field6748.method482(false) - 1) * 256 >> 9) == class334.field4722) {
                class334.field4722 = -1;
                class318.field4513 = -1;
                class257.method1745(23836);
            }
            class280.method1832(-87);
            if (!arg2) {
                class14.method76(true);
            }
            class115.method947(arg3 ^ 0x13E4);
            class368.method2306(true, arg0, arg5, arg4, 2821, arg1);
            int var6 = class589.field8278;
            int var7 = class652.field9194;
            int var8 = class498.field7096;
            class220.field3129 = class220.field3141;
            int var9 = class515.field7338;
            if (class666.field9338 == 1) {
                int var12 = (int) class432.field6035;
                if (var12 < (class359.field5048 >> 8)) {
                    var12 = class359.field5048 >> 8;
                }
                if (class104.field1732[4] && class539.field7589[4] + 128 > var12) {
                    var12 = class539.field7589[4] + 128;
                }
                int var13 = (int) class321.field4568 + class535.field7552 & 0x3FFF;
                class166.method1230(var12, class701.field9841, var13, var8, class246.field3437, class534.method3136(1, class312.field4409, class468.field6748.field644, class468.field6748.field648) - 200, (byte) -107, (var12 >> 3) * 3 + 600 << 2);
            } else if (class666.field9338 == 4) {
                int var10 = (int) class432.field6035;
                if (var10 < class359.field5048 >> 8) {
                    var10 = class359.field5048 >> 8;
                }
                if (class104.field1732[4] && class539.field7589[4] + 128 > var10) {
                    var10 = class539.field7589[4] + 128;
                }
                int var11 = (int) class321.field4568 & 0x3FFF;
                class166.method1230(var10, class701.field9841, var11, var8, class246.field3437, class534.method3136(1, class312.field4409, class218.field3100, class211.field3044) - 200, (byte) -73, ((var10 >> 3) * 3) + 600 << 2);
            } else if (class666.field9338 == 5) {
                class692.method3893(var8, arg3 ^ 0x13E4);
            }
            int var14 = class685.field9660;
            int var15 = class136.field2118;
            if (arg3 != 5093) {
                method100(-69, 71, false, 27, -99, -27);
            }
            int var16 = class260.field3810;
            int var17 = class694.field9754;
            int var18 = class239.field3371;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class104.field1732[var19]) {
                    int var22 = (int) ((double) (-class557.field7936[var19]) + Math.random() * (double) (class557.field7936[var19] * 2 + 1) + Math.sin((double) class510.field7282[var19] / 100.0D * (double) class587.field8265[var19]) * (double) class539.field7589[var19]);
                    if (var19 == 3) {
                        class239.field3371 = class239.field3371 + var22 & 0x3FFF;
                    }
                    if (var19 == 1) {
                        class136.field2118 += var22 << 2;
                    }
                    if (var19 == 0) {
                        class685.field9660 += var22 << 2;
                    }
                    if (var19 == 4) {
                        class694.field9754 += var22;
                        if (class694.field9754 < 1024) {
                            class694.field9754 = 1024;
                        } else if (class694.field9754 > 3072) {
                            class694.field9754 = 3072;
                        }
                    }
                    if (var19 == 2) {
                        class260.field3810 += var22 << 2;
                    }
                }
            }
            if (class685.field9660 < 0) {
                class685.field9660 = 0;
            }
            if (((class613.field8871 << 9) - 1) < class685.field9660) {
                class685.field9660 = (class613.field8871 << 9) - 1;
            }
            if (class260.field3810 < 0) {
                class260.field3810 = 0;
            }
            if (((class453.field6328 << 9) - 1) < class260.field3810) {
                class260.field3810 = (class453.field6328 << 9) - 1;
            }
            class160.method1210(2);
            class677.method3829((byte) -118);
            class359.field5046.method584(var7, var6, var7 + var9, var6 + var8);
            class334.method2138(false, true);
            if (class200.field2876) {
                class259.method1760(-126, class360.field5051);
                if (class220.field3129 != class182.field2602) {
                    class70.field1267 = true;
                }
                class182.field2602 = class220.field3129;
            } else {
                class359.field5046.method619();
                int var20 = class360.field5051;
                if (class576.field8161 == null) {
                    class359.field5046.method617(var20);
                } else {
                    class576.field8161.method2021(var6, -22449, var8, class694.field9754, var9, class239.field3371, class359.field5046, class747.field10446 << 3, var20, var7);
                }
            }
            class565.method3297(127);
            class57.field1066.method168(class685.field9660, class136.field2118, class260.field3810, -class694.field9754 & 0x3FFF, -class239.field3371 & 0x3FFF, -class717.field10039 & 0x3FFF);
            class359.field5046.method538(class57.field1066);
            class359.field5046.method545(var9 / 2 + var7, var8 / 2 + var6, class142.field2184 << 1, class142.field2184 << 1);
            class371.method2333(var8 / 2 + var6, var7 - -(var9 / 2), class142.field2184 << 1, class142.field2184 << 1, (byte) -127);
            class567.method3317(-class239.field3371 & 0x3FFF, class136.field2118, -class694.field9754 & 0x3FFF, class260.field3810, 24582, -class717.field10039 & 0x3FFF, class685.field9660);
            byte var21 = class471.field6781.field6668.method3947(27669) == 2 ? (byte) class258.field3741 : 1;
            if (class200.field2876) {
                class328.method2092(-class717.field10039 & 0x3FFF, arg3 ^ 0x13B1, -class694.field9754 & 0x3FFF, -class239.field3371 & 0x3FFF);
                class724.method4027(class182.field2601, class468.field6748.field648 >> 9, class260.field3810, class361.field5063, class10.field141, class136.field2118, class220.field3129, class548.field7724, class468.field6748.field644 >> 9, true, class471.field6781.field6698.method3675(27669) == 0, class468.field6748.field649 + 1, 5, class57.field1058, var21, class135.field2113, class605.field8787, class685.field9660);
            } else {
                class11.method61(class605.field8787, class685.field9660, class136.field2118, class260.field3810, class10.field141, class182.field2601, class57.field1058, class361.field5063, class135.field2113, class548.field7724, class468.field6748.field649 + 1, var21, class468.field6748.field644 >> 9, class468.field6748.field648 >> 9, class471.field6781.field6698.method3675(27669) == 0, true, class339.field4781 ? class220.field3129 : -1, 0, false);
            }
            class565.method3297(95);
            if (class611.field8839 == 10) {
                class14.method80(var9, 256, 127, 256, var7, var8, var6);
                class535.method3142(var9, var8, 256, 2, var7, var6, 256);
                class495.method2981(-22579, var9, var7, 256, var6, 256, var8);
                class409.method2501((byte) 96, var6, var8, var9, var7);
            }
            class323.method2074();
            class685.field9660 = var14;
            class239.field3371 = var18;
            class694.field9754 = var17;
            class136.field2118 = var15;
            class260.field3810 = var16;
            if (class392.field5503 && class612.field8856.method3359(20) == 0) {
                class392.field5503 = false;
            }
            if (class392.field5503) {
                class359.field5046.method542(var8, var9, 3854, -16777216, var6, var7);
                class379.method2375(class359.field5046, false, class281.field3953.method1839((byte) 45, class744.field10426), (byte) 121, class722.field10090, class436.field6100);
            }
            class334.method2138(false, false);
        } else {
            class359.field5046.method542(arg0, arg4, arg3 - 1239, -16777216, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(IZ)V", line = 357)
    public class16(int arg0, boolean arg1) {
        this.field217 = arg0;
        this.field220 = arg1;
    }

    @OriginalMember(owner = "client!qk", name = "toString", descriptor = "()Ljava/lang/String;", line = 299)
    public final String toString() {
        field223++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field224; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field221[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 323)
    private final void method101(int arg0, String arg1, int arg2) {
        field219++;
        int var4 = -128 % ((39 - arg0) / 43);
        if (this.field224 < arg2) {
            this.field224 = arg2;
        }
        if (arg2 >= this.field221.length) {
            this.method99(0, arg2);
        }
        this.field221[arg2] = arg1;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/lang/String;)V", line = 347)
    public final void method102(int arg0, String arg1) {
        if (arg0 != 1) {
            this.field217 = -105;
        }
        this.method101(91, arg1, this.field224 + 1);
        field215++;
    }
}
