import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class567 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)I")
    public static final int method3268(byte arg0) {
        field7801++;
        if (class6.field70 == 0) {
            class378.field4779.method2215(new class465("jaclib"), true);
            if (class378.field4779.method2216((byte) 26).method230(-6635) != 100) {
                return 1;
            }
            if (!((class465) class378.field4779.method2216((byte) 51)).method2790(-84)) {
                class90.field1195.method2166(5000);
            }
            class6.field70 = 1;
        }
        if (class6.field70 == 1) {
            class642.field8764 = class378.method2217(1);
            class378.field4778.method2215(new class578(class318.field3910), true);
            class378.field4780.method2215(new class465("jaggl"), true);
            class378.field4782.method2215(new class465("jagdx"), true);
            class378.field4783.method2215(new class465("jagmisc"), true);
            class378.field4784.method2215(new class465("sw3d"), true);
            class378.field4785.method2215(new class465("hw3d"), true);
            class378.field4786.method2215(new class465("jagtheora"), true);
            class378.field4787.method2215(new class578(class519.field7331), true);
            class378.field4788.method2215(new class578(class195.field2336), true);
            class378.field4789.method2215(new class578(class483.field6745), true);
            class378.field4790.method2215(new class578(class392.field5080), true);
            class378.field4791.method2215(new class578(class691.field9407), true);
            class378.field4792.method2215(new class578(class410.field5375), true);
            class378.field4793.method2215(new class578(class481.field6728), true);
            class378.field4794.method2215(new class578(class53.field720), true);
            class378.field4795.method2215(new class578(class277.field3243), true);
            class378.field4796.method2215(new class578(class512.field7239), true);
            class378.field4797.method2215(new class578(class410.field5372), true);
            class378.field4798.method2215(new class578(class85.field1137), true);
            class378.field4799.method2215(new class578(class497.field6954), true);
            class378.field4800.method2215(new class578(class747.field10371), true);
            class378.field4801.method2215(new class20(class514.field7247, "huffman"), true);
            class378.field4802.method2215(new class578(class503.field7120), true);
            class378.field4803.method2215(new class578(class251.field2945), true);
            class378.field4804.method2215(new class578(class625.field8577), true);
            class378.field4805.method2215(new class137(class132.field1645, "details"), true);
            for (int var1 = 0; var1 < class642.field8764.length; var1++) {
                if (class642.field8764[var1].method2216((byte) -104) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class378[] var3 = class642.field8764;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class378 var5 = var3[var4];
                int var6 = var5.method2212(arg0 ^ 0x44);
                int var7 = var5.method2216((byte) -107).method230(arg0 - 6704);
                var2 += var6 * var7 / 100;
            }
            class421.field5613 = var2;
            class6.field70 = 2;
        }
        if (class642.field8764 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        class378[] var11 = class642.field8764;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class378 var16 = var11[var12];
            int var17 = var16.method2212(1);
            int var18 = var16.method2216((byte) -90).method230(-6635);
            var9 += var17 * var18 / 100;
            if (var18 < 100) {
                var10 = false;
            }
            var8 += var17;
        }
        if (var10) {
            if (!((class465) class378.field4783.method2216((byte) 101)).method2790(-118)) {
                class90.field1195.method2160((byte) -39);
            }
            if (!((class465) class378.field4786.method2216((byte) 44)).method2790(-113)) {
                class620.field8389 = class90.field1195.method2164(arg0 + 9);
            }
            class642.field8764 = null;
        }
        int var13 = var8 - class421.field5613;
        int var14 = var9 - class421.field5613;
        if (arg0 != 69) {
            method3268((byte) 80);
        }
        int var15 = var13 > 0 ? var14 * 100 / var13 : 100;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }
}
