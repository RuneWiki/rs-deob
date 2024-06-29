import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class54 extends class205 {

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "I")
    private int field1014 = 4096;

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "Lvd;")
    public static class222 field1015 = class212.method1357("(R", 10731);

    @OriginalMember(owner = "client!ej", name = "fb", descriptor = "[Lde;")
    public static class38[] field1024 = new class38[2048];

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "Lvd;")
    public static class222 field1016 = class212.method1357("null", 10731);

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ej", name = "Z", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!ej", name = "ab", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ej", name = "bb", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!ej", name = "cb", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!ej", name = "db", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!ej", name = "gb", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!ej", name = "eb", descriptor = "Lle;")
    public static class123 field1023;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLba;)Z")
    public static final boolean method404(byte arg0, class13 arg1) {
        ++field1018;
        if (arg0 != -16) {
            method406(-95);
        }
        if (arg1.field317 == null) {
            return false;
        } else {
            for (int var2 = 0; ~var2 > ~arg1.field317.length; ++var2) {
                int var3 = class156.method997(var2, false, arg1);
                int var4 = arg1.field282[var2];
                if (arg1.field317[var2] != 2) {
                    if (~arg1.field317[var2] == -4) {
                        if (var3 <= var4) {
                            return false;
                        }
                    } else if (~arg1.field317[var2] == -5) {
                        if (var3 == var4) {
                            return false;
                        }
                    } else if (var3 != var4) {
                        return false;
                    }
                } else if (var4 <= var3) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            this.field1014 = arg0.method675(2);
        }
        int var4 = -64 / ((-47 - arg1) / 34);
        ++field1017;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(IB)Lcj;")
    public static final class32 method405(int arg0, byte arg1) {
        int var2 = -30 / ((-16 - arg1) / 56);
        ++field1019;
        class32 var3 = (class32) class153.field2940.method601((long) arg0, 88);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class63.field1164.method33(-29616, 28, arg0);
            class32 var5 = new class32();
            if (var4 != null) {
                var5.method261(true, new class109(var4));
            }
            class153.field2940.method593((long) arg0, var5, (byte) -12);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "(I)V")
    public static void method406(int arg0) {
        field1016 = null;
        field1024 = null;
        field1023 = null;
        if (arg0 != -31563) {
            method406(59);
        }
        field1015 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        if (arg0 != 0) {
            method406(59);
        }
        int[] var3 = super.field3810.method557(6978, arg1);
        if (super.field3810.field1635) {
            int[] var4 = this.method1322(arg1 - 1 & class17.field433, (byte) 81, 0);
            int[] var5 = this.method1322(arg1, (byte) 85, 0);
            int[] var6 = this.method1322(class17.field433 & arg1 - -1, (byte) 82, 0);
            for (int var7 = 0; class118.field2245 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field1014;
                int var9 = (var5[class159.field3039 & var7 + 1] + -var5[var7 + -1 & class159.field3039]) * this.field1014;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 - -4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        ++field1025;
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class54() {
        super(1, true);
    }
}
