import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class116 {

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public int field1775 = -1;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "[I")
    public static int[] field1795;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "Lsj;")
    public static class511 field1781;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Lvg;")
    private class56 field1777;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Ljava/lang/String;")
    private String field1784;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "Ljava/lang/String;")
    private String field1787;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "[I")
    private int[] field1773;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "[I")
    private int[] field1778;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "[I")
    private int[] field1779;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "[I")
    private int[] field1780;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "[I")
    private int[] field1783;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "[I")
    private int[] field1786;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "[I")
    private int[] field1790;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "[I")
    private int[] field1794;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "[Ljava/lang/String;")
    private String[] field1789;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "[Ljava/lang/String;")
    private String[] field1792;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "[[I")
    private int[][] field1776;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "[[I")
    private int[][] field1791;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "[[I")
    private int[][] field1796;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method881(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -26845) {
            method881(null, -30, -36, -7);
        }
        field1793++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        int var6 = arg2 + arg3;
        for (int var7 = arg2; var7 < var6; var7++) {
            int var8 = arg0[var7] & 0xFF;
            if (var8 < 128) {
                var4[var5++] = (char) var8;
            } else if (var8 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
            } else if (var8 < 224) {
                if (var6 <= (var7 + 1)) {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
                var7++;
                int var9 = arg0[var7] & 0xFF;
                if (var9 < 128 || var9 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class19.method118(class307.method2028(var9, -129), class307.method2028(var8 << 6, -12352));
            } else if (var8 < 240) {
                if (var7 + 2 >= var6) {
                    throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                }
                var7++;
                int var10 = arg0[var7] & 0xFF;
                if (var10 >= 128 && var10 <= 191) {
                    var7++;
                    int var11 = arg0[var7] & 0xFF;
                    if (var11 >= 128 && var11 <= 191) {
                        var4[var5++] = (char) class19.method118(class19.method118(class307.method2028(var8 << 12, -921600), class307.method2028(var10, -129) << 6), class307.method2028(var11, -129));
                        continue;
                    }
                    throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                }
                throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
            } else if (var8 >= 244) {
                throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
            } else {
                throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public final void method882(int arg0) {
        if (arg0 <= -60) {
            if (this.field1784 == null) {
                this.field1784 = this.field1787;
            }
            field1788++;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lfh;I)V")
    public final void method883(class194 arg0, int arg1) {
        if (arg1 != -1160) {
            this.method884((byte) -102, null, -120);
        }
        field1774++;
        while (true) {
            int var3 = arg0.method1337((byte) 79);
            if (var3 == 0) {
                return;
            }
            this.method884((byte) -70, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLfh;I)V")
    private final void method884(byte arg0, class194 arg1, int arg2) {
        if (arg0 != -70) {
            this.field1786 = null;
        }
        if (arg2 == 1) {
            this.field1787 = arg1.method1399((byte) 83);
        } else if (arg2 == 2) {
            this.field1784 = arg1.method1399((byte) 95);
        } else if (arg2 == 3) {
            int var4 = arg1.method1337((byte) 4);
            this.field1796 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1796[var5][0] = arg1.method1396(class232.method1566(arg0, 30));
                this.field1796[var5][1] = arg1.method1401(122);
                this.field1796[var5][2] = arg1.method1401(122);
            }
        } else if (arg2 == 4) {
            int var6 = arg1.method1337((byte) -112);
            this.field1791 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1791[var7][0] = arg1.method1396(-116);
                this.field1791[var7][1] = arg1.method1401(125);
                this.field1791[var7][2] = arg1.method1401(-102);
            }
        } else if (arg2 == 5) {
            arg1.method1396(arg0 - 32);
        } else if (arg2 == 6) {
            arg1.method1337((byte) -121);
        } else if (arg2 == 7) {
            arg1.method1337((byte) -109);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method1337((byte) -116);
            } else if (arg2 == 10) {
                int var22 = arg1.method1337((byte) -110);
                this.field1779 = new int[var22];
                for (int var23 = 0; var23 < var22; var23++) {
                    this.field1779[var23] = arg1.method1401(123);
                }
            } else if (arg2 == 12) {
                arg1.method1401(125);
            } else if (arg2 == 13) {
                int var20 = arg1.method1337((byte) 3);
                this.field1780 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field1780[var21] = arg1.method1396(arg0 - 51);
                }
            } else if (arg2 == 14) {
                int var18 = arg1.method1337((byte) 87);
                this.field1776 = new int[var18][2];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field1776[var19][0] = arg1.method1337((byte) -114);
                    this.field1776[var19][1] = arg1.method1337((byte) 122);
                }
            } else if (arg2 == 15) {
                arg1.method1396(-119);
            } else if (arg2 == 17) {
                this.field1775 = arg1.method1396(-93);
            } else if (arg2 == 18) {
                int var8 = arg1.method1337((byte) 80);
                this.field1778 = new int[var8];
                this.field1773 = new int[var8];
                this.field1790 = new int[var8];
                this.field1789 = new String[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field1778[var9] = arg1.method1401(126);
                    this.field1790[var9] = arg1.method1401(-45);
                    this.field1773[var9] = arg1.method1401(123);
                    this.field1789[var9] = arg1.method1347(arg0 - 55);
                }
            } else if (arg2 == 19) {
                int var10 = arg1.method1337((byte) 35);
                this.field1783 = new int[var10];
                this.field1792 = new String[var10];
                this.field1786 = new int[var10];
                this.field1794 = new int[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field1786[var11] = arg1.method1401(-19);
                    this.field1794[var11] = arg1.method1401(class232.method1566(arg0, 120));
                    this.field1783[var11] = arg1.method1401(arg0 + 194);
                    this.field1792[var11] = arg1.method1347(-87);
                }
            } else if (arg2 == 249) {
                int var12 = arg1.method1337((byte) 7);
                if (this.field1777 == null) {
                    int var13 = class46.method307((byte) 115, var12);
                    this.field1777 = new class56(var13);
                }
                for (int var14 = 0; var14 < var12; var14++) {
                    boolean var15 = arg1.method1337((byte) 31) == 1;
                    int var16 = arg1.method1339(-32768);
                    class130 var17;
                    if (var15) {
                        var17 = new class109(arg1.method1347(-106));
                    } else {
                        var17 = new class50(arg1.method1401(124));
                    }
                    this.field1777.method357(var17, 1, (long) var16);
                }
            }
        }
        field1782++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V")
    public static void method885(boolean arg0) {
        field1795 = null;
        if (!arg0) {
            method881(null, -46, -75, 86);
        }
        field1781 = null;
    }

    static {
        new class179("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field1795 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };
    }
}
