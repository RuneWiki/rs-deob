import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class46 {

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "Ljava/lang/String;")
    private String field678 = "null";

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "Lvj;")
    public static class304 field680 = new class304("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "[F")
    public static float[] field696 = new float[4];

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "C")
    public char field679;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "C")
    public char field684;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    private int field681;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "Lub;")
    public class18 field687;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "Lub;")
    private class18 field690;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)I")
    public final int method323(int arg0, int arg1) {
        field694++;
        if (this.field687 == null) {
            return this.field681;
        } else {
            int var3 = -95 % ((arg0 - 48) / 49);
            class387 var4 = (class387) this.field687.method182((long) arg1, (byte) 125);
            return var4 == null ? this.field681 : var4.field5264;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
    private final void method324(int arg0) {
        field689++;
        this.field690 = new class18(this.field687.method183((byte) 96));
        for (class387 var2 = (class387) this.field687.method181((byte) -70); var2 != null; var2 = (class387) this.field687.method179(arg0 ^ 0x1)) {
            class387 var3 = new class387((int) var2.field622);
            this.field690.method173((long) var2.field5264, var3, (byte) 103);
        }
        if (arg0 != 0) {
            this.field679 = (char) 65478;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method325(String arg0, int arg1) {
        field688++;
        if (this.field687 == null) {
            return false;
        }
        if (this.field690 == null) {
            this.method330(false);
        }
        for (class391 var3 = (class391) this.field690.method182(class423.method2438(arg0, arg1 ^ 0xFFFFFF92), (byte) 91); var3 != null; var3 = (class391) this.field690.method177(false)) {
            if (var3.field5299.equals(arg0)) {
                return true;
            }
        }
        return arg1 == 0 ? false : false;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method326(int arg0, int arg1) {
        if (arg1 != -2) {
            this.field678 = null;
        }
        field692++;
        if (this.field687 == null) {
            return this.field678;
        } else {
            class494 var3 = (class494) this.field687.method182((long) arg0, (byte) 109);
            return var3 == null ? this.field678 : var3.field6857;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lmd;I)V")
    public final void method327(class379 arg0, int arg1) {
        int var3 = 84 / ((-arg1 - 16) / 63);
        field685++;
        while (true) {
            int var4 = arg0.method2238(255);
            if (var4 == 0) {
                return;
            }
            this.method331((byte) -101, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI[Lcr;)V")
    public static final void method328(byte arg0, int arg1, class403[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class403 var4 = arg2[var3];
            if (var4 != null && var4.field5517 == arg1 && !client.method1274(var4)) {
                if (var4.field5480 == 0) {
                    method328((byte) -50, var4.field5431, arg2);
                    if (var4.field5420 != null) {
                        method328((byte) -50, var4.field5431, var4.field5420);
                    }
                    class301 var5 = (class301) class27.field457.method182((long) var4.field5431, (byte) 119);
                    if (var5 != null) {
                        class130.method928(var5.field3982, arg0 ^ 0x31);
                    }
                }
                if (var4.field5480 == 6 && var4.field5415 != -1) {
                    class5 var6 = class423.field5791.method1601(var4.field5415, (byte) -118);
                    if (var6 != null) {
                        var4.field5477 += class128.field1871;
                        while (var6.field127[var4.field5543] < var4.field5477) {
                            var4.field5477 -= var6.field127[var4.field5543];
                            var4.field5543++;
                            if (var4.field5543 >= var6.field129.length) {
                                var4.field5543 -= var6.field125;
                                if (var4.field5543 < 0 || var4.field5543 >= var6.field129.length) {
                                    var4.field5543 = 0;
                                }
                            }
                            var4.field5484 = var4.field5543 + 1;
                            if (var4.field5484 >= var6.field129.length) {
                                var4.field5484 -= var6.field125;
                                if (var4.field5484 < 0 || var4.field5484 >= var6.field129.length) {
                                    var4.field5484 = -1;
                                }
                            }
                            class412.method2378(var4, (byte) -113);
                        }
                    }
                }
            }
        }
        if (arg0 != -50) {
            field680 = null;
        }
        field686++;
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(II)Z")
    public final boolean method329(int arg0, int arg1) {
        field695++;
        if (this.field687 == null) {
            return false;
        }
        if (this.field690 == null) {
            this.method324(0);
        }
        if (arg0 != 25782) {
            field682 = -85;
        }
        class387 var3 = (class387) this.field690.method182((long) arg1, (byte) 99);
        return var3 != null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
    private final void method330(boolean arg0) {
        this.field690 = new class18(this.field687.method183((byte) 96));
        field683++;
        if (arg0) {
            this.field679 = (char) 65430;
        }
        for (class494 var2 = (class494) this.field687.method181((byte) -70); var2 != null; var2 = (class494) this.field687.method179(1)) {
            class391 var3 = new class391(var2.field6857, (int) var2.field622);
            this.field690.method173(class423.method2438(var2.field6857, 66), var3, (byte) 108);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLmd;I)V")
    private final void method331(byte arg0, class379 arg1, int arg2) {
        if (arg2 == 1) {
            this.field679 = class237.method1471(5728, arg1.method2194(-1));
        } else if (arg2 == 2) {
            this.field684 = class237.method1471(5728, arg1.method2194(-1));
        } else if (arg2 == 3) {
            this.field678 = arg1.method2218(-87);
        } else if (arg2 == 4) {
            this.field681 = arg1.method2232((byte) 124);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method2212((byte) 83);
            this.field687 = new class18(class321.method1857((byte) 113, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2232((byte) 124);
                class42 var7;
                if (arg2 == 5) {
                    var7 = new class494(arg1.method2218(126));
                } else {
                    var7 = new class387(arg1.method2232((byte) 126));
                }
                this.field687.method173((long) var6, var7, (byte) 109);
            }
        }
        int var8 = 56 / ((arg0 + 39) / 41);
        field691++;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
    public static void method332(int arg0) {
        if (arg0 != -1) {
            field696 = null;
        }
        field696 = null;
        field680 = null;
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)V")
    public static final void method333(int arg0) {
        field693++;
        class141.field2047 = new class39(class119.field1741.method1764(class489.field6789, false), "", class16.field285, 1010, arg0, 0L, 0, 0, true, false);
    }

    static {
        new class304(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
    }
}
