import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class190 extends class76 {

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "I")
    private int field2892 = 0;

    @OriginalMember(owner = "client!ko", name = "J", descriptor = "I")
    private int field2895 = 0;

    @OriginalMember(owner = "client!ko", name = "P", descriptor = "Z")
    public boolean field2901 = false;

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "I")
    private int field2894 = 0;

    @OriginalMember(owner = "client!ko", name = "Q", descriptor = "I")
    private int field2902 = -32768;

    @OriginalMember(owner = "client!ko", name = "U", descriptor = "I")
    private int field2906 = -1;

    @OriginalMember(owner = "client!ko", name = "ab", descriptor = "I")
    private int field2912;

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "I")
    private int field2899;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
    public int field2885;

    @OriginalMember(owner = "client!ko", name = "S", descriptor = "Lkt;")
    private class61 field2904;

    @OriginalMember(owner = "client!ko", name = "K", descriptor = "Ljp;")
    public static class55 field2896 = new class55(82, 5);

    @OriginalMember(owner = "client!ko", name = "Y", descriptor = "Ld;")
    public static class242 field2910 = new class242(50);

    @OriginalMember(owner = "client!ko", name = "Z", descriptor = "[Z")
    public static boolean[] field2911 = new boolean[5];

    @OriginalMember(owner = "client!ko", name = "cb", descriptor = "[[[I")
    public static int[][][] field2914 = new int[2][][];

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!ko", name = "H", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!ko", name = "M", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!ko", name = "O", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!ko", name = "R", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!ko", name = "T", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!ko", name = "W", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!ko", name = "X", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!ko", name = "bb", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!ko", name = "V", descriptor = "Ltd;")
    private class382 field2907;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lza;III)Z")
    public final boolean method109(class299 arg0, int arg1, int arg2, int arg3) {
        ++field2898;
        if (arg2 < 23) {
            this.field2906 = -64;
        }
        return false;
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)Z")
    public final boolean method107(byte arg0) {
        ++field2893;
        return arg0 != -88;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZJII)Ljava/lang/String;")
    public static final String method1310(int arg0, boolean arg1, long arg2, int arg3, int arg4) {
        ++field2887;
        if (arg4 != 10) {
            return null;
        } else {
            char var6 = ',';
            char var7 = '.';
            if (arg3 == 0) {
                var7 = ',';
                var6 = '.';
            }
            if (arg3 == 2) {
                var7 = 160;
            }
            boolean var8 = false;
            if (arg2 < 0L) {
                var8 = true;
                arg2 = -arg2;
            }
            StringBuffer var9 = new StringBuffer(26);
            if (~arg0 < -1) {
                for (int var10 = 0; arg0 > var10; ++var10) {
                    int var11 = (int) arg2;
                    arg2 /= 10L;
                    var9.append((char) (48 - (-var11 - -((int) arg2 * 10))));
                }
                var9.append(var6);
            }
            int var12 = 0;
            while (true) {
                int var13 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (-((int) arg2 * 10) + 48 + var13));
                if (arg2 == 0L) {
                    if (var8) {
                        var9.append('-');
                    }
                    return var9.reverse().toString();
                }
                if (arg1) {
                    ++var12;
                    if (~(var12 % 3) == -1) {
                        var9.append(var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Lsg;")
    public static final class327 method1311(byte arg0) {
        ++field2903;
        if (arg0 != 43) {
            return null;
        } else {
            class327 var1 = (class327) class351.field5229.method1073(arg0 ^ 17533);
            if (var1 != null) {
                --class188.field2883;
                return var1;
            } else {
                return new class327();
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILza;II)Le;")
    private final class289 method1312(int arg0, class299 arg1, int arg2, int arg3) {
        ++field2908;
        int var5 = -66 / ((49 - arg2) / 61);
        class434 var6 = class232.field3490.method2625((byte) 116, arg0);
        class11 var7 = class274.field4306[super.field1274];
        class11 var8 = this.field2899 >= 3 ? null : class274.field4306[this.field2899 + 1];
        return this.field2901 ? var6.method2692(0, class393.field5735, -1, super.field1278, super.field1275, -1, arg1, true, (byte) 83, var7, var8, arg3, super.field1279) : var6.method2692(this.field2894, class393.field5735, this.field2895, super.field1278, super.field1275, this.field2906, arg1, true, (byte) 83, var7, var8, arg3, super.field1279);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI)V")
    public final void method1313(byte arg0, int arg1) {
        ++field2891;
        if (!this.field2901) {
            this.field2894 += arg1;
            while (this.field2894 > this.field2904.field962[this.field2895]) {
                this.field2894 -= this.field2904.field962[this.field2895];
                ++this.field2895;
                if (~this.field2904.field976.length >= ~this.field2895) {
                    this.field2901 = true;
                    break;
                }
            }
            if (!this.field2901) {
                class439.method2721(false, this.field2904, super.field1275, this.field2895, (byte) 116, super.field1279, super.field1274);
            }
            if (arg0 != 45) {
                this.method101(true);
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(ILza;)Lhp;")
    public final class293 method110(int arg0, class299 arg1) {
        ++field2889;
        class289 var3 = this.method1312(this.field2912, arg1, 116, (~this.field2892 == -1 ? 0 : 5) | 2048);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field2892 != -1) {
                var3.method667(this.field2892 * 2048);
            }
            if (arg0 != 0) {
                this.method108(-27);
            }
            class517 var4 = arg1.method538();
            var4.method951(super.field1275, super.field1278, super.field1279);
            if (this.field2907 != null) {
                class320 var5 = this.field2907.method2424();
                arg1.method584(var3, var5, var4, (class41) null, 0);
            } else {
                var3.method673(var4, (class41) null, 0);
            }
            this.field2902 = var3.method654();
            this.method1315((byte) -125, arg1, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field2912 = arg0;
        this.field2899 = arg4;
        this.field2885 = arg2 - -arg1;
        this.field2892 = arg12;
        class434 var14 = class232.field3490.method2625((byte) 116, this.field2912);
        int var15 = var14.field6450;
        if (~var15 != 0) {
            this.field2904 = class393.field5735.method1538(-4031, var15);
            this.field2901 = false;
        } else {
            this.field2901 = true;
        }
        if (this.field2885 == arg2) {
            class439.method2721(false, this.field2904, super.field1275, this.field2895, (byte) 116, super.field1279, super.field1274);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
    public final void method1314(int arg0) {
        if (arg0 == -1) {
            ++field2890;
            if (this.field2907 != null) {
                this.field2907.method2430();
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V")
    public final void method108(int arg0) {
        int var2 = 94 / ((arg0 - 48) / 37);
        ++field2886;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLza;Le;)V")
    private final void method1315(byte arg0, class299 arg1, class289 arg2) {
        ++field2909;
        if (arg0 > -124) {
            this.method102((class299) null, -47, -53, 11, (class352) null, -97, true);
        }
        class476[] var4 = arg2.method665();
        class349[] var5 = arg2.method634();
        if ((this.field2907 == null || this.field2907.field5606) && (var4 != null || var5 != null)) {
            this.field2907 = new class382(class446.field6625);
        }
        if (this.field2907 != null) {
            this.field2907.method2421(arg1, (long) class446.field6625, var4, var5, false);
            this.field2907.method2431(super.field1274, super.field1283, super.field1271, super.field1277, super.field1272);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILza;)V")
    public final void method98(int arg0, class299 arg1) {
        ++field2897;
        class289 var3 = this.method1312(this.field2912, arg1, -56, 0);
        if (var3 != null) {
            this.method1315((byte) -127, arg1, var3);
        }
        if (arg0 != 31203) {
            field2911 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)I")
    public final int method101(boolean arg0) {
        if (arg0) {
            this.method98(19, (class299) null);
        }
        ++field2900;
        return this.field2902;
    }

    @OriginalMember(owner = "client!ko", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field2907 != null) {
            this.field2907.method2430();
        }
        ++field2913;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
    public static void method1316(int arg0) {
        field2910 = null;
        field2911 = null;
        field2896 = null;
        if (arg0 <= 21) {
            method1311((byte) 115);
        }
        field2914 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lfi;IBI)V")
    public static final void method1317(class38 arg0, int arg1, byte arg2, int arg3) {
        ++field2888;
        int var4 = -93 / ((arg2 - 23) / 47);
        if (class2.field17) {
            class450 var5 = ~class509.field7406 != 0 ? class264.field4225.method2789((byte) 36, class509.field7406) : null;
            if (client.method3078(arg0).method799((byte) -98) && (32 & class166.field2500) != 0) {
                if (var5 == null || arg0.method262((byte) -70, var5.field6692, class509.field7406) != var5.field6692) {
                    ++class413.field6088;
                    class423.method2637(0L, arg0.field499, arg0.field607, (byte) -113, true, 25, class218.field3297, class246.field3688, false, arg0.field580, class447.field6638 + " -> " + arg0.field543);
                }
                return;
            }
        } else {
            for (int var6 = 9; ~var6 <= -6; --var6) {
                String var10 = class162.method1158(-9197, var6, arg0);
                if (var10 != null) {
                    class423.method2637((long) (var6 + 1), arg0.field499, arg0.field607, (byte) -113, true, 1008, var10, class253.method1796(arg0, false, var6), false, arg0.field580, arg0.field543);
                    ++class514.field7492;
                }
            }
            String var7 = class394.method2475(94, arg0);
            if (var7 != null) {
                class423.method2637(0L, arg0.field499, arg0.field607, (byte) -113, true, 2, var7, arg0.field618, false, arg0.field580, arg0.field543);
                ++class283.field4414;
            }
            for (int var8 = 4; ~var8 <= -1; --var8) {
                String var9 = class162.method1158(-9197, var8, arg0);
                if (var9 != null) {
                    class423.method2637((long) (var8 + 1), arg0.field499, arg0.field607, (byte) -113, true, 23, var9, class253.method1796(arg0, false, var8), false, arg0.field580, arg0.field543);
                    ++class514.field7492;
                }
            }
            if (!client.method3078(arg0).method795(7)) {
                return;
            }
            ++class21.field234;
            if (arg0.field625 != null) {
                class423.method2637(0L, arg0.field499, arg0.field607, (byte) -113, true, 47, arg0.field625, -1, false, arg0.field580, "");
                return;
            }
            class423.method2637(0L, arg0.field499, arg0.field607, (byte) -113, true, 47, class162.field2450.method1265(class345.field5141, -110), -1, false, arg0.field580, "");
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lza;IIILps;IZ)V")
    public final void method102(class299 arg0, int arg1, int arg2, int arg3, class352 arg4, int arg5, boolean arg6) {
        ++field2905;
        if (arg3 == -750) {
            throw new IllegalStateException();
        }
    }
}
