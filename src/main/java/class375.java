import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class375 {

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    private int field5406 = 0;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "[Lha;")
    public class42[] field5390;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public int field5395;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field5389 = 328;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "J")
    private long field5391;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "Lsu;")
    public static class144 field5394;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "Laa;")
    public static class343 field5393;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "Lha;")
    private class42 field5402;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "Lha;")
    private class42 field5407;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)Lha;", line = 4)
    public final class42 method2283(byte arg0) {
        if (arg0 != 11) {
            this.field5406 = 48;
        }
        field5388++;
        if (this.field5406 > 0 && this.field5390[this.field5406 - 1] != this.field5407) {
            class42 var2 = this.field5407;
            this.field5407 = var2.field857;
            return var2;
        }
        while (this.field5406 < this.field5395) {
            class42 var3 = this.field5390[this.field5406++].field857;
            if (this.field5390[this.field5406 - 1] != var3) {
                this.field5407 = var3.field857;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZJ)Lha;", line = 38)
    public final class42 method2284(boolean arg0, long arg1) {
        field5401++;
        this.field5391 = arg1;
        class42 var4 = this.field5390[(int) (arg1 & (long) (this.field5395 - 1))];
        for (this.field5402 = var4.field857; this.field5402 != var4; this.field5402 = this.field5402.field857) {
            if (this.field5402.field863 == arg1) {
                class42 var5 = this.field5402;
                this.field5402 = this.field5402.field857;
                return var5;
            }
        }
        if (arg0) {
            this.field5402 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)Lha;", line = 73)
    public final class42 method2285(int arg0) {
        this.field5406 = 0;
        if (arg0 <= 31) {
            method2293(21, (byte) 123, 81);
        }
        field5398++;
        return this.method2283((byte) 11);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V", line = 86)
    public final void method2286(byte arg0) {
        field5397++;
        if (arg0 != 19) {
            return;
        }
        for (int var2 = 0; var2 < this.field5395; var2++) {
            class42 var3 = this.field5390[var2];
            while (true) {
                class42 var4 = var3.field857;
                if (var3 == var4) {
                    break;
                }
                var4.method421(22071);
            }
        }
        this.field5402 = null;
        this.field5407 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B[Lha;)I", line = 121)
    public final int method2287(byte arg0, class42[] arg1) {
        field5405++;
        int var3 = 0;
        if (arg0 < 90) {
            field5389 = 40;
        }
        for (int var4 = 0; var4 < this.field5395; var4++) {
            class42 var5 = this.field5390[var4];
            for (class42 var6 = var5.field857; var6 != var5; var6 = var6.field857) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 157)
    public static final boolean method2288(byte arg0, String arg1) {
        field5404++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class290.field4314; var2++) {
            if (arg1.equalsIgnoreCase(class163.field2463[var2])) {
                return true;
            }
        }
        if (arg1.equalsIgnoreCase(class364.field5293.field7363)) {
            return true;
        } else {
            if (arg0 < 81) {
                field5394 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)I", line = 187)
    public final int method2289(byte arg0) {
        if (arg0 != -47) {
            method2288((byte) -99, null);
        }
        field5403++;
        return this.field5395;
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(B)Lha;", line = 199)
    public final class42 method2290(byte arg0) {
        field5392++;
        if (arg0 > -96) {
            this.field5406 = 89;
        }
        if (this.field5402 == null) {
            return null;
        }
        class42 var2 = this.field5390[(int) ((long) (this.field5395 - 1) & this.field5391)];
        while (this.field5402 != var2) {
            if (this.field5402.field863 == this.field5391) {
                class42 var3 = this.field5402;
                this.field5402 = this.field5402.field857;
                return var3;
            }
            this.field5402 = this.field5402.field857;
        }
        this.field5402 = null;
        return null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V", line = 231)
    public static void method2291(boolean arg0) {
        if (arg0) {
            field5393 = null;
        }
        field5394 = null;
        field5393 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(JLha;B)V", line = 248)
    public final void method2292(long arg0, class42 arg1, byte arg2) {
        field5396++;
        if (arg1.field859 != null) {
            arg1.method421(22071);
        }
        if (arg2 >= -126) {
            this.field5402 = null;
        }
        class42 var5 = this.field5390[(int) (arg0 & (long) (this.field5395 - 1))];
        arg1.field857 = var5;
        arg1.field859 = var5.field859;
        arg1.field859.field857 = arg1;
        arg1.field863 = arg0;
        arg1.field857.field859 = arg1;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBI)Z", line = 268)
    public static final boolean method2293(int arg0, byte arg1, int arg2) {
        field5399++;
        if (arg1 == -6) {
            return (arg2 & 0x84080) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(I)V", line = 278)
    public class375(int arg0) {
        this.field5390 = new class42[arg0];
        this.field5395 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class42 var3 = this.field5390[var2] = new class42();
            var3.field859 = var3;
            var3.field857 = var3;
        }
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(B)I", line = 305)
    public final int method2294(byte arg0) {
        field5400++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 != 76) {
            this.field5391 = 77L;
        }
        while (this.field5395 > var3) {
            class42 var4 = this.field5390[var3];
            class42 var5 = var4.field857;
            while (var4 != var5) {
                var5 = var5.field857;
                var2++;
            }
            var3++;
        }
        return var2;
    }
}
