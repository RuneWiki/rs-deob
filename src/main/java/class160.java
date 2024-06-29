import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public abstract class class160 {

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field2281 = 50;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "[I")
    public static int[] field2271 = new int[field2281];

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2270 = -1;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "[I")
    public static int[] field2275 = new int[field2281];

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "[I")
    public static int[] field2272 = new int[field2281];

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "[I")
    public static int[] field2274 = new int[field2281];

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field2282 = new String[field2281];

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "[I")
    public static int[] field2276 = new int[field2281];

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "[I")
    public static int[] field2288 = new int[field2281];

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "[I")
    public static int[] field2268 = new int[field2281];

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Ldj;")
    public static class143 field2273 = new class143(64);

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "D")
    public static double field2289 = -1.0D;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field2290 = 0;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public static int field2292 = 0;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2293 = "Use";

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public int field2284;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public int field2285;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Ljava/awt/Image;")
    public Image field2279;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "[I")
    public int[] field2283;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lic;Loh;B)Lih;", line = 13)
    public static final class70 method1220(class329 arg0, class216 arg1, byte arg2) {
        field2286++;
        long var3 = ((long) arg1.field3047 << 56) + ((long) arg1.field3055 << 32) + (long) ((arg1.field3059 + 1 << 16) + arg1.field3058);
        if (arg2 < 86) {
            return (class70) null;
        }
        class70 var5 = (class70) arg0.method2279(var3, 77);
        if (var5 == null) {
            var5 = new class70(arg1.field3059, (float) arg1.field3058, true, false, arg1.field3055);
            arg0.method2275(var5, 108, var3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 42)
    public static final void method1221(int arg0) {
        field2269++;
        field2292 = 0;
        class133.field1818 = false;
        class5.field53 = 0;
        class297.field4308 = -1;
        class116.field1499 = 0;
        if (arg0 != 50) {
            field2273 = (class143) null;
        }
        client.field1632 = 0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBIIII)V", line = 64)
    public static final void method1222(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class25.field292 >= arg3 && class207.field2937 <= arg2) {
            boolean var6;
            if (class245.field3574 > arg5) {
                arg5 = class245.field3574;
                var6 = false;
            } else if (arg5 > class321.field4722) {
                arg5 = class321.field4722;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg0 < class245.field3574) {
                arg0 = class245.field3574;
                var7 = false;
            } else if (class321.field4722 < arg0) {
                arg0 = class321.field4722;
                var7 = false;
            } else {
                var7 = true;
            }
            if (class207.field2937 <= arg3) {
                class96.method697((byte) 115, class331.field4902[arg3++], arg4, arg5, arg0);
            } else {
                arg3 = class207.field2937;
            }
            if (class25.field292 < arg2) {
                arg2 = class25.field292;
            } else {
                class96.method697((byte) 115, class331.field4902[arg2--], arg4, arg5, arg0);
            }
            if (var6 && var7) {
                for (int var8 = arg3; var8 <= arg2; var8++) {
                    int[] var9 = class331.field4902[var8];
                    var9[arg5] = var9[arg0] = arg4;
                }
            } else if (var6) {
                for (int var11 = arg3; var11 <= arg2; var11++) {
                    class331.field4902[var11][arg5] = arg4;
                }
            } else if (var7) {
                for (int var10 = arg3; var10 <= arg2; var10++) {
                    class331.field4902[var10][arg0] = arg4;
                }
            }
        }
        field2277++;
        int var12 = -112 / ((arg1 - 14) / 54);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V", line = 173)
    public static final void method1223(int arg0, int arg1) {
        if (arg0 != -22845) {
            method1225(-16);
        }
        field2287++;
        if (class140.method1081(arg0 ^ 0x5940, arg1)) {
            class25.method171(class26.field308[arg1], (byte) -23, -1);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V", line = 188)
    public final void method1224(int arg0) {
        if (arg0 != 84167136) {
            this.method1224(101);
        }
        class37.method250(this.field2283, this.field2285, this.field2284);
        field2280++;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V", line = 200)
    public static void method1225(int arg0) {
        field2288 = null;
        field2282 = null;
        field2273 = null;
        if (arg0 != 84167136) {
            return;
        }
        field2293 = null;
        field2271 = null;
        field2268 = null;
        field2275 = null;
        field2274 = null;
        field2272 = null;
        field2276 = null;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 231)
    protected class160() {
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
    public abstract void method320(int arg0, Graphics arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIIILjava/awt/Graphics;I)V")
    public abstract void method316(boolean arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
    public abstract void method325(Component arg0, int arg1, int arg2, byte arg3);
}
