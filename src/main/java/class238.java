import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class238 extends class60 {

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public int field4142 = 0;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4122 = new CRC32();

    @OriginalMember(owner = "client!id", name = "K", descriptor = "Lub;")
    public static class227 field4134 = class257.method1749("::", 17263);

    @OriginalMember(owner = "client!id", name = "R", descriptor = "Lub;")
    public static class227 field4140 = class257.method1749("Standort", 17263);

    @OriginalMember(owner = "client!id", name = "O", descriptor = "B")
    public static byte field4137 = 0;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public int field4123;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    public int field4125;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public int field4127;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    public int field4128;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "I")
    public int field4130;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public int field4136;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public int field4139;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "I")
    public int field4141;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "I")
    public int field4144;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "Lwb;")
    public class170 field4129;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "Lwb;")
    public class170 field4145;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "Lld;")
    public class195 field4124;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "Lqa;")
    public class225 field4135;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "Lfa;")
    public class45 field4132;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Z")
    public boolean field4121;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "[I")
    public int[] field4126;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)I")
    public static final int method1583(int arg0, int arg1) {
        field4143++;
        return arg0 == 1023 ? arg1 & 0x3FF : -108;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V")
    public static void method1584(byte arg0) {
        field4122 = null;
        field4134 = null;
        if (arg0 < 38) {
            method1588(true);
        }
        field4140 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4119++;
        if (class195.method1234(arg7, (byte) -4)) {
            if (arg4 < 32) {
                method1583(66, 122);
            }
            client.method495(class102.field1792[arg7], -1, arg0, arg6, arg2, arg3, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLub;)Z")
    public static final boolean method1586(byte arg0, class227 arg1) {
        field4133++;
        if (arg0 < 9) {
            field4140 = null;
        }
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class166.field2781; var2++) {
            if (arg1.method1522(class201.field3442[var2], (byte) -56)) {
                return true;
            }
        }
        return arg1.method1522(class216.field3639.field3819, (byte) -56);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public final void method1587(int arg0) {
        field4131++;
        int var2 = this.field4139;
        if (this.field4132 != null) {
            class45 var5 = this.field4132.method242(64);
            if (var5 == null) {
                this.field4136 = 0;
                this.field4130 = 0;
                this.field4141 = 0;
                this.field4126 = null;
                this.field4139 = -1;
            } else {
                this.field4136 = var5.field798;
                this.field4141 = var5.field778;
                this.field4139 = var5.field783;
                this.field4126 = var5.field806;
                this.field4130 = var5.field747 * 128;
            }
        } else if (this.field4124 != null) {
            int var3 = class36.method191((byte) 118, this.field4124);
            if (var2 != var3) {
                this.field4139 = var3;
                class147 var4 = this.field4124.field3315;
                if (var4.field2563 != null) {
                    var4 = var4.method933(arg0 + 29882);
                }
                if (var4 == null) {
                    this.field4130 = 0;
                } else {
                    this.field4130 = var4.field2521 * 128;
                }
            }
        } else if (this.field4135 != null) {
            this.field4139 = class63.method399(-96, this.field4135);
            this.field4130 = this.field4135.field3831 * 128;
        }
        if (arg0 == 0 && this.field4139 != var2 && this.field4129 != null) {
            class94.field1627.method479(this.field4129);
            this.field4129 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)I")
    public static final int method1588(boolean arg0) {
        field4120++;
        return arg0 ? -77 : 6;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IIIIIIII)Z")
    public static final boolean method1589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }
}
