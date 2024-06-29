import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class71 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field1126 = 0;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Ljava/util/Random;")
    public static Random field1133 = new Random();

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Lag;")
    public static class188 field1136 = null;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field1138 = 0;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field1137 = 0;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Luf;")
    public static class176 field1130;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[[[Lwd;")
    public static class23[][][] field1134;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method554(String arg0, int arg1) {
        field1131++;
        if (class293.field4615 == null || arg0.length() == 0) {
            return -1;
        }
        int var2 = -48 / ((-arg1 - 17) / 50);
        for (int var3 = 0; var3 < class293.field4615.field4535; var3++) {
            if (class290.method1953(0, class293.field4615.field4538[var3], " ", "<br>").equals(arg0)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([BB)Lud;")
    public static final class2 method555(byte[] arg0, byte arg1) {
        field1132++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -35) {
            field1133 = null;
        }
        class40 var2 = new class40(arg0, class184.field2764, class239.field3698, class270.field4281, class107.field1717, class289.field4554);
        class239.method1619(arg1 ^ 0xFFFF00C7);
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILag;III)V")
    public static final void method556(int arg0, class188 arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= ~class119.field1837) {
            class201.method1345(arg4, arg0, 0, arg1.field2850, arg1.field2858);
        } else {
            ((class49) class287.field4527).method403(arg4, arg0, arg1.field2922, arg1.field2928, class287.field4527.field54 / 2, class287.field4527.field52 / 2, (int) class276.field4334, 256, arg1.field2850, arg1.field2858);
        }
        class222.field3476[arg2] = true;
        field1127++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static final void method557(int arg0) {
        class55.method449(true);
        field1128++;
        class261.method1743((byte) 114);
        class123.method879(true);
        class219.method1462(1027033762);
        class273.method1841(false);
        class29.method237((byte) -86);
        class189.method1281(1);
        class255.method1696((byte) -71);
        class167.method1106(-11512);
        class15.method150(false);
        class112.method827((byte) 124);
        class99.method769(arg0 ^ 0x471B);
        class88.method706(arg0 ^ 0xFFFFB8BE);
        class234.method1563((byte) 11);
        class227.method1510((byte) -128);
        class290.method1954(111);
        if (arg0 != 18294) {
            field1133 = null;
        }
        class53.method437((byte) 14);
        class8.method94((byte) -12);
        class34.method268(26504);
        class47.method380((byte) 66);
        class287.field4524.method1783(0);
        class263.field4110.method1783(0);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public static void method558(int arg0) {
        field1134 = null;
        if (arg0 != 13053) {
            method555((byte[]) null, (byte) 1);
        }
        field1136 = null;
        field1130 = null;
        field1133 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method559(byte arg0, String arg1) {
        if (arg0 <= 3) {
            field1133 = null;
        }
        field1129++;
        int var2 = class235.method1575(arg1, (byte) 120);
        if (var2 != -1) {
            int[] var3 = class87.field1422.method1991(class293.field4615.field4543[var2] >> 14 & 0x3FFF, class293.field4615.field4543[var2] & 0x3FFF, 0, class293.field4615.field4543[var2] >> 28 & 0x3);
            class129.method911(var3[2], var3[1], -122);
        }
    }
}
