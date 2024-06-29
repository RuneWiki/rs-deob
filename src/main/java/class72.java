import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class72 {

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public int field1155 = -1;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "[I")
    public static int[] field1147 = new int[25];

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field1154 = 0;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field1150 = 0;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Lad;")
    public static class275 field1156 = new class275(5);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lec;")
    public class25 field1153;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "[I")
    public int[] field1148;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field1145;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static final void method500(int arg0) {
        int var1 = class128.field2059;
        field1146++;
        int var2 = class159.field2596;
        int var3 = class229.field3597;
        int var4 = class120.field1904;
        int var5 = 6116423;
        if (arg0 <= 113) {
            method502(40, (String) null);
        }
        class94.method660(var1, var3, var2, var4, var5);
        class94.method660(var1 + 1, var3 - -1, var2 - 2, 16, 0);
        class94.method670(var1 + 1, var3 + 18, var2 - 2, var4 + -19, 0);
        class170.field2792.method505(class123.field1958, var1 + 3, var3 + 14, var5, -1);
        int var6 = class55.field797;
        int var7 = class287.field4640;
        for (int var8 = 0; var8 < class291.field4776; var8++) {
            int var9 = var3 + ((class291.field4776 - var8 - 1) * 15) + 31;
            int var10 = 16777215;
            if (var7 > var1 && (var1 + var2) > var7 && (var9 - 13) < var6 && var9 + 3 > var6) {
                var10 = 16776960;
            }
            class170.field2792.method505(class292.method2016(var8, 41), var1 + 3, var9, var10, 0);
        }
        class304.method2071(class120.field1904, class128.field2059, class159.field2596, 0, class229.field3597);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static void method501(byte arg0) {
        if (arg0 < -3) {
            field1147 = null;
            field1156 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method502(int arg0, String arg1) {
        field1152++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = ((var3 << 5) + class9.method83((byte) -18, arg1.charAt(var4))) - var3;
        }
        int var5 = -15 / ((-arg0 - 58) / 47);
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
    public static final void method503(byte arg0) {
        field1149++;
        if (arg0 != 5 || class247.field3884) {
            return;
        }
        if (class184.field3053) {
            class226.field3554 = (float) ((int) class226.field3554 + 47 & 0xFFFFFFF0);
        } else {
            class266.field4323 += (12.0F - class266.field4323) / 2.0F;
        }
        class247.field3884 = true;
        class8.field181 = true;
    }
}
