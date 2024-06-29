import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class555 extends class211 {

    @OriginalMember(owner = "client!iba", name = "T", descriptor = "I")
    private int field8268 = 0;

    @OriginalMember(owner = "client!iba", name = "N", descriptor = "I")
    private int field8272 = 8;

    @OriginalMember(owner = "client!iba", name = "L", descriptor = "I")
    private int field8269 = 81;

    @OriginalMember(owner = "client!iba", name = "M", descriptor = "I")
    private int field8278 = 1024;

    @OriginalMember(owner = "client!iba", name = "P", descriptor = "I")
    private int field8275 = 409;

    @OriginalMember(owner = "client!iba", name = "I", descriptor = "I")
    private int field8283 = 4;

    @OriginalMember(owner = "client!iba", name = "J", descriptor = "I")
    private int field8284 = 204;

    @OriginalMember(owner = "client!iba", name = "R", descriptor = "I")
    private int field8276 = 1024;

    @OriginalMember(owner = "client!iba", name = "fb", descriptor = "[Ljava/lang/String;")
    private static final String[] field8289 = new String[] { method4180(method4179("y2pO_8")), method4180(method4179("~%}\r")), method4180(method4179("y2pOW8")), method4180(method4179("k~?Oi")), method4180(method4179("y2pOU8")), method4180(method4179("y2pOV8")), method4180(method4179("y2pOQ8")), method4180(method4179("y2pOP8")), method4180(method4179("y2pOR8")) };

    @OriginalMember(owner = "client!iba", name = "V", descriptor = "Ljava/util/Calendar;")
    public static Calendar field8270 = Calendar.getInstance();

    @OriginalMember(owner = "client!iba", name = "C", descriptor = "Ljava/util/Calendar;")
    public static Calendar field8262 = Calendar.getInstance(TimeZone.getTimeZone(method4180(method4179("W\u001dE"))));

    @OriginalMember(owner = "client!iba", name = "Q", descriptor = "I")
    public static int field8280 = 0;

    @OriginalMember(owner = "client!iba", name = "D", descriptor = "Lel;")
    public static class573 field8286 = new class573(55, 0);

    @OriginalMember(owner = "client!iba", name = "K", descriptor = "Ldv;")
    public static class685 field8288 = new class685(14, 0, 4, 1);

    @OriginalMember(owner = "client!iba", name = "eb", descriptor = "I")
    public static int field8260;

    @OriginalMember(owner = "client!iba", name = "cb", descriptor = "I")
    private int field8263;

    @OriginalMember(owner = "client!iba", name = "X", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!iba", name = "H", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!iba", name = "ab", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!iba", name = "F", descriptor = "I")
    private int field8271;

    @OriginalMember(owner = "client!iba", name = "db", descriptor = "I")
    public static int field8277;

    @OriginalMember(owner = "client!iba", name = "S", descriptor = "I")
    public static int field8279;

    @OriginalMember(owner = "client!iba", name = "O", descriptor = "I")
    private int field8281;

    @OriginalMember(owner = "client!iba", name = "E", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!iba", name = "Z", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!iba", name = "G", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!iba", name = "W", descriptor = "[I")
    private int[] field8274;

    @OriginalMember(owner = "client!iba", name = "Y", descriptor = "[Ls;")
    public static class294[] field8261;

    @OriginalMember(owner = "client!iba", name = "bb", descriptor = "[[I")
    private int[][] field8266;

    @OriginalMember(owner = "client!iba", name = "U", descriptor = "[[I")
    private int[][] field8273;

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "()V", line = 4)
    public class555() {
        super(0, true);
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(BILib;)V", line = 8)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg0 < 67) {
                this.field8269 = 82;
            }
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (~arg1 != -5) {
                                if (~arg1 != -6) {
                                    if (arg1 != 6) {
                                        if (~arg1 == -8) {
                                            this.field8278 = arg2.method1445((byte) 113);
                                        }
                                    } else {
                                        this.field8269 = arg2.method1445((byte) 109);
                                    }
                                } else {
                                    this.field8268 = arg2.method1445((byte) 107);
                                }
                            } else {
                                this.field8276 = arg2.method1445((byte) 112);
                            }
                        } else {
                            this.field8284 = arg2.method1445((byte) 125);
                        }
                    } else {
                        this.field8275 = arg2.method1445((byte) 117);
                    }
                } else {
                    this.field8272 = arg2.method1455((byte) 62);
                }
            } else {
                this.field8283 = arg2.method1455((byte) 62);
            }
            ++field8260;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8289[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8289[3] : field8289[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILnw;)I", line = 98)
    public static final int method4175(int arg0, class612 arg1) {
        try {
            ++field8264;
            class496 var2 = arg1.field8947;
            if (var2.field7110 != null) {
                var2 = var2.method3742(-1, class276.field4168);
                if (var2 == null) {
                    return -1;
                }
            }
            int var3 = var2.field7179;
            class144 var4 = arg1.method2099(arg0 ^ -121);
            if (arg1.field3796 != arg0 && !arg1.field3849) {
                if (arg1.field3796 != var4.field1729 && arg1.field3796 != var4.field1742 && ~arg1.field3796 != ~var4.field1763 && ~arg1.field3796 != ~var4.field1748) {
                    if (~arg1.field3796 == ~var4.field1725 || ~arg1.field3796 == ~var4.field1773 || ~arg1.field3796 == ~var4.field1745 || arg1.field3796 == var4.field1735) {
                        var3 = var2.field7166;
                    }
                } else {
                    var3 = var2.field7122;
                }
            } else {
                var3 = var2.field7163;
            }
            return var3;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8289[4] + arg0 + ',' + (arg1 != null ? field8289[3] : field8289[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(B)V", line = 133)
    private final void method4176(byte arg0) {
        try {
            ++field8267;
            Random var2 = new Random((long) this.field8272);
            this.field8281 = this.field8269 / 2;
            int var3 = 77 / ((arg0 - -28) / 61);
            this.field8271 = 4096 / this.field8272;
            this.field8263 = 4096 / this.field8283;
            int var4 = this.field8263 / 2;
            int var5 = this.field8271 / 2;
            this.field8274 = new int[this.field8272 + 1];
            this.field8266 = new int[this.field8272][this.field8283 + 1];
            this.field8273 = new int[this.field8272][this.field8283];
            this.field8274[0] = 0;
            for (int var6 = 0; var6 < this.field8272; ++var6) {
                if (~var6 < -1) {
                    int var7 = this.field8271;
                    int var8 = (-2048 + class656.method4817(4096, var2, (byte) -38)) * this.field8284 >> 12;
                    int var9 = (var5 * var8 >> 12) + var7;
                    this.field8274[var6] = this.field8274[var6 - 1] - -var9;
                }
                this.field8266[var6][0] = 0;
                for (int var10 = 0; var10 < this.field8283; ++var10) {
                    if (~var10 < -1) {
                        int var11 = this.field8263;
                        int var12 = (-2048 + class656.method4817(4096, var2, (byte) -37)) * this.field8275 >> 12;
                        int var13 = (var4 * var12 >> 12) + var11;
                        this.field8266[var6][var10] = this.field8266[var6][var10 + -1] - -var13;
                    }
                    this.field8273[var6][var10] = ~this.field8278 < -1 ? -class656.method4817(this.field8278, var2, (byte) -121) + 4096 : 4096;
                }
                this.field8266[var6][this.field8283] = 4096;
            }
            this.field8274[this.field8272] = 4096;
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field8289[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(II)[I", line = 208)
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field8265;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (arg0 != 8217) {
                method4178(82);
            }
            if (super.field3231.field57) {
                int var4 = 0;
                int var5;
                for (var5 = class302.field4735[arg1] + this.field8268; ~var5 > -1; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (var4 < this.field8272 && this.field8274[var4] <= var5) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = (var4 & 1) == 0;
                int var8 = this.field8274[var4];
                int var9 = this.field8274[var4 + -1];
                if (~(this.field8281 + var9) > ~var5 && var5 < var8 - this.field8281) {
                    for (int var10 = 0; var10 < class343.field5332; ++var10) {
                        int var11 = 0;
                        int var12 = !var7 ? -this.field8276 : this.field8276;
                        int var13;
                        for (var13 = class88.field997[var10] - -(this.field8263 * var12 >> 12); var13 < 0; var13 += 4096) {
                        }
                        while (var13 > 4096) {
                            var13 -= 4096;
                        }
                        while (~var11 > ~this.field8283 && ~this.field8266[var6][var11] >= ~var13) {
                            ++var11;
                        }
                        int var14 = var11 + -1;
                        int var15 = this.field8266[var6][var14];
                        int var16 = this.field8266[var6][var11];
                        if (var15 - -this.field8281 < var13 && var13 < -this.field8281 + var16) {
                            var3[var10] = this.field8273[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class467.method3551(var3, 0, class343.field5332, 0);
                }
            }
            return var3;
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field8289[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIB)Z", line = 317)
    public static final boolean method4177(int arg0, int arg1, byte arg2) {
        try {
            ++field8279;
            int var3 = 55 / ((arg2 - -25) / 48);
            return (458752 & arg1) != 0 | class199.method1787(arg0, arg1, true) || class318.method2690((byte) 79, arg1, arg0);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8289[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(I)V", line = 330)
    public static void method4178(int arg0) {
        try {
            field8262 = null;
            field8288 = null;
            field8286 = null;
            field8261 = null;
            if (arg0 == 4096) {
                field8270 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8289[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V", line = 359)
    public final void method437(int arg0) {
        try {
            ++field8277;
            if (arg0 == 27132) {
                this.method4176((byte) 90);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8289[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4179(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 20);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4180(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 16;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 17;
                    break;
                case 3:
                    var10005 = 97;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
