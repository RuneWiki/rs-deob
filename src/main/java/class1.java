import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 extends class156 {

    @OriginalMember(owner = "client!a", name = "yb", descriptor = "I")
    public static int field7 = 0;

    @OriginalMember(owner = "client!a", name = "wb", descriptor = "Lrb;")
    public static class120 field5 = new class120(50);

    @OriginalMember(owner = "client!a", name = "Cb", descriptor = "I")
    public static int field11 = 0;

    @OriginalMember(owner = "client!a", name = "zb", descriptor = "Lrc;")
    public static class121 field8 = new class121();

    @OriginalMember(owner = "client!a", name = "Eb", descriptor = "I")
    public static int field13 = 0;

    @OriginalMember(owner = "client!a", name = "Db", descriptor = "I")
    public static int field12 = 0;

    @OriginalMember(owner = "client!a", name = "Bb", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!a", name = "tb", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!a", name = "ub", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!a", name = "vb", descriptor = "I")
    public int field4;

    @OriginalMember(owner = "client!a", name = "xb", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!a", name = "Ab", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "client!a", name = "sb", descriptor = "Lae;")
    public static class6 field1;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)Llb;")
    public final class78 method1(int arg0) {
        field3++;
        if (arg0 != -20521144) {
            method3(101);
        }
        return class27.method230((byte) -44, this.field4).method483(this.field9, -22577);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILsf;Lsf;II)Lgf;")
    public static final class48 method2(int arg0, class131 arg1, class131 arg2, int arg3, int arg4) {
        if (arg4 != 25195) {
            method2(-70, null, null, -63, 96);
        }
        field6++;
        return class100.method765(arg1, arg4 - 25177, arg0, arg3) ? class66.method497(102, arg2.method1023(arg3, arg0, (byte) -35)) : null;
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
    public static void method3(int arg0) {
        field8 = null;
        field5 = null;
        field1 = null;
        if (arg0 <= 34) {
            field7 = -106;
        }
    }
}
