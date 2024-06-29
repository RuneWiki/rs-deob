import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class569 {

    @OriginalMember(owner = "client!bca", name = "g", descriptor = "Z")
    public boolean field7851;

    @OriginalMember(owner = "client!bca", name = "h", descriptor = "B")
    public byte field7852;

    @OriginalMember(owner = "client!bca", name = "i", descriptor = "I")
    public int field7853;

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "B")
    public byte field7848;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "S")
    public short field7845;

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "S")
    public short field7850;

    @OriginalMember(owner = "client!bca", name = "k", descriptor = "S")
    public short field7855;

    @OriginalMember(owner = "client!bca", name = "l", descriptor = "Lcba;")
    public static class471 field7856 = new class471(94, 6);

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!bca", name = "j", descriptor = "I")
    public static int field7854;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)V")
    public static final void method3233(int arg0, int arg1) {
        class320.field4337 = arg0;
        class40.field797 = 2;
        int var2 = 83 % ((arg1 + 19) / 42);
        field7849++;
        long var3 = 0L;
        if (class68.field1153 == null) {
            class464.method2712(35, (byte) -66);
        } else {
            class11 var5 = new class11(class203.method1227((byte) -59, class331.method2029(class68.field1153, -31881)));
            long var6 = var5.method85(-101);
            class103.field1569 = var5.method85(-106);
            class403.method2406(true, (byte) 111, "", class612.method3585(43, var6));
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)I")
    public static final int method3234(int arg0, int arg1, int arg2) {
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        field7854++;
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg1 == 16126 ? arg0 : 9;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method3235(String arg0, byte arg1) {
        if (arg1 != -86) {
            method3235(null, (byte) 103);
        }
        field7846++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class228.method1452(arg0.charAt(var4), (byte) -126) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
    public class569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field7851 = arg9;
        this.field7852 = (byte) arg8;
        this.field7853 = arg0;
        this.field7848 = (byte) arg7;
        this.field7845 = (short) arg5;
        this.field7850 = (short) arg4;
        this.field7855 = (short) arg6;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIII)Lbca;")
    public final class569 method3236(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            field7847++;
            return new class569(arg2, arg3, arg1, arg0, this.field7850, this.field7845, this.field7855, this.field7848, this.field7852, this.field7851);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
    public static void method3237(int arg0) {
        field7856 = null;
        if (arg0 != 18826) {
            field7856 = null;
        }
    }
}
