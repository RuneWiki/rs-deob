import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class94 {

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field1240 = 765;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field1238 = -1;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field1242 = new Hashtable();

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "[I")
    public static int[] field1243;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "[Luf;")
    public static class466[] field1239;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 5)
    public static final void method721(int arg0) {
        field1241++;
        class252 var1 = (class252) class700.field9768.method2090(true);
        boolean var2 = class655.field9114 != null || class210.field2710 > 0;
        if (var2) {
            class362.field4679 = 1;
        }
        if (class465.field6070 && class390.field4990.method3168(256, 81) && class291.field3758 > 2) {
            if (var2) {
                class592.field8017 = (class57) class658.field9176.field4702.field5497.field5497;
            } else {
                class559.method2993(-22678, var1.method320(-120), var1.method323(-5), (class57) class658.field9176.field4702.field5497.field5497);
            }
        } else if (var2) {
            class592.field8017 = (class57) class658.field9176.field4702.field5497;
        } else {
            class559.method2993(-22678, var1.method320(-99), var1.method323(-5), (class57) class658.field9176.field4702.field5497);
        }
        if (arg0 < 81) {
            method721(24);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V", line = 47)
    public static void method722(boolean arg0) {
        if (!arg0) {
            field1242 = null;
            field1243 = null;
            field1239 = null;
        }
    }
}
