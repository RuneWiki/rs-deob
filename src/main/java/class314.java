import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class314 extends class61 {

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "Lmk;")
    public class289 field5437;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "Lwm;")
    public static class152 field5441 = class157.method1048(" <col=ffff00>", 122);

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "Lwm;")
    public static class152 field5444 = class157.method1048(")4a=", 126);

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field5446 = 0;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "Lwm;")
    public static class152 field5442 = class157.method1048("niveau ", 116);

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public static int field5447 = 0;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public static int field5443 = -1;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "[I")
    public static int[] field5448 = new int[5];

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "Lka;")
    public static class188 field5438;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "Z")
    public static boolean field5440;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)I", line = 10)
    public static final int method2193(int arg0, int arg1, int arg2) {
        field5449++;
        int var3 = arg0 + (arg1 * arg2);
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Lbm;", line = 25)
    public static final class137 method2194(int arg0, int arg1) {
        field5439++;
        class137 var2 = (class137) class270.field4603.method1620(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class77.field1089.method1381(arg0, arg1, 0);
        class137 var4 = new class137();
        if (var3 != null) {
            var4.method868(new class291(var3), 0, arg1);
        }
        class270.field4603.method1614(var4, (long) arg1, (byte) 78);
        return var4;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V", line = 47)
    public static void method2195(int arg0) {
        field5448 = null;
        if (arg0 != 15731) {
            method2193(-21, -104, 95);
        }
        field5442 = null;
        field5438 = null;
        field5444 = null;
        field5441 = null;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lmk;)V", line = 60)
    public class314(class289 arg0) {
        this.field5437 = arg0;
    }
}
