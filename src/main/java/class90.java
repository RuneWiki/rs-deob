import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class90 {

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    private int field1261 = 0;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lol;")
    private class231 field1254;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lwm;")
    private static class152 field1259 = class157.method1048("Ok", 93);

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field1265 = -1;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Lwm;")
    public static class152 field1262 = class157.method1048(")4j", 117);

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lwm;")
    public static class152 field1264 = class157.method1048(": ", 117);

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Lwm;")
    public static class152 field1266 = field1259;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lbh;")
    private class273 field1257;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZII)Lhk;", line = 12)
    public static final class303 method589(boolean arg0, int arg1, int arg2) {
        field1255++;
        if (arg0) {
            method590(102, 86);
        }
        class303 var3 = (class303) class254.field4398.method1586((long) arg2 << 32 | (long) arg1, -62);
        if (var3 == null) {
            var3 = new class303(arg2, arg1);
            class254.field4398.method1593(var3.field4689, var3, 27497);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V", line = 32)
    public static final void method590(int arg0, int arg1) {
        class183.field2920 = arg0;
        class208.field3392 = -1;
        class146.field2244 = arg1;
        class79.method521((byte) -100);
        field1263++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 46)
    public static void method591(int arg0) {
        field1262 = null;
        field1259 = null;
        field1266 = null;
        if (arg0 > -17) {
            method591(95);
        }
        field1264 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)Lbh;", line = 60)
    public final class273 method592(byte arg0) {
        field1258++;
        this.field1261 = 0;
        int var2 = 70 % ((17 - arg0) / 62);
        return this.method594((byte) 101);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLah;I)Lbg;", line = 78)
    public static final class203 method593(byte arg0, class205 arg1, int arg2) {
        int var3 = -96 % ((52 - arg0) / 36);
        field1256++;
        return class52.method356((byte) 89, arg1, arg2) ? class225.method1549(3803) : null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lol;)V", line = 100)
    public class90(class231 arg0) {
        this.field1254 = arg0;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)Lbh;", line = 110)
    public final class273 method594(byte arg0) {
        field1253++;
        if (this.field1261 > 0 && this.field1254.field3771[this.field1261 - 1] != this.field1257) {
            class273 var2 = this.field1257;
            this.field1257 = var2.field4687;
            return var2;
        }
        class273 var3;
        do {
            if (this.field1254.field3770 <= this.field1261) {
                if (arg0 < 27) {
                    method593((byte) -126, (class205) null, -70);
                }
                return null;
            }
            var3 = this.field1254.field3771[this.field1261++].field4687;
        } while (this.field1254.field3771[this.field1261 - 1] == var3);
        this.field1257 = var3.field4687;
        return var3;
    }
}
