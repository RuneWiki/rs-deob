import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class21 implements class688 {

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "Lcja;")
    private class46 field460 = new class46(128);

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "[I")
    public int[] field447 = new int[class637.field8794.field10833];

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "[I")
    private int[] field456 = new int[class637.field8794.field10833];

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field450 = 0;

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "Ljava/lang/String;")
    public static String field458 = null;

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "[[I")
    public static int[][] field459 = new int[6][];

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(II)I", line = 3)
    public final int method138(int arg0, int arg1) {
        field454++;
        class273 var3 = class201.field3056.method1925(3, arg1);
        int var4 = var3.field3802;
        if (arg0 != 19129) {
            field450 = -35;
        }
        int var5 = var3.field3804;
        int var6 = var3.field3800;
        int var7 = class322.field4408[var6 - var5];
        return this.field447[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Llda;ILlda;)V", line = 24)
    public static final void method139(class513 arg0, int arg1, class513 arg2) {
        if (arg2.field7004 != null) {
            arg2.method2942(false);
        }
        field451++;
        if (arg1 != 128) {
            method141(108);
        }
        arg2.field7006 = arg0.field7006;
        arg2.field7004 = arg0;
        arg2.field7004.field7006 = arg2;
        arg2.field7006.field7004 = arg2;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)V", line = 43)
    public final void method140(int arg0, int arg1, int arg2) {
        field449++;
        class273 var4 = class201.field3056.method1925(3, arg2);
        int var5 = var4.field3802;
        int var6 = var4.field3804;
        int var7 = var4.field3800;
        int var8 = class322.field4408[var7 - var6];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        if (arg1 != -1) {
            this.field460 = null;
        }
        int var9 = var8 << var6;
        this.method143(0, var5, ~var9 & this.field456[var5] | arg0 << var6 & var9);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 73)
    public static void method141(int arg0) {
        field459 = null;
        field458 = null;
        if (arg0 <= 36) {
            method139(null, 96, null);
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(III)V", line = 84)
    public final void method142(int arg0, int arg1, int arg2) {
        field448++;
        class273 var4 = class201.field3056.method1925(3, arg0);
        int var5 = var4.field3802;
        if (arg2 != 0) {
            this.method146(-104, 5);
        }
        int var6 = var4.field3804;
        int var7 = var4.field3800;
        int var8 = class322.field4408[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method145(25856, this.field447[var5] & ~var9 | var9 & arg1 << var6, var5);
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(III)V", line = 118)
    public final void method143(int arg0, int arg1, int arg2) {
        this.field456[arg1] = arg2;
        field446++;
        if (arg0 != 0) {
            return;
        }
        class665 var4 = (class665) this.field460.method337((long) arg1, 1);
        if (var4 == null) {
            class665 var5 = new class665(4611686018427387905L);
            this.field460.method341((long) arg1, var5, (byte) 39);
        } else if (var4.field9234 != 4611686018427387905L) {
            var4.field9234 = class197.method1423(1) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IZ)I", line = 147)
    public final int method144(int arg0, boolean arg1) {
        field457++;
        long var3 = class197.method1423(arg0 + 2);
        class665 var5 = arg1 ? (class665) this.field460.method335(-29067) : (class665) this.field460.method336(arg0 + 86);
        if (arg0 != -1) {
            field450 = 63;
        }
        while (var5 != null) {
            if (var3 > (var5.field9234 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field9234 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field2528;
                    this.field447[var6] = this.field456[var6];
                    var5.method1207(101);
                    return var6;
                }
                var5.method1207(91);
            }
            var5 = (class665) this.field460.method336(113);
        }
        return -1;
    }

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "(III)V", line = 189)
    public final void method145(int arg0, int arg1, int arg2) {
        this.field447[arg2] = arg1;
        field452++;
        class665 var4 = (class665) this.field460.method337((long) arg2, 1);
        if (arg0 != 25856) {
            return;
        }
        if (var4 == null) {
            class665 var5 = new class665(class197.method1423(1) + 500L);
            this.field460.method341((long) arg2, var5, (byte) 66);
        } else {
            var4.field9234 = class197.method1423(1) + 500L;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)I", line = 213)
    public final int method146(int arg0, int arg1) {
        if (arg0 != 128) {
            field450 = -18;
        }
        field445++;
        return this.field447[arg1];
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V", line = 230)
    public final void method147(byte arg0) {
        int var2 = 7 % ((arg0 + 76) / 36);
        for (int var3 = 0; var3 < class637.field8794.field10833; var3++) {
            class610 var4 = class637.field8794.method4313(19500, var3);
            if (var4 != null && var4.field8513 == 0) {
                this.field456[var3] = 0;
                this.field447[var3] = 0;
            }
        }
        field453++;
        this.field460 = new class46(128);
    }
}
