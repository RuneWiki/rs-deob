import java.net.URL;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class38 {

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Lsc;")
    public class20 field556 = new class20();

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "[B")
    public static byte[] field562 = new byte[32896];

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Ljava/util/Calendar;")
    public static Calendar field567;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Lk;")
    public static class19 field569;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Lsc;")
    private class20 field566;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lsc;B)V", line = 9)
    public final void method247(class20 arg0, byte arg1) {
        if (arg1 > -85) {
            method249(1, -117);
        }
        if (arg0.field224 != null) {
            arg0.method120(126);
        }
        arg0.field224 = this.field556.field224;
        field559++;
        arg0.field233 = this.field556;
        arg0.field224.field233 = arg0;
        arg0.field233.field224 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V", line = 28)
    public static final void method248(int arg0, int arg1, int arg2) {
        class84.field1426 = (float) arg1;
        if (~class112.field1827 == arg2) {
            class176.field2818 = arg0;
            class194.field3095 = arg1;
        }
        field558++;
        class261.field4396 = (float) arg0;
        class29.method178(256);
        class175.field2807 = true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lpd;", line = 50)
    public static final class290 method249(int arg0, int arg1) {
        class290 var2 = (class290) class106.field1755.method2329((byte) 107, (long) arg0);
        field565++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class44.field694.method472(0, 102, arg0);
        class290 var4 = new class290(var3);
        var4.method1331(class34.field504, (int[]) null);
        class106.field1755.method2333((long) arg0, 0, var4);
        if (arg1 >= -27) {
            field562 = (byte[]) null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Lsc;", line = 72)
    public final class20 method250(int arg0) {
        class20 var2 = this.field566;
        field563++;
        if (this.field556 == var2) {
            this.field566 = null;
            return null;
        } else {
            this.field566 = var2.field233;
            return arg0 <= 49 ? (class20) null : var2;
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 255)
    public class38() {
        this.field556.field224 = this.field556;
        this.field556.field233 = this.field556;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)I", line = 100)
    public final int method251(int arg0) {
        field557++;
        int var2 = arg0;
        class20 var3 = this.field556.field233;
        while (this.field556 != var3) {
            var3 = var3.field233;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(JJ)J", line = 118)
    public static long method252(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V", line = 126)
    public static void method253(boolean arg0) {
        field562 = null;
        field569 = null;
        field567 = null;
        if (arg0) {
            field562 = (byte[]) null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field562[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field567 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field570 = 0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Lsc;", line = 161)
    public final class20 method254(byte arg0) {
        field561++;
        class20 var2 = this.field556.field233;
        if (this.field556 == var2) {
            this.field566 = null;
            return null;
        }
        this.field566 = var2.field233;
        if (arg0 != -96) {
            field569 = (class19) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZLth;BLth;)Lui;", line = 203)
    public static final class257 method255(int arg0, boolean arg1, class57 arg2, byte arg3, class57 arg4) {
        boolean var5 = true;
        int[] var6 = arg4.method458(arg0, 81);
        field564++;
        int var7 = 0;
        if (arg3 != 103) {
            method255(95, false, (class57) null, (byte) 68, (class57) null);
        }
        while (var7 < var6.length) {
            byte[] var8 = arg4.method465(arg0, var6[var7], -17211);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg2.method465(0, var9, arg3 ^ 0xFFFFBCA2);
                } else {
                    var10 = arg2.method465(var9, 0, -17211);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
            var7++;
        }
        if (!var5) {
            return null;
        }
        try {
            return new class257(arg4, arg2, arg0, arg1);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)Z", line = 265)
    public static final boolean method256(int arg0, int arg1) {
        field560++;
        class201 var2 = class291.method2108(arg0, (byte) 60);
        if (var2 == null) {
            return false;
        } else if (arg1 != 23611) {
            return true;
        } else if (class145.field2343 == 1 || class145.field2343 == 2 || class237.field3922 == 2) {
            class259.field4360 = var2.field3205;
            class194.field3096 = var2.field3209;
            if (class237.field3922 != 0) {
                class254.field4280 = class259.field4360 + 40000;
                class76.field1324 = class259.field4360 + 50000;
                class223.field3697 = class254.field4280;
            }
            return true;
        } else {
            String var3 = "";
            String var4 = "";
            if (class14.field155 != null) {
                var4 = "/p=" + class14.field155;
            }
            if (class237.field3922 != 0) {
                var3 = ":" + (var2.field3205 + 7000);
            }
            String var5 = "http://" + var2.field3209 + var3 + "/l=" + class204.field3223 + "/a=" + class240.field3973 + var4 + "/j" + (class350.field5564 ? "1" : "0") + ",o" + (class333.field5283 ? "1" : "0") + ",a2,m" + (class125.field2133 ? "1" : "0");
            try {
                class215.field3444.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }
}
