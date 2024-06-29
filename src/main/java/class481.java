import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public abstract class class481 extends class417 {

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "Z")
    public boolean field6832 = true;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "Z")
    public boolean field6837 = true;

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
    public int field6839 = 0;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "Z")
    public boolean field6834 = true;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "I")
    public int field6831 = 0;

    @OriginalMember(owner = "client!tv", name = "w", descriptor = "Z")
    public boolean field6845 = true;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
    public int field6838 = 1;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
    public int field6840 = 127;

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
    public int field6841 = 0;

    @OriginalMember(owner = "client!tv", name = "F", descriptor = "Z")
    public boolean field6854 = false;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "Z")
    public boolean field6835 = true;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "Z")
    public boolean field6836 = true;

    @OriginalMember(owner = "client!tv", name = "E", descriptor = "Z")
    public boolean field6853 = true;

    @OriginalMember(owner = "client!tv", name = "B", descriptor = "I")
    public int field6850 = 127;

    @OriginalMember(owner = "client!tv", name = "I", descriptor = "I")
    public int field6857 = 3;

    @OriginalMember(owner = "client!tv", name = "N", descriptor = "I")
    public int field6862 = 0;

    @OriginalMember(owner = "client!tv", name = "P", descriptor = "Z")
    public boolean field6864 = true;

    @OriginalMember(owner = "client!tv", name = "V", descriptor = "I")
    public int field6870 = 0;

    @OriginalMember(owner = "client!tv", name = "Q", descriptor = "I")
    public int field6865 = 0;

    @OriginalMember(owner = "client!tv", name = "J", descriptor = "I")
    public int field6858 = 2;

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "Z")
    public boolean field6842 = true;

    @OriginalMember(owner = "client!tv", name = "S", descriptor = "Z")
    public boolean field6867 = false;

    @OriginalMember(owner = "client!tv", name = "X", descriptor = "I")
    public int field6872 = 2;

    @OriginalMember(owner = "client!tv", name = "G", descriptor = "I")
    public int field6855 = 2;

    @OriginalMember(owner = "client!tv", name = "R", descriptor = "Z")
    public boolean field6866 = true;

    @OriginalMember(owner = "client!tv", name = "Y", descriptor = "I")
    public int field6873 = 127;

    @OriginalMember(owner = "client!tv", name = "O", descriptor = "I")
    public int field6863 = 3;

    @OriginalMember(owner = "client!tv", name = "W", descriptor = "Z")
    public boolean field6871 = true;

    @OriginalMember(owner = "client!tv", name = "y", descriptor = "Z")
    public boolean field6847 = false;

    @OriginalMember(owner = "client!tv", name = "U", descriptor = "I")
    public int field6869 = 2;

    @OriginalMember(owner = "client!tv", name = "T", descriptor = "Z")
    public boolean field6868 = true;

    @OriginalMember(owner = "client!tv", name = "K", descriptor = "I")
    public int field6859 = 0;

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!tv", name = "x", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!tv", name = "A", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!tv", name = "C", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!tv", name = "H", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!tv", name = "L", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "Lkda;")
    public static class328 field6843;

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "Z")
    public boolean field6844;

    @OriginalMember(owner = "client!tv", name = "D", descriptor = "Z")
    public boolean field6852;

    @OriginalMember(owner = "client!tv", name = "M", descriptor = "Z")
    public boolean field6861;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIZ)V")
    public final void method2893(int arg0, int arg1, boolean arg2) {
        field6849++;
        if (arg0 != 0) {
            this.field6871 = false;
        }
        if (class637.method3695(arg1, -4)) {
            this.field6844 = arg2;
        } else {
            this.field6861 = arg2;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)V")
    public final void method2894(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        field6846++;
        if (class637.method3695(arg1, arg2 - 4)) {
            this.field6869 = arg0;
        } else {
            this.field6841 = arg0;
        }
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(II)Z")
    public final boolean method2895(int arg0, int arg1) {
        field6848++;
        if (arg1 == 0) {
            return class637.method3695(arg0, arg1 ^ 0xFFFFFFFC) ? this.field6844 : this.field6861;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(III)Z")
    public static final boolean method2896(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            method2899((byte) -69);
        }
        field6851++;
        return class531.method3208(arg1, arg2, 117) & class613.method3590(arg0 - 77, arg2, arg1);
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(II)I")
    public final int method2897(int arg0, int arg1) {
        if (arg1 == 6373) {
            field6856++;
            return class637.method3695(arg0, -4) ? this.field6869 : this.field6841;
        } else {
            return -6;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BLgw;)V")
    public final void method2898(byte arg0, class148 arg1) {
        field6860++;
        arg1.method1049(-1, 18);
        arg1.method1049(-1, this.field6863);
        arg1.method1049(-1, this.field6866 ? 1 : 0);
        arg1.method1049(-1, this.field6864 ? 1 : 0);
        arg1.method1049(-1, this.field6837 ? 1 : 0);
        arg1.method1049(arg0 - 12, this.field6835 ? 1 : 0);
        arg1.method1049(-1, 0);
        if (arg0 != 11) {
            return;
        }
        arg1.method1049(arg0 ^ 0xFFFFFFF4, this.field6836 ? 1 : 0);
        arg1.method1049(-1, this.field6845 ? 1 : 0);
        arg1.method1049(-1, this.field6868 ? 1 : 0);
        arg1.method1049(-1, this.field6869);
        arg1.method1049(-1, this.field6841);
        arg1.method1049(-1, this.field6844 ? 1 : 0);
        arg1.method1049(-1, this.field6861 ? 1 : 0);
        arg1.method1049(arg0 - 12, this.field6832 ? 1 : 0);
        arg1.method1049(-1, this.field6842 ? 1 : 0);
        arg1.method1049(-1, this.field6862);
        arg1.method1049(arg0 ^ 0xFFFFFFF4, this.field6871 ? 1 : 0);
        arg1.method1049(-1, this.field6840);
        arg1.method1049(-1, this.field6850);
        arg1.method1049(arg0 ^ 0xFFFFFFF4, this.field6873);
        arg1.method1027(255, this.field6839);
        arg1.method1027(arg0 + 244, this.field6865);
        arg1.method1049(-1, class86.method644((byte) 68));
        arg1.method1058(arg0 ^ 0x23EB9A83, this.field6870);
        arg1.method1049(-1, this.field6858);
        arg1.method1049(-1, this.field6854 ? 1 : 0);
        arg1.method1049(-1, this.field6852 ? 1 : 0);
        arg1.method1049(-1, this.field6859);
        arg1.method1049(-1, this.field6867 ? 1 : 0);
        arg1.method1049(arg0 ^ 0xFFFFFFF4, this.field6834 ? 1 : 0);
        arg1.method1049(-1, this.field6838);
        arg1.method1049(-1, this.field6853 ? 1 : 0);
        arg1.method1049(-1, this.field6872);
        arg1.method1049(arg0 ^ 0xFFFFFFF4, this.field6855);
        arg1.method1049(-1, this.field6847 ? 1 : 0);
        arg1.method1049(-1, this.field6857);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
    public static void method2899(byte arg0) {
        field6843 = null;
        if (arg0 <= 99) {
            method2899((byte) -10);
        }
    }
}
