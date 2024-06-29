import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class49 {

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Z")
    public static boolean field736 = false;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[B")
    public byte[] field731;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "[S")
    public short[] field735;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "[S")
    public short[] field739;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "[S")
    public short[] field740;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static final void method352(int arg0) {
        field732++;
        for (class160 var1 = (class160) class131.field1826.method821((byte) 112); var1 != null; var1 = (class160) class131.field1826.method818(72)) {
            class480.method2923(var1.field2230, 0);
        }
        int var2 = -56 / ((arg0 + 29) / 61);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method353(int arg0, int arg1, int arg2) {
        if (arg2 != 8089) {
            method352(105);
        }
        field738++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }
}
