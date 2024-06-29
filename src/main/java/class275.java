import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public abstract class class275 {

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "Ljk;")
    public static class585 field3762 = new class585(22, 8);

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "Ljn;")
    public static class668 field3764;

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "[La;")
    public static class572[] field3765;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
    public static void method1667(int arg0) {
        field3762 = null;
        if (arg0 != 0) {
            method1669(-43, null);
        }
        field3764 = null;
        field3765 = null;
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
    public static final void method1668(int arg0) {
        field3761++;
        int var1 = class394.field5564;
        int[] var2 = class82.field1176;
        if (arg0 != 8) {
            field3765 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class613 var4 = class184.field2252[var2[var3]];
            if (var4 != null) {
                class529.method3112(var4, var4.method1284((byte) -124), (byte) 108);
            }
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILun;)Lko;")
    public static final class468 method1669(int arg0, class389 arg1) {
        field3763++;
        if (arg0 != 8) {
            method1667(-112);
        }
        class646 var2 = class183.method1141(arg1, -23687);
        int var3 = arg1.method2219((byte) 93);
        return new class468(var2.field9193, var2.field9196, var2.field9188, var2.field9192, var2.field9198, var3);
    }
}
