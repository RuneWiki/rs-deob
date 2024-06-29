import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class108 extends class30 {

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "Lrd;")
    private class173 field2007 = class125.field2349;

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "Lrd;")
    public static class173 field2013 = class133.method843("oberen Rand der Webseite ausw-=hlen)3", 34);

    @OriginalMember(owner = "client!ki", name = "ab", descriptor = "Lrd;")
    public static class173 field2022 = class133.method843("rect_debug=", 70);

    @OriginalMember(owner = "client!ki", name = "V", descriptor = "Lof;")
    public static class145 field2017 = new class145();

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
    private int field2008;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!ki", name = "W", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!ki", name = "X", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!ki", name = "Y", descriptor = "I")
    public int field2020;

    @OriginalMember(owner = "client!ki", name = "Z", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!ki", name = "bb", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!ki", name = "cb", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "Llc;")
    private class112 field2009;

    @OriginalMember(owner = "client!ki", name = "U", descriptor = "La;")
    public static class1 field2016;

    @OriginalMember(owner = "client!ki", name = "db", descriptor = "[[[I")
    public static int[][][] field2025;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lmb;II)V")
    private final void method657(class121 arg0, int arg1, int arg2) {
        if (arg1 != -6) {
            return;
        }
        field2021++;
        if (arg2 == 1) {
            this.field2018 = arg0.method751((byte) -87);
        } else if (arg2 == 2) {
            this.field2020 = arg0.method751((byte) 96);
        } else if (arg2 == 3) {
            this.field2007 = arg0.method746(-19941);
        } else if (arg2 == 4) {
            this.field2008 = arg0.method776(-122);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method755((byte) -122);
            this.field2009 = new class112(class144.method907(var4, -61));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method776(arg1 ^ 0x2D);
                class129 var7;
                if (arg2 == 5) {
                    var7 = new class175(arg0.method746(arg1 ^ 0x4DE1));
                } else {
                    var7 = new class76(arg0.method776(-76));
                }
                this.field2009.method675((long) var6, var7, false);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(B)V")
    public static void method658(byte arg0) {
        if (arg0 < 67) {
            field2017 = null;
        }
        field2016 = null;
        field2013 = null;
        field2017 = null;
        field2025 = null;
        field2022 = null;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)Lrd;")
    public final class173 method659(int arg0, int arg1) {
        field2010++;
        if (this.field2009 == null) {
            return this.field2007;
        }
        if (arg1 >= -1) {
            this.method661(121, 86);
        }
        class175 var3 = (class175) this.field2009.method677(-2755, (long) arg0);
        return var3 == null ? this.field2007 : var3.field3445;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIB)I")
    public static final int method660(int arg0, int arg1, byte arg2) {
        field2012++;
        if (arg2 == -30) {
            int var3 = arg1 >>> 31;
            return (arg1 + var3) / arg0 - var3;
        } else {
            return -88;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(II)I")
    public final int method661(int arg0, int arg1) {
        field2014++;
        if (this.field2009 == null) {
            return this.field2008;
        }
        if (arg0 != -104) {
            this.field2008 = 15;
        }
        class76 var3 = (class76) this.field2009.method677(-2755, (long) arg1);
        return var3 == null ? this.field2008 : var3.field1495;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILmb;)V")
    public final void method662(int arg0, class121 arg1) {
        field2015++;
        if (arg0 != -6979) {
            return;
        }
        while (true) {
            int var3 = arg1.method751((byte) 104);
            if (var3 == 0) {
                return;
            }
            this.method657(arg1, -6, var3);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[Lrh;[BIIII)V")
    public static final void method663(int arg0, class177[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field2011++;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg3 + var12 > 0 && arg3 + var12 < 103 && arg5 + var13 > 0 && arg5 + var13 < 103) {
                        arg1[var7].field3474[arg3 + var12][arg5 + var13] = class209.method1383(arg1[var7].field3474[arg3 + var12][arg5 + var13], -16777217);
                    }
                }
            }
        }
        class121 var8 = new class121(arg2);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class62.method398(arg3 + var10, 0, arg4, 0, var9, arg6, var8, arg5 + var11);
                }
            }
        }
        if (arg0 != 103) {
            method664(false, 17);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)V")
    public static final void method664(boolean arg0, int arg1) {
        field2006++;
        if (class99.field1809 == null) {
            return;
        }
        try {
            class121 var2 = new class121(4);
            var2.method752(arg0 ? 2 : 3, (byte) -128);
            var2.method740(arg1, (byte) -91);
            class99.field1809.method1097(0, var2.field2218, 4, (byte) -84);
        } catch (IOException var4) {
            try {
                class99.field1809.method1095((byte) 127);
            } catch (Exception var3) {
            }
            class99.field1809 = null;
            class125.field2361++;
        }
    }
}
