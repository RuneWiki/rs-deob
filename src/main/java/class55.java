import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class55 {

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
    private int field754 = -1;

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
    public int field753 = -1;

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "I")
    private int field763 = 0;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "Z")
    public boolean field761 = false;

    @OriginalMember(owner = "client!wba", name = "s", descriptor = "I")
    private int field770 = 128;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "I")
    private int field762 = 0;

    @OriginalMember(owner = "client!wba", name = "v", descriptor = "I")
    private int field773 = 0;

    @OriginalMember(owner = "client!wba", name = "q", descriptor = "I")
    private int field768 = 128;

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "B")
    public byte field777 = 0;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "I")
    public static int field755 = 0;

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "Ljo;")
    public static class351 field759 = new class351(15, 8);

    @OriginalMember(owner = "client!wba", name = "A", descriptor = "I")
    public static int field778 = 0;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "I")
    public int field765;

    @OriginalMember(owner = "client!wba", name = "p", descriptor = "I")
    private int field767;

    @OriginalMember(owner = "client!wba", name = "r", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!wba", name = "u", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!wba", name = "y", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!wba", name = "x", descriptor = "Ljf;")
    public class224 field775;

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "[S")
    private short[] field760;

    @OriginalMember(owner = "client!wba", name = "o", descriptor = "[S")
    private short[] field766;

    @OriginalMember(owner = "client!wba", name = "t", descriptor = "[S")
    private short[] field771;

    @OriginalMember(owner = "client!wba", name = "w", descriptor = "[S")
    private short[] field774;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lgf;Ls;IBIIILs;ZIILha;I)Lka;")
    public final class495 method350(class289 arg0, class292 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, class292 arg7, boolean arg8, int arg9, int arg10, class66 arg11, int arg12) {
        if (arg3 == 2) {
            field752++;
            return this.method352(arg11, arg7, 57, arg6, (byte) 2, arg2, arg5, arg4, arg9, arg0, arg8, arg10, arg12, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lha;ZIIILgf;I)Lka;")
    public final class495 method351(class66 arg0, boolean arg1, int arg2, int arg3, int arg4, class289 arg5, int arg6) {
        if (!arg1) {
            this.field775 = null;
        }
        field772++;
        return this.method352(arg0, null, 55, 0, (byte) 2, 0, arg2, arg6, arg3, arg5, false, 0, arg4, null);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lha;Ls;IIBIIIILgf;ZIILs;)Lka;")
    private final class495 method352(class66 arg0, class292 arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, class289 arg9, boolean arg10, int arg11, int arg12, class292 arg13) {
        field757++;
        int var15 = arg12;
        class129 var16 = this.field753 == -1 || arg8 == -1 ? null : arg9.method1931((byte) -81, this.field753);
        boolean var17 = arg10 & this.field777 != 0;
        if (var16 != null) {
            var15 = arg12 | var16.method934(arg6, 256, arg8, false);
        }
        if (var17) {
            var15 |= this.field777 == 3 ? 7 : 2;
        }
        if (this.field770 != 128) {
            var15 |= 0x2;
        }
        if (this.field768 != 128 || this.field763 != 0) {
            var15 |= 0x5;
        }
        class387 var18 = this.field775.field3222;
        class495 var19;
        synchronized (this.field775.field3222) {
            var19 = (class495) this.field775.field3222.method2373((long) (this.field765 |= arg0.field884 << 29), 103);
        }
        if (var19 == null || arg0.method451(var19.method113(), var15) != 0) {
            if (var19 != null) {
                var15 = arg0.method421(var15, var19.method113());
            }
            int var20 = var15;
            if (this.field774 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field760 != null) {
                var20 |= 0x8000;
            }
            class229 var21 = class364.method2276(this.field775.field3218, (byte) -46, this.field767, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field3292 < 13) {
                var21.method1583(28395, 2);
            }
            var19 = arg0.method420(var21, var20, this.field775.field3223, this.field773 + 64, this.field762 + 850);
            if (this.field774 != null) {
                for (int var22 = 0; var22 < this.field774.length; var22++) {
                    var19.method111(this.field774[var22], this.field766[var22]);
                }
            }
            if (this.field760 != null) {
                for (int var23 = 0; var23 < this.field760.length; var23++) {
                    var19.method61(this.field760[var23], this.field771[var23]);
                }
            }
            var19.method85(var15);
            class387 var24 = this.field775.field3222;
            synchronized (this.field775.field3222) {
                this.field775.field3222.method2362(var19, 0, (long) (this.field765 |= arg0.field884 << 29));
            }
        }
        class495 var25 = var16 == null ? var19.method81(arg4, var15, true) : var16.method937(1827533136, 0, arg7, arg4, var15, var19, arg8, arg6);
        if (this.field768 != 128 || this.field770 != 128) {
            var25.method98(this.field768, this.field770, this.field768);
        }
        int var26 = 41 / ((-arg2 - 19) / 44);
        if (this.field763 != 0) {
            if (this.field763 == 90) {
                var25.method72(4096);
            }
            if (this.field763 == 180) {
                var25.method72(8192);
            }
            if (this.field763 == 270) {
                var25.method72(12288);
            }
        }
        if (var17) {
            var25.method102(this.field777, this.field754, arg1, arg13, arg3, arg11, arg5);
        }
        var25.method85(arg12);
        return var25;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lrv;II)V")
    private final void method353(class120 arg0, int arg1, int arg2) {
        field769++;
        if (arg1 == 1) {
            this.field767 = arg0.method898((byte) -109);
        } else if (arg1 == 2) {
            this.field753 = arg0.method898((byte) -101);
        } else if (arg1 == 4) {
            this.field768 = arg0.method898((byte) -122);
        } else if (arg1 == 5) {
            this.field770 = arg0.method898((byte) -82);
        } else if (arg1 == 6) {
            this.field763 = arg0.method898((byte) -88);
        } else if (arg1 == 7) {
            this.field773 = arg0.method842(2384);
        } else if (arg1 == 8) {
            this.field762 = arg0.method842(2384);
        } else if (arg1 == 9) {
            this.field777 = 3;
            this.field754 = 8224;
        } else if (arg1 == 10) {
            this.field761 = true;
        } else if (arg1 == 11) {
            this.field777 = 1;
        } else if (arg1 == 12) {
            this.field777 = 4;
        } else if (arg1 == 13) {
            this.field777 = 5;
        } else if (arg1 == 14) {
            this.field777 = 2;
            this.field754 = arg0.method842(arg2 - 14000) * 256;
        } else if (arg1 == 15) {
            this.field777 = 3;
            this.field754 = arg0.method898((byte) -81);
        } else if (arg1 == 16) {
            this.field777 = 3;
            this.field754 = arg0.method871(23995);
        } else if (arg1 == 40) {
            int var4 = arg0.method842(2384);
            this.field774 = new short[var4];
            this.field766 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field774[var5] = (short) arg0.method898((byte) -90);
                this.field766[var5] = (short) arg0.method898((byte) -95);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method842(arg2 ^ 0x4950);
            this.field760 = new short[var6];
            this.field771 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field760[var7] = (short) arg0.method898((byte) -78);
                this.field771[var7] = (short) arg0.method898((byte) -100);
            }
        }
        if (arg2 != 16384) {
            this.method350(null, null, 72, (byte) -61, -45, 7, -58, null, true, 38, 122, null, -123);
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V")
    public static void method354(byte arg0) {
        if (arg0 != 1) {
            field778 = -60;
        }
        field759 = null;
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)V")
    public static final void method355(byte arg0) {
        field756++;
        if (class792.field10865 == null || class300.field4511 == null) {
            class792.field10865 = new int[256];
            class300.field4511 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class792.field10865[var1] = (int) (Math.sin(var2) * 4096.0D);
                class300.field4511[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 >= -12) {
            method358(null, -118);
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(BILgf;IIILha;I)Lka;")
    public final class495 method356(byte arg0, int arg1, class289 arg2, int arg3, int arg4, int arg5, class66 arg6, int arg7) {
        if (arg4 == 0) {
            field764++;
            return this.method352(arg6, null, -91, 0, arg0, 0, arg5, arg7, arg1, arg2, false, 0, arg3, null);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lrv;I)V")
    public final void method357(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method842(2384);
            if (var3 == 0) {
                if (arg1 != -1) {
                    return;
                }
                field776++;
                return;
            }
            this.method353(arg0, var3, 16384);
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method358(String arg0, int arg1) {
        if (arg1 != 10) {
            method354((byte) -52);
        }
        field758++;
        return class26.method195(arg1 ^ 0xFFFFFFD8, true, 10, arg0);
    }
}
