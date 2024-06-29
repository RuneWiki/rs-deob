import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class76 extends class97 {

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "I")
    public int field2034 = 0;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "Lke;")
    public static class65 field2027 = class1.method17("null", -121);

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static int field2028 = 0;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "I")
    public static int field2033 = 0;

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "Lke;")
    private static class65 field2036 = class1.method17("Loading game screen )2 ", -125);

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "Lke;")
    public static class65 field2026 = field2036;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "Lqd;")
    public static class100 field2031 = new class100(500);

    @OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
    public static int field2037 = 0;

    @OriginalMember(owner = "client!md", name = "gb", descriptor = "Lke;")
    public static class65 field2041 = class1.method17("@or2@", -114);

    @OriginalMember(owner = "client!md", name = "ib", descriptor = "Lke;")
    public static class65 field2043 = class1.method17("(U3", -116);

    @OriginalMember(owner = "client!md", name = "hb", descriptor = "Lke;")
    private static class65 field2042 = class1.method17("Loading title screen )2 ", -120);

    @OriginalMember(owner = "client!md", name = "jb", descriptor = "Lke;")
    public static class65 field2044 = field2042;

    @OriginalMember(owner = "client!md", name = "fb", descriptor = "I")
    public static int field2040 = 0;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!md", name = "db", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!md", name = "eb", descriptor = "[[[B")
    public static byte[][][] field2039;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V", line = 6)
    public static final void method673(int arg0) {
        if (class5.field90) {
            class5.field90 = false;
            class91.method797((byte) -127);
            class60.field1611 = true;
            class128.field3089 = true;
            class116.field2910 = true;
            class39.field996 = true;
        }
        field2035++;
        class81.method714(arg0 ^ 0xFFFFFF8F);
        if (class24.field614 && class10.field215 == 1) {
            class116.field2910 = true;
        }
        if (class66.field1767 != -1) {
            boolean var1 = class17.method127(class66.field1767, -37);
            if (var1) {
                class116.field2910 = true;
            }
        }
        if (class83.field2191 == 2) {
            class116.field2910 = true;
        }
        if (class80.field2128 == 2) {
            class116.field2910 = true;
        }
        if (class116.field2910) {
            class116.field2910 = false;
            class64.method526(arg0 ^ 0xFFFFFF89);
        }
        if (class117.field2939 == -1) {
            class26.field629.field710 = class44.field1151 - class93.field2469 - 77;
            if (class91.field2418 > 448 && class91.field2418 < 560 && class52.field1320 > 332) {
                class57.method466(4, 0, class91.field2418 - 17, 77, -1, class52.field1320 - 357, class26.field629, class44.field1151, 463);
            }
            int var2 = class44.field1151 - class26.field629.field710 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (class44.field1151 - 77 < var2) {
                var2 = class44.field1151 - 77;
            }
            if (class93.field2469 != var2) {
                class93.field2469 = var2;
                class39.field996 = true;
            }
        }
        if (class117.field2939 == -1 && class116.field2916 == 3) {
            int var3 = class87.field2336 * 14 + 7;
            class26.field629.field710 = class78.field2074;
            if (class91.field2418 > 448 && class91.field2418 < 560 && class52.field1320 > 332) {
                class57.method466(4, 0, class91.field2418 - 17, 77, -1, class52.field1320 - 357, class26.field629, var3, 463);
            }
            int var4 = class26.field629.field710;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var3 - 77 < var4) {
                var4 = var3 - 77;
            }
            if (class78.field2074 != var4) {
                class78.field2074 = var4;
                class39.field996 = true;
            }
        }
        if (class117.field2939 != -1) {
            boolean var5 = class17.method127(class117.field2939, -29);
            if (var5) {
                class39.field996 = true;
            }
        }
        if (class83.field2191 == 3) {
            class39.field996 = true;
        }
        if (class80.field2128 == 3) {
            class39.field996 = true;
        }
        if (class73.field1933 != null) {
            class39.field996 = true;
        }
        if (class24.field614 && class10.field215 == 2) {
            class39.field996 = true;
        }
        if (class39.field996) {
            class39.field996 = false;
            class97.method818(-3786);
        }
        class114.method936(-21418);
        if (class83.field2199 != -1) {
            class128.field3089 = true;
        }
        if (class128.field3089) {
            if (class83.field2199 != -1 && class89.field2368 == class83.field2199) {
                class31.field806++;
                class83.field2199 = -1;
                class56.field1453.method642(52, false);
                class56.field1453.method305(false, class89.field2368);
            }
            class128.field3089 = false;
            class62.field1644 = true;
            class43.method374(field2028 % 20 < 10 ? -1 : class83.field2199, (byte) -128, class89.field2368, class66.field1767 == -1, class27.field728);
        }
        if (class60.field1611) {
            class60.field1611 = false;
            class62.field1644 = true;
            class4.method34(class114.field2865, true, class93.field2442, class6.field108, class55.field1422);
        }
        class56.method454(class22.field524, class19.field462, class32.field833.field1067, class32.field833.field1070, -1);
        class22.field524 = 0;
        if (arg0 != -6) {
            field2042 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)V", line = 171)
    public static void method674(int arg0) {
        field2027 = null;
        field2042 = null;
        if (arg0 > -29) {
            return;
        }
        field2031 = null;
        field2039 = null;
        field2043 = null;
        field2036 = null;
        field2041 = null;
        field2026 = null;
        field2044 = null;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)Lke;", line = 189)
    public static final class65 method675(int arg0, int arg1) {
        class65 var2 = new class65();
        field2030++;
        var2.field1733 = arg0;
        var2.field1702 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lg;B)V", line = 224)
    public final void method676(class39 arg0, byte arg1) {
        int var3 = 73 / ((-arg1 - 25) / 36);
        while (true) {
            int var4 = arg0.method334(105);
            if (var4 == 0) {
                field2029++;
                return;
            }
            this.method677(var4, 448, arg0);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILg;)V", line = 246)
    private final void method677(int arg0, int arg1, class39 arg2) {
        if (arg1 != 448) {
            field2038 = -106;
        }
        if (arg0 == 5) {
            this.field2034 = arg2.method326(255);
        }
        field2032++;
    }
}
