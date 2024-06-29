import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class122 {

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field2199 = 0;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field2197 = 0;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2200 = Calendar.getInstance();

    @OriginalMember(owner = "client!c", name = "h", descriptor = "[Lne;")
    public static class116[] field2203 = new class116[500];

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "[[B")
    public static byte[][] field2205;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lnj;Z)Ldb;")
    public static final class58 method754(class226 arg0, boolean arg1) {
        field2201++;
        if (arg1) {
            return null;
        } else {
            class58 var2 = new class58();
            var2.field1062 = arg0.method1447(0);
            var2.field1078 = class38.method201(var2.field1062, -16756);
            return var2;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2202++;
        if (arg2 >= class125.field2234 && arg7 <= class19.field331 && class161.field2718 <= arg0 && class46.field817 >= arg4) {
            class59.method361(arg1 + 2, arg5, arg0, arg7, arg2, arg3, arg6, arg4);
        } else {
            class241.method1604((byte) 113, arg0, arg6, arg7, arg5, arg4, arg2, arg3);
        }
        if (arg1 != 0) {
            method757((class4) null, (byte) -71);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method756(int arg0) {
        field2200 = null;
        if (arg0 == 0) {
            field2203 = null;
            field2205 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
    public abstract int method535(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lja;B)V")
    public static final void method757(class4 arg0, byte arg1) {
        field2198++;
        int var2 = -28 / ((arg1 + 67) / 42);
        if (arg0.field81 == 0) {
            return;
        }
        if (arg0.field108 != -1 && arg0.field108 < 32768) {
            class195 var3 = class220.field3715[arg0.field108];
            if (var3 != null) {
                int var4 = arg0.field50 - var3.field50;
                int var5 = arg0.field99 - var3.field99;
                if (var4 != 0 || var5 != 0) {
                    arg0.field94 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field108 >= 32768) {
            int var6 = arg0.field108 - 32768;
            if (class254.field4473 == var6) {
                var6 = 2047;
            }
            class225 var7 = class27.field446[var6];
            if (var7 != null) {
                int var8 = arg0.field50 - var7.field50;
                int var9 = arg0.field99 - var7.field99;
                if (var8 != 0 || var9 != 0) {
                    arg0.field94 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field54 != 0 || arg0.field87 != 0) && (arg0.field111 == 0 || arg0.field84 > 0)) {
            int var10 = (arg0.field45 - 1) * 64 + arg0.field50 - ((-class192.field3267 + arg0.field54 - class192.field3267) * 64);
            int var11 = arg0.field99 + (arg0.field45 * 64) - (arg0.field87 - (class78.field1367 + class78.field1367)) * 64 - 64;
            if (var10 != 0 || var11 != 0) {
                arg0.field94 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg0.field87 = 0;
            arg0.field54 = 0;
        }
        int var12 = arg0.field94 - arg0.field106 & 0x7FF;
        if (var12 == 0) {
            arg0.field47 = 0;
            return;
        }
        arg0.field47++;
        if (var12 <= 1024) {
            arg0.field106 += arg0.field81;
            boolean var13 = true;
            if (arg0.field81 > var12 || var12 > (2048 - arg0.field81)) {
                arg0.field106 = arg0.field94;
                var13 = false;
            }
            if (arg0.field82 == arg0.field61 && (arg0.field47 > 25 || var13)) {
                if (arg0.field67 == -1) {
                    arg0.field82 = arg0.field63;
                } else {
                    arg0.field82 = arg0.field67;
                }
            }
        } else {
            boolean var14 = true;
            arg0.field106 -= arg0.field81;
            if (arg0.field81 > var12 || var12 > 2048 - arg0.field81) {
                var14 = false;
                arg0.field106 = arg0.field94;
            }
            if (arg0.field82 == arg0.field61 && (arg0.field47 > 25 || var14)) {
                if (arg0.field105 == -1) {
                    arg0.field82 = arg0.field63;
                } else {
                    arg0.field82 = arg0.field105;
                }
            }
        }
        arg0.field106 &= 0x7FF;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([Lub;III)Lub;")
    public static final class227 method758(class227[] arg0, int arg1, int arg2, int arg3) {
        field2204++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg0[arg3 + var5] == null) {
                arg0[arg3 + var5] = class89.field1540;
            }
            var4 += arg0[arg3 + var5].field3915;
        }
        int var6 = arg1;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg2; var8++) {
            class227 var10 = arg0[arg3 + var8];
            class68.method422(var10.field3955, 0, var7, var6, var10.field3915);
            var6 += var10.field3915;
        }
        class227 var9 = new class227();
        var9.field3955 = var7;
        var9.field3915 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public abstract void method534(byte arg0);
}
