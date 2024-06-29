import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class142 {

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public int field2001;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public int field2010;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Lkh;")
    public static class11 field1996;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "Lph;")
    public class385 field2003;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Lra;")
    public static class57 field1999;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "[I")
    public int[] field1993;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "[I")
    public int[] field1994;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "[I")
    public int[] field1998;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "[I")
    public int[] field2007;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "[I")
    public int[] field2011;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "[I")
    public int[] field2013;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "[Lph;")
    public class385[] field2008;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "[[I")
    public int[][] field2006;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "[[I")
    public int[][] field2012;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B[B)V")
    private final void method840(byte arg0, byte[] arg1) {
        field2002++;
        class211 var3 = new class211(class102.method552((byte) -113, arg1));
        int var4 = var3.method1342((byte) -128);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field2010 = 0;
        } else {
            this.field2010 = var3.method1336((byte) -50);
        }
        int var5 = var3.method1342((byte) -127);
        this.field1995 = var3.method1355(32136);
        int var6 = 0;
        this.field2011 = new int[this.field1995];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field1995; var8++) {
            this.field2011[var8] = var6 += var3.method1355(class97.method519(arg0, -32214));
            if (var7 < this.field2011[var8]) {
                var7 = this.field2011[var8];
            }
        }
        this.field2009 = var7 + 1;
        this.field2013 = new int[this.field2009];
        this.field2012 = new int[this.field2009][];
        this.field1993 = new int[this.field2009];
        this.field1998 = new int[this.field2009];
        this.field2007 = new int[this.field2009];
        if (var5 != 0) {
            this.field1994 = new int[this.field2009];
            for (int var9 = 0; var9 < this.field2009; var9++) {
                this.field1994[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1995; var10++) {
                this.field1994[this.field2011[var10]] = var3.method1336((byte) -105);
            }
            this.field2003 = new class385(this.field1994);
        }
        for (int var11 = 0; var11 < this.field1995; var11++) {
            this.field1993[this.field2011[var11]] = var3.method1336((byte) -53);
        }
        for (int var12 = 0; var12 < this.field1995; var12++) {
            this.field2007[this.field2011[var12]] = var3.method1336((byte) -65);
        }
        if (arg0 != -94) {
            method841(100);
        }
        for (int var13 = 0; var13 < this.field1995; var13++) {
            this.field1998[this.field2011[var13]] = var3.method1355(32136);
        }
        for (int var14 = 0; var14 < this.field1995; var14++) {
            int var21 = this.field2011[var14];
            int var22 = this.field1998[var21];
            int var23 = 0;
            int var24 = -1;
            this.field2012[var21] = new int[var22];
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field2012[var21][var25] = var23 += var3.method1355(32136);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field2013[var21] = var24 + 1;
            if (var24 + 1 == var22) {
                this.field2012[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field2008 = new class385[var7 + 1];
        this.field2006 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field1995; var15++) {
            int var16 = this.field2011[var15];
            int var17 = this.field1998[var16];
            this.field2006[var16] = new int[this.field2013[var16]];
            for (int var18 = 0; var18 < this.field2013[var16]; var18++) {
                this.field2006[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field2012[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field2012[var16][var19];
                }
                this.field2006[var16][var20] = var3.method1336((byte) -33);
            }
            this.field2008[var16] = new class385(this.field2006[var16]);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static final void method841(int arg0) {
        class169.field2360.field2888 = 0;
        field2004++;
        class148.field2070 = -1;
        class367.field5358 = -1;
        class249.field3379.field2888 = 0;
        class290.field4131 = 0;
        class99.field1117 = 0;
        class169.field2357 = arg0;
        class158.field2236 = 0;
        class334.field4915 = -1;
        class98.method530(arg0 ^ 0xFFFFF7FF);
        class133.method790(-1);
        for (int var1 = 0; var1 < class375.field5473.length; var1++) {
            if (class375.field5473[var1] != null) {
                class375.field5473[var1].field6334 = -1;
            }
        }
        for (int var2 = 0; var2 < class81.field917.length; var2++) {
            if (class81.field917[var2] != null) {
                class81.field917[var2].field6334 = -1;
            }
        }
        class95.method509(4);
        class231.field3128 = 1;
        class266.method1695(30, (byte) -75);
        for (int var3 = 0; var3 < 100; var3++) {
            class266.field3723[var3] = true;
        }
        class27.method160(arg0 ^ 0xFFFFFFD8);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static void method842(int arg0) {
        if (arg0 >= 116) {
            field1999 = null;
            field1996 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V")
    public static final void method843(int arg0, int arg1, int arg2) {
        field2005++;
        class348 var3 = class385.method2464(12, 1302, arg1);
        var3.method2216((byte) 23);
        int var4 = 113 % ((arg0 + 52) / 36);
        var3.field5093 = arg2;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "([BI)V")
    public class142(byte[] arg0, int arg1) {
        this.field2001 = class272.method1727(arg0.length, (byte) 110, arg0);
        if (this.field2001 != arg1) {
            throw new RuntimeException();
        }
        this.method840((byte) -94, arg0);
    }
}
