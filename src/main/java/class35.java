import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class35 extends class112 {

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "[I")
    public static int[] field530 = new int[25];

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "Z")
    public static boolean field536 = false;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "Lgda;")
    public class61 field535;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "Z")
    public boolean field534;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "[Lgca;")
    public class265[] field537;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILha;II)Z")
    public final boolean method314(int arg0, class66 arg1, int arg2, int arg3) {
        field538++;
        int var5 = this.field535.method499(true);
        if (this.field537 != null) {
            for (int var6 = 0; var6 < this.field537.length; var6++) {
                this.field537[var6].field3134 <<= var5;
                if (this.field537[var6].method1578(arg0, arg3) && this.field535.method501(arg0, (byte) 31, arg3, arg1)) {
                    this.field537[var6].field3134 >>= var5;
                    return true;
                }
                this.field537[var6].field3134 >>= var5;
            }
        }
        if (arg2 > -120) {
            method316(67, 76, -17, 122, -122);
        }
        return false;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)I")
    public static final int method315(int arg0, int arg1) {
        return class406.field5335 == null ? 0 : class406.field5335[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIII)V")
    public static final void method316(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field531++;
        if (arg4 == -19129) {
            class714 var5 = class350.method2072((long) arg0 | (long) arg3 << 32, 19, (byte) 109);
            var5.method4043(arg4 + 25509);
            var5.field10021 = arg2;
            var5.field10018 = arg1;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static void method317(int arg0) {
        int var1 = 45 % ((-arg0 - 14) / 45);
        field530 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILbt;)V")
    public static final void method318(int arg0, class48 arg1) {
        class395.field5123 = arg1.method450((byte) 101, "hitmarks");
        field529++;
        class653.field9016 = arg1.method450((byte) 73, "hitbar_default");
        class648.field8838 = arg1.method450((byte) 99, "timerbar_default");
        class507.field7208 = arg1.method450((byte) 79, "headicons_pk");
        class687.field9371 = arg1.method450((byte) 72, "headicons_prayer");
        class183.field2236 = arg1.method450((byte) 99, "hint_headicons");
        class274.field3219 = arg1.method450((byte) 96, "hint_mapmarkers");
        class424.field5632 = arg1.method450((byte) 101, "mapflag");
        class459.field6465 = arg1.method450((byte) 109, "cross");
        if (arg0 < 103) {
            field532 = 57;
        }
        class298.field3563 = arg1.method450((byte) 114, "mapdots");
        class757.field10490 = arg1.method450((byte) 95, "scrollbar");
        class141.field1768 = arg1.method450((byte) 97, "name_icons");
        class60.field796 = arg1.method450((byte) 124, "floorshadows");
        class74.field1022 = arg1.method450((byte) 72, "compass");
        class563.field7775 = arg1.method450((byte) 83, "otherlevel");
        class256.field3030 = arg1.method450((byte) 87, "hint_mapedge");
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public static final void method319(byte arg0) {
        if (arg0 != -97) {
            method318(89, null);
        }
        field533++;
        class343.field4304 = class130.method973(2048, 4, 8, 35, 1, 0.4F, true, 8);
    }
}
