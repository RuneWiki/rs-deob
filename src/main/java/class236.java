import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class236 {

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "Liu;")
    public static class390 field3316;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "Lmn;")
    public class236 field3310;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "Lmn;")
    public class236 field3312;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "Ljt;")
    public static class64 field3311;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)V")
    public static final void method1431(int arg0, int arg1, int arg2) {
        field3315++;
        class338 var3 = class380.method2294((byte) 79, arg2, 6);
        var3.method2052((byte) -55);
        if (arg1 != -1) {
            method1434((byte) -85, -44, -16, -51, -94, 71, -19);
        }
        var3.field4930 = arg0;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
    public static void method1432(byte arg0) {
        field3316 = null;
        int var1 = -19 % ((arg0 + 66) / 56);
        field3311 = null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIB)Lts;")
    public static final class356 method1433(int arg0, int arg1, byte arg2) {
        field3309++;
        class356 var3 = class4.method25(arg1, false);
        if (arg0 == -1) {
            return var3;
        } else if (arg2 <= 38) {
            return null;
        } else if (var3 == null || var3.field5151 == null || var3.field5151.length <= arg0) {
            return null;
        } else {
            return var3.field5151[arg0];
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BIIIIII)V")
    public static final void method1434(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3313++;
        int var7 = arg5 + arg2;
        int var8 = arg3 - arg2;
        for (int var9 = arg5; var9 < var7; var9++) {
            class238.method1440(class41.field629[var9], arg4, arg1, arg6, -14726);
        }
        int var10 = arg2 + arg6;
        int var11 = arg1 - arg2;
        for (int var12 = arg3; var12 > var8; var12--) {
            class238.method1440(class41.field629[var12], arg4, arg1, arg6, -14726);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class41.field629[var13];
            class238.method1440(var14, arg4, var10, arg6, -14726);
            class238.method1440(var14, arg4, arg1, var11, arg0 - 14822);
        }
        if (arg0 != 96) {
            field3311 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
    public final void method1435(boolean arg0) {
        field3314++;
        if (this.field3312 == null) {
            return;
        }
        if (!arg0) {
            method1431(-84, 69, -90);
        }
        this.field3312.field3310 = this.field3310;
        this.field3310.field3312 = this.field3312;
        this.field3310 = null;
        this.field3312 = null;
    }

    static {
        new class194("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field3316 = new class390(60, 5);
    }
}
