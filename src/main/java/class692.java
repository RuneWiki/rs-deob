import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class692 extends class540 {

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public int field9770 = 0;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "Z")
    private boolean field9782 = true;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Ljava/lang/String;")
    public String field9771 = null;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "B")
    public byte field9772;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "B")
    public byte field9785;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field9768;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field9769;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field9774;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field9775;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field9776;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field9779;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field9781;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field9783;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    public static int field9784;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "J")
    public long field9780;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Z")
    private boolean field9773;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "[I")
    private int[] field9777;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "[Ljv;")
    public class88[] field9778;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
    private final void method3889(int arg0, int arg1) {
        ++field9769;
        if (this.field9778 == null) {
            this.field9778 = new class88[arg0];
        } else {
            class42.method291(this.field9778, 0, this.field9778 = new class88[arg0], 0, this.field9770);
        }
        if (arg1 != -21998) {
            this.field9772 = 59;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
    public final void method3890(int arg0, int arg1) {
        --this.field9770;
        if (arg0 == 1) {
            ++field9779;
            if (~this.field9770 != -1) {
                class42.method291(this.field9778, arg1 + 1, this.field9778, arg1, this.field9770 - arg1);
            } else {
                this.field9778 = null;
            }
            this.field9777 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZZ)V")
    public static final void method3891(int arg0, boolean arg1, boolean arg2) {
        ++field9767;
        class685 var3 = class26.method198(arg2, (byte) -19, arg0);
        if (var3 != null) {
            if (arg1) {
                method3896((byte) 71);
            }
            var3.method3117((byte) -117);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method3892(String arg0, int arg1) {
        if (arg1 != 1) {
            method3891(2, true, false);
        }
        ++field9784;
        for (int var3 = 0; var3 < this.field9770; ++var3) {
            if (this.field9778[var3].field1148.equalsIgnoreCase(arg0)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()V")
    public static final void method3893() {
        byte var0 = 10;
        byte var1 = 30;
        if (class645.field9089 != 0 && class220.field3134 != null) {
            class711.field10005.method428(class426.field5997);
            for (int var2 = 0; var2 < class387.field5515.length; ++var2) {
                class711.field10005.method480(1, class426.field5997[3] - class426.field5997[1], -256, class426.field5997[1], class73.field988[var2] + class387.field5515[var2]);
            }
            for (int var3 = 0; var3 < class546.field7709; ++var3) {
                class302 var11 = class487.field6897[var3];
                class711.field10005.method407(var11.field4532[0], var11.field4526[0], var11.field4537[0], class164.field2411);
                class711.field10005.method407(var11.field4532[1], var11.field4526[1], var11.field4537[1], class184.field2774);
                class711.field10005.method407(var11.field4532[2], var11.field4526[2], var11.field4537[2], class293.field4430);
                class711.field10005.method407(var11.field4532[3], var11.field4526[3], var11.field4537[3], class385.field5488);
                if (class164.field2411[2] != -1 && class184.field2774[2] != -1 && class293.field4430[2] != -1 && class385.field5488[2] != -1) {
                    int var12 = -65536;
                    if (var11.field4536 == 4) {
                        var12 = -16776961;
                    }
                    class711.field10005.method419(class184.field2774[0], var12, class164.field2411[0], class184.field2774[1], (byte) 34, class164.field2411[1]);
                    class711.field10005.method419(class293.field4430[0], var12, class184.field2774[0], class293.field4430[1], (byte) 34, class184.field2774[1]);
                    class711.field10005.method419(class385.field5488[0], var12, class293.field4430[0], class385.field5488[1], (byte) 34, class293.field4430[1]);
                    class711.field10005.method419(class164.field2411[0], var12, class385.field5488[0], class164.field2411[1], (byte) 34, class385.field5488[1]);
                    class711.field10005.method419(class293.field4430[0], var12, class164.field2411[0], class293.field4430[1], (byte) 34, class164.field2411[1]);
                }
            }
            class220.field3134.method529(var1 + 45, "Dynamic: " + class592.field8357 + "/" + 5000, (byte) -110, var0, -16777216, -256);
            class220.field3134.method529(var1 + 60, "Total Opaque Onscreen: " + class709.field9996 + "/" + 10000, (byte) -89, var0, -16777216, -256);
            class220.field3134.method529(var1 + 75, "Total Trans Onscreen: " + class761.field10492 + "/" + 5000, (byte) -43, var0, -16777216, -256);
            class220.field3134.method529(var1 + 90, "Occluders: " + (class395.field5607 + class115.field1451) + " Active: " + class546.field7709, (byte) -109, var0, -16777216, -256);
            class220.field3134.method529(var1 + 105, "Occluded: Ground:" + class73.field986 + " Walls: " + class550.field7818 + " CPs: " + class422.field5967 + " Pixels: " + class683.field9698, (byte) -56, var0, -16777216, -256);
            class220.field3134.method529(var1 + 120, "Occlude Calc Took: " + class666.field9379 / 1000L + "us", (byte) -84, var0, -16777216, -256);
            if (class645.field9089 == 2 && class12.field248 != null) {
                for (int var4 = 0; var4 < class12.field248.length; ++var4) {
                    float var6 = (float) class12.field248[var4];
                    float var7 = var6 / 4194304.0F;
                    if (var7 > 1.0F) {
                        var7 = 1.0F;
                    }
                    float var8 = var7 * 255.0F;
                    float var9 = 255.0F - var8;
                    int var10 = (int) var9;
                    class12.field248[var4] = var10 | var10 << 8 | var10 << 16 | -16777216;
                }
                class112 var5 = class711.field10005.method476(0, class718.field10099, class286.field4384, true, class286.field4384, class12.field248);
                var5.method795(var0, 170, 1, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)[I")
    public final int[] method3894(int arg0) {
        ++field9781;
        if (this.field9777 == null) {
            String[] var2 = new String[this.field9770];
            this.field9777 = new int[this.field9770];
            int var3 = 0;
            while (~this.field9770 < ~var3) {
                var2[var3] = this.field9778[var3].field1148;
                this.field9777[var3] = var3++;
            }
            class715.method4042(this.field9777, -126, var2);
        }
        return arg0 != 520 ? null : this.field9777;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljv;B)V")
    public final void method3895(class88 arg0, byte arg1) {
        if (this.field9778 == null || ~this.field9770 <= ~this.field9778.length) {
            this.method3889(this.field9770 + 5, -21998);
        }
        ++field9776;
        this.field9778[this.field9770++] = arg0;
        if (arg1 < -60) {
            this.field9777 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static final void method3896(byte arg0) {
        ++field9783;
        if (arg0 != -70) {
            method3893();
        }
        if (~class590.field8336.toLowerCase().indexOf("microsoft") != 0) {
            class74.field996[191] = 73;
            class74.field996[190] = 72;
            class74.field996[188] = 71;
            class74.field996[186] = 57;
            class74.field996[192] = 58;
            class74.field996[219] = 42;
            class74.field996[222] = 59;
            class74.field996[223] = 28;
            class74.field996[189] = 26;
            class74.field996[220] = 74;
            class74.field996[221] = 43;
            class74.field996[187] = 27;
        } else {
            if (class590.field8340 == null) {
                class74.field996[222] = 59;
                class74.field996[192] = 58;
            } else {
                class74.field996[520] = 59;
                class74.field996[222] = 58;
                class74.field996[192] = 28;
            }
            class74.field996[47] = 73;
            class74.field996[45] = 26;
            class74.field996[91] = 42;
            class74.field996[61] = 27;
            class74.field996[93] = 43;
            class74.field996[46] = 72;
            class74.field996[92] = 74;
            class74.field996[44] = 71;
            class74.field996[59] = 57;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lrv;I)V")
    private final void method3897(class120 arg0, int arg1) {
        ++field9774;
        int var3 = arg0.method842(2384);
        if ((2 & var3) != 0) {
            this.field9782 = true;
        }
        if ((var3 & 1) != 0) {
            this.field9773 = true;
        }
        super.field7577 = arg0.method834(-8616);
        this.field9780 = arg0.method834(-8616);
        this.field9771 = arg0.method861(true);
        arg0.method842(2384);
        this.field9772 = arg0.method877(-252);
        this.field9785 = arg0.method877(-252);
        int var4 = 48 / ((36 - arg1) / 61);
        this.field9770 = arg0.method898((byte) -107);
        if (~this.field9770 < -1) {
            this.field9778 = new class88[this.field9770];
            for (int var5 = 0; ~var5 > ~this.field9770; ++var5) {
                class88 var6 = new class88();
                if (this.field9773) {
                    arg0.method834(-8616);
                }
                if (this.field9782) {
                    var6.field1148 = arg0.method861(true);
                }
                var6.field1147 = arg0.method877(-252);
                var6.field1145 = arg0.method898((byte) -88);
                this.field9778[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lrv;)V")
    public class692(class120 arg0) {
        this.method3897(arg0, 124);
    }
}
