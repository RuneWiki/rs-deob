import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class631 {

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "Lbh;")
    private class538 field8993 = new class538(64);

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "Lwu;")
    private class557 field8996;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "Lwu;")
    private class557 field8992;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
    public static int field8989 = 503;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
    public static int field8990 = 0;

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "I")
    public static int field8995 = 0;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "Lju;")
    public static class102 field8991 = new class102(36, 2);

    @OriginalMember(owner = "client!naa", name = "k", descriptor = "Low;")
    public static class747 field8999 = new class747("", 11);

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!naa", name = "i", descriptor = "I")
    public static int field8997;

    @OriginalMember(owner = "client!naa", name = "j", descriptor = "[Lcw;")
    public static class21[] field8998;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)V", line = 15)
    public static void method3673(byte arg0) {
        int var1 = 104 / ((arg0 - 77) / 46);
        field8998 = null;
        field8999 = null;
        field8991 = null;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)Lmu;", line = 47)
    public final class218 method3674(int arg0, int arg1) {
        field8994++;
        class218 var3 = (class218) this.field8993.method3200((long) arg1, -19983);
        if (arg0 != 0) {
            this.method3674(20, -82);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field8992.method3322(0, arg1, (byte) 88);
        } else {
            var4 = this.field8996.method3322(0, arg1 & 0x7FFF, (byte) 107);
        }
        class218 var5 = new class218();
        if (var4 != null) {
            var5.method1429(4, new class26(var4));
        }
        if (arg1 >= 32768) {
            var5.method1432((byte) -83);
        }
        this.field8993.method3199((byte) 78, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(ILwu;Lwu;)V", line = 89)
    public class631(int arg0, class557 arg1, class557 arg2) {
        this.field8996 = arg2;
        this.field8992 = arg1;
        if (this.field8992 != null) {
            this.field8992.method3333(0, 3443);
        }
        if (this.field8996 != null) {
            this.field8996.method3333(0, 3443);
        }
    }
}
