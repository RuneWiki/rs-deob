import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class659 extends class390 {

    @OriginalMember(owner = "client!dw", name = "q", descriptor = "I")
    public int field9431;

    @OriginalMember(owner = "client!dw", name = "s", descriptor = "I")
    public int field9433;

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "[F")
    public static float[] field9430 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!dw", name = "t", descriptor = "[Lgba;")
    public static class700[] field9434 = new class700[14];

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!dw", name = "r", descriptor = "I")
    public static int field9432;

    @OriginalMember(owner = "client!dw", name = "u", descriptor = "I")
    public static int field9435;

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Leda;Lcga;IIIIIIIII)V", line = 3)
    public class659(class14 arg0, class141 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field9431 = arg10;
        this.field9433 = arg9;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lr;III[Z)V", line = 17)
    public static final void method3762(class704 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class95.field1372 == class25.field221) {
            return;
        }
        int var5 = class491.field7079[arg1].method2089(26448, arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class339 var7 = class491.field7079[var6];
                if (var7 != null) {
                    var7.method36(arg0, arg2, var5 - var7.method2089(26448, arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I[Lqk;Z)V", line = 47)
    public static final void method3763(int arg0, class146[] arg1, boolean arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class146 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field2112 == 0) {
                    if (var4.field2019 != null) {
                        method3763(arg0, var4.field2019, false);
                    }
                    class182 var5 = (class182) class591.field8410.method4020((long) var4.field2079, (byte) -110);
                    if (var5 != null) {
                        class647.method3741(arg0, (byte) -82, var5.field2505);
                    }
                }
                if (arg0 == 0 && var4.field1976 != null) {
                    class362 var6 = new class362();
                    var6.field5304 = var4;
                    var6.field5297 = var4.field1976;
                    class529.method3207(var6);
                }
                if (arg0 == 1 && var4.field1971 != null) {
                    if (var4.field2010 >= 0) {
                        class146 var7 = class250.method1689(var4.field2079, false);
                        if (var7 == null || var7.field2019 == null || var4.field2010 >= var7.field2019.length || var7.field2019[var4.field2010] != var4) {
                            continue;
                        }
                    }
                    class362 var8 = new class362();
                    var8.field5297 = var4.field1971;
                    var8.field5304 = var4;
                    class529.method3207(var8);
                }
            }
        }
        if (arg2) {
            method3764(-118, -77);
        }
        field9432++;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)Lsn;", line = 118)
    public static final class159 method3764(int arg0, int arg1) {
        field9429++;
        if (arg1 != 27583) {
            method3762(null, 23, 38, 80, null);
        }
        return arg0 >= 0 && arg0 < 100 ? class241.field3566[arg0] : null;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)Lhr;", line = 134)
    public final class57 method478(int arg0) {
        if (arg0 <= 30) {
            method3763(-38, null, false);
        }
        field9435++;
        return class457.field6509;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V", line = 153)
    public static void method3765(byte arg0) {
        int var1 = -11 % ((arg0 + 1) / 61);
        field9430 = null;
        field9434 = null;
    }
}
