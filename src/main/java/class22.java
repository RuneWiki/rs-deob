import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class22 extends class23 {

    @OriginalMember(owner = "client!lh", name = "eb", descriptor = "I")
    private int field392 = 0;

    @OriginalMember(owner = "client!lh", name = "hb", descriptor = "I")
    private int field395 = 0;

    @OriginalMember(owner = "client!lh", name = "gb", descriptor = "I")
    private int field394 = 1;

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "Lqd;")
    public static class40 field386 = class147.method1106("underlay", (byte) -107);

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!lh", name = "db", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!lh", name = "fb", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "[Lda;")
    public static class114[] field388;

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "[[B")
    public static byte[][] field387;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)I", line = 16)
    public static final int method168(int arg0, int arg1) {
        if (arg1 != -1556662293) {
            method169((byte) -72);
        }
        field393++;
        return (arg0 & 0x3FCA8) >> 11;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 27)
    public final void method61(byte arg0) {
        class50.method440((byte) 81);
        field389++;
        if (arg0 != 4) {
            this.method61((byte) -91);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)[I", line = 38)
    public final int[] method32(byte arg0, int arg1) {
        field391++;
        if (arg0 != -94) {
            return (int[]) null;
        }
        int[] var3 = this.field403.method724((byte) -80, arg1);
        if (this.field403.field1760) {
            int var4 = class150.field2509[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class52.field1007; var6++) {
                int var7 = class315.field5345[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field395 == 0) {
                    var9 = (var7 - var4) * this.field394;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field394 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field392 == 0) {
                    var12 = class29.field618[(var12 & 0xFFD) >> 4] + 4096 >> 1;
                } else if (this.field392 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V", line = 107)
    public static void method169(byte arg0) {
        field386 = null;
        field387 = (byte[][]) null;
        field388 = null;
        if (arg0 <= 106) {
            method168(-41, -74);
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V", line = 119)
    public class22() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILsd;)V", line = 131)
    public final void method23(int arg0, int arg1, class26 arg2) {
        field390++;
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 0) {
            this.field395 = arg2.method226(255);
        } else if (arg0 == 1) {
            this.field392 = arg2.method226(255);
        } else if (arg0 == 3) {
            this.field394 = arg2.method226(255);
        }
    }
}
