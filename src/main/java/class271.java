import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class271 implements class204 {

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field4776 = -1;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Lpk;")
    public static class66 field4775 = new class66(64);

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Le;")
    public static class191 field4780 = class54.method368("Texturen geladen)3", 2047);

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Z")
    public static boolean field4784 = false;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Le;")
    public static class191 field4781 = class54.method368("Null", 2047);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lng;")
    public static class121 field4778;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Lng;")
    public static class121 field4782;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method1847(int arg0) {
        field4781 = null;
        if (arg0 != -4739) {
            method1848(-14, (byte) -102);
        }
        field4782 = null;
        field4780 = null;
        field4775 = null;
        field4778 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)Z")
    public static final boolean method1848(int arg0, byte arg1) {
        field4772++;
        if (arg1 > -122) {
            field4783 = -7;
        }
        return ((arg0 & 0x6D7FB0) >> 22) != 0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(J[IIB)Le;")
    public final class191 method1415(long arg0, int[] arg1, int arg2, byte arg3) {
        field4777++;
        int var6 = 85 % ((22 - arg3) / 48);
        if (arg2 == 0) {
            class122 var7 = class211.method1453(arg1[0], false);
            return var7.method832((int) arg0, -28);
        } else if (arg2 == 1 || arg2 == 10) {
            class148 var8 = class100.method623(-1, (int) arg0);
            return var8.field2529;
        } else if (arg2 == 6 || arg2 == 7) {
            return class211.method1453(arg1[0], false).method832((int) arg0, 121);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBIIII)V")
    public static final void method1849(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 >= class37.field678 && class207.field3680 >= arg2 && class242.field4314 <= arg0 && class99.field1584 >= arg5) {
            class193.method1376(arg3, (byte) 118, arg0, arg5, arg2, arg4);
        } else {
            class178.method1196(arg2, arg5, arg3, (byte) 70, arg0, arg4);
        }
        if (arg1 != 19) {
            method1852((class16) null, -105, -36, -48, -98, -5);
        }
        field4773++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lng;I)V")
    public static final void method1850(class121 arg0, int arg1) {
        class51.field933 = arg0;
        field4774++;
        if (arg1 != 128) {
            method1848(-41, (byte) -55);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)V")
    public static final void method1851(byte arg0, int arg1) {
        class199.field3561 = 50;
        field4771++;
        if (arg0 != -48) {
            field4780 = null;
        }
        class263.field4655 = arg1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lbe;IIIII)V")
    public static final void method1852(class16 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class240.field4271 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class217.field3821) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class85.field1406 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class199 var14 = class201.field3608[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class12.field143[var11][var12 + 1][var13] + class12.field143[var11][var12][var13] + class12.field143[var11][var12][var13 + 1] + class12.field143[var11][var12 + 1][var13 + 1]) / 4 - (class12.field143[arg1][arg2 + 1][arg3] + class12.field143[arg1][arg2][arg3] + class12.field143[arg1][arg2][arg3 + 1] + class12.field143[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class254 var16 = var14.field3535;
                                    if (var16 != null) {
                                        if (var16.field4499.method120()) {
                                            arg0.method128(var16.field4499, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field4493 != null && var16.field4493.method120()) {
                                            arg0.method128(var16.field4493, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3550; var17++) {
                                        class12 var18 = var14.field3549[var17];
                                        if (var18 != null && var18.field155.method120() && (var18.field152 == var12 || var7 == var12) && (var18.field144 == var13 || var9 == var13)) {
                                            int var19 = var18.field146 + 1 - var18.field152;
                                            int var20 = var18.field150 + 1 - var18.field144;
                                            arg0.method128(var18.field155, (var18.field152 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field144 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }
}
