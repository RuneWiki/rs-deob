import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class284 {

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4368 = "Connecting to update server";

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Lja;")
    public static class64 field4364;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 48)
    public static void method2012(byte arg0) {
        field4368 = null;
        int var1 = -27 % ((arg0 - 15) / 61);
        field4364 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILnl;I)V", line = 61)
    public static final void method2013(int arg0, int arg1, class30 arg2, int arg3) {
        if (arg2.field1458 == arg1 && arg1 != -1) {
            class269 var4 = class6.method28(arg1, arg0 ^ 0xFFFF93AB);
            int var5 = var4.field4168;
            if (var5 == 1) {
                arg2.field1398 = arg3;
                arg2.field1422 = 1;
                arg2.field1410 = 0;
                arg2.field1401 = 0;
                arg2.field1414 = 0;
                class89.method632(var4, arg2.field1442, (byte) 109, arg2.field1369, class19.field356 == arg2, arg2.field1414);
            }
            if (var5 == 2) {
                arg2.field1410 = 0;
            }
        } else if (arg1 == -1 || arg2.field1458 == -1 || class6.method28(arg1, 2).field4187 >= class6.method28(arg2.field1458, 2).field4187) {
            arg2.field1410 = 0;
            arg2.field1434 = arg2.field1365;
            arg2.field1458 = arg1;
            arg2.field1414 = 0;
            arg2.field1398 = arg3;
            arg2.field1401 = 0;
            arg2.field1422 = 1;
            if (arg2.field1458 != -1) {
                class89.method632(class6.method28(arg2.field1458, arg0 + 27737), arg2.field1442, (byte) 123, arg2.field1369, class19.field356 == arg2, arg2.field1414);
            }
        }
        field4366++;
        if (arg0 != -27735) {
            method2013(-88, -114, (class30) null, -64);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIILja;)[Lgk;", line = 138)
    public static final class7[] method2014(int arg0, int arg1, int arg2, class64 arg3) {
        field4365++;
        if (class150.method1152(arg3, arg2, 50, arg0)) {
            if (arg1 != -1) {
                field4364 = (class64) null;
            }
            return class293.method2058(255);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V", line = 159)
    public static final void method2015(int arg0, int arg1) {
        field4369++;
        class159.field2506.method1828(arg0, (byte) -55);
        if (arg1 > -73) {
            field4368 = (String) null;
        }
    }
}
