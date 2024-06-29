import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class224 {

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Lpa;")
    private class387 field3219 = new class387(64);

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Lpa;")
    public class387 field3222 = new class387(60);

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Lcb;")
    public class544 field3218;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Lcb;")
    private class544 field3215;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Ljo;")
    public static class351 field3212 = new class351(34, 7);

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Lke;")
    public static class622 field3221 = new class622(26, -1);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public int field3223;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Laba;")
    public static class185 field3220;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 5)
    public final void method1547(byte arg0) {
        class387 var2 = this.field3219;
        synchronized (this.field3219) {
            this.field3219.method2369(-1);
            if (arg0 != 82) {
                field3221 = null;
            }
        }
        field3213++;
        class387 var3 = this.field3222;
        synchronized (this.field3222) {
            this.field3222.method2369(-1);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Lwba;", line = 21)
    public final class55 method1548(int arg0, int arg1) {
        field3209++;
        class387 var3 = this.field3219;
        class55 var4;
        synchronized (this.field3219) {
            var4 = (class55) this.field3219.method2373((long) arg1, 103);
            if (arg0 != 64) {
                method1554(null, null, null, null, -74, -32, 65, 95, null);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field3215;
        byte[] var6;
        synchronized (this.field3215) {
            var6 = this.field3215.method3150(class123.method905(arg1, (byte) 124), 92, class587.method3404(arg1, -104));
        }
        class55 var7 = new class55();
        var7.field775 = this;
        var7.field765 = arg1;
        if (var6 != null) {
            var7.method357(new class120(var6), arg0 ^ 0xFFFFFFBF);
        }
        class387 var8 = this.field3219;
        synchronized (this.field3219) {
            this.field3219.method2362(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V", line = 54)
    public final void method1549(int arg0, byte arg1) {
        class387 var3 = this.field3219;
        synchronized (this.field3219) {
            this.field3219.method2366(arg0, 107);
        }
        field3216++;
        class387 var4 = this.field3222;
        synchronized (this.field3222) {
            this.field3222.method2366(arg0, 110);
        }
        if (arg1 >= -92) {
            this.method1552(true);
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)V", line = 74)
    public final void method1550(int arg0, int arg1) {
        field3210++;
        if (arg1 != 1601098192) {
            return;
        }
        this.field3223 = arg0;
        class387 var3 = this.field3222;
        synchronized (this.field3222) {
            this.field3222.method2364(1);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLaj;ZZ)V", line = 90)
    public static final void method1551(byte arg0, class329 arg1, boolean arg2, boolean arg3) {
        field3211++;
        if (arg0 != 26) {
            field3221 = null;
        }
        int var4 = arg1.field4912;
        int var5 = (int) arg1.field7577;
        arg1.method3117((byte) -109);
        if (arg3) {
            class34.method233((byte) -22, var4);
        }
        class645.method3684((byte) -56, var4);
        class176 var6 = class518.method3014(var5, -25);
        if (var6 != null) {
            class288.method1923((byte) -19, var6);
        }
        class705.method3989(6402);
        if (!arg2 && class251.field3546 != -1) {
            class530.method3077(72, class251.field3546, 1);
        }
        class209 var7 = new class209(class251.field3547);
        for (class329 var8 = (class329) var7.method1484((byte) -88); var8 != null; var8 = (class329) var7.method1483((byte) -61)) {
            if (!var8.method3114(-60)) {
                var8 = (class329) var7.method1484((byte) -103);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field4914 == 3) {
                int var9 = (int) var8.field7577;
                if (var9 >>> 16 == var4) {
                    method1551((byte) 26, var8, arg2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V", line = 149)
    public final void method1552(boolean arg0) {
        class387 var2 = this.field3219;
        synchronized (this.field3219) {
            this.field3219.method2364(1);
        }
        field3217++;
        if (!arg0) {
            class387 var3 = this.field3222;
            synchronized (this.field3222) {
                this.field3222.method2364(1);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 166)
    public static void method1553(int arg0) {
        field3212 = null;
        field3221 = null;
        field3220 = null;
        if (arg0 != -1) {
            method1553(-31);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;)V", line = 185)
    public static final void method1554(String arg0, String arg1, String arg2, String arg3, int arg4, int arg5, int arg6, int arg7, String arg8) {
        field3214++;
        class118 var9 = class222.field3188[arg6];
        for (int var10 = 99; var10 > 0; var10--) {
            class222.field3188[var10] = class222.field3188[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class118(arg4, arg7, arg2, arg1, arg3, arg8, arg5, arg0);
        } else {
            var9.method823(arg5, arg2, arg7, arg3, arg4, arg1, arg8, -7847, arg0);
        }
        class9.field207++;
        class74.field1001 = class717.field10086;
        class222.field3188[0] = var9;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Liv;ILcb;Lcb;)V", line = 223)
    public class224(class106 arg0, int arg1, class544 arg2, class544 arg3) {
        this.field3218 = arg3;
        this.field3215 = arg2;
        int var5 = this.field3215.method3136(false) - 1;
        this.field3215.method3147(var5, -85);
    }
}
