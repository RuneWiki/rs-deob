import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class372 extends class424 {

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    private int field5156;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    public static int field5155 = 52;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "Lka;")
    public static class408 field5158;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)V")
    public static final void method2326(byte arg0, int arg1) {
        ++field5152;
        class408 var2 = class22.field282;
        synchronized (class22.field282) {
            int var3 = 68 / ((-33 - arg0) / 52);
            class22.field282.method2531(arg1, 112);
        }
        class408 var4 = class269.field3683;
        synchronized (class269.field3683) {
            class269.field3683.method2531(arg1, 112);
        }
        class146 var5 = class431.field6035;
        synchronized (class431.field6035) {
            class431.field6035.method1055(arg1, -1);
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V")
    public class372(int arg0) {
        super(0, true);
        this.field5156 = 4096;
        this.field5156 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)V")
    public static final void method2327(int arg0) {
        if (arg0 > 68) {
            ++field5157;
            class144.field2108.method248(((float) class359.field4957 * 0.1F + 0.7F) * 1.1523438F);
            class144.field2108.method171(class182.field2556, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
            class144.field2108.method176(class326.field4435, -1);
            class144.field2108.method256(class451.field6493);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZJIII)Ljava/lang/String;")
    public static final String method2328(boolean arg0, long arg1, int arg2, int arg3, int arg4) {
        ++field5151;
        char var6 = (char) arg3;
        char var7 = '.';
        if (~arg2 == -1) {
            var6 = '.';
            var7 = ',';
        }
        if (arg2 == 2) {
            var7 = 160;
        }
        boolean var8 = false;
        if (arg1 < 0L) {
            arg1 = -arg1;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var10 = 0; ~var10 > ~arg4; ++var10) {
                int var11 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (-((int) arg1 * 10) + 48 + var11));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg1;
            arg1 /= 10L;
            var9.append((char) (48 - (int) arg1 * 10 + var13));
            if (~arg1 == -1L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                ++var12;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        ++field5159;
        int[] var3 = super.field5892.method783(arg0, (byte) -123);
        if (super.field5892.field1427) {
            class79.method642(var3, 0, class303.field4135, this.field5156);
        }
        if (arg1 != -10) {
            method2328(true, -51L, -98, -111, -32);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lea;Lac;IIIII)V")
    public static final void method2329(class58 arg0, class216 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; ++var12) {
            if (class409.field5706 != var12) {
                for (int var13 = var8; var13 <= var9; ++var13) {
                    if (var13 >= 0 && var13 < class284.field3862) {
                        for (int var14 = var10; var14 <= var11; ++var14) {
                            if (var14 >= 0 && var14 < class354.field4768 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class63 var15 = class341.field4617[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class436.field6160[var12].method329(var13, var14) + class436.field6160[var12].method329(var13 + 1, var14) + class436.field6160[var12].method329(var13, var14 + 1) + class436.field6160[var12].method329(var13 + 1, var14 + 1)) / 4 - (class436.field6160[arg2].method329(arg3, arg4) + class436.field6160[arg2].method329(arg3 + 1, arg4) + class436.field6160[arg2].method329(arg3, arg4 + 1) + class436.field6160[arg2].method329(arg3 + 1, arg4 + 1)) / 4;
                                    class403 var17 = var15.field867;
                                    class403 var18 = var15.field863;
                                    if (var17 != null && var17.method697(116)) {
                                        arg1.method699(22546, (var13 - arg3) * 128 + (1 - arg5) * 64, arg0, var17, var7, (var14 - arg4) * 128 + (1 - arg6) * 64, var16);
                                    }
                                    if (var18 != null && var18.method697(121)) {
                                        arg1.method699(22546, (var13 - arg3) * 128 + (1 - arg5) * 64, arg0, var18, var7, (var14 - arg4) * 128 + (1 - arg6) * 64, var16);
                                    }
                                    for (class48 var19 = var15.field853; var19 != null; var19 = var19.field608) {
                                        class5 var20 = var19.field617;
                                        if (var20 != null && var20.method697(124) && (var20.field52 == var13 || var8 == var13) && (var20.field55 == var14 || var10 == var14)) {
                                            int var21 = var20.field47 - var20.field52 + 1;
                                            int var22 = var20.field41 - var20.field55 + 1;
                                            arg1.method699(22546, (var20.field52 - arg3) * 128 + (var21 - arg5) * 64, arg0, var20, var7, (var20.field55 - arg4) * 128 + (var22 - arg6) * 64, var16);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var8;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field5156 = (arg0.method2306((byte) 72) << 12) / 255;
        }
        ++field5154;
        if (arg1 != -48) {
            method2327(-89);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)V")
    public static final void method2330(int arg0, int arg1) {
        ++field5153;
        class67.field943 = arg1;
        class408 var2 = class142.field2082;
        synchronized (class142.field2082) {
            class142.field2082.method2530((byte) -97);
            if (arg0 != 64) {
                field5158 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method2331(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++class410.field5724;
        class336.field4536 = 0;
        for (int var6 = class214.field3003; var6 < class409.field5706; ++var6) {
            class63[][] var17 = class341.field4617[var6];
            for (int var18 = class92.field1293; var18 < class186.field2698; ++var18) {
                for (int var19 = class371.field5146; var19 < class218.field3063; ++var19) {
                    class63 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (!class6.field62[var18 - class58.field750 + class244.field3440][var19 - class446.field6253 + class244.field3440] || arg1 != null && var6 >= arg2 && arg1[var6][var18][var19] == arg3) {
                            var20.field855 = false;
                            var20.field857 = false;
                            var20.field864 = 0;
                            if (var18 >= class58.field750 - 16 && var18 <= class58.field750 + 16 && var19 >= class446.field6253 - 16 && var19 <= class446.field6253 + 16 && (var20.field867 != null || var20.field863 != null || var20.field861 != null || var20.field859 != null || var20.field854 != null || var20.field853 != null)) {
                                class316.field4283.method1576(var20, (byte) -92);
                            }
                        } else {
                            var20.field855 = true;
                            var20.field857 = true;
                            if (var20.field853 != null) {
                                var20.field858 = true;
                            } else {
                                var20.field858 = false;
                            }
                            ++class336.field4536;
                        }
                    }
                }
            }
        }
        boolean var7 = class436.field6160 == class125.field1879;
        for (int var8 = class214.field3003; var8 < class409.field5706; ++var8) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class389.field5413.method166() && var8 >= arg2 && arg1 != null) {
                int var10 = class6.field62.length;
                if (class6.field62.length + class92.field1293 > class284.field3862) {
                    var10 -= class6.field62.length + class92.field1293 - class284.field3862;
                }
                int var11 = class6.field62[0].length;
                if (class6.field62[0].length + class371.field5146 > class354.field4768) {
                    var11 -= class6.field62[0].length + class371.field5146 - class354.field4768;
                }
                int var12 = class5.field56;
                while (true) {
                    if (var12 >= var10) {
                        class316.field4283.method1577(var9, class436.field6160[var8], true, var8, -80);
                        break;
                    }
                    int var13 = class92.field1293 + var12 - class5.field56;
                    for (int var14 = class85.field1203; var14 < var11; ++var14) {
                        class450.field6457[var12][var14] = false;
                        if (class6.field62[var12][var14]) {
                            int var15 = class371.field5146 + var14 - class85.field1203;
                            for (int var16 = var8; var16 >= 0; --var16) {
                                if (class341.field4617[var16][var13][var15] != null && class341.field4617[var16][var13][var15].field851 == var8) {
                                    class450.field6457[var12][var14] = class341.field4617[var16][var13][var15].field855;
                                    break;
                                }
                            }
                        }
                    }
                    ++var12;
                }
            } else {
                class316.field4283.method1577(var9, class436.field6160[var8], false, var8, -116);
            }
            class316.field4283.method1578(81);
        }
        if (!class253.method1626(true)) {
            class253.method1626(false);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIZIII)I")
    public static final int method2332(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (!arg3) {
            field5155 = 113;
        }
        ++field5160;
        if ((1 & arg5) == 1) {
            int var7 = arg4;
            arg4 = arg0;
            arg0 = var7;
        }
        int var8 = arg1 & 3;
        if (~var8 == -1) {
            return arg2;
        } else if (var8 == 1) {
            return arg6;
        } else {
            return var8 == 2 ? -arg2 + 1 + 7 + -arg4 : 1 - (arg0 - -arg6 - 7);
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class372() {
        this(4096);
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)V")
    public static void method2333(byte arg0) {
        field5158 = null;
        if (arg0 != -22) {
            field5155 = -89;
        }
    }

    static {
        new class368("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field5158 = new class408(8);
        new class368("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
    }
}
