import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class399 extends class109 {

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "[[I")
    public static int[][] field5612 = new int[128][128];

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "Z")
    public static boolean field5615 = true;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "C")
    public char field5614;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public int field5606;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public int field5608;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "J")
    public long field5603;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Ltj;")
    public static class108 field5607;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lua;")
    public class399 field5605;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Z")
    public boolean field5610;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "[I")
    public static int[] field5602;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public static final void method2500(byte arg0) {
        field5598++;
        if (class219.field3143.toLowerCase().indexOf("microsoft") == -1) {
            class182.field2582[92] = 74;
            class182.field2582[47] = 73;
            class182.field2582[59] = 57;
            class182.field2582[44] = 71;
            if (class219.field3156 == null) {
                class182.field2582[192] = 58;
                class182.field2582[222] = 59;
            } else {
                class182.field2582[192] = 28;
                class182.field2582[222] = 58;
                class182.field2582[520] = 59;
            }
            class182.field2582[61] = 27;
            class182.field2582[93] = 43;
            class182.field2582[45] = 26;
            class182.field2582[46] = 72;
            class182.field2582[91] = 42;
        } else {
            class182.field2582[188] = 71;
            class182.field2582[187] = 27;
            class182.field2582[219] = 42;
            class182.field2582[190] = 72;
            class182.field2582[221] = 43;
            class182.field2582[222] = 59;
            class182.field2582[191] = 73;
            class182.field2582[223] = 28;
            class182.field2582[192] = 58;
            class182.field2582[186] = 57;
            class182.field2582[189] = 26;
            class182.field2582[220] = 74;
        }
        int var1 = -57 / ((arg0 - 71) / 44);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static void method2501(boolean arg0) {
        field5612 = null;
        field5607 = null;
        if (arg0) {
            method2500((byte) 107);
        }
        field5602 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIBLhl;II)V")
    public static final void method2502(int arg0, int arg1, int arg2, byte arg3, class311 arg4, int arg5, int arg6) {
        int var7 = -30 / ((arg3 + 30) / 35);
        field5611++;
        class356.method2328(arg4.field4466, arg2, arg4.field4463, arg0, arg1, 0, -127, arg5, arg6);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)I")
    public final int method664(int arg0) {
        if (arg0 != 15996) {
            this.field5606 = -113;
        }
        field5599++;
        return this.field5608;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)J")
    public final long method666(byte arg0) {
        field5616++;
        if (arg0 > -111) {
            method2504(88, (class108) null);
        }
        return this.field5603;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5604++;
        class102 var10 = null;
        for (class102 var11 = (class102) class128.field1810.method2752(-96); var11 != null; var11 = (class102) class128.field1810.method2754(-1)) {
            if (var11.field1284 == arg9 && var11.field1289 == arg3 && var11.field1285 == arg7 && var11.field1287 == arg1) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class102();
            var10.field1284 = arg9;
            var10.field1289 = arg3;
            var10.field1287 = arg1;
            var10.field1285 = arg7;
            class32.method176(var10, (byte) 110);
            class128.field1810.method2756(114, var10);
        }
        var10.field1296 = arg4;
        var10.field1292 = arg2;
        var10.field1293 = arg0;
        var10.field1286 = arg6;
        int var12 = 89 / ((arg8 + 53) / 53);
        var10.field1291 = arg5;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)I")
    public final int method668(int arg0) {
        field5597++;
        if (arg0 != 3) {
            this.method666((byte) -3);
        }
        return this.field5606;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILtj;)V")
    public static final void method2504(int arg0, class108 arg1) {
        field5601++;
        class269.field3934 = arg1;
        class198.field2837 = class269.field3934.method651(0, 15);
        int var2 = -82 % ((arg0 - 57) / 59);
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)Z")
    public final boolean method667(int arg0) {
        if (arg0 != 0) {
            method2500((byte) 82);
        }
        field5613++;
        return this.field5610;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)C")
    public final char method665(int arg0) {
        if (arg0 != 100) {
            this.field5610 = false;
        }
        field5609++;
        return this.field5614;
    }
}
