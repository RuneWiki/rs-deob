import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class96 extends class240 {

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "I")
    private int field1756 = 3216;

    @OriginalMember(owner = "client!pm", name = "U", descriptor = "I")
    private int field1761 = 3216;

    @OriginalMember(owner = "client!pm", name = "Y", descriptor = "[I")
    private int[] field1765 = new int[3];

    @OriginalMember(owner = "client!pm", name = "W", descriptor = "I")
    private int field1763 = 4096;

    @OriginalMember(owner = "client!pm", name = "S", descriptor = "Lig;")
    public static class168 field1759 = new class168(5);

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!pm", name = "R", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!pm", name = "T", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!pm", name = "V", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!pm", name = "Z", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!pm", name = "X", descriptor = "[[[I")
    public static int[][][] field1764;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(B)V", line = 11)
    private final void method722(byte arg0) {
        field1766++;
        double var2 = Math.cos((double) ((float) this.field1756 / 4096.0F));
        this.field1765[0] = (int) (Math.sin((double) ((float) this.field1761 / 4096.0F)) * var2 * 4096.0D);
        this.field1765[1] = (int) (Math.cos((double) ((float) this.field1761 / 4096.0F)) * 4096.0D * var2);
        int var4 = -29 % ((-arg0 - 6) / 52);
        this.field1765[2] = (int) (Math.sin((double) ((float) this.field1756 / 4096.0F)) * 4096.0D);
        int var5 = this.field1765[1] * this.field1765[1] >> 12;
        int var6 = this.field1765[0] * this.field1765[0] >> 12;
        int var7 = this.field1765[2] * this.field1765[2] >> 12;
        int var8 = (int) (Math.sqrt((double) (var6 + var7 + var5 >> 12)) * 4096.0D);
        if (var8 != 0) {
            this.field1765[2] = (this.field1765[2] << 12) / var8;
            this.field1765[0] = (this.field1765[0] << 12) / var8;
            this.field1765[1] = (this.field1765[1] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)V", line = 41)
    public final void method288(int arg0) {
        if (arg0 == 17772) {
            this.method722((byte) -109);
            field1758++;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 53)
    public static void method723(boolean arg0) {
        if (arg0) {
            field1764 = (int[][][]) ((int[][][]) null);
        }
        field1759 = null;
        field1764 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)[I", line = 65)
    public final int[] method12(int arg0, int arg1) {
        field1762++;
        if (arg0 != 64) {
            return (int[]) null;
        }
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            int var4 = class259.field4467 * this.field1763 >> 12;
            int[] var5 = this.method1745(class74.field1407 & arg1 - 1, 0, (byte) 121);
            int[] var6 = this.method1745(arg1, 0, (byte) 120);
            int[] var7 = this.method1745(arg1 + 1 & class74.field1407, 0, (byte) 124);
            for (int var8 = 0; var8 < class169.field2936; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[class132.field2356 & var8 - 1] - var6[class132.field2356 & var8 + 1]) * var4 >> 12;
                int var11 = var9 >> 4;
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var13 = class145.field2558[((var11 + 1) * var11 >> 1) + var12] & 0xFF;
                int var14 = var13 * 4096 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = this.field1765[1] * var15 >> 12;
                int var17 = this.field1765[2] * var14 >> 12;
                int var18 = var10 * var13 >> 8;
                int var19 = this.field1765[0] * var18 >> 12;
                var3[var8] = var16 + var17 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 162)
    public class96() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLkh;)Lcd;", line = 168)
    public static final class64 method724(byte arg0, class13 arg1) {
        if (arg0 > -8) {
            return (class64) null;
        } else {
            field1757++;
            return class245.method1777(arg1, true, 32767);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILkh;)V", line = 189)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg0 != 2) {
            return;
        }
        field1755++;
        if (arg1 == 0) {
            this.field1763 = arg2.method112((byte) 92);
        } else if (arg1 == 1) {
            this.field1761 = arg2.method112((byte) 92);
        } else if (arg1 == 2) {
            this.field1756 = arg2.method112((byte) 92);
        }
    }
}
