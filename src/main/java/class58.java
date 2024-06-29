import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class58 extends class513 {

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public int field896 = 0;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public static int field904 = 0;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "[Lbca;")
    public static class612[] field895 = new class612[14];

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public int field899;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "Lfga;")
    public class232 field919;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "Lpp;")
    public class360 field906;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "Lpp;")
    public class360 field914;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "Lep;")
    public class387 field902;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "Lep;")
    public class387 field908;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "Luca;")
    public class476 field913;

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "Luca;")
    public class476 field918;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "Lkfa;")
    public class557 field916;

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "Lrda;")
    public class613 field921;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "Z")
    public boolean field909;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "Z")
    public boolean field912;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "Z")
    public boolean field922;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "[I")
    public int[] field901;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 13)
    public static void method587(int arg0) {
        field895 = null;
        if (arg0 != -31720) {
            field904 = 77;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V", line = 33)
    public final void method588(int arg0) {
        field917++;
        int var2 = this.field924;
        boolean var3 = this.field912;
        if (this.field919 != null) {
            class232 var4 = this.field919.method1412(94, class410.field5804);
            if (var4 == null) {
                this.field899 = 256;
                this.field910 = 0;
                this.field925 = 0;
                this.field922 = false;
                this.field900 = 0;
                this.field898 = 0;
                this.field901 = null;
                this.field924 = -1;
                this.field912 = false;
                this.field907 = 256;
            } else {
                this.field898 = var4.field3101;
                this.field922 = var4.field3062;
                this.field912 = var4.field3091;
                this.field899 = var4.field3083;
                this.field910 = var4.field3079 << 9;
                this.field925 = var4.field3034;
                this.field901 = var4.field3078;
                this.field907 = var4.field3099;
                this.field924 = var4.field3110;
                this.field900 = var4.field3089;
            }
        } else if (this.field916 != null) {
            int var5 = class520.method3085((byte) -104, this.field916);
            if (var2 != var5) {
                this.field924 = var5;
                class323 var6 = this.field916.field8052;
                if (var6.field4315 != null) {
                    var6 = var6.method1881(class410.field5804, (byte) 125);
                }
                if (var6 == null) {
                    this.field900 = this.field910 = 0;
                    this.field912 = this.field916.field8052.field4277;
                    this.field899 = 256;
                    this.field907 = 256;
                } else {
                    this.field899 = var6.field4262;
                    this.field900 = var6.field4270;
                    this.field910 = var6.field4251 << 9;
                    this.field907 = var6.field4327;
                    this.field912 = var6.field4277;
                }
            }
        } else if (this.field921 != null) {
            this.field924 = class608.method3488(73, this.field921);
            this.field900 = this.field921.field8825;
            this.field912 = this.field921.field8797;
            this.field910 = this.field921.field8788 << 9;
            this.field907 = 256;
            this.field899 = 256;
        }
        if (arg0 <= 70) {
            method587(-125);
        }
        if (this.field924 == var2 && this.field912 == var3) {
            return;
        }
        if (this.field906 == null) {
            return;
        }
        class399.field5624.method1805(this.field906);
        this.field918 = null;
        this.field902 = null;
        this.field906 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLdc;)V", line = 158)
    public static final void method589(byte arg0, class5 arg1) {
        field911++;
        int var2 = 0;
        arg1.method26(8);
        int var3 = 0;
        if (arg0 != 101) {
            method587(-64);
        }
        while (class394.field5564 > var3) {
            int var15 = class82.field1176[var3];
            if ((class506.field7240[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class506.field7240[var15] = (byte) class242.method1474(class506.field7240[var15], 2);
                } else {
                    int var16 = arg1.method25(1, 255);
                    if (var16 == 0) {
                        var2 = class418.method2512(-119, arg1);
                        class506.field7240[var15] = (byte) class242.method1474(class506.field7240[var15], 2);
                    } else {
                        class71.method632(var15, true, arg1);
                    }
                }
            }
            var3++;
        }
        arg1.method32((byte) -123);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method26(8);
        for (int var4 = 0; var4 < class394.field5564; var4++) {
            int var13 = class82.field1176[var4];
            if ((class506.field7240[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class506.field7240[var13] = (byte) class242.method1474(class506.field7240[var13], 2);
                } else {
                    int var14 = arg1.method25(1, 255);
                    if (var14 == 0) {
                        var2 = class418.method2512(arg0 ^ 0xFFFFFFDC, arg1);
                        class506.field7240[var13] = (byte) class242.method1474(class506.field7240[var13], 2);
                    } else {
                        class71.method632(var13, true, arg1);
                    }
                }
            }
        }
        arg1.method32((byte) -128);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method26(arg0 - 93);
        for (int var5 = 0; var5 < class565.field8241; var5++) {
            int var11 = class419.field5947[var5];
            if ((class506.field7240[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class506.field7240[var11] = (byte) class242.method1474(class506.field7240[var11], 2);
                } else {
                    int var12 = arg1.method25(1, 255);
                    if (var12 == 0) {
                        var2 = class418.method2512(arg0 - 177, arg1);
                        class506.field7240[var11] = (byte) class242.method1474(class506.field7240[var11], 2);
                    } else if (class19.method332(var11, arg1, (byte) -42)) {
                        class506.field7240[var11] = (byte) class242.method1474(class506.field7240[var11], 2);
                    }
                }
            }
        }
        arg1.method32((byte) -123);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method26(8);
        for (int var6 = 0; var6 < class565.field8241; var6++) {
            int var9 = class419.field5947[var6];
            if ((class506.field7240[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class506.field7240[var9] = (byte) class242.method1474(class506.field7240[var9], 2);
                } else {
                    int var10 = arg1.method25(1, 255);
                    if (var10 == 0) {
                        var2 = class418.method2512(arg0 ^ 0xFFFFFFD1, arg1);
                        class506.field7240[var9] = (byte) class242.method1474(class506.field7240[var9], 2);
                    } else if (class19.method332(var9, arg1, (byte) -111)) {
                        class506.field7240[var9] = (byte) class242.method1474(class506.field7240[var9], 2);
                    }
                }
            }
        }
        arg1.method32((byte) -124);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class565.field8241 = 0;
        class394.field5564 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class506.field7240[var7] = (byte) (class506.field7240[var7] >> 1);
            class613 var8 = class184.field2252[var7];
            if (var8 == null) {
                class419.field5947[class565.field8241++] = var7;
            } else {
                class82.field1176[class394.field5564++] = var7;
            }
        }
    }
}
