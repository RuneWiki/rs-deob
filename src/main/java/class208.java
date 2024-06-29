import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class208 extends class188 implements class281 {

    @OriginalMember(owner = "client!uga", name = "ib", descriptor = "Z")
    private boolean field2462 = false;

    @OriginalMember(owner = "client!uga", name = "N", descriptor = "Liea;")
    public class477 field2441;

    @OriginalMember(owner = "client!uga", name = "fb", descriptor = "Z")
    private boolean field2459;

    @OriginalMember(owner = "client!uga", name = "hb", descriptor = "J")
    public static long field2461 = 0L;

    @OriginalMember(owner = "client!uga", name = "eb", descriptor = "Luh;")
    public static class166 field2458 = new class166();

    @OriginalMember(owner = "client!uga", name = "K", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!uga", name = "L", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!uga", name = "M", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!uga", name = "O", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!uga", name = "P", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!uga", name = "Q", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!uga", name = "R", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!uga", name = "T", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!uga", name = "U", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!uga", name = "V", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!uga", name = "X", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!uga", name = "Z", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!uga", name = "ab", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!uga", name = "bb", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!uga", name = "cb", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!uga", name = "db", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!uga", name = "gb", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!uga", name = "jb", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!uga", name = "kb", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!uga", name = "lb", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!uga", name = "S", descriptor = "Llca;")
    private class642 field2446;

    @OriginalMember(owner = "client!uga", name = "Y", descriptor = "Ljava/applet/Applet;")
    public static Applet field2452;

    @OriginalMember(owner = "client!uga", name = "W", descriptor = "[I")
    public static int[] field2450;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1235(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field2450 = null;
        }
        ++field2438;
        return (arg2 & 2048) != 0 | class415.method2540(arg2, arg1, false) || class222.method1291(arg2, 103, arg1);
    }

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "(B)I")
    public final int method1236(byte arg0) {
        ++field2443;
        if (arg0 != -78) {
            this.method995(-128, -123, (class58) null, 62);
        }
        return this.field2441.field6804;
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(B)V")
    public final void method1237(byte arg0) {
        if (arg0 <= -68) {
            ++field2447;
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lha;B)V")
    public final void method1238(class58 arg0, byte arg1) {
        this.field2441.method2870(arg0, -26);
        if (arg1 <= -15) {
            ++field2464;
        }
    }

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "(I)Z")
    public final boolean method986(int arg0) {
        ++field2463;
        int var2 = 36 % ((-50 - arg0) / 60);
        return false;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(BLha;)Llba;")
    public final class547 method994(byte arg0, class58 arg1) {
        ++field2448;
        class470 var3 = this.field2441.method2866(true, arg1, false, 1, 2048);
        if (var3 == null) {
            return null;
        } else {
            class165 var4 = arg1.method422();
            var4.method1019(super.field4635, super.field4627, super.field4629);
            class547 var5 = class652.method3702(this.field2459, -9477, 1);
            int var6 = super.field4635 >> 9;
            int var7 = super.field4629 >> 9;
            this.field2441.method2868(var7, var7, var3, var6, var4, var6, arg1, (byte) -14, true);
            if (arg0 != -112) {
                return null;
            } else {
                if (!class626.field8994) {
                    var3.method228(var4, var5.field7870[0], 0);
                } else {
                    var3.method188(var4, var5.field7870[0], class586.field8268, 0);
                }
                if (this.field2441.field6807 != null) {
                    class713 var8 = this.field2441.field6807.method1538();
                    if (class626.field8994) {
                        arg1.method402(var8, class586.field8268);
                    } else {
                        arg1.method391(var8);
                    }
                }
                this.field2462 = var3.method197() || this.field2441.field6807 != null;
                if (this.field2446 == null) {
                    this.field2446 = class191.method1161(super.field4629, var3, super.field4635, super.field4627, 4371);
                } else {
                    class206.method1232(super.field4635, super.field4629, var3, super.field4627, this.field2446, arg0 ^ -58);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "e", descriptor = "(Z)I")
    public final int method992(boolean arg0) {
        ++field2445;
        if (arg0) {
            field2461 = 59L;
        }
        return this.field2441.method2862(true);
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lha;Lvc;IIIIIZII)V")
    public class208(class58 arg0, class316 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field4021);
        this.field2441 = new class477(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field2459 = arg1.field4001 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "(I)I")
    public final int method985(int arg0) {
        ++field2455;
        return arg0 != 4 ? 16 : this.field2441.method2860(true);
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Z)Z")
    public final boolean method1239(boolean arg0) {
        if (!arg0) {
            this.field2441 = null;
        }
        ++field2460;
        return this.field2441.method2864(false);
    }

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "(Z)V")
    public static void method1240(boolean arg0) {
        field2452 = null;
        if (!arg0) {
            method1242((char) 65511, 88);
        }
        field2450 = null;
        field2458 = null;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lha;I)V")
    public final void method990(class58 arg0, int arg1) {
        ++field2465;
        class470 var3 = this.field2441.method2866(true, arg0, true, 1, 262144);
        int var4 = -7 % ((arg1 - -2) / 62);
        if (var3 != null) {
            int var5 = super.field4635 >> 9;
            int var6 = super.field4629 >> 9;
            class165 var7 = arg0.method422();
            var7.method1019(super.field4635, super.field4627, super.field4629);
            this.field2441.method2868(var6, var6, var3, var5, var7, var5, arg0, (byte) -14, false);
        }
    }

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "(B)I")
    public final int method1241(byte arg0) {
        if (arg0 != 99) {
            return -106;
        } else {
            ++field2439;
            return this.field2441.field6801;
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method995(int arg0, int arg1, class58 arg2, int arg3) {
        ++field2457;
        class470 var5 = this.field2441.method2866(false, arg2, false, 1, 131072);
        if (var5 == null) {
            return false;
        } else {
            class165 var6 = arg2.method422();
            var6.method1019(super.field4635, super.field4627, super.field4629);
            if (arg3 != -1) {
                method1235(false, 44, -85);
            }
            return !class626.field8994 ? var5.method227(arg0, arg1, var6, false, 0) : var5.method191(arg0, arg1, var6, false, 0, class586.field8268);
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(CI)Z")
    public static final boolean method1242(char arg0, int arg1) {
        if (arg1 > -127) {
            return true;
        } else {
            ++field2451;
            return ~arg0 <= -66 && ~arg0 >= -91 || arg0 >= 'a' && ~arg0 >= -123;
        }
    }

    @OriginalMember(owner = "client!uga", name = "g", descriptor = "(I)Z")
    public final boolean method989(int arg0) {
        if (arg0 >= -112) {
            field2461 = 75L;
        }
        ++field2454;
        return this.field2462;
    }

    @OriginalMember(owner = "client!uga", name = "h", descriptor = "(I)Z")
    public final boolean method991(int arg0) {
        int var2 = -60 / ((arg0 - 65) / 48);
        ++field2440;
        return false;
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(ILha;)Llca;")
    public final class642 method983(int arg0, class58 arg1) {
        ++field2442;
        return arg0 != 0 ? null : this.field2446;
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(I)V")
    public final void method982(int arg0) {
        ++field2456;
        if (arg0 != 2) {
            this.method1243((byte) -13);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(B)I")
    public final int method1243(byte arg0) {
        ++field2449;
        if (arg0 != 117) {
            method1242((char) 65529, 51);
        }
        return this.field2441.field6786;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(ZLha;Lrr;IIII)V")
    public final void method987(boolean arg0, class58 arg1, class361 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 == 0) {
            ++field2444;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(ILha;)V")
    public final void method1244(int arg0, class58 arg1) {
        this.field2441.method2871(arg1, 262144);
        if (arg0 != 17513) {
            this.method983(74, (class58) null);
        }
        ++field2453;
    }
}
