import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public abstract class class166 {

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Lia;")
    private static class257 field2895 = class28.method234(-36, "Members only world");

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Lia;")
    public static class257 field2891 = field2895;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field2899 = 0;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field2900 = 0;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIZ)V")
    public void method468(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2898++;
        if (arg4) {
            method1132(12);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static void method1132(int arg0) {
        field2891 = null;
        int var1 = -93 / ((-arg0 - 11) / 55);
        field2895 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lij;IIIZ)V")
    public void method518(class166 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2896++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "()I")
    public abstract int method2();

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "()Z")
    public boolean method493() {
        field2892++;
        return false;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)Lij;")
    public class166 method511(int arg0, int arg1, int arg2) {
        field2901++;
        return this;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)I")
    public static final int method1133(byte arg0, int arg1) {
        field2894++;
        int var2 = (arg1 >>> 1 & 0xD5555555) + (arg1 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCD) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg0 >= -121) {
            method1133((byte) -14, 118);
        }
        return var6 & 0xFF;
    }
}
