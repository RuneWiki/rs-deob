import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class628 {

    @OriginalMember(owner = "client!bfa", name = "j", descriptor = "B")
    public byte field8540;

    @OriginalMember(owner = "client!bfa", name = "f", descriptor = "S")
    public short field8536;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "S")
    public short field8532;

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "I")
    public int field8534;

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "B")
    public byte field8533;

    @OriginalMember(owner = "client!bfa", name = "g", descriptor = "Z")
    public boolean field8537;

    @OriginalMember(owner = "client!bfa", name = "k", descriptor = "S")
    public short field8541;

    @OriginalMember(owner = "client!bfa", name = "h", descriptor = "Lcb;")
    public static class318 field8538 = new class318(65, 6);

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "I")
    public static int field8535;

    @OriginalMember(owner = "client!bfa", name = "i", descriptor = "I")
    public static int field8539;

    @OriginalMember(owner = "client!bfa", name = "l", descriptor = "I")
    public static int field8542;

    @OriginalMember(owner = "client!bfa", name = "m", descriptor = "I")
    public static int field8543;

    @OriginalMember(owner = "client!bfa", name = "o", descriptor = "I")
    public static int field8545;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bfa", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field8546;

    @OriginalMember(owner = "client!bfa", name = "n", descriptor = "[[S")
    public static short[][] field8544;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3431(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method3424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class218 var7 = new class218();
        var7.field2823 = arg1 >> class428.field5949;
        var7.field2807 = arg2 >> class428.field5949;
        var7.field2814 = arg3 >> class428.field5949;
        var7.field2815 = arg4 >> class428.field5949;
        var7.field2822 = arg0;
        var7.field2812 = arg1;
        var7.field2828 = arg2;
        var7.field2811 = arg3;
        var7.field2810 = arg4;
        var7.field2816 = arg5;
        var7.field2821 = arg6;
        class357.field5182[class573.field7940++] = var7;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IZIII)Lbfa;", line = 25)
    public final class628 method3425(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field8535++;
        if (arg1) {
            method3426(null, true, -20, 77);
        }
        return new class628(arg3, arg4, arg0, arg2, this.field8532, this.field8536, this.field8541, this.field8533, this.field8540, this.field8537);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lfca;ZII)V", line = 39)
    public static final void method3426(class188 arg0, boolean arg1, int arg2, int arg3) {
        field8543++;
        class185 var4 = arg0.method1207(class9.field103, 8);
        if (arg1 || var4 == null) {
            return;
        }
        class9.field103.method1908(arg2, arg3, arg2 + arg0.field2438, arg0.field2371 + arg3);
        if (class325.field4740 < 3) {
            class361.field5208.method2449((float) arg0.field2438 / 2.0F + (float) arg2, (float) arg0.field2371 / 2.0F + (float) arg3, 4096, ((int) (-class620.field8432) & 0x3FFF) << 2, var4, arg2, arg3);
        } else {
            class9.field103.method1956(-16777216, var4, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IZ)V", line = 62)
    public static final void method3427(int arg0, boolean arg1) {
        field8542++;
        if (!arg1) {
            class19 var2 = class364.method2236(1248116640, arg0, 3);
            var2.method104(10);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(IZ)V", line = 78)
    public static final void method3428(int arg0, boolean arg1) {
        class559.field7613 = arg0;
        field8531++;
        class645.field9137.method3142(arg1);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZLjava/awt/Component;B)Ljs;", line = 87)
    public static final class346 method3429(boolean arg0, Component arg1, byte arg2) {
        field8539++;
        try {
            Constructor var3 = Class.forName("hn").getDeclaredConstructor(field8546 == null ? (field8546 = method3431("java.awt.Component")) : field8546, Boolean.TYPE);
            return arg2 == -10 ? (class346) var3.newInstance(arg1, Boolean.valueOf(arg0)) : null;
        } catch (Throwable var4) {
            return new class44(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 110)
    public class628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field8540 = (byte) arg8;
        this.field8536 = (short) arg5;
        this.field8532 = (short) arg4;
        this.field8534 = arg0;
        this.field8533 = (byte) arg7;
        this.field8537 = arg9;
        this.field8541 = (short) arg6;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V", line = 130)
    public static void method3430(byte arg0) {
        field8538 = null;
        int var1 = -58 % ((arg0 - 32) / 58);
        field8544 = null;
    }
}
