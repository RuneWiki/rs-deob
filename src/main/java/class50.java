import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class50 extends class125 {

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "[Loa;")
    public static class99[] field814 = new class99[1000];

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "Loa;")
    private static class99 field809 = class221.method1463(2844, "Loaded config");

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "Loa;")
    public static class99 field819 = field809;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public int field806;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    public int field817;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public int field825;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "I")
    public int field829;

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "client!ej", name = "Z", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "Lbk;")
    public class20 field818;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "Ljc;")
    public class240 field810;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "Lp;")
    public class286 field820;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "Ltd;")
    public class72 field828;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)V")
    public static final void method347(int arg0, byte arg1) {
        int var2 = -47 % ((arg1 - 50) / 39);
        field830++;
        class65 var3 = class152.method1010(arg0, 3, (byte) -49);
        var3.method426((byte) -126);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Lii;")
    public static final class257 method348(int arg0, int arg1) {
        class257 var2 = (class257) class250.field4315.method1811((long) arg0, arg1 + 30121);
        if (arg1 != -30026) {
            return null;
        }
        field804++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class97.field1632.method1242(class11.method74(arg0, (byte) 47), class22.method137(arg0, false), arg1 + 36827);
        class257 var4 = new class257();
        var4.field4485 = arg0;
        if (var3 != null) {
            var4.method1669(new class261(var3), (byte) 48);
        }
        var4.method1658((byte) 97);
        class250.field4315.method1817((long) arg0, 16, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ltg;I)V")
    public static final void method349(class182 arg0, int arg1) {
        class245.field4226 = arg0;
        if (arg1 == 1000) {
            field821++;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public static void method350(int arg0) {
        field814 = null;
        field819 = null;
        field809 = null;
        int var1 = -28 / ((arg0 + 83) / 37);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILni;III)V")
    public static final void method351(int arg0, class153 arg1, int arg2, int arg3, int arg4) {
        field822++;
        if (arg2 != 128) {
            field819 = null;
        }
        for (class80 var5 = (class80) class93.field1568.method529(10); var5 != null; var5 = (class80) class93.field1568.method533(-127)) {
            if (var5.field1409 == arg3 && (arg4 * 128) == var5.field1424 && (arg0 * 128) == var5.field1415 && var5.field1411.field2709 == arg1.field2709) {
                if (var5.field1425 != null) {
                    class165.field2899.method1076(var5.field1425);
                    var5.field1425 = null;
                }
                if (var5.field1402 != null) {
                    class165.field2899.method1076(var5.field1402);
                    var5.field1402 = null;
                }
                var5.method828((byte) -114);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
    public final void method352(int arg0) {
        this.field818 = null;
        this.field820 = null;
        this.field810 = null;
        field831++;
        this.field828 = null;
        int var2 = 73 % ((58 - arg0) / 43);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method353(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field834++;
        class288 var10 = (class288) class254.field4397.method529(10);
        class288 var11 = null;
        while (var10 != null) {
            if (var10.field5043 == arg3 && var10.field5030 == arg4 && var10.field5040 == arg8 && var10.field5045 == arg9) {
                var11 = var10;
                break;
            }
            var10 = (class288) class254.field4397.method533(-102);
        }
        if (var11 == null) {
            var11 = new class288();
            var11.field5045 = arg9;
            var11.field5043 = arg3;
            var11.field5030 = arg4;
            var11.field5040 = arg8;
            class189.method1289(var11, 0);
            class254.field4397.method536(var11, (byte) 94);
        }
        var11.field5033 = arg1;
        var11.field5049 = arg6;
        if (arg5 != -89) {
            field819 = null;
        }
        var11.field5038 = arg2;
        var11.field5048 = arg0;
        var11.field5037 = arg7;
    }
}
