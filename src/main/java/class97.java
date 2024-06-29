import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class97 {

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "[[I")
    public static int[][] field2167 = new int[5][5000];

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field2169 = 20;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field2174 = 0;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "J")
    public long field2172;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "Lkh;")
    public class97 field2168;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "Lkh;")
    public class97 field2175;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
    public final void method805(boolean arg0) {
        field2166++;
        if (this.field2175 == null) {
            return;
        }
        this.field2175.field2168 = this.field2168;
        this.field2168.field2175 = this.field2175;
        if (arg0) {
            method810(-9);
        }
        this.field2175 = null;
        this.field2168 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)Z")
    public final boolean method806(int arg0) {
        field2176++;
        if (this.field2175 == null) {
            return false;
        } else {
            if (arg0 != 105) {
                method808(-27, -51, -128, -32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILqa;I)V")
    public static final void method807(int arg0, int arg1, class144 arg2, int arg3) {
        if (arg3 != 0) {
            field2174 = 19;
        }
        if (arg2.field395 == arg1 && arg1 != -1) {
            int var4 = class139.method997(-54, arg1).field2918;
            if (var4 == 1) {
                arg2.field399 = 0;
                arg2.field429 = arg0;
                arg2.field420 = 0;
                arg2.field417 = 0;
            }
            if (var4 == 2) {
                arg2.field399 = 0;
            }
        } else if (arg1 == -1 || arg2.field395 == -1 || class139.method997(arg3 ^ 0xFFFFFFFA, arg1).field2920 >= class139.method997(-48, arg2.field395).field2920) {
            arg2.field420 = 0;
            arg2.field380 = arg2.field385;
            arg2.field417 = 0;
            arg2.field429 = arg0;
            arg2.field395 = arg1;
            arg2.field399 = 0;
        }
        field2171++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)I")
    public static final int method808(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field2173++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            if (arg1 != 104) {
                field2167 = null;
            }
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(Z)V")
    public static final void method809(boolean arg0) {
        class10.field232 = new int[4][105][105];
        class180.field3628 = new int[104];
        class190.field3761 = new int[104];
        class32.field652 = new byte[4][104][104];
        if (!arg0) {
            method807(-62, 36, null, 38);
        }
        class162.field3371 = new byte[4][105][105];
        class196.field3852 = new byte[4][104][104];
        class92.field2079 = new int[104];
        class111.field2491 = 99;
        class124.field2670 = new byte[4][104][104];
        class67.field1695 = new byte[4][104][104];
        field2164++;
        class134.field2819 = new int[104];
        class160.field3344 = new int[105][105];
        class25.field511 = new int[104];
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
    public static void method810(int arg0) {
        if (arg0 != -23867) {
            field2174 = 15;
        }
        field2167 = null;
    }
}
