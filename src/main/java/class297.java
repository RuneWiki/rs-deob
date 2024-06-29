import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class297 {

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public int field4222;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
    public int field4234;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public int field4220;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public int field4221;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "B")
    public byte field4227;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    public int field4229;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "Lnq;")
    public class319 field4223;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "Lgh;")
    public class383 field4224;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "Lcj;")
    public class488 field4225;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "Lic;")
    public static class491 field4228;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "Lct;")
    public class97 field4226;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)[B")
    public static final byte[] method1882(int arg0, int arg1) {
        int var2 = -69 / ((-arg0 - 23) / 54);
        field4233++;
        class50 var3 = (class50) class325.field4642.method145((long) arg1, (byte) -11);
        if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg1);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class317.method1984(113, var5, var8);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var3 = new class50(var4);
            class325.field4642.method151(0, var3, (long) arg1);
        }
        return var3.field798;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BII)I")
    public static final int method1883(byte arg0, int arg1, int arg2) {
        if (arg0 != -25) {
            method1886(null, (byte) -50);
        }
        field4232++;
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7F87BD5) >> 19;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
    public static void method1884(byte arg0) {
        int var1 = 115 / ((arg0 - 4) / 49);
        field4228 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1885(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field4231++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg5 * arg5;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        if (arg4 < 10) {
            method1883((byte) -127, 122, 101);
        }
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg3 - 1) * var15;
        class415.method2491(arg1 + arg5, -arg5 + arg1, class339.field4800[arg0], arg2, -31541);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var7--;
            var18 -= var15;
            var20 -= var15;
            int var21 = arg0 - var7;
            int var22 = arg0 + var7;
            int var23 = arg1 + var6;
            int var24 = arg1 - var6;
            class415.method2491(var23, var24, class339.field4800[var21], arg2, -31541);
            class415.method2491(var23, var24, class339.field4800[var22], arg2, -31541);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lqa;B)V")
    public static final void method1886(class162 arg0, byte arg1) {
        field4230++;
        if (class523.field7744 == class500.field7365.field1768 || class108.field1553 == null) {
            return;
        }
        if (arg1 != -121) {
            method1884((byte) 100);
        }
        if (class251.method1679(class500.field7365.field1768, arg0, (byte) -72)) {
            class523.field7744 = class500.field7365.field1768;
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(BIIIII)V")
    public class297(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4222 = arg1;
        this.field4234 = arg3;
        this.field4220 = arg5;
        this.field4221 = arg4;
        this.field4227 = arg0;
        this.field4229 = arg2;
    }
}
