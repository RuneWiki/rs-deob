import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class116 extends class85 {

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "Ljava/lang/String;")
    public static String field1762 = "Choose Option";

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "[I")
    public static int[] field1763 = new int[4096];

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field1766;

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "Z")
    public static boolean field1768;

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "Ltm;")
    public class127 field1757;

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "Lak;")
    public static class172 field1767;

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "[B")
    public byte[] field1764;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)[B", line = 5)
    public final byte[] method578(int arg0) {
        field1760++;
        if (this.field1190) {
            throw new RuntimeException();
        }
        if (arg0 != 26) {
            field1766 = (String) null;
        }
        return this.field1764;
    }

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "(I)I", line = 23)
    public final int method579(int arg0) {
        field1755++;
        if (this.field1190) {
            return 0;
        } else {
            if (arg0 > -43) {
                this.field1757 = (class127) null;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "(I)V", line = 41)
    public static final void method797(int arg0) {
        field1761++;
        int var1 = class282.field4538.method1804(field1762);
        for (int var2 = 0; var2 < class185.field3070; var2++) {
            int var3 = class282.field4538.method1804(class129.method935(var2, arg0 ^ 0x7EE));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        int var4 = class185.field3070 * arg0 + 21;
        var1 += 8;
        int var5 = class200.field3248 - (var1 / 2);
        int var6 = class222.field3554;
        if (class20.field276 < (var6 + var4)) {
            var6 = class20.field276 - var4;
        }
        if (class133.field2095 < (var5 + var1)) {
            var5 = class133.field2095 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class194.field3168 == 1) {
            if (class67.field960 == class200.field3248 && class7.field100 == class222.field3554) {
                class315.field4877 = var6;
                class295.field4671 = (class52.field737 ? 26 : 22) + class185.field3070 * 15;
                class121.field1831 = var5;
                class196.field3204 = true;
                class194.field3168 = 0;
                class227.field3617 = var1;
            }
        } else if (class200.field3248 == class105.field1542 && class222.field3554 == class198.field3221) {
            class194.field3168 = 0;
            class196.field3204 = true;
            class315.field4877 = var6;
            class121.field1831 = var5;
            class227.field3617 = var1;
            class295.field4671 = class185.field3070 * 15 + (class52.field737 ? 26 : 22);
        } else {
            class7.field100 = class198.field3221;
            class194.field3168 = 1;
            class67.field960 = class105.field1542;
        }
    }

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "(I)V", line = 142)
    public static final void method798(int arg0) {
        field1756++;
        if (arg0 != 11664) {
            return;
        }
        while (true) {
            class270 var1;
            class263 var3;
            do {
                var1 = (class270) class214.field3489.method1234((byte) 79);
                if (var1 == null) {
                    return;
                }
                if (var1.field4358 >= 0) {
                    int var2 = var1.field4358 - 1;
                    var3 = class99.field1445[var2];
                } else {
                    int var4 = -var1.field4358 - 1;
                    if (class234.field3758 == var4) {
                        var3 = class191.field3129;
                    } else {
                        var3 = class74.field1049[var4];
                    }
                }
            } while (var3 == null);
            class97 var5 = class69.method454(false, var1.field4356);
            if (class49.field698 < 3) {
            }
            int var6;
            int var7;
            if (var1.field4365 == 1 || var1.field4365 == 3) {
                var7 = var5.field1343;
                var6 = var5.field1337;
            } else {
                var6 = var5.field1343;
                var7 = var5.field1337;
            }
            int var8 = (var7 >> 1) + var1.field4359;
            int var9 = (var7 + 1 >> 1) + var1.field4359;
            int var10 = (var6 >> 1) + var1.field4361;
            int[][] var11 = class110.field1642[class49.field698];
            int var12 = (var6 + 1 >> 1) + var1.field4361;
            int var13 = var11[var8][var10] + var11[var9][var12] - (-var11[var8][var12] - var11[var9][var10]) >> 2;
            class7 var14 = null;
            int var15 = class209.field3437[var1.field4355];
            if (var15 == 0) {
                class225 var19 = class296.method2114(class49.field698, var1.field4359, var1.field4361);
                if (var19 != null) {
                    var14 = var19.field3599;
                }
            } else if (var15 == 1) {
                class38 var18 = class224.method1591(class49.field698, var1.field4359, var1.field4361);
                if (var18 != null) {
                    var14 = var18.field485;
                }
            } else if (var15 == 2) {
                class153 var17 = class61.method411(class49.field698, var1.field4359, var1.field4361);
                if (var17 != null) {
                    var14 = var17.field2373;
                }
            } else if (var15 == 3) {
                class113 var16 = class178.method1340(class49.field698, var1.field4359, var1.field4361);
                if (var16 != null) {
                    var14 = var16.field1728;
                }
            }
            if (var14 != null) {
                class76.method521(var15, var1.field4363 + 1, class49.field698, var1.field4361, 0, var1.field4359, 0, (byte) 89, var1.field4362 + 1, -1);
                int var20 = var1.field4351;
                var3.field4217 = var1.field4361 * 128 + var6 * 64;
                var3.field4189 = var14;
                var3.field4221 = class240.field3818 + var1.field4362;
                var3.field4218 = var13;
                var3.field4203 = var1.field4363 + class240.field3818;
                int var21 = var1.field4366;
                int var22 = var1.field4349;
                var3.field4216 = var1.field4359 * 128 + var7 * 64;
                if (var20 < var22) {
                    int var23 = var22;
                    var22 = var20;
                    var20 = var23;
                }
                int var24 = var1.field4353;
                var3.field4235 = var1.field4359 + var20;
                var3.field4249 = var1.field4359 + var22;
                if (var24 < var21) {
                    int var25 = var21;
                    var21 = var24;
                    var24 = var25;
                }
                var3.field4186 = var1.field4361 + var21;
                var3.field4227 = var1.field4361 + var24;
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1763[var0] = class329.method2303(var0, true);
        }
        field1766 = " is already on your ignore list.";
        field1768 = false;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V", line = 337)
    public static void method799(boolean arg0) {
        if (!arg0) {
            field1767 = (class172) null;
        }
        field1767 = null;
        field1766 = null;
        field1763 = null;
        field1762 = null;
    }
}
