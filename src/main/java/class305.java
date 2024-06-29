import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class305 {

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "S")
    public static short field4133 = 256;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4135 = "Attack";

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field4137 = 0;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field4141 = 13156520;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([JI[Ljava/lang/Object;)V")
    public static final void method1789(long[] arg0, int arg1, Object[] arg2) {
        class366.method2218(arg0.length - 1, arg0, arg2, (byte) -47, 0);
        if (arg1 != -1) {
            method1790(-35, -125, -118);
        }
        field4130++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)V")
    public static final void method1790(int arg0, int arg1, int arg2) {
        class160.field2061 = new class114(arg0);
        field4139++;
        class158.field2047 = new class114(arg2);
        if (arg1 <= 7) {
            field4135 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIB)I")
    public static final int method1791(int arg0, int arg1, byte arg2) {
        field4131++;
        class367 var3 = (class367) class106.field1305.method308((long) arg1, (byte) -123);
        if (arg2 != 28) {
            return -117;
        } else if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field5137.length; var5++) {
                if (var3.field5141[var5] == arg0) {
                    var4 += var3.field5137[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lme;I)V")
    public static final void method1792(class360 arg0, int arg1) {
        if (arg1 >= 73) {
            class319.field4268 = arg0;
            field4134++;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
    public static final void method1793(byte arg0) {
        if (arg0 <= 91) {
            method1790(-5, 39, 10);
        }
        field4138++;
        class114 var1 = class389.field5560;
        synchronized (class389.field5560) {
            class389.field5560.method606((byte) 109);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([BII)I")
    public static final int method1794(byte[] arg0, int arg1, int arg2) {
        field4129++;
        if (arg2 != 0) {
            method1794((byte[]) null, 62, -2);
        }
        return class428.method2647((byte) 9, arg1, arg0, 0);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V")
    public static void method1795(byte arg0) {
        int var1 = 94 / ((21 - arg0) / 57);
        field4135 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)Lng;")
    public static final class112 method1796(byte arg0, int arg1) {
        if (arg0 != -58) {
            field4137 = 39;
        }
        field4136++;
        class112 var2 = (class112) class58.field601.method616(arg0 + 183, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class99.field1166.method1687(arg1, 31, arg0 ^ 0xFFFFFF39);
        class112 var4 = new class112();
        if (var3 != null) {
            var4.method595(arg1, new class250(var3), 16383);
        }
        class58.field601.method615((byte) -117, (long) arg1, var4);
        return var4;
    }
}
