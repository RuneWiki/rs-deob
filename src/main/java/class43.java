import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class43 extends class304 {

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field613 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!eg", name = "cb", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!eg", name = "eb", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!eg", name = "gb", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!eg", name = "hb", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "Lch;")
    public static class208 field607;

    @OriginalMember(owner = "client!eg", name = "fb", descriptor = "Lch;")
    public static class208 field620;

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "[I")
    public static int[] field615;

    @OriginalMember(owner = "client!eg", name = "db", descriptor = "[Laf;")
    public static class195[] field618;

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "[Lia;")
    private class268[] field614;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lwm;II)V", line = 4)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field614 = new class268[arg0.method1774((byte) -95)];
            for (int var4 = 0; var4 < this.field614.length; var4++) {
                int var5 = arg0.method1774((byte) 43);
                if (var5 == 0) {
                    this.field614[var4] = class204.method1472(arg0, (byte) 73);
                } else if (var5 == 1) {
                    this.field614[var4] = class218.method1557(arg0, (byte) -124);
                } else if (var5 == 2) {
                    this.field614[var4] = class212.method1517(7435, arg0);
                } else if (var5 == 3) {
                    this.field614[var4] = class206.method1485(-1122712439, arg0);
                }
            }
        } else if (arg1 == 1) {
            this.field4652 = arg0.method1774((byte) 26) == 1;
        }
        field609++;
        if (arg2 != -2828) {
            method334(true);
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)[[I", line = 82)
    public final int[][] method75(int arg0, int arg1) {
        field608++;
        if (arg1 != 0) {
            method333(-71);
        }
        int[][] var3 = this.field4663.method886(arg0, 3);
        if (this.field4663.field1820) {
            int var4 = class218.field3333;
            int var5 = class109.field1648;
            int[][][] var6 = this.field4663.method888((byte) -68);
            int[][] var7 = new int[var5][var4];
            this.method336(var7, arg1 ^ 0x7016);
            for (int var8 = 0; var8 < class109.field1648; var8++) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[1];
                int[] var12 = var10[2];
                int[] var13 = var10[0];
                for (int var14 = 0; var14 < class218.field3333; var14++) {
                    int var15 = var9[var14];
                    var12[var14] = class149.method1117(255, var15) << 4;
                    var11[var14] = class149.method1117(var15, 65280) >> 4;
                    var13[var14] = class149.method1117(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIILfc;Lfc;IIJ)V", line = 143)
    public static final void method331(int arg0, int arg1, int arg2, int arg3, class110 arg4, class110 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class35 var10 = new class35();
        var10.field512 = arg8;
        var10.field506 = arg1 * 128 + 64;
        var10.field516 = arg2 * 128 + 64;
        var10.field502 = arg3;
        var10.field511 = arg4;
        var10.field508 = arg5;
        var10.field503 = arg6;
        var10.field513 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class213.field3262[var11][arg1][arg2] == null) {
                class213.field3262[var11][arg1][arg2] = new class79(var11, arg1, arg2);
            }
        }
        class213.field3262[arg0][arg1][arg2].field1161 = var10;
    }

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)V", line = 172)
    public static final void method332(int arg0) {
        class67.field970 = 0;
        class110.field1668 = arg0;
        class111.method852(false);
        class121.method913(-18846);
        field611++;
        class331.method2307((byte) 122);
        class174.method1308((byte) 118);
        for (int var1 = 0; var1 < class110.field1668; var1++) {
            int var2 = class291.field4479[var1];
            if (class233.field3542 != class201.field3096[var2].field4711) {
                if (class201.field3096[var2].field4190 > 0) {
                    class273.method1902(class201.field3096[var2], -11210);
                }
                class201.field3096[var2] = null;
            }
        }
        if (class241.field3679 != class204.field3136.field3866) {
            throw new RuntimeException("gpp1 pos:" + class204.field3136.field3866 + " psize:" + class241.field3679);
        }
        for (int var3 = 0; var3 < class234.field3563; var3++) {
            if (class201.field3096[class291.field4475[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class234.field3563);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "(I)V", line = 221)
    public static final void method333(int arg0) {
        field621++;
        if (class250.field3778 != null) {
            class250.field3778.method2295((byte) -122);
        }
        if (class234.field3567 != null) {
            class234.field3567.method2295((byte) -120);
        }
        class47.method358(class318.field4915, 22050, 48000, 2);
        class250.field3778 = class132.method1026((byte) -92, arg0, class330.field5074, class102.field1480, 22050);
        class250.field3778.method2297((byte) 103, class263.field4054);
        class234.field3567 = class132.method1026((byte) -92, 1, class330.field5074, class102.field1480, 2048);
        class234.field3567.method2297((byte) -57, class322.field4961);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)V", line = 245)
    public static final void method334(boolean arg0) {
        field610++;
        if (!arg0) {
            field620 = (class208) null;
        }
        if (!class174.field2794 && class312.field4837 != 2) {
            try {
                class199.method1445(-34, "tbrefresh", class304.field4654);
            } catch (Throwable var2) {
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(Z)V", line = 265)
    public static void method335(boolean arg0) {
        field607 = null;
        field618 = null;
        field615 = null;
        if (arg0) {
            field620 = null;
            field613 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([[II)V", line = 283)
    private final void method336(int[][] arg0, int arg1) {
        field606++;
        int var3 = class218.field3333;
        int var4 = class109.field1648;
        class30.method228(arg0, arg1 - 45069);
        class144.method1092((byte) -116, class65.field941, class54.field721, 0, 0);
        if (arg1 != 28694) {
            method338(-92, (class254) null);
        }
        if (this.field614 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field614.length; var5++) {
            class268 var6 = this.field614[var5];
            int var7 = var6.field4170;
            int var8 = var6.field4173;
            if (var7 < 0) {
                if (var8 >= 0) {
                    var6.method406(var3, 219, var4);
                }
            } else if (var8 >= 0) {
                var6.method405(var4, var3, arg1 ^ 0x7049);
            } else {
                var6.method400(var3, arg1 ^ 0xFFFF8F90, var4);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)Ljava/lang/String;", line = 337)
    public static final String method337(int arg0, int arg1) {
        if (arg1 != -1434) {
            return (String) null;
        }
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        field617++;
        if (var2.length() <= 9) {
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class211.field3236 + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        } else {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class62.field834 + " (" + var2 + ")</col>";
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILwm;)Lfm;", line = 367)
    public static final class336 method338(int arg0, class254 arg1) {
        field616++;
        class336 var2 = new class336();
        var2.field5224 = arg1.method1755(false);
        int var3 = -51 / ((arg0 - 4) / 33);
        var2.field5233 = class181.method1354(var2.field5224, 76);
        return var2;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BIIII)Lpi;", line = 386)
    public static final class221 method339(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field619++;
        long var5 = ((long) arg4 & 0xFFFFL) << 16 | (long) arg2 & 0xFFFFL << 32 | (long) arg3 & 0xFFFFL << 48 | (long) arg1 & 0xFFFFL;
        class221 var7 = (class221) class71.field1021.method747(var5, (byte) 95);
        if (var7 != null) {
            return var7;
        }
        class107[] var8 = null;
        class189 var9 = class30.method230(arg0 + 1209, arg1);
        if (var9.field2968 != null) {
            var8 = new class107[var9.field2968.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class322 var11 = class110.method838(arg0 + 27383, var9.field2968[var10]);
                var8[var10] = new class107(var11.field4962, var11.field4972, var11.field4978, var11.field4977, var11.field4967, var11.field4973, var11.field4980, var11.field4975);
            }
        }
        if (arg0 == 85) {
            class221 var12 = new class221(var9.field2974, var8, var9.field2965, arg3, arg2, arg4);
            class71.field1021.method744(var12, -15692, var5);
            return var12;
        } else {
            return (class221) null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[I", line = 428)
    public final int[] method71(int arg0, int arg1) {
        if (arg0 != 7) {
            field605 = 73;
        }
        field612++;
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            this.method336(this.field4669.method2341((byte) -112), 28694);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 455)
    public class43() {
        super(0, true);
    }
}
