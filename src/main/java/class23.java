import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class23 {

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "[I")
    public static int[] field310 = new int[64];

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)Lts;")
    public static final class41 method243(byte arg0) {
        field312++;
        class112 var1 = null;
        class41 var2 = new class41(class702.field9902, 0);
        try {
            class435 var3 = class681.field9312.method1552(-12111, true, "");
            while (var3.field6124 == 0) {
                class517.method2965(1L, -105);
            }
            if (var3.field6124 == 1) {
                var1 = (class112) var3.field6123;
                byte[] var4 = new byte[(int) var1.method757(-1)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var1.method761(var4.length - var5, (byte) 73, var5, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class41(new class179(var4), class702.field9902, 0);
            }
        } catch (Exception var9) {
        }
        try {
            if (var1 != null) {
                var1.method756(-1);
            }
            int var7 = -96 % ((-arg0 - 31) / 52);
        } catch (Exception var8) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(B)V")
    public static void method244(byte arg0) {
        field310 = null;
        if (arg0 != 21) {
            method245(null, 34);
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lha;I)V")
    public static final void method245(class454 arg0, int arg1) {
        field311++;
        int var2 = 0;
        int var3 = 0;
        if (class107.field1323) {
            var2 = class173.method1075(115);
            var3 = class203.method1259((byte) 127);
        }
        arg0.method131(var2, var3, class599.field8320 + var2, var3 + 350);
        arg0.method167(var2, var3, class599.field8320, 350, class418.field5954 << 24 | 0x332277, 1);
        class365.method2249(true, var3 + 350, var3, var2 + class599.field8320, var2);
        int var4 = 350 / class198.field2544;
        if (class10.field113 > 0) {
            int var5 = 342 - class198.field2544;
            int var6 = var4 * var5 / (class10.field113 + var4 - 1);
            int var7 = 4;
            if (class10.field113 > 1) {
                var7 += (var5 - var6) * (class10.field113 - class249.field3167 - 1) / (class10.field113 - 1);
            }
            arg0.method167(class599.field8320 + var2 - 16, var3 + var7, 12, var6, class418.field5954 << 24 | 0x332277, 2);
            for (int var8 = class249.field3167; var8 < (class249.field3167 + var4) && var8 < class10.field113; var8++) {
                String[] var9 = class124.method809('\b', -121, class48.field701[var8]);
                int var10 = (class599.field8320 - 24) / var9.length;
                for (int var11 = 0; var11 < var9.length; var11++) {
                    int var12 = var10 * var11 + 8;
                    arg0.method131(var2 + var12, var3, var10 + var12 + var2 - 8, var3 + 350);
                    class543.field7644.method2505(-1, -16777216, class348.method2042((byte) 100, var9[var11]), var2 + var12, -((-class249.field3167 + var8) * class198.field2544) + var3 + -class546.field7684 + 350 + -class619.field8670.field808 + -2, 255);
                }
            }
        }
        class524.field7408.method2522(-128, var2 + class599.field8320 - 25, "Build: 636", -16777216, var3 + 330, -1);
        arg0.method131(var2, var3, class599.field8320 + var2, var3 + 350);
        arg0.method2660(class599.field8320, 107, var3 + 350 - class546.field7684, -1, var2);
        int var13 = 81 % ((-arg1 - 27) / 46);
        class100.field1234.method2505(-1, -16777216, "--> " + class348.method2042((byte) 78, class534.field7501), var2 + 10, -class111.field1373.field808 + var3 + 350 - 1, 255);
        if (!class758.field10550) {
            return;
        }
        int var14 = -1;
        if ((class266.field3368 % 30) > 15) {
            var14 = 16777215;
        }
        arg0.method2667(class111.field1373.method453(-1, "--> " + class348.method2042((byte) 116, class534.field7501).substring(0, class607.field8420)) + (var2 + 10), (byte) 113, var3 + 350 - class111.field1373.field808 - 11, var14, 12);
    }
}
