import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class class34 extends class24 {

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
    public int field708 = 1000;

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "J")
    public static long field705 = 0L;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "Lqf;")
    private static class117 field704 = class72.method514(124, "Loading fonts )2 ");

    @OriginalMember(owner = "client!ee", name = "eb", descriptor = "I")
    public static int field713 = 0;

    @OriginalMember(owner = "client!ee", name = "fb", descriptor = "Lqf;")
    public static class117 field714 = class72.method514(114, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "Lqf;")
    public static class117 field709 = class72.method514(102, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!ee", name = "gb", descriptor = "Lqf;")
    public static class117 field715 = field704;

    @OriginalMember(owner = "client!ee", name = "hb", descriptor = "B")
    public static byte field716 = 0;

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "Lad;")
    public static class5 field710 = new class5();

    @OriginalMember(owner = "client!ee", name = "kb", descriptor = "Lqf;")
    private static class117 field719 = class72.method514(125, "flash3:");

    @OriginalMember(owner = "client!ee", name = "lb", descriptor = "Lqf;")
    public static class117 field720 = field719;

    @OriginalMember(owner = "client!ee", name = "ib", descriptor = "Lqf;")
    public static class117 field717 = class72.method514(117, "Lade Ignorieren)2Liste)3)3)3");

    @OriginalMember(owner = "client!ee", name = "mb", descriptor = "Lqf;")
    public static class117 field721 = field719;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!ee", name = "jb", descriptor = "[[B")
    public static byte[][] field718;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "(I)V")
    public static void method266(int arg0) {
        field710 = null;
        field715 = null;
        if (arg0 != -1) {
            method267((byte) -8, null);
        }
        field720 = null;
        field709 = null;
        field719 = null;
        field721 = null;
        field714 = null;
        field717 = null;
        field704 = null;
        field718 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLmd;)V")
    public static final void method267(byte arg0, class87 arg1) {
        if (class43.field856 == arg1.field1976 || arg1.field2017 == -1 || arg1.field1994 != 0 || arg1.field2015 + 1 > class130.method1013(arg1.field2017, -99).field2334[arg1.field1952]) {
            int var2 = arg1.field2009 * 64 + arg1.field2000 * 128;
            int var3 = arg1.field2009 * 64 + arg1.field2003 * 128;
            int var4 = arg1.field1976 - arg1.field2013;
            int var5 = arg1.field1986 * 128 + arg1.field2009 * 64;
            int var6 = class43.field856 - arg1.field2013;
            arg1.field1998 = ((var4 - var6) * var3 + var5 * var6) / var4;
            int var7 = arg1.field2009 * 64 + arg1.field2006 * 128;
            arg1.field1960 = ((var4 - var6) * var2 + var6 * var7) / var4;
        }
        field702++;
        if (arg1.field2021 == 0) {
            arg1.field1969 = 1024;
        }
        int var8 = -72 / ((72 - arg0) / 52);
        if (arg1.field2021 == 1) {
            arg1.field1969 = 1536;
        }
        if (arg1.field2021 == 2) {
            arg1.field1969 = 0;
        }
        arg1.field1964 = 0;
        if (arg1.field2021 == 3) {
            arg1.field1969 = 512;
        }
        arg1.field1999 = arg1.field1969;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIIII)V")
    public void method229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field712++;
        class30 var10 = this.method7(-6941);
        if (var10 != null) {
            this.field708 = var10.field708;
            var10.method229(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[Lqf;)[Lqf;")
    public static final class117[] method268(int arg0, class117[] arg1) {
        class117[] var2 = new class117[arg0];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class73.method530((byte) -83, new class117[] { class79.method614(class138.method1074(arg0, 15586), var3), class13.field194 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class73.method530((byte) -83, new class117[] { var2[var3], arg1[var3] });
            }
        }
        field707++;
        return var2;
    }

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "(I)Lea;")
    public class30 method7(int arg0) {
        field703++;
        if (arg0 != -6941) {
            field717 = null;
        }
        return null;
    }
}
