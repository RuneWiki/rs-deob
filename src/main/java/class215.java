import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class215 {

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "Z")
    public boolean field3802 = true;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public int field3799;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public int field3791;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public int field3793;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public int field3800;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public int field3804;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public int field3797;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field3790 = 0;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "Le;")
    public static class191 field3795 = class54.method368("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 2047);

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "Le;")
    public static class191 field3798 = class54.method368("Freie Welt", 2047);

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "Le;")
    public static class191 field3796 = class54.method368("Update)2Liste geladen)3", 2047);

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "Le;")
    public static class191 field3803 = class54.method368("mem=", 2047);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lng;")
    public static class121 field3792;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lng;I)V")
    public static final void method1464(class121 arg0, int arg1) {
        class43.field748 = arg0;
        field3801++;
        if (arg1 != 27975) {
            method1464((class121) null, 17);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBII)I")
    public static final int method1465(int arg0, byte arg1, int arg2, int arg3) {
        field3788++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            if (arg1 >= -53) {
                method1466(false);
            }
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
    public static void method1466(boolean arg0) {
        if (arg0) {
            field3790 = -24;
        }
        field3803 = null;
        field3792 = null;
        field3795 = null;
        field3796 = null;
        field3798 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static final void method1467(byte arg0) {
        field3789++;
        if (arg0 != -125) {
            method1467((byte) 79);
        }
        if (class57.field1059 != null || class158.field2686 != null) {
            return;
        }
        int var1 = class33.field520;
        if (class258.field4575) {
            if (var1 != 1) {
                int var2 = class189.field3325;
                int var3 = class133.field2229;
                if (var2 < class192.field3447 - 10 || class224.field3986 + class192.field3447 + 10 < var2 || class123.field2041 - 10 > var3 || class123.field2041 - (-class93.field1522 - 10) < var3) {
                    class258.field4575 = false;
                    class71.method469(arg0 - 2, class93.field1522, class123.field2041, class192.field3447, class224.field3986);
                }
            }
            if (var1 == 1) {
                int var4 = class123.field2041;
                int var5 = class192.field3447;
                int var6 = class224.field3986;
                int var7 = class104.field1709;
                int var8 = class50.field897;
                int var9 = -1;
                for (int var10 = 0; var10 < class167.field2824; var10++) {
                    int var11 = var4 + ((class167.field2824 - var10 + -1) * 15) + 31;
                    if (var7 > var5 && var7 < var5 + var6 && var11 - 13 < var8 && var11 + 3 > var8) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class106.method681((byte) 113, var9);
                }
                class258.field4575 = false;
                class71.method469(-127, class93.field1522, class123.field2041, class192.field3447, class224.field3986);
                return;
            }
            return;
        }
        if (var1 == 1 && class167.field2824 > 0) {
            short var12 = class188.field3306[class167.field2824 - 1];
            if (var12 == 57 || var12 == 39 || var12 == 6 || var12 == 16 || var12 == 10 || var12 == 19 || var12 == 21 || var12 == 44 || var12 == 28 || var12 == 22 || var12 == 11 || var12 == 1001) {
                int var13 = class270.field4761[class167.field2824 - 1];
                int var14 = class166.field2800[class167.field2824 - 1];
                class33 var15 = class233.method1646(arg0 ^ 0xFFFFE976, var14);
                if (class117.method776(arg0 ^ 0x30ED7492, client.method668(var15)) || class254.method1759(178246909, client.method668(var15))) {
                    class261.field4623 = false;
                    class205.field3642 = 0;
                    if (class57.field1059 != null) {
                        class184.method1238(class57.field1059, (byte) -106);
                    }
                    class57.field1059 = class233.method1646(5877, var14);
                    class256.field4536 = class104.field1709;
                    class182.field3128 = class50.field897;
                    class119.field1963 = var13;
                    class184.method1238(class57.field1059, (byte) -86);
                    return;
                }
            }
        }
        if (var1 == 1 && (class190.field3342 == 1 && class167.field2824 > 2 || class164.method1107(false, class167.field2824 - 1))) {
            var1 = 2;
        }
        if (var1 == 2 && class167.field2824 > 0 || class23.field324 == 1) {
            class225.method1609(613072615);
        }
        if ((var1 != 1 || class167.field2824 <= 0) && class23.field324 != 2) {
            return;
        }
        class172.method1157((byte) 118);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IJ)V")
    public static final void method1468(int arg0, long arg1) {
        field3794++;
        class53.field963.field3996 = 0;
        class53.field963.method1613(66, 21);
        if (arg0 != -32109) {
            return;
        }
        class53.field963.method1589(arg1, false);
        class126.field2081 = 1;
        class239.field4224 = 0;
        class24.field345 = -3;
        class173.field2902 = 0;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3799 = arg2;
        this.field3791 = arg3;
        this.field3793 = arg1;
        this.field3800 = arg0;
        this.field3804 = arg4;
        this.field3797 = arg5;
        this.field3802 = arg6;
    }
}
