import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class105 extends class37 {

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    private int field2337 = 4096;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
    private int field2342 = 0;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "I")
    public static int field2343 = 0;

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
    public static int field2345 = 0;

    @OriginalMember(owner = "client!kg", name = "bb", descriptor = "I")
    public static int field2349 = -1;

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "[I")
    public static int[] field2347 = new int[32];

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "[I")
    public static int[] field2344 = new int[2000];

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "Lq;")
    public static class152 field2339 = new class152(0, 0);

    @OriginalMember(owner = "client!kg", name = "db", descriptor = "Ldd;")
    public static class35 field2351 = class180.method1196((byte) 126, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!kg", name = "cb", descriptor = "Ldd;")
    private static class35 field2350 = class180.method1196((byte) -46, "Service unavailable)3");

    @OriginalMember(owner = "client!kg", name = "eb", descriptor = "Ldd;")
    public static class35 field2352 = field2350;

    @OriginalMember(owner = "client!kg", name = "fb", descriptor = "Lld;")
    public static class111 field2353 = new class111(30);

    @OriginalMember(owner = "client!kg", name = "gb", descriptor = "[I")
    public static int[] field2354 = new int[128];

    @OriginalMember(owner = "client!kg", name = "hb", descriptor = "[I")
    public static int[] field2355 = new int[256];

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!kg", name = "Y", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class105() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)V")
    public static void method780(int arg0) {
        field2344 = null;
        field2347 = null;
        field2352 = null;
        field2355 = null;
        field2339 = null;
        field2350 = null;
        field2353 = null;
        field2354 = null;
        if (arg0 != -1) {
            field2343 = 4;
        }
        field2351 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        ++field2340;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field2337 = arg2.method256((byte) -78);
            }
        } else {
            this.field2342 = arg2.method256((byte) -78);
        }
        if (arg1 != 1) {
            field2347 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(B)V")
    public static final void method781(byte arg0) {
        class154.field3173 = true;
        if (arg0 <= -109) {
            class35.field781 = true;
            ++field2346;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field2341;
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (super.field816.field3661) {
            int[] var4 = this.method369(0, arg1, (byte) 125);
            for (int var5 = 0; class72.field1719 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field2342 && ~var6 >= ~this.field2337 ? 4096 : 0;
            }
        }
        return arg0 != 75 ? null : var3;
    }
}
