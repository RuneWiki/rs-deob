import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class545 {

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "Ljv;")
    public static class87 field7383 = new class87(64);

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public int field7385;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public int field7386;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public int field7388;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public int field7390;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public int field7391;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
    public int field7394;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "Lan;")
    public static class25 field7392;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BLw;Lmga;)Lkf;")
    public static final class267 method3099(byte arg0, class317 arg1, class739 arg2) {
        field7393++;
        if (arg0 < 31) {
            field7392 = null;
        }
        class267 var3 = class47.method366(-2);
        var3.field3933 = arg2.field10208;
        var3.field3937 = arg2;
        if (var3.field3933 == -1) {
            var3.field3938 = new class315(260);
        } else if (var3.field3933 == -2) {
            var3.field3938 = new class315(10000);
        } else if (var3.field3933 <= 18) {
            var3.field3938 = new class315(20);
        } else if (var3.field3933 > 98) {
            var3.field3938 = new class315(260);
        } else {
            var3.field3938 = new class315(100);
        }
        var3.field3938.method1988(arg1, -7860);
        var3.field3938.method1983(-110, var3.field3937.method4092((byte) -68));
        var3.field3940 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
    public static void method3100(int arg0) {
        if (arg0 != 32) {
            method3099((byte) 69, null, null);
        }
        field7392 = null;
        field7383 = null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)Z")
    public static final boolean method3101(int arg0, int arg1, int arg2) {
        if (arg0 != 32) {
            method3099((byte) 16, null, null);
        }
        field7387++;
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(JB)I")
    public static final int method3102(long arg0, byte arg1) {
        field7389++;
        int var3 = 114 % ((arg1 - 16) / 51);
        return (int) (arg0 / 86400000L) - 11745;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IJ)I")
    public static final int method3103(int arg0, long arg1) {
        class109.method822((byte) -120, arg1);
        int var3 = 80 / ((arg0 - 67) / 57);
        field7384++;
        return class295.field4285.get(1);
    }
}
