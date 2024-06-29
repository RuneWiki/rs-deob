import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class472 extends class137 implements class583 {

    @OriginalMember(owner = "client!oga", name = "m", descriptor = "I")
    private int field6764;

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "Lpia;")
    public static class94 field6756 = new class94(73, 3);

    @OriginalMember(owner = "client!oga", name = "j", descriptor = "I")
    public static int field6761 = -1;

    @OriginalMember(owner = "client!oga", name = "k", descriptor = "Lpia;")
    public static class94 field6762 = new class94(59, 5);

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "F")
    public static float field6755;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!oga", name = "i", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!oga", name = "l", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!oga", name = "n", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "Loh;")
    public static class404 field6758;

    @OriginalMember(owner = "client!oga", name = "o", descriptor = "[Lgv;")
    public static class81[] field6766;

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)V")
    public static void method2849(byte arg0) {
        if (arg0 != -15) {
            method2849((byte) -125);
        }
        field6756 = null;
        field6762 = null;
        field6766 = null;
        field6758 = null;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I[BII)V")
    public final void method16(int arg0, byte[] arg1, int arg2, int arg3) {
        this.method873(arg1, arg3);
        ++field6765;
        if (arg2 > -126) {
            field6758 = null;
        }
        this.field6764 = arg0;
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)V")
    public static final void method2850(int arg0) {
        ++field6754;
        short var1 = 1024;
        short var2 = 3072;
        if (class626.field8994) {
            var2 = 4096;
            if (class454.field6521) {
                var1 = 2048;
            }
        }
        if (class308.field3835 < (float) var1) {
            class308.field3835 = (float) var1;
        }
        if (class308.field3835 > (float) var2) {
            class308.field3835 = (float) var2;
        }
        while (class227.field2590 >= 16384.0F) {
            class227.field2590 -= 16384.0F;
        }
        while (class227.field2590 < 0.0F) {
            class227.field2590 += 16384.0F;
        }
        int var3 = class496.field7015 >> 9;
        int var4 = class559.field7986 >> 9;
        int var5 = class676.method3845(class559.field7986, class496.field7015, 0, class122.field1278);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && ~var3 > ~(class489.field6976 + -4) && class153.field1677 + -4 > var4) {
            for (int var7 = var3 - 4; var3 + 4 >= var7; ++var7) {
                for (int var8 = var4 + -4; var4 + 4 >= var8; ++var8) {
                    int var9 = class122.field1278;
                    if (~var9 > -4 && class728.method4056(var8, var7, (byte) -118)) {
                        ++var9;
                    }
                    int var10 = 0;
                    if (class659.field9413.field9034 != null && class659.field9413.field9034[var9] != null) {
                        var10 = (class659.field9413.field9034[var9][var7][var8] & 255) * 8 << 2;
                    }
                    if (class504.field7120 != null && class504.field7120[var9] != null) {
                        int var11 = var5 + var10 + -class504.field7120[var9].method1671(var8, var7, (byte) 90);
                        if (var11 > var6) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var6 >> 2) * arg0;
        if (~var12 < -786433) {
            var12 = 786432;
        }
        if (~var12 > -262145) {
            var12 = 262144;
        }
        if (~var12 < ~class591.field8330) {
            class591.field8330 += (-class591.field8330 + var12) / 24;
        } else if (class591.field8330 > var12) {
            class591.field8330 += (-class591.field8330 + var12) / 80;
        }
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lnv;I[BI)V")
    public class472(class417 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6764 = arg1;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        ++field6763;
        return arg0 != 82 ? -10 : 0;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)J")
    public final long method20(int arg0) {
        ++field6759;
        if (arg0 != -22317) {
            field6761 = 7;
        }
        return super.field1556.getAddress();
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(ILig;I)Ljava/lang/String;")
    public static final String method2851(int arg0, class244 arg1, int arg2) {
        ++field6757;
        try {
            int var3 = arg1.method1463(3010);
            if (~arg0 > ~var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg1.field2903 += class293.field3609.method2822(arg1.field2903, var3, var4, arg1.field2912, 0, arg2 ^ arg2);
            return class78.method553(0, var4, var3, -1);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lnv;ILjaclib/memory/Buffer;)V")
    public class472(class417 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field6764 = arg1;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Z)I")
    public final int method22(boolean arg0) {
        if (!arg0) {
            field6755 = 1.0753292F;
        }
        ++field6760;
        return this.field6764;
    }
}
