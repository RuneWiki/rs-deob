import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class365 {

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "Lp;")
    private class161 field4968 = new class161();

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    private int field4970;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    private int field4959;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "Ltm;")
    private class349 field4974;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
    public static int field4971 = 0;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "Lwo;")
    public static class285 field4965;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)V", line = 3)
    public final void method2286(int arg0, byte arg1) {
        if (arg1 != 36) {
            return;
        }
        if (class147.field1728 != null) {
            for (class129 var3 = (class129) this.field4968.method1027(-20578); var3 != null; var3 = (class129) this.field4968.method1023(72)) {
                if (var3.method824(arg1 + 5306)) {
                    if (var3.method825(100) == null) {
                        var3.method263(false);
                        var3.method1123((byte) -31);
                        this.field4959++;
                    }
                } else if ((++var3.field2090) > ((long) arg0)) {
                    class129 var4 = class147.field1728.method354(arg1 ^ 0xFFFFFFB4, var3);
                    this.field4974.method2227(var4, -8218, var3.field505);
                    class300.method1905(arg1 ^ 0x6B3D, var3, var4);
                    var3.method263(false);
                    var3.method1123((byte) -31);
                }
            }
        }
        field4973++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 52)
    public final Object method2287(int arg0) {
        field4967++;
        class129 var2 = (class129) this.field4974.method2222(arg0);
        while (var2 != null) {
            Object var3 = var2.method825(arg0 ^ 0x5A);
            if (var3 != null) {
                return var3;
            }
            class129 var4 = var2;
            var2 = (class129) this.field4974.method2215(false);
            var4.method263(false);
            var4.method1123((byte) -31);
            this.field4959++;
        }
        return null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(JI)V", line = 80)
    private final void method2288(long arg0, int arg1) {
        field4975++;
        int var4 = 39 / ((-arg1 - 27) / 46);
        class129 var5 = (class129) this.field4974.method2218(1, arg0);
        if (var5 != null) {
            var5.method263(false);
            var5.method1123((byte) -31);
            this.field4959++;
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)I", line = 101)
    public final int method2289(int arg0) {
        if (arg0 > -39) {
            this.method2291(false);
        }
        field4962++;
        return this.field4970;
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)V", line = 112)
    public final void method2290(int arg0) {
        if (arg0 != 13831) {
            return;
        }
        for (class129 var2 = (class129) this.field4968.method1027(-20578); var2 != null; var2 = (class129) this.field4968.method1023(-63)) {
            if (var2.method824(5342)) {
                var2.method263(false);
                var2.method1123((byte) -31);
                this.field4959++;
            }
        }
        field4957++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)I", line = 138)
    public final int method2291(boolean arg0) {
        if (arg0) {
            this.field4974 = null;
        }
        field4960++;
        return this.field4959;
    }

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 152)
    public final Object method2292(int arg0) {
        field4969++;
        class129 var2 = (class129) this.field4974.method2215(false);
        while (var2 != null) {
            Object var3 = var2.method825(arg0 - 9662);
            if (var3 != null) {
                return var3;
            }
            class129 var4 = var2;
            var2 = (class129) this.field4974.method2215(false);
            var4.method263(false);
            var4.method1123((byte) -31);
            this.field4959++;
        }
        if (arg0 != 9754) {
            field4965 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)I", line = 191)
    public final int method2293(byte arg0) {
        if (arg0 < 117) {
            return -98;
        }
        field4966++;
        int var2 = 0;
        for (class129 var3 = (class129) this.field4968.method1027(-20578); var3 != null; var3 = (class129) this.field4968.method1023(75)) {
            if (!var3.method824(5342)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/Object;BJ)V", line = 215)
    public final void method2294(Object arg0, byte arg1, long arg2) {
        field4964++;
        this.method2288(arg2, 100);
        if (this.field4959 == 0) {
            class129 var5 = (class129) this.field4968.method1024(256);
            var5.method263(false);
            var5.method1123((byte) -31);
        } else {
            this.field4959--;
        }
        class269 var6 = new class269(arg0);
        this.field4974.method2227(var6, -8218, arg2);
        if (arg1 >= 15) {
            this.field4968.method1028((byte) 33, var6);
            var6.field2090 = 0L;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(JB)Ljava/lang/Object;", line = 243)
    public final Object method2295(long arg0, byte arg1) {
        field4963++;
        class129 var4 = (class129) this.field4974.method2218(1, arg0);
        if (var4 == null) {
            return null;
        } else if (arg1 == 74) {
            Object var5 = var4.method825(118);
            if (var5 == null) {
                var4.method263(false);
                var4.method1123((byte) -31);
                this.field4959++;
                return null;
            }
            if (var4.method824(5342)) {
                class269 var6 = new class269(var5);
                this.field4974.method2227(var6, arg1 ^ 0xFFFFDFAC, var4.field505);
                this.field4968.method1028((byte) 33, var6);
                var6.field2090 = 0L;
                var4.method263(false);
                var4.method1123((byte) -31);
            } else {
                this.field4968.method1028((byte) 33, var4);
                var4.field2090 = 0L;
            }
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V", line = 287)
    public static void method2296(byte arg0) {
        field4965 = null;
        if (arg0 < 13) {
            field4958 = 46;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BZZ)V", line = 297)
    public static final void method2297(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 != 57) {
            field4971 = 103;
        }
        if (arg2) {
            class146.field1713--;
            if (class146.field1713 == 0) {
                class318.field4284 = null;
            }
        }
        if (arg1) {
            class372.field5047--;
            if (class372.field5047 == 0) {
                class212.field2589 = null;
            }
        }
        field4972++;
    }

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "(I)V", line = 325)
    public final void method2298(int arg0) {
        this.field4968.method1021(20791);
        if (arg0 == 0) {
            field4961++;
            this.field4974.method2216((byte) -100);
            this.field4959 = this.field4970;
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(I)V", line = 351)
    public class365(int arg0) {
        this.field4970 = arg0;
        this.field4959 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field4974 = new class349(var2);
    }
}
