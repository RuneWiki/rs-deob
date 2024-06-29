import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class126 {

    @OriginalMember(owner = "client!q", name = "h", descriptor = "[Lei;")
    private class172[] field2215;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Z")
    public static boolean field2209 = true;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Lid;")
    public static class149 field2211 = class60.method382("Lade Texturen )2 ", (byte) 6);

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Lid;")
    public static class149 field2213 = class60.method382("<img=0>", (byte) 26);

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Lid;")
    private static class149 field2218 = class60.method382("You can(Wt add yourself to your own ignore list)3", (byte) 14);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Lid;")
    public static class149 field2208 = field2218;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lsa;")
    public static class260 field2210;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static void method879(byte arg0) {
        field2208 = null;
        field2218 = null;
        if (arg0 < 51) {
            field2218 = null;
        }
        field2213 = null;
        field2211 = null;
        field2210 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
    public static final void method880() {
        for (int var0 = 0; var0 < class277.field4951; var0++) {
            class23 var1 = class213.field3778[var0];
            class186.method1284(var1);
            class213.field3778[var0] = null;
        }
        class277.field4951 = 0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)I")
    public static final int method881(int arg0, boolean arg1) {
        if (!arg1) {
            field2209 = true;
        }
        field2216++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I[BI)I")
    public static final int method882(int arg0, byte[] arg1, int arg2) {
        if (arg0 != 0) {
            method881(85, false);
        }
        field2212++;
        return class259.method1782(0, arg1, arg2, -128);
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(I)V")
    public class126(int arg0) {
        this.field2215 = new class172[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class172 var3 = this.field2215[var2] = new class172();
            var3.field3172 = var3;
            var3.field3178 = var3;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method883(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class78.field1465 * arg0 + class257.field4493 * arg3 >> 16;
        int var6 = class78.field1465 * arg3 - class257.field4493 * arg0 >> 16;
        int var7 = class69.field1205 * arg1 + class243.field4264 * var6 >> 16;
        int var8 = class243.field4264 * arg1 - class69.field1205 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class69.field1205 * arg2 + class243.field4264 * var6 >> 16;
        int var12 = class243.field4264 * arg2 - class69.field1205 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class159.field2926 && var13 < class159.field2926) {
            return false;
        } else if (var9 > class102.field1800 && var13 > class102.field1800) {
            return false;
        } else if (var10 < class284.field5023 && var14 < class284.field5023) {
            return false;
        } else {
            return var10 <= class240.field4198 || var14 <= class240.field4198;
        }
    }
}
