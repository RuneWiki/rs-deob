import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class265 extends class47 {

    @OriginalMember(owner = "client!gs", name = "B", descriptor = "Lwa;")
    public class222 field3817;

    @OriginalMember(owner = "client!gs", name = "D", descriptor = "Lap;")
    public static class310 field3819;

    @OriginalMember(owner = "client!gs", name = "E", descriptor = "Lrc;")
    public static class108 field3820;

    @OriginalMember(owner = "client!gs", name = "C", descriptor = "I")
    public static int field3818;

    static {
        new class151("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field3819 = new class310(13, 3);
        field3820 = new class108(89, 2);
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lwa;)V", line = 3)
    public class265(class222 arg0) {
        this.field3817 = arg0;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lup;III)V", line = 12)
    public static final void method1789(class340 arg0, int arg1, int arg2, int arg3) {
        long var4 = class221.field3191[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field4700 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field4699[arg0.field4700++] = class357.field4906[var8 - 1];
            var6 += 16L;
        }
        for (int var9 = arg0.field4700; var9 < 4; var9++) {
            arg0.field4699[var9] = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lis;B)V", line = 45)
    public static final void method1790(class65 arg0, byte arg1) {
        class172.field2621 = 3;
        field3818++;
        class91.method760(true, -126);
        class62.field913 = true;
        class193.field2870 = 127;
        class185.field2787 = 0;
        class362.field4981 = true;
        class491.field6931 = 1;
        class181.field2743 = true;
        class199.field2951 = true;
        class99.field1396 = 2;
        class227.field3260 = 0;
        class30.field312 = 0;
        class169.field2453 = true;
        class228.field3281 = true;
        class300.field4246 = true;
        class55.field817 = true;
        class273.field3964 = true;
        class30.field309 = 0;
        class130.field1777 = true;
        class409.field5605 = 255;
        class339.field4687 = 127;
        if (arg1 != -8) {
            method1792((byte) 79);
        }
        if (class364.field5008 >= 96) {
            class150.method1073(2, (byte) 16);
        } else {
            class150.method1073(0, (byte) 16);
        }
        class51.field743 = true;
        class211.field3082 = 2;
        class69.field1010 = class198.field2928 == 1 ? 2 : 4;
        class254.field3646 = 0;
        class21.field231 = false;
        class89.field1269 = true;
        class223.field3222 = 2;
        class165.field2399 = false;
        class443.field6300 = 0;
        class18.field193 = false;
        class324 var2 = null;
        try {
            class275 var3 = arg0.method611(true);
            while (var3.field3979 == 0) {
                class89.method752(0, 1L);
            }
            if (var3.field3979 == 1) {
                var2 = (class324) var3.field3984;
                byte[] var4 = new byte[(int) var2.method2045(116)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2047(0, var4.length - var5, var4, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class33.method204(118, new class161(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2049(arg1 - 97);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIII)Z", line = 130)
    public static final boolean method1791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class117.field1629[arg0][var8][var14] == -class196.field2912) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class380.field5232) + 1;
            int var10 = (arg3 << class380.field5232) + 2;
            int var11 = class340.field4692[arg0].method591(arg1, arg3) + arg5;
            if (!class22.method157(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class380.field5232) - 1;
            if (!class22.method157(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class380.field5232) - 1;
            if (!class22.method157(var9, var11, var13)) {
                return false;
            } else if (class22.method157(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class395.method2385(arg0, arg1, arg3)) {
            int var6 = arg1 << class380.field5232;
            int var7 = arg3 << class380.field5232;
            return class22.method157(var6 + 1, class340.field4692[arg0].method591(arg1, arg3) + arg5, var7 + 1) && class22.method157(class47.field719 + var6 - 1, class340.field4692[arg0].method591(arg1 + 1, arg3) + arg5, var7 + 1) && class22.method157(class47.field719 + var6 - 1, class340.field4692[arg0].method591(arg1 + 1, arg3 + 1) + arg5, class47.field719 + var7 - 1) && class22.method157(var6 + 1, class340.field4692[arg0].method591(arg1, arg3 + 1) + arg5, class47.field719 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "(B)V", line = 190)
    public static void method1792(byte arg0) {
        field3819 = null;
        if (arg0 != -83) {
            method1789((class340) null, -117, 88, 59);
        }
        field3820 = null;
    }
}
