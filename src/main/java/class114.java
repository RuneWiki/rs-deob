import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class114 {

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public int field1741 = -1;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public int field1738 = 0;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public int field1739 = -1;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "Z")
    public boolean field1745 = true;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "F")
    public static float field1742 = 0.0F;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "[I")
    public static int[] field1746 = new int[14];

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "Lrg;")
    public static class248 field1744;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public static void method790(int arg0) {
        field1746 = null;
        field1744 = null;
        if (arg0 != -1) {
            method790(-123);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BILfj;)V")
    public final void method791(byte arg0, int arg1, class274 arg2) {
        while (true) {
            int var4 = arg2.method1849(255);
            if (var4 == 0) {
                if (arg0 != 18) {
                    this.field1739 = 126;
                }
                field1743++;
                return;
            }
            this.method792(var4, arg2, -29547, arg1);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILfj;II)V")
    private final void method792(int arg0, class274 arg1, int arg2, int arg3) {
        if (arg0 == 1) {
            this.field1738 = class93.method652(arg1.method1812(true), (byte) -104);
        } else if (arg0 == 2) {
            this.field1741 = arg1.method1849(255);
        } else if (arg0 == 3) {
            this.field1741 = arg1.method1837(arg2 ^ 0xFFFF8C69);
            if (this.field1741 == 65535) {
                this.field1741 = -1;
            }
        } else if (arg0 == 5) {
            this.field1745 = false;
        } else if (arg0 == 7) {
            this.field1739 = class93.method652(arg1.method1812(true), (byte) -104);
        } else if (arg0 == 8) {
            class195.field3160 = arg3;
        } else if (arg0 == 9) {
            arg1.method1837(252);
        } else if (arg0 != 10) {
            if (arg0 == 11) {
                arg1.method1849(255);
            } else if (arg0 != 12) {
                if (arg0 == 13) {
                    arg1.method1812(true);
                } else if (arg0 == 14) {
                    arg1.method1849(arg2 + 29802);
                }
            }
        }
        field1740++;
        if (arg2 != -29547) {
            method790(10);
        }
    }
}
