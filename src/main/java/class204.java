import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class204 {

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "[Lbh;")
    public static class19[] field4058 = new class19[32768];

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "[I")
    public static int[] field4057 = new int[100];

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Ldd;")
    public static class35 field4065 = class180.method1196((byte) 127, "http:)4)4");

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "Lag;")
    public static class8 field4056;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)Lrg;")
    public static final class168 method1346(byte arg0, int arg1) {
        field4064++;
        if (arg0 > -54) {
            field4057 = null;
        }
        class168 var2 = (class168) class96.field2128.method817(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class82.field1910.method39(1, -1, arg1);
        class168 var4 = new class168();
        if (var3 != null) {
            var4.method1107(new class26(var3), -42, arg1);
        }
        class96.field2128.method816(var4, (long) arg1, 16);
        return var4;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(JZ)V")
    public static final void method1347(long arg0, boolean arg1) {
        field4059++;
        if (arg0 <= 0L || arg1) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class152.method1028(arg0 - 1L, -6643);
            class152.method1028(1L, -6643);
        } else {
            class152.method1028(arg0, -6643);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static final void method1348(int arg0) {
        if (class158.field3210 != null) {
            class95 var1 = class158.field3210;
            synchronized (class158.field3210) {
                class158.field3210 = null;
            }
        }
        field4060++;
        if (arg0 <= 63) {
            field4058 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lce;I)V")
    public static final void method1349(class26 arg0, int arg1) {
        field4061++;
        byte[] var2 = new byte[24];
        if (arg1 != -28369) {
            method1348(-72);
        }
        if (class56.field1409 != null) {
            try {
                class56.field1409.method1293((byte) 12, 0L);
                class56.field1409.method1291(false, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method237(31534, 0, 24, var2);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)Z")
    public static final boolean method1350(int arg0, int arg1, int arg2) {
        class145 var3 = class4.method23((byte) -60, arg1);
        field4062++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg0 >= -30) {
            field4065 = null;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method1003(arg2, -62);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lbe;IIIII)V")
    public static final void method1351(class16 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class4.field66 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class113.field2536) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class102.field2272 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class54 var14 = class191.field3853[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class126.field2746[var11][var12 + 1][var13] + class126.field2746[var11][var12][var13] + class126.field2746[var11][var12][var13 + 1] + class126.field2746[var11][var12 + 1][var13 + 1]) / 4 - (class126.field2746[arg1][arg2 + 1][arg3] + class126.field2746[arg1][arg2][arg3] + class126.field2746[arg1][arg2][arg3 + 1] + class126.field2746[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class22 var16 = var14.field1210;
                                    if (var16 != null) {
                                        if (var16.field448 instanceof class16) {
                                            class16 var17 = (class16) var16.field448;
                                            class16.method126(arg0, var17, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field446 instanceof class16) {
                                            class16 var18 = (class16) var16.field446;
                                            class16.method126(arg0, var18, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var19 = 0; var19 < var14.field1218; var19++) {
                                        class131 var20 = var14.field1225[var19];
                                        if (var20 != null && var20.field2814 instanceof class16) {
                                            class16 var21 = (class16) var20.field2814;
                                            int var22 = var20.field2827 + 1 - var20.field2816;
                                            int var23 = var20.field2828 + 1 - var20.field2812;
                                            class16.method126(arg0, var21, (var20.field2816 - arg2) * 128 + (var22 - arg4) * 64, var15, (var20.field2812 - arg3) * 128 + (var23 - arg5) * 64, var6);
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

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILag;I)Lba;")
    public static final class12 method1352(int arg0, class8 arg1, int arg2) {
        field4063++;
        if (arg0 != -9250) {
            method1349(null, -2);
        }
        return class100.method751((byte) 104, arg1, arg2) ? class190.method1251(arg0 ^ 0x2436) : null;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public static void method1353(int arg0) {
        field4058 = null;
        field4065 = null;
        int var1 = -123 / ((arg0 - 30) / 49);
        field4056 = null;
        field4057 = null;
    }
}
