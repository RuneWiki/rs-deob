import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class70 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    private int field804 = 0;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    private int field811 = -1;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Lbh;")
    private class234 field810 = new class234();

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Z")
    public boolean field820 = false;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    private int field816;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    private int field812;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "[Ljj;")
    private class26[] field803;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "[[I")
    private int[][] field818;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "[J")
    public static long[] field809 = new long[256];

    @OriginalMember(owner = "client!l", name = "q", descriptor = "S")
    public static short field819 = 32767;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Ljava/lang/String;")
    public static String field822;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public final void method421(int arg0) {
        for (int var2 = 0; var2 < this.field812; var2++) {
            this.field818[var2] = null;
        }
        field805++;
        this.field818 = null;
        this.field803 = null;
        this.field810.method1528(false);
        this.field810 = null;
        int var3 = -122 % ((61 - arg0) / 61);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()V")
    public static final void method422() {
        class161.field2318 = 0;
        label191: for (int var0 = 0; var0 < class193.field2775; var0++) {
            class232 var1 = class181.field2577[var0];
            if (class195.field2779 != null) {
                for (int var2 = 0; var2 < class195.field2779.length; var2++) {
                    if (class195.field2779[var2] != -1000000 && (var1.field3339 <= class195.field2779[var2] || var1.field3356 <= class195.field2779[var2]) && (var1.field3344 <= class129.field1855[var2] || var1.field3354 <= class129.field1855[var2]) && (var1.field3344 >= class193.field2767[var2] || var1.field3354 >= class193.field2767[var2]) && (var1.field3342 <= class80.field948[var2] || var1.field3347 <= class80.field948[var2]) && (var1.field3342 >= class237.field3413[var2] || var1.field3347 >= class237.field3413[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field3350 == 1) {
                int var3 = var1.field3345 + class46.field547 - class139.field2025;
                if (var3 >= 0 && var3 <= class46.field547 + class46.field547) {
                    int var4 = var1.field3338 + class46.field547 - class178.field2538;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3352 + class46.field547 - class178.field2538;
                    if (var5 > class46.field547 + class46.field547) {
                        var5 = class46.field547 + class46.field547;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class252.field3642[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class77.field927 - var1.field3344;
                        if (var7 > 32) {
                            var1.field3349 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3349 = 2;
                            var7 = -var7;
                        }
                        var1.field3341 = (var1.field3342 - class296.field4671 << 8) / var7;
                        var1.field3340 = (var1.field3347 - class296.field4671 << 8) / var7;
                        var1.field3351 = (var1.field3339 - class130.field1878 << 8) / var7;
                        var1.field3353 = (var1.field3356 - class130.field1878 << 8) / var7;
                        class53.field617[class161.field2318++] = var1;
                    }
                }
            } else if (var1.field3350 == 2) {
                int var8 = var1.field3338 + class46.field547 - class178.field2538;
                if (var8 >= 0 && var8 <= class46.field547 + class46.field547) {
                    int var9 = var1.field3345 + class46.field547 - class139.field2025;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3343 + class46.field547 - class139.field2025;
                    if (var10 > class46.field547 + class46.field547) {
                        var10 = class46.field547 + class46.field547;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class252.field3642[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class296.field4671 - var1.field3342;
                        if (var12 > 32) {
                            var1.field3349 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3349 = 4;
                            var12 = -var12;
                        }
                        var1.field3348 = (var1.field3344 - class77.field927 << 8) / var12;
                        var1.field3355 = (var1.field3354 - class77.field927 << 8) / var12;
                        var1.field3351 = (var1.field3339 - class130.field1878 << 8) / var12;
                        var1.field3353 = (var1.field3356 - class130.field1878 << 8) / var12;
                        class53.field617[class161.field2318++] = var1;
                    }
                }
            } else if (var1.field3350 == 4) {
                int var13 = var1.field3339 - class130.field1878;
                if (var13 > 128) {
                    int var14 = var1.field3338 + class46.field547 - class178.field2538;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3352 + class46.field547 - class178.field2538;
                    if (var15 > class46.field547 + class46.field547) {
                        var15 = class46.field547 + class46.field547;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3345 + class46.field547 - class139.field2025;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3343 + class46.field547 - class139.field2025;
                        if (var17 > class46.field547 + class46.field547) {
                            var17 = class46.field547 + class46.field547;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class252.field3642[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3349 = 5;
                            var1.field3348 = (var1.field3344 - class77.field927 << 8) / var13;
                            var1.field3355 = (var1.field3354 - class77.field927 << 8) / var13;
                            var1.field3341 = (var1.field3342 - class296.field4671 << 8) / var13;
                            var1.field3340 = (var1.field3347 - class296.field4671 << 8) / var13;
                            class53.field617[class161.field2318++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Lfk;")
    public static final class50 method423(int arg0, int arg1, int arg2) {
        class133 var3 = class6.field94[arg0][arg1][arg2];
        return var3 == null || var3.field1917 == null ? null : var3.field1917;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)[[I")
    public final int[][] method424(int arg0) {
        field817++;
        if (this.field816 != this.field812) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field812; var2++) {
            this.field803[var2] = class277.field4207;
        }
        if (arg0 != 13793) {
            this.field811 = -61;
        }
        return this.field818;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)[I")
    public final int[] method425(boolean arg0, int arg1) {
        if (!arg0) {
            this.field820 = false;
        }
        field814++;
        if (this.field816 == this.field812) {
            this.field820 = this.field803[arg1] == null;
            this.field803[arg1] = class277.field4207;
            return this.field818[arg1];
        } else if (this.field812 == 1) {
            this.field820 = this.field811 != arg1;
            this.field811 = arg1;
            return this.field818[0];
        } else {
            class26 var3 = this.field803[arg1];
            if (var3 == null) {
                this.field820 = true;
                if (this.field804 >= this.field812) {
                    class26 var4 = (class26) this.field810.method1531(-696136762);
                    var3 = new class26(arg1, var4.field298);
                    this.field803[var4.field297] = null;
                    var4.method1935(106);
                } else {
                    var3 = new class26(arg1, this.field804);
                    this.field804++;
                }
                this.field803[arg1] = var3;
            } else {
                this.field820 = false;
            }
            this.field810.method1527(var3, 73);
            return this.field818[var3.field298];
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
    public static void method426(int arg0) {
        field822 = null;
        field809 = null;
        if (arg0 != 2) {
            method422();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZZIII)V")
    public static final void method427(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field808++;
        if (arg0 > -91) {
            method427(-121, 80, true, true, 91, -126, 49);
        }
        if (arg1 == 3) {
            method427(-96, class118.field1666, true, true, -1, arg5, -1);
            return;
        }
        Container var7;
        if (class48.field553 != null) {
            var7 = class48.field553;
        } else if (class202.field2858 == null) {
            var7 = class115.field1592.field664;
        } else {
            var7 = class202.field2858;
        }
        class98.field1311 = var7.getSize().width;
        class35.field404 = var7.getSize().height;
        if (class202.field2858 == var7) {
            Insets var8 = class202.field2858.getInsets();
            class98.field1311 -= var8.right + var8.left;
            class35.field404 -= var8.top + var8.bottom;
        }
        if (arg1 >= 2) {
            client.field4437 = class35.field404;
            class45.field539 = 0;
            class84.field1166 = class98.field1311;
            class30.field369 = 0;
        } else {
            class30.field369 = (class98.field1311 - 765) / 2;
            class45.field539 = 0;
            client.field4437 = 503;
            class84.field1166 = 765;
        }
        if (arg2) {
            class59.method365(-116, class181.field2574);
            class68.method417(0, class181.field2574);
            if (class296.field4673 != null) {
                class296.field4673.method982(class181.field2574, false);
            }
            class210.field2953.method1642((byte) -123);
            class182.method1185(125, class181.field2574);
            method428(0, class181.field2574);
            if (class296.field4673 != null) {
                class296.field4673.method986(true, class181.field2574);
            }
        } else {
            class181.field2574.setSize(class84.field1166, client.field4437);
            if (class202.field2858 == var7) {
                Insets var9 = class202.field2858.getInsets();
                class181.field2574.setLocation(var9.left + class30.field369, class45.field539 + var9.top);
            } else {
                class181.field2574.setLocation(class30.field369, class45.field539);
            }
        }
        if (arg1 > 0) {
            method427(-114, 0, true, true, -1, arg5, -1);
            return;
        }
        class221.field3132 = !class176.method1141(1);
        if (class123.field1776 != -1) {
            class268.method1717((byte) 8, true);
        }
        if (class117.field1637 != null && (class141.field2034 == 30 || class141.field2034 == 25)) {
            class48.method295(false);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class129.field1862[var10] = true;
        }
        class26.field315 = true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method428(int arg0, Component arg1) {
        field815++;
        if (arg0 == 0) {
            arg1.addMouseListener(class75.field899);
            arg1.addMouseMotionListener(class75.field899);
            arg1.addFocusListener(class75.field899);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static final void method429(byte arg0) {
        class157.field2267++;
        field813++;
        if (arg0 == -99) {
            class94.field1259.method592(216, false);
            class94.field1259.method1387(class7.field97, 4);
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(III)V")
    public class70(int arg0, int arg1, int arg2) {
        this.field816 = arg1;
        this.field812 = arg0;
        this.field803 = new class26[this.field816];
        this.field818 = new int[this.field812][arg2];
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field809[var0] = var1;
        }
        field822 = "Loading...";
    }
}
