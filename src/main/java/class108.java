import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class108 {

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    private int field2018 = -1;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    private int field2019 = 0;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Laa;")
    private class39 field2013 = new class39();

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "Z")
    public boolean field2028 = false;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    private int field2025;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "[[[I")
    private int[][][] field2027;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    private int field2005;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "[Llh;")
    private class51[] field2017;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Lha;")
    public static class46 field2009 = class271.method1828(" ", -46);

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Lha;")
    public static class46 field2021 = class271.method1828(")4a=", -46);

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "[I")
    public static int[] field2008 = new int[200];

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "[[B")
    public static byte[][] field2023 = new byte[250][];

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lpi;")
    public static class181 field2022;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "[Lhh;")
    public static class263[] field2011;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "[S")
    public static short[] field2010;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLha;)I")
    public static final int method838(byte arg0, class46 arg1) {
        if (arg0 != -83) {
            method841(-117, -89, -52);
        }
        field2024++;
        for (int var2 = 0; var2 < class131.field2404.length; var2++) {
            if (class131.field2404[var2].method315((byte) -38, arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public final void method839(byte arg0) {
        for (int var2 = 0; var2 < this.field2025; var2++) {
            this.field2027[var2][0] = null;
            this.field2027[var2][1] = null;
            this.field2027[var2][2] = null;
            this.field2027[var2] = null;
        }
        if (arg0 >= -111) {
            field2009 = null;
        }
        this.field2027 = null;
        this.field2017 = null;
        field2006++;
        this.field2013.method266(5);
        this.field2013 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIZIILpi;)V")
    public static final void method840(int arg0, int arg1, boolean arg2, int arg3, int arg4, class181 arg5) {
        class217.field3838 = 10000;
        class206.field3697 = arg2;
        field2012++;
        class118.field2202 = arg3;
        class111.field2110 = arg5;
        class83.field1600 = arg0;
        class76.field1427 = arg1;
        class109.field2032 = arg4;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)Lhi;")
    public static final class24 method841(int arg0, int arg1, int arg2) {
        field2015++;
        class24 var3 = class13.method73(arg2 ^ 0xA634328F, arg0);
        if (arg1 == arg2) {
            return var3;
        } else if (var3 == null || var3.field503 == null || var3.field503.length <= arg1) {
            return null;
        } else {
            return var3.field503[arg1];
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
    public static final void method842(boolean arg0) {
        if (arg0) {
            field2021 = null;
        }
        class29.field575.method84(-32377);
        field2020++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)[[I")
    public final int[][] method843(byte arg0, int arg1) {
        field2026++;
        if (arg0 != -25) {
            method841(75, 71, 57);
        }
        if (this.field2025 == this.field2005) {
            this.field2028 = this.field2017[arg1] == null;
            this.field2017[arg1] = class177.field3178;
            return this.field2027[arg1];
        } else if (this.field2025 == 1) {
            this.field2028 = this.field2018 != arg1;
            this.field2018 = arg1;
            return this.field2027[0];
        } else {
            class51 var3 = this.field2017[arg1];
            if (var3 == null) {
                this.field2028 = true;
                if (this.field2025 > this.field2019) {
                    var3 = new class51(arg1, this.field2019);
                    this.field2019++;
                } else {
                    class51 var4 = (class51) this.field2013.method262((byte) 123);
                    var3 = new class51(arg1, var4.field886);
                    this.field2017[var4.field885] = null;
                    var4.method501(arg0 ^ 0xFFFFFFE7);
                }
                this.field2017[arg1] = var3;
            } else {
                this.field2028 = false;
            }
            this.field2013.method268((byte) -68, var3);
            return this.field2027[var3.field886];
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method844(int arg0) {
        field2016++;
        if (this.field2025 != this.field2005) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field2025; var2++) {
            this.field2017[var2] = class177.field3178;
        }
        return this.field2027;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V")
    public static void method845(boolean arg0) {
        if (!arg0) {
            method846(94, 43);
        }
        field2009 = null;
        field2022 = null;
        field2011 = null;
        field2010 = null;
        field2021 = null;
        field2023 = null;
        field2008 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
    public static final void method846(int arg0, int arg1) {
        class193.field3462.method81((byte) 30, arg0);
        field2014++;
        if (arg1 != 0) {
            method840(-61, -2, true, 97, 114, (class181) null);
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(III)V")
    public class108(int arg0, int arg1, int arg2) {
        this.field2025 = arg0;
        this.field2027 = new int[this.field2025][3][arg2];
        this.field2005 = arg1;
        this.field2017 = new class51[this.field2005];
    }
}
