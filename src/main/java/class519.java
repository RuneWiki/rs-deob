import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class519 extends class553 {

    @OriginalMember(owner = "client!ew", name = "w", descriptor = "I")
    public int field7330;

    @OriginalMember(owner = "client!ew", name = "s", descriptor = "I")
    public int field7326;

    @OriginalMember(owner = "client!ew", name = "r", descriptor = "I")
    public static int field7325 = 0;

    @OriginalMember(owner = "client!ew", name = "y", descriptor = "Lhj;")
    public static class596 field7332 = new class596(71, 0);

    @OriginalMember(owner = "client!ew", name = "q", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!ew", name = "t", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!ew", name = "u", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!ew", name = "v", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!ew", name = "x", descriptor = "Lbt;")
    public static class48 field7331;

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lps;Lft;IIIIIIIII)V", line = 9)
    public class519(class105 arg0, class4 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7330 = arg9;
        this.field7326 = arg10;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IB)I", line = 25)
    public static final int method3111(int arg0, byte arg1) {
        int var2 = ((arg0 & 0xAAAAAAAA) >>> 1) + (arg0 & 0x55555555);
        field7324++;
        int var3 = ((var2 & 0xCCCCCCCF) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return arg1 <= 103 ? 112 : var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)Llf;", line = 45)
    public final class251 method94(int arg0) {
        field7329++;
        return arg0 == 1024 ? class435.field5743 : null;
    }

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)V", line = 56)
    public static final void method3112(int arg0) {
        class396.field5130.method1687((byte) 61);
        field7328++;
        if (arg0 > -112) {
            field7333 = 28;
        }
        class502.field7098.method1687((byte) 61);
        class132.field1639.method1687((byte) 61);
        class151.field1886.method1687((byte) 61);
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)V", line = 70)
    public static final void method3113(int arg0, int arg1) {
        if (arg1 != -7294) {
            method3112(108);
        }
        if (class506.field7199 == null || arg0 > class506.field7199.length) {
            class506.field7199 = new int[arg0];
        }
        field7327++;
    }

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "(I)V", line = 86)
    public static void method3114(int arg0) {
        if (arg0 != 1431655765) {
            method3114(7);
        }
        field7332 = null;
        field7331 = null;
    }
}
