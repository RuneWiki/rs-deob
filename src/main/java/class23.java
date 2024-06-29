import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public abstract class class23 {

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field314 = 1401;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "[I")
    public static int[] field318 = new int[13];

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field320 = 0;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "Lhi;")
    public static class45 field317 = new class45(77, 8);

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "Lat;")
    public static class444 field321;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lsv;I)V")
    public static final void method141(class319 arg0, int arg1) {
        field315++;
        if (arg1 != -65536) {
            method141(null, -62);
        }
        for (int var2 = 0; var2 < class355.field5130; var2++) {
            int var3 = arg0.method1877(-27);
            int var4 = arg0.method1844(-104);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class336.field4900[var3] != null) {
                class336.field4900[var3].field2691 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
    public static void method142(int arg0) {
        field317 = null;
        int var1 = -72 / ((11 - arg0) / 57);
        field321 = null;
        field318 = null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IBI[B)[B")
    public static final byte[] method143(int arg0, byte arg1, int arg2, byte[] arg3) {
        field316++;
        byte[] var4 = new byte[arg2];
        class57.method372(arg3, arg0, var4, 0, arg2);
        if (arg1 != -99) {
            field321 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZIIII)V")
    public static final void method144(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field319++;
        if (class195.field2849 == 0) {
            class235.method1432((byte) 123, false);
        } else {
            class426.field6200 = class195.field2849;
            class54.method349(-95, 0);
        }
        class346.field4984 = arg2;
        class124.field1915 = arg1;
        class502.field7347 = arg0;
        class472.method2757(arg4);
        if (arg3 != 23065) {
            field321 = null;
        }
    }
}
