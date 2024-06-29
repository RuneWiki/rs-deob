import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class214 {

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "Lwi;")
    private class330 field3034 = new class330(64);

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Luu;")
    private class191 field3032;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Lni;")
    public static class367 field3027 = new class367(16, -1);

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Lof;")
    public static class446 field3030 = new class446("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field3033 = 0;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field3035 = 0;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method1471(int arg0) {
        field3027 = null;
        if (arg0 != 858993459) {
            method1472(51, 69);
        }
        field3030 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I")
    public static final int method1472(int arg0, int arg1) {
        field3031++;
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
        int var3 = ((var2 & 0xCCCCCCCD) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg1 != -190648304) {
            method1471(-69);
        }
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIFIIF[BFILag;FIF)V")
    public static final void method1473(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, byte[] arg6, float arg7, int arg8, class490 arg9, float arg10, int arg11, float arg12) {
        for (int var13 = arg3; var13 < arg0; var13++) {
            class261.method1692(arg0, arg4, arg2, arg7, var13, arg1, arg12, arg8, arg10, arg6, arg5, arg9, arg11, 2253);
            arg1 += arg4 * arg11;
        }
        field3029++;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)Lso;")
    public final class333 method1474(int arg0, int arg1) {
        field3028++;
        class330 var3 = this.field3034;
        class333 var4;
        synchronized (this.field3034) {
            var4 = (class333) this.field3034.method2133((long) arg1, (byte) 98);
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field3032;
        byte[] var6;
        synchronized (this.field3032) {
            var6 = this.field3032.method1281(5, arg1, 63);
        }
        class333 var7 = new class333();
        if (var6 != null) {
            var7.method2148(new class164(var6), (byte) 12);
        }
        class330 var8 = this.field3034;
        synchronized (this.field3034) {
            if (arg0 > -17) {
                field3033 = 55;
            }
            this.field3034.method2131(var7, (long) arg1, false);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Liv;ILuu;)V")
    public class214(class65 arg0, int arg1, class191 arg2) {
        this.field3032 = arg2;
        this.field3032.method1290(false, 5);
    }
}
