import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class226 extends class301 {

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public int field3718 = -1;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public int field3722 = 12800;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public int field3724 = 12800;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "Z")
    public boolean field3719 = true;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public int field3728 = 0;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public int field3717 = 0;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public int field3729 = -1;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "Ljava/lang/String;")
    public String field3725;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "Ljava/lang/String;")
    public String field3720;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    public int field3732;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "Len;")
    public class49 field3730;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)Z", line = 6)
    public final boolean method1574(int arg0, int arg1, int arg2) {
        field3727++;
        for (class153 var4 = (class153) this.field3730.method431(arg0); var4 != null; var4 = (class153) this.field3730.method439(-28512)) {
            if (var4.method1091(arg2, -1716, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V", line = 32)
    public final void method1575(int arg0) {
        this.field3728 = 0;
        this.field3722 = 12800;
        field3726++;
        this.field3724 = 12800;
        this.field3717 = arg0;
        for (class153 var2 = (class153) this.field3730.method431(0); var2 != null; var2 = (class153) this.field3730.method439(-28512)) {
            if (var2.field2604 < this.field3724) {
                this.field3724 = var2.field2604;
            }
            if (this.field3728 < var2.field2616) {
                this.field3728 = var2.field2616;
            }
            if (this.field3722 > var2.field2606) {
                this.field3722 = var2.field2606;
            }
            if (var2.field2620 > this.field3717) {
                this.field3717 = var2.field2620;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 176)
    public class226(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field3718 = arg6;
        if (this.field3718 == 255) {
            this.field3718 = 0;
        }
        this.field3719 = arg5;
        this.field3725 = arg2;
        this.field3720 = arg1;
        this.field3732 = arg3;
        this.field3729 = arg4;
        this.field3721 = arg0;
        this.field3730 = new class49();
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[IBI)Z", line = 78)
    public final boolean method1576(int arg0, int[] arg1, byte arg2, int arg3) {
        field3723++;
        for (class153 var5 = (class153) this.field3730.method431(0); var5 != null; var5 = (class153) this.field3730.method439(-28512)) {
            if (var5.method1097(arg3, arg0, (byte) 11)) {
                var5.method1090(arg3, arg2 ^ 0xFFFFFFC4, arg1, arg0);
                return true;
            }
        }
        if (arg2 != 104) {
            this.method1574(-128, -54, 70);
        }
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIB[I)Z", line = 104)
    public final boolean method1577(int arg0, int arg1, byte arg2, int[] arg3) {
        field3716++;
        for (class153 var5 = (class153) this.field3730.method431(0); var5 != null; var5 = (class153) this.field3730.method439(-28512)) {
            if (var5.method1091(arg0, -1716, arg1)) {
                var5.method1098((byte) -62, arg0, arg1, arg3);
                return true;
            }
        }
        if (arg2 >= -27) {
            this.method1576(123, (int[]) null, (byte) -51, 54);
        }
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[III)Z", line = 133)
    public final boolean method1578(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        if (arg4 != 601) {
            this.field3721 = -94;
        }
        field3731++;
        for (class153 var6 = (class153) this.field3730.method431(0); var6 != null; var6 = (class153) this.field3730.method439(arg4 ^ 0xFFFF92F9)) {
            if (var6.method1096(arg3, (byte) -73, arg0, arg1)) {
                var6.method1098((byte) -62, arg3, arg1, arg2);
                return true;
            }
        }
        return false;
    }
}
