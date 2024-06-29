import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class726 extends class224 {

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "Lnfa;")
    public class676 field10159;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "[Leca;")
    public static class755[] field10158 = new class755[14];

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "Z")
    public static boolean field10161 = true;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
    public static int field10160;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "I")
    public static int field10162;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
    public static void method4039(boolean arg0) {
        if (!arg0) {
            method4039(true);
        }
        field10158 = null;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lnfa;)V")
    public class726(class676 arg0) {
        this.field10159 = arg0;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)I")
    public static final int method4040(int arg0) {
        field10162++;
        if (class417.field5862 == null) {
            return 0;
        } else if (arg0 == -8869) {
            return class417.field5862.length * 2;
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method4041(int arg0, String arg1) {
        field10160++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class132.method1054(arg1.charAt(var2), true)) {
            var2++;
        }
        while (var3 > var2 && class132.method1054(arg1.charAt(var3 - 1), true)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        int var6 = var2;
        if (arg0 != -1) {
            method4040(-68);
        }
        while (var3 > var6) {
            char var7 = arg1.charAt(var6);
            if (class460.method2804(false, var7)) {
                char var8 = class30.method205(var7, (byte) -107);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
            var6++;
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }
}
