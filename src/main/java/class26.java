import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class26 extends class106 {

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "Z")
    public boolean field501 = false;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
    public int field507 = -1;

    @OriginalMember(owner = "client!ce", name = "hb", descriptor = "[I")
    private int[] field516 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    public static int field497 = 0;

    @OriginalMember(owner = "client!ce", name = "cb", descriptor = "Lgf;")
    public static class61 field511 = null;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field493 = 2;

    @OriginalMember(owner = "client!ce", name = "fb", descriptor = "Leh;")
    public static class47 field514 = class195.method1282((byte) -4, "(U");

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
    public static int field510 = 0;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "Leh;")
    private static class47 field506 = class195.method1282((byte) -4, " ");

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "Leh;")
    public static class47 field492 = field506;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!ce", name = "gb", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!ce", name = "db", descriptor = "Lah;")
    public static class9 field512;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "[I")
    private int[] field495;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "[I")
    public static int[] field500;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "[S")
    private short[] field496;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "[S")
    private short[] field499;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "[S")
    private short[] field508;

    @OriginalMember(owner = "client!ce", name = "eb", descriptor = "[S")
    private short[] field513;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method238(byte arg0) {
        field511 = null;
        field492 = null;
        field506 = null;
        field500 = null;
        field512 = null;
        field514 = null;
        if (arg0 > -120) {
            field506 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)Llc;")
    public final class102 method239(int arg0) {
        field498++;
        class102[] var2 = new class102[5];
        if (arg0 >= -91) {
            this.method243((byte) 35);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field516[var4] != -1) {
                var2[var3++] = class102.method841(class60.field1160, this.field516[var4], 0);
            }
        }
        class102 var5 = new class102(var2, var3);
        if (this.field513 != null) {
            for (int var6 = 0; var6 < this.field513.length; var6++) {
                var5.method826(this.field513[var6], this.field496[var6]);
            }
        }
        if (this.field508 != null) {
            for (int var7 = 0; var7 < this.field508.length; var7++) {
                var5.method829(this.field508[var7], this.field499[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III[S[Leh;)V")
    public static final void method240(int arg0, int arg1, int arg2, short[] arg3, class47[] arg4) {
        if (arg0 >= -63) {
            method240(-30, -33, -29, null, null);
        }
        if (arg1 < arg2) {
            int var5 = arg1;
            int var6 = (arg1 + arg2) / 2;
            class47 var7 = arg4[var6];
            arg4[var6] = arg4[arg2];
            arg4[arg2] = var7;
            short var8 = arg3[var6];
            arg3[var6] = arg3[arg2];
            arg3[arg2] = var8;
            for (int var9 = arg1; var9 < arg2; var9++) {
                if (var7 == null || arg4[var9] != null && arg4[var9].method396(var7, -83) < (var9 & 0x1)) {
                    class47 var10 = arg4[var9];
                    arg4[var9] = arg4[var5];
                    arg4[var5] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var5];
                    arg3[var5++] = var11;
                }
            }
            arg4[arg2] = arg4[var5];
            arg4[var5] = var7;
            arg3[arg2] = arg3[var5];
            arg3[var5] = var8;
            method240(-89, arg1, var5 - 1, arg3, arg4);
            method240(-76, var5 + 1, arg2, arg3, arg4);
        }
        field504++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BILhd;)V")
    private final void method241(byte arg0, int arg1, class68 arg2) {
        field505++;
        if (arg1 == 1) {
            this.field507 = arg2.method604((byte) 32);
        } else if (arg1 == 2) {
            int var4 = arg2.method604((byte) -128);
            this.field495 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field495[var5] = arg2.method569(26496);
            }
        } else if (arg1 == 3) {
            this.field501 = true;
        } else if (arg1 == 40) {
            int var8 = arg2.method604((byte) -48);
            this.field496 = new short[var8];
            this.field513 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field513[var9] = (short) arg2.method569(26496);
                this.field496[var9] = (short) arg2.method569(26496);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method604((byte) -125);
            this.field499 = new short[var6];
            this.field508 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field508[var7] = (short) arg2.method569(26496);
                this.field499[var7] = (short) arg2.method569(26496);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field516[arg1 - 60] = arg2.method569(26496);
        }
        int var10 = 102 / ((-arg0 - 28) / 41);
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)Z")
    public final boolean method242(int arg0) {
        field494++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field516[var3] != -1 && !class60.field1160.method60((byte) 113, 0, this.field516[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Z")
    public final boolean method243(byte arg0) {
        field509++;
        if (this.field495 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 < 56) {
            this.field513 = null;
        }
        for (int var3 = 0; var3 < this.field495.length; var3++) {
            if (!class60.field1160.method60((byte) -99, 0, this.field495[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IJ)V")
    public static final void method244(int arg0, long arg1) {
        if (arg0 != 202) {
            method240(-32, 54, 111, null, null);
        }
        field503++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class77.field1679; var3++) {
            if (class31.field593[var3] == arg1) {
                class109.field2255++;
                class77.field1679--;
                for (int var4 = var3; var4 < class77.field1679; var4++) {
                    class43.field864[var4] = class43.field864[var4 + 1];
                    class132.field2608[var4] = class132.field2608[var4 + 1];
                    class31.field593[var4] = class31.field593[var4 + 1];
                    class190.field3680[var4] = class190.field3680[var4 + 1];
                }
                class36.field713 = class103.field2162;
                class60.field1174.method657(arg0 ^ 0x6EDC, 202);
                class60.field1174.method600(32601, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)Llc;")
    public final class102 method245(int arg0) {
        field502++;
        if (this.field495 == null) {
            return null;
        }
        class102[] var2 = new class102[this.field495.length];
        for (int var3 = arg0; var3 < this.field495.length; var3++) {
            var2[var3] = class102.method841(class60.field1160, this.field495[var3], 0);
        }
        class102 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class102(var2, var2.length);
        }
        if (this.field513 != null) {
            for (int var5 = 0; var5 < this.field513.length; var5++) {
                var4.method826(this.field513[var5], this.field496[var5]);
            }
        }
        if (this.field508 != null) {
            for (int var6 = 0; var6 < this.field508.length; var6++) {
                var4.method829(this.field508[var6], this.field499[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lhd;B)V")
    public final void method246(class68 arg0, byte arg1) {
        if (arg1 != -25) {
            return;
        }
        while (true) {
            int var3 = arg0.method604((byte) -1);
            if (var3 == 0) {
                field515++;
                return;
            }
            this.method241((byte) -108, var3, arg0);
        }
    }
}
