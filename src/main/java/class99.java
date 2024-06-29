import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class99 extends class141 {

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public static final void method655(boolean arg0) {
        field1393++;
        class269 var1 = class87.field1182;
        synchronized (class87.field1182) {
            class104.field1455 = class206.field2874;
            class12.field124 = class156.field2178;
            if (arg0) {
                class5.field43++;
                class287.field4543 = class34.field532;
                class202.field2798 = class224.field3398;
                class27.field344 = client.field2185;
                class81.field1112 = class27.field345;
                class151.field2110 = class153.field2129;
                class224.field3398 = 0;
            }
        }
    }
}
