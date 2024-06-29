import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class421 {

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Leda;")
    private class14 field6176 = new class14(64);

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lla;")
    private class422 field6174;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lla;")
    private class422 field6177;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Lit;")
    public static class34 field6175;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Luv;")
    public final class751 method2605(int arg0, int arg1) {
        if (arg0 > -115) {
            return null;
        }
        field6173++;
        class751 var3 = (class751) this.field6176.method80((byte) -88, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field6177.method2624(0, 0, arg1);
        } else {
            var4 = this.field6174.method2624(0, 0, arg1 & 0x7FFF);
        }
        class751 var5 = new class751();
        if (var4 != null) {
            var5.method4182(new class301(var4), (byte) 127);
        }
        if (arg1 >= 32768) {
            var5.method4183((byte) -99);
        }
        this.field6176.method67((long) arg1, var5, -6772);
        return var5;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method2606(byte arg0) {
        field6175 = null;
        if (arg0 != 105) {
            field6175 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(ILla;Lla;)V")
    public class421(int arg0, class422 arg1, class422 arg2) {
        this.field6174 = arg2;
        this.field6177 = arg1;
        if (this.field6177 != null) {
            this.field6177.method2615(0, 0);
        }
        if (this.field6174 != null) {
            this.field6174.method2615(0, 0);
        }
    }
}
