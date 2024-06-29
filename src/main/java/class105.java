import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class105 {

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "[S")
    public static short[] field1271 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Ljava/lang/String;CZ)[Ljava/lang/String;", line = 8)
    public static final String[] method562(String arg0, char arg1, boolean arg2) {
        field1270++;
        int var3 = class4.method21(arg0, 0, arg1);
        if (!arg2) {
            method563(true);
        }
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0.charAt(var8) != arg1; var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)V", line = 45)
    public static void method563(boolean arg0) {
        if (arg0) {
            field1271 = null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lw;III[Z)Z", line = 56)
    public static final boolean method564(class451 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class397.field5666 != class185.field2270) {
            int var6 = class249.field3345[arg1].method159(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class176 var8 = class249.field3345[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method159(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method156(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method152(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }
}
