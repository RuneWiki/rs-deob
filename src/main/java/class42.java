import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class42 {

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field636 = 0;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "J")
    public static long field630 = 0L;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field626 = 0;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field642 = 0;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "[Z")
    public static boolean[] field640 = new boolean[100];

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Lhc;")
    public static class235 field627;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "Lhc;")
    public static class235 field638;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)Z")
    public final boolean method275(byte arg0) {
        field631++;
        if (arg0 == 12) {
            return (this.field624 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BZ)V")
    public static final void method276(byte arg0, boolean arg1) {
        field633++;
        byte[][] var2 = class146.field2029;
        byte var3 = 4;
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            int var12 = class274.field4242[var5] & 0xFF;
            int var13 = class274.field4242[var5] >> 8;
            byte[] var14 = var2[var5];
            int var15 = var13 * 64 - class37.field565;
            int var16 = var12 * 64 - class216.field3255;
            if (var14 != null) {
                class156.method1038(false);
                var11 = class277.method1850(arg1, var14, class122.field1703, true, var16, var15, class37.field565, class216.field3255);
            }
            if (!arg1 && class101.field1422 / 8 == var13 && (class178.field2495 / 8) == var12) {
                if (var11 == null) {
                    class247.field3792 = -1;
                } else {
                    class216.field3259 = var11[1];
                    class30.field410 = var11[3];
                    class247.field3792 = var11[0];
                    class253.field3860 = var11[2];
                    class169.field2348 = var11[4];
                }
            }
        }
        int var6 = 0;
        if (arg0 != 57) {
            field626 = 75;
        }
        while (var6 < var4) {
            int var7 = (class274.field4242[var6] >> 8) * 64 - class37.field565;
            int var8 = (class274.field4242[var6] & 0xFF) * 64 - class216.field3255;
            byte[] var9 = var2[var6];
            if (var9 == null && class178.field2495 < 800) {
                class156.method1038(false);
                for (int var10 = 0; var10 < var3; var10++) {
                    class239.method1601(28663, 64, var10, var8, var7, 64);
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lhc;B)V")
    public static final void method277(class235 arg0, byte arg1) {
        field622++;
        if (arg1 >= -8) {
            field640 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Ltl;")
    public static final class68 method278(int arg0, int arg1) {
        if (arg1 != 7635) {
            field642 = 113;
        }
        field632++;
        if (arg0 == 0) {
            return new class257();
        } else if (arg0 == 1) {
            return new class150();
        } else if (arg0 == 2) {
            return new class265();
        } else if (arg0 == 3) {
            return new class129();
        } else if (arg0 == 4) {
            return new class29();
        } else if (arg0 == 5) {
            return new class146();
        } else if (arg0 == 6) {
            return new class194();
        } else if (arg0 == 7) {
            return new class104();
        } else if (arg0 == 8) {
            return new class202();
        } else if (arg0 == 9) {
            return new class156();
        } else if (arg0 == 10) {
            return new class53();
        } else if (arg0 == 11) {
            return new class165();
        } else if (arg0 == 12) {
            return new class297();
        } else if (arg0 == 13) {
            return new class289();
        } else if (arg0 == 14) {
            return new class10();
        } else if (arg0 == 15) {
            return new class249();
        } else if (arg0 == 16) {
            return new class114();
        } else if (arg0 == 17) {
            return new class160();
        } else if (arg0 == 18) {
            return new class17();
        } else if (arg0 == 19) {
            return new class247();
        } else if (arg0 == 20) {
            return new class179();
        } else if (arg0 == 21) {
            return new class16();
        } else if (arg0 == 22) {
            return new class238();
        } else if (arg0 == 23) {
            return new class163();
        } else if (arg0 == 24) {
            return new class252();
        } else if (arg0 == 25) {
            return new class184();
        } else if (arg0 == 26) {
            return new class167();
        } else if (arg0 == 27) {
            return new class274();
        } else if (arg0 == 28) {
            return new class193();
        } else if (arg0 == 29) {
            return new class221();
        } else if (arg0 == 30) {
            return new class131();
        } else if (arg0 == 31) {
            return new class283();
        } else if (arg0 == 32) {
            return new class116();
        } else if (arg0 == 33) {
            return new class233();
        } else if (arg0 == 34) {
            return new class273();
        } else if (arg0 == 35) {
            return new class5();
        } else if (arg0 == 36) {
            return new class21();
        } else if (arg0 == 37) {
            return new class73();
        } else if (arg0 == 38) {
            return new class51();
        } else if (arg0 == 39) {
            return new class214();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method279(int arg0) {
        field638 = null;
        if (arg0 < -9) {
            field640 = null;
            field627 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Z")
    public final boolean method280(byte arg0) {
        field623++;
        if (arg0 > -7) {
            method282(77, -89, (byte) -63, (class211[]) null, -54, true);
        }
        return (this.field624 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public static final void method281(int arg0) {
        field639++;
        class108.method698();
        if (arg0 != -5) {
            field626 = -60;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class122.field1703[var1].method1841((byte) 102);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIB[Lse;IZ)V")
    public static final void method282(int arg0, int arg1, byte arg2, class211[] arg3, int arg4, boolean arg5) {
        int var6 = 0;
        if (arg2 < 24) {
            field638 = null;
        }
        while (var6 < arg3.length) {
            class211 var7 = arg3[var6];
            if (var7 != null && var7.field3127 == arg1) {
                class13.method83(arg5, arg4, var7, arg0, 102);
                class148.method999(arg4, -951136957, arg0, var7);
                if (var7.field3066 > var7.field3165 - var7.field3112) {
                    var7.field3066 = var7.field3165 - var7.field3112;
                }
                if (var7.field3146 - var7.field3166 < var7.field3031) {
                    var7.field3031 = var7.field3146 - var7.field3166;
                }
                if (var7.field3066 < 0) {
                    var7.field3066 = 0;
                }
                if (var7.field3031 < 0) {
                    var7.field3031 = 0;
                }
                if (var7.field3035 == 0) {
                    class154.method1025(-127, arg5, var7);
                }
            }
            var6++;
        }
        field625++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method283(boolean arg0, String arg1) {
        field634++;
        if (class229.field3470 >= 2) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class163.method1082((byte) -87);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class283.method1900((String) null, "mem=" + var4 + "k", 0, true);
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class163.method1082((byte) 101);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class283.method1900((String) null, "Memory before cleanup=" + var7 + "k", 0, true);
                class237.method1591(11624);
                class163.method1082((byte) -77);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class283.method1900((String) null, "Memory after cleanup=" + var9 + "k", 0, true);
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class283.method1900((String) null, "Number of player models in cache:" + class217.method1410((byte) -119), 0, true);
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class282.method1892(-98);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class214.field3229.method629(true);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class214.field3229.method623(-2);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class200.field2784.method1645(5000);
                class290.field4567.method1964(5000);
                class214.field3229.method627((byte) 80);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class37.field562 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class145.method977(117, 25);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class172.field2389 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class172.field2389 = false;
            }
            if (arg1.startsWith("::setba")) {
                class219.field3294 = class149.method1002(arg1.substring(8), -111);
                class7.method45(class200.field2784, (byte) 126);
                class173.field2418 = false;
            }
            if (arg1.startsWith("::setparticles")) {
                class97.method643(class149.method1002(arg1.substring(15), -79));
                class7.method45(class200.field2784, (byte) -97);
                class173.field2418 = false;
            }
            if (arg1.startsWith("::fps ") && class34.field533 != 0) {
                class16.method93((byte) -121, class149.method1002(arg1.substring(6), -96));
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class193.field2669 = class149.method1002(arg1.substring(12).trim(), -110);
                class283.method1900((String) null, "rect_debug=" + class193.field2669, 0, true);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class19.field269 = true;
            }
            arg1.startsWith("::hdr");
            if (arg1.equalsIgnoreCase("::tween")) {
                if (class169.field2350) {
                    class169.field2350 = false;
                    class283.method1900((String) null, "Forced tweening disabled.", 0, true);
                } else {
                    class169.field2350 = true;
                    class283.method1900((String) null, "Forced tweening ENABLED!", 0, true);
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (class273.field4202) {
                    System.out.println("Shift-click disabled.");
                    class273.field4202 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class273.field4202 = true;
                }
            }
        }
        if (arg0) {
            method283(true, (String) null);
        }
        class198.field2751++;
        class281.field4359.method1864(98, (byte) -69);
        class281.field4359.method1447(arg1.length() - 1, 17363472);
        class281.field4359.method1472((byte) 67, arg1.substring(2));
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)Z")
    public final boolean method284(int arg0) {
        if (arg0 != -18254) {
            field640 = null;
        }
        field629++;
        return (this.field624 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)Z")
    public final boolean method285(int arg0) {
        field621++;
        if (arg0 >= -4) {
            return true;
        } else {
            return (this.field624 & 0x8) != 0;
        }
    }
}
