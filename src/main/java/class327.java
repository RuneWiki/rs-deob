import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class327 {

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Lec;")
    public class45 field5199 = new class45();

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5191 = "Discard";

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5198 = "Examine";

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field5197 = 0;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field5202 = new String[1000];

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "Ltk;")
    public static class46 field5211 = new class46();

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "F")
    public static float field5213;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Lvl;")
    public static class164 field5194;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "Lec;")
    private class45 field5214;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Lth;")
    public static class57 field5203;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLec;)V", line = 5)
    public final void method2299(boolean arg0, class45 arg1) {
        field5190++;
        if (arg1.field699 != null) {
            arg1.method330(15);
        }
        arg1.field708 = this.field5199.field708;
        if (arg0) {
            this.method2307((byte) -85);
        }
        arg1.field699 = this.field5199;
        arg1.field699.field708 = arg1;
        arg1.field708.field699 = arg1;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)Lec;", line = 26)
    public final class45 method2300(byte arg0) {
        if (arg0 < 95) {
            method2310((byte) -31);
        }
        class45 var2 = this.field5199.field708;
        field5195++;
        if (this.field5199 == var2) {
            this.field5214 = null;
            return null;
        } else {
            this.field5214 = var2.field708;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 49)
    public final void method2301(int arg0) {
        while (true) {
            class45 var2 = this.field5199.field708;
            if (this.field5199 == var2) {
                if (arg0 != -23) {
                    return;
                }
                this.field5214 = null;
                field5193++;
                return;
            }
            var2.method330(arg0 + 38);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLec;)V", line = 73)
    public final void method2302(byte arg0, class45 arg1) {
        field5192++;
        if (arg1.field699 != null) {
            arg1.method330(15);
        }
        arg1.field708 = this.field5199;
        arg1.field699 = this.field5199.field699;
        if (arg0 > -20) {
            this.method2308(20);
        }
        arg1.field699.field708 = arg1;
        arg1.field708.field699 = arg1;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V", line = 94)
    public static void method2303(int arg0) {
        field5202 = null;
        field5211 = null;
        field5194 = null;
        field5203 = null;
        field5191 = null;
        if (arg0 != 0) {
            field5213 = 1.627898F;
        }
        field5198 = null;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)Lec;", line = 110)
    public final class45 method2304(int arg0) {
        class45 var2 = this.field5214;
        if (arg0 != 0) {
            return (class45) null;
        }
        field5196++;
        if (this.field5199 == var2) {
            this.field5214 = null;
            return null;
        } else {
            this.field5214 = var2.field699;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZIJI)Z", line = 135)
    public static final boolean method2305(boolean arg0, int arg1, long arg2, int arg3) {
        int var5 = (int) arg2 >> 14 & 0x1F;
        field5210++;
        int var6 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
        if (!arg0) {
            method2309(120, 116, 16, -48, 114);
        }
        int var7 = ((int) arg2 & 0x3CB16D) >> 20;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class29 var8 = class166.method1292(0, var6);
            int var9 = var8.field399;
            int var10;
            int var11;
            if (var7 == 0 || var7 == 2) {
                var11 = var8.field414;
                var10 = var8.field342;
            } else {
                var10 = var8.field414;
                var11 = var8.field342;
            }
            if (var7 != 0) {
                var9 = (var9 >> 4 - var7) + (var9 << var7 & 0xF);
            }
            class160.method1245(arg1, arg3, var10, var9, var11, 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
        } else {
            class160.method1245(arg1, arg3, 0, 0, 0, 19324, true, class6.field55.field3553[0], var5 + 1, class6.field55.field3519[0], var7);
        }
        return true;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)Lec;", line = 179)
    public final class45 method2306(int arg0) {
        field5205++;
        if (arg0 != -23) {
            field5197 = 0;
        }
        class45 var2 = this.field5214;
        if (this.field5199 == var2) {
            this.field5214 = null;
            return null;
        } else {
            this.field5214 = var2.field708;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)Lec;", line = 202)
    public final class45 method2307(byte arg0) {
        field5209++;
        class45 var2 = this.field5199.field708;
        if (this.field5199 == var2) {
            return null;
        }
        if (arg0 != 127) {
            field5202 = (String[]) null;
        }
        var2.method330(15);
        return var2;
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)Z", line = 222)
    public final boolean method2308(int arg0) {
        field5207++;
        if (arg0 < 15) {
            this.method2306(117);
        }
        return this.field5199.field708 == this.field5199;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIII)V", line = 235)
    public static final void method2309(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5201++;
        class36.field520.field3760 = 0;
        class36.field520.method1712(20, -83);
        class36.field520.method1712(arg0, -76);
        class36.field520.method1712(arg2, arg3 ^ 0xAAE);
        class36.field520.method1729(arg4, 206);
        if (arg3 != -2760) {
            method2309(42, -15, 107, 93, -61);
        }
        class36.field520.method1729(arg1, 206);
        class247.field4040 = 0;
        class138.field2278 = -3;
        class201.field3207 = 0;
        class20.field231 = 1;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)I", line = 268)
    public static final int method2310(byte arg0) {
        int var1 = -126 % ((-arg0 - 36) / 59);
        field5212++;
        return 6;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)Lec;", line = 278)
    public final class45 method2311(boolean arg0) {
        class45 var2 = this.field5199.field699;
        field5206++;
        if (this.field5199 == var2) {
            this.field5214 = null;
            return null;
        }
        this.field5214 = var2.field699;
        if (!arg0) {
            field5194 = (class164) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 323)
    public class327() {
        this.field5199.field708 = this.field5199;
        this.field5199.field699 = this.field5199;
    }
}
