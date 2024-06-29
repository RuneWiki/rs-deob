import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class18 extends class165 implements class199 {

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Z")
    private boolean field492 = false;

    @OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Loe;")
    private class183 field493 = new class183();

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    private int field509 = 4096;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    private int field510 = 4096;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "Lwaa;")
    private class652 field506 = new class652(4);

    @OriginalMember(owner = "client!l", name = "K", descriptor = "Z")
    private boolean field513 = false;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "Lq;")
    private class394 field511;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "[I")
    private static int[] field494 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!l", name = "x", descriptor = "[B")
    private static byte[] field500 = new byte[8191];

    @OriginalMember(owner = "client!l", name = "u", descriptor = "[I")
    public static int[] field497 = field494;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "[I")
    public static int[] field495 = new int[6];

    @OriginalMember(owner = "client!l", name = "z", descriptor = "[I")
    private static int[] field502 = new int[8191];

    @OriginalMember(owner = "client!l", name = "y", descriptor = "[S")
    private static short[] field501 = new short[8191];

    @OriginalMember(owner = "client!l", name = "t", descriptor = "[F")
    private static float[] field496 = new float[20];

    @OriginalMember(owner = "client!l", name = "w", descriptor = "[I")
    private static int[] field499 = new int[8191];

    @OriginalMember(owner = "client!l", name = "A", descriptor = "[F")
    private static float[] field503 = field496;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "[I")
    private static int[] field505 = field494;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "[I")
    private static int[] field504 = field494;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Lm;")
    private class174 field498;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "Lta;")
    private class194 field507;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "Lq;")
    private class394 field508;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "[Lqa;")
    private class225[] field512;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)Le;", line = 4)
    public final class493 method210(int arg0) {
        class174 var2 = new class174(this, arg0);
        this.field493.method1129(var2, 262144);
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "()Z", line = 10)
    public final boolean method211() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILua;II)V", line = 13)
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class616 arg6, int arg7, int arg8) {
        this.method276(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lua;", line = 16)
    public final class616 method213(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class381(this, this.field498, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()Z", line = 22)
    public final boolean method215() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lpga;Z)Lf;", line = 26)
    public final class701 method216(class495 arg0, boolean arg1) {
        int[] var3 = arg0.field6905;
        byte[] var4 = arg0.field6907;
        int var5 = arg0.field6899;
        int var6 = arg0.field6906;
        class701 var7;
        if (arg1 && arg0.field6902 == null) {
            var7 = new class272(this, this.field498, var3, var4, 0, arg0.field6899, arg0.field6899, arg0.field6906);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field6902;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class619(this, this.field498, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field6905[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class619(this, this.field498, var9, 0, arg0.field6899, arg0.field6899, arg0.field6906);
                } else {
                    var7 = new class462(this, this.field498, var9, 0, arg0.field6899, arg0.field6899, arg0.field6906);
                }
            }
        }
        var7.method894(arg0.field6901, arg0.field6900, arg0.field6903, arg0.field6904);
        return var7;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "()Z", line = 101)
    public final boolean method218() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 105)
    public final class37 method220(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class254(this, this.field498, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V", line = 111)
    public final void method222(int arg0) {
        this.field512[arg0].method1366();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lso;I)V", line = 114)
    public final void method223(class436 arg0, int arg1) {
        this.method281(arg0, false);
        this.method282().method1369(this, field504, field499, field502, field501, arg0.field6248.method872(true));
    }

    @OriginalMember(owner = "client!l", name = "o", descriptor = "()Z", line = 118)
    public final boolean method224() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "w", descriptor = "()Z", line = 121)
    public final boolean method225() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "A", descriptor = "()Z", line = 124)
    public final boolean method226() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V", line = 581)
    public class18(Canvas arg0, class212 arg1) {
        super(arg1);
        try {
            if (!class602.method3469(6298, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class542.method3177(-110);
                this.method235(super.field2023, 0, 0);
                class357.method2012(false, true, (byte) 111);
                this.field513 = true;
                this.field511 = new class92();
                this.method262(new class92());
                this.method252(1);
                this.method222(0);
                if (arg0 != null) {
                    this.method257(arg0);
                    this.method294(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "l", descriptor = "()V", line = 129)
    public final void method227() {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lso;)V", line = 132)
    public final void method228(class436 arg0) {
        this.method281(arg0, false);
        this.method282().method1369(this, field504, field499, field502, field501, arg0.field6248.method872(true));
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V", line = 137)
    public final void method230(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lf;", line = 140)
    public final class701 method231(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class619(this, this.field498, arg0, arg1, arg2, arg3) : new class462(this, this.field498, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()I", line = 148)
    public final int method232() {
        return 4;
    }

    @OriginalMember(owner = "client!l", name = "k", descriptor = "()Z", line = 151)
    public final boolean method233() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "WA", descriptor = "()V", line = 154)
    private final void method234() {
        System.gc();
        System.runFinalization();
        class542.method3178(false);
    }

    @OriginalMember(owner = "client!l", name = "r", descriptor = "()Z", line = 161)
    public final boolean method237() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "s", descriptor = "()Lq;", line = 166)
    public final class394 method238() {
        return this.field508;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 170)
    public final void method240(Rectangle[] arg0, int arg1) throws class365 {
        if (this.field507 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field507.method1191(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lf;Z)V", line = 181)
    public final void method241(class701 arg0, boolean arg1) {
        if (arg0 instanceof class462) {
            this.method280((class462) arg0);
        } else if (arg0 instanceof class619) {
            this.method279((class619) arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z", line = 192)
    private final boolean method242(short arg0) {
        synchronized (this) {
            class352 var3 = super.field2023.method397(arg0, (byte) 84);
            if (var3 == null) {
                return false;
            } else {
                this.method270(arg0, var3.field4703, var3.field4704, var3.field4705, var3.field4706, var3.field4711, var3.field4695, var3.field4699, var3.field4707, var3.field4713, var3.field4700, var3.field4701, var3.field4698);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Lul;", line = 204)
    public final class530 method243(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class561(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "t", descriptor = "()Z", line = 211)
    public final boolean method247() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "B", descriptor = "()V", line = 216)
    public final void method250() {
        this.method294(this.field507.field2358);
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V", line = 220)
    public final void method252(int arg0) {
        this.field514 = arg0;
        this.field512 = new class225[this.field514];
        for (int var2 = 0; var2 < this.field514; ++var2) {
            this.field512[var2] = new class225(this, this.field509, this.field510);
        }
    }

    @OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z", line = 233)
    private final boolean method253(short arg0) {
        class212 var2 = super.field2023;
        synchronized (super.field2023) {
            if (!super.field2023.method395(arg0, 28576)) {
                return false;
            } else {
                class352 var4 = super.field2023.method397(arg0, (byte) -124);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field4712) {
                        var6 = super.field2023.method400(128, true, 128, (byte) -73, arg0, 0.7F);
                    } else {
                        var6 = super.field2023.method392(true, 128, arg0, 128, -127, 0.7F);
                    }
                    this.method267(arg0, var4.field4703, var4.field4704, var4.field4705, var4.field4706, var4.field4711, var4.field4695, var4.field4699, var4.field4707, var4.field4713, var4.field4700, var4.field4701, var4.field4698, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V", line = 256)
    public final void method254(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V", line = 258)
    public final void method255(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 261)
    public final void method256(Canvas arg0) {
        if (this.field507.field2358 == arg0) {
            this.method294((Canvas) null);
        }
        class194 var2 = (class194) this.field506.method3678((long) arg0.hashCode(), -122);
        if (var2 != null) {
            var2.method3045(true);
            var2.method1188();
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 275)
    public final void method257(Canvas arg0) {
        class194 var2 = (class194) this.field506.method3678((long) arg0.hashCode(), -119);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class194 var5 = new class194(this, arg0);
            this.field506.method3670((long) arg0.hashCode(), var5, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lgda;[Lpga;Z)Lla;", line = 295)
    public final class419 method258(class50 arg0, class495[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field6899;
            var5[var7] = arg1[var7].field6906;
            if (arg1[var7].field6902 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class169(this, this.field498, arg0, arg1, (class701[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class278(this, this.field498, arg0, arg1, (class701[]) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIIII)V", line = 332)
    public final void method259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method308(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lq;)V", line = 337)
    public final void method262(class394 arg0) {
        this.field508 = arg0;
        this.method266(arg0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 341)
    public final void method263(int arg0) {
        class542.method3178(false);
        this.method272(arg0);
        for (class174 var2 = (class174) this.field493.method1132((byte) -89); var2 != null; var2 = (class174) this.field493.method1134(8446)) {
            var2.method1100();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Le;)V", line = 355)
    public final void method265(class493 arg0) {
        this.field498 = (class174) arg0;
        this.method298(arg0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()Z", line = 363)
    public final boolean method269() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(II)I", line = 370)
    public final int method271(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lkk;IIII)Lda;", line = 375)
    public final class55 method274(class173 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class535(this, this.field498, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 380)
    public final void method275(Canvas arg0) {
        class194 var2 = (class194) this.field506.method3678((long) arg0.hashCode(), -128);
        Dimension var3 = arg0.getSize();
        var2.method1189(arg0, var3.width, var3.height);
        if (arg0 != null && this.field507.field2358 == arg0) {
            this.method294(arg0);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lcaa;)V", line = 390)
    public final void method277(class275 arg0) {
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIII)V", line = 393)
    public final void method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method290(arg0, arg1, arg2, arg4, arg5);
        this.method290(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method310(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method310(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lso;Z)V", line = 404)
    private final void method281(class436 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class29 var8 = (class29) arg0.field6248.method868((byte) 108); var8 != null; var8 = (class29) arg0.field6248.method869(true)) {
            field504[var3++] = var8.field624;
            field504[var3++] = var8.field623;
            field504[var3++] = var8.field625;
            field499[var4++] = var8.field618;
            field501[var6++] = (short) var8.field626;
            field502[var5++] = var8.field622;
            if (arg1) {
                field500[var7++] = var8.field619;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "D", descriptor = "()Lqa;", line = 437)
    public final class225 method282() {
        for (int var1 = 0; var1 < this.field514; ++var1) {
            if (this.field512[var1].field2918 == Thread.currentThread()) {
                return this.field512[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "j", descriptor = "()V", line = 449)
    public final void method283() {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Lul;)V", line = 454)
    public final void method284(int arg0, class530[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field505[var3++] = arg1[var4].method3118(34037);
            field505[var3++] = arg1[var4].method3119(3553);
            field505[var3++] = arg1[var4].method3115(-30190);
            field505[var3++] = arg1[var4].method3122(-11184);
            field503[var4] = arg1[var4].method3117(false);
            field505[var3++] = arg1[var4].method3120(true);
        }
        this.method219(arg0, field505, field503);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V", line = 472)
    public final void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "x", descriptor = "()V", line = 476)
    public final void method286() {
        if (!this.field492) {
            this.field512 = null;
            this.field507 = null;
            this.field498 = null;
            this.field511 = null;
            this.field506.method3674((byte) -116);
            for (class174 var1 = (class174) this.field493.method1132((byte) -104); var1 != null; var1 = (class174) this.field493.method1134(8446)) {
                var1.method1099();
            }
            this.field493.method1131((byte) -116);
            this.method244();
            if (this.field513) {
                class54.method567(true, false, true);
                this.field513 = false;
            }
            this.method234();
            class542.method3176(true);
            this.field492 = true;
        }
    }

    @OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;", line = 507)
    private final Object method288() {
        return new class615(this);
    }

    @OriginalMember(owner = "client!l", name = "q", descriptor = "()V", line = 515)
    public final void method293() throws class365 {
        if (this.field507 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field507.method1187();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 525)
    public final void method294(Canvas arg0) {
        if (arg0 != null) {
            class194 var2 = (class194) this.field506.method3678((long) arg0.hashCode(), -121);
            this.field507 = var2;
            this.method268(var2);
        } else {
            this.field507 = null;
            this.method268((class194) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V", line = 539)
    public final void method295(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V", line = 541)
    public final void method296(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "i", descriptor = "()Z", line = 547)
    public final boolean method299() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "()V", line = 552)
    public final void method302() {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)Lcaa;", line = 555)
    public final class275 method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lf;", line = 558)
    public final class701 method304(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class619(this, this.field498, arg0, arg1) : new class462(this, this.field498, arg0, arg1);
    }

    @OriginalMember(owner = "client!l", name = "u", descriptor = "()Lq;", line = 564)
    public final class394 method305() {
        return new class92();
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I", line = 568)
    public final int method306(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 607)
    public final void method307(int arg0) {
        this.field512[arg0].method1372();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lf;", line = 624)
    public final class701 method311(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class619(this, this.field498, arg0, arg1, arg2, arg3, arg4) : new class462(this, this.field498, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class619(this, this.field498, arg0, arg1, arg2, arg3, arg4) : new class462(this, this.field498, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lcaa;Lcaa;FLcaa;)Lcaa;", line = 660)
    public final class275 method313(class275 arg0, class275 arg1, float arg2, class275 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "()Lik;", line = 663)
    public final class191 method314() {
        return new class191(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!l", name = "n", descriptor = "()Lq;", line = 669)
    public final class394 method315() {
        return this.field511;
    }

    @OriginalMember(owner = "client!l", name = "C", descriptor = "()Z", line = 672)
    public final boolean method316() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "z", descriptor = "()Z", line = 679)
    public final boolean method317() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "m", descriptor = "()Z", line = 682)
    public final boolean method318() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V", line = 692)
    public final void method319(int[] arg0) {
        Dimension var2 = this.field507.field2358.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!l", name = "p", descriptor = "()V", line = 700)
    public final void method321() {
    }

    @OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V", line = 707)
    protected final synchronized void finalize() {
        this.method1047(1);
        if (this.nativeid != 0L) {
            class542.method3175(this, 0);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V", line = 722)
    public final void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method282().method1370(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "y", descriptor = "()V", line = 725)
    public final void method328() {
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
    public final native int method214();

    @OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
    public final native boolean method217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
    private final native void method219(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
    public final native void method221(boolean arg0);

    @OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
    public final native void method229(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lfa;II)V")
    private final native void method235(class212 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
    public final native void method236(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
    public final native void method239(float arg0);

    @OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
    private final native void method244();

    @OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILua;II)V")
    public final native void method245(int arg0, class616 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
    public final native void method246();

    @OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
    public final native void method248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
    public final native void method249();

    @OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
    public final native void method251(int[] arg0);

    @OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
    public final native int method260();

    @OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
    public final native void method261(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
    public final native int[] method264();

    @OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lq;)V")
    private final native void method266(class394 arg0);

    @OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method267(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lta;)V")
    private final native void method268(class194 arg0);

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method270(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
    private final native void method272(int arg0);

    @OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
    public final native void method273(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILua;II)V")
    private final native void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class616 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lt;)V")
    private final native void method279(class619 arg0);

    @OriginalMember(owner = "client!l", name = "q", descriptor = "(Lva;)V")
    private final native void method280(class462 arg0);

    @OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
    public final native int method287();

    @OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
    public final native int method289();

    @OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
    public final native void method290(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
    public final native void method291();

    @OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
    public final native void method292(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
    public final native void method297(int arg0, int arg1);

    @OriginalMember(owner = "client!l", name = "EA", descriptor = "(Le;)V")
    private final native void method298(class493 arg0);

    @OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
    public final native void method300(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
    public final native void method301(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
    private final native void method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
    public final native void method309(boolean arg0);

    @OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
    public final native void method310(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
    public final native void method312(int arg0);

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
    public final native void method320(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
    public final native void method322(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
    public final native void method323(int arg0);

    @OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
    public final native void method324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
    public final native int[] method325(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
    public final native int method327();

    @OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
    public final native void method329(int arg0, int arg1, int arg2, int[] arg3);
}
