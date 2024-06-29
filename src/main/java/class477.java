import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class477 {

    @OriginalMember(owner = "client!dfa", name = "h", descriptor = "I")
    private int field7042 = 0;

    @OriginalMember(owner = "client!dfa", name = "k", descriptor = "[Lwb;")
    public class578[] field7038;

    @OriginalMember(owner = "client!dfa", name = "o", descriptor = "I")
    public int field7031;

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7046 = new String[] { method3702(method3701("0%\f\u0001")), method3702(method3701(":6\u0001Cmv")), method3702(method3701("%~NCU")), method3702(method3701(":6\u0001Cov")), method3702(method3701(":6\u0001Cjv")), method3702(method3701(":6\u0001C`v")), method3702(method3701(":6\u0001Clv")), method3702(method3701(":6\u0001Ckv")), method3702(method3701(":6\u0001Civ")), method3702(method3701(":6\u0001Cbv")), method3702(method3701(":6\u0001Cav")), method3702(method3701(":6\u0001C\u00147>\t\u0019\u0016v")), method3702(method3701(":6\u0001Cnv")), method3702(method3701(":6\u0001Ccv")) };

    @OriginalMember(owner = "client!dfa", name = "l", descriptor = "I")
    public static int field7028 = -1;

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "[F")
    public static float[] field7036 = new float[4];

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "I")
    public static int field7032 = 0;

    @OriginalMember(owner = "client!dfa", name = "i", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!dfa", name = "g", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!dfa", name = "q", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!dfa", name = "n", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!dfa", name = "p", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!dfa", name = "m", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!dfa", name = "r", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "J")
    private long field7033;

    @OriginalMember(owner = "client!dfa", name = "j", descriptor = "Lwb;")
    private class578 field7034;

    @OriginalMember(owner = "client!dfa", name = "s", descriptor = "Lwb;")
    private class578 field7044;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)V", line = 3)
    public final void method3690(byte arg0) {
        try {
            if (arg0 <= 9) {
                this.field7042 = -41;
            }
            for (int var2 = 0; var2 < this.field7031; var2++) {
                class578 var3 = this.field7038[var2];
                while (true) {
                    class578 var4 = var3.field8373;
                    if (var3 == var4) {
                        break;
                    }
                    var4.method4294(0);
                }
            }
            field7045++;
            this.field7044 = null;
            this.field7034 = null;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7046[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lwb;JI)V", line = 38)
    public final void method3691(class578 arg0, long arg1, int arg2) {
        try {
            field7029++;
            if (arg0.field8374 != null) {
                arg0.method4294(0);
            }
            class578 var5 = this.field7038[(int) ((long) (this.field7031 + arg2) & arg1)];
            arg0.field8373 = var5;
            arg0.field8374 = var5.field8374;
            arg0.field8374.field8373 = arg0;
            arg0.field8378 = arg1;
            arg0.field8373.field8374 = arg0;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7046[1] + (arg0 == null ? field7046[0] : field7046[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "(I)I", line = 56)
    public final int method3692(int arg0) {
        try {
            field7043++;
            int var2 = 0;
            if (arg0 != 21538) {
                method3700(-56);
            }
            for (int var3 = 0; var3 < this.field7031; var3++) {
                class578 var4 = this.field7038[var3];
                for (class578 var5 = var4.field8373; var5 != var4; var5 = var5.field8373) {
                    var2++;
                }
            }
            return var2;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7046[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZJ)Lwb;", line = 87)
    public final class578 method3693(boolean arg0, long arg1) {
        try {
            field7027++;
            this.field7033 = arg1;
            class578 var4 = this.field7038[(int) (arg1 & (long) (this.field7031 - 1))];
            for (this.field7034 = var4.field8373; this.field7034 != var4; this.field7034 = this.field7034.field8373) {
                if (this.field7034.field8378 == arg1) {
                    class578 var5 = this.field7034;
                    this.field7034 = this.field7034.field8373;
                    return var5;
                }
            }
            if (arg0) {
                this.method3698(74);
            }
            this.field7034 = null;
            return null;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7046[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B[Lwb;)I", line = 120)
    public final int method3694(byte arg0, class578[] arg1) {
        try {
            field7039++;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field7031; var4++) {
                class578 var5 = this.field7038[var4];
                for (class578 var6 = var5.field8373; var6 != var5; var6 = var6.field8373) {
                    arg1[var3++] = var6;
                }
            }
            if (arg0 >= -94) {
                this.field7034 = null;
            }
            return var3;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field7046[7] + arg0 + ',' + (arg1 == null ? field7046[0] : field7046[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZIIJ)Ljava/lang/String;", line = 161)
    public static final String method3695(boolean arg0, int arg1, int arg2, long arg3) {
        try {
            field7037++;
            if (arg1 >= -85) {
                method3700(-36);
            }
            Calendar var5;
            if (arg0) {
                class419.method3265(arg3, true);
                var5 = class267.field3791;
            } else {
                class635.method4635(true, arg3);
                var5 = class267.field3785;
            }
            int var6 = var5.get(5);
            int var7 = var5.get(2) + 1;
            int var8 = var5.get(1);
            int var9 = var5.get(11);
            int var10 = var5.get(12);
            return Integer.toString(var6 / 10) + var6 % 10 + "/" + var7 / 10 + var7 % 10 + "/" + var8 % 100 / 10 + var8 % 10 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field7046[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)Lwb;", line = 194)
    public final class578 method3696(int arg0) {
        try {
            this.field7042 = arg0;
            field7030++;
            return this.method3697(-97);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7046[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)Lwb;", line = 203)
    public final class578 method3697(int arg0) {
        try {
            if (arg0 > -39) {
                this.method3693(false, 13L);
            }
            field7041++;
            if (this.field7042 > 0 && this.field7038[this.field7042 - 1] != this.field7044) {
                class578 var2 = this.field7044;
                this.field7044 = var2.field8373;
                return var2;
            }
            while (this.field7042 < this.field7031) {
                class578 var3 = this.field7038[this.field7042++].field8373;
                if (this.field7038[this.field7042 - 1] != var3) {
                    this.field7044 = var3.field8373;
                    return var3;
                }
            }
            return null;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7046[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(I)I", line = 235)
    public final int method3698(int arg0) {
        try {
            field7040++;
            int var2 = -20 % ((arg0 + 35) / 60);
            return this.field7031;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7046[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(I)V", line = 252)
    public class477(int arg0) {
        try {
            this.field7038 = new class578[arg0];
            this.field7031 = arg0;
            for (int var2 = 0; var2 < arg0; var2++) {
                class578 var3 = this.field7038[var2] = new class578();
                var3.field8373 = var3;
                var3.field8374 = var3;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7046[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "(I)Lwb;", line = 273)
    public final class578 method3699(int arg0) {
        try {
            field7035++;
            if (this.field7034 == null) {
                return null;
            }
            class578 var2 = this.field7038[(int) (this.field7033 & (long) (this.field7031 + arg0))];
            while (this.field7034 != var2) {
                if (this.field7034.field8378 == this.field7033) {
                    class578 var3 = this.field7034;
                    this.field7034 = this.field7034.field8373;
                    return var3;
                }
                this.field7034 = this.field7034.field8373;
            }
            this.field7034 = null;
            return null;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7046[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "(I)V", line = 304)
    public static void method3700(int arg0) {
        try {
            field7036 = null;
            if (arg0 != 100) {
                field7028 = -9;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7046[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3701(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3702(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 94;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 96;
                    break;
                case 3:
                    var10005 = 109;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
