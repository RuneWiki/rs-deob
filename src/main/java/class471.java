import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class471 {

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lhp;")
    private class277 field6973 = new class277(256);

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Le;")
    private class462 field6979;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Lad;")
    private class362 field6977;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6981;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "[Lhi;")
    public static class177[] field6984;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field6971;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field6983;

    static {
        new class474("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
        new class474("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field6981 = new BigInteger("ada0c4996cbd0df7e019926ebc1082a79b45282dae38dc409b2b377906b3a638709a11d2bf4c94bcc697cbd681d0a6e1d6518ba1fe51658e2d8f62fba5dfc74e93d19460092b8409f6ba97ea61d91c3783309b6edd56c6f8a178d864ecfa5811e7a2df38cf4efd3dca7a22e194523703595d22143c2ff6e1823f2e1f8b4f3baaf8f4d92b74df4309a882311973ec2f994ddcab39d1bf0a4470a5a8777527fade536cbb7c1e2f76fbfe513ea7851b26cfe206e8bfd0ed157d2df2e1308b74f2615e911a5eea8e46e774e25900bf1b971f7cc46b25c14f08446d6ec1f44e88419077d73ee212b59ed4dd7f2d1adf2252abd3d865ada958fa5319832bc6be35d61cb85cb54722bcc06149334aa023aa709739f9fa64c4f64b20e4ea8bc409135e396ee67865aafad8a2c77b43347be2506a41339901ae696274166ad315c004f45ab8cf6356ecdbeb07488501d0c79fae6127f0263cf657fe297d914bb225806ff3fd6539eac0e7a8f40a2bf5135e7c398f3d446537f26effc4c2bedd5233515d5f9188b34673f2a311fafe12cae7ff54f0d8fb97f397f8a85a9299cdaa31bf5f660180f827f1b7a41625522ba501f623758e0a0df2c912dac6a925d22b9a3ba9816a2e3c356c6c6f33c3fbda4c6c2a5414d01fed798fa2956aaf3c6224575ab9cc858398c32fe0f1af5640275ae64ef3aaf3644fa64697d453bdae4e42ea5358df", 16);
        field6984 = new class177[14];
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 4)
    public final void method2879(int arg0) {
        int var2 = -32 % ((arg0 + 38) / 59);
        field6975++;
        this.field6973.method1811((byte) 111, 5);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLqf;I)V", line = 15)
    public static final void method2880(boolean arg0, class593 arg1, int arg2) {
        field6970++;
        int var3 = arg1.field8626 == 0 ? arg1.field8570 : arg1.field8626;
        int var4 = arg1.field8549 == 0 ? arg1.field8518 : arg1.field8549;
        class313.method2062(var4, arg0, class297.field4403[arg1.field8579 >> 16], arg2 ^ arg2, arg1.field8579, var3);
        if (arg1.field8512 != null) {
            class313.method2062(var4, arg0, arg1.field8512, arg2 ^ 0xA, arg1.field8579, var3);
        }
        class563 var5 = (class563) class234.field3309.method524((byte) 90, (long) arg1.field8579);
        if (var5 != null) {
            class631.method3612(var5.field8022, var4, var3, arg0, arg2 ^ 0xFFFFFFF5);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[FIIII)V", line = 40)
    public static final void method2881(int arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field6982++;
        if (arg1 > 0 && !class229.method1482(arg1, 69)) {
            throw new IllegalArgumentException("");
        } else if (arg6 <= 0 || class229.method1482(arg6, 42)) {
            int var7 = class525.method3093(arg0, (byte) -77);
            int var8 = arg5;
            int var9 = arg1 >= arg6 ? arg6 : arg1;
            int var10 = arg1 >> 1;
            int var11 = arg6 >> 1;
            float[] var12 = arg2;
            float[] var13 = new float[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var8, arg3, arg1, arg6, 0, arg0, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg1 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg6 = var11;
                var12 = var15;
                arg1 = var10;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var8++;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Laca;", line = 136)
    public static final class630 method2882(int arg0, int arg1) {
        field6978++;
        class567[] var2 = class254.field3627;
        synchronized (class254.field3627) {
            class630 var3;
            if (class254.field3627.length <= arg1 || class254.field3627[arg1].method3291(-119)) {
                var3 = new class630();
                var3.field9084 = new class219[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field9084[var4] = new class219();
                }
            } else {
                var3 = (class630) class254.field3627[arg1].method3294(false);
                var3.method3488(false);
                int var10002 = class609.field8883[arg1]--;
            }
            return arg0 > -124 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)Lcs;", line = 169)
    public final class289 method2883(byte arg0, int arg1) {
        if (arg0 != 121) {
            this.field6979 = null;
        }
        field6972++;
        Object var3 = this.field6973.method1801(0, (long) arg1);
        if (var3 != null) {
            return (class289) var3;
        } else if (this.field6979.method436(arg1, -5686)) {
            class614 var4 = this.field6979.method438(118, arg1);
            int var5 = var4.field8944 ? 64 : this.field6977.field5334;
            class289 var7;
            if (var4.field8937 && this.field6977.method359()) {
                float[] var6 = this.field6979.method440((byte) -89, var5, false, var5, 0.7F, arg1);
                var7 = new class289(this.field6977, 3553, 34842, var5, var5, var4.field8940 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field8943) {
                    var8 = this.field6979.method433(27, false, var5, arg1, var5, 0.7F);
                } else {
                    var8 = this.field6979.method432(var5, 0.7F, arg1, var5, arg0 ^ 0xFFFFB97F, true);
                }
                var7 = new class289(this.field6977, 3553, 6408, var5, var5, var4.field8940 != 0, var8, false);
            }
            var7.method1867(var4.field8932, 2203, var4.field8947);
            this.field6973.method1808((long) arg1, var7, (byte) -51);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 220)
    public final void method2884(int arg0) {
        this.field6973.method1810(false);
        field6980++;
        int var2 = 109 / ((arg0 + 27) / 48);
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V", line = 230)
    public static void method2885(int arg0) {
        if (arg0 != 0) {
            method2890(26, -126, -43, null);
        }
        field6981 = null;
        field6984 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZJIBI)Ljava/lang/String;", line = 241)
    public static final String method2886(boolean arg0, long arg1, int arg2, byte arg3, int arg4) {
        field6976++;
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        if (arg3 > -93) {
            method2889((byte) 125, null, null);
        }
        boolean var8 = false;
        if (arg1 < 0L) {
            arg1 = -arg1;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var10 = 0; var10 < arg4; var10++) {
                int var11 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (var11 + 48 - (int) arg1 * 10));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg1;
            arg1 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg1 * 10)));
            if (arg1 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;IIB)V", line = 322)
    public static final void method2887(int arg0, String arg1, int arg2, int arg3, byte arg4) {
        field6968++;
        class593 var5 = class322.method2103(arg3, false, arg0);
        if (var5 == null) {
            return;
        }
        if (arg4 <= 124) {
            field6984 = null;
        }
        if (var5.field8607 != null) {
            class86 var6 = new class86();
            var6.field976 = var5;
            var6.field985 = var5.field8607;
            var6.field972 = arg2;
            var6.field975 = arg1;
            class604.method3516(var6);
        }
        if (class133.field1673 != 9 || !client.method1682(var5).method1779(arg2 - 1, (byte) 15)) {
            return;
        }
        if (arg2 == 1) {
            class598.field8728++;
            class308.method2044(class171.field2103, -7434);
            class457.method2823(-1, arg3, arg0, var5.field8601);
        }
        if (arg2 == 2) {
            class348.field4970++;
            class308.method2044(class102.field1222, -7434);
            class457.method2823(-1, arg3, arg0, var5.field8601);
        }
        if (arg2 == 3) {
            class308.method2044(class75.field804, -7434);
            class371.field5678++;
            class457.method2823(-1, arg3, arg0, var5.field8601);
        }
        if (arg2 == 4) {
            class550.field7850++;
            class308.method2044(class485.field7100, -7434);
            class457.method2823(-1, arg3, arg0, var5.field8601);
        }
        if (arg2 == 5) {
            class308.method2044(class496.field7250, -7434);
            class618.field8976++;
            class457.method2823(-1, arg3, arg0, var5.field8601);
        }
        if (arg2 == 6) {
            class575.field8296++;
            class308.method2044(class559.field7963, -7434);
            class457.method2823(-1, arg3, arg0, var5.field8601);
        }
        if (arg2 == 7) {
            class637.field9164++;
            class308.method2044(class568.field8158, -7434);
            class457.method2823(-1, arg3, arg0, var5.field8601);
        }
        if (arg2 == 8) {
            class308.method2044(class589.field8471, -7434);
            class139.field1704++;
            class457.method2823(-1, arg3, arg0, var5.field8601);
        }
        if (arg2 == 9) {
            class308.method2044(class637.field9167, -7434);
            class486.field7105++;
            class457.method2823(-1, arg3, arg0, var5.field8601);
        }
        if (arg2 == 10) {
            class347.field4968++;
            class308.method2044(class254.field3630, -7434);
            class457.method2823(-1, arg3, arg0, var5.field8601);
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lad;Le;)V", line = 453)
    public class471(class362 arg0, class462 arg1) {
        this.field6979 = arg1;
        this.field6977 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)I", line = 462)
    public static final int method2888(byte arg0) {
        field6971++;
        if (arg0 != 12) {
            method2890(42, -27, -52, null);
        }
        return 16;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B[[BLfda;)V", line = 473)
    public static final void method2889(byte arg0, byte[][] arg1, class270 arg2) {
        field6974++;
        if (arg0 >= -20) {
            method2881(24, -41, null, -115, -70, -41, 106);
        }
        for (int var3 = 0; var3 < arg2.field1019; var3++) {
            class453.method2798((byte) -40);
            for (int var4 = 0; var4 < class90.field1032 >> 3; var4++) {
                for (int var5 = 0; var5 < class30.field349 >> 3; var5++) {
                    int var6 = class305.field4479[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg2.field1001 || var7 == 0) {
                            int var8 = (var6 & 0x6) >> 1;
                            int var9 = (var6 & 0xFFCA2E) >> 14;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class170.field2090.length; var12++) {
                                if (class170.field2090[var12] == var11 && arg1[var12] != null) {
                                    arg2.method1767(var8, var4 * 8, false, class14.field120, (var10 & 0x7) * 8, var3, var5 * 8, (var9 & 0x7) * 8, arg1[var12], var7, class413.field6264);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILkea;)Lor;", line = 544)
    public static final class557 method2890(int arg0, int arg1, int arg2, class203 arg3) {
        field6969++;
        byte[] var4 = arg3.method1286(arg0, arg1, (byte) -49);
        if (var4 == null) {
            return null;
        } else if (arg2 >= -49) {
            return null;
        } else {
            return new class557(var4);
        }
    }
}
