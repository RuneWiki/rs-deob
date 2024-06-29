import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public abstract class class409 {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field5938 = 0;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "[J")
    public static long[] field5943 = new long[100];

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5942 = "Loaded interfaces";

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLu;)Z", line = 5)
    public static final boolean method2622(byte arg0, class46 arg1) {
        field5941++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field721) {
            return false;
        } else if (!arg1.method330((byte) 123)) {
            return false;
        } else if (class216.field2866.method1412((byte) -54, (long) arg1.field727) != null) {
            return false;
        } else if (class339.field4744.method1412((byte) -54, (long) arg1.field710) == null) {
            if (arg0 >= -21) {
                field5942 = null;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 36)
    public static final void method2623(int arg0) {
        class190 var1 = class154.field2168;
        synchronized (class154.field2168) {
            class154.field2168.method1243(1000);
        }
        field5940++;
        if (arg0 != 0) {
            method2623(-86);
        }
        class190 var2 = class229.field3061;
        synchronized (class229.field3061) {
            class229.field3061.method1243(arg0 ^ 0x3E8);
        }
        class190 var3 = class68.field1058;
        synchronized (class68.field1058) {
            class68.field1058.method1243(arg0 + 1000);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lek;III[Z)Z", line = 57)
    public static final boolean method2624(class294 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class435.field6248 != class249.field3456) {
            int var6 = class156.field2213[arg1].method278(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class156 var8 = class156.field2213[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method278(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method276(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method269(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lqj;Lqj;I)V", line = 93)
    public static final void method2625(class296 arg0, class296 arg1, int arg2) {
        class439.field6375 = arg0;
        class293.field4049 = arg1;
        field5939++;
        class439.field6375.method1911(arg2, 34);
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)V", line = 131)
    public static final void method2626(int arg0) {
        field5944++;
        if (class24.field323 == 5) {
            class24.field323 = arg0;
        }
    }

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "(I)V", line = 149)
    public static void method2627(int arg0) {
        if (arg0 > -84) {
            method2622((byte) -82, (class46) null);
        }
        field5942 = null;
        field5943 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public abstract void method492(int arg0);

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BI)I")
    public abstract int method493(byte arg0, int arg1);

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)J")
    public abstract long method491(int arg0);
}
