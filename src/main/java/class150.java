import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class150 extends class262 {

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "[S")
    private short[] field2540 = new short[257];

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    private int field2546 = 0;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    public static int field2545 = 0;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "[Z")
    public static boolean[] field2549 = new boolean[5];

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "[S")
    public static short[] field2551 = new short[256];

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "Lok;")
    private static class146 field2543 = class235.method1724(-12908, "Allocated memory");

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "I")
    public static int field2550 = 0;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "Lok;")
    public static class146 field2542 = field2543;

    @OriginalMember(owner = "client!wb", name = "eb", descriptor = "I")
    public static int field2556 = 0;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!wb", name = "fb", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!wb", name = "gb", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!wb", name = "hb", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!wb", name = "ib", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!wb", name = "jb", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "Loh;")
    public static class15 field2555;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "[I")
    private int[] field2544;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "[I")
    private int[] field2548;

    @OriginalMember(owner = "client!wb", name = "kb", descriptor = "[I")
    public static int[] field2562;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "[[I")
    private int[][] field2541;

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V", line = 3)
    public class150() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V", line = 10)
    public final void method43(int arg0) {
        field2561++;
        if (this.field2541 == null) {
            this.field2541 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (this.field2541.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else if (arg0 == -2) {
            if (this.field2546 == 2) {
                this.method1190(1);
            }
            class73.method543((byte) -76);
            this.method1189(28);
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(B)V", line = 38)
    public static void method1185(byte arg0) {
        field2551 = null;
        field2543 = null;
        field2549 = null;
        if (arg0 > -49) {
            method1188(-22);
        }
        field2542 = null;
        field2562 = null;
        field2555 = null;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)Lij;", line = 60)
    public static final class79 method1186(int arg0, int arg1) {
        field2553++;
        class79 var2 = (class79) class168.field2833.method799((byte) 52, (long) arg0);
        if (arg1 < 14) {
            method1186(-92, -126);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class84.field1336.method92(class227.method1676(arg0, (byte) -101), 0, class138.method1020(-89, arg0));
        class79 var4 = new class79();
        if (var3 != null) {
            var4.method566(-69, new class47(var3));
        }
        class168.field2833.method797(var4, 0, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)[I", line = 86)
    private final int[] method1187(int arg0, int arg1) {
        if (arg0 < 17) {
            this.method1190(-126);
        }
        field2560++;
        if (arg1 < 0) {
            return this.field2544;
        } else if (arg1 < this.field2541.length) {
            return this.field2541[arg1];
        } else {
            return this.field2548;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lwe;II)V", line = 118)
    public final void method40(class47 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field2546 = arg0.method368(-124);
            this.field2541 = new int[arg0.method368(-98)][2];
            for (int var4 = 0; var4 < this.field2541.length; var4++) {
                this.field2541[var4][0] = arg0.method379(-2);
                this.field2541[var4][1] = arg0.method379(-2);
            }
        }
        field2559++;
        if (arg1 != 2048) {
            method1185((byte) -94);
        }
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V", line = 162)
    public static final void method1188(int arg0) {
        field2547++;
        if (class75.field1219 == null) {
            return;
        }
        if (class57.field1010 < 10) {
            if (!class126.field2055.method104(class75.field1219.field3236, (byte) 86)) {
                class57.field1010 = class73.field1199.method88((byte) 102, class75.field1219.field3236) / 10;
                return;
            }
            class187.method1459(2629);
            class57.field1010 = 10;
        }
        if (class57.field1010 == 10) {
            class191.field3152 = class75.field1219.field3230 >> 6 << 6;
            if (class75.field1219.field3238 == 37) {
                class133.field2231 = 3.0F;
                class28.field491 = 3.0F;
            } else if (class75.field1219.field3238 == 50) {
                class133.field2231 = 4.0F;
                class28.field491 = 4.0F;
            } else if (class75.field1219.field3238 == 75) {
                class133.field2231 = 6.0F;
                class28.field491 = 6.0F;
            } else if (class75.field1219.field3238 == 100) {
                class133.field2231 = 8.0F;
                class28.field491 = 8.0F;
            } else if (class75.field1219.field3238 == 200) {
                class133.field2231 = 16.0F;
                class28.field491 = 16.0F;
            } else {
                class133.field2231 = 8.0F;
                class28.field491 = 8.0F;
            }
            class33.field639 = (class75.field1219.field3227 >> 6 << 6) + 64 - class191.field3152;
            class277.field4764 = class75.field1219.field3241 >> 6 << 6;
            int var1 = (class102.field1639.field5409 >> 7) + class15.field300 - class277.field4764;
            class118.field1916 = (class75.field1219.field3240 >> 6 << 6) + 64 - class277.field4764;
            int var2 = class191.field3152 + class33.field639 - (class102.field1639.field5380 >> 7) - class201.field3357 - 1;
            int var3 = var1 + ((int) (Math.random() * 10.0D) - 5);
            int var4 = var2 + ((int) (Math.random() * 10.0D) - 5);
            if (var3 >= 0 && var3 < class118.field1916 && var4 >= 0 && var4 < class33.field639) {
                class236.field3937 = var4;
                class148.field2508 = var3;
            } else {
                class148.field2508 = class75.field1219.field3225 * 64 - class277.field4764;
                class236.field3937 = class191.field3152 + class33.field639 - (class75.field1219.field3219 * 64 + 1);
            }
            class95.method649((byte) -124);
            int var5 = class118.field1916 >> 6;
            int var6 = class106.field1701 >> 1;
            int var7 = class75.field1220 >> 2 << 10;
            class190.field3150 = new int[class124.field2019 + 1];
            int var8 = class33.field639 >> 6;
            class206.field3446 = new int[var5][var8][];
            class18.field363 = new byte[var5][var8][];
            class33.field632 = new byte[var5][var8][];
            class318.field5401 = new int[var5][var8][];
            class137.field2288 = new byte[var5][var8][];
            class39.field693 = new short[var5][var8][];
            class277.field4762 = new byte[var5][var8][];
            class298.field5067 = new byte[var5][var8][];
            class35.method253(-1, var6, var7);
            class57.field1010 = 20;
        } else if (class57.field1010 == 20) {
            class99.method685(256, new class47(class126.field2055.method105(-110, class311.field5297, class75.field1219.field3236)));
            class57.field1010 = 30;
            class197.method1519(true, 30);
            class146.method1091(16547);
        } else {
            if (arg0 != -1) {
                field2562 = (int[]) null;
            }
            if (class57.field1010 == 30) {
                class101.method693(new class47(class126.field2055.method105(-117, class316.field5356, class75.field1219.field3236)), true);
                class57.field1010 = 40;
                class146.method1091(16547);
            } else if (class57.field1010 == 40) {
                class292.method2086(-116, new class47(class126.field2055.method105(-85, class167.field2821, class75.field1219.field3236)));
                class57.field1010 = 50;
                class146.method1091(16547);
            } else if (class57.field1010 == 50) {
                class202.method1544(new class47(class126.field2055.method105(-9, class279.field4787, class75.field1219.field3236)), 106);
                class57.field1010 = 60;
                class197.method1519(true, 30);
                class146.method1091(arg0 ^ 0xFFFFBF5C);
            } else if (class57.field1010 == 60) {
                if (class126.field2055.method90(class112.method758(arg0 - 11, new class146[] { class75.field1219.field3236, class39.field690 }), (byte) 50)) {
                    if (!class126.field2055.method104(class112.method758(-92, new class146[] { class75.field1219.field3236, class39.field690 }), (byte) 76)) {
                        return;
                    }
                    class135.field2255 = class132.method980(arg0 + 111, class112.method758(122, new class146[] { class75.field1219.field3236, class39.field690 }), class126.field2055);
                } else {
                    class135.field2255 = new class280(0);
                }
                class57.field1010 = 70;
                class146.method1091(16547);
            } else if (class57.field1010 == 70) {
                class20.field382 = new class246(11, true, class75.field1228);
                class57.field1010 = 73;
                class197.method1519(true, 30);
                class146.method1091(16547);
            } else if (class57.field1010 == 73) {
                class14.field269 = new class246(12, true, class75.field1228);
                class57.field1010 = 76;
                class197.method1519(true, 30);
                class146.method1091(16547);
            } else if (class57.field1010 == 76) {
                class89.field1423 = new class246(14, true, class75.field1228);
                class57.field1010 = 79;
                class197.method1519(true, arg0 + 31);
                class146.method1091(16547);
            } else if (class57.field1010 == 79) {
                class309.field5253 = new class246(17, true, class75.field1228);
                class57.field1010 = 82;
                class197.method1519(true, arg0 + 31);
                class146.method1091(16547);
            } else if (class57.field1010 == 82) {
                class26.field461 = new class246(19, true, class75.field1228);
                class57.field1010 = 85;
                class197.method1519(true, arg0 + 31);
                class146.method1091(arg0 ^ 0xFFFFBF5C);
            } else if (class57.field1010 == 85) {
                class226.field3774 = new class246(22, true, class75.field1228);
                class57.field1010 = 88;
                class197.method1519(true, arg0 + 31);
                class146.method1091(16547);
            } else if (class57.field1010 == 88) {
                class192.field3173 = new class246(26, true, class75.field1228);
                class57.field1010 = 91;
                class197.method1519(true, 30);
                class146.method1091(16547);
            } else {
                class101.field1632 = new class246(30, true, class75.field1228);
                class57.field1010 = 100;
                class197.method1519(true, 30);
                class146.method1091(16547);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)[I", line = 386)
    public final int[] method38(int arg0, byte arg1) {
        if (arg1 >= -85) {
            this.method1189(85);
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 104);
        field2552++;
        if (this.field4350.field3333) {
            int[] var4 = this.method1895(7, 0, arg0);
            for (int var5 = 0; var5 < class98.field1598; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2540[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)V", line = 427)
    private final void method1189(int arg0) {
        if (arg0 < 23) {
            return;
        }
        field2554++;
        int var2 = this.field2546;
        if (var2 == 2) {
            for (int var20 = 0; var20 < 257; var20++) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < (this.field2541.length - 1) && var21 >= this.field2541[var22][0]; var22++) {
                }
                int[] var23 = this.field2541[var22 - 1];
                int[] var24 = this.field2541[var22];
                int var25 = this.method1187(83, var22 - 2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1187(122, var22 + 1)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 + var26 - (var27 + var25);
                int var32 = var27 - var25;
                int var33 = var25 - var26 - var31;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var29 * var32 >> 12;
                int var37 = var30 * var33 >> 12;
                int var38 = var35 + var26 - (-var37 - var36);
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field2540[var20] = (short) var38;
            }
        } else if (var2 == 1) {
            for (int var11 = 0; var11 < 257; var11++) {
                int var12 = var11 << 4;
                int var13;
                for (var13 = 1; (this.field2541.length - 1) > var13 && var12 >= this.field2541[var13][0]; var13++) {
                }
                int[] var14 = this.field2541[var13];
                int[] var15 = this.field2541[var13 - 1];
                int var16 = (var12 - var15[0] << 12) / (var14[0] - var15[0]);
                int var17 = 4096 - class15.field309[(var16 & 0x1FE8) >> 5] >> 1;
                int var18 = 4096 - var17;
                int var19 = var14[1] * var17 + var15[1] * var18 >> 12;
                if (var19 <= -32768) {
                    var19 = -32767;
                }
                if (var19 >= 32768) {
                    var19 = 32767;
                }
                this.field2540[var11] = (short) var19;
            }
        } else {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; (this.field2541.length - 1) > var5 && var4 >= this.field2541[var5][0]; var5++) {
                }
                int[] var6 = this.field2541[var5];
                int[] var7 = this.field2541[var5 - 1];
                int var8 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var9 = 4096 - var8;
                int var10 = var6[1] * var8 + var7[1] * var9 >> 12;
                if (var10 <= -32768) {
                    var10 = -32767;
                }
                if (var10 >= 32768) {
                    var10 = 32767;
                }
                this.field2540[var3] = (short) var10;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V", line = 615)
    private final void method1190(int arg0) {
        field2557++;
        int[] var2 = this.field2541[0];
        int[] var3 = this.field2541[1];
        int[] var4 = this.field2541[this.field2541.length - 1];
        int[] var5 = this.field2541[this.field2541.length - 2];
        this.field2544 = new int[] { var2[0] + var2[0] - var3[0], var2[1] + -var3[1] + var2[1] };
        this.field2548 = new int[] { var5[0] + var5[0] - var4[0], var5[arg0] + -var4[1] + var5[1] };
    }
}
