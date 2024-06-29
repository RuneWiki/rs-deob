import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class581 {

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lkd;")
    private class700 field8452;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "J")
    public long field8450;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field8454 = null;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Lvg;")
    public static class622 field8453 = new class622(102, 7);

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field8459 = 0;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "Lvg;")
    public static class622 field8460 = new class622(39, 7);

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field8451;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field8457;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method3334(boolean arg0) {
        field8456++;
        class647.field9307 = 0;
        int var1 = (class321.field4681.field7895 >> 9) + class397.field6005;
        int var2 = (class321.field4681.field7896 >> 9) + class403.field6049;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class647.field9307 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class647.field9307 = 1;
        }
        if (arg0 && class647.field9307 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class647.field9307 = 0;
        }
    }

    @OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V", line = 30)
    protected final void finalize() throws Throwable {
        field8458++;
        this.field8452.method3926(this.field8450, -82);
        super.finalize();
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII)V", line = 42)
    public static final void method3335(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 1004) {
            field8459 = 110;
        }
        if (arg3 == 1002) {
            class195.method1263(class314.field4594, arg1, arg2);
        } else if (arg3 == 1012) {
            class195.method1263(class229.field3034, arg1, arg2);
        } else if (arg3 == 1009) {
            class195.method1263(class361.field5295, arg1, arg2);
        } else if (arg3 == 1004) {
            class195.method1263(class46.field700, arg1, arg2);
        } else if (arg3 == 1011) {
            class195.method1263(class552.field8121, arg1, arg2);
        }
        field8455++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIII)Lrs;", line = 78)
    public static final class649 method3336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8451++;
        long var7 = (long) arg6 * 32147369L ^ (long) arg2 * 986053L ^ (long) arg3 * 475427L ^ (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg4 * 76724863L;
        class649 var9 = (class649) class148.field2105.method3901(var7, -56);
        if (var9 != null) {
            return var9;
        }
        class649 var10 = class170.field2401.method614(arg0, arg1, arg3, arg2, arg6, arg4);
        if (arg5 <= 111) {
            return null;
        } else {
            class148.field2105.method3894(var10, (byte) 60, var7);
            return var10;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V", line = 99)
    public static void method3337(byte arg0) {
        if (arg0 != 120) {
            method3334(true);
        }
        field8454 = null;
        field8453 = null;
        field8460 = null;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lkd;JI)V", line = 112)
    public class581(class700 arg0, long arg1, int arg2) {
        this.field8452 = arg0;
        this.field8450 = arg1;
    }
}
