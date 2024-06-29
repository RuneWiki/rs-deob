import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class166 extends class143 {

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public int field2360 = -1;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Lsl;")
    public static class318 field2352 = new class318(35, 3);

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "F")
    public static float field2355;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public int field2350;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Ljava/lang/String;")
    public String field2351;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Ljava/lang/String;")
    public String field2354;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)Lak;", line = 3)
    public final class232 method1172(int arg0) {
        if (arg0 != -14839) {
            this.method1172(82);
        }
        ++field2357;
        return class316.field4504[super.field2012];
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)I", line = 20)
    public static final int method1173(int arg0) {
        if (arg0 > -35) {
            field2356 = -33;
        }
        ++field2358;
        return 16;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V", line = 34)
    public static final void method1174(int arg0, int arg1, int arg2) {
        ++field2359;
        class106 var3 = new class106(16);
        if (arg0 != 27106) {
            method1175(71);
        }
        for (class518 var4 = (class518) class89.field1216.method880((byte) -23); var4 != null; var4 = (class518) class89.field1216.method879((byte) -20)) {
            var4.method1525((byte) -119);
            int var5 = (int) (var4.field3271 >> 28);
            int var6 = (int) (16383L & var4.field3271 >> 14) - arg2;
            int var7 = (int) (16383L & var4.field3271) - arg1;
            if (var7 >= 0 && var6 >= 0 && ~var7 > ~class397.field5828 && class457.field6713 > var6) {
                var3.method878((long) (var5 << 28 | var6 << 14 | var7), -2301, var4);
            }
        }
        class89.field1216 = var3;
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)V", line = 73)
    public static void method1175(int arg0) {
        field2352 = null;
        if (arg0 != 23573) {
            field2355 = 0.5439605F;
        }
    }
}
