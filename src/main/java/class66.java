import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class66 extends class154 {

    @OriginalMember(owner = "client!fu", name = "w", descriptor = "B")
    public byte field896 = 5;

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "[F")
    public static float[] field890 = new float[16384];

    @OriginalMember(owner = "client!fu", name = "A", descriptor = "[F")
    public static float[] field900 = new float[16384];

    @OriginalMember(owner = "client!fu", name = "G", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!fu", name = "H", descriptor = "F")
    public static float field907;

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!fu", name = "t", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!fu", name = "u", descriptor = "I")
    public int field894;

    @OriginalMember(owner = "client!fu", name = "v", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "client!fu", name = "x", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!fu", name = "y", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!fu", name = "z", descriptor = "I")
    public int field899;

    @OriginalMember(owner = "client!fu", name = "B", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!fu", name = "C", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!fu", name = "D", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "client!fu", name = "E", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!fu", name = "F", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!fu", name = "s", descriptor = "Z")
    public boolean field892;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)V")
    public static final void method540(int arg0) {
        field904++;
        if (class266.field3564 == null) {
            return;
        }
        class412.field5313 = new class100();
        class412.field5313.method764(class183.field2345, -114, class266.field3564.field6072.method3280((byte) -70, class144.field1890), class266.field3564.field6076, class266.field3564);
        class476.field6190 = new Thread(class412.field5313, "");
        if (arg0 != 16384) {
            method540(-119);
        }
        class476.field6190.start();
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IBILtc;)V")
    public static final void method541(int arg0, byte arg1, int arg2, class477 arg3) {
        class37.field538 = arg3;
        class518.field6789 = arg0;
        field893++;
        if (arg1 == -5) {
            class686.field9409 = arg2;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIZBLtc;)V")
    public static final void method542(int arg0, int arg1, boolean arg2, byte arg3, class477 arg4) {
        field898++;
        int var5 = arg4.field6372;
        int var6 = arg4.field6224;
        if (arg4.field6376 == 0) {
            arg4.field6372 = arg4.field6297;
        } else if (arg4.field6376 == 1) {
            arg4.field6372 = arg1 - arg4.field6297;
        } else if (arg4.field6376 == 2) {
            arg4.field6372 = arg4.field6297 * arg1 >> 14;
        }
        if (arg4.field6274 == 0) {
            arg4.field6224 = arg4.field6227;
        } else if (arg4.field6274 == 1) {
            arg4.field6224 = arg0 - arg4.field6227;
        } else if (arg4.field6274 == 2) {
            arg4.field6224 = arg4.field6227 * arg0 >> 14;
        }
        if (arg4.field6376 == 4) {
            arg4.field6372 = arg4.field6224 * arg4.field6219 / arg4.field6229;
        }
        if (arg3 <= 99) {
            return;
        }
        if (arg4.field6274 == 4) {
            arg4.field6224 = arg4.field6372 * arg4.field6229 / arg4.field6219;
        }
        if (class100.field1336 && (client.method696(arg4).field2020 != 0 || arg4.field6312 == 0)) {
            if (arg4.field6224 < 5 && arg4.field6372 < 5) {
                arg4.field6224 = 5;
                arg4.field6372 = 5;
            } else {
                if (arg4.field6224 <= 0) {
                    arg4.field6224 = 5;
                }
                if (arg4.field6372 <= 0) {
                    arg4.field6372 = 5;
                }
            }
        }
        if (class534.field6947 == arg4.field6324) {
            class256.field3466 = arg4;
        }
        if (arg2 && arg4.field6331 != null && arg4.field6372 != var5 || arg4.field6224 != var6) {
            class155 var7 = new class155();
            var7.field1968 = arg4;
            var7.field1962 = arg4.field6331;
            class587.field7952.method2087(var7, -109);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILfd;)Lrr;")
    public static final class371 method543(int arg0, class418 arg1) {
        field897++;
        if (arg0 > -88) {
            return null;
        } else {
            class371 var2 = new class371();
            var2.field4784 = arg1.method2393(-30727);
            var2.field4781 = class196.field2553.method24(var2.field4784, 32767);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)V")
    public static void method544(int arg0) {
        field890 = null;
        if (arg0 != -6) {
            method541(103, (byte) -115, -36, null);
        }
        field900 = null;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field890[var2] = (float) Math.sin((double) var2 * var0);
            field900[var2] = (float) Math.cos((double) var2 * var0);
        }
        field906 = 0;
        field907 = 0.0F;
    }
}
