import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class19 {

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "Lqv;")
    public static class316 field209 = new class316(23, -1);

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "[Lue;")
    public static class159[] field213 = new class159[4];

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILtf;B)V")
    public static final void method107(int arg0, int arg1, class198 arg2, byte arg3) {
        class154.field2347 = arg2;
        class182.field2684 = arg0;
        field210++;
        class258.field3828 = arg1;
        if (arg3 != 83) {
            field208 = -74;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lci;I)I")
    public static final int method108(class320 arg0, int arg1) {
        field212++;
        int var2 = 0;
        if (arg1 != -18277) {
            return 34;
        }
        if (arg0.method2035(class320.field4761, (byte) -94)) {
            var2++;
        }
        if (arg0.method2035(class172.field2557, (byte) -94)) {
            var2++;
        }
        if (arg0.method2035(class313.field4673, (byte) -94)) {
            var2++;
        }
        if (arg0.method2035(class246.field3678, (byte) -94)) {
            var2++;
        }
        if (arg0.method2035(class175.field2610, (byte) -94)) {
            var2++;
        }
        if (arg0.method2035(class134.field2089, (byte) -94)) {
            var2++;
        }
        if (arg0.method2035(class69.field1146, (byte) -94)) {
            var2++;
        }
        if (arg0.method2035(class189.field2775, (byte) -94)) {
            var2++;
        }
        if (arg0.method2035(class58.field1048, (byte) -94)) {
            var2++;
        }
        if (arg0.method2035(class276.field4121, (byte) -94)) {
            var2++;
        }
        if (arg0.method2035(class154.field2348, (byte) -94)) {
            var2++;
        }
        if (arg0.method2035(class107.field1613, (byte) -94)) {
            var2++;
        }
        if (arg0.method2035(class393.field5593, (byte) -94)) {
            var2++;
        }
        if (arg0.method2035(class51.field934, (byte) -94)) {
            var2++;
        }
        if (arg0.method2035(class374.field5382, (byte) -94)) {
            var2++;
        }
        if (arg0.method2035(class42.field865, (byte) -94)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
    public static void method109(byte arg0) {
        field213 = null;
        field209 = null;
        int var1 = -86 / ((arg0 + 45) / 34);
    }
}
