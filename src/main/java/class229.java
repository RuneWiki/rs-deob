import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class229 {

    @OriginalMember(owner = "client!du", name = "h", descriptor = "Lrp;")
    private class288 field3496 = new class288(64);

    @OriginalMember(owner = "client!du", name = "d", descriptor = "Llt;")
    private class458 field3492;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
    public final void method1376(byte arg0) {
        class288 var2 = this.field3496;
        synchronized (this.field3496) {
            int var3 = -34 / ((arg0 - 55) / 50);
            this.field3496.method1761(-124);
        }
        field3490++;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIZLtq;)V")
    public static final void method1377(int arg0, int arg1, int arg2, boolean arg3, class427 arg4) {
        field3491++;
        int var5 = arg4.field6175;
        int var6 = arg4.field6126;
        if (arg4.field6260 == 0) {
            arg4.field6175 = arg4.field6216;
        } else if (arg4.field6260 == 1) {
            arg4.field6175 = arg2 - arg4.field6216;
        } else if (arg4.field6260 == 2) {
            arg4.field6175 = arg4.field6216 * arg2 >> 14;
        }
        if (arg4.field6188 == 0) {
            arg4.field6126 = arg4.field6160;
        } else if (arg4.field6188 == 1) {
            arg4.field6126 = arg0 - arg4.field6160;
        } else if (arg4.field6188 == 2) {
            arg4.field6126 = arg4.field6160 * arg0 >> 14;
        }
        if (~arg4.field6260 == arg1) {
            arg4.field6175 = arg4.field6276 * arg4.field6126 / arg4.field6200;
        }
        if (arg4.field6188 == 4) {
            arg4.field6126 = arg4.field6200 * arg4.field6175 / arg4.field6276;
        }
        if (class483.field7373 && (client.method1176(arg4).field823 != 0 || arg4.field6197 == 0)) {
            if (arg4.field6126 < 5 && arg4.field6175 < 5) {
                arg4.field6175 = 5;
                arg4.field6126 = 5;
            } else {
                if (arg4.field6175 <= 0) {
                    arg4.field6175 = 5;
                }
                if (arg4.field6126 <= 0) {
                    arg4.field6126 = 5;
                }
            }
        }
        if (class441.field6470 == arg4.field6187) {
            class427.field6181 = arg4;
        }
        if (arg3 && arg4.field6288 != null && arg4.field6175 != var5 || arg4.field6126 != var6) {
            class298 var7 = new class298();
            var7.field4517 = arg4;
            var7.field4520 = arg4.field6288;
            class144.field2339.method4(1, var7);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(II)V")
    public final void method1378(int arg0, int arg1) {
        class288 var3 = this.field3496;
        synchronized (this.field3496) {
            this.field3496.method1760(arg1, arg0 ^ 0xFFFF85FB);
        }
        if (arg0 != -3259) {
            this.method1382(69, (byte) -44);
        }
        field3498++;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BI)Z")
    public static final boolean method1379(byte arg0, int arg1) {
        field3494++;
        if (arg0 == 21) {
            return arg1 == 2 || arg1 == 3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(B)V")
    public final void method1380(byte arg0) {
        class288 var2 = this.field3496;
        synchronized (this.field3496) {
            this.field3496.method1749((byte) -34);
            if (arg0 > -122) {
                this.field3492 = null;
            }
        }
        field3497++;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "([Ljava/lang/Object;B[J)V")
    public static final void method1381(Object[] arg0, byte arg1, long[] arg2) {
        if (arg1 == 93) {
            class30.method155(arg2, 0, arg2.length - 1, arg0, arg1 - 92);
            field3493++;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IB)Lk;")
    public final class380 method1382(int arg0, byte arg1) {
        field3495++;
        class288 var3 = this.field3496;
        class380 var4;
        synchronized (this.field3496) {
            var4 = (class380) this.field3496.method1752(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3492.method2715(class145.method952(arg0, -25552), class137.method912(arg0, true), false);
        class380 var6 = new class380();
        if (var5 != null) {
            var6.method2283((byte) -108, new class40(var5));
        }
        class288 var7 = this.field3496;
        synchronized (this.field3496) {
            if (arg1 > -91) {
                return null;
            } else {
                this.field3496.method1758(1, var6, (long) arg0);
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(II)V")
    public final void method1383(int arg0, int arg1) {
        field3489++;
        if (arg1 != -337) {
            this.method1382(-120, (byte) 116);
        }
        class288 var3 = this.field3496;
        synchronized (this.field3496) {
            this.field3496.method1761(-106);
            this.field3496 = new class288(arg0);
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lcm;ILlt;)V")
    public class229(class491 arg0, int arg1, class458 arg2) {
        this.field3492 = arg2;
        if (this.field3492 != null) {
            int var4 = this.field3492.method2738((byte) 109) - 1;
            this.field3492.method2726((byte) 113, var4);
        }
    }
}
