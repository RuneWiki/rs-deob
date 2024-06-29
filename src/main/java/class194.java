import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class194 extends class243 implements class254 {

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    private int field2820;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "Lgk;")
    public static class331 field2827 = new class331("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "Lsl;")
    public static class318 field2829 = new class318(80, 7);

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "Z")
    public static boolean field2830 = false;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "Lnj;")
    public static class162 field2831;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1356(boolean arg0) {
        field2831 = null;
        if (!arg0) {
            field2827 = null;
        }
        field2829 = null;
        field2827 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IBIII)V", line = 17)
    public static final void method1357(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field2823;
        class215 var5 = class171.method1208(arg0, (byte) 117, 8);
        if (arg1 > -35) {
            method1359(108, 4, -122, -10, 78, 90, -96);
        }
        var5.method1465(-25852);
        var5.field3081 = arg2;
        var5.field3082 = arg3;
        var5.field3077 = arg4;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)I", line = 36)
    public final int method1358(int arg0) {
        if (arg0 != -2584) {
            return -54;
        } else {
            ++field2821;
            return 0;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIII)V", line = 47)
    public static final void method1359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2822;
        int var7 = -arg5 + arg0;
        int var8 = arg5 + arg6;
        int var9 = -106 / ((29 - arg2) / 44);
        for (int var10 = arg6; var10 < var8; ++var10) {
            class531.method3136(arg1, 124, arg3, arg4, class141.field1996[var10]);
        }
        for (int var11 = arg0; ~var7 > ~var11; --var11) {
            class531.method3136(arg1, 118, arg3, arg4, class141.field1996[var11]);
        }
        int var12 = -arg5 + arg4;
        int var13 = arg1 + arg5;
        for (int var14 = var8; ~var14 >= ~var7; ++var14) {
            int[] var15 = class141.field1996[var14];
            class531.method3136(arg1, 125, arg3, var13, var15);
            class531.method3136(var12, 123, arg3, arg4, var15);
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)I", line = 91)
    public final int method1360(byte arg0) {
        ++field2828;
        if (arg0 >= -20) {
            field2831 = null;
        }
        return this.field2820;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "([BZII)V", line = 103)
    public final void method1361(byte[] arg0, boolean arg1, int arg2, int arg3) {
        this.method1600(arg0, arg3);
        ++field2825;
        this.field2820 = arg2;
        if (!arg1) {
            this.field2820 = 113;
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lfd;I[BI)V", line = 115)
    public class194(class365 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field2820 = arg1;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V", line = 123)
    public static final void method1362(Throwable arg0, String arg1, int arg2) {
        ++field2826;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class515.method3058(arg0, -24565);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class66.method648(false, var3);
            String var4 = class433.method2630("%3a", -9, ":", var3);
            String var5 = class433.method2630("%40", -9, "@", var4);
            String var6 = class433.method2630("%26", -9, "&", var5);
            String var7 = class433.method2630("%23", -9, "#", var6);
            if (class265.field3909.field6180 != null) {
                class449 var8 = class265.field3909.method2574(new URL(class265.field3909.field6180.getCodeBase(), "clienterror.ws?c=" + class66.field848 + "&u=" + class258.field3800 + "&v1=" + class419.field6186 + "&v2=" + class419.field6187 + "&e=" + var7), -106);
                while (var8.field6617 == 0) {
                    class213.method1462(1L, -5184);
                }
                int var9 = 109 / ((-5 - arg2) / 57);
                if (~var8.field6617 == -2) {
                    DataInputStream var10 = (DataInputStream) var8.field6613;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)J", line = 178)
    public final long method1363(byte arg0) {
        if (arg0 > -59) {
            return -118L;
        } else {
            ++field2824;
            return super.field3584.method2673();
        }
    }
}
