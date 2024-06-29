import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class358 extends class751 {

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    private int field5212 = 4096;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    private int field5215 = 0;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "[[F")
    public static float[][] field5209 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "[F")
    public static float[] field5211 = new float[4];

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public static int field5207 = 0;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5206 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "Lcb;")
    public static class544 field5213;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "[[[Lrr;")
    public static class379[][][] field5208;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V", line = 3)
    public static void method2252(int arg0) {
        if (arg0 != -19715) {
            method2252(-32);
        }
        field5206 = null;
        field5213 = null;
        field5208 = null;
        field5211 = null;
        field5209 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[I", line = 30)
    public final int[] method365(int arg0, int arg1) {
        ++field5214;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (super.field10405.field8923) {
            int[] var4 = this.method4173(arg0, (byte) -119, 0);
            for (int var5 = 0; var5 < class673.field9452; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field5215 && var6 <= this.field5212 ? 4096 : 0;
            }
        }
        if (arg1 != 4095) {
            field5206 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V", line = 70)
    public class358() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILrv;I)V", line = 75)
    public final void method309(int arg0, class120 arg1, int arg2) {
        ++field5210;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field5212 = arg1.method898((byte) -121);
            }
        } else {
            this.field5215 = arg1.method898((byte) -104);
        }
        int var5 = 93 % ((arg0 - 25) / 63);
    }
}
