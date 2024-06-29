import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class37 extends class96 {

    @OriginalMember(owner = "client!g", name = "E", descriptor = "Lwb;")
    private static class130 field1085 = class26.method212("Moderator option: Mute player for 48 hours: <OFF>", -32376);

    @OriginalMember(owner = "client!g", name = "I", descriptor = "[Lwb;")
    public static class130[] field1089 = new class130[100];

    @OriginalMember(owner = "client!g", name = "y", descriptor = "Lwb;")
    public static class130 field1079 = class26.method212("backleft2", -32376);

    @OriginalMember(owner = "client!g", name = "K", descriptor = "Lwb;")
    public static class130 field1091 = class26.method212("Hierhin gehen", -32376);

    @OriginalMember(owner = "client!g", name = "M", descriptor = "Lwb;")
    public static class130 field1093 = field1085;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    public static int field1087 = 0;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    public static int field1090 = 2301979;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    public int field1092;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "Lmc;")
    public class75 field1088;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "Lb;")
    public class7 field1081;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "[B")
    public byte[] field1086;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V", line = 3)
    public static void method374(byte arg0) {
        field1079 = null;
        field1085 = null;
        field1089 = null;
        field1091 = null;
        if (arg0 <= -44) {
            field1093 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IJ)V", line = 36)
    public static final void method375(int arg0, long arg1) {
        field1083++;
        if (arg0 != -1) {
            method380(45);
        }
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class128.method946((byte) 119, arg1 - 1L);
            class128.method946((byte) 126, 1L);
        } else {
            class128.method946((byte) 117, arg1);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIII)I", line = 59)
    public static final int method376(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -28338) {
            field1087 = 114;
        }
        field1084++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)I", line = 85)
    public static final int method377(byte arg0) {
        field1095++;
        if (arg0 <= 66) {
            method377((byte) 5);
        }
        return 19;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V", line = 96)
    public static final void method378(int arg0) {
        field1094++;
        class54.field1417.method401(26116);
        class52.field1362.method401(26116);
        class72.field1824.method401(26116);
        if (arg0 != 0) {
            field1085 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(B)V", line = 112)
    public static final void method379(byte arg0) {
        class4.field189 = true;
        int var1 = 18 % ((39 - arg0) / 42);
        field1082++;
        class34.field934 = true;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V", line = 160)
    public static final void method380(int arg0) {
        class105.field2548.method181(14664);
        class52.field1369.method744(arg0, 0);
        class3.field144 = class12.method87(class3.field144);
        field1080++;
    }
}
