import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class141 extends class191 {

    @OriginalMember(owner = "client!og", name = "H", descriptor = "Z")
    public boolean field2971 = false;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "[I")
    private int[] field2980 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public int field2976 = -1;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "I")
    public static int field2989 = 0;

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "Lld;")
    public static class111 field2988 = new class111(50);

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "I")
    public static int field2992 = 0;

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "Ldd;")
    public static class35 field2991 = class180.method1196((byte) -88, "null");

    @OriginalMember(owner = "client!og", name = "G", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!og", name = "db", descriptor = "Lme;")
    public static class121 field2993;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "[I")
    private int[] field2972;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "[S")
    private short[] field2974;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "[S")
    private short[] field2978;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "[S")
    private short[] field2984;

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "[S")
    private short[] field2990;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BLce;I)V")
    private final void method973(byte arg0, class26 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2976 = arg1.method221(-96);
        } else if (arg2 == 2) {
            int var8 = arg1.method221(-76);
            this.field2972 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2972[var9] = arg1.method256((byte) -78);
            }
        } else if (arg2 == 3) {
            this.field2971 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method221(-123);
            this.field2974 = new short[var6];
            this.field2978 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2974[var7] = (short) arg1.method256((byte) -78);
                this.field2978[var7] = (short) arg1.method256((byte) -78);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method221(-98);
            this.field2990 = new short[var4];
            this.field2984 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2990[var5] = (short) arg1.method256((byte) -78);
                this.field2984[var5] = (short) arg1.method256((byte) -78);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field2980[arg2 - 60] = arg1.method256((byte) -78);
        }
        field2973++;
        int var10 = 113 / ((arg0 - 5) / 42);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)Z")
    public final boolean method974(boolean arg0) {
        field2970++;
        if (this.field2972 == null) {
            return true;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field2972.length; var3++) {
            if (!class204.field4056.method43(this.field2972[var3], 0, 49)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(B)Lbe;")
    public final class16 method975(byte arg0) {
        class16[] var2 = new class16[5];
        field2979++;
        int var3 = 0;
        if (arg0 != 32) {
            this.method975((byte) 67);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2980[var4] != -1) {
                var2[var3++] = class16.method136(class204.field4056, this.field2980[var4], 0);
            }
        }
        class16 var5 = new class16(var2, var3);
        if (this.field2974 != null) {
            for (int var6 = 0; var6 < this.field2974.length; var6++) {
                var5.method144(this.field2974[var6], this.field2978[var6]);
            }
        }
        if (this.field2990 != null) {
            for (int var7 = 0; var7 < this.field2990.length; var7++) {
                var5.method134(this.field2990[var7], this.field2984[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BLce;)V")
    public final void method976(byte arg0, class26 arg1) {
        if (arg0 < 79) {
            this.method975((byte) 36);
        }
        field2986++;
        while (true) {
            int var3 = arg1.method221(-91);
            if (var3 == 0) {
                return;
            }
            this.method973((byte) 94, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(B)Z")
    public final boolean method977(byte arg0) {
        if (arg0 > -81) {
            this.method975((byte) 15);
        }
        field2975++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2980[var3] != -1 && !class204.field4056.method43(this.field2980[var3], 0, 8)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(B)V")
    public static void method978(byte arg0) {
        field2988 = null;
        field2991 = null;
        if (arg0 == -71) {
            field2993 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)Lbe;")
    public final class16 method979(int arg0) {
        field2982++;
        if (this.field2972 == null) {
            return null;
        }
        class16[] var2 = new class16[this.field2972.length];
        for (int var3 = arg0; var3 < this.field2972.length; var3++) {
            var2[var3] = class16.method136(class204.field4056, this.field2972[var3], 0);
        }
        class16 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class16(var2, var2.length);
        }
        if (this.field2974 != null) {
            for (int var5 = 0; var5 < this.field2974.length; var5++) {
                var4.method144(this.field2974[var5], this.field2978[var5]);
            }
        }
        if (this.field2990 != null) {
            for (int var6 = 0; var6 < this.field2990.length; var6++) {
                var4.method134(this.field2990[var6], this.field2984[var6]);
            }
        }
        return var4;
    }
}
