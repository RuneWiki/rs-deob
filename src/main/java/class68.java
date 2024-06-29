import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class68 extends class406 {

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
    private int field777;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    private int field778;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    private int field785;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    private int field769;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    private int field783;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public int field768;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field771 = 0;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "Liq;")
    public static class362 field781 = new class362("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public static int field789 = -1;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "Ltq;")
    public static class376 field787;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)Lnd;")
    public static final class324 method377(byte arg0) {
        int var1 = 19 % ((arg0 + 21) / 45);
        field773++;
        if (class308.field4346 == null || class97.field1169 == null) {
            return null;
        }
        for (class324 var2 = (class324) class97.field1169.method2100(512); var2 != null; var2 = (class324) class97.field1169.method2100(512)) {
            class246 var3 = class153.method927(0, var2.field4613);
            if (var3 != null && var3.field3515 && var3.method1676(-1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[[I)V")
    public static final void method378(int arg0, int[][] arg1) {
        class291.field4067 = arg1;
        int var2 = 96 % ((arg0 - 34) / 32);
        field770++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Z")
    public final boolean method379(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            this.field775 = 59;
        }
        field763++;
        return this.field783 <= arg0 && arg0 <= this.field777 && arg2 >= this.field778 && this.field785 >= arg2;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([IIII)V")
    public final void method380(int[] arg0, int arg1, int arg2, int arg3) {
        arg0[2] = this.field764 + arg3 - this.field778;
        int var5 = 75 / ((42 - arg1) / 45);
        arg0[0] = 0;
        arg0[1] = this.field776 + arg2 - this.field783;
        field774++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZ)V")
    public static final void method381(boolean arg0, boolean arg1) {
        if (!arg1) {
            method381(true, false);
        }
        field779++;
        if (class435.field6250 != arg0) {
            class435.field6250 = arg0;
            class318.method2084((byte) 94);
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V")
    public static void method382(byte arg0) {
        field781 = null;
        if (arg0 < 52) {
            method383(-128, -65, 126, (byte) 112);
        }
        field787 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIB)V")
    public static final void method383(int arg0, int arg1, int arg2, byte arg3) {
        field767++;
        class62.field718.method1603(arg1, 871);
        int var4 = 98 / ((63 - arg3) / 37);
        class62.field718.method1588(128, arg0);
        class62.field718.method1563(-2, arg2);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BII)Z")
    public final boolean method384(byte arg0, int arg1, int arg2) {
        field786++;
        if (arg0 < 82) {
            field787 = null;
        }
        return arg2 >= this.field776 && this.field775 >= arg2 && arg1 >= this.field764 && this.field768 >= arg1;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)I")
    public static final int method385(int arg0) {
        if (arg0 != 81) {
            field787 = null;
        }
        field772++;
        if (class225.field3144 == null) {
            if (!class435.field6270 && class208.field2958 > 0) {
                if (class247.field3530 && class441.field6334.method2208(false, 81) && class208.field2958 > 2) {
                    return ((class302) class393.field5547.field1104.field5854.field5854).field4257;
                }
                return ((class302) class393.field5547.field1104.field5854).field4257;
            }
            int var1 = class306.field4306.method17(20417);
            int var2 = class306.field4306.method18(arg0 ^ 0x50);
            int var3 = class8.field120;
            int var4 = class379.field5341;
            int var5 = class113.field1393;
            if (var3 < var1 && (var3 + var5) > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class208.field2958; var7++) {
                    if (class331.field4686) {
                        int var11 = (class208.field2958 - var7 - 1) * 16 + var4 + 33;
                        if (var11 - 13 < var2 && var11 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class208.field2958 - var7 - 1) * 16 + (var4 + 31);
                        if (var2 > var12 - 13 && (var12 + 3) >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class322 var9 = new class322(class393.field5547);
                    for (class302 var10 = (class302) var9.method2102(13); var10 != null; var10 = (class302) var9.method2100(512)) {
                        if (var6 == var8++) {
                            return var10.field4257;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "([IIII)V")
    public final void method386(int[] arg0, int arg1, int arg2, int arg3) {
        field788++;
        arg0[arg2] = this.field783 + arg1 - this.field776;
        arg0[2] = this.field778 + arg3 - this.field764;
        arg0[0] = this.field769;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)I")
    public static final int method387(boolean arg0, int arg1) {
        field782++;
        if (arg0) {
            field765 = 49;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)Lnd;")
    public static final class324 method388(byte arg0) {
        if (arg0 != 116) {
            return null;
        }
        field766++;
        if (class308.field4346 == null || class97.field1169 == null) {
            return null;
        }
        class97.field1169.method2103(class308.field4346, 0);
        class324 var1 = (class324) class97.field1169.method2102(13);
        if (var1 == null) {
            return null;
        } else {
            class246 var2 = class153.method927(0, var1.field4613);
            return var2 != null && var2.field3515 && var2.method1676(arg0 - 117) ? var1 : method377((byte) -73);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BIII)Z")
    public final boolean method389(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 == -2) {
            field784++;
            return this.field769 == arg1 && arg2 >= this.field783 && arg2 <= this.field777 && this.field778 <= arg3 && arg3 <= this.field785;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field776 = arg5;
        this.field764 = arg6;
        this.field777 = arg3;
        this.field778 = arg2;
        this.field785 = arg4;
        this.field769 = arg0;
        this.field783 = arg1;
        this.field768 = arg8;
        this.field775 = arg7;
    }
}
