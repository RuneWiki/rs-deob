import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public abstract class class337 {

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    public int field4978;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public int field4970;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "Z")
    public static boolean field4977 = false;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "[I")
    public static int[] field4976 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field4973 = 0;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field4975 = 0;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "[[Z")
    public static boolean[][] field4974;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Loc;IIIIZ)V")
    public abstract void method783(class93 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method780(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method790(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)I")
    public abstract int method781(int arg0, int arg1);

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()V")
    public abstract void method785();

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(Loc;IIIIZ)Z")
    public abstract boolean method778(class93 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
    public abstract void method791(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
    public static final void method2234(byte arg0) {
        field4972++;
        if (arg0 <= 81) {
            method2239(11);
        }
        class367.field5457.method204((byte) 56);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)I")
    public static final int method2235(boolean arg0) {
        field4968++;
        if (class229.field3230 || class10.field97 <= 0) {
            int var1 = class34.field555;
            int var2 = class316.field4522;
            int var3 = class394.field5912;
            int var4 = class200.field2861;
            int var5 = class272.field3995;
            if (var3 < var1 && var1 < (var3 + var5)) {
                int var6 = -1;
                for (int var7 = 0; var7 < class10.field97; var7++) {
                    if (class446.field6493) {
                        int var11 = var4 + ((class10.field97 - (var7 + 1)) * 16) + 33;
                        if (var2 > (var11 - 13) && var11 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class10.field97 - (var7 + 1)) * 16 + var4 + 31;
                        if (var2 > (var12 - 13) && var12 + 3 >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class168 var9 = new class168(class373.field5574);
                    for (class259 var10 = (class259) var9.method1043((byte) -111); var10 != null; var10 = (class259) var9.method1044(-25293)) {
                        if (var8++ == var6) {
                            return var10.field3771;
                        }
                    }
                }
            }
            if (!arg0) {
                method2237(-73, -26, -50, -98, (class437) null, (class386) null, -127);
            }
            return -1;
        } else if (class91.field1254 && class1.field5[81] && class10.field97 > 2) {
            return ((class259) class373.field5574.field6108.field5898.field5898).field3771;
        } else {
            return ((class259) class373.field5574.field6108.field5898).field3771;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public static final void method2236(int arg0) {
        field4979++;
        class114.field1556.method761(arg0 - 3828);
        int var1 = class114.field1556.method763(1, false);
        if (var1 == 0) {
            return;
        }
        int var2 = class114.field1556.method763(2, false);
        if (var2 == 0) {
            class159.field2085[class439.field6430++] = 2047;
        } else if (var2 == 1) {
            int var3 = class114.field1556.method763(3, false);
            class100.field1350.method135(var3, true, 1);
            int var4 = class114.field1556.method763(1, false);
            if (var4 == 1) {
                class159.field2085[class439.field6430++] = 2047;
            }
        } else {
            if (arg0 != 3943) {
                method2237(-70, -116, -14, -120, (class437) null, (class386) null, -30);
            }
            if (var2 == 2) {
                if (class114.field1556.method763(1, false) == 1) {
                    int var5 = class114.field1556.method763(3, false);
                    class100.field1350.method135(var5, true, 2);
                    int var6 = class114.field1556.method763(3, false);
                    class100.field1350.method135(var6, true, 2);
                } else {
                    int var7 = class114.field1556.method763(3, false);
                    class100.field1350.method135(var7, true, 0);
                }
                int var8 = class114.field1556.method763(1, false);
                if (var8 == 1) {
                    class159.field2085[class439.field6430++] = 2047;
                }
            } else if (var2 == 3) {
                int var9 = class114.field1556.method763(1, false);
                if (var9 == 1) {
                    class159.field2085[class439.field6430++] = 2047;
                }
                class193.field2688 = class114.field1556.method763(2, false);
                int var10 = class114.field1556.method763(1, false);
                int var11 = class114.field1556.method763(7, false);
                int var12 = class114.field1556.method763(7, false);
                class100.field1350.method1215(var10 == 1, true, var12, class193.field2688, var11);
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lfe;[I)V")
    public abstract void method795(class403 arg0, int[] arg1);

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)I")
    public abstract int method797(int arg0, int arg1);

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(Loc;IIIIZ)V")
    public abstract void method787(class93 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIILnr;Lfl;I)V")
    public static final void method2237(int arg0, int arg1, int arg2, int arg3, class437 arg4, class386 arg5, int arg6) {
        field4969++;
        if (class424.field6305 < 100) {
            class100.method679(arg5, arg4, -4648);
        }
        arg4.method2155(arg1, arg2, arg0 + arg1, arg2 + arg6);
        if (class424.field6305 < 100) {
            byte var7 = 20;
            int var8 = arg0 / 2 + arg1;
            arg4.method2188(arg1, arg2, arg0, arg6, -16777216, 0);
            int var9 = arg6 / 2 + arg2 - var7 - 18;
            arg4.method2057(var8 - 152, var9, 304, 34, class242.field3397[class69.field953].getRGB(), 0);
            arg4.method2188(var8 - 150, var9 - -2, class424.field6305 * 3, 30, class190.field2598[class69.field953].getRGB(), 0);
            class232.field3275.method1318((byte) 121, -1, class370.field5496, class58.field846[class69.field953].getRGB(), var8, var7 + var9);
            return;
        }
        int var10 = class169.field2222 - ((int) ((float) arg0 / class76.field1027));
        int var11 = (int) ((float) arg6 / class76.field1027) + class133.field1778;
        if (arg3 >= -116) {
            return;
        }
        int var12 = (int) ((float) arg0 / class76.field1027) + class169.field2222;
        client.field3687 = class133.field1778 - ((int) ((float) arg6 / class76.field1027));
        class235.field3307 = class169.field2222 - ((int) ((float) arg0 / class76.field1027));
        class107.field1465 = (int) ((float) (arg0 * 2) / class76.field1027);
        class271.field3971 = (int) ((float) (arg6 * 2) / class76.field1027);
        int var13 = class133.field1778 - ((int) ((float) arg6 / class76.field1027));
        class76.method479(class76.field1041 + var10, class76.field1044 + var11, var12 + class76.field1041, var13 - -class76.field1044, arg1, arg2, arg0 + arg1, arg2 + arg6 - -1);
        class76.method474(arg4);
        class408 var14 = class76.method471(arg4);
        class139.method938(true, arg4, 0, var14, 0);
        if (class292.field4230 > 0) {
            class395.field5935--;
            if (class395.field5935 == 0) {
                class292.field4230--;
                class395.field5935 = 20;
            }
        }
        if (!class423.field6298) {
            return;
        }
        int var15 = arg0 + arg1 - 5;
        int var16 = arg2 + arg6 - 8;
        class311.field4456.method1328(-1, (byte) -82, var15, "Fps:" + class33.field551, 16776960, var16);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class311.field4456.method1328(-1, (byte) -74, var15, "Mem:" + var18 + "k", var19, var20);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public abstract void method793(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14);

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIILbr;Lbr;)V")
    public static final void method2238(int arg0, int arg1, int arg2, class349 arg3, class349 arg4) {
        if (class343.field5032[arg0][arg1][arg2] == null) {
            class433.method2749(arg0, arg1, arg2);
        }
        class343.field5032[arg0][arg1][arg2].field117 = arg3;
        class343.field5032[arg0][arg1][arg2].field120 = arg4;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
    public static void method2239(int arg0) {
        field4976 = null;
        field4974 = null;
        if (arg0 != -8657) {
            method2234((byte) -32);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public abstract void method779(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11);

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(II)V")
    public abstract void method786(int arg0, int arg1);

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILoc;)Loc;")
    public abstract class93 method784(int arg0, int arg1, class93 arg2);

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(II)V")
    public class337(int arg0, int arg1) {
        this.field4978 = arg0;
        this.field4970 = arg1;
    }
}
