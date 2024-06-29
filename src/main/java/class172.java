import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class172 extends class27 {

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "[J")
    public static long[] field2502 = new long[256];

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "[I")
    public static int[] field2508 = new int[100];

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field2505 = 0;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public int field2504;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "Loc;")
    public class135 field2501;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "[B")
    public byte[] field2506;

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; ++var3) {
                if ((var1 & 1L) == 1L) {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field2502[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 3)
    public static void method1145(int arg0) {
        if (arg0 != 0) {
            field2505 = -19;
        }
        field2508 = null;
        field2502 = null;
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(B)I", line = 14)
    public final int method229(byte arg0) {
        if (arg0 > -99) {
            this.field2506 = null;
        }
        ++field2503;
        return super.field456 ? 0 : 100;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[Lcr;I)V", line = 36)
    public static final void method1146(int arg0, class403[] arg1, int arg2) {
        int var3 = 0;
        if (arg2 != -1) {
            method1146(111, (class403[]) null, 36);
        }
        while (~arg1.length < ~var3) {
            class403 var4 = arg1[var3];
            if (var4 != null) {
                if (~var4.field5480 == -1) {
                    if (var4.field5420 != null) {
                        method1146(arg0, var4.field5420, -1);
                    }
                    class301 var5 = (class301) class27.field457.method182((long) var4.field5431, (byte) 84);
                    if (var5 != null) {
                        class269.method1615(var5.field3982, arg0, (byte) 20);
                    }
                }
                if (~arg0 == -1 && var4.field5492 != null) {
                    class353 var6 = new class353();
                    var6.field4770 = var4;
                    var6.field4772 = var4.field5492;
                    class122.method893(var6);
                }
                if (arg0 == 1 && var4.field5503 != null) {
                    label62: {
                        if (var4.field5553 >= 0) {
                            class403 var7 = class213.method1345((byte) 61, var4.field5431);
                            if (var7 == null || var7.field5420 == null || ~var4.field5553 <= ~var7.field5420.length || var7.field5420[var4.field5553] != var4) {
                                break label62;
                            }
                        }
                        class353 var8 = new class353();
                        var8.field4772 = var4.field5503;
                        var8.field4770 = var4;
                        class122.method893(var8);
                    }
                }
            }
            ++var3;
        }
        ++field2500;
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)[B", line = 108)
    public final byte[] method227(byte arg0) {
        ++field2507;
        if (arg0 != 41) {
            field2508 = null;
        }
        if (super.field456) {
            throw new RuntimeException();
        } else {
            return this.field2506;
        }
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V", line = 127)
    public static final void method1147(int arg0) {
        class71.field1089 = arg0;
        for (int var1 = 0; var1 < class439.field6036; ++var1) {
            for (int var2 = 0; var2 < class318.field4170; ++var2) {
                if (class497.field6886[arg0][var1][var2] == null) {
                    class497.field6886[arg0][var1][var2] = new class409(arg0, var1, var2);
                }
            }
        }
    }
}
