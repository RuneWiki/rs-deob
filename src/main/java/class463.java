import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class463 extends class550 {

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    private int field6683;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    private int field6685;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    private int field6697;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    private int field6693;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    private int field6694;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    private int field6682;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    private int field6687;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    private int field6688;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "Lnj;")
    public static class487 field6689 = new class487("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "F")
    public static float field6698;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "Lra;")
    public static class262 field6700;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "Ldda;")
    public static class597 field6690;

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field6683 = arg2;
        this.field6685 = arg3;
        this.field6697 = arg6;
        this.field6693 = arg5;
        this.field6694 = arg1;
        this.field6682 = arg7;
        this.field6687 = arg4;
        this.field6688 = arg0;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static void method2746(int arg0) {
        field6690 = null;
        field6700 = null;
        field6689 = null;
        if (arg0 != -13) {
            method2746(24);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)[Lrb;")
    public static final class352[] method2747(boolean arg0) {
        if (arg0) {
            method2750(98, -7);
        }
        ++field6699;
        return new class352[] { class410.field5855, class196.field2961, class646.field9379, class150.field1927, class425.field6067, class632.field9235, class441.field6454, class73.field844, class459.field6655, class637.field9272, class103.field1308, class349.field5067, class433.field6347, class111.field1407 };
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZBII)V")
    public static final void method2748(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        ++field6695;
        if (arg2 <= 122) {
            field6698 = 0.5374104F;
        }
        class588.field8726 = 0L;
        int var5 = class608.method3540(122);
        if (~arg4 == -4 || var5 == 3) {
            arg1 = true;
        }
        if (!class379.field5558.method986()) {
            arg1 = true;
        }
        class552.method3228((byte) -55, arg3, arg4, arg1, arg0, var5);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V")
    public static final void method2749(int arg0, int arg1) {
        ++field6691;
        if (~class192.field2903 != ~arg1) {
            if (class192.field2903 == 0) {
                class491.method2973((byte) -127);
            }
            if (~arg1 == -13) {
                if (class36.field420 != null) {
                    class109.method649(class621.field9066, 35);
                } else {
                    class195.method1256(class451.field6590, class621.field9066, (byte) 126, class227.field3343);
                }
            }
            if (~arg1 != -13 && class349.field5066 != null) {
                class349.field5066.method1247((byte) 61);
                class349.field5066 = null;
            }
            if (~arg1 == -3) {
                class384.method2329(class600.field8841 != class540.field8007, 128);
            }
            if (~arg1 == -7) {
                class444.method2701((byte) 64, ~class540.field8007 != ~class53.field635);
            }
            if (arg0 == 1) {
                if (arg1 != 4) {
                    if (~arg1 == -6) {
                        if (class36.field420 != null) {
                            class109.method649(class621.field9066, 35);
                        } else {
                            class195.method1256(class451.field6590, class621.field9066, (byte) 119, class227.field3343);
                        }
                    } else if (~arg1 == -9) {
                        if (class36.field420 == null) {
                            class195.method1256(class451.field6590, class621.field9066, (byte) 115, class227.field3343);
                        } else {
                            class109.method649(class621.field9066, 35);
                        }
                    } else if (arg1 == 11) {
                        if (class36.field420 == null) {
                            class242.method1561(class227.field3343, class451.field6590, (byte) -12);
                        } else {
                            class426.method2520((byte) 98);
                        }
                    }
                } else if (class36.field420 == null) {
                    class242.method1561(class227.field3343, class451.field6590, (byte) -12);
                } else {
                    class426.method2520((byte) -66);
                }
                if (class444.method2698(7, class192.field2903)) {
                    class635.field9258.field8794 = 2;
                    class644.field9340.field8794 = 2;
                    class637.field9274.field8794 = 2;
                    class89.field1139.field8794 = 2;
                    class549.field8190.field8794 = 2;
                    class292.field4288.field8794 = 2;
                    class379.field5557.field8794 = 2;
                }
                if (class444.method2698(7, arg1)) {
                    class103.field1307 = 1;
                    class167.field2265 = 1;
                    class608.field8960 = 0;
                    class63.field736 = 0;
                    class200.field2996 = 0;
                    class186.method1221(-1, true);
                    class635.field9258.field8794 = 1;
                    class644.field9340.field8794 = 1;
                    class637.field9274.field8794 = 1;
                    class89.field1139.field8794 = 1;
                    class549.field8190.field8794 = 1;
                    class292.field4288.field8794 = 1;
                    class379.field5557.field8794 = 1;
                }
                if (arg1 == 10 || ~arg1 == -3) {
                    class591.method3441(-112);
                }
                if (~arg1 != -2) {
                    class130.method807((byte) 88);
                } else {
                    class15.method70(class371.field5368, class379.field5558, 2);
                }
                boolean var2 = ~arg1 == -2 || class152.method894(arg1, 1) || class242.method1563((byte) 116, arg1);
                boolean var3 = ~class192.field2903 == -2 || class152.method894(class192.field2903, 1) || class242.method1563((byte) 120, class192.field2903);
                if (var2 == !var3) {
                    if (!var2) {
                        class341.method2116(119, 2);
                        class80.field919.method2195(arg0 ^ 1, true);
                    } else {
                        class17.field155 = class384.field5626;
                        if (class94.field1158.field280 != 0) {
                            class130.method804(class384.field5626, 1, class94.field1158.field280, 0, class524.field7765, 2, false);
                        } else {
                            class341.method2116(125, 2);
                        }
                        class80.field919.method2195(0, false);
                    }
                }
                if (class444.method2698(arg0 ^ 6, arg1) || ~arg1 == -13) {
                    class379.field5558.method286();
                }
                class192.field2903 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZII)V")
    public final void method647(boolean arg0, int arg1, int arg2) {
        ++field6684;
        int var4 = this.field6688 * arg1 >> 12;
        int var5 = this.field6694 * arg2 >> 12;
        int var6 = this.field6683 * arg1 >> 12;
        if (arg0) {
            this.field6688 = -70;
        }
        int var7 = this.field6685 * arg2 >> 12;
        int var8 = this.field6687 * arg1 >> 12;
        int var9 = this.field6693 * arg2 >> 12;
        int var10 = this.field6697 * arg1 >> 12;
        int var11 = this.field6682 * arg2 >> 12;
        class487.method2951(var8, var7, var4, var11, true, super.field8195, var6, var10, var5, var9);
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(IBI)V")
    public final void method646(int arg0, byte arg1, int arg2) {
        int var4 = 78 % ((arg1 - 62) / 38);
        ++field6692;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBI)V")
    public final void method648(int arg0, byte arg1, int arg2) {
        ++field6686;
        if (arg1 >= -25) {
            method2746(-128);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)Lae;")
    public static final class40 method2750(int arg0, int arg1) {
        ++field6696;
        if (arg1 > -86) {
            method2750(56, 34);
        }
        class40[] var2 = class136.method837(-5217);
        for (int var3 = 0; ~var2.length < ~var3; ++var3) {
            class40 var4 = var2[var3];
            if (var4.field445 == arg0) {
                return var4;
            }
        }
        return null;
    }

    static {
        new class487("Player ", "Spieler ", "Joueur ", "Jogador ");
        new class487("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        new class487("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        new class487("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
    }
}
