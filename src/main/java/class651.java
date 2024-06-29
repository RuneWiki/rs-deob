import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class651 {

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    private int field9033 = 32;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "Z")
    private boolean field9046 = false;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "J")
    private long field9039 = class446.method2525(500);

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
    private int field9054 = 0;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "[Llea;")
    private class613[] field9057 = new class613[8];

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
    private int field9055 = 0;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "J")
    private long field9060 = 0L;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "J")
    private long field9056 = 0L;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
    private int field9062 = 0;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "[Llea;")
    private class613[] field9058 = new class613[8];

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
    private int field9059 = 0;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "Z")
    private boolean field9068 = true;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "Ljava/lang/String;")
    public static String field9049 = null;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "Lhg;")
    public static class693 field9043 = new class693(16, -1);

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "Lhg;")
    public static class693 field9065 = new class693(1, 8);

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field9040;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field9042;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public static int field9047;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field9048;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    public static int field9050;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    public static int field9052;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public int field9053;

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "I")
    private int field9064;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
    public int field9067;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "Llea;")
    private class613 field9044;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "Lpda;")
    public static class631 field9066;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "Lar;")
    public static class684 field9061;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "[I")
    public int[] field9051;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "[Llc;")
    public static class649[] field9063;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()V")
    public void method314() throws Exception {
        field9040++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public final synchronized void method3647(byte arg0) {
        field9050++;
        if (class323.field4167 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class323.field4167.field347[var3] == this) {
                    class323.field4167.field347[var3] = null;
                }
                if (class323.field4167.field347[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class323.field4167.field343 = true;
                while (class323.field4167.field341) {
                    class149.method1052(50L, true);
                }
                class323.field4167 = null;
            }
        }
        this.method313();
        if (arg0 != -111) {
            this.method3651((byte) -5, null);
        }
        this.field9046 = true;
        this.field9051 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
    public final synchronized void method3648(boolean arg0) {
        field9041++;
        if (this.field9046) {
            return;
        }
        long var2 = class446.method2525(500);
        try {
            if ((this.field9039 + 6000L) < var2) {
                this.field9039 = var2 - 6000L;
            }
            while (var2 > (this.field9039 + 5000L)) {
                this.method3655(0, 256);
                this.field9039 += (256000 / class541.field7490);
                var2 = class446.method2525(500);
            }
        } catch (Exception var7) {
            this.field9039 = var2;
        }
        if (this.field9051 == null) {
            return;
        }
        try {
            if (this.field9056 != 0L) {
                if (var2 < this.field9056) {
                    return;
                }
                this.method311(this.field9053);
                this.field9056 = 0L;
                this.field9068 = true;
            }
            int var4 = this.method310();
            if (this.field9055 < this.field9054 - var4) {
                this.field9055 = this.field9054 - var4;
            }
            int var5 = this.field9067 + this.field9064;
            if (arg0) {
                this.field9055 = -76;
            }
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field9053 < var5 + 256) {
                this.field9053 += 1024;
                if (this.field9053 > 16384) {
                    this.field9053 = 16384;
                }
                this.method313();
                var4 = 0;
                this.method311(this.field9053);
                this.field9068 = true;
                if (this.field9053 < var5 + 256) {
                    var5 = this.field9053 - 256;
                    this.field9064 = var5 - this.field9067;
                }
            }
            while (var5 > var4) {
                this.method3653(this.field9051, 256);
                var4 += 256;
                this.method312();
            }
            if (var2 > this.field9060) {
                if (this.field9068) {
                    this.field9068 = false;
                } else if (this.field9055 == 0 && this.field9062 == 0) {
                    this.method313();
                    this.field9056 = var2 + 2000L;
                    return;
                } else {
                    this.field9064 = Math.min(this.field9062, this.field9055);
                    this.field9062 = this.field9055;
                }
                this.field9055 = 0;
                this.field9060 = var2 + 2000L;
            }
            this.field9054 = var4;
        } catch (Exception var6) {
            this.method313();
            this.field9056 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V")
    public static void method3649(byte arg0) {
        field9065 = null;
        field9061 = null;
        field9063 = null;
        int var1 = 108 / ((34 - arg0) / 49);
        field9043 = null;
        field9066 = null;
        field9049 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public void method311(int arg0) throws Exception {
        field9035++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILlea;I)V")
    private final void method3650(int arg0, class613 arg1, int arg2) {
        field9034++;
        int var4 = arg2 >> 5;
        class613 var5 = this.field9057[var4];
        if (var5 == null) {
            this.field9058[var4] = arg1;
        } else {
            var5.field8478 = arg1;
        }
        this.field9057[var4] = arg1;
        arg1.field8475 = arg2;
        if (arg0 != 16678) {
            method3652(true);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLlea;)V")
    public final synchronized void method3651(byte arg0, class613 arg1) {
        this.field9044 = arg1;
        if (arg0 != -106) {
            this.field9044 = null;
        }
        field9047++;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)V")
    public static final void method3652(boolean arg0) {
        field9037++;
        class748.field10451.method4150(class748.field10451.field10421, 1, -5);
        class748.field10451.method4150(class748.field10451.field10412, 1, -5);
        class748.field10451.method4150(class748.field10451.field10426, 2, -5);
        class748.field10451.method4150(class748.field10451.field10393, 2, -5);
        class748.field10451.method4150(class748.field10451.field10386, 1, -5);
        class748.field10451.method4150(class748.field10451.field10405, 1, -5);
        class748.field10451.method4150(class748.field10451.field10392, 1, -5);
        class748.field10451.method4150(class748.field10451.field10390, 1, -5);
        class748.field10451.method4150(class748.field10451.field10406, 1, -5);
        if (arg0) {
            method3649((byte) -47);
        }
        class748.field10451.method4150(class748.field10451.field10420, 1, -5);
        class748.field10451.method4150(class748.field10451.field10410, 1, -5);
        class748.field10451.method4150(class748.field10451.field10427, 1, -5);
        class748.field10451.method4150(class748.field10451.field10414, 0, -5);
        class748.field10451.method4150(class748.field10451.field10418, 1, -5);
        class748.field10451.method4150(class748.field10451.field10389, 0, -5);
        class748.field10451.method4150(class748.field10451.field10409, 0, -5);
        class748.field10451.method4150(class748.field10451.field10436, 1, -5);
        class748.field10451.method4150(class748.field10451.field10422, 0, -5);
        class748.field10451.method4150(class748.field10451.field10416, 0, -5);
        class533.method3060(2);
        class748.field10451.method4150(class748.field10451.field10425, 1, -5);
        class748.field10451.method4150(class748.field10451.field10430, 3, -5);
        class421.method2346(!arg0);
        class421.method2347((byte) -47);
        class508.field7164 = true;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "()V")
    public void method313() {
        field9045++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([II)V")
    private final void method3653(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class360.field4662) {
            var3 = arg1 << 1;
        }
        class135.method994(arg0, 0, var3);
        this.field9059 -= arg1;
        if (this.field9044 != null && this.field9059 <= 0) {
            this.field9059 += class541.field7490 >> 4;
            class717.method4011(-121, this.field9044);
            this.method3650(16678, this.field9044, this.field9044.method347());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class613 var10 = null;
                        class613 var11 = this.field9058[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class183 var12 = var11.field8477;
                                if (var12 == null || var12.field2549 <= var8) {
                                    var11.field8476 = true;
                                    int var13 = var11.method349();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2549 += var13;
                                    }
                                    if (var4 >= this.field9033) {
                                        break label107;
                                    }
                                    class613 var14 = var11.method317();
                                    if (var14 != null) {
                                        int var15 = var11.field8475;
                                        while (var14 != null) {
                                            this.method3650(16678, var14, var15 * var14.method347() >> 8);
                                            var14 = var11.method327();
                                        }
                                    }
                                    class613 var16 = var11.field8478;
                                    var11.field8478 = null;
                                    if (var10 == null) {
                                        this.field9058[var7] = var16;
                                    } else {
                                        var10.field8478 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field9057[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field8478;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class613 var18 = this.field9058[var17];
                this.field9058[var17] = this.field9057[var17] = null;
                while (var18 != null) {
                    class613 var19 = var18.field8478;
                    var18.field8478 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field9059 < 0) {
            this.field9059 = 0;
        }
        if (this.field9044 != null) {
            this.field9044.method338(arg0, 0, arg1);
        }
        this.field9039 = class446.method2525(500);
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "()V")
    public void method312() throws Exception {
        field9036++;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(Z)V")
    public final synchronized void method3654(boolean arg0) {
        field9038++;
        this.field9068 = true;
        try {
            if (!arg0) {
                this.method314();
            }
        } catch (Exception var2) {
            this.method313();
            this.field9056 = class446.method2525(500) + 2000L;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method315(Component arg0) throws Exception {
        field9042++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V")
    private final void method3655(int arg0, int arg1) {
        this.field9059 -= arg1;
        field9052++;
        if (arg0 > this.field9059) {
            this.field9059 = 0;
        }
        if (this.field9044 != null) {
            this.field9044.method335(arg1);
        }
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "()I")
    public int method310() throws Exception {
        field9048++;
        return this.field9053;
    }
}
