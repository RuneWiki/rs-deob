import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class46 {

    @OriginalMember(owner = "client!kaa", name = "l", descriptor = "I")
    private int field678;

    @OriginalMember(owner = "client!kaa", name = "i", descriptor = "[Ljda;")
    private class224[] field675;

    @OriginalMember(owner = "client!kaa", name = "k", descriptor = "Lfs;")
    public static class552 field677 = new class552(128);

    @OriginalMember(owner = "client!kaa", name = "p", descriptor = "Lqe;")
    public static class465 field682 = new class465(21, 7);

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!kaa", name = "j", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!kaa", name = "m", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!kaa", name = "n", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "J")
    private long field669;

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "Leq;")
    public static class209 field673;

    @OriginalMember(owner = "client!kaa", name = "o", descriptor = "Ljda;")
    private class224 field681;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)Ljda;")
    public final class224 method412(int arg0) {
        field674++;
        if (this.field681 == null) {
            return null;
        }
        class224 var2 = this.field675[(int) ((long) (this.field678 + arg0) & this.field669)];
        while (this.field681 != var2) {
            if (this.field681.field3211 == this.field669) {
                class224 var3 = this.field681;
                this.field681 = this.field681.field3201;
                return var3;
            }
            this.field681 = this.field681.field3201;
        }
        this.field681 = null;
        return null;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lvk;BIIII)Ljava/awt/Frame;")
    public static final Frame method413(class367 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field670++;
        if (!arg0.method2289((byte) -110)) {
            return null;
        }
        if (arg4 == 0) {
            class374[] var6 = class526.method3115((byte) -109, arg0);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field5250 == arg2 && var6[var8].field5244 == arg3 && (arg5 == 0 || var6[var8].field5246 == arg5) && (!var7 || var6[var8].field5245 > arg4)) {
                    var7 = true;
                    arg4 = var6[var8].field5245;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class637 var9 = arg0.method2293(arg2, (byte) -109, arg4, arg3, arg5);
        while (var9.field9091 == 0) {
            class246.method1639(10L, (byte) -112);
        }
        Frame var10 = (Frame) var9.field9093;
        if (arg1 != 59) {
            method419(125, 83, -128);
        }
        if (var10 == null) {
            return null;
        } else if (var9.field9091 == 2) {
            class394.method2446(-82, arg0, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method414(int arg0) {
        field667++;
        int var1 = 70 / ((arg0 - 33) / 41);
        return class34.field450 || class522.field7394 == null ? "" : class522.field7394.field1187;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method415(boolean arg0, String arg1) {
        field671++;
        int var2 = arg1.length();
        if (arg0) {
            return 126;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) - (var3 - arg1.charAt(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILeq;JIIIIZ)V")
    public static final void method416(int arg0, class209 arg1, long arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class407.field5673 = arg7;
        class484.field6849 = arg2;
        class107.field1766 = arg0;
        class382.field5353 = arg5;
        class241.field3390 = arg6;
        class463.field6664 = arg3;
        field676++;
        class432.field6038 = null;
        class736.field10362 = arg4;
        class577.field8167 = arg1;
        class731.field10231 = 1;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(JLjda;I)V")
    public final void method417(long arg0, class224 arg1, int arg2) {
        if (arg1.field3202 != null) {
            arg1.method1553(75);
        }
        field679++;
        class224 var5 = this.field675[(int) ((long) (this.field678 - 1) & arg0)];
        arg1.field3202 = var5.field3202;
        arg1.field3201 = var5;
        arg1.field3202.field3201 = arg1;
        if (arg2 == 2) {
            arg1.field3211 = arg0;
            arg1.field3201.field3202 = arg1;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(JZ)Ljda;")
    public final class224 method418(long arg0, boolean arg1) {
        this.field669 = arg0;
        field680++;
        class224 var4 = this.field675[(int) ((long) (this.field678 - 1) & arg0)];
        if (arg1) {
            this.method418(-70L, true);
        }
        for (this.field681 = var4.field3201; this.field681 != var4; this.field681 = this.field681.field3201) {
            if (this.field681.field3211 == arg0) {
                class224 var5 = this.field681;
                this.field681 = this.field681.field3201;
                return var5;
            }
        }
        this.field681 = null;
        return null;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)Lwr;")
    public static final class455 method419(int arg0, int arg1, int arg2) {
        class416 var3 = class390.field5454[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5840;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)V")
    public static void method420(byte arg0) {
        field682 = null;
        if (arg0 <= 23) {
            field677 = null;
        }
        field673 = null;
        field677 = null;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BII)Ljn;")
    public static final class716 method421(byte arg0, int arg1, int arg2) {
        field672++;
        class716 var3 = new class716();
        var3.field10013 = arg1 + 5 + 1;
        var3.field10004 = -1;
        var3.field10002 = arg2 + 6;
        if (arg0 != -43) {
            method413(null, (byte) -20, 48, 68, -17, -100);
        }
        var3.field9992 = -1;
        var3.field9991 = new int[var3.field10013][var3.field10002];
        var3.method3994(false);
        return var3;
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(I)V")
    public class46(int arg0) {
        this.field678 = arg0;
        this.field675 = new class224[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class224 var3 = this.field675[var2] = new class224();
            var3.field3202 = var3;
            var3.field3201 = var3;
        }
    }
}
