import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class143 {

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "[Lpj;")
    public static class237[] field2590 = new class237[100];

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lpj;")
    public static class237 field2591 = class33.method353("::tele ", 114);

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Z")
    public static volatile boolean field2595 = true;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field2594 = 0;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lfa;")
    public static class239 field2587;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)Z")
    public static final boolean method983(int arg0, int arg1, int arg2) {
        int var3 = class249.field4332[arg0][arg1][arg2];
        if (-class14.field234 == var3) {
            return false;
        } else if (class14.field234 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class272.method1813(var4 + 1, class99.field1773[arg0][arg1][arg2], var5 + 1) && class272.method1813(var4 + 128 - 1, class99.field1773[arg0][arg1 + 1][arg2], var5 + 1) && class272.method1813(var4 + 128 - 1, class99.field1773[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class272.method1813(var4 + 1, class99.field1773[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class249.field4332[arg0][arg1][arg2] = class14.field234;
                return true;
            } else {
                class249.field4332[arg0][arg1][arg2] = -class14.field234;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method984(byte arg0) {
        field2590 = null;
        if (arg0 > 118) {
            field2587 = null;
            field2591 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lfa;I)V")
    public static final void method985(class239 arg0, int arg1) {
        field2593++;
        class3.field34 = class90.method684(class169.field2972, arg0, -98);
        class76.field1445 = new int[256];
        for (int var2 = arg1; var2 < 3; var2++) {
            float var4 = (float) (class138.field2392[var2] >> 16 & 0xFF);
            int var5 = class138.field2392[var2 + 1] >> 16 & 0xFF;
            float var6 = (float) ((class138.field2392[var2] & 0xFF00) >> 8);
            float var7 = ((float) var5 - var4) / 64.0F;
            int var8 = class138.field2392[var2 + 1] >> 8 & 0xFF;
            float var9 = ((float) var8 - var6) / 64.0F;
            int var10 = class138.field2392[var2 + 1] & 0xFF;
            float var11 = (float) (class138.field2392[var2] & 0xFF);
            float var12 = ((float) var10 - var11) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class76.field1445[var2 * 64 + var13] = class34.method362((int) var11, class34.method362((int) var4 << 16, (int) var6 << 8));
                var6 += var9;
                var11 += var12;
                var4 += var7;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class76.field1445[var3] = class138.field2392[3];
        }
        class29.field595 = new int[32768];
        class275.field4822 = new int[32768];
        class223.method1478((byte) 1, (class154) null);
        class259.field4448 = new int[32768];
        class238.field4165 = new int[32768];
        class83.field1558 = new class225(128, 254);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
    public static final void method986(boolean arg0) {
        if (!arg0) {
            method983(23, -65, -110);
        }
        for (class58 var1 = (class58) class164.field2915.method566(0); var1 != null; var1 = (class58) class164.field2915.method565(-60)) {
            int var2 = var1.field1191;
            if (class47.method434(0, var2)) {
                boolean var3 = true;
                class141[] var4 = class22.field406[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field2536;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1530;
                    class141 var7 = class70.method572(20043, var6);
                    if (var7 != null) {
                        class128.method911(var7, -17149);
                    }
                }
            }
        }
        field2588++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIII)V")
    public static final void method987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2596++;
        int var7 = arg1 + arg6;
        if (arg2 > -79) {
            field2589 = 110;
        }
        int var8 = arg4 + arg6;
        int var9 = arg3 - arg6;
        for (int var10 = arg1; var10 < var7; var10++) {
            class199.method1361(arg0, arg5, class62.field1241[var10], arg4, 119);
        }
        int var11 = arg5 - arg6;
        for (int var12 = arg3; var12 > var9; var12--) {
            class199.method1361(arg0, arg5, class62.field1241[var12], arg4, 61);
        }
        for (int var13 = var7; var13 <= var9; var13++) {
            int[] var14 = class62.field1241[var13];
            class199.method1361(arg0, var8, var14, arg4, 54);
            class199.method1361(arg0, arg5, var14, var11, 93);
        }
    }
}
