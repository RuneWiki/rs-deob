import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class434 {

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field6110 = 0;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "[Lhm;")
    public static class150[] field6108;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 8)
    public static void method2557(int arg0) {
        if (arg0 <= -95) {
            field6108 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V", line = 24)
    public static final void method2558(boolean arg0) {
        field6107++;
        if (!arg0) {
            field6108 = null;
        }
        class335.field4854.method1095(0);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)I", line = 40)
    public static final int method2559(int arg0, byte arg1) {
        field6104++;
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            int var2 = -51 % ((arg1 + 34) / 58);
            return 3;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Z", line = 59)
    public static final boolean method2560(int arg0, int arg1, int arg2) {
        if (arg0 != -1005) {
            return true;
        }
        field6105++;
        if (!class424.field5977) {
            return false;
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class494.field6988[var3] == null || class494.field6988[var3][var4] == null) {
            return false;
        }
        class150 var5 = class494.field6988[var3][var4];
        if (arg2 == -1 && var5.field2022 == 0) {
            for (class214 var6 = (class214) class363.field5190.method2655(15152); var6 != null; var6 = (class214) class363.field5190.method2660((byte) 67)) {
                if (var6.field3094 == 10 || var6.field3094 == 1004 || var6.field3094 == 11 || var6.field3094 == 20 || var6.field3094 == 51) {
                    for (class150 var7 = client.method1276(arg0 + 1088, var6.field3096); var7 != null; var7 = class146.method904(var7, 28)) {
                        if (var5.field2134 == var7.field2134) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class214 var8 = (class214) class363.field5190.method2655(15152); var8 != null; var8 = (class214) class363.field5190.method2660((byte) 67)) {
                if (var8.field3088 == arg2 && var5.field2134 == var8.field3096 && (var8.field3094 == 10 || var8.field3094 == 1004 || var8.field3094 == 11 || var8.field3094 == 20 || var8.field3094 == 51)) {
                    return true;
                }
            }
        }
        return false;
    }
}
