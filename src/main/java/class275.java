import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class275 extends class91 {

    @OriginalMember(owner = "client!ud", name = "kb", descriptor = "I")
    public static int field4727 = 0;

    @OriginalMember(owner = "client!ud", name = "mb", descriptor = "Z")
    public static boolean field4729 = false;

    @OriginalMember(owner = "client!ud", name = "nb", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!ud", name = "ob", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!ud", name = "lb", descriptor = "Loh;")
    public static class15 field4728;

    @OriginalMember(owner = "client!ud", name = "jb", descriptor = "[[S")
    public static short[][] field4726;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)[[I", line = 10)
    public final int[][] method87(int arg0, int arg1) {
        field4730++;
        if (arg0 != 7) {
            field4729 = true;
        }
        int[][] var3 = this.field4347.method536(arg1, arg0 ^ 0x1007);
        if (this.field4347.field1202 && this.method624(false)) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int var6 = arg1 % this.field1448 * this.field1448;
            int[] var7 = var3[0];
            for (int var8 = 0; var8 < class98.field1598; var8++) {
                int var9 = this.field1450[var6 + (var8 % this.field1437)];
                var5[var8] = class82.method582(var9, 255) << 4;
                var4[var8] = class82.method582(65280, var9) >> 4;
                var7[var8] = class82.method582(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)V", line = 57)
    public static void method2005(byte arg0) {
        field4728 = null;
        if (arg0 == 25) {
            field4726 = (short[][]) null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZI)V", line = 81)
    public static final void method2006(int arg0, boolean arg1, int arg2) {
        short var3 = 256;
        if (class198.field3297 > 0) {
            class254.method1848(255, class198.field3297);
            class198.field3297 = 0;
        }
        field4731++;
        int var4 = 0;
        int var5 = class181.field3034 * arg0;
        int var6 = 0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class318.field5377[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class100.field1612[var4++];
                int var11 = class181.field3040[arg2 + (var5++)];
                if (var10 == 0) {
                    class319.field5458.field5243[var6++] = var11;
                } else {
                    int var12 = var10 + 18;
                    int var13 = 238 - var10;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var14 = class313.field5347[var10];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    class319.field5458.field5243[var6++] = class82.method582(16711680, var13 * class82.method582(var11, 65280) + class82.method582(var14, 65280) * var12) + class82.method582(-16711936, class82.method582(var14, 16711935) * var12 + class82.method582(var11, 16711935) * var13) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class319.field5458.field5243[var6++] = class181.field3040[var5++ + arg2];
            }
            var5 += class181.field3034 - 128;
        }
        if (class271.field4640) {
            class131.method966(class319.field5458.field5243, arg2, arg0, class319.field5458.field1145, class319.field5458.field1155);
        } else {
            class319.field5458.method49(arg2, arg0);
        }
        if (arg1) {
            method2005((byte) -94);
        }
    }
}
