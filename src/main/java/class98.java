import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class98 {

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "I")
    private int field1177;

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "[Lpm;")
    public static class584[] field1180 = new class584[8];

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "Lgda;")
    public static class53 field1176 = new class53(17, -1);

    @OriginalMember(owner = "client!qfa", name = "m", descriptor = "[F")
    public static float[] field1185 = new float[2];

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!qfa", name = "j", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!qfa", name = "k", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!qfa", name = "l", descriptor = "Leh;")
    public static class360 field1184;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZILfp;I)Lvg;", line = 8)
    public static final class52 method715(boolean arg0, int arg1, class323 arg2, int arg3) {
        field1178++;
        class675 var4 = new class675(arg2.method2100(arg1, (byte) 112, arg3));
        if (arg0) {
            field1184 = null;
        }
        class52 var5 = new class52(arg1, var4.method3697(-1), var4.method3697(-1), var4.method3703(101), var4.method3703(117), var4.method3750((byte) 35) == 1, var4.method3750((byte) 35), var4.method3750((byte) 35));
        int var6 = var4.method3750((byte) 35);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field591.method2770((byte) -13, new class473(var4.method3750((byte) 35), var4.method3757((byte) -65), var4.method3757((byte) -65), var4.method3757((byte) -65), var4.method3757((byte) -65), var4.method3757((byte) -65), var4.method3757((byte) -65), var4.method3757((byte) -65), var4.method3757((byte) -65)));
        }
        var5.method317(0);
        return var5;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ID)V", line = 35)
    public static final void method716(int arg0, double arg1) {
        field1179++;
        if (class688.field9397 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class145.field2089[var3] = var4 > 255 ? 255 : var4;
            }
            class688.field9397 = arg1;
        }
        if (arg0 > -69) {
            method716(-127, 0.15831594617291558D);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V", line = 61)
    public static void method717(int arg0) {
        field1176 = null;
        if (arg0 >= -94) {
            method717(1);
        }
        field1180 = null;
        field1184 = null;
        field1185 = null;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(III)V", line = 80)
    public static final void method718(int arg0, int arg1, int arg2) {
        field1173++;
        class592 var3 = class682.method3825(-652872096, arg0, arg2);
        var3.method3351(0);
        var3.field8337 = arg1;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)I", line = 91)
    public final int method719(byte arg0) {
        if (arg0 < 121) {
            method718(115, 62, -25);
        }
        field1174++;
        return this.field1177;
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(II)V", line = 110)
    public class98(int arg0, int arg1) {
        this.field1177 = arg0;
        this.field1181 = arg1;
    }

    @OriginalMember(owner = "client!qfa", name = "toString", descriptor = "()Ljava/lang/String;", line = 120)
    public final String toString() {
        field1175++;
        throw new IllegalStateException();
    }
}
