import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class156 extends class92 {

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "[J")
    public static long[] field3050 = new long[32];

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "Leh;")
    public static class47 field3052 = class195.method1282((byte) -4, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "Leh;")
    public static class47 field3047 = class195.method1282((byte) -4, "::fpsoff");

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
    public static int field3054 = 0;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    public static int field3049 = 0;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
    public int field3051;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
    public int field3057;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3048;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)Ld;")
    public final class30 method708(int arg0) {
        field3055++;
        if (arg0 != 21831) {
            method1078(8, 64);
        }
        return class87.method713(arg0 - 21715, this.field3057).method634(2801, null, 0, this.field3051);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I")
    public static final int method1078(int arg0, int arg1) {
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        field3056++;
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg1 == -1484158736) {
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        } else {
            return 56;
        }
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
    public static void method1079(int arg0) {
        field3050 = null;
        field3052 = null;
        if (arg0 != -1465171728) {
            method1080(74, null, 99);
        }
        field3047 = null;
        field3048 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[Lgf;I)V")
    public static final void method1080(int arg0, class61[] arg1, int arg2) {
        if (arg2 != 14118) {
            method1080(50, null, 19);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class61 var4 = arg1[var3];
            if (var4 != null && var4.field1245 == arg0 && (!var4.field1313 || !class72.method632(var4, -63))) {
                if (var4.field1311 == 0) {
                    if (!var4.field1313 && class72.method632(var4, -14) && class67.field1431 != var4) {
                        continue;
                    }
                    method1080(var4.field1211, arg1, arg2);
                    if (var4.field1227 != null) {
                        method1080(var4.field1211, var4.field1227, 14118);
                    }
                    class63 var5 = (class63) class138.field2710.method1342((long) var4.field1211, (byte) -20);
                    if (var5 != null) {
                        class108.method871(var5.field1349, (byte) -109);
                    }
                }
                if (var4.field1311 == 6) {
                    if (var4.field1314 != -1 || var4.field1262 != -1) {
                        boolean var6 = class131.method967((byte) 28, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field1262;
                        } else {
                            var7 = var4.field1314;
                        }
                        if (var7 != -1) {
                            class22 var8 = class25.method236(false, var7);
                            var4.field1238 += class190.field3677;
                            while (var4.field1238 > var8.field419[var4.field1201]) {
                                var4.field1238 -= var8.field419[var4.field1201];
                                var4.field1201++;
                                if (var8.field430.length <= var4.field1201) {
                                    var4.field1201 -= var8.field416;
                                    if (var4.field1201 < 0 || var4.field1201 >= var8.field430.length) {
                                        var4.field1201 = 0;
                                    }
                                }
                                class20.method204(var4, (byte) -5);
                            }
                        }
                    }
                    if (var4.field1204 != 0 && !var4.field1313) {
                        int var9 = var4.field1204 >> 16;
                        int var10 = var4.field1204 << 16 >> 16;
                        int var11 = class190.field3677 * var9;
                        var4.field1220 = var4.field1220 + var11 & 0x7FF;
                        int var12 = class190.field3677 * var10;
                        var4.field1283 = var4.field1283 + var12 & 0x7FF;
                        class20.method204(var4, (byte) -5);
                    }
                }
            }
        }
        field3053++;
    }
}
