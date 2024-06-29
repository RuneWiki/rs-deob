import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class167 {

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field3092 = 0;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lgk;")
    public static class157 field3095 = new class157();

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "[I")
    public static int[] field3099 = new int[1000];

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Lid;")
    public static class149 field3100 = class60.method382("brillant2:", (byte) 117);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Lhd;")
    public static class11 field3097;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lal;")
    public static class230 field3098;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)Lid;")
    public static final class149 method1215(byte arg0, int arg1) {
        field3094++;
        if (arg0 > -89) {
            return null;
        } else {
            class149 var2 = new class149();
            var2.field2670 = 0;
            var2.field2694 = new byte[arg1];
            return var2;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method1216(int arg0) {
        if (arg0 != 25548) {
            method1215((byte) -55, 102);
        }
        field3097 = null;
        field3095 = null;
        field3098 = null;
        field3099 = null;
        field3100 = null;
    }
}
