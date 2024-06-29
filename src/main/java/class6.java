import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class6 extends class23 {

    @OriginalMember(owner = "client!gk", name = "cb", descriptor = "I")
    private int field81 = 4096;

    @OriginalMember(owner = "client!gk", name = "db", descriptor = "I")
    private int field82 = 0;

    @OriginalMember(owner = "client!gk", name = "hb", descriptor = "[S")
    public static short[] field86 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!gk", name = "ib", descriptor = "I")
    public static int field87 = 0;

    @OriginalMember(owner = "client!gk", name = "fb", descriptor = "Lqd;")
    public static class40 field84 = class147.method1106("Benutzen", (byte) -56);

    @OriginalMember(owner = "client!gk", name = "jb", descriptor = "[Lcl;")
    public static class126[] field88 = new class126[6];

    @OriginalMember(owner = "client!gk", name = "kb", descriptor = "Lrb;")
    public static class213 field89 = null;

    @OriginalMember(owner = "client!gk", name = "pb", descriptor = "Lqd;")
    public static class40 field94 = class147.method1106(" (X", (byte) -69);

    @OriginalMember(owner = "client!gk", name = "ob", descriptor = "Lqd;")
    public static class40 field93 = class147.method1106("mem=", (byte) -62);

    @OriginalMember(owner = "client!gk", name = "Y", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!gk", name = "Z", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!gk", name = "ab", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!gk", name = "bb", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!gk", name = "eb", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!gk", name = "gb", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!gk", name = "lb", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!gk", name = "mb", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!gk", name = "nb", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V", line = 7)
    public static void method28(byte arg0) {
        field86 = null;
        field88 = null;
        int var1 = 14 % ((arg0 + 42) / 59);
        field84 = null;
        field94 = null;
        field93 = null;
        field89 = null;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V", line = 24)
    public static final void method29(boolean arg0) {
        field91++;
        if (class254.field4205 == null) {
            return;
        }
        if (class296.field4950 < 10) {
            if (!class140.field2364.method1682(-101, class254.field4205.field3319)) {
                class296.field4950 = class280.field4739.method1672((byte) -22, class254.field4205.field3319) / 10;
                return;
            }
            class170.method1264(-5);
            class296.field4950 = 10;
        }
        if (class296.field4950 == 10) {
            class101.field1786 = 8.0F;
            class186.field3008 = 8.0F;
            class91.field1662 = class254.field4205.field3328 >> 6 << 6;
            int var1 = class196.field3152 - (class91.field1662 - (class255.field4233.field1531 >> 7));
            class233.field3840 = (class254.field4205.field3321 >> 6 << 6) + 64 - class91.field1662;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            class272.field4524 = class254.field4205.field3326 >> 6 << 6;
            class268.field4462 = (class254.field4205.field3330 >> 6 << 6) - (class272.field4524 - 64);
            int var3 = class268.field4462 + class272.field4524 - class263.field4407 - (class255.field4233.field1497 >> 7) - 1;
            int var4 = var3 + ((int) (Math.random() * 10.0D) - 5);
            if (var2 >= 0 && class233.field3840 > var2 && var4 >= 0 && var4 < class268.field4462) {
                class92.field1675 = var4;
                class110.field1931 = var2;
            } else {
                class92.field1675 = class268.field4462 + class272.field4524 - (class254.field4205.field3320 * 64) - 1;
                class110.field1931 = class254.field4205.field3329 * 64 - class91.field1662;
            }
            class309.method2113(-31654);
            int var5 = class29.field622 >> 2 << 10;
            class119.field2018 = new int[class286.field4821 + 1];
            int var6 = class268.field4462 >> 6;
            int var7 = class233.field3840 >> 6;
            class62.field1169 = new byte[var7][var6][];
            class214.field3591 = new byte[var7][var6][];
            class108.field1892 = new short[var7][var6][];
            class256.field4267 = new byte[var7][var6][];
            int var8 = class239.field3959 >> 1;
            class235.field3847 = new byte[var7][var6][];
            class87.field1579 = new int[var7][var6][];
            class86.field1495 = new int[var7][var6][];
            class225.field3734 = new byte[var7][var6][];
            class7.method38(69, var8, var5);
            class296.field4950 = 20;
        } else if (class296.field4950 == 20) {
            class133.method986(-67, new class26(class140.field2364.method1680((byte) 34, class22.field386, class254.field4205.field3319)));
            class296.field4950 = 30;
            class278.method1949(-51, true);
            client.method1725(40);
        } else if (class296.field4950 == 30) {
            class181.method1320(new class26(class140.field2364.method1680((byte) 34, class39.field708, class254.field4205.field3319)), (byte) 105);
            class296.field4950 = 40;
            client.method1725(40);
        } else if (class296.field4950 == 40) {
            class130.method965(new class26(class140.field2364.method1680((byte) 34, class81.field1428, class254.field4205.field3319)), true);
            class296.field4950 = 50;
            client.method1725(40);
        } else if (class296.field4950 == 50) {
            class276.method1926((byte) -121, new class26(class140.field2364.method1680((byte) 34, class78.field1323, class254.field4205.field3319)));
            class296.field4950 = 60;
            class278.method1949(-51, true);
            client.method1725(40);
        } else if (class296.field4950 == 60) {
            if (class140.field2364.method1655((byte) 83, class153.method1192(new class40[] { class254.field4205.field3319, class85.field1467 }, (byte) 123))) {
                if (!class140.field2364.method1682(-115, class153.method1192(new class40[] { class254.field4205.field3319, class85.field1467 }, (byte) 126))) {
                    return;
                }
                class160.field2670 = class285.method1983(class153.method1192(new class40[] { class254.field4205.field3319, class85.field1467 }, (byte) -37), class140.field2364, 0);
            } else {
                class160.field2670 = new class313(0);
            }
            class296.field4950 = 70;
            client.method1725(40);
        } else if (class296.field4950 == 70) {
            class209.field3347 = new class75(11, true, class213.field3470);
            class296.field4950 = 73;
            class278.method1949(-51, true);
            client.method1725(40);
        } else {
            if (arg0) {
                field83 = 60;
            }
            if (class296.field4950 == 73) {
                class23.field419 = new class75(12, true, class213.field3470);
                class296.field4950 = 76;
                class278.method1949(-51, true);
                client.method1725(40);
            } else if (class296.field4950 == 76) {
                class29.field626 = new class75(14, true, class213.field3470);
                class296.field4950 = 79;
                class278.method1949(-51, true);
                client.method1725(40);
            } else if (class296.field4950 == 79) {
                class304.field5087 = new class75(17, true, class213.field3470);
                class296.field4950 = 82;
                class278.method1949(-51, true);
                client.method1725(40);
            } else if (class296.field4950 == 82) {
                class306.field5132 = new class75(19, true, class213.field3470);
                class296.field4950 = 85;
                class278.method1949(-51, true);
                client.method1725(40);
            } else if (class296.field4950 == 85) {
                class299.field4996 = new class75(22, true, class213.field3470);
                class296.field4950 = 88;
                class278.method1949(-51, true);
                client.method1725(40);
            } else if (class296.field4950 == 88) {
                class158.field2639 = new class75(26, true, class213.field3470);
                class296.field4950 = 91;
                class278.method1949(-51, true);
                client.method1725(40);
            } else {
                class309.field5186 = new class75(30, true, class213.field3470);
                class296.field4950 = 100;
                class278.method1949(-51, true);
                client.method1725(40);
                class291.field4873 = -1;
                class160.field2677 = -1;
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(BI)V", line = 228)
    public static final void method30(byte arg0, int arg1) {
        for (class270 var2 = (class270) class192.field3091.method1400(-1); var2 != null; var2 = (class270) class192.field3091.method1403(113)) {
            if (((long) arg1) == (var2.field5149 >> 48 & 0xFFFFL)) {
                var2.method2095(0);
            }
        }
        if (arg0 >= -64) {
            field86 = (short[]) null;
        }
        field79++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILsd;)V", line = 250)
    public final void method23(int arg0, int arg1, class26 arg2) {
        field85++;
        if (arg0 == 0) {
            this.field82 = arg2.method197(-1);
        } else if (arg0 == 1) {
            this.field81 = arg2.method197(-1);
        } else if (arg0 == 2) {
            this.field415 = arg2.method226(255) == 1;
        }
        if (arg1 != 0) {
            field87 = -107;
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V", line = 590)
    public class6() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "(I)V", line = 306)
    public static final void method31(int arg0) {
        int var1 = class233.field3836 * 128 + 64;
        int var2 = class244.field4023 * 128 + 64;
        int var3 = class293.method2012(class160.field2671, var2, arg0 + 17352, var1) - class210.field3349;
        field77++;
        if (class68.field1249 >= 100) {
            class238.field3922 = class233.field3836 * 128 + 64;
            class289.field4841 = class244.field4023 * 128 + 64;
            class116.field1988 = class293.method2012(class160.field2671, class289.field4841, 0, class238.field3922) - class210.field3349;
        } else {
            if (class289.field4841 < var2) {
                class289.field4841 += class255.field4246 + ((var2 - class289.field4841) * class68.field1249 / 1000);
                if (var2 < class289.field4841) {
                    class289.field4841 = var2;
                }
            }
            if (class289.field4841 > var2) {
                class289.field4841 -= (class289.field4841 - var2) * class68.field1249 / 1000 + class255.field4246;
                if (class289.field4841 < var2) {
                    class289.field4841 = var2;
                }
            }
            if (var1 > class238.field3922) {
                class238.field3922 += (var1 - class238.field3922) * class68.field1249 / 1000 + class255.field4246;
                if (var1 < class238.field3922) {
                    class238.field3922 = var1;
                }
            }
            if (class238.field3922 > var1) {
                class238.field3922 -= (class238.field3922 - var1) * class68.field1249 / 1000 + class255.field4246;
                if (var1 > class238.field3922) {
                    class238.field3922 = var1;
                }
            }
            if (var3 > class116.field1988) {
                class116.field1988 += (var3 - class116.field1988) * class68.field1249 / 1000 + class255.field4246;
                if (class116.field1988 > var3) {
                    class116.field1988 = var3;
                }
            }
            if (var3 < class116.field1988) {
                class116.field1988 -= (class116.field1988 - var3) * class68.field1249 / 1000 + class255.field4246;
                if (class116.field1988 < var3) {
                    class116.field1988 = var3;
                }
            }
        }
        int var4 = class186.field3007 * 128 + 64;
        int var5 = class228.field3775 * 128 + 64;
        int var6 = class293.method2012(class160.field2671, var5, 0, var4) - class118.field2002;
        int var7 = var4 - class238.field3922;
        int var8 = var5 - class289.field4841;
        int var9 = var6 - class116.field1988;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var8) * -325.949D) & 0x7FF;
        int var13 = var12 - class181.field2949;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 > 0) {
            class181.field2949 += class165.field2733 * var13 / 1000 + class317.field5367;
            class181.field2949 &= 0x7FF;
        }
        if (var13 < 0) {
            class181.field2949 -= -var13 * class165.field2733 / 1000 + class317.field5367;
            class181.field2949 &= 0x7FF;
        }
        if (arg0 != -17352) {
            method29(true);
        }
        if (class58.field1107 < var11) {
            class58.field1107 += (var11 - class58.field1107) * class165.field2733 / 1000 + class317.field5367;
            if (class58.field1107 > var11) {
                class58.field1107 = var11;
            }
        }
        if (class58.field1107 > var11) {
            class58.field1107 -= class317.field5367 + ((class58.field1107 - var11) * class165.field2733 / 1000);
            if (class58.field1107 < var11) {
                class58.field1107 = var11;
            }
        }
        int var14 = var12 - class181.field2949;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class181.field2949 = var12;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)[I", line = 461)
    public final int[] method32(byte arg0, int arg1) {
        field90++;
        if (arg0 != -94) {
            field92 = -4;
        }
        int[] var3 = this.field403.method724((byte) 67, arg1);
        if (this.field403.field1760) {
            int[] var4 = this.method174(0, 0, arg1);
            for (int var5 = 0; var5 < class52.field1007; var5++) {
                int var6 = var4[var5];
                if (this.field82 > var6) {
                    var3[var5] = this.field82;
                } else if (this.field81 < var6) {
                    var3[var5] = this.field81;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)[[I", line = 504)
    public final int[][] method17(int arg0, int arg1) {
        int[][] var3 = this.field417.method1251(arg1, 127);
        field78++;
        if (arg0 < 30) {
            method30((byte) 44, 109);
        }
        if (this.field417.field2751) {
            int[][] var4 = this.method173(0, arg1, (byte) -125);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class52.field1007; var11++) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 < this.field82) {
                    var8[var11] = this.field82;
                } else if (var12 <= this.field81) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field81;
                }
                if (this.field82 > var13) {
                    var9[var11] = this.field82;
                } else if (this.field81 < var13) {
                    var9[var11] = this.field81;
                } else {
                    var9[var11] = var13;
                }
                if (var14 < this.field82) {
                    var10[var11] = this.field82;
                } else if (var14 > this.field81) {
                    var10[var11] = this.field81;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }
}
