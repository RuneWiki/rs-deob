import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class51 extends class8 {

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    private int field897;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "Z")
    public static boolean field893 = true;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field891 = 0;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public static int field896 = 100;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "[I")
    public static int[] field898 = new int[1000];

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field894 = 0;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "Laf;")
    public static class68 field892 = new class68(50);

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "Lqh;")
    public static class201 field887;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII)I")
    public static final int method393(int arg0, int arg1, int arg2, int arg3) {
        ++field899;
        if (arg1 != 0) {
            return -44;
        } else if (arg0 < arg2) {
            return arg2;
        } else {
            return arg0 <= arg3 ? arg0 : arg3;
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)I")
    public static final int method394(byte arg0) {
        if (arg0 > -50) {
            return 84;
        } else {
            ++field889;
            return class121.field1970;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(I)V")
    private class51(int arg0) {
        super(0, true);
        this.field897 = 4096;
        this.field897 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)V")
    public static final void method395(int arg0, int arg1) {
        ++field888;
        class259 var2 = class213.method1464((byte) -93, arg1, 4);
        if (arg0 != -25266) {
            method393(-48, 40, -75, 80);
        }
        var2.method1772((byte) 29);
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class51() {
        this(4096);
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(Z)V")
    public static void method396(boolean arg0) {
        if (!arg0) {
            field887 = null;
            field892 = null;
            field898 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        int[] var3 = super.field110.method1585(arg0 ^ arg0, arg1);
        ++field895;
        if (super.field110.field3734) {
            class140.method970(var3, 0, class231.field3798, this.field897);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        ++field890;
        if (~arg2 == -1) {
            this.field897 = (arg1.method1517((byte) -96) << 12) / 255;
        }
        if (arg0 < 62) {
            method396(false);
        }
    }
}
