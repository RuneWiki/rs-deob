import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class210 extends class256 {

    @OriginalMember(owner = "client!og", name = "z", descriptor = "I")
    public int field3794 = 12800;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "Z")
    public boolean field3798 = true;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public int field3804 = -1;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public int field3799 = 12800;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "I")
    public int field3793 = 0;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public int field3809 = 0;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "Ljd;")
    public class86 field3795;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "Ljd;")
    public class86 field3796;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public int field3802;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public int field3807;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "Lrk;")
    public class257 field3800;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "Ljd;")
    private static class86 field3791 = class122.method868("Walk here", true);

    @OriginalMember(owner = "client!og", name = "R", descriptor = "Ljd;")
    public static class86 field3810 = field3791;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "Loe;")
    public static class139 field3792 = new class139();

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "Lbj;")
    public static class151 field3811;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
    public static final void method1488(int arg0, int arg1) {
        class119.field2327.method693(6, arg1);
        field3808++;
        if (arg0 < 92) {
            method1488(72, 87);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static void method1489(byte arg0) {
        field3791 = null;
        field3811 = null;
        field3792 = null;
        if (arg0 < 21) {
            method1489((byte) -118);
        }
        field3810 = null;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
    public final void method1490(byte arg0) {
        this.field3809 = 0;
        this.field3794 = 12800;
        this.field3799 = 12800;
        field3805++;
        if (arg0 != 32) {
            this.method1490((byte) 117);
        }
        this.field3793 = 0;
        for (class248 var2 = (class248) this.field3800.method1737((byte) 74); var2 != null; var2 = (class248) this.field3800.method1740(-8843)) {
            if (this.field3809 < var2.field4410) {
                this.field3809 = var2.field4410;
            }
            if (this.field3794 > var2.field4403) {
                this.field3794 = var2.field4403;
            }
            if (var2.field4408 > this.field3793) {
                this.field3793 = var2.field4408;
            }
            if (var2.field4411 < this.field3799) {
                this.field3799 = var2.field4411;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILwj;I)V")
    public static final void method1491(int arg0, int arg1, class6 arg2, int arg3) {
        field3803++;
        if (class84.field1637 != null || class195.field3506 || arg2 == null || class198.method1366((byte) 23, arg2) == null) {
            return;
        }
        class84.field1637 = arg2;
        class198.field3517 = class198.method1366((byte) -6, arg2);
        class273.field4790 = arg0;
        class136.field2601 = false;
        class100.field1958 = 0;
        class260.field4653 = arg1;
        if (arg3 > -38) {
            field3811 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILjava/lang/String;)Ljd;")
    public static final class86 method1492(int arg0, String arg1) {
        field3797++;
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg1.getBytes();
        }
        class86 var3 = new class86();
        var3.field1704 = arg0;
        var3.field1670 = var2;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field1704++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)I")
    public static final int method1493(int arg0) {
        if (arg0 != 16) {
            method1491(-110, 65, (class6) null, -16);
        }
        field3812++;
        return 16;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Z")
    public final boolean method1494(int arg0, int arg1, int arg2) {
        field3806++;
        if (this.field3794 > arg1 || this.field3809 < arg1 || arg2 < this.field3799 || this.field3793 < arg2) {
            return false;
        }
        int var4 = -50 / ((arg0 - 37) / 57);
        for (class248 var5 = (class248) this.field3800.method1737((byte) 74); var5 != null; var5 = (class248) this.field3800.method1740(-8843)) {
            if (var5.method1680(arg1, arg2, (byte) -103)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljd;Ljd;IIIZ)V")
    public class210(class86 arg0, class86 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3795 = arg0;
        this.field3796 = arg1;
        this.field3802 = arg3;
        this.field3804 = arg4;
        this.field3798 = arg5;
        this.field3807 = arg2;
        this.field3800 = new class257();
    }
}
