import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class43 {

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "Lpf;")
    public static class425 field538 = new class425(68, 3);

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "[Lol;")
    public static class174[] field542 = new class174[128];

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "[I")
    public static int[] field544 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "Lpf;")
    public static class425 field545;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "Liq;")
    public static class134 field543;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
    public static final void method250(int arg0) {
        if (class188.field2811 < 1024.0F) {
            class188.field2811 = 1024.0F;
        }
        field537++;
        if (arg0 >= -75) {
            method252(-59, (int[]) null, true, (int[]) null, -120);
        }
        if (class188.field2811 > 3072.0F) {
            class188.field2811 = 3072.0F;
        }
        while (class462.field6810 >= 16384.0F) {
            class462.field6810 -= 16384.0F;
        }
        while (class462.field6810 < 0.0F) {
            class462.field6810 += 16384.0F;
        }
        int var1 = class136.field1804 >> 7;
        int var2 = class103.field1401 >> 7;
        int var3 = class437.method2686(class143.field1911, 0, class103.field1401, class136.field1804);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class143.field1911;
                    if (var7 < 3 && class430.method2646(27156, var5, var6)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class210.field3161 != null && class210.field3161[var7] != null) {
                        var8 = (class210.field3161[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 + var8 - class307.field4638[var7].method92(var5, var6);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (class198.field3007 < var10) {
            class198.field3007 += (var10 - class198.field3007) / 24;
        } else if (var10 < class198.field3007) {
            class198.field3007 += (var10 - class198.field3007) / 80;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLjava/awt/Canvas;)Lqc;")
    public static final class230 method251(byte arg0, Canvas arg1) {
        field536++;
        try {
            Class var2 = Class.forName("pk");
            if (arg0 == 102) {
                class230 var3 = (class230) var2.getDeclaredConstructor().newInstance();
                var3.method470(arg1, -118);
                return var3;
            } else {
                return null;
            }
        } catch (Throwable var5) {
            class81 var4 = new class81();
            var4.method470(arg1, -98);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I[IZ[II)V")
    public static final void method252(int arg0, int[] arg1, boolean arg2, int[] arg3, int arg4) {
        if (arg0 > arg4) {
            int var5 = (arg4 + arg0) / 2;
            int var6 = arg4;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            for (int var9 = arg4; var9 < arg0; var9++) {
                if ((var9 & 0x1) + var7 > arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    int var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var8;
            method252(var6 - 1, arg1, true, arg3, arg4);
            method252(arg0, arg1, true, arg3, var6 + 1);
        }
        if (arg2) {
            field540++;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
    public static void method253(byte arg0) {
        int var1 = -107 / ((arg0 + 87) / 37);
        field542 = null;
        field543 = null;
        field544 = null;
        field538 = null;
        field545 = null;
    }

    static {
        new class151((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
        field545 = new class425(21, -1);
    }
}
