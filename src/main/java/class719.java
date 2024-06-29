import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class719 implements class159 {

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Liu;")
    private class578 field9979;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "Lpj;")
    private class145 field9976;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "Lqfa;")
    public static class98 field9986 = new class98(108, 3);

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "Lsi;")
    public static class559 field9987 = new class559();

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field9977;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field9978;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public static int field9980;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field9981;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field9982;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field9983;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    public static int field9984;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public static int field9985;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)Z")
    public final boolean method49(int arg0) {
        field9978++;
        return arg0 == -32252 ? this.field9979.method3296(-126) : true;
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (arg0 != 11133) {
            field9986 = null;
        }
        field9985++;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZI)V")
    public final void method1056(boolean arg0, int arg1) {
        field9980++;
        if (arg1 != -3340) {
            method4038(54);
        }
        class522 var3 = this.field9979.method3297((byte) -69, this.field9976.field2080);
        if (var3 == null) {
            return;
        }
        int var4 = this.field9976.field2076.method12(class192.field2561, this.field9976.field2077, -102) + this.field9976.field2075;
        int var5 = this.field9976.field2079.method826(this.field9976.field2074, 0, class191.field2553) + this.field9976.field2072;
        if (this.field9976.field2084) {
            class268.field3831.method445(var4, var5, this.field9976.field2077, this.field9976.field2074, this.field9976.field2082, 0);
        }
        int var6 = var5 + this.method4041(var5, 5, var3.field7401, class505.field7241, 120, var4) * 12;
        int var9 = var6 + 8;
        if (this.field9976.field2084) {
            class268.field3831.method378(var4, var9, this.field9976.field2077 + var4 - 1, var9, this.field9976.field2082, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method4041(var6, 5, var3.field7404, class505.field7241, 126, var4) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method4041(var10, 5, var3.field7396, class505.field7241, arg1 + 3464, var4) * 12;
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)V")
    public static void method4038(int arg0) {
        int var1 = 76 / ((63 - arg0) / 51);
        field9987 = null;
        field9986 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IC)C")
    public static final char method4039(int arg0, char arg1) {
        field9981++;
        if (arg0 != 35) {
            method4039(105, (char) 65466);
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

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Liu;Lpj;)V")
    public class719(class578 arg0, class145 arg1) {
        this.field9979 = arg0;
        this.field9976 = arg1;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method4040(int arg0, char arg1, String arg2) {
        field9984++;
        int var3 = class655.method3601(arg2, -8657, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1 != arg2.charAt(var8); var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        if (arg0 != 11027) {
            field9987 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILjava/lang/String;Lda;II)I")
    private final int method4041(int arg0, int arg1, String arg2, class59 arg3, int arg4, int arg5) {
        int var7 = 33 % ((83 - arg4) / 36);
        field9982++;
        return arg3.method510(arg0 + arg1, 0, this.field9976.field2077 - (arg1 * 2), null, 0, this.field9976.field2073, null, 0, this.field9976.field2081, this.field9976.field2074 - arg1 * 2, 0, 0, arg1 + arg5, null, arg2, (byte) 100);
    }
}
