import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class657 extends class477 {

    @OriginalMember(owner = "client!qs", name = "P", descriptor = "[I")
    public static int[] field9276 = new int[2048];

    @OriginalMember(owner = "client!qs", name = "M", descriptor = "Lvh;")
    public static class125 field9273 = new class125(59, 3);

    @OriginalMember(owner = "client!qs", name = "R", descriptor = "Lvh;")
    public static class125 field9278 = new class125(44, 3);

    @OriginalMember(owner = "client!qs", name = "J", descriptor = "I")
    public static int field9270;

    @OriginalMember(owner = "client!qs", name = "L", descriptor = "I")
    public static int field9272;

    @OriginalMember(owner = "client!qs", name = "N", descriptor = "I")
    public static int field9274;

    @OriginalMember(owner = "client!qs", name = "Q", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!qs", name = "K", descriptor = "[B")
    private byte[] field9271;

    @OriginalMember(owner = "client!qs", name = "O", descriptor = "[[I")
    public static int[][] field9275;

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
    public class657() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BI)Lvp;")
    public static final class613 method3705(byte arg0, int arg1) {
        field9274++;
        if (arg0 == -63) {
            return class308.field4277 && class695.field9867 <= arg1 && class302.field4240 >= arg1 ? class259.field3713[arg1 - class695.field9867] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)I")
    public static final int method3706(byte arg0, int arg1, int arg2) {
        field9277++;
        int var3 = arg2 - 1 & arg1 >> 31;
        int var4 = 90 / ((-arg0 - 9) / 48);
        return ((arg1 >>> 31) + arg1) % arg2 + var3;
    }

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "(I)V")
    public static void method3707(int arg0) {
        field9276 = null;
        if (arg0 >= -14) {
            method3705((byte) -67, 71);
        }
        field9275 = null;
        field9273 = null;
        field9278 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIII)[B")
    public final byte[] method3708(int arg0, int arg1, int arg2, int arg3) {
        this.field9271 = new byte[arg1 * arg3 * arg0 * 2];
        if (arg2 != 10) {
            method3707(-19);
        }
        field9270++;
        this.method1936(arg3, arg0, arg1, false);
        return this.field9271;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIB)V")
    public final void method2791(int arg0, int arg1, byte arg2) {
        field9272++;
        int var4 = arg0 * 2;
        if (arg1 == -103) {
            int var5 = arg2 & 0xFF;
            this.field9271[var4++] = (byte) (var5 * 3 >> 5);
            this.field9271[var4] = (byte) (var5 * 3 >> 5);
        }
    }
}
