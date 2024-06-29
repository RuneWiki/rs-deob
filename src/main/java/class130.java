import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class130 {

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lec;")
    public static class178 field1845 = null;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "J")
    public static volatile long field1852 = 0L;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "Lqj;")
    public static class196 field1856 = class80.method502("Lade Wordpack )2 ", -48);

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "Lqj;")
    public static class196 field1857 = class80.method502("sl_back", -48);

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "J")
    public long field1850;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "J")
    public static long field1854;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Lnf;")
    public class130 field1842;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Lnf;")
    public class130 field1849;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Lbk;")
    public static class136 field1846;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/String;I)Lqj;")
    public static final class196 method791(String arg0, int arg1) {
        int var2 = -65 % ((62 - arg1) / 38);
        byte[] var3;
        try {
            var3 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var3 = arg0.getBytes();
        }
        field1853++;
        class196 var4 = new class196();
        var4.field3459 = 0;
        var4.field3448 = var3;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != 0) {
                var3[var4.field3459++] = var3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V")
    public static final void method792(int arg0, int arg1) {
        if (arg1 != 30) {
            field1857 = null;
        }
        class126.field1785.method1535(arg0, 30704);
        class198.field3515.method130(-73, arg0);
        field1848++;
        class256.field4497.method1535(arg0, 30704);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method793(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 >= class188.field3296 && arg4 <= class95.field1388 && arg5 >= class188.field3296 && arg5 <= class95.field1388 && arg0 >= class188.field3296 && arg0 <= class95.field1388 && arg6 >= class188.field3296 && arg6 <= class95.field1388 && class93.field1361 <= arg1 && arg1 <= class23.field291 && arg3 >= class93.field1361 && arg3 <= class23.field291 && arg8 >= class93.field1361 && class23.field291 >= arg8 && class93.field1361 <= arg2 && class23.field291 >= arg2) {
            class252.method1700(arg2, arg8, arg1, arg4, arg6, arg7, arg3, arg5, 56, arg0);
        } else {
            class80.method505(arg1, arg6, arg8, arg2, arg5, arg4, arg7, arg0, arg3, -38);
        }
        if (arg9 != 10067) {
            field1845 = null;
        }
        field1847++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)Z")
    public final boolean method794(byte arg0) {
        int var2 = -91 / ((-arg0 - 42) / 35);
        field1855++;
        return this.field1849 != null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method795(int arg0) {
        field1856 = null;
        field1845 = null;
        field1846 = null;
        field1857 = null;
        if (arg0 != 302) {
            field1856 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ll;Z)V")
    public static final void method796(class190 arg0, boolean arg1) {
        if (class56.field741 == 0 || class56.field741 == 5) {
            byte var2 = 20;
            int var3 = 253 - var2;
            arg0.method1249(class60.field800, 382, 245 - var2, 16777215, -1);
            class55.method302(230, var3, 304, 34, 9179409);
            class55.method302(231, var3 + 1, 302, 32, 0);
            class55.method295(232, var3 + 2, class221.field3989 * 3, 30, 9179409);
            class55.method295(class221.field3989 * 3 + 232, var3 + 2, 300 - class221.field3989 * 3, 30, 0);
            arg0.method1249(class235.field4170, 382, 276 - var2, 16777215, -1);
        }
        if (arg1) {
            method793(-38, 21, -52, -25, -17, -110, -96, -121, -98, 93);
        }
        field1844++;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
    public final void method797(byte arg0) {
        field1851++;
        if (this.field1849 == null) {
            return;
        }
        this.field1849.field1842 = this.field1842;
        this.field1842.field1849 = this.field1849;
        if (arg0 < 95) {
            this.field1849 = null;
        }
        this.field1849 = null;
        this.field1842 = null;
    }
}
