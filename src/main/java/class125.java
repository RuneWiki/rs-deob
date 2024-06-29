import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class125 {

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "Z")
    public static boolean field2196 = false;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "Loa;")
    public static class99 field2201 = class221.method1463(2844, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "Loa;")
    public static class99 field2200 = class221.method1463(2844, "mapfunction");

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Z")
    public static volatile boolean field2193 = true;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "J")
    public long field2187;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Lhk;")
    public class125 field2184;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Lhk;")
    public class125 field2192;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Lbj;")
    public static class155 field2186;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Ltg;")
    public static class182 field2195;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "Lqh;")
    public static class202 field2204;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "Lwb;")
    public static class26 field2199;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "[[Ltf;")
    public static class107[][] field2188;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static void method823(byte arg0) {
        field2186 = null;
        int var1 = -14 % ((-arg0 - 57) / 37);
        field2201 = null;
        field2204 = null;
        field2188 = null;
        field2195 = null;
        field2199 = null;
        field2200 = null;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
    public static final void method824(byte arg0) {
        int var1 = 95 / ((34 - arg0) / 43);
        field2197++;
        if (!class139.method951(436421925) && class255.field4407 != class12.field112) {
            class128.method846(class168.field3006.field1317[0], false, class206.field3565, class209.field3628, 93, class168.field3006.field1259[0], class255.field4407);
        } else if (class255.field4407 != class123.field2158) {
            class123.field2158 = class255.field4407;
            class165.method1112(0, class255.field4407);
            class187.method1286(false);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)Z")
    public final boolean method825(int arg0) {
        field2194++;
        if (this.field2192 == null) {
            return false;
        } else {
            if (arg0 != 140) {
                method826(false, 78);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)Z")
    public static final boolean method826(boolean arg0, int arg1) {
        if (arg0) {
            method824((byte) 87);
        }
        field2185++;
        return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
    public static final void method827(boolean arg0) {
        field2198++;
        if (arg0) {
            return;
        }
        class290 var1 = class252.field4358;
        synchronized (class252.field4358) {
            class149.field2629 = class20.field227;
            class152.field2670++;
            if (class37.field646 >= 0) {
                while (class37.field646 != class217.field3773) {
                    int var2 = class169.field3013[class217.field3773];
                    class217.field3773 = class217.field3773 + 1 & 0x7F;
                    if (var2 < 0) {
                        class51.field839[~var2] = false;
                    } else {
                        class51.field839[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class51.field839[var3] = false;
                }
                class37.field646 = class217.field3773;
            }
            class20.field227 = class159.field2825;
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V")
    public final void method828(byte arg0) {
        field2189++;
        if (this.field2192 == null) {
            return;
        }
        int var2 = -110 % ((66 - arg0) / 55);
        this.field2192.field2184 = this.field2184;
        this.field2184.field2192 = this.field2192;
        this.field2192 = null;
        this.field2184 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZIILtg;)Lvd;")
    public static final class4 method829(boolean arg0, int arg1, int arg2, class182 arg3) {
        field2190++;
        if (class153.method1016(arg2, 21451, arg3, arg1)) {
            if (arg0) {
                method823((byte) -41);
            }
            return class106.method729((byte) -66);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIB)V")
    public static final void method830(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2191++;
        if (arg4 >= -47) {
            method830(-69, 95, -66, 61, (byte) -24);
        }
        class79.field1395 = arg2;
        class137.field2414 = arg0;
        class197.field3437 = arg3;
        class178.field3101 = arg1;
    }
}
