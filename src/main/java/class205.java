import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class205 extends class415 {

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    private int field2884 = 0;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "Lqo;")
    private class141 field2889 = new class141(16);

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "I")
    private int field2903 = 0;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "Lvr;")
    private class306 field2907 = new class306();

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "J")
    private long field2909 = 0L;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    private int field2888;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "Lht;")
    private class80 field2902;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "Z")
    private boolean field2905;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "Lvr;")
    private class306 field2906;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    private int field2881;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Ltc;")
    private class359 field2878;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "I")
    private int field2901;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "Z")
    private boolean field2908;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Liu;")
    private class356 field2877;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Lht;")
    private class80 field2875;

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "Ltt;")
    private class357 field2899;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "[I")
    public static int[] field2898 = new int[2];

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "F")
    public static float field2895;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "Lto;")
    private class158 field2891;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "Z")
    private boolean field2904;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "[B")
    private byte[] field2900;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIBI)V", line = 4)
    public static final void method1417(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -64) {
            method1429((byte) -104);
        }
        field2879++;
        if (arg2 >= class410.field6176 && class158.field2302 >= arg2) {
            int var5 = class278.method1758(class443.field6591, class396.field6021, arg4, arg3 ^ 0x5C);
            int var6 = class278.method1758(class443.field6591, class396.field6021, arg1, -128);
            class103.method691(var5, arg0, arg2, 97, var6);
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(II)V", line = 21)
    public final void method1418(int arg0, int arg1) {
        field2890++;
        if (this.field2902 == null) {
            return;
        }
        for (class467 var3 = this.field2907.method1970(64); var3 != null; var3 = this.field2907.method1960(24)) {
            if ((long) arg0 == var3.field6799) {
                return;
            }
        }
        class467 var4 = new class467();
        var4.field6799 = arg0;
        if (arg1 < -89) {
            this.field2907.method1958(var4, 0);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)Lto;", line = 56)
    public final class158 method1419(int arg0) {
        field2882++;
        if (this.field2891 != null) {
            return this.field2891;
        }
        if (this.field2899 == null) {
            if (this.field2877.method2252(20)) {
                return null;
            }
            this.field2899 = this.field2877.method2251(true, (byte) -124, 255, (byte) 0, this.field2888);
        }
        if (this.field2899.field5535) {
            return null;
        }
        byte[] var2 = this.field2899.method696(-115);
        if (this.field2899 instanceof class245) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2891 = new class158(var2, this.field2901);
                if (this.field2891.field2299 != this.field2881) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field2891 = null;
                if (this.field2877.method2252(20)) {
                    this.field2899 = null;
                } else {
                    this.field2899 = this.field2877.method2251(true, (byte) -128, 255, (byte) 0, this.field2888);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2891 = new class158(var2, this.field2901);
            } catch (RuntimeException var4) {
                this.field2877.method2242(false);
                this.field2891 = null;
                if (this.field2877.method2252(20)) {
                    this.field2899 = null;
                } else {
                    this.field2899 = this.field2877.method2251(true, (byte) -126, 255, (byte) 0, this.field2888);
                }
                return null;
            }
            if (this.field2875 != null) {
                this.field2878.method2260(var2, -96, this.field2875, this.field2888);
            }
        }
        if (arg0 != 0) {
            this.field2888 = -66;
        }
        this.field2899 = null;
        if (this.field2902 != null) {
            this.field2900 = new byte[this.field2891.field2304];
            this.field2884 = 0;
        }
        return this.field2891;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)I", line = 151)
    public final int method1420(int arg0) {
        if (arg0 > -50) {
            this.method1424(-127, 34);
        }
        field2876++;
        if (this.field2891 == null) {
            return 0;
        } else if (this.field2905) {
            class467 var2 = this.field2906.method1970(64);
            return var2 == null ? 0 : (int) var2.field6799;
        } else {
            return this.field2891.field2289;
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)I", line = 174)
    public final int method1421(int arg0) {
        field2897++;
        return arg0 == -32668 ? this.field2884 : 71;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)I", line = 190)
    public final int method1422(byte arg0) {
        field2894++;
        int var2 = 46 / ((arg0 - 86) / 40);
        if (this.method1419(0) == null) {
            return this.field2899 == null ? 0 : this.field2899.method693(-53);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)[B", line = 210)
    public final byte[] method1423(boolean arg0, int arg1) {
        if (!arg0) {
            this.method1428(-82, -109, false);
        }
        field2883++;
        class357 var3 = this.method1428(0, arg1, false);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method696(-109);
            var3.method2785((byte) -120);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I", line = 237)
    public final int method1424(int arg0, int arg1) {
        field2885++;
        class357 var3 = (class357) this.field2889.method943((long) arg0, -1);
        if (var3 == null) {
            return arg1 == -2 ? 0 : 76;
        } else {
            return var3.method693(-94);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V", line = 253)
    public final void method1425(boolean arg0) {
        field2887++;
        if (this.field2902 == null) {
            return;
        }
        this.field2904 = true;
        if (arg0) {
            this.field2905 = true;
        }
        if (this.field2906 == null) {
            this.field2906 = new class306();
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V", line = 270)
    public final void method1426(int arg0) {
        field2880++;
        if (this.field2906 == null || this.method1419(0) == null) {
            return;
        }
        for (class467 var2 = this.field2907.method1970(64); var2 != null; var2 = this.field2907.method1960(24)) {
            int var3 = (int) var2.field6799;
            if (var3 < 0 || var3 >= this.field2891.field2304 || this.field2891.field2297[var3] == 0) {
                var2.method2785((byte) -120);
            } else {
                if (this.field2900[var3] == 0) {
                    this.method1428(1, var3, false);
                }
                if (this.field2900[var3] == -1) {
                    this.method1428(2, var3, false);
                }
                if (this.field2900[var3] == 1) {
                    var2.method2785((byte) -120);
                }
            }
        }
        if (arg0 != 31431) {
            this.method1418(-87, -12);
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V", line = 316)
    public final void method1427(int arg0) {
        field2892++;
        if (this.field2906 != null) {
            if (this.method1419(0) == null) {
                return;
            }
            if (this.field2905) {
                boolean var2 = true;
                for (class467 var3 = this.field2906.method1970(64); var3 != null; var3 = this.field2906.method1960(24)) {
                    int var5 = (int) var3.field6799;
                    if (this.field2900[var5] == 0) {
                        this.method1428(1, var5, false);
                    }
                    if (this.field2900[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method2785((byte) -120);
                    }
                }
                while (this.field2891.field2297.length > this.field2903) {
                    if (this.field2891.field2297[this.field2903] == 0) {
                        this.field2903++;
                    } else {
                        if (this.field2878.field5567 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field2900[this.field2903] == 0) {
                            this.method1428(1, this.field2903, false);
                        }
                        if (this.field2900[this.field2903] == 0) {
                            class467 var4 = new class467();
                            var4.field6799 = this.field2903;
                            this.field2906.method1958(var4, 0);
                            var2 = false;
                        }
                        this.field2903++;
                    }
                }
                if (var2) {
                    this.field2905 = false;
                    this.field2903 = 0;
                }
            } else if (this.field2904) {
                boolean var6 = true;
                for (class467 var7 = this.field2906.method1970(64); var7 != null; var7 = this.field2906.method1960(24)) {
                    int var9 = (int) var7.field6799;
                    if (this.field2900[var9] != 1) {
                        this.method1428(2, var9, false);
                    }
                    if (this.field2900[var9] == 1) {
                        var7.method2785((byte) -120);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field2903 < this.field2891.field2297.length) {
                    if (this.field2891.field2297[this.field2903] == 0) {
                        this.field2903++;
                    } else {
                        if (this.field2877.method2243(-6078)) {
                            var6 = false;
                            break;
                        }
                        if (this.field2900[this.field2903] != 1) {
                            this.method1428(2, this.field2903, false);
                        }
                        if (this.field2900[this.field2903] != 1) {
                            class467 var8 = new class467();
                            var8.field6799 = this.field2903;
                            this.field2906.method1958(var8, 0);
                            var6 = false;
                        }
                        this.field2903++;
                    }
                }
                if (var6) {
                    this.field2903 = 0;
                    this.field2904 = false;
                }
            } else {
                this.field2906 = null;
            }
        }
        int var10 = -62 % ((78 - arg0) / 46);
        if (!this.field2908 || this.field2909 > class264.method1698(true)) {
            return;
        }
        for (class357 var11 = (class357) this.field2889.method948(126); var11 != null; var11 = (class357) this.field2889.method938(-94)) {
            if (!var11.field5535) {
                if (var11.field5540) {
                    if (!var11.field5539) {
                        throw new RuntimeException();
                    }
                    var11.method2785((byte) -120);
                } else {
                    var11.field5540 = true;
                }
            }
        }
        this.field2909 = class264.method1698(true) + 1000L;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZ)Ltt;", line = 501)
    private final class357 method1428(int arg0, int arg1, boolean arg2) {
        field2886++;
        class357 var4 = (class357) this.field2889.method943((long) arg1, -1);
        if (var4 != null && arg0 == 0 && !var4.field5539 && var4.field5535) {
            var4.method2785((byte) -120);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field2902 == null || this.field2900[arg1] == -1) {
                    if (this.field2877.method2252(20)) {
                        return null;
                    }
                    var4 = this.field2877.method2251(true, (byte) -128, this.field2888, (byte) 2, arg1);
                } else {
                    var4 = this.field2878.method2262(27405, arg1, this.field2902);
                }
            } else if (arg0 == 1) {
                if (this.field2902 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2878.method2265(this.field2902, -2, arg1);
            } else if (arg0 == 2) {
                if (this.field2902 == null) {
                    throw new RuntimeException();
                }
                if (this.field2900[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2877.method2243(-6078)) {
                    return null;
                }
                var4 = this.field2877.method2251(false, (byte) -125, this.field2888, (byte) 2, arg1);
            } else {
                throw new RuntimeException();
            }
            this.field2889.method940((long) arg1, -103, var4);
        }
        if (var4.field5535) {
            return null;
        }
        if (arg2) {
            this.method1418(-35, -2);
        }
        byte[] var5 = var4.method696(-114);
        if (!var4 instanceof class245) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class25.field404.reset();
                class25.field404.update(var5, 0, var5.length - 2);
                int var6 = (int) class25.field404.getValue();
                if (this.field2891.field2290[arg1] != var6) {
                    throw new RuntimeException();
                }
                this.field2877.field5532 = 0;
                this.field2877.field5530 = 0;
            } catch (RuntimeException var12) {
                this.field2877.method2242(false);
                var4.method2785((byte) -120);
                if (var4.field5539 && !this.field2877.method2252(20)) {
                    class103 var7 = this.field2877.method2251(true, (byte) -123, this.field2888, (byte) 2, arg1);
                    this.field2889.method940((long) arg1, -51, var7);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2891.field2310[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field2891.field2310[arg1];
            if (this.field2902 != null) {
                this.field2878.method2260(var5, -105, this.field2902, arg1);
                if (this.field2900[arg1] != 1) {
                    this.field2884++;
                    this.field2900[arg1] = 1;
                }
            }
            if (!var4.field5539) {
                var4.method2785((byte) -120);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class25.field404.reset();
            class25.field404.update(var5, 0, var5.length - 2);
            int var8 = (int) class25.field404.getValue();
            if (this.field2891.field2290[arg1] != var8) {
                throw new RuntimeException();
            }
            int var9 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2891.field2310[arg1] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field2900[arg1] != 1) {
                this.field2884++;
                this.field2900[arg1] = 1;
            }
            if (!var4.field5539) {
                var4.method2785((byte) -120);
            }
            return var4;
        } catch (Exception var11) {
            this.field2900[arg1] = -1;
            var4.method2785((byte) -120);
            if (var4.field5539 && !this.field2877.method2252(20)) {
                class103 var10 = this.field2877.method2251(true, (byte) -127, this.field2888, (byte) 2, arg1);
                this.field2889.method940((long) arg1, -92, var10);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)V", line = 716)
    public static void method1429(byte arg0) {
        field2898 = null;
        if (arg0 != -1) {
            method1417(26, -68, -95, (byte) -94, 78);
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(ILht;Lht;Liu;Ltc;IIZ)V", line = 772)
    public class205(int arg0, class80 arg1, class80 arg2, class356 arg3, class359 arg4, int arg5, int arg6, boolean arg7) {
        this.field2888 = arg0;
        this.field2902 = arg1;
        if (this.field2902 == null) {
            this.field2905 = false;
        } else {
            this.field2905 = true;
            this.field2906 = new class306();
        }
        this.field2881 = arg6;
        this.field2878 = arg4;
        this.field2901 = arg5;
        this.field2908 = arg7;
        this.field2877 = arg3;
        this.field2875 = arg2;
        if (this.field2875 != null) {
            this.field2899 = this.field2878.method2262(27405, this.field2888, this.field2875);
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)I", line = 737)
    public final int method1430(byte arg0) {
        field2893++;
        if (this.field2891 == null) {
            return 0;
        } else {
            int var2 = -64 % ((arg0 - 31) / 37);
            return this.field2891.field2289;
        }
    }
}
