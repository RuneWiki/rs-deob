import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class211 extends class569 {

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "[I")
    public int[] field3165;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "[I")
    public int[] field3168;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3163 = null;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "[I")
    public static int[] field3167 = new int[1];

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "Lha;")
    public static class543 field3164;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
    public static void method1493(int arg0) {
        if (arg0 != -58) {
            field3164 = null;
        }
        field3163 = null;
        field3164 = null;
        field3167 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)Ldn;")
    public static final class375 method1494(int arg0, int arg1, int arg2) {
        if (class565.field8185[arg0][arg1][arg2] == null) {
            boolean var3 = class565.field8185[0][arg1][arg2] != null && class565.field8185[0][arg1][arg2].field5433 != null;
            if (var3 && arg0 >= class433.field6202 - 1) {
                return null;
            }
            class25.method107(arg0, arg1, arg2);
        }
        return class565.field8185[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(III)Z")
    public static final boolean method1495(int arg0, int arg1, int arg2) {
        if (arg2 > -28) {
            return true;
        } else {
            field3162++;
            return (arg1 & 0x10) != 0;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)Z")
    public static final boolean method1496(int arg0, int arg1) {
        field3161++;
        if (arg0 != 0) {
            method1495(48, -36, -41);
        }
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BC)Z")
    public static final boolean method1497(byte arg0, char arg1) {
        if (arg0 >= -97) {
            field3167 = null;
        }
        field3166++;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(II[I[I)V")
    public class211(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field3165 = arg3;
        this.field3168 = arg2;
    }
}
