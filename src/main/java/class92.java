import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class92 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field1225 = 0;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field1226 = 0;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1231 = -1;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "F")
    public static float field1232;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lll;")
    public static class159 field1228;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Lug;")
    public static class253 field1227;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIILgh;JLgh;Lgh;)V", line = 14)
    public static final void method667(int arg0, int arg1, int arg2, int arg3, class248 arg4, long arg5, class248 arg6, class248 arg7) {
        class154 var9 = new class154();
        var9.field2386 = arg4;
        var9.field2383 = arg1 * 128 + 64;
        var9.field2393 = arg2 * 128 + 64;
        var9.field2391 = arg3;
        var9.field2381 = arg5;
        var9.field2385 = arg6;
        var9.field2389 = arg7;
        int var10 = 0;
        class124 var11 = class83.field1138[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1798; var12++) {
                class263 var13 = var11.field1783[var12];
                if ((var13.field4122 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4118.method397();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2379 = -var10;
        if (class83.field1138[arg0][arg1][arg2] == null) {
            class83.field1138[arg0][arg1][arg2] = new class124(arg0, arg1, arg2);
        }
        class83.field1138[arg0][arg1][arg2].field1789 = var9;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZD)V", line = 65)
    public static final void method668(boolean arg0, double arg1) {
        field1229++;
        if (class199.field3178 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class308.field4796[var3] = var4 > 255 ? 255 : var4;
            }
            class199.field3178 = arg1;
        }
        if (!arg0) {
            method667(-23, -96, -47, -106, (class248) null, 82L, (class248) null, (class248) null);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 97)
    public static void method669(int arg0) {
        field1228 = null;
        if (arg0 != 26980) {
            method668(true, 0.5315263799296372D);
        }
        field1227 = null;
    }
}
