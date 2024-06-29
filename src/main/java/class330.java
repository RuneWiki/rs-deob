import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class330 {

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "Let;")
    private class428 field5154 = new class428();

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    private int field5140;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    private int field5150;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Llp;")
    private class272 field5144;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "[I")
    public static int[] field5149 = new int[1000];

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "Lof;")
    public static class446 field5157 = new class446("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "Luu;")
    public static class191 field5153;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 6)
    public static final void method2126(int arg0) {
        class153.field2004 = null;
        class407.field6168 = null;
        field5141++;
        class398.field6074 = null;
        class355.field5488 = null;
        class181.field2446 = null;
        class311.field4548 = null;
        class373.field5674 = null;
        class200.field2697 = null;
        class315.field4591 = null;
        if (arg0 != 0) {
            field5149 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 25)
    public final void method2127(byte arg0) {
        int var2 = 30 / ((arg0 - 67) / 53);
        field5147++;
        this.field5154.method2614(false);
        this.field5144.method1745(-80);
        this.field5140 = this.field5150;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 38)
    public final Object method2128(int arg0) {
        field5146++;
        if (arg0 < 62) {
            this.field5140 = -76;
        }
        class132 var2 = (class132) this.field5144.method1742(127);
        while (var2 != null) {
            Object var3 = var2.method652(-48);
            if (var3 != null) {
                return var3;
            }
            class132 var4 = var2;
            var2 = (class132) this.field5144.method1742(120);
            var4.method25(-13489);
            var4.method705(6511);
            this.field5140 += var2.field1781;
        }
        return null;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)I", line = 69)
    public final int method2129(int arg0) {
        field5155++;
        return arg0 == 10081 ? this.field5140 : -30;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V", line = 80)
    public static final void method2130(int arg0, int arg1) {
        class330 var2 = class160.field2086;
        synchronized (class160.field2086) {
            class160.field2086.method2140(-116, arg1);
        }
        field5152++;
        if (arg0 != -91) {
            field5153 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/Object;JZ)V", line = 97)
    public final void method2131(Object arg0, long arg1, boolean arg2) {
        this.method2132((byte) -7, arg1, 1, arg0);
        field5161++;
        if (arg2) {
            field5153 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BJILjava/lang/Object;)V", line = 112)
    private final void method2132(byte arg0, long arg1, int arg2, Object arg3) {
        field5151++;
        if (arg2 > this.field5150) {
            throw new IllegalStateException("s>cs");
        }
        this.method2134(arg1, (byte) 55);
        this.field5140 -= arg2;
        while (this.field5140 < 0) {
            class132 var7 = (class132) this.field5154.method2612(-6261);
            this.method2139(var7, arg0 ^ 0xFFFFC251);
        }
        class294 var6 = new class294(arg3, arg2);
        this.field5144.method1751(arg1, arg0 - 76, var6);
        this.field5154.method2613(3, var6);
        var6.field1579 = 0L;
        if (arg0 != -7) {
            field5153 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(JB)Ljava/lang/Object;", line = 141)
    public final Object method2133(long arg0, byte arg1) {
        field5148++;
        if (arg1 <= 20) {
            this.method2133(23L, (byte) -24);
        }
        class132 var4 = (class132) this.field5144.method1747(arg0, false);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method652(-98);
        if (var5 == null) {
            var4.method25(-13489);
            var4.method705(6511);
            this.field5140 += var4.field1781;
            return null;
        }
        if (var4.method651((byte) 111)) {
            class294 var6 = new class294(var5, var4.field1781);
            this.field5144.method1751(var4.field35, -105, var6);
            this.field5154.method2613(3, var6);
            var6.field1579 = 0L;
            var4.method25(-13489);
            var4.method705(6511);
        } else {
            this.field5154.method2613(3, var4);
            var4.field1579 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(JB)V", line = 188)
    private final void method2134(long arg0, byte arg1) {
        field5159++;
        class132 var4 = (class132) this.field5144.method1747(arg0, false);
        this.method2139(var4, 15784);
        if (arg1 != 55) {
            this.field5140 = 104;
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V", line = 202)
    public final void method2135(int arg0) {
        field5158++;
        if (arg0 != 0) {
            field5149 = null;
        }
        for (class132 var2 = (class132) this.field5154.method2611((byte) 103); var2 != null; var2 = (class132) this.field5154.method2615(-13153)) {
            if (var2.method651((byte) 109)) {
                var2.method25(-13489);
                var2.method705(arg0 + 6511);
                this.field5140 += var2.field1781;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)I", line = 228)
    public final int method2136(int arg0) {
        if (arg0 != 0) {
            this.field5150 = -111;
        }
        field5145++;
        return this.field5150;
    }

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "(I)I", line = 242)
    public final int method2137(int arg0) {
        field5160++;
        int var2 = arg0;
        for (class132 var3 = (class132) this.field5154.method2611((byte) 105); var3 != null; var3 = (class132) this.field5154.method2615(-13153)) {
            if (!var3.method651((byte) 113)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 265)
    public final Object method2138(int arg0) {
        if (arg0 != 0) {
            this.field5150 = 71;
        }
        field5143++;
        class132 var2 = (class132) this.field5144.method1743(false);
        while (var2 != null) {
            Object var3 = var2.method652(arg0 - 91);
            if (var3 != null) {
                return var3;
            }
            class132 var4 = var2;
            var2 = (class132) this.field5144.method1742(111);
            var4.method25(-13489);
            var4.method705(6511);
            this.field5140 += var2.field1781;
        }
        return null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lme;I)V", line = 302)
    private final void method2139(class132 arg0, int arg1) {
        if (arg0 != null) {
            arg0.method25(arg1 ^ 0xFFFFF6E7);
            arg0.method705(arg1 - 9273);
            this.field5140 += arg0.field1781;
        }
        field5156++;
        if (arg1 != 15784) {
            this.method2137(30);
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(I)V", line = 375)
    public class330(int arg0) {
        this.field5140 = arg0;
        this.field5150 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field5144 = new class272(var2);
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)V", line = 326)
    public final void method2140(int arg0, int arg1) {
        field5142++;
        if (arg0 >= -105) {
            field5157 = null;
        }
        if (class393.field6015 == null) {
            return;
        }
        for (class132 var3 = (class132) this.field5154.method2611((byte) 92); var3 != null; var3 = (class132) this.field5154.method2615(-13153)) {
            if (var3.method651((byte) -117)) {
                if (var3.method652(-70) == null) {
                    var3.method25(-13489);
                    var3.method705(6511);
                    this.field5140++;
                }
            } else if (((long) arg1) < (++var3.field1579)) {
                class132 var4 = class393.field6015.method1319(var3, 107);
                this.field5144.method1751(var3.field35, -118, var4);
                class74.method520((byte) 126, var4, var3);
                var3.method25(-13489);
                var3.method705(6511);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)V", line = 391)
    public static void method2141(int arg0) {
        field5157 = null;
        field5149 = null;
        if (arg0 != 0) {
            method2141(-126);
        }
        field5153 = null;
    }
}
