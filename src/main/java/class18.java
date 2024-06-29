import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class18 extends class415 {

    @OriginalMember(owner = "client!cv", name = "O", descriptor = "Lvv;")
    public static class313 field202 = new class313(81, 8);

    @OriginalMember(owner = "client!cv", name = "G", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!cv", name = "J", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!cv", name = "L", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!cv", name = "N", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!cv", name = "M", descriptor = "Lpd;")
    public class436 field200;

    @OriginalMember(owner = "client!cv", name = "K", descriptor = "Lqs;")
    public static class496 field198;

    @OriginalMember(owner = "client!cv", name = "H", descriptor = "[B")
    public byte[] field195;

    @OriginalMember(owner = "client!cv", name = "I", descriptor = "[[I")
    public static int[][] field196;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "(I)V")
    public static void method87(int arg0) {
        if (arg0 == 0) {
            field198 = null;
            field202 = null;
            field196 = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "(B)[B")
    public final byte[] method88(byte arg0) {
        if (arg0 != 32) {
            this.method88((byte) 45);
        }
        ++field199;
        if (super.field6303) {
            throw new RuntimeException();
        } else {
            return this.field195;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILap;)V")
    public static final void method89(int arg0, class340 arg1) {
        ++field197;
        arg1.method2154((byte) 90);
        int var2 = class265.field4432;
        class166 var3 = class302.field4850 = class435.field6489[var2] = new class166();
        var3.field3130 = var2;
        int var4 = arg1.method2155(30, 30390);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 16383;
        var3.field3159[0] = -class16.field181 + var6;
        int var7 = var4 & 16383;
        var3.field4716 = (var3.field3159[0] << 7) + (var3.method1143(0) << 6);
        var3.field3158[0] = -class455.field6794 + var7;
        var3.field4714 = (var3.field3158[0] << 7) + (var3.method1143(0) << 6);
        class93.field1556 = var3.field4720 = var5;
        if (class20.field226[var2] != null) {
            var3.method1140(true, class20.field226[var2]);
        }
        class151.field2425 = 0;
        class45.field734[class151.field2425++] = var2;
        if (arg0 > 75) {
            class434.field6474[var2] = 0;
            class328.field5181 = 0;
            for (int var8 = 1; var8 < 2048; ++var8) {
                if (var2 != var8) {
                    int var9 = arg1.method2155(18, 30390);
                    int var10 = var9 >> 16;
                    int var11 = 255 & var9 >> 8;
                    int var12 = var9 & 255;
                    class260 var13 = class201.field3196[var8] = new class260();
                    var13.field4349 = (var11 << 14) + (var10 << 28) + var12;
                    var13.field4355 = 0;
                    var13.field4350 = -1;
                    var13.field4354 = false;
                    class100.field1662[class328.field5181++] = var8;
                    class434.field6474[var8] = 0;
                }
            }
            arg1.method2149(30795);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)I")
    public final int method90(int arg0) {
        ++field194;
        if (super.field6303) {
            return 0;
        } else {
            if (arg0 != 0) {
                method87(-38);
            }
            return 100;
        }
    }
}
