import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class88 {

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lae;")
    public static class6 field2105 = class64.method474(123, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lae;")
    private static class6 field2108 = class64.method474(111, "Connecting to update server");

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lae;")
    public static class6 field2106 = class64.method474(122, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lae;")
    public static class6 field2114 = field2108;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Lae;")
    private static class6 field2115 = class64.method474(111, "To play on this world move to a free area first");

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Lae;")
    public static class6 field2113 = field2115;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lva;")
    public static class128 field2107;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Lbf;")
    public static class14 field2117;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Z")
    public static boolean field2111;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "[Lq;")
    public static class101[] field2110;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V", line = 8)
    public static void method744(boolean arg0) {
        field2106 = null;
        field2108 = null;
        field2105 = null;
        field2113 = null;
        if (arg0) {
            field2107 = null;
        }
        field2115 = null;
        field2110 = null;
        field2107 = null;
        field2117 = null;
        field2114 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Z", line = 26)
    public static final boolean method745(byte arg0) {
        field2116++;
        if (arg0 != -62) {
            method744(false);
        }
        return class108.field2590 != null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lbf;Lbf;I)V", line = 53)
    public static final void method746(class14 arg0, class14 arg1, int arg2) {
        class63.field1382 = arg0;
        class107.field2519 = arg1;
        if (arg2 == 1) {
            field2112++;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 66)
    public static final void method747(int arg0) {
        field2109++;
        if (arg0 > -121) {
            field2108 = null;
        }
        if (class89.field2140 != 1) {
            return;
        }
        if (class52.field1170 >= 539 && class52.field1170 <= 573 && class116.field2728 >= 169 && class116.field2728 < 205 && class102.field2412[0] != -1) {
            class68.field1493 = 0;
            class117.field2768 = true;
            class139.field3380 = true;
        }
        if (class52.field1170 >= 569 && class52.field1170 <= 599 && class116.field2728 >= 168 && class116.field2728 < 205 && class102.field2412[1] != -1) {
            class68.field1493 = 1;
            class117.field2768 = true;
            class139.field3380 = true;
        }
        if (class52.field1170 >= 597 && class52.field1170 <= 627 && class116.field2728 >= 168 && class116.field2728 < 205 && class102.field2412[2] != -1) {
            class139.field3380 = true;
            class68.field1493 = 2;
            class117.field2768 = true;
        }
        if (class52.field1170 >= 625 && class52.field1170 <= 669 && class116.field2728 >= 168 && class116.field2728 < 203 && class102.field2412[3] != -1) {
            class139.field3380 = true;
            class68.field1493 = 3;
            class117.field2768 = true;
        }
        if (class52.field1170 >= 666 && class52.field1170 <= 696 && class116.field2728 >= 168 && class116.field2728 < 205 && class102.field2412[4] != -1) {
            class139.field3380 = true;
            class117.field2768 = true;
            class68.field1493 = 4;
        }
        if (class52.field1170 >= 694 && class52.field1170 <= 724 && class116.field2728 >= 168 && class116.field2728 < 205 && class102.field2412[5] != -1) {
            class117.field2768 = true;
            class68.field1493 = 5;
            class139.field3380 = true;
        }
        if (class52.field1170 >= 722 && class52.field1170 <= 756 && class116.field2728 >= 169 && class116.field2728 < 205 && class102.field2412[6] != -1) {
            class139.field3380 = true;
            class68.field1493 = 6;
            class117.field2768 = true;
        }
        if (class52.field1170 >= 540 && class52.field1170 <= 574 && class116.field2728 >= 466 && class116.field2728 < 502 && class102.field2412[7] != -1) {
            class139.field3380 = true;
            class68.field1493 = 7;
            class117.field2768 = true;
        }
        if (class52.field1170 >= 572 && class52.field1170 <= 602 && class116.field2728 >= 466 && class116.field2728 < 503 && class102.field2412[8] != -1) {
            class68.field1493 = 8;
            class139.field3380 = true;
            class117.field2768 = true;
        }
        if (class52.field1170 >= 599 && class52.field1170 <= 629 && class116.field2728 >= 466 && class116.field2728 < 503 && class102.field2412[9] != -1) {
            class68.field1493 = 9;
            class139.field3380 = true;
            class117.field2768 = true;
        }
        if (class52.field1170 >= 627 && class52.field1170 <= 671 && class116.field2728 >= 467 && class116.field2728 < 502 && class102.field2412[10] != -1) {
            class68.field1493 = 10;
            class117.field2768 = true;
            class139.field3380 = true;
        }
        if (class52.field1170 >= 669 && class52.field1170 <= 699 && class116.field2728 >= 466 && class116.field2728 < 503 && class102.field2412[11] != -1) {
            class117.field2768 = true;
            class139.field3380 = true;
            class68.field1493 = 11;
        }
        if (class52.field1170 >= 696 && class52.field1170 <= 726 && class116.field2728 >= 466 && class116.field2728 < 503 && class102.field2412[12] != -1) {
            class68.field1493 = 12;
            class117.field2768 = true;
            class139.field3380 = true;
        }
        if (class52.field1170 >= 724 && class52.field1170 <= 758 && class116.field2728 >= 466 && class116.field2728 < 502 && class102.field2412[13] != -1) {
            class139.field3380 = true;
            class117.field2768 = true;
            class68.field1493 = 13;
            return;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 197)
    public static final void method748(int arg0) {
        class51.field1148.method129(arg0 ^ 0xFFFF825E);
        field2103++;
        if (arg0 != -5794) {
            method744(false);
        }
    }
}
