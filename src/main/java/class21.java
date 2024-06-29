import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class21 extends class252 {

    @OriginalMember(owner = "client!he", name = "u", descriptor = "[I")
    public static int[] field394 = new int[128];

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field401 = 0;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "[Z")
    public static boolean[] field403 = new boolean[100];

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    public static int field406 = 0;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "Li;")
    private class58 field398;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "Ljava/lang/String;")
    public static String field405;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)V")
    public static final void method164(byte arg0, int arg1) {
        field397++;
        if (arg0 >= 35) {
            class291 var2 = class61.method389(arg1, 11, 0);
            var2.method2010(0);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)V")
    public static final void method165(boolean arg0, int arg1) {
        field400++;
        class243.method1653(false);
        if (class238.field3741 != 30 && class238.field3741 != 25) {
            return;
        }
        class164.field2708++;
        if (class164.field2708 < 50 && !arg0) {
            return;
        }
        int var2 = -34 / ((53 - arg1) / 54);
        class164.field2708 = 0;
        if (!class246.field3873 && class18.field322 != null) {
            class311.field5027.method2081(false, 206);
            try {
                class18.field322.method410(0, class311.field5027.field4441, class311.field5027.field4458, (byte) 102);
                class311.field5027.field4458 = 0;
            } catch (IOException var3) {
                class246.field3873 = true;
            }
            class191.field3111++;
        }
        class243.method1653(false);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIILie;JLie;Lie;)V")
    public static final void method166(int arg0, int arg1, int arg2, int arg3, class34 arg4, long arg5, class34 arg6, class34 arg7) {
        class240 var9 = new class240();
        var9.field3758 = arg4;
        var9.field3753 = arg1 * 128 + 64;
        var9.field3754 = arg2 * 128 + 64;
        var9.field3751 = arg3;
        var9.field3752 = arg5;
        var9.field3749 = arg6;
        var9.field3755 = arg7;
        int var10 = 0;
        class116 var11 = class307.field4991[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1787; var12++) {
                class90 var13 = var11.field1782[var12];
                if ((var13.field1402 & 0x400000L) == 4194304L) {
                    int var14 = var13.field1416.method22();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3762 = -var10;
        if (class307.field4991[arg0][arg1][arg2] == null) {
            class307.field4991[arg0][arg1][arg2] = new class116(arg0, arg1, arg2);
        }
        class307.field4991[arg0][arg1][arg2].field1776 = var9;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZILfj;)V")
    private final void method167(boolean arg0, int arg1, class274 arg2) {
        field396++;
        if (arg0 || arg1 != 249) {
            return;
        }
        int var4 = arg2.method1849(255);
        if (this.field398 == null) {
            int var5 = class128.method873(-17034, var4);
            this.field398 = new class58(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method1849(255) == 1;
            int var8 = arg2.method1812(true);
            class137 var9;
            if (var7) {
                var9 = new class287(arg2.method1855(123));
            } else {
                var9 = new class71(arg2.method1833((byte) -104));
            }
            this.field398.method368((long) var8, var9, -90);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
    public final String method168(String arg0, int arg1, int arg2) {
        field404++;
        if (this.field398 == null) {
            return arg0;
        } else if (arg2 == 206) {
            class287 var4 = (class287) this.field398.method371(arg2 - 319, (long) arg1);
            return var4 == null ? arg0 : var4.field4646;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I[Lrg;Z)V")
    public static final void method169(int arg0, class248[] arg1, boolean arg2) {
        field402++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class248 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field4038 == 0) {
                    if (var4.field4068 != null) {
                        method169(arg0, var4.field4068, false);
                    }
                    class109 var5 = (class109) class74.field1192.method371(74, (long) var4.field3968);
                    if (var5 != null) {
                        class297.method2035((byte) 52, var5.field1689, arg0);
                    }
                }
                if (arg0 == 0 && var4.field3906 != null) {
                    class78 var6 = new class78();
                    var6.field1265 = var4.field3906;
                    var6.field1251 = var4;
                    class139.method959((byte) 86, var6);
                }
                if (arg0 == 1 && var4.field3983 != null) {
                    if (var4.field4019 >= 0) {
                        class248 var7 = class281.method1913(var4.field3968, (byte) 86);
                        if (var7 == null || var7.field4068 == null || var7.field4068.length <= var4.field4019 || var7.field4068[var4.field4019] != var4) {
                            continue;
                        }
                    }
                    class78 var8 = new class78();
                    var8.field1265 = var4.field3983;
                    var8.field1251 = var4;
                    class139.method959((byte) 118, var8);
                }
            }
        }
        if (arg2) {
            method169(-28, (class248[]) null, true);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lfj;I)V")
    public final void method170(class274 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1849(arg1 + 30208);
            if (var3 == 0) {
                field399++;
                if (arg1 != -29953) {
                    method165(false, -108);
                    return;
                }
                return;
            }
            this.method167(false, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
    public static void method171(boolean arg0) {
        if (arg0) {
            field405 = null;
        }
        field405 = null;
        field403 = null;
        field394 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)I")
    public final int method172(int arg0, int arg1, int arg2) {
        field407++;
        int var4 = 22 % ((arg1 + 86) / 36);
        if (this.field398 == null) {
            return arg0;
        } else {
            class71 var5 = (class71) this.field398.method371(-112, (long) arg2);
            return var5 == null ? arg0 : var5.field1138;
        }
    }
}
