import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class85 {

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Ltk;")
    public static class151 field1236 = new class151(5000);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "Ljd;")
    public static class95 field1237;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 5)
    public static final String method638(String arg0, boolean arg1) {
        field1235++;
        String var2 = class101.method759(class49.method374(arg0, -1), (byte) -124);
        if (arg1) {
            field1236 = (class151) null;
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLjd;)V", line = 23)
    public static final void method639(byte arg0, class95 arg1) {
        class214.field3297 = arg1;
        int var2 = 61 / ((arg0 + 63) / 53);
        field1234++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 36)
    public static void method640(int arg0) {
        field1236 = null;
        if (arg0 != -26498) {
            field1236 = (class151) null;
        }
        field1237 = null;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)Lnf;", line = 49)
    public static final class262 method641(int arg0) {
        field1232++;
        if (arg0 != 8) {
            field1236 = (class151) null;
        }
        return class163.field2649;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V", line = 61)
    public static final void method642(int arg0, int arg1) {
        field1233++;
        if (arg1 == -1 || !class154.method1161(arg1, 87)) {
            return;
        }
        class161[] var2 = class8.field128[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class161 var4 = var2[var3];
            if (var4.field2443 != null) {
                class296 var5 = new class296();
                var5.field4574 = var4;
                var5.field4575 = var4.field2443;
                class174.method1303(6533, var5, 2000000);
            }
        }
        if (arg0 != 5) {
            field1237 = (class95) null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()V", line = 107)
    public static final void method643() {
        class101.field1463 = 0;
        label194: for (int var0 = 0; var0 < class298.field4582; var0++) {
            class339 var1 = class262.field4047[var0];
            if (class202.field3108 != null) {
                for (int var2 = 0; var2 < class202.field3108.length; var2++) {
                    if (class202.field3108[var2] != -1000000 && (var1.field5279 <= class202.field3108[var2] || var1.field5270 <= class202.field3108[var2]) && (var1.field5276 <= class25.field275[var2] || var1.field5272 <= class25.field275[var2]) && (var1.field5276 >= class265.field4140[var2] || var1.field5272 >= class265.field4140[var2]) && (var1.field5261 <= class165.field2668[var2] || var1.field5274 <= class165.field2668[var2]) && (var1.field5261 >= class283.field4409[var2] || var1.field5274 >= class283.field4409[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field5264 == 1) {
                int var3 = var1.field5278 + class341.field5290 - class237.field3609;
                if (var3 >= 0 && var3 <= class341.field5290 + class341.field5290) {
                    int var4 = var1.field5259 + class341.field5290 - class193.field3014;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field5277 + class341.field5290 - class193.field3014;
                    if (var5 > class341.field5290 + class341.field5290) {
                        var5 = class341.field5290 + class341.field5290;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class278.field4320[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class336.field5227 - var1.field5276;
                        if (var7 > 32) {
                            var1.field5280 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field5280 = 2;
                            var7 = -var7;
                        }
                        var1.field5267 = (var1.field5261 - class262.field4035 << 8) / var7;
                        var1.field5258 = (var1.field5274 - class262.field4035 << 8) / var7;
                        var1.field5271 = (var1.field5279 - class295.field4557 << 8) / var7;
                        var1.field5273 = (var1.field5270 - class295.field4557 << 8) / var7;
                        class51.field687[class101.field1463++] = var1;
                    }
                }
            } else if (var1.field5264 == 2) {
                int var8 = var1.field5259 + class341.field5290 - class193.field3014;
                if (var8 >= 0 && var8 <= class341.field5290 + class341.field5290) {
                    int var9 = var1.field5278 + class341.field5290 - class237.field3609;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field5282 + class341.field5290 - class237.field3609;
                    if (var10 > class341.field5290 + class341.field5290) {
                        var10 = class341.field5290 + class341.field5290;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class278.field4320[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class262.field4035 - var1.field5261;
                        if (var12 > 32) {
                            var1.field5280 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field5280 = 4;
                            var12 = -var12;
                        }
                        var1.field5265 = (var1.field5276 - class336.field5227 << 8) / var12;
                        var1.field5268 = (var1.field5272 - class336.field5227 << 8) / var12;
                        var1.field5271 = (var1.field5279 - class295.field4557 << 8) / var12;
                        var1.field5273 = (var1.field5270 - class295.field4557 << 8) / var12;
                        class51.field687[class101.field1463++] = var1;
                    }
                }
            } else if (var1.field5264 == 4) {
                int var13 = var1.field5279 - class295.field4557;
                if (var13 > 128) {
                    int var14 = var1.field5259 + class341.field5290 - class193.field3014;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field5277 + class341.field5290 - class193.field3014;
                    if (var15 > class341.field5290 + class341.field5290) {
                        var15 = class341.field5290 + class341.field5290;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field5278 + class341.field5290 - class237.field3609;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field5282 + class341.field5290 - class237.field3609;
                        if (var17 > class341.field5290 + class341.field5290) {
                            var17 = class341.field5290 + class341.field5290;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class278.field4320[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field5280 = 5;
                            var1.field5265 = (var1.field5276 - class336.field5227 << 8) / var13;
                            var1.field5268 = (var1.field5272 - class336.field5227 << 8) / var13;
                            var1.field5267 = (var1.field5261 - class262.field4035 << 8) / var13;
                            var1.field5258 = (var1.field5274 - class262.field4035 << 8) / var13;
                            class51.field687[class101.field1463++] = var1;
                        }
                    }
                }
            }
        }
    }
}
