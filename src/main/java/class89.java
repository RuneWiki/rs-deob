import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class89 {

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Lsa;")
    public class108 field2011 = new class108();

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lgd;")
    public static class40 field2007 = class14.method90(false, ":  ");

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "Lgd;")
    public static class40 field2022 = class14.method90(false, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2008 = 0;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Lgd;")
    private static class40 field2018 = class14.method90(false, "Friends");

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lgd;")
    private static class40 field2004 = class14.method90(false, "To play on this world move to a free area first");

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "[[[I")
    public static int[][][] field2021 = new int[4][105][105];

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "Lgd;")
    public static class40 field2026 = field2004;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lee;")
    public static class30 field2009 = null;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Lgd;")
    public static class40 field2020 = field2018;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Lsa;")
    private class108 field2019;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Z")
    public static boolean field2014;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BII)I", line = 3)
    public static final int method581(byte arg0, int arg1, int arg2) {
        field2017++;
        if (arg2 > arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        if (arg0 != 91) {
            method581((byte) 54, -110, 120);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)Lsa;", line = 33)
    public final class108 method582(boolean arg0) {
        if (arg0) {
            field2014 = false;
        }
        class108 var2 = this.field2019;
        field2028++;
        if (this.field2011 == var2) {
            this.field2019 = null;
            return null;
        } else {
            this.field2019 = var2.field2621;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILrb;)I", line = 57)
    public static final int method583(int arg0, class103 arg1) {
        field2016++;
        int var2 = arg0;
        if (arg1.method726(class22.field520, 102, class21.field487)) {
            var2 = arg0 + 1;
        }
        if (arg1.method726(class22.field520, 105, class90.field2037)) {
            var2++;
        }
        if (arg1.method726(class22.field520, 61, class34.field865)) {
            var2++;
        }
        if (arg1.method726(class22.field520, -125, class130.field3117)) {
            var2++;
        }
        if (arg1.method726(class22.field520, 58, class132.field3220)) {
            var2++;
        }
        if (arg1.method726(class22.field520, 44, class77.field1775)) {
            var2++;
        }
        if (arg1.method726(class22.field520, -70, class70.field1691)) {
            var2++;
        }
        if (arg1.method726(class22.field520, 45, class88.field1985)) {
            var2++;
        }
        if (arg1.method726(class22.field520, 63, class66.field1626)) {
            var2++;
        }
        if (arg1.method726(class22.field520, arg0 - 98, class112.field2690)) {
            var2++;
        }
        if (arg1.method726(class22.field520, arg0 - 79, class137.field3348)) {
            var2++;
        }
        if (arg1.method726(class22.field520, 64, class130.field3158)) {
            var2++;
        }
        if (arg1.method726(class22.field520, arg0 ^ 0x76, class67.field1640)) {
            var2++;
        }
        if (arg1.method726(class22.field520, 49, class9.field226)) {
            var2++;
        }
        if (arg1.method726(class22.field520, 69, class122.field2862)) {
            var2++;
        }
        if (arg1.method726(class22.field520, arg0 ^ 0x77, class48.field1217)) {
            var2++;
        }
        if (arg1.method726(class22.field520, 48, class63.field1538)) {
            var2++;
        }
        if (arg1.method726(class22.field520, 125, class93.field2134)) {
            var2++;
        }
        if (arg1.method726(class22.field520, arg0 + 85, class52.field1324)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 141)
    public static void method584(int arg0) {
        field2020 = null;
        field2026 = null;
        field2004 = null;
        field2018 = null;
        field2021 = null;
        field2009 = null;
        if (arg0 == 9) {
            field2007 = null;
            field2022 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V", line = 160)
    public final void method585(byte arg0) {
        field2023++;
        if (arg0 < 59) {
            return;
        }
        while (true) {
            class108 var2 = this.field2011.field2621;
            if (this.field2011 == var2) {
                return;
            }
            var2.method833(4);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z[B)[B", line = 181)
    public static final byte[] method586(boolean arg0, byte[] arg1) {
        if (!arg0) {
            method583(-125, null);
        }
        field2012++;
        class104 var2 = new class104(arg1);
        int var3 = var2.method798((byte) -112);
        int var4 = var2.method774(-29404);
        if (var4 < 0 || class91.field2079 != 0 && var4 > class91.field2079) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method791(var5, 0, var4, false);
            return var5;
        } else {
            int var6 = var2.method774(-29404);
            if (var6 < 0 || class91.field2079 != 0 && var6 > class91.field2079) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class105.method819(var7, var6, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var9) {
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V", line = 248)
    public static final void method587(int arg0) {
        field2006++;
        class115.field2775.method40((byte) -101);
        if (arg0 <= 68) {
            field2014 = false;
        }
        class67.field1650.method40((byte) -101);
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)Lsa;", line = 268)
    public final class108 method588(int arg0) {
        if (arg0 < 101) {
            field2004 = null;
        }
        class108 var2 = this.field2011.field2639;
        field2013++;
        if (this.field2011 == var2) {
            this.field2019 = null;
            return null;
        } else {
            this.field2019 = var2.field2639;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lsa;I)V", line = 293)
    public final void method589(class108 arg0, int arg1) {
        field2025++;
        if (arg0.field2639 != null) {
            arg0.method833(4);
        }
        arg0.field2639 = this.field2011.field2639;
        arg0.field2621 = this.field2011;
        arg0.field2639.field2621 = arg0;
        arg0.field2621.field2639 = arg0;
        int var3 = -2 / ((arg1 + 43) / 54);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILsa;Lsa;)V", line = 314)
    public final void method590(int arg0, class108 arg1, class108 arg2) {
        if (arg0 != 4) {
            return;
        }
        if (arg2.field2639 != null) {
            arg2.method833(4);
        }
        arg2.field2621 = arg1;
        arg2.field2639 = arg1.field2639;
        arg2.field2639.field2621 = arg2;
        field2015++;
        arg2.field2621.field2639 = arg2;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 401)
    public class89() {
        this.field2011.field2621 = this.field2011;
        this.field2011.field2639 = this.field2011;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lsa;I)V", line = 341)
    public final void method591(class108 arg0, int arg1) {
        field2005++;
        if (arg0.field2639 != null) {
            arg0.method833(4);
        }
        if (arg1 <= -52) {
            arg0.field2621 = this.field2011.field2621;
            arg0.field2639 = this.field2011;
            arg0.field2639.field2621 = arg0;
            arg0.field2621.field2639 = arg0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)Lsa;", line = 358)
    public final class108 method592(byte arg0) {
        class108 var2 = this.field2019;
        field2027++;
        if (this.field2011 == var2) {
            this.field2019 = null;
            return null;
        } else {
            this.field2019 = var2.field2639;
            int var3 = -22 / ((arg0 - 18) / 54);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Lsa;", line = 380)
    public final class108 method593(int arg0) {
        class108 var2 = this.field2011.field2621;
        field2024++;
        if (arg0 != 0) {
            this.method582(true);
        }
        if (this.field2011 == var2) {
            this.field2019 = null;
            return null;
        } else {
            this.field2019 = var2.field2621;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)Lsa;", line = 434)
    public final class108 method594(boolean arg0) {
        class108 var2 = this.field2011.field2621;
        field2003++;
        if (this.field2011 == var2) {
            return null;
        } else if (arg0) {
            var2.method833(4);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)Lsa;", line = 458)
    public final class108 method595(int arg0) {
        field2010++;
        class108 var2 = this.field2011.field2639;
        if (this.field2011 == var2) {
            return null;
        }
        var2.method833(4);
        if (arg0 != 105) {
            field2009 = null;
        }
        return var2;
    }
}
