import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class64 {

    @OriginalMember(owner = "client!tga", name = "t", descriptor = "I")
    private int field865 = 0;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "[Ldn;")
    public class540[] field849;

    @OriginalMember(owner = "client!tga", name = "e", descriptor = "[I")
    public static int[] field850 = new int[32];

    @OriginalMember(owner = "client!tga", name = "m", descriptor = "Lga;")
    public static class420 field858 = new class420();

    @OriginalMember(owner = "client!tga", name = "r", descriptor = "Lbe;")
    public static class41 field863 = new class41();

    @OriginalMember(owner = "client!tga", name = "v", descriptor = "I")
    public static int field867 = 0;

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!tga", name = "f", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!tga", name = "g", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!tga", name = "h", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!tga", name = "i", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!tga", name = "j", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!tga", name = "k", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!tga", name = "l", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!tga", name = "o", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!tga", name = "s", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!tga", name = "n", descriptor = "J")
    private long field859;

    @OriginalMember(owner = "client!tga", name = "q", descriptor = "Lgq;")
    public static class538 field862;

    @OriginalMember(owner = "client!tga", name = "p", descriptor = "Ldn;")
    private class540 field861;

    @OriginalMember(owner = "client!tga", name = "u", descriptor = "Ldn;")
    private class540 field866;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(BJ)Ldn;", line = 3)
    public final class540 method380(byte arg0, long arg1) {
        field857++;
        this.field859 = arg1;
        class540 var4 = this.field849[(int) (arg1 & (long) (this.field846 - 1))];
        if (arg0 != -3) {
            method390(false);
        }
        for (this.field861 = var4.field7578; this.field861 != var4; this.field861 = this.field861.field7578) {
            if (this.field861.field7577 == arg1) {
                class540 var5 = this.field861;
                this.field861 = this.field861.field7578;
                return var5;
            }
        }
        this.field861 = null;
        return null;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)I", line = 33)
    public final int method381(int arg0) {
        field848++;
        int var2 = 0;
        if (arg0 != 65) {
            field862 = null;
        }
        for (int var3 = 0; var3 < this.field846; var3++) {
            class540 var4 = this.field849[var3];
            for (class540 var5 = var4.field7578; var5 != var4; var5 = var5.field7578) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)Ldn;", line = 65)
    public final class540 method382(int arg0) {
        this.field865 = arg0;
        field854++;
        return this.method391(37);
    }

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "(I)Ldn;", line = 78)
    public final class540 method383(int arg0) {
        field860++;
        if (this.field861 == null) {
            return null;
        }
        class540 var2 = this.field849[(int) (this.field859 & (long) (this.field846 + arg0))];
        while (this.field861 != var2) {
            if (this.field861.field7577 == this.field859) {
                class540 var3 = this.field861;
                this.field861 = this.field861.field7578;
                return var3;
            }
            this.field861 = this.field861.field7578;
        }
        this.field861 = null;
        return null;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(JLdn;Z)V", line = 107)
    public final void method384(long arg0, class540 arg1, boolean arg2) {
        field851++;
        if (arg2) {
            this.field859 = -13L;
        }
        if (arg1.field7583 != null) {
            arg1.method3117((byte) -86);
        }
        class540 var5 = this.field849[(int) ((long) (this.field846 - 1) & arg0)];
        arg1.field7578 = var5;
        arg1.field7583 = var5.field7583;
        arg1.field7583.field7578 = arg1;
        arg1.field7577 = arg0;
        arg1.field7578.field7583 = arg1;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(I[Ldn;)I", line = 131)
    public final int method385(int arg0, class540[] arg1) {
        field852++;
        int var3 = arg0;
        for (int var4 = 0; var4 < this.field846; var4++) {
            class540 var5 = this.field849[var4];
            for (class540 var6 = var5.field7578; var6 != var5; var6 = var6.field7578) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 166)
    public static final void method386(String arg0, int arg1, boolean arg2) {
        class422.method2520(arg1, 0, arg0, "", "", -105, "");
        if (arg2) {
            field862 = null;
        }
        field853++;
    }

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "(I)V", line = 177)
    public final void method387(int arg0) {
        if (arg0 != -21125) {
            this.method391(-112);
        }
        for (int var2 = 0; var2 < this.field846; var2++) {
            class540 var3 = this.field849[var2];
            while (true) {
                class540 var4 = var3.field7578;
                if (var3 == var4) {
                    break;
                }
                var4.method3117((byte) -128);
            }
        }
        field855++;
        this.field861 = null;
        this.field866 = null;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/lang/String;B)J", line = 210)
    public static final long method388(String arg0, byte arg1) {
        field847++;
        long var2 = 0L;
        int var4 = arg0.length();
        if (arg1 != -113) {
            return 119L;
        }
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

    @OriginalMember(owner = "client!tga", name = "e", descriptor = "(I)I", line = 257)
    public final int method389(int arg0) {
        if (arg0 == -19609) {
            field864++;
            return this.field846;
        } else {
            return 37;
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Z)V", line = 274)
    public static void method390(boolean arg0) {
        field858 = null;
        if (arg0) {
            method390(true);
        }
        field850 = null;
        field862 = null;
        field863 = null;
    }

    @OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(I)V", line = 293)
    public class64(int arg0) {
        this.field846 = arg0;
        this.field849 = new class540[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class540 var3 = this.field849[var2] = new class540();
            var3.field7578 = var3;
            var3.field7583 = var3;
        }
    }

    @OriginalMember(owner = "client!tga", name = "f", descriptor = "(I)Ldn;", line = 319)
    public final class540 method391(int arg0) {
        field856++;
        if (this.field865 > 0 && this.field849[this.field865 - 1] != this.field866) {
            class540 var2 = this.field866;
            this.field866 = var2.field7578;
            return var2;
        }
        if (arg0 != 37) {
            this.field849 = null;
        }
        while (this.field846 > this.field865) {
            class540 var3 = this.field849[this.field865++].field7578;
            if (this.field849[this.field865 - 1] != var3) {
                this.field866 = var3.field7578;
                return var3;
            }
        }
        return null;
    }
}
