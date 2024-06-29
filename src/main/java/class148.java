import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class148 {

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Z")
    public boolean field2604 = true;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public int field2597 = 0;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public int field2607 = -1;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public int field2601 = -1;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "[Lvf;")
    public static class102[] field2605 = new class102[4];

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Lcf;")
    public static class93 field2602 = class147.method1066("Chargement des polices )2 ", -48);

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field2610 = 1;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Lnh;")
    public static class54 field2606 = new class54(4);

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Ltg;")
    public static class181 field2611 = null;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Z")
    public static boolean field2612 = false;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Lhg;")
    public static class177 field2609;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Lcf;")
    public static final class93 method1067(int arg0, int arg1) {
        if (arg0 != -7015) {
            method1067(17, -65);
        }
        field2598++;
        return class218.method1531(10, false, arg1, arg0 ^ 0xFFFFD610);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILee;I)V")
    private final void method1068(int arg0, int arg1, class280 arg2, int arg3) {
        int var5 = 0 / ((arg0 + 64) / 56);
        field2600++;
        if (arg3 == 1) {
            this.field2597 = class44.method244(16711935, arg2.method1893((byte) -90));
        } else if (arg3 == 2) {
            this.field2601 = arg2.method1907(16832);
        } else if (arg3 == 3) {
            this.field2601 = arg2.method1891(-119);
            if (this.field2601 == 65535) {
                this.field2601 = -1;
                return;
            }
        } else if (arg3 == 5) {
            this.field2604 = false;
            return;
        } else if (arg3 == 7) {
            this.field2607 = class44.method244(16711935, arg2.method1893((byte) 100));
        } else if (arg3 == 8) {
            class82.field1515 = arg1;
            return;
        } else {
            if (arg3 == 9) {
                arg2.method1891(-115);
            } else if (arg3 != 10) {
                if (arg3 == 11) {
                    arg2.method1907(16832);
                } else if (arg3 != 12) {
                    if (arg3 == 13) {
                        arg2.method1893((byte) -123);
                    } else if (arg3 == 14) {
                        arg2.method1907(16832);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)V")
    public static final void method1069(int arg0, boolean arg1) {
        int var2 = 74 % ((arg0 + 20) / 54);
        field2596++;
        class152.field2658 = arg1;
        class168.field2956 = !class13.method57(2357);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lee;II)V")
    public final void method1070(class280 arg0, int arg1, int arg2) {
        field2603++;
        while (true) {
            int var4 = arg0.method1907(16832);
            if (var4 == 0) {
                if (arg1 == 4) {
                    return;
                } else {
                    method1071((byte) 94);
                    return;
                }
            }
            this.method1068(-125, arg2, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method1071(byte arg0) {
        field2605 = null;
        field2606 = null;
        field2611 = null;
        field2602 = null;
        field2609 = null;
        if (arg0 < 1) {
            method1067(-123, 2);
        }
    }
}
