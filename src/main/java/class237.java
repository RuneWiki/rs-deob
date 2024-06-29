import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class237 extends class61 {

    @OriginalMember(owner = "client!w", name = "k", descriptor = "[B")
    public byte[] field4301;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "[Llc;")
    public static class143[] field4305 = new class143[200];

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Llc;")
    public static class143 field4303 = class66.method374("rect_debug=", -1);

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[I")
    public static int[] field4306 = new int[100];

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static void method1594(byte arg0) {
        if (arg0 <= 85) {
            method1595(97, (byte) -83, -94, 60, -38, 77);
        }
        field4306 = null;
        field4305 = null;
        field4303 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IBIIII)V")
    public static final void method1595(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        class289.method1927(class15.field268[arg3], arg4, arg0 - arg2, arg1 + -147, arg0 + arg2);
        field4300++;
        int var6 = 0;
        int var7 = arg5 * arg5;
        int var8 = arg5;
        int var9 = var7 << 1;
        int var10 = arg2 * arg2;
        int var11 = var10 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var10 + var9;
        int var14 = var10 << 2;
        if (arg1 != 69) {
            return;
        }
        int var15 = var7 << 2;
        int var16 = ((arg5 << 1) - 3) * var11;
        int var17 = ((var6 << 1) + 3) * var9;
        int var18 = var7 - (var12 - 1) * var11;
        int var19 = (var6 + 1) * var15;
        int var20 = (arg5 - 1) * var14;
        while (var8 > 0) {
            var8--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var17 += var15;
                    var6++;
                    var18 += var19;
                    var19 += var15;
                }
            }
            if (var18 < 0) {
                var13 += var17;
                var18 += var19;
                var6++;
                var17 += var15;
                var19 += var15;
            }
            var13 += -var20;
            var20 -= var14;
            var18 += -var16;
            var16 -= var14;
            int var21 = arg3 + var8;
            int var22 = arg0 + var6;
            int var23 = arg3 - var8;
            int var24 = arg0 - var6;
            class289.method1927(class15.field268[var23], arg4, var24, -126, var22);
            class289.method1927(class15.field268[var21], arg4, var24, -71, var22);
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "([B)V")
    public class237(byte[] arg0) {
        this.field4301 = arg0;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    public static final void method1596(int arg0) {
        class217.field3975.method823(true);
        field4302++;
        if (arg0 != 200) {
            method1594((byte) 103);
        }
    }
}
