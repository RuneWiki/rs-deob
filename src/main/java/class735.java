import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class735 extends class153 {

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "I")
    public static int field10185;

    @OriginalMember(owner = "client!dha", name = "e", descriptor = "I")
    public static int field10187;

    @OriginalMember(owner = "client!dha", name = "f", descriptor = "I")
    public static int field10188;

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "[I")
    public static int[] field10186;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Ld;BLjava/awt/Canvas;I)Lha;", line = 3)
    public static final class548 method4095(class270 arg0, byte arg1, Canvas arg2, int arg3) {
        if (arg1 != 48) {
            method4098((byte) -25);
        }
        field10185++;
        return new class664(arg2, arg0, arg3);
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(IIII)V", line = 19)
    public static final void method4096(int arg0, int arg1, int arg2, int arg3) {
        field10188++;
        String var4 = "tele " + arg0 + "," + (arg3 >> 6) + "," + (arg1 >> 6) + "," + (arg3 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var4);
        int var5 = -81 % ((70 - arg2) / 38);
        class537.method3182((byte) -56, var4, true, false);
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(B)V", line = 35)
    public static void method4097(byte arg0) {
        if (arg0 == -84) {
            field10186 = null;
        }
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(B)V", line = 45)
    public static final void method4098(byte arg0) {
        class27.method159((byte) -105, class731.field10159);
        field10187++;
        class647.field8685++;
        if (class493.field6918 && class416.field5880) {
            int var1 = 0;
            int var2 = 0;
            if (class222.field3009) {
                var1 = class580.method3374(24188);
                var2 = class721.method4038(true);
            }
            int var3 = var1 + class103.field1419.method1553((byte) 61);
            int var4 = class103.field1419.method1556(20) + var2;
            int var5 = var3 - class445.field6184;
            int var6 = var4 - class481.field6706;
            if (class178.field2453 > var5) {
                var5 = class178.field2453;
            }
            if (arg0 < -98) {
                if (class731.field10159.field10393 + var5 > class178.field2453 + class344.field4904.field10393) {
                    var5 = class178.field2453 + class344.field4904.field10393 - class731.field10159.field10393;
                }
                if (var6 < class728.field10133) {
                    var6 = class728.field10133;
                }
                if ((class728.field10133 + class344.field4904.field10501) < (var6 + class731.field10159.field10501)) {
                    var6 = class344.field4904.field10501 + class728.field10133 - class731.field10159.field10501;
                }
                int var7 = var5 + class344.field4904.field10535 - class178.field2453;
                int var8 = class344.field4904.field10532 + var6 - class728.field10133;
                if (class103.field1419.method1557(-32543)) {
                    if (class647.field8685 > class731.field10159.field10430) {
                        int var10 = var5 - class324.field4484;
                        int var11 = var6 - class219.field2857;
                        if (class731.field10159.field10539 < var10 || var10 < (-class731.field10159.field10539) || var11 > class731.field10159.field10539 || -class731.field10159.field10539 > var11) {
                            class650.field8720 = true;
                        }
                    }
                    if (class731.field10159.field10415 != null && class650.field8720) {
                        class142 var12 = new class142();
                        var12.field2023 = var8;
                        var12.field2020 = class731.field10159;
                        var12.field2013 = var7;
                        var12.field2024 = class731.field10159.field10415;
                        class546.method3233(var12);
                    }
                } else {
                    if (class650.field8720) {
                        class594.method3413((byte) 120);
                        if (class731.field10159.field10426 != null) {
                            class142 var9 = new class142();
                            var9.field2017 = class516.field7211;
                            var9.field2023 = var8;
                            var9.field2013 = var7;
                            var9.field2024 = class731.field10159.field10426;
                            var9.field2020 = class731.field10159;
                            class546.method3233(var9);
                        }
                        if (class516.field7211 != null && client.method2748(class731.field10159) != null) {
                            class200.method1218(class516.field7211, class731.field10159, 55);
                        }
                    } else if ((class559.field7775 == 1 || class301.method1984(115)) && class284.field4103 > 2) {
                        class43.method236(class445.field6184 + class324.field4484, class481.field6706 + class219.field2857, (byte) 78);
                    } else if (class683.method3849((byte) -123)) {
                        class43.method236(class445.field6184 + class324.field4484, class481.field6706 + class219.field2857, (byte) -127);
                    }
                    class731.field10159 = null;
                }
            }
        } else if (class647.field8685 > 1) {
            class731.field10159 = null;
        }
    }
}
