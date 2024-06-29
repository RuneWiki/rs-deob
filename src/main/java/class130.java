import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class130 extends class81 {

    @OriginalMember(owner = "client!e", name = "M", descriptor = "Ldl;")
    public static class31 field2558 = null;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "[I")
    public static int[] field2569 = new int[200];

    @OriginalMember(owner = "client!e", name = "V", descriptor = "Lsg;")
    public static class30 field2566 = class167.method1221((byte) 33, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "Ld;")
    public static class117 field2562 = new class117();

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "Lmc;")
    public static class151 field2567;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "[I")
    private int[] field2563;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "[I")
    public int[] field2571;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "[Lsg;")
    private class30[] field2573;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "[[I")
    private int[][] field2555;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Laa;II)V")
    private final void method986(class8 arg0, int arg1, int arg2) {
        field2568++;
        if (arg2 != 20095) {
            return;
        }
        if (arg1 == 1) {
            this.field2573 = arg0.method84(0).method250(60, 0);
        } else if (arg1 == 2) {
            int var4 = arg0.method63((byte) 72);
            this.field2571 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2571[var5] = arg0.method65((byte) 120);
            }
            return;
        } else if (arg1 == 3) {
            int var6 = arg0.method63((byte) 68);
            this.field2563 = new int[var6];
            this.field2555 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method65((byte) 116);
                this.field2563[var7] = var8;
                this.field2555[var7] = new int[class196.field3557[var8]];
                for (int var9 = 0; var9 < class196.field3557[var8]; var9++) {
                    this.field2555[var7][var9] = arg0.method65((byte) 123);
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Laa;[II)V")
    public final void method987(class8 arg0, int[] arg1, int arg2) {
        if (arg2 != -1) {
            this.method989((byte) 24);
        }
        field2560++;
        if (this.field2563 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field2563.length; var4++) {
            if (var4 >= arg1.length) {
                return;
            }
            int var5 = class127.field2472[this.method990(var4, arg2 + 129)];
            if (var5 > 0) {
                arg0.method59(var5, arg2, (long) arg1[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)V")
    public static void method988(int arg0) {
        field2558 = null;
        field2562 = null;
        field2566 = null;
        field2569 = null;
        if (arg0 != 437) {
            field2569 = null;
        }
        field2567 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public final void method989(byte arg0) {
        if (arg0 > -22) {
            field2574 = 13;
        }
        if (this.field2571 != null) {
            for (int var2 = 0; var2 < this.field2571.length; var2++) {
                this.field2571[var2] = class182.method1314(this.field2571[var2], 32768);
            }
        }
        field2564++;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(II)I")
    public final int method990(int arg0, int arg1) {
        if (arg1 == 128) {
            field2554++;
            return this.field2563 == null || arg0 < 0 || arg0 > this.field2563.length ? -1 : this.field2563[arg0];
        } else {
            return -8;
        }
    }

    @OriginalMember(owner = "client!e", name = "h", descriptor = "(I)Lsg;")
    public final class30 method991(int arg0) {
        field2557++;
        class30 var2 = class136.method1023(6534, 80);
        if (this.field2573 == null) {
            return class197.field3567;
        }
        var2.method293(-123, this.field2573[0]);
        int var3 = -57 % ((-arg0 - 43) / 41);
        for (int var4 = 1; var4 < this.field2573.length; var4++) {
            var2.method293(-107, class233.field4154);
            var2.method293(-112, this.field2573[var4]);
        }
        return var2.method263((byte) -116);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)Z")
    public static final boolean method992(int arg0, int arg1, int arg2, int arg3) {
        if (!class87.method731(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class242.field4333[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class254.field4478) {
                    if (!class138.method1045(var4, var6, var5)) {
                        return false;
                    }
                    if (!class138.method1045(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class138.method1045(var4, var7, var5)) {
                        return false;
                    }
                    if (!class138.method1045(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class138.method1045(var4, var8, var5)) {
                    return false;
                }
                if (!class138.method1045(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class108.field2177) {
                    if (!class138.method1045(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class138.method1045(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class138.method1045(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class138.method1045(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class138.method1045(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class138.method1045(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class254.field4478) {
                    if (!class138.method1045(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class138.method1045(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class138.method1045(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class138.method1045(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class138.method1045(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class138.method1045(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class108.field2177) {
                    if (!class138.method1045(var4, var6, var5)) {
                        return false;
                    }
                    if (!class138.method1045(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class138.method1045(var4, var7, var5)) {
                        return false;
                    }
                    if (!class138.method1045(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class138.method1045(var4, var8, var5)) {
                    return false;
                }
                if (!class138.method1045(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class138.method1045(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class138.method1045(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class138.method1045(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class138.method1045(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class138.method1045(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BII)I")
    public final int method993(byte arg0, int arg1, int arg2) {
        int var4 = 77 % ((arg0 - 71) / 33);
        field2556++;
        if (this.field2563 == null || arg1 < 0 || this.field2563.length < arg1) {
            return -1;
        } else if (this.field2555[arg1] == null || arg2 < 0 || this.field2555[arg1].length < arg2) {
            return -1;
        } else {
            return this.field2555[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILaa;)Lsg;")
    public final class30 method994(int arg0, class8 arg1) {
        field2559++;
        if (arg0 != 0) {
            return null;
        }
        class30 var3 = class136.method1023(6534, 80);
        if (this.field2563 != null) {
            for (int var4 = 0; var4 < this.field2563.length; var4++) {
                var3.method293(arg0 - 100, this.field2573[var4]);
                var3.method293(arg0 - 128, class176.method1290(this.field2555[var4], arg1.method53(arg0 ^ 0xFFFFFF83, class117.field2309[this.field2563[var4]]), -127, this.field2563[var4]));
            }
        }
        var3.method293(-96, this.field2573[this.field2573.length - 1]);
        return var3.method263((byte) -116);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)I")
    public final int method995(byte arg0) {
        if (arg0 <= 66) {
            this.method996((byte) 94, (class8) null);
        }
        field2572++;
        return this.field2563 == null ? 0 : this.field2563.length;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BLaa;)V")
    public final void method996(byte arg0, class8 arg1) {
        field2565++;
        while (true) {
            int var3 = arg1.method63((byte) 57);
            if (var3 == 0) {
                int var4 = 51 / ((5 - arg0) / 57);
                return;
            }
            this.method986(arg1, var3, 20095);
        }
    }
}
