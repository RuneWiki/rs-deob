import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class102 {

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Leea;")
    private class680 field1238;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public int field1234;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public int field1233;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Lpj;")
    public static class102 field1241 = new class102(0, 3, class680.field9668);

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "Lpj;")
    public static class102 field1242 = new class102(1, 3, class680.field9668);

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "Lpj;")
    public static class102 field1243 = new class102(2, 4, class680.field9664);

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Lpj;")
    public static class102 field1244 = new class102(3, 1, class680.field9668);

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Lpj;")
    public static class102 field1245 = new class102(4, 2, class680.field9668);

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "Lpj;")
    public static class102 field1246 = new class102(5, 3, class680.field9668);

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Lpj;")
    private static class102 field1247 = new class102(6, 4, class680.field9668);

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field1248 = class335.method2138(16, 36161);

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "[J")
    public static long[] field1249;

    @OriginalMember(owner = "client!pj", name = "toString", descriptor = "()Ljava/lang/String;", line = 7)
    public final String toString() {
        field1237++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)[Lpj;", line = 18)
    public static final class102[] method550(int arg0) {
        field1240++;
        if (arg0 != 3) {
            method552((byte) -103);
        }
        return new class102[] { field1241, field1242, field1243, field1244, field1245, field1246, field1247 };
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V", line = 35)
    public static void method551(boolean arg0) {
        field1241 = null;
        field1243 = null;
        field1247 = null;
        field1246 = null;
        field1242 = null;
        field1249 = null;
        if (arg0) {
            field1246 = null;
        }
        field1244 = null;
        field1245 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 52)
    public static final void method552(byte arg0) {
        field1239++;
        if (class373.field5382) {
            return;
        }
        class308.field4137 = true;
        if (arg0 <= 1) {
            return;
        }
        if (class72.field935.field6535) {
            class283.field3826 = ((int) class283.field3826 + 47 & 0xFFFFFFF0);
        } else {
            class74.field945 += (12.0F - class74.field945) / 2.0F;
        }
        class373.field5382 = true;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IILeea;)V", line = 84)
    private class102(int arg0, int arg1, class680 arg2) {
        this.field1235 = arg1;
        this.field1238 = arg2;
        this.field1234 = arg0;
        this.field1233 = this.field1238.field9661 * this.field1235;
        if (this.field1234 >= 16) {
            throw new RuntimeException();
        }
    }
}
