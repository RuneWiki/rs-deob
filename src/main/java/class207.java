import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class207 extends class320 {

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "Liv;")
    public static class64 field2992 = new class64(10, -1);

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public int field2988;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public int field2989;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public int field2990;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public int field2993;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public int field2994;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public int field2997;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "Lmq;")
    public class350 field2995;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "Lmq;")
    public class350 field2998;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Ljava/lang/String;")
    public String field2991;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Z")
    public boolean field2987;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "[Ljava/lang/Object;")
    public Object[] field2996;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
    public static final void method1403(int arg0) {
        field2999++;
        if (class455.field6790 < 1024.0F) {
            class455.field6790 = 1024.0F;
        }
        while (class526.field7779 >= 16384.0F) {
            class526.field7779 -= 16384.0F;
        }
        if (class455.field6790 > 3072.0F) {
            class455.field6790 = 3072.0F;
        }
        while (class526.field7779 < 0.0F) {
            class526.field7779 += 16384.0F;
        }
        int var1 = class305.field4654 >> 7;
        int var2 = class524.field7771 >> 7;
        int var3 = class343.method2188(class163.field2525, class305.field4654, (byte) -102, class524.field7771);
        if (arg0 != -19057) {
            field2992 = null;
        }
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < (class33.field662 - 4) && var2 < (class121.field1966 - 4)) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class163.field2525;
                    if (var7 < 3 && class389.method2400(var5, var6, 2)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class471.field7072.field180 != null && class471.field7072.field180[var7] != null) {
                        var8 = (class471.field7072.field180[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 + var8 - class88.field1546[var7].method376(var5, var6);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (class42.field771 < var10) {
            class42.field771 += (var10 - class42.field771) / 24;
        } else if (var10 < class42.field771) {
            class42.field771 += (var10 - class42.field771) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)I")
    public static final int method1404(byte arg0, int arg1) {
        if (arg0 < 41) {
            return 3;
        }
        int var2 = (arg1 & 0x55555555) + (arg1 >>> 1 & 0xD5555555);
        field3000++;
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I")
    public static int method1405(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
    public static void method1406(int arg0) {
        if (arg0 != 262144) {
            field2992 = null;
        }
        field2992 = null;
    }
}
