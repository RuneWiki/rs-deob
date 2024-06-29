import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public abstract class class345 extends class130 {

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public static int field5141 = 0;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "F")
    public static float field5139;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)I")
    public abstract int method1906(byte arg0);

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)I")
    public abstract int method1903(int arg0);

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)I")
    public abstract int method1907(int arg0);

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "(I)J")
    public abstract long method1908(int arg0);

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method2220(int arg0, long arg1) {
        field5140++;
        class194.field3004.setTime(new Date(arg1));
        if (arg0 != -31125) {
            field5141 = 96;
        }
        int var3 = class194.field3004.get(7);
        int var4 = class194.field3004.get(5);
        int var5 = class194.field3004.get(2);
        int var6 = class194.field3004.get(1);
        int var7 = class194.field3004.get(11);
        int var8 = class194.field3004.get(12);
        int var9 = class194.field3004.get(13);
        return class438.field6538[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class193.field2962[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)I")
    public abstract int method1905(boolean arg0);
}
