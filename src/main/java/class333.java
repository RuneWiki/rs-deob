import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class333 {

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lcd;")
    private class69 field5188 = new class69(256);

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Lcd;")
    private class69 field5194 = new class69(256);

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lak;")
    private class172 field5179;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Lak;")
    private class172 field5180;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "[B")
    public static byte[] field5177 = new byte[32896];

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "[Lse;")
    public static class275[] field5192;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "F")
    public static float field5185;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "F")
    public static float field5193;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lsn;")
    public static class145 field5184;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[IIZ)Lom;", line = 7)
    private final class125 method2322(int arg0, int[] arg1, int arg2, boolean arg3) {
        int var5 = (arg2 >>> 12 | (arg2 & 0x30000FFF) << 4) ^ arg0;
        int var6 = var5 | arg2 << 16;
        field5178++;
        long var7 = (long) var6 ^ 0x100000000L;
        class125 var9 = (class125) this.field5194.method451(var7, (byte) 100);
        if (arg3) {
            this.method2330((int[]) null, -117, -81);
        }
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class3 var10 = (class3) this.field5188.method451(var7, (byte) 100);
            if (var10 == null) {
                var10 = class3.method21(this.field5179, arg2, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field5188.method461(-31, var7, var10);
            }
            class125 var11 = var10.method23(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method1212((byte) 115);
                this.field5194.method461(-1, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIZZZI)V", line = 52)
    public static final void method2323(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, int arg6) {
        field5181++;
        if (arg3) {
            field5184 = (class145) null;
        }
        if (arg2 >= arg6) {
            return;
        }
        int var7 = (arg2 + arg6) / 2;
        int var8 = arg2;
        class339 var9 = class340.field5293[var7];
        class340.field5293[var7] = class340.field5293[arg6];
        class340.field5293[arg6] = var9;
        for (int var10 = arg2; var10 < arg6; var10++) {
            if (class318.method2240(arg5, var9, arg1, class340.field5293[var10], arg4, arg0, -84) <= 0) {
                class339 var11 = class340.field5293[var10];
                class340.field5293[var10] = class340.field5293[var8];
                class340.field5293[var8++] = var11;
            }
        }
        class340.field5293[arg6] = class340.field5293[var8];
        class340.field5293[var8] = var9;
        method2323(arg0, arg1, arg2, arg3, arg4, arg5, var8 - 1);
        method2323(arg0, arg1, var8 + 1, false, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([IIII)Lom;", line = 98)
    private final class125 method2324(int[] arg0, int arg1, int arg2, int arg3) {
        field5182++;
        int var5 = ((arg3 & 0x10000FFF) << 4 | arg3 >>> 12) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class125 var9 = (class125) this.field5194.method451(var7, (byte) 100);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class171 var10 = class171.method1267(this.field5180, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class125 var11 = var10.method1268();
            this.field5194.method461(-126, var7, var11);
            int var12 = 6 % ((arg1 + 21) / 51);
            if (arg0 != null) {
                arg0[0] -= var11.field1952.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V", line = 136)
    public static final void method2325(byte arg0, int arg1) {
        class344 var2 = class110.method759(10, arg1, false);
        if (arg0 <= 123) {
            field5192 = (class275[]) null;
        }
        var2.method2384(-27354);
        field5187++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 150)
    public static void method2326(byte arg0) {
        field5177 = null;
        if (arg0 > -43) {
            field5192 = (class275[]) null;
        }
        field5192 = null;
        field5184 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[II)Lom;", line = 168)
    public final class125 method2327(int arg0, int[] arg1, int arg2) {
        if (arg2 > -112) {
            this.method2327(67, (int[]) null, 104);
        }
        field5183++;
        if (this.field5179.method1291(5362) == 1) {
            return this.method2322(arg0, arg1, 0, false);
        } else if (this.field5179.method1299(arg0, (byte) 98) == 1) {
            return this.method2322(0, arg1, arg0, false);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)Lt;", line = 193)
    public static final class339 method2328(byte arg0) {
        class81.field1130 = 0;
        if (arg0 != 55) {
            field5193 = -2.5125709F;
        }
        field5176++;
        return class284.method2042(true);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V", line = 208)
    public static final void method2329() {
        GL var0 = class232.field3716;
        var0.glDisableClientState(32886);
        class232.method1660(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class232.method1673();
        for (int var1 = 0; var1 < class340.field5292[0].length; var1++) {
            class206 var2 = class340.field5292[0][var1];
            if (var2.field3379 >= 0 && class189.method1402(class170.field2814.method944(var2.field3379, true), 4)) {
                var0.glColor4fv(class54.method347((byte) -122, var2.field3392), 0);
                float var3 = 201.5F - (var2.field3405 ? 1.0F : 0.5F);
                var2.method1499(class324.field5032, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class232.method1648();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class232.method1681();
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([III)Lom;", line = 241)
    public final class125 method2330(int[] arg0, int arg1, int arg2) {
        field5186++;
        if (arg1 == ~this.field5180.method1291(5362)) {
            return this.method2324(arg0, 58, arg2, 0);
        } else if (this.field5180.method1299(arg2, (byte) 52) == 1) {
            return this.method2324(arg0, arg1 ^ 0x71, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field5177[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field5191 = -1;
        field5192 = new class275[29];
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lak;Lak;)V", line = 303)
    public class333(class172 arg0, class172 arg1) {
        this.field5179 = arg1;
        this.field5180 = arg0;
    }
}
