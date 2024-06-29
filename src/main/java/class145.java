import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class145 {

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static volatile int field2150 = -1;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Lkm;")
    public static class297 field2147;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lha;I)V")
    public static final void method1048(class31 arg0, int arg1) {
        int var2 = -71 / ((arg1 + 6) / 58);
        field2146++;
        while (true) {
            while (arg0.field560.length > arg0.field541) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg0.method265(-88) == 1) {
                    var3 = true;
                    var4 = arg0.method265(-110);
                    var5 = arg0.method265(-103);
                }
                int var6 = arg0.method265(-111);
                int var7 = arg0.method265(-95);
                int var8 = class141.field2107 - (var7 * 64 - class92.field1475) - 1;
                int var9 = var6 * 64 - class147.field2165;
                if (var9 >= 0 && (var8 - 63) >= 0 && (var9 + 63) < class152.field2247 && var8 < class92.field1475) {
                    int var10 = var8 >> 6;
                    int var11 = var9 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || (var4 * 8) <= var12 && var12 < var4 * 8 + 8 && var5 * 8 <= var13 && var5 * 8 + 8 > var13) {
                                byte var14 = arg0.method266(-129);
                                if (var14 != 0) {
                                    if (class197.field3076[var11][var10] == null) {
                                        class197.field3076[var11][var10] = new byte[4096];
                                    }
                                    class197.field3076[var11][var10][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg0.method266(-129);
                                    if (class300.field4820[var11][var10] == null) {
                                        class300.field4820[var11][var10] = new byte[4096];
                                    }
                                    class300.field4820[var11][var10][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var3 ? 64 : 4096); var16++) {
                        byte var17 = arg0.method266(-129);
                        if (var17 != 0) {
                            arg0.field541++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Lbd;")
    public static final class194 method1049(int arg0, int arg1) {
        class194 var2 = (class194) class229.field3640.method1173((long) arg0, true);
        field2148++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class63.field998.method721((byte) -117, arg1, arg0);
        class194 var4 = new class194();
        if (var3 != null) {
            var4.method1378(arg0, (byte) 40, new class31(var3));
        }
        class229.field3640.method1167((byte) 121, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZI)I")
    public static final int method1050(int arg0, int arg1, boolean arg2, int arg3) {
        field2151++;
        if ((client.field2390[arg0][arg3][arg1] & 0x8) == 0) {
            if (!arg2) {
                field2150 = 13;
            }
            return arg0 <= 0 || (client.field2390[1][arg3][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Llb;Llb;B)V")
    public static final void method1051(class134 arg0, class134 arg1, byte arg2) {
        if (arg2 != 106) {
            return;
        }
        if (arg0.field2007 != null) {
            arg0.method995((byte) -124);
        }
        arg0.field2006 = arg1;
        field2149++;
        arg0.field2007 = arg1.field2007;
        arg0.field2007.field2006 = arg0;
        arg0.field2006.field2007 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method1052(byte arg0) {
        field2147 = null;
        if (arg0 != -24) {
            field2147 = null;
        }
    }
}
