import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class20 {

    @OriginalMember(owner = "client!an", name = "s", descriptor = "I")
    private int field351 = 0;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "[Lqg;")
    public class320[] field340;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "Lno;")
    public static class494 field338 = new class494("", 13);

    @OriginalMember(owner = "client!an", name = "q", descriptor = "Liv;")
    public static class64 field349 = new class64(109, 2);

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "J")
    private long field347;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "Lbu;")
    public static class17 field333;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "Lqg;")
    private class320 field342;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "Lqg;")
    private class320 field353;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "[[Z")
    public static boolean[][] field352;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
    public final void method159(int arg0) {
        for (int var2 = arg0; var2 < this.field337; var2++) {
            class320 var3 = this.field340[var2];
            while (true) {
                class320 var4 = var3.field4901;
                if (var3 == var4) {
                    break;
                }
                var4.method2090(-1);
            }
        }
        field346++;
        this.field353 = null;
        this.field342 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Lqg;")
    public final class320 method160(byte arg0) {
        if (arg0 != -20) {
            this.field337 = -104;
        }
        this.field351 = 0;
        field335++;
        return this.method163(122);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z[Lqg;)I")
    public final int method161(boolean arg0, class320[] arg1) {
        field354++;
        int var3 = 0;
        if (arg0) {
            return 125;
        }
        for (int var4 = 0; var4 < this.field337; var4++) {
            class320 var5 = this.field340[var4];
            for (class320 var6 = var5.field4901; var6 != var5; var6 = var6.field4901) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)I")
    public final int method162(byte arg0) {
        if (arg0 > -94) {
            this.field347 = -18L;
        }
        field336++;
        return this.field337;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)Lqg;")
    public final class320 method163(int arg0) {
        field339++;
        if (this.field351 > 0 && this.field340[this.field351 - 1] != this.field353) {
            class320 var2 = this.field353;
            this.field353 = var2.field4901;
            return var2;
        }
        while (this.field351 < this.field337) {
            class320 var3 = this.field340[this.field351++].field4901;
            if (this.field340[this.field351 - 1] != var3) {
                this.field353 = var3.field4901;
                return var3;
            }
        }
        if (arg0 < 119) {
            this.method162((byte) -91);
        }
        return null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;")
    public static final Object method164(boolean arg0, byte[] arg1, boolean arg2) {
        if (!arg0) {
            field333 = null;
        }
        field341++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class400.field6023) {
            try {
                class91 var3 = (class91) Class.forName("pc").getDeclaredConstructor().newInstance();
                var3.method710(arg1, 0);
                return var3;
            } catch (Throwable var4) {
                class400.field6023 = true;
            }
        }
        return arg2 ? class335.method2145(arg1, 4) : arg1;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(B)Lqg;")
    public final class320 method165(byte arg0) {
        if (arg0 > -124) {
            this.field347 = 2L;
        }
        field348++;
        if (this.field342 == null) {
            return null;
        }
        class320 var2 = this.field340[(int) ((long) (this.field337 - 1) & this.field347)];
        while (this.field342 != var2) {
            if (this.field342.field4904 == this.field347) {
                class320 var3 = this.field342;
                this.field342 = this.field342.field4901;
                return var3;
            }
            this.field342 = this.field342.field4901;
        }
        this.field342 = null;
        return null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lqg;JI)V")
    public final void method166(class320 arg0, long arg1, int arg2) {
        if (arg0.field4906 != null) {
            arg0.method2090(-1);
        }
        field344++;
        int var5 = 10 % ((-arg2 - 10) / 58);
        class320 var6 = this.field340[(int) ((long) (this.field337 - 1) & arg1)];
        arg0.field4901 = var6;
        arg0.field4906 = var6.field4906;
        arg0.field4906.field4901 = arg0;
        arg0.field4904 = arg1;
        arg0.field4901.field4906 = arg0;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V")
    public static void method167(int arg0) {
        field349 = null;
        if (arg0 != 0) {
            method170(-43, 29, -3);
        }
        field333 = null;
        field338 = null;
        field352 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/lang/String;Z)J")
    public static final long method168(String arg0, boolean arg1) {
        field345++;
        long var2 = 0L;
        if (arg1) {
            return 77L;
        }
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
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

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(I)I")
    public final int method169(int arg0) {
        field350++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field337; var3++) {
            class320 var4 = this.field340[var3];
            for (class320 var5 = var4.field4901; var5 != var4; var5 = var5.field4901) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Z")
    public static final boolean method170(int arg0, int arg1, int arg2) {
        if (arg2 != -3910) {
            method170(74, -91, 102);
        }
        field343++;
        return (arg1 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BJ)Lqg;")
    public final class320 method171(byte arg0, long arg1) {
        this.field347 = arg1;
        int var4 = 18 / ((arg0 + 39) / 39);
        field334++;
        class320 var5 = this.field340[(int) (arg1 & (long) (this.field337 - 1))];
        for (this.field342 = var5.field4901; this.field342 != var5; this.field342 = this.field342.field4901) {
            if (this.field342.field4904 == arg1) {
                class320 var6 = this.field342;
                this.field342 = this.field342.field4901;
                return var6;
            }
        }
        this.field342 = null;
        return null;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(I)V")
    public class20(int arg0) {
        this.field340 = new class320[arg0];
        this.field337 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class320 var3 = this.field340[var2] = new class320();
            var3.field4901 = var3;
            var3.field4906 = var3;
        }
    }

    static {
        new class342("Ok", "Okay", "OK", "Ok");
    }
}
