import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class185 extends class205 implements class40 {

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    private int field2961 = 50;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "Z")
    private boolean field2975 = false;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "Ljj;")
    private class134 field2954;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "Ljj;")
    private class134 field2958;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "Lui;")
    private class239 field2966;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "Lui;")
    private class239 field2974;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static volatile int field2964 = 0;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "Z")
    public static boolean field2970 = true;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "Z")
    public static boolean field2968 = true;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "Leg;")
    public static class272 field2959 = new class272(64);

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2977 = "white:";

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "Ljj;")
    public static class134 field2965;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(II)V")
    public final void method1263(int arg0, int arg1) {
        field2957++;
        class118 var3 = (class118) this.field2966.method1581((byte) -127);
        if (arg1 < 86) {
            field2970 = true;
        }
        while (var3 != null) {
            if (var3.field1999) {
                var3.method838(arg0);
                var3.field1999 = false;
            }
            var3 = (class118) this.field2966.method1580((byte) 106);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)Z")
    public final boolean method308(byte arg0, int arg1) {
        int var3 = 125 % ((11 - arg0) / 54);
        field2976++;
        return !this.method1378(arg1, 3139).field1883;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(II)I")
    public final int method310(int arg0, int arg1) {
        if (arg0 != 64) {
            field2959 = null;
        }
        field2971++;
        return this.method1378(arg1, arg0 + 3075).field1887 & 0xFFFF;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZFI)Lwe;")
    public final class43 method313(int arg0, int arg1, boolean arg2, float arg3, int arg4) {
        if (arg4 != 2985) {
            this.field2961 = -109;
        }
        class118 var6 = this.method1268(arg0, (byte) -115);
        field2962++;
        if (var6 != null && var6.method837(this, this.field2958)) {
            return arg2 ? var6.field2005.method1974(arg1, this.field2958, this, (double) arg3, (byte) -73, false, arg1) : var6.field2005.method1978((double) arg3, arg1, this, arg1, false, (byte) -90, this.field2958);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BZ)V")
    public final void method1264(byte arg0, boolean arg1) {
        this.field2975 = arg1;
        field2963++;
        if (arg0 != 55) {
            field2968 = true;
        }
        this.method1265(255);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public final void method1265(int arg0) {
        field2973++;
        if (arg0 != 255) {
            this.field2974 = null;
        }
        this.field2966.method1577(arg0 - 255);
        if (this.field2974 != null) {
            this.field2974.method1577(0);
        }
        class118.field1998 = null;
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(II)Ldj;")
    public final class296 method1266(int arg0, int arg1) {
        if (arg1 == 4611) {
            field2978++;
            class118 var3 = this.method1268(arg0, (byte) 75);
            return var3 == null ? null : var3.field2005;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Ljj;Ljj;Ljj;IZ)V")
    public class185(class134 arg0, class134 arg1, class134 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field2954 = arg0;
        this.field2975 = arg4;
        this.field2958 = arg2;
        this.field2961 = arg3;
        this.field2966 = new class239(this.field2961);
        this.field2974 = null;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(BI)Z")
    public final boolean method312(byte arg0, int arg1) {
        if (arg0 > -20) {
            method1267(96);
        }
        field2956++;
        return this.method1378(arg1, 3139).field1888;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
    public static final void method1267(int arg0) {
        if (arg0 < 111) {
            method1269(true);
        }
        for (class128 var1 = (class128) class294.field4656.method465((byte) -123); var1 != null; var1 = (class128) class294.field4656.method461((byte) -13)) {
            int var2 = var1.field2135;
            if (class280.method1870(127, var2)) {
                class103[] var3 = class133.field2204[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field1603;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field962;
                    class103 var7 = class168.method1180(8931, var6);
                    if (var7 != null) {
                        class45.method346((byte) 75, var7);
                    }
                }
            }
        }
        field2960++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)Lkl;")
    private final class118 method1268(int arg0, byte arg1) {
        field2967++;
        class118 var3 = (class118) this.field2966.method1579((long) arg0, 0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2954.method940((byte) 84, 0, arg0);
        int var5 = -123 % ((arg1 + 15) / 47);
        if (var4 == null) {
            return null;
        } else {
            class118 var6 = new class118(new class264(var4));
            this.field2966.method1578(var6, (long) arg0, 50);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(FBI)[I")
    public final int[] method311(float arg0, byte arg1, int arg2) {
        int var4 = 90 / ((-arg1 - 1) / 38);
        field2972++;
        class118 var5 = this.method1268(arg2, (byte) -125);
        if (var5 == null) {
            return null;
        } else {
            var5.field1999 = true;
            return var5.method836(this, this.field2958, arg0, this.field2975 || this.method1378(arg2, 3139).field1886);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public static void method1269(boolean arg0) {
        field2977 = null;
        field2965 = null;
        field2959 = null;
        if (arg0) {
            method1267(-11);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)Z")
    public final boolean method309(int arg0, int arg1) {
        if (arg1 != -6410) {
            this.method1263(-30, 127);
        }
        field2969++;
        return this.field2975 || this.method1378(arg0, arg1 ^ 0xFFFFEAB5).field1886;
    }
}
