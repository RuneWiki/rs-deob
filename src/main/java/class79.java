import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public abstract class class79 {

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public int field1435;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Ls;")
    public static class261 field1432 = new class261(64);

    @OriginalMember(owner = "client!th", name = "i", descriptor = "Lmh;")
    public static class128 field1439 = class22.method156(125, "::clientjs5drop");

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Z")
    public static boolean field1443 = false;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "[Lhe;")
    public static class87[] field1441;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lql;I)V", line = 4)
    public static final void method505(class16 arg0, int arg1) {
        field1433++;
        if (arg0.field446 == 0) {
            return;
        }
        if (arg0.field458 != -1 && arg0.field458 < 32768) {
            class115 var2 = class201.field3560[arg0.field458];
            if (var2 != null) {
                int var3 = arg0.field478 - var2.field478;
                int var4 = arg0.field418 - var2.field418;
                if (var3 != 0 || var4 != 0) {
                    arg0.field476 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field458 >= 32768) {
            int var5 = arg0.field458 - 32768;
            if (class104.field1780 == var5) {
                var5 = 2047;
            }
            class123 var6 = class140.field2405[var5];
            if (var6 != null) {
                int var7 = arg0.field478 - var6.field478;
                int var8 = arg0.field418 - var6.field418;
                if (var7 != 0 || var8 != 0) {
                    arg0.field476 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field479 != 0 || arg0.field432 != 0) && (arg0.field414 == 0 || arg0.field459 > 0)) {
            int var9 = arg0.field478 + ((arg0.method118(-1) - 1) * 64 - (arg0.field479 - class221.field3889 - class221.field3889) * 64);
            int var10 = arg0.field418 - ((-class4.field72 + arg0.field432 + -class4.field72) * 64 + 64 - (arg0.method118(-1) * 64));
            if (var9 != 0 || var10 != 0) {
                arg0.field476 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field432 = 0;
            arg0.field479 = 0;
        }
        int var11 = arg0.field476 - arg0.field460 & 0x7FF;
        if (var11 == 0) {
            arg0.field428 = 0;
        } else {
            arg0.field428++;
            if (var11 > 1024) {
                arg0.field460 -= arg0.field446;
                boolean var12 = true;
                if (arg0.field446 > var11 || 2048 - arg0.field446 < var11) {
                    var12 = false;
                    arg0.field460 = arg0.field476;
                }
                if (arg0.field482 == arg0.field474 && (arg0.field428 > 25 || var12)) {
                    if (arg0.field481 == -1) {
                        arg0.field474 = arg0.field425;
                    } else {
                        arg0.field474 = arg0.field481;
                    }
                }
            } else {
                arg0.field460 += arg0.field446;
                boolean var13 = true;
                if (arg0.field446 > var11 || var11 > (2048 - arg0.field446)) {
                    var13 = false;
                    arg0.field460 = arg0.field476;
                }
                if (arg0.field482 == arg0.field474 && (arg0.field428 > 25 || var13)) {
                    if (arg0.field439 == -1) {
                        arg0.field474 = arg0.field425;
                    } else {
                        arg0.field474 = arg0.field439;
                    }
                }
            }
            arg0.field460 &= 0x7FF;
        }
        if (arg1 > -56) {
            field1441 = (class87[]) null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V", line = 134)
    public static final void method506(byte arg0, String arg1, Throwable arg2) {
        field1438++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class252.method1794((byte) -124, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class10.field352.field4677 == null) {
                return;
            }
            class23 var8 = class10.field352.method1894(0, new URL(class10.field352.field4677.getCodeBase(), "clienterror.ws?c=" + class152.field2620 + "&u=" + class306.field5211 + "&v1=" + class270.field4685 + "&v2=" + class270.field4671 + "&e=" + var7));
            while (var8.field560 == 0) {
                class177.method1213(0, 1L);
            }
            if (arg0 != -51) {
                method510((class314) null, (class314) null, (byte) 18, (class314) null);
            }
            if (var8.field560 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field562;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V", line = 189)
    public static void method507(byte arg0) {
        if (arg0 >= -2) {
            method510((class314) null, (class314) null, (byte) -117, (class314) null);
        }
        field1439 = null;
        field1432 = null;
        field1441 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)V", line = 201)
    public static final void method508(int arg0, byte arg1) {
        if (arg1 <= -60) {
            field1440++;
            class229 var2 = class241.method1638(1, 112, arg0);
            var2.method1566((byte) -3);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IBZ)Lmh;", line = 218)
    public static final class128 method509(int arg0, byte arg1, boolean arg2) {
        if (arg1 < 30) {
            method510((class314) null, (class314) null, (byte) -85, (class314) null);
        }
        field1434++;
        return class201.method1404(10, 104, arg0, arg2);
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(III)V", line = 256)
    public class79(int arg0, int arg1, int arg2) {
        this.field1437 = arg1;
        this.field1436 = arg2;
        this.field1435 = arg0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ldj;Ldj;BLdj;)V", line = 272)
    public static final void method510(class314 arg0, class314 arg1, byte arg2, class314 arg3) {
        field1442++;
        class30.field676 = arg1;
        class94.field1585 = arg3;
        class187.field3251 = arg0;
        if (arg2 != -1) {
            method506((byte) -83, (String) null, (Throwable) null);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
    public abstract void method151(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZI)V")
    public abstract void method154(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V")
    public abstract void method155(int arg0, int arg1, int arg2);
}
