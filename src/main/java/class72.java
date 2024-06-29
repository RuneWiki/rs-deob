import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class72 {

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Ltb;")
    private class450 field977 = new class450(64);

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "Ltb;")
    public class450 field987 = new class450(50);

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "Laaa;")
    public class102 field989 = new class102(250);

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "Lpi;")
    private class465 field990 = new class465();

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "Lpl;")
    private class612 field986;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Lpl;")
    public class612 field973;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Z")
    private boolean field984;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "Ldp;")
    private class468 field991;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field994;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field992;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lwp;")
    public static class453 field969 = new class453(53, 2);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZLr;ILkn;ZILr;ILla;II)Lf;", line = 3)
    public final class536 method422(int arg0, boolean arg1, class566 arg2, int arg3, class498 arg4, boolean arg5, int arg6, class566 arg7, int arg8, class413 arg9, int arg10, int arg11) {
        field975++;
        class536 var13 = this.method427(arg8, arg6, arg4, arg7, arg10, arg3, 127, arg0);
        if (var13 != null) {
            return var13;
        }
        class3 var14 = this.method434(12388, arg6);
        if (arg10 > 1 && var14.field107 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field73[var16] <= arg10 && var14.field73[var16] != 0) {
                    var15 = var14.field107[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method434(12388, var15);
            }
        }
        int[] var17 = var14.method26(arg9, arg10, arg1, arg4, arg2, arg8, 97, arg7, arg0, arg3);
        if (var17 == null) {
            return null;
        }
        class536 var18;
        if (arg5) {
            var18 = arg2.method1025(var17, 0, 36, 36, 32);
        } else {
            var18 = arg7.method1025(var17, 0, 36, 36, 32);
        }
        if (arg11 < 103) {
            return null;
        }
        if (!arg5) {
            class465 var19 = new class465();
            var19.field5919 = arg7.field7890;
            var19.field5917 = arg3;
            var19.field5915 = arg4 != null;
            var19.field5920 = arg8;
            var19.field5923 = arg6;
            var19.field5921 = arg10;
            var19.field5916 = arg0;
            this.field989.method581(var18, var19, (byte) 41);
        }
        return var18;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)Ltba;", line = 71)
    public static final class704 method423(int arg0) {
        if (arg0 != 18375) {
            field969 = null;
        }
        field970++;
        return class219.field2683 == 0 ? new class704() : class461.field5879[--class219.field2683];
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V", line = 89)
    public static final void method424(int arg0, int arg1) {
        field972++;
        class592 var2 = class61.method371(5, arg0, (byte) 118);
        var2.method3253(arg1);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V", line = 99)
    public final void method425(int arg0) {
        int var2 = -53 / ((18 - arg0) / 35);
        class102 var3 = this.field989;
        synchronized (this.field989) {
            this.field989.method587((byte) 77);
        }
        field985++;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V", line = 118)
    public final void method426(int arg0, int arg1) {
        field968++;
        class450 var3 = this.field977;
        synchronized (this.field977) {
            this.field977.method2411(true, arg0);
        }
        class450 var4 = this.field987;
        synchronized (this.field987) {
            this.field987.method2411(true, arg0);
        }
        class102 var5 = this.field989;
        synchronized (this.field989) {
            if (arg1 == 50) {
                this.field989.method585(arg0, arg1 - 50);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILkn;Lr;IIII)Lf;", line = 137)
    public final class536 method427(int arg0, int arg1, class498 arg2, class566 arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field990.field5920 = arg0;
        this.field990.field5923 = arg1;
        this.field990.field5919 = arg3.field7890;
        field981++;
        this.field990.field5915 = arg2 != null;
        if (arg6 < 122) {
            this.method425(-22);
        }
        this.field990.field5921 = arg4;
        this.field990.field5917 = arg5;
        this.field990.field5916 = arg7;
        return (class536) this.field989.method578((byte) 123, this.field990);
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V", line = 155)
    public final void method428(int arg0) {
        class450 var2 = this.field977;
        synchronized (this.field977) {
            this.field977.method2406(18385);
            if (arg0 <= 107) {
                this.method427(-18, 29, null, null, 80, -126, 89, 26);
            }
        }
        field988++;
        class450 var3 = this.field987;
        synchronized (this.field987) {
            this.field987.method2406(18385);
        }
        class102 var4 = this.field989;
        synchronized (this.field989) {
            this.field989.method587((byte) 77);
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V", line = 174)
    public final void method429(int arg0) {
        field983++;
        class450 var2 = this.field987;
        synchronized (this.field987) {
            this.field987.method2406(18385);
            if (arg0 != 0) {
                this.field990 = null;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V", line = 187)
    public final void method430(int arg0) {
        field982++;
        class450 var2 = this.field977;
        synchronized (this.field977) {
            this.field977.method2412((byte) 51);
        }
        class450 var3 = this.field987;
        synchronized (this.field987) {
            this.field987.method2412((byte) -122);
        }
        class102 var4 = this.field989;
        synchronized (this.field989) {
            if (arg0 == 0) {
                this.field989.method579((byte) 64);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V", line = 207)
    public final void method431(boolean arg0, int arg1) {
        field978++;
        if (this.field984 == arg0) {
            return;
        }
        this.field984 = arg0;
        this.method428(127);
        if (arg1 != 5) {
            field969 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)V", line = 229)
    public static void method432(int arg0) {
        field969 = null;
        if (arg0 != -11) {
            field969 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)V", line = 242)
    public final void method433(int arg0, int arg1) {
        field979++;
        if (arg0 != -12209) {
            this.field977 = null;
        }
        this.field993 = arg1;
        class450 var3 = this.field987;
        synchronized (this.field987) {
            this.field987.method2406(18385);
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lrf;IZLdp;Lpl;Lpl;)V", line = 356)
    public class72(class112 arg0, int arg1, boolean arg2, class468 arg3, class612 arg4, class612 arg5) {
        this.field986 = arg4;
        this.field973 = arg5;
        this.field976 = arg1;
        this.field984 = arg2;
        this.field991 = arg3;
        if (this.field986 == null) {
            this.field974 = 0;
        } else {
            int var7 = this.field986.method3342((byte) -107) - 1;
            this.field974 = this.field986.method3349(var7, true) + var7 * 256;
        }
        this.field994 = new String[] { null, null, class83.field1115.method476((byte) -78, this.field976), null, null };
        this.field992 = new String[] { null, null, null, null, class83.field1116.method476((byte) -43, this.field976) };
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(II)Luv;", line = 262)
    public final class3 method434(int arg0, int arg1) {
        field980++;
        if (arg0 != 12388) {
            return null;
        }
        class450 var3 = this.field977;
        class3 var4;
        synchronized (this.field977) {
            var4 = (class3) this.field977.method2418((long) arg1, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field986;
        byte[] var6;
        synchronized (this.field986) {
            var6 = this.field986.method3365(class602.method3305(arg1, (byte) 75), arg0 ^ 0xFFFFCFE2, class11.method87(-21557, arg1));
        }
        class3 var7 = new class3();
        var7.field56 = arg1;
        var7.field77 = this;
        var7.field39 = new String[] { null, null, class83.field1115.method476((byte) 100, this.field976), null, null };
        var7.field53 = new String[] { null, null, null, null, class83.field1116.method476((byte) -80, this.field976) };
        if (var6 != null) {
            var7.method13(30035, new class630(var6));
        }
        var7.method29(114);
        if (var7.field38 != -1) {
            var7.method32(this.method434(12388, var7.field38), this.method434(12388, var7.field100), arg0 ^ 0xFFFFCFA7);
        }
        if (var7.field37 != -1) {
            var7.method23(-22824, this.method434(12388, var7.field60), this.method434(arg0, var7.field37));
        }
        if (!this.field984 && var7.field33) {
            var7.field34 = class83.field1113.method476((byte) 81, this.field976);
            var7.field39 = this.field994;
            var7.field53 = this.field992;
            var7.field98 = 0;
            var7.field80 = null;
            var7.field74 = false;
            if (var7.field27 != null) {
                boolean var8 = false;
                for (class329 var9 = var7.field27.method407((byte) 124); var9 != null; var9 = var7.field27.method403(12561)) {
                    class207 var10 = this.field991.method2477((byte) 6, (int) var9.field4199);
                    if (var10.field2623) {
                        var9.method1871(-106);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field27 = null;
                }
            }
        }
        class450 var11 = this.field977;
        synchronized (this.field977) {
            this.field977.method2409((long) arg1, var7, 1);
            return var7;
        }
    }
}
