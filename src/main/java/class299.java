import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class299 {

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Z")
    public boolean field4767 = false;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "[I")
    public static int[] field4765 = new int[1000];

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "[I")
    public static int[] field4770 = new int[2500];

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field4762 = 0;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4775 = "Connecting to update server";

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field4764 = 0;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public int field4766;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public int field4768;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "[I")
    public static int[] field4774;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "[Lnj;")
    public static class215[] field4769;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "[S")
    public static short[] field4771;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static void method2010(byte arg0) {
        field4765 = null;
        field4770 = null;
        field4774 = null;
        field4769 = null;
        field4771 = null;
        field4775 = null;
        if (arg0 >= -117) {
            field4770 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)I")
    public static int method2011(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZZ)Lca;")
    public final class91 method2012(int arg0, boolean arg1, boolean arg2) {
        class91 var4 = (class91) class112.field1616.method1517((long) ((arg2 ? 262144 : 0) | arg0 << 16 | this.field4768), (byte) -123);
        field4763++;
        if (var4 != null) {
            return var4;
        }
        class297.field4738.method509(27635, this.field4768);
        class91 var5 = class92.method630(this.field4768, arg1, class297.field4738, 0);
        if (var5 != null) {
            var5.method610(class303.field4817, class24.field304, class182.field2867);
            var5.field2945 = var5.field2952;
            var5.field2951 = var5.field2946;
            if (arg2) {
                var5.method622();
            }
            for (int var6 = 0; var6 < arg0; var6++) {
                var5.method612();
            }
            class112.field1616.method1518(var5, (long) ((arg2 ? 262144 : 0) | this.field4768 | arg0 << 16), (byte) 75);
        }
        return var5;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lim;III)V")
    private final void method2013(class170 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            method2016(true);
        }
        field4773++;
        if (arg2 == 1) {
            this.field4768 = arg0.method1186((byte) -51);
        } else if (arg2 == 2) {
            this.field4766 = arg0.method1212(arg1 + 460736848);
        } else if (arg2 == 3) {
            this.field4767 = true;
        } else if (arg2 == 4) {
            this.field4768 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)Lrb;")
    public static final class210 method2014(byte arg0) {
        field4772++;
        if (arg0 < 82) {
            method2016(false);
        }
        return class68.field1021.length > class171.field2683 ? class68.field1021[class171.field2683++] : null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BILim;)V")
    public final void method2015(byte arg0, int arg1, class170 arg2) {
        field4777++;
        if (arg0 != 44) {
            method2010((byte) 120);
        }
        while (true) {
            int var4 = arg2.method1218(-106);
            if (var4 == 0) {
                return;
            }
            this.method2013(arg2, arg0 ^ 0x2C, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public static final void method2016(boolean arg0) {
        field4776++;
        if (arg0) {
            method2014((byte) -67);
        }
    }
}
