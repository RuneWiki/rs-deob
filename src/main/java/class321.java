import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class321 {

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field4943 = 0;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "Z")
    public static boolean field4949 = false;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "Z")
    public static boolean field4951 = false;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Z")
    public static boolean field4946 = true;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    private int field4941;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public int field4948;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public int field4952;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "[[I")
    public static int[][] field4947;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILug;I)V", line = 4)
    public final void method2264(int arg0, class25 arg1, int arg2) {
        field4950++;
        int var4 = -118 % ((arg2 + 8) / 32);
        while (true) {
            int var5 = arg1.method281(-126);
            if (var5 == 0) {
                return;
            }
            this.method2267((byte) 111, arg0, var5, arg1);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 26)
    public static final void method2265(int arg0) {
        if (class295.field4578 == 10 && class240.field3737) {
            class175.method1370(28, (byte) -83);
        }
        if (class295.field4578 == 30) {
            class175.method1370(25, (byte) -83);
        }
        if (arg0 < -111) {
            field4954++;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)Lqn;", line = 51)
    public final class361 method2266(int arg0) {
        if (arg0 < 122) {
            method2268((byte) -13, -13, -62);
        }
        field4942++;
        class361 var2 = (class361) class280.field4315.method654(-46, (long) this.field4941);
        if (var2 != null) {
            return var2;
        }
        class361 var3 = class171.method1347(0, this.field4941, class37.field569, -6138);
        if (var3 != null) {
            class280.field4315.method652(-69, var3, (long) this.field4941);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BIILug;)V", line = 73)
    private final void method2267(byte arg0, int arg1, int arg2, class25 arg3) {
        if (arg0 != 111) {
            return;
        }
        field4945++;
        if (arg2 == 1) {
            this.field4941 = arg3.method314((byte) 121);
        } else if (arg2 == 2) {
            this.field4952 = arg3.method281(-124);
            this.field4948 = arg3.method281(101);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BII)I", line = 100)
    public static final int method2268(byte arg0, int arg1, int arg2) {
        if (arg0 != 107) {
            field4951 = true;
        }
        field4953++;
        int var3 = arg1 - 1 & arg2 >> 31;
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V", line = 113)
    public static void method2269(int arg0) {
        if (arg0 != -3) {
            method2269(-114);
        }
        field4947 = (int[][]) null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZII)V", line = 129)
    public static final void method2270(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method2268((byte) 60, 78, 11);
        }
        field4944++;
        class138 var3 = class149.method1242(arg2, 0, 7);
        var3.method1153((byte) 50);
        var3.field2282 = arg1;
    }
}
