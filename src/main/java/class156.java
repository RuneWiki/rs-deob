import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class156 {

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public int field1928;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "S")
    public short field1939;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "B")
    public byte field1930;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "S")
    public short field1936;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "B")
    public byte field1927;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "S")
    public short field1926;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "Z")
    public boolean field1931;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "Lig;")
    public static class206 field1932 = new class206(46, -2);

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "Lea;")
    public static class474 field1938 = new class474("Loaded JAGGL", "JAGGL geladen", "JAGGL chargé", "JAGGL carregado");

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "[Lng;")
    public static class290[] field1935;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
    public static void method903(byte arg0) {
        int var1 = 71 / ((66 - arg0) / 50);
        field1932 = null;
        field1935 = null;
        field1938 = null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIZIFII)[[I")
    public static final int[][] method904(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, float arg6, int arg7, int arg8) {
        field1929++;
        int[][] var9 = new int[arg7][arg8];
        class363 var10 = new class363();
        var10.field5511 = arg0;
        var10.field5499 = arg3;
        var10.field5503 = (int) (arg6 * 4096.0F);
        var10.field5508 = arg1;
        var10.field5509 = arg4;
        var10.method145(21);
        class39.method205(arg8, arg7, 121);
        if (arg2 != 0) {
            field1937 = -110;
        }
        for (int var11 = 0; var11 < arg7; var11++) {
            var10.method2341((byte) -114, var9[var11], var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIBII)Lwp;")
    public final class156 method905(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 <= 63) {
            this.field1926 = -92;
        }
        field1934++;
        return new class156(arg3, arg0, arg1, arg4, this.field1939, this.field1926, this.field1936, this.field1930, this.field1927, this.field1931);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
    public static final void method906(int arg0) {
        class612.field8902 = arg0;
        class20.field200 = arg0;
        class22.field231 = arg0;
        class518.field7541 = arg0;
        field1933++;
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
    public class156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field1928 = arg0;
        this.field1939 = (short) arg4;
        this.field1930 = (byte) arg7;
        this.field1936 = (short) arg6;
        this.field1927 = (byte) arg8;
        this.field1926 = (short) arg5;
        this.field1931 = arg9;
    }
}
