import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class class55 extends class220 {

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "Lmh;")
    public static class128 field1059 = class22.method156(127, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "Lmh;")
    public static class128 field1056 = class22.method156(125, "::");

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V", line = 5)
    public final void method370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field1065 << 3;
        field1064++;
        int var7 = (arg1 << 4) + (var6 & 0xF);
        int var8 = this.field1062 << 3;
        int var9 = (arg4 << 4) + (var8 & 0xF);
        if (arg3 > 124) {
            this.method270(var6, var8, var7, var9, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIZI)I", line = 50)
    public static final int method371(int arg0, int arg1, boolean arg2, int arg3) {
        field1055++;
        if (!arg2) {
            method371(-72, 113, false, 127);
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)V", line = 84)
    public static void method372(boolean arg0) {
        field1059 = null;
        field1056 = null;
        if (!arg0) {
            field1061 = -28;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
    public abstract void method273(int arg0, int arg1);

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(IIIII)V")
    public abstract void method282(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIII)V")
    public abstract void method270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
    public abstract void method271(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)V")
    public abstract void method283(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)V")
    public abstract void method278(int arg0, int arg1);
}
