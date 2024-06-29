import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class149 extends class242 implements Runnable {

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
    public int field1881 = -1;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "Z")
    private boolean field1885 = true;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "Lbo;")
    private class514 field1878;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "Z")
    public static boolean field1880 = false;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    public static int field1877 = -1;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "Lub;")
    public static class18 field1884 = new class18();

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)V", line = 5)
    public static void method984(int arg0) {
        field1884 = null;
        if (arg0 != -5753) {
            field1877 = 82;
        }
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)V", line = 16)
    public final void method985(int arg0) {
        field1879++;
        this.field1885 = false;
        if (arg0 != -4344) {
            this.method985(-58);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V", line = 29)
    public final void method986(byte arg0) {
        field1882++;
        (new Thread(this, "a")).start();
        int var2 = -32 / ((arg0 + 86) / 37);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lcq;BII)Lpi;", line = 39)
    public static final class346 method987(class328 arg0, byte arg1, int arg2, int arg3) {
        field1883++;
        int var4 = arg2 << 8 | arg0.field4139;
        class346 var5 = (class346) class284.field3614.method1892((long) var4 << 16, false);
        if (var5 != null) {
            return var5;
        }
        if (arg1 != 72) {
            field1884 = null;
        }
        byte[] var6 = class379.field4982.method457(class379.field4982.method474(var4, (byte) 126), -119);
        if (var6 == null) {
            int var8 = arg0.field4139 | arg3 + 65536 << 8;
            class346 var9 = (class346) class284.field3614.method1892((long) var8 << 16, false);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class379.field4982.method457(class379.field4982.method474(var8, (byte) 126), arg1 ^ 0xFFFFFFE5);
            if (var10 == null) {
                int var12 = arg0.field4139 | 0xFFFF00;
                class346 var13 = (class346) class284.field3614.method1892((long) var12 << 16, false);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class379.field4982.method457(class379.field4982.method474(var12, (byte) 126), -104);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class346 var15 = class128.method907((byte) -126, var14);
                    var15.field4447 = arg0;
                    class284.field3614.method1894(var15, (long) var12 << 16, 8690);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class346 var11 = class128.method907((byte) -104, var10);
                var11.field4447 = arg0;
                class284.field3614.method1894(var11, (long) var8 << 16, 8690);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class346 var7 = class128.method907((byte) -104, var6);
            var7.field4447 = arg0;
            class284.field3614.method1894(var7, (long) var4 << 16, 8690);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nt", name = "run", descriptor = "()V", line = 114)
    public final void run() {
        field1886++;
        while (this.field1885) {
            this.field1878.method3070(this, (byte) 75);
        }
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lbo;)V", line = 140)
    public class149(class514 arg0) {
        this.field1878 = arg0;
    }
}
