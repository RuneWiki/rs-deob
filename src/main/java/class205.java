import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class205 {

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "[I")
    private int[] field4029;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "[I")
    private int[] field4038;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lha;")
    private class64 field4026;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Lha;")
    private class64 field4036;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "[Lha;")
    private class64[] field4039;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "[[B")
    public static byte[][] field4028 = new byte[1000][];

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field4031 = 127;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Ldh;")
    public static class36 field4032 = new class36(512);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Lob;")
    public static class127 field4041;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Z")
    public static boolean field4033;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)V")
    public static final void method1335(byte arg0, int arg1) {
        field4030++;
        if (arg0 != -21) {
            method1336(null, null, -111);
        }
        class191 var2 = (class191) class204.field4021.method260((long) arg1, (byte) 28);
        if (var2 != null) {
            var2.method1018(arg0 ^ 0xFFFFC246);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lkh;Lkh;I)I")
    public static final int method1336(class97 arg0, class97 arg1, int arg2) {
        field4035++;
        int var3 = 0;
        if (arg2 != -56) {
            return 16;
        }
        if (arg1.method657((byte) 66, class105.field2280, class61.field1414)) {
            var3++;
        }
        if (arg0.method657((byte) 66, class105.field2280, class119.field2449)) {
            var3++;
        }
        if (arg0.method657((byte) 66, class105.field2280, class2.field18)) {
            var3++;
        }
        if (arg0.method657((byte) 66, class105.field2280, class107.field2295)) {
            var3++;
        }
        if (arg0.method657((byte) 66, class105.field2280, class157.field3138)) {
            var3++;
        }
        if (arg0.method657((byte) 66, class105.field2280, class97.field2077)) {
            var3++;
        }
        arg0.method657((byte) 66, class105.field2280, class12.field274);
        arg0.method657((byte) 66, class105.field2280, class134.field2787);
        arg0.method657((byte) 66, class105.field2280, class184.field3611);
        arg0.method657((byte) 66, class105.field2280, class55.field1296);
        arg0.method657((byte) 66, class105.field2280, class29.field632);
        return var3;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method1337(int arg0) {
        field4028 = null;
        field4041 = null;
        if (arg0 == -4783) {
            field4032 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lhh;IIZIFLkh;)[I")
    public final int[] method1338(class71 arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5, class97 arg6) {
        class168.field3360 = arg6;
        class159.field3185 = arg0;
        field4040++;
        int[] var8 = new int[arg1 * arg4];
        class203.method1331(arg1, 204245836, arg4);
        for (int var9 = 0; var9 < this.field4039.length; var9++) {
            this.field4039[var9].method483(arg1, arg4, 58);
        }
        byte var10;
        int var11;
        int var12;
        if (arg3) {
            var10 = -1;
            var11 = arg4 - 1;
            var12 = -1;
        } else {
            var10 = 1;
            var11 = 0;
            var12 = arg4;
        }
        int var13 = 0;
        for (int var14 = 0; var14 < arg1; var14++) {
            int[] var17;
            int[] var18;
            int[] var19;
            if (this.field4026.field1510) {
                int[] var16 = this.field4026.method35(var14, arg2 - 9420);
                var17 = var16;
                var18 = var16;
                var19 = var16;
            } else {
                int[][] var20 = this.field4026.method36(var14, true);
                var17 = var20[0];
                var18 = var20[1];
                var19 = var20[2];
            }
            for (int var21 = var11; var21 != var12; var21 += var10) {
                int var22 = var17[var21] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var18[var21] >> 4;
                int var24 = var19[var21] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                var8[var13++] = class140.method894((var22 << 16) + var24 + (var23 << 8), arg5);
            }
        }
        for (int var15 = 0; var15 < this.field4039.length; var15++) {
            this.field4039[var15].method481(-96);
        }
        if (arg2 != -1) {
            this.field4038 = null;
        }
        return var8;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(JI)V")
    public static final void method1339(long arg0, int arg1) {
        field4034++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class82.field1780; var3++) {
            if (class17.field364[var3] == arg0) {
                class82.field1780--;
                for (int var4 = var3; var4 < class82.field1780; var4++) {
                    class5.field95[var4] = class5.field95[var4 + 1];
                    class74.field1680[var4] = class74.field1680[var4 + 1];
                    class17.field364[var4] = class17.field364[var4 + 1];
                    class65.field1544[var4] = class65.field1544[var4 + 1];
                }
                class31.field659++;
                class1.field7 = class13.field296;
                class159.field3190.method631(32, -1);
                class159.field3190.method1199(arg0, -1898826808);
                break;
            }
        }
        if (arg1 != 30370) {
            method1339(-99L, 47);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static final void method1340(byte arg0) {
        if (arg0 >= -97) {
            field4033 = false;
        }
        class81.field1766.method997(false);
        class19.field402.method997(false);
        field4037++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lkh;BLhh;)Z")
    public final boolean method1341(class97 arg0, byte arg1, class71 arg2) {
        field4027++;
        for (int var4 = 0; var4 < this.field4029.length; var4++) {
            if (!arg0.method638(-127, this.field4029[var4])) {
                return false;
            }
        }
        int var5 = 0;
        if (arg1 < 3) {
            method1340((byte) 36);
        }
        while (var5 < this.field4038.length) {
            if (!arg2.method91(this.field4038[var5], -18525)) {
                return false;
            }
            var5++;
        }
        return true;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class205() {
        this.field4029 = new int[0];
        this.field4038 = new int[0];
        this.field4026 = new class34();
        this.field4036 = new class34();
        this.field4039 = new class64[] { this.field4026, this.field4036 };
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lva;)V")
    public class205(class189 arg0) {
        int var2 = arg0.method1202(-109);
        class36 var3 = new class36(64);
        class36 var4 = new class36(64);
        int[][] var5 = new int[var2][];
        class36 var6 = new class36(64);
        this.field4039 = new class64[var2];
        for (int var7 = 0; var7 < var2; var7++) {
            class64 var21 = class158.method972(arg0, -1);
            int var22 = var21.method380(-1);
            int var23 = var21.method41(-1);
            if (var22 >= 0 && var22 >= 0 && var4.method260((long) var22, (byte) 28) == null) {
                var4.method262((long) var22, -128, new class56(var22));
            }
            if (var23 >= 0 && var23 >= 0 && var6.method260((long) var23, (byte) 28) == null) {
                var6.method262((long) var23, -108, new class56(var23));
            }
            int var26 = var21.field1520.length;
            var5[var7] = new int[var26];
            for (int var27 = 0; var27 < var26; var27++) {
                var5[var7][var27] = arg0.method1202(117);
            }
            var3.method262((long) var21.field1531, -95, var21);
            this.field4039[var7] = var21;
        }
        for (int var8 = 0; var8 < var2; var8++) {
            class64 var17 = this.field4039[var8];
            int var18 = var17.field1520.length;
            for (int var19 = 0; var19 < var18; var19++) {
                class64 var20 = (class64) var3.method260((long) var5[var8][var19], (byte) 28);
                var17.field1520[var19] = var20;
            }
            var5[var8] = null;
        }
        Object var9 = null;
        this.field4026 = (class64) var3.method260((long) arg0.method1202(104), (byte) 28);
        this.field4036 = (class64) var3.method260((long) arg0.method1202(124), (byte) 28);
        this.field4029 = new int[var4.method253((byte) -116)];
        Object var10 = null;
        this.field4038 = new int[var6.method253((byte) -86)];
        class166[] var11 = new class166[var4.method253((byte) -99)];
        class166[] var12 = new class166[var6.method253((byte) -41)];
        var4.method256(var11, true);
        var6.method256(var12, true);
        Object var13 = null;
        for (int var14 = 0; var14 < var11.length; var14++) {
            this.field4029[var14] = ((class56) var11[var14]).field1311;
        }
        for (int var15 = 0; var15 < var12.length; var15++) {
            this.field4038[var15] = ((class56) var12[var15]).field1311;
        }
        Object var16 = null;
    }
}
