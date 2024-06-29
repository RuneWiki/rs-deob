import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class487 extends class105 {

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "[C")
    public static char[] field7413 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "Loe;")
    public static class127 field7417 = new class127(60, -2);

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "J")
    public static long field7421 = 0L;

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "Lsk;")
    public static class423 field7422 = new class423("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "Lja;")
    public static class174 field7412;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "[B")
    private byte[] field7414;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIB)V")
    public final void method777(int arg0, int arg1, byte arg2) {
        field7419++;
        int var4 = arg0 * 2;
        if (arg1 != 1811976897) {
            this.field7414 = null;
        }
        byte var5 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        this.field7414[var4++] = var5;
        this.field7414[var4] = var5;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method2921(long arg0, int arg1) {
        field7416++;
        int var3 = 35 % ((arg1 + 63) / 62);
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var4 = 0;
            for (long var5 = arg0; var5 != 0L; var5 /= 37L) {
                var4++;
            }
            StringBuffer var7 = new StringBuffer(var4);
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var7.append(class334.field4986[(int) (var8 - arg0 * 37L)]);
            }
            return var7.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2922(int arg0, String arg1) {
        field7415++;
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(arg0);
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V")
    public static void method2923(byte arg0) {
        if (arg0 > -19) {
            method2921(115L, -8);
        }
        field7412 = null;
        field7422 = null;
        field7417 = null;
        field7413 = null;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
    public class487() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIB)[B")
    public final byte[] method2924(int arg0, int arg1, int arg2, byte arg3) {
        field7423++;
        this.field7414 = new byte[arg2 * 2 * arg0 * arg1];
        if (arg3 > -20) {
            return null;
        } else {
            this.method1200((byte) -128, arg0, arg1, arg2);
            return this.field7414;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lin;IIIILqq;)V")
    public static final void method2925(class56 arg0, int arg1, int arg2, int arg3, int arg4, class318 arg5) {
        field7411++;
        class349 var6 = class164.field2542.method1026(arg0.field902, (byte) 92);
        if (var6.field5147 == -1) {
            return;
        }
        int var8;
        if (arg0.field886) {
            int var7 = arg0.field893 + arg4;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        if (arg1 != -12565) {
            field7412 = null;
        }
        class154 var9 = var6.method2123(arg5, false, arg0.field942, var8);
        if (var9 == null) {
            return;
        }
        int var10 = arg0.field915;
        int var11 = arg0.field967;
        if ((var8 & 0x1) == 1) {
            var10 = arg0.field967;
            var11 = arg0.field915;
        }
        int var12 = var9.method988();
        int var13 = var9.method989();
        if (var6.field5143) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field5149 == 0) {
            var9.method996(arg3, arg2 - (var11 * 4 - 4), var12, var13);
        } else {
            var9.method572(arg3, arg2 - ((var11 - 1) * 4), var12, var13, 0, var6.field5149 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(ILjava/lang/String;)J")
    public static final long method2926(int arg0, String arg1) {
        field7418++;
        int var2 = arg1.length();
        long var3 = 0L;
        if (arg0 != -1431961407) {
            field7422 = null;
        }
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg1.charAt(var5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BIIII)V")
    public static final void method2927(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field7424++;
        if (class463.field7116.field2941 != 0 && arg4 != 0 && class255.field3888 < 50 && arg1 != -1) {
            class432.field6354[class255.field3888++] = new class456((byte) 1, arg1, arg4, arg2, arg3, 0);
        }
        if (arg0 > -19) {
            method2925(null, 65, -24, 29, -45, null);
        }
    }
}
