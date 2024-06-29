import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class12 extends class14 {

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "[I")
    private int[] field260 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "I")
    public int field272 = -1;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "Z")
    public boolean field258 = false;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "Lea;")
    private static class38 field263 = class9.method46((byte) 113, "Too many connections from your address)3");

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "Lea;")
    public static class38 field253 = field263;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "Lea;")
    public static class38 field270 = class9.method46((byte) 113, "(U");

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "Lea;")
    public static class38 field266 = class9.method46((byte) 105, "au");

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "Lea;")
    private static class38 field271 = class9.method46((byte) 116, "Type");

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "Lea;")
    public static class38 field256 = field271;

    @OriginalMember(owner = "client!bb", name = "kb", descriptor = "Lea;")
    public static class38 field278 = class9.method46((byte) 102, "null");

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "Lea;")
    public static class38 field274 = class9.method46((byte) 123, "hitmarks");

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "B")
    public static byte field261;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!bb", name = "jb", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "Lef;")
    public static class43 field267;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "[I")
    private int[] field259;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "[S")
    private short[] field252;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "[S")
    private short[] field264;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "[S")
    private short[] field269;

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "[S")
    private short[] field273;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
    public static final void method61(byte arg0) {
        field265++;
        if (arg0 < 99) {
            field266 = null;
        }
        class191.field3789.method1083(3056);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lhc;B)V")
    public final void method62(class66 arg0, byte arg1) {
        field257++;
        if (arg1 > -41) {
            return;
        }
        while (true) {
            int var3 = arg0.method509(127);
            if (var3 == 0) {
                return;
            }
            this.method64(4224, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(Z)V")
    public static void method63(boolean arg0) {
        field267 = null;
        field274 = null;
        field270 = null;
        field256 = null;
        field253 = null;
        field271 = null;
        field263 = null;
        if (!arg0) {
            field256 = null;
        }
        field266 = null;
        field278 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILhc;I)V")
    private final void method64(int arg0, class66 arg1, int arg2) {
        if (arg2 == 1) {
            this.field272 = arg1.method509(arg0 - 4099);
        } else if (arg2 == 2) {
            int var8 = arg1.method509(122);
            this.field259 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field259[var9] = arg1.method511(-128);
            }
        } else if (arg2 == 3) {
            this.field258 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method509(121);
            this.field264 = new short[var6];
            this.field269 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field264[var7] = (short) arg1.method511(44);
                this.field269[var7] = (short) arg1.method511(arg0 - 4350);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method509(arg0 - 4104);
            this.field252 = new short[var4];
            this.field273 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field252[var5] = (short) arg1.method511(-121);
                this.field273[var5] = (short) arg1.method511(7);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field260[arg2 - 60] = arg1.method511(arg0 - 4344);
        }
        if (arg0 == 4224) {
            field251++;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILdd;IIZZI)V")
    public static final void method65(int arg0, class32 arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        class105.field2350 = arg3;
        class36.field764 = arg0;
        class52.field1340 = arg6;
        field255++;
        class92.field2083 = arg4;
        class8.field189 = arg2;
        class45.field1104 = 1;
        if (!arg5) {
            field270 = null;
        }
        class196.field3860 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)Z")
    public final boolean method66(byte arg0) {
        field275++;
        if (arg0 != 4) {
            this.field259 = null;
        }
        if (this.field259 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field259.length; var3++) {
            if (!class99.field2194.method199(-9350, this.field259[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)Lja;")
    public final class81 method67(int arg0) {
        field254++;
        if (this.field259 == null) {
            return null;
        }
        class81[] var2 = new class81[this.field259.length];
        for (int var3 = arg0; var3 < this.field259.length; var3++) {
            var2[var3] = class81.method692(class99.field2194, this.field259[var3], 0);
        }
        class81 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class81(var2, var2.length);
        }
        if (this.field264 != null) {
            for (int var5 = 0; var5 < this.field264.length; var5++) {
                var4.method698(this.field264[var5], this.field269[var5]);
            }
        }
        if (this.field252 != null) {
            for (int var6 = 0; var6 < this.field252.length; var6++) {
                var4.method688(this.field252[var6], this.field273[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)Lja;")
    public final class81 method68(byte arg0) {
        class81[] var2 = new class81[5];
        field268++;
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field260[var4] != -1) {
                var2[var3++] = class81.method692(class99.field2194, this.field260[var4], 0);
            }
        }
        class81 var5 = new class81(var2, var3);
        if (this.field264 != null) {
            for (int var6 = 0; var6 < this.field264.length; var6++) {
                var5.method698(this.field264[var6], this.field269[var6]);
            }
        }
        if (this.field252 != null) {
            for (int var7 = 0; var7 < this.field252.length; var7++) {
                var5.method688(this.field252[var7], this.field273[var7]);
            }
        }
        int var8 = 95 % ((arg0 + 37) / 59);
        return var5;
    }

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)Z")
    public final boolean method69(int arg0) {
        boolean var2 = true;
        field277++;
        if (arg0 != -6) {
            field276 = -104;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field260[var3] != -1 && !class99.field2194.method199(-9350, this.field260[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ldd;Ldd;Lhd;ILdd;)Z")
    public static final boolean method70(class32 arg0, class32 arg1, class67 arg2, int arg3, class32 arg4) {
        class52.field1336 = arg2;
        class125.field2690 = arg4;
        if (arg3 != 7201) {
            method61((byte) -44);
        }
        class123.field2626 = arg1;
        field262++;
        class152.field3150 = arg0;
        return true;
    }
}
