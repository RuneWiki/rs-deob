import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class673 extends class363 {

    @OriginalMember(owner = "client!dw", name = "C", descriptor = "Z")
    public boolean field9193 = true;

    @OriginalMember(owner = "client!dw", name = "u", descriptor = "I")
    public static int field9185 = 0;

    @OriginalMember(owner = "client!dw", name = "s", descriptor = "I")
    public static int field9183;

    @OriginalMember(owner = "client!dw", name = "x", descriptor = "I")
    public static int field9188;

    @OriginalMember(owner = "client!dw", name = "y", descriptor = "I")
    public static int field9189;

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "I")
    public static int field9190;

    @OriginalMember(owner = "client!dw", name = "A", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!dw", name = "B", descriptor = "I")
    public static int field9192;

    @OriginalMember(owner = "client!dw", name = "E", descriptor = "I")
    public static int field9195;

    @OriginalMember(owner = "client!dw", name = "H", descriptor = "I")
    public static int field9197;

    @OriginalMember(owner = "client!dw", name = "I", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!dw", name = "J", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!dw", name = "K", descriptor = "I")
    public static int field9200;

    @OriginalMember(owner = "client!dw", name = "L", descriptor = "I")
    public static int field9201;

    @OriginalMember(owner = "client!dw", name = "M", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!dw", name = "t", descriptor = "Lpda;")
    public class588 field9184;

    @OriginalMember(owner = "client!dw", name = "w", descriptor = "[I")
    public int[] field9187;

    @OriginalMember(owner = "client!dw", name = "D", descriptor = "[I")
    private int[] field9194;

    @OriginalMember(owner = "client!dw", name = "F", descriptor = "[Ljava/lang/String;")
    private String[] field9196;

    @OriginalMember(owner = "client!dw", name = "v", descriptor = "[[I")
    private int[][] field9186;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lji;II)V", line = 3)
    private final void method3728(class572 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field9196 = class112.method774('<', 1, arg0.method3072(255));
        } else if (arg1 == 2) {
            int var4 = arg0.method3097((byte) 12);
            this.field9187 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field9187[var5] = arg0.method3031(arg2 - 26939);
            }
        } else if (arg1 == 3) {
            int var6 = arg0.method3097((byte) 12);
            this.field9194 = new int[var6];
            this.field9186 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method3031(-1);
                class141 var9 = class638.method3579(var8, (byte) -109);
                if (var9 != null) {
                    this.field9194[var7] = var8;
                    this.field9186[var7] = new int[var9.field1694];
                    for (int var10 = 0; var10 < var9.field1694; var10++) {
                        this.field9186[var7][var10] = arg0.method3031(-1);
                    }
                }
            }
        } else if (arg1 == 4) {
            this.field9193 = false;
        }
        field9195++;
        if (arg2 != 26938) {
            this.field9184 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)I", line = 86)
    public final int method3729(int arg0) {
        field9198++;
        if (this.field9194 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                field9185 = -78;
            }
            return this.field9194.length;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lji;I)Ljava/lang/String;", line = 105)
    public final String method3730(class572 arg0, int arg1) {
        if (arg1 != 0) {
            this.method3732(56, null);
        }
        field9189++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field9194 != null) {
            for (int var4 = 0; var4 < this.field9194.length; var4++) {
                var3.append(this.field9196[var4]);
                var3.append(this.field9184.method3265(this.method3737(var4, 1024), this.field9186[var4], 1, arg0.method3044((byte) -11, class638.method3579(this.field9194[var4], (byte) -109).field1691)));
            }
        }
        var3.append(this.field9196[this.field9196.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)I", line = 135)
    public final int method3731(int arg0, int arg1, int arg2) {
        field9201++;
        if (arg1 != -1) {
            method3735(null, null, -61);
        }
        if (this.field9194 == null || arg2 < 0 || arg2 > this.field9194.length) {
            return -1;
        } else if (this.field9186[arg2] == null || arg0 < 0 || this.field9186[arg2].length < arg0) {
            return -1;
        } else {
            return this.field9186[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILji;)V", line = 153)
    public final void method3732(int arg0, class572 arg1) {
        if (arg0 <= 83) {
            field9185 = 0;
        }
        field9202++;
        while (true) {
            int var3 = arg1.method3097((byte) 12);
            if (var3 == 0) {
                return;
            }
            this.method3728(arg1, var3, 26938);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lpfa;Z)V", line = 179)
    public static final void method3733(class275 arg0, boolean arg1) {
        field9190++;
        class357.field4609 = arg0;
        if (arg1) {
            field9199 = 57;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lji;Z[I)V", line = 194)
    public final void method3734(class572 arg0, boolean arg1, int[] arg2) {
        field9188++;
        if (this.field9194 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field9194.length && arg2.length > var4; var4++) {
            int var5 = this.method3737(var4, 1024).field1695;
            if (var5 > 0) {
                arg0.method3082((long) arg2[var4], -97, var5);
            }
        }
        if (arg1) {
            this.method3729(-8);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Le;Loa;I)V", line = 220)
    public static final void method3735(class498 arg0, class650 arg1, int arg2) {
        field9192++;
        if (class604.field8107 == null) {
            return;
        }
        if (class394.field5023 < 10) {
            if (!class604.field8101.method1640(arg2 ^ 0xFFFFB0FC, class604.field8107.field5857)) {
                class394.field5023 = class682.field9284.method1643(class604.field8107.field5857, true) / 10;
                return;
            }
            class441.method2418(0);
            class394.field5023 = 10;
        }
        if (class394.field5023 == 10) {
            class604.field8140 = class604.field8107.field5856 >> 6 << 6;
            class604.field8128 = class604.field8107.field5861 >> 6 << 6;
            class604.field8137 = (class604.field8107.field5867 >> 6 << 6) + 64 - class604.field8140;
            class604.field8123 = (class604.field8107.field5854 >> 6 << 6) + 64 - class604.field8128;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class604.field8107.method2573(-116, class67.field815.field8010, (class67.field815.field8011 >> 9) + class522.field6612, (class67.field815.field8018 >> 9) + class227.field2938, var3)) {
                var4 = var3[1] - class604.field8128;
                var5 = var3[2] - class604.field8140;
            }
            if (!class309.field3896 && var4 >= 0 && var4 < class604.field8123 && var5 >= 0 && var5 < class604.field8137) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class227.field2939 = var7;
                class537.field6759 = var6;
            } else if (class255.field3278 == -1 || class381.field4882 == -1) {
                class604.field8107.method2572(class604.field8107.field5864 >> 14 & 0x3FFF, arg2 - 7134, var3, class604.field8107.field5864 & 0x3FFF);
                class537.field6759 = var3[2] - class604.field8140;
                class227.field2939 = var3[1] - class604.field8128;
            } else {
                class604.field8107.method2572(class255.field3278, -43, var3, class381.field4882);
                class309.field3896 = false;
                if (var3 != null) {
                    class537.field6759 = var3[2] - class604.field8140;
                    class227.field2939 = var3[1] - class604.field8128;
                }
                class381.field4882 = -1;
                class255.field3278 = -1;
            }
            if (class604.field8107.field5860 == 37) {
                class604.field8113 = 3.0F;
                class604.field8111 = 3.0F;
            } else if (class604.field8107.field5860 == 50) {
                class604.field8113 = 4.0F;
                class604.field8111 = 4.0F;
            } else if (class604.field8107.field5860 == 75) {
                class604.field8113 = 6.0F;
                class604.field8111 = 6.0F;
            } else if (class604.field8107.field5860 == 100) {
                class604.field8113 = 8.0F;
                class604.field8111 = 8.0F;
            } else if (class604.field8107.field5860 == 200) {
                class604.field8113 = 16.0F;
                class604.field8111 = 16.0F;
            } else {
                class604.field8113 = 8.0F;
                class604.field8111 = 8.0F;
            }
            class604.field8115 = (int) class604.field8113 >> 1;
            class604.field8118 = class321.method1855(class604.field8115, (byte) -92);
            class460.method2531((byte) 44);
            class604.method3350();
            class74.field986 = new class333();
            class604.field8117 += (int) (Math.random() * 5.0D) - 2;
            if (class604.field8117 < -8) {
                class604.field8117 = -8;
            }
            if (class604.field8117 > 8) {
                class604.field8117 = 8;
            }
            class604.field8114 += (int) (Math.random() * 5.0D) - 2;
            if (class604.field8114 < -16) {
                class604.field8114 = -16;
            }
            if (class604.field8114 > 16) {
                class604.field8114 = 16;
            }
            class604.method3352(arg0, class604.field8117 >> 2 << 10, class604.field8114 >> 1);
            class604.field8104.method94(1024, (byte) 49, 256);
            class604.field8108.method1004(arg2 ^ 0x1BA5, 256, 256);
            class604.field8105.method2359(4096, (byte) 86);
            class392.field5013.method1359(256, (byte) 67);
            class394.field5023 = 20;
        } else if (class394.field5023 == 20) {
            class545.method2919((byte) 24, true);
            class604.method3351(arg1, class604.field8117, class604.field8114);
            class394.field5023 = 60;
            class545.method2919((byte) 24, true);
            class422.method2337(-28508);
        } else if (class394.field5023 == 60) {
            if (class604.field8101.method1661(class604.field8107.field5857 + "_staticelements", false)) {
                if (!class604.field8101.method1640(arg2 ^ 0xFFFFB0FC, class604.field8107.field5857 + "_staticelements")) {
                    return;
                }
                class604.field8110 = class7.method22(class604.field8101, 0, class604.field8107.field5857 + "_staticelements", class196.field2308);
            } else {
                class604.field8110 = new class489(0);
            }
            class604.method3347();
            class394.field5023 = 70;
            class545.method2919((byte) 24, true);
            class422.method2337(arg2 - 35568);
        } else if (arg2 == 7060) {
            if (class394.field5023 == 70) {
                class694.field9625 = new class44(arg1, 11, true, class472.field5828);
                class394.field5023 = 73;
                class545.method2919((byte) 24, true);
                class422.method2337(arg2 ^ 0xFFFF8B30);
            } else if (class394.field5023 == 73) {
                class64.field784 = new class44(arg1, 12, true, class472.field5828);
                class394.field5023 = 76;
                class545.method2919((byte) 24, true);
                class422.method2337(arg2 - 35568);
            } else if (class394.field5023 == 76) {
                class26.field313 = new class44(arg1, 14, true, class472.field5828);
                class394.field5023 = 79;
                class545.method2919((byte) 24, true);
                class422.method2337(-28508);
            } else if (class394.field5023 == 79) {
                class670.field9107 = new class44(arg1, 17, true, class472.field5828);
                class394.field5023 = 82;
                class545.method2919((byte) 24, true);
                class422.method2337(-28508);
            } else if (class394.field5023 == 82) {
                class621.field8434 = new class44(arg1, 19, true, class472.field5828);
                class394.field5023 = 85;
                class545.method2919((byte) 24, true);
                class422.method2337(-28508);
            } else if (class394.field5023 == 85) {
                class683.field9309 = new class44(arg1, 22, true, class472.field5828);
                class394.field5023 = 88;
                class545.method2919((byte) 24, true);
                class422.method2337(-28508);
            } else if (class394.field5023 == 88) {
                class349.field4486 = new class44(arg1, 26, true, class472.field5828);
                class394.field5023 = 91;
                class545.method2919((byte) 24, true);
                class422.method2337(-28508);
            } else {
                class96.field1245 = new class44(arg1, 30, true, class472.field5828);
                class394.field5023 = 100;
                class545.method2919((byte) 24, true);
                class422.method2337(arg2 ^ 0xFFFF8B30);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)Ljava/lang/String;", line = 445)
    public final String method3736(byte arg0) {
        if (arg0 > -78) {
            this.field9193 = false;
        }
        field9183++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field9196 == null) {
            return "";
        }
        var2.append(this.field9196[0]);
        for (int var3 = 1; var3 < this.field9196.length; var3++) {
            var2.append("...");
            var2.append(this.field9196[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(II)Lvf;", line = 473)
    public final class141 method3737(int arg0, int arg1) {
        field9197++;
        if (arg1 != 1024) {
            this.method3728(null, -16, 12);
        }
        return this.field9194 == null || arg0 < 0 || this.field9194.length < arg0 ? null : class638.method3579(this.field9194[arg0], (byte) -109);
    }

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "(I)V", line = 492)
    public final void method3738(int arg0) {
        if (arg0 != 1) {
            field9199 = 70;
        }
        if (this.field9187 != null) {
            for (int var2 = 0; var2 < this.field9187.length; var2++) {
                this.field9187[var2] = class364.method2113(this.field9187[var2], 32768);
            }
        }
        field9200++;
    }
}
