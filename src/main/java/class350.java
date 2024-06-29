import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class350 extends class558 {

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "[I")
    private int[] field4815 = new int[this.field7800];

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "Z")
    public static boolean field4814 = false;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "Lvt;")
    public static class344 field4810 = new class344("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
    public static int field4819 = 0;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    private int field4811;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    private int field4817;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "[B")
    private byte[] field4818;

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(IIIIIF)V")
    public class350(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field7800; ++var7) {
            this.field4815[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public final void method2177(boolean arg0) {
        ++field4820;
        this.field4817 = Math.abs(this.field4817);
        if (arg0) {
            field4814 = false;
        }
        if (this.field4817 >= 4096) {
            this.field4817 = 4095;
        }
        this.method233((byte) (this.field4817 >> 4), this.field4811++, (byte) 61);
        this.field4817 = 0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZII)I")
    public static final int method2178(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = 125 / ((arg3 - -85) / 33);
        ++field4809;
        class164 var5 = class130.method695(arg1, arg0, Integer.MIN_VALUE);
        if (var5 == null) {
            return -1;
        } else {
            return ~arg2 <= -1 && var5.field2084.length > arg2 ? var5.field2084[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
    public final void method2179(int arg0, int arg1, int arg2) {
        ++field4812;
        this.field4817 += this.field4815[arg2] * arg0 >> 12;
        if (arg1 < 77) {
            field4819 = 93;
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
    public static void method2180(int arg0) {
        if (arg0 <= 111) {
            field4814 = true;
        }
        field4810 = null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public final void method2181(int arg0) {
        ++field4813;
        this.field4817 = 0;
        this.field4811 = 0;
        if (arg0 <= 77) {
            field4819 = 15;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BIB)V")
    public void method233(byte arg0, int arg1, byte arg2) {
        ++field4816;
        this.field4818[this.field4811++] = (byte) (127 + class143.method783(127, arg0 >> 1));
        if (arg2 != 61) {
            field4810 = null;
        }
    }
}
