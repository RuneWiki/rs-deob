import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class94 {

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lpg;")
    private class333 field1534;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lrb;")
    public static class283 field1527 = new class283(64, 1);

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lkc;")
    public static class157 field1533 = new class157("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "[[B")
    public static byte[][] field1536;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZC)C", line = 3)
    public static final char method765(boolean arg0, char arg1) {
        field1530++;
        if (!arg0) {
            method766(true);
        }
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V", line = 406)
    public static void method766(boolean arg0) {
        field1536 = null;
        if (arg0) {
            field1527 = null;
            field1533 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIB)V", line = 419)
    public static final void method767(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1529++;
        for (int var5 = 0; var5 < class293.field3963; var5++) {
            Rectangle var6 = class428.field6209[var5];
            if (arg0 < var6.x + var6.width && var6.x < (arg0 + arg1) && (var6.y + var6.height) > arg3 && arg3 + arg2 > var6.y) {
                class428.field6214[var5] = true;
            }
        }
        if (arg4 != 39) {
            method768(null, -109, 26, -31, -53);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lmb;IIII)V", line = 444)
    public static final void method768(class224 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class505.method2997(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class124.field1916) {
            class505.method2997(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class505.method2997(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class177.field2664) {
            class505.method2997(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class177.field2664) {
            class505.method2997(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class124.field1916 && arg4 <= class177.field2664) {
            class505.method2997(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class505.method2997(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class124.field1916 && arg4 > 0) {
            class505.method2997(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[Ljava/lang/String;BI)Ljava/lang/String;", line = 500)
    public static final String method769(int arg0, String[] arg1, byte arg2, int arg3) {
        field1528++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg1[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg3;
            if (arg2 >= -113) {
                method767(-6, 53, 49, 96, (byte) -75);
            }
            int var6 = 0;
            for (int var7 = arg0; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg0; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lpg;II)V", line = 570)
    public class94(class333 arg0, int arg1, int arg2) {
        this.field1532 = arg2;
        this.field1534 = arg0;
    }

    @OriginalMember(owner = "client!ud", name = "finalize", descriptor = "()V", line = 581)
    protected final void finalize() throws Throwable {
        this.field1534.method1986(-70, this.field1532);
        field1535++;
        super.finalize();
    }
}
