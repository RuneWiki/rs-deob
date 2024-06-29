import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class70 {

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public int field1117 = -1;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "Z")
    public boolean field1115 = true;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public int field1122 = 128;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    private int field1120 = 0;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V")
    private final void method607(int arg0, int arg1) {
        field1124++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & arg0) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field1114 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field1123 = (int) (var17 * 256.0D);
        if (this.field1114 < 0) {
            this.field1114 = 0;
        } else if (this.field1114 > 255) {
            this.field1114 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field1126 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1126 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1123 < 0) {
            this.field1123 = 0;
        } else if (this.field1123 > 255) {
            this.field1123 = 255;
        }
        if (this.field1126 < 1) {
            this.field1126 = 1;
        }
        this.field1112 = (int) ((double) this.field1126 * var19);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILfh;)V")
    public final void method608(int arg0, class194 arg1) {
        field1116++;
        while (true) {
            int var3 = arg1.method1337((byte) -124);
            if (var3 == 0) {
                int var4 = -127 / ((arg0 + 40) / 39);
                return;
            }
            this.method611(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBIIII)V")
    public static final void method609(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field1121++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg5 * arg5;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = 5 / ((17 - arg1) / 52);
        int var20 = (var6 + 1) * var16;
        class262.method1831(arg4 + arg5, class402.field5946[arg2], (byte) 43, arg3, arg4 - arg5);
        int var21 = (arg0 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var20;
                    var13 += var17;
                    var20 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var20;
                var17 += var16;
                var20 += var16;
                var6++;
            }
            var13 += -var21;
            var14 += -var18;
            var18 -= var15;
            var7--;
            var21 -= var15;
            int var22 = arg2 - var7;
            int var23 = arg2 + var7;
            int var24 = arg4 + var6;
            int var25 = arg4 - var6;
            class262.method1831(var24, class402.field5946[var22], (byte) 43, arg3, var25);
            class262.method1831(var24, class402.field5946[var23], (byte) 43, arg3, var25);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILza;IIIII)Le;")
    public static final class289 method610(int arg0, class299 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1118++;
        long var7 = (long) arg0;
        class289 var9 = (class289) class326.field4937.method1634(var7, 64);
        if (var9 == null) {
            class153 var11 = class404.method2541(arg0, 0, (byte) 96, class59.field910);
            if (var11 == null) {
                return null;
            }
            if (var11.field2348 < 13) {
                var11.method1118(0, -73);
            }
            var9 = arg1.method554(var11, arg5, class343.field5121, 64, 768);
            class326.field4937.method1623(var7, 17621, var9);
        }
        class289 var12 = var9.method669((byte) 2, arg5, true);
        if (arg4 != 0) {
            var12.method667(arg4);
        }
        if (arg2 != 0) {
            var12.method666(arg2);
        }
        if (arg3 != 0) {
            var12.method639(arg3);
        }
        if (arg6 != 0) {
            var12.method678(0, arg6, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZLfh;)V")
    private final void method611(int arg0, boolean arg1, class194 arg2) {
        if (arg0 == 1) {
            this.field1120 = arg2.method1339(-32768);
            this.method607(255, this.field1120);
        } else if (arg0 == 2) {
            this.field1117 = arg2.method1396(7);
            if (this.field1117 == 65535) {
                this.field1117 = -1;
            }
        } else if (arg0 == 3) {
            this.field1122 = arg2.method1396(119) << 0;
        } else if (arg0 == 4) {
            this.field1115 = false;
        }
        field1119++;
        if (arg1) {
            this.method608(-14, null);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(JI)V")
    public static final void method612(long arg0, int arg1) {
        class312.field4752.field2982 = 0;
        field1125++;
        class312.field4752.method1381(class491.field7193.field7746, (byte) 88);
        class312.field4752.method1385(arg0, (byte) -97);
        class312.field4752.method1381(class345.field5141, (byte) 85);
        class327.field4949 = 0;
        class336.field5062 = -3;
        class448.field6648 = arg1;
        class259.field4152 = 1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
    public static final void method613(boolean arg0) {
        field1113++;
        if (class353.field5236 < 1024.0F) {
            class353.field5236 = 1024.0F;
        }
        if (class353.field5236 > 3072.0F) {
            class353.field5236 = 3072.0F;
        }
        while (class434.field6466 >= 16384.0F) {
            class434.field6466 -= 16384.0F;
        }
        if (!arg0) {
            method613(true);
        }
        while (class434.field6466 < 0.0F) {
            class434.field6466 += 16384.0F;
        }
        int var1 = class172.field2662 >> 7;
        int var2 = class351.field5232 >> 7;
        int var3 = class416.method2605(class351.field5232, class172.field2662, (byte) 114, class30.field370);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && (class338.field5076 - 4) > var1 && class250.field4077 - 4 > var2) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class30.field370;
                    if (var7 < 3 && class38.method251(1, var6, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class185.field2846.field3520 != null && class185.field2846.field3520[var7] != null) {
                        var8 = (class185.field2846.field3520[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 + var8 - class407.field6024[var7].method56(var5, var6);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class498.field7258) {
            class498.field7258 += (var10 - class498.field7258) / 24;
        } else if (class498.field7258 > var10) {
            class498.field7258 += (var10 - class498.field7258) / 80;
            return;
        }
    }

    static {
        new class179(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
    }
}
