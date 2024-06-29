import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class475 {

    @OriginalMember(owner = "client!t", name = "c", descriptor = "[I")
    public static int[] field7037 = new int[13];

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lao;")
    public static class191 field7035 = new class191(66, 7);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static void method2900(byte arg0) {
        field7035 = null;
        if (arg0 != 32) {
            field7035 = null;
        }
        field7037 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2901(int arg0, int arg1, byte arg2) {
        if (arg2 == -63) {
            field7040++;
            return (arg0 & 0x180) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILts;)V")
    public static final void method2902(int arg0, class375 arg1) {
        field7038++;
        if (arg0 < -24) {
            class319.field4258 = arg1;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2903(int arg0, int arg1, int arg2, int arg3) {
        if (class413.method2524(arg0, arg1, arg2)) {
            int var4 = arg1 << class351.field4688;
            int var5 = arg2 << class351.field4688;
            return class154.method917(var4 + 1, class152.field1993[arg0].method217(arg1, arg2) + arg3, var5 + 1) && class154.method917(class166.field2152 + var4 - 1, class152.field1993[arg0].method217(arg1 + 1, arg2) + arg3, var5 + 1) && class154.method917(class166.field2152 + var4 - 1, class152.field1993[arg0].method217(arg1 + 1, arg2 + 1) + arg3, class166.field2152 + var5 - 1) && class154.method917(var4 + 1, class152.field1993[arg0].method217(arg1, arg2 + 1) + arg3, class166.field2152 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static final void method2904(int arg0) {
        field7036++;
        for (class325 var1 = (class325) class282.field3740.method970(12); var1 != null; var1 = (class325) class282.field3740.method976((byte) -125)) {
            if (var1.field4325) {
                var1.method1915(-40751577);
            }
        }
        for (class325 var2 = (class325) class193.field2491.method970(12); var2 != null; var2 = (class325) class193.field2491.method976((byte) 45)) {
            if (var2.field4325) {
                var2.method1915(-40751577);
            }
        }
        if (arg0 != -1503) {
            field7037 = null;
        }
    }
}
