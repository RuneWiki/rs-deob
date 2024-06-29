import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class129 {

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    private int field1976 = 1;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    private int field1985 = 0;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    private int field1974 = 0;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    private int field1982 = 1;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "Lko;")
    private class348 field1989 = new class348();

    @OriginalMember(owner = "client!me", name = "x", descriptor = "Z")
    private boolean field1994 = true;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    private int field1996 = -1;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "[Ljp;")
    private class236[] field1992 = new class236[2];

    @OriginalMember(owner = "client!me", name = "D", descriptor = "Z")
    private boolean field2000 = false;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "Z")
    private boolean field1999 = true;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "Z")
    private boolean field1997 = true;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "I")
    private int field1991 = 0;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "Z")
    private boolean field2001 = true;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Lqg;")
    private class321 field1975;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Lbb;")
    private class217 field1973;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Lbb;")
    private class217 field1984;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Lbb;")
    private class217 field1977;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "[I")
    public static int[] field1988 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "Lec;")
    private class156 field1993;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "Lec;")
    private class156 field1995;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "Ljp;")
    private class236 field1998;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Z")
    private boolean field1986;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)Z", line = 7)
    public final boolean method946(int arg0) {
        if (arg0 != 8276) {
            this.field1997 = false;
        }
        field1990++;
        return this.field1984 != null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 18)
    private final void method947(int arg0) {
        field1987++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class11 var5 = (class11) this.field1989.method2257((byte) 111); var5 != null; var5 = (class11) this.field1989.method2256(arg0 - 31957)) {
            int var9 = var5.method88(24448);
            var4 += var5.method94(false);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method93(false);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (arg0 != 32069) {
            this.field1974 = 92;
        }
        if (this.field1996 != var6) {
            this.field2001 = true;
            this.field1996 = var6;
        }
        int var7 = this.field1991 <= 2 ? this.field1991 : 2;
        int var8 = var4 > 2 ? 2 : var4;
        if (this.field2000 != var2) {
            this.field2000 = var2;
            this.field1997 = true;
        }
        if (var7 != var8) {
            this.field1994 = this.field2001 = true;
        }
        this.field1991 = var4;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BLvl;)Z", line = 83)
    public final boolean method948(byte arg0, class11 arg1) {
        field2002++;
        if (this.field1984 != null) {
            if (arg1.method92(1) || arg1.method90(108)) {
                this.field1989.method2270(0, arg1);
                this.method947(32069);
                if (this.method952((byte) -81)) {
                    if (this.field1982 != -1 && this.field1976 != -1) {
                        arg1.method86(this.field1982, (byte) 38, this.field1976);
                    }
                    arg1.field189 = true;
                    return true;
                }
            }
            this.method951(true, arg1);
        }
        return arg0 <= 71;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 123)
    public final void method949(byte arg0) {
        field1971++;
        if (!this.field1986) {
            return;
        }
        if (this.field1977 != null) {
            int var2 = 16384;
            this.field1975.method2059(this.field1977, arg0 - 18);
            this.field1975.method2062(this.field1973, (byte) 33);
            this.field1977.method1436(false, 0);
            this.field1973.method1430(-122, 0);
            if (this.field2000) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field1982, this.field1976, 0, 0, this.field1982, this.field1976, var2, 9728);
            this.field1975.method2056(this.field1977, (byte) -38);
            this.field1975.method2083(28, this.field1973);
        }
        this.field1975.method2035(-46);
        this.field1975.method2061(0, (byte) -116);
        this.field1975.method2068(1, 13134);
        this.field1975.method492();
        int var3 = 0;
        int var4 = 1;
        class11 var6;
        for (class11 var5 = (class11) this.field1989.method2257((byte) 102); var5 != null; var5 = var6) {
            var6 = (class11) this.field1989.method2256(119);
            int var7 = var5.method94(false);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method91(this.field1998, var8, this.field1992[var3], -29608);
                if (var6 == null && var7 - 1 == var8) {
                    this.field1975.method2060((byte) -54, this.field1973);
                    this.field1975.method2067(1786, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1976);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1985, this.field1974);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1985, this.field1976 + this.field1974);
                    OpenGL.glTexCoord2f((float) this.field1982, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1985 + this.field1982, this.field1976 + this.field1974);
                    OpenGL.glTexCoord2f((float) this.field1982, (float) this.field1976);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1985 + this.field1982, this.field1974);
                    OpenGL.glEnd();
                } else {
                    this.field1973.method1430(-86, -(-var4));
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1976);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field1976);
                    OpenGL.glTexCoord2f((float) this.field1982, (float) this.field1976);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1982, this.field1976);
                    OpenGL.glTexCoord2f((float) this.field1982, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1982, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
                var5.method87(84, var8);
            }
        }
        if (arg0 != 19) {
            this.method949((byte) 108);
        }
        this.field1986 = false;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V", line = 226)
    public final void method950(byte arg0) {
        this.field1992 = null;
        this.field1984 = this.field1977 = this.field1973 = null;
        this.field1993 = null;
        if (arg0 > -98) {
            method955(-86);
        }
        this.field1995 = null;
        field1978++;
        this.field1998 = null;
        if (!this.field1989.method2268((byte) -95)) {
            for (class439 var2 = this.field1989.method2257((byte) 107); var2 != this.field1989.field5279; var2 = var2.field6403) {
                ((class11) var2).method95(92);
            }
        }
        this.field1982 = this.field1976 = 1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLvl;)V", line = 259)
    public final void method951(boolean arg0, class11 arg1) {
        field1983++;
        if (!arg0) {
            this.method948((byte) 82, null);
        }
        arg1.field189 = false;
        arg1.method95(94);
        arg1.method2663(-122);
        this.method947(32069);
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)Z", line = 278)
    private final boolean method952(byte arg0) {
        field1972++;
        if (this.field1997) {
            if (this.field1995 != null) {
                this.field1995.method1125(false);
                this.field1995 = null;
            }
            if (this.field1998 != null) {
                this.field1998.method2670(2957);
                this.field1998 = null;
            }
            if (this.field1977 != null) {
                this.field1995 = new class156(this.field1975, 6402, this.field1982, this.field1976, this.field1975.field4771);
            }
            if (this.field2000) {
                this.field1998 = new class236(this.field1975, 34037, 6402, this.field1982, this.field1976);
            } else if (this.field1995 == null) {
                this.field1995 = new class156(this.field1975, 6402, this.field1982, this.field1976);
            }
            this.field1997 = false;
            this.field1999 = true;
            this.field1994 = true;
        }
        if (this.field2001) {
            if (this.field1993 != null) {
                this.field1993.method1125(false);
                this.field1993 = null;
            }
            if (this.field1992[0] != null) {
                this.field1992[0].method2670(2957);
                this.field1992[0] = null;
            }
            if (this.field1992[1] != null) {
                this.field1992[1].method2670(2957);
                this.field1992[1] = null;
            }
            if (this.field1977 != null) {
                this.field1993 = new class156(this.field1975, this.field1996, this.field1982, this.field1976, this.field1975.field4771);
            }
            this.field1992[0] = new class236(this.field1975, 34037, this.field1996, this.field1982, this.field1976);
            this.field1992[1] = this.field1991 <= 1 ? null : new class236(this.field1975, 34037, this.field1996, this.field1982, this.field1976);
            this.field1999 = true;
            this.field1994 = true;
            this.field2001 = false;
        }
        if (this.field1994) {
            if (this.field1977 == null) {
                this.field1975.method2036((byte) 112, this.field1973);
                this.field1973.method1445(1, 0);
                this.field1973.method1445(1, 1);
                this.field1973.method1445(1, 8);
                this.field1973.method1449((byte) 80, this.field1992[0], 0);
                if (this.field1991 > 1) {
                    this.field1973.method1449((byte) 83, this.field1992[1], 1);
                }
                if (this.field2000) {
                    this.field1973.method1449((byte) 82, this.field1998, 8);
                } else {
                    this.field1973.method1439(this.field1995, 8, 121);
                }
                this.field1975.method2060((byte) -54, this.field1973);
            } else {
                this.field1975.method2036((byte) 107, this.field1973);
                this.field1973.method1445(1, 0);
                this.field1973.method1445(1, 1);
                this.field1973.method1445(1, 8);
                this.field1973.method1449((byte) -103, this.field1992[0], 0);
                if (this.field1991 > 1) {
                    this.field1973.method1449((byte) 55, this.field1992[1], 1);
                }
                if (this.field2000) {
                    this.field1973.method1449((byte) 95, this.field1998, 8);
                }
                this.field1975.method2060((byte) -54, this.field1973);
                this.field1975.method2036((byte) 111, this.field1977);
                this.field1977.method1445(1, 0);
                this.field1977.method1445(1, 8);
                this.field1977.method1439(this.field1993, 0, -122);
                this.field1977.method1439(this.field1995, 8, 115);
                this.field1975.method2060((byte) -54, this.field1977);
            }
            this.field1994 = false;
            this.field1999 = true;
        }
        int var2 = -60 % ((17 - arg0) / 52);
        if (this.field1999) {
            this.field1975.method2036((byte) 108, this.field1984);
            this.field1999 = !this.field1984.method1444(-128);
            this.field1975.method2060((byte) -54, this.field1984);
        }
        return !this.field1999;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lqg;)V", line = 988)
    public class129(class321 arg0) {
        this.field1975 = arg0;
        if (this.field1975.field4836 && this.field1975.field4921) {
            this.field1984 = this.field1973 = new class217(this.field1975);
            if (this.field1975.field4771 > 1 && this.field1975.field4862 && this.field1975.field4849) {
                this.field1984 = this.field1977 = new class217(this.field1975);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)Z", line = 411)
    public final boolean method953(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1981++;
        if (this.field1984 == null || this.field1989.method2268((byte) -127)) {
            return false;
        }
        if (this.field1982 != arg3 || this.field1976 != arg4) {
            this.field1982 = arg3;
            this.field1976 = arg4;
            for (class439 var6 = this.field1989.method2257((byte) 103); var6 != this.field1989.field5279; var6 = var6.field6403) {
                ((class11) var6).method86(this.field1982, (byte) 106, this.field1976);
            }
            this.field2001 = true;
            this.field1994 = true;
            this.field1997 = true;
        }
        if (!this.method952((byte) -128)) {
            if (arg0 != -32324) {
                this.field1974 = 124;
            }
            return false;
        }
        this.field1974 = arg2;
        this.field1985 = arg1;
        this.field1986 = true;
        this.field1975.method2036((byte) 115, this.field1984);
        this.field1984.method1430(-104, 0);
        this.field1975.method2067(1786, this.field1976 - this.field1984.method1440(false) - this.field1974, -this.field1985);
        return true;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IILqa;I)V", line = 467)
    public static final void method954(int arg0, int arg1, class162 arg2, int arg3) {
        field1979++;
        if (arg3 < 0 || arg0 < 0 || class113.field1800 == 0 || class529.field7798 == 0) {
            return;
        }
        arg2.method485(class41.field631, class526.field7734, class113.field1800, class529.field7798);
        arg2.method509(class229.field3352, class371.field5566, class113.field1800, class529.field7798);
        class413 var4 = arg2.method428();
        var4.method1000(class406.field5975, class275.field3988, class403.field5928, class305.field4370, class438.field6391, class410.field6042);
        arg2.method497(var4);
        if (class145.field2135 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg2.method512();
            int var8 = (arg3 - class41.field631) * var7 / class113.field1800;
            int var9 = (arg0 - class526.field7734) * var7 / class529.field7798;
            int var10 = arg2.method459();
            int var11 = (arg3 - class41.field631) * var10 / class113.field1800;
            int var12 = (arg0 - class526.field7734) * var10 / class529.field7798;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method1005(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method1005(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && var20 < class237.field3436 && class83.field1366 > var22) {
                    int var23 = class95.field1558.field5538;
                    if (var23 < 3 && (class364.field5475[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class145.field2135[var23].method273(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class95.field1558.method184(1) - 1 << 6) + var19 >> 7;
                        var6 = var21 + (class95.field1558.method184(1) - 1 << 6) >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class301.field4287 && (class288.field4144 & 0x40) != 0) {
                    class58 var24 = class155.method1123(class153.field2343, class114.field1817, (byte) -91);
                    if (var24 == null) {
                        class105.method798(-28860);
                    } else {
                        class192.method1313(-1, class189.field2797, " ->", class200.field2920, var5, false, 0L, (byte) 35, 58, true, var6);
                    }
                } else {
                    if (class321.field4649 == class193.field2824) {
                        class192.method1313(-1, -1, "", class104.field1645.method1273(true, class370.field5530), var5, false, 0L, (byte) 35, 16, true, var6);
                    }
                    class192.method1313(-1, class505.field7407, "", class27.field457, var5, false, 0L, (byte) 35, 48, true, var6);
                    class377.field5625++;
                }
            }
        }
        class259 var25 = class263.field3780;
        if (arg1 != -13821) {
            method954(10, 34, null, 45);
        }
        for (class482 var26 = (class482) var25.method1639(-1); var26 != null; var26 = (class482) var25.method1642((byte) -59)) {
            if (class95.field1558.field5538 == var26.field7073 && var26.method2881(-108, arg2, arg3, arg0)) {
                if (var26.field7077 instanceof class62) {
                    class62 var27 = (class62) var26.field7077;
                    int var28 = var27.method184(1);
                    if ((var28 & 0x1) == 0 && (var27.field5529 & 0x7F) == 0 && (var27.field5539 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field5529 & 0x7F) == 64 && (var27.field5539 & 0x7F) == 64) {
                        int var29 = var27.field5529 - (var27.method184(1) - 1 << 6);
                        int var30 = var27.field5539 - (var27.method184(arg1 ^ -13822) - 1 << 6);
                        for (int var31 = 0; var31 < class322.field4943; var31++) {
                            class13 var38 = class132.field2030[class101.field1623[var31]];
                            if (var38 != null && class180.field2734 != var38.field352 && var38.field366) {
                                int var39 = var38.field5529 - (var38.field210.field2214 - 1 << 6);
                                int var40 = var38.field5539 - (var38.field210.field2214 - 1 << 6);
                                if (var29 <= var39 && var38.field210.field2214 <= (var27.method184(arg1 ^ 0xFFFFCA02) - (var39 - var29 >> 7)) && var40 >= var30 && var38.field210.field2214 <= var27.method184(arg1 + 13822) - (var40 - var30 >> 7)) {
                                    class268.method1714(class95.field1558.field5538 != var26.field7073, -31, var38);
                                    var38.field352 = class180.field2734;
                                }
                            }
                        }
                        int var32 = class333.field5117;
                        int[] var33 = class459.field6766;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class62 var35 = class390.field5783[var33[var34]];
                            if (var35 != null && class180.field2734 != var35.field352 && var27 != var35 && var35.field366) {
                                int var36 = var35.field5529 - (var35.method184(1) - 1 << 6);
                                int var37 = var35.field5539 - (var35.method184(1) - 1 << 6);
                                if (var29 <= var36 && var35.method184(1) <= (var27.method184(1) - (var36 - var29 >> 7)) && var30 <= var37 && var35.method184(1) <= (var27.method184(1) - (var37 - var30 >> 7))) {
                                    class42.method323((byte) 95, class95.field1558.field5538 != var26.field7073, var35);
                                    var35.field352 = class180.field2734;
                                }
                            }
                        }
                    }
                    if (class180.field2734 == var27.field352) {
                        continue;
                    }
                    class42.method323((byte) -98, class95.field1558.field5538 != var26.field7073, var27);
                    var27.field352 = class180.field2734;
                }
                if (var26.field7077 instanceof class13) {
                    class13 var41 = (class13) var26.field7077;
                    if (var41.field210 != null) {
                        if ((var41.field210.field2214 & 0x1) == 0 && (var41.field5529 & 0x7F) == 0 && (var41.field5539 & 0x7F) == 0 || (var41.field210.field2214 & 0x1) == 1 && (var41.field5529 & 0x7F) == 64 && (var41.field5539 & 0x7F) == 64) {
                            int var42 = var41.field5529 - (var41.field210.field2214 - 1 << 6);
                            int var43 = var41.field5539 - (var41.field210.field2214 - 1 << 6);
                            for (int var44 = 0; var44 < class322.field4943; var44++) {
                                class13 var51 = class132.field2030[class101.field1623[var44]];
                                if (var51 != null && class180.field2734 != var51.field352 && var41 != var51 && var51.field366) {
                                    int var52 = var51.field5529 - (var51.field210.field2214 - 1 << 6);
                                    int var53 = var51.field5539 - (var51.field210.field2214 - 1 << 6);
                                    if (var52 >= var42 && var51.field210.field2214 <= var41.field210.field2214 - (var52 - var42 >> 7) && var53 >= var43 && (var41.field210.field2214 - (var53 - var43 >> 7)) >= var51.field210.field2214) {
                                        class268.method1714(class95.field1558.field5538 != var26.field7073, -81, var51);
                                        var51.field352 = class180.field2734;
                                    }
                                }
                            }
                            int var45 = class333.field5117;
                            int[] var46 = class459.field6766;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class62 var48 = class390.field5783[var46[var47]];
                                if (var48 != null && class180.field2734 != var48.field352 && var48.field366) {
                                    int var49 = var48.field5529 - (var48.method184(arg1 ^ 0xFFFFCA02) - 1 << 6);
                                    int var50 = var48.field5539 - (var48.method184(1) - 1 << 6);
                                    if (var42 <= var49 && var48.method184(1) <= (var41.field210.field2214 - (var49 - var42 >> 7)) && var43 <= var50 && var48.method184(1) <= (var41.field210.field2214 - (var50 - var43 >> 7))) {
                                        class42.method323((byte) -85, class95.field1558.field5538 != var26.field7073, var48);
                                        var48.field352 = class180.field2734;
                                    }
                                }
                            }
                        }
                        if (class180.field2734 == var41.field352) {
                            continue;
                        }
                        class268.method1714(class95.field1558.field5538 != var26.field7073, arg1 ^ 0x35BB, var41);
                        var41.field352 = class180.field2734;
                    }
                }
                if (var26.field7077 instanceof class374) {
                    class63 var54 = (class63) class73.field1218.method2485(50, (long) (var26.field7072 << 14 | var26.field7073 << 28 | var26.field7071));
                    if (var54 != null) {
                        for (class394 var55 = (class394) var54.field1120.method2260(arg1 ^ 0xFFFFCA01); var55 != null; var55 = (class394) var54.field1120.method2269((byte) -79)) {
                            class172 var56 = class8.field111.method3077(-124, var55.field5819);
                            if (!class301.field4287) {
                                if (class95.field1558.field5538 == var26.field7073) {
                                    String[] var58 = var56.field2606;
                                    for (int var59 = 4; var59 >= 0; var59--) {
                                        if (var58 != null && var58[var59] != null) {
                                            byte var60 = 0;
                                            if (var59 == 0) {
                                                var60 = 4;
                                            }
                                            int var61 = class183.field2751;
                                            if (var59 == 1) {
                                                var60 = 44;
                                            }
                                            if (var59 == 2) {
                                                var60 = 10;
                                            }
                                            if (var59 == 3) {
                                                var60 = 49;
                                            }
                                            if (var59 == 4) {
                                                var60 = 22;
                                            }
                                            if (var56.field2563 == var59) {
                                                var61 = var56.field2618;
                                            }
                                            if (var56.field2596 == var59) {
                                                var61 = var56.field2612;
                                            }
                                            class522.field7645++;
                                            class192.method1313(-1, var61, "<col=ff9040>" + var56.field2569, var58[var59], var26.field7071, false, (long) var55.field5819, (byte) 35, var60, true, var26.field7072);
                                        }
                                    }
                                }
                                class192.method1313(-1, class40.field618, "<col=ff9040>" + var56.field2569, class331.field5097.method1273(true, class370.field5530), var26.field7071, class95.field1558.field5538 != var26.field7073, (long) var55.field5819, (byte) 35, 1006, true, var26.field7072);
                                class143.field2115++;
                            } else if (class95.field1558.field5538 == var26.field7073) {
                                class93 var57 = class458.field6759 == -1 ? null : class219.field3164.method2570((byte) -32, class458.field6759);
                                if ((class288.field4144 & 0x1) != 0 && (var57 == null || var56.method1226(0, class458.field6759, var57.field1529) != var57.field1529)) {
                                    class192.method1313(-1, class189.field2797, class318.field4553 + " -> <col=ff9040>" + var56.field2569, class200.field2920, var26.field7071, false, (long) var55.field5819, (byte) 35, 8, true, var26.field7072);
                                    class359.field5429++;
                                }
                            }
                        }
                    }
                }
                if (var26.field7077 instanceof class232) {
                    class232 var62 = (class232) var26.field7077;
                    class510 var63 = class246.field3567.method609(116, var62.method379((byte) -96));
                    if (var63.field7497 != null) {
                        var63 = var63.method3027(class526.field7733, arg1 ^ 0x7A4);
                    }
                    if (var63 != null) {
                        if (!class301.field4287) {
                            if (class95.field1558.field5538 == var26.field7073) {
                                String[] var65 = var63.field7454;
                                if (var65 != null) {
                                    for (int var66 = 4; var66 >= 0; var66--) {
                                        if (var65[var66] != null) {
                                            short var67 = 0;
                                            int var68 = class183.field2751;
                                            if (var66 == 0) {
                                                var67 = 25;
                                            }
                                            if (var66 == 1) {
                                                var67 = 9;
                                            }
                                            if (var66 == 2) {
                                                var67 = 11;
                                            }
                                            if (var66 == 3) {
                                                var67 = 19;
                                            }
                                            if (var63.field7507 == var66) {
                                                var68 = var63.field7476;
                                            }
                                            if (var66 == 4) {
                                                var67 = 1010;
                                            }
                                            if (var63.field7536 == var66) {
                                                var68 = var63.field7504;
                                            }
                                            class471.field6927++;
                                            class192.method1313(-1, var68, "<col=00ffff>" + var63.field7499, var65[var66], var26.field7071, false, class45.method338(var26.field7072, var62, (byte) 102, var26.field7071), (byte) 35, var67, true, var26.field7072);
                                        }
                                    }
                                }
                            }
                            class192.method1313(-1, class40.field618, "<col=00ffff>" + var63.field7499, class331.field5097.method1273(true, class370.field5530), var26.field7071, class95.field1558.field5538 != var26.field7073, (long) var63.field7483, (byte) 35, 1001, true, var26.field7072);
                            class80.field1324++;
                        } else if (class95.field1558.field5538 == var26.field7073) {
                            class93 var64 = class458.field6759 == -1 ? null : class219.field3164.method2570((byte) -32, class458.field6759);
                            if ((class288.field4144 & 0x4) != 0 && (var64 == null || var63.method3013(class458.field6759, var64.field1529, 4) != var64.field1529)) {
                                class461.field6809++;
                                class192.method1313(-1, class189.field2797, class318.field4553 + " -> <col=00ffff>" + var63.field7499, class200.field2920, var26.field7071, false, class45.method338(var26.field7072, var62, (byte) 79, var26.field7071), (byte) 35, 5, true, var26.field7072);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V", line = 931)
    public static void method955(int arg0) {
        if (arg0 <= -21) {
            field1988 = null;
        }
    }
}
