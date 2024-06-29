import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class3 extends class436 {

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    private int field37 = 4096;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    public static int field36 = -1;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "Ljava/lang/String;")
    public static String field41 = "flash2:";

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "F")
    public static float field35;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "Lqj;")
    public static class296 field33;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "[[Z")
    public static boolean[][] field39;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(III)Lmg;")
    public static final class81 method13(int arg0, int arg1, int arg2) {
        class142 var3 = class5.field79[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2052;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class3() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != 18338) {
            method13(67, -13, 107);
        }
        ++field29;
        int[] var3 = super.field6258.method2688((byte) -125, arg0);
        if (super.field6258.field6138) {
            int[] var4 = this.method2729(0, 0, class190.field2634 & arg0 + -1);
            int[] var5 = this.method2729(0, 0, arg0);
            int[] var6 = this.method2729(0, 0, class190.field2634 & arg0 + 1);
            for (int var7 = 0; ~var7 > ~class43.field653; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field37;
                int var9 = (var5[class278.field3758 & var7 + 1] + -var5[class278.field3758 & var7 + -1]) * this.field37;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(B)V")
    public static void method15(byte arg0) {
        if (arg0 <= 72) {
            field33 = null;
        }
        field33 = null;
        field41 = null;
        field39 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
    public static final void method16(boolean arg0) {
        class190 var1 = class412.field5982;
        synchronized (class412.field5982) {
            class412.field5982.method1249(1);
            if (!arg0) {
                field31 = -106;
            }
        }
        ++field32;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method17(byte arg0, String arg1) {
        ++field38;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && ~var6 >= -91) {
                var2 += (long) (var6 + 1 + -65);
            } else if (~var6 <= -98 && var6 <= 'z') {
                var2 += (long) (var6 + -96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + -48 + 27);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        if (arg0 != -93) {
            field36 = -113;
        }
        while (~(var2 % 37L) == -1L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        ++field30;
        if (~arg1 == -1) {
            this.field37 = arg2.method2403((byte) 88);
        }
        if (arg0 != 34) {
            this.method18(-110, 48, (class371) null);
        }
    }
}
