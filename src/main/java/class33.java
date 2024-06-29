import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public abstract class class33 extends class76 {

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    public int field461;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "S")
    public short field463;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "S")
    public short field471;

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "Z")
    public boolean field470;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "B")
    public byte field458;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "B")
    public byte field464;

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "S")
    public short field468;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "S")
    public short field456;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "[I")
    public static int[] field460 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
    public static int field465 = 0;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "Lfm;")
    public static class515 field467 = new class515(0);

    @OriginalMember(owner = "client!bt", name = "w", descriptor = "I")
    public static int field474 = 0;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!bt", name = "v", descriptor = "Lrs;")
    public static class462 field473;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIBII)V", line = 4)
    public static final void method214(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field469++;
        if (arg2 > 87) {
            class343.field4727 = arg4;
            class54.field753 = arg0;
            class382.field5379 = arg1;
            class175.field2497 = arg3;
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 42)
    public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field461 = arg3;
        this.field463 = (short) arg4;
        this.field457 = arg2;
        this.field471 = (short) arg7;
        this.field470 = arg8;
        this.field458 = arg9;
        this.field466 = arg1;
        this.field464 = (byte) arg0;
        this.field468 = (short) arg6;
        this.field456 = (short) arg5;
    }

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "(I)V", line = 59)
    public static void method216(int arg0) {
        field473 = null;
        field460 = null;
        if (arg0 != -9607) {
            method216(98);
        }
        field467 = null;
    }

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "(I)V", line = 77)
    public void method157(int arg0) {
        field459++;
        if (arg0 <= 7) {
            method216(-106);
        }
    }

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)I")
    public abstract int method215(int arg0);
}
