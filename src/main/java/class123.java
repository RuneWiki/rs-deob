import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class123 {

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field2011 = 0;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Lhd;")
    public static class214 field2014 = new class214(16);

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "[I")
    public static int[] field2022 = new int[25];

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field2024 = -1;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field2017 = -1;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field2018 = 0;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Lsc;")
    private static class181 field2020 = class149.method967(255, "OFF");

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Lsc;")
    public static class181 field2019 = field2020;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public int field2010;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public int field2013;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Ljb;")
    public static class11 field2016;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Luf;")
    public static class217 field2023;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Lpd;")
    public static class48 field2015;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method799(int arg0) {
        field2016 = null;
        field2022 = null;
        field2023 = null;
        field2014 = null;
        field2019 = null;
        if (arg0 == 16) {
            field2020 = null;
            field2015 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)J")
    public static final long method800(int arg0, int arg1, int arg2) {
        class220 var3 = class221.field3820[arg0][arg1][arg2];
        return var3 == null || var3.field3805 == null ? 0L : var3.field3805.field2787;
    }
}
