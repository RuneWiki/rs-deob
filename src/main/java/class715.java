import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class715 {

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    private int field10099 = 0;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public int field10086;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "[Lqm;")
    public class430[] field10088;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "[I")
    public static int[] field10091 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "[I")
    public static int[] field10101 = new int[3];

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field10084;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field10087;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field10089;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    public static int field10090;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public static int field10092;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    public static int field10093;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public static int field10094;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public static int field10095;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    public static int field10096;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public static int field10098;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public static int field10102;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    public static int field10103;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "J")
    private long field10097;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "Lqm;")
    private class430 field10085;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "Lqm;")
    private class430 field10100;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qp", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field10104;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4024(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V", line = 6)
    public static void method4012(byte arg0) {
        field10091 = null;
        int var1 = -103 % ((arg0 + 41) / 60);
        field10101 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V", line = 16)
    public final void method4013(int arg0) {
        int var2 = 0;
        if (arg0 != -3) {
            this.method4021((byte) -106);
        }
        while (this.field10086 > var2) {
            class430 var3 = this.field10088[var2];
            while (true) {
                class430 var4 = var3.field6189;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method2656((byte) 124);
            }
        }
        field10084++;
        this.field10085 = null;
        this.field10100 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BLjava/lang/String;ZLjava/lang/String;)V", line = 49)
    public static final void method4014(byte arg0, String arg1, boolean arg2, String arg3) {
        class669.field9541 = arg3;
        class505.field7344 = arg1;
        class183.field2511 = arg2;
        field10098++;
        if (arg0 != 7) {
            field10091 = null;
        }
        if (!class183.field2511 && class505.field7344.equals("") || class669.field9541.equals("")) {
            class743.method4134(true, 3);
            return;
        }
        class298.field4067 = false;
        if (class39.field672 != 1) {
            class228.field3417 = -1;
            class666.field9518 = 0;
        }
        class743.method4134(true, -3);
        class35.field318 = 1;
        class42.field704 = 0;
        class288.field3993 = 0;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)I", line = 84)
    public final int method4015(int arg0) {
        if (arg0 == -1694) {
            field10096++;
            return this.field10086;
        } else {
            return 79;
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)V", line = 95)
    public static final void method4016(byte arg0) {
        field10090++;
        if (arg0 != 38) {
            method4014((byte) 22, null, true, null);
        }
        if (class345.field4749.field4100) {
            class597.field8492 = 96;
            return;
        }
        try {
            Method var1 = (field10104 == null ? (field10104 = method4024("java.lang.Runtime")) : field10104).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class597.field8492 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "([Lqm;I)I", line = 135)
    public final int method4017(class430[] arg0, int arg1) {
        field10094++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field10086; var4++) {
            class430 var5 = this.field10088[var4];
            for (class430 var6 = var5.field6189; var6 != var5; var6 = var6.field6189) {
                arg0[var3++] = var6;
            }
        }
        if (arg1 < 69) {
            this.method4021((byte) 96);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(B)Lqm;", line = 168)
    public final class430 method4018(byte arg0) {
        if (arg0 < 72) {
            method4012((byte) -11);
        }
        field10093++;
        if (this.field10085 == null) {
            return null;
        }
        class430 var2 = this.field10088[(int) ((long) (this.field10086 - 1) & this.field10097)];
        while (this.field10085 != var2) {
            if (this.field10085.field6188 == this.field10097) {
                class430 var3 = this.field10085;
                this.field10085 = this.field10085.field6189;
                return var3;
            }
            this.field10085 = this.field10085.field6189;
        }
        this.field10085 = null;
        return null;
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)I", line = 205)
    public final int method4019(int arg0) {
        field10102++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field10086; var3++) {
            class430 var4 = this.field10088[var3];
            for (class430 var5 = var4.field6189; var5 != var4; var5 = var5.field6189) {
                var2++;
            }
        }
        if (arg0 != 7) {
            this.field10086 = 40;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(I)V", line = 237)
    public class715(int arg0) {
        this.field10086 = arg0;
        this.field10088 = new class430[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class430 var3 = this.field10088[var2] = new class430();
            var3.field6189 = var3;
            var3.field6186 = var3;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(JB)Lqm;", line = 258)
    public final class430 method4020(long arg0, byte arg1) {
        this.field10097 = arg0;
        field10089++;
        class430 var4 = this.field10088[(int) ((long) (this.field10086 - 1) & arg0)];
        if (arg1 > -57) {
            return null;
        }
        for (this.field10085 = var4.field6189; this.field10085 != var4; this.field10085 = this.field10085.field6189) {
            if (this.field10085.field6188 == arg0) {
                class430 var5 = this.field10085;
                this.field10085 = this.field10085.field6189;
                return var5;
            }
        }
        this.field10085 = null;
        return null;
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "(B)Lqm;", line = 295)
    public final class430 method4021(byte arg0) {
        field10095++;
        if (arg0 != 80) {
            this.method4023((byte) 62);
        }
        if (this.field10099 > 0 && this.field10088[this.field10099 - 1] != this.field10100) {
            class430 var2 = this.field10100;
            this.field10100 = var2.field6189;
            return var2;
        }
        while (this.field10086 > this.field10099) {
            class430 var3 = this.field10088[this.field10099++].field6189;
            if (this.field10088[this.field10099 - 1] != var3) {
                this.field10100 = var3.field6189;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lqm;IJ)V", line = 329)
    public final void method4022(class430 arg0, int arg1, long arg2) {
        int var5 = 115 % ((24 - arg1) / 59);
        if (arg0.field6186 != null) {
            arg0.method2656((byte) 125);
        }
        field10092++;
        class430 var6 = this.field10088[(int) ((long) (this.field10086 - 1) & arg2)];
        arg0.field6186 = var6.field6186;
        arg0.field6189 = var6;
        arg0.field6186.field6189 = arg0;
        arg0.field6188 = arg2;
        arg0.field6189.field6186 = arg0;
    }

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "(B)Lqm;", line = 351)
    public final class430 method4023(byte arg0) {
        if (arg0 >= -23) {
            return null;
        } else {
            this.field10099 = 0;
            field10103++;
            return this.method4021((byte) 80);
        }
    }
}
