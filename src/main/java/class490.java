import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class490 implements class444 {

    @OriginalMember(owner = "client!wda", name = "q", descriptor = "Lfe;")
    public class345 field6730;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "I")
    public int field6722;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
    public int field6719;

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
    public int field6723;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "I")
    public int field6715;

    @OriginalMember(owner = "client!wda", name = "n", descriptor = "I")
    public int field6727;

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
    public int field6726;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
    public int field6718;

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "I")
    public int field6724;

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "I")
    public int field6716;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "Lmp;")
    public class565 field6720;

    @OriginalMember(owner = "client!wda", name = "s", descriptor = "Ljava/lang/String;")
    public String field6732;

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "I")
    public int field6725;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "[[I")
    public static int[][] field6714 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!wda", name = "o", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!wda", name = "p", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!wda", name = "r", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ldaa;Ldaa;I)V")
    public static final void method2865(class454 arg0, class454 arg1, int arg2) {
        if (arg1.field6211 != null) {
            arg1.method2665(24902);
        }
        field6717++;
        arg1.field6213 = arg0;
        arg1.field6211 = arg0.field6211;
        if (arg2 != 5) {
            method2865(null, null, 50);
        }
        arg1.field6211.field6213 = arg1;
        arg1.field6213.field6211 = arg1;
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(B)V")
    public static void method2866(byte arg0) {
        if (arg0 <= -102) {
            field6714 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(BIJ)Leq;")
    public static final class371 method2867(byte arg0, int arg1, long arg2) {
        field6729++;
        if (arg0 >= -34) {
            method2867((byte) 103, -71, -35L);
        }
        class371 var4 = (class371) class4.field61.method4253((long) arg1 << 56 | arg2, -1);
        if (var4 == null) {
            var4 = new class371(arg1, arg2);
            class4.field61.method4252(false, var4, var4.field10592);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(III)I")
    public static final int method2868(int arg0, int arg1, int arg2) {
        field6728++;
        if (arg2 != 7) {
            field6714 = null;
        }
        byte var3;
        if (arg0 > 20000) {
            var3 = 4;
            class565.method3294(-5550);
        } else if (arg0 > 10000) {
            class775.method4271(255);
            var3 = 3;
        } else if (arg0 > 5000) {
            class698.method3917(arg2 + 116);
            var3 = 2;
        } else {
            var3 = 1;
            class713.method3967(true, 2);
        }
        if (class420.field5820.field9482.method2338(arg2 + 17532) != arg1) {
            class420.field5820.method3781(class420.field5820.field9466, 80, arg1);
            class636.method3625(false, arg1, arg2 - 10);
        }
        class95.method797(arg2 - 94);
        return var3;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)Lhl;")
    public final class353 method327(byte arg0) {
        if (arg0 <= 51) {
            return null;
        } else {
            field6721++;
            return class568.field7901;
        }
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Ljava/lang/String;Lmp;Lfe;IIIIIIIIII)V")
    public class490(String arg0, class565 arg1, class345 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field6730 = arg2;
        this.field6722 = arg10;
        this.field6719 = arg11;
        this.field6723 = arg12;
        this.field6715 = arg4;
        this.field6727 = arg7;
        this.field6726 = arg8;
        this.field6718 = arg5;
        this.field6724 = arg6;
        this.field6716 = arg9;
        this.field6720 = arg1;
        this.field6732 = arg0;
        this.field6725 = arg3;
    }
}
