import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class79 extends class84 {

    @OriginalMember(owner = "client!te", name = "H", descriptor = "Lkc;")
    public class286 field1100;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "Ljava/lang/String;")
    public static String field1096 = "skill: ";

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field1097 = 0;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    public static int field1101 = -1;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "Lke;")
    public static class110 field1099;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "(I)V")
    public static void method505(int arg0) {
        field1099 = null;
        if (arg0 != 7) {
            method507(105, (class235) null, (class235) null);
        }
        field1096 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method506(int arg0, long arg1) {
        field1098++;
        class275.field4256.setTime(new Date(arg1));
        int var3 = class275.field4256.get(7);
        int var4 = class275.field4256.get(5);
        if (arg0 != 23174) {
            field1097 = 57;
        }
        int var5 = class275.field4256.get(2);
        int var6 = class275.field4256.get(1);
        int var7 = class275.field4256.get(11);
        int var8 = class275.field4256.get(12);
        int var9 = class275.field4256.get(13);
        return class255.field3906[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class253.field3859[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILhc;Lhc;)V")
    public static final void method507(int arg0, class235 arg1, class235 arg2) {
        field1095++;
        class213.field3207 = arg1;
        if (arg0 != 2) {
            method508((byte) 35, -44);
        }
        class203.field2821 = arg2;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lkc;)V")
    public class79(class286 arg0) {
        this.field1100 = arg0;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(BI)Lod;")
    public static final class93 method508(byte arg0, int arg1) {
        field1094++;
        int var2 = 112 / ((arg0 + 9) / 51);
        class93 var3 = (class93) class191.field2629.method961((long) arg1, 9156);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = class186.field2571.method1576(-127, 1, arg1 & 0x7FFF);
        } else {
            var4 = class221.field3322.method1576(-103, 1, arg1);
        }
        class93 var5 = new class93();
        if (var4 != null) {
            var5.method616(new class224(var4), (byte) -117);
        }
        if (arg1 >= 32768) {
            var5.method617((byte) 39);
        }
        class191.field2629.method957(21915, (long) arg1, var5);
        return var5;
    }
}
