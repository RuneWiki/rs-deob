import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class461 implements Runnable {

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "[Lfe;")
    public volatile class400[] field6843 = new class400[2];

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "Z")
    public volatile boolean field6849 = false;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "Z")
    public volatile boolean field6841 = false;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "Lri;")
    public static class73 field6846 = new class73(104, 18);

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "[I")
    public static int[] field6850 = new int[2];

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "Lji;")
    public class432 field6848;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "[S")
    public static short[] field6847;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)V")
    public static final void method2774(int arg0, int arg1) {
        field6845++;
        for (class337 var2 = class251.field3713.method2608(true); var2 != null; var2 = class251.field3713.method2603(103)) {
            if ((long) arg0 == (var2.field4736 >> 48 & 0xFFFFL)) {
                var2.method2049(-95);
            }
        }
        if (arg1 != 65535) {
            method2774(-105, -126);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2775(int arg0, int arg1, int arg2, int arg3) {
        if (!class186.method1279(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class192.field2815;
        int var5 = arg2 << class192.field2815;
        int var6 = class86.field1324[arg0].method201(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class192.field2815 - 7);
        int var8 = var6 - (0xE6 << class192.field2815 - 7);
        int var9 = var6 - (0xEE << class192.field2815 - 7);
        if (arg3 == 1) {
            if (var4 > class45.field722) {
                if (!class382.method2333(var4, var6, var5)) {
                    return false;
                }
                if (!class382.method2333(var4, var6, class143.field2134 + var5)) {
                    return false;
                }
                if (!class382.method2333(var4, var6, class352.field5398 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class382.method2333(var4, var7, var5)) {
                    return false;
                }
                if (!class382.method2333(var4, var7, class143.field2134 + var5)) {
                    return false;
                }
                if (!class382.method2333(var4, var7, class352.field5398 + var5)) {
                    return false;
                }
            }
            if (!class382.method2333(var4, var8, var5)) {
                return false;
            } else if (class382.method2333(var4, var8, class143.field2134 + var5)) {
                return class382.method2333(var4, var8, class352.field5398 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class170.field2527) {
                if (!class382.method2333(var4, var6, class352.field5398 + var5)) {
                    return false;
                }
                if (!class382.method2333(class143.field2134 + var4, var6, class352.field5398 + var5)) {
                    return false;
                }
                if (!class382.method2333(class352.field5398 + var4, var6, class352.field5398 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class382.method2333(var4, var7, class352.field5398 + var5)) {
                    return false;
                }
                if (!class382.method2333(class143.field2134 + var4, var7, class352.field5398 + var5)) {
                    return false;
                }
                if (!class382.method2333(class352.field5398 + var4, var7, class352.field5398 + var5)) {
                    return false;
                }
            }
            if (!class382.method2333(var4, var8, class352.field5398 + var5)) {
                return false;
            } else if (class382.method2333(class143.field2134 + var4, var8, class352.field5398 + var5)) {
                return class382.method2333(class352.field5398 + var4, var8, class352.field5398 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class45.field722) {
                if (!class382.method2333(class352.field5398 + var4, var6, var5)) {
                    return false;
                }
                if (!class382.method2333(class352.field5398 + var4, var6, class143.field2134 + var5)) {
                    return false;
                }
                if (!class382.method2333(class352.field5398 + var4, var6, class352.field5398 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class382.method2333(class352.field5398 + var4, var7, var5)) {
                    return false;
                }
                if (!class382.method2333(class352.field5398 + var4, var7, class143.field2134 + var5)) {
                    return false;
                }
                if (!class382.method2333(class352.field5398 + var4, var7, class352.field5398 + var5)) {
                    return false;
                }
            }
            if (!class382.method2333(class352.field5398 + var4, var8, var5)) {
                return false;
            } else if (class382.method2333(class352.field5398 + var4, var8, class143.field2134 + var5)) {
                return class382.method2333(class352.field5398 + var4, var8, class352.field5398 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class170.field2527) {
                if (!class382.method2333(var4, var6, var5)) {
                    return false;
                }
                if (!class382.method2333(class143.field2134 + var4, var6, var5)) {
                    return false;
                }
                if (!class382.method2333(class352.field5398 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class382.method2333(var4, var7, var5)) {
                    return false;
                }
                if (!class382.method2333(class143.field2134 + var4, var7, var5)) {
                    return false;
                }
                if (!class382.method2333(class352.field5398 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class382.method2333(var4, var8, var5)) {
                return false;
            } else if (class382.method2333(class143.field2134 + var4, var8, var5)) {
                return class382.method2333(class352.field5398 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class382.method2333(class143.field2134 + var4, var9, class143.field2134 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class382.method2333(var4, var8, class352.field5398 + var5);
        } else if (arg3 == 32) {
            return class382.method2333(class352.field5398 + var4, var8, class352.field5398 + var5);
        } else if (arg3 == 64) {
            return class382.method2333(class352.field5398 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class382.method2333(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)I")
    public static final int method2776(int arg0, int arg1) {
        field6840++;
        if (arg1 != 2077002250) {
            field6847 = null;
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public static void method2777(int arg0) {
        field6850 = null;
        if (arg0 != 64) {
            field6850 = null;
        }
        field6846 = null;
        field6847 = null;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ldh;B)Luf;")
    public static final class310 method2778(class209 arg0, byte arg1) {
        if (arg1 != -42) {
            method2774(-69, 30);
        }
        field6837++;
        return new class310(arg0.method1447(29480), arg0.method1447(29480), arg0.method1447(29480), arg0.method1447(29480), arg0.method1458((byte) -10), arg0.method1458((byte) -10), arg0.method1428(32122));
    }

    @OriginalMember(owner = "client!rs", name = "run", descriptor = "()V")
    public final void run() {
        this.field6841 = true;
        field6839++;
        try {
            while (!this.field6849) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class400 var2 = this.field6843[var1];
                    if (var2 != null) {
                        var2.method2409(-16934);
                    }
                }
                class246.method1659((byte) 117, 10L);
                class382.method2329((byte) 52, this.field6848, null);
            }
        } catch (Exception var9) {
            class235.method1598(var9, null, (byte) 37);
        } finally {
            Object var6 = null;
            this.field6841 = false;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II[Lvg;)V")
    public static final void method2779(int arg0, int arg1, class38[] arg2) {
        if (arg1 < 112) {
            field6850 = null;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class38 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field492 == 0) {
                    if (var4.field452 != null) {
                        method2779(arg0, 120, var4.field452);
                    }
                    class92 var5 = (class92) class431.field6450.method2605(false, (long) var4.field467);
                    if (var5 != null) {
                        class110.method677(arg0, false, var5.field1378);
                    }
                }
                if (arg0 == 0 && var4.field461 != null) {
                    class168 var6 = new class168();
                    var6.field2488 = var4;
                    var6.field2484 = var4.field461;
                    class360.method2238(var6);
                }
                if (arg0 == 1 && var4.field431 != null) {
                    if (var4.field547 >= 0) {
                        class38 var7 = class149.method979((byte) -108, var4.field467);
                        if (var7 == null || var7.field452 == null || var4.field547 >= var7.field452.length || var7.field452[var4.field547] != var4) {
                            continue;
                        }
                    }
                    class168 var8 = new class168();
                    var8.field2488 = var4;
                    var8.field2484 = var4.field431;
                    class360.method2238(var8);
                }
            }
        }
        field6844++;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2780(int arg0, String arg1) {
        class465.field6885 = arg1;
        field6842++;
        if (class483.field7077.field6462 == null) {
            return;
        }
        try {
            String var2 = class483.field7077.field6462.getParameter("cookieprefix");
            if (arg0 < 28) {
                method2778(null, (byte) -62);
            }
            String var3 = class483.field7077.field6462.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class80.method474((byte) 23, class256.method1708((byte) 118) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class501.method2993("document.cookie=\"" + var5 + "\"", class483.field7077.field6462, (byte) 8);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lvg;III)V")
    public static final void method2781(class38 arg0, int arg1, int arg2, int arg3) {
        field6838++;
        if (arg3 != -8212) {
            return;
        }
        if (arg0.field509 == 0) {
            arg0.field501 = arg0.field484;
        } else if (arg0.field509 == 1) {
            arg0.field501 = (arg2 - arg0.field472) / 2 + arg0.field484;
        } else if (arg0.field509 == 2) {
            arg0.field501 = arg2 - arg0.field484 - arg0.field472;
        } else if (arg0.field509 == 3) {
            arg0.field501 = arg0.field484 * arg2 >> 14;
        } else if (arg0.field509 == 4) {
            arg0.field501 = (arg0.field484 * arg2 >> 14) + (arg2 - arg0.field472) / 2;
        } else {
            arg0.field501 = arg2 - arg0.field472 - (arg0.field484 * arg2 >> 14);
        }
        if (arg0.field488 == 0) {
            arg0.field412 = arg0.field552;
        } else if (arg0.field488 == 1) {
            arg0.field412 = (arg1 - arg0.field553) / 2 + arg0.field552;
        } else if (arg0.field488 == 2) {
            arg0.field412 = arg1 - arg0.field552 - arg0.field553;
        } else if (arg0.field488 == 3) {
            arg0.field412 = arg0.field552 * arg1 >> 14;
        } else if (arg0.field488 == 4) {
            arg0.field412 = (arg0.field552 * arg1 >> 14) + (arg1 - arg0.field553) / 2;
        } else {
            arg0.field412 = arg1 - arg0.field553 - (arg0.field552 * arg1 >> 14);
        }
        if (!class187.field2783 || client.method1328(arg0).field5858 == 0 && arg0.field492 != 0) {
            return;
        }
        if (arg0.field501 < 0) {
            arg0.field501 = 0;
        } else if (arg2 < (arg0.field501 + arg0.field472)) {
            arg0.field501 = arg2 - arg0.field472;
        }
        if (arg0.field412 < 0) {
            arg0.field412 = 0;
        } else if (arg1 < (arg0.field412 + arg0.field553)) {
            arg0.field412 = arg1 - arg0.field553;
            return;
        }
    }
}
