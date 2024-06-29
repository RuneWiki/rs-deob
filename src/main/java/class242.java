import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class242 {

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Z")
    public boolean field3796 = false;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field3799 = 0;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "[I")
    public static int[] field3802 = new int[500];

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Llm;")
    public static class150 field3795 = new class150(200);

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "[I")
    public static int[] field3806 = new int[128];

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field3808 = 0;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public int field3794;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public int field3801;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Lnh;")
    public static class305 field3807;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method1588(byte arg0) {
        field3795 = null;
        int var1 = 122 % ((arg0 - 26) / 52);
        field3802 = null;
        field3807 = null;
        field3806 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILbj;I)V")
    public final void method1589(int arg0, class215 arg1, int arg2) {
        field3804++;
        while (true) {
            int var4 = arg1.method1374((byte) -60);
            if (var4 == 0) {
                if (arg2 < 67) {
                    field3805 = 79;
                    return;
                } else {
                    return;
                }
            }
            this.method1590(var4, arg0, arg1, 12641);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILbj;I)V")
    private final void method1590(int arg0, int arg1, class215 arg2, int arg3) {
        if (arg0 == 1) {
            this.field3794 = arg2.method1379(-102);
        } else if (arg0 == 2) {
            this.field3801 = arg2.method1403(arg3 - 6050);
        } else if (arg0 == 3) {
            this.field3796 = true;
        } else if (arg0 == 4) {
            this.field3794 = -1;
        }
        if (arg3 != 12641) {
            this.field3796 = true;
        }
        field3797++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static final void method1591(int arg0) {
        if (arg0 < 105) {
            field3802 = null;
        }
        class81.field1114.method948((byte) 58);
        field3800++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZ)Lee;")
    public final class74 method1592(int arg0, int arg1, boolean arg2) {
        field3803++;
        class74 var4 = (class74) class145.field1998.method950((long) (arg0 << 16 | this.field3794 | (arg2 ? 262144 : 0)), (byte) -45);
        if (var4 != null) {
            return var4;
        }
        class81.field1121.method2056(true, this.field3794);
        class74 var5 = class245.method1607(class81.field1121, this.field3794, arg1, true);
        if (var5 != null) {
            var5.method486(class226.field3537, class107.field1526, class92.field1353);
            var5.field4559 = var5.field4566;
            var5.field4551 = var5.field4557;
            if (arg2) {
                var5.method485();
            }
            for (int var6 = 0; var6 < arg0; var6++) {
                var5.method483();
            }
            class145.field1998.method942((long) ((arg2 ? 262144 : 0) | this.field3794 | arg0 << 16), (byte) 64, var5);
        }
        return var5;
    }
}
