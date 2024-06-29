import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class365 extends class368 {

    @OriginalMember(owner = "client!mo", name = "y", descriptor = "Lrga;")
    public static class280 field4643 = new class280(14, 3);

    @OriginalMember(owner = "client!mo", name = "F", descriptor = "Z")
    public static boolean field4649 = true;

    @OriginalMember(owner = "client!mo", name = "E", descriptor = "Llt;")
    public static class273 field4648 = new class273();

    @OriginalMember(owner = "client!mo", name = "G", descriptor = "[S")
    public static short[] field4650 = new short[] { 8, 12, 49, 59, 15, 3, 9, 44 };

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
    public int field4640;

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!mo", name = "x", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!mo", name = "z", descriptor = "I")
    public int field4644;

    @OriginalMember(owner = "client!mo", name = "A", descriptor = "I")
    public int field4645;

    @OriginalMember(owner = "client!mo", name = "C", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
    public int field4647;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "J")
    public long field4634;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "(I)J", line = 3)
    public final long method436(int arg0) {
        field4639++;
        if (arg0 > -67) {
            field4648 = null;
        }
        return this.field4634;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V", line = 16)
    public static void method2001(byte arg0) {
        if (arg0 >= 11) {
            field4648 = null;
            field4650 = null;
            field4643 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lpl;IZLjava/lang/String;)Lrn;", line = 30)
    public static final class335 method2002(class612 arg0, int arg1, boolean arg2, String arg3) {
        field4637++;
        int var4 = arg0.method3341(arg3, 77);
        if (var4 == -1) {
            return new class335(0);
        }
        int[] var5 = arg0.method3353(var4, -124);
        class335 var6 = new class335(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field4261 > var7) {
                class630 var9 = new class630(arg0.method3365(var5[var8++], arg1 - 415, var4));
                int var10 = var9.method3483(113);
                int var11 = var9.method3470(13111);
                int var12 = var9.method3501(-9268);
                if (!arg2 && var12 == 1) {
                    var6.field4261--;
                } else {
                    var6.field4266[var7] = var10;
                    var6.field4262[var7] = var11;
                    var7++;
                }
            }
            if (arg1 != 512) {
                field4648 = null;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLni;)V", line = 76)
    public static final void method2003(byte arg0, class687 arg1) {
        field4635++;
        if (arg0 >= -63) {
            field4643 = null;
        }
        int var2 = arg1.field9740 - class133.field1735;
        int var3 = arg1.field9651 * 512 + (arg1.method2785(-1) * 256);
        int var4 = arg1.field9722 * 512 + arg1.method2785(-1) * 256;
        arg1.field9748 = 0;
        arg1.field6461 += (var3 - arg1.field6461) / var2;
        arg1.field6464 += (var4 - arg1.field6464) / var2;
        if (arg1.field9685 == 0) {
            arg1.method3869(false, 8192);
        }
        if (arg1.field9685 == 1) {
            arg1.method3869(false, 12288);
        }
        if (arg1.field9685 == 2) {
            arg1.method3869(false, 0);
        }
        if (arg1.field9685 == 3) {
            arg1.method3869(false, 4096);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)I", line = 110)
    public final int method439(boolean arg0) {
        if (arg0) {
            field4642++;
            return this.field4647;
        } else {
            return -12;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 121)
    public static final String method2004(String arg0, boolean arg1) {
        field4638++;
        String var2 = null;
        int var3 = arg0.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg0.substring(0, var3 + 4);
            arg0 = arg0.substring(var3 + 4);
        }
        if (arg0.startsWith("directlogin ")) {
            int var4 = arg0.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg0.length();
                arg0 = arg0.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg0 = arg0 + "*";
                }
            }
        }
        if (arg1) {
            method2001((byte) -51);
        }
        return var2 == null ? arg0 : var2 + arg0;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(Z)I", line = 172)
    public final int method438(boolean arg0) {
        field4646++;
        return arg0 ? 73 : this.field4645;
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)I", line = 184)
    public final int method435(int arg0) {
        field4641++;
        if (arg0 < 117) {
            this.method437(-10);
        }
        return this.field4644;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)I", line = 204)
    public final int method437(int arg0) {
        if (arg0 == 9) {
            field4636++;
            return this.field4640;
        } else {
            return 12;
        }
    }
}
