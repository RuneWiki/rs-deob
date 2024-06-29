import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class152 {

    @OriginalMember(owner = "client!om", name = "a", descriptor = "Lie;")
    public static class2 field2398 = new class2();

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field2407 = 0;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public int field2404;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
    public static void method1123(int arg0) {
        field2398 = null;
        if (arg0 != -12731) {
            field2398 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
    public static final void method1124(byte arg0) {
        field2399++;
        class284.field4575.method454(103);
        class286.field4588 = null;
        if (arg0 >= 124) {
            class207.field3062 = 1;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)Z")
    public static final boolean method1125(int arg0, int arg1, int arg2) {
        int var3 = class131.field2171[arg0][arg1][arg2];
        if (-class47.field652 == var3) {
            return false;
        } else if (class47.field652 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class49.method302(var4 + 1, class103.field1792[arg0][arg1][arg2], var5 + 1) && class49.method302(var4 + 128 - 1, class103.field1792[arg0][arg1 + 1][arg2], var5 + 1) && class49.method302(var4 + 128 - 1, class103.field1792[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class49.method302(var4 + 1, class103.field1792[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class131.field2171[arg0][arg1][arg2] = class47.field652;
                return true;
            } else {
                class131.field2171[arg0][arg1][arg2] = -class47.field652;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)Lw;")
    public static final class120 method1126(int arg0, byte arg1) {
        field2402++;
        class120 var2 = (class120) class35.field449.method1418((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -1) {
            field2398 = null;
        }
        byte[] var3 = class284.field4566.method1868(class20.method138(4274, arg0), class296.method2015(true, arg0), arg1 ^ 0xFFFFFFFE);
        class120 var4 = new class120();
        var4.field1959 = arg0;
        if (var3 != null) {
            var4.method896(new class53(var3), ~arg1);
        }
        class35.field449.method1421((long) arg0, var4, (byte) -66);
        return var4;
    }
}
