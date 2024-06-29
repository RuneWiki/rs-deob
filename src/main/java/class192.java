import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class192 extends class154 {

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Loh;")
    private static class258 field3391 = class153.method1046("Your ignore list is full)3 Max of 100 users)3", 119);

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Loh;")
    private static class258 field3393 = class153.method1046(" more options", 123);

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "Loh;")
    public static class258 field3396 = class153.method1046("document)3cookie=(R", 94);

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "Loh;")
    public static class258 field3394 = field3391;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "Loh;")
    public static class258 field3395 = field3393;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "J")
    public long field3397;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Loc;")
    public class192 field3390;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "Loc;")
    public class192 field3400;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Lgb;")
    public static class213 field3389;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)V", line = 10)
    public static final void method1295(byte arg0) {
        field3398++;
        if (class190.field3367 == 0) {
            return;
        }
        try {
            if (++class137.field2349 > 1500) {
                if (class73.field1289 != null) {
                    class73.field1289.method1122(-1);
                    class73.field1289 = null;
                }
                if (class185.field3289 >= 1) {
                    class190.field3367 = 0;
                    class265.field4608 = -5;
                    return;
                }
                class137.field2349 = 0;
                class190.field3367 = 1;
                class185.field3289++;
                if (class243.field4225 == class148.field2507) {
                    class148.field2507 = class228.field3949;
                } else {
                    class148.field2507 = class243.field4225;
                }
            }
            if (class190.field3367 == 1) {
                class15.field199 = class297.field5086.method2073(class201.field3486, -30885, class148.field2507);
                class190.field3367 = 2;
            }
            if (class190.field3367 == 2) {
                if (class15.field199.field2067 == 2) {
                    throw new IOException();
                }
                if (class15.field199.field2067 != 1) {
                    return;
                }
                class73.field1289 = new class169((Socket) class15.field199.field2063, class297.field5086);
                class15.field199 = null;
                class73.field1289.method1123(4900, 0, class159.field2710.field4051, class159.field2710.field4066);
                if (class76.field1322 != null) {
                    class76.field1322.method1007((byte) -13);
                }
                if (class152.field2602 != null) {
                    class152.field2602.method1007((byte) -13);
                }
                int var1 = class73.field1289.method1117(0);
                if (class76.field1322 != null) {
                    class76.field1322.method1007((byte) -13);
                }
                if (class152.field2602 != null) {
                    class152.field2602.method1007((byte) -13);
                }
                if (var1 != 101) {
                    class265.field4608 = var1;
                    class190.field3367 = 0;
                    class73.field1289.method1122(-1);
                    class73.field1289 = null;
                    return;
                }
                class190.field3367 = 3;
            }
            if (class190.field3367 == 3) {
                if (class73.field1289.method1124(true) >= 2) {
                    int var2 = class73.field1289.method1117(0) << 8 | class73.field1289.method1117(0);
                    class42.method339((byte) 103, var2);
                    if (class253.field4358 != -1) {
                        class190.field3367 = 0;
                        class73.field1289.method1122(-1);
                        class73.field1289 = null;
                        class277.method1942((byte) 118);
                        return;
                    }
                    class265.field4608 = 6;
                    class190.field3367 = 0;
                    class73.field1289.method1122(-1);
                    class73.field1289 = null;
                    return;
                }
                return;
            }
            if (arg0 >= -126) {
                method1297((byte) 102);
            }
        } catch (IOException var4) {
            if (class73.field1289 != null) {
                class73.field1289.method1122(-1);
                class73.field1289 = null;
            }
            if (class185.field3289 < 1) {
                class190.field3367 = 1;
                class185.field3289++;
                if (class243.field4225 == class148.field2507) {
                    class148.field2507 = class228.field3949;
                } else {
                    class148.field2507 = class243.field4225;
                }
                class137.field2349 = 0;
            } else {
                class190.field3367 = 0;
                class265.field4608 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)I", line = 155)
    public static final int method1296(int arg0, int arg1) {
        if (arg1 != 1023) {
            field3393 = (class258) null;
        }
        field3392++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(B)V", line = 171)
    public static void method1297(byte arg0) {
        field3393 = null;
        field3389 = null;
        field3396 = null;
        int var1 = 75 / ((-arg0 - 12) / 36);
        field3394 = null;
        field3391 = null;
        field3395 = null;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)V", line = 209)
    public final void method1298(boolean arg0) {
        field3388++;
        if (this.field3390 != null && arg0) {
            this.field3390.field3400 = this.field3400;
            this.field3400.field3390 = this.field3390;
            this.field3400 = null;
            this.field3390 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 227)
    public static final void method1299(int arg0) {
        field3399++;
        class69.field1193++;
        class159.field2710.method885(40, arg0 - 99);
        for (class247 var1 = (class247) class276.field4750.method985(126); var1 != null; var1 = (class247) class276.field4750.method983(-1)) {
            if (var1.field4279 == 0) {
                class314.method2175(arg0 - 121, true, var1);
            }
        }
        if (class23.field297 != null) {
            class165.method1099((byte) 125, class23.field297);
            class23.field297 = null;
        }
        if (arg0 != 0) {
            field3394 = (class258) null;
        }
    }
}
