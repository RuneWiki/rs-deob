import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class19 extends class678 {

    @OriginalMember(owner = "client!bu", name = "A", descriptor = "[Lln;")
    public static class349[] field834 = new class349[35];

    @OriginalMember(owner = "client!bu", name = "s", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!bu", name = "t", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!bu", name = "u", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!bu", name = "v", descriptor = "I")
    public int field829;

    @OriginalMember(owner = "client!bu", name = "w", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!bu", name = "y", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "client!bu", name = "B", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!bu", name = "D", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!bu", name = "x", descriptor = "Ljava/lang/String;")
    public String field831;

    @OriginalMember(owner = "client!bu", name = "C", descriptor = "[I")
    public static int[] field836;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
    public final void method432(int arg0) {
        ++field826;
        super.field9628 |= Long.MIN_VALUE;
        if (arg0 <= 30) {
            this.field827 = -2;
        }
        if (~this.method436(-10989) == -1L) {
            class33.field963.method3023((byte) 115, this);
        }
    }

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "(I)V")
    public static void method433(int arg0) {
        if (arg0 == 35) {
            field836 = null;
            field834 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lpg;)V")
    public static final void method434(class682 arg0) {
        if (class6.field503 < 65535) {
            class9 var1 = arg0.field9658;
            class173.field2850[class6.field503] = arg0;
            class397.field5786[class6.field503] = false;
            ++class6.field503;
            int var2 = arg0.field9665;
            if (arg0.field9655) {
                var2 = 0;
            }
            int var3 = arg0.field9665;
            if (arg0.field9674) {
                var3 = class148.field2557 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method270(-65) - var1.method274((byte) 34) + class271.field4068 >> class30.field940;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method270(98) + var1.method274((byte) 34) - class271.field4068 >> class30.field940;
                if (var7 >= class107.field1852) {
                    var7 = class107.field1852 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field9663[var5++];
                    int var10 = (var1.method276(-1) - var1.method274((byte) 34) + class271.field4068 >> class30.field940) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class520.field7369) {
                        var11 = class520.field7369 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class335.field5016[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class335.field5016[var4][var12][var8] = var13 | (long) class6.field503;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class335.field5016[var4][var12][var8] = var13 | (long) class6.field503 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class335.field5016[var4][var12][var8] = var13 | (long) class6.field503 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class335.field5016[var4][var12][var8] = var13 | (long) class6.field503 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "(I)I")
    public final int method435(int arg0) {
        ++field837;
        if (arg0 != 0) {
            this.method432(26);
        }
        return (int) (super.field6132 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "(I)J")
    public final long method436(int arg0) {
        if (arg0 != -10989) {
            return 19L;
        } else {
            ++field832;
            return Long.MAX_VALUE & super.field9628;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZII)Z")
    public static final boolean method437(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field836 = null;
        }
        ++field828;
        return (2048 & arg2) != 0 | class398.method2449((byte) -33, arg1, arg2) || class357.method2289((byte) 21, arg1, arg2);
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(II)V")
    public class19(int arg0, int arg1) {
        super.field6132 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "(I)V")
    public final void method438(int arg0) {
        super.field9628 = 500L + class525.method3074((byte) -101) | super.field9628 & Long.MIN_VALUE;
        ++field830;
        if (arg0 != 806) {
            this.method435(-76);
        }
        class512.field7234.method3023((byte) 49, this);
    }

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "(I)I")
    public final int method439(int arg0) {
        ++field835;
        if (arg0 != 1121826720) {
            field834 = null;
        }
        return (int) super.field6132;
    }
}
