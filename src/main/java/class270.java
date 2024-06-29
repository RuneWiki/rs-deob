import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class270 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Z")
    public static boolean field4311 = false;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "[S")
    public static short[] field4312 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lce;")
    public class270 field4310;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lce;")
    public class270 field4313;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 11)
    public static final void method1847(byte arg0) {
        if (arg0 < 32) {
            return;
        }
        field4314++;
        for (class239 var1 = (class239) class238.field3897.method2297(14204); var1 != null; var1 = (class239) class238.field3897.method2291(-88)) {
            class316 var2 = var1.field3914;
            if (class205.field3497 != var2.field5019 || var2.field5022) {
                var1.method2195(-1);
            } else if (class181.field3045 >= var2.field5018) {
                var2.method2176(-4341, class31.field446);
                if (var2.field5022) {
                    var1.method2195(-1);
                } else {
                    class243.method1702(var2.field5019, var2.field4998, var2.field5014, var2.field5005, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 45)
    public static void method1848(int arg0) {
        field4312 = null;
        if (arg0 != 23275) {
            method1848(-61);
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V", line = 65)
    public final void method1849(byte arg0) {
        if (arg0 != -64) {
            this.field4310 = (class270) null;
        }
        field4315++;
        if (this.field4313 != null) {
            this.field4313.field4310 = this.field4310;
            this.field4310.field4313 = this.field4313;
            this.field4313 = null;
            this.field4310 = null;
        }
    }
}
