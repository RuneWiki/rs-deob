import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class102 {

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "[I")
    public static int[] field1533 = new int[2];

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "[I")
    public static int[] field1532 = new int[14];

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lnc;BII)V", line = 12)
    public static final void method884(class171 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 > -39) {
            field1532 = (int[]) null;
        }
        if (arg0.field1343 == arg2 && arg2 != -1) {
            class93 var4 = class126.method1091((byte) 5, arg2);
            int var5 = var4.field1405;
            if (var5 == 1) {
                arg0.field1310 = 1;
                arg0.field1369 = 0;
                arg0.field1302 = arg3;
                arg0.field1329 = 0;
                arg0.field1332 = 0;
                class335.method2358(arg0.field1359, arg0.field1329, var4, class173.field2746 == arg0, arg0.field1286, true);
            }
            if (var5 == 2) {
                arg0.field1332 = 0;
            }
        } else if (arg2 == -1 || arg0.field1343 == -1 || class126.method1091((byte) 7, arg2).field1423 >= class126.method1091((byte) 9, arg0.field1343).field1423) {
            arg0.field1302 = arg3;
            arg0.field1343 = arg2;
            arg0.field1332 = 0;
            arg0.field1329 = 0;
            arg0.field1310 = 1;
            arg0.field1369 = 0;
            arg0.field1294 = arg0.field1321;
            if (arg0.field1343 != -1) {
                class335.method2358(arg0.field1359, arg0.field1329, class126.method1091((byte) 93, arg0.field1343), class173.field2746 == arg0, arg0.field1286, true);
            }
        }
        field1535++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 63)
    public static void method885(int arg0) {
        if (arg0 > 99) {
            field1533 = null;
            field1532 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V", line = 90)
    public static final void method886(boolean arg0) {
        field1537++;
        if (!arg0) {
            field1533 = (int[]) null;
        }
        if (class68.field1048 != null) {
            class68.field1048.method1878((byte) 117);
        }
        if (class94.field1434 != null) {
            class94.field1434.method1878((byte) -120);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lwk;Lwk;I)V", line = 107)
    public static final void method887(class172 arg0, class172 arg1, int arg2) {
        if (arg1.field2740 != null) {
            arg1.method1357(947647010);
        }
        arg1.field2737 = arg0;
        if (arg2 < -37) {
            field1534++;
            arg1.field2740 = arg0.field2740;
            arg1.field2740.field2737 = arg1;
            arg1.field2737.field2740 = arg1;
        }
    }
}
