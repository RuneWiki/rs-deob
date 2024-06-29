import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class349 extends class383 {

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "S")
    public short field4496;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient;")
    public static client field4492;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method2005(int arg0) {
        field4492 = null;
        if (arg0 != 0) {
            field4492 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/util/Random;BI)I")
    public static final int method2006(Random arg0, byte arg1, int arg2) {
        field4490++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class351.method2014(10, arg2)) {
            return (int) ((long) arg2 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            if (arg1 != -46) {
                return 123;
            }
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class296.method1736(var4, arg2, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
    public static final void method2007(int arg0) {
        field4493++;
        for (int var1 = 0; var1 < 5; var1++) {
            class229.field2926[var1] = false;
        }
        class142.field1835 = arg0;
        class524.field7754 = -1;
        class125.field1670 = 0;
        class320.field4063 = 0;
        class60.field784 = -1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static final void method2008(byte arg0) {
        field4495++;
        class250.field3196 = new class18();
        if (arg0 != 79) {
            method2007(-45);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
    public static final int method2009(int arg0, int arg1) {
        field4491++;
        if (arg0 != 0) {
            field4494 = -67;
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class349() {
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(S)V")
    public class349(short arg0) {
        this.field4496 = arg0;
    }
}
