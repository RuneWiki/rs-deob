import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public abstract class class213 extends class209 {

    @OriginalMember(owner = "client!el", name = "H", descriptor = "Lnf;")
    public static class162 field3271 = new class162(4);

    @OriginalMember(owner = "client!el", name = "B", descriptor = "I")
    public int field3265;

    @OriginalMember(owner = "client!el", name = "C", descriptor = "I")
    public int field3266;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "I")
    public int field3267;

    @OriginalMember(owner = "client!el", name = "E", descriptor = "I")
    public int field3268;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "I")
    public int field3273;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII)V")
    public abstract void method431(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIII)V")
    public final void method1473(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field3272 << 3;
        field3269++;
        int var7 = this.field3267 << 3;
        int var8 = (arg1 << 4) + (arg2 & var7);
        int var9 = (arg4 << 4) + (var6 & 0xF);
        this.method420(var6, var7, var9, var8, arg0, arg3);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZI)Lkk;")
    public static final class248 method1474(boolean arg0, int arg1) {
        field3270++;
        class248 var2 = (class248) class218.field3329.method1173((long) arg1, arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class91.field1419.method721((byte) -117, 1, arg1);
        class248 var4 = new class248();
        if (!arg0) {
            field3271 = null;
        }
        var4.field3946 = arg1;
        if (var3 != null) {
            var4.method1680(-38, new class31(var3));
        }
        var4.method1676(-41);
        if (var4.field3956 == 2 && class199.field3094.method2043((long) arg1, -1) == null) {
            class199.field3094.method2046(new class283(class35.field614), -75, (long) arg1);
            class288.field4502[class35.field614++] = var4;
        }
        class218.field3329.method1167((byte) -53, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V")
    public abstract void method441(int arg0, int arg1);

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V")
    public abstract void method430(int arg0, int arg1);

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(III)V")
    public abstract void method426(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(B)V")
    public static void method1475(byte arg0) {
        int var1 = -114 % ((57 - arg0) / 37);
        field3271 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIII)V")
    public abstract void method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(IIIII)V")
    public abstract void method419(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1476(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class235.field3716 = arg1;
        class291.field4515 = arg2;
        class232.field3669 = arg3;
        class108.field1679 = new class22[arg0][class235.field3716][class291.field4515];
        class303.field4876 = new int[arg0][class235.field3716 + 1][class291.field4515 + 1];
        if (arg4) {
            class133.field1999 = new class22[1][class235.field3716][class291.field4515];
            class240.field3831 = new int[class235.field3716][class291.field4515];
            class166.field2507 = new int[1][class235.field3716 + 1][class291.field4515 + 1];
        } else {
            class133.field1999 = null;
            class240.field3831 = null;
            class166.field2507 = null;
        }
        class291.method1935(false);
        class142.field2112 = new class207[500];
        class174.field2690 = 0;
        class254.field4065 = new class207[500];
        class305.field4907 = 0;
        class257.field4098 = new int[arg0][class235.field3716 + 1][class291.field4515 + 1];
        class246.field3916 = new class19[5000];
        class296.field4676 = 0;
        class269.field4264 = new class19[100];
        class35.field617 = new boolean[class232.field3669 + class232.field3669 + 1][class232.field3669 + class232.field3669 + 1];
        class247.field3926 = new boolean[class232.field3669 + class232.field3669 + 2][class232.field3669 + class232.field3669 + 2];
        class107.field1671 = new byte[arg0][class235.field3716][class291.field4515];
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(II)V")
    public abstract void method425(int arg0, int arg1);
}
