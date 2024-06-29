import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public abstract class class233 extends class46 {

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "Lmb;")
    private static class132 field4195 = class166.method1092("FULL", 112);

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "Lmb;")
    public static class132 field4200 = class166.method1092("W-=hlen Sie eine Option", 117);

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "Lmb;")
    public static class132 field4197 = field4195;

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "[Lmb;")
    public static class132[] field4202 = new class132[100];

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "[I")
    public static int[] field4193 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "Lmb;")
    public static class132 field4201 = class166.method1092("Unerwartete Antwort vom Anmelde)2Server", 121);

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
    public static int field4208 = 2;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    public static int field4196 = 0;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
    public int field4194;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
    public int field4199;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
    public int field4204;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "I")
    public int field4205;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
    public int field4207;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    public int field4209;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "Llc;")
    public static class122 field4206;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(IIIII)V")
    public abstract void method109(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)V")
    public abstract void method106(int arg0, int arg1);

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(IIIII)V")
    public final void method1476(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4203++;
        int var6 = this.field4205 << 3;
        int var7 = (arg0 << 4) + (var6 & 0xF);
        int var8 = this.field4209 << 3;
        if (arg2 <= 51) {
            this.method107(-88, 13, 0, -122, -23, 42);
        }
        int var9 = (arg4 << 4) + (var8 & 0xF);
        this.method107(var8, var6, var9, var7, arg1, arg3);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIII)V")
    public abstract void method107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V")
    public abstract void method104(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIII)V")
    public abstract void method108(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(IIII)V")
    public abstract void method90(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(II)Lmb;")
    public static final class132 method1477(int arg0, int arg1) {
        class132 var2 = new class132();
        if (arg1 == -226189949) {
            var2.field2479 = 0;
            field4210++;
            var2.field2446 = new byte[arg0];
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
    public static void method1478(int arg0) {
        if (arg0 != 14799) {
            method1477(-79, -15);
        }
        field4206 = null;
        field4193 = null;
        field4202 = null;
        field4201 = null;
        field4195 = null;
        field4200 = null;
        field4197 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIBZILoc;)V")
    public static final void method1479(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, class155 arg6) {
        field4198++;
        long var7 = (long) ((arg0 << 16) + arg5);
        class198 var9 = (class198) class95.field1680.method806(-1, var7);
        if (var9 != null) {
            return;
        }
        class198 var10 = (class198) class152.field2771.method806(arg2, var7);
        if (var10 != null) {
            return;
        }
        class198 var11 = (class198) class25.field409.method806(-1, var7);
        if (var11 == null) {
            if (!arg4) {
                class198 var12 = (class198) class101.field1897.method806(-1, var7);
                if (var12 != null) {
                    return;
                }
            }
            class198 var13 = new class198();
            var13.field3683 = arg3;
            var13.field3680 = arg6;
            var13.field3682 = arg1;
            if (arg4) {
                class95.field1680.method810(var13, var7, -18274);
                class105.field1960++;
            } else {
                class104.field1948.method845(4521, var13);
                class25.field409.method810(var13, var7, -18274);
                class34.field558++;
            }
        } else if (arg4) {
            var11.method306((byte) -122);
            class95.field1680.method810(var11, var7, -18274);
            class34.field558--;
            class105.field1960++;
        }
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(II)V")
    public abstract void method103(int arg0, int arg1);
}
