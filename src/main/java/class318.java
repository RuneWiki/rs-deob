import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class318 extends class145 {

    @OriginalMember(owner = "client!un", name = "I", descriptor = "I")
    private int field4305 = 1;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "I")
    private int field4309 = 1;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "I")
    private int field4306 = 204;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "Z")
    public static boolean field4308 = false;

    @OriginalMember(owner = "client!un", name = "F", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!un", name = "H", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!un", name = "O", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "([Ljava/lang/String;IIB)Ljava/lang/String;", line = 3)
    public static final String method2021(String[] arg0, int arg1, int arg2, byte arg3) {
        ++field4311;
        if (~arg1 == -1) {
            return "";
        } else if (~arg1 == -2) {
            String var4 = arg0[arg2];
            return var4 != null ? var4.toString() : "null";
        } else {
            int var5 = arg1 + arg2;
            if (arg3 > -3) {
                field4308 = true;
            }
            int var6 = 0;
            for (int var7 = arg2; ~var7 > ~var5; ++var7) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; ~var9 > ~var5; ++var9) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZB)V", line = 66)
    public static final void method2022(boolean arg0, byte arg1) {
        ++field4303;
        if (class328.field4457 == !arg0) {
            if (arg1 != -59) {
                field4308 = true;
            }
            class328.field4457 = arg0;
            class100.method859(64);
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V", line = 90)
    public class318() {
        super(0, true);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lap;BI)V", line = 101)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        ++field4310;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field4306 = arg0.method1853(-63);
                }
            } else {
                this.field4309 = arg0.method1861((byte) -72);
            }
        } else {
            this.field4305 = arg0.method1861((byte) -72);
        }
        int var5 = -105 % ((arg1 - 11) / 52);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[I", line = 146)
    public final int[] method3(int arg0, int arg1) {
        ++field4307;
        int var3 = 1 % ((16 - arg1) / 49);
        int[] var4 = super.field2218.method1614(94, arg0);
        if (super.field2218.field3396) {
            for (int var5 = 0; var5 < class156.field2364; ++var5) {
                int var6 = class229.field3181[var5];
                int var7 = class134.field1902[arg0];
                int var8 = this.field4305 * var6 >> 12;
                int var9 = this.field4309 * var7 >> 12;
                int var10 = var6 % (4096 / this.field4305) * this.field4305;
                int var11 = var7 % (4096 / this.field4309) * this.field4309;
                if (~var11 > ~this.field4306) {
                    for (var8 -= var9; var8 < 0; var8 += 4) {
                    }
                    while (~var8 < -4) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var4[var5] = 0;
                        continue;
                    }
                    if (~this.field4306 < ~var10) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                if (this.field4306 > var10) {
                    int var12;
                    for (var12 = var8 - var9; ~var12 > -1; var12 += 4) {
                    }
                    while (var12 > 3) {
                        var12 -= 4;
                    }
                    if (~var12 < -1) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                var4[var5] = 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 232)
    public static final boolean method2023(boolean arg0, String arg1) {
        ++field4304;
        if (!arg0) {
            field4308 = false;
        }
        return class193.method1387(arg1, 10, true, (byte) -41);
    }
}
