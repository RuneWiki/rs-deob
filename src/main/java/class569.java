import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class569 {

    @OriginalMember(owner = "client!hia", name = "g", descriptor = "[Lao;")
    public static class62[] field8064 = new class62[75];

    @OriginalMember(owner = "client!hia", name = "r", descriptor = "Ltm;")
    public static class334 field8075 = new class334(99, 6);

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "B")
    public byte field8058;

    @OriginalMember(owner = "client!hia", name = "d", descriptor = "B")
    public byte field8061;

    @OriginalMember(owner = "client!hia", name = "h", descriptor = "B")
    public byte field8065;

    @OriginalMember(owner = "client!hia", name = "i", descriptor = "B")
    public byte field8066;

    @OriginalMember(owner = "client!hia", name = "l", descriptor = "B")
    public byte field8069;

    @OriginalMember(owner = "client!hia", name = "t", descriptor = "B")
    public byte field8077;

    @OriginalMember(owner = "client!hia", name = "v", descriptor = "B")
    public byte field8079;

    @OriginalMember(owner = "client!hia", name = "z", descriptor = "F")
    public static float field8083;

    @OriginalMember(owner = "client!hia", name = "c", descriptor = "I")
    public static int field8060;

    @OriginalMember(owner = "client!hia", name = "o", descriptor = "I")
    public int field8072;

    @OriginalMember(owner = "client!hia", name = "p", descriptor = "I")
    public static int field8073;

    @OriginalMember(owner = "client!hia", name = "q", descriptor = "I")
    public int field8074;

    @OriginalMember(owner = "client!hia", name = "w", descriptor = "I")
    public int field8080;

    @OriginalMember(owner = "client!hia", name = "x", descriptor = "I")
    public static int field8081;

    @OriginalMember(owner = "client!hia", name = "y", descriptor = "I")
    public static int field8082;

    @OriginalMember(owner = "client!hia", name = "n", descriptor = "S")
    public short field8071;

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "Z")
    public boolean field8059;

    @OriginalMember(owner = "client!hia", name = "e", descriptor = "Z")
    public boolean field8062;

    @OriginalMember(owner = "client!hia", name = "f", descriptor = "Z")
    public boolean field8063;

    @OriginalMember(owner = "client!hia", name = "j", descriptor = "Z")
    public boolean field8067;

    @OriginalMember(owner = "client!hia", name = "k", descriptor = "Z")
    public boolean field8068;

    @OriginalMember(owner = "client!hia", name = "m", descriptor = "Z")
    public boolean field8070;

    @OriginalMember(owner = "client!hia", name = "s", descriptor = "Z")
    public boolean field8076;

    @OriginalMember(owner = "client!hia", name = "u", descriptor = "Z")
    public boolean field8078;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(Ljava/lang/String;IILfc;)Leha;", line = 9)
    public static final class162 method3300(String arg0, int arg1, int arg2, class731 arg3) {
        field8073++;
        if (arg2 == 0) {
            return arg3.method4072(28419, arg0);
        }
        if (arg1 < 76) {
            method3303((byte) -31);
        }
        if (arg2 == 1) {
            try {
                class284.method1863(new Object[] { (new URL(class351.field5138.getCodeBase(), arg0)).toString() }, "openjs", class351.field5138, -21119);
                class162 var4 = new class162();
                var4.field2512 = 1;
                return var4;
            } catch (Throwable var10) {
                class162 var5 = new class162();
                var5.field2512 = 2;
                return var5;
            }
        } else if (arg2 == 2) {
            try {
                class351.field5138.getAppletContext().showDocument(new URL(class351.field5138.getCodeBase(), arg0), "_blank");
                class162 var6 = new class162();
                var6.field2512 = 1;
                return var6;
            } catch (Exception var11) {
                class162 var7 = new class162();
                var7.field2512 = 2;
                return var7;
            }
        } else if (arg2 == 3) {
            try {
                class284.method1862(class351.field5138, "loggedout", (byte) 47);
            } catch (Throwable var13) {
            }
            try {
                class351.field5138.getAppletContext().showDocument(new URL(class351.field5138.getCodeBase(), arg0), "_top");
                class162 var8 = new class162();
                var8.field2512 = 1;
                return var8;
            } catch (Exception var12) {
                class162 var9 = new class162();
                var9.field2512 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIZ)V", line = 97)
    public static final void method3301(int arg0, int arg1, boolean arg2) {
        field8081++;
        int var3 = class632.field8881.method510(class641.field9017.method3621(104, class467.field6804), 174);
        int var5;
        if (class467.field6801) {
            for (class180 var4 = (class180) class26.field263.method3772(true); var4 != null; var4 = (class180) class26.field263.method3780(23774)) {
                int var6;
                if (var4.field3056 == 1) {
                    var6 = class271.method1785((byte) 64, (class208) var4.field3055.field9552.field3449);
                } else {
                    var6 = class695.method3879(var4, -124);
                }
                if (var6 > var3) {
                    var3 = var6;
                }
            }
            var3 += 8;
            var5 = class124.field1898 * 16 + 21;
            class232.field3742 = (class207.field3468 ? 26 : 22) + class124.field1898 * 16;
        } else {
            for (class208 var7 = (class208) class344.field5093.method3463((byte) -50); var7 != null; var7 = (class208) class344.field5093.method3469((byte) 107)) {
                int var10 = class271.method1785((byte) 112, var7);
                if (var3 < var10) {
                    var3 = var10;
                }
            }
            class232.field3742 = class608.field8588 * 16 + (class207.field3468 ? 26 : 22);
            var3 += 8;
            var5 = class608.field8588 * 16 + 21;
        }
        if (arg2) {
            field8082 = -73;
        }
        int var8 = arg1 - (var3 / 2);
        if (var8 + var3 > class660.field9408) {
            var8 = class660.field9408 - var3;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        if (var5 + arg0 > class412.field6066) {
            var9 = class412.field6066 - var5;
        }
        class713.field10029 = var8;
        if (var9 < 0) {
            var9 = 0;
        }
        class662.field9427 = var3;
        class32.field304 = true;
        class677.field9542 = var9;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(Lr;III[Z)Z", line = 182)
    public static final boolean method3302(class706 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class211.field3511 != class152.field2374) {
            int var6 = class121.field1867[arg1].method2162(arg3, 1, arg2);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class339 var8 = class121.field1867[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method2162(arg3, 1, arg2);
                    if (arg4 != null) {
                        arg4[var7] = var8.method624(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method618(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(B)V", line = 224)
    public static void method3303(byte arg0) {
        if (arg0 < 92) {
            method3300(null, 99, 6, null);
        }
        field8075 = null;
        field8064 = null;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(III)Z", line = 235)
    public static final boolean method3304(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method3300(null, -30, -21, null);
        }
        field8060++;
        return (arg2 & 0x800) != 0;
    }
}
