import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class29 extends class69 {

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Lbc;")
    public static class105 field346;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)Z")
    public final boolean method191(int arg0) {
        if (arg0 != -2061) {
            this.method191(-76);
        }
        field344++;
        return (this.field350 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)V")
    public static void method192(boolean arg0) {
        field346 = null;
        if (!arg0) {
            field346 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)Z")
    public final boolean method193(int arg0) {
        if (arg0 != -380056356) {
            this.field350 = -39;
        }
        field357++;
        return ((this.field350 & 0x119C4711) >> 28) != 0;
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)I")
    public final int method194(int arg0) {
        field353++;
        if (arg0 != 1) {
            this.field349 = 101;
        }
        return (this.field350 & 0x1D6D97) >> 18;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Z")
    public final boolean method195(byte arg0) {
        field342++;
        if (arg0 == 87) {
            return ((this.field350 & 0x290A9E) >> 21) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
    public static final void method196(int arg0) {
        field356++;
        int var1 = class250.field4007;
        int var2 = class179.field2897;
        int var3 = class283.field4512;
        int var4 = class214.field3451;
        int var5 = 6116423;
        class63.method507(var1, var4, var2, var3, var5);
        class63.method507(var1 + 1, var4 + 1, var2 - arg0, 16, 0);
        class63.method510(var1 + 1, var4 + 18, var2 - 2, var3 + -19, 0);
        class283.field4524.method1121(class205.field3282, var1 + 3, var4 - -14, var5, -1);
        int var6 = class250.field4000;
        int var7 = class109.field1893;
        for (int var8 = 0; var8 < class202.field3248; var8++) {
            int var9 = var4 + ((class202.field3248 + -1 - var8) * 15) + 31;
            int var10 = 16777215;
            if (var7 > var1 && var7 < var1 + var2 && var6 > var9 - 13 && var6 < var9 + 3) {
                var10 = 16776960;
            }
            class283.field4524.method1121(class207.method1396((byte) 29, var8), var1 + 3, var9, var10, 0);
        }
        class296.method1976(15527, class250.field4007, class179.field2897, class214.field3451, class283.field4512);
    }

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)Z")
    public final boolean method197(int arg0) {
        if (arg0 != 1) {
            this.method195((byte) -126);
        }
        field354++;
        return (this.field350 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Z")
    public final boolean method198(int arg0, int arg1) {
        field359++;
        if (arg1 != 0) {
            this.field349 = 40;
        }
        return (this.field350 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)Z")
    public final boolean method199(byte arg0) {
        field348++;
        if (arg0 != 111) {
            this.method199((byte) 97);
        }
        return (this.field350 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "(I)Z")
    public final boolean method200(int arg0) {
        field352++;
        if (arg0 < 61) {
            method196(26);
        }
        return (this.field350 & 0x274A968A) >> 29 != 0;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)Z")
    public final boolean method201(byte arg0) {
        field351++;
        if (arg0 != 60) {
            this.field350 = -115;
        }
        return ((this.field350 & 0x62D35A) >> 22) != 0;
    }

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "(I)V")
    public static final void method202(int arg0) {
        class279.field4463.method1834(0);
        if (arg0 <= 90) {
            field346 = null;
        }
        field347++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method203(String arg0, byte arg1) {
        field345++;
        if (class151.field2420 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class88.method625(false);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class297.method1986(0, (String) null, true, "mem=" + var4 + "k");
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class88.method625(false);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class297.method1986(0, (String) null, true, "Memory before cleanup=" + var7 + "k");
                class184.method1258(16578);
                class88.method625(false);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class297.method1986(0, (String) null, true, "Memory after cleanup=" + var9 + "k");
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class297.method1986(0, (String) null, true, "Number of player models in cache:" + class225.method1490((byte) -111));
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class79.method589(true);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class30.field374.method1390(4);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class30.field374.method1380((byte) 24);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class250.field4006.method1668((byte) -83);
                class149.field2395.method1279(8397);
                class30.field374.method1386((byte) -99);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class243.field3899 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class233.method1539(25, (byte) 32);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class279.field4470 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class279.field4470 = false;
            }
            if (arg0.startsWith("::setba")) {
                class105.field1819 = class278.method1863(3934, arg0.substring(8));
                class101.method712(58, class250.field4006);
                class185.field2968 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class4.method31(class278.method1863(3934, arg0.substring(15)));
                class101.method712(120, class250.field4006);
                class185.field2968 = false;
            }
            if (arg0.startsWith("::fps ") && class92.field1312 != 0) {
                class261.method1713(class278.method1863(3934, arg0.substring(6)), false);
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class87.field1186 = class278.method1863(3934, arg0.substring(12).trim());
                class297.method1986(0, (String) null, true, "rect_debug=" + class87.field1186);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class178.field2891 = true;
            }
            arg0.startsWith("::hdr");
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class51.field712) {
                    class51.field712 = false;
                    class297.method1986(0, (String) null, true, "Forced tweening disabled.");
                } else {
                    class51.field712 = true;
                    class297.method1986(0, (String) null, true, "Forced tweening ENABLED!");
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class219.field3507) {
                    System.out.println("Shift-click disabled.");
                    class219.field3507 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class219.field3507 = true;
                }
            }
            if (arg0.equalsIgnoreCase("::getcgcoord")) {
                class297.method1986(0, (String) null, true, "x:" + (class197.field3179.field614 >> 7) + " z:" + (class197.field3179.field613 >> 7) + " groundh:" + class229.field3641[class28.field336][class197.field3179.field614 >> 7][class197.field3179.field613 >> 7]);
            }
        }
        if (arg1 <= 49) {
            method192(false);
        }
        class170.field2751++;
        class83.field1148.method1238(224, -136478397);
        class83.field1148.method1757(arg0.length() - 1, (byte) 109);
        class83.field1148.method1770(arg0.substring(2), (byte) 126);
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(II)V")
    public class29(int arg0, int arg1) {
        this.field350 = arg0;
        this.field349 = arg1;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)I")
    public final int method204(byte arg0) {
        if (arg0 != -18) {
            this.field349 = 5;
        }
        field355++;
        return class1.method8(this.field350, arg0 - 82);
    }
}
