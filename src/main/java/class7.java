import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class7 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field139 = 0;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Lof;")
    public static class223 field140;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V", line = 11)
    public static final void method44(int arg0, int arg1) {
        if (class131.field1889 == 0) {
            class256.field3833.method2322(arg0, (byte) 125);
        } else {
            class261.field3970 = arg0;
        }
        field141++;
        if (arg1 != 30654) {
            method45((byte) -115, (byte) 6);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BB)C", line = 31)
    public static final char method45(byte arg0, byte arg1) {
        field144++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (arg0 > -54) {
            field142 = -14;
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class98.field1382[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 61)
    public static final void method46(int arg0) {
        field146++;
        if (arg0 <= 17) {
            field140 = (class223) null;
        }
        for (class217 var1 = (class217) class149.field2158.method93((byte) -79); var1 != null; var1 = (class217) class149.field2158.method97(-80)) {
            if (var1.field3202 > 0) {
                var1.field3202--;
            }
            if (var1.field3202 != 0) {
                if (var1.field3190 > 0) {
                    var1.field3190--;
                }
                if (var1.field3190 == 0 && var1.field3194 >= 1 && var1.field3201 >= 1 && var1.field3194 <= 102 && var1.field3201 <= 102 && (var1.field3198 < 0 || class93.method726(var1.field3198, -12, var1.field3191))) {
                    class71.method574(var1.field3194, var1.field3197, false, var1.field3201, var1.field3191, var1.field3192, var1.field3204, var1.field3198);
                    var1.field3190 = -1;
                    if (var1.field3198 == var1.field3196 && var1.field3196 == -1) {
                        var1.method876(8);
                    } else if (var1.field3198 == var1.field3196 && var1.field3204 == var1.field3200 && var1.field3193 == var1.field3191) {
                        var1.method876(8);
                    }
                }
            } else if (var1.field3196 < 0 || class93.method726(var1.field3196, -12, var1.field3193)) {
                class71.method574(var1.field3194, var1.field3197, false, var1.field3201, var1.field3193, var1.field3192, var1.field3200, var1.field3196);
                var1.method876(8);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lqf;II)Ljava/lang/String;", line = 125)
    public static final String method47(class359 arg0, int arg1, int arg2) {
        field143++;
        if (arg1 != 24506) {
            field140 = (class223) null;
        }
        if (!client.method347(arg0).method1452(false, arg2) && arg0.field5670 == null) {
            return null;
        } else if (arg0.field5493 == null || arg2 >= arg0.field5493.length || arg0.field5493[arg2] == null || arg0.field5493[arg2].trim().length() == 0) {
            return class190.field2769 ? "Hidden-" + arg2 : null;
        } else {
            return arg0.field5493[arg2];
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 152)
    public static void method48(int arg0) {
        if (arg0 != 0) {
            field140 = (class223) null;
        }
        field140 = null;
    }
}
