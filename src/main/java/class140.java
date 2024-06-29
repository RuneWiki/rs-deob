import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class140 extends class187 {

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "[I")
    private int[] field2111 = new int[this.field2743];

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "Ldp;")
    public static class347 field2112 = new class347("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "Lsl;")
    public static class456 field2114 = new class456("", 17);

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    private int field2105;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
    private int field2113;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "[B")
    private byte[] field2107;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([S[Ljava/lang/String;B)V")
    public static final void method1019(short[] arg0, String[] arg1, byte arg2) {
        class75.method553(arg0, arg1.length + -1, arg1, 124, 0);
        ++field2106;
        int var3 = -10 / ((3 - arg2) / 58);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BII)V")
    public final void method1020(byte arg0, int arg1, int arg2) {
        ++field2108;
        this.field2105 += this.field2111[arg1] * arg2 >> 12;
        if (arg0 != 30) {
            this.field2113 = 21;
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIIF)V")
    public class140(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field2743 > var7; ++var7) {
            this.field2111[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBB)V")
    public void method1021(int arg0, byte arg1, byte arg2) {
        if (arg2 > -30) {
            this.field2105 = 102;
        }
        ++field2109;
        this.field2107[this.field2113++] = (byte) (127 + method1023(arg1 >> 1, 127));
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
    public final void method1022(int arg0) {
        this.field2105 = 0;
        ++field2104;
        this.field2113 = 0;
        int var2 = 59 % ((arg0 - 71) / 47);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)I")
    public static int method1023(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
    public final void method1024(int arg0) {
        if (arg0 != -5861) {
            this.field2113 = -121;
        }
        ++field2110;
        this.field2105 = Math.abs(this.field2105);
        if (~this.field2105 <= -4097) {
            this.field2105 = 4095;
        }
        this.method1021(this.field2113++, (byte) (this.field2105 >> 4), (byte) -35);
        this.field2105 = 0;
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
    public static void method1025(int arg0) {
        if (arg0 != -1319521660) {
            method1025(-117);
        }
        field2114 = null;
        field2112 = null;
    }
}
