import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class311 {

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public int field4252 = 2048;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public int field4253 = 2048;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public int field4255 = 0;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public int field4257 = 0;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Lmq;")
    public static class295 field4250;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BIILeb;)V")
    private final void method1966(byte arg0, int arg1, int arg2, class371 arg3) {
        if (arg2 == 1) {
            this.field4255 = arg3.method2429(0);
        } else if (arg2 == 2) {
            this.field4252 = arg3.method2403((byte) 110);
        } else if (arg2 == 3) {
            this.field4253 = arg3.method2403((byte) 63);
        } else if (arg2 == 4) {
            this.field4257 = arg3.method2378(-1);
        }
        if (arg0 == 55) {
            field4256++;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method1967(byte arg0) {
        field4250 = null;
        if (arg0 >= -52) {
            method1967((byte) 114);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
    public static final void method1968(byte arg0) {
        field4251++;
        if (class140.field2007 < 1024.0F) {
            class140.field2007 = 1024.0F;
        }
        while (class6.field98 >= 16384.0F) {
            class6.field98 -= 16384.0F;
        }
        if (class140.field2007 > 3072.0F) {
            class140.field2007 = 3072.0F;
        }
        while (class6.field98 < 0.0F) {
            class6.field98 += 16384.0F;
        }
        if (arg0 != 30) {
            return;
        }
        int var1 = class290.field4007 >> 7;
        int var2 = class123.field1729 >> 7;
        int var3 = class279.method1698(class290.field4007, class123.field1729, class265.field3617, (byte) 3);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class265.field3617;
                    if (var7 < 3 && class199.method1326(var6, var5, (byte) 74)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class446.field6435 != null && class446.field6435[var7] != null) {
                        var8 = (class446.field6435[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 - (class249.field3456[var7].method275(var5, var6) - var8);
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
        if (class279.field3827 < var10) {
            class279.field3827 += (var10 - class279.field3827) / 24;
        } else if (class279.field3827 > var10) {
            class279.field3827 += (var10 - class279.field3827) / 80;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Leb;II)V")
    public final void method1969(class371 arg0, int arg1, int arg2) {
        if (arg2 < 104) {
            this.field4257 = -48;
        }
        field4254++;
        while (true) {
            int var4 = arg0.method2429(0);
            if (var4 == 0) {
                return;
            }
            this.method1966((byte) 55, arg1, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)I")
    public static int method1970(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
