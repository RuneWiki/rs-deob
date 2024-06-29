import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class300 {

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "Z")
    public static boolean field4722 = true;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "[[Ldb;")
    public static class186[][] field4723;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2089(byte arg0) {
        field4727++;
        if (arg0 != 28) {
            field4722 = true;
        }
        for (int var1 = 0; var1 < class293.field4617; var1++) {
            int var10002 = class264.field4094[var1]--;
            if (class264.field4094[var1] >= -10) {
                class58 var3 = class40.field716[var1];
                if (var3 == null) {
                    var3 = class58.method433(class285.field4372, class320.field4991[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class264.field4094[var1] += var3.method434();
                    class40.field716[var1] = var3;
                }
                if (class264.field4094[var1] < 0) {
                    int var10;
                    if (class71.field1115[var1] == 0) {
                        var10 = class191.field3064;
                    } else {
                        int var4 = (class71.field1115[var1] & 0xFF) * 128;
                        int var5 = (class71.field1115[var1] & 0xFF57EB) >> 16;
                        int var6 = var5 * 128 + 64 - class19.field356.field1442;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = (class71.field1115[var1] & 0xFF44) >> 8;
                        int var8 = var7 * 128 + 64 - class19.field356.field1369;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var9 > var4) {
                            class264.field4094[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class14.field263 / var4;
                    }
                    if (var10 > 0) {
                        class144 var11 = var3.method436().method1095(class19.field359);
                        class119 var12 = class119.method896(var11, 100, var10);
                        var12.method882(class26.field429[var1] - 1);
                        class128.field2045.method354(var12);
                    }
                    class264.field4094[var1] = -100;
                }
            } else {
                class293.field4617--;
                for (int var2 = var1; var2 < class293.field4617; var2++) {
                    class320.field4991[var2] = class320.field4991[var2 + 1];
                    class40.field716[var2] = class40.field716[var2 + 1];
                    class26.field429[var2] = class26.field429[var2 + 1];
                    class264.field4094[var2] = class264.field4094[var2 + 1];
                    class71.field1115[var2] = class71.field1115[var2 + 1];
                }
                var1--;
            }
        }
        if (class165.field2559 && !class211.method1535((byte) 63)) {
            if (class288.field4397 != 0 && class306.field4808 != -1) {
                class110.method835(class306.field4808, class288.field4397, false, class111.field1842, 0, -111);
            }
            class165.field2559 = false;
        } else if (class288.field4397 != 0 && class306.field4808 != -1 && !class211.method1535((byte) 63)) {
            class269.field4191.method246(false, 106);
            class104.field1751++;
            class269.field4191.method784(-74, class306.field4808);
            class306.field4808 = -1;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)Lie;", line = 143)
    public static final class87 method2090(int arg0, int arg1, int arg2) {
        class272 var3 = class60.field946[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class87 var4 = var3.field4213;
            var3.field4213 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIII)V", line = 155)
    public static final void method2091(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4726++;
        if (arg3 != 32752) {
            method2089((byte) -4);
        }
        if (arg2 < 1 || arg4 < 1 || arg2 > 102 || arg4 > 102) {
            return;
        }
        if (!class34.method248(-110) && (class250.field3857[0][arg2][arg4] & 0x2) == 0) {
            int var8 = arg1;
            if ((class250.field3857[arg1][arg2][arg4] & 0x8) != 0) {
                var8 = 0;
            }
            if (class273.field4247 != var8) {
                return;
            }
        }
        int var9 = arg1;
        if (arg1 < 3 && (class250.field3857[1][arg2][arg4] & 0x2) == 2) {
            var9 = arg1 + 1;
        }
        class314.method2164(arg4, class244.field3772[arg1], var9, arg1, arg2, 0, arg0);
        if (arg6 >= 0) {
            boolean var10 = class289.field4406;
            class289.field4406 = true;
            class181.method1347(var9, 57, arg7, false, arg6, arg5, arg1, false, arg2, class244.field3772[arg1], arg4);
            class289.field4406 = var10;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V", line = 212)
    public static void method2092(byte arg0) {
        field4723 = (class186[][]) null;
        if (arg0 != 107) {
            method2090(83, 62, 68);
        }
    }
}
