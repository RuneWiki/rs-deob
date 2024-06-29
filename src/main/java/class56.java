import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class56 {

    @OriginalMember(owner = "client!in", name = "q", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    private int field865;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public int field863;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "B")
    public byte field877;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Lin;")
    public class56 field859;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "Lwt;")
    public static class194 field879;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "Liu;")
    public static class390 field882;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public int field864;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public int field866;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public int field868;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public int field872;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    public int field874;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "Lus;")
    public static class1 field880;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "Lhe;")
    public static class239 field881;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "Lum;")
    public static class347 field883;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
    public static void method416(byte arg0) {
        field883 = null;
        field882 = null;
        field880 = null;
        field881 = null;
        if (arg0 != -90) {
            method419(74, true, 61);
        }
        field879 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIB)Lin;")
    public final class56 method417(int arg0, int arg1, int arg2, byte arg3) {
        field873++;
        return arg3 == -10 ? new class56(this.field865, arg1, arg2, arg0, this.field877) : null;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)Lou;")
    public final class412 method418(byte arg0) {
        field878++;
        if (arg0 < 116) {
            this.field866 = -50;
        }
        return class337.method2041(this.field865, -27822);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZI)Z")
    public static final boolean method419(int arg0, boolean arg1, int arg2) {
        field871++;
        if (!class169.method1064(arg2, arg0, (byte) -77)) {
            return false;
        } else if ((arg2 & 0xB000) != 0 | class397.method2375(540800, arg0, arg2) | class294.method1778(arg0, arg2, (byte) -88)) {
            return true;
        } else if (arg1) {
            return (arg0 & 0x37) == 0 & (class235.method1430(true, arg0, arg2) | class318.method1914(arg2, arg0, (byte) -69));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)V")
    public static final void method420(int arg0, int arg1, int arg2) {
        field869++;
        class338 var3 = class380.method2294((byte) 100, arg2, 7);
        var3.method2052((byte) -63);
        if (arg0 <= 16) {
            field882 = null;
        }
        var3.field4930 = arg1;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZLcu;)V")
    public static final void method421(int arg0, boolean arg1, class139 arg2) {
        field867++;
        if (class383.field5696 >= 400) {
            return;
        }
        class272 var3 = arg2.field1825;
        int var4 = -45 % ((-arg0 - 19) / 57);
        if (var3.field3797 != null) {
            var3 = var3.method1656(class453.field6591, -65);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field3788) {
            return;
        }
        String var5 = var3.field3818;
        if (var3.field3811 != 0) {
            String var6 = class28.field486 == class156.field1996 ? class170.field2278.method1220(2969, class81.field1122) : class4.field66.method1220(2969, class81.field1122);
            var5 = var5 + class190.method1196(class415.field6145.field4576, (byte) -101, var3.field3811) + " (" + var6 + var3.field3811 + ")";
        }
        if (!class288.field4128) {
            if (!arg1) {
                String[] var7 = var3.field3803;
                if (class41.field624) {
                    var7 = class486.method2839(5, var7);
                }
                if (var7 != null) {
                    for (int var8 = 4; var8 >= 0; var8--) {
                        if (var7[var8] != null && (class459.field6684 != class156.field1996 || !var7[var8].equalsIgnoreCase(class271.field3783.method1220(2969, class81.field1122)))) {
                            byte var9 = 0;
                            int var10 = class187.field2656;
                            if (var8 == 0) {
                                var9 = 4;
                            }
                            if (var8 == 1) {
                                var9 = 59;
                            }
                            if (var8 == 2) {
                                var9 = 30;
                            }
                            if (var8 == 3) {
                                var9 = 13;
                            }
                            if (var8 == 4) {
                                var9 = 51;
                            }
                            if (var3.field3821 == var8) {
                                var10 = var3.field3798;
                            }
                            if (var3.field3837 == var8) {
                                var10 = var3.field3809;
                            }
                            class495.method2974(true, (long) arg2.field4262, var9, var7[var8], -1, 0, -1, "<col=ffff00>" + var5, 0, false, var10);
                            class105.field1411++;
                        }
                    }
                }
                if (class459.field6684 == class156.field1996 && var7 != null) {
                    for (int var11 = 4; var11 >= 0; var11--) {
                        if (var7[var11] != null && var7[var11].equalsIgnoreCase(class271.field3783.method1220(2969, class81.field1122))) {
                            short var12 = 0;
                            if (var3.field3811 > class415.field6145.field4576) {
                                var12 = 2000;
                            }
                            short var13 = 0;
                            if (var11 == 0) {
                                var13 = 4;
                            }
                            if (var11 == 1) {
                                var13 = 59;
                            }
                            if (var11 == 2) {
                                var13 = 30;
                            }
                            if (var11 == 3) {
                                var13 = 13;
                            }
                            if (var11 == 4) {
                                var13 = 51;
                            }
                            if (var13 != 0) {
                                var13 += var12;
                            }
                            class495.method2974(true, (long) arg2.field4262, var13, var7[var11], -1, 0, -1, "<col=ffff00>" + var5, 0, false, var3.field3825);
                            class342.field4965++;
                        }
                    }
                }
            }
            class258.field3699++;
            class495.method2974(true, (long) arg2.field4262, 1009, class64.field956.method1220(2969, class81.field1122), -1, 0, -1, "<col=ffff00>" + var5, 0, arg1, class232.field3237);
        } else if (!arg1) {
            class483 var14 = class450.field6554 == -1 ? null : class228.field3209.method1536((byte) -124, class450.field6554);
            if ((class278.field3963 & 0x2) != 0) {
                if (var14 == null || var3.method1658(-113, var14.field7000, class450.field6554) != var14.field7000) {
                    class495.method2974(true, (long) arg2.field4262, 20, class457.field6660, -1, 0, -1, class211.field2998 + " -> <col=ffff00>" + var5, 0, false, class272.field3802);
                    class92.field1253++;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(IIIIB)V")
    public class56(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field875 = arg2;
        this.field865 = arg0;
        this.field863 = arg1;
        this.field877 = arg4;
        this.field876 = arg3;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lin;I)V")
    public class56(class56 arg0, int arg1) {
        this.field859 = arg0;
        this.field863 = this.field859.field863 + arg1;
        this.field876 = this.field859.field876 + arg1;
        this.field865 = this.field859.field865;
        this.field875 = this.field859.field875 + arg1;
        this.field877 = this.field859.field877;
    }

    static {
        new class194("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field879 = new class194("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");
        field882 = new class390(25, 3);
    }
}
