import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class771 extends class260 {

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field10582;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field10583;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field10584;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field10585;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field10586;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public static int field10587;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public static int field10588;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field10589;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
    public static int field10590;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
    public static int field10591;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IB)V")
    public final void method128(int arg0, byte arg1) {
        super.field3828 = arg0;
        if (arg1 == 122) {
            ++field10591;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/String;II)I")
    public static final int method4250(String arg0, int arg1, int arg2) {
        ++field10585;
        return arg2 != -28990 ? 30 : class250.method1650(arg0, (byte) 31, true, arg1);
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(II)I")
    public final int method129(int arg0, int arg1) {
        ++field10590;
        if (arg0 != -1) {
            this.method4252(73);
        }
        return 1;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method4251(String arg0, int arg1) {
        ++field10588;
        int var2 = arg0.length();
        long var3 = 0L;
        if (arg1 != 1825824517) {
            method4253(-4, 42);
        }
        for (int var5 = 0; var5 < var2; ++var5) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) + -var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lgn;)V")
    public class771(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public final void method126(int arg0) {
        if (super.field3828 < 0 && ~super.field3828 < -5) {
            super.field3828 = this.method123(4377);
        }
        if (arg0 >= 102) {
            ++field10584;
        }
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)I")
    public final int method4252(int arg0) {
        ++field10583;
        if (arg0 > -14) {
            field10589 = -64;
        }
        return super.field3828;
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(ILgn;)V")
    public class771(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)I")
    public final int method123(int arg0) {
        if (arg0 != 4377) {
            return 56;
        } else {
            ++field10587;
            return ~super.field3829.method4083(120).method2820((byte) 124) < -2 ? 4 : 2;
        }
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(II)Lej;")
    public static final class132 method4253(int arg0, int arg1) {
        ++field10586;
        class132 var2 = (class132) class267.field3893.method3742((byte) 67, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class287.field4223.method4339(arg1, 0, 1);
            class132 var4 = new class132();
            var4.field2002 = arg1;
            if (var3 != null) {
                var4.method975(new class494(var3), 18327);
            }
            var4.method978(false);
            if (var4.field1999 == 2 && class444.field6043.method2242((long) arg1, -1) == null) {
                class444.field6043.method2241(-124, (long) arg1, new class489(class242.field3612));
                class671.field9350[class242.field3612++] = var4;
            }
            if (arg0 != 11879) {
                return null;
            } else {
                class267.field3893.method3739((long) arg1, (byte) 84, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
    public static final void method4254(byte arg0) {
        class350.method2219((byte) 124);
        ++field10582;
        if (arg0 != -107) {
            field10589 = 78;
        }
    }
}
