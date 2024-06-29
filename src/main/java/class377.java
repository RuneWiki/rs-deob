import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class377 extends class406 {

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    public int field5310 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public int field5312 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public int field5311 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "I")
    public int field5317 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    public int field5314 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sn", name = "C", descriptor = "I")
    public int field5322 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public int field5313 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sn", name = "B", descriptor = "I")
    public int field5321 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "Lnd;")
    public class324 field5315;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "Ljava/lang/String;")
    public static String field5318 = "";

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!sn", name = "y", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!sn", name = "D", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!sn", name = "E", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!sn", name = "F", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "([II[Ljava/lang/Object;II)V")
    public static final void method2436(int[] arg0, int arg1, Object[] arg2, int arg3, int arg4) {
        if (arg3 < arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            Object var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; var9++) {
                if (arg0[var9] < (var9 & 0x1) + var7) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    Object var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method2436(arg0, 1, arg2, arg3, var6 - 1);
            method2436(arg0, 1, arg2, var6 + 1, arg4);
        }
        field5319++;
        if (arg1 != 1) {
            method2440(-91);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)Z")
    public final boolean method2437(int arg0, int arg1, int arg2) {
        field5325++;
        if (this.field5310 <= arg2 && arg2 <= this.field5321 && this.field5312 <= arg1 && arg1 <= this.field5311) {
            return true;
        } else if (arg2 >= this.field5314 && arg2 <= this.field5317 && arg1 >= this.field5313 && arg1 <= this.field5322) {
            return true;
        } else {
            if (arg0 != Integer.MIN_VALUE) {
                method2436((int[]) null, 51, (Object[]) null, 119, -21);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)Z")
    public static final boolean method2438(int arg0) {
        field5323++;
        if (arg0 != 1) {
            field5324 = 116;
        }
        try {
            return class263.method1752((byte) -84);
        } catch (IOException var4) {
            class236.method1591(1045632600);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class188.field2717 + "," + class68.field771 + "," + class199.field2838 + " - " + class55.field658 + "," + (class384.field5422.field5677[0] + class114.field1403) + "," + (class41.field496 + class384.field5422.field5664[0]) + " - ";
            for (int var3 = 0; var3 < class55.field658 && var3 < 50; var3++) {
                var2 = var2 + class359.field5120.field3364[var3] + ",";
            }
            class422.method2663(var2, var5, -124);
            class71.method407(0);
            return true;
        }
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V")
    public static final void method2439(int arg0) {
        class176.field2402 = null;
        class235.field3298 = false;
        class210.field2989 = null;
        field5320++;
        class447.field6410 = null;
        class255.field3673 = null;
        class202.field2908 = null;
        if (arg0 != 12883) {
            method2441(-58, (byte) -18);
        }
        class406.method2593(false);
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)V")
    public static void method2440(int arg0) {
        if (arg0 == 16929) {
            field5318 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lnd;)V")
    public class377(class324 arg0) {
        this.field5315 = arg0;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)V")
    public static final void method2441(int arg0, byte arg1) {
        class313.method2062(-94);
        field5316++;
        class278.method1837((byte) -105);
        class399.method2540(true, arg1 ^ 0x6ABA, arg0);
        class91.method501(0, class151.field1873, class298.field4178, class335.field4752);
        class121.method768(class151.field1873, class298.field4178, (byte) -54);
        if (arg1 != -117) {
            return;
        }
        class233.method1541(class347.field4907, false);
        class72.method410(-21961);
        class406.method2593(false);
        if (class40.field475 == 10) {
            class208.method1359(-1, false);
        } else if (class40.field475 == 30) {
            class178.method1210(25, 67);
            return;
        } else if (class40.field475 == 5) {
            class291.method1930((byte) -44, class298.field4178, class151.field1873);
            return;
        }
    }
}
