import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class409 {

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Lhn;")
    private class509 field5866 = new class509(16);

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Lfo;")
    private class361 field5867;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "[F")
    public static float[] field5863 = new float[4];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "[[B")
    public static byte[][] field5862;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 7)
    public static void method2502(int arg0) {
        field5862 = null;
        field5863 = null;
        if (arg0 != 30) {
            method2502(-22);
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V", line = 20)
    public final void method2503(int arg0) {
        class509 var2 = this.field5866;
        synchronized (this.field5866) {
            this.field5866.method3045(48);
        }
        field5865++;
        if (arg0 > -119) {
            this.field5867 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V", line = 34)
    public final void method2504(int arg0, int arg1) {
        if (arg1 != 4) {
            this.method2505(-68, -125);
        }
        field5860++;
        class509 var3 = this.field5866;
        synchronized (this.field5866) {
            this.field5866.method3036(arg0, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)Lfm;", line = 57)
    public final class518 method2505(int arg0, int arg1) {
        field5861++;
        class509 var3 = this.field5866;
        class518 var4;
        synchronized (this.field5866) {
            var4 = (class518) this.field5866.method3032(3589, (long) arg1);
            if (arg0 != 8552) {
                this.field5867 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field5867;
        byte[] var6;
        synchronized (this.field5867) {
            var6 = this.field5867.method2130(30, arg1, -73);
        }
        class518 var7 = new class518();
        if (var6 != null) {
            var7.method3097(new class396(var6), 11);
        }
        class509 var8 = this.field5866;
        synchronized (this.field5866) {
            this.field5866.method3046((long) arg1, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Ld;ILfo;)V", line = 88)
    public class409(class104 arg0, int arg1, class361 arg2) {
        this.field5867 = arg2;
        this.field5867.method2136(-111, 30);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V", line = 103)
    public final void method2506(int arg0) {
        class509 var2 = this.field5866;
        synchronized (this.field5866) {
            this.field5866.method3034((byte) 84);
        }
        if (arg0 != 4) {
            this.method2506(73);
        }
        field5864++;
    }
}
