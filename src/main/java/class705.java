import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class705 extends class81 {

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    private int field9931;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    private int field9930;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    private int field9932;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    private int field9925;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    private int field9928;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Lch;")
    private class38 field9935;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    private int field9939;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Lgr;")
    public static class530 field9929 = new class530(49, -1);

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "[I")
    public static int[] field9934 = new int[13];

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "Llc;")
    public static class435 field9936 = new class435(72, 0);

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field9926;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field9927;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field9933;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public static int field9937;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field9938;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lau;")
    private class245 field9924;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "Lip;")
    public static class304 field9940;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Lau;")
    public final class245 method656(byte arg0) {
        if (arg0 >= -108) {
            method3955(true, false, -58);
        }
        field9926++;
        if (this.field9924 == null) {
            class236.field3532[1] = this.field9930;
            class267 var2 = this.field9935.field7881;
            class236.field3532[2] = this.field9928;
            class236.field3532[5] = this.field9925;
            class236.field3532[4] = this.field9931;
            class236.field3532[0] = this.field9939;
            class236.field3532[3] = this.field9932;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method963((byte) 41, class236.field3532[var5])) {
                    return null;
                }
                class679 var7 = var2.method962(class236.field3532[var5], 2904);
                int var8 = var7.field9636 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field9634 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class257.field3684[var6] = var2.method964(125, false, var4, class236.field3532[var6], var4, 1.0F);
            }
            this.field9924 = this.field9935.method225((byte) 3, var4, class257.field3684, var3 != 0);
        }
        return this.field9924;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([BIIIII[BBI)V")
    public static final void method3951(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, byte arg7, int arg8) {
        field9937++;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        int var11 = 105 / ((42 - arg7) / 36);
        for (int var12 = -arg1; var12 < 0; var12++) {
            int var10001;
            for (int var13 = var9; var13 < 0; var13++) {
                var10001 = arg8++;
                arg6[var10001] = (byte) (arg6[var10001] - arg0[arg4++]);
                int var15 = arg8++;
                arg6[var15] = (byte) (arg6[var15] - arg0[arg4++]);
                int var16 = arg8++;
                arg6[var16] = (byte) (arg6[var16] - arg0[arg4++]);
                int var17 = arg8++;
                arg6[var17] = (byte) (arg6[var17] - arg0[arg4++]);
            }
            for (int var14 = var10; var14 < 0; var14++) {
                var10001 = arg8++;
                arg6[var10001] = (byte) (arg6[var10001] - arg0[arg4++]);
            }
            arg4 += arg3;
            arg8 += arg2;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static final void method3952(String arg0, Throwable arg1, int arg2) {
        field9933++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class393.method2399(arg1, 126);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class513.method3118(var3, 82);
            String var4 = class576.method3417(":", var3, "%3a", arg2 + 29813);
            String var5 = class576.method3417("@", var4, "%40", arg2 ^ 0x7492);
            String var6 = class576.method3417("&", var5, "%26", -57);
            String var7 = class576.method3417("#", var6, "%23", -84);
            if (arg2 != -29913) {
                method3955(false, false, 44);
            }
            if (class718.field10127 != null) {
                class432 var8 = class321.field4370.method1871(-17071, new URL(class718.field10127.getCodeBase(), "clienterror.ws?c=" + class648.field9336 + "&u=" + class524.field7611 + "&v1=" + class300.field4086 + "&v2=" + class300.field4095 + "&e=" + var7));
                while (var8.field6198 == 0) {
                    class363.method2283(1L, -24244);
                }
                if (var8.field6198 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field6200;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)Z")
    public static final boolean method3953(int arg0, int arg1, int arg2) {
        field9938++;
        if (arg2 != 0) {
            field9929 = null;
        }
        return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
    public static void method3954(byte arg0) {
        if (arg0 >= 110) {
            field9929 = null;
            field9934 = null;
            field9940 = null;
            field9936 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZZI)V")
    public static final void method3955(boolean arg0, boolean arg1, int arg2) {
        field9927++;
        if (arg2 != -1) {
            field9929 = null;
        }
        if (arg0) {
            class122.field1659++;
            class378.method2351(arg2 + 7653);
        }
        if (arg1) {
            class254.field3667++;
            class353.method2251((byte) 123);
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lch;IIIIII)V")
    public class705(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field9931 = arg5;
        this.field9930 = arg2;
        this.field9932 = arg4;
        this.field9925 = arg6;
        this.field9928 = arg3;
        this.field9935 = arg0;
        this.field9939 = arg1;
    }
}
