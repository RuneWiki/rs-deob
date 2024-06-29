import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class23 extends class105 {

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    private int field376 = 0;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Lbe;")
    private class235 field362 = new class235(16);

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    private int field391 = 0;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "Lli;")
    private class18 field390 = new class18();

    @OriginalMember(owner = "client!ae", name = "eb", descriptor = "J")
    private long field402 = 0L;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "Lh;")
    private class315 field382;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "Z")
    private boolean field387;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "Lli;")
    private class18 field388;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "Z")
    private boolean field395;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "Lem;")
    private class240 field365;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "Lch;")
    private class298 field368;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "Lh;")
    private class315 field384;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "Lwh;")
    private class127 field375;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "Lqb;")
    public static class209 field386 = new class209(5);

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "I")
    public static int field396 = 0;

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "Lbd;")
    private static class162 field399 = class17.method142(0, "Loaded wordpack");

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "[I")
    public static int[] field393 = new int[128];

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "[I")
    public static int[] field394 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "Lbd;")
    public static class162 field400 = class17.method142(0, "Loading world list data");

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "Lbd;")
    public static class162 field397 = class17.method142(0, ")1 ");

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "Lbd;")
    public static class162 field392 = field399;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "Lvj;")
    private class256 field364;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field370;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "Z")
    private boolean field389;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "[B")
    private byte[] field379;

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "[Llm;")
    public static class43[] field398;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V", line = 6)
    public final void method184(boolean arg0) {
        field381++;
        if (this.field382 == null) {
            return;
        }
        this.field389 = true;
        if (this.field388 == null) {
            this.field388 = new class18();
        }
        if (arg0) {
            field399 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lb;Lbd;I)I", line = 30)
    public static final int method185(class94 arg0, class162 arg1, int arg2) {
        field361++;
        int var3 = arg0.field1653;
        arg0.method713(255, arg1.field2865);
        arg0.field1653 += class94.field1702.method1514(arg0.field1681, 121, arg1.field2865, arg1.field2817, arg0.field1653, 0);
        if (arg2 > -81) {
            method193(-93);
        }
        return arg0.field1653 - var3;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)I", line = 47)
    public final int method186(byte arg0) {
        if (arg0 >= -98) {
            this.field385 = 81;
        }
        field371++;
        if (this.method188(-19) == null) {
            return this.field375 == null ? 0 : this.field375.method650(false);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V", line = 70)
    public final void method187(int arg0) {
        field360++;
        if (arg0 >= -55) {
            return;
        }
        if (this.field388 != null) {
            if (this.method188(102) == null) {
                return;
            }
            if (this.field387) {
                boolean var2 = true;
                for (class151 var3 = this.field388.method169(-119); var3 != null; var3 = this.field388.method165((byte) -101)) {
                    int var4 = (int) var3.field2701;
                    if (this.field379[var4] == 0) {
                        this.method189(1, var4, -118);
                    }
                    if (this.field379[var4] == 0) {
                        var2 = false;
                    } else {
                        var3.method1183(false);
                    }
                }
                while (this.field364.field4249.length > this.field391) {
                    if (this.field364.field4249[this.field391] == 0) {
                        this.field391++;
                    } else {
                        if (this.field368.field5001 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field379[this.field391] == 0) {
                            this.method189(1, this.field391, 63);
                        }
                        if (this.field379[this.field391] == 0) {
                            class151 var5 = new class151();
                            var5.field2701 = (long) this.field391;
                            this.field388.method167(false, var5);
                            var2 = false;
                        }
                        this.field391++;
                    }
                }
                if (var2) {
                    this.field387 = false;
                    this.field391 = 0;
                }
            } else if (this.field389) {
                boolean var6 = true;
                for (class151 var7 = this.field388.method169(-127); var7 != null; var7 = this.field388.method165((byte) -101)) {
                    int var8 = (int) var7.field2701;
                    if (this.field379[var8] != 1) {
                        this.method189(2, var8, 42);
                    }
                    if (this.field379[var8] == 1) {
                        var7.method1183(false);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field391 < this.field364.field4249.length) {
                    if (this.field364.field4249[this.field391] == 0) {
                        this.field391++;
                    } else {
                        if (this.field365.method1695(-21)) {
                            var6 = false;
                            break;
                        }
                        if (this.field379[this.field391] != 1) {
                            this.method189(2, this.field391, 34);
                        }
                        if (this.field379[this.field391] != 1) {
                            var6 = false;
                            class151 var9 = new class151();
                            var9.field2701 = (long) this.field391;
                            this.field388.method167(false, var9);
                        }
                        this.field391++;
                    }
                }
                if (var6) {
                    this.field389 = false;
                    this.field391 = 0;
                }
            } else {
                this.field388 = null;
            }
        }
        if (!this.field395 || this.field402 > class300.method2048((byte) 18)) {
            return;
        }
        for (class127 var10 = (class127) this.field362.method1666((byte) -93); var10 != null; var10 = (class127) this.field362.method1673((byte) -128)) {
            if (!var10.field2311) {
                if (var10.field2315) {
                    if (!var10.field2302) {
                        throw new RuntimeException();
                    }
                    var10.method1183(false);
                } else {
                    var10.field2315 = true;
                }
            }
        }
        this.field402 = class300.method2048((byte) 18) + 1000L;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)Lvj;", line = 257)
    public final class256 method188(int arg0) {
        field372++;
        if (this.field364 != null) {
            return this.field364;
        }
        int var2 = -111 / ((-arg0 - 53) / 34);
        if (this.field375 == null) {
            if (this.field365.method1701(118)) {
                return null;
            }
            this.field375 = this.field365.method1692(true, (byte) 0, 255, this.field367, (byte) 78);
        }
        if (this.field375.field2311) {
            return null;
        }
        byte[] var3 = this.field375.method652(false);
        if (this.field375 instanceof class84) {
            try {
                if (var3 == null) {
                    throw new RuntimeException();
                }
                this.field364 = new class256(var3, this.field385);
                if (this.field364.field4257 != this.field373) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var6) {
                this.field364 = null;
                if (this.field365.method1701(119)) {
                    this.field375 = null;
                } else {
                    this.field375 = this.field365.method1692(true, (byte) 0, 255, this.field367, (byte) 84);
                }
                return null;
            }
        } else {
            try {
                if (var3 == null) {
                    throw new RuntimeException();
                }
                this.field364 = new class256(var3, this.field385);
            } catch (RuntimeException var7) {
                this.field365.method1704((byte) 47);
                this.field364 = null;
                if (this.field365.method1701(124)) {
                    this.field375 = null;
                } else {
                    this.field375 = this.field365.method1692(true, (byte) 0, 255, this.field367, (byte) -68);
                }
                return null;
            }
            if (this.field384 != null) {
                this.field368.method2044(false, this.field367, this.field384, var3);
            }
        }
        this.field375 = null;
        if (this.field382 != null) {
            this.field379 = new byte[this.field364.field4238];
            this.field376 = 0;
        }
        return this.field364;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Lwh;", line = 360)
    private final class127 method189(int arg0, int arg1, int arg2) {
        field378++;
        class127 var4 = (class127) this.field362.method1672((long) arg1, 19760);
        if (var4 != null && arg0 == 0 && !var4.field2302 && var4.field2311) {
            var4.method1183(false);
            var4 = null;
        }
        int var5 = 96 / ((-arg2 - 41) / 60);
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field382 == null || this.field379[arg1] == -1) {
                    if (this.field365.method1701(127)) {
                        return null;
                    }
                    var4 = this.field365.method1692(true, (byte) 2, this.field367, arg1, (byte) -121);
                } else {
                    var4 = this.field368.method2045(2, this.field382, arg1);
                }
            } else if (arg0 == 1) {
                if (this.field382 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field368.method2046(arg1, 3, this.field382);
            } else if (arg0 == 2) {
                if (this.field382 == null) {
                    throw new RuntimeException();
                }
                if (this.field379[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field365.method1695(-21)) {
                    return null;
                }
                var4 = this.field365.method1692(false, (byte) 2, this.field367, arg1, (byte) 95);
            } else {
                throw new RuntimeException();
            }
            this.field362.method1674(var4, false, (long) arg1);
        }
        if (var4.field2311) {
            return null;
        }
        byte[] var6 = var4.method652(false);
        if (!var4 instanceof class84) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class25.field409.reset();
                class25.field409.update(var6, 0, var6.length - 2);
                int var7 = (int) class25.field409.getValue();
                if (this.field364.field4252[arg1] != var7) {
                    throw new RuntimeException();
                }
                this.field365.field4010 = 0;
                this.field365.field4011 = 0;
            } catch (RuntimeException var15) {
                this.field365.method1704((byte) 47);
                var4.method1183(false);
                if (var4.field2302 && !this.field365.method1701(122)) {
                    class89 var9 = this.field365.method1692(true, (byte) 2, this.field367, arg1, (byte) 111);
                    this.field362.method1674(var9, false, (long) arg1);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field364.field4255[arg1] >>> 8);
            var6[var6.length - 1] = (byte) this.field364.field4255[arg1];
            if (this.field382 != null) {
                this.field368.method2044(false, arg1, this.field382, var6);
                if (this.field379[arg1] != 1) {
                    this.field376++;
                    this.field379[arg1] = 1;
                }
            }
            if (!var4.field2302) {
                var4.method1183(false);
            }
            return var4;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class25.field409.reset();
            class25.field409.update(var6, 0, var6.length - 2);
            int var10 = (int) class25.field409.getValue();
            if (this.field364.field4252[arg1] != var10) {
                throw new RuntimeException();
            }
            int var11 = (var6[var6.length - 2] & 0xFF << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field364.field4255[arg1] & 0xFFFF) != var11) {
                throw new RuntimeException();
            }
            if (this.field379[arg1] != 1) {
                if (this.field379[arg1] == 0) {
                }
                this.field376++;
                this.field379[arg1] = 1;
            }
            if (!var4.field2302) {
                var4.method1183(false);
            }
            return var4;
        } catch (Exception var14) {
            this.field379[arg1] = -1;
            var4.method1183(false);
            if (var4.field2302 && !this.field365.method1701(109)) {
                class89 var13 = this.field365.method1692(true, (byte) 2, this.field367, arg1, (byte) 74);
                this.field362.method1674(var13, false, (long) arg1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I", line = 582)
    public final int method190(int arg0, int arg1) {
        if (arg1 != -14726) {
            this.field390 = (class18) null;
        }
        field374++;
        class127 var3 = (class127) this.field362.method1672((long) arg0, 19760);
        return var3 == null ? 0 : var3.method650(false);
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(ILh;Lh;Lem;Lch;IIZ)V", line = 851)
    public class23(int arg0, class315 arg1, class315 arg2, class240 arg3, class298 arg4, int arg5, int arg6, boolean arg7) {
        this.field382 = arg1;
        this.field367 = arg0;
        if (this.field382 == null) {
            this.field387 = false;
        } else {
            this.field387 = true;
            this.field388 = new class18();
        }
        this.field395 = arg7;
        this.field365 = arg3;
        this.field368 = arg4;
        this.field384 = arg2;
        this.field385 = arg5;
        this.field373 = arg6;
        if (this.field384 != null) {
            this.field375 = this.field368.method2045(2, this.field384, this.field367);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)V", line = 602)
    public final void method191(byte arg0, int arg1) {
        field369++;
        if (this.field382 == null) {
            return;
        }
        for (class151 var3 = this.field390.method169(-123); var3 != null; var3 = this.field390.method165((byte) -101)) {
            if ((long) arg1 == var3.field2701) {
                return;
            }
        }
        class151 var4 = new class151();
        if (arg0 != 1) {
            this.method197((byte) -98);
        }
        var4.field2701 = (long) arg1;
        this.field390.method167(false, var4);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)[B", line = 636)
    public final byte[] method192(int arg0, byte arg1) {
        field383++;
        if (arg1 > -82) {
            method196(41, (byte[]) null);
        }
        class127 var3 = this.method189(0, arg0, 75);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method652(false);
            var3.method1183(false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V", line = 654)
    public static void method193(int arg0) {
        field394 = null;
        if (arg0 <= 65) {
            return;
        }
        field399 = null;
        field397 = null;
        field400 = null;
        field386 = null;
        field398 = null;
        field393 = null;
        field392 = null;
        field370 = null;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)I", line = 672)
    public final int method194(byte arg0) {
        field366++;
        if (arg0 != 35) {
            method193(44);
        }
        return this.field376;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)I", line = 684)
    public final int method195(boolean arg0) {
        field377++;
        if (this.field364 == null) {
            return 0;
        } else if (this.field387) {
            class151 var2 = this.field388.method169(-123);
            if (arg0) {
                return -11;
            } else if (var2 == null) {
                return 0;
            } else {
                return (int) var2.field2701;
            }
        } else {
            return this.field364.field4253;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[B)V", line = 713)
    public static final void method196(int arg0, byte[] arg1) {
        field380++;
        class94 var2 = new class94(arg1);
        int var3 = var2.method756(915905888);
        if (arg0 <= 36 || var3 != 1) {
            return;
        }
        boolean var4 = var2.method756(915905888) == 1;
        if (var4) {
            class303.method2067((byte) -109, var2);
        }
        class275.method1870(82, var2);
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V", line = 739)
    public final void method197(byte arg0) {
        field363++;
        if (arg0 <= 97) {
            this.method195(true);
        }
        if (this.field388 == null || this.method188(-114) == null) {
            return;
        }
        for (class151 var2 = this.field390.method169(-120); var2 != null; var2 = this.field390.method165((byte) -101)) {
            int var3 = (int) var2.field2701;
            if (var3 < 0 || this.field364.field4238 <= var3 || this.field364.field4249[var3] == 0) {
                var2.method1183(false);
            } else {
                if (this.field379[var3] == 0) {
                    this.method189(1, var3, 33);
                }
                if (this.field379[var3] == -1) {
                    this.method189(2, var3, 109);
                }
                if (this.field379[var3] == 1) {
                    var2.method1183(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)I", line = 785)
    public final int method198(byte arg0) {
        if (arg0 != 1) {
            this.field388 = (class18) null;
        }
        field401++;
        return this.field364 == null ? 0 : this.field364.field4253;
    }
}
