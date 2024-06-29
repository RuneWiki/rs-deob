import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class143 extends class184 {

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    private int field2457 = -32768;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "Li;")
    public static class112 field2456 = new class112(16);

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "[Z")
    public static boolean[] field2459 = new boolean[200];

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    public int field2460;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLjava/lang/String;C)I")
    public static final int method996(byte arg0, String arg1, char arg2) {
        int var3 = arg1.length();
        field2453++;
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            if (arg2 == arg1.charAt(var5)) {
                var4++;
            }
        }
        int var6 = -92 / ((62 - arg0) / 33);
        return var4;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)V")
    public final void method226(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2454++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method997(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field2451++;
        int var7 = class160.method1090(arg6, (byte) 16, class89.field1582, class118.field2094);
        int var8 = class160.method1090(arg3, (byte) 16, class89.field1582, class118.field2094);
        int var9 = class160.method1090(arg0, (byte) 16, class118.field2098, class126.field2222);
        int var10 = class160.method1090(arg4, (byte) 16, class118.field2098, class126.field2222);
        int var11 = class160.method1090(arg1 + arg6, (byte) 16, class89.field1582, class118.field2094);
        int var12 = class160.method1090(arg3 - arg1, (byte) 16, class89.field1582, class118.field2094);
        for (int var13 = var7; var13 < var11; var13++) {
            class93.method598(-7, var10, var9, class167.field2735[var13], arg2);
        }
        if (arg5 > -57) {
            field2459 = null;
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class93.method598(-7, var10, var9, class167.field2735[var14], arg2);
        }
        int var15 = class160.method1090(arg0 + arg1, (byte) 16, class118.field2098, class126.field2222);
        int var16 = class160.method1090(arg4 - arg1, (byte) 16, class118.field2098, class126.field2222);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class167.field2735[var17];
            class93.method598(-7, var15, var9, var18, arg2);
            class93.method598(-7, var10, var16, var18, arg2);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIIIJILgh;)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class32 arg10) {
        class279 var13 = class203.method1346(-1, this.field2460).method1329((class167) null, -1, 0, 255, (class23) null, this.field2455, 0);
        field2452++;
        if (var13 != null) {
            var13.method120(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field2457 = var13.method110();
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public static void method998(int arg0) {
        field2456 = null;
        field2459 = null;
        int var1 = 122 % ((arg0 - 80) / 43);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()I")
    public final int method110() {
        field2458++;
        return this.field2457;
    }
}
