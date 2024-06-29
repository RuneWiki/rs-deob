import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 {

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field72 = 0;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "[I")
    public static int[] field76 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Lmb;")
    public static class132 field78 = class166.method1092("Nehmen", 124);

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Lmb;")
    public static class132 field81 = class166.method1092("", 116);

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "[Lmb;")
    public static class132[] field82 = new class132[500];

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Lmb;")
    public static class132 field79 = class166.method1092(": ", 117);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Lpb;")
    public static class165 field74;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Lii;")
    public static class96 field80;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V")
    public static final void method31(int arg0, int arg1, int arg2, int arg3) {
        class169 var4 = class101.field1900[arg0][arg1][arg2];
        if (var4 != null) {
            class101.field1900[arg0][arg1][arg2].field3112 = arg3;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static final void method32(int arg0) {
        class77 var1 = (class77) class90.field1585.method119(true);
        if (arg0 > -90) {
            method33(null, null, null, -127);
        }
        while (var1 != null) {
            if (var1.field1327 != null) {
                var1.method482(-120);
            }
            var1 = (class77) class90.field1585.method125((byte) -123);
        }
        field75++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lmb;Lpb;Lmb;I)[Lhh;")
    public static final class85[] method33(class132 arg0, class165 arg1, class132 arg2, int arg3) {
        if (arg3 == -17992) {
            field77++;
            int var4 = arg1.method1065(arg2, -1);
            int var5 = arg1.method1090(-1, arg0, var4);
            return class103.method641(arg1, 536870911, var4, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lmb;B)Z")
    public static final boolean method34(class132 arg0, byte arg1) {
        field84++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 0;
        int var3 = 35 % ((arg1 + 36) / 39);
        while (client.field537 > var2) {
            if (arg0.method882(24493, class68.field1136[var2])) {
                return true;
            }
            var2++;
        }
        return arg0.method882(24493, class210.field3854.field2877);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static final void method35(byte arg0) {
        field73++;
        class119.field2259.method778((byte) 122);
        if (arg0 <= 115) {
            field82 = null;
        }
        class66.field1093.method1137(6902);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V")
    public static void method36(byte arg0) {
        if (arg0 > -48) {
            field79 = null;
        }
        field81 = null;
        field76 = null;
        field82 = null;
        field74 = null;
        field79 = null;
        field80 = null;
        field78 = null;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public static final void method37(int arg0) {
        if (arg0 != 26318) {
            field80 = null;
        }
        field83++;
        while (true) {
            class19 var1 = class128.field2370;
            class231 var2;
            synchronized (class128.field2370) {
                var2 = (class231) class163.field2946.method117((byte) 6);
            }
            if (var2 == null) {
                return;
            }
            var2.field4162.method1011(false, (int) var2.field2760, (byte) 118, var2.field4157, var2.field4160);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I")
    public static final int method38(int arg0, int arg1) {
        if (arg0 > -104) {
            return 77;
        } else {
            field70++;
            return arg1 >> 11 & 0x3F;
        }
    }
}
