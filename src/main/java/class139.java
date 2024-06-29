import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class139 {

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lsh;")
    private class246 field2606;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Lgj;")
    private class196 field2605;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lvg;")
    private class223 field2604;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "[I")
    public static int[] field2610 = new int[256];

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "S")
    public static short field2607 = 205;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "[Z")
    public static boolean[] field2615 = new boolean[112];

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Ljd;")
    private class118 field2609;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "[Ldk;")
    private class178[] field2614;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method996(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2603++;
        class79 var10 = null;
        for (class79 var11 = (class79) class246.field4383.method1375(16259); var11 != null; var11 = (class79) class246.field4383.method1377(-19546)) {
            if (var11.field1375 == arg1 && var11.field1368 == arg3 && var11.field1369 == arg2 && var11.field1386 == arg5) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class79();
            var10.field1368 = arg3;
            var10.field1375 = arg1;
            var10.field1386 = arg5;
            var10.field1369 = arg2;
            class198.method1423(var10, (byte) -105);
            class246.field4383.method1382(var10, (byte) -81);
        }
        int var12 = -72 / ((-arg6 - 51) / 58);
        var10.field1372 = arg9;
        var10.field1383 = arg0;
        var10.field1385 = arg7;
        var10.field1387 = arg4;
        var10.field1367 = arg8;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ln;BILn;)Ldk;")
    public final class178 method997(class242 arg0, byte arg1, int arg2, class242 arg3) {
        field2612++;
        return arg1 > -30 ? null : this.method999(arg3, arg0, arg2, true, 255);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method998(int arg0) {
        if (arg0 >= 15) {
            field2615 = null;
            field2610 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ln;Ln;IZI)Ldk;")
    private final class178 method999(class242 arg0, class242 arg1, int arg2, boolean arg3, int arg4) {
        if (arg4 != 255) {
            this.method997((class242) null, (byte) -11, 73, (class242) null);
        }
        field2613++;
        if (this.field2609 == null) {
            throw new RuntimeException();
        }
        this.field2609.field2155 = arg2 * 8 + 5;
        if (this.field2609.field2115.length <= this.field2609.field2155) {
            throw new RuntimeException();
        } else if (this.field2614[arg2] == null) {
            int var6 = this.field2609.method875((byte) 22);
            int var7 = this.field2609.method875((byte) 95);
            class178 var8 = new class178(arg2, arg0, arg1, this.field2606, this.field2605, var6, var7, arg3);
            this.field2614[arg2] = var8;
            return var8;
        } else {
            return this.field2614[arg2];
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lsh;Lgj;)V")
    public class139(class246 arg0, class196 arg1) {
        this.field2606 = arg0;
        this.field2605 = arg1;
        if (!this.field2606.method1650((byte) -9)) {
            this.field2604 = this.field2606.method1662(-27446, true, (byte) 0, 255, 255);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public final void method1000(int arg0) {
        field2608++;
        if (this.field2614 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2614.length; var2++) {
            if (this.field2614[var2] != null) {
                this.field2614[var2].method1256(16601);
            }
        }
        if (arg0 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < this.field2614.length; var3++) {
            if (this.field2614[var3] != null) {
                this.field2614[var3].method1263(118);
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)Z")
    public final boolean method1001(int arg0) {
        field2611++;
        if (arg0 != 8) {
            return true;
        } else if (this.field2609 == null) {
            if (this.field2604 == null) {
                if (this.field2606.method1650((byte) -9)) {
                    return false;
                }
                this.field2604 = this.field2606.method1662(-27446, true, (byte) 0, 255, 255);
            }
            if (this.field2604.field4709) {
                return false;
            } else {
                this.field2609 = new class118(this.field2604.method1059(127));
                this.field2614 = new class178[(this.field2609.field2115.length - 5) / 8];
                return true;
            }
        } else {
            return true;
        }
    }
}
