import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class class219 {

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "Lha;")
    public static class267 field3231 = null;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Z")
    public static boolean field3229 = false;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    public static void method1406(boolean arg0) {
        field3231 = null;
        if (!arg0) {
            field3228 = -28;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)Ltk;")
    public class219 method862(int arg0, int arg1, int arg2) {
        field3230++;
        return this;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "()Z")
    public boolean method864() {
        field3227++;
        return false;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ltk;IIIZ)V")
    public void method884(class219 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3234++;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "()I")
    public abstract int method36();

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIIIIIJILqa;)V")
    public abstract void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class112 arg10);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIII)V")
    public abstract void method23(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILth;)I")
    public static final int method1407(int arg0, class72 arg1) {
        field3232++;
        if (arg0 != -1159) {
            method1407(79, (class72) null);
        }
        class271 var2 = arg1.field1119;
        if (var2.field4291 != null) {
            var2 = var2.method1812(arg0 + 1159);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4276;
        class35 var4 = arg1.method73((byte) -44);
        if (arg1.field112 == var4.field531) {
            var3 = var2.field4238;
        } else if (arg1.field112 == var4.field526 || arg1.field112 == var4.field524 || arg1.field112 == var4.field529 || arg1.field112 == var4.field505) {
            var3 = var2.field4270;
        } else if (arg1.field112 == var4.field509 || arg1.field112 == var4.field515 || arg1.field112 == var4.field506 || arg1.field112 == var4.field523) {
            var3 = var2.field4280;
        }
        return var3;
    }
}
