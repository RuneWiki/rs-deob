import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class283 {

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public int field3816 = -1;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public int field3815 = 8;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "Z")
    public boolean field3818 = true;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public int field3817 = 64;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    public int field3820 = 0;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
    public int field3825 = -1;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public int field3814 = 127;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "Z")
    public boolean field3819 = true;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
    public int field3824 = -1;

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "I")
    public int field3831 = 512;

    @OriginalMember(owner = "client!ss", name = "u", descriptor = "Z")
    public boolean field3833 = false;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public int field3813 = 1190717;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "Lrh;")
    public static class59 field3823 = new class59();

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "F")
    public static float field3826 = 1024.0F;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "[I")
    public static int[] field3828 = new int[32];

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "Z")
    public static boolean field3832 = false;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    public int field3827;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "Lvb;")
    public class411 field3821;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ldga;BI)V")
    private final void method1700(class138 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field3820 = class453.method2576(116, arg0.method904(117));
        } else if (arg2 == 2) {
            this.field3824 = arg0.method957((byte) -88);
        } else if (arg2 == 3) {
            this.field3824 = arg0.method922((byte) -113);
            if (this.field3824 == 65535) {
                this.field3824 = -1;
            }
        } else if (arg2 == 5) {
            this.field3818 = false;
        } else if (arg2 == 7) {
            this.field3816 = class453.method2576(121, arg0.method904(125));
        } else if (arg2 == 8) {
            this.field3821.field5771 = this.field3827;
        } else if (arg2 == 9) {
            this.field3831 = arg0.method922((byte) -117) << 2;
        } else if (arg2 == 10) {
            this.field3819 = false;
        } else if (arg2 == 11) {
            this.field3815 = arg0.method957((byte) -104);
        } else if (arg2 == 12) {
            this.field3833 = true;
        } else if (arg2 == 13) {
            this.field3813 = arg0.method904(121);
        } else if (arg2 == 14) {
            this.field3817 = arg0.method957((byte) -85) << 2;
        } else if (arg2 == 15) {
            this.field3825 = arg0.method922((byte) -118);
            if (this.field3825 == 65535) {
                this.field3825 = -1;
            }
        } else if (arg2 == 16) {
            this.field3814 = arg0.method957((byte) -94);
        }
        field3830++;
        if (arg1 <= 26) {
            this.method1703(-50);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BLdga;)V")
    public final void method1701(byte arg0, class138 arg1) {
        while (true) {
            int var3 = arg1.method957((byte) -64);
            if (var3 == 0) {
                field3829++;
                if (arg0 != -63) {
                    this.field3814 = -98;
                    return;
                }
                return;
            }
            this.method1700(arg1, (byte) 123, var3);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    public static void method1702(int arg0) {
        field3823 = null;
        if (arg0 == -1) {
            field3828 = null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
    public final void method1703(int arg0) {
        if (arg0 != 29424) {
            return;
        }
        this.field3815 = this.field3827 | this.field3815 << 8;
        if (this.field3825 == -1) {
            this.field3825 = this.field3824;
        }
        field3822++;
    }
}
