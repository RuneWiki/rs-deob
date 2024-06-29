import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class470 extends class14 {

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    private int field6472 = 4096;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    private int field6471 = 0;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field6477 = Boolean.FALSE;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "Lsn;")
    public static class443 field6474;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "[I")
    public static int[] field6470;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBLmd;)V", line = 5)
    public final void method147(int arg0, byte arg1, class379 arg2) {
        ++field6475;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field6472 = arg2.method2212((byte) 83);
            }
        } else {
            this.field6471 = arg2.method2212((byte) 83);
        }
        int var5 = 38 % ((arg1 - -51) / 37);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)[I", line = 39)
    public final int[] method140(int arg0, byte arg1) {
        ++field6473;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (super.field270.field5222) {
            int[] var4 = this.method145(arg0, 0, -18596);
            for (int var5 = 0; var5 < class115.field1637; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field6471 >= ~var6 && ~this.field6472 <= ~var6 ? 4096 : 0;
            }
        }
        return arg1 > -2 ? null : var3;
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V", line = 78)
    public static void method2670(int arg0) {
        field6474 = null;
        if (arg0 >= -42) {
            field6474 = null;
        }
        field6477 = null;
        field6470 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/String;)V", line = 90)
    public static final void method2671(int arg0, String arg1) {
        ++field6476;
        if (arg1 != null) {
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            String var2 = class264.method1587(arg1, -18488);
            if (var2 != null) {
                for (int var3 = arg0; ~class267.field3528 < ~var3; ++var3) {
                    String var4 = class471.field6485[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class264.method1587(var4, -18488);
                    if (var5 != null && var5.equals(var2)) {
                        --class267.field3528;
                        for (int var6 = var3; class267.field3528 > var6; ++var6) {
                            class471.field6485[var6] = class471.field6485[var6 - -1];
                            class71.field1076[var6] = class71.field1076[var6 - -1];
                            class127.field1853[var6] = class127.field1853[var6 - -1];
                            class176.field2566[var6] = class176.field2566[var6 + 1];
                            class427.field5837[var6] = class427.field5837[var6 - -1];
                            class454.field6157[var6] = class454.field6157[var6 + 1];
                        }
                        ++class66.field1021;
                        class57.field895 = class308.field4051;
                        class118.method822(70, class209.field2870);
                        class193.field2708.method2200(7, class125.method912(arg1, 1));
                        class193.field2708.method2216(arg1, arg0 ^ -118);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)Z", line = 152)
    public static final boolean method2672(int arg0) {
        ++field6479;
        if (arg0 != 5448) {
            field6474 = null;
        }
        if (class223.field3009) {
            try {
                class87.method637(arg0 ^ -5386, class389.field5281.field2917, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 256)
    public class470() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILbo;[I[I)Lig;", line = 178)
    public static final class160 method2673(int arg0, int arg1, int arg2, class511 arg3, int[] arg4, int[] arg5) {
        ++field6478;
        byte[] var6 = new byte[arg0 * arg1];
        if (arg2 != 1296) {
            method2670(114);
        }
        for (int var7 = 0; ~arg1 < ~var7; ++var7) {
            int var8 = arg0 * var7 + arg4[var7];
            for (int var9 = 0; var9 < arg5[var7]; ++var9) {
                var6[var8++] = -1;
            }
        }
        return new class160(arg3, arg0, arg1, var6);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 208)
    public static final String method2674(long arg0, byte arg1) {
        ++field6469;
        if (~arg0 < -1L && arg0 < 6582952005840035281L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                if (arg1 > -119) {
                    method2674(-128L, (byte) 113);
                }
                int var3 = 0;
                for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (~arg0 != -1L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    var6.append(class105.field1551[(int) (var7 - arg0 * 37L)]);
                }
                return var6.reverse().toString();
            }
        } else {
            return null;
        }
    }
}
