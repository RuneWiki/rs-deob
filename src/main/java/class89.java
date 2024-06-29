import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class89 extends class273 {

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "Lwm;")
    public static class152 field1248 = class157.method1048("::gc", 116);

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public static int field1252 = 0;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public int field1245;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public int field1247;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "Lah;")
    public static class205 field1251;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V", line = 6)
    public static void method585(int arg0) {
        field1248 = null;
        if (arg0 != 0) {
            field1248 = (class152) null;
        }
        field1251 = null;
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)I", line = 23)
    public static final int method586(int arg0) {
        if (arg0 != 1) {
            field1248 = (class152) null;
        }
        field1246++;
        if (class23.field397 != null) {
            return 3;
        } else if (class217.field3516 && class63.field947) {
            return 2;
        } else if (class217.field3516 && !class63.field947) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)V", line = 59)
    public static final void method587(int arg0, int arg1, int arg2) {
        field1244++;
        if (arg2 >= -2) {
            field1252 = 88;
        }
        if (arg0 == 4 && !class100.field1454) {
            arg0 = 2;
            arg1 = 2;
        }
        if (class323.field5640 != arg0) {
            if (class28.field481) {
                return;
            }
            if (class323.field5640 != 0) {
                class239.field3928[class323.field5640].method37();
            }
            if (arg0 != 0) {
                class29 var3 = class239.field3928[arg0];
                var3.method34();
                var3.method35(arg1);
            }
            class323.field5640 = arg0;
            class77.field1095 = arg1;
        } else if (arg0 != 0 && class77.field1095 != arg1) {
            class239.field3928[arg0].method35(arg1);
            class77.field1095 = arg1;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILoe;II)V", line = 109)
    public static final void method588(int arg0, class127 arg1, int arg2, int arg3) {
        field1250++;
        if (class160.field2556 < 2 && class268.field4527 == 0 && !class125.field1762) {
            return;
        }
        class152 var4 = class210.method1416(-2);
        if (arg0 != 19049) {
            return;
        }
        if (arg1 == null) {
            int var6 = class316.field5485.method1132(var4, arg2 + 4, arg3 + 15, 16777215, 0, class268.field4514, class125.field1747);
            class265.method1821(arg2 + 4, 15, arg3, var6 + class316.field5485.method1123(var4), (byte) -104);
            return;
        }
        class171 var5 = arg1.method804(class49.field772, arg0 - 19049);
        if (var5 == null) {
            var5 = class316.field5485;
        }
        var5.method1121(var4, arg2, arg3, arg1.field1876, arg1.field1921, arg1.field1856, arg1.field1770, arg1.field1859, arg1.field1897, class268.field4514, class125.field1747, class251.field4283);
        class265.method1821(class251.field4283[0], class251.field4283[3], class251.field4283[1], class251.field4283[2], (byte) -104);
    }
}
