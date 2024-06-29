import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class107 extends class170 {

    @OriginalMember(owner = "client!td", name = "G", descriptor = "Z")
    public boolean field1510 = true;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "Lka;")
    public static class408 field1516 = new class408(64);

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "Lhc;")
    public static class368 field1518;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "Z")
    public static boolean field1521;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "[I")
    private int[] field1507;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "[I")
    public int[] field1508;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field1502;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "[[I")
    private int[][] field1517;

    static {
        new class368((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        field1519 = 0;
        field1518 = new class368("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");
        new class368("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field1521 = true;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLvg;)V", line = 12)
    public static final void method808(byte arg0, class108 arg1) {
        field1506++;
        if (!class213.field2980) {
            return;
        }
        class369.field5109++;
        class88.field1232.method1151(34, (byte) -99);
        if (arg0 != 60) {
            field1518 = null;
        }
        class88.field1232.method2261(arg1.field1631, -176);
        class88.field1232.method2286(arg1.field1575, arg0 ^ 0xFFFFFF83);
        class88.field1232.method2267(class34.field467, (byte) -103);
        class88.field1232.method2267(arg1.field1647, (byte) -103);
        class88.field1232.method2261(class217.field3045, arg0 ^ 0xFFFFFF6C);
        class88.field1232.method2267(class266.field3633, (byte) -103);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([IILrg;)V", line = 33)
    public final void method809(int[] arg0, int arg1, class366 arg2) {
        field1500++;
        if (arg1 != -1 || this.field1507 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field1507.length; var4++) {
            if (var4 >= arg0.length) {
                return;
            }
            int var5 = class141.field2070[this.method817(var4, (byte) 103)];
            if (var5 > 0) {
                arg2.method2298((byte) -70, var5, (long) arg0[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lrg;B)Ljava/lang/String;", line = 65)
    public final String method810(class366 arg0, byte arg1) {
        field1505++;
        if (arg1 > -6) {
            field1519 = 109;
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field1507 != null) {
            for (int var4 = 0; var4 < this.field1507.length; var4++) {
                var3.append(this.field1502[var4]);
                var3.append(class46.method382(this.field1507[var4], arg0.method2268(class323.field4380[this.field1507[var4]], -1), this.field1517[var4], 13564));
            }
        }
        var3.append(this.field1502[this.field1502.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lrg;BI)V", line = 94)
    private final void method811(class366 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field1502 = class6.method27((byte) 91, arg0.method2255(-32226), '<');
        } else if (arg2 == 2) {
            int var4 = arg0.method2306((byte) 63);
            this.field1508 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1508[var5] = arg0.method2297(13352);
            }
        } else if (arg2 == 3) {
            int var6 = arg0.method2306((byte) 26);
            this.field1517 = new int[var6][];
            this.field1507 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method2297(13352);
                this.field1507[var7] = var8;
                this.field1517[var7] = new int[class369.field5115[var8]];
                for (int var9 = 0; var9 < class369.field5115[var8]; var9++) {
                    this.field1517[var7][var9] = arg0.method2297(13352);
                }
            }
        } else if (arg2 == 4) {
            this.field1510 = false;
        }
        int var10 = -11 % ((arg1 + 6) / 46);
        field1515++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I", line = 161)
    public final int method812(int arg0, int arg1, int arg2) {
        field1503++;
        if (this.field1507 == null || arg2 < 0 || arg2 > this.field1507.length) {
            return -1;
        } else if (this.field1517[arg2] == null || arg1 < 0 || this.field1517[arg2].length < arg1) {
            return -1;
        } else {
            if (arg0 != -1) {
                this.method816(false);
            }
            return this.field1517[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Lrg;B)V", line = 180)
    public final void method813(class366 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2306((byte) 83);
            if (var3 == 0) {
                field1514++;
                if (arg1 >= -93) {
                    this.method810((class366) null, (byte) 12);
                    return;
                }
                return;
            }
            this.method811(arg0, (byte) 114, var3);
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V", line = 204)
    public final void method814(byte arg0) {
        field1513++;
        int var2 = 32 / ((54 - arg0) / 54);
        if (this.field1508 != null) {
            for (int var3 = 0; var3 < this.field1508.length; var3++) {
                this.field1508[var3] = class431.method2655(this.field1508[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 223)
    public static final int method815(String arg0, byte arg1) {
        field1501++;
        int var2 = 0;
        int var3 = 37 % ((arg1 + 27) / 37);
        while (var2 < class310.field4210.length) {
            if (class310.field4210[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)I", line = 244)
    public final int method816(boolean arg0) {
        field1511++;
        if (this.field1507 == null) {
            return 0;
        } else if (arg0) {
            return 118;
        } else {
            return this.field1507.length;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(IB)I", line = 266)
    public final int method817(int arg0, byte arg1) {
        int var3 = -105 / ((55 - arg1) / 44);
        field1509++;
        return this.field1507 == null || arg0 < 0 || arg0 > this.field1507.length ? -1 : this.field1507[arg0];
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(Z)V", line = 279)
    public static final void method818(boolean arg0) {
        class43.method372((byte) 75);
        field1504++;
        class451.field6493 = null;
        class144.field2108 = null;
        class22.field285 = null;
        class18.field244 = null;
        class389.field5423 = null;
        if (!arg0) {
            field1516 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V", line = 297)
    public static void method819(int arg0) {
        if (arg0 != -1) {
            field1519 = -60;
        }
        field1518 = null;
        field1516 = null;
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)Ljava/lang/String;", line = 315)
    public final String method820(int arg0) {
        field1512++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field1502 == null) {
            return "";
        }
        var2.append(this.field1502[arg0]);
        for (int var3 = 1; var3 < this.field1502.length; var3++) {
            var2.append("...");
            var2.append(this.field1502[var3]);
        }
        return var2.toString();
    }
}
