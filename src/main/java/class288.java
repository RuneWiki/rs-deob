import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class288 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "[I")
    public static int[] field4481 = new int[2];

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Lrg;")
    public static class257 field4486 = null;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "J")
    public long field4489;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Lwj;")
    public static class130 field4490;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Lnh;")
    public class288 field4482;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Lnh;")
    public class288 field4487;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1932(int arg0, String arg1) {
        if (arg0 != -1) {
            return -10;
        }
        field4485++;
        if (class200.field2840 == null || arg1.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class200.field2840.field2238; var2++) {
            if (class258.method1653(arg1, ~arg0, class138.method902(class200.field2840.field2229[var2], " ", (byte) -120, "<br>"))) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static final void method1933(byte arg0) {
        class224.field3161 = new class284(32);
        if (arg0 < 50) {
            method1933((byte) 37);
        }
        field4484++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method1934(int arg0) {
        field4490 = null;
        if (arg0 != 0) {
            field4486 = null;
        }
        field4481 = null;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public final void method1935(int arg0) {
        if (arg0 < 99) {
            return;
        }
        field4480++;
        if (this.field4482 != null) {
            this.field4482.field4487 = this.field4487;
            this.field4487.field4482 = this.field4482;
            this.field4487 = null;
            this.field4482 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)Z")
    public final boolean method1936(byte arg0) {
        if (arg0 != 126) {
            field4486 = null;
        }
        field4488++;
        return this.field4482 != null;
    }
}
