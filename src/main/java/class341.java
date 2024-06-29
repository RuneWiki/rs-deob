import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class341 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "[I")
    public static int[] field5305 = new int[2];

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5304 = "Take";

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 9)
    public static final void method2360(int arg0) {
        field5306++;
        if (!class109.field1458 || class164.field2659) {
            return;
        }
        class124[][][] var1 = class83.field1138;
        if (arg0 != -27453) {
            method2362(-94);
        }
        for (int var2 = 0; var2 < var1.length; var2++) {
            class124[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class124 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field1788 != null && var6.field1788.field2205 instanceof class217) {
                            class217 var7 = (class217) var6.field1788.field2205;
                            if ((Long.MIN_VALUE & var6.field1788.field2200) == 0L) {
                                var7.method1589(false, true, true, true, false, true, true);
                            } else {
                                var7.method1589(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field1779 != null) {
                            if (var6.field1779.field4382 instanceof class217) {
                                class217 var8 = (class217) var6.field1779.field4382;
                                if ((Long.MIN_VALUE & var6.field1779.field4373) == 0L) {
                                    var8.method1589(false, true, true, true, false, true, true);
                                } else {
                                    var8.method1589(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field1779.field4384 instanceof class217) {
                                class217 var9 = (class217) var6.field1779.field4384;
                                if ((var6.field1779.field4373 & Long.MIN_VALUE) == 0L) {
                                    var9.method1589(false, true, true, true, false, true, true);
                                } else {
                                    var9.method1589(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field1775 != null) {
                            if (var6.field1775.field1362 instanceof class217) {
                                class217 var10 = (class217) var6.field1775.field1362;
                                if ((var6.field1775.field1364 & Long.MIN_VALUE) == 0L) {
                                    var10.method1589(false, true, true, true, false, true, true);
                                } else {
                                    var10.method1589(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field1775.field1365 instanceof class217) {
                                class217 var11 = (class217) var6.field1775.field1365;
                                if ((var6.field1775.field1364 & Long.MIN_VALUE) == 0L) {
                                    var11.method1589(false, true, true, true, false, true, true);
                                } else {
                                    var11.method1589(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field1798; var12++) {
                            if (var6.field1783[var12].field4118 instanceof class217) {
                                class217 var13 = (class217) var6.field1783[var12].field4118;
                                if ((Long.MIN_VALUE & var6.field1783[var12].field4122) == 0L) {
                                    var13.method1589(false, true, true, true, false, true, true);
                                } else {
                                    var13.method1589(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class164.field2659 = true;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)I", line = 155)
    public static final int method2361(int arg0) {
        field5307++;
        if ((double) class92.field1232 == 3.0D) {
            return 37;
        } else if ((double) class92.field1232 == 4.0D) {
            return 50;
        } else if ((double) class92.field1232 == 6.0D) {
            return 75;
        } else if ((double) class92.field1232 == 8.0D) {
            return 100;
        } else {
            if (arg0 != 37) {
                method2361(60);
            }
            return 200;
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V", line = 188)
    public static void method2362(int arg0) {
        field5304 = null;
        field5305 = null;
        if (arg0 != -30523) {
            method2360(45);
        }
    }
}
