import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class164 {

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public int field2503 = 0;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    public int field2500 = 2048;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    public int field2501 = 0;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
    public int field2505 = 2048;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!cw", name = "l", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "Lpj;")
    public static class132 field2497;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "Lbc;")
    public static class333 field2499;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field2504;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ljr;I)V", line = 3)
    public final void method1138(class96 arg0, int arg1) {
        field2508++;
        if (arg1 >= -71) {
            this.field2503 = -89;
        }
        while (true) {
            int var3 = arg0.method718(-62);
            if (var3 == 0) {
                return;
            }
            this.method1143(arg0, var3, (byte) -54);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V", line = 27)
    public static void method1139(int arg0) {
        field2499 = null;
        field2504 = null;
        if (arg0 != -2) {
            method1140(-27, null, 33, false);
        }
        field2497 = null;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILoa;IZ)Lgg;", line = 41)
    public static final class158 method1140(int arg0, class638 arg1, int arg2, boolean arg3) {
        field2502++;
        if (~arg0 == arg2) {
            return null;
        }
        if (class377.field5333 != null) {
            for (int var4 = 0; var4 < class377.field5333.length; var4++) {
                if (class377.field5333[var4] == arg0) {
                    return class45.field669[var4];
                }
            }
        }
        class158 var5 = (class158) class100.field1367.method1986((byte) -118, (long) arg0);
        if (var5 != null) {
            if (arg3 && var5.field2375 == null) {
                class599 var6 = class43.method241(true, field2497, arg0);
                if (var6 == null) {
                    return null;
                }
                var5.field2375 = var6;
            }
            return var5;
        }
        class543[] var7 = class543.method2983(class32.field384, arg0);
        if (var7 == null) {
            return null;
        }
        class599 var8 = class43.method241(true, field2497, arg0);
        if (var8 == null) {
            return null;
        }
        class158 var9;
        if (arg3) {
            var9 = new class158(arg1.method405(var8, var7, true), var8);
        } else {
            var9 = new class158(arg1.method405(var8, var7, true));
        }
        class100.field1367.method1985(var9, (long) arg0, (byte) -102);
        return var9;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V", line = 114)
    public static final void method1141(byte arg0) {
        field2506++;
        class528.field7233.method1997(1);
        if (arg0 >= -10) {
            field2497 = null;
        }
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)[Lpq;", line = 132)
    public static final class176[] method1142(int arg0) {
        if (arg0 >= -118) {
            return null;
        } else {
            field2507++;
            return new class176[] { class599.field8310, class599.field8311, class599.field8312, class599.field8314, class599.field8315, class599.field8316, class599.field8317, class599.field8318, class599.field8319, class599.field8320, class599.field8321, class599.field8322, class599.field8323, class599.field8324 };
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ljr;IB)V", line = 144)
    private final void method1143(class96 arg0, int arg1, byte arg2) {
        field2498++;
        if (arg1 == 1) {
            this.field2501 = arg0.method718(-109);
        } else if (arg1 == 2) {
            this.field2505 = arg0.method743((byte) -53);
        } else if (arg1 == 3) {
            this.field2500 = arg0.method743((byte) -92);
        } else if (arg1 == 4) {
            this.field2503 = arg0.method722(4);
        }
        if (arg2 != -54) {
            this.field2500 = 89;
        }
    }
}
