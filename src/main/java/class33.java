import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class33 extends class296 {

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field392 = -1;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Z")
    public static boolean field391 = false;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Ljava/lang/String;")
    public static String field397 = "Loading - please wait.";

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "[[Z")
    public static boolean[][] field394;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method169(int arg0) {
        field397 = null;
        field394 = null;
        if (arg0 != -102) {
            field391 = true;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method170(byte arg0, int arg1) {
        field393++;
        if (arg0 != -7) {
            method170((byte) -60, 87);
        }
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 < 10000000) {
            return "<col=ffffff>" + arg1 / 1000 + class234.field3789 + "</col>";
        } else {
            return "<col=00ff80>" + arg1 / 1000000 + class304.field4830 + "</col>";
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
    public static final byte[] method171(Object arg0, int arg1, boolean arg2) {
        field388++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class89.method604((byte) 120, var3) : var3;
        } else if (arg0 instanceof class62) {
            class62 var4 = (class62) arg0;
            return var4.method396(16747);
        } else {
            if (arg1 != -5673) {
                field394 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public static final void method172(int arg0) {
        field389++;
        if (arg0 != 29909) {
            method169(115);
        }
        if (class229.field3541 == 0) {
            return;
        }
        try {
            if ((++class201.field3168) > 1500) {
                if (class270.field4405 != null) {
                    class270.field4405.method567(0);
                    class270.field4405 = null;
                }
                if (class140.field2010 >= 1) {
                    class195.field3080 = -5;
                    class229.field3541 = 0;
                    return;
                }
                class201.field3168 = 0;
                if (class8.field108 == class57.field831) {
                    class8.field108 = class6.field80;
                } else {
                    class8.field108 = class57.field831;
                }
                class140.field2010++;
                class229.field3541 = 1;
            }
            if (class229.field3541 == 1) {
                class110.field1594 = class95.field1425.method1685(101, class8.field108, class120.field1726);
                class229.field3541 = 2;
            }
            if (class229.field3541 == 2) {
                if (class110.field1594.field2399 == 2) {
                    throw new IOException();
                }
                if (class110.field1594.field2399 != 1) {
                    return;
                }
                class270.field4405 = new class83((Socket) class110.field1594.field2401, class95.field1425);
                class110.field1594 = null;
                class270.field4405.method562(class150.field2218.field2676, class150.field2218.field2650, 0, 83);
                if (class1.field27 != null) {
                    class1.field27.method1536(32768);
                }
                if (class195.field3078 != null) {
                    class195.field3078.method1536(32768);
                }
                int var1 = class270.field4405.method571(true);
                if (class1.field27 != null) {
                    class1.field27.method1536(32768);
                }
                if (class195.field3078 != null) {
                    class195.field3078.method1536(32768);
                }
                if (var1 != 101) {
                    class229.field3541 = 0;
                    class195.field3080 = var1;
                    class270.field4405.method567(0);
                    class270.field4405 = null;
                    return;
                }
                class229.field3541 = 3;
            }
            if (class229.field3541 == 3 && class270.field4405.method558(-23644) >= 2) {
                int var2 = class270.field4405.method571(true) << 8 | class270.field4405.method571(true);
                class290.method1970(var2, 104);
                if (class67.field991 == -1) {
                    class195.field3080 = 6;
                    class229.field3541 = 0;
                    class270.field4405.method567(0);
                    class270.field4405 = null;
                } else {
                    class229.field3541 = 0;
                    class270.field4405.method567(0);
                    class270.field4405 = null;
                    class183.method1299(arg0 - 29908);
                }
            }
        } catch (IOException var3) {
            if (class270.field4405 != null) {
                class270.field4405.method567(0);
                class270.field4405 = null;
            }
            if (class140.field2010 >= 1) {
                class229.field3541 = 0;
                class195.field3080 = -4;
            } else {
                class229.field3541 = 1;
                class140.field2010++;
                if (class8.field108 == class57.field831) {
                    class8.field108 = class6.field80;
                } else {
                    class8.field108 = class57.field831;
                }
                class201.field3168 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(III)J")
    public static final long method173(int arg0, int arg1, int arg2) {
        class113 var3 = class184.field2892[arg0][arg1][arg2];
        return var3 == null || var3.field1650 == null ? 0L : var3.field1650.field859;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
    public static final void method174(int arg0, int arg1) {
        field390++;
        class181 var2 = class95.method652(arg0, (byte) 34, arg1);
        var2.method1283(192);
    }
}
