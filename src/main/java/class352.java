import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class352 extends class512 {

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    private int field5493 = -1;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "Ljc;")
    public static class356 field5491 = new class356(12, 4);

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5497 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    private int field5492;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    private int field5499;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "[I")
    private int[] field5496;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)I")
    public final int method2259(byte arg0) {
        ++field5498;
        if (arg0 < 0) {
            this.method2260(-50);
        }
        return this.field5493;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZILia;)V")
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        if (arg1 == 0) {
            this.field5493 = arg2.method132(31);
        }
        if (!arg0) {
            method2261(-17);
        }
        ++field5495;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V")
    public final void method2260(int arg0) {
        ++field5490;
        super.method2260(arg0);
        this.field5496 = null;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class352() {
        super(0, false);
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V")
    public static void method2261(int arg0) {
        field5491 = null;
        if (arg0 <= 50) {
            method2261(-116);
        }
        field5497 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BII)V")
    public final void method2262(byte arg0, int arg1, int arg2) {
        super.method2262(arg0, arg1, arg2);
        ++field5494;
        if (this.field5493 >= 0 && class334.field5253 != null) {
            int var4 = class334.field5253.method195(this.field5493, (byte) -105).field5020 ? 64 : 128;
            this.field5496 = class334.field5253.method197(this.field5493, 1.0F, var4, (byte) 124, var4, false);
            this.field5492 = var4;
            this.field5499 = var4;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)[[I")
    public final int[][] method278(int arg0, int arg1) {
        ++field5489;
        int[][] var3 = super.field7496.method2777(arg1, 0);
        int var4 = 59 / ((-40 - arg0) / 47);
        if (super.field7496.field6942) {
            int var5 = this.field5499 * (class227.field3953 != this.field5492 ? this.field5492 * arg1 / class227.field3953 : arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            if (~class402.field6113 != ~this.field5499) {
                for (int var9 = 0; var9 < class402.field6113; ++var9) {
                    int var10 = this.field5499 * var9 / class402.field6113;
                    int var11 = this.field5496[var5 + var10];
                    var8[var9] = class344.method2224(255, var11) << 4;
                    var7[var9] = class344.method2224(65280, var11) >> 4;
                    var6[var9] = class344.method2224(16711680, var11) >> 12;
                }
            } else {
                for (int var12 = 0; class402.field6113 > var12; ++var12) {
                    int var13 = this.field5496[var5++];
                    var8[var12] = class344.method2224(255, var13) << 4;
                    var7[var12] = class344.method2224(var13, 65280) >> 4;
                    var6[var12] = class344.method2224(var13, 16711680) >> 12;
                }
            }
        }
        return var3;
    }
}
