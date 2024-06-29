import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class148 extends class23 {

    @OriginalMember(owner = "client!mg", name = "cb", descriptor = "Z")
    private boolean field2486 = true;

    @OriginalMember(owner = "client!mg", name = "lb", descriptor = "Z")
    private boolean field2495 = true;

    @OriginalMember(owner = "client!mg", name = "gb", descriptor = "Lqd;")
    public static class40 field2490 = class147.method1106("null", (byte) -105);

    @OriginalMember(owner = "client!mg", name = "Z", descriptor = "Lqd;")
    public static class40 field2483 = class147.method1106("Cabbage", (byte) -73);

    @OriginalMember(owner = "client!mg", name = "mb", descriptor = "Lqd;")
    public static class40 field2496 = class147.method1106(")3", (byte) -111);

    @OriginalMember(owner = "client!mg", name = "ib", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2492 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!mg", name = "ob", descriptor = "Lhi;")
    public static class282 field2498 = new class282();

    @OriginalMember(owner = "client!mg", name = "pb", descriptor = "I")
    public static int field2499 = -1;

    @OriginalMember(owner = "client!mg", name = "Y", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!mg", name = "bb", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!mg", name = "db", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!mg", name = "eb", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!mg", name = "hb", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!mg", name = "jb", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!mg", name = "kb", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!mg", name = "nb", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!mg", name = "fb", descriptor = "Lrb;")
    public static class213 field2489;

    @OriginalMember(owner = "client!mg", name = "ab", descriptor = "[I")
    public static int[] field2484;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)[I", line = 7)
    public final int[] method32(byte arg0, int arg1) {
        field2487++;
        if (arg0 != -94) {
            this.method17(20, 126);
        }
        int[] var3 = this.field403.method724((byte) -113, arg1);
        if (this.field403.field1760) {
            int[] var4 = this.method174(0, arg0 + 94, this.field2486 ? class212.field3384 - arg1 : arg1);
            if (this.field2495) {
                for (int var5 = 0; var5 < class52.field1007; var5++) {
                    var3[var5] = var4[class6.field92 - var5];
                }
            } else {
                class234.method1624(var4, 0, var3, 0, class52.field1007);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(IBI)V", line = 46)
    public static final void method1112(int arg0, byte arg1, int arg2) {
        field2493++;
        class314 var3 = class292.method2009(arg2, 66);
        int var4 = var3.field5300;
        int var5 = var3.field5312;
        int var6 = var3.field5297;
        int var7 = class294.field4938[var4 - var6];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var6;
        if (arg1 >= -94) {
            method1116((class239) null, 47, (class239) null);
        }
        class131.method970(class192.field3098[var5] & ~var8 | var8 & arg0 << var6, var5, -106);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[[I", line = 80)
    public final int[][] method17(int arg0, int arg1) {
        field2488++;
        int[][] var3 = this.field417.method1251(arg1, 119);
        if (this.field417.field2751) {
            int[][] var4 = this.method173(0, this.field2486 ? class212.field3384 - arg1 : arg1, (byte) 27);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            if (this.field2495) {
                for (int var12 = 0; var12 < class52.field1007; var12++) {
                    var10[var12] = var5[class6.field92 - var12];
                    var9[var12] = var7[class6.field92 - var12];
                    var8[var12] = var6[class6.field92 - var12];
                }
            } else {
                for (int var11 = 0; var11 < class52.field1007; var11++) {
                    var10[var11] = var5[var11];
                    var9[var11] = var7[var11];
                    var8[var11] = var6[var11];
                }
            }
        }
        if (arg0 < 30) {
            method1113(-9);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "(I)V", line = 142)
    public static void method1113(int arg0) {
        field2490 = null;
        field2489 = null;
        if (arg0 != 0) {
            return;
        }
        field2483 = null;
        field2484 = null;
        field2496 = null;
        field2492 = null;
        field2498 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILce;B)[Lmm;", line = 160)
    public static final class249[] method1114(int arg0, int arg1, class239 arg2, byte arg3) {
        field2491++;
        if (arg3 < 86) {
            field2496 = (class40) null;
        }
        return class272.method1881(arg2, arg0, arg1, 929) ? class89.method688((byte) -116) : null;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 279)
    public class148() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILsd;)V", line = 195)
    public final void method23(int arg0, int arg1, class26 arg2) {
        field2497++;
        if (arg0 == 0) {
            this.field2495 = arg2.method226(255) == 1;
        } else if (arg0 == 1) {
            this.field2486 = arg2.method226(255) == 1;
        } else if (arg0 == 2) {
            this.field415 = arg2.method226(255) == 1;
        }
        if (arg1 != 0) {
            field2499 = -92;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(BI)I", line = 242)
    public static final int method1115(byte arg0, int arg1) {
        int var2 = -28 % ((-arg0 - 28) / 60);
        field2485++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lce;ILce;)V", line = 255)
    public static final void method1116(class239 arg0, int arg1, class239 arg2) {
        class49.field945 = class257.method1804(class85.field1470, arg2, 0, 0, arg0);
        if (class21.field350) {
            class40.field762 = class314.method2170(true, class85.field1470, 0, arg0, arg2);
        } else {
            class40.field762 = (class262) class49.field945;
        }
        if (arg1 != -9875) {
            field2496 = (class40) null;
        }
        field2494++;
        class146.field2428 = class257.method1804(class72.field1273, arg2, 0, 0, arg0);
        class230.field3789 = class257.method1804(class159.field2649, arg2, 0, 0, arg0);
    }
}
