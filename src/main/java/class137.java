import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class137 {

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public int field2436 = -1;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    private int field2430 = 0;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public int field2426 = 128;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Z")
    public boolean field2431 = true;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "S")
    public static short field2427 = 1;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field2438 = 0;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public int field2434;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public int field2446;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "[I")
    public static int[] field2442;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "[Lqd;")
    public static class40[] field2437;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method976(int arg0, byte arg1) {
        class245.field4262 = 1000 / arg0;
        if (arg1 < 2) {
            method976(87, (byte) -110);
        }
        field2429++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)Z", line = 21)
    public static final boolean method977(byte arg0, int arg1) {
        field2428++;
        if (arg0 > -23) {
            return true;
        } else {
            return (arg1 >> 31 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V", line = 32)
    private final void method978(int arg0, int arg1) {
        field2444++;
        double var3 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var7 = var5;
        if (var3 < var5) {
            var7 = var3;
        }
        double var9 = (double) (arg0 & 0xFF) / 256.0D;
        if (var9 < var7) {
            var7 = var9;
        }
        double var11 = 0.0D;
        double var13 = 0.0D;
        double var15 = var5;
        if (var5 < var3) {
            var15 = var3;
        }
        if (var15 < var9) {
            var15 = var9;
        }
        double var17 = (var7 + var15) / 2.0D;
        this.field2443 = (int) (var17 * 256.0D);
        if (this.field2443 < 0) {
            this.field2443 = 0;
        } else if (this.field2443 > 255) {
            this.field2443 = 255;
        }
        if (var7 != var15) {
            if (var5 == var15) {
                var13 = (var3 - var9) / (var15 - var7);
            } else if (var3 == var15) {
                var13 = (var9 - var5) / (var15 - var7) + 2.0D;
            } else if (var9 == var15) {
                var13 = (var5 - var3) / (var15 - var7) + 4.0D;
            }
            if (var17 < 0.5D) {
                var11 = (var15 - var7) / (var7 + var15);
            }
            if (var17 >= 0.5D) {
                var11 = (var15 - var7) / (2.0D - var15 - var7);
            }
        }
        this.field2434 = (int) (var11 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field2434 < 0) {
            this.field2434 = 0;
        } else if (this.field2434 > 255) {
            this.field2434 = 255;
        }
        int var21 = -93 % ((arg1 + 6) / 53);
        if ((var17 > 0.5D)) {
            this.field2446 = (int) ((1.0D - var17) * var11 * 512.0D);
        } else {
            this.field2446 = (int) (var11 * var17 * 512.0D);
        }
        if (this.field2446 < 1) {
            this.field2446 = 1;
        }
        this.field2441 = (int) ((double) this.field2446 * var19);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILkh;I)V", line = 134)
    public final void method979(int arg0, class13 arg1, int arg2) {
        field2432++;
        if (arg2 < 62) {
            return;
        }
        while (true) {
            int var4 = arg1.method152((byte) -96);
            if (var4 == 0) {
                return;
            }
            this.method982(arg0, arg1, var4, (byte) 41);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 158)
    public static final void method980(int arg0) {
        field2433++;
        if (!class42.field690) {
            return;
        }
        class60 var1 = class25.method229(class223.field3809, (byte) 124, class185.field3168);
        if (var1 != null && var1.field1135 != null) {
            class11 var2 = new class11();
            var2.field212 = var1;
            var2.field229 = var1.field1135;
            class218.method1562((byte) 75, var2);
        }
        class42.field690 = false;
        class190.method1342(var1, arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIBLqm;ZI)V", line = 185)
    public static final void method981(int arg0, int arg1, byte arg2, class222 arg3, boolean arg4, int arg5) {
        class122.field2197 = arg1;
        class66.field1314 = arg0;
        class93.field1735 = arg5;
        field2445++;
        class124.field2242 = arg3;
        class121.field2185 = arg4;
        if (arg2 <= 20) {
            field2437 = (class40[]) null;
        }
        class238.field4072 = 1;
        class17.field332 = 10000;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILkh;IB)V", line = 205)
    private final void method982(int arg0, class13 arg1, int arg2, byte arg3) {
        if (arg2 == 1) {
            this.field2430 = arg1.method111(arg3 ^ 0x4B5290A1);
            this.method978(this.field2430, 121);
        } else if (arg2 == 2) {
            this.field2436 = arg1.method112((byte) 92);
            if (this.field2436 == 65535) {
                this.field2436 = -1;
            }
        } else if (arg2 == 3) {
            this.field2426 = arg1.method112((byte) 92);
        } else if (arg2 == 4) {
            this.field2431 = false;
        }
        if (arg3 == 41) {
            field2439++;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)Lvd;", line = 251)
    public static final class127 method983(byte arg0) {
        field2435++;
        if (arg0 != -48) {
            field2437 = (class40[]) null;
        }
        int var1 = class310.field5263[0] * class223.field3811[0];
        byte[] var2 = class58.field969[0];
        class127 var5;
        if (class119.field2162[0]) {
            byte[] var6 = class194.field3304[0];
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class11.method91(class224.method1614(var6[var8], 255) << 24, class236.field3985[class224.method1614(var2[var8], 255)]);
            }
            var5 = new class208(class24.field400, class46.field755, class234.field3959[0], class251.field4365[0], class223.field3811[0], class310.field5263[0], var7);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class236.field3985[class224.method1614(var2[var4], 255)];
            }
            var5 = new class127(class24.field400, class46.field755, class234.field3959[0], class251.field4365[0], class223.field3811[0], class310.field5263[0], var3);
        }
        class251.method1803(arg0 ^ 0x2F);
        return var5;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V", line = 303)
    public static void method984(byte arg0) {
        field2442 = null;
        field2437 = null;
        if (arg0 > -94) {
            method983((byte) 52);
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)V", line = 319)
    public static final void method985(byte arg0) {
        boolean var1 = false;
        field2447++;
        if (arg0 >= -100) {
            method976(113, (byte) -49);
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class220.field3736 - 1); var2++) {
                if (class289.field4934[var2] < 1000 && class289.field4934[var2 + 1] > 1000) {
                    var1 = false;
                    class64 var3 = class69.field1334[var2];
                    class69.field1334[var2] = class69.field1334[var2 + 1];
                    class69.field1334[var2 + 1] = var3;
                    class64 var4 = class153.field2715[var2];
                    class153.field2715[var2] = class153.field2715[var2 + 1];
                    class153.field2715[var2 + 1] = var4;
                    int var5 = class223.field3806[var2];
                    class223.field3806[var2] = class223.field3806[var2 + 1];
                    class223.field3806[var2 + 1] = var5;
                    int var6 = class235.field3964[var2];
                    class235.field3964[var2] = class235.field3964[var2 + 1];
                    class235.field3964[var2 + 1] = var6;
                    short var7 = class289.field4934[var2];
                    class289.field4934[var2] = class289.field4934[var2 + 1];
                    class289.field4934[var2 + 1] = var7;
                    long var8 = class64.field1237[var2];
                    class64.field1237[var2] = class64.field1237[var2 + 1];
                    class64.field1237[var2 + 1] = var8;
                }
            }
        }
    }
}
