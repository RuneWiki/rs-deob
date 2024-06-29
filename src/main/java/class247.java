import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class247 extends class98 {

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "[Lqd;")
    public class164[] field4281;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "Lmb;")
    public static class96 field4284 = class243.method1708("Untersuchen", (byte) 115);

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "Lmb;")
    private static class96 field4285 = class243.method1708("glow1:", (byte) 122);

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "Lmb;")
    public static class96 field4283 = field4285;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "Lmb;")
    public static class96 field4288 = class243.method1708("unzap", (byte) 116);

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "Lmb;")
    public static class96 field4286 = field4285;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "[I")
    public static int[] field4280;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "[[[B")
    public static byte[][][] field4276;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "[[[I")
    public static int[][][] field4278;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
    public static final void method1728(int arg0) {
        field4282++;
        if (class262.method1812(true) != 2) {
            return;
        }
        byte var1 = (byte) (class51.field899 - 4 & 0xFF);
        int var2 = class51.field899 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class153.field2690[var3][var2][var16] = var1;
            }
        }
        if (class216.field3712 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class138.field2471[var4] = -1000000;
            class9.field144[var4] = 1000000;
            class2.field19[var4] = 0;
            class56.field966[var4] = 1000000;
            class50.field875[var4] = 0;
        }
        if (class179.field3095 == 1) {
            if ((class132.field2376[class216.field3712][class236.field4047.field4511 >> 7][class236.field4047.field4533 >> 7] & 0x4) != 0) {
                class92.method651(class236.field4047.field4533 >> 7, (byte) -55, class236.field4047.field4511 >> 7, false, class259.field4487, 0);
            }
            if (class140.field2501 < 310) {
                int var5 = class178.field3078 >> 7;
                int var6 = class22.field389 >> 7;
                int var7 = class236.field4047.field4511 >> 7;
                int var8 = class236.field4047.field4533 >> 7;
                int var9;
                if (var5 < var7) {
                    var9 = var7 - var5;
                } else {
                    var9 = var5 - var7;
                }
                int var10;
                if (var6 >= var8) {
                    var10 = var6 - var8;
                } else {
                    var10 = var8 - var6;
                }
                if (var10 >= var9) {
                    int var11 = var9 * 65536 / var10;
                    int var12 = 32768;
                    while (var6 != var8) {
                        if (var8 > var6) {
                            var6++;
                        } else if (var8 < var6) {
                            var6--;
                        }
                        if ((class132.field2376[class216.field3712][var5][var6] & 0x4) != 0) {
                            class92.method651(var6, (byte) -55, var5, false, class259.field4487, 1);
                            break;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var7 > var5) {
                                var5++;
                            } else if (var7 < var5) {
                                var5--;
                            }
                            if ((class132.field2376[class216.field3712][var5][var6] & 0x4) != 0) {
                                class92.method651(var6, (byte) -55, var5, false, class259.field4487, 1);
                                break;
                            }
                        }
                    }
                } else {
                    int var13 = var10 * 65536 / var9;
                    int var14 = 32768;
                    while (var5 != var7) {
                        if (var7 > var5) {
                            var5++;
                        } else if (var5 > var7) {
                            var5--;
                        }
                        if ((class132.field2376[class216.field3712][var5][var6] & 0x4) != 0) {
                            class92.method651(var6, (byte) -55, var5, false, class259.field4487, 1);
                            break;
                        }
                        var14 += var13;
                        if (var14 >= 65536) {
                            var14 -= 65536;
                            if (var6 < var8) {
                                var6++;
                            } else if (var6 > var8) {
                                var6--;
                            }
                            if ((class132.field2376[class216.field3712][var5][var6] & 0x4) != 0) {
                                class92.method651(var6, (byte) -55, var5, false, class259.field4487, 1);
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            int var15 = class137.method1025(class216.field3712, class22.field389, class178.field3078, (byte) -94);
            if ((var15 - class105.field1767) < 800 && (class132.field2376[class216.field3712][class178.field3078 >> 7][class22.field389 >> 7] & 0x4) != 0) {
                class92.method651(class22.field389 >> 7, (byte) -55, class178.field3078 >> 7, false, class259.field4487, 1);
            }
        }
        if (arg0 != -1250974457) {
            method1731(-43);
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(III)V")
    public static final void method1729(int arg0, int arg1, int arg2) {
        field4279++;
        class262 var3 = class220.field3764[class216.field3712][arg2][arg0];
        if (var3 == null) {
            class98.method741(class216.field3712, arg2, arg0);
            return;
        }
        int var4 = -99999999;
        class32 var5 = (class32) var3.method1811(2);
        class32 var6 = null;
        while (var5 != null) {
            class159 var14 = class269.method1845(var5.field504.field2679, (byte) 61);
            int var15 = var14.field2758;
            if (var14.field2796 == 1) {
                var15 = (var5.field504.field2669 + 1) * var15;
            }
            if (var4 < var15) {
                var4 = var15;
                var6 = var5;
            }
            var5 = (class32) var3.method1810(false);
        }
        int var7 = -7 % ((-arg1 - 47) / 52);
        if (var6 == null) {
            class98.method741(class216.field3712, arg2, arg0);
            return;
        }
        class152 var8 = null;
        var3.method1819(-9166, var6);
        class32 var9 = (class32) var3.method1811(2);
        class152 var10 = null;
        while (var9 != null) {
            class152 var13 = var9.field504;
            if (var6.field504.field2679 != var13.field2679) {
                if (var8 == null) {
                    var8 = var13;
                }
                if (var8.field2679 != var13.field2679 && var10 == null) {
                    var10 = var13;
                }
            }
            var9 = (class32) var3.method1810(false);
        }
        long var11 = (long) ((arg0 << 7) + (arg2 + 1610612736));
        class221.method1521(class216.field3712, arg2, arg0, class137.method1025(class216.field3712, arg0 * 128 + 64, arg2 * 128 + 64, (byte) -94), var6.field504, var11, var8, var10);
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lff;Lff;IZ)V")
    public class247(class3 arg0, class3 arg1, int arg2, boolean arg3) {
        class262 var5 = new class262();
        int var6 = arg0.method37(arg2, (byte) -122);
        this.field4281 = new class164[var6];
        int[] var7 = arg0.method24(0, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method23(var7[var8], 103, arg2);
            class7 var10 = null;
            int var11 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            for (class7 var12 = (class7) var5.method1811(2); var12 != null; var12 = (class7) var5.method1810(false)) {
                if (var12.field138 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method33(0, false, var11);
                } else {
                    var13 = arg1.method33(var11, false, 0);
                }
                var10 = new class7(var11, var13);
                var5.method1814(1, var10);
            }
            this.field4281[var7[var8]] = new class164(var9, var10);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Z")
    public final boolean method1730(int arg0, int arg1) {
        if (arg1 != 1) {
            field4280 = null;
        }
        field4277++;
        return this.field4281[arg0].field2903;
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
    public static final void method1731(int arg0) {
        class73.field1254 = 0;
        class252.field4365 = -1;
        class140.field2505.field4124 = 0;
        class1.field4.field4124 = 0;
        class87.field1463 = 0;
        class46.field794 = -1;
        class6.field126 = -1;
        field4289++;
        class47.field820 = 0;
        class217.field3728 = 0;
        class217.field3727 = 0;
        class159.field2803 = arg0;
        class170.field2981 = false;
        class24.field415 = -1;
        for (int var1 = 0; var1 < class22.field371.length; var1++) {
            if (class22.field371[var1] != null) {
                class22.field371[var1].field4537 = -1;
            }
        }
        for (int var2 = 0; var2 < class86.field1450.length; var2++) {
            if (class86.field1450[var2] != null) {
                class86.field1450[var2].field4537 = -1;
            }
        }
        class185.method1304(108);
        class179.field3095 = 1;
        class146.method1076(6938, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class176.field3059[var3] = true;
        }
        class224.method1529((byte) -123);
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V")
    public static void method1732(int arg0) {
        field4286 = null;
        field4276 = null;
        field4283 = null;
        field4285 = null;
        field4284 = null;
        field4288 = null;
        field4280 = null;
        if (arg0 != -1813869017) {
            field4285 = null;
        }
        field4278 = null;
    }
}
