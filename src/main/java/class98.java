import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class98 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public int field1668 = -1;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public int field1669 = -1;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field1672 = 7759444;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field1673 = 0;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field1677 = 0;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Llc;")
    public static class270 field1674;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "[I")
    public int[] field1670;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public static void method768(byte arg0) {
        int var1 = 120 % ((-arg0 - 66) / 52);
        field1674 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Laf;B)V")
    public static final void method769(class176 arg0, byte arg1) {
        short var2 = 256;
        field1671++;
        for (int var3 = 0; var3 < class231.field3395.length; var3++) {
            class231.field3395[var3] = 0;
        }
        int var4 = 0;
        if (arg1 < 107) {
            method769((class176) null, (byte) -91);
        }
        while (var4 < 5000) {
            int var16 = (int) ((double) var2 * Math.random() * 128.0D);
            class231.field3395[var16] = (int) (Math.random() * 284.0D);
            var4++;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < (var2 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class57.field845[var15] = (class231.field3395[var15 + 1] + class231.field3395[var15 - 128] + class231.field3395[var15 + 128] + class231.field3395[var15 + -1]) / 4;
                }
            }
            int[] var13 = class231.field3395;
            class231.field3395 = class57.field845;
            class57.field845 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field2255; var7++) {
            for (int var8 = 0; var8 < arg0.field2258; var8++) {
                if (arg0.field2661[var6++] != 0) {
                    int var9 = var8 + arg0.field2250 + 16;
                    int var10 = arg0.field2249 + var7 + 16;
                    int var11 = (var10 << 7) + var9;
                    class231.field3395[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLhc;I)V")
    public final void method770(byte arg0, class53 arg1, int arg2) {
        if (arg0 != -95) {
            this.method771(46, 122, (class53) null, 127);
        }
        while (true) {
            int var4 = arg1.method366(arg0 - 16410);
            if (var4 == 0) {
                field1675++;
                return;
            }
            this.method771(arg2, var4, arg1, -72);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILhc;I)V")
    private final void method771(int arg0, int arg1, class53 arg2, int arg3) {
        if (arg1 == 1) {
            this.field1669 = arg2.method331(-71);
        } else if (arg1 == 2) {
            this.field1670 = new int[arg2.method366(-16505)];
            for (int var5 = 0; var5 < this.field1670.length; var5++) {
                this.field1670[var5] = arg2.method331(-96);
            }
        } else if (arg1 == 3) {
            this.field1668 = arg2.method366(-16505);
        }
        field1676++;
        int var6 = -87 % ((arg3 + 25) / 34);
    }
}
