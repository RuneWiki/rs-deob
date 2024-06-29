import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class55 extends class232 {

    @OriginalMember(owner = "client!fn", name = "U", descriptor = "I")
    private int field882 = 4;

    @OriginalMember(owner = "client!fn", name = "V", descriptor = "I")
    private int field883 = 4;

    @OriginalMember(owner = "client!fn", name = "Y", descriptor = "Lhi;")
    public static class82 field886 = class95.method664((byte) -105, "<br>");

    @OriginalMember(owner = "client!fn", name = "db", descriptor = "Lhi;")
    public static class82 field891 = class95.method664((byte) -114, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!fn", name = "Q", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!fn", name = "R", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!fn", name = "S", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!fn", name = "X", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!fn", name = "Z", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!fn", name = "ab", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!fn", name = "bb", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!fn", name = "cb", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!fn", name = "T", descriptor = "Lsm;")
    public static class120 field881;

    @OriginalMember(owner = "client!fn", name = "W", descriptor = "Lum;")
    public static class222 field884;

    @OriginalMember(owner = "client!fn", name = "P", descriptor = "Ljf;")
    public static class86 field877;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method382(boolean arg0) {
        if (!arg0) {
            field879 = 28;
        }
        field890++;
        class90.field1625.method2172(false);
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V", line = 21)
    public class55() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIILsm;II)Ljava/awt/Frame;", line = 27)
    public static final Frame method383(int arg0, int arg1, int arg2, class120 arg3, int arg4, int arg5) {
        field888++;
        if (!arg3.method825(true)) {
            return null;
        }
        if (arg1 == 0) {
            class324[] var6 = class105.method723(arg3, (byte) -122);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field5563 == arg2 && var6[var8].field5562 == arg5 && (arg0 == 0 || var6[var8].field5565 == arg0) && (!var7 || var6[var8].field5573 > arg1)) {
                    arg1 = var6[var8].field5573;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class301 var9 = arg3.method814(arg2, arg1, arg0, arg5, -126);
        while (var9.field5121 == 0) {
            class290.method2001(10L, false);
        }
        Frame var10 = (Frame) var9.field5122;
        if (var10 == null) {
            return null;
        } else if (var9.field5121 == arg4) {
            class144.method978(-2, arg3, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBLbc;)V", line = 111)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg0 == 0) {
            this.field883 = arg2.method1082(arg1 ^ 0x74);
        } else if (arg0 == 1) {
            this.field882 = arg2.method1082(-85);
        }
        field878++;
        if (arg1 != -19) {
            this.method81(-29, (byte) -22, (class153) null);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)[[I", line = 144)
    public final int[][] method146(int arg0, byte arg1) {
        int[][] var3 = this.field3996.method136(0, arg0);
        if (this.field3996.field278) {
            int var4 = class133.field2294 / this.field882;
            int var5 = class54.field858 / this.field883;
            int[][] var6;
            if (var4 <= 0) {
                var6 = this.method1641(0, 0, (byte) -98);
            } else {
                int var7 = arg0 % var4;
                var6 = this.method1641(0, class133.field2294 * var7 / var4, (byte) -98);
            }
            int[] var8 = var6[1];
            int[] var9 = var6[0];
            int[] var10 = var6[2];
            int[] var11 = var3[1];
            int[] var12 = var3[0];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class54.field858; var14++) {
                int var15;
                if (var5 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var5;
                    var15 = class54.field858 * var16 / var5;
                }
                var12[var14] = var9[var15];
                var11[var14] = var8[var15];
                var13[var14] = var10[var15];
            }
        }
        if (arg1 != -82) {
            this.method146(-43, (byte) -45);
        }
        field887++;
        return var3;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(IB)[I", line = 208)
    public final int[] method80(int arg0, byte arg1) {
        field880++;
        int var3 = -95 % ((-arg1 - 31) / 55);
        int[] var4 = this.field4008.method131((byte) -73, arg0);
        if (this.field4008.field256) {
            int var5 = class133.field2294 / this.field882;
            int var6 = class54.field858 / this.field883;
            int[] var7;
            if (var5 <= 0) {
                var7 = this.method1649(0, (byte) 61, 0);
            } else {
                int var8 = arg0 % var5;
                var7 = this.method1649(0, (byte) 80, class133.field2294 * var8 / var5);
            }
            for (int var9 = 0; var9 < class54.field858; var9++) {
                if (var6 <= 0) {
                    var4[var9] = var7[0];
                } else {
                    int var10 = var9 % var6;
                    var4[var9] = var7[class54.field858 * var10 / var6];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIZIIBIIIII)Z", line = 268)
    public static final boolean method384(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg6 >= -79) {
            field884 = (class222) null;
        }
        field885++;
        if (class168.field2932.method520(true) == 2) {
            return class324.method2235(arg9, arg10, arg1, arg11, arg2, arg7, arg0, arg3, arg4, arg5, 58, arg8);
        } else if (class168.field2932.method520(true) > 2) {
            return class13.method74(arg4, arg8, arg5, arg9, arg2, arg0, class168.field2932.method520(true), arg1, arg10, 0, arg7, arg3, arg11);
        } else {
            return class229.method1628(arg1, arg8, arg0, arg2, arg3, arg11, arg9, (byte) -56, arg4, arg7, arg10, arg5);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILlb;II)V", line = 288)
    public static final void method385(int arg0, int arg1, class233 arg2, int arg3, int arg4) {
        field889++;
        if (class309.field5262 >= 400) {
            return;
        }
        if (arg2.field4063 != null) {
            arg2 = arg2.method1652(false);
        }
        if (arg2 == null || !arg2.field4071) {
            return;
        }
        if (arg0 != -27050) {
            field891 = (class82) null;
        }
        class82 var5 = arg2.field4027;
        if (arg2.field4080 != 0) {
            var5 = class29.method182(-6039, new class82[] { var5, class61.method400(arg2.field4080, arg0 ^ -17364, class168.field2932.field1407), class72.field1108, class281.field4716, class327.method2240((byte) -74, arg2.field4080), class28.field385 });
        }
        if (class271.field4578 == 1) {
            class47.method341(2300, (long) arg3, (short) 1, arg4, class29.method182(-6039, new class82[] { class321.field5537, class181.field3101, var5 }), arg1, class19.field238);
            class219.field3791++;
        } else if (!class256.field4406) {
            class228.field3946++;
            class82[] var6 = arg2.field4022;
            if (class127.field2233) {
                var6 = client.method858(var6, 0);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class22.field307 != 0 || !var6[var7].method543(class198.field3396, (byte) 114))) {
                        class166.field2893++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 29;
                        }
                        if (var7 == 1) {
                            var8 = 32;
                        }
                        if (var7 == 2) {
                            var8 = 16;
                        }
                        if (var7 == 3) {
                            var8 = 38;
                        }
                        if (var7 == 4) {
                            var8 = 26;
                        }
                        class47.method341(2300, (long) arg3, var8, arg4, class29.method182(arg0 ^ 0x7E3F, new class82[] { class269.field4553, var5 }), arg1, var6[var7]);
                    }
                }
            }
            if (class22.field307 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method543(class198.field3396, (byte) 118)) {
                        class74.field1132++;
                        short var10 = 0;
                        if (class168.field2932.field1407 < arg2.field4080) {
                            var10 = 2000;
                        }
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 29;
                        }
                        if (var9 == 1) {
                            var11 = 32;
                        }
                        if (var9 == 2) {
                            var11 = 16;
                        }
                        if (var9 == 3) {
                            var11 = 38;
                        }
                        if (var9 == 4) {
                            var11 = 26;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class47.method341(arg0 + 29350, (long) arg3, var11, arg4, class29.method182(-6039, new class82[] { class269.field4553, var5 }), arg1, var6[var9]);
                    }
                }
            }
            class47.method341(2300, (long) arg3, (short) 1001, arg4, class29.method182(arg0 + 21011, new class82[] { class269.field4553, var5 }), arg1, class242.field4216);
        } else if ((class193.field3272 & 0x2) == 2) {
            class196.field3327++;
            class47.method341(2300, (long) arg3, (short) 58, arg4, class29.method182(-6039, new class82[] { class48.field800, class181.field3101, var5 }), arg1, class119.field2105);
        }
    }

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "(I)V", line = 437)
    public static void method386(int arg0) {
        if (arg0 != -2) {
            field891 = (class82) null;
        }
        field891 = null;
        field886 = null;
        field884 = null;
        field877 = null;
        field881 = null;
    }
}
