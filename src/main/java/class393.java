import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class393 {

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "Lml;")
    private class408 field5094 = new class408();

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "Ljava/lang/String;")
    public String field5085;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "Z")
    public static boolean field5086 = false;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "Lde;")
    public static class558 field5089 = new class558("WTI", "office", "_wti", 5);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "I")
    private volatile int field5097;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "Lafa;")
    private class364 field5095;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "[B")
    public static byte[] field5092;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)Z")
    public final boolean method2301(boolean arg0) {
        field5093++;
        if (!arg0) {
            this.field5094 = null;
        }
        return this.field5097 == 0;
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(Z)V")
    public static void method2302(boolean arg0) {
        if (arg0) {
            field5092 = null;
            field5089 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5087++;
        class519.method3113(arg2, arg5 ^ 0xFFFFE382);
        int var7 = arg5;
        int var8 = arg2 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg1 >= class187.field2268 && class461.field6480 >= arg1) {
            int[] var15 = class4.field49[arg1];
            int var16 = class155.method1103(class471.field6572, arg0 - arg2, false, class223.field2604);
            int var17 = class155.method1103(class471.field6572, arg0 + arg2, false, class223.field2604);
            int var18 = class155.method1103(class471.field6572, arg0 - var8, false, class223.field2604);
            int var19 = class155.method1103(class471.field6572, arg0 + var8, false, class223.field2604);
            class455.method2755(arg4, var15, (byte) 74, var18, var16);
            class455.method2755(arg3, var15, (byte) 56, var19, var18);
            class455.method2755(arg4, var15, (byte) 83, var17, var19);
        }
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class506.field7199[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg1 - var9;
                int var21 = arg1 + var9;
                if (var21 >= class187.field2268 && var20 <= class461.field6480) {
                    if (var9 >= var8) {
                        int var22 = class155.method1103(class471.field6572, arg0 + var7, false, class223.field2604);
                        int var23 = class155.method1103(class471.field6572, arg0 - var7, false, class223.field2604);
                        if (class461.field6480 >= var21) {
                            class455.method2755(arg4, class4.field49[var21], (byte) 83, var22, var23);
                        }
                        if (var20 >= class187.field2268) {
                            class455.method2755(arg4, class4.field49[var20], (byte) 18, var22, var23);
                        }
                    } else {
                        int var24 = class506.field7199[var9];
                        int var25 = class155.method1103(class471.field6572, arg0 + var7, false, class223.field2604);
                        int var26 = class155.method1103(class471.field6572, arg0 - var7, false, class223.field2604);
                        int var27 = class155.method1103(class471.field6572, arg0 + var24, false, class223.field2604);
                        int var28 = class155.method1103(class471.field6572, arg0 - var24, false, class223.field2604);
                        if (class461.field6480 >= var21) {
                            int[] var29 = class4.field49[var21];
                            class455.method2755(arg4, var29, (byte) 119, var28, var26);
                            class455.method2755(arg3, var29, (byte) 54, var27, var28);
                            class455.method2755(arg4, var29, (byte) 62, var25, var27);
                        }
                        if (class187.field2268 <= var20) {
                            int[] var30 = class4.field49[var20];
                            class455.method2755(arg4, var30, (byte) 21, var28, var26);
                            class455.method2755(arg3, var30, (byte) 110, var27, var28);
                            class455.method2755(arg4, var30, (byte) 76, var25, var27);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (var32 >= class187.field2268 && var31 <= class461.field6480) {
                int var33 = arg0 + var9;
                int var34 = arg0 - var9;
                if (class471.field6572 <= var33 && var34 <= class223.field2604) {
                    int var35 = class155.method1103(class471.field6572, var33, false, class223.field2604);
                    int var36 = class155.method1103(class471.field6572, var34, false, class223.field2604);
                    if (var7 >= var8) {
                        if (var32 <= class461.field6480) {
                            class455.method2755(arg4, class4.field49[var32], (byte) 95, var35, var36);
                        }
                        if (class187.field2268 <= var31) {
                            class455.method2755(arg4, class4.field49[var31], (byte) 87, var35, var36);
                        }
                    } else {
                        int var37 = var7 > var11 ? class506.field7199[var7] : var11;
                        int var38 = class155.method1103(class471.field6572, arg0 + var37, false, class223.field2604);
                        int var39 = class155.method1103(class471.field6572, arg0 - var37, false, class223.field2604);
                        if (var32 <= class461.field6480) {
                            int[] var40 = class4.field49[var32];
                            class455.method2755(arg4, var40, (byte) 27, var39, var36);
                            class455.method2755(arg3, var40, (byte) 49, var38, var39);
                            class455.method2755(arg4, var40, (byte) 97, var35, var38);
                        }
                        if (class187.field2268 <= var31) {
                            int[] var41 = class4.field49[var31];
                            class455.method2755(arg4, var41, (byte) 44, var39, var36);
                            class455.method2755(arg3, var41, (byte) 72, var38, var39);
                            class455.method2755(arg4, var41, (byte) 33, var35, var38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lafa;Z)V")
    public final void method2304(class364 arg0, boolean arg1) {
        this.field5095 = arg0;
        field5096++;
        if (arg1) {
            this.method2307((byte) 39);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lvja;I)V")
    public final void method2305(class291 arg0, int arg1) {
        field5090++;
        class408 var3 = this.field5094;
        synchronized (this.field5094) {
            if (arg1 != 13606) {
                return;
            }
            this.field5094.method2444(arg1 - 2020, arg0);
            this.field5097++;
        }
        if (this.field5095 != null) {
            class364 var4 = this.field5095;
            synchronized (this.field5095) {
                this.field5095.notify();
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lgda;B)V")
    public final void method2306(class61 arg0, byte arg1) {
        field5088++;
        arg0.field807 = false;
        int var3 = 55 / ((-arg1 - 15) / 52);
        class408 var4 = this.field5094;
        synchronized (this.field5094) {
            this.field5094.method2444(11586, arg0);
            this.field5097++;
        }
        if (this.field5095 != null) {
            class364 var5 = this.field5095;
            synchronized (this.field5095) {
                this.field5095.notify();
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)Lqha;")
    public final class112 method2307(byte arg0) {
        field5084++;
        Object var2 = null;
        class408 var3 = this.field5094;
        class112 var4;
        synchronized (this.field5094) {
            var4 = this.field5094.method2447(-103);
            var4.method892(50560);
            this.field5097--;
        }
        if (arg0 >= -72) {
            field5089 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lgda;I)V")
    public final void method2308(class61 arg0, int arg1) {
        arg0.field807 = true;
        field5091++;
        class408 var3 = this.field5094;
        synchronized (this.field5094) {
            this.field5094.method2444(11586, arg0);
            this.field5097++;
        }
        if (this.field5095 != null) {
            class364 var4 = this.field5095;
            synchronized (this.field5095) {
                this.field5095.notify();
            }
        }
        if (arg1 != -1) {
            this.field5094 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class393(String arg0) {
        this.field5085 = arg0;
    }
}
