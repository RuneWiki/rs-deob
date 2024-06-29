import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class170 extends class138 {

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public static int field2683 = 0;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "[I")
    public static int[] field2688 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!w", name = "N", descriptor = "Lck;")
    public static class119 field2692 = class298.method1987((byte) 78, "Null");

    @OriginalMember(owner = "client!w", name = "S", descriptor = "[[Z")
    public static boolean[][] field2696 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!w", name = "U", descriptor = "I")
    public static int field2698 = -1;

    @OriginalMember(owner = "client!w", name = "V", descriptor = "Lck;")
    public static class119 field2699 = class298.method1987((byte) 113, "null");

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!w", name = "W", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "Lck;")
    public class119 field2684;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "[I")
    public int[] field2682;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "[I")
    public int[] field2689;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "[I")
    public int[] field2690;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "[I")
    public int[] field2693;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)Z", line = 12)
    public static final boolean method1071(boolean arg0, int arg1) {
        field2687++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else if (arg0) {
            return arg1 >= 48 && arg1 <= 57;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIZJ)Z", line = 35)
    public static final boolean method1072(int arg0, int arg1, boolean arg2, long arg3) {
        field2685++;
        if (!arg2) {
            return true;
        }
        int var5 = ((int) arg3 & 0x3F5EA6) >> 20;
        int var6 = (int) arg3 >> 14 & 0x1F;
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class291 var8 = class291.method1939(0, var7);
            int var9;
            int var10;
            if (var5 == 0 || var5 == 2) {
                var9 = var8.field4812;
                var10 = var8.field4785;
            } else {
                var9 = var8.field4785;
                var10 = var8.field4812;
            }
            int var11 = var8.field4795;
            if (var5 != 0) {
                var11 = (var11 >> 4 - var5) + (var11 << var5 & 0xF);
            }
            class173.method1104(arg0, true, 0, var9, 2, 0, class124.field1917.field4973[0], arg1, var10, (byte) 9, class124.field1917.field4963[0], var11);
        } else {
            class173.method1104(arg0, true, var6 + 1, 0, 2, var5, class124.field1917.field4973[0], arg1, 0, (byte) 9, class124.field1917.field4963[0], 0);
        }
        class10.field191 = class210.field3346;
        class10.field179 = 0;
        class295.field4907 = class245.field3975;
        class268.field4419 = 2;
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IBLfj;)V", line = 101)
    private final void method1073(int arg0, byte arg1, class3 arg2) {
        if (arg1 > -113) {
            this.field2689 = (int[]) null;
        }
        if (arg0 == 1) {
            this.field2684 = arg2.method41((byte) -126);
        } else if (arg0 == 2) {
            int var4 = arg2.method64((byte) -80);
            this.field2693 = new int[var4];
            this.field2682 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2693[var5] = arg2.method63((byte) 1);
                int var6 = arg2.method64((byte) -85);
                if (var6 == 0) {
                    this.field2682[var5] = -1;
                } else {
                    this.field2682[var5] = var6;
                }
            }
        } else if (arg0 == 3) {
            int var7 = arg2.method64((byte) -102);
            this.field2689 = new int[var7];
            this.field2690 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2689[var8] = arg2.method63((byte) 1);
                int var9 = arg2.method64((byte) -120);
                if (var9 == 0) {
                    this.field2690[var8] = -1;
                } else {
                    this.field2690[var8] = var9;
                }
            }
        } else if (arg0 == 4) {
        }
        field2697++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Lck;I)Lck;", line = 172)
    public static final class119 method1074(class119[] arg0, int arg1) {
        field2700++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        if (arg1 > -67) {
            method1077((byte) -60);
        }
        return class226.method1439(arg0.length, 0, arg0, (byte) 127);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I", line = 191)
    public final int method1075(int arg0, int arg1) {
        field2694++;
        if (this.field2689 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2689.length; var3++) {
            if (this.field2690[var3] == arg0) {
                return this.field2689[var3];
            }
        }
        if (arg1 <= 6) {
            this.field2682 = (int[]) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLfj;)V", line = 214)
    public final void method1076(byte arg0, class3 arg1) {
        field2686++;
        if (arg0 <= 51) {
            method1071(true, 22);
        }
        while (true) {
            int var3 = arg1.method64((byte) 74);
            if (var3 == 0) {
                return;
            }
            this.method1073(var3, (byte) -121, arg1);
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V", line = 238)
    public static void method1077(byte arg0) {
        field2696 = (boolean[][]) null;
        field2688 = null;
        if (arg0 > -83) {
            field2696 = (boolean[][]) ((boolean[][]) null);
        }
        field2699 = null;
        field2692 = null;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V", line = 257)
    public final void method1078(int arg0) {
        field2691++;
        if (this.field2689 != null) {
            for (int var2 = 0; var2 < this.field2689.length; var2++) {
                this.field2689[var2] = class156.method998(this.field2689[var2], 32768);
            }
        }
        if (this.field2693 != null) {
            for (int var3 = 0; var3 < this.field2693.length; var3++) {
                this.field2693[var3] = class156.method998(this.field2693[var3], 32768);
            }
        }
        int var4 = 118 / ((arg0 - 71) / 35);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I", line = 288)
    public final int method1079(int arg0, int arg1) {
        field2695++;
        if (this.field2693 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2693.length; var3++) {
            if (this.field2682[var3] == arg0) {
                return this.field2693[var3];
            }
        }
        if (arg1 == -16865) {
            return -1;
        } else {
            return -40;
        }
    }
}
