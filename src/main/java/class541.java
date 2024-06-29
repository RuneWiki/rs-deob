import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class541 extends class42 {

    @OriginalMember(owner = "client!sw", name = "r", descriptor = "Lvr;")
    public static class92 field7957 = new class92(2, 4, 4, 0);

    @OriginalMember(owner = "client!sw", name = "u", descriptor = "[I")
    public static int[] field7960 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!sw", name = "o", descriptor = "I")
    public static int field7954;

    @OriginalMember(owner = "client!sw", name = "p", descriptor = "I")
    public int field7955;

    @OriginalMember(owner = "client!sw", name = "q", descriptor = "I")
    public int field7956;

    @OriginalMember(owner = "client!sw", name = "s", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!sw", name = "t", descriptor = "Lci;")
    public static class320 field7959;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lnf;BII)V", line = 9)
    public static final void method3179(class414 arg0, byte arg1, int arg2, int arg3) {
        class57.field1019[arg3][arg2] = arg0;
        field7958++;
        if (arg1 >= -69) {
            method3181(-28);
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Luc;I)V", line = 23)
    public static final void method3180(class23 arg0, int arg1) {
        field7954++;
        int var2 = arg0.field308 - class24.field349;
        if (arg1 < 50) {
            field7957 = null;
        }
        int var3 = arg0.field236 * 128 + arg0.method135((byte) 72) * 64;
        int var4 = arg0.field279 * 128 + (arg0.method135((byte) 72) * 64);
        arg0.field336 = 0;
        arg0.field6961 += (var3 - arg0.field6961) / var2;
        arg0.field6965 += (var4 - arg0.field6965) / var2;
        if (arg0.field266 == 0) {
            arg0.method134((byte) -124, 8192);
        }
        if (arg0.field266 == 1) {
            arg0.method134((byte) -104, 12288);
        }
        if (arg0.field266 == 2) {
            arg0.method134((byte) -111, 0);
        }
        if (arg0.field266 == 3) {
            arg0.method134((byte) -95, 4096);
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)V", line = 58)
    public static void method3181(int arg0) {
        field7960 = null;
        field7959 = null;
        field7957 = null;
        if (arg0 != 0) {
            method3181(-40);
        }
    }
}
