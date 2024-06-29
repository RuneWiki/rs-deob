import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class155 extends class74 {

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "I")
    private int field2375 = -1;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    public static int field2358 = -1;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "Z")
    public static boolean field2366 = true;

    @OriginalMember(owner = "client!ib", name = "fb", descriptor = "J")
    public static long field2377 = 0L;

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "I")
    public static int field2373 = 0;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
    private int field2371;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "I")
    private int field2376;

    @OriginalMember(owner = "client!ib", name = "gb", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "Lja;")
    public static class59 field2365;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "[I")
    private int[] field2369;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2375 = arg1.method293(-12);
        }
        if (arg0 == -79) {
            ++field2361;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        ++field2374;
        int[][] var3 = super.field1248.method269(false, arg0);
        if (super.field1248.field550 && this.method1038((byte) 123)) {
            int var4 = (class209.field3248 != this.field2376 ? this.field2376 * arg0 / class209.field3248 : arg0) * this.field2371;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class178.field2662 == this.field2371) {
                for (int var8 = 0; class178.field2662 > var8; ++var8) {
                    int var9 = this.field2369[var4++];
                    var7[var8] = class3.method48(var9 << 4, 4080);
                    var6[var8] = class3.method48(65280, var9) >> 4;
                    var5[var8] = class3.method48(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; ~class178.field2662 < ~var10; ++var10) {
                    int var11 = this.field2371 * var10 / class178.field2662;
                    int var12 = this.field2369[var4 + var11];
                    var7[var10] = class3.method48(4080, var12 << 4);
                    var6[var10] = class3.method48(65280, var12) >> 4;
                    var5[var10] = class3.method48(var12, 16711680) >> 12;
                }
            }
        }
        if (arg1 >= -112) {
            method1045((String) null, (short) 21, (String) null, -11, -71, 124L, (byte) 15, 41);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)I")
    public final int method588(byte arg0) {
        if (arg0 != 115) {
            method1040(-49);
        }
        ++field2363;
        return this.field2375;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)Z")
    private final boolean method1038(byte arg0) {
        if (arg0 < 118) {
            return false;
        } else {
            ++field2378;
            if (this.field2369 != null) {
                return true;
            } else if (this.field2375 >= 0) {
                int var2 = class178.field2662;
                int var3 = class209.field3248;
                int var4 = !class242.field3741.method498(542, this.field2375).field3906 ? 128 : 64;
                this.field2369 = class242.field3741.method496((byte) -80, 1.0F, var4, var4, false, this.field2375);
                this.field2371 = var4;
                this.field2376 = var4;
                class78.method621(112, var3, var2);
                return this.field2369 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
    public static final void method1039(byte arg0) {
        ++field2372;
        class258.field3949.method1782(-101);
        if (arg0 > 0) {
            field2358 = 82;
        }
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V")
    public static void method1040(int arg0) {
        int var1 = -94 / ((18 - arg0) / 62);
        field2365 = null;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(IB)V")
    public static final void method1041(int arg0, byte arg1) {
        if (arg1 == 17) {
            ++field2359;
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (arg0 == 2) {
                        class228.method1514(-6);
                    } else if (arg0 != 3) {
                        throw new RuntimeException();
                    } else {
                        class238.method1604((byte) -86);
                    }
                } else {
                    class262.method1781(-127);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Luf;Luf;I)V")
    public static final void method1042(class176 arg0, class176 arg1, int arg2) {
        class131.field2028 = arg0;
        ++field2368;
        class207.field3211 = arg1;
        class105.field1687 = class131.field2028.method1165(3, 3);
        if (arg2 <= 102) {
            field2366 = false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(IB)V")
    public static final void method1043(int arg0, byte arg1) {
        int var2 = -79 / ((arg1 - -63) / 37);
        ++field2367;
        class116.field1808 = -1;
        class197.field3094 = -1;
        class140.field2155 = arg0;
        class273.method1840((byte) -44);
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
    public final void method91(int arg0) {
        ++field2364;
        super.method91(arg0);
        this.field2369 = null;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class155() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1044(String arg0, int arg1) {
        ++field2360;
        String var2 = class93.method733(class247.method1668(arg0, true), 0);
        if (var2 == null) {
            var2 = "";
        }
        return arg1 != 3 ? null : var2;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;SLjava/lang/String;IIJBI)V")
    public static final void method1045(String arg0, short arg1, String arg2, int arg3, int arg4, long arg5, byte arg6, int arg7) {
        ++field2370;
        if (!class64.field1025) {
            if (arg6 == 78) {
                if (~class220.field3450 > -501) {
                    class231.field3597[class220.field3450] = arg2;
                    class63.field1008[class220.field3450] = arg0;
                    class42.field686[class220.field3450] = ~arg4 != 0 ? arg4 : class119.field1835;
                    class80.field1341[class220.field3450] = arg1;
                    class13.field222[class220.field3450] = arg5;
                    class211.field3279[class220.field3450] = arg3;
                    class290.field4570[class220.field3450] = arg7;
                    ++class220.field3450;
                }
            }
        }
    }
}
