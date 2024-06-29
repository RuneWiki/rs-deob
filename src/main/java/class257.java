import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class257 extends class68 {

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    private int field3928;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public static int field3926 = 0;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "J")
    public static long field3925 = 0L;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "Z")
    public static boolean field3927 = false;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "Ljava/lang/String;")
    public static String field3924 = "Close";

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field3925 = -23L;
        }
        ++field3933;
        if (~arg1 == -1) {
            this.field3928 = (arg0.method1453((byte) -128) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIB)V")
    public static final void method1714(int arg0, int arg1, byte arg2) {
        ++field3923;
        class216 var3 = class71.method442(8, arg0);
        int var4 = var3.field3262;
        int var5 = var3.field3254;
        int var6 = var3.field3253;
        int var7 = class75.field1052[var6 - var5];
        if (~arg1 > -1 || ~arg1 < ~var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        if (arg2 >= -36) {
            field3925 = -115L;
        }
        class281.method1879(var4, (byte) 98, ~var8 & class120.field1688[var4] | var8 & arg1 << var5);
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class257() {
        this(4096);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        if (arg1 >= -118) {
            field3927 = false;
        }
        ++field3931;
        int[] var3 = super.field917.method1920(arg0, true);
        if (super.field917.field4474) {
            class115.method779(var3, 0, class89.field1248, this.field3928);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public static final void method1715(int arg0, int arg1, String arg2, String arg3) {
        class176.field2478 = arg2;
        class222.field3331 = arg1;
        ++field3929;
        class296.field4666 = arg3;
        if (!class176.field2478.equals("") && !class296.field4666.equals("")) {
            if (~class13.field130 != 0) {
                class132.method899(6266);
            } else {
                class240.field3666 = 1;
                class274.field4241 = -3;
                class226.field3430 = 0;
                class217.field3275 = 0;
                class224 var4 = new class224(128);
                var4.method1447(10, 17363472);
                var4.method1435(-120, (int) (9.9999999E7D * Math.random()));
                var4.method1451(class73.method465((byte) -126, class176.field2478), (byte) -24);
                var4.method1435(-115, (int) (Math.random() * 9.9999999E7D));
                var4.method1472((byte) 67, class296.field4666);
                var4.method1435(-120, (int) (9.9999999E7D * Math.random()));
                if (arg0 >= -107) {
                    field3924 = null;
                }
                var4.method1485((byte) 62, class33.field500, class277.field4290);
                class281.field4359.field3402 = 0;
                class281.field4359.method1447(24, 17363472);
                class281.field4359.method1447(2 - -var4.field3402, 17363472);
                class281.field4359.method1470(393660232, 535);
                class281.field4359.method1452(var4.field3336, 0, var4.field3402, 128);
            }
        } else {
            class274.field4241 = 3;
        }
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)V")
    public static void method1716(int arg0) {
        if (arg0 > -12) {
            method1716(21);
        }
        field3924 = null;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V")
    public class257(int arg0) {
        super(0, true);
        this.field3928 = 4096;
        this.field3928 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)I")
    public static final int method1717(int arg0, int arg1) {
        ++field3930;
        int var2 = 99 / ((24 - arg1) / 56);
        return ~arg0 == -16711936 ? -1 : class132.method897(arg0, 123);
    }
}
