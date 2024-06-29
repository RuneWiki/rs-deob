import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class231 {

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Lub;")
    public static class227 field4037 = class257.method1749("titlebg", 17263);

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Lub;")
    public static class227 field4039 = class257.method1749("welle:", 17263);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static void method1556(byte arg0) {
        field4037 = null;
        int var1 = 39 % ((arg0 + 68) / 34);
        field4039 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V")
    public static final void method1557(int arg0, int arg1) {
        field4036++;
        if (arg0 > 65) {
            class25.field414.method1727(true, arg1);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4038++;
        if (class195.method1234(arg8, (byte) -17)) {
            class45.field745 = null;
            class58.method353(arg3, -1, class102.field1792[arg8], arg6, arg4, arg7, false, arg0, arg5, arg1);
            if (class45.field745 != null) {
                class58.method353(arg3, -1412584499, class45.field745, arg6, arg4, class171.field2868, false, arg0, arg5, class42.field685);
                class45.field745 = null;
            }
            if (arg2 != 27733) {
                field4034 = 69;
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class10.field182[var9] = true;
            }
        } else {
            class10.field182[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)Lub;")
    public static final class227 method1559(int arg0, int arg1) {
        field4040++;
        if (arg0 != 1000000) {
            method1556((byte) -32);
        }
        if (arg1 < 100000) {
            return class76.method445((byte) 94, new class227[] { class260.field4528, class204.method1303(arg1, 1), class148.field2588 });
        } else if (arg1 < 10000000) {
            return class76.method445((byte) 102, new class227[] { class195.field3314, class204.method1303(arg1 / 1000, 1), class83.field1457, class148.field2588 });
        } else {
            return class76.method445((byte) -122, new class227[] { class131.field2294, class204.method1303(arg1 / 1000000, 1), class57.field1048, class148.field2588 });
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)Lgi;")
    public static final class187 method1560(int arg0, int arg1) {
        field4035++;
        class187 var2 = (class187) class5.field115.method1735((long) arg0, (byte) -69);
        int var3 = 90 % ((-arg1 - 30) / 54);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class173.field2898.method884(arg0, 104, 1);
        class187 var5 = new class187();
        if (var4 != null) {
            var5.method1194(arg0, 128, new class226(var4));
        }
        class5.field115.method1730(var5, (long) arg0, (byte) -111);
        return var5;
    }
}
