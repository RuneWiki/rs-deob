import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class149 extends class28 {

    @OriginalMember(owner = "client!dca", name = "o", descriptor = "[I")
    public int[] field1877 = new int[1];

    @OriginalMember(owner = "client!dca", name = "k", descriptor = "[I")
    public int[] field1873 = new int[] { -1 };

    @OriginalMember(owner = "client!dca", name = "p", descriptor = "Lrh;")
    public static class59 field1878 = new class59();

    @OriginalMember(owner = "client!dca", name = "t", descriptor = "I")
    public static int field1882 = -1;

    @OriginalMember(owner = "client!dca", name = "r", descriptor = "Lnd;")
    public static class409 field1880 = new class409("WIP", 2);

    @OriginalMember(owner = "client!dca", name = "j", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!dca", name = "l", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!dca", name = "m", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!dca", name = "n", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!dca", name = "q", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!dca", name = "s", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILoa;IIZLph;IILfq;I)Lba;", line = 5)
    public final class629 method1006(int arg0, class689 arg1, int arg2, int arg3, boolean arg4, class351 arg5, int arg6, int arg7, class463 arg8, int arg9) {
        field1881++;
        class629 var11 = null;
        int var12 = arg2;
        class334 var13 = null;
        if (arg9 != -1) {
            var13 = class613.field8364.method1868(arg3 ^ 0xFFFFF0BC, arg9);
        }
        int[] var14 = this.field1873;
        if (var13 != null && var13.field4879 != null) {
            var14 = new int[var13.field4879.length];
            for (int var15 = 0; var15 < var13.field4879.length; var15++) {
                int var16 = var13.field4879[var15];
                if (var16 >= 0 && this.field1873.length > var16) {
                    var14[var15] = this.field1873[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        if (arg3 != -12876) {
            method1007(-51);
        }
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class495 var24 = null;
        class495 var25 = null;
        if (arg8 != null) {
            int var26 = arg8.field6307[arg0];
            var12 = arg2 | 0x20;
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class77.field971.method774(var27, arg3 + 12755);
            if (var24 != null) {
                var18 |= var24.method2792(arg3 ^ 0xFFFFCDB4, var21);
                var17 |= var24.method2791(9675, var21);
                var20 |= var24.method2796(var21, (byte) 38);
                var19 |= arg8.field6335;
            }
            if ((arg8.field6327 || class425.field5919) && arg7 != -1 && arg8.field6307.length > arg7) {
                var23 = arg8.field6319[arg0];
                int var28 = arg8.field6307[arg7];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class77.field971.method774(var22 >>> 16, -119);
                }
                if (var25 != null) {
                    var18 |= var25.method2792(0, var22);
                    var17 |= var25.method2791(arg3 + 22551, var22);
                    var20 |= var25.method2796(var22, (byte) 38);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method1010(arg5 == null ? null : arg5.field5136, var14, arg9, arg4, arg3 ^ 0xFFFFCDAA);
        if (class403.field5708 != null) {
            var11 = (class629) class403.field5708.method3134(var30, arg3 + 12758);
        }
        if (var11 == null || arg1.method2007(var11.method688(), var12) != 0) {
            if (var11 != null) {
                var12 = arg1.method1987(var12, var11.method688());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class237.field3088.method1349(-1, var14[var34]).method3661(arg4, arg3 ^ 0x40265A76)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class238[] var35 = new class238[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class237.field3088.method1349(-1, var14[var36]).method3652(108, arg4);
                }
            }
            if (var13 != null && var13.field4907 != null) {
                for (int var37 = 0; var37 < var13.field4907.length; var37++) {
                    if (var13.field4907[var37] != null && var35[var37] != null) {
                        int var38 = var13.field4907[var37][0];
                        int var39 = var13.field4907[var37][1];
                        int var40 = var13.field4907[var37][2];
                        int var41 = var13.field4907[var37][3];
                        int var42 = var13.field4907[var37][4];
                        int var43 = var13.field4907[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method1466(var43, var42, 256, var41);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method1468(var39, (byte) 58, var38, var40);
                        }
                    }
                }
            }
            class238 var44 = new class238(var35, var35.length);
            if (arg5 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg1.method1784(var44, var32, class422.field5878, 64, 850);
            if (arg5 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class628.field8544[var45].length > arg5.field5136[var45]) {
                        var11.method668(class454.field6199[var45], class628.field8544[var45][arg5.field5136[var45]]);
                    }
                    if (arg5.field5136[var45] < class333.field4860[var45].length) {
                        var11.method668(class428.field5944[var45], class333.field4860[var45][arg5.field5136[var45]]);
                    }
                }
            }
            if (class403.field5708 != null) {
                var11.method655(var12);
                class403.field5708.method3130(var30, true, var11);
            }
        }
        if (arg8 == null || var24 == null) {
            return var11;
        } else {
            class629 var46 = var11.method659((byte) 1, var12, true);
            var46.method3437(0, var22, false, var23, arg6 - 1, var24, var25, arg8.field6335, var21);
            return var46;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)V", line = 253)
    public static void method1007(int arg0) {
        if (arg0 != -3517) {
            method1007(-61);
        }
        field1878 = null;
        field1880 = null;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Z)Z", line = 264)
    public static final boolean method1008(boolean arg0) {
        if (!arg0) {
            field1880 = null;
        }
        field1874++;
        return class552.method3093("jaclib", 0) ? class552.method3093("hw3d", 0) : false;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Ljava/awt/Color;IZLjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;)V", line = 294)
    public static final void method1009(Color arg0, int arg1, boolean arg2, String arg3, Color arg4, Color arg5) {
        field1879++;
        try {
            Graphics var6 = class249.field3351.getGraphics();
            if (class248.field3336 == null) {
                class248.field3336 = new Font("Helvetica", 1, 13);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(255, 255, 255);
            }
            try {
                if (class314.field4518 == null) {
                    class314.field4518 = class249.field3351.createImage(class303.field4059, class211.field2763);
                }
                Graphics var7 = class314.field4518.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class303.field4059, class211.field2763);
                int var8 = class303.field4059 / 2 - 152;
                int var9 = class211.field2763 / 2 - 18;
                var7.setColor(arg4);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg5);
                var7.fillRect(var8 + 2, var9 - -2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 - -1, 301, 31);
                var7.fillRect(arg1 * 3 + (var8 + 2), var9 - -2, 300 - arg1 * 3, 30);
                var7.setFont(class248.field3336);
                var7.setColor(arg0);
                var7.drawString(arg3, (304 - (arg3.length() * 6)) / 2 + var8, var9 + 22);
                if (class314.field4521 != null) {
                    var7.setFont(class248.field3336);
                    var7.setColor(arg0);
                    var7.drawString(class314.field4521, class303.field4059 / 2 - (class314.field4521.length() * 6 / 2), class211.field2763 / 2 + -26);
                }
                var6.drawImage(class314.field4518, 0, 0, null);
                if (arg2) {
                    method1008(true);
                }
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class303.field4059, class211.field2763);
                int var10 = class303.field4059 / 2 - 152;
                int var11 = class211.field2763 / 2 - 18;
                var6.setColor(arg4);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg5);
                var6.fillRect(var10 + 2, var11 - -2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(var10 + (arg1 * 3) + 2, var11 - -2, 300 - (arg1 * 3), 30);
                var6.setFont(class248.field3336);
                var6.setColor(arg0);
                if (class314.field4521 != null) {
                    var6.setFont(class248.field3336);
                    var6.setColor(arg0);
                    var6.drawString(class314.field4521, class303.field4059 / 2 - (class314.field4521.length() * 6 / 2), class211.field2763 / 2 + -26);
                }
                var6.drawString(arg3, var10 + ((304 - (arg3.length() * 6)) / 2), var11 + 22);
            }
        } catch (Exception var13) {
            class249.field3351.repaint();
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "([I[IIZI)J", line = 388)
    private final long method1010(int[] arg0, int[] arg1, int arg2, boolean arg3, int arg4) {
        field1875++;
        long[] var6 = class604.field8265;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg2 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        if (arg4 != 30) {
            this.field1873 = null;
        }
        long var11 = var6[(int) (((long) arg2 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg1.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var6[(int) ((var17 ^ (long) (arg1[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var21 >>> 8 ^ var6[(int) (((long) arg1[var13] ^ var21) & 0xFFL)];
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg0[var14]) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg3 ? 1 : 0) ^ var11) & 0xFFL)];
    }
}
