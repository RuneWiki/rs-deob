import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class43 extends class451 {

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "[I")
    public static int[] field526 = new int[1000];

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field536 = 1;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "Llg;")
    public static class237 field534 = new class237(100);

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "Liq;")
    public static class362 field538 = new class362("Loaded fonts", "Schriftsätze geladen.", "Polices chargées", "Fontes carregadas");

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field539 = 0;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBI)V", line = 4)
    public final void method259(int arg0, byte arg1, int arg2) {
        if (arg1 != 12) {
            field539 = -105;
        }
        ++field529;
        int var4 = this.field531 * arg0 >> 12;
        int var5 = this.field528 * arg0 >> 12;
        int var6 = this.field527 * arg2 >> 12;
        int var7 = this.field530 * arg2 >> 12;
        class323.method2106(var5, super.field6457, var7, false, var6, var4);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(III)V", line = 24)
    public final void method260(int arg0, int arg1, int arg2) {
        int var4 = -116 % ((-78 - arg0) / 40);
        ++field533;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V", line = 40)
    public final void method261(int arg0, int arg1, int arg2) {
        ++field532;
        if (arg1 >= -56) {
            method262(-51);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V", line = 50)
    public static void method262(int arg0) {
        field534 = null;
        field538 = null;
        if (arg0 == -1749180404) {
            field526 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 62)
    public static final void method263(byte arg0) {
        if (arg0 != -42) {
            method263((byte) -100);
        }
        class62.field718.method2143(217, -2);
        ++field535;
        ++class418.field5978;
        class62.field718.method1583(class26.method180(-109), (byte) -121);
        class62.field718.method1605(class330.field4671, false);
        class62.field718.method1605(class105.field1259, false);
        class62.field718.method1583(class408.field5877, (byte) -124);
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(IIIIII)V", line = 83)
    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field527 = arg1;
        this.field530 = arg3;
        this.field531 = arg0;
        this.field528 = arg2;
    }
}
