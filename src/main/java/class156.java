import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public abstract class class156 extends class656 {

    @OriginalMember(owner = "client!faa", name = "o", descriptor = "Lrda;")
    public class663 field2383;

    @OriginalMember(owner = "client!faa", name = "r", descriptor = "I")
    public static int field2386 = -60;

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!faa", name = "m", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!faa", name = "p", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!faa", name = "q", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!faa", name = "s", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!faa", name = "n", descriptor = "Lofa;")
    public static class333 field2382;

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "Z")
    public boolean field2379;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(III)B")
    public static final byte method1131(int arg0, int arg1, int arg2) {
        if (arg2 != -16878) {
            method1135(-64);
        }
        field2377++;
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)Z")
    public final boolean method1132(int arg0) {
        if (arg0 == 0) {
            field2384++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)Z")
    public abstract boolean method713(int arg0);

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lsia;Lsia;II)V")
    public abstract void method709(class737 arg0, class737 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(Z)Z")
    public abstract boolean method711(boolean arg0);

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(I)Z")
    public final boolean method1133(int arg0) {
        if (arg0 != 818) {
            field2382 = null;
        }
        field2378++;
        return this.field2379;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V")
    public static final void method1134(byte arg0) {
        field2380++;
        int var1 = class229.field3261.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class229.field3261[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class56.field682; var4++) {
                    if (class661.field8721[var4] == class197.field2972[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class661.field8721[class56.field682] = class197.field2972[var2];
                    var3 = class56.field682++;
                }
                class677 var5 = new class677(class229.field3261[var2]);
                int var6 = 0;
                while (var5.field9419 < class229.field3261[var2].length && var6 < 511 && class306.field4404 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method3807(-1);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FBE) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class197.field2972[var2] >> 8) * 64 + (var10 - class503.field6752);
                    int var13 = (class197.field2972[var2] & 0xFF) * 64 + var11 - class334.field4757;
                    class166 var14 = class292.field4177.method2358(var5.method3807(arg0 ^ 0xFFFFFF8F), 8881);
                    class134 var15 = (class134) class390.field5470.method2135((long) var7, (byte) 31);
                    if (var15 == null && (var14.field2519 & 0x1) > 0 && class489.field6638 == var9 && var12 >= 0 && class719.field10004 > (var14.field2544 + var12) && var13 >= 0 && class107.field1453 > var14.field2544 + var13) {
                        class556 var16 = new class556();
                        var16.field10297 = var7;
                        class134 var17 = new class134(var16);
                        class390.field5470.method2143(-1, var17, (long) var7);
                        class302.field4281[class243.field3403++] = var17;
                        class628.field8351[class306.field4404++] = var7;
                        var16.field10265 = class29.field474;
                        var16.method3099((byte) -111, var14);
                        var16.method4146((byte) 127, var16.field7328.field2544);
                        var16.field10293 = var16.field7328.field2562 << 3;
                        var16.method4143((byte) -17, (var16.field7328.field2535 + 4 & 0xED800007) << 11, true);
                        var16.method3095(true, var12, var13, var16.method2256(-1), var9, arg0 ^ 0x1E);
                    }
                }
            }
        }
        if (arg0 != 112) {
            method1135(83);
        }
    }

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "(Z)V")
    public abstract void method717(boolean arg0);

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(B)I")
    public int method712(byte arg0) {
        if (arg0 != 30) {
            field2382 = null;
        }
        field2381++;
        return 0;
    }

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "(I)V")
    public static void method1135(int arg0) {
        if (arg0 > -67) {
            method1135(-7);
        }
        field2382 = null;
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lrda;)V")
    public class156(class663 arg0) {
        this.field2383 = arg0;
    }

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "(I)I")
    public final int method1136(int arg0) {
        field2387++;
        int var2 = -70 % ((arg0 - 81) / 45);
        return 1;
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(IZ)V")
    public abstract void method715(int arg0, boolean arg1);

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(III)V")
    public abstract void method714(int arg0, int arg1, int arg2);
}
