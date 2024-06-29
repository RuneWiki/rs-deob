import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public abstract class class27 {

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "[[I")
    public static int[][] field421 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)V", line = 5)
    public static void method260(boolean arg0) {
        field421 = null;
        if (arg0) {
            method263(null, 6);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V", line = 15)
    public static final void method261(int arg0) {
        if (arg0 <= 69) {
            method262(-20);
        }
        class408[] var1 = class731.field10237;
        synchronized (class731.field10237) {
            int var2 = 0;
            while (true) {
                if (var2 >= class731.field10237.length) {
                    break;
                }
                class731.field10237[var2] = new class408();
                class772.field10618[var2] = 0;
                var2++;
            }
        }
        field420++;
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)I", line = 37)
    public static final int method262(int arg0) {
        if (arg0 == 10) {
            field418++;
            return class538.field7580;
        } else {
            return 61;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 48)
    public static final int method263(String arg0, int arg1) {
        field419++;
        if (!class372.field4687.field9271) {
            return -1;
        } else if (class664.field9124.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class352.method2076(arg0, false);
            if (var2 == null) {
                return -1;
            }
            String var3 = class652.field8998 + var2;
            if (!class235.field2788.method451("", 16, var3)) {
                return -1;
            } else if (!class235.field2788.method444((byte) -24, var3)) {
                return class235.field2788.method435(0, var3);
            } else if (arg1 > -24) {
                return -74;
            } else {
                byte[] var4 = class235.field2788.method436(var3, -3637, "");
                Object var5 = null;
                File var6;
                try {
                    var6 = class125.method967(1, var2);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class186.method1238(var6, (byte) -71);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class372.field4687.method3802(-500006096, var4, var6);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class85.method784(var6, arg0, 1);
                return 100;
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIIII)V", line = 147)
    public static final void method265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field422++;
        if (arg3 >= class471.field6572 && class223.field2604 >= arg5 && class187.field2268 <= arg1 && class461.field6480 >= arg2) {
            class557.method3251((byte) 92, arg0, arg7, arg5, arg3, arg1, arg6, arg2);
        } else {
            class455.method2756((byte) 109, arg6, arg3, arg5, arg2, arg7, arg1, arg0);
        }
        int var8 = -113 % ((arg4 + 50) / 58);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZIFIIFF[FIF)V")
    public abstract void method264(int arg0, boolean arg1, int arg2, float arg3, int arg4, int arg5, float arg6, float arg7, float[] arg8, int arg9, float arg10);
}
