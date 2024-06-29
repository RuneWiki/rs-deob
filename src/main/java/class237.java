import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class237 {

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lho;")
    public static class103 field3154 = new class103(1, 2);

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field3157 = 0;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Leo;")
    public static class196 field3159 = class94.method527((byte) -79);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lmk;")
    public static class40 field3158;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 5)
    public static final int method1490(String arg0, int arg1) {
        field3153++;
        if (arg1 != 19822) {
            field3154 = null;
        }
        for (int var2 = 0; var2 < class106.field1445.length; var2++) {
            if (class106.field1445[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZI)Z", line = 30)
    public static final boolean method1491(int arg0, boolean arg1, int arg2) {
        field3155++;
        if (!class483.field7125) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class339.field4491[var3] == null || class339.field4491[var3][var4] == null) {
            return false;
        } else if (arg1) {
            return false;
        } else {
            class450 var5 = class339.field4491[var3][var4];
            if (arg0 == -1 && var5.field6686 == 0) {
                for (class36 var6 = (class36) class69.field806.method970(12); var6 != null; var6 = (class36) class69.field806.method976((byte) 1)) {
                    if (var6.field361 == 9 || var6.field361 == 1012 || var6.field361 == 18 || var6.field361 == 44 || var6.field361 == 16) {
                        for (class450 var7 = class406.method2490((byte) -116, var6.field372); var7 != null; var7 = class274.method1666(var7, (byte) 31)) {
                            if (var5.field6558 == var7.field6558) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (class36 var8 = (class36) class69.field806.method970(12); var8 != null; var8 = (class36) class69.field806.method976((byte) -126)) {
                    if (var8.field368 == arg0 && var5.field6558 == var8.field372 && (var8.field361 == 9 || var8.field361 == 1012 || var8.field361 == 18 || var8.field361 == 44 || var8.field361 == 16)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 97)
    public static final void method1492(byte arg0) {
        field3156++;
        if (class319.field4261) {
            return;
        }
        int var1 = 116 % ((4 - arg0) / 50);
        if (class319.field4256.field4651) {
            class199.field2650 = ((int) class199.field2650 + 47 & 0xFFFFFFF0);
        } else {
            class283.field3745 += (12.0F - class283.field3745) / 2.0F;
        }
        class319.field4261 = true;
        class419.field6089 = true;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 127)
    public static void method1493(int arg0) {
        field3159 = null;
        field3158 = null;
        field3154 = null;
        if (arg0 != 0) {
            method1491(-119, false, -85);
        }
    }
}
