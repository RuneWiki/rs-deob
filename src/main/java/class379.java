import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class379 {

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    private int field5827 = -1;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    private int field5833 = 0;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lnj;")
    private class317 field5823 = new class317();

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Z")
    public boolean field5837 = false;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    private int field5830;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    private int field5835;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "[[I")
    private int[][] field5824;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "[Ljc;")
    private class361[] field5832;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lss;")
    public static class213 field5829 = new class213("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Z")
    public static boolean field5836 = false;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public final void method2449(boolean arg0) {
        field5831++;
        for (int var2 = 0; var2 < this.field5830; var2++) {
            this.field5824[var2] = null;
        }
        this.field5824 = null;
        this.field5832 = null;
        this.field5823.method2120((byte) 27);
        if (!arg0) {
            this.field5837 = true;
        }
        this.field5823 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)[[I")
    public final int[][] method2450(int arg0) {
        field5834++;
        if (this.field5835 != this.field5830) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field5830; var2++) {
            this.field5832[var2] = class79.field1179;
        }
        return this.field5824;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([[IB)V")
    public static final void method2451(int[][] arg0, byte arg1) {
        field5826++;
        if (arg1 != -38) {
            field5829 = null;
        }
        class103.field1521 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)[I")
    public final int[] method2452(byte arg0, int arg1) {
        if (arg0 < 13) {
            method2453(73);
        }
        field5828++;
        if (this.field5835 == this.field5830) {
            this.field5837 = this.field5832[arg1] == null;
            this.field5832[arg1] = class79.field1179;
            return this.field5824[arg1];
        } else if (this.field5830 == 1) {
            this.field5837 = this.field5827 != arg1;
            this.field5827 = arg1;
            return this.field5824[0];
        } else {
            class361 var3 = this.field5832[arg1];
            if (var3 == null) {
                this.field5837 = true;
                if (this.field5830 > this.field5833) {
                    var3 = new class361(arg1, this.field5833);
                    this.field5833++;
                } else {
                    class361 var4 = (class361) this.field5823.method2125(18007);
                    var3 = new class361(arg1, var4.field5594);
                    this.field5832[var4.field5589] = null;
                    var4.method3149(111);
                }
                this.field5832[arg1] = var3;
            } else {
                this.field5837 = false;
            }
            this.field5823.method2116(var3, (byte) 72);
            return this.field5824[var3.field5594];
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static void method2453(int arg0) {
        field5829 = null;
        if (arg0 != 14535) {
            field5829 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([III[IILna;)Lgu;")
    public static final class387 method2454(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, class211 arg5) {
        field5825++;
        byte[] var6 = new byte[arg1 * arg4];
        for (int var7 = 0; var7 < arg1; var7++) {
            int var8 = arg4 * var7 + arg3[var7];
            for (int var9 = 0; var9 < arg0[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        if (arg2 != 1) {
            method2454(null, -62, 126, null, 94, null);
        }
        return new class387(arg5, arg4, arg1, var6);
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(III)V")
    public class379(int arg0, int arg1, int arg2) {
        this.field5830 = arg0;
        this.field5835 = arg1;
        this.field5824 = new int[this.field5830][arg2];
        this.field5832 = new class361[this.field5835];
    }
}
