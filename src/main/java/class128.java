import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class128 extends class181 {

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "Lcf;")
    public class111 field2285;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "[Lli;")
    public static class185[] field2290 = new class185[200];

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "Lli;")
    public static class185 field2288 = class245.method1649("scrollbar", -98);

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "Lli;")
    private static class185 field2292 = class245.method1649("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", -29);

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "Z")
    public static volatile boolean field2286 = false;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field2293 = 2;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "[I")
    public static int[] field2295 = new int[99];

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "Lli;")
    public static class185 field2287 = field2292;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "Lli;")
    public static class185 field2299;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "Lli;")
    public static class185 field2300;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "Lhi;")
    public static class250 field2291;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljd;I)V")
    public static final void method916(class118 arg0, int arg1) {
        for (int var2 = 0; var2 < class238.field4251; var2++) {
            int var3 = arg0.method836((byte) -84);
            int var4 = arg0.method827(arg1 + 65791);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class94.field1797[var3] != null) {
                class94.field1797[var3].field2900 = var4;
            }
        }
        if (arg1 != -65536) {
            method917(27);
        }
        field2294++;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
    public static void method917(int arg0) {
        field2287 = null;
        field2292 = null;
        if (arg0 != -1) {
            return;
        }
        field2291 = null;
        field2295 = null;
        field2300 = null;
        field2288 = null;
        field2290 = null;
        field2299 = null;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lcf;)V")
    public class128(class111 arg0) {
        this.field2285 = arg0;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2295[var1] = var0 / 4;
        }
        field2297 = 0;
        field2299 = class245.method1649("tremblement:", -110);
        field2296 = 0;
        field2300 = class245.method1649("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 126);
    }
}
