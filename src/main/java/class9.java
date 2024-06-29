import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class9 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Llm;")
    public static class150 field101 = new class150(5);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method49(byte arg0) {
        if (arg0 > 104) {
            field101 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public static final void method50(byte arg0) {
        field103++;
        int var1 = class240.field3705.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class240.field3705[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class11.field184; var4++) {
                    if (class213.field3218[var2] == class136.field1865[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                int var5 = 0;
                if (var3 == -1) {
                    class136.field1865[class11.field184] = class213.field3218[var2];
                    var3 = class11.field184++;
                }
                class215 var6 = new class215(class240.field3705[var2]);
                while (class240.field3705[var2].length > var6.field3280 && var5 < 511 && class306.field4921 < 1023) {
                    int var7 = var6.method1379(arg0 ^ 0x38);
                    int var8 = var3 | var5++ << 6;
                    int var9 = (var7 & 0x1FF9) >> 7;
                    int var10 = (class213.field3218[var2] >> 8) * 64 + var9 - class228.field3570;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 14;
                    int var13 = (class213.field3218[var2] & 0xFF) * 64 + var11 - class170.field2421;
                    class211 var14 = class76.method499((byte) 69, var6.method1379(-105));
                    if (class88.field1274[var8] == null && (var14.field3143 & 0x1) > 0 && class249.field3890 == var12 && var10 >= 0 && (var14.field3122 + var10) < 104 && var13 >= 0 && var13 + var14.field3122 < 104) {
                        class88.field1274[var8] = new class310();
                        class310 var15 = class88.field1274[var8];
                        class131.field1834[class306.field4921++] = var8;
                        var15.field4119 = class35.field533;
                        var15.method2103(var14, (byte) -120);
                        var15.method1669(false, var15.field4993.field3122);
                        var15.field4142 = var15.field4093 = class153.field2131[var15.field4993.field3138];
                        var15.field4045 = var15.field4993.field3154;
                        if (var15.field4045 == 0) {
                            var15.field4093 = 0;
                        }
                        var15.field4062 = var15.field4993.field3137;
                        var15.method1681(var15.method1683(-108), var13, true, var10, (byte) -24);
                    }
                }
            }
        }
        if (arg0 != -98) {
            method50((byte) 41);
        }
    }
}
