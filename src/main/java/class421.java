import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class421 extends class766 {

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "I")
    public int field5839 = 0;

    @OriginalMember(owner = "client!bv", name = "y", descriptor = "Lhk;")
    public static class153 field5844 = new class153(1, 2, 2, 0);

    @OriginalMember(owner = "client!bv", name = "O", descriptor = "Z")
    public static boolean field5859 = true;

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "I")
    public int field5836;

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "I")
    public int field5840;

    @OriginalMember(owner = "client!bv", name = "w", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!bv", name = "x", descriptor = "I")
    public int field5843;

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "I")
    public int field5845;

    @OriginalMember(owner = "client!bv", name = "C", descriptor = "I")
    public int field5848;

    @OriginalMember(owner = "client!bv", name = "D", descriptor = "I")
    public int field5849;

    @OriginalMember(owner = "client!bv", name = "E", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!bv", name = "F", descriptor = "I")
    public int field5851;

    @OriginalMember(owner = "client!bv", name = "G", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!bv", name = "H", descriptor = "I")
    public int field5853;

    @OriginalMember(owner = "client!bv", name = "J", descriptor = "I")
    public int field5855;

    @OriginalMember(owner = "client!bv", name = "K", descriptor = "I")
    public int field5856;

    @OriginalMember(owner = "client!bv", name = "P", descriptor = "I")
    public int field5860;

    @OriginalMember(owner = "client!bv", name = "Q", descriptor = "I")
    public int field5861;

    @OriginalMember(owner = "client!bv", name = "R", descriptor = "I")
    public int field5862;

    @OriginalMember(owner = "client!bv", name = "T", descriptor = "I")
    public int field5864;

    @OriginalMember(owner = "client!bv", name = "U", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!bv", name = "B", descriptor = "Lud;")
    public class101 field5847;

    @OriginalMember(owner = "client!bv", name = "V", descriptor = "Lud;")
    public class101 field5866;

    @OriginalMember(owner = "client!bv", name = "N", descriptor = "Lea;")
    public class21 field5858;

    @OriginalMember(owner = "client!bv", name = "L", descriptor = "Lsea;")
    public class416 field5857;

    @OriginalMember(owner = "client!bv", name = "A", descriptor = "Lgh;")
    public class506 field5846;

    @OriginalMember(owner = "client!bv", name = "s", descriptor = "Lrw;")
    public class543 field5838;

    @OriginalMember(owner = "client!bv", name = "I", descriptor = "Lrw;")
    public class543 field5854;

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "Lws;")
    public class557 field5835;

    @OriginalMember(owner = "client!bv", name = "S", descriptor = "Lws;")
    public class557 field5863;

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "Z")
    public boolean field5833;

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "Z")
    public boolean field5834;

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "Z")
    public boolean field5841;

    @OriginalMember(owner = "client!bv", name = "r", descriptor = "[I")
    public int[] field5837;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(III)V")
    public static final void method2483(int arg0, int arg1, int arg2) {
        class414.field5684 = arg2 - class751.field10445;
        field5852++;
        class630.field8932 = arg1 - class751.field10446;
        if (arg0 < 33) {
            method2484(-37);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
    public static void method2484(int arg0) {
        field5844 = null;
        if (arg0 < 27) {
            method2484(-97);
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)V")
    public final void method2485(int arg0) {
        field5850++;
        int var2 = this.field5862;
        boolean var3 = this.field5833;
        if (this.field5857 != null) {
            class416 var6 = this.field5857.method2458(class578.field8328, -1);
            if (var6 == null) {
                this.field5837 = null;
                this.field5851 = 0;
                this.field5856 = 0;
                this.field5833 = false;
                this.field5840 = 0;
                this.field5862 = -1;
                this.field5834 = false;
                this.field5843 = 256;
                this.field5853 = 0;
                this.field5836 = 256;
                this.field5864 = 0;
            } else {
                this.field5836 = var6.field5786;
                this.field5864 = var6.field5788 << 9;
                this.field5843 = var6.field5694;
                this.field5853 = var6.field5766;
                this.field5851 = var6.field5706;
                this.field5833 = var6.field5780;
                this.field5862 = var6.field5710;
                this.field5840 = var6.field5691;
                this.field5834 = var6.field5700;
                this.field5837 = var6.field5722;
            }
        } else if (this.field5846 != null) {
            int var4 = class396.method2358(true, this.field5846);
            if (var2 != var4) {
                this.field5862 = var4;
                class179 var5 = this.field5846.field6964;
                if (var5.field2683 != null) {
                    var5 = var5.method1304(class578.field8328, -25917);
                }
                if (var5 == null) {
                    this.field5833 = this.field5846.field6964.field2743;
                    this.field5836 = 256;
                    this.field5843 = 256;
                    this.field5853 = this.field5864 = this.field5856 = 0;
                } else {
                    this.field5836 = var5.field2674;
                    this.field5864 = var5.field2712 << 9;
                    this.field5833 = var5.field2743;
                    this.field5856 = var5.field2698 << 9;
                    this.field5843 = var5.field2748;
                    this.field5853 = var5.field2672;
                }
            }
        } else if (this.field5858 != null) {
            this.field5862 = class679.method3817(this.field5858, 0);
            this.field5856 = 0;
            this.field5843 = 256;
            this.field5833 = this.field5858.field245;
            this.field5853 = this.field5858.field220;
            this.field5864 = this.field5858.field233 << 9;
            this.field5836 = 256;
        }
        if (arg0 >= -17 || this.field5862 == var2 && this.field5833 == var3) {
            return;
        }
        if (this.field5835 == null) {
            return;
        }
        class234.field3399.method4220(this.field5835);
        this.field5866 = null;
        this.field5835 = null;
        this.field5854 = null;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZI)Z")
    public static final boolean method2486(int arg0, boolean arg1, int arg2) {
        field5842++;
        if (arg1) {
            method2483(64, 43, 63);
        }
        return (arg2 & 0x400) != 0;
    }
}
