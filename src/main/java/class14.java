import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class14 {

    @OriginalMember(owner = "client!be", name = "g", descriptor = "J")
    public long field260 = 0L;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field265 = 5063219;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field269 = 0;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field271 = 0;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public int field254;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public int field255;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public int field256;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public int field257;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public int field267;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public int field268;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public int field270;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public int field272;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public int field277;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "Lsc;")
    public class119 field273;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "Lq;")
    public static class148 field266;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Ltg;")
    public static class75 field262;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Ljava/awt/Frame;")
    public static Frame field263;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "[Lnj;")
    public static class82[] field276;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Lld;")
    public static final class53 method114(int arg0, int arg1, int arg2) {
        class71 var3 = class31.field553[arg0][arg1][arg2];
        return var3 == null || var3.field1132 == null ? null : var3.field1132;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZII[Lsb;)Lsb;")
    public static final class98 method115(boolean arg0, int arg1, int arg2, class98[] arg3) {
        int var4 = 0;
        if (arg0) {
            return null;
        }
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg3[arg2 + var5] == null) {
                arg3[arg2 + var5] = class60.field983;
            }
            var4 += arg3[arg2 + var5].field1694;
        }
        field261++;
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class98 var10 = arg3[arg2 + var8];
            class66.method463(var10.field1733, 0, var6, var7, var10.field1694);
            var7 += var10.field1694;
        }
        class98 var9 = new class98();
        var9.field1733 = var6;
        var9.field1694 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method116(int arg0) {
        field263 = null;
        field262 = null;
        if (arg0 == 15581) {
            field266 = null;
            field276 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIBLme;)V")
    public static final void method117(int arg0, int arg1, int arg2, int arg3, byte arg4, class60 arg5) {
        field264++;
        if (arg5.field1007 == -1 && arg5.field989 == null) {
            return;
        }
        int var6 = 0;
        if (arg1 > arg5.field1001) {
            var6 += arg1 - arg5.field1001;
        } else if (arg5.field994 > arg1) {
            var6 += arg5.field994 - arg1;
        }
        if (arg5.field1005 < arg3) {
            var6 += arg3 - arg5.field1005;
        } else if (arg5.field1003 > arg3) {
            var6 += arg5.field1003 - arg3;
        }
        if (arg5.field982 == 0 || arg5.field982 < var6 - 64 || class90.field1585 == 0 || arg5.field988 != arg2) {
            if (arg5.field997 != null) {
                class36.field606.method1213(arg5.field997);
                arg5.field997 = null;
            }
            if (arg5.field984 != null) {
                class36.field606.method1213(arg5.field984);
                arg5.field984 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg5.field982 - var6) * class90.field1585 / arg5.field982;
        if (arg5.field997 != null) {
            arg5.field997.method201(var7);
        } else if (arg5.field1007 >= 0) {
            class213 var8 = class213.method1423(class8.field156, arg5.field1007, 0);
            if (var8 != null) {
                class89 var9 = var8.method1426().method659(class101.field1794);
                class19 var10 = class19.method214(var9, 100, var7);
                var10.method193(-1);
                class36.field606.method1215(var10);
                arg5.field997 = var10;
            }
        }
        if (arg4 != -120) {
            method117(12, -81, 3, -46, (byte) -58, (class60) null);
        }
        if (arg5.field984 != null) {
            arg5.field984.method201(var7);
            if (!arg5.field984.method1609((byte) -109)) {
                arg5.field984 = null;
            }
        } else if (arg5.field989 != null && (arg5.field1006 -= arg0) <= 0) {
            int var11 = (int) ((double) arg5.field989.length * Math.random());
            class213 var12 = class213.method1423(class8.field156, arg5.field989[var11], 0);
            if (var12 != null) {
                class89 var13 = var12.method1426().method659(class101.field1794);
                class19 var14 = class19.method214(var13, 100, var7);
                var14.method193(0);
                class36.field606.method1215(var14);
                arg5.field1006 = (int) (Math.random() * (double) (arg5.field1000 - arg5.field987)) + arg5.field987;
                arg5.field984 = var14;
                return;
            }
        }
    }
}
