import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class52 extends RuntimeException {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Ljava/lang/String;")
    public String field819;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field818;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Z")
    public static boolean field822 = false;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Ljava/awt/Frame;")
    public static Frame field823;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V", line = 8)
    public static void method384(byte arg0) {
        field823 = null;
        int var1 = 31 % ((arg0 + 39) / 40);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 17)
    public class52(Throwable arg0, String arg1) {
        this.field819 = arg1;
        this.field818 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 33)
    public static final void method385(int arg0) {
        for (int var1 = -1; var1 < class65.field1058; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class149.field2398[var1];
            }
            class30 var3 = class82.field1228[var2];
            if (var3 != null && var3.field1423 > 0) {
                var3.field1423--;
                if (var3.field1423 == 0) {
                    var3.field1451 = null;
                }
            }
        }
        if (arg0 != 12228) {
            return;
        }
        field826++;
        for (int var4 = 0; var4 < class77.field1173; var4++) {
            int var5 = class145.field2279[var4];
            class305 var6 = class138.field2196[var5];
            if (var6 != null && var6.field1423 > 0) {
                var6.field1423--;
                if (var6.field1423 == 0) {
                    var6.field1451 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IJ)V", line = 89)
    public static final void method386(int arg0, long arg1) {
        field824++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class319.field4971 < 100 || class53.field828) || class319.field4971 >= 200) {
            class252.method1782(class115.field1877, 0, "", false);
            return;
        }
        String var3 = class259.method1835((byte) 126, arg1);
        for (int var4 = 0; var4 < class319.field4971; var4++) {
            if (class110.field1824[var4] == arg1) {
                class252.method1782(var3 + class170.field2645, 0, "", false);
                return;
            }
        }
        for (int var5 = 0; var5 < class169.field2631; var5++) {
            if (class298.field4712[var5] == arg1) {
                class252.method1782(class239.field3725 + var3 + class189.field3003, 0, "", false);
                return;
            }
        }
        if (var3.equals(class19.field356.field494)) {
            class252.method1782(class176.field2765, 0, "", false);
            return;
        }
        class329.field5082[class319.field4971] = var3;
        class2.field12++;
        class110.field1824[class319.field4971] = arg1;
        class204.field3246[class319.field4971] = 0;
        class70.field1102[class319.field4971] = "";
        class274.field4265[class319.field4971] = 0;
        class28.field461[class319.field4971] = false;
        class169.field2625 = class200.field3157;
        class319.field4971++;
        class269.field4191.method246(false, arg0);
        class269.field4191.method760(arg1, true);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V", line = 156)
    public static final void method387(int arg0, byte arg1) {
        class99 var2 = class114.field1862;
        synchronized (class114.field1862) {
            class16.field319 = arg0;
            if (arg1 < 2) {
                method384((byte) -127);
            }
        }
        field821++;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V", line = 174)
    public static final void method388(int arg0) {
        field825++;
        class143.method1091(class76.field1165, (byte) 101);
        class256.field3956++;
        if (class79.field1203 && class143.field2261) {
            int var1 = class203.field3225;
            int var2 = var1 - class274.field4257;
            if (var2 < class198.field3140) {
                var2 = class198.field3140;
            }
            if (class76.field1165.field4608 + var2 > class198.field3140 + class6.field101.field4608) {
                var2 = class198.field3140 + class6.field101.field4608 - class76.field1165.field4608;
            }
            int var3 = class76.field1165.field4569;
            int var4 = var2 - class118.field1903;
            int var5 = class278.field4309;
            int var6 = var5 - class328.field5081;
            if (class54.field859 > var6) {
                var6 = class54.field859;
            }
            int var7 = class6.field101.field4505 + var2 - class198.field3140;
            if ((class54.field859 + class6.field101.field4499) < (class76.field1165.field4499 + var6)) {
                var6 = class54.field859 + class6.field101.field4499 - class76.field1165.field4499;
            }
            int var8 = class6.field101.field4578 + var6 - class54.field859;
            int var9 = var6 - class316.field4929;
            if (class256.field3956 > class76.field1165.field4446 && (var4 > var3 || var4 < -var3 || var9 > var3 || var9 < (-var3))) {
                class91.field1489 = true;
            }
            if (class76.field1165.field4469 != null && class91.field1489) {
                class88 var10 = new class88();
                var10.field1350 = var7;
                var10.field1357 = class76.field1165;
                var10.field1340 = class76.field1165.field4469;
                var10.field1347 = var8;
                class228.method1656(var10, (byte) -88);
            }
            if (class260.field4033 == 0) {
                if (class91.field1489) {
                    if (class76.field1165.field4519 != null) {
                        class88 var11 = new class88();
                        var11.field1350 = var7;
                        var11.field1357 = class76.field1165;
                        var11.field1340 = class76.field1165.field4519;
                        var11.field1347 = var8;
                        var11.field1346 = class63.field994;
                        class228.method1656(var11, (byte) -102);
                    }
                    if (class63.field994 != null && client.method1798(class76.field1165) != null) {
                        class269.field4191.method246(false, 51);
                        class269.field4191.method739(class63.field994.field4536, 108);
                        class269.field4191.method737(class76.field1165.field4536, 124);
                        class269.field4191.method773(-105, class63.field994.field4531);
                        class269.field4191.method729((byte) 25, class76.field1165.field4531);
                        class114.field1857++;
                    }
                } else if ((class76.field1170 == 1 || class19.method156(class65.field1062 - 1, 2000)) && class65.field1062 > 2) {
                    class282.method2006(97);
                } else if (class65.field1062 > 0) {
                    class148.method1145(81);
                }
                class76.field1165 = null;
            }
            int var12 = 112 % ((-arg0 - 57) / 63);
        } else if (class256.field3956 > 1) {
            class76.field1165 = null;
        }
    }
}
