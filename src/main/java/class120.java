import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class120 extends class80 {

    @OriginalMember(owner = "client!je", name = "r", descriptor = "[I")
    public static int[] field2008 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!je", name = "x", descriptor = "Z")
    public static boolean field2014 = false;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "Z")
    public static boolean field2017 = true;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "I")
    public static int field2029 = 0;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public int field2005;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public int field2010;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public int field2011;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public int field2013;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    public int field2015;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    public int field2016;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    public int field2019;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "I")
    public int field2021;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "I")
    public int field2023;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "I")
    public int field2024;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "I")
    public int field2025;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    public int field2030;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Lac;")
    public class144 field2002;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "Lqd;")
    public class182 field2020;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Lcf;")
    public class184 field2007;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lqi;")
    public class245 field2004;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "Lrl;")
    public static class327 field2027;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)Lrl;", line = 4)
    public static final class327 method897(boolean arg0) {
        if (arg0) {
            method898(-68);
        }
        field2022++;
        int var1 = class36.field597[0] * class288.field4729[0];
        byte[] var2 = class279.field4623[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class314.field5346[class243.method1696(var2[var4], 255)];
        }
        class327 var5 = new class327(class266.field4486, class48.field713, class303.field5064[0], class27.field387[0], class36.field597[0], class288.field4729[0], var3);
        class214.method1517(-25672);
        return var5;
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V", line = 31)
    public static void method898(int arg0) {
        field2008 = null;
        if (arg0 != 0) {
            field2029 = 7;
        }
        field2027 = null;
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V", line = 54)
    public final void method899(int arg0) {
        if (arg0 != 0) {
            this.field2011 = -127;
        }
        this.field2002 = null;
        field2028++;
        this.field2004 = null;
        this.field2007 = null;
        this.field2020 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIII)V", line = 96)
    public static final void method900(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2006++;
        class281 var5 = class135.method957(arg0 ^ 0xA, arg3, arg0);
        var5.method1932(0);
        var5.field4652 = arg1;
        var5.field4660 = arg4;
        var5.field4657 = arg2;
    }
}
