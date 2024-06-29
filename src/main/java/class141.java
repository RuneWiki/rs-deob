import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class141 {

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field2034 = 0;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Lbc;")
    public static class282 field2032;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "[[[B")
    public static byte[][][] field2031;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIILca;Lca;IIIIJ)V")
    public static final void method914(int arg0, int arg1, int arg2, int arg3, class131 arg4, class131 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class163 var12 = new class163();
        var12.field2347 = arg10;
        var12.field2337 = arg1 * 128 + 64;
        var12.field2331 = arg2 * 128 + 64;
        var12.field2336 = arg3;
        var12.field2335 = arg4;
        var12.field2334 = arg5;
        var12.field2328 = arg6;
        var12.field2329 = arg7;
        var12.field2333 = arg8;
        var12.field2339 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class6.field94[var13][arg1][arg2] == null) {
                class6.field94[var13][arg1][arg2] = new class133(var13, arg1, arg2);
            }
        }
        class6.field94[arg0][arg1][arg2].field1920 = var12;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method915(int arg0) {
        if (arg0 != -530095356) {
            method916(-41, -112);
        }
        field2031 = null;
        field2032 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
    public static final void method916(int arg0, int arg1) {
        field2035++;
        class66 var2 = class6.method34(6, true, arg1);
        var2.method410(122);
        int var3 = -97 % ((arg0 + 62) / 62);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)I")
    public static final int method917(byte arg0, int arg1) {
        if (arg0 < 87) {
            method917((byte) -115, -119);
        }
        field2033++;
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCD) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }
}
