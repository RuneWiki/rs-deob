import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class59 {

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field831 = 0;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field835 = 3;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field836 = 0;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public int field825;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "J")
    public long field837;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lhi;")
    public class219 field823;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Lhi;")
    public class219 field830;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Lhi;")
    public class219 field833;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)V")
    public static final void method422(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field827++;
        class287 var5 = class261.method1786(arg0, false, 8);
        var5.method1914((byte) 46);
        var5.field4549 = arg1;
        var5.field4550 = arg4;
        if (arg3 != -13524) {
            field836 = 69;
        }
        var5.field4547 = arg2;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZIJBI)Ljava/lang/String;")
    public static final String method423(boolean arg0, int arg1, long arg2, byte arg3, int arg4) {
        char var6 = ',';
        field829++;
        char var7 = '.';
        if (arg4 == 0) {
            var7 = ',';
            var6 = '.';
        }
        boolean var8 = false;
        if (arg3 < 11) {
            return null;
        }
        if (arg4 == 2) {
            var7 = ' ';
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 < 0L) {
            arg2 = -arg2;
            var8 = true;
        }
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (var11 + 48 - (int) arg2 * 10));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg2;
            arg2 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg2 * 10)));
            if (arg2 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILef;IZII)V")
    public static final void method424(int arg0, int arg1, class214 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg4) {
            return;
        }
        field834++;
        int var7 = arg0 * arg0 + arg3 * arg3;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg2.field3473 / 2, arg2.field3369 / 2);
        if (var7 <= (var8 * var8)) {
            class45.method339(arg3, 78, class35.field453[arg6], arg5, arg2, arg1, arg0);
            return;
        }
        var8 -= 10;
        int var9 = class29.field392 + class68.field957 & 0x7FF;
        int var10 = class171.field2680[var9];
        int var11 = class171.field2675[var9];
        int var12 = var10 * 256 / (class116.field1721 + 256);
        int var13 = var11 * 256 / (class116.field1721 + 256);
        int var14 = arg3 * var12 - arg0 * var13 >> 16;
        int var15 = arg0 * var12 + arg3 * var13 >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) ((double) var8 * Math.cos(var16));
        ((class12) class34.field430[arg6]).method79(arg2.field3473 / 2 + arg5 + var18 - 10, arg2.field3369 / 2 + arg1 + -var19 + -10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)Z")
    public static final boolean method425(byte arg0, int arg1) {
        class157 var2 = class245.method1655(5, arg1);
        field828++;
        if (var2 == null) {
            return false;
        } else if (class20.field248 == 1 || class20.field248 == 2 || class184.field2892 == 2) {
            class34.field442 = var2.field2422;
            class30.field402 = var2.field2421;
            if (class184.field2892 != 0) {
                class104.field1607 = class30.field402 + 50000;
                class198.field3109 = class30.field402 + 40000;
                class177.field2760 = class198.field3109;
            }
            return true;
        } else {
            String var3 = "";
            if (arg0 != -36) {
                method423(true, -56, -8L, (byte) -38, -43);
            }
            String var4 = "";
            if (class184.field2892 != 0) {
                var3 = ":" + (var2.field2421 + 7000);
            }
            if (class167.field2574 != null) {
                var4 = "/p=" + class167.field2574;
            }
            String var5 = "http://" + var2.field2422 + var3 + "/l=" + class48.field614 + "/a=" + class266.field4268 + var4 + "/j" + (class248.field3965 ? "1" : "0") + ",o" + (class201.field3141 ? "1" : "0") + ",a2,m" + (class236.field3776 ? "1" : "0");
            try {
                class215.field3506.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }
}
