import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class141 {

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    private int field2175 = 0;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Lfl;")
    private class86 field2172;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Lok;")
    public static class41 field2168 = class137.method956(":assist:", 45);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Llh;")
    private class59 field2169;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[[Z")
    public static boolean[][] field2173;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lbc;III)V", line = 13)
    public static final void method984(class302 arg0, int arg1, int arg2, int arg3) {
        if (~arg0.field4922 == arg3) {
            arg0.field4944 = arg0.field5030;
        } else if (arg0.field4922 == 1) {
            arg0.field4944 = (arg1 - arg0.field4936) / 2 + arg0.field5030;
        } else if (arg0.field4922 == 2) {
            arg0.field4944 = arg1 - arg0.field5030 - arg0.field4936;
        } else if (arg0.field4922 == 3) {
            arg0.field4944 = arg0.field5030 * arg1 >> 14;
        } else if (arg0.field4922 == 4) {
            arg0.field4944 = (arg0.field5030 * arg1 >> 14) + (arg1 - arg0.field4936) / 2;
        } else {
            arg0.field4944 = arg1 - arg0.field4936 - (arg0.field5030 * arg1 >> 14);
        }
        if (arg0.field4892 == 0) {
            arg0.field4953 = arg0.field5059;
        } else if (arg0.field4892 == 1) {
            arg0.field4953 = (arg2 - arg0.field4949) / 2 + arg0.field5059;
        } else if (arg0.field4892 == 2) {
            arg0.field4953 = arg2 - arg0.field5059 - arg0.field4949;
        } else if (arg0.field4892 == 3) {
            arg0.field4953 = arg0.field5059 * arg2 >> 14;
        } else if (arg0.field4892 == 4) {
            arg0.field4953 = (arg0.field5059 * arg2 >> 14) + (arg2 - arg0.field4949) / 2;
        } else {
            arg0.field4953 = arg2 - (arg0.field5059 * arg2 >> 14) - arg0.field4949;
        }
        field2171++;
        if (!class150.field2331 || !(client.method2119(arg0) != 0 || arg0.field4951 == 0)) {
            return;
        }
        if (arg0.field4944 < 0) {
            arg0.field4944 = 0;
        } else if ((arg0.field4944 + arg0.field4936) > arg1) {
            arg0.field4944 = arg1 - arg0.field4936;
        }
        if (arg0.field4953 < 0) {
            arg0.field4953 = 0;
        } else if (arg2 < arg0.field4953 + arg0.field4949) {
            arg0.field4953 = arg2 - arg0.field4949;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Lk;", line = 88)
    public static final class37 method985(int arg0, int arg1) {
        field2166++;
        if (arg1 > -111) {
            method984((class302) null, 122, -69, 99);
        }
        class37 var2 = (class37) class281.field4575.method554((long) arg0, 91);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class260.field4146.method454(11, 0, arg0);
        class37 var4 = new class37();
        if (var3 != null) {
            var4.method256(2, new class112(var3));
        }
        class281.field4575.method555((long) arg0, (byte) -127, var4);
        return var4;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 111)
    public static void method986(byte arg0) {
        field2168 = null;
        if (arg0 < -46) {
            field2173 = (boolean[][]) null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Llh;", line = 122)
    public final class59 method987(byte arg0) {
        this.field2175 = 0;
        int var2 = 49 % ((18 - arg0) / 58);
        field2174++;
        return this.method988(-6969);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Llh;", line = 137)
    public final class59 method988(int arg0) {
        field2167++;
        if (this.field2175 > 0 && this.field2172.field1252[this.field2175 - 1] != this.field2169) {
            class59 var2 = this.field2169;
            this.field2169 = var2.field841;
            return var2;
        } else if (arg0 == -6969) {
            class59 var3;
            do {
                if (this.field2172.field1265 <= this.field2175) {
                    return null;
                }
                var3 = this.field2172.field1252[this.field2175++].field841;
            } while (this.field2172.field1252[this.field2175 - 1] == var3);
            this.field2169 = var3.field841;
            return var3;
        } else {
            return (class59) null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V", line = 175)
    public static final void method989(byte arg0) {
        field2170++;
        int var1 = 48 / ((arg0 - 17) / 32);
        for (class125 var2 = (class125) class286.field4645.method1495(-312); var2 != null; var2 = (class125) class286.field4645.method1501(64)) {
            if (var2.field1866 > 0) {
                var2.field1866--;
            }
            if (var2.field1866 != 0) {
                if (var2.field1849 > 0) {
                    var2.field1849--;
                }
                if (var2.field1849 == 0 && var2.field1865 >= 1 && var2.field1867 >= 1 && var2.field1865 <= 102 && var2.field1867 <= 102 && (var2.field1853 < 0 || class237.method1701(var2.field1855, -12, var2.field1853))) {
                    class27.method175(var2.field1859, var2.field1860, var2.field1867, var2.field1854, 0, var2.field1865, var2.field1855, var2.field1853);
                    var2.field1849 = -1;
                    if (var2.field1853 == var2.field1850 && var2.field1850 == -1) {
                        var2.method418(6971);
                    } else if (var2.field1853 == var2.field1850 && var2.field1860 == var2.field1848 && var2.field1863 == var2.field1855) {
                        var2.method418(6971);
                    }
                }
            } else if (var2.field1850 < 0 || class237.method1701(var2.field1863, -12, var2.field1850)) {
                class27.method175(var2.field1859, var2.field1848, var2.field1867, var2.field1854, 0, var2.field1865, var2.field1863, var2.field1850);
                var2.method418(6971);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lfl;)V", line = 239)
    public class141(class86 arg0) {
        this.field2172 = arg0;
    }
}
