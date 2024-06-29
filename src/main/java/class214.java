import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class214 extends class102 {

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "I")
    private int field3980 = 585;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "Lqe;")
    public static class179 field3970 = class206.method1380("gleiten:", (byte) 22);

    @OriginalMember(owner = "client!u", name = "N", descriptor = "Lqe;")
    public static class179 field3968 = class206.method1380("Keine Antwort vom Server)3", (byte) -126);

    @OriginalMember(owner = "client!u", name = "W", descriptor = "Lqe;")
    public static class179 field3977 = class206.method1380("sl_back", (byte) 120);

    @OriginalMember(owner = "client!u", name = "S", descriptor = "Lqe;")
    public static class179 field3973 = class206.method1380("<col=ff0000>", (byte) -20);

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!u", name = "X", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "Llg;")
    public static class126 field3976;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field3980 = arg0.method1252(2);
        }
        if (arg2) {
            method1407((class52) null, (byte) 120, (class52) null, (class101) null, (class52) null);
        }
        ++field3971;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Throwable;)V")
    public static final void method1406(String arg0, boolean arg1, Throwable arg2) {
        ++field3978;
        if (!arg1) {
            method1407((class52) null, (byte) 43, (class52) null, (class101) null, (class52) null);
        }
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class196.method1313(arg2, (byte) 0);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class217.field4017.field7 != null) {
                class26 var8 = class217.field4017.method3(new URL(class217.field4017.field7.getCodeBase(), "clienterror.ws?c=" + class238.field4392 + "&u=" + class16.field445 + "&v1=" + class1.field13 + "&v2=" + class1.field12 + "&e=" + var7), (byte) 38);
                while (~var8.field595 == -1) {
                    class137.method873(1L, -967787128);
                }
                if (var8.field595 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field591;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class214() {
        super(0, true);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Leh;BLeh;Ljd;Leh;)Z")
    public static final boolean method1407(class52 arg0, byte arg1, class52 arg2, class101 arg3, class52 arg4) {
        ++field3972;
        class237.field4378 = arg3;
        if (arg1 >= -23) {
            return true;
        } else {
            class8.field252 = arg4;
            class32.field689 = arg2;
            class240.field4412 = arg0;
            return true;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Leb;ZI)V")
    public static final void method1408(class46 arg0, boolean arg1, int arg2) {
        ++field3981;
        if (class87.field1663 != null) {
            try {
                class87.field1663.method303(1);
            } catch (Exception var8) {
            }
            class87.field1663 = null;
        }
        class87.field1663 = arg0;
        class52.method345(arg1, 112);
        class144.field2623.field3432 = 0;
        class232.field4279 = 0;
        class192.field3576 = null;
        class73.field1439 = null;
        if (arg2 != 4096) {
            method1406((String) null, false, (Throwable) null);
        }
        while (true) {
            class116 var3 = (class116) class194.field3603.method913(0);
            if (var3 == null) {
                while (true) {
                    class116 var4 = (class116) class111.field2088.method913(0);
                    if (var4 == null) {
                        if (class91.field1737 != 0) {
                            try {
                                class185 var5 = new class185(4);
                                var5.method1230((byte) -79, 4);
                                var5.method1230((byte) -77, class91.field1737);
                                var5.method1222((byte) -122, 0);
                                class87.field1663.method307(arg2 + -4196, 0, var5.field3397, 4);
                            } catch (IOException var7) {
                                try {
                                    class87.field1663.method303(1);
                                } catch (Exception var6) {
                                }
                                ++class191.field3571;
                                class87.field1663 = null;
                            }
                        }
                        class202.field3739 = 0;
                        class190.field3538 = class80.method504(-1);
                        return;
                    }
                    class56.field1241.method1019(119, var4);
                    class174.field3115.method914(var4.field1694, var4, true);
                    ++class191.field3569;
                    --class91.field1738;
                }
            }
            class105.field1977.method914(var3.field1694, var3, true);
            ++class47.field1022;
            --class80.field1543;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field3975;
            int[] var3 = super.field1960.method699((byte) -74, arg1);
            if (super.field1960.field2007) {
                int var4 = class94.field1769[arg1];
                for (int var5 = 0; var5 < class155.field2796; ++var5) {
                    int var6 = class124.field2292[var5];
                    if (~var6 < ~this.field3980 && 4096 - this.field3980 > var6 && -this.field3980 + 2048 < var4 && var4 < this.field3980 + 2048) {
                        int var7 = -var6 + 2048;
                        int var8 = var7 < 0 ? -var7 : var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field3980 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (var6 > 2048 - this.field3980 && ~var6 > ~(this.field3980 + 2048)) {
                        int var11 = var4 + -2048;
                        int var12 = ~var11 <= -1 ? var11 : -var11;
                        int var13 = var12 - this.field3980;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field3980 + 2048);
                    } else if (this.field3980 <= var4 && var4 <= 4096 - this.field3980) {
                        if (~var6 <= ~this.field3980 && ~var6 >= ~(-this.field3980 + 4096)) {
                            var3[var5] = 0;
                        } else {
                            int var15 = 2048 - var4;
                            int var16 = ~var15 <= -1 ? var15 : -var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field3980 + 2048);
                            var3[var5] = 4096 - var18;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = var19 >= 0 ? var19 : -var19;
                        int var21 = var20 - this.field3980;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field3980 + 2048);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIZ)I")
    public static final int method1409(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1408((class46) null, true, -82);
        }
        ++field3974;
        if (~arg1 > ~arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (~arg0 != -1) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
    public static void method1410(int arg0) {
        field3970 = null;
        field3968 = null;
        field3977 = null;
        if (arg0 != 4096) {
            method1410(25);
        }
        field3973 = null;
        field3976 = null;
    }
}
