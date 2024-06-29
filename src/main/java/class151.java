import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class151 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public int field2080 = 0;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public int field2087 = -1;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public int field2089 = -1;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public int field2083 = 0;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public int field2093 = 0;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public int field2101 = -1;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public int field2103 = -1;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public int field2091 = -1;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public int field2088 = -1;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public int field2104 = 0;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public int field2090 = -1;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public int field2086 = -1;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public int field2092 = 0;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public int field2097 = -1;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public int field2098 = -1;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public int field2079 = 0;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public int field2107 = 0;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    public int field2112 = -1;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public int field2099 = -1;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public int field2111 = -1;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public int field2117 = -1;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    public int field2109 = -1;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public int field2113 = -1;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public int field2119 = -1;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public int field2115 = -1;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public int field2114 = -1;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public int field2120 = 0;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    public int field2116 = 0;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public int field2094 = 0;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    public int field2106 = -1;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public int field2118 = -1;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    public int field2121 = -1;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field2081 = -1;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field2100 = 0;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "J")
    public static long field2110 = 0L;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Llc;")
    public static class86 field2082 = new class86(50);

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "[[I")
    public int[][] field2095;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILql;I)V")
    private final void method1011(int arg0, class224 arg1, int arg2) {
        field2084++;
        if (arg2 != 40) {
            return;
        }
        if (arg0 == 1) {
            this.field2106 = arg1.method1445(false);
            this.field2109 = arg1.method1445(false);
            if (this.field2109 == 65535) {
                this.field2109 = -1;
            }
            if (this.field2106 == 65535) {
                this.field2106 = -1;
                return;
            }
        } else if (arg0 == 2) {
            this.field2121 = arg1.method1445(false);
        } else if (arg0 == 3) {
            this.field2119 = arg1.method1445(false);
            return;
        } else if (arg0 == 4) {
            this.field2101 = arg1.method1445(false);
            return;
        } else if (arg0 == 5) {
            this.field2113 = arg1.method1445(false);
            return;
        } else if (arg0 == 6) {
            this.field2087 = arg1.method1445(false);
            return;
        } else if (arg0 == 7) {
            this.field2090 = arg1.method1445(false);
            return;
        } else if (arg0 == 8) {
            this.field2103 = arg1.method1445(false);
            return;
        } else if (arg0 == 9) {
            this.field2086 = arg1.method1445(false);
            return;
        } else if (arg0 == 26) {
            this.field2094 = (short) (arg1.method1453((byte) -128) * 4);
            this.field2092 = (short) (arg1.method1453((byte) -127) * 4);
            return;
        } else if (arg0 == 27) {
            if (this.field2095 == null) {
                this.field2095 = new int[12][];
            }
            int var4 = arg1.method1453((byte) -127);
            this.field2095[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field2095[var4][var5] = arg1.method1479(false);
            }
            return;
        } else if (arg0 == 29) {
            this.field2107 = arg1.method1453((byte) -127);
            return;
        } else if (arg0 == 30) {
            this.field2079 = arg1.method1445(false);
            return;
        } else if (arg0 == 31) {
            this.field2083 = arg1.method1453((byte) -127);
            return;
        } else if (arg0 == 32) {
            this.field2080 = arg1.method1445(false);
            return;
        } else if (arg0 == 33) {
            this.field2120 = arg1.method1479(false);
            return;
        } else if (arg0 == 34) {
            this.field2104 = arg1.method1453((byte) -128);
            return;
        } else if (arg0 == 35) {
            this.field2093 = arg1.method1445(false);
            return;
        } else if (arg0 == 36) {
            this.field2116 = arg1.method1479(false);
            return;
        } else if (arg0 == 37) {
            this.field2097 = arg1.method1453((byte) -128);
            return;
        } else if (arg0 == 38) {
            this.field2112 = arg1.method1445(false);
            return;
        } else if (arg0 == 39) {
            this.field2114 = arg1.method1445(false);
            return;
        } else if (arg0 == 40) {
            this.field2118 = arg1.method1445(false);
            return;
        } else if (arg0 == 41) {
            this.field2089 = arg1.method1445(false);
            return;
        } else if (arg0 == 42) {
            this.field2099 = arg1.method1445(false);
            return;
        } else if (arg0 == 43) {
            arg1.method1445(false);
            return;
        } else if (arg0 == 44) {
            arg1.method1445(false);
            return;
        } else if (arg0 == 45) {
            arg1.method1445(false);
            return;
        } else if (arg0 == 46) {
            this.field2111 = arg1.method1445(false);
            return;
        } else if (arg0 == 47) {
            this.field2088 = arg1.method1445(false);
            return;
        } else if (arg0 == 48) {
            this.field2117 = arg1.method1445(false);
            return;
        } else {
            if (arg0 == 49) {
                this.field2091 = arg1.method1445(false);
            } else if (arg0 == 50) {
                this.field2098 = arg1.method1445(false);
                return;
            } else if (arg0 == 51) {
                this.field2115 = arg1.method1445(false);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILhc;)V")
    public static final void method1012(int arg0, class235 arg1) {
        field2108++;
        class238.field3606 = class120.method797(arg1, (byte) -9, class163.field2271);
        class94.field1324 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) ((class240.field3668[var2] & 0xFF0000) >> 16);
            int var5 = class240.field3668[var2 + 1] >> 16 & 0xFF;
            float var6 = (float) ((class240.field3668[var2] & 0xFF00) >> 8);
            float var7 = ((float) var5 - var4) / 64.0F;
            int var8 = class240.field3668[var2 + 1] >> 8 & 0xFF;
            float var9 = ((float) var8 - var6) / 64.0F;
            float var10 = (float) (class240.field3668[var2] & 0xFF);
            int var11 = class240.field3668[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class94.field1324[var2 * 64 + var13] = class54.method339(class54.method339((int) var4 << 16, (int) var6 << 8), (int) var10);
                var6 += var9;
                var10 += var12;
                var4 += var7;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class94.field1324[var3] = class240.field3668[3];
        }
        if (arg0 <= 63) {
            method1013(false, 84);
        }
        class146.field2034 = new int[32768];
        class283.field4384 = new int[32768];
        class92.method597((class72) null, (byte) 122);
        class208.field2965 = new int[32768];
        class129.field1828 = new int[32768];
        class173.field2430 = new class128(128, 254);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)Lri;")
    public static final class67 method1013(boolean arg0, int arg1) {
        field2096++;
        class67 var2 = (class67) class41.field611.method540((byte) -121, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0) {
            byte[] var3 = class296.field4665.method1576(-47, 16, arg1);
            class67 var4 = new class67();
            if (var3 != null) {
                var4.method420(54, new class224(var3));
            }
            class41.field611.method543(var4, (long) arg1, 858993459);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
    public static void method1014(boolean arg0) {
        field2082 = null;
        if (!arg0) {
            field2110 = -103L;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILql;)V")
    public final void method1015(int arg0, class224 arg1) {
        field2085++;
        while (true) {
            int var3 = arg1.method1453((byte) -128);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    this.method1011(25, (class224) null, 40);
                    return;
                }
            }
            this.method1011(var3, arg1, 40);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V")
    public final void method1016(boolean arg0) {
        if (arg0) {
            field2102++;
        }
    }
}
