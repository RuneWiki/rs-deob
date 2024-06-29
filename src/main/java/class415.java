import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class415 extends class331 {

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "J")
    public static long field5951 = -1L;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "Ljava/lang/String;")
    public String field5964;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "[C")
    public char[] field5959;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "[C")
    public char[] field5961;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[I")
    public int[] field5956;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "[I")
    public int[] field5963;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(CI)I")
    public final int method2641(char arg0, int arg1) {
        field5962++;
        if (arg1 != -1) {
            this.method2641('Z', 1);
        }
        if (this.field5956 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field5956.length; var3++) {
            if (this.field5961[var3] == arg0) {
                return this.field5956[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public final void method2642(int arg0) {
        if (this.field5963 != null) {
            for (int var2 = 0; var2 < this.field5963.length; var2++) {
                this.field5963[var2] = class429.method2704(this.field5963[var2], 32768);
            }
        }
        field5954++;
        int var3 = -68 / ((arg0 - 61) / 62);
        if (this.field5956 != null) {
            for (int var4 = 0; var4 < this.field5956.length; var4++) {
                this.field5956[var4] = class429.method2704(this.field5956[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILdg;)V")
    private final void method2643(int arg0, int arg1, class236 arg2) {
        if (arg1 == 1) {
            this.field5964 = arg2.method1562(false);
        } else if (arg1 == 2) {
            int var7 = arg2.method1574(-123);
            this.field5956 = new int[var7];
            this.field5961 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5956[var8] = arg2.method1617((byte) 48);
                byte var9 = arg2.method1589(false);
                this.field5961[var8] = var9 == 0 ? 0 : class8.method57(var9, 16);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method1574(-31);
            this.field5959 = new char[var4];
            this.field5963 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5963[var5] = arg2.method1617((byte) 48);
                byte var6 = arg2.method1589(false);
                this.field5959[var5] = var6 == 0 ? 0 : class8.method57(var6, 16);
            }
        }
        field5957++;
        int var10 = 118 % ((-arg0 - 15) / 57);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILtq;)V")
    public static final void method2644(int arg0, class376 arg1) {
        class401.field5742 = arg1.method2418("p11_full", (byte) -23);
        field5958++;
        class278.field3941 = arg1.method2418("p12_full", (byte) -23);
        class396.field5584 = arg1.method2418("b12_full", (byte) -23);
        class235.field3296 = arg1.method2418("hitmarks", (byte) -23);
        class383.field5413 = arg1.method2418("hitbar_default", (byte) -23);
        class261.field3739 = arg1.method2418("timerbar_default", (byte) -23);
        class75.field889 = arg1.method2418("headicons_pk", (byte) -23);
        if (arg0 > -65) {
            return;
        }
        class413.field5942 = arg1.method2418("headicons_prayer", (byte) -23);
        class296.field4122 = arg1.method2418("hint_headicons", (byte) -23);
        class450.field6452 = arg1.method2418("hint_mapmarkers", (byte) -23);
        class182.field2486 = arg1.method2418("mapflag", (byte) -23);
        class217.field3064 = arg1.method2418("cross", (byte) -23);
        class236.field3301 = arg1.method2418("mapdots", (byte) -23);
        class261.field3736 = arg1.method2418("scrollbar", (byte) -23);
        class167.field2340 = arg1.method2418("name_icons", (byte) -23);
        class40.field483 = arg1.method2418("floorshadows", (byte) -23);
        class313.field4483 = arg1.method2418("compass", (byte) -23);
        class284.field3995 = arg1.method2418("hint_mapedge", (byte) -23);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public static final void method2645(int arg0, int arg1, int arg2, int arg3) {
        class233.field3281 = arg2;
        class105.field1261 = arg0;
        class222.field3123 = arg3;
        field5965++;
        if (arg1 <= 75) {
            field5953 = 68;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IC)I")
    public final int method2646(int arg0, char arg1) {
        field5960++;
        if (this.field5963 == null) {
            return -1;
        }
        int var3 = 0;
        int var4 = -117 % ((arg0 + 61) / 32);
        while (this.field5963.length > var3) {
            if (this.field5959[var3] == arg1) {
                return this.field5963[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILdg;)V")
    public final void method2647(int arg0, class236 arg1) {
        if (arg0 != 32768) {
            this.field5963 = null;
        }
        while (true) {
            int var3 = arg1.method1574(-11);
            if (var3 == 0) {
                field5955++;
                return;
            }
            this.method2643(arg0 - 32681, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
    public static final void method2648(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5952++;
        class62.field718.field3320 = 0;
        class62.field718.method1583(20, (byte) -81);
        class62.field718.method1583(arg2, (byte) -95);
        class62.field718.method1583(arg1, (byte) -56);
        class62.field718.method1605(arg4, false);
        class62.field718.method1605(arg0, false);
        class222.field3109 = -3;
        class298.field4171 = 0;
        class69.field803 = 1;
        class366.field5192 = 0;
        if (arg3 >= -34) {
            method2648(1, 97, 70, 27, 28);
        }
    }
}
