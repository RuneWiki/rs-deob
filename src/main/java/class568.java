import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class568 extends class573 {

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    private int field8271 = 0;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    private int field8273 = 1;

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "I")
    private int field8281 = 0;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "Lsb;")
    public static class266 field8269 = new class266(39, 3);

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "[[Z")
    public static boolean[][] field8274 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "[Lef;")
    public static class455[] field8276 = new class455[2048];

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    public static int field8280 = 0;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
    public static int field8278 = -50;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "Ljava/lang/String;")
    public static String field8277 = null;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "Lmea;")
    public static class398 field8275 = new class398("runescape", 0);

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    public static int field8270;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public static int field8272;

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    public static int field8279;

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    public class568() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field8273 = arg0.method732(-559537960);
                }
            } else {
                this.field8281 = arg0.method732(-559537960);
            }
        } else {
            this.field8271 = arg0.method732(-559537960);
        }
        if (arg2 != 3) {
            method3280(true);
        }
        ++field8279;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field8272;
        if (arg1 != 1) {
            field8275 = null;
        }
        int[] var3 = super.field8321.method3164(arg0, -124);
        if (super.field8321.field7825) {
            int var4 = class230.field3460[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; ~var6 > ~class540.field7555; ++var6) {
                int var7 = class51.field1194[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field8271 == -1) {
                    var9 = (var7 - var4) * this.field8273;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field8273 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (this.field8281 != 0) {
                    if (~this.field8281 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                } else {
                    var12 = class370.field5489[var12 >> 4 & 255] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
    public static void method3280(boolean arg0) {
        field8276 = null;
        if (arg0) {
            field8277 = null;
        }
        field8277 = null;
        field8274 = null;
        field8269 = null;
        field8275 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public final void method617(int arg0) {
        ++field8270;
        class136.method1117((byte) 63);
        if (arg0 != 4095) {
            field8274 = null;
        }
    }
}
