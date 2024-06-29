import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class class135 {

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "Lqd;")
    public static class40 field2295 = class147.method1106("mapfunction", (byte) -90);

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field2294 = 0;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public int field2293;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public int field2297;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "Ljava/awt/Image;")
    public Image field2287;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "[I")
    public int[] field2291;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 19)
    public final void method997(int arg0) {
        field2296++;
        if (arg0 != 9101) {
            this.field2291 = (int[]) null;
        }
        class115.method871(this.field2291, this.field2293, this.field2297);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)V", line = 35)
    public static final void method998(int arg0, byte arg1) {
        field2290++;
        if (arg0 == -1 || !class293.field4917[arg0]) {
            return;
        }
        class158.field2644.method1666((byte) -48, arg0);
        if (class44.field845[arg0] == null) {
            return;
        }
        int var2 = -45 / ((arg1 + 6) / 32);
        boolean var3 = true;
        for (int var4 = 0; var4 < class44.field845[arg0].length; var4++) {
            if (class44.field845[arg0][var4] != null) {
                if (class44.field845[arg0][var4].field3525 == 2) {
                    var3 = false;
                } else {
                    class44.field845[arg0][var4] = null;
                }
            }
        }
        if (var3) {
            class44.field845[arg0] = null;
        }
        class293.field4917[arg0] = false;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)I", line = 78)
    public static final int method999(int arg0, int arg1, int arg2) {
        if (arg1 <= 54) {
            method1000(-58);
        }
        field2289++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V", line = 126)
    public static void method1000(int arg0) {
        field2295 = null;
        if (arg0 != -2986) {
            method999(40, -83, 6);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB[II[Ljava/lang/Object;)V", line = 147)
    public static final void method1001(int arg0, byte arg1, int[] arg2, int arg3, Object[] arg4) {
        if (arg1 != -1) {
            field2294 = -70;
        }
        field2298++;
        if (arg0 >= arg3) {
            return;
        }
        int var5 = arg0;
        int var6 = (arg0 + arg3) / 2;
        int var7 = arg2[var6];
        arg2[var6] = arg2[arg3];
        arg2[arg3] = var7;
        Object var8 = arg4[var6];
        arg4[var6] = arg4[arg3];
        arg4[arg3] = var8;
        for (int var9 = arg0; var9 < arg3; var9++) {
            if ((var9 & 0x1) + var7 > arg2[var9]) {
                int var10 = arg2[var9];
                arg2[var9] = arg2[var5];
                arg2[var5] = var10;
                Object var11 = arg4[var9];
                arg4[var9] = arg4[var5];
                arg4[var5++] = var11;
            }
        }
        arg2[arg3] = arg2[var5];
        arg2[var5] = var7;
        arg4[arg3] = arg4[var5];
        arg4[var5] = var8;
        method1001(arg0, (byte) -1, arg2, var5 - 1, arg4);
        method1001(var5 + 1, (byte) -1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lrb;I)Lqd;", line = 201)
    public static final class40 method1002(class213 arg0, int arg1) {
        field2286++;
        if (class22.method168(client.method1720(arg0), arg1 - 1556662293) == arg1) {
            return null;
        } else if (arg0.field3531 == null || arg0.field3531.method364(-91).method350(true) == 0) {
            return class126.field2176 ? class52.field1015 : null;
        } else {
            return arg0.field3531;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IJ)V", line = 225)
    public static final void method1003(int arg0, long arg1) {
        field2288++;
        if (arg0 >= -24 || arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class233.field3844; var3++) {
            if (class2.field20[var3] == arg1) {
                class233.field3844--;
                class52.field1000++;
                for (int var4 = var3; var4 < class233.field3844; var4++) {
                    class15.field242[var4] = class15.field242[var4 + 1];
                    class72.field1277[var4] = class72.field1277[var4 + 1];
                    class237.field3898[var4] = class237.field3898[var4 + 1];
                    class2.field20[var4] = class2.field20[var4 + 1];
                    class268.field4466[var4] = class268.field4466[var4 + 1];
                    class298.field4986[var4] = class298.field4986[var4 + 1];
                }
                class166.field2754 = class60.field1152;
                class19.field295.method1464(106, 0);
                class19.field295.method241(arg1, 109);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 271)
    protected class135() {
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method548(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public abstract void method549(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method547(int arg0, int arg1, int arg2, Component arg3);
}
