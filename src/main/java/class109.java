import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 extends class99 {

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "Laf;")
    public static class7 field2657 = class48.method406(40, "l");

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "[I")
    public static int[] field2659 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "Laf;")
    private static class7 field2649 = class48.method406(40, "Unexpected server response");

    @OriginalMember(owner = "client!pe", name = "hb", descriptor = "Laf;")
    public static class7 field2665 = field2649;

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "Laf;")
    public static class7 field2656 = class48.method406(40, "Sprites geladen)3");

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "I")
    public static int field2661 = 1;

    @OriginalMember(owner = "client!pe", name = "fb", descriptor = "B")
    public byte field2663;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!pe", name = "ib", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "Lr;")
    public class118 field2654;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "Lad;")
    public static class5 field2651;

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "[Lqc;")
    public static class114[] field2660;

    @OriginalMember(owner = "client!pe", name = "gb", descriptor = "[Lfd;")
    public static class40[] field2664;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)V")
    public static final void method865(byte arg0) {
        if (arg0 != -47) {
            return;
        }
        field2653++;
        Object var1 = class145.field3415;
        synchronized (class145.field3415) {
            if (class53.field1309 != 0) {
                class53.field1309 = 1;
                try {
                    class145.field3415.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lof;II)I")
    public static final int method866(class103 arg0, int arg1, int arg2) {
        field2655++;
        if (arg0.field2466 == null || arg1 >= arg0.field2466.length) {
            return -2;
        }
        try {
            if (arg2 > -64) {
                method868(20, -46);
            }
            int[] var3 = arg0.field2466[arg1];
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var6;
                }
                if (var7 == 1) {
                    var9 = class45.field1065[var3[var4++]];
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 2) {
                    var9 = class101.field2396[var3[var4++]];
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 3) {
                    var9 = class137.field3275[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class103 var12 = class37.method328(0, var11);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class64.method526(false, var13).field3191 || class94.field2188)) {
                        for (int var14 = 0; var14 < var12.field2438.length; var14++) {
                            if (var13 + 1 == var12.field2438[var14]) {
                                var9 += var12.field2435[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class43.field1026[var3[var4++]];
                }
                if (var7 == 6) {
                    var9 = class57.field1354[class101.field2396[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class43.field1026[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class21.field531.field2135;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class74.field1719[var15]) {
                            var9 += class101.field2396[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class103 var18 = class37.method328(0, var17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class64.method526(false, var19).field3191 || class94.field2188)) {
                        for (int var20 = 0; var20 < var18.field2438.length; var20++) {
                            if (var19 + 1 == var18.field2438[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class96.field2280;
                }
                if (var7 == 12) {
                    var9 = class155.field3607;
                }
                if (var7 == 13) {
                    int var21 = class43.field1026[var3[var4++]];
                    int var22 = var3[var4++];
                    var9 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var9 = method870((byte) 57, var23);
                }
                if (var7 == 18) {
                    var9 = (class21.field531.field505 >> 7) + class153.field3585;
                }
                if (var7 == 19) {
                    var9 = (class21.field531.field491 >> 7) + class32.field843;
                }
                if (var7 == 20) {
                    var9 = var3[var4++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var6 += var9;
                    }
                    if (var5 == 1) {
                        var6 -= var9;
                    }
                    if (var5 == 2 && var9 != 0) {
                        var6 /= var9;
                    }
                    if (var5 == 3) {
                        var6 *= var9;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(B)Lud;")
    public static final class142 method867(byte arg0) {
        int var1 = 57 % ((arg0 - 60) / 50);
        field2666++;
        try {
            return (class142) Class.forName("me").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)I")
    public static final int method868(int arg0, int arg1) {
        field2662++;
        int var2 = (arg1 & arg0) + (arg0 >>> 1 & 0xD5555555);
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "(B)V")
    public static void method869(byte arg0) {
        field2660 = null;
        field2665 = null;
        field2657 = null;
        field2659 = null;
        int var1 = -109 % ((-arg0 - 68) / 45);
        field2664 = null;
        field2656 = null;
        field2651 = null;
        field2649 = null;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(BI)I")
    public static final int method870(byte arg0, int arg1) {
        int var2 = 111 % ((arg0 - 1) / 53);
        class102 var3 = class14.method137(true, arg1);
        field2650++;
        int var4 = var3.field2417;
        int var5 = var3.field2408;
        int var6 = var3.field2407;
        int var7 = class95.field2211[var6 - var5];
        return var7 & class43.field1026[var4] >> var5;
    }
}
