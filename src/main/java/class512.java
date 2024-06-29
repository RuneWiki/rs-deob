import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class512 {

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
    private int field6996 = 0;

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "I")
    private int field7003 = 0;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "Lit;")
    private class591 field7000 = null;

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "I")
    private int field7001 = 0;

    @OriginalMember(owner = "client!nda", name = "l", descriptor = "Len;")
    private class289 field7007;

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "Lh;")
    private class609 field6999;

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "[Lua;")
    private class610[] field7005;

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "Laea;")
    public class46 field6998;

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "Lfc;")
    public static class235 field7004 = new class235(22, -1);

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!nda", name = "k", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZZIBII)V")
    public final void method2839(boolean arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5) {
        field6997++;
        int var7 = -89 / ((18 - arg3) / 57);
        boolean var8 = arg1 & this.field7007.method461();
        if (!var8 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
            if (arg2 == 4) {
                arg4 = arg5;
            }
            arg2 = 2;
        }
        if (arg2 != 0 && arg0) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field7003 != arg2) {
            if (this.field7003 != 0) {
                this.field7005[this.field7003 & Integer.MAX_VALUE].method252(31130);
            }
            if (arg2 != 0) {
                this.field7005[arg2 & Integer.MAX_VALUE].method257(arg0, -73);
                this.field7005[Integer.MAX_VALUE & arg2].method254(true, arg0);
                this.field7005[arg2 & Integer.MAX_VALUE].method258(arg4, arg5, (byte) 70);
            }
            this.field7000 = null;
            this.field7003 = arg2;
            this.field7001 = arg4;
            this.field6996 = arg5;
        } else if (this.field7003 != 0) {
            this.field7005[this.field7003 & Integer.MAX_VALUE].method254(true, arg0);
            if (this.field6996 != arg5 || this.field7001 != arg4) {
                this.field7005[this.field7003 & Integer.MAX_VALUE].method258(arg4, arg5, (byte) 70);
                this.field6996 = arg5;
                this.field7001 = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(BILit;)Z")
    public final boolean method2840(byte arg0, int arg1, class591 arg2) {
        field7002++;
        if (this.field7003 == 0) {
            return false;
        }
        if (this.field7000 != arg2) {
            this.field7005[this.field7003 & Integer.MAX_VALUE].method255(256, arg1, arg2);
            this.field7000 = arg2;
        }
        return arg0 > 114;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)Z")
    public final boolean method2841(int arg0, int arg1) {
        if (arg0 != 15688) {
            this.method2841(120, -116);
        }
        field7006++;
        return this.field7005[arg1].method262(arg0 ^ 0xFFFFC2B7);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V")
    public static void method2842(int arg0) {
        if (arg0 == 4) {
            field7004 = null;
        }
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Len;)V")
    public class512(class289 arg0) {
        this.field7007 = arg0;
        this.field6999 = new class609(arg0);
        this.field7005 = new class610[10];
        this.field7005[1] = new class199(arg0);
        this.field7005[2] = new class313(arg0, this.field6999);
        this.field7005[4] = new class325(arg0, this.field6999);
        this.field7005[5] = new class573(arg0, this.field6999);
        this.field7005[6] = new class669(arg0);
        this.field7005[7] = new class71(arg0);
        this.field7005[3] = this.field6998 = new class46(arg0);
        this.field7005[8] = new class506(arg0, this.field6999);
        this.field7005[9] = new class576(arg0, this.field6999);
        if (!this.field7005[8].method262(-1)) {
            this.field7005[8] = this.field7005[4];
        }
        if (!this.field7005[9].method262(-1)) {
            this.field7005[9] = this.field7005[8];
        }
    }
}
