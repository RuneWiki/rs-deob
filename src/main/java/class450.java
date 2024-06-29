import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class450 {

    @OriginalMember(owner = "client!ifa", name = "p", descriptor = "Loq;")
    public class379 field6367 = new class379();

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "Llja;")
    public static class744 field6352 = new class744(68, 8);

    @OriginalMember(owner = "client!ifa", name = "t", descriptor = "[I")
    public static int[] field6371 = new int[2];

    @OriginalMember(owner = "client!ifa", name = "s", descriptor = "Lko;")
    public static class531 field6370 = new class531();

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!ifa", name = "h", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!ifa", name = "i", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!ifa", name = "j", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!ifa", name = "k", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!ifa", name = "l", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!ifa", name = "m", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!ifa", name = "n", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!ifa", name = "o", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!ifa", name = "q", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!ifa", name = "r", descriptor = "Loq;")
    private class379 field6369;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method2724(byte arg0) {
        field6363++;
        int var2 = 106 / ((-arg0 - 3) / 39);
        return this.field6367.field4806 == this.field6367;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)Loq;", line = 26)
    public final class379 method2725(int arg0) {
        field6357++;
        if (arg0 != 37) {
            return null;
        }
        class379 var2 = this.field6367.field4806;
        if (this.field6367 == var2) {
            this.field6369 = null;
            return null;
        } else {
            this.field6369 = var2.field4806;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(I)Loq;", line = 47)
    public final class379 method2726(int arg0) {
        field6353++;
        class379 var2 = this.field6369;
        if (arg0 > -112) {
            return null;
        } else if (this.field6367 == var2) {
            this.field6369 = null;
            return null;
        } else {
            this.field6369 = var2.field4806;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Loq;I)V", line = 69)
    public final void method2727(class379 arg0, int arg1) {
        field6358++;
        if (arg0.field4808 != null) {
            arg0.method2219(arg1 ^ 0xFFFFCAA0);
        }
        if (arg1 != -98) {
            field6352 = null;
        }
        arg0.field4808 = this.field6367;
        arg0.field4806 = this.field6367.field4806;
        arg0.field4808.field4806 = arg0;
        arg0.field4806.field4808 = arg0;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Ljava/lang/String;Z)J", line = 89)
    public static final long method2728(String arg0, boolean arg1) {
        field6354++;
        long var2 = 0L;
        int var4 = arg0.length();
        if (arg1) {
            method2728(null, true);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(I)V", line = 136)
    public final void method2729(int arg0) {
        while (true) {
            class379 var2 = this.field6367.field4806;
            if (this.field6367 == var2) {
                field6355++;
                if (arg0 != -48) {
                    this.field6369 = null;
                }
                this.field6369 = null;
                return;
            }
            var2.method2219(arg0 + 13678);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "(I)Loq;", line = 159)
    public final class379 method2730(int arg0) {
        field6356++;
        class379 var2 = this.field6367.field4806;
        if (arg0 != -31260) {
            return null;
        } else if (this.field6367 == var2) {
            return null;
        } else {
            var2.method2219(13630);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "(I)V", line = 176)
    public static void method2731(int arg0) {
        field6370 = null;
        if (arg0 == -49) {
            field6371 = null;
            field6352 = null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(Loq;I)V", line = 191)
    public final void method2732(class379 arg0, int arg1) {
        if (arg1 != 21939) {
            this.method2737((byte) 18);
        }
        if (arg0.field4808 != null) {
            arg0.method2219(13630);
        }
        field6361++;
        arg0.field4808 = this.field6367.field4808;
        arg0.field4806 = this.field6367;
        arg0.field4808.field4806 = arg0;
        arg0.field4806.field4808 = arg0;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lifa;I)V", line = 210)
    public final void method2733(class450 arg0, int arg1) {
        if (arg1 != 30896) {
            method2731(-100);
        }
        this.method2738(0, arg0, this.field6367.field4806);
        field6364++;
    }

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "(I)Loq;", line = 222)
    public final class379 method2734(int arg0) {
        field6366++;
        class379 var2 = this.field6367.field4808;
        if (this.field6367 == var2) {
            this.field6369 = null;
            return null;
        } else {
            this.field6369 = var2.field4808;
            return arg0 == 8 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "()V", line = 329)
    public class450() {
        this.field6367.field4806 = this.field6367;
        this.field6367.field4808 = this.field6367;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Les;I)Lks;", line = 248)
    public static final class463 method2735(class403 arg0, int arg1) {
        field6360++;
        if (arg1 == -27781) {
            int var2 = arg0.method2381((byte) 97);
            return new class463(var2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "(I)I", line = 261)
    public final int method2736(int arg0) {
        field6368++;
        int var2 = 0;
        if (arg0 != -12418) {
            field6365 = -28;
        }
        class379 var3 = this.field6367.field4806;
        while (this.field6367 != var3) {
            var3 = var3.field4806;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(B)Loq;", line = 283)
    public final class379 method2737(byte arg0) {
        if (arg0 >= -123) {
            field6370 = null;
        }
        field6362++;
        class379 var2 = this.field6369;
        if (this.field6367 == var2) {
            this.field6369 = null;
            return null;
        } else {
            this.field6369 = var2.field4808;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILifa;Loq;)V", line = 304)
    private final void method2738(int arg0, class450 arg1, class379 arg2) {
        field6359++;
        class379 var4 = this.field6367.field4808;
        if (arg0 != 0) {
            this.method2733(null, 111);
        }
        this.field6367.field4808 = arg2.field4808;
        arg2.field4808.field4806 = this.field6367;
        if (this.field6367 != arg2) {
            arg2.field4808 = arg1.field6367.field4808;
            arg2.field4808.field4806 = arg2;
            var4.field4806 = arg1.field6367;
            arg1.field6367.field4808 = var4;
        }
    }
}
