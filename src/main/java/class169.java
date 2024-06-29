import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class169 {

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "[Ljava/lang/String;")
    private String[] field2204;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field2205 = -1;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field2211 = -2;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Lad;")
    public static class11 field2207 = new class11(8);

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "Lhb;")
    public static class250 field2212 = new class250(47, 3);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V", line = 52)
    public static void method1124(boolean arg0) {
        if (arg0) {
            field2212 = null;
            field2207 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 62)
    public class169(String arg0, String arg1, String arg2, String arg3) {
        this.field2204 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 71)
    public static final void method1125(int arg0) {
        field2203++;
        int var1 = class13.field236.length;
        if (arg0 != -134825722) {
            method1128(-20, 44, (byte) 69, 94);
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class13.field236[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class11.field173; var4++) {
                    if (class75.field943[var4] == class194.field2507[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class75.field943[class11.field173] = class194.field2507[var2];
                    var3 = class11.field173++;
                }
                class88 var5 = new class88(class13.field236[var2]);
                int var6 = 0;
                while (var5.field1176 < class13.field236[var2].length && var6 < 511 && class16.field264 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method568((byte) 110);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class194.field2507[var2] >> 8) * 64 + var10 - class35.field545;
                    int var13 = (class194.field2507[var2] & 0xFF) * 64 - (class336.field4299 - var11);
                    class10 var14 = class192.field2495.method1869(var5.method568((byte) 110), false);
                    if (class527.field7791[var7] == null && (var14.field147 & 0x1) > 0 && class473.field6914 == var9 && var12 >= 0 && class200.field2594 > (var14.field128 + var12) && var13 >= 0 && var13 + var14.field128 < class118.field1647) {
                        class527.field7791[var7] = new class295();
                        class527.field7791[var7].field5159 = var7;
                        class295 var15 = class527.field7791[var7];
                        class414.field5507[class16.field264++] = var7;
                        var15.field5232 = class264.field3353;
                        var15.method1776(var14, (byte) 88);
                        var15.method2353(var15.field3831.field128, (byte) 98);
                        var15.field5200 = var15.field3831.field138 << 3;
                        if (var15.field5200 == 0) {
                            var15.method2344(0, -18840);
                        } else {
                            var15.method2344((var15.field3831.field148 + 4 & 0x7E00007) << 11, arg0 + 134806882);
                        }
                        var15.method1769(var15.method2342(10804), var12, var13, var9, true, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V", line = 170)
    public static final void method1126(int arg0, int arg1, int arg2) {
        field2202++;
        if (class269.field3403 != arg2) {
            class510.field7476 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class510.field7476[var3] = (var3 << 12) / arg2;
            }
            class269.field3403 = arg2;
            class362.field4680 = arg2 * 32;
            class292.field3781 = arg2 - 1;
        }
        if (class477.field6965 != arg0) {
            if (class269.field3403 == arg0) {
                class74.field933 = class510.field7476;
            } else {
                class74.field933 = new int[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    class74.field933[var4] = (var4 << 12) / arg0;
                }
            }
            class380.field4948 = arg0 - 1;
            class477.field6965 = arg0;
        }
        if (arg1 != -1) {
            field2212 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 234)
    public final String method1127(int arg0, boolean arg1) {
        field2210++;
        if (arg1) {
            this.field2204 = null;
        }
        return this.field2204[arg0];
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIBI)V", line = 255)
    public static final void method1128(int arg0, int arg1, byte arg2, int arg3) {
        field2208++;
        if (arg2 <= 47) {
            return;
        }
        int var4 = class421.field5647.field7712 * arg1 >> 8;
        if (var4 != 0 && arg3 != -1) {
            class362.method2121(var4, (byte) -49, 0, false, class6.field53, arg3);
            class265.field3366 = true;
        }
    }

    @OriginalMember(owner = "client!oi", name = "toString", descriptor = "()Ljava/lang/String;", line = 291)
    public final String toString() {
        field2209++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)Z", line = 313)
    public static final boolean method1129(byte arg0) {
        field2200++;
        try {
            int var1 = 0 % ((-arg0 - 16) / 63);
            return class395.method2355(true);
        } catch (IOException var5) {
            class152.method1046((byte) -64);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + (class353.field4526 == null ? -1 : class353.field4526.method2006(true)) + "," + (class353.field4528 == null ? -1 : class353.field4528.method2006(true)) + "," + (class448.field6233 == null ? -1 : class448.field6233.method2006(true)) + " - " + class37.field574 + "," + (class37.field573.field5246[0] + class35.field545) + "," + (class37.field573.field5251[0] + class336.field4299) + " - ";
            for (int var4 = 0; var4 < class37.field574 && var4 < 50; var4++) {
                var3 = var3 + class109.field1514.field1223[var4] + ",";
            }
            class375.method2192((byte) -15, var6, var3);
            class450.method2667((byte) -120);
            return true;
        }
    }
}
