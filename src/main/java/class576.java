import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class576 {

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    private int field8365 = -1;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "Z")
    public boolean field8368 = true;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    private int field8358;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    private int field8362;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "Lev;")
    private class645 field8363;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Lcf;")
    private class562 field8357;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    private int field8366;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    private int field8364;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lor;")
    private class595 field8361;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public int field8373;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Lhi;")
    private class190 field8359;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "Lhga;")
    public static class158 field8367 = new class158();

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field8369;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field8371;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field8374;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field8375;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "Lq;")
    public static class396 field8372;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public static final void method3303(int arg0) {
        field8360++;
        class569.method3286(class527.field7429.field2660, arg0 - 27386, 2, 22050);
        class317.field4663 = new class3();
        class317.field4663.method191(false, arg0, 128);
        class428.field6169 = method3306(0, 22050, (byte) 37, class604.field8775, class699.field9853);
        class428.field6169.method918(class317.field4663, true);
        class693.method3881(class317.field4663, class324.field4757, true, class35.field1027, class444.field6395);
        class589.field8482 = method3306(1, 2048, (byte) 37, class604.field8775, class699.field9853);
        class50.field1184 = new class322();
        class589.field8482.method918(class50.field1184, true);
        class39.field1063 = new class600(22050, class195.field3068);
        class628.field9057 = class46.field1128.method2228("scape main", 5781);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
    private final void method3304(byte arg0) {
        field8371++;
        if (!this.field8368) {
            return;
        }
        this.field8368 = false;
        byte[] var2 = this.field8363.field9298;
        int var3 = 0;
        if (arg0 >= -68) {
            this.method3305(false, null, -75);
        }
        int var4 = this.field8363.field9290;
        int var5 = this.field8363.field9290 * this.field8362 + this.field8358;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field8359 != null && this.field8365 == var3) {
            this.field8368 = false;
            return;
        }
        this.field8365 = var3;
        int var7 = this.field8362 * var4 + this.field8358;
        int var8 = 0;
        if (!this.field8357.method2848(class2.field372, class410.field5938, (byte) 95)) {
            if (class19.field836 == null) {
                class19.field836 = new int[16384];
            }
            int[] var13 = class19.field836;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var7] == 0) {
                        int var16 = 0;
                        if (var2[var7 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var4 + var7] != 0) {
                            var16++;
                        }
                        var13[var8++] = var16 * 17 << 24;
                    } else {
                        var13[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field8363.field9290 - 128;
            }
            if (this.field8359 == null) {
                this.field8359 = this.field8357.method3270(128, class19.field836, (byte) 50, false, 128);
                this.field8359.method465(false, 13321, false);
            } else {
                this.field8359.method464(0, (byte) 115, 0, class19.field836, 128, 128, 0, 128);
            }
            return;
        }
        if (class126.field2307 == null) {
            class126.field2307 = new byte[16384];
        }
        byte[] var9 = class126.field2307;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var7] == 0) {
                    int var12 = 0;
                    if (var2[var7 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var4 + var7] != 0) {
                        var12++;
                    }
                    var9[var8++] = (byte) (var12 * 17);
                } else {
                    var9[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field8363.field9290 - 128;
        }
        if (this.field8359 == null) {
            this.field8359 = this.field8357.method3259(128, class126.field2307, 128, false, class410.field5938, 0);
            this.field8359.method465(false, 13321, false);
        } else {
            this.field8359.method470(class410.field5938, 0, 0, 128, 128, 0, class126.field2307, false, 128);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZLor;I)V")
    public final void method3305(boolean arg0, class595 arg1, int arg2) {
        if (arg0) {
            return;
        }
        field8375++;
        if (arg2 > 0) {
            this.method3304((byte) -114);
            this.field8357.method3266(-2, this.field8359);
            this.field8357.method2872(class634.field9107, this.field8366, -62, this.field8364 + 1 - this.field8366, 0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIBLn;Ljava/awt/Component;)Lri;")
    public static final class97 method3306(int arg0, int arg1, byte arg2, class17 arg3, Component arg4) {
        field8374++;
        if (class195.field3068 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class97 var5 = (class97) Class.forName("se").getDeclaredConstructor().newInstance();
                var5.field1738 = arg1;
                var5.field1716 = new int[(class238.field3527 ? 2 : 1) * 256];
                var5.method920(arg4);
                var5.field1736 = (arg1 & 0xFFFFFC00) + 1024;
                if (arg2 != 37) {
                    return null;
                }
                if (var5.field1736 > 16384) {
                    var5.field1736 = 16384;
                }
                var5.method921(var5.field1736);
                if (class347.field5166 > 0 && class332.field4839 == null) {
                    class332.field4839 = new class528();
                    class332.field4839.field7439 = arg3;
                    arg3.method400(class347.field5166, class332.field4839, false);
                }
                if (class332.field4839 != null) {
                    if (class332.field4839.field7438[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class332.field4839.field7438[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class212 var6 = new class212(arg3, arg0);
                    var6.field1738 = arg1;
                    var6.field1716 = new int[(class238.field3527 ? 2 : 1) * 256];
                    var6.method920(arg4);
                    var6.field1736 = 16384;
                    var6.method921(var6.field1736);
                    if (class347.field5166 > 0 && class332.field4839 == null) {
                        class332.field4839 = new class528();
                        class332.field4839.field7439 = arg3;
                        arg3.method400(class347.field5166, class332.field4839, false);
                    }
                    if (class332.field4839 != null) {
                        if (class332.field4839.field7438[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class332.field4839.field7438[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class97();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V")
    public static void method3307(byte arg0) {
        if (arg0 > 51) {
            field8372 = null;
            field8367 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
    public final void method3308(int arg0) {
        this.method3305(false, this.field8361, this.field8373);
        field8370++;
        if (arg0 != 256) {
            field8372 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lcf;Lev;Ltr;IIIII)V")
    public class576(class562 arg0, class645 arg1, class268 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field8358 = arg6;
        this.field8362 = arg7;
        this.field8363 = arg1;
        this.field8357 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field1041 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field3970[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field8359 = null;
            this.field8373 = 0;
        } else {
            this.field8366 = Integer.MAX_VALUE;
            this.field8364 = Integer.MIN_VALUE;
            this.field8361 = this.field8357.method2876(false, 3);
            this.field8361.method380(var10, (byte) -17);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field8361.method1188(false, true);
                if (var15 != null) {
                    Stream var16 = this.field8357.method3219(var15, 1009);
                    if (Stream.method3580()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field1041 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field3970[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 < this.field8366) {
                                            this.field8366 = var22;
                                        }
                                        if (this.field8364 < var22) {
                                            this.field8364 = var22;
                                        }
                                        var16.method3575(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field1041 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field3970[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 > this.field8364) {
                                            this.field8364 = var28;
                                        }
                                        if (this.field8366 > var28) {
                                            this.field8366 = var28;
                                        }
                                        var16.method3583(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3576();
                    if (this.field8361.method1185(true)) {
                        break;
                    }
                }
            }
            this.field8373 = var10 / 3;
        }
    }
}
