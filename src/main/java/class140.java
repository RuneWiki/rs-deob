import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class140 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Lam;")
    private class455 field1834;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "S")
    public static short field1835 = 1;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "Lev;")
    private class498 field1841;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "[[Lmn;")
    public static class251[][] field1843;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLam;)V")
    public final void method875(byte arg0, class455 arg1) {
        field1837++;
        if (arg0 == -18) {
            this.field1834 = arg1;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Lev;")
    public final class498 method876(byte arg0) {
        field1839++;
        if (arg0 > -70) {
            method881((byte) 105, null, null);
        }
        class498 var2 = this.field1834.field6378.field7055;
        if (this.field1834.field6378 == var2) {
            this.field1841 = null;
            return null;
        } else {
            this.field1841 = var2.field7055;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    public static final void method877(boolean arg0) {
        field1840++;
        if (class436.field6121) {
            return;
        }
        class364.method2153(class288.field4208, (byte) -79);
        if (class418.field5879 != null) {
            class364.method2153(class418.field5879, (byte) -109);
        }
        if (arg0) {
            field1843 = null;
        }
        class436.field6121 = true;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILjava/lang/String;II[B)I")
    public static final int method878(int arg0, int arg1, String arg2, int arg3, int arg4, byte[] arg5) {
        field1833++;
        int var6 = arg4 - arg3;
        if (arg1 != -256) {
            field1838 = 24;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg2.charAt(arg3 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg0 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg0 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg0 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg0 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg0 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg0 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg0 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg0 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg0 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg0 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg0 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg0 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg0 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg0 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg0 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg0 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg0 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg0 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg0 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg0 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg0 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg0 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg0 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg0 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg0 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg0 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg0 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg0 + var7] = -97;
            } else {
                arg5[arg0 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method879(int arg0) {
        if (arg0 <= 49) {
            method878(-118, 47, null, -108, 10, null);
        }
        field1843 = null;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)Lev;")
    public final class498 method880(byte arg0) {
        field1836++;
        class498 var2 = this.field1841;
        if (arg0 >= -15) {
            method877(true);
        }
        if (this.field1834.field6378 == var2) {
            this.field1841 = null;
            return null;
        } else {
            this.field1841 = var2.field7055;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLl;Loi;)V")
    public static final void method881(byte arg0, class16 arg1, class53 arg2) {
        class279.field4124 = arg2;
        int var3 = 58 % ((arg0 + 89) / 32);
        class377.field5348 = arg1;
        field1842++;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class140() {
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lam;)V")
    public class140(class455 arg0) {
        this.field1834 = arg0;
    }
}
