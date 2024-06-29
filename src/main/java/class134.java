import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class134 {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "Lmi;")
    public static class408 field1785 = new class408();

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "Lsf;")
    public static class143 field1786 = new class143(512);

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1790 = "Loaded client variable data";

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "J")
    public static long field1791 = 0L;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public static final void method903(int arg0) {
        if (class155.field2027 < 1024.0F) {
            class155.field2027 = 1024.0F;
        }
        field1788++;
        if (class155.field2027 > 3072.0F) {
            class155.field2027 = 3072.0F;
        }
        while (class170.field2244 >= 16384.0F) {
            class170.field2244 -= 16384.0F;
        }
        while (class170.field2244 < 0.0F) {
            class170.field2244 += 16384.0F;
        }
        int var1 = class64.field902 >> 7;
        if (arg0 != -4) {
            field1789 = -33;
        }
        int var2 = class370.field5511 >> 7;
        int var3 = class139.method935(class370.field5511, -72, class64.field902, class193.field2688);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class193.field2688;
                    if (var7 < 3 && class161.method1010(var6, (byte) 72, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class193.field2750 != null && class193.field2750[var7] != null) {
                        var8 = (class193.field2750[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 + var3 - class88.field1226[var7].method781(var5, var6);
                    if (var4 < var9) {
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
        if (var10 > class38.field613) {
            class38.field613 += (var10 - class38.field613) / 24;
        } else if (class38.field613 > var10) {
            class38.field613 += (var10 - class38.field613) / 80;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIZZ)Lqj;")
    public static final class238 method904(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field1787++;
        if (arg0 >= -74) {
            method904(1, -70, -95, false, true);
        }
        class425 var5 = null;
        if (class108.field1487 != null) {
            var5 = new class425(arg1, class108.field1487, class371.field5513[arg1], 1000000);
        }
        class417.field6209[arg1] = class82.field1150.method1487((byte) 85, arg1, class226.field3183, var5);
        if (arg3) {
            class417.field6209[arg1].method2451((byte) 123);
        }
        return new class238(class417.field6209[arg1], arg4, arg2);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
    public static void method905(byte arg0) {
        field1785 = null;
        field1790 = null;
        if (arg0 <= 6) {
            field1786 = null;
        }
        field1786 = null;
    }
}
