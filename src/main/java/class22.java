import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class22 extends class452 {

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "J")
    public static long field269 = -1L;

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "Lak;")
    public static class234 field271 = new class234("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "Lak;")
    public static class234 field273 = new class234("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!ir", name = "H", descriptor = "Lak;")
    public static class234 field275 = new class234("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!ir", name = "I", descriptor = "Lak;")
    public static class234 field276 = new class234("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!ir", name = "J", descriptor = "[B")
    public static byte[] field277 = new byte[520];

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!ir", name = "G", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "[Lrq;")
    public class235[] field263;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "[[B")
    private byte[][] field267;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)Z")
    public final boolean method164(int arg0, int arg1) {
        field268++;
        if (arg0 != 256) {
            this.method166(118, -10);
        }
        return this.field263[arg1].field3783;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZ)Z")
    public final boolean method165(int arg0, boolean arg1) {
        field270++;
        return arg1 ? this.field263[arg0].field3793 : false;
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(II)Z")
    public final boolean method166(int arg0, int arg1) {
        if (arg0 != 14360) {
            field276 = null;
        }
        field264++;
        return this.field263[arg1].field3782;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)Z")
    public final boolean method167(byte arg0) {
        field265++;
        if (this.field263 != null) {
            return true;
        }
        if (this.field267 == null) {
            if (!class521.field7629.method2548(true, this.field266)) {
                return false;
            }
            int[] var2 = class521.field7629.method2540(-108, this.field266);
            this.field267 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field267[var3] = class521.field7629.method2536(this.field266, 0, var2[var3]);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field267.length; var5++) {
            byte[] var14 = this.field267[var5];
            int var15 = var14[1] & 0xFF | (var14[0] & 0xFF) << 8;
            var4 &= class48.field626.method2556((byte) 21, var15);
        }
        if (!var4) {
            return false;
        } else if (arg0 == 37) {
            class137 var6 = new class137();
            int var7 = class521.field7629.method2551(this.field266, -26070);
            this.field263 = new class235[var7];
            int[] var8 = class521.field7629.method2540(108, this.field266);
            for (int var9 = 0; var9 < var8.length; var9++) {
                byte[] var10 = this.field267[var9];
                int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
                class42 var12 = null;
                for (class42 var13 = (class42) var6.method1004((byte) -53); var13 != null; var13 = (class42) var6.method996(arg0 ^ 0x24)) {
                    if (var13.field554 == var11) {
                        var12 = var13;
                        break;
                    }
                }
                if (var12 == null) {
                    var12 = new class42(var11, class48.field626.method2558(var11, 109));
                    var6.method994(var12, -3610);
                }
                this.field263[var8[var9]] = new class235(var10, var12);
            }
            this.field267 = null;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILga;Lya;)V")
    public static final void method168(int arg0, class279 arg1, class38 arg2) {
        field272++;
        if (class7.field80 == null) {
            return;
        }
        if (class172.field2549 < 10) {
            if (!class7.field81.method2559(class7.field80.field606, -83)) {
                class172.field2549 = class373.field5555.method2543(class7.field80.field606, (byte) 34) / 10;
                return;
            }
            class333.method2102(25374);
            class172.field2549 = 10;
        }
        int var3 = 104 / ((32 - arg0) / 34);
        if (class172.field2549 == 10) {
            class7.field103 = class7.field80.field604 >> 6 << 6;
            class7.field106 = class7.field80.field621 >> 6 << 6;
            class7.field108 = (class7.field80.field617 >> 6 << 6) + 64 - class7.field106;
            class7.field104 = (class7.field80.field622 >> 6 << 6) + 64 - class7.field103;
            int[] var4 = new int[3];
            int var5 = -1;
            int var6 = -1;
            if (class7.field80.method480(class398.field5947.field5826, 16542, var4, (class398.field5947.field5833 >> 7) + class176.field2613, (class398.field5947.field5837 >> 7) + class390.field5842)) {
                var6 = var4[2] - class7.field103;
                var5 = var4[1] - class7.field106;
            }
            if (!class320.field4816 && var5 >= 0 && class7.field108 > var5 && var6 >= 0 && var6 < class7.field104) {
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var8 = var6 + (int) (Math.random() * 10.0D) - 5;
                class319.field4810 = var8;
                class136.field2074 = var7;
            } else if (class203.field3373 == -1 || class36.field430 == -1) {
                class7.field80.method478(class7.field80.field607 & 0x3FFF, var4, (class7.field80.field607 & 0xFFFDF51) >> 14, (byte) 21);
                class319.field4810 = var4[2] - class7.field103;
                class136.field2074 = var4[1] - class7.field106;
            } else {
                class7.field80.method478(class36.field430, var4, class203.field3373, (byte) 21);
                if (var4 != null) {
                    class319.field4810 = var4[2] - class7.field103;
                    class136.field2074 = var4[1] - class7.field106;
                }
                class320.field4816 = false;
                class36.field430 = -1;
                class203.field3373 = -1;
            }
            if (class7.field80.field605 == 37) {
                class7.field91 = 3.0F;
                class7.field92 = 3.0F;
            } else if (class7.field80.field605 == 50) {
                class7.field91 = 4.0F;
                class7.field92 = 4.0F;
            } else if (class7.field80.field605 == 75) {
                class7.field91 = 6.0F;
                class7.field92 = 6.0F;
            } else if (class7.field80.field605 == 100) {
                class7.field91 = 8.0F;
                class7.field92 = 8.0F;
            } else if (class7.field80.field605 == 200) {
                class7.field91 = 16.0F;
                class7.field92 = 16.0F;
            } else {
                class7.field91 = 8.0F;
                class7.field92 = 8.0F;
            }
            class7.field90 = (int) class7.field91 >> 1;
            class7.field87 = class110.method842(class7.field90, (byte) -1);
            class233.method1632(-1);
            class7.method46();
            class34.field394 = new class137();
            class7.field85 += (int) (Math.random() * 5.0D) - 2;
            if (class7.field85 < -8) {
                class7.field85 = -8;
            }
            if (class7.field85 > 8) {
                class7.field85 = 8;
            }
            class7.field83 += (int) (Math.random() * 5.0D) - 2;
            if (class7.field83 < -16) {
                class7.field83 = -16;
            }
            if (class7.field83 > 16) {
                class7.field83 = 16;
            }
            class7.method57(arg1, class7.field85 >> 2 << 10, class7.field83 >> 1);
            class7.field75.method3072(false, 256, 1024);
            class7.field74.method1056(256, 256, 5);
            class7.field77.method2977((byte) -44, 4096);
            class125.field1856.method1440(256, 1);
            class172.field2549 = 20;
        } else if (class172.field2549 == 20) {
            class293.method1907(0, true);
            class7.method38(arg2, class7.field85, class7.field83);
            class172.field2549 = 60;
            class293.method1907(0, true);
            class525.method3117((byte) -110);
        } else if (class172.field2549 == 60) {
            if (class7.field81.method2547(5, class7.field80.field606 + "_staticelements")) {
                if (!class7.field81.method2559(class7.field80.field606 + "_staticelements", 120)) {
                    return;
                }
                class7.field86 = class183.method1219(class7.field81, class7.field80.field606 + "_staticelements", class531.field7753, 0);
            } else {
                class7.field86 = new class149(0);
            }
            class7.method39();
            class172.field2549 = 70;
            class293.method1907(0, true);
            class525.method3117((byte) -110);
        } else if (class172.field2549 == 70) {
            class262.field4018 = new class205(arg2, 11, true, class111.field1557);
            class172.field2549 = 73;
            class293.method1907(0, true);
            class525.method3117((byte) -110);
        } else if (class172.field2549 == 73) {
            class497.field7148 = new class205(arg2, 12, true, class111.field1557);
            class172.field2549 = 76;
            class293.method1907(0, true);
            class525.method3117((byte) -110);
        } else if (class172.field2549 == 76) {
            class181.field2718 = new class205(arg2, 14, true, class111.field1557);
            class172.field2549 = 79;
            class293.method1907(0, true);
            class525.method3117((byte) -110);
        } else if (class172.field2549 == 79) {
            class266.field4074 = new class205(arg2, 17, true, class111.field1557);
            class172.field2549 = 82;
            class293.method1907(0, true);
            class525.method3117((byte) -110);
        } else if (class172.field2549 == 82) {
            class487.field7008 = new class205(arg2, 19, true, class111.field1557);
            class172.field2549 = 85;
            class293.method1907(0, true);
            class525.method3117((byte) -110);
        } else if (class172.field2549 == 85) {
            class514.field7473 = new class205(arg2, 22, true, class111.field1557);
            class172.field2549 = 88;
            class293.method1907(0, true);
            class525.method3117((byte) -110);
        } else if (class172.field2549 == 88) {
            class298.field4533 = new class205(arg2, 26, true, class111.field1557);
            class172.field2549 = 91;
            class293.method1907(0, true);
            class525.method3117((byte) -110);
        } else {
            class217.field3577 = new class205(arg2, 30, true, class111.field1557);
            class172.field2549 = 100;
            class293.method1907(0, true);
            class525.method3117((byte) -110);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
    public static void method169(int arg0) {
        field273 = null;
        if (arg0 > 70) {
            field276 = null;
            field277 = null;
            field275 = null;
            field271 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(I)V")
    public class22(int arg0) {
        this.field266 = arg0;
    }
}
