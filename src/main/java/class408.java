import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public abstract class class408 {

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "[I")
    public static int[] field5789 = new int[] { 25000, 2000 };

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public int field5787;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "Ljava/lang/String;")
    public String field5790;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 3)
    public static void method2466(int arg0) {
        if (arg0 != -1) {
            field5789 = null;
        }
        field5789 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIII)V", line = 15)
    public static final void method2467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 25000) {
            return;
        }
        class311.field4115 = arg2;
        class224.field2914 = arg5;
        class417.field5911 = arg4;
        class175.field2160 = arg0;
        field5791++;
        class366.field4932 = arg1;
        if (class366.field4932 >= 100) {
            int var6 = class175.field2160 * 512 + 256;
            int var7 = class224.field2914 * 512 + 256;
            int var8 = class589.method3416(var6, -92, class617.field8853, var7) - class417.field5911;
            int var9 = var6 - class346.field4550;
            int var10 = var8 - class614.field8846;
            int var11 = var7 - class627.field8995;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class569.field8329 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class89.field1250 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (class569.field8329 < 1024) {
                class569.field8329 = 1024;
            }
            class377.field5071 = 0;
            if (class569.field8329 > 3072) {
                class569.field8329 = 3072;
            }
        }
        class221.field2860 = -1;
        class51.field842 = -1;
        class586.field8507 = 2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIII)V", line = 62)
    public static final void method2468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class101.method754(1, arg4);
        field5786++;
        int var7 = 0;
        int var8 = arg4 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = -67 / ((44 - arg3) / 36);
        int var12 = var8;
        int var13 = -var8;
        int var14 = -1;
        if (class598.field8632 <= arg0 && class288.field3883 >= arg0) {
            int[] var15 = class678.field9722[arg0];
            int var16 = class396.method2393(class587.field8513, class221.field2866, 5890, arg2 - arg4);
            int var17 = class396.method2393(class587.field8513, class221.field2866, 5890, arg2 + arg4);
            int var18 = class396.method2393(class587.field8513, class221.field2866, 5890, arg2 - var8);
            int var19 = class396.method2393(class587.field8513, class221.field2866, 5890, arg2 + var8);
            class359.method2018(var15, var18, -42, arg6, var16);
            class359.method2018(var15, var19, 124, arg5, var18);
            class359.method2018(var15, var17, -53, arg6, var19);
        }
        int var20 = -1;
        while (var7 < var9) {
            var20 += 2;
            var14 += 2;
            var10 += var14;
            var13 += var20;
            if (var13 >= 0 && var12 >= 1) {
                var12--;
                var13 -= var12 << 1;
                class331.field4408[var12] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var21 = arg0 - var9;
                int var22 = arg0 + var9;
                if (var22 >= class598.field8632 && var21 <= class288.field3883) {
                    if (var8 > var9) {
                        int var23 = class331.field4408[var9];
                        int var24 = class396.method2393(class587.field8513, class221.field2866, 5890, arg2 + var7);
                        int var25 = class396.method2393(class587.field8513, class221.field2866, 5890, arg2 - var7);
                        int var26 = class396.method2393(class587.field8513, class221.field2866, 5890, arg2 + var23);
                        int var27 = class396.method2393(class587.field8513, class221.field2866, 5890, arg2 - var23);
                        if (class288.field3883 >= var22) {
                            int[] var28 = class678.field9722[var22];
                            class359.method2018(var28, var27, -56, arg6, var25);
                            class359.method2018(var28, var26, -105, arg5, var27);
                            class359.method2018(var28, var24, 62, arg6, var26);
                        }
                        if (class598.field8632 <= var21) {
                            int[] var29 = class678.field9722[var21];
                            class359.method2018(var29, var27, 88, arg6, var25);
                            class359.method2018(var29, var26, 115, arg5, var27);
                            class359.method2018(var29, var24, 126, arg6, var26);
                        }
                    } else {
                        int var30 = class396.method2393(class587.field8513, class221.field2866, 5890, arg2 + var7);
                        int var31 = class396.method2393(class587.field8513, class221.field2866, 5890, arg2 - var7);
                        if (class288.field3883 >= var22) {
                            class359.method2018(class678.field9722[var22], var30, -102, arg6, var31);
                        }
                        if (class598.field8632 <= var21) {
                            class359.method2018(class678.field9722[var21], var30, -66, arg6, var31);
                        }
                    }
                }
            }
            int var32 = arg0 - var7;
            int var33 = arg0 + var7;
            if (var33 >= class598.field8632 && var32 <= class288.field3883) {
                int var34 = arg2 + var9;
                int var35 = arg2 - var9;
                if (class587.field8513 <= var34 && var35 <= class221.field2866) {
                    int var36 = class396.method2393(class587.field8513, class221.field2866, 5890, var34);
                    int var37 = class396.method2393(class587.field8513, class221.field2866, 5890, var35);
                    if (var8 <= var7) {
                        if (var33 <= class288.field3883) {
                            class359.method2018(class678.field9722[var33], var36, -96, arg6, var37);
                        }
                        if (var32 >= class598.field8632) {
                            class359.method2018(class678.field9722[var32], var36, 75, arg6, var37);
                        }
                    } else {
                        int var38 = var12 < var7 ? class331.field4408[var7] : var12;
                        int var39 = class396.method2393(class587.field8513, class221.field2866, 5890, arg2 + var38);
                        int var40 = class396.method2393(class587.field8513, class221.field2866, 5890, arg2 - var38);
                        if (var33 <= class288.field3883) {
                            int[] var41 = class678.field9722[var33];
                            class359.method2018(var41, var40, -32, arg6, var37);
                            class359.method2018(var41, var39, -78, arg5, var40);
                            class359.method2018(var41, var36, 89, arg6, var39);
                        }
                        if (class598.field8632 <= var32) {
                            int[] var42 = class678.field9722[var32];
                            class359.method2018(var42, var40, -53, arg6, var37);
                            class359.method2018(var42, var39, 122, arg5, var40);
                            class359.method2018(var42, var36, -44, arg6, var39);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Ljava/net/Socket;", line = 245)
    public final Socket method2469(byte arg0) throws IOException {
        if (arg0 != 80) {
            method2467(-107, -72, -73, -9, -17, 15);
        }
        field5792++;
        return new Socket(this.field5790, this.field5787);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method765(int arg0) throws IOException;
}
