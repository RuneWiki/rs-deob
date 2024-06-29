import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class215 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    private int field3934 = 0;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    private int field3941 = -1;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lfl;")
    private class191 field3936 = new class191();

    @OriginalMember(owner = "client!t", name = "u", descriptor = "Z")
    public boolean field3954 = false;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    private int field3944;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    private int field3935;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "[Lbg;")
    private class171[] field3945;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "[[[I")
    private int[][][] field3947;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lli;")
    public static class185 field3937 = class245.method1649("http:)4)4", 127);

    @OriginalMember(owner = "client!t", name = "m", descriptor = "[I")
    public static int[] field3946 = new int[256];

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Lli;")
    public static class185 field3950;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Z")
    public static boolean field3953;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "Lli;")
    public static class185 field3956;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "Lpg;")
    public static class169 field3955;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "Lhi;")
    public static class250 field3949;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method1510(byte arg0) {
        field3940++;
        if (this.field3944 != this.field3935) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 <= 73) {
            method1512(-13, (short) 59);
        }
        for (int var2 = 0; var2 < this.field3944; var2++) {
            this.field3945[var2] = class87.field1707;
        }
        return this.field3947;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static void method1511(int arg0) {
        field3949 = null;
        field3955 = null;
        int var1 = -61 % ((arg0 - 70) / 44);
        field3946 = null;
        field3950 = null;
        field3956 = null;
        field3937 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IS)Z")
    public static final boolean method1512(int arg0, short arg1) {
        field3939++;
        if (arg1 == 36 || arg1 == 43 || arg1 == 58 || arg1 == 31 || arg1 == 50 || arg1 == 9 || arg1 == 37 || arg1 == 24) {
            return true;
        } else if (arg1 == 22 || arg1 == 26 || arg1 == 1001 || arg1 == 1004) {
            return true;
        } else if (arg0 != -42) {
            return false;
        } else if (arg1 == 51 || arg1 == 33 || arg1 == 11 || arg1 == 44 || arg1 == 2) {
            return true;
        } else {
            return arg1 == 6 || arg1 == 45 || arg1 == 48 || arg1 == 30 || arg1 == 41 || arg1 == 10;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public final void method1513(int arg0) {
        if (arg0 != 1) {
            this.method1513(-14);
        }
        for (int var2 = 0; var2 < this.field3944; var2++) {
            this.field3947[var2][0] = null;
            this.field3947[var2][1] = null;
            this.field3947[var2][2] = null;
            this.field3947[var2] = null;
        }
        this.field3945 = null;
        this.field3947 = null;
        field3943++;
        this.field3936.method1383((byte) 120);
        this.field3936 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)[[I")
    public final int[][] method1514(int arg0, int arg1) {
        field3938++;
        if (arg0 != -2) {
            field3953 = true;
        }
        if (this.field3944 == this.field3935) {
            this.field3954 = this.field3945[arg1] == null;
            this.field3945[arg1] = class87.field1707;
            return this.field3947[arg1];
        } else if (this.field3944 == 1) {
            this.field3954 = this.field3941 != arg1;
            this.field3941 = arg1;
            return this.field3947[0];
        } else {
            class171 var3 = this.field3945[arg1];
            if (var3 == null) {
                this.field3954 = true;
                if (this.field3934 >= this.field3944) {
                    class171 var4 = (class171) this.field3936.method1374(arg0 + 258);
                    var3 = new class171(arg1, var4.field3159);
                    this.field3945[var4.field3152] = null;
                    var4.method476(95);
                } else {
                    var3 = new class171(arg1, this.field3934);
                    this.field3934++;
                }
                this.field3945[arg1] = var3;
            } else {
                this.field3954 = false;
            }
            this.field3936.method1378(var3, false);
            return this.field3947[var3.field3159];
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(III)V")
    public class215(int arg0, int arg1, int arg2) {
        this.field3944 = arg0;
        this.field3935 = arg1;
        this.field3945 = new class171[this.field3935];
        this.field3947 = new int[this.field3944][3][arg2];
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3946[var0] = var1;
        }
        field3950 = class245.method1649("clignotant3:", 126);
        field3951 = 3;
        field3953 = false;
        field3956 = class245.method1649("0(U", 122);
    }
}
