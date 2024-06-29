import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class195 extends class136 {

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    private int field3633 = -32768;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "[I")
    public static int[] field3617 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "[I")
    public static int[] field3623 = new int[1000];

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "Lmb;")
    private static class132 field3626 = class166.method1092("Malformed login packet)3", 112);

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "Lmb;")
    public static class132 field3631 = field3626;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public int field3620;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    public int field3628;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "Lpb;")
    public static class165 field3625;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Lga;")
    public static class68 field3619;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()I")
    public final int method55() {
        field3629++;
        return this.field3633;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ldh;B)V")
    public static final void method1237(class42 arg0, byte arg1) {
        arg0.field737 = arg0.field715;
        field3618++;
        if (arg0.field697 == 0) {
            arg0.field722 = 0;
            return;
        }
        if (arg0.field695 != -1 && arg0.field713 == 0) {
            class236 var2 = class99.method619(arg0.field695, 4);
            if (arg0.field725 > 0 && var2.field4264 == 0) {
                arg0.field722++;
                return;
            }
            if (arg0.field725 <= 0 && var2.field4268 == 0) {
                arg0.field722++;
                return;
            }
        }
        int var3 = arg0.field673;
        int var4 = arg0.field703[arg0.field697 - 1] * 128 + arg0.field679 * 64;
        int var5 = arg0.field723;
        int var6 = arg0.field676[arg0.field697 - 1] * 128 + arg0.field679 * 64;
        if (var4 - var3 > 256 || var4 - var3 < -256 || var6 - var5 > 256 || var6 - var5 < -256) {
            arg0.field673 = var4;
            arg0.field723 = var6;
            return;
        }
        if (var3 >= var4) {
            if (var3 > var4) {
                if (var5 < var6) {
                    arg0.field739 = 768;
                } else if (var5 > var6) {
                    arg0.field739 = 256;
                } else {
                    arg0.field739 = 512;
                }
            } else if (var6 > var5) {
                arg0.field739 = 1024;
            } else if (var6 < var5) {
                arg0.field739 = 0;
            }
        } else if (var5 < var6) {
            arg0.field739 = 1280;
        } else if (var6 < var5) {
            arg0.field739 = 1792;
        } else {
            arg0.field739 = 1536;
        }
        int var7 = arg0.field739 - arg0.field707 & 0x7FF;
        int var8 = 4;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg0.field736;
        if (var7 >= -256 && var7 <= 256) {
            var9 = arg0.field727;
        } else if (var7 >= 256 && var7 < 768) {
            var9 = arg0.field702;
        } else if (var7 >= -768 && var7 <= -256) {
            var9 = arg0.field708;
        }
        boolean var10 = true;
        if (arg1 != -59) {
            method1240(null, false, -18);
        }
        if (var9 == -1) {
            var9 = arg0.field727;
        }
        arg0.field737 = var9;
        if (arg0 instanceof class65) {
            var10 = ((class65) arg0).field1072.field3407;
        }
        if (var10) {
            if (arg0.field739 != arg0.field707 && arg0.field700 == -1 && arg0.field687 != 0) {
                var8 = 2;
            }
            if (arg0.field697 > 2) {
                var8 = 6;
            }
            if (arg0.field697 > 3) {
                var8 = 8;
            }
            if (arg0.field722 > 0 && arg0.field697 > 1) {
                arg0.field722--;
                var8 = 8;
            }
        } else {
            if (arg0.field697 > 1) {
                var8 = 6;
            }
            if (arg0.field697 > 2) {
                var8 = 8;
            }
            if (arg0.field722 > 0 && arg0.field697 > 1) {
                arg0.field722--;
                var8 = 8;
            }
        }
        if (arg0.field686[arg0.field697 - 1]) {
            var8 <<= 0x1;
        }
        if (var6 > var5) {
            arg0.field723 += var8;
            if (arg0.field723 > var6) {
                arg0.field723 = var6;
            }
        } else if (var6 < var5) {
            arg0.field723 -= var8;
            if (var6 > arg0.field723) {
                arg0.field723 = var6;
            }
        }
        if (var3 < var4) {
            arg0.field673 += var8;
            if (var4 < arg0.field673) {
                arg0.field673 = var4;
            }
        } else if (var3 > var4) {
            arg0.field673 -= var8;
            if (arg0.field673 < var4) {
                arg0.field673 = var4;
            }
        }
        if (arg0.field673 == var4 && arg0.field723 == var6) {
            if (arg0.field725 > 0) {
                arg0.field725--;
            }
            arg0.field697--;
        }
        if (var8 >= 8 && arg0.field737 == arg0.field727 && arg0.field685 != -1) {
            arg0.field737 = arg0.field685;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3632++;
        class221 var11 = class58.method389(0, this.field3620).method1564(this.field3628, null, false, 0);
        if (var11 != null) {
            var11.method52(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3633 = var11.method55();
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I")
    public static final int method1238(int arg0, int arg1) {
        field3622++;
        return arg0 == 120 ? arg1 >>> 8 : 113;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZI)I")
    public static final int method1239(int arg0, int arg1, boolean arg2, int arg3) {
        field3621++;
        int var4 = arg3 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        if (arg2) {
            method1240(null, false, -115);
        }
        int var6 = arg1;
        int var7 = arg0 & 0x7F;
        int var8 = arg3 & 0x7F;
        if (arg1 < 3 && (class148.field2722[1][var4][var5] & 0x2) == 2) {
            var6 = arg1 + 1;
        }
        int var9 = (128 - var8) * class190.field3531[var6][var4][var5] + class190.field3531[var6][var4 + 1][var5] * var8 >> 7;
        int var10 = (128 - var8) * class190.field3531[var6][var4][var5 + 1] + class190.field3531[var6][var4 + 1][var5 + 1] * var8 >> 7;
        return (128 - var7) * var9 + var7 * var10 >> 7;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lmb;ZI)V")
    public static final void method1240(class132 arg0, boolean arg1, int arg2) {
        field3624++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class15.field222.method665(arg0, arg2);
        int var7 = class15.field222.method669(arg0, 250) * 13;
        class239.method1525(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var7 + var3, 0);
        class239.method1528(var4 - var3, -var3 + var5, var6 + var3 + var3, var3 + var7 + var3, 16777215);
        class15.field222.method685(arg0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class150.method993(var3 + var7 + var3, -var3 + var5, var4 - var3, true, var3 + var6 + var3);
        if (!arg1) {
            class103.method639(var4, var6, var7, var5, true);
            return;
        }
        Canvas var8 = class154.field2814;
        try {
            Graphics var9 = var8.getGraphics();
            class140.field2628.method581(0, arg2 ^ 0xFFFFFF7F, 0, var9);
        } catch (Exception var10) {
            var8.repaint();
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lpb;Lpb;BLpb;)V")
    public static final void method1241(class165 arg0, class165 arg1, byte arg2, class165 arg3) {
        class119.field2262 = arg1;
        class139.field2608 = arg0;
        class8.field74 = arg3;
        if (arg2 == -33) {
            field3627++;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method1242(int arg0) {
        field3619 = null;
        field3631 = null;
        if (arg0 != -27461) {
            method1239(-125, -101, false, 58);
        }
        field3623 = null;
        field3625 = null;
        field3626 = null;
        field3617 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLmb;Lkd;)I")
    public static final int method1243(byte arg0, class132 arg1, class112 arg2) {
        int var3 = arg2.field2133;
        if (arg0 < 66) {
            field3623 = null;
        }
        arg2.method729(arg1.field2479, 2);
        arg2.field2133 += class58.field976.method1162(arg1.field2479, 0, arg1.field2446, 91, arg2.field2133, arg2.field2157);
        field3630++;
        return arg2.field2133 - var3;
    }
}
