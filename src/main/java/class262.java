import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class class262 extends class419 {

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    public int field3511;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public int field3510;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
    public int field3515;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
    public int field3514;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "Z")
    public static boolean field3512 = true;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "Ljc;")
    public static class305 field3508 = new class305("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "Lao;")
    public static class191 field3517 = new class191(21, -2);

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II[F)[F", line = 10)
    public static final float[] method1612(int arg0, int arg1, float[] arg2) {
        field3509++;
        if (arg1 >= -80) {
            field3508 = null;
        }
        float[] var3 = new float[arg0];
        class438.method2692(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIBILni;)V", line = 29)
    public static final void method1613(int arg0, int arg1, byte arg2, int arg3, class364 arg4) {
        field3516++;
        long var5 = (long) (arg0 << 28 | arg1 << 14 | arg3);
        int var7 = -15 % ((-arg2 - 33) / 48);
        class166 var8 = (class166) class243.field3208.method295(var5, -98);
        if (var8 == null) {
            class166 var9 = new class166();
            class243.field3208.method291(var5, var9, -118);
            var9.field2147.method975(0, arg4);
            return;
        }
        class199 var10 = class237.field3158.method236(-18315, arg4.field4971);
        int var11 = var10.field2642;
        if (var10.field2606 == 1) {
            var11 = (arg4.field4974 + 1) * var11;
        }
        for (class364 var12 = (class364) var8.field2147.method970(12); var12 != null; var12 = (class364) var8.field2147.method976((byte) -128)) {
            class199 var13 = class237.field3158.method236(-18315, var12.field4971);
            int var14 = var13.field2642;
            if (var13.field2606 == 1) {
                var14 = (var12.field4974 + 1) * var14;
            }
            if (var14 < var11) {
                class389.method2358(var12, -1, arg4);
                return;
            }
        }
        var8.field2147.method975(0, arg4);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIB)B", line = 80)
    public static final byte method1614(int arg0, int arg1, byte arg2) {
        if (arg2 != 71) {
            field3517 = null;
        }
        field3513++;
        if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(IIII)V", line = 98)
    public class262(int arg0, int arg1, int arg2, int arg3) {
        this.field3511 = arg3;
        this.field3510 = arg1;
        this.field3515 = arg0;
        this.field3514 = arg2;
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V", line = 109)
    public static void method1615(int arg0) {
        if (arg0 == -546) {
            field3517 = null;
            field3508 = null;
        }
    }
}
