import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class36 {

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "I")
    public static int field479 = 20;

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "I")
    public static int field480 = 0;

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "La;")
    public static class1 field481 = class3.method36("download", -94);

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(I)V", line = 38)
    public static void method231(int arg0) {
        field481 = null;
        if (arg0 <= 13) {
            method232(null, true, (byte) 34);
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "([BZB)Ljava/lang/Object;", line = 80)
    public static final Object method232(byte[] arg0, boolean arg1, byte arg2) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class41.field522) {
            try {
                class3 var3 = (class3) Class.forName("ca").getDeclaredConstructor().newInstance();
                var3.method35(arg0, (byte) -69);
                return var3;
            } catch (Throwable var5) {
                class41.field522 = true;
            }
        }
        if (arg2 == 121) {
            return arg1 ? class2.method30(2889, arg0) : arg0;
        } else {
            return (Object) null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(I[B)V", line = 117)
    public static final void method233(int arg0, byte[] arg1) {
        class39 var2 = new class39(arg1);
        var2.field493 = arg1.length - 2;
        class30.field409 = var2.method253(false);
        class13.field123 = new byte[class30.field409][];
        class2.field22 = new int[class30.field409];
        class30.field410 = new int[class30.field409];
        class29.field403 = new int[class30.field409];
        class30.field411 = new int[class30.field409];
        var2.field493 = arg1.length - class30.field409 * 8 - 7;
        class4.field40 = var2.method253(false);
        class31.field421 = var2.method253(false);
        int var3 = (var2.method245(arg0 - 23264) & 0xFF) + 1;
        for (int var4 = 0; var4 < class30.field409; var4++) {
            class2.field22[var4] = var2.method253(false);
        }
        for (int var5 = 0; var5 < class30.field409; var5++) {
            class30.field411[var5] = var2.method253(false);
        }
        for (int var6 = 0; var6 < class30.field409; var6++) {
            class29.field403[var6] = var2.method253(false);
        }
        for (int var7 = 0; var7 < class30.field409; var7++) {
            class30.field410[var7] = var2.method253(false);
        }
        var2.field493 = arg1.length + 3 - var3 * 3 - class30.field409 * 8 - 7;
        class27.field378 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class27.field378[var8] = var2.method255(-6883);
            if (class27.field378[var8] == 0) {
                class27.field378[var8] = 1;
            }
        }
        if (arg0 != 23140) {
            field481 = null;
        }
        var2.field493 = 0;
        for (int var9 = 0; var9 < class30.field409; var9++) {
            int var10 = class29.field403[var9];
            int var11 = class30.field410[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class13.field123[var9] = var13;
            int var14 = var2.method245(-128);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method254(class23.method131(arg0, 24164));
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method254(1024);
                    }
                }
            }
        }
    }
}
