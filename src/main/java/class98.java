import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class98 {

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "Z")
    public boolean field1638 = true;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public int field1635;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public int field1644;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public int field1640;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Z")
    public static boolean field1636 = true;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "[I")
    public static int[] field1639 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Z")
    public static volatile boolean field1647 = true;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "Ldf;")
    public static class51 field1646 = class46.method233("sl_stars", 100);

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field1641 = 0;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static void method725(byte arg0) {
        field1639 = null;
        field1646 = null;
        if (arg0 != -43) {
            method726(-72, -55, 39);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)J")
    public static final long method726(int arg0, int arg1, int arg2) {
        class97 var3 = class27.field395[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1620; var4++) {
            class33 var5 = var3.field1632[var4];
            if ((var5.field477 >> 29 & 0x3L) == 2L && var5.field492 == arg1 && var5.field491 == arg2) {
                return var5.field477;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1643 = arg0;
        this.field1638 = arg6;
        this.field1635 = arg5;
        this.field1644 = arg4;
        this.field1640 = arg1;
        this.field1637 = arg3;
        this.field1633 = arg2;
    }
}
