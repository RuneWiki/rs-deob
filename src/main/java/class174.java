import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class174 extends class166 {

    @OriginalMember(owner = "client!td", name = "C", descriptor = "[I")
    public int[] field3453 = new int[5];

    @OriginalMember(owner = "client!td", name = "u", descriptor = "[Lkf;")
    public class95[] field3445 = new class95[5];

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public int field3444 = 0;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public int field3457;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public int field3446;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public int field3467;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public int field3464;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field3448 = 0;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "Lsa;")
    public static class162 field3441 = new class162(64);

    @OriginalMember(owner = "client!td", name = "U", descriptor = "Lcd;")
    public static class23 field3471 = class54.method414("Suche nach Updates )2 ", -1);

    @OriginalMember(owner = "client!td", name = "S", descriptor = "Lcd;")
    public static class23 field3469 = class54.method414("<img=0>", -1);

    @OriginalMember(owner = "client!td", name = "W", descriptor = "[I")
    public static int[] field3473 = new int[32];

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public static int field3472 = -1;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "[[I")
    public static int[][] field3474 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public int field3442;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public int field3447;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public int field3451;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public int field3456;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    public int field3461;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public int field3466;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "Lph;")
    public class142 field3449;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "Ls;")
    public class161 field3455;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "Ltd;")
    public class174 field3468;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "Ltg;")
    public class177 field3454;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "Lu;")
    public class179 field3465;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Ldg;")
    public class35 field3443;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "Ll;")
    public class98 field3463;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "Z")
    public boolean field3458;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "Z")
    public boolean field3459;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "Z")
    public boolean field3460;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "[I")
    public static int[] field3475;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
    public static void method1095(byte arg0) {
        field3441 = null;
        field3471 = null;
        field3474 = null;
        if (arg0 >= -16) {
            method1096(null, 28);
        }
        field3473 = null;
        field3469 = null;
        field3475 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lfa;I)V")
    public static final void method1096(class47 arg0, int arg1) {
        field3462++;
        if (arg1 >= -70) {
            field3470 = 57;
        }
        int var2 = arg0.field1124;
        if (var2 == 324) {
            if (class6.field116 == -1) {
                class72.field1646 = arg0.field1016;
                class6.field116 = arg0.field1025;
            }
            if (class13.field292.field3291) {
                arg0.field1025 = class6.field116;
            } else {
                arg0.field1025 = class72.field1646;
            }
        } else if (var2 == 325) {
            if (class6.field116 == -1) {
                class72.field1646 = arg0.field1016;
                class6.field116 = arg0.field1025;
            }
            if (class13.field292.field3291) {
                arg0.field1025 = class72.field1646;
            } else {
                arg0.field1025 = class6.field116;
            }
        } else if (var2 == 327) {
            arg0.field1073 = 150;
            arg0.field1048 = (int) (Math.sin((double) class15.field339 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1135 = 5;
            arg0.field1032 = 0;
        } else if (var2 == 328) {
            arg0.field1073 = 150;
            arg0.field1048 = (int) (Math.sin((double) class15.field339 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1135 = 5;
            arg0.field1032 = 1;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(III)V")
    public class174(int arg0, int arg1, int arg2) {
        this.field3457 = arg1;
        this.field3446 = arg2;
        this.field3464 = this.field3467 = arg0;
    }
}
