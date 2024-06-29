import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class56 extends class221 {

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field782 = 2;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field781 = 0;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "[Lbf;")
    public static class108[] field783;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
    public static final void method351(byte arg0) {
        field785++;
        if (arg0 != 123) {
            field781 = -39;
        }
        int var1 = class131.field1830.method805(8, (byte) -102);
        if (class171.field2437 > var1) {
            for (int var2 = var1; var2 < class171.field2437; var2++) {
                class194.field2959[class19.field322++] = class160.field2235[var2];
            }
        }
        if (var1 > class171.field2437) {
            throw new RuntimeException("gppov1");
        }
        class171.field2437 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class160.field2235[var3];
            class314 var5 = class48.field689[var4];
            int var6 = class131.field1830.method805(1, (byte) 95);
            if (var6 == 0) {
                class160.field2235[class171.field2437++] = var4;
                var5.field4119 = class35.field533;
            } else {
                int var7 = class131.field1830.method805(2, (byte) -102);
                if (var7 == 0) {
                    class160.field2235[class171.field2437++] = var4;
                    var5.field4119 = class35.field533;
                    class211.field3131[class102.field1466++] = var4;
                } else if (var7 == 1) {
                    class160.field2235[class171.field2437++] = var4;
                    var5.field4119 = class35.field533;
                    int var8 = class131.field1830.method805(3, (byte) -119);
                    var5.method1675(1, var8, true);
                    int var9 = class131.field1830.method805(1, (byte) 80);
                    if (var9 == 1) {
                        class211.field3131[class102.field1466++] = var4;
                    }
                } else if (var7 == 2) {
                    class160.field2235[class171.field2437++] = var4;
                    var5.field4119 = class35.field533;
                    if (class131.field1830.method805(1, (byte) 78) == 1) {
                        int var10 = class131.field1830.method805(3, (byte) -123);
                        var5.method1675(2, var10, true);
                        int var11 = class131.field1830.method805(3, (byte) -9);
                        var5.method1675(2, var11, true);
                    } else {
                        int var12 = class131.field1830.method805(3, (byte) -19);
                        var5.method1675(0, var12, true);
                    }
                    int var13 = class131.field1830.method805(1, (byte) -104);
                    if (var13 == 1) {
                        class211.field3131[class102.field1466++] = var4;
                    }
                } else if (var7 == 3) {
                    class194.field2959[class19.field322++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method352(int arg0, String[] arg1) {
        field786++;
        int var2 = 38 / ((arg0 + 52) / 48);
        String[] var3 = new String[5];
        for (int var4 = 0; var4 < 5; var4++) {
            var3[var4] = var4 + ": ";
            if (arg1 != null && arg1[var4] != null) {
                var3[var4] = var3[var4] + arg1[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
    public static void method353(int arg0) {
        if (arg0 != 0) {
            method352(37, (String[]) null);
        }
        field783 = null;
    }
}
