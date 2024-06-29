import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class263 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "[I")
    private int[] field3744;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field3748 = 0;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "[I")
    public static int[] field3749;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
    public static final int method1620(int arg0) {
        field3746++;
        try {
            if (class286.field4090 == 0) {
                if ((class109.method653(false) - 5000L) < class348.field5039) {
                    return 0;
                }
                class380.field5670 = class86.field1182.method333(class195.field2767, (byte) 111, class437.field6397);
                class33.field541 = class109.method653(false);
                class286.field4090 = 1;
            }
            if (class109.method653(false) > class33.field541 + 30000L) {
                return class72.method489(true, 1000);
            }
            if (class286.field4090 == 1) {
                if (class380.field5670.field6417 == 2) {
                    return class72.method489(true, 1001);
                }
                if (class380.field5670.field6417 != 1) {
                    return -1;
                }
                class22.field294 = new class350((Socket) class380.field5670.field6416, class86.field1182);
                class380.field5670 = null;
                int var1 = 0;
                if (class464.field6730) {
                    var1 = class289.field4139;
                }
                class79.field1108.field2018 = 0;
                class79.field1108.method947(-61, class58.field898.field5608);
                class79.field1108.method969(arg0 ^ 0x4D9F, var1);
                class22.field294.method2121(class79.field1108.field2018, class79.field1108.field2041, false, 0);
                class53.method400((byte) -71);
                int var2 = class22.field294.method2122((byte) -37);
                class53.method400((byte) -71);
                if (var2 != 0) {
                    return class72.method489(true, var2);
                }
                class286.field4090 = 2;
            }
            if (class286.field4090 == arg0) {
                if (class22.field294.method2120(arg0 ^ 0x5C) < 2) {
                    return -1;
                }
                class422.field6233 = class22.field294.method2122((byte) -37);
                class422.field6233 <<= 0x8;
                class422.field6233 += class22.field294.method2122((byte) -37);
                class505.field7702 = new byte[class422.field6233];
                class293.field4176 = 0;
                class286.field4090 = 3;
            }
            if (class286.field4090 != 3) {
                return -1;
            }
            int var3 = class22.field294.method2120(arg0 + 99);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > (class422.field6233 - class293.field4176)) {
                var3 = class422.field6233 - class293.field4176;
            }
            class22.field294.method2125(var3, (byte) -55, class505.field7702, class293.field4176);
            class293.field4176 += var3;
            if (class293.field4176 < class422.field6233) {
                return -1;
            } else if (class92.method570((byte) 111, class505.field7702)) {
                class345.field4994 = new class450[class202.field2805];
                int var4 = 0;
                for (int var5 = class161.field2097; var5 <= class219.field3083; var5++) {
                    class450 var6 = class469.method2749(var5, (byte) 19);
                    if (var6 != null) {
                        class345.field4994[var4++] = var6;
                    }
                }
                class112.field1468 = null;
                class415.field6148 = 0;
                class22.field294.method2123(122);
                class325.field4746 = 0;
                class505.field7702 = null;
                class22.field294 = null;
                class286.field4090 = 0;
                class348.field5039 = class109.method653(false);
                return 0;
            } else {
                return class72.method489(true, 1002);
            }
        } catch (IOException var7) {
            return class72.method489(true, 1003);
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "([I)V")
    public class263(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field3744 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field3744[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3744[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field3744[var5 + var5] = arg0[var4];
            this.field3744[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII)V")
    public static final void method1621(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3745++;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        if (arg2 >= -100) {
            field3749 = null;
        }
        class238.method1440(class41.field629[arg4], arg1, arg0 + arg3, -arg3 + arg0, -14726);
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class41.field629[arg4 + var6];
                int[] var10 = class41.field629[arg4 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class238.method1440(var9, arg1, var11, var12, -14726);
                class238.method1440(var10, arg1, var11, var12, -14726);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class41.field629[arg4 + var5];
            int[] var16 = class41.field629[arg4 - var5];
            class238.method1440(var15, arg1, var13, var14, -14726);
            class238.method1440(var16, arg1, var13, var14, -14726);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
    public final int method1622(int arg0, int arg1) {
        field3750++;
        int var3 = (this.field3744.length >> 1) - 1;
        int var4 = -35 % ((arg1 + 15) / 50);
        int var5 = var3 & arg0;
        while (true) {
            int var6 = this.field3744[var5 - (-var5 - 1)];
            if (var6 == -1) {
                return -1;
            }
            if (this.field3744[var5 + var5] == arg0) {
                return var6;
            }
            var5 = var3 & var5 + 1;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLhe;Lhe;)V")
    public static final void method1623(byte arg0, class239 arg1, class239 arg2) {
        field3747++;
        class211.field2993 = arg1;
        int var3 = 118 / ((21 - arg0) / 62);
        class131.field1665 = arg2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class479.field6919[arg0][var8][var14] == -class130.field1655) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class41.field628) + 1;
            int var10 = (arg3 << class41.field628) + 2;
            int var11 = class311.field4527[arg0].method848(arg1, arg3) + arg5;
            if (!class3.method18(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class41.field628) - 1;
            if (!class3.method18(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class41.field628) - 1;
            if (!class3.method18(var9, var11, var13)) {
                return false;
            } else if (class3.method18(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class76.method505(arg0, arg1, arg3)) {
            int var6 = arg1 << class41.field628;
            int var7 = arg3 << class41.field628;
            return class3.method18(var6 + 1, class311.field4527[arg0].method848(arg1, arg3) + arg5, var7 + 1) && class3.method18(class153.field1965 + var6 - 1, class311.field4527[arg0].method848(arg1 + 1, arg3) + arg5, var7 + 1) && class3.method18(class153.field1965 + var6 - 1, class311.field4527[arg0].method848(arg1 + 1, arg3 + 1) + arg5, class153.field1965 + var7 - 1) && class3.method18(var6 + 1, class311.field4527[arg0].method848(arg1, arg3 + 1) + arg5, class153.field1965 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static void method1625(int arg0) {
        field3749 = null;
        if (arg0 != -1) {
            field3749 = null;
        }
    }

    static {
        new class194("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field3749 = new int[1024];
    }
}
