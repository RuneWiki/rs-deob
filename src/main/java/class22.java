import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class22 extends class381 {

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "[B")
    public byte[] field403;

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "Z")
    public static boolean field404 = false;

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "[Z")
    public static boolean[] field408 = new boolean[5];

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "Lfi;")
    public static class166 field405 = new class166();

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "Lhq;")
    public static class175 field414;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lpe;B)V", line = 12)
    public static final void method279(class391 arg0, byte arg1) {
        if (arg1 != -52) {
            method280(-43, -114, -107, -17);
        }
        if (class427.field6056) {
            class10.method56((byte) 61, arg0);
        } else {
            class399.method2450((byte) 0, arg0);
        }
        field400++;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIII)V", line = 28)
    public static final void method280(int arg0, int arg1, int arg2, int arg3) {
        class224 var4 = class118.field1653[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class57 var5 = var4.field3121;
        class57 var6 = var4.field3116;
        if (var5 != null) {
            var5.field922 = var5.field922 * arg3 / 16;
            var5.field913 = var5.field913 * arg3 / 16;
        }
        if (var6 != null) {
            var6.field922 = var6.field922 * arg3 / 16;
            var6.field913 = var6.field913 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(IIII)I", line = 52)
    public static final int method281(int arg0, int arg1, int arg2, int arg3) {
        field401++;
        if (class91.field1351 == null) {
            return 0;
        }
        int var4 = arg3 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || class116.field1621 - 1 < var4 || var5 > (class385.field5425 - 1)) {
            return 0;
        }
        int var6 = arg1;
        if (arg0 != 1) {
            field406 = -36;
        }
        if (arg1 < 3 && (class7.field57[1][var4][var5] & 0x2) != 0) {
            var6 = arg1 + 1;
        }
        return class91.field1351[var6].method1515(arg3, arg2);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZI)V", line = 79)
    public static final void method282(boolean arg0, int arg1) {
        class166.method1234(arg0, class249.field3414, (byte) 34, class149.field2288, class258.field3488);
        field411++;
        if (arg1 >= -106) {
            field414 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V", line = 90)
    public static void method283(int arg0) {
        if (arg0 == -15645) {
            field414 = null;
            field405 = null;
            field408 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lqo;I)V", line = 103)
    public static final void method284(class127 arg0, int arg1) {
        field407++;
        if (class415.field5808 >= 400) {
            return;
        }
        class15 var2 = arg0.field1784;
        if (var2.field177 != null) {
            var2 = var2.method78(0);
            if (var2 == null) {
                return;
            }
        }
        if (arg1 != 300 || !var2.field151) {
            return;
        }
        String var3 = var2.field116;
        if (var2.field157 != 0) {
            String var4 = class42.field640 == 1 ? class5.field38 : class73.field1098;
            var3 = var3 + class404.method2478(class95.field1379.field4599, -4, var2.field157) + " (" + var4 + var2.field157 + ")";
        }
        if (class363.field5021 == 1) {
            class55.field893++;
            class361.method2264(0, class336.field4552, class328.field4458, (long) arg0.field4957, arg1 ^ 0x142, class21.field390 + " -> <col=ffff00>" + var3, 11, 0);
        } else if (class3.field16) {
            class287 var5 = class386.field5439 == -1 ? null : class345.method2186(class386.field5439, (byte) 41);
            if ((class280.field3750 & 0x2) != 0) {
                if (var5 == null || var2.method79(65, class386.field5439, var5.field3845) != var5.field3845) {
                    class361.method2264(0, class163.field2409, class166.field2465, (long) arg0.field4957, -109, class326.field4421 + " -> <col=ffff00>" + var3, 32, 0);
                    class61.field949++;
                }
                return;
            }
        } else {
            String[] var6 = var2.field148;
            if (class215.field2976) {
                var6 = class289.method1837(var6, (byte) 29);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class42.field640 != 0 || !var6[var7].equalsIgnoreCase(class149.field2290))) {
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 41;
                        }
                        int var9 = class82.field1210;
                        if (var7 == 1) {
                            var8 = 35;
                        }
                        if (var7 == 2) {
                            var8 = 7;
                        }
                        if (var7 == 3) {
                            var8 = 22;
                        }
                        if (var7 == 4) {
                            var8 = 23;
                        }
                        if (var2.field173 == var7) {
                            var9 = var2.field132;
                        }
                        if (var2.field126 == var7) {
                            var9 = var2.field168;
                        }
                        class361.method2264(0, var9, var6[var7], (long) arg0.field4957, -106, "<col=ffff00>" + var3, var8, 0);
                        class128.field1828++;
                    }
                }
            }
            if (class42.field640 == 0 && var6 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (var6[var10] != null && var6[var10].equalsIgnoreCase(class149.field2290)) {
                        short var11 = 0;
                        if (class95.field1379.field4599 < var2.field157) {
                            var11 = 2000;
                        }
                        short var12 = 0;
                        if (var10 == 0) {
                            var12 = 41;
                        }
                        if (var10 == 1) {
                            var12 = 35;
                        }
                        if (var10 == 2) {
                            var12 = 7;
                        }
                        if (var10 == 3) {
                            var12 = 22;
                        }
                        if (var10 == 4) {
                            var12 = 23;
                        }
                        if (var12 != 0) {
                            var12 += var11;
                        }
                        class361.method2264(0, var2.field125, var6[var10], (long) arg0.field4957, -117, "<col=ffff00>" + var3, var12, 0);
                        class145.field2216++;
                    }
                }
            }
            class361.method2264(0, class422.field5904, class241.field3333, (long) arg0.field4957, -108, "<col=ffff00>" + var3, 1008, 0);
            class179.field2628++;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/awt/Color;Ljava/lang/String;IZLjava/awt/Color;Ljava/awt/Color;I)V", line = 273)
    public static final void method285(Color arg0, String arg1, int arg2, boolean arg3, Color arg4, Color arg5, int arg6) {
        try {
            Graphics var7 = class418.field5867.getGraphics();
            if (class102.field1508 == null) {
                class102.field1508 = new Font("Helvetica", 1, 13);
            }
            if (arg3) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class249.field3414, class258.field3488);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(255, 255, 255);
            }
            try {
                if (class316.field4288 == null) {
                    class316.field4288 = class418.field5867.createImage(304, 34);
                }
                Graphics var8 = class316.field4288.getGraphics();
                var8.setColor(arg5);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg4);
                var8.fillRect(2, 2, arg2 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect((arg2 * 3) + 2, 2, 300 - (arg2 * 3), 30);
                var8.setFont(class102.field1508);
                var8.setColor(arg0);
                var8.drawString(arg1, (304 - (arg1.length() * 6)) / 2, 22);
                var7.drawImage(class316.field4288, class249.field3414 / 2 - 152, class258.field3488 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class249.field3414 / 2 - 152;
                int var10 = class258.field3488 / 2 - 18;
                var7.setColor(arg5);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg4);
                var7.fillRect(var9 + 2, var10 + 2, arg2 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 - -1, 301, 31);
                var7.fillRect(var9 + (arg2 * 3) + 2, var10 + 2, 300 - (arg2 * 3), 30);
                var7.setFont(class102.field1508);
                var7.setColor(arg0);
                var7.drawString(arg1, var9 + (304 - (arg1.length() * 6)) / 2, var10 + 22);
            }
            if (class266.field3573 != null) {
                var7.setFont(class102.field1508);
                var7.setColor(arg0);
                var7.drawString(class266.field3573, class249.field3414 / 2 - (class266.field3573.length() * 6 / 2), class258.field3488 / 2 + -26);
            }
        } catch (Exception var12) {
            class418.field5867.repaint();
        }
        if (arg6 < 84) {
            field406 = -59;
        }
        field410++;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)I", line = 352)
    public static final int method286(byte arg0, String arg1, int arg2, String arg3) {
        if (arg0 != -21) {
            method286((byte) 18, (String) null, 122, (String) null);
        }
        field412++;
        int var4 = arg3.length();
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var6 - var8 < var4 || var5 > (var7 - var9)) {
            if (var4 <= (var6 - var8)) {
                return -1;
            }
            if (var7 - var9 >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class398.method2444((byte) 111, var22);
            var9 = class398.method2444((byte) 56, var24);
            char var26 = class165.method1230(arg2, var22, (byte) -15);
            char var27 = class165.method1230(arg2, var24, (byte) -15);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class447.method2778(var28, arg2, false) - class447.method2778(var29, arg2, false);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg1.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class447.method2778(var20, arg2, false) - class447.method2778(var21, arg2, false);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class447.method2778(var14, arg2, false) - class447.method2778(var15, arg2, false);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "([B)V", line = 473)
    public class22(byte[] arg0) {
        this.field403 = arg0;
    }
}
