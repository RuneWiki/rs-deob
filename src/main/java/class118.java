import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class118 extends class337 {

    @OriginalMember(owner = "client!wp", name = "B", descriptor = "Z")
    public boolean field1787;

    @OriginalMember(owner = "client!wp", name = "t", descriptor = "I")
    public int field1780;

    @OriginalMember(owner = "client!wp", name = "w", descriptor = "Ljava/lang/String;")
    public String field1783;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "Z")
    public boolean field1777;

    @OriginalMember(owner = "client!wp", name = "C", descriptor = "I")
    public int field1788;

    @OriginalMember(owner = "client!wp", name = "v", descriptor = "I")
    public int field1782;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "J")
    public long field1775;

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "Ljava/lang/String;")
    public String field1778;

    @OriginalMember(owner = "client!wp", name = "u", descriptor = "I")
    public int field1781;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "Lki;")
    public static class498 field1776 = new class498(70, 8);

    @OriginalMember(owner = "client!wp", name = "x", descriptor = "Lst;")
    public static class296 field1784 = new class296();

    @OriginalMember(owner = "client!wp", name = "y", descriptor = "[Lnm;")
    public static class329[] field1785 = new class329[14];

    @OriginalMember(owner = "client!wp", name = "z", descriptor = "[Lno;")
    public static class494[] field1786 = new class494[30];

    @OriginalMember(owner = "client!wp", name = "D", descriptor = "I")
    public static int field1789 = 0;

    @OriginalMember(owner = "client!wp", name = "E", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!wp", name = "F", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)V")
    public static void method785(boolean arg0) {
        field1785 = null;
        field1776 = null;
        if (!arg0) {
            field1776 = null;
        }
        field1784 = null;
        field1786 = null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)Lup;")
    public static final class179 method786(int arg0) {
        if (arg0 != 21070) {
            method785(false);
        }
        field1791++;
        try {
            return (class179) Class.forName("ec").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class118(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field1787 = arg8;
        this.field1780 = arg6;
        this.field1783 = arg0;
        this.field1777 = arg9;
        this.field1788 = arg7;
        this.field1782 = arg2;
        this.field1775 = arg5;
        this.field1779 = arg4;
        this.field1778 = arg1;
        this.field1781 = arg3;
    }
}
