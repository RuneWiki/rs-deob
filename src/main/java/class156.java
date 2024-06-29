import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class156 extends class59 {

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "I")
    private int field2986 = -1;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "Lsd;")
    private static class166 field2984 = class135.method935("You can(Wt add yourself to your own ignore list)3", 0);

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "Lsd;")
    public static class166 field2982 = field2984;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2983 = new CRC32();

    @OriginalMember(owner = "client!rc", name = "fb", descriptor = "Lk;")
    public static class90 field2989 = new class90(5000);

    @OriginalMember(owner = "client!rc", name = "ob", descriptor = "Lsd;")
    public static class166 field2998 = class135.method935("da dieser Computer gegen unsere ", 0);

    @OriginalMember(owner = "client!rc", name = "ib", descriptor = "Lsd;")
    private static class166 field2992 = class135.method935("Please wait 5 minutes before trying again)3", 0);

    @OriginalMember(owner = "client!rc", name = "kb", descriptor = "Lsd;")
    public static class166 field2994 = class135.method935("(Z", 0);

    @OriginalMember(owner = "client!rc", name = "mb", descriptor = "Lsd;")
    public static class166 field2996 = field2992;

    @OriginalMember(owner = "client!rc", name = "jb", descriptor = "[Z")
    public static boolean[] field2993 = new boolean[100];

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
    public int field2980;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!rc", name = "eb", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!rc", name = "gb", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "Lvd;")
    public static class193 field2979;

    @OriginalMember(owner = "client!rc", name = "nb", descriptor = "Laa;")
    public static class2 field2997;

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "[I")
    public int[] field2985;

    @OriginalMember(owner = "client!rc", name = "lb", descriptor = "[Ldb;")
    public static class31[] field2995;

    @OriginalMember(owner = "client!rc", name = "hb", descriptor = "[[I")
    public static int[][] field2991;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z")
    public static final boolean method1043(int arg0, int arg1) {
        ++field2977;
        if (~arg0 > -33) {
            return false;
        } else {
            if (arg1 <= 34) {
                field2997 = null;
            }
            if (arg0 == 127) {
                return false;
            } else {
                return ~arg0 > -130 || arg0 > 159;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field2986 = arg0.method405(2);
        }
        ++field2976;
        if (arg1 < 18) {
            method1044(103);
        }
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
    public static void method1044(int arg0) {
        field2996 = null;
        field2995 = null;
        field2998 = null;
        field2992 = null;
        field2979 = null;
        field2993 = null;
        field2984 = null;
        field2997 = null;
        field2991 = null;
        field2994 = null;
        field2982 = null;
        field2989 = null;
        field2983 = null;
        if (arg0 != 4080) {
            field2994 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)[[I")
    public int[][] method37(boolean arg0, int arg1) {
        if (!arg0) {
            field2984 = null;
        }
        ++field2981;
        int[][] var3 = super.field1207.method528(52, arg1);
        if (super.field1207.field1320 && this.method1046((byte) -90)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field2980 * (class171.field3285 != this.field2978 ? this.field2978 * arg1 / class171.field3285 : arg1);
            if (~class98.field1879 == ~this.field2980) {
                for (int var8 = 0; ~var8 > ~class98.field1879; ++var8) {
                    int var9 = this.field2985[var7++];
                    var6[var8] = class22.method151(4080, var9 << 4);
                    var5[var8] = class22.method151(var9 >> 4, 4080);
                    var4[var8] = class22.method151(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; var10 < class98.field1879; ++var10) {
                    int var11 = this.field2980 * var10 / class98.field1879;
                    int var12 = this.field2985[var7 + var11];
                    var6[var10] = class22.method151(var12, 255) << 4;
                    var5[var10] = class22.method151(var12 >> 4, 4080);
                    var4[var10] = class22.method151(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class156() {
        super(0, false);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)I")
    public static final int method1045(int arg0, int arg1, int arg2, int arg3) {
        ++field2988;
        if (arg3 != 4096) {
            field2995 = null;
        }
        return (-arg0 + 4096) * arg2 + arg0 * arg1 >> 12;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)Z")
    public final boolean method1046(byte arg0) {
        ++field2987;
        if (this.field2985 != null) {
            return true;
        } else {
            int var2 = 7 % ((14 - arg0) / 42);
            if (~this.field2986 <= -1) {
                class158 var3 = class114.method831(class132.field2588, this.field2986, (byte) 52);
                var3.method1061();
                this.field2980 = var3.field3012;
                this.field2985 = var3.field3014;
                this.field2978 = var3.field3016;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)I")
    public final int method501(byte arg0) {
        ++field2990;
        if (arg0 != 78) {
            field2983 = null;
        }
        return this.field2986;
    }
}
