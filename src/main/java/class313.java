import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class313 extends class41 {

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4972 = "Loaded wordpack";

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field4976 = 0;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field4981 = 0;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "F")
    public static float field4977;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)Lk;", line = 8)
    public static final class19 method2215(byte arg0) {
        field4975++;
        if (arg0 != -47) {
            method2216(-22);
        }
        try {
            return (class19) Class.forName("hi").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 28)
    public static final void method2216(int arg0) {
        class270 var1 = class52.field832;
        synchronized (class52.field832) {
            class101.field1660 = class19.field216;
            class210.field3341++;
            if (class208.field3263 >= 0) {
                while (class98.field1622 != class208.field3263) {
                    int var3 = class156.field2472[class98.field1622];
                    class98.field1622 = class98.field1622 + 1 & 0x7F;
                    if (var3 < 0) {
                        class240.field3972[~var3] = false;
                    } else {
                        class240.field3972[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class240.field3972[var2] = false;
                }
                class208.field3263 = class98.field1622;
            }
            class19.field216 = class223.field3701;
        }
        field4978++;
        if (arg0 != 1) {
            method2217(-3);
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 76)
    public static void method2217(int arg0) {
        if (arg0 != -1) {
            field4977 = 0.3610261F;
        }
        field4972 = null;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V", line = 88)
    public static final void method2218(int arg0) {
        if (class52.field832 != null) {
            class270 var1 = class52.field832;
            synchronized (class52.field832) {
                class52.field832 = null;
            }
        }
        if (arg0 != -27417) {
            method2215((byte) 72);
        }
        field4973++;
    }
}
