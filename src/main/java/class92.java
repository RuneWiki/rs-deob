import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class92 extends class106 {

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "Z")
    public boolean field1984 = false;

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "Lwg;")
    private class209 field1993;

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "Z")
    public boolean field1998;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "Z")
    public boolean field1987;

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "I")
    public int field1991;

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
    private int field1990;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
    private int field1981;

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "I")
    private int field1986;

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "I")
    private int field1994;

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "Lfc;")
    public static class54 field2001 = new class54(30);

    @OriginalMember(owner = "client!jf", name = "db", descriptor = "[I")
    public static int[] field2003 = new int[25];

    @OriginalMember(owner = "client!jf", name = "cb", descriptor = "Lrf;")
    public static class163 field2002 = class53.method392(-41, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!jf", name = "ib", descriptor = "J")
    public static long field2008 = 0L;

    @OriginalMember(owner = "client!jf", name = "jb", descriptor = "I")
    public static int field2009 = -1;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "F")
    private float field1985;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!jf", name = "fb", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!jf", name = "hb", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!jf", name = "eb", descriptor = "Lkg;")
    public static class102 field2004;

    @OriginalMember(owner = "client!jf", name = "gb", descriptor = "Lu;")
    public static class184 field2006;

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "[I")
    private int[] field1989;

    @OriginalMember(owner = "client!jf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field2000++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public static void method642(boolean arg0) {
        field2001 = null;
        field2004 = null;
        field2002 = null;
        field2003 = null;
        field2006 = null;
        if (!arg0) {
            method649(-106, 75, 124, -91, 81, 95, -41, -109);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lu;ZLth;)Z")
    public final boolean method643(class184 arg0, boolean arg1, class183 arg2) {
        field1980++;
        if (!arg1) {
            method649(-12, -8, -109, 10, 105, 55, 127, -124);
        }
        return this.field1993.method1366(-104, arg2, arg0);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lde;B)V")
    public static final void method644(class36 arg0, byte arg1) {
        field1988++;
        arg0.field705 = arg0.field721;
        if (arg0.field706 == 0) {
            arg0.field699 = 0;
            return;
        }
        if (arg0.field730 != -1 && arg0.field715 == 0) {
            class162 var2 = class97.method668(arg0.field730, (byte) 44);
            if (arg0.field724 > 0 && var2.field3295 == 0) {
                arg0.field699++;
                return;
            }
            if (arg0.field724 <= 0 && var2.field3271 == 0) {
                arg0.field699++;
                return;
            }
        }
        if (arg1 <= 96) {
            field2006 = null;
        }
        int var3 = arg0.field716;
        int var4 = arg0.field679;
        int var5 = arg0.field692[arg0.field706 - 1] * 128 + arg0.field684 * 64;
        int var6 = arg0.field718[arg0.field706 - 1] * 128 + arg0.field684 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg0.field716 = var5;
            arg0.field679 = var6;
            return;
        }
        if (var3 >= var5) {
            if (var5 >= var3) {
                if (var4 < var6) {
                    arg0.field737 = 1024;
                } else if (var6 < var4) {
                    arg0.field737 = 0;
                }
            } else if (var4 < var6) {
                arg0.field737 = 768;
            } else if (var6 < var4) {
                arg0.field737 = 256;
            } else {
                arg0.field737 = 512;
            }
        } else if (var4 < var6) {
            arg0.field737 = 1280;
        } else if (var6 < var4) {
            arg0.field737 = 1792;
        } else {
            arg0.field737 = 1536;
        }
        int var7 = arg0.field725;
        boolean var8 = true;
        int var9 = 4;
        int var10 = arg0.field737 - arg0.field727 & 0x7FF;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        if (var10 >= -256 && var10 <= 256) {
            var7 = arg0.field732;
        } else if (var10 >= 256 && var10 < 768) {
            var7 = arg0.field707;
        } else if (var10 >= -768 && var10 <= -256) {
            var7 = arg0.field719;
        }
        if (var7 == -1) {
            var7 = arg0.field732;
        }
        arg0.field705 = var7;
        if (arg0 instanceof class70) {
            var8 = ((class70) arg0).field1482.field2673;
        }
        if (var8) {
            if (arg0.field737 != arg0.field727 && arg0.field740 == -1 && arg0.field717 != 0) {
                var9 = 2;
            }
            if (arg0.field706 > 2) {
                var9 = 6;
            }
            if (arg0.field706 > 3) {
                var9 = 8;
            }
            if (arg0.field699 > 0 && arg0.field706 > 1) {
                arg0.field699--;
                var9 = 8;
            }
        } else {
            if (arg0.field706 > 1) {
                var9 = 6;
            }
            if (arg0.field706 > 2) {
                var9 = 8;
            }
            if (arg0.field699 > 0 && arg0.field706 > 1) {
                var9 = 8;
                arg0.field699--;
            }
        }
        if (arg0.field713[arg0.field706 - 1]) {
            var9 <<= 0x1;
        }
        if (var3 < var5) {
            arg0.field716 += var9;
            if (arg0.field716 > var5) {
                arg0.field716 = var5;
            }
        } else if (var3 > var5) {
            arg0.field716 -= var9;
            if (var5 > arg0.field716) {
                arg0.field716 = var5;
            }
        }
        if (var9 >= 8 && arg0.field732 == arg0.field705 && arg0.field731 != -1) {
            arg0.field705 = arg0.field731;
        }
        if (var4 < var6) {
            arg0.field679 += var9;
            if (var6 < arg0.field679) {
                arg0.field679 = var6;
            }
        } else if (var4 > var6) {
            arg0.field679 -= var9;
            if (arg0.field679 < var6) {
                arg0.field679 = var6;
            }
        }
        if (arg0.field716 == var5 && arg0.field679 == var6) {
            if (arg0.field724 > 0) {
                arg0.field724--;
            }
            arg0.field706--;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILu;ILth;F)[I")
    public final int[] method645(int arg0, class184 arg1, int arg2, class183 arg3, float arg4) {
        field1997++;
        if (arg0 != -3) {
            this.field1998 = false;
        }
        if (this.field1989 == null || this.field1985 != arg4) {
            if (!this.field1993.method1366(-24, arg3, arg1)) {
                return null;
            }
            int var6 = this.field1991 <= arg2 ? this.field1991 : arg2;
            this.field1989 = this.field1993.method1361(var6, arg1, true, -116, var6, (double) arg4, arg3);
            this.field1985 = arg4;
        }
        return this.field1989;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lu;ILth;B)[I")
    public final int[] method646(class184 arg0, int arg1, class183 arg2, byte arg3) {
        field1992++;
        if (arg3 != 94) {
            this.method646(null, 115, null, (byte) -38);
        }
        if (this.field1993.method1366(-21, arg2, arg0)) {
            int var5 = arg1 < this.field1991 ? arg1 : this.field1991;
            return this.field1993.method1361(var5, arg0, false, -95, var5, 1.0D, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)V")
    public final void method647(int arg0, int arg1) {
        field1999++;
        if (this.field1989 == null) {
            return;
        }
        if (arg1 <= 32) {
            this.field1993 = null;
        }
        if (this.field1986 != 0) {
            if (class58.field1174 == null || this.field1989.length > class58.field1174.length) {
                class58.field1174 = new int[this.field1989.length];
            }
            short var3;
            if (this.field1989.length == 4096) {
                var3 = 64;
            } else {
                var3 = 128;
            }
            int var4 = this.field1989.length;
            int var5 = this.field1981 * arg0 * var3;
            int var6 = var4 - 1;
            if (this.field1986 == 2) {
                var5 = -var5;
            }
            for (int var7 = 0; var7 < var4; var7++) {
                int var9 = var5 + var7 & var6;
                class58.field1174[var7] = this.field1989[var9];
            }
            int[] var8 = this.field1989;
            this.field1989 = class58.field1174;
            class58.field1174 = var8;
        }
        if (this.field1994 == 0) {
            return;
        }
        if (class58.field1174 == null || this.field1989.length > class58.field1174.length) {
            class58.field1174 = new int[this.field1989.length];
        }
        int var10 = this.field1989.length;
        int var11 = this.field1981 * arg0;
        if (this.field1994 == 1) {
            var11 = -var11;
        }
        short var12;
        if (this.field1989.length == 4096) {
            var12 = 64;
        } else {
            var12 = 128;
        }
        int var13 = var12 - 1;
        for (int var14 = 0; var14 < var10; var14 += var12) {
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var14 + (var13 & var11 + var16);
                int var18 = var14 + var16;
                class58.field1174[var18] = this.field1989[var17];
            }
        }
        int[] var15 = this.field1989;
        this.field1989 = class58.field1174;
        class58.field1174 = var15;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIBIZLue;I)V")
    public static final void method648(int arg0, int arg1, byte arg2, int arg3, boolean arg4, class189 arg5, int arg6) {
        field1996++;
        long var7 = (long) ((arg0 << 16) + arg1);
        class39 var9 = (class39) class101.field2112.method465(var7, (byte) -115);
        if (var9 != null) {
            return;
        }
        class39 var10 = (class39) class196.field3888.method465(var7, (byte) -72);
        if (var10 != null) {
            return;
        }
        class39 var11 = (class39) class150.field3098.method465(var7, (byte) 94);
        if (var11 == null) {
            if (!arg4) {
                class39 var12 = (class39) class131.field2742.method465(var7, (byte) -103);
                if (var12 != null) {
                    return;
                }
            }
            class39 var13 = new class39();
            var13.field808 = arg2;
            var13.field807 = arg5;
            if (arg3 != 1203347792) {
                method648(-116, -10, (byte) 59, -60, true, null, 101);
            }
            var13.field796 = arg6;
            if (arg4) {
                class101.field2112.method462(119, var13, var7);
                class105.field2198++;
            } else {
                class140.field2883.method418(0, var13);
                class150.field3098.method462(111, var13, var7);
                class162.field3293++;
            }
        } else if (arg4) {
            var11.method722((byte) 90);
            class101.field2112.method462(-26, var11, var7);
            class105.field2198++;
            class162.field3293--;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lfa;)V")
    public class92(class52 arg0) {
        this.field1993 = new class209(arg0);
        int var2 = arg0.method344(255);
        this.field1998 = (var2 & 0x2) != 0;
        this.field1987 = (var2 & 0x1) != 0;
        this.field1991 = arg0.method344(255);
        this.field1995 = arg0.method390((byte) 93);
        this.field1990 = arg0.method344(255);
        if (this.field1990 == 255) {
            this.field1990 = 256;
        }
        int var3 = arg0.method344(255);
        int var4 = arg0.method344(255);
        this.field1981 = (var4 & 0x3F) - 6;
        this.field1986 = var4 >> 6 & 0x3;
        this.field1994 = var3 >> 6 & 0x3;
        arg0.method344(255);
        arg0.method344(255);
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class92() {
        this.field1993 = new class209();
        this.field1991 = 1;
        this.field1987 = true;
    }
}
