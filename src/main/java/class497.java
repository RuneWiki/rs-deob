import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public abstract class class497 {

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "Ldia;")
    public class246 field6867;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "Z")
    public static boolean field6866 = false;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "Z")
    public static boolean field6870 = false;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "[Lvr;")
    public static class147[] field6868;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZZ)Z", line = 5)
    public static boolean method2873(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Ldia;)V", line = 13)
    public class497(class246 arg0) {
        this.field6867 = arg0;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BLjava/lang/String;)I", line = 27)
    public static final int method2874(byte arg0, String arg1) {
        field6871++;
        if (arg0 >= -121) {
            return 3;
        }
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = ((var3 << 5) + arg1.charAt(var4)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)V", line = 49)
    public static final void method2875(int arg0, int arg1) {
        field6869++;
        if (class458.field6355 != 7) {
            return;
        }
        if (arg1 != -2030) {
            method2875(-60, -15);
        }
        if (class674.field9468 == 0 && class268.field3949 == 0) {
            class39.field623 = arg0;
            class300.method1901(9, arg1 ^ 0xFFFFF810);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V", line = 69)
    public static void method2876(int arg0) {
        if (arg0 != 0) {
            method2875(71, -124);
        }
        field6868 = null;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILil;I)V")
    public abstract void method158(int arg0, class7 arg1, int arg2);

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(ZZ)V")
    public abstract void method163(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZ)V")
    public abstract void method164(int arg0, boolean arg1);

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(III)V")
    public abstract void method162(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)Z")
    public abstract boolean method157(int arg0);

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)V")
    public abstract void method161(int arg0);
}
