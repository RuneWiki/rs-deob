import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class120 {

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public int field1990 = -1;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Lsk;")
    public static class423 field1987 = new class423("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public static int field2000 = -1;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "[[I")
    public static int[][] field2002;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lke;")
    private class407 field1979;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Ljava/lang/String;")
    private String field1985;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "Ljava/lang/String;")
    private String field1999;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "[I")
    private int[] field1981;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "[I")
    private int[] field1982;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "[I")
    private int[] field1986;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "[I")
    private int[] field1991;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "[I")
    private int[] field1994;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "[I")
    private int[] field1995;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "[I")
    private int[] field1996;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "[I")
    private int[] field1998;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "[Ljava/lang/String;")
    private String[] field1984;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "[Ljava/lang/String;")
    private String[] field1997;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "[[I")
    private int[][] field1983;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "[[I")
    private int[][] field1988;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "[[I")
    private int[][] field1992;

    static {
        new class423("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field2002 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 37)
    public static void method834(int arg0) {
        field2002 = null;
        field1987 = null;
        if (arg0 != -16630) {
            field2000 = -22;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lha;I)V", line = 54)
    public final void method835(class40 arg0, int arg1) {
        if (arg1 != 11784) {
            this.method836(false);
        }
        field1993++;
        while (true) {
            int var3 = arg0.method257((byte) 118);
            if (var3 == 0) {
                return;
            }
            this.method837(arg0, var3, -10);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V", line = 83)
    public final void method836(boolean arg0) {
        field1980++;
        if (!arg0) {
            this.method835(null, 25);
        }
        if (this.field1985 == null) {
            this.field1985 = this.field1999;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lha;II)V", line = 104)
    private final void method837(class40 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1999 = arg0.method276(Integer.MAX_VALUE);
        } else if (arg1 == 2) {
            this.field1985 = arg0.method276(Integer.MAX_VALUE);
        } else if (arg1 == 3) {
            int var4 = arg0.method257((byte) 41);
            this.field1992 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1992[var5][0] = arg0.method254((byte) -66);
                this.field1992[var5][1] = arg0.method255((byte) 96);
                this.field1992[var5][2] = arg0.method255((byte) 96);
            }
        } else if (arg1 == 4) {
            int var6 = arg0.method257((byte) 108);
            this.field1983 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1983[var7][0] = arg0.method254((byte) -97);
                this.field1983[var7][1] = arg0.method255((byte) 96);
                this.field1983[var7][2] = arg0.method255((byte) 96);
            }
        } else if (arg1 == 5) {
            arg0.method254((byte) -117);
        } else if (arg1 == 6) {
            arg0.method257((byte) 73);
        } else if (arg1 == 7) {
            arg0.method257((byte) 34);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method257((byte) 91);
            } else if (arg1 == 10) {
                int var8 = arg0.method257((byte) 91);
                this.field1982 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field1982[var9] = arg0.method255((byte) 96);
                }
            } else if (arg1 == 12) {
                arg0.method255((byte) 96);
            } else if (arg1 == 13) {
                int var22 = arg0.method257((byte) 52);
                this.field1995 = new int[var22];
                for (int var23 = 0; var23 < var22; var23++) {
                    this.field1995[var23] = arg0.method254((byte) -117);
                }
            } else if (arg1 == 14) {
                int var10 = arg0.method257((byte) 78);
                this.field1988 = new int[var10][2];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field1988[var11][0] = arg0.method257((byte) 23);
                    this.field1988[var11][1] = arg0.method257((byte) 48);
                }
            } else if (arg1 == 15) {
                arg0.method254((byte) -35);
            } else if (arg1 == 17) {
                this.field1990 = arg0.method254((byte) -121);
            } else if (arg1 == 18) {
                int var20 = arg0.method257((byte) 36);
                this.field1981 = new int[var20];
                this.field1996 = new int[var20];
                this.field1997 = new String[var20];
                this.field1986 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field1981[var21] = arg0.method255((byte) 96);
                    this.field1996[var21] = arg0.method255((byte) 96);
                    this.field1986[var21] = arg0.method255((byte) 96);
                    this.field1997[var21] = arg0.method239(true);
                }
            } else if (arg1 == 19) {
                int var12 = arg0.method257((byte) 60);
                this.field1984 = new String[var12];
                this.field1994 = new int[var12];
                this.field1991 = new int[var12];
                this.field1998 = new int[var12];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field1998[var13] = arg0.method255((byte) 96);
                    this.field1991[var13] = arg0.method255((byte) 96);
                    this.field1994[var13] = arg0.method255((byte) 96);
                    this.field1984[var13] = arg0.method239(true);
                }
            } else if (arg1 == 249) {
                int var14 = arg0.method257((byte) 81);
                if (this.field1979 == null) {
                    int var15 = class99.method749(var14, -23866);
                    this.field1979 = new class407(var15);
                }
                for (int var16 = 0; var16 < var14; var16++) {
                    boolean var17 = arg0.method257((byte) 122) == 1;
                    int var18 = arg0.method224(arg2 + 8);
                    class179 var19;
                    if (var17) {
                        var19 = new class65(arg0.method239(true));
                    } else {
                        var19 = new class361(arg0.method255((byte) 96));
                    }
                    this.field1979.method2413((long) var18, arg2 + 9, var19);
                }
            }
        }
        field1989++;
        if (arg2 != -10) {
            field2002 = null;
        }
    }
}
