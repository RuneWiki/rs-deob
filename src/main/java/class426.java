import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class426 extends class107 {

    @OriginalMember(owner = "client!dp", name = "w", descriptor = "I")
    public static int field6076 = 0;

    @OriginalMember(owner = "client!dp", name = "C", descriptor = "[I")
    public static int[] field6082 = new int[14];

    @OriginalMember(owner = "client!dp", name = "z", descriptor = "[I")
    public static int[] field6079 = new int[2];

    @OriginalMember(owner = "client!dp", name = "x", descriptor = "Lica;")
    public static class205 field6077 = new class205(16);

    @OriginalMember(owner = "client!dp", name = "v", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!dp", name = "y", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!dp", name = "B", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!dp", name = "D", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!dp", name = "A", descriptor = "[B")
    private byte[] field6080;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "(I)V")
    public static final void method2517(int arg0) {
        field6078++;
        for (int var1 = arg0; var1 < class567.field8409; var1++) {
            int var2 = class25.field230[var1];
            class234 var3 = (class234) class627.field9185.method1333((long) var2, false);
            if (var3 != null) {
                class383 var4 = var3.field3443;
                class200.method1296(var4.field5601.field6234, -63, var4);
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V")
    public class426() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIB)[B")
    public final byte[] method2518(int arg0, int arg1, int arg2, byte arg3) {
        this.field6080 = new byte[arg0 * arg1 * arg2 * 2];
        int var5 = 23 / ((arg3 + 34) / 35);
        field6083++;
        this.method2960(4095, arg2, arg1, arg0);
        return this.field6080;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BZI)V")
    public final void method630(byte arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method2518(91, -83, 77, (byte) 35);
        }
        field6081++;
        int var4 = arg2 * 2;
        byte var5 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field6080[var10001] = var5;
        this.field6080[var6] = var5;
    }

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "(I)V")
    public static void method2519(int arg0) {
        field6077 = null;
        field6079 = null;
        if (arg0 != -8870) {
            field6076 = -8;
        }
        field6082 = null;
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(B)V")
    public static final void method2520(byte arg0) {
        class621.field9066 = -1;
        class322.field4782 = 1;
        field6075++;
        long var1 = 0L;
        if (class36.field420 == null) {
            class313.method1932(35, false);
            return;
        }
        class428 var3 = new class428(class483.method2929(138, class288.method1790(false, class36.field420)));
        long var4 = var3.method2609((byte) -103);
        class565.field8372 = var3.method2609((byte) -103);
        int var6 = -36 % ((arg0 - 27) / 32);
        class18.method87(30245, true, class368.method2245(var4, 20296), "");
    }
}
