import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class122 extends class167 {

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "Le;")
    private class191 field2013 = class1.field18;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "Le;")
    private static class191 field2010 = class54.method368("Loading textures )2 ", 2047);

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    public static int field2011 = -1;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    public static int field2015 = 0;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    public static int field2014 = 2;

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "Le;")
    public static class191 field2023 = field2010;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
    public static int field2019 = 5063219;

    @OriginalMember(owner = "client!dj", name = "cb", descriptor = "I")
    public static int field2027 = 1;

    @OriginalMember(owner = "client!dj", name = "eb", descriptor = "Lpj;")
    public static class47 field2029 = new class47();

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "I")
    private int field2016;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!dj", name = "bb", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!dj", name = "db", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!dj", name = "fb", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "Lwd;")
    public class97 field2022;

    @OriginalMember(owner = "client!dj", name = "gb", descriptor = "Lwd;")
    private class97 field2031;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)Z")
    public final boolean method829(byte arg0, int arg1) {
        field2026++;
        if (this.field2022 == null) {
            return false;
        }
        if (this.field2031 == null) {
            this.method837(31);
        }
        class115 var3 = (class115) this.field2031.method612((long) arg1, true);
        if (var3 == null) {
            return false;
        } else {
            if (arg0 != -41) {
                this.field2031 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(II)I")
    public final int method830(int arg0, int arg1) {
        if (arg1 != -12572) {
            this.method834(-61);
        }
        field2017++;
        if (this.field2022 == null) {
            return this.field2016;
        } else {
            class115 var3 = (class115) this.field2022.method612((long) arg0, true);
            return var3 == null ? this.field2016 : var3.field1896;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
    public static void method831(byte arg0) {
        field2010 = null;
        field2023 = null;
        field2029 = null;
        if (arg0 != 74) {
            method831((byte) 108);
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(II)Le;")
    public final class191 method832(int arg0, int arg1) {
        field2024++;
        if (this.field2022 == null) {
            return this.field2013;
        } else {
            int var3 = -16 % ((80 - arg1) / 41);
            class166 var4 = (class166) this.field2022.method612((long) arg0, true);
            return var4 == null ? this.field2013 : var4.field2810;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILji;)V")
    private final void method833(int arg0, int arg1, class225 arg2) {
        if (arg0 == arg1) {
            this.field2009 = arg2.method1580(-2);
        } else if (arg1 == 2) {
            this.field2012 = arg2.method1580(-104);
        } else if (arg1 == 3) {
            this.field2013 = arg2.method1596((byte) 102);
        } else if (arg1 == 4) {
            this.field2016 = arg2.method1562(21705);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method1593(true);
            this.field2022 = new class97(class10.method71(var4, -480947516));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1562(21705);
                class104 var7;
                if (arg1 == 5) {
                    var7 = new class166(arg2.method1596((byte) 112));
                } else {
                    var7 = new class115(arg2.method1562(21705));
                }
                this.field2022.method605((long) var6, -3, var7);
            }
        }
        field2025++;
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)V")
    private final void method834(int arg0) {
        field2030++;
        this.field2031 = new class97(this.field2022.method614(0));
        for (class166 var2 = (class166) this.field2022.method609(false); var2 != null; var2 = (class166) this.field2022.method610(77)) {
            class118 var3 = new class118(var2.field2810, (int) var2.field1713);
            this.field2031.method605(var2.field2810.method1329((byte) 118), -3, var3);
        }
        if (arg0 <= 58) {
            field2010 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(BLe;)Z")
    public final boolean method835(byte arg0, class191 arg1) {
        field2021++;
        if (this.field2022 == null) {
            return false;
        }
        if (this.field2031 == null) {
            this.method834(77);
        }
        class118 var3 = (class118) this.field2031.method612(arg1.method1329((byte) 118), true);
        int var4 = -100 / ((arg0 - 6) / 59);
        while (var3 != null) {
            if (var3.field1942.method1317(-27518, arg1)) {
                return true;
            }
            var3 = (class118) this.field2031.method608((byte) 77);
        }
        return false;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lji;Z)V")
    public final void method836(class225 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method1580(-11);
            if (var3 == 0) {
                field2028++;
                return;
            }
            this.method833(1, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "(I)V")
    private final void method837(int arg0) {
        field2018++;
        this.field2031 = new class97(this.field2022.method614(0));
        int var2 = 51 % ((arg0 + 10) / 34);
        for (class115 var3 = (class115) this.field2022.method609(false); var3 != null; var3 = (class115) this.field2022.method610(88)) {
            class115 var4 = new class115((int) var3.field1713);
            this.field2031.method605((long) var3.field1896, -3, var4);
        }
    }
}
