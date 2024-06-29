import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class295 {

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public int field4713 = 0;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "S")
    public static short field4712 = 256;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Z")
    public static boolean field4715 = false;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "J")
    public static long field4709 = 0L;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "[Lf;")
    public static class269[] field4720;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "[[[I")
    public static int[][][] field4717;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lcg;Lcg;B)V", line = 5)
    public static final void method2012(class49 arg0, class49 arg1, byte arg2) {
        class256.field4131 = arg1;
        class144.field2622 = arg0;
        if (arg2 == 28) {
            field4710++;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)I", line = 17)
    public static final int method2013(int arg0) {
        if (arg0 >= -44) {
            return -110;
        } else {
            field4714++;
            return 15;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lpi;B)V", line = 34)
    public final void method2014(class336 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2364(-9069);
            if (var3 == 0) {
                field4721++;
                int var4 = -44 % ((arg1 + 3) / 62);
                return;
            }
            this.method2016(var3, -2195, arg0);
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V", line = 51)
    public static void method2015(int arg0) {
        field4720 = null;
        if (arg0 != -19690) {
            field4720 = (class269[]) null;
        }
        field4717 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILpi;)V", line = 63)
    private final void method2016(int arg0, int arg1, class336 arg2) {
        if (arg0 == 5) {
            this.field4713 = arg2.method2339((byte) -46);
        }
        if (arg1 != -2195) {
            method2012((class49) null, (class49) null, (byte) 80);
        }
        field4711++;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)[Lgh;", line = 104)
    public static final class250[] method2017(int arg0) {
        field4716++;
        class250[] var1 = new class250[class130.field2242];
        if (arg0 <= 106) {
            field4712 = 32;
        }
        for (int var2 = 0; var2 < class130.field2242; var2++) {
            if (class43.field680) {
                var1[var2] = new class232(class308.field4901, class4.field58, class352.field5575[var2], class104.field1743[var2], class39.field585[var2], class123.field2138[var2], class191.field3205[var2], class40.field600);
            } else {
                var1[var2] = new class217(class308.field4901, class4.field58, class352.field5575[var2], class104.field1743[var2], class39.field585[var2], class123.field2138[var2], class191.field3205[var2], class40.field600);
            }
        }
        class15.method151(0);
        return var1;
    }
}
