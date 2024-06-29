import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class303 extends class627 {

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "Z")
    public boolean field3900;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "Lmo;")
    public class513 field3898;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public int field3897;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public int field3899;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field3896 = 765;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "[Ljaa;")
    public static class266[] field3903 = new class266[0];

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lus;")
    public static class328 field3895 = new class328(48, 8);

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field3904 = 1;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Z")
    public boolean field3892;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Z")
    public boolean field3893;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Z")
    public boolean field3894;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "[Lmb;")
    public static class410[] field3902;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method1783(byte arg0) {
        field3902 = null;
        field3903 = null;
        if (arg0 != 56) {
            method1784((byte) 6, 34, -99);
        }
        field3895 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BII)Z")
    public static final boolean method1784(byte arg0, int arg1, int arg2) {
        if (arg0 <= 110) {
            method1784((byte) -20, 13, -111);
        }
        field3901++;
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(ILmo;IZ)V")
    public class303(int arg0, class513 arg1, int arg2, boolean arg3) {
        this.field3900 = arg3;
        this.field3898 = arg1;
        this.field3897 = arg2;
        this.field3899 = arg0;
    }
}
