import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class151 extends class207 {

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "[I")
    public static int[] field2055 = new int[250];

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "Llm;")
    public static class347 field2056;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILjava/awt/Component;Lwd;II)Lpo;")
    public static final class202 method945(int arg0, Component arg1, class36 arg2, int arg3, int arg4) {
        field2057++;
        if (class9.field153 == arg3) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class202 var5 = (class202) Class.forName("ub").getDeclaredConstructor().newInstance();
                var5.field2736 = arg0;
                var5.field2718 = new int[(class407.field6043 ? 2 : 1) * 256];
                var5.method837(arg1);
                var5.field2731 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field2731 > 16384) {
                    var5.field2731 = 16384;
                }
                var5.method836(var5.field2731);
                if (class253.field3496 > 0 && class278.field4053 == null) {
                    class278.field4053 = new class400();
                    class278.field4053.field5966 = arg2;
                    arg2.method242(class278.field4053, (byte) -102, class253.field3496);
                }
                if (class278.field4053 != null) {
                    if (class278.field4053.field5967[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class278.field4053.field5967[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class412 var6 = new class412(arg2, arg4);
                    var6.field2736 = arg0;
                    var6.field2718 = new int[(class407.field6043 ? 2 : 1) * 256];
                    var6.method837(arg1);
                    var6.field2731 = 16384;
                    var6.method836(var6.field2731);
                    if (class253.field3496 > 0 && class278.field4053 == null) {
                        class278.field4053 = new class400();
                        class278.field4053.field5966 = arg2;
                        arg2.method242(class278.field4053, (byte) -102, class253.field3496);
                    }
                    if (class278.field4053 != null) {
                        if (class278.field4053.field5967[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class278.field4053.field5967[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class202();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public static final void method946(int arg0) {
        field2052++;
        if (!class263.field3821) {
            return;
        }
        int var1 = -31 / ((arg0 - 37) / 52);
        class394 var2 = class388.method2492((byte) 28, class306.field4506, class442.field6471);
        if (var2 != null && var2.field5746 != null) {
            class192 var3 = new class192();
            var3.field2578 = var2.field5746;
            var3.field2566 = var2;
            class123.method783(var3);
        }
        class263.field3821 = false;
        class71.field995 = -1;
        class407.method2621(var2, 15);
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V")
    public static void method947(int arg0) {
        field2055 = null;
        if (arg0 != 256) {
            method946(-18);
        }
        field2056 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLnj;)V")
    public static final void method948(byte arg0, class228 arg1) {
        field2053++;
        int var2 = 77 % ((arg0 - 9) / 61);
        for (int var3 = 0; var3 < class57.field774; var3++) {
            int var4 = arg1.method1327((byte) -64);
            int var5 = arg1.method1343(255);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class339.field4885[var4] != null) {
                class339.field4885[var4].field1242 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
    public static final void method949(int arg0) {
        field2054++;
        class306 var1 = (class306) class198.field2639.method332(-2130841184);
        int var2 = 60 / ((arg0 + 17) / 52);
        while (var1 != null) {
            if (var1.field4509 == -1) {
                var1.field4500 = 0;
                class99.method676(0, var1);
            } else {
                var1.method322(11);
            }
            var1 = (class306) class198.field2639.method343((byte) -121);
        }
    }
}
