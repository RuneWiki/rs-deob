import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 {

    @OriginalMember(owner = "client!us", name = "a", descriptor = "I")
    public int field1;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    private int field4;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "[[I")
    public static int[][] field9 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public static int field3 = 0;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "Lwf;")
    public static class79 field6 = new class79(25, 7);

    @OriginalMember(owner = "client!us", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!us", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "Loh;")
    public static class256 field7;

    @OriginalMember(owner = "client!us", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field11++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
    public static final void method1(int arg0) {
        field10++;
        if (arg0 != 12580) {
            field7 = null;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class238.field3570[var1] = false;
        }
        class93.field1181 = class214.field3219;
        class207.field3163 = class490.field6904;
        class45.field649 = class353.field5090;
        class363.field5225 = class134.field1778;
        class81.field986 = class343.field4996;
        class311.field4399 = 0;
        class262.field3839 = 0;
        class161.field2380 = -1;
        class203.field3017 = -1;
        class2.field18 = class30.field407;
        class136.field1807 = 5;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(II)V")
    public class1(int arg0, int arg1) {
        this.field1 = arg1;
        this.field4 = arg0;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIBZIIF)[[I")
    public static final int[][] method2(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6, int arg7, float arg8) {
        if (arg4 != -102) {
            return null;
        }
        field2++;
        int[][] var9 = new int[arg6][arg3];
        class437 var10 = new class437();
        var10.field6069 = (int) (arg8 * 4096.0F);
        var10.field6063 = arg1;
        var10.field6084 = arg2;
        var10.field6066 = arg0;
        var10.field6065 = arg5;
        var10.method23(7);
        class488.method2860(arg3, arg4 ^ 0x65, arg6);
        for (int var11 = 0; var11 < arg6; var11++) {
            var10.method2575(0, var11, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lbj;B)V")
    public static final void method3(class146 arg0, byte arg1) {
        if (arg0 instanceof class216) {
            class216 var2 = (class216) arg0;
            if (var2.field3232 != null) {
                class124.method749(class492.field6935.field4319 != var2.field4319, var2, 256);
            }
        } else if (arg0 instanceof class452) {
            class452 var3 = (class452) arg0;
            class458.method2678(-1, class492.field6935.field4319 != var3.field4319, var3);
        }
        if (arg1 != 10) {
            method4((byte) -125);
        }
        field8++;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V")
    public static void method4(byte arg0) {
        field6 = null;
        int var1 = -34 / ((-arg0 - 81) / 39);
        field7 = null;
        field9 = null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(III)V")
    public static final void method5(int arg0, int arg1, int arg2) {
        class88 var3 = class330.field4786[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field1087 != null) {
            var3.field1087 = null;
        }
        if (var3.field1066 != null) {
            var3.field1066 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V")
    public static final void method6(int arg0) {
        if (arg0 != 17018) {
            method4((byte) 93);
        }
        field5++;
        class135.field1783.method680(((float) class314.field4438.field5802 * 0.1F + 0.7F) * class453.field6392);
        class135.field1783.method695(class93.field1182, class442.field6127, class112.field1420, (float) class200.field2921, (float) class179.field2586, (float) class64.field835);
        class135.field1783.method685(class207.field3170);
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(I)I")
    public final int method7(int arg0) {
        if (arg0 == 32069) {
            field12++;
            return this.field4;
        } else {
            return -116;
        }
    }
}
