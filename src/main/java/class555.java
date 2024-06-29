import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class555 {

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    private int field7259 = -1;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    private int field7265 = 0;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "Lki;")
    private class364 field7257 = new class364();

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "Z")
    public boolean field7266 = false;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    private int field7256;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    private int field7264;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "[Luc;")
    private class229[] field7262;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "[[I")
    private int[][] field7258;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "Lfs;")
    public static class546 field7261 = new class546("LIVE", 0);

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "[C")
    public static char[] field7269 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)[[I", line = 6)
    public final int[][] method2974(int arg0) {
        field7267++;
        if (this.field7264 != this.field7256) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 != 30455) {
            this.field7259 = 16;
        }
        while (var2 < this.field7264) {
            this.field7262[var2] = class233.field3129;
            var2++;
        }
        return this.field7258;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V", line = 32)
    public final void method2975(byte arg0) {
        field7255++;
        int var2 = 0;
        if (arg0 != -14) {
            this.field7259 = 57;
        }
        while (var2 < this.field7264) {
            this.field7258[var2] = null;
            var2++;
        }
        this.field7258 = null;
        this.field7262 = null;
        this.field7257.method2085((byte) 9);
        this.field7257 = null;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)V", line = 56)
    public static void method2976(byte arg0) {
        field7269 = null;
        int var1 = -60 % ((arg0 - 43) / 33);
        field7261 = null;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(III)V", line = 167)
    public class555(int arg0, int arg1, int arg2) {
        this.field7256 = arg1;
        this.field7264 = arg0;
        this.field7262 = new class229[this.field7256];
        this.field7258 = new int[this.field7264][arg2];
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IB)I", line = 82)
    public static final int method2977(int arg0, byte arg1) {
        field7260++;
        return arg1 == -19 ? arg0 >>> 7 : 3;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(IB)[I", line = 95)
    public final int[] method2978(int arg0, byte arg1) {
        field7263++;
        if (arg1 != -56) {
            return null;
        } else if (this.field7264 == this.field7256) {
            this.field7266 = this.field7262[arg0] == null;
            this.field7262[arg0] = class233.field3129;
            return this.field7258[arg0];
        } else if (this.field7264 == 1) {
            this.field7266 = this.field7259 != arg0;
            this.field7259 = arg0;
            return this.field7258[0];
        } else {
            class229 var3 = this.field7262[arg0];
            if (var3 == null) {
                this.field7266 = true;
                if (this.field7265 < this.field7264) {
                    var3 = new class229(arg0, this.field7265);
                    this.field7265++;
                } else {
                    class229 var4 = (class229) this.field7257.method2081(arg1 ^ 0xFFFFFFE2);
                    var3 = new class229(arg0, var4.field3054);
                    this.field7262[var4.field3050] = null;
                    var4.method2438((byte) -13);
                }
                this.field7262[arg0] = var3;
            } else {
                this.field7266 = false;
            }
            this.field7257.method2082((byte) -112, var3);
            return this.field7258[var3.field3054];
        }
    }
}
