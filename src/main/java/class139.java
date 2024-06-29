import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class139 extends class238 {

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "[Ljd;")
    public class139[] field1848;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Z")
    public boolean field1841;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "[I")
    public static int[] field1830 = new int[2048];

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "Lpr;")
    public static class284 field1850;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "[Lkm;")
    public static class216[] field1851;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public int field1849;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Lrn;")
    public class161 field1835;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "Lac;")
    public class348 field1844;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[[I")
    public int[][] method33(int arg0, int arg1) {
        if (arg0 > -67) {
            field1830 = null;
        }
        field1837++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)I")
    public int method875(byte arg0) {
        field1840++;
        if (arg0 >= -45) {
            this.method879((byte) -54, 24, 19);
        }
        return -1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public void method876(int arg0) {
        if (arg0 != -7155) {
            return;
        }
        if (this.field1841) {
            this.field1844.method2174((byte) -17);
            this.field1844 = null;
        } else {
            this.field1835.method1007(-89);
            this.field1835 = null;
        }
        field1839++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
    public void method877(int arg0, int arg1, int arg2) {
        field1834++;
        int var4 = ~this.field1849 == arg0 ? arg2 : this.field1849;
        if (this.field1841) {
            this.field1844 = new class348(var4, arg2, arg1);
        } else {
            this.field1835 = new class161(var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lrp;BI)V")
    public void method21(class276 arg0, byte arg1, int arg2) {
        if (arg1 != -45) {
            this.field1841 = true;
        }
        field1832++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[S[Ljava/lang/String;BI)V")
    public static final void method878(int arg0, short[] arg1, String[] arg2, byte arg3, int arg4) {
        field1836++;
        if (arg3 >= -126) {
            method881((byte) 126);
        }
        if (arg4 <= arg0) {
            return;
        }
        int var5 = (arg0 + arg4) / 2;
        int var6 = arg0;
        String var7 = arg2[var5];
        arg2[var5] = arg2[arg4];
        arg2[arg4] = var7;
        short var8 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var8;
        for (int var9 = arg0; var9 < arg4; var9++) {
            if (var7 == null || arg2[var9] != null && (var9 & 0x1) > arg2[var9].compareTo(var7)) {
                String var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                short var11 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6++] = var11;
            }
        }
        arg2[arg4] = arg2[var6];
        arg2[var6] = var7;
        arg1[arg4] = arg1[var6];
        arg1[var6] = var8;
        method878(arg0, arg1, arg2, (byte) -127, var6 - 1);
        method878(var6 + 1, arg1, arg2, (byte) -127, arg4);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BII)[I")
    public final int[] method879(byte arg0, int arg1, int arg2) {
        if (arg0 != -29) {
            this.field1848 = null;
        }
        field1842++;
        return this.field1848[arg2].field1841 ? this.field1848[arg2].method22(arg1, 27782) : this.field1848[arg2].method33(-96, arg1)[0];
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)V")
    public static void method880(byte arg0) {
        field1850 = null;
        int var1 = -76 % ((24 - arg0) / 43);
        field1851 = null;
        field1830 = null;
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(B)V")
    public static final void method881(byte arg0) {
        if (arg0 <= 63) {
            method878(27, (short[]) null, (String[]) null, (byte) -46, -112);
        }
        class79.field972 = 0;
        class239.field3588 = 0;
        class94.field1218 = 0;
        class115.field1470 = 0;
        field1847++;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[I")
    public int[] method22(int arg0, int arg1) {
        if (arg1 != 27782) {
            method881((byte) -51);
        }
        field1845++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(III)[[I")
    public final int[][] method882(int arg0, int arg1, int arg2) {
        field1846++;
        if (arg2 != 1) {
            this.method21((class276) null, (byte) 15, -51);
        }
        if (this.field1848[arg0].field1841) {
            int[] var4 = this.field1848[arg0].method22(arg1, 27782);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1848[arg0].method33(-105, arg1);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public void method23(int arg0) {
        field1833++;
        if (arg0 != 7) {
            field1830 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(B)I")
    public int method883(byte arg0) {
        field1838++;
        if (arg0 <= 45) {
            this.field1844 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method884(String arg0, int arg1) {
        class42.method284("", (byte) 97, arg0, "", arg1, 0);
        field1831++;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IZ)V")
    public class139(int arg0, boolean arg1) {
        this.field1848 = new class139[arg0];
        this.field1841 = arg1;
    }

    static {
        new class326("Ok", "Okay", "OK", "Ok");
        field1850 = new class284();
        field1851 = new class216[32768];
    }
}
