import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class136 {

    @OriginalMember(owner = "client!an", name = "i", descriptor = "S")
    public short field1870;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public int field1873;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "B")
    public byte field1863;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "S")
    public short field1874;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "I")
    public int field1876;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public int field1866;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public int field1865;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "S")
    public short field1862;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "Z")
    public boolean field1869;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public int field1868;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "B")
    public static byte field1867;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([BIIIIII)Z")
    public static final boolean method970(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1877++;
        int var7 = arg1 % arg4;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg4 - var7;
        }
        int var9 = -((arg4 + arg6 - 1) / arg4);
        int var10 = -((arg1 + arg4 - 1) / arg4);
        if (arg2 != 11364) {
            method970(null, 120, -37, 116, 47, -10, -60);
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg0[arg5] == 0) {
                    return true;
                }
                arg5 += arg4;
            }
            int var13 = arg5 - var8;
            if (arg0[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg3 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BLha;)V")
    public static final void method971(byte arg0, class543 arg1) {
        for (class27 var2 = (class27) class293.field4026.method1527(61); var2 != null; var2 = (class27) class293.field4026.method1523(true)) {
            if (var2.field255) {
                var2.method133(arg1);
            }
        }
        if (arg0 < 10) {
            method971((byte) -73, null);
        }
        field1864++;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BF)F")
    public static final float method972(byte arg0, float arg1) {
        int var2 = 120 % ((arg0 + 48) / 50);
        field1872++;
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method973(int arg0, String arg1) {
        field1871++;
        if (arg0 != 10149) {
            method972((byte) 52, -0.10556779F);
        }
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class312.method1934(arg1.charAt(var2), arg0 - 10182)) {
            var2++;
        }
        while (var2 < var3 && class312.method1934(arg1.charAt(var3 - 1), arg0 ^ 0xFFFFD87A)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class64.method580(var7, (byte) 73)) {
                char var8 = class492.method2992(var7, arg0 ^ 0xFFFFD04B);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field1870 = (short) arg6;
        this.field1873 = arg3;
        this.field1863 = (byte) arg8;
        this.field1874 = (short) arg5;
        this.field1876 = arg1;
        this.field1866 = arg11;
        this.field1865 = arg2;
        this.field1862 = (short) arg4;
        this.field1869 = arg10;
        this.field1868 = arg0;
    }
}
