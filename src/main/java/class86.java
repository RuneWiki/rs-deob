import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class86 extends class137 {

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public int field2016;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    private int field2007;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "[[I")
    public int[][] field2017;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "[I")
    public int[] field2013;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "Z")
    public static boolean field2004 = false;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "Laf;")
    public static class7 field2006 = class48.method406(40, "(Y");

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "[I")
    public static int[] field2002 = new int[100];

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "Laf;")
    public static class7 field2011 = class48.method406(40, "Bitte geben Sie Ihren Benutzenamen ein)3");

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field2015 = 0;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "Laf;")
    public static class7 field2018 = class48.method406(40, "Hier wechseln");

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    public static int field2019 = 99;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "[I")
    public static int[] field2012 = new int[50];

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "Laf;")
    public static class7 field2020 = class48.method406(40, "<col=c0ff00>");

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "[I")
    public static int[] field2003;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "[I")
    public static int[] field2005;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static void method707(int arg0) {
        field2020 = null;
        field2006 = null;
        field2005 = null;
        field2002 = null;
        field2003 = null;
        field2011 = null;
        if (arg0 != -1641) {
            field2003 = null;
        }
        field2018 = null;
        field2012 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IJ)Laf;")
    public static final class7 method708(int arg0, long arg1) {
        field2009++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg0 > -26) {
                return null;
            }
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class141.field3325[(int) (var8 - arg1 * 37L)];
            }
            class7 var7 = new class7();
            var7.field162 = var6;
            var7.field139 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIILaf;)V")
    public static final void method709(int arg0, int arg1, int arg2, int arg3, class7 arg4) {
        field2008++;
        class103 var5 = class19.method177(arg0, (byte) -80, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2531 != null) {
            class39 var6 = new class39();
            var6.field967 = var5;
            var6.field981 = arg3;
            var6.field962 = var5.field2531;
            var6.field975 = arg4;
            class80.method675(-2001, var6);
        }
        if (arg1 != 236) {
            field2015 = 87;
        }
        boolean var7 = true;
        if (var5.field2512 > 0) {
            var7 = class116.method906((byte) 73, var5);
        }
        if (!var7 || !class32.method285(-67, class7.method98(arg1 + 26218, var5), arg3 - 1)) {
            return;
        }
        if (arg3 == 1) {
            class101.field2385++;
            class47.field1150.method1131(219, 2027385224);
            class47.field1150.method970((byte) -96, arg0);
            class47.field1150.method933((byte) 73, arg2);
        }
        if (arg3 == 2) {
            class47.field1150.method1131(228, 2027385224);
            class130.field3090++;
            class47.field1150.method970((byte) -96, arg0);
            class47.field1150.method933((byte) 97, arg2);
        }
        if (arg3 == 3) {
            class47.field1150.method1131(122, arg1 + 2027384988);
            class98.field2342++;
            class47.field1150.method970((byte) -96, arg0);
            class47.field1150.method933((byte) 66, arg2);
        }
        if (arg3 == 4) {
            class47.field1150.method1131(121, 2027385224);
            class52.field1265++;
            class47.field1150.method970((byte) -96, arg0);
            class47.field1150.method933((byte) 84, arg2);
        }
        if (arg3 == 5) {
            class89.field2060++;
            class47.field1150.method1131(149, 2027385224);
            class47.field1150.method970((byte) -96, arg0);
            class47.field1150.method933((byte) 107, arg2);
        }
        if (arg3 == 6) {
            class12.field312++;
            class47.field1150.method1131(83, 2027385224);
            class47.field1150.method970((byte) -96, arg0);
            class47.field1150.method933((byte) 91, arg2);
        }
        if (arg3 == 7) {
            class47.field1150.method1131(64, 2027385224);
            class47.field1150.method970((byte) -96, arg0);
            class47.field1150.method933((byte) 111, arg2);
            class99.field2364++;
        }
        if (arg3 == 8) {
            class130.field3074++;
            class47.field1150.method1131(250, 2027385224);
            class47.field1150.method970((byte) -96, arg0);
            class47.field1150.method933((byte) 107, arg2);
        }
        if (arg3 == 9) {
            class47.field1150.method1131(236, 2027385224);
            class52.field1244++;
            class47.field1150.method970((byte) -96, arg0);
            class47.field1150.method933((byte) 84, arg2);
        }
        if (arg3 == 10) {
            class47.field1150.method1131(98, 2027385224);
            class24.field641++;
            class47.field1150.method970((byte) -96, arg0);
            class47.field1150.method933((byte) 15, arg2);
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I[B)V")
    public class86(int arg0, byte[] arg1) {
        this.field2016 = arg0;
        class122 var3 = new class122(arg1);
        this.field2007 = var3.method931((byte) 124);
        this.field2017 = new int[this.field2007][];
        this.field2013 = new int[this.field2007];
        for (int var4 = 0; var4 < this.field2007; var4++) {
            this.field2013[var4] = var3.method931((byte) 124);
        }
        for (int var5 = 0; var5 < this.field2007; var5++) {
            this.field2017[var5] = new int[var3.method931((byte) 124)];
        }
        for (int var6 = 0; var6 < this.field2007; var6++) {
            for (int var7 = 0; var7 < this.field2017[var6].length; var7++) {
                this.field2017[var6][var7] = var3.method931((byte) 124);
            }
        }
    }
}
