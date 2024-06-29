import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class36 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    private int field511 = -1;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    private int field534 = 0;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "Lid;")
    private class226 field515 = new class226();

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "Z")
    public boolean field536 = false;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "[[I")
    private int[][] field522;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "[Lfb;")
    private class265[] field527;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "[Leg;")
    public static class37[] field523 = new class37[100];

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public static volatile int field532 = 0;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "Leg;")
    private static class37 field526 = class174.method1167("Members object", 111);

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Leg;")
    public static class37 field512 = class174.method1167("T", 98);

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field530 = 0;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Z")
    public static boolean field517 = true;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "[I")
    public static int[] field524 = new int[100];

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "Leg;")
    public static class37 field531 = field526;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Leg;")
    public static class37 field516 = class174.method1167("Weiter", -110);

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Leg;")
    public static class37 field518 = class174.method1167(" loggt sich aus)3", -55);

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Z")
    public static boolean field519 = false;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public static int field535 = 1;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "Lsc;")
    public static class131 field529;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)[I")
    public final int[] method206(int arg0, int arg1) {
        if (arg1 != 10232) {
            return null;
        }
        field521++;
        if (this.field528 == this.field513) {
            this.field536 = this.field527[arg0] == null;
            this.field527[arg0] = class22.field281;
            return this.field522[arg0];
        } else if (this.field528 == 1) {
            this.field536 = this.field511 != arg0;
            this.field511 = arg0;
            return this.field522[0];
        } else {
            class265 var3 = this.field527[arg0];
            if (var3 == null) {
                this.field536 = true;
                if (this.field534 >= this.field528) {
                    class265 var4 = (class265) this.field515.method1572((byte) 123);
                    var3 = new class265(arg0, var4.field4652);
                    this.field527[var4.field4656] = null;
                    var4.method441(16773377);
                } else {
                    var3 = new class265(arg0, this.field534);
                    this.field534++;
                }
                this.field527[arg0] = var3;
            } else {
                this.field536 = false;
            }
            this.field515.method1567(0, var3);
            return this.field522[var3.field4652];
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public final void method207(int arg0) {
        for (int var2 = 0; var2 < this.field528; var2++) {
            this.field522[var2] = null;
        }
        this.field522 = null;
        field514++;
        this.field527 = null;
        this.field515.method1573(79);
        this.field515 = null;
        if (arg0 < 111) {
            method212(-79);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)[[I")
    public final int[][] method208(int arg0) {
        field525++;
        if (this.field528 != this.field513) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field528; var2++) {
            this.field527[var2] = class22.field281;
        }
        return this.field522;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
    public static void method209(int arg0) {
        field531 = null;
        field526 = null;
        field518 = null;
        if (arg0 != 0) {
            return;
        }
        field524 = null;
        field516 = null;
        field529 = null;
        field512 = null;
        field523 = null;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
    public static final void method210(int arg0) {
        class131.field2182 = 0;
        field520++;
        class255.field4524 = 0;
        class200.method1390(35);
        class127.method906(-21);
        class156.method1065(-11);
        class95.method619(1);
        for (int var1 = 0; var1 < class131.field2182; var1++) {
            int var3 = class223.field3833[var1];
            if (class72.field1146 != class98.field1526[var3].field1759) {
                if (class98.field1526[var3].field3215 > 0) {
                    class179.method1187(class98.field1526[var3], (byte) 117);
                }
                class98.field1526[var3] = null;
            }
        }
        if (arg0 <= 107) {
            field530 = -103;
        }
        if (class182.field3044 != class213.field3680.field3169) {
            throw new RuntimeException("gpp1 pos:" + class213.field3680.field3169 + " psize:" + class182.field3044);
        }
        for (int var2 = 0; var2 < class138.field2360; var2++) {
            if (class98.field1526[class285.field5020[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class138.field2360);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
    public static final void method211(int arg0, int arg1, int arg2) {
        class203 var3 = class223.method1556(arg2, -2062292415);
        field537++;
        int var4 = var3.field3468;
        int var5 = var3.field3471;
        int var6 = var3.field3475;
        int var7 = class120.field2030[var5 - var6];
        if (arg1 < ~arg0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var6;
        class98.method635(var8 & arg0 << var6 | ~var8 & class153.field2571[var4], var4, (byte) 127);
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V")
    public static final void method212(int arg0) {
        field533++;
        if (class113.field1918 == 0) {
            return;
        }
        if (arg0 <= 91) {
            method210(121);
        }
        try {
            if ((++class217.field3736) > 1500) {
                if (class187.field3190 != null) {
                    class187.field3190.method419((byte) -66);
                    class187.field3190 = null;
                }
                if (class99.field1543 >= 1) {
                    class113.field1918 = 0;
                    class168.field2808 = -5;
                    return;
                }
                class113.field1918 = 1;
                class217.field3736 = 0;
                class99.field1543++;
                if (class79.field1237 == class138.field2359) {
                    class138.field2359 = class71.field1120;
                } else {
                    class138.field2359 = class79.field1237;
                }
            }
            if (class113.field1918 == 1) {
                class163.field2689 = class177.field2957.method1435(class272.field4774, 124, class138.field2359);
                class113.field1918 = 2;
            }
            if (class113.field1918 == 2) {
                if (class163.field2689.field4488 == 2) {
                    throw new IOException();
                }
                if (class163.field2689.field4488 != 1) {
                    return;
                }
                class187.field3190 = new class59((Socket) class163.field2689.field4483, class177.field2957);
                class163.field2689 = null;
                class187.field3190.method420(class273.field4778.field3175, 0, class273.field4778.field3169, -13789);
                if (field529 != null) {
                    field529.method933(103);
                }
                if (class61.field1000 != null) {
                    class61.field1000.method933(-69);
                }
                int var1 = class187.field3190.method426((byte) 41);
                if (field529 != null) {
                    field529.method933(101);
                }
                if (class61.field1000 != null) {
                    class61.field1000.method933(-102);
                }
                if (var1 != 101) {
                    class113.field1918 = 0;
                    class168.field2808 = var1;
                    class187.field3190.method419((byte) -66);
                    class187.field3190 = null;
                    return;
                }
                class113.field1918 = 3;
            }
            if (class113.field1918 == 3 && class187.field3190.method430(false) >= 2) {
                int var2 = class187.field3190.method426((byte) 41) << 8 | class187.field3190.method426((byte) 41);
                class187.method1285(var2, -28315);
                if (class74.field1164 == -1) {
                    class113.field1918 = 0;
                    class168.field2808 = 6;
                    class187.field3190.method419((byte) -66);
                    class187.field3190 = null;
                } else {
                    class113.field1918 = 0;
                    class187.field3190.method419((byte) -66);
                    class187.field3190 = null;
                    class24.method147(false);
                }
            }
        } catch (IOException var3) {
            if (class187.field3190 != null) {
                class187.field3190.method419((byte) -66);
                class187.field3190 = null;
            }
            if (class99.field1543 >= 1) {
                class113.field1918 = 0;
                class168.field2808 = -4;
            } else {
                class99.field1543++;
                if (class79.field1237 == class138.field2359) {
                    class138.field2359 = class71.field1120;
                } else {
                    class138.field2359 = class79.field1237;
                }
                class217.field3736 = 0;
                class113.field1918 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(III)V")
    public class36(int arg0, int arg1, int arg2) {
        this.field528 = arg0;
        this.field522 = new int[this.field528][arg2];
        this.field513 = arg1;
        this.field527 = new class265[this.field513];
    }
}
