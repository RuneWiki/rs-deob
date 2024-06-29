import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class446 {

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lvi;")
    private class476 field6196 = new class476();

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    private int field6203;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    private int field6193;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Ljr;")
    private class357 field6201;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field6192 = 0;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Ltu;")
    public static class7 field6205 = new class7();

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "[I")
    public static int[] field6207;

    static {
        new class169("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)I", line = 7)
    public final int method2642(int arg0) {
        if (arg0 != 0) {
            this.field6196 = null;
        }
        field6200++;
        return this.field6193;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lqq;I)V", line = 20)
    private final void method2643(class491 arg0, int arg1) {
        if (arg1 != 1) {
            this.method2642(-94);
        }
        if (arg0 != null) {
            arg0.method3021(20);
            arg0.method540((byte) -31);
            this.field6203 += arg0.field7175;
        }
        field6197++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/Object;Ls;II)V", line = 37)
    private final void method2644(Object arg0, class160 arg1, int arg2, int arg3) {
        field6208++;
        if (arg2 > this.field6193) {
            throw new IllegalStateException("s>cs");
        }
        this.method2645(arg1, -20917);
        this.field6203 -= arg2;
        while (this.field6203 < 0) {
            class491 var6 = (class491) this.field6196.method2861((byte) -124);
            this.method2643(var6, arg3 + 1);
        }
        class531 var5 = new class531(arg1, arg0, arg2);
        this.field6201.method2096(arg1.method1071(false), var5, (byte) 76);
        this.field6196.method2858(15, var5);
        var5.field1143 = arg3;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ls;I)V", line = 63)
    private final void method2645(class160 arg0, int arg1) {
        field6198++;
        long var3 = arg0.method1071(false);
        for (class491 var5 = (class491) this.field6201.method2085(var3, -5423); var5 != null; var5 = (class491) this.field6201.method2093(0)) {
            if (var5.field7170.method1070(30424, arg0)) {
                this.method2643(var5, 1);
                break;
            }
        }
        if (arg1 != -20917) {
            this.method2649(-115, null);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[FI)[F", line = 90)
    public static final float[] method2646(int arg0, float[] arg1, int arg2) {
        field6191++;
        float[] var3 = new float[arg2];
        class526.method3114(arg1, arg0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)I", line = 105)
    public final int method2647(int arg0) {
        field6206++;
        if (arg0 != 0) {
            this.field6193 = -49;
        }
        return this.field6203;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ls;Ljava/lang/Object;I)V", line = 116)
    public final void method2648(class160 arg0, Object arg1, int arg2) {
        int var4 = -15 / ((arg2 + 58) / 36);
        field6199++;
        this.method2644(arg1, arg0, 1, 0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILs;)Ljava/lang/Object;", line = 126)
    public final Object method2649(int arg0, class160 arg1) {
        field6194++;
        long var3 = arg1.method1071(false);
        if (arg0 != 0) {
            method2653('x', 30);
        }
        for (class491 var5 = (class491) this.field6201.method2085(var3, -5423); var5 != null; var5 = (class491) this.field6201.method2093(0)) {
            if (var5.field7170.method1070(arg0 ^ 0x76D8, arg1)) {
                Object var6 = var5.method2327(true);
                if (var6 != null) {
                    if (var5.method2326((byte) 6)) {
                        class531 var7 = new class531(arg1, var6, var5.field7175);
                        this.field6201.method2096(var5.field7456, var7, (byte) 76);
                        this.field6196.method2858(arg0 + 15, var7);
                        var7.field1143 = 0L;
                        var5.method3021(76);
                        var5.method540((byte) -37);
                    } else {
                        this.field6196.method2858(15, var5);
                        var5.field1143 = 0L;
                    }
                    return var6;
                }
                var5.method3021(arg0 + 27);
                var5.method540((byte) 120);
                this.field6203 += var5.field7175;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V", line = 181)
    public final void method2650(int arg0, int arg1) {
        field6202++;
        if (class353.field4525 != null) {
            for (class491 var3 = (class491) this.field6196.method2860(arg1); var3 != null; var3 = (class491) this.field6196.method2856(false)) {
                if (var3.method2326((byte) 6)) {
                    if (var3.method2327(true) == null) {
                        var3.method3021(17);
                        var3.method540((byte) 118);
                        this.field6203 += var3.field7175;
                    }
                } else if (((long) arg0) < (++var3.field1143)) {
                    class491 var4 = class353.field4525.method298(arg1 - 1, var3);
                    this.field6201.method2096(var3.field7456, var4, (byte) 76);
                    class388.method2312(var4, true, var3);
                    var3.method3021(18);
                    var3.method540((byte) -91);
                }
            }
        }
        if (arg1 != 0) {
            this.field6196 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V", line = 231)
    public final void method2651(int arg0) {
        this.field6196.method2862(97);
        field6195++;
        this.field6201.method2088((byte) 116);
        this.field6203 = this.field6193;
        if (arg0 != 1) {
            this.field6196 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 247)
    public final void method2652(byte arg0) {
        class491 var2 = (class491) this.field6196.method2860(0);
        int var3 = 91 / ((arg0 - 79) / 42);
        while (var2 != null) {
            if (var2.method2326((byte) 6)) {
                var2.method3021(-127);
                var2.method540((byte) -77);
                this.field6203 += var2.field7175;
            }
            var2 = (class491) this.field6196.method2856(false);
        }
        field6204++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(CI)Z", line = 274)
    public static final boolean method2653(char arg0, int arg1) {
        field6209++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class216.method1389(arg0, 10291)) {
            return true;
        } else if (arg1 < 111) {
            return true;
        } else {
            char[] var2 = class167.field2178;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class366.field4717;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V", line = 326)
    public static void method2654(boolean arg0) {
        field6205 = null;
        if (arg0) {
            field6192 = -29;
        }
        field6207 = null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V", line = 346)
    public class446(int arg0) {
        this.field6203 = arg0;
        this.field6193 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field6201 = new class357(var2);
    }
}
