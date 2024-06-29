import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class281 extends class403 {

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    public int field3768 = -1;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
    public int field3767 = 12800;

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
    public int field3780 = 0;

    @OriginalMember(owner = "client!vj", name = "U", descriptor = "Z")
    public boolean field3786 = true;

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "I")
    public int field3776 = 12800;

    @OriginalMember(owner = "client!vj", name = "Q", descriptor = "I")
    public int field3782 = -1;

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "I")
    public int field3772 = 0;

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
    public int field3774;

    @OriginalMember(owner = "client!vj", name = "P", descriptor = "Ljava/lang/String;")
    public String field3781;

    @OriginalMember(owner = "client!vj", name = "M", descriptor = "I")
    public int field3778;

    @OriginalMember(owner = "client!vj", name = "R", descriptor = "Ljava/lang/String;")
    public String field3783;

    @OriginalMember(owner = "client!vj", name = "H", descriptor = "Lld;")
    public class105 field3773;

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "Leh;")
    public static class222 field3775 = new class222(0, -1);

    @OriginalMember(owner = "client!vj", name = "S", descriptor = "I")
    public static int field3784 = 0;

    @OriginalMember(owner = "client!vj", name = "W", descriptor = "Lgd;")
    public static class206 field3788 = new class206("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!vj", name = "T", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!vj", name = "X", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!vj", name = "Y", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!vj", name = "Z", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!vj", name = "ab", descriptor = "Lr;")
    public static class110 field3792;

    @OriginalMember(owner = "client!vj", name = "V", descriptor = "Lks;")
    public static class278 field3787;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([Ljava/lang/Object;[JB)V")
    public static final void method1586(Object[] arg0, long[] arg1, byte arg2) {
        class317.method1738(arg1, 26085, arg1.length - 1, arg0, 0);
        field3769++;
        if (arg2 >= -68) {
            field3788 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[III)Z")
    public final boolean method1587(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        if (arg1 != 32765) {
            this.field3773 = null;
        }
        field3779++;
        for (class417 var6 = (class417) this.field3773.method652((byte) 37); var6 != null; var6 = (class417) this.field3773.method653(30)) {
            if (var6.method2485(arg0, arg4, arg3, (byte) -106)) {
                var6.method2481(arg1 ^ 0x7FE5, arg4, arg2, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V")
    public static final void method1588(int arg0, int arg1) {
        field3770++;
        class280.field3734.method496(arg0, -76);
        class471.field6493.method496(arg0, 68);
        class140.field2023.method496(arg0, 78);
        class215.field2896.method496(arg0, -117);
        if (arg1 >= -66) {
            field3784 = 34;
        }
        class87.field1212.method496(arg0, 73);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBI)Z")
    public final boolean method1589(int arg0, byte arg1, int arg2) {
        field3791++;
        for (class417 var4 = (class417) this.field3773.method652((byte) 37); var4 != null; var4 = (class417) this.field3773.method653(15)) {
            if (var4.method2488(arg0, true, arg2)) {
                return true;
            }
        }
        if (arg1 != -61) {
            this.field3780 = -28;
        }
        return false;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public static void method1590(int arg0) {
        if (arg0 == 0) {
            field3792 = null;
            field3775 = null;
            field3787 = null;
            field3788 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([IIII)Z")
    public final boolean method1591(int[] arg0, int arg1, int arg2, int arg3) {
        field3785++;
        for (class417 var5 = (class417) this.field3773.method652((byte) 37); var5 != null; var5 = (class417) this.field3773.method653(124)) {
            if (var5.method2482(arg1, arg2, (byte) -23)) {
                var5.method2483(arg2, 0, arg0, arg1);
                return true;
            }
        }
        if (arg3 != 12800) {
            method1586((Object[]) null, (long[]) null, (byte) -11);
        }
        return false;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
    public final void method1592(int arg0) {
        this.field3776 = 12800;
        this.field3767 = 12800;
        field3771++;
        this.field3772 = 0;
        this.field3780 = 0;
        if (arg0 >= -45) {
            field3790 = 65;
        }
        for (class417 var2 = (class417) this.field3773.method652((byte) 37); var2 != null; var2 = (class417) this.field3773.method653(16)) {
            if (this.field3780 < var2.field5667) {
                this.field3780 = var2.field5667;
            }
            if (var2.field5678 < this.field3767) {
                this.field3767 = var2.field5678;
            }
            if (this.field3772 < var2.field5673) {
                this.field3772 = var2.field5673;
            }
            if (this.field3776 > var2.field5664) {
                this.field3776 = var2.field5664;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZII[I)Z")
    public final boolean method1593(boolean arg0, int arg1, int arg2, int[] arg3) {
        field3777++;
        if (!arg0) {
            field3790 = -116;
        }
        for (class417 var5 = (class417) this.field3773.method652((byte) 37); var5 != null; var5 = (class417) this.field3773.method653(33)) {
            if (var5.method2488(arg2, true, arg1)) {
                var5.method2481(24, arg2, arg3, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class281(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field3774 = arg0;
        this.field3786 = arg5;
        this.field3782 = arg6;
        this.field3781 = arg2;
        this.field3768 = arg4;
        this.field3778 = arg3;
        this.field3783 = arg1;
        if (this.field3782 == 255) {
            this.field3782 = 0;
        }
        this.field3773 = new class105();
    }
}
