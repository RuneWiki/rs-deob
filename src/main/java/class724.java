import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class724 implements class279 {

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Lii;")
    private class521 field10197;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "[I")
    public int[] field10202;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public int field10191;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public int field10203;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Lst;")
    private class333 field10200;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "[F")
    public float[] field10205;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field10195 = 0;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field10204 = 0;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field10199 = 0;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field10190 = -1;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field10189;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field10192;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field10193;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field10194;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field10196;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field10198;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field10201;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 3)
    public static final void method4054(int arg0) {
        if (arg0 == 0) {
            for (class192 var1 = (class192) class63.field842.method1382(27901); var1 != null; var1 = (class192) class63.field842.method1383(false)) {
                class49.method334((byte) -89, var1.field2789);
            }
            field10192++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lig;)V", line = 29)
    public static final void method4055(class674 arg0) {
        class646.field9160.method2131(arg0.field9490, arg0.field9502 + (arg0.method268(-1) >> 1), arg0.field9489, class26.field304);
        arg0.field9487 = class26.field304[0];
        arg0.field9488 = class26.field304[1];
        arg0.field9491 = class26.field304[2];
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V", line = 39)
    public static final void method4056(int arg0) {
        field10189++;
        if (class510.field7114 != null) {
            class510.field7114.method3145(-61);
        }
        if (arg0 <= 54) {
            method4056(-127);
        }
        if (class435.field5966 != null) {
            class435.field5966.method3145(-58);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIIIIIZZ)V", line = 62)
    public final void method1678(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field10196++;
        class31.method232(this.field10191, arg5, this.field10197.field7276.field1703, 31, arg2, this.field10197.field7276.field1701, arg3, arg7 ? this.field10197.field7303 : null, arg0, arg6 ? this.field10202 : null, arg7 ? this.field10205 : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/awt/Canvas;ILd;)Lha;", line = 71)
    public static final class545 method4057(int arg0, Canvas arg1, int arg2, class268 arg3) {
        field10201++;
        if (arg0 != 0) {
            method4058(null, 40);
        }
        return new class371(arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIZZ)V", line = 93)
    public final void method1677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field10193++;
        class31.method232(this.field10197.field7276.field1701, arg5, this.field10202, 94, arg2, this.field10191, arg3, arg7 ? this.field10205 : null, arg0, arg6 ? this.field10197.field7276.field1703 : null, arg7 ? this.field10197.field7303 : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 101)
    public static final byte[] method4058(String arg0, int arg1) {
        field10194++;
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (var2 <= (var3 - 2) || class103.method700(arg0.charAt(var3 - 2), (byte) -52) == -1) {
            var4 -= 2;
        } else if (var2 <= (var3 - 1) || class103.method700(arg0.charAt(var3 - 1), (byte) -52) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        if (arg1 == 1) {
            class554.method3300(5279, var5, arg0, 0);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lii;Lcw;Lst;)V", line = 131)
    public class724(class521 arg0, class21 arg1, class333 arg2) {
        this.field10197 = arg0;
        if ((arg1 instanceof class715)) {
            class715 var5 = (class715) arg1;
            this.field10191 = var5.field642;
            this.field10202 = var5.field10132;
            this.field10203 = var5.field633;
        } else if ((arg1 instanceof class546)) {
            class546 var4 = (class546) arg1;
            this.field10202 = var4.field7708;
            this.field10191 = var4.field642;
            this.field10203 = var4.field633;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field10200 = arg2;
            if (this.field10200.field4265 != this.field10191 || this.field10200.field4262 != this.field10203) {
                throw new RuntimeException();
            }
            this.field10205 = this.field10200.field4264;
        }
    }
}
