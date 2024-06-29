import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class155 extends class182 {

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public static int field2629 = 0;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIILth;)V", line = 4)
    public static final void method1101(int arg0, int arg1, int arg2, int arg3, class98 arg4) {
        field2631++;
        if (class96.field1750 == arg4 || class137.field2343 >= 400) {
            return;
        }
        String var11;
        if (arg4.field1803 == 0) {
            boolean var5 = true;
            if (class96.field1750.field1774 != -1 && arg4.field1774 != -1) {
                int var6 = arg4.field1774 <= class96.field1750.field1774 ? arg4.field1774 : class96.field1750.field1774;
                int var7 = arg4.field1776 < class96.field1750.field1776 ? class96.field1750.field1776 : arg4.field1776;
                int var8 = var7 * 10 / 100 + var6 + 5;
                int var9 = class96.field1750.field1776 - arg4.field1776;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var8 < var9) {
                    var5 = false;
                }
            }
            String var10 = class141.field2383 == 1 ? class346.field5528 : class278.field4541;
            if (arg4.field1776 >= arg4.field1809) {
                var11 = arg4.method747(true, 60) + (var5 ? class301.method2156(arg4.field1776, (byte) 77, class96.field1750.field1776) : "<col=ffffff>") + " (" + var10 + arg4.field1776 + ")";
            } else {
                var11 = arg4.method747(true, 109) + (var5 ? class301.method2156(arg4.field1776, (byte) 77, class96.field1750.field1776) : "<col=ffffff>") + " (" + var10 + arg4.field1776 + "+" + (arg4.field1809 - arg4.field1776) + ")";
            }
        } else {
            var11 = arg4.method747(true, 81) + " (" + class36.field789 + arg4.field1803 + ")";
        }
        if (class222.field3674 == 1) {
            class358.method2530(class147.field2511 + " -> <col=ffffff>" + var11, (long) arg1, arg3, (short) 21, false, class363.field5744, arg2, class284.field4642);
            class299.field4851++;
        } else if (!class52.field1046) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class24.field623[var12] != null) {
                    class161.field2720++;
                    short var13 = 0;
                    if (class141.field2383 == 0 && class24.field623[var12].equalsIgnoreCase(class353.field5648)) {
                        if (class96.field1750.field1776 < arg4.field1776) {
                            var13 = 2000;
                        }
                        if (class96.field1750.field1782 != 0 && arg4.field1782 != 0) {
                            if (class96.field1750.field1782 == arg4.field1782) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class133.field2284[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    short var15 = class138.field2353[var12];
                    short var16 = (short) (var13 + var15);
                    class358.method2530("<col=ffffff>" + var11, (long) arg1, arg3, var16, false, class24.field623[var12], arg2, class223.field3694[var12]);
                }
            }
        } else if ((class332.field5295 & 0x8) != 0) {
            class358.method2530(class10.field287 + " -> <col=ffffff>" + var11, (long) arg1, arg3, (short) 50, false, class112.field2047, arg2, class13.field397);
            class57.field1124++;
        }
        if (arg0 <= 50) {
            field2629 = 82;
        }
        for (int var17 = 0; var17 < class137.field2343; var17++) {
            if (class107.field1938[var17] == 31) {
                class300.field4889[var17] = "<col=ffffff>" + var11;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)V", line = 135)
    public static final void method1102(int arg0, boolean arg1) {
        field2630++;
        class119.method865(arg0 ^ 0x2459);
        if (class334.field5326 != 30 && class334.field5326 != 25) {
            return;
        }
        class302.field4910++;
        if (class302.field4910 < 50 && !arg1) {
            return;
        }
        class302.field4910 = 0;
        if (arg0 != -13402) {
            method1102(-95, true);
        }
        if (!class136.field2321 && class127.field2224 != null) {
            class51.field1038.method291((byte) -125, 164);
            try {
                class127.field2224.method1645(class51.field1038.field2496, class51.field1038.field2435, -20326, 0);
                class51.field1038.field2435 = 0;
            } catch (IOException var3) {
                class136.field2321 = true;
            }
            class97.field1756++;
        }
        class119.method865(-4097);
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(II)Lie;", line = 174)
    public static final class99 method1103(int arg0, int arg1) {
        field2633++;
        class99 var2 = (class99) class235.field3851.method487(126, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -2) {
            field2629 = 47;
        }
        byte[] var3 = class119.field2116.method1404(class295.method2115(arg0, true), class351.method2503(arg0, -121), (byte) -82);
        class99 var4 = new class99();
        if (var3 != null) {
            var4.method754(new class146(var3), arg1 ^ 0x1);
        }
        class235.field3851.method491((long) arg0, -1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V", line = 203)
    public class155() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)[I", line = 209)
    public final int[] method125(int arg0, int arg1) {
        field2632++;
        if (arg0 != 2) {
            method1102(0, true);
        }
        int[] var3 = this.field3166.method775(arg1, 124);
        if (this.field3166.field1903) {
            int[][] var4 = this.method1291(arg1, (byte) 103, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class26.field672; var8++) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }
}
