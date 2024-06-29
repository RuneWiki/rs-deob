import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class195 extends class179 {

    @OriginalMember(owner = "client!al", name = "t", descriptor = "Z")
    public boolean field2302 = true;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public int field2308 = -1;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public int field2305 = 0;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public int field2307 = 0;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    public int field2311 = 12800;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    public int field2320 = -1;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    public int field2309 = 12800;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "I")
    public int field2310;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "Ljava/lang/String;")
    public String field2301;

    @OriginalMember(owner = "client!al", name = "E", descriptor = "I")
    public int field2313;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "Ljava/lang/String;")
    public String field2306;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "Lbb;")
    public class270 field2315;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "[I")
    public static int[] field2304 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!al", name = "I", descriptor = "[I")
    public static int[] field2317 = new int[50];

    @OriginalMember(owner = "client!al", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field2322 = new String[100];

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "Lwr;")
    public static class450 field2323;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "[Lc;")
    public static class436[] field2319;

    static {
        new class72("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(B)V", line = 6)
    public static void method1208(byte arg0) {
        if (arg0 <= 26) {
            field2304 = null;
        }
        field2322 = null;
        field2319 = null;
        field2304 = null;
        field2323 = null;
        field2317 = null;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 242)
    public class195(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field2308 = arg4;
        this.field2310 = arg3;
        this.field2302 = arg5;
        this.field2320 = arg6;
        this.field2301 = arg1;
        this.field2313 = arg0;
        this.field2306 = arg2;
        if (this.field2320 == 255) {
            this.field2320 = 0;
        }
        this.field2315 = new class270();
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI[II)Z", line = 24)
    public final boolean method1209(boolean arg0, int arg1, int[] arg2, int arg3) {
        field2312++;
        if (arg0) {
            method1212(-59, (byte) -17);
        }
        for (class406 var5 = (class406) this.field2315.method1690((byte) -110); var5 != null; var5 = (class406) this.field2315.method1699((byte) 61)) {
            if (var5.method2532(arg3, arg1, (byte) -45)) {
                var5.method2529(46, arg1, arg2, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([IIII)Z", line = 62)
    public final boolean method1210(int[] arg0, int arg1, int arg2, int arg3) {
        field2318++;
        for (class406 var5 = (class406) this.field2315.method1690((byte) -109); var5 != null; var5 = (class406) this.field2315.method1699((byte) 86)) {
            if (var5.method2533(arg1, true, arg3)) {
                var5.method2530(arg1, arg0, arg3, 1);
                return true;
            }
        }
        return arg2 == 21436 ? false : false;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIZ[II)Z", line = 94)
    public final boolean method1211(int arg0, int arg1, boolean arg2, int[] arg3, int arg4) {
        field2321++;
        for (class406 var6 = (class406) this.field2315.method1690((byte) -107); var6 != null; var6 = (class406) this.field2315.method1699((byte) 16)) {
            if (var6.method2528(arg1, arg4, (byte) -46, arg0)) {
                var6.method2529(24, arg0, arg3, arg1);
                return true;
            }
        }
        if (!arg2) {
            this.field2310 = 100;
        }
        return false;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)Laq;", line = 128)
    public static final class453 method1212(int arg0, byte arg1) {
        field2314++;
        if (arg1 != 49) {
            return null;
        }
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class362.field4903[var2] == null || class362.field4903[var2][var3] == null) {
            boolean var4 = class192.method1185(-3201, var2);
            if (!var4) {
                return null;
            }
        }
        return class362.field4903[var2][var3];
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(B)V", line = 161)
    public final void method1213(byte arg0) {
        field2303++;
        this.field2311 = 12800;
        this.field2307 = 0;
        this.field2305 = 0;
        this.field2309 = 12800;
        for (class406 var2 = (class406) this.field2315.method1690((byte) -121); var2 != null; var2 = (class406) this.field2315.method1699((byte) 46)) {
            if (var2.field5630 > this.field2307) {
                this.field2307 = var2.field5630;
            }
            if (this.field2305 < var2.field5616) {
                this.field2305 = var2.field5616;
            }
            if (var2.field5634 < this.field2309) {
                this.field2309 = var2.field5634;
            }
            if (this.field2311 > var2.field5624) {
                this.field2311 = var2.field5624;
            }
        }
        if (arg0 != 13) {
            method1212(-2, (byte) -94);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIZ)Z", line = 199)
    public final boolean method1214(int arg0, int arg1, boolean arg2) {
        field2316++;
        if (arg2) {
            this.method1211(-70, 97, true, (int[]) null, 16);
        }
        for (class406 var4 = (class406) this.field2315.method1690((byte) -113); var4 != null; var4 = (class406) this.field2315.method1699((byte) 123)) {
            if (var4.method2532(arg1, arg0, (byte) -45)) {
                return true;
            }
        }
        return false;
    }
}
