import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class225 extends class45 {

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2960 = "Walk here";

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
    public static int field2964 = 0;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "J")
    public long field2962;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "Lds;")
    public class225 field2958;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "Lds;")
    public class225 field2961;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "Llm;")
    public static class347 field2956;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method1300(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class307.field4522; var3++) {
            class432 var4 = class411.field6073[var3];
            if (var4.field6351 == 1) {
                int var5 = var4.field6356 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field6344 * var5 >> 8) + var4.field6353;
                    int var7 = (var4.field6362 * var5 >> 8) + var4.field6361;
                    int var8 = (var4.field6341 * var5 >> 8) + var4.field6357;
                    int var9 = (var4.field6339 * var5 >> 8) + var4.field6343;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field6351 == 2) {
                int var10 = arg0 - var4.field6356;
                if (var10 > 0) {
                    int var11 = (var4.field6344 * var10 >> 8) + var4.field6353;
                    int var12 = (var4.field6362 * var10 >> 8) + var4.field6361;
                    int var13 = (var4.field6341 * var10 >> 8) + var4.field6357;
                    int var14 = (var4.field6339 * var10 >> 8) + var4.field6343;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field6351 == 3) {
                int var15 = var4.field6353 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field6354 * var15 >> 8) + var4.field6356;
                    int var17 = (var4.field6347 * var15 >> 8) + var4.field6355;
                    int var18 = (var4.field6341 * var15 >> 8) + var4.field6357;
                    int var19 = (var4.field6339 * var15 >> 8) + var4.field6343;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field6351 == 4) {
                int var20 = arg2 - var4.field6353;
                if (var20 > 0) {
                    int var21 = (var4.field6354 * var20 >> 8) + var4.field6356;
                    int var22 = (var4.field6347 * var20 >> 8) + var4.field6355;
                    int var23 = (var4.field6341 * var20 >> 8) + var4.field6357;
                    int var24 = (var4.field6339 * var20 >> 8) + var4.field6343;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field6351 == 5) {
                int var25 = arg1 - var4.field6357;
                if (var25 > 0) {
                    int var26 = (var4.field6354 * var25 >> 8) + var4.field6356;
                    int var27 = (var4.field6347 * var25 >> 8) + var4.field6355;
                    int var28 = (var4.field6344 * var25 >> 8) + var4.field6353;
                    int var29 = (var4.field6362 * var25 >> 8) + var4.field6361;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)Z", line = 131)
    public final boolean method1301(int arg0) {
        field2955++;
        if (arg0 == 0) {
            return this.field2958 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V", line = 145)
    public final void method1302(boolean arg0) {
        field2957++;
        if (this.field2958 == null) {
            return;
        }
        this.field2958.field2961 = this.field2961;
        this.field2961.field2958 = this.field2958;
        this.field2958 = null;
        this.field2961 = null;
        if (!arg0) {
            method1303((class438) null, (byte) 114, 16);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lqs;BI)V", line = 166)
    public static final void method1303(class438 arg0, byte arg1, int arg2) {
        field2963++;
        if (class52.field718) {
            arg2 = 0;
            class52.field718 = false;
        }
        if (arg1 != -60) {
            field2964 = 24;
        }
        if (class48.field679 != null && class48.field679.method2754(arg0, (byte) 87)) {
            return;
        }
        class48.field679 = arg0;
        class423.field6234 = class114.method735(121);
        class422.field6221 = arg2;
        class315.field4605 = arg2;
        if (class315.field4605 == 0) {
            class232.method1392((byte) -77);
            return;
        }
        class139.field1914 = class181.field2400;
        class320.field4690 = class166.field2233;
        class94.field1349 = class104.field1487;
        class181.field2404 = class166.field2234;
        class410.field6065 = class227.field2977;
        class211.field2825 = class167.field2261;
        class76.field1084 = class382.field5541;
        class173.field2317 = class379.field5527;
        class380.field5535 = class243.field3241;
        class100.field1397 = class262.field3806;
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)V", line = 209)
    public static final void method1304(int arg0) {
        class278.field4045.method391(93);
        if (arg0 != 8) {
            field2960 = null;
        }
        field2954++;
        class163.field2182.method2251(6);
        class253.field3492.method2251(6);
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)V", line = 224)
    public static void method1305(byte arg0) {
        if (arg0 > -31) {
            field2956 = null;
        }
        field2956 = null;
        field2960 = null;
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)[Lvi;", line = 236)
    public static final class309[] method1306(byte arg0) {
        if (arg0 >= -97) {
            method1303((class438) null, (byte) -32, 21);
        }
        field2953++;
        if (class126.field1765 == null) {
            class309[] var1 = class278.method1921(class76.field1085, (byte) 121);
            class309[] var2 = new class309[var1.length];
            int var3 = 0;
            label66: for (int var4 = 0; var4 < var1.length; var4++) {
                class309 var8 = var1[var4];
                if ((var8.field4550 <= 0 || var8.field4550 >= 24) && var8.field4549 >= 800 && var8.field4554 >= 600 && (class134.field1867 >= 96 || class373.field5422 != 0 || var8.field4549 <= 1024 && var8.field4554 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class309 var10 = var2[var9];
                        if (var8.field4549 == var10.field4549 && var8.field4554 == var10.field4554) {
                            if (var10.field4550 < var8.field4550) {
                                var2[var9] = var8;
                            }
                            continue label66;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class126.field1765 = new class309[var3];
            class60.method418(var2, 0, class126.field1765, 0, var3);
            int[] var5 = new int[class126.field1765.length];
            for (int var6 = 0; var6 < class126.field1765.length; var6++) {
                class309 var7 = class126.field1765[var6];
                var5[var6] = var7.field4554 * var7.field4549;
            }
            class397.method2551(class126.field1765, var5, true);
        }
        return class126.field1765;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BI)V", line = 317)
    public static final void method1307(byte arg0, int arg1) {
        field2959++;
        class189 var2 = class329.field4793;
        synchronized (class329.field4793) {
            class329.field4793.method1142((byte) -106, arg1);
        }
        class189 var3 = class211.field2816;
        synchronized (class211.field2816) {
            class211.field2816.method1142((byte) -50, arg1);
        }
        int var4 = -70 % ((arg0 - 69) / 35);
    }
}
