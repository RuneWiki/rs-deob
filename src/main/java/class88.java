import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class88 extends class403 implements class223 {

    @OriginalMember(owner = "client!hp", name = "R", descriptor = "Lmj;")
    public class171 field1249;

    @OriginalMember(owner = "client!hp", name = "O", descriptor = "Z")
    private boolean field1246;

    @OriginalMember(owner = "client!hp", name = "A", descriptor = "Lsm;")
    public static class159 field1232 = new class159(5000);

    @OriginalMember(owner = "client!hp", name = "Q", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!hp", name = "P", descriptor = "B")
    public static byte field1247;

    @OriginalMember(owner = "client!hp", name = "x", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!hp", name = "B", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!hp", name = "G", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!hp", name = "H", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!hp", name = "I", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!hp", name = "K", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!hp", name = "L", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!hp", name = "M", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!hp", name = "S", descriptor = "[I")
    public static int[] field1250;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)I")
    public final int method695(int arg0) {
        ++field1243;
        if (arg0 != 898) {
            field1232 = null;
        }
        return this.field1249.field2438;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(ILea;)Lms;")
    public final class450 method696(int arg0, class58 arg1) {
        ++field1234;
        class116 var3 = this.field1249.method1223(super.field5561, arg1, false, super.field5565, 1024, arg0 ^ 18928, true);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 0) {
                field1232 = null;
            }
            class309 var4 = arg1.method210();
            var4.method1866(super.field5561, super.field5569, super.field5565);
            class450 var5 = null;
            if (this.field1246) {
                var5 = class61.method494(-97, 1);
            }
            if (this.field1249.field2434 != null) {
                class174 var6 = this.field1249.field2434.method1552();
                arg1.method172(var3, var6, var4, var5 == null ? null : var5.field6451[0], 0);
            } else {
                var3.method896(var4, var5 == null ? null : var5.field6451[0], 0);
            }
            this.field1249.method1225((byte) 76, arg1, true, super.field5565 >> 7, super.field5565 >> 7, super.field5561 >> 7, super.field5561 >> 7, var3);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)Z")
    public final boolean method697(int arg0) {
        ++field1240;
        return arg0 < 115;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLea;)V")
    public final void method698(byte arg0, class58 arg1) {
        int var3 = 5 / ((arg0 - 24) / 49);
        this.field1249.method1226(-41, arg1);
        ++field1238;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IILea;Lac;ZII)V")
    public final void method699(int arg0, int arg1, class58 arg2, class216 arg3, boolean arg4, int arg5, int arg6) {
        ++field1242;
        if (arg0 != 22546) {
            field1248 = -63;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)V")
    public static final void method700(byte arg0, int arg1) {
        class254.field3518.method2531(arg1, 112);
        if (arg0 != -96) {
            field1250 = null;
        }
        ++field1241;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)V")
    public static void method701(byte arg0) {
        field1250 = null;
        if (arg0 <= -117) {
            field1232 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lea;Lp;IIIIIIIZI)V")
    public class88(class58 arg0, class447 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        super(arg6, arg7, arg8, class259.method1668(-2, arg2, arg3));
        this.field1249 = new class171(arg0, arg1, arg2, arg3, arg4, arg5, super.field5561, super.field5565, arg9, arg10);
        this.field1246 = arg1.field6297 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
    public final void method702(byte arg0) {
        if (arg0 != 46) {
            method703((class316) null, (byte) 86);
        }
        ++field1235;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lij;B)V")
    public static final void method703(class316 arg0, byte arg1) {
        ++field1245;
        if (arg1 >= -14) {
            field1232 = null;
        }
        class93.field1301 = arg0;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILea;)V")
    public final void method704(int arg0, class58 arg1) {
        ++field1229;
        this.field1249.method1216(-15436, arg1);
        if (arg0 != -29096) {
            this.field1246 = false;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lea;BI)Lts;")
    public final class116 method705(class58 arg0, byte arg1, int arg2) {
        if (arg1 != -63) {
            this.method704(-19, (class58) null);
        }
        ++field1233;
        return this.field1249.method1223(0, arg0, false, 0, arg2, 18928, false);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)Z")
    public final boolean method706(boolean arg0) {
        if (!arg0) {
            this.field1249 = null;
        }
        ++field1230;
        return this.field1249.method1222((byte) 104);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lea;I)V")
    public final void method707(class58 arg0, int arg1) {
        ++field1236;
        if (arg1 > -99) {
            this.field1246 = false;
        }
        class116 var3 = this.field1249.method1223(super.field5561, arg0, true, super.field5565, 131072, 18928, true);
        if (var3 != null) {
            this.field1249.method1225((byte) 29, arg0, false, super.field5565 >> 7, super.field5565 >> 7, super.field5561 >> 7, super.field5561 >> 7, var3);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public final void method708(int arg0) {
        ++field1244;
        if (arg0 != 26389) {
            this.method699(-5, 66, (class58) null, (class216) null, true, -96, -85);
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)I")
    public final int method709(int arg0) {
        if (arg0 != 30030) {
            return 121;
        } else {
            ++field1231;
            return this.field1249.field2437;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZILea;I)Z")
    public final boolean method710(boolean arg0, int arg1, class58 arg2, int arg3) {
        ++field1237;
        if (!arg0) {
            field1232 = null;
        }
        class116 var5 = this.field1249.method1223(super.field5561, arg2, false, super.field5565, 65536, 18928, false);
        if (var5 == null) {
            return false;
        } else {
            class309 var6 = arg2.method210();
            var6.method1866(super.field5561, super.field5569, super.field5565);
            return var5.method898(arg3, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(Z)I")
    public final int method711(boolean arg0) {
        ++field1239;
        return !arg0 ? -18 : this.field1249.field2445;
    }

    static {
        new class368("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field1248 = 0;
    }
}
