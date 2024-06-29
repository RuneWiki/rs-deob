import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class31 extends class272 {

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client!vo", name = "x", descriptor = "[I")
    public static int[] field408 = new int[14];

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "[Ljava/awt/Color;")
    public static Color[] field415 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!vo", name = "y", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!vo", name = "A", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "[Lul;")
    public class371[] field417;

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "[[B")
    private byte[][] field418;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)Z")
    public final boolean method217(int arg0, int arg1) {
        field413++;
        if (arg0 != 65280) {
            this.field418 = null;
        }
        return this.field417[arg1].field5345;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(II)Z")
    public final boolean method218(int arg0, int arg1) {
        if (arg0 == 14) {
            field416++;
            return this.field417[arg1].field5349;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "(B)V")
    public static void method219(byte arg0) {
        field415 = null;
        field408 = null;
        int var1 = -97 % ((36 - arg0) / 57);
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)Z")
    public final boolean method220(int arg0) {
        field411++;
        if (this.field417 != null) {
            return true;
        }
        if (this.field418 == null) {
            if (!class422.field5919.method1248((byte) 103, this.field412)) {
                return false;
            }
            int[] var2 = class422.field5919.method1232(this.field412, (byte) -128);
            this.field418 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field418[var3] = class422.field5919.method1257(var2[var3], this.field412, 24558);
            }
        }
        if (arg0 != 255) {
            field409 = -43;
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field418.length; var5++) {
            byte[] var14 = this.field418[var5];
            int var15 = var14[0] & 0xFF << 8 | var14[1] & 0xFF;
            var4 &= class19.field267.method1230(-120, var15);
        }
        if (!var4) {
            return false;
        }
        class486 var6 = new class486();
        int var7 = class422.field5919.method1235(0, this.field412);
        this.field417 = new class371[var7];
        int[] var8 = class422.field5919.method1232(this.field412, (byte) -108);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field418[var9];
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            class92 var12 = null;
            for (class92 var13 = (class92) var6.method2843(1123227612); var13 != null; var13 = (class92) var6.method2842(1673506446)) {
                if (var13.field1164 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class92(var11, class19.field267.method1228(var11, 82));
                var6.method2845(var12, (byte) 37);
            }
            this.field417[var8[var9]] = new class371(var10, var12);
        }
        this.field418 = null;
        return true;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)I")
    public static final int method221(byte arg0, int arg1) {
        field410++;
        int var2 = 96 % ((-arg0 - 39) / 61);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I)V")
    public class31(int arg0) {
        this.field412 = arg0;
    }
}
