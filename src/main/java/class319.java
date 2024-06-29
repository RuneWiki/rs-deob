import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class319 {

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "Z")
    public boolean field4526;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "[Z")
    public static boolean[] field4522 = new boolean[100];

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "Lfw;")
    public class716 field4521;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "Lfw;")
    public class716 field4524;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "Z")
    public boolean field4519;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)Z")
    public final boolean method2034(int arg0) {
        if (arg0 == -21416) {
            field4527++;
            return this.field4519 && !this.field4526;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
    public static void method2035(byte arg0) {
        field4522 = null;
        if (arg0 <= 8) {
            field4522 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
    public static final void method2036(int arg0) {
        if (arg0 != -17094) {
            method2038(-104, 59, null, false, -81, null);
        }
        field4525++;
        int var1 = class370.field5341.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class370.field5341[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class623.field8733; var4++) {
                    if (class611.field8607[var2] == class188.field2346[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class188.field2346[class623.field8733] = class611.field8607[var2];
                    var3 = class623.field8733++;
                }
                class511 var5 = new class511(class370.field5341[var2]);
                int var6 = 0;
                while (class370.field5341[var2].length > var5.field6962 && var6 < 511 && class429.field5988 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method3002(-1);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class611.field8607[var2] >> 8) * 64 - (class444.field6151 - var10);
                    int var13 = (class611.field8607[var2] & 0xFF) * 64 + var11 - class236.field3535;
                    class636 var14 = class104.field1201.method4318(var5.method3002(-1), arg0 + 16897);
                    class685 var15 = (class685) class450.field6288.method3669(false, (long) var7);
                    if (var15 == null && (var14.field8868 & 0x1) > 0 && class464.field6471 == var9 && var12 >= 0 && class741.field10208 > var14.field8899 + var12 && var13 >= 0 && class525.field7224 > var14.field8899 + var13) {
                        class359 var16 = new class359();
                        var16.field9186 = var7;
                        class685 var17 = new class685(var16);
                        class450.field6288.method3666((byte) 65, (long) var7, var17);
                        class669.field9376[class744.field10275++] = var17;
                        class425.field5934[class429.field5988++] = var7;
                        var16.field9132 = class533.field7336;
                        var16.method2258(-72, var14);
                        var16.method3742((byte) 31, var16.field5172.field8899);
                        var16.field9118 = var16.field5172.field8907 << 3;
                        var16.method3746(arg0 + 33477, var16.field5172.field8942 + 4 << 11 & 0x3F96, true);
                        var16.method2259(var13, var16.method3744(1), false, var12, true, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V")
    public final void method2037(int arg0) {
        if (this.field4521 != null) {
            this.field4521.method1125(arg0 + 5849);
        }
        field4520++;
        if (arg0 != -5828) {
            method2035((byte) 32);
        }
        this.field4519 = false;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Z)V")
    public class319(boolean arg0) {
        this.field4526 = arg0;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILha;ZILsha;)V")
    public static final void method2038(int arg0, int arg1, class473 arg2, boolean arg3, int arg4, class115 arg5) {
        if (arg3) {
            field4522 = null;
        }
        for (int var6 = 7; var6 >= 0; var6--) {
            for (int var7 = 127; var7 >= 0; var7--) {
                class691.method3920(true, false, -94557789);
                int var8 = var7 & 0x7F | (var6 & 0x7) << 7 | (arg0 & 0x3F) << 10;
                int var9 = class109.field1323[var8];
                class153.method1003(false, -2, true);
                arg2.method233((arg5.field1560 * var7 >> 7) + arg4, ((-var6 + 7) * arg5.field1517 >> 3) + arg1, (arg5.field1560 >> 7) + 1, (arg5.field1517 >> 3) + 1, var9, 0);
            }
        }
        field4523++;
    }
}
