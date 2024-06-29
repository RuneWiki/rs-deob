import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class28 extends class27 {

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
    public static int field451 = 0;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "Lnd;")
    public static class122 field453 = new class122();

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "I")
    public static int field455 = 0;

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "Lnb;")
    public static class120 field456 = new class120(64);

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "Lnb;")
    public static class120 field461 = new class120(64);

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "Z")
    public static volatile boolean field462 = false;

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "Lkb;")
    public static class93 field464 = class76.method390("ams", 0);

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
    public static int field463 = 0;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "Lqd;")
    public static class149 field457;

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "[[Lh;")
    public static class65[][] field460;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            int[] var3 = super.field447.method1238(arg1, arg0);
            if (super.field447.field3737) {
                class90.method474(var3, 0, class159.field3209, this.field452);
            }
            ++field450;
            return var3;
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    public class28() {
        this(4096);
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(I)V")
    private class28(int arg0) {
        super(0, true);
        this.field452 = 4096;
        this.field452 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        ++field458;
        if (arg0 <= 106) {
            this.method15((byte) 120, 49, (class158) null);
        }
        if (~arg1 == -1) {
            this.field452 = (arg2.method1054(128) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLh;)Lkb;")
    public static final class93 method156(byte arg0, class65 arg1) {
        ++field459;
        if (class158.method1084(69, class178.method1173(arg1, 125)) == 0) {
            return null;
        } else {
            if (arg0 < 41) {
                field455 = -84;
            }
            if (arg1.field1177 != null && ~arg1.field1177.method513(-112).method510(122) != -1) {
                return arg1.field1177;
            } else {
                return class135.field2620 ? class40.field675 : null;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)V")
    public static void method157(byte arg0) {
        if (arg0 != -49) {
            method156((byte) -25, (class65) null);
        }
        field460 = null;
        field461 = null;
        field453 = null;
        field464 = null;
        field457 = null;
        field456 = null;
    }
}
