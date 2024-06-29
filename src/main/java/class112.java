import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class112 extends class81 {

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "Lsg;")
    public static class30 field2226 = class167.method1221((byte) 33, ")4a=");

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "Lsg;")
    public static class30 field2238 = class167.method1221((byte) 33, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "Lsg;")
    public class30 field2231;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "Lda;")
    public static class98 field2223;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "[I")
    public int[] field2224;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "[I")
    public int[] field2230;

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "[I")
    public int[] field2233;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "[I")
    public int[] field2234;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLdl;Z)V")
    public static final void method875(byte arg0, class31 arg1, boolean arg2) {
        field2227++;
        int var3 = arg1.field704 == 0 ? arg1.field728 : arg1.field704;
        if (arg0 != 106) {
            field2226 = null;
        }
        int var4 = arg1.field743 == 0 ? arg1.field670 : arg1.field743;
        class44.method447(arg1.field638, var3, var4, arg2, false, class259.field4572[arg1.field638 >> 16]);
        if (arg1.field732 != null) {
            class44.method447(arg1.field638, var3, var4, arg2, false, arg1.field732);
        }
        class180 var5 = (class180) class143.field2762.method1168(-3, (long) arg1.field638);
        if (var5 != null) {
            class76.method682(var4, var3, (byte) -7, arg2, var5.field3335);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Laa;II)V")
    private final void method876(class8 arg0, int arg1, int arg2) {
        field2236++;
        int var4 = 38 % ((arg2 - 21) / 36);
        if (arg1 == 1) {
            this.field2231 = arg0.method84(0);
        } else if (arg1 == 2) {
            int var5 = arg0.method63((byte) 50);
            this.field2230 = new int[var5];
            this.field2224 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2224[var6] = arg0.method65((byte) 114);
                int var7 = arg0.method63((byte) 62);
                if (var7 == 0) {
                    this.field2230[var6] = -1;
                } else {
                    this.field2230[var6] = var7;
                }
            }
        } else if (arg1 == 3) {
            int var8 = arg0.method63((byte) 104);
            this.field2233 = new int[var8];
            this.field2234 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2234[var9] = arg0.method65((byte) 126);
                int var10 = arg0.method63((byte) 96);
                if (var10 == 0) {
                    this.field2233[var9] = -1;
                } else {
                    this.field2233[var9] = var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)V")
    public static void method877(int arg0) {
        field2226 = null;
        if (arg0 != 11775) {
            method877(0);
        }
        field2223 = null;
        field2238 = null;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(II)I")
    public final int method878(int arg0, int arg1) {
        field2235++;
        if (this.field2234 == null) {
            return -1;
        }
        if (arg0 != 0) {
            method883(-32, 42, 38, (short[]) null, (class30[]) null);
        }
        for (int var3 = 0; var3 < this.field2234.length; var3++) {
            if (this.field2233[var3] == arg1) {
                return this.field2234[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "(I)Lth;")
    public static final class68 method879(int arg0) {
        field2239++;
        class68 var1 = (class68) class227.field4054.method542(18844);
        if (var1 != null) {
            var1.method1681(false);
            var1.method701(true);
            return var1;
        }
        if (arg0 >= -26) {
            method877(-42);
        }
        class68 var2;
        do {
            var2 = (class68) class46.field1062.method542(18844);
            if (var2 == null) {
                return null;
            }
            if (var2.method614((byte) -65) > class111.method874(30351)) {
                return null;
            }
            var2.method1681(false);
            var2.method701(true);
        } while ((Long.MIN_VALUE & var2.field1743) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Laa;I)V")
    public final void method880(class8 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method63((byte) 116);
            if (var3 == 0) {
                if (arg1 != -1) {
                    return;
                }
                field2232++;
                return;
            }
            this.method876(arg0, var3, arg1 - 85);
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(Z)V")
    public final void method881(boolean arg0) {
        field2237++;
        if (arg0) {
            return;
        }
        if (this.field2234 != null) {
            for (int var2 = 0; var2 < this.field2234.length; var2++) {
                this.field2234[var2] = class182.method1314(this.field2234[var2], 32768);
            }
        }
        if (this.field2224 != null) {
            for (int var3 = 0; var3 < this.field2224.length; var3++) {
                this.field2224[var3] = class182.method1314(this.field2224[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(II)I")
    public final int method882(int arg0, int arg1) {
        field2228++;
        if (this.field2224 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field2224.length; var3++) {
            if (this.field2230[var3] == arg0) {
                return this.field2224[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III[S[Lsg;)V")
    public static final void method883(int arg0, int arg1, int arg2, short[] arg3, class30[] arg4) {
        field2229++;
        if (arg2 != 2) {
            field2223 = null;
        }
        if (arg0 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg0) / 2;
        class30 var6 = arg4[var5];
        int var7 = arg1;
        arg4[var5] = arg4[arg0];
        arg4[arg0] = var6;
        short var8 = arg3[var5];
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var8;
        for (int var9 = arg1; var9 < arg0; var9++) {
            if (var6 == null || arg4[var9] != null && arg4[var9].method280((byte) 1, var6) < (var9 & 0x1)) {
                class30 var10 = arg4[var9];
                arg4[var9] = arg4[var7];
                arg4[var7] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var7];
                arg3[var7++] = var11;
            }
        }
        arg4[arg0] = arg4[var7];
        arg4[var7] = var6;
        arg3[arg0] = arg3[var7];
        arg3[var7] = var8;
        method883(var7 - 1, arg1, 2, arg3, arg4);
        method883(arg0, var7 + 1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(II)V")
    public static final void method884(int arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        field2225++;
        class277.field4830.method1642(arg0, 80);
        class121.field2376.method1642(arg0, 87);
        class270.field4758.method1642(arg0, arg1 ^ 0x4A);
        class102.field2071.method1642(arg0, 90);
    }
}
