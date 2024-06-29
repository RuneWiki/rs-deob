import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class371 {

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public int field5695 = 64;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public int field5698 = 1;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "Z")
    public boolean field5697 = false;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public int field5696 = -1;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public int field5694 = 2;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "Z")
    public boolean field5700 = false;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public int field5701 = 64;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "Lbi;")
    public static class104 field5702 = new class104(9, 8);

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
    public static final void method2413(boolean arg0) {
        if (!arg0) {
            class81.method578((byte) 66, class228.field3793);
            class397.field5994++;
            field5693++;
            class170.field2488.method1479((byte) -125, 0);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZZI)I")
    public static final int method2414(int arg0, boolean arg1, boolean arg2, int arg3) {
        field5692++;
        class339 var4 = class154.method940(arg3, arg1, (byte) 119);
        if (var4 == null) {
            return -1;
        } else {
            if (arg2) {
                field5702 = null;
            }
            return arg0 >= 0 && arg0 < var4.field5287.length ? var4.field5287[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public static void method2415(int arg0) {
        if (arg0 >= -74) {
            field5704 = -95;
        }
        field5702 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBLhw;)V")
    public final void method2416(int arg0, byte arg1, class208 arg2) {
        if (arg1 != -70) {
            this.field5695 = 85;
        }
        field5699++;
        while (true) {
            int var4 = arg2.method1445(arg1 ^ 0x1B);
            if (var4 == 0) {
                return;
            }
            this.method2417(arg2, 118, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lhw;III)V")
    private final void method2417(class208 arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 114) {
            return;
        }
        field5705++;
        if (arg2 == 1) {
            this.field5696 = arg0.method1455(-3387);
            if (this.field5696 == 65535) {
                this.field5696 = -1;
            }
        } else if (arg2 == 2) {
            this.field5695 = arg0.method1455(-3387) + 1;
            this.field5701 = arg0.method1455(-3387) + 1;
        } else if (arg2 == 3) {
            arg0.method1427(false);
        } else if (arg2 == 4) {
            this.field5694 = arg0.method1445(116);
        } else if (arg2 == 5) {
            this.field5698 = arg0.method1445(64);
            return;
        } else if (arg2 == 6) {
            this.field5700 = true;
            return;
        } else if (arg2 == 7) {
            this.field5697 = true;
            return;
        }
    }
}
