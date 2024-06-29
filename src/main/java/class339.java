import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class339 {

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5232;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5229;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "Luv;")
    public static class2 field5233;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public int field5224;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public int field5225;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public int field5231;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZILjava/lang/String;[BII)I")
    public static final int method2069(boolean arg0, int arg1, String arg2, byte[] arg3, int arg4, int arg5) {
        field5226++;
        int var6 = arg4 - arg5;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg2.charAt(arg5 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg3[arg1 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg3[arg1 + var7] = -128;
            } else if (var8 == '‚') {
                arg3[arg1 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg3[arg1 + var7] = -125;
            } else if (var8 == '„') {
                arg3[arg1 + var7] = -124;
            } else if (var8 == '…') {
                arg3[arg1 + var7] = -123;
            } else if (var8 == '†') {
                arg3[arg1 + var7] = -122;
            } else if (var8 == '‡') {
                arg3[arg1 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg3[arg1 + var7] = -120;
            } else if (var8 == '‰') {
                arg3[arg1 + var7] = -119;
            } else if (var8 == 'Š') {
                arg3[arg1 + var7] = -118;
            } else if (var8 == '‹') {
                arg3[arg1 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg3[arg1 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg3[arg1 + var7] = -114;
            } else if (var8 == '‘') {
                arg3[arg1 + var7] = -111;
            } else if (var8 == '’') {
                arg3[arg1 + var7] = -110;
            } else if (var8 == '“') {
                arg3[arg1 + var7] = -109;
            } else if (var8 == '”') {
                arg3[arg1 + var7] = -108;
            } else if (var8 == '•') {
                arg3[arg1 + var7] = -107;
            } else if (var8 == '–') {
                arg3[arg1 + var7] = -106;
            } else if (var8 == '—') {
                arg3[arg1 + var7] = -105;
            } else if (var8 == '˜') {
                arg3[arg1 + var7] = -104;
            } else if (var8 == '™') {
                arg3[arg1 + var7] = -103;
            } else if (var8 == 'š') {
                arg3[arg1 + var7] = -102;
            } else if (var8 == '›') {
                arg3[arg1 + var7] = -101;
            } else if (var8 == 'œ') {
                arg3[arg1 + var7] = -100;
            } else if (var8 == 'ž') {
                arg3[arg1 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg3[arg1 + var7] = -97;
            } else {
                arg3[arg1 + var7] = 63;
            }
        }
        if (!arg0) {
            method2073(-30, -31);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)V")
    public static void method2070(boolean arg0) {
        field5233 = null;
        field5232 = null;
        field5229 = null;
        if (!arg0) {
            method2069(false, 22, null, null, 2, 105);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "([Lgo;II)V")
    public static final void method2071(class310[] arg0, int arg1, int arg2) {
        field5227++;
        if (arg1 != 3747) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class310 var4 = arg0[var3];
            if (var4 != null && var4.field4753 == arg2 && !client.method3031(var4)) {
                if (var4.field4703 == 0) {
                    method2071(arg0, 3747, var4.field4643);
                    if (var4.field4788 != null) {
                        method2071(var4.field4788, 3747, var4.field4643);
                    }
                    class313 var5 = (class313) class312.field4840.method3059(48, (long) var4.field4643);
                    if (var5 != null) {
                        class11.method133(true, var5.field4852);
                    }
                }
                if (var4.field4703 == 6 && var4.field4772 != -1) {
                    class520 var6 = class510.field7490.method575(var4.field4772, -88);
                    if (var6 != null) {
                        var4.field4641 += class469.field6876;
                        while (var6.field7645[var4.field4710] < var4.field4641) {
                            var4.field4641 -= var6.field7645[var4.field4710];
                            var4.field4710++;
                            if (var6.field7630.length <= var4.field4710) {
                                var4.field4710 -= var6.field7632;
                                if (var4.field4710 < 0 || var6.field7630.length <= var4.field4710) {
                                    var4.field4710 = 0;
                                }
                            }
                            var4.field4739 = var4.field4710 + 1;
                            if (var4.field4739 >= var6.field7630.length) {
                                var4.field4739 -= var6.field7632;
                                if (var4.field4739 < 0 || var6.field7630.length <= var4.field4739) {
                                    var4.field4739 = -1;
                                }
                            }
                            class292.method1812(-14307, var4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZILgk;)V")
    private final void method2072(boolean arg0, int arg1, class468 arg2) {
        if (arg1 == 1) {
            this.field5231 = arg2.method2727((byte) 43);
            this.field5224 = arg2.method2765(106);
            this.field5225 = arg2.method2765(124);
        }
        field5228++;
        if (arg0) {
            this.field5224 = -120;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)V")
    public static final void method2073(int arg0, int arg1) {
        if (arg1 != 381) {
            method2075(107, -74);
        }
        field5230++;
        class30.field425 = -1;
        class9.field87 = -1;
        class170.field2508 = arg0;
        class239.method1468((byte) -94);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILgk;)V")
    public final void method2074(int arg0, class468 arg1) {
        field5234++;
        if (arg0 >= -84) {
            return;
        }
        while (true) {
            int var3 = arg1.method2765(109);
            if (var3 == 0) {
                return;
            }
            this.method2072(false, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)V")
    public static final void method2075(int arg0, int arg1) {
        if (arg0 != 11201) {
            method2069(true, 0, null, null, 51, 41);
        }
        field5235++;
        class350.field5385 = 1000 / arg1;
    }

    static {
        new class347("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field5232 = null;
        field5229 = new Rectangle[100];
        field5233 = new class2(51, 5);
        new class347("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
    }
}
