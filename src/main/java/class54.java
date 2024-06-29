import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class54 extends class200 {

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "Lpi;")
    public static class342 field938 = new class342("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "[I")
    public static int[] field941 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
    public int field930;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "Ljava/lang/String;")
    public String field931;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "[Z")
    public static boolean[] field940;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "[[I")
    public static int[][] field942;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)I")
    public final int method474(boolean arg0) {
        ++field937;
        if (arg0) {
            this.method480(-73);
        }
        return (int) super.field4904;
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)V")
    public static void method475(int arg0) {
        if (arg0 == 13) {
            field941 = null;
            field940 = null;
            field942 = null;
            field938 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    public final void method476(byte arg0) {
        ++field935;
        if (arg0 != -44) {
            method475(71);
        }
        super.field2927 = super.field2927 & Long.MIN_VALUE | 500L + class211.method1419(12921);
        class504.field7439.method1673(this, 4304);
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)I")
    public final int method477(int arg0) {
        ++field936;
        if (arg0 != -13446) {
            method479(false, (byte) -75);
        }
        return (int) (255L & super.field4904 >>> 32);
    }

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)J")
    public final long method478(int arg0) {
        ++field932;
        if (arg0 != 9297) {
            this.field933 = -124;
        }
        return Long.MAX_VALUE & super.field2927;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZB)V")
    public static final void method479(boolean arg0, byte arg1) {
        ++field929;
        if (arg0 && class509.field7483 != null) {
            class258.field3753 = class509.field7483.field6263;
        } else {
            class258.field3753 = -1;
        }
        class329.field4971 = null;
        class368.field5569 = 0;
        class509.field7483 = null;
        class47.field876 = null;
        class509.method3045();
        class509.field7494.method2419((byte) 112);
        class177.field2703 = null;
        class102.field1692 = null;
        if (arg1 <= 98) {
            field940 = null;
        }
        class358.field5447 = null;
        class307.field4691 = -1;
        class37.field705 = null;
        class509.field7491 = null;
        class4.field111 = null;
        class257.field3731 = null;
        class102.field1684 = null;
        class100.field1654 = null;
        class138.field2221 = null;
        class151.field2403 = -1;
        class509.field7486.method1810(126);
        class509.field7484.method1191(64, (byte) -29, 64);
        class509.field7486.method1813((byte) -118, 64, 128);
        class509.field7482.method2869(64, (byte) 77);
        class419.field6271.method1385(24805, 64);
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(II)V")
    public class54(int arg0, int arg1) {
        super.field4904 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "(I)V")
    public final void method480(int arg0) {
        ++field939;
        super.field2927 |= Long.MIN_VALUE;
        if ((long) arg0 == this.method478(9297)) {
            class148.field2360.method1673(this, arg0 ^ 4304);
        }
    }
}
