import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class308 extends class443 {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Ljava/net/Socket;")
    private Socket field4451;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Lcn;")
    private class362 field4459;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Luv;")
    private class249 field4464;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field4460 = -1;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Lof;")
    public static class446 field4461 = new class446("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "[I")
    public static int[] field4465 = new int[14];

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!jc", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        field4455++;
        this.method1934((byte) -80);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Z", line = 11)
    public final boolean method1929(byte arg0, int arg1) throws IOException {
        if (arg0 == -82) {
            field4463++;
            return this.field4459.method2310((byte) 125, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lub;Z)V", line = 23)
    public static final void method1930(class17 arg0, boolean arg1) {
        field4453++;
        if (!arg1) {
            field4465 = null;
        }
        for (class179 var2 = (class179) class86.field1254.method445(33); var2 != null; var2 = (class179) class86.field1254.method451(false)) {
            if (var2.field2388 == arg0) {
                if (var2.field2400 != null) {
                    class31.field463.method883(var2.field2400);
                    var2.field2400 = null;
                }
                var2.method25(-13489);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([BIII)I", line = 58)
    public final int method1931(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field4458++;
        return arg2 == 32 ? this.field4459.method2309(arg0, arg1, 17039, arg3) : 99;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 70)
    public static final void method1932(int arg0) {
        field4452++;
        class316.method1986((byte) 74, false);
        class199.field2655 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class510.field7488.length; var2++) {
            if (class213.field3024[var2] != -1 && class510.field7488[var2] == null) {
                class510.field7488[var2] = class79.field1131.method1281(class213.field3024[var2], 0, 82);
                if (class510.field7488[var2] == null) {
                    var1 = false;
                    class199.field2655++;
                }
            }
            if (class410.field6233[var2] != -1 && class140.field1870[var2] == null) {
                class140.field1870[var2] = class79.field1131.method1296(class411.field6253[var2], class410.field6233[var2], 0, -3);
                if (class140.field1870[var2] == null) {
                    class199.field2655++;
                    var1 = false;
                }
            }
            if (class423.field6449[var2] != -1 && class402.field6119[var2] == null) {
                class402.field6119[var2] = class79.field1131.method1281(class423.field6449[var2], 0, arg0 + 69);
                if (class402.field6119[var2] == null) {
                    class199.field2655++;
                    var1 = false;
                }
            }
            if (class44.field640[var2] != -1 && class455.field6843[var2] == null) {
                class455.field6843[var2] = class79.field1131.method1281(class44.field640[var2], 0, 127);
                if (class455.field6843[var2] == null) {
                    class199.field2655++;
                    var1 = false;
                }
            }
            if (class441.field6657 != null && class263.field3688[var2] == null && class441.field6657[var2] != -1) {
                class263.field3688[var2] = class79.field1131.method1296(class411.field6253[var2], class441.field6657[var2], 0, arg0 - 3);
                if (class263.field3688[var2] == null) {
                    class199.field2655++;
                    var1 = false;
                }
            }
        }
        if (class401.field6112 == null) {
            if (class365.field5599 == null || !class502.field7409.method1286(0, class365.field5599.field6644 + "_staticelements")) {
                class401.field6112 = new class146(0);
            } else if (class502.field7409.method1285(class365.field5599.field6644 + "_staticelements", 1)) {
                class401.field6112 = class312.method1966((byte) -118, class502.field7409, class414.field6307, class365.field5599.field6644 + "_staticelements");
            } else {
                class199.field2655++;
                var1 = false;
            }
        }
        if (!var1) {
            class281.field3982 = 1;
            return;
        }
        boolean var3 = true;
        class29.field448 = 0;
        for (int var4 = 0; var4 < class510.field7488.length; var4++) {
            byte[] var19 = class140.field1870[var4];
            if (var19 != null) {
                int var20 = (class510.field7490[var4] >> 8) * 64 - class331.field5162;
                int var21 = (class510.field7490[var4] & 0xFF) * 64 - class328.field5099;
                if (class405.field6149 != 0) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class101.method659(70, var21, class528.field7734, var20, var19, class398.field6071);
            }
            byte[] var22 = class455.field6843[var4];
            if (var22 != null) {
                int var23 = (class510.field7490[var4] >> 8) * 64 - class331.field5162;
                int var24 = (class510.field7490[var4] & 0xFF) * 64 - class328.field5099;
                if (class405.field6149 != 0) {
                    var23 = 10;
                    var24 = 10;
                }
                var3 &= class101.method659(78, var24, class528.field7734, var23, var22, class398.field6071);
            }
        }
        if (!var3) {
            class281.field3982 = 2;
            return;
        }
        if (class281.field3982 != 0) {
            class536.method3166(class86.field1253.method2705((byte) 69, class257.field3556) + "<br>(100%)", true, class94.field1380, arg0 ^ 0x2);
        }
        class523.method3104((byte) -1);
        class475.method2833(arg0);
        boolean var5 = false;
        if (class400.field6090.method797() && class203.field2716.field1165) {
            for (int var6 = 0; var6 < class510.field7488.length; var6++) {
                if (class455.field6843[var6] != null || class402.field6119[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class203.field2716.field1174) {
            var7 = class372.field5665[class389.field5948];
        } else {
            var7 = class31.field465[class389.field5948];
        }
        if (class400.field6090.method848()) {
            var7++;
        }
        class486.method2909(7, 4, class398.field6071, class528.field7734, var7, var5, class400.field6090.method811() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class9.field174[var8].method1213((byte) -95);
        }
        class401.method2480(-73);
        class212.method1462(false, arg0 + 5424);
        class86.method586((byte) -128);
        class121.field1655 = null;
        class523.method3104((byte) -1);
        System.gc();
        class316.method1986((byte) 74, true);
        class10.method102(87);
        class448.field6745 = class203.field2716.method552(-4, class378.field5771);
        class271.field3764 = class203.field2716.field1165;
        class414.field6310 = class230.field3289 >= 96;
        class441.field6659 = class203.field2716.method549((byte) -121, class378.field5771);
        class528.field7738 = !class203.field2716.field1159;
        class410.field6230 = class203.field2716.method15(class378.field5771, 0) ? -1 : class253.field3515;
        class323.field4680 = class378.field5771 == 1 || class203.field2716.field1151;
        class127.field1728 = class203.field2716.field1181;
        class274.field3811 = new class337(4, class398.field6071, class528.field7734, false);
        if (class405.field6149 == 0) {
            class487.method2913(class510.field7488, 2048, class274.field3811);
        } else {
            class373.method2355((byte) 67, class274.field3811, class510.field7488);
        }
        class428.method2609((byte) -128, class528.field7734 >> 4, class398.field6071 >> 4);
        class461.method2790(-68);
        if (var5) {
            class300.method1906(true);
            class454.field6829 = new class337(1, class398.field6071, class528.field7734, true);
            if (class405.field6149 == 0) {
                class487.method2913(class402.field6119, arg0 ^ 0x800, class454.field6829);
                class316.method1986((byte) 74, true);
            } else {
                class373.method2355((byte) 67, class454.field6829, class402.field6119);
                class316.method1986((byte) 74, true);
            }
            class454.field6829.method1668(class274.field3811.field3645[0], 0, (byte) -77);
            class454.field6829.method1674(class400.field6090, null, (byte) -113, null);
            class300.method1906(false);
        }
        class274.field3811.method1674(class400.field6090, class9.field174, (byte) -107, var5 ? class454.field6829.field3645 : null);
        if (class405.field6149 == arg0) {
            class316.method1986((byte) 74, true);
            class515.method3071(class274.field3811, class140.field1870, (byte) 63);
            if (class263.field3688 != null) {
                class66.method473(-113);
            }
        } else {
            class316.method1986((byte) 74, true);
            class522.method3100(class140.field1870, -12834, class274.field3811);
        }
        class475.method2833(arg0);
        class316.method1986((byte) 74, true);
        class274.field3811.method1672(var5 ? class71.field988[0] : null, null, 0, class400.field6090);
        class274.field3811.method2187(class400.field6090, -98);
        class316.method1986((byte) 74, true);
        if (var5) {
            class300.method1906(true);
            class316.method1986((byte) 74, true);
            if (class405.field6149 == 0) {
                class515.method3071(class454.field6829, class455.field6843, (byte) 63);
            } else {
                class522.method3100(class455.field6843, -12834, class454.field6829);
            }
            class475.method2833(arg0);
            class316.method1986((byte) 74, true);
            class454.field6829.method1672(null, class414.field6317[0], arg0, class400.field6090);
            class454.field6829.method2187(class400.field6090, -126);
            class316.method1986((byte) 74, true);
            class300.method1906(false);
        }
        class532.method3145((byte) 29);
        int var9 = class274.field3811.field5227;
        if (var9 > class367.field5618) {
            var9 = class367.field5618;
        }
        if (var9 < class367.field5618 - 1) {
            var9 = class367.field5618 - 1;
        }
        if (class203.field2716.method15(class378.field5771, 0)) {
            class322.method2007(0);
        } else {
            class322.method2007(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class398.field6071; var17++) {
                for (int var18 = 0; var18 < class528.field7734; var18++) {
                    class103.method671(var10, var17, var18, -118);
                }
            }
        }
        class177.method1186((byte) 112);
        class523.method3104((byte) -1);
        class4.method12(false);
        class475.method2833(0);
        class465.field6936 = false;
        class165.method1125((byte) 21);
        if (class286.field4195 != null && class374.field5695 != null && class435.field6596 == 10) {
            class424.method2582(class44.field637, -1);
            class389.field5945++;
            class538.field7879.method1073(326170192, 1057001181);
        }
        if (class405.field6149 == 0) {
            int var11 = (class492.field7259 - (class398.field6071 >> 4)) / 8;
            int var12 = ((class398.field6071 >> 4) + class492.field7259) / 8;
            int var13 = (class276.field3936 - (class528.field7734 >> 4)) / 8;
            int var14 = (class276.field3936 + (class528.field7734 >> 4)) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var11 > var15 || var12 < var15 || var13 > var16 || var16 > var14) {
                        class79.field1131.method1274("m" + var15 + "_" + var16, 0);
                        class79.field1131.method1274("l" + var15 + "_" + var16, arg0);
                    }
                }
            }
        }
        if (class435.field6596 == 3) {
            class134.method908(2, 2);
        } else if (class435.field6596 == 7) {
            class134.method908(6, 2);
        } else {
            class134.method908(9, arg0 + 2);
            if (class374.field5695 != null) {
                class424.method2582(class354.field5482, -1);
            }
        }
        class31.method271((byte) -120);
        class523.method3104((byte) -1);
        class140.method937(arg0 ^ 0x60);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V", line = 530)
    public static void method1933(byte arg0) {
        if (arg0 == 95) {
            field4461 = null;
            field4465 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 547)
    public final void method1934(byte arg0) {
        field4457++;
        if (arg0 > -14) {
            this.finalize();
        }
        try {
            this.field4451.close();
        } catch (IOException var2) {
        }
        this.field4459.method2312(117);
        this.field4464.method1616(-11323);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 563)
    public final void method1935(int arg0) {
        this.field4459.method2313(false);
        field4454++;
        if (arg0 != 1452) {
            method1930(null, false);
        }
        this.field4464.method1615(true);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ[BI)V", line = 582)
    public final void method1936(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        this.field4464.method1614(arg0, arg2, 107, arg3);
        if (arg1) {
            field4462++;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 593)
    public class308(Socket arg0, int arg1) throws IOException {
        this.field4451 = arg0;
        this.field4451.setSoTimeout(30000);
        this.field4451.setTcpNoDelay(true);
        this.field4459 = new class362(this.field4451.getInputStream(), arg1);
        this.field4464 = new class249(this.field4451.getOutputStream(), arg1);
    }
}
