import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class303 implements Runnable {

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "[Llb;")
    public volatile class199[] field5184 = new class199[2];

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Z")
    public volatile boolean field5188 = false;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Z")
    public volatile boolean field5186 = false;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Lwa;")
    public static class75 field5183 = class66.method560("null", false);

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Lcl;")
    public class124 field5180;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)I", line = 5)
    public static final int method2086(byte arg0) {
        field5181++;
        if (arg0 == 113) {
            return class274.field4731 == 0 ? 0 : class302.field5164[class274.field4731].method163();
        } else {
            return 127;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Ldb;", line = 23)
    public static final class173 method2087(int arg0, int arg1) {
        field5182++;
        if (arg0 != 1) {
            field5183 = (class75) null;
        }
        class173 var2 = (class173) class162.field2745.method1514(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class158.field2707.method1911(1, arg1 & 0x7FFF, -53);
        } else {
            var3 = class172.field2896.method1911(1, arg1, arg0 - 124);
        }
        class173 var4 = new class173();
        if (var3 != null) {
            var4.method1277(new class60(var3), -72);
        }
        if (arg1 >= 32768) {
            var4.method1275((byte) 108);
        }
        class162.field2745.method1509((long) arg1, var4, arg0 ^ 0xFFFFFFFE);
        return var4;
    }

    @OriginalMember(owner = "client!dg", name = "run", descriptor = "()V", line = 66)
    public final void run() {
        this.field5186 = true;
        try {
            while (!this.field5188) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class199 var2 = this.field5184[var1];
                    if (var2 != null) {
                        var2.method1480(97);
                    }
                }
                class235.method1708(69, 10L);
                class3.method16(this.field5180, (Object) null, (byte) -102);
            }
        } catch (Exception var7) {
            class17.method100(var7, -14020, (String) null);
        } finally {
            this.field5186 = false;
        }
        field5191++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 100)
    public static void method2088(int arg0) {
        field5183 = null;
        if (arg0 != 5969) {
            method2089(-54, -82);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)Z", line = 123)
    public static final boolean method2089(int arg0, int arg1) {
        if (arg1 != 0) {
            method2087(118, 88);
        }
        field5185++;
        return (arg0 >> 28 & 0x1) != 0;
    }
}
