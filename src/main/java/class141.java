import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class141 extends class81 {

    @OriginalMember(owner = "client!ga", name = "qc", descriptor = "[I")
    public static int[] field2420 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ga", name = "zc", descriptor = "Ljava/lang/String;")
    public static String field2429 = " from your ignore list first.";

    @OriginalMember(owner = "client!ga", name = "mc", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!ga", name = "nc", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!ga", name = "oc", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!ga", name = "pc", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!ga", name = "sc", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!ga", name = "tc", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!ga", name = "uc", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!ga", name = "vc", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!ga", name = "wc", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!ga", name = "xc", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!ga", name = "yc", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!ga", name = "rc", descriptor = "Lue;")
    public class208 field2421;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)Z")
    public final boolean method536(int arg0) {
        ++field2416;
        if (arg0 < 122) {
            return false;
        } else {
            return this.field2421 != null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)I")
    public final int method521(byte arg0) {
        ++field2423;
        if (arg0 != 25) {
            field2418 = 109;
        }
        if (class185.field3002 != 0 && this.field2421.field3521 != null) {
            class208 var2 = this.field2421.method1402((byte) -122);
            if (var2 != null && var2.field3505 != -1) {
                return var2.field3505;
            }
        }
        return super.field1471;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)Z")
    public static final boolean method985(int arg0, byte arg1) {
        ++field2424;
        if (~arg0 > -1) {
            return false;
        } else if (arg1 < 30) {
            return true;
        } else {
            int var2 = class101.field1788[arg0];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return ~var2 == -1002;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII)V")
    public final void method226(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2422;
        if (this.field2421 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "(I)V")
    public static void method986(int arg0) {
        field2420 = null;
        field2429 = null;
        if (arg0 != 20156) {
            method985(-64, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIIIJILgh;)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class32 arg10) {
        ++field2425;
        if (this.field2421 != null) {
            class167 var13 = super.field1384 != -1 && ~super.field1393 == -1 ? class105.method714(super.field1384, (byte) 86) : null;
            class167 var14 = ~super.field1421 == 0 || super.field1421 == this.method533(-1).field531 && var13 != null ? null : class105.method714(super.field1421, (byte) 22);
            class279 var15 = this.field2421.method1400(super.field1465, super.field1477, super.field1411, true, super.field1400, var14, super.field1387, var13, super.field1474, super.field1420);
            if (var15 != null) {
                super.field1395 = var15.method110();
                class208 var16 = this.field2421;
                if (var16.field3521 != null) {
                    var16 = var16.method1402((byte) -112);
                }
                if (class188.field3051 && var16.field3538) {
                    class279 var17 = class229.method1540(arg0, var15, super.field1458, super.field1397, 50, var14 != null ? var14 : var13, super.field1391, this.field2421.field3513, this.field2421.field3537, super.field1432, this.field2421.field3535, this.field2421.field3490, this.field2421.field3493, var14 == null ? super.field1465 : super.field1474);
                    var17.method120(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field1457);
                }
                this.method531(var15, (byte) -97);
                this.method532(752, arg0, var15);
                class279 var18 = null;
                if (super.field1396 != -1 && super.field1482 != -1) {
                    class121 var19 = class189.method1243(65536, super.field1396);
                    var18 = var19.method830(1, super.field1390, super.field1482, super.field1463);
                    if (var18 != null) {
                        var18.method126(0, -super.field1386, 0);
                        if (var19.field2140) {
                            if (class179.field2953 != 0) {
                                var18.method128(class179.field2953);
                            }
                            if (~class294.field4682 != -1) {
                                var18.method118(class294.field4682);
                            }
                            if (~class139.field2398 != -1) {
                                var18.method126(0, class139.field2398, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class18) var15).method97(var18);
                }
                if (this.field2421.field3537 == 1) {
                    var15.field4448 = true;
                }
                var15.method120(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field1457);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BILvh;I)[Lda;")
    public static final class197[] method987(byte arg0, int arg1, class108 arg2, int arg3) {
        ++field2417;
        if (arg0 <= 21) {
            method988((byte) 50);
        }
        return !class127.method876(arg1, arg2, arg3, -8635) ? null : class155.method1064(-15847);
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(B)Z")
    public static final boolean method988(byte arg0) {
        ++field2427;
        if (class169.field2794) {
            try {
                class94.method604(class127.field2238.field2294, "showVideoAd", 27972);
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 <= 113 ? false : false;
    }

    @OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field2426;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lue;B)V")
    public final void method989(class208 arg0, byte arg1) {
        ++field2428;
        this.field2421 = arg0;
        if (super.field1457 != null) {
            super.field1457.method215();
        }
        int var3 = -10 / ((arg1 - -23) / 38);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()I")
    public final int method110() {
        ++field2419;
        return super.field1395;
    }
}
