import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class120 {

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    private int field2156 = 32;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "J")
    private long field2151 = class121.method888((byte) -119);

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "Z")
    private boolean field2167 = true;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    private int field2170 = 0;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "[Luh;")
    private class186[] field2171 = new class186[8];

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    private int field2168 = 0;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "J")
    private long field2177 = 0L;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "J")
    private long field2175 = 0L;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "[Luh;")
    private class186[] field2176 = new class186[8];

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    private int field2179 = 0;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
    private int field2178 = 0;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Z")
    public static boolean field2153 = false;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field2149 = 0;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public static int field2165 = 0;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    public int field2169;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
    private int field2173;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Lcb;")
    public static class120 field2160;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Luh;")
    private class186 field2147;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "[I")
    public int[] field2150;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "[[B")
    public static byte[][] field2152;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()I")
    public int method41() throws Exception {
        field2154++;
        return this.field2169;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()V")
    public void method39() throws Exception {
        field2159++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)I")
    public static final int method876(int arg0, byte arg1) {
        field2162++;
        if (!(arg0 < 97 || arg0 > 122) || !(arg0 < 224 || arg0 > 254 || arg0 == 247)) {
            return arg0 - 32;
        }
        if (arg1 <= 107) {
            field2165 = 46;
        }
        if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(IB)V")
    public static final void method877(int arg0, byte arg1) {
        field2164++;
        if (arg1 < 83) {
            return;
        }
        if (arg0 == -1 && !class243.field4243) {
            class165.method1141((byte) 24);
        } else if (arg0 != -1 && (class5.field69 != arg0 || !class110.method815(109)) && class90.field1531 != 0 && !class243.field4243) {
            class108.method805(false, class164.field2859, 1, class90.field1531, 2, arg0, 0);
        }
        class5.field69 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public final synchronized void method878(int arg0) {
        field2144++;
        if (this.field2150 == null) {
            return;
        }
        long var2 = class121.method888((byte) -119);
        try {
            if (this.field2177 != 0L) {
                if (var2 < this.field2177) {
                    return;
                }
                this.method36(this.field2169);
                this.field2167 = true;
                this.field2177 = 0L;
            }
            int var4 = this.method41();
            if (arg0 != 24820) {
                return;
            }
            if ((this.field2178 - var4) > this.field2179) {
                this.field2179 = this.field2178 - var4;
            }
            int var5 = this.field2172 + this.field2173;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field2169 < (var5 + 256)) {
                this.field2169 += 1024;
                var4 = 0;
                if (this.field2169 > 16384) {
                    this.field2169 = 16384;
                }
                this.method37();
                this.method36(this.field2169);
                if (this.field2169 < (var5 + 256)) {
                    var5 = this.field2169 - 256;
                    this.field2173 = var5 - this.field2172;
                }
                this.field2167 = true;
            }
            while (var5 > var4) {
                var4 += 256;
                this.method881(this.field2150, 256);
                this.method39();
            }
            if (this.field2175 < var2) {
                if (this.field2167) {
                    this.field2167 = false;
                } else if (this.field2179 == 0 && this.field2170 == 0) {
                    this.method37();
                    this.field2177 = var2 + 2000L;
                    return;
                } else {
                    this.field2173 = Math.min(this.field2170, this.field2179);
                    this.field2170 = this.field2179;
                }
                this.field2175 = var2 + 2000L;
                this.field2179 = 0;
            }
            this.field2178 = var4;
        } catch (Exception var7) {
            this.method37();
            this.field2177 = var2 + 2000L;
        }
        try {
            if (var2 > this.field2151 + 500000L) {
                var2 = this.field2151;
            }
            while (this.field2151 + 5000L < var2) {
                this.method884(false, 256);
                this.field2151 += (long) (256000 / class84.field1375);
            }
        } catch (Exception var6) {
            this.field2151 = var2;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBLuh;)V")
    private final void method879(int arg0, byte arg1, class186 arg2) {
        field2145++;
        int var4 = arg0 >> 5;
        class186 var5 = this.field2176[var4];
        if (var5 == null) {
            this.field2171[var4] = arg2;
        } else {
            var5.field3180 = arg2;
        }
        this.field2176[var4] = arg2;
        if (arg1 > -10) {
            this.method883((class186) null, (byte) -8);
        }
        arg2.field3179 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public final void method880(int arg0) {
        field2163++;
        this.field2167 = true;
        if (arg0 <= 16) {
            this.field2176 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([II)V")
    private final void method881(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class110.field1946) {
            var3 = arg1 << 1;
        }
        class154.method1088(arg0, 0, var3);
        this.field2168 -= arg1;
        if (this.field2147 != null && this.field2168 <= 0) {
            this.field2168 += class84.field1375 >> 4;
            class91.method656(23893, this.field2147);
            this.method879(this.field2147.method430(), (byte) -84, this.field2147);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class186 var10 = null;
                        class186 var11 = this.field2171[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class68 var12 = var11.field3178;
                                if (var12 == null || var12.field1107 <= var8) {
                                    var11.field3177 = true;
                                    int var13 = var11.method395();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1107 += var13;
                                    }
                                    if (var4 >= this.field2156) {
                                        break label107;
                                    }
                                    class186 var14 = var11.method414();
                                    if (var14 != null) {
                                        int var15 = var11.field3179;
                                        while (var14 != null) {
                                            this.method879(var15 * var14.method430() >> 8, (byte) -119, var14);
                                            var14 = var11.method408();
                                        }
                                    }
                                    class186 var16 = var11.field3180;
                                    var11.field3180 = null;
                                    if (var10 == null) {
                                        this.field2171[var7] = var16;
                                    } else {
                                        var10.field3180 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2176[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3180;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class186 var18 = this.field2171[var17];
                this.field2171[var17] = this.field2176[var17] = null;
                while (var18 != null) {
                    class186 var19 = var18.field3180;
                    var18.field3180 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2168 < 0) {
            this.field2168 = 0;
        }
        if (this.field2147 != null) {
            this.field2147.method425(arg0, 0, arg1);
        }
        this.field2151 = class121.method888((byte) -119);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    public final synchronized void method882(int arg0) {
        this.field2167 = true;
        try {
            this.method40();
            int var2 = -95 / ((arg0 - 16) / 61);
        } catch (Exception var3) {
            this.method37();
            this.field2177 = class121.method888((byte) -119) + 2000L;
        }
        field2148++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Luh;B)V")
    public final synchronized void method883(class186 arg0, byte arg1) {
        if (arg1 != -104) {
            field2152 = null;
        }
        field2166++;
        this.field2147 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)V")
    private final void method884(boolean arg0, int arg1) {
        field2146++;
        if (arg0) {
            this.field2156 = -100;
        }
        this.field2168 -= arg1;
        if (this.field2168 < 0) {
            this.field2168 = 0;
        }
        if (this.field2147 != null) {
            this.field2147.method404(arg1);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static final void method885(byte arg0) {
        field2155++;
        class40.method231(class262.field4558, 0);
        class67.field1105++;
        if (class36.field594 && class169.field2936) {
            int var1 = class213.field3617;
            int var2 = class44.field746;
            int var3 = var1 - class31.field467;
            int var4 = var2 - class55.field932;
            if (var3 < class256.field4510) {
                var3 = class256.field4510;
            }
            if ((class256.field4510 + class200.field3421.field3980) < (class262.field4558.field3980 + var3)) {
                var3 = class256.field4510 + class200.field3421.field3980 - class262.field4558.field3980;
            }
            int var5 = var3 - class34.field558;
            if (class52.field859 > var4) {
                var4 = class52.field859;
            }
            int var6 = class262.field4558.field4003;
            int var7 = var3 + class200.field3421.field4016 - class256.field4510;
            if (class52.field859 + class200.field3421.field3885 < var4 - -class262.field4558.field3885) {
                var4 = class200.field3421.field3885 + class52.field859 - class262.field4558.field3885;
            }
            int var8 = var4 + class200.field3421.field3996 - class52.field859;
            int var9 = -13 / ((arg0 + 56) / 58);
            int var10 = var4 - class188.field3252;
            if (class67.field1105 > class262.field4558.field4004 && (var10 > var6 || (-var6) > var10 || var6 < var5 || var5 < (-var6))) {
                class152.field2668 = true;
            }
            if (class262.field4558.field3866 != null && class152.field2668) {
                class99 var11 = new class99();
                var11.field1678 = class262.field4558.field3866;
                var11.field1677 = class262.field4558;
                var11.field1663 = var7;
                var11.field1674 = var8;
                class177.method1192(var11, 200000);
            }
            if (class65.field1074 == 0) {
                if (class152.field2668) {
                    if (class262.field4558.field3906 != null) {
                        class99 var12 = new class99();
                        var12.field1674 = var8;
                        var12.field1677 = class262.field4558;
                        var12.field1671 = class250.field4427;
                        var12.field1663 = var7;
                        var12.field1678 = class262.field4558.field3906;
                        class177.method1192(var12, 200000);
                    }
                    if (class250.field4427 != null && client.method626(class262.field4558) != null) {
                        class72.field1173++;
                        class149.field2597.method526((byte) -119, 194);
                        class149.field2597.method613((byte) -105, class250.field4427.field3879);
                        class149.field2597.method606(2102840648, class250.field4427.field3943);
                        class149.field2597.method606(2102840648, class262.field4558.field3943);
                        class149.field2597.method613((byte) -29, class262.field4558.field3879);
                    }
                } else if ((class3.field31 == 1 || class80.method520(class52.field863 - 1, false)) && class52.field863 > 2) {
                    class113.method830((byte) 126);
                } else if (class52.field863 > 0) {
                    class63.method434(0);
                }
                class262.field4558 = null;
            }
        } else if (class67.field1105 > 1) {
            class262.field4558 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()V")
    public void method40() throws Exception {
        field2161++;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
    public void method36(int arg0) throws Exception {
        field2158++;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
    public final synchronized void method886(int arg0) {
        field2143++;
        if (class112.field1974 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class112.field1974.field1884[var3] == this) {
                    class112.field1974.field1884[var3] = null;
                }
                if (class112.field1974.field1884[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class112.field1974.field1875 = true;
                while (class112.field1974.field1877) {
                    class250.method1640(50L, 127);
                }
                class112.field1974 = null;
            }
        }
        this.method37();
        if (arg0 == -29988) {
            this.field2150 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method38(Component arg0) throws Exception {
        field2174++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public static void method887(boolean arg0) {
        if (arg0) {
            method876(-19, (byte) 66);
        }
        field2152 = null;
        field2160 = null;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "()V")
    public void method37() {
        field2157++;
    }
}
