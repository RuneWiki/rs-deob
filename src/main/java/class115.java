import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class class115 extends class153 {

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "Lpj;")
    private static class237 field2012 = class33.method353("Discard", 120);

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "Lpj;")
    public static class237 field2016 = class33.method353("Musik)2Engine vorbereitet)3", 75);

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "Lpj;")
    public static class237 field2026 = class33.method353("Lade Titelbild )2 ", 98);

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "Lpj;")
    public static class237 field2028 = class33.method353("www", 103);

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "[I")
    public static int[] field2023 = new int[100];

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "Lpj;")
    public static class237 field2013 = field2012;

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "I")
    public static int field2031 = 0;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public int field2014;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public int field2015;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "I")
    public int field2019;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    public int field2021;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "I")
    public int field2030;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "Llh;")
    public static class274 field2020;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "[[[Lvk;")
    public static class35[][][] field2027;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIII)V")
    public abstract void method815(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(Z)V")
    public static void method843(boolean arg0) {
        field2023 = null;
        field2013 = null;
        field2027 = null;
        if (arg0) {
            return;
        }
        field2016 = null;
        field2012 = null;
        field2020 = null;
        field2028 = null;
        field2026 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIII)V")
    public abstract void method844(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
    public abstract void method808(int arg0, int arg1);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)V")
    public static final void method845(byte arg0, int arg1) {
        if (arg0 == -68) {
            class166.field2943 = arg1;
            field2029++;
            class135.field2360 = 50;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(IIIII)V")
    public final void method846(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 9995) {
            field2031 = 56;
        }
        field2011++;
        int var6 = this.field2030 << 3;
        int var7 = (arg4 << 4) + (var6 & 0xF);
        int var8 = this.field2019 << 3;
        int var9 = (arg2 << 4) + (var8 & 0xF);
        this.method811(var6, var8, var7, var9, arg1, arg0);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)V")
    public abstract void method806(int arg0, int arg1);

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)I")
    public static final int method847(byte arg0) {
        field2024++;
        int var1 = -120 % ((55 - arg0) / 42);
        return 2;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILw;)Lpj;")
    public static final class237 method848(int arg0, class141 arg1) {
        field2010++;
        if (arg0 >= -85) {
            field2016 = null;
        }
        if (class92.method694(client.method1042(arg1), (byte) -35) == 0) {
            return null;
        } else if (arg1.field2547 == null || arg1.field2547.method1605(false).method1588(false) == 0) {
            return class215.field3731 ? class230.field3927 : null;
        } else {
            return arg1.field2547;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
    public abstract void method807(int arg0, int arg1, int arg2);
}
