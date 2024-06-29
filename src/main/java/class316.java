import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class316 {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Lfr;")
    private class231 field4966 = new class231(64);

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Lfr;")
    public class231 field4977 = new class231(64);

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Lqs;")
    private class496 field4969;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Lqs;")
    public class496 field4971;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4972 = new String[100];

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lpu;")
    public static class411 field4967 = new class411();

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "[B")
    public static byte[] field4979 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "Lqs;")
    public static class496 field4978;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public final void method2001(byte arg0) {
        class231 var2 = this.field4966;
        synchronized (this.field4966) {
            this.field4966.method1604(4);
        }
        if (arg0 != 0) {
            field4978 = null;
        }
        field4975++;
        class231 var3 = this.field4977;
        synchronized (this.field4977) {
            this.field4977.method1604(4);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method2002(int arg0) {
        field4967 = null;
        int var1 = 32 % ((82 - arg0) / 39);
        field4972 = null;
        field4979 = null;
        field4978 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
    public final void method2003(int arg0, int arg1) {
        field4970++;
        class231 var3 = this.field4966;
        synchronized (this.field4966) {
            this.field4966.method1603((byte) -114, arg1);
        }
        if (arg0 >= -84) {
            this.field4971 = null;
        }
        class231 var4 = this.field4977;
        synchronized (this.field4977) {
            this.field4977.method1603((byte) -122, arg1);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BILp;II)V")
    public static final void method2004(byte arg0, int arg1, class39 arg2, int arg3, int arg4) {
        field4968++;
        if (arg0 != 11) {
            method2002(93);
        }
        for (class451 var5 = (class451) class305.field4874.method2538(-3); var5 != null; var5 = (class451) class305.field4874.method2535((byte) -56)) {
            if (var5.field6727 == arg3 && (arg1 << 7) == var5.field6716 && arg4 << 7 == var5.field6740 && var5.field6718.field587 == arg2.field587) {
                if (var5.field6723 != null) {
                    class510.field7455.method1734(var5.field6723);
                    var5.field6723 = null;
                }
                if (var5.field6734 != null) {
                    class510.field7455.method1734(var5.field6734);
                    var5.field6734 = null;
                }
                var5.method1821((byte) 87);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)Lsi;")
    public final class517 method2005(int arg0, int arg1) {
        field4976++;
        class231 var3 = this.field4966;
        class517 var4;
        synchronized (this.field4966) {
            var4 = (class517) this.field4966.method1593((byte) -63, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field4969;
        byte[] var6;
        synchronized (this.field4969) {
            var6 = this.field4969.method2926(arg0, -54, arg1);
        }
        class517 var7 = new class517();
        var7.field7646 = this;
        if (var6 != null) {
            var7.method3062(new class23(var6), -2963);
        }
        class231 var8 = this.field4966;
        synchronized (this.field4966) {
            this.field4966.method1595(var7, (long) arg0, (byte) -112);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBI)V")
    public final void method2006(int arg0, byte arg1, int arg2) {
        this.field4966 = new class231(arg2);
        field4974++;
        int var4 = 54 / ((-arg1 - 34) / 53);
        this.field4977 = new class231(arg0);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public final void method2007(int arg0) {
        field4973++;
        class231 var2 = this.field4966;
        synchronized (this.field4966) {
            this.field4966.method1598(85);
        }
        if (arg0 <= -44) {
            class231 var3 = this.field4977;
            synchronized (this.field4977) {
                this.field4977.method1598(123);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lwv;ILqs;Lqs;)V")
    public class316(class535 arg0, int arg1, class496 arg2, class496 arg3) {
        this.field4969 = arg2;
        this.field4971 = arg3;
        this.field4969.method2940(34, -10511);
    }
}
