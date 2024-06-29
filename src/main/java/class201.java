import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class201 extends class207 {

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field3091 = 0;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "Z")
    public static boolean field3094 = false;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field3095 = 0;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public int field3097;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Lsc;")
    public static class158 field3089;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Ljava/lang/String;")
    public String field3087;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "Ljava/lang/String;")
    public String field3092;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "[I")
    public static int[] field3085;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lrm;I)V", line = 4)
    public static final void method1372(class190 arg0, int arg1) {
        field3096++;
        class170.method1178(arg0, arg1, (byte) -24);
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V", line = 12)
    public static final void method1373(byte arg0) {
        class111.field1645.method651(0);
        field3088++;
        class207.field3155.method651(0);
        if (arg0 != 116) {
            method1375(-119);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)V", line = 24)
    public static final void method1374(boolean arg0, int arg1) {
        if (arg0) {
            method1375(-53);
        }
        field3090++;
        class268.field4419.method645(arg1, (byte) -117);
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V", line = 43)
    public static void method1375(int arg0) {
        field3089 = null;
        field3085 = null;
        if (arg0 != 200000) {
            field3085 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(B)Lrg;", line = 54)
    public final class307 method1376(byte arg0) {
        if (arg0 == 120) {
            field3093++;
            return class178.field2782[this.field3150];
        } else {
            return (class307) null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", line = 72)
    public static final void method1377(byte arg0, String arg1, int arg2, String arg3, String arg4) {
        if (arg0 > 66) {
            class358.method2491(arg3, -1, arg1, arg4, -21381, arg2);
            field3084++;
        }
    }
}
