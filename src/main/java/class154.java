import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class154 {

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public int field2382 = -1;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public int field2397 = -1;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public int field2398 = 0;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public int field2394 = -1;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public int field2403 = 0;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public int field2399 = -1;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public int field2396 = -1;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public int field2389 = -1;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    public int field2408 = -1;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public int field2388 = 0;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public int field2386 = -1;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "I")
    public int field2410 = 0;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public int field2385 = -1;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public int field2411 = -1;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public int field2401 = -1;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "I")
    public int field2416 = -1;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    public int field2406 = 0;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "I")
    public int field2409 = 0;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public int field2380 = -1;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public int field2390 = -1;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public int field2395 = 0;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "I")
    public int field2412 = -1;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    public int field2419 = -1;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "I")
    public int field2417 = 0;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public int field2400 = -1;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "I")
    public int field2414 = 0;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public int field2420 = -1;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    public int field2405 = -1;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public int field2391 = -1;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public int field2387 = 0;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "I")
    public int field2422 = -1;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public int field2421 = -1;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Lab;")
    public static class269 field2383 = new class269();

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "[[I")
    public int[][] field2415;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)I")
    public static int method1048(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILeh;I)[Lib;")
    public static final class56[] method1049(int arg0, int arg1, class137 arg2, int arg3) {
        if (arg0 == -1) {
            field2413++;
            return class111.method714(arg3, arg1, arg2, arg0 ^ 0xFFFFFFC1) ? class111.method717(arg0 ^ 0x59) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lpd;BI)V")
    private final void method1050(class96 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field2405 = arg0.method549(255);
            this.field2396 = arg0.method549(255);
            if (this.field2396 == 65535) {
                this.field2396 = -1;
            }
            if (this.field2405 == 65535) {
                this.field2405 = -1;
            }
        } else if (arg2 == 2) {
            this.field2390 = arg0.method549(255);
        } else if (arg2 == 3) {
            this.field2416 = arg0.method549(255);
        } else if (arg2 == 4) {
            this.field2400 = arg0.method549(255);
        } else if (arg2 == 5) {
            this.field2421 = arg0.method549(255);
        } else if (arg2 == 6) {
            this.field2385 = arg0.method549(255);
        } else if (arg2 == 7) {
            this.field2382 = arg0.method549(255);
        } else if (arg2 == 8) {
            this.field2389 = arg0.method549(255);
        } else if (arg2 == 9) {
            this.field2397 = arg0.method549(255);
        } else if (arg2 == 26) {
            this.field2387 = (short) (arg0.method584(255) * 4);
            this.field2414 = (short) (arg0.method584(255) * 4);
        } else if (arg2 == 27) {
            if (this.field2415 == null) {
                this.field2415 = new int[12][];
            }
            int var4 = arg0.method584(255);
            this.field2415[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field2415[var4][var5] = arg0.method564(-99);
            }
        } else if (arg2 == 29) {
            this.field2409 = arg0.method584(255);
        } else if (arg2 == 30) {
            this.field2395 = arg0.method549(255);
        } else if (arg2 == 31) {
            this.field2398 = arg0.method584(255);
        } else if (arg2 == 32) {
            this.field2388 = arg0.method549(255);
        } else if (arg2 == 33) {
            this.field2417 = arg0.method564(-103);
        } else if (arg2 == 34) {
            this.field2403 = arg0.method584(255);
        } else if (arg2 == 35) {
            this.field2410 = arg0.method549(255);
        } else if (arg2 == 36) {
            this.field2406 = arg0.method564(-106);
        } else if (arg2 == 37) {
            this.field2391 = arg0.method584(255);
        } else if (arg2 == 38) {
            this.field2399 = arg0.method549(255);
        } else if (arg2 == 39) {
            this.field2420 = arg0.method549(255);
        } else if (arg2 == 40) {
            this.field2394 = arg0.method549(255);
        } else if (arg2 == 41) {
            this.field2380 = arg0.method549(255);
        } else if (arg2 == 42) {
            this.field2412 = arg0.method549(255);
        } else if (arg2 == 43) {
            arg0.method549(255);
        } else if (arg2 == 44) {
            arg0.method549(255);
        } else if (arg2 == 45) {
            arg0.method549(255);
        } else if (arg2 == 46) {
            this.field2408 = arg0.method549(255);
        } else if (arg2 == 47) {
            this.field2419 = arg0.method549(255);
        } else if (arg2 == 48) {
            this.field2386 = arg0.method549(255);
        } else if (arg2 == 49) {
            this.field2422 = arg0.method549(255);
        } else if (arg2 == 50) {
            this.field2401 = arg0.method549(255);
        } else if (arg2 == 51) {
            this.field2411 = arg0.method549(255);
        }
        field2418++;
        if (arg1 < 36) {
            this.field2419 = -45;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V")
    public static final void method1051(int arg0, int arg1) {
        field2393++;
        class88.field1082.method1695(arg1, arg0 + 1);
        class234.field3867.method1695(arg1, 0);
        if (arg0 != -1) {
            field2407 = -4;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Z")
    public static final boolean method1052(int arg0) {
        field2381++;
        class182 var1 = class118.field1671;
        synchronized (class118.field1671) {
            if (arg0 <= 88) {
                field2383 = null;
            }
            if (class242.field3985 == class157.field2533) {
                return false;
            } else {
                class143.field2258 = class105.field1408[class157.field2533];
                class206.field3292 = class238.field3929[class157.field2533];
                class157.field2533 = class157.field2533 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method1053(int arg0) {
        field2384++;
        String var1 = "www";
        if (class77.field969 != arg0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class272.field4343 != null) {
            var2 = "/p=" + class272.field4343;
        }
        return "http://" + var1 + ".runescape.com/l=" + class281.field4458 + "/a=" + class210.field3374 + var2 + "/";
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    public static void method1054(int arg0) {
        if (arg0 != -1) {
            field2407 = 44;
        }
        field2383 = null;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
    public final void method1055(int arg0) {
        field2404++;
        if (arg0 != -6802) {
            this.field2421 = -126;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static final void method1056(byte arg0) {
        field2402++;
        class57.field730.method1701((byte) 119);
        class275.field4400.method1701((byte) 122);
        int var1 = -107 % ((-arg0 - 51) / 33);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLpd;)V")
    public final void method1057(byte arg0, class96 arg1) {
        while (true) {
            int var3 = arg1.method584(255);
            if (var3 == 0) {
                if (arg0 != -84) {
                    this.field2405 = 67;
                }
                field2392++;
                return;
            }
            this.method1050(arg1, (byte) 80, var3);
        }
    }
}
