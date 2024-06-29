import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class99 extends class108 {

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    private int field1853 = -32768;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "Lud;")
    public static class279 field1847 = class130.method1024("blinken3:", 255);

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    public static int field1849 = 0;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "Lud;")
    public static class279 field1848 = class130.method1024("_labels", 255);

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "Lud;")
    public static class279 field1855 = class130.method1024("; Expires=", 255);

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "I")
    public int field1858;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "Lok;")
    public static class149 field1852;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lvh;ILbd;B)V", line = 4)
    public static final void method845(class53 arg0, int arg1, class305 arg2, byte arg3) {
        field1850++;
        class221 var4 = new class221();
        int var5 = 67 / ((-arg3 - 34) / 54);
        var4.field3896 = arg0.method483(-113);
        var4.field3906 = arg0.method453(1);
        var4.field3897 = new class206[var4.field3896];
        var4.field3908 = new int[var4.field3896];
        var4.field3912 = new int[var4.field3896];
        var4.field3895 = new class206[var4.field3896];
        var4.field3898 = new byte[var4.field3896][][];
        var4.field3911 = new int[var4.field3896];
        for (int var6 = 0; var6 < var4.field3896; var6++) {
            try {
                int var7 = arg0.method483(-108);
                if (var7 == 0 || var7 == 1 || var7 == 2) {
                    String var8 = new String(arg0.method467((byte) -16).method2008((byte) 108));
                    String var9 = new String(arg0.method467((byte) -16).method2008((byte) 116));
                    int var10 = 0;
                    if (var7 == 1) {
                        var10 = arg0.method453(1);
                    }
                    var4.field3908[var6] = var7;
                    var4.field3911[var6] = var10;
                    var4.field3895[var6] = arg2.method2158(0, var9, class310.method2204(var8, true));
                } else if (var7 == 3 || var7 == 4) {
                    String var11 = new String(arg0.method467((byte) -16).method2008((byte) 101));
                    String var12 = new String(arg0.method467((byte) -16).method2008((byte) 92));
                    int var13 = arg0.method483(-104);
                    String[] var14 = new String[var13];
                    for (int var15 = 0; var15 < var13; var15++) {
                        var14[var15] = new String(arg0.method467((byte) -16).method2008((byte) 103));
                    }
                    byte[][] var16 = new byte[var13][];
                    if (var7 == 3) {
                        for (int var17 = 0; var17 < var13; var17++) {
                            int var18 = arg0.method453(1);
                            var16[var17] = new byte[var18];
                            arg0.method496(0, var18, var16[var17], 3);
                        }
                    }
                    var4.field3908[var6] = var7;
                    Class[] var19 = new Class[var13];
                    for (int var20 = 0; var20 < var13; var20++) {
                        var19[var20] = class310.method2204(var14[var20], true);
                    }
                    var4.field3897[var6] = arg2.method2173(var12, class310.method2204(var11, true), false, var19);
                    var4.field3898[var6] = var16;
                }
            } catch (ClassNotFoundException var26) {
                var4.field3912[var6] = -1;
            } catch (SecurityException var27) {
                var4.field3912[var6] = -2;
            } catch (NullPointerException var28) {
                var4.field3912[var6] = -3;
            } catch (Exception var29) {
                var4.field3912[var6] = -4;
            } catch (Throwable var30) {
                var4.field3912[var6] = -5;
            }
        }
        class54.field1186.method2246(true, var4);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(III)Lrj;", line = 115)
    public static final class18 method846(int arg0, int arg1, int arg2) {
        class191 var3 = class24.field619[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3451; var4++) {
            class18 var5 = var3.field3455[var4];
            if ((var5.field546 >> 29 & 0x3L) == 2L && var5.field560 == arg1 && var5.field564 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 158)
    public static void method847(int arg0) {
        field1847 = null;
        field1852 = null;
        field1848 = null;
        field1855 = null;
        if (arg0 != -1) {
            field1855 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "()I", line = 186)
    public final int method184() {
        field1854++;
        return this.field1853;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIIIJILlb;)V", line = 194)
    public final void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class208 arg10) {
        field1851++;
        class19 var13 = class220.method1612(-2254, this.field1858).method1229(this.field1856, (class182) null, 0, -63, -1, 0);
        if (var13 != null) {
            var13.method186(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field1853 = var13.method184();
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIII)V", line = 212)
    public final void method179(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1857++;
    }
}
