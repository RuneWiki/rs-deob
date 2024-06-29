import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class108 {

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field1587 = 0;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "[Lhea;")
    public static class393[] field1589 = new class393[100];

    @OriginalMember(owner = "client!co", name = "e", descriptor = "F")
    public static float field1588;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Leh;Z)Lvn;")
    public static final class288 method805(class335 arg0, boolean arg1) {
        field1585++;
        if (arg1) {
            field1589 = null;
        }
        class212 var2 = class287.method1770(true)[arg0.method2034(255)];
        class679 var3 = class601.method3318(!arg1)[arg0.method2034(255)];
        int var4 = arg0.method2022(-29089);
        int var5 = arg0.method2022(-29089);
        int var6 = arg0.method2001((byte) -83);
        int var7 = arg0.method2001((byte) -83);
        int var8 = arg0.method2022(-29089);
        int var9 = arg0.method2045(-98);
        int var10 = arg0.method2045(-98);
        return new class288(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
    public static final void method806(int arg0, int arg1) {
        if (arg0 == 37) {
            class567.field7502 = 3.0F;
        } else if (arg0 == 50) {
            class567.field7502 = 4.0F;
        } else if (arg0 == 75) {
            class567.field7502 = 6.0F;
        } else if (arg0 == 100) {
            class567.field7502 = 8.0F;
        } else if (arg0 == 200) {
            class567.field7502 = 16.0F;
        }
        if (arg1 == 27557) {
            class683.field9616 = -1;
            field1584++;
            class683.field9616 = -1;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIILwda;II)V")
    public static final void method807(int arg0, int arg1, int arg2, class597 arg3, int arg4, int arg5) {
        field1586++;
        if (arg3.field7902 == -1 && arg3.field7895 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class344.field4718.field5414 * arg3.field7909 >> 8;
        if (arg1 > arg3.field7900) {
            var6 += arg1 - arg3.field7900;
        } else if (arg1 < arg3.field7907) {
            var6 += arg3.field7907 - arg1;
        }
        if (arg5 <= 34) {
            return;
        }
        if (arg2 > arg3.field7917) {
            var6 += arg2 - arg3.field7917;
        } else if (arg2 < arg3.field7918) {
            var6 += arg3.field7918 - arg2;
        }
        if (arg3.field7912 == 0 || arg3.field7912 < var6 - 256 || class344.field4718.field5414 == 0 || arg3.field7893 != arg4) {
            if (arg3.field7914 != null) {
                class639.field8604.method164(arg3.field7914);
                arg3.field7914 = null;
                arg3.field7911 = null;
                arg3.field7904 = null;
            }
            if (arg3.field7919 != null) {
                class639.field8604.method164(arg3.field7919);
                arg3.field7894 = null;
                arg3.field7910 = null;
                arg3.field7919 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg3.field7912 - var6) * var7 / arg3.field7912;
        if (arg3.field7914 != null) {
            arg3.field7914.method655(var8);
        } else if (arg3.field7902 >= 0) {
            if (arg3.field7901) {
                if (arg3.field7911 == null) {
                    arg3.field7911 = class211.method1352(class407.field5491, arg3.field7902);
                }
                if (arg3.field7911 != null) {
                    if (arg3.field7904 == null) {
                        arg3.field7904 = arg3.field7911.method1349(new int[] { 22050 });
                    }
                    if (arg3.field7904 != null) {
                        class81 var12 = class81.method641(arg3.field7904, 100, var8);
                        var12.method650(-1);
                        class639.field8604.method159(var12);
                        arg3.field7914 = var12;
                    }
                }
            } else {
                class377 var9 = class377.method2214(class590.field7808, arg3.field7902, 0);
                if (var9 != null) {
                    class241 var10 = var9.method2217().method1484(class488.field6600);
                    class81 var11 = class81.method641(var10, 100, var8);
                    var11.method650(-1);
                    class639.field8604.method159(var11);
                    arg3.field7914 = var11;
                }
            }
        }
        if (arg3.field7919 != null) {
            arg3.field7919.method655(var8);
            if (!arg3.field7919.method2798(-1)) {
                arg3.field7894 = null;
                arg3.field7919 = null;
                arg3.field7910 = null;
            }
        } else if (arg3.field7895 != null && (arg3.field7903 -= arg0) <= 0) {
            if (arg3.field7913) {
                if (arg3.field7894 == null) {
                    int var13 = (int) ((double) arg3.field7895.length * Math.random());
                    arg3.field7894 = class211.method1352(class407.field5491, arg3.field7895[var13]);
                }
                if (arg3.field7894 != null) {
                    if (arg3.field7910 == null) {
                        arg3.field7910 = arg3.field7894.method1349(new int[] { 22050 });
                    }
                    if (arg3.field7910 != null) {
                        class81 var14 = class81.method641(arg3.field7910, 100, var8);
                        var14.method650(0);
                        class639.field8604.method159(var14);
                        arg3.field7919 = var14;
                        arg3.field7903 = (int) ((double) (arg3.field7898 - arg3.field7906) * Math.random()) + arg3.field7906;
                        return;
                    }
                }
                return;
            }
            int var15 = (int) ((double) arg3.field7895.length * Math.random());
            class377 var16 = class377.method2214(class590.field7808, arg3.field7895[var15], 0);
            if (var16 != null) {
                class241 var17 = var16.method2217().method1484(class488.field6600);
                class81 var18 = class81.method641(var17, 100, var8);
                var18.method650(0);
                class639.field8604.method159(var18);
                arg3.field7903 = (int) ((double) (arg3.field7898 - arg3.field7906) * Math.random()) + arg3.field7906;
                arg3.field7919 = var18;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
    public static void method808(byte arg0) {
        int var1 = 104 / ((arg0 + 3) / 59);
        field1589 = null;
    }
}
