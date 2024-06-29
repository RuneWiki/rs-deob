import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class239 {

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "B")
    public byte field3486 = 0;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "B")
    public byte field3479;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "B")
    public byte field3470;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "S")
    public short field3491;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "S")
    public short field3485;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "[I")
    public static int[] field3476 = new int[8];

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "Ldv;")
    public static class477 field3494 = new class477();

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "B")
    public byte field3469;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "B")
    public byte field3478;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "B")
    public byte field3484;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "B")
    public byte field3489;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Lvb;")
    public class134 field3482;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Ldj;")
    public class232 field3473;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "Ldj;")
    public class232 field3487;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "Lrb;")
    public class239 field3483;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Lsj;")
    public class324 field3492;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "Lna;")
    public class35 field3493;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lgq;")
    public class362 field3471;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lgq;")
    public class362 field3474;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "Lhr;")
    public class371 field3495;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "S")
    public short field3488;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Z")
    public boolean field3472;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Z")
    public boolean field3480;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "Z")
    public boolean field3490;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public final void method1505(int arg0) {
        field3481++;
        while (this.field3482 != null) {
            class134 var2 = this.field3482.field1755;
            this.field3482.method846(arg0 + 3253);
            this.field3482 = var2;
        }
        if (arg0 != -3254) {
            this.field3480 = false;
        }
        this.field3486 = 0;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static final void method1506(int arg0) {
        field3477++;
        int var1 = class498.field7054.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class498.field7054[var2] != null) {
                int var4 = -1;
                for (int var5 = 0; var5 < class342.field4975; var5++) {
                    if (class478.field6655[var5] == class332.field4827[var2]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class478.field6655[class342.field4975] = class332.field4827[var2];
                    var4 = class342.field4975++;
                }
                class403 var6 = new class403(class498.field7054[var2]);
                int var7 = 0;
                while (class498.field7054[var2].length > var6.field5665 && var7 < 511 && class434.field6110 < 1023) {
                    int var8 = var7++ << 6 | var4;
                    int var9 = var6.method2338(0);
                    int var10 = var9 >> 14;
                    int var11 = (var9 & 0x1FE4) >> 7;
                    int var12 = var9 & 0x3F;
                    int var13 = (class332.field4827[var2] >> 8) * 64 + var11 - class441.field6171;
                    int var14 = (class332.field4827[var2] & 0xFF) * 64 + (var12 - class367.field5241);
                    class322 var15 = class106.field1400.method2580(var6.method2338(0), -127);
                    class378 var16 = (class378) class125.field1687.method2405((long) var8, -88);
                    if (var16 == null && (var15.field4644 & 0x1) > 0 && class146.field1941 == var10 && var13 >= 0 && var15.field4711 + var13 < class43.field494 && var14 >= 0 && class500.field7068 > var15.field4711 + var14) {
                        class429 var17 = new class429();
                        var17.field3289 = var8;
                        class378 var18 = new class378(var17);
                        class125.field1687.method2413((long) var8, var18, -1);
                        class367.field5245[class481.field6704++] = var18;
                        class488.field6834[class434.field6110++] = var8;
                        var17.field3316 = class390.field5481;
                        var17.method2541(var15, false);
                        var17.method1404((byte) 77, var17.field6055.field4711);
                        var17.field3313 = var17.field6055.field4657 << 3;
                        var17.method1408((var17.field6055.field4679 + 4 & 0xEA600007) << 11, true, 989076559);
                        var17.method2537(-7917, var14, true, var10, var17.method125((byte) -84), var13);
                    }
                }
            }
        }
        int var3 = -49 / ((-arg0 - 55) / 61);
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(III)V")
    public class239(int arg0, int arg1, int arg2) {
        this.field3470 = this.field3479 = (byte) arg0;
        this.field3491 = (short) arg1;
        this.field3485 = (short) arg2;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)I")
    public static int method1507(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public static void method1508(byte arg0) {
        if (arg0 > -19) {
            field3476 = null;
        }
        field3494 = null;
        field3476 = null;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
    public static final void method1509(int arg0) {
        class156.field2352 = -1;
        class463.field6476 = null;
        if (arg0 != -27199) {
            method1506(13);
        }
        field3475++;
    }
}
