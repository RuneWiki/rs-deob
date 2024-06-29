import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class258 extends class182 {

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    private int field4340;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "Z")
    public static boolean field4339 = false;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "Lbb;")
    public static class49 field4343 = new class49();

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field4344 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "[[B")
    public static byte[][] field4345;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public static final void method1845(byte arg0) {
        if (class95.field1543 != null) {
            class95.field1543.method1718(-1407);
        }
        if (class272.field4546 != null) {
            class272.field4546.method1718(-1407);
        }
        class144.method1063(2, class186.field2977, (byte) 125, 22050);
        int var1 = 83 / ((arg0 - -41) / 49);
        class95.field1543 = class30.method192(class5.field125, class142.field2344, 0, -98, 22050);
        ++field4338;
        class95.field1543.method1712(106, class121.field2029);
        class272.field4546 = class30.method192(class5.field125, class142.field2344, 1, -105, 2048);
        class272.field4546.method1712(101, class278.field4627);
    }

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "(I)V")
    public static void method1846(int arg0) {
        field4343 = null;
        field4344 = null;
        field4345 = null;
        if (arg0 != 36) {
            method1847(72, -21);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        if (arg0) {
            method1845((byte) -4);
        }
        ++field4334;
        int[] var3 = super.field2911.method77(arg1, -91);
        if (super.field2911.field287) {
            class75.method535(var3, 0, class4.field116, this.field4340);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)Lbk;")
    public static final class84 method1847(int arg0, int arg1) {
        ++field4342;
        if (arg0 >= -113) {
            return null;
        } else {
            class84 var2 = (class84) class260.field4375.method99((long) arg1, true);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class78.field1319.method1149(class65.method453(arg1, false), (byte) 97, class70.method483((byte) 109, arg1));
                class84 var4 = new class84();
                var4.field1406 = arg1;
                if (var3 != null) {
                    var4.method589(new class249(var3), 124);
                }
                class260.field4375.method100((long) arg1, var4, 86);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)I")
    public static final int method1848(int arg0, boolean arg1) {
        ++field4341;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        if (!arg1) {
            field4344 = null;
        }
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg0 & ~var7;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILaj;Laj;)V")
    public static final void method1849(int arg0, class151 arg1, class151 arg2) {
        class108.field1768 = arg2;
        class15.field306 = arg1;
        class108.field1768.method1132(16777215, arg0);
        ++field4335;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (~arg2 == -1) {
            this.field4340 = (arg1.method1802((byte) 121) << 12) / 255;
        }
        ++field4337;
        if (arg0) {
            this.method155(false, (class249) null, -23);
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class258() {
        this(4096);
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I)V")
    public class258(int arg0) {
        super(0, true);
        this.field4340 = 4096;
        this.field4340 = arg0;
    }
}
