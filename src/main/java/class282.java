import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class282 {

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4139 = "Starting 3d Library";

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field4137 = -1;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field4140 = 0;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)V")
    public static final void method1801(int arg0, boolean arg1) {
        if (arg1 && class76.field1019 != null) {
            class262.field3822 = class76.field1019.field2319;
        } else {
            class262.field3822 = -1;
        }
        field4138++;
        class76.field1019 = null;
        class204.field2952 = null;
        class106.field1425 = null;
        class424.field6305 = 0;
        class76.method480();
        class76.field1031.method2654(0);
        class76.field1022 = null;
        class312.field4473 = null;
        class358.field5239 = null;
        class339.field4990 = null;
        class115.field1564 = -1;
        class437.field6421 = null;
        class1.field8 = null;
        class124.field1655 = null;
        class50.field696 = null;
        class291.field4211 = -1;
        class319.field4569 = null;
        class106.field1418 = null;
        class205.method1297(arg0);
        class292.method1872(128, 64, -101);
        class391.method2557(64, 64, (byte) 0);
        class101.method686(-4028, 64);
        class258.method1626(~arg0, 64);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1802(int arg0) {
        field4139 = null;
        if (arg0 != 64) {
            field4140 = 66;
        }
    }
}
