import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class319 extends class297 {

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    private int field5003 = 585;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "J")
    public static long field5004 = 0L;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "[J")
    public static long[] field5002 = new long[500];

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "[I")
    public static int[] field5007 = new int[1000];

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "Lkc;")
    public static class41 field5005;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "[I")
    public static int[] field5001;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field5000;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V", line = 8)
    public static void method2253(byte arg0) {
        field5002 = null;
        field5007 = null;
        if (arg0 != 80) {
            method2253((byte) 19);
        }
        field5001 = null;
        field5000 = null;
        field5005 = null;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Laj;I)Lud;", line = 28)
    public static final class297 method2254(class1 arg0, int arg1) {
        if (arg1 != -1) {
            field5001 = (int[]) null;
        }
        field5006++;
        arg0.method15((byte) 97);
        int var2 = arg0.method15((byte) -116);
        class297 var3 = class305.method2168(var2, -20);
        var3.field4774 = arg0.method15((byte) 110);
        int var4 = arg0.method15((byte) 97);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method15((byte) -111);
            var3.method169(var6, 255, arg0);
        }
        var3.method247((byte) 68);
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I", line = 63)
    public static final int method2255(int arg0, int arg1) {
        if (arg0 != 1) {
            field5004 = 117L;
        }
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        field5008++;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 127)
    public class319() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILaj;)V", line = 102)
    public final void method169(int arg0, int arg1, class1 arg2) {
        field5010++;
        if (arg0 == 0) {
            this.field5003 = arg2.method56(19612);
        }
        if (arg1 != 255) {
            this.field5003 = -47;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)[I", line = 132)
    public final int[] method173(int arg0, boolean arg1) {
        int[] var3 = this.field4760.method215(arg0, 19142);
        field5009++;
        if (!arg1) {
            return (int[]) null;
        }
        if (this.field4760.field388) {
            int var4 = class264.field3901[arg0];
            for (int var5 = 0; var5 < class31.field491; var5++) {
                int var6 = class251.field3705[var5];
                if (var6 > this.field5003 && var6 < (4096 - this.field5003) && 2048 - this.field5003 < var4 && (this.field5003 + 2048) > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field5003);
                    var3[var5] = 4096 - var10;
                } else if (2048 - this.field5003 < var6 && var6 < this.field5003 + 2048) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field5003;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field5003);
                } else if (this.field5003 > var4 || var4 > (4096 - this.field5003)) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field5003;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field5003);
                } else if (this.field5003 <= var6 && 4096 - this.field5003 >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field5003);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }
}
