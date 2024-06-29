import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class135 {

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "Lme;")
    private class668 field1782 = new class668(64);

    @OriginalMember(owner = "client!taa", name = "p", descriptor = "Lme;")
    public class668 field1786 = new class668(30);

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "Lpe;")
    public class615 field1773;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "Lpe;")
    private class615 field1777;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "Z")
    public static boolean field1775 = false;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "Lpw;")
    public static class89 field1774 = new class89(4);

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "[I")
    public static int[] field1779 = new int[2048];

    @OriginalMember(owner = "client!taa", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1784 = "";

    @OriginalMember(owner = "client!taa", name = "o", descriptor = "Lnj;")
    public static class415 field1785 = new class415(59, 7);

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!taa", name = "m", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!taa", name = "q", descriptor = "I")
    public int field1787;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V")
    public final void method982(byte arg0) {
        class668 var2 = this.field1782;
        synchronized (this.field1782) {
            this.field1782.method3658(0);
        }
        field1771++;
        class668 var3 = this.field1786;
        synchronized (this.field1786) {
            this.field1786.method3658(0);
        }
        if (arg0 <= 122) {
            this.method985(36, -17);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
    public final void method983(int arg0) {
        field1772++;
        class668 var2 = this.field1782;
        synchronized (this.field1782) {
            this.field1782.method3656((byte) 0);
        }
        class668 var3 = this.field1786;
        synchronized (this.field1786) {
            this.field1786.method3656((byte) 0);
        }
        if (arg0 > -114) {
            this.method985(121, -36);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZI)V")
    public final void method984(boolean arg0, int arg1) {
        field1778++;
        this.field1787 = arg1;
        class668 var3 = this.field1786;
        synchronized (this.field1786) {
            if (arg0) {
                this.method984(true, 81);
            }
            this.field1786.method3656((byte) 0);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)V")
    public final void method985(int arg0, int arg1) {
        class668 var3 = this.field1782;
        synchronized (this.field1782) {
            this.field1782.method3659(arg0 ^ 0xFFFFCC61, arg1);
            if (arg0 != 13303) {
                method988((byte) 108);
            }
        }
        field1781++;
        class668 var4 = this.field1786;
        synchronized (this.field1786) {
            this.field1786.method3659(-110, arg1);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IZ)Leca;")
    public final class322 method986(int arg0, boolean arg1) {
        field1783++;
        class668 var3 = this.field1782;
        class322 var4;
        synchronized (this.field1782) {
            var4 = (class322) this.field1782.method3655(-124, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class615 var5 = this.field1777;
        byte[] var6;
        synchronized (this.field1777) {
            var6 = this.field1777.method3346(-1, class50.method450(arg0, -126), class637.method3519((byte) -81, arg0));
            if (arg1) {
                this.method984(false, 39);
            }
        }
        class322 var7 = new class322();
        var7.field4160 = arg0;
        var7.field4159 = this;
        if (var6 != null) {
            var7.method1865((byte) -31, new class418(var6));
        }
        class668 var8 = this.field1782;
        synchronized (this.field1782) {
            this.field1782.method3650((long) arg0, -128, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IB)Z")
    public static final boolean method987(int arg0, byte arg1) {
        if (arg1 <= 117) {
            method987(85, (byte) 68);
        }
        field1780++;
        return arg0 == 0 || arg0 == 4;
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(B)V")
    public static void method988(byte arg0) {
        field1785 = null;
        field1779 = null;
        field1784 = null;
        if (arg0 == -15) {
            field1774 = null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lvd;ILpe;Lpe;)V")
    public class135(class635 arg0, int arg1, class615 arg2, class615 arg3) {
        this.field1773 = arg3;
        this.field1777 = arg2;
        int var5 = this.field1777.method3366(-52) - 1;
        this.field1777.method3341(var5, -19046);
    }
}
