import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class599 extends class577 implements class281 {

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "Z")
    private boolean field8542 = false;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "Liea;")
    public class477 field8538;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "Z")
    private boolean field8528;

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "[Ljava/lang/String;")
    public static String[] field8541 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field8526;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field8527;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    public static int field8530;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    public static int field8533;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "I")
    public static int field8535;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "I")
    public static int field8537;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "I")
    public static int field8539;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!re", name = "db", descriptor = "I")
    public static int field8543;

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "I")
    public static int field8544;

    @OriginalMember(owner = "client!re", name = "fb", descriptor = "I")
    public static int field8545;

    @OriginalMember(owner = "client!re", name = "gb", descriptor = "I")
    public static int field8546;

    @OriginalMember(owner = "client!re", name = "hb", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "Llca;")
    private class642 field8536;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)I", line = 5)
    public final int method1243(byte arg0) {
        ++field8540;
        if (arg0 != 117) {
            this.field8536 = null;
        }
        return this.field8538.field6786;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V", line = 22)
    public final void method1237(byte arg0) {
        if (arg0 >= -68) {
            this.field8528 = true;
        }
        ++field8544;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lha;B)V", line = 35)
    public final void method1238(class58 arg0, byte arg1) {
        this.field8538.method2870(arg0, 65);
        if (arg1 > -15) {
            this.field8528 = true;
        }
        ++field8527;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLha;)Llba;", line = 47)
    public final class547 method994(byte arg0, class58 arg1) {
        ++field8543;
        class470 var3 = this.field8538.method2866(true, arg1, false, 1, 2048);
        if (var3 == null) {
            return null;
        } else {
            class165 var4 = arg1.method422();
            var4.method1019(super.field8155 + super.field4635, super.field4627, super.field4629 - -super.field8149);
            if (arg0 != -112) {
                this.field8528 = false;
            }
            class547 var5 = class652.method3702(this.field8528, -9477, 1);
            int var6 = super.field4635 >> 9;
            int var7 = super.field4629 >> 9;
            this.field8538.method2868(var7, var7, var3, var6, var4, var6, arg1, (byte) -14, true);
            if (class626.field8994) {
                var3.method188(var4, var5.field7870[0], class586.field8268, 0);
            } else {
                var3.method228(var4, var5.field7870[0], 0);
            }
            if (this.field8538.field6807 != null) {
                class713 var8 = this.field8538.field6807.method1538();
                if (class626.field8994) {
                    arg1.method402(var8, class586.field8268);
                } else {
                    arg1.method391(var8);
                }
            }
            this.field8542 = var3.method197() || this.field8538.field6807 != null;
            if (this.field8536 == null) {
                this.field8536 = class191.method1161(super.field4629, var3, super.field4635, super.field4627, 4371);
            } else {
                class206.method1232(super.field4635, super.field4629, var3, super.field4627, this.field8536, 118);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)Z", line = 97)
    public final boolean method1239(boolean arg0) {
        if (!arg0) {
            this.method986(54);
        }
        ++field8537;
        return this.field8538.method2864(!arg0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 109)
    public static final void method3408(String arg0, byte arg1) {
        ++field8545;
        if (class15.field140 == null) {
            class646.method3680((byte) 111);
        }
        class2.field10.setTime(new Date(class652.method3700(-1)));
        int var2 = class2.field10.get(11);
        int var3 = class2.field10.get(12);
        int var4 = class2.field10.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class625.method3586(arg0, '\n', -16647);
        if (arg1 != -36) {
            field8541 = null;
        }
        for (int var7 = 0; ~var6.length < ~var7; ++var7) {
            for (int var8 = class626.field8989; ~var8 < -1; --var8) {
                class15.field140[var8] = class15.field140[var8 + -1];
            }
            class15.field140[0] = var5 + ": " + var6[var7];
            if (class570.field8093 != null) {
                try {
                    class570.field8093.write(class526.method3082((byte) -102, class15.field140[0] + "\n"));
                } catch (IOException var9) {
                }
            }
            if (class626.field8989 < class15.field140.length + -1) {
                if (class185.field2210 > 0) {
                    ++class185.field2210;
                }
                ++class626.field8989;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILha;)V", line = 171)
    public final void method1244(int arg0, class58 arg1) {
        ++field8539;
        this.field8538.method2871(arg1, 262144);
        if (arg0 != 17513) {
            this.field8542 = true;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Z", line = 183)
    public static final boolean method3409(int arg0, int arg1, int arg2) {
        ++field8532;
        if (!class452.method2783(arg1, arg0, 116)) {
            return false;
        } else if (class551.method3233(-23949, arg1, arg0) | (45056 & arg0) != 0 | class470.method2840(10115, arg0, arg1)) {
            return true;
        } else {
            if (arg2 != 55) {
                method3410(true);
            }
            return (arg1 & 55) == 0 & (class147.method915(arg1, arg0, (byte) 101) | class102.method709(arg0, arg1, -109));
        }
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(Z)V", line = 200)
    public static void method3410(boolean arg0) {
        if (arg0) {
            field8541 = null;
        }
        field8541 = null;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)I", line = 211)
    public final int method1241(byte arg0) {
        ++field8530;
        if (arg0 != 99) {
            this.method983(-119, (class58) null);
        }
        return this.field8538.field6801;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(ILha;)Llca;", line = 226)
    public final class642 method983(int arg0, class58 arg1) {
        ++field8547;
        if (arg0 != 0) {
            field8541 = null;
        }
        return this.field8536;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lha;I)V", line = 237)
    public final void method990(class58 arg0, int arg1) {
        int var3 = 91 / ((-2 - arg1) / 62);
        ++field8529;
        class470 var4 = this.field8538.method2866(true, arg0, false, 1, 262144);
        if (var4 != null) {
            int var5 = super.field4635 >> 9;
            int var6 = super.field4629 >> 9;
            class165 var7 = arg0.method422();
            var7.method1019(super.field4635, super.field4627, super.field4629);
            this.field8538.method2868(var6, var6, var4, var5, var7, var5, arg0, (byte) -14, false);
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)Z", line = 262)
    public final boolean method986(int arg0) {
        ++field8526;
        int var2 = -64 / ((arg0 - -50) / 60);
        return false;
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(Z)I", line = 278)
    public final int method992(boolean arg0) {
        if (arg0) {
            this.method995(-20, -73, (class58) null, 123);
        }
        ++field8531;
        return this.field8538.method2862(true);
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(I)Z", line = 290)
    public final boolean method989(int arg0) {
        if (arg0 > -112) {
            return true;
        } else {
            ++field8535;
            return this.field8542;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IILha;I)Z", line = 301)
    public final boolean method995(int arg0, int arg1, class58 arg2, int arg3) {
        ++field8533;
        if (arg3 != -1) {
            field8541 = null;
        }
        class470 var5 = this.field8538.method2866(false, arg2, false, 1, 131072);
        if (var5 == null) {
            return false;
        } else {
            class165 var6 = arg2.method422();
            var6.method1019(super.field8155 + super.field4635, super.field4627, super.field4629 - -super.field8149);
            return class626.field8994 ? var5.method191(arg0, arg1, var6, false, 0, class586.field8268) : var5.method227(arg0, arg1, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lha;Lvc;IIIIIZIIIII)V", line = 320)
    public class599(class58 arg0, class316 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field8538 = new class477(arg0, arg1, arg10, arg11, super.field4628, arg3, this, arg7, arg12);
        this.field8528 = arg1.field4001 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(B)I", line = 333)
    public final int method1236(byte arg0) {
        if (arg0 != -78) {
            this.method1238((class58) null, (byte) -27);
        }
        ++field8534;
        return this.field8538.field6804;
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)I", line = 345)
    public final int method985(int arg0) {
        if (arg0 != 4) {
            return -11;
        } else {
            ++field8546;
            return this.field8538.method2860(true);
        }
    }
}
