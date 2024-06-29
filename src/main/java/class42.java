import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class42 {

    @OriginalMember(owner = "client!cja", name = "c", descriptor = "Z")
    public boolean field622;

    @OriginalMember(owner = "client!cja", name = "e", descriptor = "I")
    public static int field624 = 0;

    @OriginalMember(owner = "client!cja", name = "h", descriptor = "Lhg;")
    public static class693 field627 = new class693(35, 15);

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!cja", name = "d", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!cja", name = "f", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!cja", name = "j", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "Lia;")
    public class591 field621;

    @OriginalMember(owner = "client!cja", name = "g", descriptor = "Lia;")
    public class591 field626;

    @OriginalMember(owner = "client!cja", name = "i", descriptor = "Z")
    public boolean field628;

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(B)V", line = 3)
    public static void method301(byte arg0) {
        if (arg0 != -100) {
            field627 = null;
        }
        field627 = null;
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(I)Z", line = 26)
    public final boolean method302(int arg0) {
        if (arg0 == -344560822) {
            field623++;
            return this.field628 && !this.field622;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "(I)V", line = 37)
    public final void method303(int arg0) {
        if (this.field621 != null) {
            this.field621.method294((byte) 44);
        }
        field629++;
        this.field628 = false;
        if (arg0 != 30398) {
            method304(-68, 70);
        }
    }

    @OriginalMember(owner = "client!cja", name = "<init>", descriptor = "(Z)V", line = 50)
    public class42(boolean arg0) {
        this.field622 = arg0;
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(II)I", line = 63)
    public static final int method304(int arg0, int arg1) {
        field620++;
        if (arg0 != -344560822) {
            field624 = -40;
        }
        return arg1 >>> 10;
    }
}
