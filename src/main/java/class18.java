import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class18 {

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "[I")
    public static int[] field244 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    public static int field250 = 2;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public static int field249 = 0;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "B")
    public byte field242;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "B")
    public byte field243;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "B")
    public byte field247;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "B")
    public byte field251;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "Lkm;")
    public static class133 field254;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "S")
    public short field248;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "Z")
    public boolean field239;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "Z")
    public boolean field240;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "Z")
    public boolean field241;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "Z")
    public boolean field245;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "Z")
    public boolean field253;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "[I")
    public static int[] field238;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "[Z")
    public static boolean[] field252;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 27)
    public static void method98(int arg0) {
        field238 = null;
        field244 = null;
        field254 = null;
        field252 = null;
        if (arg0 >= -87) {
            field238 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)Z", line = 62)
    public static final boolean method99(byte arg0) {
        field237++;
        if (arg0 != -98) {
            return true;
        }
        try {
            return class62.method426(arg0 + 97);
        } catch (IOException var5) {
            class113.method787(arg0 ^ 0xFFFFFE6A);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class343.field5331 + "," + class268.field4325 + "," + class101.field1470 + " - " + class219.field3540 + "," + (class191.field3129.field4248[0] + class70.field989) + "," + (class191.field3129.field4184[0] + class205.field3367) + " - ";
            for (int var4 = 0; class219.field3540 > var4 && var4 < 50; var4++) {
                var3 = var3 + class247.field3898.field573[var4] + ",";
            }
            class26.method152(var6, var3, -50);
            class42.method214(-105);
            return true;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B[J[I)V", line = 96)
    public static final void method100(byte arg0, long[] arg1, int[] arg2) {
        class280.method2030(arg2, arg1.length - 1, 0, (byte) -81, arg1);
        if (arg0 == -94) {
            field246++;
        }
    }
}
