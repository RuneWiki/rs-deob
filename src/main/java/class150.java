import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class150 {

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public int field2269;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public int field2270;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public int field2266;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public int field2275;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field2264 = 0;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field2265 = -1;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field2274 = -1;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field2268 = 0;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "F")
    public static float field2267;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "F")
    public static float field2271;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "Lna;")
    public static class26 field2272;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "[I")
    public static int[] field2276;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[Ljn;)V", line = 8)
    public static final void method1109(int arg0, class123[] arg1) {
        class212.field3364[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V", line = 19)
    public static final void method1110(byte arg0) {
        if (arg0 <= 36) {
            return;
        }
        field2277++;
        class136.field2125 &= 0x7FF;
        int var1 = class147.field2245 >> 7;
        if (class80.field1125 < 128) {
            class80.field1125 = 128;
        }
        if (class80.field1125 > 383) {
            class80.field1125 = 383;
        }
        int var2 = 0;
        int var3 = class99.field1473 >> 7;
        int var4 = class294.method2080(899, class99.field1473, class147.field2245, class50.field775);
        if (var1 > 3 && var3 > 3 && var1 < 100 && var3 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var3 - 4; var6 <= var3 + 4; var6++) {
                    int var7 = class50.field775;
                    if (var7 < 3 && (class208.field3272[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class323.field5039[var7][var5][var6] & 0xFF) * 8 + var4 - class41.field612[var7][var5][var6];
                    if (var2 < var8) {
                        var2 = var8;
                    }
                }
            }
        }
        int var9 = var2 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class260.field3859) {
            class260.field3859 += (var9 - class260.field3859) / 24;
        } else if (class260.field3859 > var9) {
            class260.field3859 += (var9 - class260.field3859) / 80;
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 107)
    public class150() {
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lok;)V", line = 112)
    public class150(class150 arg0) {
        this.field2269 = arg0.field2269;
        this.field2270 = arg0.field2270;
        this.field2266 = arg0.field2266;
        this.field2275 = arg0.field2275;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V", line = 124)
    public static void method1111(boolean arg0) {
        if (arg0) {
            field2272 = null;
            field2276 = null;
        }
    }
}
