import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class227 extends InputStream {

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field3597 = -1;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "[I")
    public static int[] field3595 = new int[4];

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!cc", name = "read", descriptor = "()I")
    public final int read() {
        field3596++;
        class96.method614(0, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIIILjk;IZJ)Z")
    public static final boolean method1576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class276 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class304.field4965 == class242.field3842;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class183.field2835 || var24 >= class90.field1391) {
                    return false;
                }
                class154 var25 = class27.field346[arg0][var15][var24];
                if (var25 != null && var25.field2431 >= 5) {
                    return false;
                }
            }
        }
        class114 var16 = new class114();
        var16.field1712 = arg11;
        var16.field1725 = arg0;
        var16.field1713 = arg5;
        var16.field1721 = arg6;
        var16.field1723 = arg7;
        var16.field1726 = arg8;
        var16.field1720 = arg9;
        var16.field1724 = arg1;
        var16.field1719 = arg2;
        var16.field1715 = arg1 + arg3 - 1;
        var16.field1714 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class27.field346[var22][var17][var20] == null) {
                        class27.field346[var22][var17][var20] = new class154(var22, var17, var20);
                    }
                }
                class154 var23 = class27.field346[arg0][var17][var20];
                var23.field2418[var23.field2431] = var16;
                var23.field2417[var23.field2431] = var21;
                var23.field2434 |= var21;
                var23.field2431++;
                if (var13 && class161.field2543[var17][var20] != 0) {
                    var14 = class161.field2543[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class161.field2543[var18][var19] == 0) {
                        class161.field2543[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class207.field3309[class259.field4255++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method1577(int arg0) {
        if (arg0 != 26061) {
            method1578(-106);
        }
        field3595 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public static final void method1578(int arg0) {
        field3598++;
        if (class103.field1551 != null) {
            class103.field1551.method1277(false);
            class103.field1551 = null;
        }
        class117.method762(-1);
        class148.method982();
        for (int var1 = 0; var1 < 4; var1++) {
            class183.field2841[var1].method943(arg0 ^ 0x7E);
        }
        class90.method584(721512226, false);
        System.gc();
        class300.method2077(2, -1);
        class6.field52 = false;
        class35.field441 = -1;
        class219.method1529(-198, true);
        class113.field1711 = 0;
        class266.field4370 = 0;
        class101.field1517 = 0;
        class254.field4063 = 0;
        class34.field414 = false;
        for (int var2 = 0; var2 < class263.field4340.length; var2++) {
            class263.field4340[var2] = null;
        }
        class249.field3964 = 0;
        class14.field195 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class300.field4925[var3] = null;
            class37.field483[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class76.field1188[var4] = null;
        }
        for (int var5 = arg0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class239.field3780[var5][var6][var7] = null;
                }
            }
        }
        class301.method2079((byte) -64);
        class45.field613 = 0;
        class75.method493(true);
        class176.method1180(true, true);
        try {
            class291.method2038("loggedout", 20042, class259.field4254.field4211);
        } catch (Throwable var8) {
        }
    }
}
