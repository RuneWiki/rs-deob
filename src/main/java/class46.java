import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class46 extends class567 {

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "[[I")
    public static int[][] field394 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "Les;")
    public class320 field390;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "[B")
    public byte[] field393;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(B)V")
    public static void method242(byte arg0) {
        if (arg0 <= 92) {
            field394 = null;
        }
        field394 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILjava/lang/String;I)I")
    public static final int method243(int arg0, String arg1, int arg2) {
        if (arg0 >= -122) {
            field394 = null;
        }
        ++field395;
        return class44.method233(122, arg2, true, arg1);
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)[B")
    public final byte[] method244(int arg0) {
        ++field396;
        if (super.field8322) {
            throw new RuntimeException();
        } else {
            return arg0 < 119 ? null : this.field393;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)I")
    public final int method245(boolean arg0) {
        ++field398;
        if (super.field8322) {
            return 0;
        } else {
            if (arg0) {
                this.field393 = null;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)Lol;")
    public static final class237 method246(int arg0, byte arg1) {
        ++field392;
        if (arg1 != -69) {
            field394 = null;
        }
        class237 var2 = (class237) class290.field3763.method3682(0, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class561.field8251.method2558(arg1 + 169, arg0, 0);
            class237 var4 = new class237();
            if (var3 != null) {
                var4.method1342((byte) 127, new class374(var3));
            }
            var4.method1346(-1082254200);
            class290.field3763.method3684(var4, arg1 ^ -69, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V")
    public static final void method247(int arg0) {
        if (arg0 != -23300) {
            field394 = null;
        }
        ++field391;
        if (class404.field5312) {
            while (true) {
                while (~class536.field7518 > ~class544.field7971.length) {
                    class29 var1 = class544.field7971[class536.field7518];
                    if (var1 != null && ~var1.field198 == 0) {
                        if (class536.field7517 == null) {
                            class536.field7517 = class399.field5251.method2358(var1.field194, 1);
                        }
                        int var2 = class536.field7517.field3720;
                        if (var2 == -1) {
                            return;
                        }
                        var1.field198 = var2;
                        ++class536.field7518;
                        class536.field7517 = null;
                    } else {
                        ++class536.field7518;
                    }
                }
                return;
            }
        }
    }
}
