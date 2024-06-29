import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public abstract class class216 {

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "Lla;")
    public static class317 field3509;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "Lul;")
    public static class406 field3506;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIBI)V", line = 7)
    public static final void method1495(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 > -42) {
            field3506 = null;
        }
        field3508++;
        if (arg2 > arg4) {
            for (int var5 = arg4; var5 < arg2; var5++) {
                class416.field6200[var5][arg1] = arg0;
            }
        } else {
            for (int var6 = arg2; var6 < arg4; var6++) {
                class416.field6200[var6][arg1] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Llq;)V", line = 48)
    public static final void method1497(class389 arg0) {
        for (int var1 = arg0.field5836; var1 <= arg0.field5827; var1++) {
            for (int var2 = arg0.field5830; var2 <= arg0.field5829; var2++) {
                class138 var3 = client.field3311[arg0.field5826][var1][var2];
                if (var3 != null) {
                    class327 var4 = var3.field2118;
                    class327 var5 = null;
                    while (var4 != null) {
                        if (var4.field4921 == arg0) {
                            if (var5 == null) {
                                var3.field2118 = var4.field4922;
                            } else {
                                var5.field4922 = var4.field4922;
                            }
                            var4.method2082(true);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field4922;
                    }
                    var3.field2109 = 0;
                    for (class327 var6 = var3.field2118; var6 != null; var6 = var6.field4922) {
                        var3.field2109 = (byte) (var3.field2109 | var6.field4920);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V", line = 100)
    public static void method1498(byte arg0) {
        field3506 = null;
        field3509 = null;
        if (arg0 != -69) {
            field3509 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BZLuq;)V", line = 111)
    public static final void method1499(byte arg0, boolean arg1, class114 arg2) {
        field3510++;
        int var3 = arg2.field1594 == 0 ? arg2.field1642 : arg2.field1594;
        int var4 = arg2.field1709 == 0 ? arg2.field1627 : arg2.field1709;
        int var5 = -42 % ((arg0 - 16) / 60);
        class14.method100(12498, var4, var3, arg2.field1644, class200.field3326[arg2.field1644 >> 16], arg1);
        if (arg2.field1660 != null) {
            class14.method100(12498, var4, var3, arg2.field1644, arg2.field1660, arg1);
        }
        class293 var6 = (class293) class70.field993.method2585((byte) 114, (long) arg2.field1644);
        if (var6 != null) {
            class211.method1462(arg1, var3, (byte) -52, var4, var6.field4454);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)Z", line = 135)
    public static final boolean method1500(int arg0, int arg1, int arg2) {
        if (arg0 < 23) {
            method1499((byte) -123, false, null);
        }
        field3507++;
        return (arg1 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
    public abstract void method1494(int arg0);

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)I")
    public abstract int method1496(int arg0, int arg1);

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)J")
    public abstract long method1501(int arg0);
}
