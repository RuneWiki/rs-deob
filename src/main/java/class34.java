import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class34 implements Runnable {

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "[Lca;")
    public volatile class138[] field511 = new class138[2];

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Z")
    public volatile boolean field515 = false;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Z")
    public volatile boolean field517 = false;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "[I")
    public static int[] field513 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field522 = 0;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Ljava/lang/String;")
    public static String field521 = null;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field514 = 0;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Lfk;")
    public class52 field508;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "[I")
    public static int[] field510;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "[S")
    public static short[] field512;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILim;Z)I")
    public static final int method231(int arg0, class178 arg1, boolean arg2) {
        if (arg2) {
            method231(-7, (class178) null, true);
        }
        field516++;
        if (arg1.field2669 == null || arg0 >= arg1.field2669.length) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg1.field2669[arg0];
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var4[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var3;
                }
                if (var7 == 1) {
                    var8 = class247.field3872[var4[var5++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 2) {
                    var8 = class246.field3863[var4[var5++]];
                }
                if (var7 == 3) {
                    var8 = class262.field4213[var4[var5++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 4) {
                    int var10 = var4[var5++] << 16;
                    int var11 = var10 + var4[var5++];
                    class178 var12 = class166.method1057(-110, var11);
                    int var13 = var4[var5++];
                    if (var13 != -1 && (!class281.method1822((byte) -100, var13).field113 || class252.field3939)) {
                        for (int var14 = 0; var14 < var12.field2618.length; var14++) {
                            if (var13 + 1 == var12.field2618[var14]) {
                                var8 += var12.field2691[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class189.field2864[var4[var5++]];
                }
                if (var7 == 6) {
                    var8 = class195.field2981[class246.field3863[var4[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class189.field2864[var4[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class250.field3905.field5059;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class2.field6[var15]) {
                            var8 += class246.field3863[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var4[var5++] << 16;
                    int var17 = var16 + var4[var5++];
                    class178 var18 = class166.method1057(115, var17);
                    int var19 = var4[var5++];
                    if (var19 != -1 && (!class281.method1822((byte) -100, var19).field113 || class252.field3939)) {
                        for (int var20 = 0; var20 < var18.field2618.length; var20++) {
                            if ((var19 + 1) == var18.field2618[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class271.field4319;
                }
                if (var7 == 12) {
                    var8 = class42.field635;
                }
                if (var7 == 13) {
                    int var21 = class189.field2864[var4[var5++]];
                    int var22 = var4[var5++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var4[var5++];
                    var8 = class194.method1226(var23, false);
                }
                if (var7 == 18) {
                    var8 = (class250.field3905.field4081 >> 7) + class228.field3570;
                }
                if (var7 == 19) {
                    var8 = (class250.field3905.field4140 >> 7) + class170.field2421;
                }
                if (var7 == 20) {
                    var8 = var4[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var3 += var8;
                    }
                    if (var6 == 1) {
                        var3 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var3 /= var8;
                    }
                    if (var6 == 3) {
                        var3 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BII)I")
    public static final int method232(byte arg0, int arg1, int arg2) {
        field523++;
        int var3 = arg2 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        if (arg0 < 1) {
            method236(-24, 110);
        }
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return (var5 & 0x7FCD5E2) >> 19;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static final void method233(int arg0) {
        if (arg0 != -14287) {
            field522 = 69;
        }
        field507++;
        for (class112 var1 = (class112) class8.field89.method369((byte) -110); var1 != null; var1 = (class112) class8.field89.method362(false)) {
            class23 var2 = var1.field1608;
            if (class166.field2364 != var2.field374 || var2.field359) {
                var1.method962(128);
            } else if (var2.field379 <= class35.field533) {
                var2.method150(2, class208.field3094);
                if (var2.field359) {
                    var1.method962(arg0 ^ 0xFFFFC8B1);
                } else {
                    class163.method1039(var2.field374, var2.field360, var2.field363, var2.field365, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static void method234(int arg0) {
        field510 = null;
        field512 = null;
        if (arg0 != -12845) {
            method231(-84, (class178) null, true);
        }
        field513 = null;
        field521 = null;
    }

    @OriginalMember(owner = "client!cb", name = "run", descriptor = "()V")
    public final void run() {
        this.field517 = true;
        try {
            while (!this.field515) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class138 var2 = this.field511[var1];
                    if (var2 != null) {
                        var2.method871(32646);
                    }
                }
                class17.method116(-39, 10L);
                class274.method1780((Object) null, -71, this.field508);
            }
        } catch (Exception var9) {
            class121.method780(160, (String) null, var9);
        } finally {
            Object var6 = null;
            this.field517 = false;
        }
        field509++;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    public static final void method235(int arg0) {
        field506++;
        if (arg0 != 2) {
            method235(-97);
        }
        class182.field2764.method944(101);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    public static final void method236(int arg0, int arg1) {
        class109.field1554 = -1;
        class14.field227 = arg0;
        if (arg1 != 1542) {
            method232((byte) 64, -54, -19);
        }
        field518++;
        field520 = 100;
        class307.field4931 = 3;
    }
}
