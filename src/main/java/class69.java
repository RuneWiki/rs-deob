import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class69 {

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    private int field898 = -1;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "Z")
    public boolean field912 = true;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    private int field910;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "Luq;")
    private class313 field905;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "Lsq;")
    private class443 field899;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
    private int field913;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    private int field906;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "Lku;")
    private class495 field914;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "Lnu;")
    private class326 field915;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "Lrc;")
    private class29 field902;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "[I")
    public static int[] field911;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lnu;IB)V")
    private final void method391(class326 arg0, int arg1, byte arg2) {
        field904++;
        if (arg1 == 0) {
            return;
        }
        this.method399(0);
        if (arg2 != -123) {
            method395(false);
        }
        this.field905.method1884(this.field914, arg2 ^ 0x7B);
        this.field905.method1923(arg1, -44, 4, arg0, 0);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method392(int arg0, int arg1, String arg2) {
        field901++;
        class632 var3 = class641.method3699(arg0 ^ 0xFFFFDB9F, 2, arg1);
        var3.method3656(0);
        var3.field9204 = arg2;
        if (arg0 != 9228) {
            field911 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
    public static final void method393(byte arg0) {
        field907++;
        class58 var1 = class60.field834;
        synchronized (class60.field834) {
            class60.field834.method317((byte) 21);
        }
        class58 var2 = class358.field5001;
        synchronized (class358.field5001) {
            class358.field5001.method317((byte) 21);
            if (arg0 < 105) {
                method395(false);
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "([BIII)V")
    public final void method394(byte[] arg0, int arg1, int arg2, int arg3) {
        field908++;
        if (arg3 != -3449) {
            this.field910 = -20;
        }
        this.field902.method173((byte) -125, arg0, arg1, this.field905.method1928((byte) 119, arg1) * arg2);
        this.method391(this.field902, arg2, (byte) -123);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)V")
    public static void method395(boolean arg0) {
        if (arg0) {
            field911 = null;
        }
        field911 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
    public final void method396(int arg0) {
        this.method391(this.field915, this.field906, (byte) -123);
        if (arg0 < 70) {
            this.method396(120);
        }
        field909++;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILdg;II)V")
    public static final void method397(int arg0, class20 arg1, int arg2, int arg3) {
        if (arg1.field368 == arg2 && arg2 != -1) {
            class320 var4 = class609.field8754.method535(arg2, true);
            int var5 = var4.field4419;
            if (var5 == 1) {
                arg1.field391 = arg3;
                arg1.field328 = 0;
                arg1.field363 = 0;
                arg1.field376 = 0;
                arg1.field356 = 1;
                class627.method3629(arg1.field6368, class147.field1899 == arg1, var4, arg1.field376, arg1.field6358, (byte) -126, arg1.field6362);
            }
            if (var5 == 2) {
                arg1.field363 = 0;
            }
        } else if (arg2 == -1 || arg1.field368 == -1 || class609.field8754.method535(arg2, true).field4430 >= class609.field8754.method535(arg1.field368, true).field4430) {
            arg1.field376 = 0;
            arg1.field391 = arg3;
            arg1.field363 = 0;
            arg1.field424 = arg1.field421;
            arg1.field356 = 1;
            arg1.field328 = 0;
            arg1.field368 = arg2;
            if (arg1.field368 != -1) {
                class627.method3629(arg1.field6368, class147.field1899 == arg1, class609.field8754.method535(arg1.field368, true), arg1.field376, arg1.field6358, (byte) -117, arg1.field6362);
            }
        }
        field903++;
        if (arg0 >= -115) {
            field911 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BIII)I")
    public static final int method398(byte arg0, int arg1, int arg2, int arg3) {
        field916++;
        int var4 = 53 / ((arg0 + 71) / 33);
        if (arg1 < arg3) {
            return arg3;
        } else if (arg2 < arg1) {
            return arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
    private final void method399(int arg0) {
        field900++;
        if (!this.field912) {
            return;
        }
        this.field912 = false;
        byte[] var2 = this.field899.field6118;
        byte[] var3 = this.field905.field4348;
        int var4 = arg0;
        int var5 = this.field899.field6119;
        int var6 = this.field899.field6119 * this.field913 + this.field910;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field914 != null && this.field898 == var4) {
            this.field912 = false;
            return;
        }
        this.field898 = var4;
        int var8 = this.field913 * var5 + this.field910;
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var8 + var5] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field899.field6119 - 128;
        }
        if (this.field914 == null) {
            this.field914 = new class495(this.field905, 3553, 6406, 128, 128, false, this.field905.field4348, 6406, false);
            this.field914.method2776(-99, false, false);
            this.field914.method805(true, 76);
        } else {
            this.field914.method2782(false, 128, (byte) -105, this.field905.field4348, 0, 0, 0, 6406, 128, 0);
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Luq;Lsq;Lnk;IIIII)V")
    public class69(class313 arg0, class443 arg1, class376 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field910 = arg6;
        this.field905 = arg0;
        this.field899 = arg1;
        this.field913 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field7581 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field5270[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field906 = var10;
        if (var10 <= 0) {
            this.field914 = null;
        } else {
            class551 var14 = new class551(var10 * 2);
            if (this.field905.field4291) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field7581 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field5270[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method3042(var18[var19] & 0xFFFF, 120);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field7581 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field5270[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method3094(true, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field915 = this.field905.method1935(false, var14.field7693, var14.field7707, false, 5123);
            this.field902 = new class29(this.field905, 5123, null, 1);
        }
    }

    static {
        new class344("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field911 = new int[32];
    }
}
