import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class383 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Lqv;")
    public static class406 field5128 = new class406(8, 1);

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "F")
    public static float field5135;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public int field5131;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public int field5132;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public int field5134;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Z")
    public boolean field5130;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "[I")
    public static int[] field5136;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 4)
    public static void method2106(int arg0) {
        field5128 = null;
        if (arg0 > 9) {
            field5136 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 17)
    public static final void method2107(String arg0, boolean arg1, int arg2) {
        String var3 = arg0.toLowerCase();
        field5133++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class58.field599.field3382 : class58.field599.field3386) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class477 var11 = class58.field599.method1516(0, var8);
            if (var11.field6951 && var11.method2785(-111).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class382.field5121 = null;
                    class67.field726 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class382.field5121 = var4;
        class255.field3262 = arg2;
        class67.field726 = var5;
        String[] var9 = new String[class67.field726];
        for (int var10 = 0; var10 < class67.field726; var10++) {
            var9[var10] = class58.field599.method1516(0, var4[var10]).method2785(-124);
        }
        class9.method47(class382.field5121, var9, (byte) -57);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)Lgi;", line = 94)
    public static final class620 method2108(byte arg0, int arg1) {
        if (arg0 <= 73) {
            method2106(-66);
        }
        field5129++;
        return class384.field5139 && class309.field4009 <= arg1 && class87.field931 >= arg1 ? class13.field120[arg1 - class309.field4009] : null;
    }
}
