import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class134 {

    @OriginalMember(owner = "client!d", name = "e", descriptor = "[Lwa;")
    public static class75[] field2308 = new class75[8];

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Lgb;")
    public static class158 field2307 = new class158(4);

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field2311 = 0;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Lwa;")
    public static class75 field2312 = class66.method560("<img=1>", false);

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Ljc;")
    public static class281 field2310 = new class281();

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Lwa;")
    public static class75 field2314 = class66.method560("null", false);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Lcb;")
    public static class267 field2309;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Lul;")
    public static class39 field2313;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)Laf;", line = 16)
    public static final class167 method1036(int arg0, int arg1, int arg2) {
        class242 var3 = class271.field4681[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4098;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIILcb;)[Lbh;", line = 27)
    public static final class258[] method1037(int arg0, int arg1, int arg2, class267 arg3) {
        int var4 = 86 / ((-arg1 - 24) / 54);
        field2305++;
        return class281.method1994(arg0, (byte) -7, arg2, arg3) ? class99.method760(-20911) : null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V", line = 39)
    public static void method1038(byte arg0) {
        field2307 = null;
        field2310 = null;
        field2314 = null;
        field2313 = null;
        field2312 = null;
        field2309 = null;
        field2308 = null;
        int var1 = 123 % ((arg0 - 67) / 51);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V", line = 59)
    public static final void method1039(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg1; var5 < class273.field4720; var5++) {
            if ((class217.field3716[var5] + class120.field2024[var5]) > arg2 && (arg0 + arg2) > class217.field3716[var5] && arg3 < (class172.field2909[var5] + class157.field2698[var5]) && class157.field2698[var5] < arg3 + arg4) {
                class219.field3743[var5] = true;
            }
        }
        field2306++;
    }
}
