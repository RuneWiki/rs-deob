import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class80 {

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Lva;")
    public static class121 field1855 = class107.method797(" @whi@", -10983);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lva;")
    private static class121 field1853 = class107.method797("Connection timed out)3", -10983);

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field1862 = 0;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Lva;")
    public static class121 field1864 = field1853;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[I")
    public static int[] field1860;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "[[B")
    public static byte[][] field1866;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lbe;BI)V", line = 5)
    public static final void method548(class12 arg0, byte arg1, int arg2) {
        field1861++;
        if (arg1 != 0) {
            method552(26, -59, null, null, -64, -118, -26);
        }
        if (class59.field1392 == null) {
            class128.method999(2119418128, true, null, 0, (byte) 0, 255, 255);
            class5.field85[arg2] = arg0;
        } else {
            class59.field1392.field2507 = arg2 * 4 + 5;
            int var3 = class59.field1392.method822(-708753192);
            arg0.method98(arg1 + 255, var3);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 48)
    public static void method549(int arg0) {
        field1864 = null;
        if (arg0 <= 23) {
            method554(false, -101);
        }
        field1853 = null;
        field1866 = null;
        field1855 = null;
        field1860 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZII[BI)V", line = 62)
    public static final void method550(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field1856++;
        if (arg4 != 15204 || class5.field89 == null) {
            return;
        }
        if (class66.field1594 >= 0) {
            class77.field1791 = arg1;
            if (class66.field1594 == 0) {
                class97.field2164 = 1;
            } else {
                int var5 = class67.method475(class66.field1594, 0);
                int var6 = var5 - class28.field711;
                class97.field2164 = (var6 + 3600) / arg1;
                if (class97.field2164 < 1) {
                    class97.field2164 = 1;
                }
            }
            class48.field1162 = arg3;
            class95.field2110 = arg2;
            class66.field1591 = arg0;
        } else if (class97.field2164 == 0) {
            class8.method45((byte) -80, arg2, arg3, arg0);
        } else {
            class95.field2110 = arg2;
            class66.field1591 = arg0;
            class48.field1162 = arg3;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 126)
    public static final void method551(byte arg0) {
        if (arg0 > 75) {
            class46.field1072.method347(true);
            field1859++;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[Lcb;[BIII)V", line = 142)
    public static final void method552(int arg0, int arg1, class15[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        if (arg0 != -65) {
            return;
        }
        while (var7 < 4) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg6 + var12 > 0 && arg6 + var12 < 103 && arg4 + var13 > 0 && arg4 + var13 < 103) {
                        arg2[var7].field276[arg6 + var12][arg4 + var13] = class90.method614(arg2[var7].field276[arg6 + var12][arg4 + var13], -16777217);
                    }
                }
            }
            var7++;
        }
        class113 var8 = new class113(arg3);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class100.method675(arg1, arg4 + var11, 0, var9, arg5, 125, arg6 + var10, var8);
                }
            }
        }
        field1865++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(JI)V", line = 223)
    public static final void method553(long arg0, int arg1) {
        if (arg1 != -19259) {
            return;
        }
        field1857++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class8.field119; var3++) {
            if (class92.field2092[var3] == arg0) {
                class97.field2168 = true;
                class8.field119--;
                class82.field1888++;
                for (int var4 = var3; var4 < class8.field119; var4++) {
                    class128.field2962[var4] = class128.field2962[var4 + 1];
                    class41.field951[var4] = class41.field951[var4 + 1];
                    class92.field2092[var4] = class92.field2092[var4 + 1];
                }
                class60.field1437.method622(164, true);
                class60.field1437.method835(false, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)V", line = 268)
    public static final void method554(boolean arg0, int arg1) {
        field1854++;
        if (class96.field2146 == null) {
            return;
        }
        if (arg1 != 4) {
            method550(true, -118, -127, null, -127);
        }
        try {
            class113 var2 = new class113(4);
            var2.method836(0, arg0 ? 2 : 3);
            var2.method869(0, (byte) -119);
            class96.field2146.method296(var2.field2512, 4, 0, true);
        } catch (IOException var4) {
            try {
                class96.field2146.method293(-2);
            } catch (Exception var3) {
            }
            class58.field1347++;
            class96.field2146 = null;
        }
    }
}
