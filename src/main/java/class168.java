import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class168 extends class439 {

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public int field2521;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public int field2518;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "[I")
    public int[] field2524;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "[Z")
    public boolean[] field2519;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "[I")
    public int[] field2515;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "[[I")
    public int[][] field2517;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Lgf;")
    public static class180 field2522 = new class180("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field2526 = new String[100];

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILqg;IIZII[B)Lls;", line = 4)
    public static final class92 method1192(int arg0, class321 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, byte[] arg7) {
        field2523++;
        if (arg0 < 32) {
            field2526 = null;
        }
        if (!arg1.field4816 && (!class390.method2453(-2628, arg6) || !class390.method2453(-2628, arg3))) {
            return arg1.field4921 ? new class92(arg1, 34037, arg5, arg6, arg3, arg4, arg7, arg2) : new class92(arg1, arg5, arg6, arg3, class159.method1146(false, arg6), class159.method1146(false, arg3), arg7, arg2);
        } else {
            return new class92(arg1, 3553, arg5, arg6, arg3, arg4, arg7, arg2);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([IB)Ljava/lang/String;", line = 24)
    public static final String method1193(int[] arg0, byte arg1) {
        field2520++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class138.field2081;
        int var4 = 0;
        if (arg1 != -57) {
            return null;
        }
        while (arg0.length > var4) {
            class390 var5 = class275.field3992.method1667(120, arg0[var4]);
            if (var5.field5776 != -1) {
                class528 var6 = (class528) class148.field2208.method2339(-89, (long) var5.field5776);
                if (var6 == null) {
                    class158 var7 = class158.method1134(class460.field6798, var5.field5776, 0);
                    if (var7 != null) {
                        var6 = class394.field5821.method517(var7, true);
                        class148.field2208.method2342((long) var5.field5776, var6, -116);
                    }
                }
                if (var6 != null) {
                    class444.field6515[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
            var4++;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I", line = 81)
    public static final int method1194(int arg0, int arg1, int arg2) {
        field2525++;
        int var3 = arg0 >>> 31;
        return arg2 == 9286 ? (arg0 + var3) / arg1 - var3 : -94;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V", line = 96)
    public static void method1195(boolean arg0) {
        if (!arg0) {
            method1192(-101, null, -26, 124, true, -20, 39, null);
        }
        field2526 = null;
        field2522 = null;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I[B)V", line = 107)
    public class168(int arg0, byte[] arg1) {
        this.field2521 = arg0;
        class303 var3 = new class303(arg1);
        this.field2518 = var3.method1918((byte) 69);
        this.field2524 = new int[this.field2518];
        this.field2519 = new boolean[this.field2518];
        this.field2515 = new int[this.field2518];
        this.field2517 = new int[this.field2518][];
        for (int var4 = 0; var4 < this.field2518; var4++) {
            this.field2515[var4] = var3.method1918((byte) 93);
        }
        for (int var5 = 0; var5 < this.field2518; var5++) {
            this.field2519[var5] = var3.method1918((byte) 110) == 1;
        }
        for (int var6 = 0; var6 < this.field2518; var6++) {
            this.field2524[var6] = var3.method1868(0);
        }
        for (int var7 = 0; var7 < this.field2518; var7++) {
            this.field2517[var7] = new int[var3.method1918((byte) -76)];
        }
        for (int var8 = 0; var8 < this.field2518; var8++) {
            for (int var9 = 0; var9 < this.field2517[var8].length; var9++) {
                this.field2517[var8][var9] = var3.method1918((byte) 69);
            }
        }
    }
}
