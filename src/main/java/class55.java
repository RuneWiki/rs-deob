import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class55 {

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "Lrh;")
    public static class59 field780 = new class59();

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "Ljj;")
    public static class398 field782 = new class398(7, 6);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V", line = 7)
    public static void method347(int arg0) {
        field780 = null;
        if (arg0 != 15830) {
            method349(46, 73, null, (byte) 3);
        }
        field782 = null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(JI)V", line = 19)
    public static final void method348(long arg0, int arg1) {
        try {
            if (arg1 != 4096) {
                field780 = null;
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        field777++;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IILjava/lang/Object;B)[B", line = 35)
    public static final byte[] method349(int arg0, int arg1, Object arg2, byte arg3) {
        field778++;
        if (arg2 == null) {
            return null;
        }
        if (arg3 != 50) {
            method349(26, -38, null, (byte) 107);
        }
        if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return class644.method3584(arg1, arg0, var4, (byte) -75);
        } else if (arg2 instanceof class653) {
            class653 var5 = (class653) arg2;
            return var5.method2523(4, arg0, arg1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V", line = 68)
    public static final void method350(int arg0) {
        field781++;
        if (arg0 != 0) {
            method347(56);
        }
        if (class339.field4960 != null && class15.field127 != null) {
            return;
        }
        class339.field4960 = new int[256];
        class15.field127 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class339.field4960[var1] = (int) (Math.sin(var2) * 4096.0D);
            class15.field127[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }
}
