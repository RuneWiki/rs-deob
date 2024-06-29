import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class12 {

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public int field188 = 0;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Z")
    public static volatile boolean field184 = true;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "[I")
    public static int[] field185;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V", line = 4)
    public static final void method66(int arg0, int arg1) {
        class124.field1810 = arg1;
        class362.field5742 = arg0;
        field190++;
        class362.field5742 = -1;
        class259.method1905(-127);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBLsb;)V", line = 17)
    private final void method67(int arg0, byte arg1, class190 arg2) {
        field186++;
        if (arg0 == 5) {
            this.field188 = arg2.method1317((byte) 100);
        }
        int var4 = -108 % ((23 - arg1) / 62);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 35)
    public static final void method68(int arg0) {
        Container var1;
        if (class124.field1809 != null) {
            var1 = class124.field1809;
        } else if (class131.field1905 == null) {
            var1 = class54.field787.field878;
        } else {
            var1 = class131.field1905;
        }
        field191++;
        class212.field3069 = var1.getSize().width;
        class98.field1389 = var1.getSize().height;
        if (class131.field1905 == var1) {
            Insets var2 = class131.field1905.getInsets();
            class98.field1389 -= var2.top + var2.bottom;
            class212.field3069 -= var2.right + var2.left;
        }
        if (class89.method706(-12311) < 2) {
            class286.field4312 = 765;
            class329.field4954 = (class212.field3069 - 765) / 2;
            class19.field301 = 503;
            class354.field5445 = 0;
        } else {
            class329.field4954 = 0;
            class354.field5445 = 0;
            class286.field4312 = class212.field3069;
            class19.field301 = class98.field1389;
        }
        if (class141.field2031) {
            class141.method1004(class286.field4312, class19.field301);
        }
        class306.field4585.setSize(class286.field4312, class19.field301);
        if (class131.field1905 == var1) {
            Insets var3 = class131.field1905.getInsets();
            class306.field4585.setLocation(class329.field4954 + var3.left, class354.field5445 + var3.top);
        } else {
            class306.field4585.setLocation(class329.field4954, class354.field5445);
        }
        if (class257.field3850 != arg0) {
            class202.method1469(true, (byte) -58);
        }
        class228.method1705((byte) 94);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)I", line = 96)
    public static final int method69(int arg0, int arg1) {
        if (arg0 == 15046) {
            field189++;
            return arg1 >>> 7;
        } else {
            return -53;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lsb;I)V", line = 111)
    public final void method70(class190 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1319(arg1 - 510);
            if (var3 == 0) {
                if (arg1 != 765) {
                    field185 = (int[]) null;
                }
                field183++;
                return;
            }
            this.method67(var3, (byte) -87, arg0);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[Lnk;)V", line = 128)
    public static final void method71(int arg0, class224[] arg1) {
        class129.field1874[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 143)
    public static void method72(int arg0) {
        field185 = null;
        if (arg0 != -1) {
            method72(121);
        }
    }
}
