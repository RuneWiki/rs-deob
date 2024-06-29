import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class39 {

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "S")
    public short field534;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "B")
    public byte field525;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "S")
    public short field521;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public int field531;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "Z")
    public boolean field527;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "S")
    public short field532;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "B")
    public byte field535;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field533 = 0;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "[[Z")
    public static boolean[][] field529;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 11)
    public static void method250(int arg0) {
        if (arg0 != 0) {
            method250(43);
        }
        field529 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V", line = 22)
    public static final void method251(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field523++;
        int var5 = 0;
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = arg0;
        int var9 = class497.method2935(class175.field2497, arg1 + arg4, class382.field5379, -128);
        int var10 = class497.method2935(class175.field2497, arg4 - arg1, class382.field5379, -125);
        class419.method2511(class225.field3174[arg3], var10, arg2, var9, -79);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (var12 >= class343.field4727 && class54.field753 >= var11) {
                    int var13 = class497.method2935(class175.field2497, arg4 + var5, class382.field5379, -126);
                    int var14 = class497.method2935(class175.field2497, arg4 - var5, class382.field5379, -127);
                    if (class54.field753 >= var12) {
                        class419.method2511(class225.field3174[var12], var14, arg2, var13, arg0 ^ 0xFFFFFF84);
                    }
                    if (class343.field4727 <= var11) {
                        class419.method2511(class225.field3174[var11], var14, arg2, var13, arg0 ^ 0xFFFFFF92);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (class343.field4727 <= var16 && class54.field753 >= var15) {
                int var17 = class497.method2935(class175.field2497, arg4 + var6, class382.field5379, -125);
                int var18 = class497.method2935(class175.field2497, arg4 - var6, class382.field5379, arg0 - 126);
                if (class54.field753 >= var16) {
                    class419.method2511(class225.field3174[var16], var18, arg2, var17, 118);
                }
                if (var15 >= class343.field4727) {
                    class419.method2511(class225.field3174[var15], var18, arg2, var17, 87);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 106)
    public class39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field522 = arg11;
        this.field534 = (short) arg4;
        this.field525 = (byte) arg7;
        this.field524 = arg1;
        this.field521 = (short) arg5;
        this.field531 = arg3;
        this.field526 = arg0;
        this.field527 = arg10;
        this.field532 = (short) arg6;
        this.field535 = (byte) arg8;
        this.field530 = arg2;
    }
}
