import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class67 extends class47 {

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    public int field969 = -1;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    public int field976 = 0;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    public int field980 = 0;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
    public int field982 = 12800;

    @OriginalMember(owner = "client!fl", name = "X", descriptor = "Z")
    public boolean field988 = true;

    @OriginalMember(owner = "client!fl", name = "ab", descriptor = "I")
    public int field991 = 12800;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
    public int field972 = -1;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "client!fl", name = "bb", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "Ljava/lang/String;")
    public String field984;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "Ljava/lang/String;")
    public String field971;

    @OriginalMember(owner = "client!fl", name = "Z", descriptor = "Lcf;")
    public class92 field990;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    public static int field973 = 0;

    @OriginalMember(owner = "client!fl", name = "V", descriptor = "J")
    public static long field986;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!fl", name = "W", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!fl", name = "Y", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "Lae;")
    public static class172 field970;

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "Lnl;")
    public static class435 field985;

    static {
        new class151("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field986 = -1L;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BII)V", line = 9)
    public static final void method625(byte arg0, int arg1, int arg2) {
        field983++;
        if (class412.field5645 == 1) {
            class434.method2622((byte) 118, arg1, arg2, class373.field5137);
        } else if (class412.field5645 == 2) {
            class487.method2867((byte) 104, arg2, arg1);
        }
        class412.field5645 = 0;
        if (arg0 > -28) {
            method633(-51, -80, 57, 43, (byte) 59, -82);
        }
        class373.field5137 = null;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 270)
    public class67(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field968 = arg0;
        this.field992 = arg3;
        this.field984 = arg1;
        this.field969 = arg6;
        this.field988 = arg5;
        this.field972 = arg4;
        this.field971 = arg2;
        if (this.field969 == 255) {
            this.field969 = 0;
        }
        this.field990 = new class92();
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[III)Z", line = 47)
    public final boolean method626(int arg0, int[] arg1, int arg2, int arg3) {
        field987++;
        for (class103 var5 = (class103) this.field990.method775(1); var5 != null; var5 = (class103) this.field990.method763(0)) {
            if (var5.method828(arg2, arg3, -1)) {
                var5.method826((byte) -114, arg1, arg3, arg2);
                return true;
            }
        }
        int var6 = 6 / ((arg0 + 59) / 61);
        return false;
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(B)V", line = 73)
    public static void method627(byte arg0) {
        field985 = null;
        field970 = null;
        if (arg0 <= 62) {
            field985 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIII[I)Z", line = 88)
    public final boolean method628(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        if (arg0 != -19313) {
            this.field990 = null;
        }
        field989++;
        for (class103 var6 = (class103) this.field990.method775(1); var6 != null; var6 = (class103) this.field990.method763(0)) {
            if (var6.method829(arg3, arg2, false, arg1)) {
                var6.method827(arg4, true, arg1, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIB)Z", line = 122)
    public final boolean method629(int arg0, int arg1, byte arg2) {
        field974++;
        if (arg2 > -24) {
            this.field971 = null;
        }
        for (class103 var4 = (class103) this.field990.method775(1); var4 != null; var4 = (class103) this.field990.method763(0)) {
            if (var4.method832(arg0, arg1, (byte) -22)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIII)I", line = 151)
    public static final int method630(int arg0, int arg1, int arg2, int arg3) {
        field978++;
        if (arg0 != 0) {
            field986 = 63L;
        }
        if (arg3 <= arg1) {
            return arg1 <= arg2 ? arg1 : arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([IBII)Z", line = 168)
    public final boolean method631(int[] arg0, byte arg1, int arg2, int arg3) {
        field975++;
        if (arg1 != -84) {
            return false;
        }
        for (class103 var5 = (class103) this.field990.method775(1); var5 != null; var5 = (class103) this.field990.method763(0)) {
            if (var5.method832(arg2, arg3, (byte) -22)) {
                var5.method827(arg0, true, arg2, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(B)V", line = 200)
    public final void method632(byte arg0) {
        this.field991 = 12800;
        this.field982 = 12800;
        field981++;
        this.field976 = 0;
        this.field980 = 0;
        for (class103 var2 = (class103) this.field990.method775(1); var2 != null; var2 = (class103) this.field990.method763(0)) {
            if (var2.field1451 < this.field991) {
                this.field991 = var2.field1451;
            }
            if (var2.field1453 < this.field982) {
                this.field982 = var2.field1453;
            }
            if (this.field976 < var2.field1443) {
                this.field976 = var2.field1443;
            }
            if (var2.field1442 > this.field980) {
                this.field980 = var2.field1442;
            }
        }
        if (arg0 >= -45) {
            this.field969 = -124;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIBI)V", line = 240)
    public static final void method633(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var9 = arg5 + 1;
        class61.method558(arg1, -10647, class373.field5141[arg5], arg3, arg0);
        field977++;
        int var8 = arg2 - 1;
        class61.method558(arg1, -10647, class373.field5141[arg2], arg3, arg0);
        if (arg4 > -83) {
            field973 = -42;
        }
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class373.field5141[var6];
            var7[arg3] = var7[arg1] = arg0;
        }
    }
}
