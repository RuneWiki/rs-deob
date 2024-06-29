import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class84 extends class447 {

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    public static int field1293 = -1;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "Ljava/lang/String;")
    public static String field1294 = "glow2:";

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field1299 = 0;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public int field1288;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public int field1289;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public int field1300;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "Lqj;")
    public static class296 field1285;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "Ljava/lang/String;")
    public String field1297;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "[I")
    public int[] field1296;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "[I")
    public int[] field1301;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "[Lbr;")
    public class223[] field1291;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "[Lpm;")
    public static class347[] field1302;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "[Ljava/lang/String;")
    public String[] field1295;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "[[I")
    public static int[][] field1286;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Leb;B)Lbi;", line = 14)
    public static final class280 method592(class371 arg0, byte arg1) {
        field1290++;
        return arg1 < 43 ? null : new class280(arg0.method2378(-1), arg0.method2378(-1), arg0.method2378(-1), arg0.method2378(-1), arg0.method2425(72), arg0.method2425(-117), arg0.method2429(0));
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V", line = 25)
    public static void method593(int arg0) {
        field1286 = null;
        field1302 = null;
        if (arg0 != -1) {
            field1293 = -127;
        }
        field1285 = null;
        field1294 = null;
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V", line = 39)
    public static final void method594(int arg0) {
        field1287++;
        if (arg0 <= -118) {
            class249.field3445.method1249(1);
        }
    }
}
