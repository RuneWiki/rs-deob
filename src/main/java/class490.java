import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class class490 {

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field7241 = 0;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lfg;")
    public static class84 field7242 = new class84(12, 0, 1, 0);

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Lof;")
    public static class446 field7243 = new class446("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "[S")
    public static short[] field7244 = new short[256];

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static final void method2926(byte arg0) {
        class425.method2598();
        field7239++;
        if (arg0 >= -92) {
            field7243 = null;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class9.field174[var1].method1213((byte) -92);
        }
        class361.method2303((byte) -4);
        class475.method2833(0);
        System.gc();
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILuu;Luu;)I")
    public static final int method2927(int arg0, class191 arg1, class191 arg2) {
        field7240++;
        int var3 = 0;
        if (arg1.method1288(class73.field1013, 18555)) {
            var3++;
        }
        if (arg0 != 18628) {
            field7242 = null;
        }
        if (arg1.method1288(class84.field1221, arg0 ^ 0xBF)) {
            var3++;
        }
        if (arg1.method1288(class526.field7720, 18555)) {
            var3++;
        }
        if (arg2.method1288(class73.field1013, 18555)) {
            var3++;
        }
        if (arg2.method1288(class84.field1221, 18555)) {
            var3++;
        }
        if (arg2.method1288(class526.field7720, 18555)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(FIFIF[FIIFII)V")
    public abstract void method2353(float arg0, int arg1, float arg2, int arg3, float arg4, float[] arg5, int arg6, int arg7, float arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method2928(int arg0) {
        field7242 = null;
        if (arg0 == -5) {
            field7244 = null;
            field7243 = null;
        }
    }
}
