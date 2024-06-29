import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class23 extends class259 {

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    private int field424 = 4096;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    private int field425 = 4096;

    @OriginalMember(owner = "client!sd", name = "kb", descriptor = "I")
    private int field441 = 4096;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "Lsg;")
    public static class30 field429 = class167.method1221((byte) 33, "Texturen geladen)3");

    @OriginalMember(owner = "client!sd", name = "jb", descriptor = "I")
    public static int field440 = 0;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "Lsg;")
    private static class30 field423 = class167.method1221((byte) 33, "Loading title screen )2 ");

    @OriginalMember(owner = "client!sd", name = "ib", descriptor = "Lsg;")
    public static class30 field439 = field423;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!sd", name = "gb", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!sd", name = "hb", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!sd", name = "lb", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "[Lgj;")
    public static class192[] field427;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "[[B")
    public static byte[][] field431;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILmc;)Lid;")
    public static final class215 method207(int arg0, int arg1, class151 arg2) {
        ++field426;
        byte[] var3 = arg2.method1122((byte) -70, arg1);
        if (arg0 != 30024) {
            return null;
        } else {
            return var3 == null ? null : new class215(var3);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        int var3 = 67 / ((-48 - arg0) / 42);
        ++field430;
        int[][] var4 = super.field4568.method241(-82, arg1);
        if (super.field4568.field564) {
            int[][] var5 = this.method1795(arg1, 2, 0);
            int[] var6 = var5[2];
            int[] var7 = var5[0];
            int[] var8 = var5[1];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class223.field3999; ++var12) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var8[var12];
                if (var13 == var14 && ~var13 == ~var15) {
                    var9[var12] = this.field425 * var14 >> 12;
                    var10[var12] = this.field424 * var13 >> 12;
                    var11[var12] = this.field441 * var15 >> 12;
                } else {
                    var9[var12] = this.field425;
                    var10[var12] = this.field424;
                    var11[var12] = this.field441;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)Z")
    public static final boolean method208(int arg0, int arg1) {
        if (arg1 != 0) {
            method210(8, -128, -49, -81);
        }
        ++field433;
        return (3436766 & arg0) >> 21 != 0;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)V")
    public static final void method209(int arg0, int arg1) {
        class101.field2060.method1642(arg0, 101);
        ++field428;
        if (arg1 > -90) {
            field440 = -56;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 != -1586849108) {
            field431 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field441 = arg2.method65((byte) 126);
                }
            } else {
                this.field424 = arg2.method65((byte) 112);
            }
        } else {
            this.field425 = arg2.method65((byte) 114);
        }
        ++field437;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)Lwj;")
    public static final class180 method210(int arg0, int arg1, int arg2, int arg3) {
        ++field442;
        if (arg0 != -11999) {
            field427 = null;
        }
        class180 var4 = new class180();
        var4.field3335 = arg2;
        var4.field3336 = arg1;
        class143.field2762.method1164((byte) -63, (long) arg3, var4);
        class260.method1800(66, arg2);
        class31 var5 = class272.method1858(arg3, 65535);
        if (var5 != null) {
            class254.method1771(var5, 8);
        }
        if (class263.field4661 != null) {
            class254.method1771(class263.field4661, arg0 ^ -11991);
            class263.field4661 = null;
        }
        int var6 = class52.field1165;
        for (int var7 = 0; var6 > var7; ++var7) {
            if (class174.method1278(class30.field602[var7], (byte) -124)) {
                class80.method697(var7, 1);
            }
        }
        if (~class52.field1165 == -2) {
            class94.field1890 = false;
            class201.method1429(class169.field3187, class163.field3039, true, class208.field3744, class202.field3594);
        } else {
            class201.method1429(class169.field3187, class163.field3039, true, class208.field3744, class202.field3594);
            int var8 = class223.field4000.method1456(class269.field4737);
            for (int var9 = 0; ~class52.field1165 < ~var9; ++var9) {
                int var10 = class223.field4000.method1456(class109.method864(0, var9));
                if (~var10 < ~var8) {
                    var8 = var10;
                }
            }
            class202.field3594 = class52.field1165 * 15 + 22;
            class163.field3039 = var8 + 8;
        }
        if (var5 != null) {
            class112.method875((byte) 106, var5, false);
        }
        class14.method150(-1, arg2);
        if (~class196.field3548 != 0) {
            class185.method1325(class196.field3548, (byte) -57, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class23() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IJ)Lsg;")
    public static final class30 method211(int arg0, long arg1) {
        class80.field1717.setTime(new Date(arg1));
        ++field434;
        if (arg0 != 13884) {
            field440 = -98;
        }
        int var3 = class80.field1717.get(7);
        int var4 = class80.field1717.get(5);
        int var5 = class80.field1717.get(2);
        int var6 = class80.field1717.get(1);
        int var7 = class80.field1717.get(11);
        int var8 = class80.field1717.get(12);
        int var9 = class80.field1717.get(13);
        return class160.method1188(new class30[] { class234.field4177[var3 + -1], class135.field2649, class73.method675(-24, var4 / 10), class73.method675(120, var4 % 10), class231.field4113, class11.field204[var5], class231.field4113, class73.method675(-48, var6), class47.field1081, class73.method675(arg0 + -13765, var7 / 10), class73.method675(-59, var7 % 10), class122.field2392, class73.method675(98, var8 / 10), class73.method675(-113, var8 % 10), class122.field2392, class73.method675(arg0 + -13778, var9 / 10), class73.method675(125, var9 % 10), class115.field2272 }, 0);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
    public static void method212(byte arg0) {
        field431 = null;
        field427 = null;
        field429 = null;
        if (arg0 <= -76) {
            field423 = null;
            field439 = null;
        }
    }
}
