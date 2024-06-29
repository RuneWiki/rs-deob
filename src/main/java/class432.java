import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class432 extends OutputStream {

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "[I")
    public static int[] field5707 = new int[2048];

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "J")
    public static long field5708;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)V", line = 4)
    public static final void method2558(int arg0, int arg1, int arg2) {
        if (class9.field154 < class9.field149) {
            class9.field154 = (float) ((double) class9.field154 / 30.0D + (double) class9.field154);
            if (class9.field154 > class9.field149) {
                class9.field154 = class9.field149;
            }
            class448.method2641(-1);
            class9.field153 = (int) class9.field154 >> 1;
            class9.field157 = class100.method846(class9.field153, (byte) 1);
        } else if (class9.field154 > class9.field149) {
            class9.field154 = (float) ((double) class9.field154 - (double) class9.field154 / 30.0D);
            if (class9.field149 > class9.field154) {
                class9.field154 = class9.field149;
            }
            class448.method2641(-1);
            class9.field153 = (int) class9.field154 >> 1;
            class9.field157 = class100.method846(class9.field153, (byte) 1);
        }
        field5705++;
        if (class461.field6482 != -1 && class683.field9348 != -1) {
            int var3 = class461.field6482 - class580.field7912;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class683.field9348 - class62.field850;
            class580.field7912 -= -var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class62.field850 += var4;
            if (var3 == 0 && var4 == 0) {
                class461.field6482 = -1;
                class683.field9348 = -1;
            }
            class448.method2641(-1);
        }
        if (class446.field5988 > 0) {
            class720.field10105--;
            if (class720.field10105 == 0) {
                class446.field5988--;
                class720.field10105 = 100;
            }
        } else {
            class587.field7997 = -1;
            class137.field1713 = -1;
        }
        if (class413.field5389 && class476.field6612 != null) {
            for (class786 var5 = (class786) class476.field6612.method2725(37); var5 != null; var5 = (class786) class476.field6612.method2726(-116)) {
                class305 var6 = class9.field143.method4140(36, var5.field10851.field8567);
                if (var5.method4353((byte) 33, arg0, arg1)) {
                    if (var6.field3632 != null) {
                        if (var6.field3632[4] != null) {
                            class620.method3534((long) var5.field10851.field8567, -1, false, var6.field3637, -1, (long) var5.field10851.field8567, false, 120, 0, 1006, var6.field3657, var6.field3632[4], true);
                        }
                        if (var6.field3632[3] != null) {
                            class620.method3534((long) var5.field10851.field8567, -1, false, var6.field3637, -1, (long) var5.field10851.field8567, false, 114, 0, 1001, var6.field3657, var6.field3632[3], true);
                        }
                        if (var6.field3632[2] != null) {
                            class620.method3534((long) var5.field10851.field8567, -1, false, var6.field3637, -1, (long) var5.field10851.field8567, false, 107, 0, 1002, var6.field3657, var6.field3632[2], true);
                        }
                        if (var6.field3632[1] != null) {
                            class620.method3534((long) var5.field10851.field8567, -1, false, var6.field3637, -1, (long) var5.field10851.field8567, false, 107, 0, 1009, var6.field3657, var6.field3632[1], true);
                        }
                        if (var6.field3632[0] != null) {
                            class620.method3534((long) var5.field10851.field8567, -1, false, var6.field3637, -1, (long) var5.field10851.field8567, false, 122, 0, 1004, var6.field3657, var6.field3632[0], true);
                        }
                    }
                    if (!var5.field10851.field8570) {
                        var5.field10851.field8570 = true;
                        class142.method1038(class381.field4827, var5.field10851.field8567, var6.field3657);
                    }
                    if (var5.field10851.field8570) {
                        class142.method1038(class484.field6754, var5.field10851.field8567, var6.field3657);
                    }
                } else if (var5.field10851.field8570) {
                    var5.field10851.field8570 = false;
                    class142.method1038(class112.field1414, var5.field10851.field8567, var6.field3657);
                }
            }
        }
        int var7 = 120 / ((arg2 + 7) / 43);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BII)Z", line = 148)
    public static final boolean method2559(byte arg0, int arg1, int arg2) {
        field5709++;
        if (!class672.field9218) {
            return false;
        }
        if (arg0 < 53) {
            method2559((byte) -108, 15, 109);
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class316.field3880[var3] == null || class316.field3880[var3][var4] == null) {
            return false;
        }
        class620 var5 = class316.field3880[var3][var4];
        if (arg2 == -1 && var5.field8371 == 0) {
            for (class75 var6 = (class75) class5.field52.method2725(37); var6 != null; var6 = (class75) class5.field52.method2726(-124)) {
                if (var6.field1029 == 5 || var6.field1029 == 1003 || var6.field1029 == 45 || var6.field1029 == 49 || var6.field1029 == 17) {
                    for (class620 var7 = class479.method2848(var6.field1036, (byte) -126); var7 != null; var7 = class235.method1442(14939, var7)) {
                        if (var5.field8515 == var7.field8515) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class75 var8 = (class75) class5.field52.method2725(37); var8 != null; var8 = (class75) class5.field52.method2726(-124)) {
                if (var8.field1030 == arg2 && var5.field8515 == var8.field1036 && (var8.field1029 == 5 || var8.field1029 == 1003 || var8.field1029 == 45 || var8.field1029 == 49 || var8.field1029 == 17)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V", line = 218)
    public static void method2560(int arg0) {
        if (arg0 != 964572240) {
            method2560(-31);
        }
        field5707 = null;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V", line = 228)
    public static final void method2561(int arg0, int arg1) {
        field5704++;
        class515.field7256 = arg1;
        class520.field7342.method1690(arg0);
    }

    @OriginalMember(owner = "client!fr", name = "write", descriptor = "(I)V", line = 238)
    public final void write(int arg0) throws IOException {
        field5706++;
        throw new IOException();
    }
}
