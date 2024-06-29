import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class654 {

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "B")
    public byte field8965 = 0;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    private int field8975 = 128;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Z")
    public boolean field8964 = false;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    private int field8985 = 0;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public int field8980 = -1;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    private int field8984 = -1;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    private int field8969 = 128;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    private int field8966 = 0;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    private int field8989 = 0;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "Lmu;")
    public static class303 field8977 = new class303(117, 1);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field8973;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public int field8978;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field8982;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    private int field8983;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field8988;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "Lcn;")
    public class516 field8990;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "[S")
    private short[] field8967;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "[S")
    private short[] field8976;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "[S")
    private short[] field8979;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "[S")
    private short[] field8981;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILha;IILlfa;I)Lka;", line = 6)
    public final class472 method3690(int arg0, int arg1, class59 arg2, int arg3, int arg4, class116 arg5, int arg6) {
        if (arg4 != 3172) {
            this.field8981 = null;
        }
        field8982++;
        return this.method3698(arg2, arg6, arg3, null, 0, arg5, arg0, (byte) 5, null, 0, false, 0, (byte) -68, arg1);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILcea;)V", line = 22)
    public final void method3691(int arg0, class215 arg1) {
        field8974++;
        if (arg0 != 28105) {
            return;
        }
        while (true) {
            int var3 = arg1.method1535(255);
            if (var3 == 0) {
                return;
            }
            this.method3696(arg0 ^ 0xFFFF924A, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 46)
    public static void method3692(int arg0) {
        if (arg0 != -13) {
            method3695(-34, (byte) 21, -111);
        }
        field8977 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILat;Z)Ljava/lang/String;", line = 66)
    public static final String method3693(int arg0, class378 arg1, boolean arg2) {
        field8972++;
        if (!arg2) {
            method3692(68);
        }
        if (!client.method1975(arg1).method2099(arg0, !arg2) && arg1.field5417 == null) {
            return null;
        } else if (arg1.field5509 == null || arg1.field5509.length <= arg0 || arg1.field5509[arg0] == null || arg1.field5509[arg0].trim().length() == 0) {
            return class319.field4396 ? "Hidden-" + arg0 : null;
        } else {
            return arg1.field5509[arg0];
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILha;IIILlfa;B)Lka;", line = 93)
    public final class472 method3694(int arg0, class59 arg1, int arg2, int arg3, int arg4, class116 arg5, byte arg6) {
        if (arg6 <= 24) {
            return null;
        } else {
            field8988++;
            return this.method3698(arg1, arg0, arg3, null, 0, arg5, arg2, (byte) 2, null, 0, false, 0, (byte) -68, arg4);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBI)Z", line = 111)
    public static final boolean method3695(int arg0, byte arg1, int arg2) {
        field8970++;
        if (arg1 != 56) {
            method3695(-107, (byte) 118, 32);
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILcea;I)V", line = 122)
    private final void method3696(int arg0, class215 arg1, int arg2) {
        field8963++;
        if (arg0 >= -119) {
            return;
        }
        if (arg2 == 1) {
            this.field8983 = arg1.method1478(842397944);
        } else if (arg2 == 2) {
            this.field8980 = arg1.method1478(842397944);
        } else if (arg2 == 4) {
            this.field8975 = arg1.method1478(842397944);
        } else if (arg2 == 5) {
            this.field8969 = arg1.method1478(842397944);
        } else if (arg2 == 6) {
            this.field8985 = arg1.method1478(842397944);
        } else if (arg2 == 7) {
            this.field8966 = arg1.method1535(255);
        } else if (arg2 == 8) {
            this.field8989 = arg1.method1535(255);
        } else if (arg2 == 9) {
            this.field8984 = 8224;
            this.field8965 = 3;
        } else if (arg2 == 10) {
            this.field8964 = true;
        } else if (arg2 == 11) {
            this.field8965 = 1;
        } else if (arg2 == 12) {
            this.field8965 = 4;
        } else if (arg2 == 13) {
            this.field8965 = 5;
        } else if (arg2 == 14) {
            this.field8965 = 2;
            this.field8984 = arg1.method1535(255) * 256;
        } else if (arg2 == 15) {
            this.field8965 = 3;
            this.field8984 = arg1.method1478(842397944);
        } else if (arg2 == 16) {
            this.field8965 = 3;
            this.field8984 = arg1.method1533((byte) -126);
        } else if (arg2 == 40) {
            int var6 = arg1.method1535(255);
            this.field8967 = new short[var6];
            this.field8979 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field8967[var7] = (short) arg1.method1478(842397944);
                this.field8979[var7] = (short) arg1.method1478(842397944);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method1535(255);
            this.field8981 = new short[var4];
            this.field8976 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8976[var5] = (short) arg1.method1478(842397944);
                this.field8981[var5] = (short) arg1.method1478(842397944);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIZLha;IIILlfa;Ls;ILs;)Lka;", line = 261)
    public final class472 method3697(int arg0, int arg1, int arg2, int arg3, boolean arg4, class59 arg5, int arg6, int arg7, int arg8, class116 arg9, class281 arg10, int arg11, class281 arg12) {
        field8973++;
        if (arg8 != -129) {
            this.method3698(null, 36, -84, null, 43, null, 2, (byte) 54, null, -17, true, -42, (byte) 95, -81);
        }
        return this.method3698(arg5, arg1, arg3, arg10, arg11, arg9, arg0, (byte) 2, arg12, arg2, arg4, arg7, (byte) -68, arg6);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lha;IILs;ILlfa;IBLs;IZIBI)Lka;", line = 285)
    private final class472 method3698(class59 arg0, int arg1, int arg2, class281 arg3, int arg4, class116 arg5, int arg6, byte arg7, class281 arg8, int arg9, boolean arg10, int arg11, byte arg12, int arg13) {
        field8968++;
        int var15 = arg2;
        class691 var16 = this.field8980 == -1 || arg1 == -1 ? null : arg5.method1021(this.field8980, 7);
        boolean var17 = arg10 & this.field8965 != 0;
        if (var16 != null) {
            var15 = arg2 | var16.method3860(arg13, 110, arg1, false);
        }
        if (var17) {
            var15 |= this.field8965 == 3 ? 7 : 2;
        }
        if (this.field8969 != 128) {
            var15 |= 0x2;
        }
        if (this.field8975 != 128 || this.field8985 != 0) {
            var15 |= 0x5;
        }
        class112 var18 = this.field8990.field7196;
        class472 var19;
        synchronized (this.field8990.field7196) {
            var19 = (class472) this.field8990.field7196.method992((long) (this.field8978 |= arg0.field1158 << 29), -122);
        }
        if (var19 == null || arg0.method343(var19.method527(), var15) != 0) {
            if (var19 != null) {
                var15 = arg0.method219(var15, var19.method527());
            }
            int var20 = var15;
            if (this.field8967 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field8976 != null) {
                var20 |= 0x8000;
            }
            class37 var21 = class756.method4222(0, this.field8990.field7187, this.field8983, -1);
            if (var21 == null) {
                return null;
            }
            if (var21.field897 < 13) {
                var21.method458(2, 114);
            }
            var19 = arg0.method174(var21, var20, this.field8990.field7197, this.field8966 + 64, this.field8989 - -850);
            if (this.field8967 != null) {
                for (int var22 = 0; var22 < this.field8967.length; var22++) {
                    var19.method517(this.field8967[var22], this.field8979[var22]);
                }
            }
            if (this.field8976 != null) {
                for (int var23 = 0; var23 < this.field8976.length; var23++) {
                    var19.method491(this.field8976[var23], this.field8981[var23]);
                }
            }
            var19.method484(var15);
            class112 var24 = this.field8990.field7196;
            synchronized (this.field8990.field7196) {
                this.field8990.field7196.method991(var19, (long) (this.field8978 |= arg0.field1158 << 29), (byte) -113);
            }
        }
        if (arg12 != -68) {
            return null;
        }
        class472 var25 = var16 == null ? var19.method504(arg7, var15, true) : var16.method3863(var19, 0, arg13, arg7, arg1, arg6, 663780816, var15);
        if (this.field8975 != 128 || this.field8969 != 128) {
            var25.method483(this.field8975, this.field8969, this.field8975);
        }
        if (this.field8985 != 0) {
            if (this.field8985 == 90) {
                var25.method524(4096);
            }
            if (this.field8985 == 180) {
                var25.method524(8192);
            }
            if (this.field8985 == 270) {
                var25.method524(12288);
            }
        }
        if (var17) {
            var25.method508(this.field8965, this.field8984, arg8, arg3, arg11, arg9, arg4);
        }
        var25.method484(arg2);
        return var25;
    }
}
