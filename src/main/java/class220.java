import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class220 extends class163 {

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    private int field3893 = 0;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "Lti;")
    private class5 field3897 = new class5(16);

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    private int field3924 = 0;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "Lli;")
    private class277 field3922 = new class277();

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "J")
    private long field3928 = 0L;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    private int field3910;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "Lkb;")
    private class51 field3902;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "Z")
    private boolean field3923;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "Lli;")
    private class277 field3925;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "Lsg;")
    private class159 field3903;

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "Z")
    private boolean field3927;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    private int field3919;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    private int field3913;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "Ldf;")
    private class53 field3905;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "Lkb;")
    private class51 field3904;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "Lij;")
    private class191 field3921;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "Lkj;")
    public static class142 field3900;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Lsc;")
    private class239 field3892;

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "Z")
    private boolean field3926;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "[B")
    private byte[] field3915;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)[B")
    public final byte[] method1072(int arg0, int arg1) {
        if (arg0 > -110) {
            return null;
        }
        field3909++;
        class191 var3 = this.method1499(arg1, (byte) -65, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method179(1);
            var3.method1614(-1204826926);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)I")
    public final int method1496(int arg0) {
        if (arg0 != 0) {
            this.field3903 = null;
        }
        field3906++;
        if (this.method1074(-93) == null) {
            return this.field3921 == null ? 0 : this.field3921.method180((byte) -109);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)I")
    public final int method1497(int arg0) {
        field3895++;
        if (arg0 != -2) {
            this.field3897 = null;
        }
        return this.field3893;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)I")
    public final int method1498(boolean arg0) {
        field3920++;
        if (!arg0) {
            method1504(-55, false, 96);
        }
        return this.field3892 == null ? 0 : this.field3892.field4178;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBI)Lij;")
    private final class191 method1499(int arg0, byte arg1, int arg2) {
        class191 var4 = (class191) this.field3897.method31(-32665, (long) arg0);
        if (var4 != null && arg2 == 0 && !var4.field3436 && var4.field3427) {
            var4.method1614(-1204826926);
            var4 = null;
        }
        field3896++;
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field3902 == null || this.field3915[arg0] == -1) {
                    if (this.field3903.method1033(true)) {
                        return null;
                    }
                    var4 = this.field3903.method1041(arg0, true, -60, this.field3910, (byte) 2);
                } else {
                    var4 = this.field3905.method337(arg0, this.field3902, (byte) 40);
                }
            } else if (arg2 == 1) {
                if (this.field3902 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3905.method333(-3715, this.field3902, arg0);
            } else if (arg2 == 2) {
                if (this.field3902 == null) {
                    throw new RuntimeException();
                }
                if (this.field3915[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3903.method1034(-31062)) {
                    return null;
                }
                var4 = this.field3903.method1041(arg0, false, -82, this.field3910, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field3897.method33(var4, (long) arg0, -125);
        }
        if (var4.field3427) {
            return null;
        }
        int var5 = 92 % ((32 - arg1) / 38);
        byte[] var6 = var4.method179(1);
        if (!var4 instanceof class29) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class16.field381.reset();
                class16.field381.update(var6, 0, var6.length - 2);
                int var10 = (int) class16.field381.getValue();
                if (this.field3892.field4171[arg0] != var10) {
                    throw new RuntimeException();
                }
                this.field3903.field2914 = 0;
                this.field3903.field2913 = 0;
            } catch (RuntimeException var13) {
                this.field3903.method1048((byte) -125);
                var4.method1614(-1204826926);
                if (var4.field3436 && !this.field3903.method1033(true)) {
                    class24 var11 = this.field3903.method1041(arg0, true, -65, this.field3910, (byte) 2);
                    this.field3897.method33(var11, (long) arg0, -113);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field3892.field4170[arg0] >>> 8);
            var6[var6.length - 1] = (byte) this.field3892.field4170[arg0];
            if (this.field3902 != null) {
                this.field3905.method336(var6, (byte) 112, this.field3902, arg0);
                if (this.field3915[arg0] != 1) {
                    this.field3893++;
                    this.field3915[arg0] = 1;
                }
            }
            if (!var4.field3436) {
                var4.method1614(-1204826926);
            }
            return var4;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class16.field381.reset();
            class16.field381.update(var6, 0, var6.length - 2);
            int var7 = (int) class16.field381.getValue();
            if (this.field3892.field4171[arg0] != var7) {
                throw new RuntimeException();
            }
            int var8 = ((var6[var6.length - 2] & 0xFF) << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field3892.field4170[arg0] & 0xFFFF) != var8) {
                throw new RuntimeException();
            }
            if (this.field3915[arg0] != 1) {
                this.field3893++;
                this.field3915[arg0] = 1;
            }
            if (!var4.field3436) {
                var4.method1614(-1204826926);
            }
            return var4;
        } catch (Exception var12) {
            this.field3915[arg0] = -1;
            var4.method1614(-1204826926);
            if (var4.field3436 && !this.field3903.method1033(true)) {
                class24 var9 = this.field3903.method1041(arg0, true, -38, this.field3910, (byte) 2);
                this.field3897.method33(var9, (long) arg0, -111);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V")
    public static final void method1500(boolean arg0, int arg1) {
        if (arg1 <= 33) {
            return;
        }
        field3908++;
        for (class255 var2 = (class255) class49.field1061.method1878(true); var2 != null; var2 = (class255) class49.field1061.method1881(-21)) {
            if (var2.field4434 != null) {
                class43.field933.method1136(var2.field4434);
                var2.field4434 = null;
            }
            if (var2.field4432 != null) {
                class43.field933.method1136(var2.field4432);
                var2.field4432 = null;
            }
            var2.method1614(-1204826926);
        }
        if (!arg0) {
            return;
        }
        for (class255 var3 = (class255) class234.field4083.method1878(true); var3 != null; var3 = (class255) class234.field4083.method1881(-79)) {
            if (var3.field4434 != null) {
                class43.field933.method1136(var3.field4434);
                var3.field4434 = null;
            }
            var3.method1614(-1204826926);
        }
        for (class255 var4 = (class255) class232.field4057.method38(24172); var4 != null; var4 = (class255) class232.field4057.method36(-110)) {
            if (var4.field4434 != null) {
                class43.field933.method1136(var4.field4434);
                var4.field4434 = null;
            }
            var4.method1614(-1204826926);
        }
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V")
    public final void method1501(int arg0) {
        field3912++;
        if (this.field3925 == null || this.method1074(-110) == null) {
            return;
        }
        for (class241 var2 = this.field3922.method1878(true); var2 != null; var2 = this.field3922.method1881(arg0 - 58)) {
            int var3 = (int) var2.field4226;
            if (var3 < 0 || var3 >= this.field3892.field4173 || this.field3892.field4184[var3] == 0) {
                var2.method1614(-1204826926);
            } else {
                if (this.field3915[var3] == 0) {
                    this.method1499(var3, (byte) -77, 1);
                }
                if (this.field3915[var3] == -1) {
                    this.method1499(var3, (byte) -75, 2);
                }
                if (this.field3915[var3] == 1) {
                    var2.method1614(-1204826926);
                }
            }
        }
        if (arg0 != 2) {
            this.method1497(-99);
        }
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)V")
    public final void method1502(int arg0) {
        field3917++;
        if (arg0 != -10490) {
            this.field3919 = 58;
        }
        if (this.field3925 != null) {
            if (this.method1074(arg0 + 10418) == null) {
                return;
            }
            if (this.field3923) {
                boolean var2 = true;
                for (class241 var3 = this.field3925.method1878(true); var3 != null; var3 = this.field3925.method1881(-105)) {
                    int var5 = (int) var3.field4226;
                    if (this.field3915[var5] == 0) {
                        this.method1499(var5, (byte) 75, 1);
                    }
                    if (this.field3915[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1614(-1204826926);
                    }
                }
                while (this.field3892.field4184.length > this.field3924) {
                    if (this.field3892.field4184[this.field3924] == 0) {
                        this.field3924++;
                    } else {
                        if (this.field3905.field1124 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field3915[this.field3924] == 0) {
                            this.method1499(this.field3924, (byte) 114, 1);
                        }
                        if (this.field3915[this.field3924] == 0) {
                            var2 = false;
                            class241 var4 = new class241();
                            var4.field4226 = (long) this.field3924;
                            this.field3925.method1883(var4, (byte) -3);
                        }
                        this.field3924++;
                    }
                }
                if (var2) {
                    this.field3924 = 0;
                    this.field3923 = false;
                }
            } else if (this.field3926) {
                boolean var6 = true;
                for (class241 var7 = this.field3925.method1878(true); var7 != null; var7 = this.field3925.method1881(-31)) {
                    int var9 = (int) var7.field4226;
                    if (this.field3915[var9] != 1) {
                        this.method1499(var9, (byte) -58, 2);
                    }
                    if (this.field3915[var9] == 1) {
                        var7.method1614(-1204826926);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field3892.field4184.length > this.field3924) {
                    if (this.field3892.field4184[this.field3924] == 0) {
                        this.field3924++;
                    } else {
                        if (this.field3903.method1034(-31062)) {
                            var6 = false;
                            break;
                        }
                        if (this.field3915[this.field3924] != 1) {
                            this.method1499(this.field3924, (byte) -104, 2);
                        }
                        if (this.field3915[this.field3924] != 1) {
                            var6 = false;
                            class241 var8 = new class241();
                            var8.field4226 = (long) this.field3924;
                            this.field3925.method1883(var8, (byte) -3);
                        }
                        this.field3924++;
                    }
                }
                if (var6) {
                    this.field3924 = 0;
                    this.field3926 = false;
                }
            } else {
                this.field3925 = null;
            }
        }
        if (!this.field3927 || this.field3928 > class25.method182(true)) {
            return;
        }
        for (class191 var10 = (class191) this.field3897.method38(24172); var10 != null; var10 = (class191) this.field3897.method36(arg0 ^ 0x2885)) {
            if (!var10.field3427) {
                if (var10.field3428) {
                    if (!var10.field3436) {
                        throw new RuntimeException();
                    }
                    var10.method1614(-1204826926);
                } else {
                    var10.field3428 = true;
                }
            }
        }
        this.field3928 = class25.method182(true) + 1000L;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)I")
    public final int method1071(int arg0, boolean arg1) {
        field3894++;
        if (arg1) {
            return 2;
        } else {
            class191 var3 = (class191) this.field3897.method31(-32665, (long) arg0);
            return var3 == null ? 0 : var3.method180((byte) -109);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)Lsc;")
    public final class239 method1074(int arg0) {
        if (arg0 >= -50) {
            this.field3910 = 117;
        }
        field3916++;
        if (this.field3892 != null) {
            return this.field3892;
        }
        if (this.field3921 == null) {
            if (this.field3903.method1033(true)) {
                return null;
            }
            this.field3921 = this.field3903.method1041(this.field3910, true, -90, 255, (byte) 0);
        }
        if (this.field3921.field3427) {
            return null;
        }
        byte[] var2 = this.field3921.method179(1);
        if (this.field3921 instanceof class29) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3892 = new class239(var2, this.field3913);
                if (this.field3892.field4185 != this.field3919) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3892 = null;
                if (this.field3903.method1033(true)) {
                    this.field3921 = null;
                } else {
                    this.field3921 = this.field3903.method1041(this.field3910, true, -61, 255, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3892 = new class239(var2, this.field3913);
            } catch (RuntimeException var4) {
                this.field3903.method1048((byte) -125);
                this.field3892 = null;
                if (this.field3903.method1033(true)) {
                    this.field3921 = null;
                } else {
                    this.field3921 = this.field3903.method1041(this.field3910, true, -34, 255, (byte) 0);
                }
                return null;
            }
            if (this.field3904 != null) {
                this.field3905.method336(var2, (byte) 109, this.field3904, this.field3910);
            }
        }
        if (this.field3902 != null) {
            this.field3893 = 0;
            this.field3915 = new byte[this.field3892.field4173];
        }
        this.field3921 = null;
        return this.field3892;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
    public final void method1070(int arg0, int arg1) {
        field3911++;
        if (this.field3902 == null || arg0 <= 1) {
            return;
        }
        for (class241 var3 = this.field3922.method1878(true); var3 != null; var3 = this.field3922.method1881(-64)) {
            if (((long) arg1) == var3.field4226) {
                return;
            }
        }
        class241 var4 = new class241();
        var4.field4226 = (long) arg1;
        this.field3922.method1883(var4, (byte) -3);
    }

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "(I)V")
    public static void method1503(int arg0) {
        if (arg0 < 85) {
            field3900 = null;
        }
        field3900 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZI)V")
    public static final void method1504(int arg0, boolean arg1, int arg2) {
        field3901++;
        class64 var3 = class84.method563(1, arg0, -106);
        var3.method396(arg1);
        var3.field1290 = arg2;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)I")
    public final int method1505(byte arg0) {
        field3889++;
        if (this.field3892 == null) {
            return 0;
        } else if (this.field3923) {
            class241 var2 = this.field3925.method1878(true);
            if (var2 == null) {
                return 0;
            } else {
                if (arg0 >= -106) {
                    this.field3919 = 67;
                }
                return (int) var2.field4226;
            }
        } else {
            return this.field3892.field4178;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)I")
    public static final int method1506(byte arg0) {
        field3891++;
        if (arg0 != -88) {
            field3900 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "(I)V")
    public final void method1507(int arg0) {
        field3914++;
        if (this.field3902 != null && arg0 == 31020) {
            this.field3926 = true;
            if (this.field3925 == null) {
                this.field3925 = new class277();
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lpc;B)V")
    public static final void method1508(class21 arg0, byte arg1) {
        if (arg1 <= -45) {
            if (class7.field123 == arg0.field572) {
                class21.field629[arg0.field490] = true;
            }
            field3890++;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(ILkb;Lkb;Lsg;Ldf;IIZ)V")
    public class220(int arg0, class51 arg1, class51 arg2, class159 arg3, class53 arg4, int arg5, int arg6, boolean arg7) {
        this.field3910 = arg0;
        this.field3902 = arg1;
        if (this.field3902 == null) {
            this.field3923 = false;
        } else {
            this.field3923 = true;
            this.field3925 = new class277();
        }
        this.field3903 = arg3;
        this.field3927 = arg7;
        this.field3919 = arg6;
        this.field3913 = arg5;
        this.field3905 = arg4;
        this.field3904 = arg2;
        if (this.field3904 != null) {
            this.field3921 = this.field3905.method337(this.field3910, this.field3904, (byte) 40);
        }
    }
}
