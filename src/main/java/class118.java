import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class118 {

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "Z")
    public boolean field2005 = true;

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "Lmu;")
    public static class303 field2008 = new class303(6, 2);

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "C")
    private char field2003;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public int field2000;

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "Ljava/lang/String;")
    public String field2002;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Lcea;B)V", line = 4)
    public final void method1030(class215 arg0, byte arg1) {
        int var3 = -47 % ((arg1 + 74) / 49);
        while (true) {
            int var4 = arg0.method1535(255);
            if (var4 == 0) {
                field2007++;
                return;
            }
            this.method1033(true, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)Z", line = 28)
    public final boolean method1031(boolean arg0) {
        field2006++;
        if (arg0) {
            return true;
        } else {
            return this.field2003 == 's';
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V", line = 42)
    public static void method1032(int arg0) {
        if (arg0 >= -125) {
            field2008 = null;
        }
        field2008 = null;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZLcea;I)V", line = 53)
    private final void method1033(boolean arg0, class215 arg1, int arg2) {
        field2001++;
        if (arg2 == 1) {
            this.field2003 = class216.method1548(arg1.method1536(-115), -128);
        } else if (arg2 == 2) {
            this.field2000 = arg1.method1533((byte) -126);
        } else if (arg2 == 4) {
            this.field2005 = false;
        } else if (arg2 == 5) {
            this.field2002 = arg1.method1525((byte) 91);
        }
        if (!arg0) {
            this.field2005 = true;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(III)I", line = 84)
    public static final int method1034(int arg0, int arg1, int arg2) {
        field2004++;
        int var3 = arg2 >>> 31;
        if (arg1 > 0) {
            method1034(82, -44, -111);
        }
        return (arg2 + var3) / arg0 - var3;
    }
}
