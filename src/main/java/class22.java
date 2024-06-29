import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class22 {

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "Lka;")
    public static class408 field282 = new class408(64);

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    public static int field284 = 0;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "Lvg;")
    public static class108 field286 = null;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public int field276;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "Lsg;")
    public static class267 field285;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vq", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field288;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "[[[I")
    public static int[][][] field274;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public static final void method127(int arg0) {
        field287++;
        try {
            Method var1 = (field288 == null ? (field288 = method135("java.lang.Runtime")) : field288).getMethod("availableProcessors");
            if (arg0 == -17608 && var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class54.field686 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIII)V")
    public static final void method128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class106.field1499 = arg3;
        if (arg1 != -20240) {
            field274 = null;
        }
        class313.field4250 = arg5;
        class441.field6197 = arg0;
        field277++;
        class284.field3865 = arg2;
        class46.field590 = arg4;
        if (class284.field3865 >= 100) {
            int var6 = class313.field4250 * 128 + 64;
            int var7 = class106.field1499 * 128 + 64;
            int var8 = class50.method408(class343.field4623, var6, var7, 16) - class441.field6197;
            int var9 = var6 - class63.field874;
            int var10 = var8 - class104.field1433;
            int var11 = var7 - class375.field5213;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class389.field5410 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class86.field1208 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            if (class389.field5410 < 1024) {
                class389.field5410 = 1024;
            }
            class103.field1426 = 0;
            if (class389.field5410 > 3072) {
                class389.field5410 = 3072;
            }
        }
        class26.field337 = 2;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)I")
    public final int method129(int arg0) {
        if (arg0 == 2) {
            field279++;
            return this.field276 & 0x3FFF;
        } else {
            return -31;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)V")
    public final void method130(boolean arg0) {
        if (!arg0) {
            this.method134(-120, 72, (byte) -71, 40);
        }
        this.field276 &= 0x3FFF;
        field283++;
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V")
    public static void method131(int arg0) {
        field286 = null;
        field285 = null;
        field282 = null;
        field274 = null;
        if (arg0 != 0) {
            method128(-39, 58, 102, -110, -15, -109);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
    public final void method132(int arg0, int arg1) {
        field278++;
        this.field276 = arg0;
        int var3 = 120 / ((-arg1 - 88) / 34);
        this.field281 = 0;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lti;BI)Lha;")
    public static final class48 method133(class5 arg0, byte arg1, int arg2) {
        int var3 = 48 / ((-arg1 - 32) / 59);
        field280++;
        class48 var4;
        if (class304.field4144 == null) {
            var4 = new class48();
        } else {
            var4 = class304.field4144;
            class304.field4144 = class304.field4144.field608;
            class277.field3783--;
            var4.field608 = null;
        }
        var4.field613 = arg2;
        var4.field617 = arg0;
        return var4;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIBI)Z")
    public final boolean method134(int arg0, int arg1, byte arg2, int arg3) {
        field275++;
        int var5 = this.field281;
        if (this.field276 == arg0 && this.field281 == 0) {
            return false;
        }
        if (arg2 > -115) {
            field274 = null;
        }
        boolean var8;
        if (this.field281 == 0) {
            if (this.field276 < arg0 && this.field276 + arg3 >= arg0 || arg0 < this.field276 && arg0 >= (this.field276 - arg3)) {
                this.field276 = arg0;
                return false;
            }
            var8 = true;
        } else if (this.field281 > 0 && this.field276 < arg0) {
            int var6 = this.field281 * this.field281 / (arg3 * 2);
            int var7 = this.field276 + var6;
            if (var7 < arg0 && this.field276 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field281 < 0 && arg0 < this.field276) {
            int var9 = this.field281 * this.field281 / (arg3 * 2);
            int var10 = this.field276 - var9;
            if (arg0 < var10 && var10 <= this.field276) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (this.field276 >= arg0) {
                this.field281 -= arg3;
                if (arg1 != 0 && this.field281 < -arg1) {
                    this.field281 = -arg1;
                }
            } else {
                this.field281 += arg3;
                if (arg1 != 0 && this.field281 > arg1) {
                    this.field281 = arg1;
                }
            }
            if (this.field281 != var5) {
                int var11 = this.field281 * this.field281 / (arg3 * 2);
                if (this.field276 >= arg0) {
                    if (this.field276 > arg0 && (this.field276 - var11) < arg0) {
                        this.field281 = var5;
                    }
                } else if (arg0 < (this.field276 + var11)) {
                    this.field281 = var5;
                }
            }
        } else if (this.field281 > 0) {
            this.field281 -= arg3;
            if (this.field281 < 0) {
                this.field281 = 0;
            }
        } else {
            this.field281 += arg3;
            if (this.field281 > 0) {
                this.field281 = 0;
            }
        }
        this.field276 += this.field281 + var5 >> 1;
        return var8;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method135(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
