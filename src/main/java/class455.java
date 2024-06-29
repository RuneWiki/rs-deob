import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class455 implements class416 {

    @OriginalMember(owner = "client!it", name = "i", descriptor = "Lib;")
    private class106 field6692 = new class106(128);

    @OriginalMember(owner = "client!it", name = "h", descriptor = "[I")
    private int[] field6691 = new int[class276.field4060.field6929];

    @OriginalMember(owner = "client!it", name = "f", descriptor = "[I")
    public int[] field6689 = new int[class276.field4060.field6929];

    @OriginalMember(owner = "client!it", name = "a", descriptor = "[Lsd;")
    public static class62[] field6684 = new class62[4];

    @OriginalMember(owner = "client!it", name = "g", descriptor = "Lho;")
    public static class102 field6690 = new class102(4, 1, 1, 1);

    @OriginalMember(owner = "client!it", name = "s", descriptor = "I")
    public static int field6702 = 0;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "I")
    public static int field6701 = 0;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "[I")
    public static int[] field6700;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)V")
    public static void method2742(boolean arg0) {
        field6684 = null;
        field6700 = null;
        field6690 = null;
        if (arg0) {
            field6701 = -42;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(III)V")
    public final void method2743(int arg0, int arg1, int arg2) {
        field6697++;
        class498 var4 = class29.field357.method1682(arg1, arg2 ^ 0xFFFFFF00);
        int var5 = var4.field7395;
        int var6 = var4.field7400;
        int var7 = var4.field7396;
        int var8 = class516.field7592[var7 - var6];
        if (arg2 > arg0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method2745(114, var5, var9 & arg0 << var6 | ~var9 & this.field6691[var5]);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public final void method2744(int arg0) {
        field6688++;
        for (int var2 = 0; var2 < class276.field4060.field6929; var2++) {
            class429 var4 = class276.field4060.method2832(var2, -10231);
            if (var4 != null && var4.field6315 == 0) {
                this.field6691[var2] = 0;
                this.field6689[var2] = 0;
            }
        }
        this.field6692 = new class106(128);
        int var3 = -27 / ((arg0 + 15) / 54);
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(III)V")
    public final void method2745(int arg0, int arg1, int arg2) {
        this.field6691[arg1] = arg2;
        field6694++;
        int var4 = -105 % ((-arg0 - 64) / 44);
        class40 var5 = (class40) this.field6692.method875((long) arg1, 124);
        if (var5 == null) {
            class40 var6 = new class40(4611686018427387905L);
            this.field6692.method878((long) arg1, -2301, var6);
        } else if (var5.field459 != 4611686018427387905L) {
            var5.field459 = class437.method2644(-68) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(III)V")
    public final void method2746(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.method2746(34, -24, -115);
        }
        this.field6689[arg2] = arg1;
        field6693++;
        class40 var4 = (class40) this.field6692.method875((long) arg2, 125);
        if (var4 == null) {
            class40 var5 = new class40(class437.method2644(-93) + 500L);
            this.field6692.method878((long) arg2, -2301, var5);
        } else {
            var4.field459 = class437.method2644(-92) + 500L;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)I")
    public final int method2543(byte arg0, int arg1) {
        field6686++;
        if (arg0 != 45) {
            field6695 = -23;
        }
        class498 var3 = class29.field357.method1682(arg1, arg0 - 301);
        int var4 = var3.field7395;
        int var5 = var3.field7400;
        int var6 = var3.field7396;
        int var7 = class516.field7592[var6 - var5];
        return this.field6689[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZI)I")
    public final int method2747(boolean arg0, int arg1) {
        field6687++;
        long var3 = class437.method2644(-123);
        class40 var5 = arg0 ? (class40) this.field6692.method880((byte) -23) : (class40) this.field6692.method879((byte) -20);
        if (arg1 > -53) {
            this.method2743(125, -36, -30);
        }
        while (var5 != null) {
            if ((var5.field459 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field459 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field3271;
                    this.field6689[var6] = this.field6691[var6];
                    var5.method1525((byte) -99);
                    return var6;
                }
                var5.method1525((byte) -110);
            }
            var5 = (class40) this.field6692.method879((byte) -20);
        }
        return -1;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
    public static final void method2748(int arg0) {
        if (arg0 != 1) {
            method2748(29);
        }
        class326.field4576.method317(class527.field7755, class510.field7529, class140.field1986);
        field6699++;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IZI)Ljh;")
    public static final class110 method2749(int arg0, boolean arg1, int arg2) {
        field6698++;
        if (arg0 <= 18) {
            method2742(false);
        }
        long var3 = (long) (arg2 | (arg1 ? Integer.MIN_VALUE : 0));
        return (class110) class126.field1841.method875(var3, 123);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IBI)V")
    public final void method2750(int arg0, byte arg1, int arg2) {
        field6685++;
        int var4 = 45 % ((28 - arg1) / 59);
        class498 var5 = class29.field357.method1682(arg0, -256);
        int var6 = var5.field7395;
        int var7 = var5.field7400;
        int var8 = var5.field7396;
        int var9 = class516.field7592[var8 - var7];
        if (arg2 < 0 || arg2 > var9) {
            arg2 = 0;
        }
        int var10 = var9 << var7;
        this.method2746(0, var10 & arg2 << var7 | ~var10 & this.field6689[var6], var6);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)I")
    public final int method2544(int arg0, int arg1) {
        field6696++;
        if (arg1 != 0) {
            this.method2750(98, (byte) 37, 65);
        }
        return this.field6689[arg0];
    }
}
