import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class189 extends class19 {

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    private int field3023 = 0;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Luj;")
    private class132 field3013 = new class132(16);

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    private int field3035 = 0;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "Lbb;")
    private class49 field3036 = new class49();

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "J")
    private long field3038 = 0L;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Lbi;")
    private class27 field3006;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    private int field3020;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "Z")
    private boolean field3034;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "Lbb;")
    private class49 field3037;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    private int field3014;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    private int field3007;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Lbi;")
    private class27 field3001;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "Z")
    private boolean field3039;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lkj;")
    private class215 field3008;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lem;")
    private class292 field3011;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Lwj;")
    private class66 field3005;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    private static int field3019 = -1;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field3017 = 0;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "F")
    public static float field3028;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "Lni;")
    private class22 field3030;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "Z")
    private boolean field3033;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "[B")
    private byte[] field3027;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)I")
    public final int method1356(int arg0) {
        field3032++;
        if (this.field3030 == null) {
            return 0;
        } else {
            if (arg0 >= -108) {
                field3026 = -23;
            }
            return this.field3030.field411;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Lni;")
    public final class22 method119(int arg0) {
        field3018++;
        if (this.field3030 != null) {
            return this.field3030;
        }
        if (this.field3005 == null) {
            if (this.field3008.method1527(arg0 - 172)) {
                return null;
            }
            this.field3005 = this.field3008.method1533(this.field3020, 1220901488, true, (byte) 0, 255);
        }
        if (this.field3005.field1114) {
            return null;
        }
        byte[] var2 = this.field3005.method83(arg0);
        if (this.field3005 instanceof class15) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3030 = new class22(var2, this.field3014);
                if (this.field3030.field395 != this.field3007) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3030 = null;
                if (this.field3008.method1527(arg0 ^ 0xFFFFFF31)) {
                    this.field3005 = null;
                } else {
                    this.field3005 = this.field3008.method1533(this.field3020, 1220901488, true, (byte) 0, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3030 = new class22(var2, this.field3014);
            } catch (RuntimeException var4) {
                this.field3008.method1538(9);
                this.field3030 = null;
                if (this.field3008.method1527(-55)) {
                    this.field3005 = null;
                } else {
                    this.field3005 = this.field3008.method1533(this.field3020, 1220901488, true, (byte) 0, 255);
                }
                return null;
            }
            if (this.field3001 != null) {
                this.field3011.method2023(this.field3020, 2, var2, this.field3001);
            }
        }
        this.field3005 = null;
        if (this.field3006 != null) {
            this.field3023 = 0;
            this.field3027 = new byte[this.field3030.field405];
        }
        return this.field3030;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Lwj;")
    private final class66 method1357(int arg0, int arg1, int arg2) {
        field3000++;
        class66 var4 = (class66) this.field3013.method987(-103, (long) arg2);
        if (var4 != null && arg0 == 0 && !var4.field1106 && var4.field1114) {
            var4.method993(32);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field3006 == null || this.field3027[arg2] == -1) {
                    if (this.field3008.method1527(103)) {
                        return null;
                    }
                    var4 = this.field3008.method1533(arg2, 1220901488, true, (byte) 2, this.field3020);
                } else {
                    var4 = this.field3011.method2020(this.field3006, arg2, -1);
                }
            } else if (arg0 == 1) {
                if (this.field3006 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3011.method2019(arg2, (byte) 85, this.field3006);
            } else if (arg0 == 2) {
                if (this.field3006 == null) {
                    throw new RuntimeException();
                }
                if (this.field3027[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3008.method1520(-21)) {
                    return null;
                }
                var4 = this.field3008.method1533(arg2, 1220901488, false, (byte) 2, this.field3020);
            } else {
                throw new RuntimeException();
            }
            this.field3013.method986((long) arg2, true, var4);
        }
        if (arg1 < 50) {
            return null;
        } else if (var4.field1114) {
            return null;
        } else {
            byte[] var5 = var4.method83(255);
            if (!var4 instanceof class15) {
                try {
                    if (var5 == null || var5.length <= 2) {
                        throw new RuntimeException();
                    }
                    class265.field4429.reset();
                    class265.field4429.update(var5, 0, var5.length - 2);
                    int var9 = (int) class265.field4429.getValue();
                    if (this.field3030.field410[arg2] != var9) {
                        throw new RuntimeException();
                    }
                    this.field3008.field3648 = 0;
                    this.field3008.field3647 = 0;
                } catch (RuntimeException var12) {
                    this.field3008.method1538(9);
                    var4.method993(32);
                    if (var4.field1106 && !this.field3008.method1527(88)) {
                        class122 var10 = this.field3008.method1533(arg2, 1220901488, true, (byte) 2, this.field3020);
                        this.field3013.method986((long) arg2, true, var10);
                    }
                    return null;
                }
                var5[var5.length - 2] = (byte) (this.field3030.field394[arg2] >>> 8);
                var5[var5.length - 1] = (byte) this.field3030.field394[arg2];
                if (this.field3006 != null) {
                    this.field3011.method2023(arg2, 2, var5, this.field3006);
                    if (this.field3027[arg2] != 1) {
                        this.field3023++;
                        this.field3027[arg2] = 1;
                    }
                }
                if (!var4.field1106) {
                    var4.method993(32);
                }
                return var4;
            }
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class265.field4429.reset();
                class265.field4429.update(var5, 0, var5.length - 2);
                int var6 = (int) class265.field4429.getValue();
                if (this.field3030.field410[arg2] != var6) {
                    throw new RuntimeException();
                }
                int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
                if ((this.field3030.field394[arg2] & 0xFFFF) != var7) {
                    throw new RuntimeException();
                }
                if (this.field3027[arg2] != 1) {
                    this.field3023++;
                    this.field3027[arg2] = 1;
                }
                if (!var4.field1106) {
                    var4.method993(32);
                }
                return var4;
            } catch (Exception var11) {
                this.field3027[arg2] = -1;
                var4.method993(32);
                if (var4.field1106 && !this.field3008.method1527(-69)) {
                    class122 var8 = this.field3008.method1533(arg2, 1220901488, true, (byte) 2, this.field3020);
                    this.field3013.method986((long) arg2, true, var8);
                }
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)I")
    public final int method1358(byte arg0) {
        field3012++;
        if (this.field3030 == null) {
            return 0;
        } else if (this.field3034) {
            class134 var2 = this.field3037.method309(0);
            if (var2 == null) {
                return 0;
            } else if (arg0 == -55) {
                return (int) var2.field2213;
            } else {
                return 39;
            }
        } else {
            return this.field3030.field411;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method1359(String arg0, boolean arg1) {
        field3016++;
        if (class233.field3942 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class233.method1676(119);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class42.method248((byte) -56, "mem=" + var4 + "k");
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class233.method1676(94);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class42.method248((byte) -110, "Memory before cleanup=" + var7 + "k");
                class205.method1434((byte) -84);
                class233.method1676(92);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class42.method248((byte) -125, "Memory after cleanup=" + var9 + "k");
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class42.method248((byte) -124, "Number of player models in cache:" + class46.method296(0));
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class238.method1704(0);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class277.field4611.method1537((byte) 32);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class277.field4611.method1528((byte) 42);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class142.field2344.method587(5000);
                class159.field2609.method1067((byte) -121);
                class277.field4611.method1524((byte) -86);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class217.field3669 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class240.method1719(25, 31136);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class121.field2032 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class121.field2032 = false;
            }
            if (arg0.startsWith("::setba")) {
                class16.field328 = class286.method1996(10466, arg0.substring(8));
                class116.method893((byte) 7, class142.field2344);
                class51.field864 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class139.method1031(class286.method1996(10466, arg0.substring(15)));
                class116.method893((byte) 7, class142.field2344);
                class51.field864 = false;
            }
            if (arg0.startsWith("::fps ") && class27.field470 != 0) {
                class233.method1674(class286.method1996(10466, arg0.substring(6)), -101);
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class227.field3842 = class286.method1996(10466, arg0.substring(12).trim());
                class42.method248((byte) -94, "rect_debug=" + class227.field3842);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class45.field701 = true;
            }
            arg0.startsWith("::hdr");
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class12.field205) {
                    class12.field205 = false;
                    class42.method248((byte) -115, "Forced tweening disabled.");
                } else {
                    class12.field205 = true;
                    class42.method248((byte) -123, "Forced tweening ENABLED!");
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class78.field1314) {
                    System.out.println("Shift-click disabled.");
                    class78.field1314 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class78.field1314 = true;
                }
            }
            if (arg0.equalsIgnoreCase("::getcgcoord")) {
                class42.method248((byte) -53, "x:" + (class16.field314.field715 >> 7) + " z:" + (class16.field314.field771 >> 7) + " groundh:" + class245.field4123[class182.field2898][class16.field314.field715 >> 7][class16.field314.field771 >> 7]);
            }
            if (arg0.equalsIgnoreCase("::getheight")) {
                class42.method248((byte) -90, "Height: " + class245.field4123[class182.field2898][class16.field314.field715 >> 7][class16.field314.field771 >> 7]);
            }
        }
        class236.field3980.method640((byte) 97, 137);
        class126.field2108++;
        if (arg1) {
            field3028 = -0.4511762F;
        }
        class236.field3980.method1780(arg0.length() - 1, 50);
        class236.field3980.method1786(-25149, arg0.substring(2));
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)I")
    public final int method1360(int arg0) {
        field3031++;
        if (this.method119(255) == null) {
            return this.field3005 == null ? 0 : this.field3005.method82(12027);
        } else if (arg0 == 11284) {
            return 100;
        } else {
            return 42;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    public final void method1361(byte arg0) {
        if (arg0 > -7) {
            this.method1362((byte) -103);
        }
        field3021++;
        if (this.field3037 == null || this.method119(255) == null) {
            return;
        }
        for (class134 var2 = this.field3036.method309(0); var2 != null; var2 = this.field3036.method312((byte) -74)) {
            int var3 = (int) var2.field2213;
            if (var3 < 0 || var3 >= this.field3030.field405 || this.field3030.field398[var3] == 0) {
                var2.method993(32);
            } else {
                if (this.field3027[var3] == 0) {
                    this.method1357(1, 97, var3);
                }
                if (this.field3027[var3] == -1) {
                    this.method1357(2, 64, var3);
                }
                if (this.field3027[var3] == 1) {
                    var2.method993(32);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I")
    public final int method115(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method1356(-102);
        }
        class66 var3 = (class66) this.field3013.method987(-107, (long) arg1);
        field3004++;
        return var3 == null ? 0 : var3.method82(12027);
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
    public final void method1362(byte arg0) {
        field3010++;
        if (arg0 != 62) {
            this.method1362((byte) -15);
        }
        if (this.field3037 != null) {
            if (this.method119(255) == null) {
                return;
            }
            if (this.field3034) {
                boolean var2 = true;
                for (class134 var3 = this.field3037.method309(0); var3 != null; var3 = this.field3037.method312((byte) -112)) {
                    int var5 = (int) var3.field2213;
                    if (this.field3027[var5] == 0) {
                        this.method1357(1, 74, var5);
                    }
                    if (this.field3027[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method993(32);
                    }
                }
                while (this.field3030.field398.length > this.field3035) {
                    if (this.field3030.field398[this.field3035] == 0) {
                        this.field3035++;
                    } else {
                        if (this.field3011.field4789 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field3027[this.field3035] == 0) {
                            this.method1357(1, 81, this.field3035);
                        }
                        if (this.field3027[this.field3035] == 0) {
                            var2 = false;
                            class134 var4 = new class134();
                            var4.field2213 = (long) this.field3035;
                            this.field3037.method311(108, var4);
                        }
                        this.field3035++;
                    }
                }
                if (var2) {
                    this.field3035 = 0;
                    this.field3034 = false;
                }
            } else if (this.field3033) {
                boolean var6 = true;
                for (class134 var7 = this.field3037.method309(0); var7 != null; var7 = this.field3037.method312((byte) -119)) {
                    int var9 = (int) var7.field2213;
                    if (this.field3027[var9] != 1) {
                        this.method1357(2, 66, var9);
                    }
                    if (this.field3027[var9] == 1) {
                        var7.method993(32);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field3030.field398.length > this.field3035) {
                    if (this.field3030.field398[this.field3035] == 0) {
                        this.field3035++;
                    } else {
                        if (this.field3008.method1520(-21)) {
                            var6 = false;
                            break;
                        }
                        if (this.field3027[this.field3035] != 1) {
                            this.method1357(2, 80, this.field3035);
                        }
                        if (this.field3027[this.field3035] != 1) {
                            class134 var8 = new class134();
                            var8.field2213 = (long) this.field3035;
                            var6 = false;
                            this.field3037.method311(110, var8);
                        }
                        this.field3035++;
                    }
                }
                if (var6) {
                    this.field3033 = false;
                    this.field3035 = 0;
                }
            } else {
                this.field3037 = null;
            }
        }
        if (!this.field3039 || this.field3038 > class188.method1355(-97)) {
            return;
        }
        for (class66 var10 = (class66) this.field3013.method982(-9570); var10 != null; var10 = (class66) this.field3013.method981(arg0 ^ 0xFFFFFFC1)) {
            if (!var10.field1114) {
                if (var10.field1109) {
                    if (!var10.field1106) {
                        throw new RuntimeException();
                    }
                    var10.method993(32);
                } else {
                    var10.field1109 = true;
                }
            }
        }
        this.field3038 = class188.method1355(124) + 1000L;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V")
    public static final void method1363(boolean arg0) {
        field3015++;
        int var1 = 0;
        if (!arg0) {
            return;
        }
        while (var1 < 5) {
            class71.field1210[var1] = false;
            var1++;
        }
        class169.field2739 = 5;
        class313.field5036 = -1;
        class209.field3533 = 0;
        class261.field4384 = 0;
        class21.field383 = -1;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V")
    public final void method1364(byte arg0) {
        field3029++;
        if (this.field3006 == null) {
            return;
        }
        this.field3033 = true;
        if (this.field3037 == null) {
            this.field3037 = new class49();
        }
        int var2 = 55 / ((arg0 + 12) / 54);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
    public final void method118(int arg0, boolean arg1) {
        field3024++;
        if (this.field3006 == null || arg1) {
            return;
        }
        for (class134 var3 = this.field3036.method309(0); var3 != null; var3 = this.field3036.method312((byte) -64)) {
            if (((long) arg0) == var3.field2213) {
                return;
            }
        }
        class134 var4 = new class134();
        var4.field2213 = (long) arg0;
        this.field3036.method311(105, var4);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lhg;I)V")
    public static final void method1365(class207 arg0, int arg1) {
        field3002++;
        int var2 = arg0.field3495;
        if (var2 == 324) {
            if (field3019 == -1) {
                class11.field191 = arg0.field3472;
                field3019 = arg0.field3432;
            }
            if (class250.field4232.field4702) {
                arg0.field3432 = field3019;
            } else {
                arg0.field3432 = class11.field191;
            }
            return;
        }
        if (arg1 != -7394) {
            field3028 = -0.33790627F;
        }
        if (var2 == 325) {
            if (field3019 == -1) {
                field3019 = arg0.field3432;
                class11.field191 = arg0.field3472;
            }
            if (class250.field4232.field4702) {
                arg0.field3432 = class11.field191;
            } else {
                arg0.field3432 = field3019;
            }
        } else if (var2 == 327) {
            arg0.field3370 = 150;
            arg0.field3366 = (int) (Math.sin((double) class275.field4598 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3393 = 5;
            arg0.field3381 = -1;
        } else if (var2 == 328) {
            if (class16.field314.field2069 == null) {
                arg0.field3453 = 0;
                arg0.field3381 = 0;
            } else {
                arg0.field3370 = 150;
                arg0.field3366 = (int) (Math.sin((double) class275.field4598 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field3393 = 5;
                arg0.field3381 = 2047;
                arg0.field3453 = class37.method230((byte) 32, class16.field314.field2069);
                arg0.field3445 = class16.field314.field763;
                arg0.field3365 = 0;
                arg0.field3512 = class16.field314.field756;
                arg0.field3501 = class16.field314.field782;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(B)I")
    public final int method1366(byte arg0) {
        field3025++;
        if (arg0 != 43) {
            this.field3005 = null;
        }
        return this.field3023;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method1367(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3003++;
        if (arg1 != 9) {
            method1363(false);
        }
        if (class301.method2056(arg1 ^ 0xFFFFFFF6, arg5)) {
            client.method728(class208.field3515[arg5], -1, arg2, arg6, arg7, arg4, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)V")
    public static final void method1368(int arg0, int arg1) {
        class185.field2958.method98(1, arg1);
        class90.field1486.method98(1, arg1);
        field3022++;
        if (arg0 != -13655) {
            method1368(98, -57);
        }
        class260.field4373.method98(1, arg1);
        class97.field1574.method98(arg0 + 13656, arg1);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)[B")
    public final byte[] method120(int arg0, int arg1) {
        field3009++;
        class66 var3 = this.method1357(0, 76, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method83(255);
            var3.method993(32);
            int var5 = -84 / ((arg1 + 25) / 38);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(ILbi;Lbi;Lkj;Lem;IIZ)V")
    public class189(int arg0, class27 arg1, class27 arg2, class215 arg3, class292 arg4, int arg5, int arg6, boolean arg7) {
        this.field3006 = arg1;
        this.field3020 = arg0;
        if (this.field3006 == null) {
            this.field3034 = false;
        } else {
            this.field3034 = true;
            this.field3037 = new class49();
        }
        this.field3014 = arg5;
        this.field3007 = arg6;
        this.field3001 = arg2;
        this.field3039 = arg7;
        this.field3008 = arg3;
        this.field3011 = arg4;
        if (this.field3001 != null) {
            this.field3005 = this.field3011.method2020(this.field3001, this.field3020, -1);
        }
    }
}
