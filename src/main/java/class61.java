import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class61 extends class81 {

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public int field1218 = 0;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
    public int field1231 = -1;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "Lpj;")
    public static class237 field1221 = class33.method353("leuchten1:", 110);

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "Lpj;")
    public static class237 field1222 = class33.method353("<col=ff3000>", 60);

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "[I")
    public static int[] field1223 = new int[2];

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "Z")
    public static volatile boolean field1234 = false;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public int field1216;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public int field1217;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public int field1220;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
    public int field1232;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
    public int field1233;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "I")
    public int field1236;

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "Lfa;")
    public static class239 field1224;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "[Lcj;")
    public static class115[] field1219;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Lw;")
    public static final class141 method519(int arg0, int arg1, int arg2) {
        field1230++;
        class141 var3 = class70.method572(arg1 + 20043, arg2);
        if (~arg0 == arg1) {
            return var3;
        } else if (var3 == null || var3.field2457 == null || arg0 >= var3.field2457.length) {
            return null;
        } else {
            return var3.field2457[arg0];
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)V")
    public static void method520(int arg0) {
        field1221 = null;
        field1219 = null;
        field1223 = null;
        field1222 = null;
        if (arg0 < 80) {
            field1225 = -104;
        }
        field1224 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)I")
    public static final int method521(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field1229++;
        if (arg3 == var4) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)V")
    public static final void method522(boolean arg0) {
        field1238++;
        if (class79.field1485 != null) {
            class79.field1485.method1080(0);
        }
        if (class131.field2312 != null) {
            class131.field2312.method1080(0);
        }
        if (arg0) {
            return;
        }
        class268.method1783(class141.field2499, 2, 10867, 22050);
        class79.field1485 = class134.method933(class20.field379, 0, (byte) 93, class268.field4572, 22050);
        class79.field1485.method1078(113, class243.field4262);
        class131.field2312 = class134.method933(class20.field379, 1, (byte) 93, class268.field4572, 2048);
        class131.field2312.method1078(-17, class74.field1424);
    }
}
