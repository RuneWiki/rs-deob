import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class661 extends class184 {

    @OriginalMember(owner = "client!dv", name = "p", descriptor = "I")
    public int field9243;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    public int field9240;

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "Lpha;")
    public static class165 field9242 = new class165();

    @OriginalMember(owner = "client!dv", name = "q", descriptor = "Lmia;")
    public static class63 field9244 = new class63(22, 2);

    @OriginalMember(owner = "client!dv", name = "t", descriptor = "[B")
    public static byte[] field9247 = new byte[2048];

    @OriginalMember(owner = "client!dv", name = "r", descriptor = "I")
    public static int field9245 = 0;

    @OriginalMember(owner = "client!dv", name = "u", descriptor = "[Lph;")
    public static class646[] field9248 = new class646[6];

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public static int field9241;

    @OriginalMember(owner = "client!dv", name = "s", descriptor = "Lvd;")
    public static class39 field9246;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V", line = 3)
    public static void method3808(int arg0) {
        field9244 = null;
        field9248 = null;
        if (arg0 != 4318) {
            method3808(56);
        }
        field9242 = null;
        field9247 = null;
        field9246 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)I", line = 17)
    public static final int method3809(byte arg0) {
        field9241++;
        if (arg0 <= 119) {
            field9245 = 24;
        }
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class179.field2759.field10019 && !class179.field2759.field10022) {
            var1 = true;
            if (class259.field3702.field7533 < 512 && class259.field3702.field7533 != 0) {
                var1 = false;
            }
            if (class711.field10015.startsWith("win")) {
                var2 = true;
                var3 = true;
            } else {
                var2 = true;
            }
        }
        if (class261.field3710) {
            var2 = false;
        }
        if (class345.field4990) {
            var3 = false;
        }
        if (class243.field3558) {
            var1 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class698.method3963(true);
        }
        int var4 = -1;
        int var5 = -1;
        if (var1) {
            try {
                var4 = class59.method410(2, (byte) 113, 1000);
            } catch (Exception var15) {
            }
        }
        int var6 = -1;
        if (var3) {
            try {
                var6 = class59.method410(3, (byte) -119, 1000);
                if (class63.field916.field10200.method3848(17503) == 3) {
                    class48 var7 = class736.field10316.method432();
                    long var8 = var7.field693 & 0xFFFFFFFFFFFFL;
                    int var10 = var7.field696;
                    if (var10 == 4318) {
                        var2 &= var8 >= 64425238954L;
                    } else if (var10 == 4098) {
                        var2 &= var8 >= 60129613779L;
                    }
                }
            } catch (Exception var14) {
            }
        }
        if (var2) {
            try {
                var5 = class59.method410(1, (byte) -44, 1000);
            } catch (Exception var13) {
            }
        }
        if (var4 == -1 && var5 == -1 && var6 == -1) {
            return class698.method3963(true);
        }
        int var11 = (int) ((float) var5 * 1.1F);
        int var12 = (int) ((float) var6 * 1.1F);
        if (var4 > var12 && var11 < var4) {
            return client.method1894(26831, var4);
        } else if (var11 < var12) {
            return class734.method4128(49, 3, var12);
        } else {
            return class734.method4128(40, 1, var11);
        }
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(II)V", line = 197)
    public class661(int arg0, int arg1) {
        this.field9243 = arg0;
        this.field9240 = arg1;
    }
}
