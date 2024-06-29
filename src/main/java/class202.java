import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public abstract class class202 {

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3051 = "Walk here";

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Z")
    public static boolean field3054 = true;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Llm;")
    public static class150 field3053 = new class150(20);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "()Z")
    public boolean method1013() {
        field3055++;
        return false;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "()I")
    public abstract int method9();

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public static final void method1259(int arg0) {
        class70.field1022.method1456(0);
        field3050++;
        class110.field1563.method1065(0);
        if (arg0 == 22654) {
            class42.field626.method1065(arg0 - 22654);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIIJILte;)V")
    public abstract void method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class220 arg10);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public static void method1260(byte arg0) {
        field3053 = null;
        if (arg0 == 125) {
            field3051 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIII)V")
    public abstract void method7(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)Lsk;")
    public class202 method1019(int arg0, int arg1, int arg2) {
        field3049++;
        return this;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lsk;IIIZ)V")
    public void method1029(class202 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3056++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Lqj;")
    public static final class248 method1261(int arg0, int arg1) {
        field3057++;
        if (class231.field3612 && arg1 >= class268.field4298 && arg1 <= class185.field2802) {
            if (arg0 != 20006) {
                method1261(102, 41);
            }
            return class250.field3912[arg1 - class268.field4298];
        } else {
            return null;
        }
    }
}
