import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class756 {

    @OriginalMember(owner = "client!kca", name = "q", descriptor = "Ldm;")
    private class98 field10506 = new class98();

    @OriginalMember(owner = "client!kca", name = "m", descriptor = "I")
    private int field10502;

    @OriginalMember(owner = "client!kca", name = "l", descriptor = "I")
    private int field10501;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "Lgca;")
    private class209 field10490;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "I")
    public static int field10496 = 0;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "Lbfa;")
    public static class574 field10497 = new class574();

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    public static int field10491;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
    public static int field10492;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
    public static int field10493;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
    public static int field10494;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    public static int field10495;

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "I")
    public static int field10498;

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "I")
    public static int field10499;

    @OriginalMember(owner = "client!kca", name = "k", descriptor = "I")
    public static int field10500;

    @OriginalMember(owner = "client!kca", name = "n", descriptor = "I")
    public static int field10503;

    @OriginalMember(owner = "client!kca", name = "o", descriptor = "I")
    public static int field10504;

    @OriginalMember(owner = "client!kca", name = "p", descriptor = "I")
    public static int field10505;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)I")
    public final int method4191(int arg0) {
        if (arg0 != 6731) {
            this.method4199(null, -43);
        }
        field10499++;
        return this.field10502;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lwf;Ljava/lang/Object;II)V")
    private final void method4192(class107 arg0, Object arg1, int arg2, int arg3) {
        field10494++;
        if (arg3 > this.field10501) {
            throw new IllegalStateException("s>cs");
        }
        this.method4202(arg0, -1);
        this.field10502 -= arg3;
        while (this.field10502 < 0) {
            class62 var6 = (class62) this.field10506.method665((byte) -55);
            this.method4199(var6, arg2 ^ 0x272B);
        }
        class535 var5 = new class535(arg0, arg1, arg3);
        this.field10490.method1387(var5, arg0.method727(27857), (byte) -111);
        this.field10506.method666(8192, var5);
        var5.field3778 = arg2;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)V")
    public static void method4193(int arg0) {
        if (arg0 != 1) {
            method4194(null, (byte) 32);
        }
        field10497 = null;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lvj;B)V")
    public static final void method4194(class26 arg0, byte arg1) {
        field10495++;
        for (int var2 = 0; var2 < class724.field10198; var2++) {
            int var3 = arg0.method190(arg1 - 27231);
            int var4 = arg0.method193(arg1 ^ 0x7);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class658.field9293[var3] != null) {
                class658.field9293[var3].field5395 = var4;
            }
        }
        if (arg1 != 5) {
            method4194(null, (byte) -31);
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V")
    public final void method4195(byte arg0) {
        this.field10506.method661(false);
        field10503++;
        this.field10490.method1385((byte) -97);
        if (arg0 >= -56) {
            this.field10490 = null;
        }
        this.field10502 = this.field10501;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lwf;Z)Ljava/lang/Object;")
    public final Object method4196(class107 arg0, boolean arg1) {
        field10500++;
        long var3 = arg0.method727(27857);
        if (arg1) {
            return null;
        }
        for (class62 var5 = (class62) this.field10490.method1381(!arg1, var3); var5 != null; var5 = (class62) this.field10490.method1391(-1)) {
            if (var5.field831.method728(arg0, -102)) {
                Object var6 = var5.method401(0);
                if (var6 != null) {
                    if (var5.method398(233)) {
                        class535 var7 = new class535(arg0, var6, var5.field830);
                        this.field10490.method1387(var7, var5.field7166, (byte) -120);
                        this.field10506.method666(8192, var7);
                        var7.field3778 = 0L;
                        var5.method3065(-17363);
                        var5.method1706((byte) 79);
                    } else {
                        this.field10506.method666(8192, var5);
                        var5.field3778 = 0L;
                    }
                    return var6;
                }
                var5.method3065(-17363);
                var5.method1706((byte) 79);
                this.field10502 += var5.field830;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(B)I")
    public final int method4197(byte arg0) {
        if (arg0 == 93) {
            field10491++;
            return this.field10501;
        } else {
            return -23;
        }
    }

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "(I)V")
    public final void method4198(int arg0) {
        field10505++;
        for (class62 var2 = (class62) this.field10506.method667(true); var2 != null; var2 = (class62) this.field10506.method662((byte) -108)) {
            if (var2.method398(233)) {
                var2.method3065(arg0 ^ 0x43D2);
                var2.method1706((byte) 79);
                this.field10502 += var2.field830;
            }
        }
        if (arg0 != -1) {
            this.method4197((byte) 75);
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Ldc;I)V")
    private final void method4199(class62 arg0, int arg1) {
        if (arg1 != 10027) {
            this.field10490 = null;
        }
        if (arg0 != null) {
            arg0.method3065(-17363);
            arg0.method1706((byte) 79);
            this.field10502 += arg0.field830;
        }
        field10504++;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lwf;ILjava/lang/Object;)V")
    public final void method4200(class107 arg0, int arg1, Object arg2) {
        if (arg1 != 11667) {
            field10497 = null;
        }
        this.method4192(arg0, arg2, arg1 - 11667, 1);
        field10492++;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZI)V")
    public final void method4201(boolean arg0, int arg1) {
        if (arg0) {
            this.method4199(null, 35);
        }
        if (class71.field996 != null) {
            for (class62 var3 = (class62) this.field10506.method667(!arg0); var3 != null; var3 = (class62) this.field10506.method662((byte) 33)) {
                if (var3.method398(233)) {
                    if (var3.method401(0) == null) {
                        var3.method3065(-17363);
                        var3.method1706((byte) 79);
                        this.field10502 += var3.field830;
                    }
                } else if (((long) arg1) < (++var3.field3778)) {
                    class62 var4 = class71.field996.method1396(var3, false);
                    this.field10490.method1387(var4, var3.field7166, (byte) -112);
                    class679.method3891((byte) 65, var3, var4);
                    var3.method3065(-17363);
                    var3.method1706((byte) 79);
                }
            }
        }
        field10493++;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lwf;I)V")
    private final void method4202(class107 arg0, int arg1) {
        field10498++;
        if (arg1 != -1) {
            field10497 = null;
        }
        long var3 = arg0.method727(27857);
        for (class62 var5 = (class62) this.field10490.method1381(true, var3); var5 != null; var5 = (class62) this.field10490.method1391(-1)) {
            if (var5.field831.method728(arg0, arg1 ^ 0x5E)) {
                this.method4199(var5, 10027);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(I)V")
    public class756(int arg0) {
        this.field10502 = arg0;
        this.field10501 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field10490 = new class209(var2);
    }
}
