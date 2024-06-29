import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class94 {

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1537 = new String[200];

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "[I")
    public static int[] field1539 = new int[128];

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "[I")
    public static int[] field1536 = new int[2];

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method671(byte arg0) {
        field1537 = null;
        field1539 = null;
        if (arg0 != -101) {
            field1537 = null;
        }
        field1536 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static final void method672(int arg0) {
        field1535++;
        if (arg0 != 15413) {
            field1536 = null;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class287.field4747 - 1; var2++) {
                if (class195.field3154[var2] < 1000 && class195.field3154[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class184.field2932[var2];
                    class184.field2932[var2] = class184.field2932[var2 + 1];
                    class184.field2932[var2 + 1] = var3;
                    String var4 = class63.field1065[var2];
                    class63.field1065[var2] = class63.field1065[var2 + 1];
                    class63.field1065[var2 + 1] = var4;
                    int var5 = class197.field3204[var2];
                    class197.field3204[var2] = class197.field3204[var2 + 1];
                    class197.field3204[var2 + 1] = var5;
                    int var6 = class67.field1125[var2];
                    class67.field1125[var2] = class67.field1125[var2 + 1];
                    class67.field1125[var2 + 1] = var6;
                    int var7 = class100.field1588[var2];
                    class100.field1588[var2] = class100.field1588[var2 + 1];
                    class100.field1588[var2 + 1] = var7;
                    short var8 = class195.field3154[var2];
                    class195.field3154[var2] = class195.field3154[var2 + 1];
                    class195.field3154[var2 + 1] = var8;
                    long var9 = class68.field1149[var2];
                    class68.field1149[var2] = class68.field1149[var2 + 1];
                    class68.field1149[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static final void method673(int arg0) {
        field1538++;
        if (arg0 != 104) {
            method674((byte) -106);
        }
        int var1 = class136.field2244.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class136.field2244[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class224.field3778; var4++) {
                    if (class7.field144[var4] == class184.field2947[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class7.field144[class224.field3778] = class184.field2947[var2];
                    var3 = class224.field3778++;
                }
                class249 var5 = new class249(class136.field2244[var2]);
                int var6 = 0;
                while (var5.field4160 < class136.field2244[var2].length && var6 < 511 && class303.field4932 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1821((byte) 51);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FA6) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class184.field2947[var2] >> 8) * 64 + var10 - class26.field462;
                    int var13 = (class184.field2947[var2] & 0xFF) * 64 + (var11 - class78.field1313);
                    class54 var14 = class217.method1551(7, var5.method1821((byte) 51));
                    if (class57.field1002[var7] == null && (var14.field930 & 0x1) > 0 && class73.field1286 == var9 && var12 >= 0 && var14.field915 + var12 < 104 && var13 >= 0 && var14.field915 + var13 < 104) {
                        class57.field1002[var7] = new class307();
                        class307 var15 = class57.field1002[var7];
                        class186.field2972[class303.field4932++] = var7;
                        var15.field749 = class275.field4598;
                        var15.method2078(arg0 ^ 0x33, var14);
                        var15.method289((byte) -105, var15.field4960.field915);
                        var15.field776 = var15.field753 = class275.field4595[var15.field4960.field964];
                        var15.field785 = var15.field4960.field959;
                        var15.field792 = var15.field4960.field955;
                        if (var15.field792 == 0) {
                            var15.field753 = 0;
                        }
                        var15.method293(var12, var15.method294((byte) -127), true, false, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
    public static final void method674(byte arg0) {
        class185.field2958.method97(118);
        field1540++;
        class90.field1486.method97(101);
        class260.field4373.method97(77);
        if (arg0 > -78) {
            field1536 = null;
        }
        class97.field1574.method97(125);
    }
}
