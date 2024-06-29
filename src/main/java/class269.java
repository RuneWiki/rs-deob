import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class269 {

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public int field4050 = -1;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    private int field4053 = 128;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    private int field4060 = 0;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "Z")
    public boolean field4057 = false;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    private int field4061 = 128;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    private int field4063 = 0;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    private int field4059 = 0;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field4058 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    private int field4045;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public int field4048;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "[S")
    private short[] field4043;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "[S")
    private short[] field4044;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "[S")
    private short[] field4046;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "[S")
    private short[] field4049;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILhb;)V", line = 4)
    private final void method1868(int arg0, int arg1, class35 arg2) {
        if (arg0 == 1) {
            this.field4045 = arg2.method300(arg1 - 1394191636);
        } else if (arg0 == 2) {
            this.field4050 = arg2.method300(-1394191632);
        } else if (arg0 == 4) {
            this.field4061 = arg2.method300(-1394191632);
        } else if (arg0 == 5) {
            this.field4053 = arg2.method300(-1394191632);
        } else if (arg0 == 6) {
            this.field4059 = arg2.method300(-1394191632);
        } else if (arg0 == 7) {
            this.field4060 = arg2.method273(arg1 + 65276);
        } else if (arg0 == 8) {
            this.field4063 = arg2.method273(65280);
        } else if (arg0 == 9) {
            this.field4057 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method273(65280);
            this.field4044 = new short[var4];
            this.field4049 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4049[var5] = (short) arg2.method300(-1394191632);
                this.field4044[var5] = (short) arg2.method300(arg1 - 1394191636);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method273(65280);
            this.field4046 = new short[var6];
            this.field4043 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4043[var7] = (short) arg2.method300(-1394191632);
                this.field4046[var7] = (short) arg2.method300(class203.method1462(arg1, -1394191628));
            }
        }
        if (arg1 != 4) {
            this.field4063 = -56;
        }
        field4062++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILhb;)V", line = 101)
    public final void method1869(int arg0, class35 arg1) {
        field4052++;
        while (true) {
            int var3 = arg1.method273(65280);
            if (var3 == 0) {
                if (arg0 != 26802) {
                    this.method1868(-42, 51, (class35) null);
                }
                return;
            }
            this.method1868(var3, 4, arg1);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIII)I", line = 128)
    public static final int method1870(int arg0, int arg1, int arg2, int arg3) {
        field4056++;
        if ((class208.field3272[arg3][arg1][arg0] & 0x8) == 0) {
            if (arg2 != -30) {
                method1872(-10);
            }
            return arg3 <= 0 || (class208.field3272[1][arg1][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BIII)Laj;", line = 147)
    public final class1 method1871(byte arg0, int arg1, int arg2, int arg3) {
        class1 var5 = (class1) class81.field1127.method1432((byte) 113, (long) this.field4048);
        field4047++;
        if (var5 == null) {
            class42 var6 = class42.method404(class55.field820, this.field4045, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field4049 != null) {
                for (int var7 = 0; var7 < this.field4049.length; var7++) {
                    var6.method383(this.field4049[var7], this.field4044[var7]);
                }
            }
            if (this.field4043 != null) {
                for (int var8 = 0; var8 < this.field4043.length; var8++) {
                    var6.method377(this.field4043[var8], this.field4046[var8]);
                }
            }
            var5 = var6.method379(this.field4060 + 64, this.field4063 + 850, -30, -50, -30);
            class81.field1127.method1436(false, var5, (long) this.field4048);
        }
        class1 var9;
        if (this.field4050 == -1 || arg2 == -1) {
            var9 = var5.method26(true, true, true);
        } else {
            var9 = class173.method1259((byte) 119, this.field4050).method1162(arg3, var5, arg2, (byte) 119, arg1);
        }
        if (this.field4061 != 128 || this.field4053 != 128) {
            var9.method2(this.field4061, this.field4053, this.field4061);
        }
        int var10 = 86 / ((-arg0 - 21) / 52);
        if (this.field4059 != 0) {
            if (this.field4059 == 90) {
                var9.method9();
            }
            if (this.field4059 == 180) {
                var9.method5();
            }
            if (this.field4059 == 270) {
                var9.method14();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 222)
    public static void method1872(int arg0) {
        field4058 = null;
        if (arg0 != 0) {
            method1872(-127);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IC)C", line = 236)
    public static final char method1873(int arg0, char arg1) {
        field4051++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (~arg1 == arg0) {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILlb;II)[Lvd;", line = 261)
    public static final class134[] method1874(int arg0, class211 arg1, int arg2, int arg3) {
        if (arg2 <= 33) {
            method1870(64, 98, -17, 15);
        }
        field4054++;
        return class297.method2093(arg3, arg0, (byte) 113, arg1) ? class294.method2077(119) : null;
    }
}
