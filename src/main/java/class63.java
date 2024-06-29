import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class63 {

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Lsc;")
    public static class252 field1191 = new class252();

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Lrj;")
    public static class17 field1194 = new class17(0, 0);

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lqd;")
    public static class40 field1196 = class147.method1106("blinken1:", (byte) -53);

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Lch;")
    public static class133 field1197 = new class133(64);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 8)
    public static void method515(int arg0) {
        int var1 = 0 / ((arg0 - 10) / 60);
        field1196 = null;
        field1197 = null;
        field1194 = null;
        field1191 = null;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 121)
    public static final void method516(int arg0) {
        class28.field604.method1349(true);
        field1192++;
        if (arg0 != -4670) {
            method518(67, -107);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)I", line = 136)
    public static final int method517(int arg0, int arg1, int arg2) {
        if (arg2 != -110880281) {
            method515(99);
        }
        field1190++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I", line = 190)
    public static final int method518(int arg0, int arg1) {
        field1193++;
        if (arg1 >= 97 && arg1 <= 122 || arg1 >= 224 && arg1 <= 254 && arg1 != 247) {
            return arg1 - 32;
        } else if (~arg1 == arg0) {
            return 159;
        } else if (arg1 == 156) {
            return 140;
        } else {
            return arg1;
        }
    }
}
