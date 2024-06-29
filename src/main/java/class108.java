import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class108 {

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public int field1347 = -1;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field1348 = 0;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Lvj;")
    public static class373 field1346 = new class373(21, 3);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Lpj;")
    public class126 field1350;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "[I")
    public int[] field1345;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "[Ljava/lang/String;")
    public String[] field1349;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIILet;)V")
    public static final void method630(int arg0, int arg1, int arg2, class509 arg3) {
        field1343++;
        if (class289.field3757 != null || class473.field6634 || arg3 == null || class193.method1049(-110, arg3) == null) {
            return;
        }
        class289.field3757 = arg3;
        class40.field312 = class193.method1049(-78, arg3);
        class197.field2382 = arg0;
        class372.field4895 = false;
        class98.field1220 = arg2;
        class395.field5221 = arg1;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static final void method631(int arg0) {
        field1344++;
        if (class165.field2016.toLowerCase().indexOf("microsoft") == -1) {
            class7.field54[47] = 73;
            class7.field54[44] = 71;
            class7.field54[59] = 57;
            class7.field54[93] = 43;
            class7.field54[46] = 72;
            if (class165.field2032 == null) {
                class7.field54[222] = 59;
                class7.field54[192] = 58;
            } else {
                class7.field54[222] = 58;
                class7.field54[520] = 59;
                class7.field54[192] = 28;
            }
            class7.field54[45] = 26;
            class7.field54[92] = 74;
            class7.field54[61] = 27;
            class7.field54[91] = 42;
        } else {
            class7.field54[223] = 28;
            class7.field54[192] = 58;
            class7.field54[219] = 42;
            class7.field54[188] = 71;
            class7.field54[222] = 59;
            class7.field54[189] = 26;
            class7.field54[186] = 57;
            class7.field54[220] = 74;
            class7.field54[187] = 27;
            class7.field54[191] = 73;
            class7.field54[221] = 43;
            class7.field54[190] = 72;
        }
        if (arg0 != 17348) {
            field1346 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public static void method632(int arg0) {
        field1346 = null;
        if (arg0 != 43) {
            method632(-51);
        }
    }
}
