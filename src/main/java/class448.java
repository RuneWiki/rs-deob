import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class448 extends class152 {

    @OriginalMember(owner = "client!ika", name = "y", descriptor = "Lpa;")
    public class390 field6022;

    @OriginalMember(owner = "client!ika", name = "v", descriptor = "Lfj;")
    public static class684 field6019 = new class684(0, 3);

    @OriginalMember(owner = "client!ika", name = "A", descriptor = "Lhj;")
    public static class596 field6024 = new class596(129, -2);

    @OriginalMember(owner = "client!ika", name = "E", descriptor = "[I")
    public static int[] field6027 = new int[13];

    @OriginalMember(owner = "client!ika", name = "w", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!ika", name = "x", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!ika", name = "z", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!ika", name = "B", descriptor = "Z")
    public static boolean field6025;

    @OriginalMember(owner = "client!ika", name = "D", descriptor = "[[Lfg;")
    public static class140[][] field6026;

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(I)V")
    public static void method2638(int arg0) {
        field6019 = null;
        field6026 = null;
        field6024 = null;
        if (arg0 < -10) {
            field6027 = null;
        }
    }

    @OriginalMember(owner = "client!ika", name = "b", descriptor = "(B)V")
    public static final void method2639(byte arg0) {
        for (class75 var1 = (class75) class5.field52.method2725(37); var1 != null; var1 = (class75) class5.field52.method2726(-125)) {
            if (class336.method1990(var1.field1029, -101)) {
                class93.method823((byte) 104, var1);
            }
        }
        field6021++;
        if (arg0 >= -3) {
            method2641(-82);
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "([BILjava/lang/String;I)I")
    public static final int method2640(byte[] arg0, int arg1, String arg2, int arg3) {
        field6023++;
        int var4 = arg1;
        int var5 = arg2.length();
        int var6 = 85 / ((-arg3 - 32) / 53);
        for (int var7 = 0; var7 < var5; var7 += 4) {
            int var8 = class496.method2932(arg2.charAt(var7), 106);
            int var9 = var5 > (var7 + 1) ? class496.method2932(arg2.charAt(var7 + 1), -112) : -1;
            int var10 = var7 + 2 >= var5 ? -1 : class496.method2932(arg2.charAt(var7 + 2), -90);
            int var11 = var5 > var7 + 3 ? class496.method2932(arg2.charAt(var7 + 3), -62) : -1;
            arg0[arg1++] = (byte) class5.method105(var9 >>> 4, var8 << 2);
            if (var10 == -1) {
                break;
            }
            arg0[arg1++] = (byte) class5.method105(var10 >>> 2, class296.method1733(var9 << 4, 240));
            if (var11 == -1) {
                break;
            }
            arg0[arg1++] = (byte) class5.method105(var11, class296.method1733(var10 << 6, 192));
        }
        return arg1 - var4;
    }

    @OriginalMember(owner = "client!ika", name = "d", descriptor = "(I)V")
    public static final void method2641(int arg0) {
        field6020++;
        if (class580.field7912 < 0) {
            class461.field6482 = -1;
            class683.field9348 = -1;
            class580.field7912 = 0;
        }
        if (class9.field166 < class580.field7912) {
            class683.field9348 = -1;
            class461.field6482 = -1;
            class580.field7912 = class9.field166;
        }
        if (class62.field850 < 0) {
            class62.field850 = 0;
            class461.field6482 = -1;
            class683.field9348 = -1;
        }
        if (arg0 != -1) {
            method2641(92);
        }
        if (class62.field850 > class9.field179) {
            class62.field850 = class9.field179;
            class461.field6482 = -1;
            class683.field9348 = -1;
        }
    }

    @OriginalMember(owner = "client!ika", name = "<init>", descriptor = "(Lpa;)V")
    public class448(class390 arg0) {
        this.field6022 = arg0;
    }
}
