import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class122 extends class50 {

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    private final int field2222;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    private final int field2225;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    private final int field2226;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    private final int field2233;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Lq;")
    public static class174 field2219 = null;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Li;")
    private static class88 field2227 = class208.method1425(105, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Li;")
    public static class88 field2228 = field2227;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field2232 = 0;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BILnb;)Llj;")
    public static final class130 method828(byte arg0, int arg1, class144 arg2) {
        if (arg0 != -70) {
            return null;
        } else {
            ++field2223;
            return !class212.method1453((byte) 53, arg1, arg2) ? null : class27.method170((byte) 123);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
    public final void method371(int arg0, int arg1, int arg2) {
        ++field2220;
        int var4 = this.field2226 * arg1 >> 12;
        if (arg2 != 75) {
            field2227 = null;
        }
        int var5 = this.field2222 * arg1 >> 12;
        int var6 = this.field2233 * arg0 >> 12;
        int var7 = this.field2225 * arg0 >> 12;
        class225.method1516(super.field931, var5, var7, var6, super.field927, (byte) -112, super.field925, var4);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class136.method908(arg3, false);
        ++field2231;
        int var7 = 0;
        int var8 = -arg5 + arg3;
        if (~var8 > -1) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        if (arg6 >= 94) {
            if (~class49.field919 >= ~arg1 && arg1 <= class18.field279) {
                int[] var12 = class3.field42[arg1];
                int var13 = class156.method1060(class67.field1207, class12.field183, -108, -arg3 + arg4);
                int var14 = class156.method1060(class67.field1207, class12.field183, -108, arg3 + arg4);
                int var15 = class156.method1060(class67.field1207, class12.field183, -109, -var8 + arg4);
                int var16 = class156.method1060(class67.field1207, class12.field183, -117, arg4 - -var8);
                class230.method1536(var13, arg2, -7, var15, var12);
                class230.method1536(var15, arg0, -7, var16, var12);
                class230.method1536(var16, arg2, -7, var14, var12);
            }
            int var17 = -1;
            int var18 = -var8;
            int var19 = -1;
            while (~var9 < ~var7) {
                var19 += 2;
                var10 += var19;
                var17 += 2;
                var18 += var17;
                if (~var18 <= -1 && var11 >= 1) {
                    --var11;
                    class29.field482[var11] = var7;
                    var18 -= var11 << 1;
                }
                ++var7;
                if (var10 >= 0) {
                    --var9;
                    var10 -= var9 << 1;
                    int var20 = arg1 - var9;
                    int var21 = arg1 + var9;
                    if (~class49.field919 >= ~var21 && class18.field279 >= var20) {
                        if (var9 < var8) {
                            int var22 = class29.field482[var9];
                            int var23 = class156.method1060(class67.field1207, class12.field183, -108, arg4 - -var7);
                            int var24 = class156.method1060(class67.field1207, class12.field183, -116, -var7 + arg4);
                            int var25 = class156.method1060(class67.field1207, class12.field183, -103, arg4 + var22);
                            int var26 = class156.method1060(class67.field1207, class12.field183, -128, arg4 - var22);
                            if (~var21 >= ~class18.field279) {
                                int[] var27 = class3.field42[var21];
                                class230.method1536(var24, arg2, -7, var26, var27);
                                class230.method1536(var26, arg0, -7, var25, var27);
                                class230.method1536(var25, arg2, -7, var23, var27);
                            }
                            if (var20 >= class49.field919) {
                                int[] var28 = class3.field42[var20];
                                class230.method1536(var24, arg2, -7, var26, var28);
                                class230.method1536(var26, arg0, -7, var25, var28);
                                class230.method1536(var25, arg2, -7, var23, var28);
                            }
                        } else {
                            int var29 = class156.method1060(class67.field1207, class12.field183, -119, arg4 + var7);
                            int var30 = class156.method1060(class67.field1207, class12.field183, -104, -var7 + arg4);
                            if (~var21 >= ~class18.field279) {
                                class230.method1536(var30, arg2, -7, var29, class3.field42[var21]);
                            }
                            if (class49.field919 <= var20) {
                                class230.method1536(var30, arg2, -7, var29, class3.field42[var20]);
                            }
                        }
                    }
                }
                int var31 = arg1 + var7;
                int var32 = -var7 + arg1;
                if (~var31 <= ~class49.field919 && ~var32 >= ~class18.field279) {
                    int var33 = arg4 - -var9;
                    int var34 = arg4 - var9;
                    if (~class67.field1207 >= ~var33 && ~var34 >= ~class12.field183) {
                        int var35 = class156.method1060(class67.field1207, class12.field183, -116, var33);
                        int var36 = class156.method1060(class67.field1207, class12.field183, -112, var34);
                        if (var8 > var7) {
                            int var37 = ~var11 <= ~var7 ? var11 : class29.field482[var7];
                            int var38 = class156.method1060(class67.field1207, class12.field183, -109, arg4 + var37);
                            int var39 = class156.method1060(class67.field1207, class12.field183, -106, -var37 + arg4);
                            if (var31 <= class18.field279) {
                                int[] var40 = class3.field42[var31];
                                class230.method1536(var36, arg2, -7, var39, var40);
                                class230.method1536(var39, arg0, -7, var38, var40);
                                class230.method1536(var38, arg2, -7, var35, var40);
                            }
                            if (var32 >= class49.field919) {
                                int[] var41 = class3.field42[var32];
                                class230.method1536(var36, arg2, -7, var39, var41);
                                class230.method1536(var39, arg0, -7, var38, var41);
                                class230.method1536(var38, arg2, -7, var35, var41);
                            }
                        } else {
                            if (class18.field279 >= var31) {
                                class230.method1536(var36, arg2, -7, var35, class3.field42[var31]);
                            }
                            if (class49.field919 <= var32) {
                                class230.method1536(var36, arg2, -7, var35, class3.field42[var32]);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZ)V")
    public final void method373(int arg0, int arg1, boolean arg2) {
        int var4 = this.field2233 * arg1 >> 12;
        ++field2229;
        int var5 = this.field2225 * arg1 >> 12;
        if (arg2) {
            method829(-9, -124, 53, -17, -58, -3, (byte) 97);
        }
        int var6 = this.field2222 * arg0 >> 12;
        int var7 = this.field2226 * arg0 >> 12;
        class236.method1567(var5, super.field925, var7, var4, var6, (byte) 85);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIB)V")
    public final void method377(int arg0, int arg1, byte arg2) {
        ++field2224;
        int var4 = 103 % ((arg2 - -11) / 55);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILbj;Lud;)V")
    public static final void method830(int arg0, int arg1, class22 arg2, class222 arg3) {
        class90 var4 = new class90();
        var4.field1703 = arg2;
        ++field2230;
        var4.field1219 = (long) arg1;
        var4.field1702 = 1;
        if (arg0 != -1) {
            field2228 = null;
        }
        var4.field1714 = arg3;
        class248 var5 = class227.field4254;
        synchronized (class227.field4254) {
            class227.field4254.method1624(var4, 80);
        }
        class146.method979((byte) -128);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIIIII)V")
    public class122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2222 = arg3;
        this.field2225 = arg2;
        this.field2226 = arg1;
        this.field2233 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static void method831(int arg0) {
        field2227 = null;
        field2219 = null;
        field2228 = null;
        if (arg0 != 1) {
            field2228 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lnb;II)[Lrh;")
    public static final class193[] method832(class144 arg0, int arg1, int arg2) {
        ++field2221;
        if (arg1 != 30675) {
            return null;
        } else {
            return !class212.method1453((byte) 53, arg2, arg0) ? null : class174.method1245((byte) -90);
        }
    }
}
