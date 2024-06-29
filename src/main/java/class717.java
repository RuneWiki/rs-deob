import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class717 extends IOException {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lpd;")
    public static class646 field10011 = new class646(0);

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Z")
    public static boolean field10018 = true;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field10012;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field10014;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field10015;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field10016;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field10017;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[Lth;")
    public static class131[] field10013;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLkja;)V")
    public static final void method3992(boolean arg0, class373 arg1) {
        field10015++;
        arg1.method2220((byte) -126);
        int var2 = class541.field7492;
        class21 var3 = class719.field10041 = class588.field8451[var2] = new class21();
        var3.field4051 = var2;
        int var4 = arg1.method2222(8, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFF970) >> 14;
        int var7 = var4 & 0x3FFF;
        var3.field4142[0] = var6 - class222.field3266;
        var3.field10347 = (var3.field4142[0] << 9) + (var3.method209(true) << 8);
        var3.field4136[0] = var7 - class697.field9798;
        var3.field10350 = (var3.field4136[0] << 9) + (var3.method209(arg0) << 8);
        class403.field5560 = var3.field10361 = var3.field10349 = var5;
        if (method3994(32281, var3.field4142[0], var3.field4136[0])) {
            var3.field10349++;
        }
        if (class39.field456[var2] != null) {
            var3.method195((byte) -120, class39.field456[var2]);
        }
        class469.field6382 = 0;
        class464.field6311[class469.field6382++] = var2;
        class84.field1268[var2] = 0;
        class443.field6145 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method2222(8, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFF50) >> 8;
                int var12 = var9 & 0xFF;
                class138 var13 = class197.field2970[var8] = new class138();
                var13.field2280 = false;
                var13.field2283 = false;
                var13.field2279 = (var10 << 28) + (var11 << 14) + var12;
                var13.field2284 = -1;
                var13.field2287 = 0;
                class319.field4541[class443.field6145++] = var8;
                class84.field1268[var8] = 0;
            }
        }
        arg1.method2223(false);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static final void method3993(byte arg0) {
        field10016++;
        if (arg0 >= 118) {
            class122.field2072 = new class554(class563.field7802.method3281(class423.field5892, -1), "", class578.field8338, 1002, -1, 0L, 0, 0, true, false, 0L, true);
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class717(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Z")
    public static final boolean method3994(int arg0, int arg1, int arg2) {
        field10014++;
        if (arg1 >= 0 && arg2 >= 0 && class336.field4782[1].length > arg1 && arg2 < class336.field4782[1][arg1].length) {
            if (arg0 != 32281) {
                field10011 = null;
            }
            return (class336.field4782[1][arg1][arg2] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)I")
    public static final int method3995(byte arg0, int arg1) {
        field10012++;
        int var2 = -64 % ((arg0 + 17) / 56);
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method3996(int arg0) {
        int var1 = 41 % ((29 - arg0) / 58);
        field10013 = null;
        field10011 = null;
    }
}
