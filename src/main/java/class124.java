import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class124 extends class148 {

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field1966 = 0;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field1968 = 0;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "[[I")
    public static int[][] field1969 = new int[5][5000];

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field1970 = new String[100];

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field1967 = 0;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lim;)V")
    public static final void method870(class179 arg0) {
        for (int var1 = arg0.field2931; var1 <= arg0.field2918; var1++) {
            for (int var2 = arg0.field2915; var2 <= arg0.field2925; var2++) {
                class151 var3 = class218.field3584[arg0.field2923][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2357; var4++) {
                        if (var3.field2347[var4] == arg0) {
                            var3.field2357--;
                            for (int var5 = var4; var5 < var3.field2357; var5++) {
                                var3.field2347[var5] = var3.field2347[var5 + 1];
                                var3.field2368[var5] = var3.field2368[var5 + 1];
                            }
                            var3.field2347[var3.field2357] = null;
                            break;
                        }
                    }
                    var3.field2358 = 0;
                    for (int var6 = 0; var6 < var3.field2357; var6++) {
                        var3.field2358 |= var3.field2368[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static void method871(byte arg0) {
        field1969 = null;
        field1970 = null;
        if (arg0 <= 62) {
            field1966 = 72;
        }
    }
}
