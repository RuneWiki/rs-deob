import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class135 extends class665 {

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Lkn;")
    public static class688 field1982 = new class688(0, 0);

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public int field1979;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public int field1980;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Lqaa;")
    public class26 field1978;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Ldg;")
    public class376 field1984;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Lf;")
    public static class702 field1981;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLvq;)V")
    public static final void method984(boolean arg0, class425 arg1) {
        field1985++;
        int var2 = arg1.field6169 - class564.field7962;
        int var3 = arg1.field6249 * 512 + arg1.method2553((byte) 74) * 256;
        int var4 = arg1.field6187 * 512 + arg1.method2553((byte) 114) * 256;
        arg1.field3029 += (var4 - arg1.field3029) / var2;
        arg1.field3024 += (var3 - arg1.field3024) / var2;
        arg1.field6264 = 0;
        if (arg1.field6179 == 0) {
            arg1.method2552(-36, 8192);
        }
        if (arg1.field6179 == 1) {
            arg1.method2552(-38, 12288);
        }
        if (arg1.field6179 == 2) {
            arg1.method2552(-68, 0);
        }
        if (arg1.field6179 == 3) {
            arg1.method2552(-37, 4096);
        }
        if (arg0) {
            field1981 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public final void method985(byte arg0) {
        if (arg0 < 82) {
            method984(false, null);
        }
        field1983++;
        if (class598.field8450 < class647.field9096.length) {
            class647.field9096[class598.field8450++] = this;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method986(int arg0) {
        field1982 = null;
        field1981 = null;
        if (arg0 != 12853) {
            field1981 = null;
        }
    }
}
