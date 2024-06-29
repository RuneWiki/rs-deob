import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class292 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field3962 = 0;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lmk;")
    public static class154 field3964 = new class154();

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
    public static final void method1720(int arg0, int arg1) {
        field3963++;
        if (arg1 != 0) {
            field3964 = null;
        }
        class40 var2 = class162.method872(arg0, (byte) 92, 9);
        var2.method193(-125);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)V")
    public static final void method1721(int arg0, int arg1, int arg2, int arg3) {
        field3966++;
        if (class176.field2209 == null) {
            return;
        }
        long var4 = (long) (arg2 << 28 | arg1 << 14 | arg0);
        class268 var6 = (class268) class419.field6102.method308(var4, (byte) 56);
        if (var6 == null) {
            class143.method777(arg2, arg0, arg1);
            return;
        }
        class306 var7 = (class306) var6.field3647.method814((byte) 90);
        if (var7 == null) {
            class143.method777(arg2, arg0, arg1);
            return;
        }
        class371 var8 = (class371) class143.method777(arg2, arg0, arg1);
        if (var8 == null) {
            var8 = new class371();
        } else {
            var8.field5190 = var8.field5182 = -1;
        }
        var8.field5187 = var7.field4144;
        var8.field5194 = var7.field4142;
        label48: while (true) {
            class306 var9 = (class306) var6.field3647.method827(-127);
            if (var9 == null) {
                break;
            }
            if (var8.field5187 != var9.field4144) {
                var8.field5186 = var9.field4142;
                var8.field5190 = var9.field4144;
                while (true) {
                    class306 var10 = (class306) var6.field3647.method827(-128);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field5187 != var10.field4144 && var8.field5190 != var10.field4144) {
                        var8.field5182 = var10.field4144;
                        var8.field5184 = var10.field4142;
                    }
                }
            }
        }
        if (arg3 > 60) {
            int var11 = class201.method1098((arg0 << 7) + 64, (arg1 << 7) - -64, arg2, (byte) -117);
            class111.method587(arg2, arg0, arg1, var11, var8);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZIIBIII)V")
    public static final void method1722(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class309.field4179 = arg2;
        field3965++;
        if (arg3 != 122) {
            return;
        }
        class330.field4397 = arg1;
        class324.field4324 = arg4;
        class125.field1610 = arg5;
        class296.field4022 = arg6;
        if (arg0 && class125.field1610 >= 100) {
            class127.field1633 = class324.field4324 * 128 + 64;
            class180.field2272 = class330.field4397 * 128 + 64;
            class175.field2197 = class201.method1098(class127.field1633, class180.field2272, class263.field3592, (byte) -105) - class296.field4022;
        }
        class294.field3993 = 2;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method1723(int arg0) {
        field3964 = null;
        if (arg0 != 454914791) {
            method1720(37, -88);
        }
    }
}
