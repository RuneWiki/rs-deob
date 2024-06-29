import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class273 extends class349 implements class351 {

    @OriginalMember(owner = "client!to", name = "J", descriptor = "B")
    private byte field4012;

    @OriginalMember(owner = "client!to", name = "O", descriptor = "B")
    private byte field4017;

    @OriginalMember(owner = "client!to", name = "M", descriptor = "Z")
    private boolean field4015;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "B")
    private byte field3996;

    @OriginalMember(owner = "client!to", name = "Z", descriptor = "S")
    private short field4028;

    @OriginalMember(owner = "client!to", name = "U", descriptor = "Z")
    private boolean field4023;

    @OriginalMember(owner = "client!to", name = "R", descriptor = "Z")
    private boolean field4020;

    @OriginalMember(owner = "client!to", name = "W", descriptor = "Z")
    private boolean field4025;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "Lqc;")
    public class95 field3997;

    @OriginalMember(owner = "client!to", name = "I", descriptor = "Loc;")
    private class93 field4011;

    @OriginalMember(owner = "client!to", name = "V", descriptor = "Z")
    public static boolean field4024 = true;

    @OriginalMember(owner = "client!to", name = "B", descriptor = "Ljava/lang/String;")
    public static String field4004 = "Loaded title screen";

    @OriginalMember(owner = "client!to", name = "v", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!to", name = "x", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!to", name = "z", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!to", name = "A", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!to", name = "C", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!to", name = "D", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!to", name = "E", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!to", name = "F", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!to", name = "G", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!to", name = "K", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!to", name = "L", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!to", name = "N", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!to", name = "P", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!to", name = "Q", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!to", name = "S", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!to", name = "T", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!to", name = "X", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!to", name = "Y", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!to", name = "ab", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!to", name = "H", descriptor = "Lj;")
    public static class269 field4010;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(Lnr;Z)Lg;")
    public final class433 method145(class437 arg0, boolean arg1) {
        ++field4002;
        if (this.field3997 == null) {
            return null;
        } else {
            if (arg1) {
                this.field4023 = false;
            }
            class116 var3 = arg0.method2026();
            var3.method809(super.field5179, super.field5182, super.field5175);
            class433 var4 = null;
            if (this.field4020) {
                var4 = class436.method2758(1, 12300);
            }
            this.field3997.method602(var3, var4 != null ? var4.field6381[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!to", name = "f", descriptor = "(I)V")
    public static final void method1746(int arg0) {
        ++field4022;
        int var1 = class114.field1556.method763(8, false);
        if (~class153.field2004 < ~var1) {
            for (int var2 = var1; var2 < class153.field2004; ++var2) {
                class188.field2557[class122.field1630++] = class66.field943[var2];
            }
        }
        if (class153.field2004 < var1) {
            throw new RuntimeException("gppov1");
        } else {
            class153.field2004 = 0;
            if (arg0 != 5816) {
                field4021 = -83;
            }
            for (int var3 = 0; var3 < var1; ++var3) {
                int var4 = class66.field943[var3];
                class194 var5 = class125.field1664[var4];
                int var6 = class114.field1556.method763(1, false);
                if (var6 == 0) {
                    class66.field943[class153.field2004++] = var4;
                    var5.field260 = class50.field698;
                } else {
                    int var7 = class114.field1556.method763(2, false);
                    if (~var7 == -1) {
                        class66.field943[class153.field2004++] = var4;
                        var5.field260 = class50.field698;
                        class159.field2085[class439.field6430++] = var4;
                    } else if (~var7 == -2) {
                        class66.field943[class153.field2004++] = var4;
                        var5.field260 = class50.field698;
                        int var8 = class114.field1556.method763(3, false);
                        var5.method135(var8, true, 1);
                        int var9 = class114.field1556.method763(1, false);
                        if (var9 == 1) {
                            class159.field2085[class439.field6430++] = var4;
                        }
                    } else if (var7 == 2) {
                        class66.field943[class153.field2004++] = var4;
                        var5.field260 = class50.field698;
                        if (class114.field1556.method763(1, false) != 1) {
                            int var10 = class114.field1556.method763(3, false);
                            var5.method135(var10, true, 0);
                        } else {
                            int var11 = class114.field1556.method763(3, false);
                            var5.method135(var11, true, 2);
                            int var12 = class114.field1556.method763(3, false);
                            var5.method135(var12, true, 2);
                        }
                        int var13 = class114.field1556.method763(1, false);
                        if (~var13 == -2) {
                            class159.field2085[class439.field6430++] = var4;
                        }
                    } else if (var7 == 3) {
                        class188.field2557[class122.field1630++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I")
    public final int method160(int arg0) {
        ++field4009;
        if (arg0 != -22056) {
            this.method161((class437) null, 63);
        }
        return this.field3996;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lnr;Lta;IIIIZIIZ)V")
    public class273(class437 arg0, class404 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class132.method891(arg8, arg7, -47));
        this.field4012 = (byte) arg2;
        super.field5179 = (short) arg3;
        this.field4017 = (byte) arg8;
        this.field4015 = arg9;
        this.field3996 = (byte) arg7;
        this.field4028 = (short) arg1.field6059;
        super.field5175 = (short) arg5;
        this.field4023 = arg6;
        this.field4020 = arg1.field6009 != 0 && !arg6;
        this.field4025 = arg0.method2086() && arg1.field6081 && !this.field4023 && class176.field2300 != 0;
        int var11 = 1024;
        if (this.field4015) {
            var11 |= 32768;
        }
        class284 var12 = this.method1749((byte) -126, this.field4025, arg0, var11);
        if (var12 != null) {
            this.field3997 = var12.field4144;
            this.field4011 = var12.field4143;
            if (this.field4015) {
                this.field3997 = this.field3997.method628((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1747(String arg0, int arg1, int arg2) {
        ++field3998;
        class256 var3 = class363.method2385(3, arg2, (byte) 1);
        var3.method1614(arg1 ^ arg1);
        var3.field3753 = arg0;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIZIII)V")
    public static final void method1748(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        ++field4016;
        class249 var7 = class358.method2355(arg2, arg6, (byte) -111);
        if (var7 != null && var7.field3575 != null) {
            class228 var8 = new class228();
            var8.field3210 = var7;
            var8.field3215 = var7.field3575;
            class365.method2395(var8);
        }
        class94.field1304 = arg2;
        class369.field5488 = arg4;
        class168.field2212 = arg5;
        if (!arg3) {
            class19.field314 = arg1;
            class95.field1307 = true;
            class300.field4307 = arg6;
            class86.field1206 = arg0;
            class392.method2564(-74, var7);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILnr;II)Z")
    public final boolean method159(int arg0, class437 arg1, int arg2, int arg3) {
        if (arg3 < 12) {
            return false;
        } else {
            ++field4027;
            class95 var5 = this.method1752((byte) 119, arg1, 65536);
            if (var5 != null) {
                class116 var6 = arg1.method2026();
                var6.method809(super.field5179, super.field5182, super.field5175);
                return var5.method619(arg2, arg0, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BLnr;IIZLcb;I)V")
    public final void method153(byte arg0, class437 arg1, int arg2, int arg3, boolean arg4, class387 arg5, int arg6) {
        ++field4000;
        if (arg0 >= -116) {
            this.method1749((byte) -6, false, (class437) null, 80);
        }
        if (!(arg5 instanceof class273)) {
            if (arg5 instanceof class347) {
                class347 var8 = (class347) arg5;
                if (this.field3997 != null && var8.field5157 != null) {
                    this.field3997.method616(var8.field5157, arg3, arg6, arg2, arg4);
                    return;
                }
            }
        } else {
            class273 var9 = (class273) arg5;
            if (this.field3997 == null || var9.field3997 == null) {
                return;
            }
            this.field3997.method616(var9.field3997, arg3, arg6, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BZLnr;I)Lbc;")
    private final class284 method1749(byte arg0, boolean arg1, class437 arg2, int arg3) {
        ++field4019;
        class404 var5 = class165.method1020(this.field4028 & 65535, 119);
        if (arg0 > -113) {
            return null;
        } else {
            class337 var6;
            class337 var7;
            if (!this.field4023) {
                var6 = class198.field2829[this.field4012];
                if (this.field4012 < 3) {
                    var7 = class198.field2829[this.field4012 - -1];
                } else {
                    var7 = null;
                }
            } else {
                var6 = class425.field6324[this.field4012];
                var7 = class198.field2829[0];
            }
            return var5.method2622(this.field3996, arg2, var6, this.field4017, super.field5175, super.field5179, super.field5182, arg3, var7, 118, arg1);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILjava/lang/String;I)I")
    public static final int method1750(int arg0, String arg1, int arg2) {
        if (arg2 != 14006) {
            method1750(13, (String) null, -109);
        }
        ++field4014;
        return class152.method991(arg1, -8470, true, arg0);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BILnr;)Lqc;")
    public final class95 method147(byte arg0, int arg1, class437 arg2) {
        int var4 = -80 / ((arg0 - -32) / 61);
        ++field4026;
        return this.method1752((byte) 119, arg2, arg1);
    }

    @OriginalMember(owner = "client!to", name = "g", descriptor = "(B)V")
    public static void method1751(byte arg0) {
        field4010 = null;
        int var1 = -119 % ((arg0 - -21) / 34);
        field4004 = null;
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(B)V")
    public final void method158(byte arg0) {
        if (this.field3997 != null) {
            this.field3997.method587();
        }
        if (arg0 != 6) {
            this.field4011 = null;
        }
        ++field4001;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lnr;Z)V")
    public final void method156(class437 arg0, boolean arg1) {
        if (arg1) {
            field4024 = false;
        }
        ++field4029;
        Object var3 = null;
        class93 var5;
        if (this.field4011 == null && this.field4025) {
            class284 var4 = this.method1749((byte) -114, true, arg0, 131072);
            var5 = var4 != null ? var4.field4143 : null;
        } else {
            var5 = this.field4011;
            this.field4011 = null;
        }
        if (var5 != null) {
            class132.method897(var5, this.field4012, super.field5179, super.field5175, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(B)I")
    public final int method148(byte arg0) {
        if (arg0 != -68) {
            this.method147((byte) -108, 93, (class437) null);
        }
        ++field4018;
        return this.field4017;
    }

    @OriginalMember(owner = "client!to", name = "e", descriptor = "(B)Z")
    public final boolean method151(byte arg0) {
        if (arg0 != -115) {
            this.method159(67, (class437) null, -112, 83);
        }
        ++field4007;
        return this.field4015;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILnr;)V")
    public final void method154(int arg0, class437 arg1) {
        ++field3999;
        if (arg0 != 25510) {
            this.field3997 = null;
        }
        Object var3 = null;
        class93 var5;
        if (this.field4011 == null && this.field4025) {
            class284 var4 = this.method1749((byte) -121, true, arg1, 131072);
            var5 = var4 != null ? var4.field4143 : null;
        } else {
            var5 = this.field4011;
            this.field4011 = null;
        }
        if (var5 != null) {
            class8.method61(var5, this.field4012, super.field5179, super.field5175, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BLnr;I)Lqc;")
    private final class95 method1752(byte arg0, class437 arg1, int arg2) {
        ++field4008;
        if (this.field3997 != null && arg1.method2132(this.field3997.method594(), arg2) == 0) {
            return this.field3997;
        } else {
            class284 var4 = this.method1749((byte) -119, false, arg1, arg2);
            if (arg0 != 119) {
                return null;
            } else {
                return var4 == null ? null : var4.field4144;
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)Z")
    public final boolean method146(byte arg0) {
        if (arg0 < 102) {
            field4004 = null;
        }
        ++field4005;
        return this.field4025;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)I")
    public final int method150(byte arg0) {
        ++field4003;
        if (arg0 >= -110) {
            method1747((String) null, 6, 86);
        }
        return this.field4028 & 65535;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lnr;I)V")
    public final void method161(class437 arg0, int arg1) {
        ++field4013;
        if (arg1 != 0) {
            field4024 = true;
        }
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(I)V")
    public final void method163(int arg0) {
        this.field4015 = false;
        ++field4006;
        if (this.field3997 != null) {
            this.field3997.method589(this.field3997.method594() & -32769);
        }
        if (arg0 != 0) {
            this.method153((byte) -120, (class437) null, 95, 105, false, (class387) null, 93);
        }
    }
}
