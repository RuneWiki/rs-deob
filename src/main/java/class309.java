import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class309 {

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Lpl;")
    public static class186 field5183 = new class186(200);

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field5189 = 0;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field5190 = 0;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Lqd;")
    public static class40 field5188 = class147.method1106("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", (byte) -48);

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field5191 = 0;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "[Z")
    public static boolean[] field5192 = new boolean[100];

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lwd;")
    public static class75 field5186;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([J[Ljava/lang/Object;III)V", line = 14)
    public static final void method2110(long[] arg0, Object[] arg1, int arg2, int arg3, int arg4) {
        if (arg3 < arg4) {
            int var5 = arg3;
            int var6 = (arg3 + arg4) / 2;
            long var7 = arg0[var6];
            arg0[var6] = arg0[arg4];
            arg0[arg4] = var7;
            Object var9 = arg1[var6];
            arg1[var6] = arg1[arg4];
            arg1[arg4] = var9;
            for (int var10 = arg3; var10 < arg4; var10++) {
                if (arg0[var10] < ((long) (var10 & 0x1) + var7)) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var5];
                    arg0[var5] = var11;
                    Object var13 = arg1[var10];
                    arg1[var10] = arg1[var5];
                    arg1[var5++] = var13;
                }
            }
            arg0[arg4] = arg0[var5];
            arg0[var5] = var7;
            arg1[arg4] = arg1[var5];
            arg1[var5] = var9;
            method2110(arg0, arg1, -1, arg3, var5 - 1);
            method2110(arg0, arg1, -1, var5 + 1, arg4);
        }
        field5187++;
        if (arg2 != -1) {
            field5188 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZLqd;)V", line = 69)
    public static final void method2111(boolean arg0, class40 arg1) {
        field5181++;
        if (!arg0) {
            field5186 = (class75) null;
        }
        int var2 = class301.method2059(111, arg1);
        if (var2 == -1) {
            return;
        }
        class291.field4873 = class160.field2670.field5272[var2] - class91.field1662;
        class160.field2677 = class272.field4524 + class268.field4462 - class160.field2670.field5292[var2] - 1;
        int var3 = class291.field4873 - ((int) ((float) class240.field3980.field3502 / class101.field1786));
        int var4 = class160.field2677 - ((int) ((float) class240.field3980.field3565 / class101.field1786));
        int var5 = (int) ((float) class240.field3980.field3502 / class101.field1786) + class291.field4873;
        if (var3 < 0) {
            class291.field4873 = (int) ((float) class240.field3980.field3502 / class101.field1786);
        }
        if (class233.field3840 < var5) {
            class291.field4873 = class233.field3840 - ((int) ((float) class240.field3980.field3502 / class101.field1786));
        }
        int var6 = (int) ((float) class240.field3980.field3565 / class101.field1786) + class160.field2677;
        if (var4 < 0) {
            class160.field2677 = (int) ((float) class240.field3980.field3565 / class101.field1786);
        }
        if (var6 > class268.field4462) {
            class160.field2677 = class268.field4462 - ((int) ((float) class240.field3980.field3565 / class101.field1786));
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V", line = 108)
    public static final void method2112(int arg0, byte arg1) {
        field5184++;
        if (class52.field1017 == 0) {
            class202.field3206.method627(arg0, (byte) -95);
        } else {
            class95.field1708 = arg0;
        }
        if (arg1 < 4) {
            method2115((byte) -60);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 132)
    public static final void method2113(int arg0) {
        if (class110.field1931 < 0) {
            class160.field2677 = -1;
            class110.field1931 = 0;
            class291.field4873 = -1;
        }
        field5180++;
        if (class233.field3840 < class110.field1931) {
            class110.field1931 = class233.field3840;
            class160.field2677 = -1;
            class291.field4873 = -1;
        }
        if (class92.field1675 < 0) {
            class160.field2677 = -1;
            class291.field4873 = -1;
            class92.field1675 = 0;
        }
        if (class92.field1675 > class268.field4462) {
            class160.field2677 = -1;
            class291.field4873 = -1;
            class92.field1675 = class268.field4462;
        }
        if (arg0 != -31654) {
            method2113(-51);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lsd;Lke;II)V", line = 177)
    public static final void method2114(class26 arg0, class107 arg1, int arg2, int arg3) {
        field5185++;
        class91 var4 = new class91();
        var4.field1647 = arg0.method226(255);
        var4.field1660 = arg0.method203(-22066);
        var4.field1651 = new int[var4.field1647];
        var4.field1657 = new byte[var4.field1647][][];
        var4.field1658 = new int[var4.field1647];
        var4.field1650 = new int[var4.field1647];
        var4.field1648 = new class70[var4.field1647];
        var4.field1649 = new class70[var4.field1647];
        if (arg2 != -26526) {
            field5183 = (class186) null;
        }
        for (int var5 = 0; var5 < var4.field1647; var5++) {
            try {
                int var6 = arg0.method226(arg2 ^ 0xFFFF989D);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg0.method251((byte) 77).method360(arg2 + 5963));
                    int var18 = 0;
                    String var19 = new String(arg0.method251((byte) 77).method360(arg2 + 5963));
                    if (var6 == 1) {
                        var18 = arg0.method203(arg2 + 4460);
                    }
                    var4.field1658[var5] = var6;
                    var4.field1651[var5] = var18;
                    var4.field1648[var5] = arg1.method805(class59.method500(-21269, var17), (byte) 67, var19);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg0.method251((byte) 77).method360(-20563));
                    String var8 = new String(arg0.method251((byte) 77).method360(-20563));
                    int var9 = arg0.method226(arg2 ^ 0xFFFF989D);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg0.method251((byte) 77).method360(-20563));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method203(arg2 ^ 0x31AC);
                            var12[var13] = new byte[var14];
                            arg0.method207(var12[var13], var14, arg2 ^ 0xAE83A46A, 0);
                        }
                    }
                    var4.field1658[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class59.method500(-21269, var10[var16]);
                    }
                    var4.field1649[var5] = arg1.method802(var8, var15, -11760, class59.method500(-21269, var7));
                    var4.field1657[var5] = var12;
                }
            } catch (ClassNotFoundException var25) {
                var4.field1650[var5] = -1;
            } catch (SecurityException var26) {
                var4.field1650[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field1650[var5] = -3;
            } catch (Exception var28) {
                var4.field1650[var5] = -4;
            } catch (Throwable var29) {
                var4.field1650[var5] = -5;
            }
        }
        class20.field334.method1972(var4, arg2 ^ 0xFFFF9828);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V", line = 289)
    public static void method2115(byte arg0) {
        field5183 = null;
        field5188 = null;
        if (arg0 != 25) {
            method2110((long[]) null, (Object[]) null, 90, -105, -48);
        }
        field5192 = null;
        field5186 = null;
    }
}
