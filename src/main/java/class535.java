import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public abstract class class535 extends class444 {

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public int field7854;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public int field7860;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
    public int field7858;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public int field7855;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "Lla;")
    public static class319 field7857 = new class319(2, 6);

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "Lni;")
    public static class367 field7861 = new class367(14, 3);

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field7864 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "Llp;")
    public static class272 field7863 = new class272(8);

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "[I")
    public static int[] field7865 = new int[13];

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    public static int field7856;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "[J")
    public static long[] field7862;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V", line = 6)
    public static void method3163(byte arg0) {
        field7864 = null;
        if (arg0 != -70) {
            field7861 = null;
        }
        field7857 = null;
        field7865 = null;
        field7862 = null;
        field7863 = null;
        field7861 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILie;Lie;)V", line = 24)
    public static final void method3164(int arg0, class5 arg1, class5 arg2) {
        if (arg0 != 13) {
            return;
        }
        field7856++;
        if (arg1.field36 != null) {
            arg1.method25(-13489);
        }
        arg1.field36 = arg2.field36;
        arg1.field39 = arg2;
        arg1.field36.field39 = arg1;
        arg1.field39.field36 = arg1;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIIBII)V", line = 48)
    public static final void method3165(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field7859++;
        if (arg1 == arg6) {
            class180.method1211(arg6, arg0, arg2, arg4, -102, arg7, arg3);
        } else if (arg5 >= 19) {
            if (arg3 - arg6 >= class377.field5760 && class49.field701 >= arg3 + arg6 && class463.field6924 <= (arg2 - arg1) && (arg1 + arg2) <= class369.field5628) {
                class513.method3065(arg0, arg4, arg3, (byte) -128, arg2, arg7, arg1, arg6);
            } else {
                class29.method260(arg2, (byte) 126, arg4, arg0, arg7, arg1, arg3, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(IIII)V", line = 71)
    public class535(int arg0, int arg1, int arg2, int arg3) {
        this.field7854 = arg3;
        this.field7860 = arg0;
        this.field7858 = arg2;
        this.field7855 = arg1;
    }
}
