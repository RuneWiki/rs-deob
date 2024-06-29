import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class246 {

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public int field3592;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    private int field3590;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field3589 = 0;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Lle;")
    public static class205 field3594 = null;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Lir;")
    public static class22 field3587;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)I")
    public final int method1559(int arg0) {
        int var2 = -100 % ((arg0 + 81) / 33);
        field3588++;
        return this.field3590;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static void method1560(byte arg0) {
        field3587 = null;
        field3594 = null;
        if (arg0 != 76) {
            method1560((byte) 83);
        }
    }

    @OriginalMember(owner = "client!eh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3593++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(II)V")
    public class246(int arg0, int arg1) {
        this.field3592 = arg1;
        this.field3590 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIZ)I")
    public static final int method1561(int arg0, int arg1, int arg2, boolean arg3) {
        field3595++;
        int var4 = arg0 / arg2;
        int var5 = arg0 & arg2 - 1;
        int var6 = arg1 / arg2;
        if (arg3) {
            return 83;
        }
        int var7 = arg1 & arg2 - 1;
        int var8 = class443.method2600(var6, (byte) 126, var4);
        int var9 = class443.method2600(var6, (byte) 73, var4 + 1);
        int var10 = class443.method2600(var6 + 1, (byte) 113, var4);
        int var11 = class443.method2600(var6 + 1, (byte) 82, var4 + 1);
        int var12 = class261.method1670(arg2, var5, var9, var8, -52);
        int var13 = class261.method1670(arg2, var5, var11, var10, 104);
        return class261.method1670(arg2, var7, var13, var12, 119);
    }
}
