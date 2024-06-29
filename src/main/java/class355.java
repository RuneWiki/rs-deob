import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class355 extends class297 {

    @OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
    public static int field5200 = 0;

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "[C")
    public static char[] field5198 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!ke", name = "db", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!ke", name = "fb", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!ke", name = "gb", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!ke", name = "hb", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!ke", name = "ib", descriptor = "Lah;")
    public static class216 field5204;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLra;Lra;)V", line = 7)
    public static final void method2263(boolean arg0, class57 arg1, class57 arg2) {
        if (arg0) {
            field5198 = null;
        }
        ++field5201;
        class12.field125 = arg2;
        class444.field6494 = arg1;
    }

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "(I)I", line = 20)
    public static final int method2264(int arg0) {
        ++field5195;
        if (arg0 != 15) {
            method2268(-101);
        }
        return 15;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIII)Z", line = 32)
    public static final boolean method2265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5197;
        if (arg3 != 241) {
            return true;
        } else {
            for (int var6 = arg4; var6 <= arg5; ++var6) {
                for (int var7 = arg0; ~var7 >= ~arg2; ++var7) {
                    if (~class308.field4407[var6][var7] == ~arg1 && class219.field3010[var6][var7] <= 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)Lbo;", line = 74)
    public static final class433 method2266(int arg0, int arg1, int arg2, int arg3) {
        ++field5196;
        class302 var4 = class19.field202[arg0][arg3][arg2];
        if (var4 == null) {
            return null;
        } else {
            class433 var5 = null;
            int var6 = -1;
            if (arg1 != 25279) {
                method2264(14);
            }
            for (class299 var7 = var4.field4308; var7 != null; var7 = var7.field4263) {
                class113 var8 = var7.field4261;
                if (var8 instanceof class433) {
                    class433 var9 = (class433) var8;
                    int var10 = 60 + (var9.method786((byte) 70) + -1) * 64;
                    int var11 = -var10 + var9.field1304 >> 7;
                    int var12 = -var10 + var9.field1311 >> 7;
                    int var13 = var9.field1304 + var10 >> 7;
                    int var14 = var9.field1311 - -var10 >> 7;
                    if (arg3 >= var11 && arg2 >= var12 && arg3 <= var13 && ~var14 <= ~arg2) {
                        int var15 = (var14 - (arg2 + -1)) * (-arg3 + 1 + var13);
                        if (~var6 > ~var15) {
                            var6 = var15;
                            var5 = var9;
                        }
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lbo;I)V", line = 134)
    public static final void method2267(class433 arg0, int arg1) {
        ++field5202;
        if (arg0 instanceof class358) {
            class358 var2 = (class358) arg0;
            if (var2.field5229 != null) {
                class195.method1238(true, var2);
            }
        } else {
            if (!(arg0 instanceof class133)) {
                return;
            }
            class393.method2509(-79, (class133) arg0);
        }
        if (arg1 != 195) {
            method2267((class433) null, 8);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[[I", line = 160)
    public final int[][] method144(int arg0, int arg1) {
        ++field5199;
        int var3 = 102 / ((arg1 - -80) / 45);
        int[][] var4 = super.field1342.method2530(arg0, (byte) 104);
        if (super.field1342.field5819 && this.method1879(46)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = arg0 % super.field4239 * super.field4239;
            for (int var9 = 0; var9 < class218.field2979; ++var9) {
                int var10 = super.field4236[var9 % super.field4233 + var8];
                var7[var9] = class40.method253(4080, var10 << 4);
                var6[var9] = class40.method253(65280, var10) >> 4;
                var5[var9] = class40.method253(16711680, var10) >> 12;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "(I)V", line = 207)
    public static void method2268(int arg0) {
        field5204 = null;
        if (arg0 != 29980) {
            field5204 = null;
        }
        field5198 = null;
    }
}
