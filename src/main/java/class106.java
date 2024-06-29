import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class106 extends class147 {

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public int field1291;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "Lpn;")
    public static class72 field1293 = new class72(68, 16);

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "Lec;")
    public static class40 field1294 = new class40("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "Lsd;")
    public static class74 field1295 = new class74(69, 3);

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method506(byte arg0, int arg1) {
        field1290++;
        class89 var2 = class146.method695(2, arg1, (byte) -50);
        var2.method448(13);
        if (arg0 != 75) {
            method506((byte) 49, 108);
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)V", line = 17)
    public static void method507(byte arg0) {
        field1293 = null;
        field1295 = null;
        field1294 = null;
        int var1 = 81 / ((-arg0 - 20) / 53);
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(II)V", line = 31)
    public class106(int arg0, int arg1) {
        this.field1292 = arg0;
        this.field1291 = arg1;
    }
}
