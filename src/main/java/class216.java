import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class216 extends class435 {

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "J")
    public long field2943;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "Lho;")
    public static class103 field2948 = new class103(68, 4);

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "I")
    public static int field2951 = -1;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "Lclient;")
    public static client field2949;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "[I")
    public static int[] field2952;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZ)V", line = 5)
    public static final void method1373(int arg0, boolean arg1) {
        if (arg0 != 11770) {
            field2948 = null;
        }
        if (arg1) {
            if (class168.field2174 != -1) {
                class319.method1896(class168.field2174, 30);
            }
            for (class360 var2 = (class360) class152.field1989.method300((byte) -90); var2 != null; var2 = (class360) class152.field1989.method301(-121)) {
                if (!var2.method2673(arg0 ^ 0xFFFFD262)) {
                    var2 = (class360) class152.field1989.method300((byte) -98);
                    if (var2 == null) {
                        break;
                    }
                }
                class115.method696(false, 108, true, var2);
            }
            class168.field2174 = -1;
            class152.field1989 = new class50(8);
            class324.method1913(8);
            class168.field2174 = class281.field3723;
            class334.method1949(false, arg0 - 39795);
            class104.method628(-109);
            class432.method2654(class168.field2174);
        }
        field2944++;
        class95.field1148 = true;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZII)V", line = 52)
    public static final void method1374(boolean arg0, int arg1, int arg2) {
        field2947++;
        class327 var3 = class457.method2813(arg1, arg0, -85);
        if (var3 != null) {
            for (int var4 = arg2; var4 < var3.field4350.length; var4++) {
                var3.field4350[var4] = -1;
                var3.field4346[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)Z", line = 74)
    public static final boolean method1375(int arg0, int arg1, int arg2) {
        field2946++;
        if (arg1 != 2) {
            method1373(36, true);
        }
        return (arg0 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILkh;)I", line = 85)
    public static final int method1376(int arg0, class13 arg1) {
        field2945++;
        if (arg0 != 12706) {
            method1375(-97, -76, -126);
        }
        int var2 = arg1.method80(2, 255);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method80(5, 255);
        } else if (var2 == 2) {
            var3 = arg1.method80(8, 255);
        } else {
            var3 = arg1.method80(11, arg0 - 12451);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V", line = 111)
    public class216() {
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V", line = 114)
    public static void method1377(int arg0) {
        if (arg0 == 11) {
            field2949 = null;
            field2952 = null;
            field2948 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(J)V", line = 125)
    public class216(long arg0) {
        this.field2943 = arg0;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(III)I", line = 135)
    public static final int method1378(int arg0, int arg1, int arg2) {
        field2950++;
        if (arg0 == 1 || arg0 == 3) {
            return class454.field6799[arg1 & 0x3];
        } else if (arg2 >= -39) {
            return 93;
        } else {
            return class47.field492[arg1 & 0x3];
        }
    }
}
