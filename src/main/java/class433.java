import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class433 extends class349 {

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    private int field5909 = 0;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "Lub;")
    private class18 field5914 = new class18(16);

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    private int field5943 = 0;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "Lwl;")
    private class280 field5942 = new class280();

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "J")
    private long field5945 = 0L;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    private int field5911;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "Loc;")
    private class135 field5935;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "Z")
    private boolean field5941;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "Lwl;")
    private class280 field5939;

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "Z")
    private boolean field5944;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    private int field5915;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    private int field5917;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "Loc;")
    private class135 field5920;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lfn;")
    private class91 field5906;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Loj;")
    private class257 field5908;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "Lud;")
    private class27 field5932;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Z")
    public static boolean field5905 = false;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    public static int field5937 = 1407;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "Lcu;")
    public static class145 field5936 = new class145(23, 2);

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "Z")
    public static boolean field5938 = true;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "Leh;")
    private class241 field5919;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "Lre;")
    public static class425 field5928;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "Z")
    private boolean field5940;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "[B")
    private byte[] field5916;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V", line = 16)
    public static final void method2489(int arg0) {
        class285.field3723 = false;
        class256.field3379 = null;
        class88.field1339 = null;
        if (arg0 == 3805) {
            class327.field4327 = null;
            class525.field7770 = null;
            field5907++;
            class525.field7776 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)I", line = 32)
    public final int method2490(boolean arg0) {
        if (!arg0) {
            method2491(-117);
        }
        field5904++;
        return this.field5919 == null ? 0 : this.field5919.field3223;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V", line = 47)
    public static void method2491(int arg0) {
        if (arg0 != -24930) {
            method2491(-122);
        }
        field5936 = null;
        field5928 = null;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V", line = 60)
    public final void method2492(int arg0) {
        if (arg0 != 20464) {
            this.method2492(70);
        }
        field5922++;
        if (this.field5935 != null) {
            this.field5940 = true;
            if (this.field5939 == null) {
                this.field5939 = new class280();
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)I", line = 80)
    public static final int method2493(int arg0, int arg1, int arg2) {
        field5923++;
        if (arg2 != 0) {
            method2489(-116);
        }
        return arg0 == 1 || arg0 == 3 ? class1.field91[arg1 & 0x3] : class302.field3992[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V", line = 94)
    public final void method2494(int arg0) {
        field5934++;
        if (this.field5939 != null) {
            if (this.method2037(2) == null) {
                return;
            }
            if (this.field5941) {
                boolean var6 = true;
                for (class42 var7 = this.field5939.method1672((byte) -96); var7 != null; var7 = this.field5939.method1668(-1)) {
                    int var9 = (int) var7.field622;
                    if (this.field5916[var9] == 0) {
                        this.method2497(1, -4, var9);
                    }
                    if (this.field5916[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method300(false);
                    }
                }
                while (this.field5943 < this.field5919.field3213.length) {
                    if (this.field5919.field3213[this.field5943] == 0) {
                        this.field5943++;
                    } else {
                        if (this.field5906.field1383 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field5916[this.field5943] == 0) {
                            this.method2497(1, -4, this.field5943);
                        }
                        if (this.field5916[this.field5943] == 0) {
                            class42 var8 = new class42();
                            var8.field622 = this.field5943;
                            var6 = false;
                            this.field5939.method1666((byte) -94, var8);
                        }
                        this.field5943++;
                    }
                }
                if (var6) {
                    this.field5943 = 0;
                    this.field5941 = false;
                }
            } else if (this.field5940) {
                boolean var2 = true;
                for (class42 var3 = this.field5939.method1672((byte) -106); var3 != null; var3 = this.field5939.method1668(-1)) {
                    int var5 = (int) var3.field622;
                    if (this.field5916[var5] != 1) {
                        this.method2497(2, -4, var5);
                    }
                    if (this.field5916[var5] == 1) {
                        var3.method300(false);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field5943 < this.field5919.field3213.length) {
                    if (this.field5919.field3213[this.field5943] == 0) {
                        this.field5943++;
                    } else {
                        if (this.field5908.method1547(true)) {
                            var2 = false;
                            break;
                        }
                        if (this.field5916[this.field5943] != 1) {
                            this.method2497(2, -4, this.field5943);
                        }
                        if (this.field5916[this.field5943] != 1) {
                            class42 var4 = new class42();
                            var4.field622 = this.field5943;
                            var2 = false;
                            this.field5939.method1666((byte) -84, var4);
                        }
                        this.field5943++;
                    }
                }
                if (var2) {
                    this.field5943 = 0;
                    this.field5940 = false;
                }
            } else {
                this.field5939 = null;
            }
        }
        if (this.field5944 && this.field5945 <= class498.method2854(-123)) {
            for (class27 var10 = (class27) this.field5914.method181((byte) -70); var10 != null; var10 = (class27) this.field5914.method179(1)) {
                if (!var10.field456) {
                    if (var10.field454) {
                        if (!var10.field455) {
                            throw new RuntimeException();
                        }
                        var10.method300(false);
                    } else {
                        var10.field454 = true;
                    }
                }
            }
            this.field5945 = class498.method2854(-124) + 1000L;
        }
        int var11 = -42 % ((arg0 - 10) / 35);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)V", line = 270)
    public final void method2038(int arg0, byte arg1) {
        field5921++;
        if (this.field5935 == null) {
            return;
        }
        for (class42 var3 = this.field5942.method1672((byte) -109); var3 != null; var3 = this.field5942.method1668(-1)) {
            if (((long) arg0) == var3.field622) {
                return;
            }
        }
        if (arg1 != -32) {
            this.method2497(108, 22, -65);
        }
        class42 var4 = new class42();
        var4.field622 = arg0;
        this.field5942.method1666((byte) -87, var4);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I", line = 308)
    public final int method2039(int arg0, int arg1) {
        field5931++;
        class27 var3 = (class27) this.field5914.method182((long) arg1, (byte) 87);
        if (arg0 != -2057) {
            this.field5914 = null;
        }
        return var3 == null ? 0 : var3.method229((byte) -110);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)V", line = 324)
    public static final void method2495(int arg0, int arg1, int arg2) {
        field5929++;
        class253 var3 = class332.method1911(arg0, (byte) -125, arg2);
        var3.method1522(0);
        var3.field3356 = arg1;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)[B", line = 337)
    public final byte[] method2040(int arg0, int arg1) {
        field5926++;
        if (arg1 != -2) {
            return null;
        }
        class27 var3 = this.method2497(0, -4, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method227((byte) 41);
            var3.method300(false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)I", line = 357)
    public final int method2496(boolean arg0) {
        field5912++;
        if (this.method2037(2) == null) {
            return this.field5932 == null ? 0 : this.field5932.method229((byte) -104);
        } else {
            if (arg0) {
                this.field5909 = 99;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(III)Lud;", line = 382)
    private final class27 method2497(int arg0, int arg1, int arg2) {
        field5927++;
        class27 var4 = (class27) this.field5914.method182((long) arg2, (byte) 90);
        if (var4 != null && arg0 == 0 && !var4.field455 && var4.field456) {
            var4.method300(false);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field5935 == null || this.field5916[arg2] == -1) {
                    if (this.field5908.method1555(arg1 ^ 0xFFFFFFE8)) {
                        return null;
                    }
                    var4 = this.field5908.method1543(arg2, -21, (byte) 2, true, this.field5911);
                } else {
                    var4 = this.field5906.method660(arg1 ^ 0xFFFFFFFD, arg2, this.field5935);
                }
            } else if (arg0 == 1) {
                if (this.field5935 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field5906.method661(arg2, this.field5935, 3);
            } else if (arg0 == 2) {
                if (this.field5935 == null) {
                    throw new RuntimeException();
                }
                if (this.field5916[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field5908.method1547(true)) {
                    return null;
                }
                var4 = this.field5908.method1543(arg2, -21, (byte) 2, false, this.field5911);
            } else {
                throw new RuntimeException();
            }
            this.field5914.method173((long) arg2, var4, (byte) 100);
        }
        if (arg1 != -4) {
            method2489(-53);
        }
        if (var4.field456) {
            return null;
        }
        byte[] var5 = var4.method227((byte) 41);
        if (!var4 instanceof class172) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class147.field2082.reset();
                class147.field2082.update(var5, 0, var5.length - 2);
                int var9 = (int) class147.field2082.getValue();
                if (this.field5919.field3215[arg2] != var9) {
                    throw new RuntimeException();
                }
                this.field5908.field3409 = 0;
                this.field5908.field3407 = 0;
            } catch (RuntimeException var12) {
                this.field5908.method1549(false);
                var4.method300(false);
                if (var4.field455 && !this.field5908.method1555(arg1 + 24)) {
                    class294 var10 = this.field5908.method1543(arg2, arg1 ^ 0x17, (byte) 2, true, this.field5911);
                    this.field5914.method173((long) arg2, var10, (byte) 102);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field5919.field3211[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field5919.field3211[arg2];
            if (this.field5935 != null) {
                this.field5906.method658(var5, 113, arg2, this.field5935);
                if (this.field5916[arg2] != 1) {
                    this.field5909++;
                    this.field5916[arg2] = 1;
                }
            }
            if (!var4.field455) {
                var4.method300(false);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class147.field2082.reset();
            class147.field2082.update(var5, 0, var5.length - 2);
            int var6 = (int) class147.field2082.getValue();
            if (this.field5919.field3215[arg2] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field5919.field3211[arg2] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field5916[arg2] != 1) {
                this.field5909++;
                this.field5916[arg2] = 1;
            }
            if (!var4.field455) {
                var4.method300(false);
            }
            return var4;
        } catch (Exception var11) {
            this.field5916[arg2] = -1;
            var4.method300(false);
            if (var4.field455 && !this.field5908.method1555(arg1 + 24)) {
                class294 var8 = this.field5908.method1543(arg2, -21, (byte) 2, true, this.field5911);
                this.field5914.method173((long) arg2, var8, (byte) 112);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)I", line = 596)
    public final int method2498(byte arg0) {
        if (arg0 >= -34) {
            return 50;
        } else {
            field5913++;
            return this.field5909;
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)V", line = 608)
    public final void method2499(byte arg0) {
        field5933++;
        if (this.field5939 == null) {
            return;
        }
        if (arg0 != 96) {
            this.method2040(-39, 31);
        }
        if (this.method2037(2) == null) {
            return;
        }
        for (class42 var2 = this.field5942.method1672((byte) -104); var2 != null; var2 = this.field5942.method1668(-1)) {
            int var3 = (int) var2.field622;
            if (var3 < 0 || var3 >= this.field5919.field3214 || this.field5919.field3213[var3] == 0) {
                var2.method300(false);
            } else {
                if (this.field5916[var3] == 0) {
                    this.method2497(1, -4, var3);
                }
                if (this.field5916[var3] == -1) {
                    this.method2497(2, -4, var3);
                }
                if (this.field5916[var3] == 1) {
                    var2.method300(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(ILoc;Loc;Loj;Lfn;IIZ)V", line = 969)
    public class433(int arg0, class135 arg1, class135 arg2, class257 arg3, class91 arg4, int arg5, int arg6, boolean arg7) {
        this.field5911 = arg0;
        this.field5935 = arg1;
        if (this.field5935 == null) {
            this.field5941 = false;
        } else {
            this.field5941 = true;
            this.field5939 = new class280();
        }
        this.field5944 = arg7;
        this.field5915 = arg5;
        this.field5917 = arg6;
        this.field5920 = arg2;
        this.field5906 = arg4;
        this.field5908 = arg3;
        if (this.field5920 != null) {
            this.field5932 = this.field5906.method660(1, this.field5911, this.field5920);
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(Z)I", line = 658)
    public final int method2500(boolean arg0) {
        field5903++;
        if (this.field5919 == null) {
            return 0;
        } else if (this.field5941) {
            class42 var2 = this.field5939.method1672((byte) -126);
            if (!arg0) {
                this.field5945 = 121L;
            }
            return var2 == null ? 0 : (int) var2.field622;
        } else {
            return this.field5919.field3223;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Leh;", line = 684)
    public final class241 method2037(int arg0) {
        field5925++;
        if (this.field5919 != null) {
            return this.field5919;
        }
        if (this.field5932 == null) {
            if (this.field5908.method1555(arg0 ^ 0x16)) {
                return null;
            }
            this.field5932 = this.field5908.method1543(this.field5911, -21, (byte) 0, true, 255);
        }
        if (this.field5932.field456) {
            return null;
        }
        if (arg0 != 2) {
            this.method2499((byte) 89);
        }
        byte[] var2 = this.field5932.method227((byte) 41);
        if (this.field5932 instanceof class172) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5919 = new class241(var2, this.field5915);
                if (this.field5919.field3227 != this.field5917) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field5919 = null;
                if (this.field5908.method1555(20)) {
                    this.field5932 = null;
                } else {
                    this.field5932 = this.field5908.method1543(this.field5911, arg0 - 23, (byte) 0, true, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5919 = new class241(var2, this.field5915);
            } catch (RuntimeException var4) {
                this.field5908.method1549(false);
                this.field5919 = null;
                if (this.field5908.method1555(20)) {
                    this.field5932 = null;
                } else {
                    this.field5932 = this.field5908.method1543(this.field5911, -21, (byte) 0, true, 255);
                }
                return null;
            }
            if (this.field5920 != null) {
                this.field5906.method658(var2, arg0 ^ 0x6F, this.field5911, this.field5920);
            }
        }
        this.field5932 = null;
        if (this.field5935 != null) {
            this.field5909 = 0;
            this.field5916 = new byte[this.field5919.field3214];
        }
        return this.field5919;
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V", line = 787)
    public static final void method2501(int arg0) {
        field5918++;
        if (class314.field4116 == 0) {
            return;
        }
        try {
            if (arg0 != 255) {
                method2489(114);
            }
            if (++class4.field110 > 2000) {
                if (class304.field4004 != null) {
                    class304.field4004.method1886(-1);
                    class304.field4004 = null;
                }
                if (class146.field2069 >= 1) {
                    class314.field4116 = 0;
                    class225.field3043 = -5;
                    return;
                }
                class146.field2069++;
                class4.field110 = 0;
                if (class456.field6271 == class437.field5997) {
                    class456.field6271 = class477.field6572;
                } else {
                    class456.field6271 = class437.field5997;
                }
                class314.field4116 = 1;
            }
            if (class314.field4116 == 1) {
                class354.field4786 = class389.field5281.method1376(1, class456.field6271, class273.field3588);
                class314.field4116 = 2;
            }
            if (class314.field4116 == 2) {
                if (class354.field4786.field6100 == 2) {
                    throw new IOException();
                }
                if (class354.field4786.field6100 != 1) {
                    return;
                }
                class304.field4004 = new class326((Socket) class354.field4786.field6104, class389.field5281);
                class354.field4786 = null;
                class304.field4004.method1880(class193.field2708.field5152, 96, 0, class193.field2708.field5173);
                class242.method1488((byte) 81);
                int var1 = class304.field4004.method1887((byte) -126);
                class242.method1488((byte) 81);
                if (var1 != 21) {
                    class225.field3043 = var1;
                    class314.field4116 = 0;
                    class304.field4004.method1886(-1);
                    class304.field4004 = null;
                    return;
                }
                class314.field4116 = 3;
            }
            if (class314.field4116 == 3) {
                if (class304.field4004.method1879(0) < 1) {
                    return;
                }
                class227.field3063 = new String[class304.field4004.method1887((byte) -1)];
                class314.field4116 = 4;
            }
            if (class314.field4116 == 4 && class304.field4004.method1879(0) >= (class227.field3063.length * 8)) {
                class481.field6632.field5173 = 0;
                class304.field4004.method1884(class227.field3063.length * 8, class481.field6632.field5152, 0, (byte) 127);
                for (int var2 = 0; var2 < class227.field3063.length; var2++) {
                    class227.field3063[var2] = class470.method2674(class481.field6632.method2220(943016720), (byte) -127);
                }
                class225.field3043 = 21;
                class314.field4116 = 0;
                class304.field4004.method1886(-1);
                class304.field4004 = null;
            }
        } catch (IOException var3) {
            if (class304.field4004 != null) {
                class304.field4004.method1886(arg0 - 256);
                class304.field4004 = null;
            }
            if (class146.field2069 < 1) {
                class314.field4116 = 1;
                class4.field110 = 0;
                if (class456.field6271 == class437.field5997) {
                    class456.field6271 = class477.field6572;
                } else {
                    class456.field6271 = class437.field5997;
                }
                class146.field2069++;
            } else {
                class314.field4116 = 0;
                class225.field3043 = -4;
            }
        }
    }
}
