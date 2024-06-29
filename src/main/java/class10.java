import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public abstract class class10 extends class11 {

    @OriginalMember(owner = "client!hba", name = "w", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "client!hba", name = "u", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!hba", name = "x", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!hba", name = "y", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!hba", name = "v", descriptor = "Lr;")
    public static class170 field199;

    @OriginalMember(owner = "client!hba", name = "t", descriptor = "Loa;")
    public static class651 field197;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "(B)V")
    public static void method122(byte arg0) {
        field199 = null;
        field197 = null;
        if (arg0 < 74) {
            method122((byte) 75);
        }
    }

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "(B)Z")
    public abstract boolean method123(byte arg0);

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Ldw;IIII)V")
    public static final void method124(class673 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class148.method1066(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class657.field8966) {
            class148.method1066(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class148.method1066(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class227.field3196) {
            class148.method1066(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class227.field3196) {
            class148.method1066(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class657.field8966 && arg4 <= class227.field3196) {
            class148.method1066(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class148.method1066(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class657.field8966 && arg4 > 0) {
            class148.method1066(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Leh;BLjava/lang/String;)I")
    public static final int method125(class335 arg0, byte arg1, String arg2) {
        field198++;
        int var3 = arg0.field4619;
        if (arg1 >= -50) {
            method124(null, 11, -54, 15, -104);
        }
        byte[] var4 = class705.method3896(-19214, arg2);
        arg0.method2035(var4.length, 93);
        arg0.field4619 += class44.field637.method368(var4.length, arg0.field4600, 0, arg0.field4619, -83, var4);
        return arg0.field4619 - var3;
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(I)V")
    public class10(int arg0) {
        this.field200 = arg0;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method126(int arg0);
}
