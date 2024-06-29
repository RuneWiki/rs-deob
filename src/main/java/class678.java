import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class678 {

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Ldj;")
    private class362 field9303 = new class362(256);

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "Ldj;")
    private class362 field9305 = new class362(256);

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Lbt;")
    private class48 field9297;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Lbt;")
    private class48 field9294;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "[Z")
    public static boolean[] field9296 = new boolean[8];

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "Lhj;")
    public static class596 field9299 = new class596(37, -1);

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "Z")
    public static boolean field9298;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public static final void method3815(int arg0) {
        class415.field5434 = null;
        class534.field7524 = null;
        class328.field4056 = -1;
        class594.field8080 = null;
        field9301++;
        class619.field8330 = null;
        class340.field4250 = null;
        class60.field800 = -1;
        class727.field10184 = -1;
        class677.field9286 = null;
        int var1 = 24 / ((arg0 + 37) / 37);
        class434.field5738 = null;
        class769.field10561 = -1;
        class571.field7835.method2935(-114);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[IB)Laia;")
    public final class242 method3816(int arg0, int[] arg1, byte arg2) {
        int var4 = 36 % ((-arg2 - 62) / 54);
        field9300++;
        if (this.field9297.method445(-98) == 1) {
            return this.method3820(-12873, arg0, 0, arg1);
        } else if (this.field9297.method431(4, arg0) == 1) {
            return this.method3820(-12873, 0, arg0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
    public static void method3817(int arg0) {
        field9296 = null;
        field9299 = null;
        if (arg0 <= 119) {
            method3815(-120);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([IIII)Laia;")
    private final class242 method3818(int[] arg0, int arg1, int arg2, int arg3) {
        field9295++;
        int var5 = arg1 ^ (arg3 >>> 12 | (arg3 & 0x60000FFF) << 4);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class242 var9 = (class242) this.field9305.method2121(73, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class420 var10 = class420.method2506(this.field9294, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            class242 var11 = var10.method2509();
            this.field9305.method2112(var11, (byte) 6, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field2851.length;
            }
            int var12 = -26 % ((arg2 + 38) / 53);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[II)Laia;")
    public final class242 method3819(int arg0, int[] arg1, int arg2) {
        if (arg2 != 24877) {
            this.field9303 = null;
        }
        field9306++;
        if (this.field9294.method445(arg2 - 24965) == 1) {
            return this.method3818(arg1, arg0, 103, 0);
        } else if (this.field9294.method431(4, arg0) == 1) {
            return this.method3818(arg1, 0, arg2 ^ 0xFFFF9EA8, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(III[I)Laia;")
    private final class242 method3820(int arg0, int arg1, int arg2, int[] arg3) {
        field9304++;
        int var5 = arg1 ^ (arg2 << 4 & 0xFFF8 | arg2 >>> 12);
        int var6 = var5 | arg2 << 16;
        if (arg0 != -12873) {
            field9296 = null;
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class242 var9 = (class242) this.field9305.method2121(60, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class527 var10 = (class527) this.field9303.method2121(51, var7);
            if (var10 == null) {
                var10 = class527.method3156(this.field9297, arg2, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field9303.method2112(var10, (byte) 6, var7);
            }
            class242 var11 = var10.method3148(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method2219(13630);
                this.field9305.method2112(var11, (byte) 6, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Les;I)V")
    public static final void method3821(class403 arg0, int arg1) {
        field9302++;
        if (arg1 < 90) {
            field9299 = null;
        }
        byte[] var2 = new byte[24];
        if (class765.field10540 != null) {
            try {
                class765.field10540.method2759(70, 0L);
                class765.field10540.method2760(91, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method2355(var2, 24, (byte) 74, 0);
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lbt;Lbt;)V")
    public class678(class48 arg0, class48 arg1) {
        this.field9297 = arg1;
        this.field9294 = arg0;
    }
}
