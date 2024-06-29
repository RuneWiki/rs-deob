import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class109 extends class561 {

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "Lfi;")
    public class55 field1416;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "Lbb;")
    public class381 field1412;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "F")
    public static float field1408 = 1.0F;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "Leaa;")
    public static class43 field1409;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "[Lef;")
    public static class533[] field1414;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public final void method592(int arg0) {
        field1417++;
        this.field1411 = this.field1416.field729;
        this.field1413 = this.field1416.field730;
        this.field1415 = this.field1416.field735;
        if (this.field1416.field741 != null) {
            this.field1416.field741.method367(this.field1412.field5336, this.field1412.field5326, this.field1412.field5319, class591.field8539);
        }
        this.field1418 = class591.field8539[arg0];
        this.field1410 = class591.field8539[0];
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
    public static void method593(int arg0) {
        if (arg0 != 0) {
            method593(118);
        }
        field1409 = null;
        field1414 = null;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lfi;Llm;)V")
    public class109(class55 arg0, class309 arg1) {
        this.field1416 = arg0;
        this.field1412 = this.field1416.method302(22461);
        this.method592(2);
    }
}
