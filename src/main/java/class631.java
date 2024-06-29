import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class631 {

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    private int field8903 = 0;

    @OriginalMember(owner = "client!raa", name = "s", descriptor = "I")
    private int field8921 = -1;

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "Lga;")
    private class420 field8906 = new class420();

    @OriginalMember(owner = "client!raa", name = "u", descriptor = "Z")
    public boolean field8923 = false;

    @OriginalMember(owner = "client!raa", name = "t", descriptor = "I")
    private int field8922;

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "I")
    private int field8920;

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "[Ldk;")
    private class534[] field8908;

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "[[I")
    private int[][] field8911;

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "Z")
    public static boolean field8917 = false;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
    public static int field8904;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    public static int field8905;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
    public static int field8907;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "I")
    public static int field8913;

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "Lcb;")
    public static class544 field8919;

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "[Leia;")
    public static class251[] field8916;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V", line = 3)
    public static void method3600(byte arg0) {
        field8919 = null;
        if (arg0 != 26) {
            method3607(-43);
        }
        field8916 = null;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZI)[I", line = 15)
    public final int[] method3601(boolean arg0, int arg1) {
        field8912++;
        if (!arg0) {
            field8916 = null;
        }
        if (this.field8922 == this.field8920) {
            this.field8923 = this.field8908[arg1] == null;
            this.field8908[arg1] = class617.field8699;
            return this.field8911[arg1];
        } else if (this.field8920 == 1) {
            this.field8923 = this.field8921 != arg1;
            this.field8921 = arg1;
            return this.field8911[0];
        } else {
            class534 var3 = this.field8908[arg1];
            if (var3 == null) {
                this.field8923 = true;
                if (this.field8920 <= this.field8903) {
                    class534 var4 = (class534) this.field8906.method2509(false);
                    var3 = new class534(arg1, var4.field7541);
                    this.field8908[var4.field7538] = null;
                    var4.method3117((byte) 57);
                } else {
                    var3 = new class534(arg1, this.field8903);
                    this.field8903++;
                }
                this.field8908[arg1] = var3;
            } else {
                this.field8923 = false;
            }
            this.field8906.method2506(var3, (byte) -117);
            return this.field8911[var3.field7541];
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V", line = 82)
    public final void method3602(int arg0) {
        field8914++;
        int var2 = -124 % ((-arg0 - 70) / 56);
        for (int var3 = 0; var3 < this.field8920; var3++) {
            this.field8911[var3] = null;
        }
        this.field8908 = null;
        this.field8911 = null;
        this.field8906.method2503(10);
        this.field8906 = null;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIIIIII)V", line = 108)
    public static final void method3603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 110 % ((arg4 + 4) / 58);
        if (arg3 != 8 && arg3 != 16) {
            class379 var8 = class378.field5427[arg5][arg2][arg0];
            if (var8 == null) {
                var8 = new class379(arg5);
            }
            if (arg3 == 1) {
                var8.field5434 = (short) arg6;
                var8.field5436 = (short) arg1;
            } else if (arg3 == 2) {
                var8.field5445 = (short) arg1;
                var8.field5435 = (short) arg6;
            }
            if (class663.field9303) {
                class424.method2528(true);
            }
        } else if (arg3 == 8) {
            int var9 = arg2 << class310.field4616;
            int var10 = var9 + class13.field254;
            int var11 = arg0 << class310.field4616;
            int var12 = var11 + class13.field254;
            int var13 = class750.field10395[arg5].method1976(arg2, -1, arg0);
            int var14 = class750.field10395[arg5].method1976(arg2 + 1, -1, arg0 + 1);
            class359.field5221[class445.field6329++] = new class302(arg3, arg5, var9, var10, var10, var9, var13, var14, var14 - arg1, var13 - arg1, var11, var12, var12, var11);
        } else {
            int var15 = (arg2 << class310.field4616) + class13.field254;
            int var16 = var15 - class13.field254;
            int var17 = arg0 << class310.field4616;
            int var18 = class13.field254 + var17;
            int var19 = class750.field10395[arg5].method1976(arg2 + 1, -1, arg0);
            int var20 = class750.field10395[arg5].method1976(arg2, -1, arg0 + 1);
            class359.field5221[class445.field6329++] = new class302(arg3, arg5, var15, var16, var16, var15, var19, var20, var20 - arg1, -arg1 + var19, var17, var18, var18, var17);
        }
        field8910++;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Loga;Lha;BIILor;ILip;I)V", line = 178)
    public static final void method3604(class497 arg0, class66 arg1, byte arg2, int arg3, int arg4, class665 arg5, int arg6, class734 arg7, int arg8) {
        field8915++;
        int var9 = arg8 - arg6 / 2 - 5;
        int var10 = arg4 + 2;
        if (arg5.field9376 != 0) {
            arg1.method488(var10, var9, arg5.field9376, arg4 + (arg3 * arg7.method4104()) - (var10 + -1), 1, arg6 + 10);
        }
        if (arg5.field9357 != 0) {
            arg1.method467(var10, arg6 + 10, (byte) 116, arg4 + arg7.method4104() * arg3 + 1 - var10, arg5.field9357, var9);
        }
        int var11 = arg5.field9341;
        if (arg0.field7065 && arg5.field9368 != -1) {
            var11 = arg5.field9368;
        }
        int var12 = 0;
        int var13 = 124 / (-arg2 / 42);
        while (var12 < arg3) {
            String var14 = class744.field10362[var12];
            if (var12 < (arg3 - 1)) {
                var14 = var14.substring(0, var14.length() - 4);
            }
            arg7.method4109(arg1, var14, arg8, arg4, var11, true);
            arg4 += arg7.method4104();
            var12++;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(CILjava/lang/String;)I", line = 223)
    public static final int method3605(char arg0, int arg1, String arg2) {
        field8909++;
        int var3 = 0;
        if (arg1 != 1) {
            return -60;
        }
        int var4 = arg2.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0 == arg2.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)[[I", line = 259)
    public final int[][] method3606(boolean arg0) {
        field8907++;
        if (this.field8922 != this.field8920) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (!arg0) {
            this.field8903 = -22;
        }
        for (int var2 = 0; var2 < this.field8920; var2++) {
            this.field8908[var2] = class617.field8699;
        }
        return this.field8911;
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(III)V", line = 335)
    public class631(int arg0, int arg1, int arg2) {
        this.field8922 = arg1;
        this.field8920 = arg0;
        this.field8908 = new class534[this.field8922];
        this.field8911 = new int[this.field8920][arg2];
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)V", line = 287)
    public static final void method3607(int arg0) {
        field8905++;
        int var1 = class145.field1852.field8994.method2826((byte) -69);
        if (var1 == 0) {
            class278.field3871 = null;
            class701.method3974(0, (byte) -92);
        } else if (var1 == 1) {
            class767.method4231((byte) -100, (byte) 0);
            class701.method3974(512, (byte) -92);
            if (class617.field8700 != null) {
                class3.method20(true);
            }
        } else {
            class767.method4231((byte) -61, (byte) (class327.field4890 - 4 & 0xFF));
            class701.method3974(2, (byte) -92);
        }
        class778.field10728 = class410.field5771;
        if (arg0 != 512) {
            method3600((byte) -57);
        }
    }
}
