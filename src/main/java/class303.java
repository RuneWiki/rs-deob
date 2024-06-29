import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class303 extends class401 {

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public int field4217;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public int field4207;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "[I")
    public static int[] field4214 = new int[13];

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I", line = 3)
    public final int method1842(int arg0) {
        if (arg0 != 6416) {
            field4214 = null;
        }
        field4212++;
        return this.field4217 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Z", line = 15)
    public final boolean method1843(int arg0) {
        if (arg0 == 1) {
            field4208++;
            return (this.field4217 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V", line = 26)
    public static void method1844(int arg0) {
        if (arg0 == -1402762891) {
            field4214 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)Z", line = 37)
    public final boolean method1845(int arg0) {
        field4216++;
        if (arg0 == -16891) {
            return (this.field4217 >> 21 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)I", line = 48)
    public static final int method1846(byte arg0, int arg1) {
        field4210++;
        return arg0 == 105 ? arg1 & 0xFF : 70;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Z", line = 62)
    public final boolean method1847(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method1850(12);
        }
        field4213++;
        return (this.field4217 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([Lin;II)V", line = 74)
    public static final void method1848(class78[] arg0, int arg1, int arg2) {
        field4209++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class78 var4 = arg0[var3];
            if (var4 != null && var4.field1178 == arg1 && !client.method1687(var4)) {
                if (var4.field1075 == 0) {
                    method1848(arg0, var4.field1129, 93);
                    if (var4.field1046 != null) {
                        method1848(var4.field1046, var4.field1129, 120);
                    }
                    class685 var5 = (class685) class4.field26.method970((byte) 89, (long) var4.field1129);
                    if (var5 != null) {
                        class22.method231(var5.field9776, (byte) -53);
                    }
                }
                if (var4.field1075 == 6 && var4.field1028 != -1) {
                    class403 var6 = class192.field2727.method3090(-97, var4.field1028);
                    if (var6 != null) {
                        var4.field1176 += class41.field479;
                        int var7 = var4.field1037;
                        while (var6.field5646[var4.field1037] < var4.field1176) {
                            var4.field1176 -= var6.field5646[var4.field1037];
                            var4.field1037++;
                            if (var4.field1037 >= var6.field5667.length) {
                                var4.field1037 -= var6.field5643;
                                if (var4.field1037 < 0 || var4.field1037 >= var6.field5667.length) {
                                    var4.field1037 = 0;
                                }
                            }
                            var4.field1045 = var4.field1037 + 1;
                            if (var4.field1045 >= var6.field5667.length) {
                                var4.field1045 -= var6.field5643;
                                if (var4.field1045 < 0 || var4.field1045 >= var6.field5667.length) {
                                    var4.field1045 = -1;
                                }
                            }
                            class26.method255(var4, -20229);
                        }
                        if (var4.field1037 != var7) {
                            class623.method3463(var6, var4.field1037, (byte) 36);
                        }
                    }
                }
            }
        }
        if (arg2 <= 27) {
            field4214 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)I", line = 168)
    public final int method1849(byte arg0) {
        if (arg0 == 66) {
            field4211++;
            return class214.method1374(this.field4217, false);
        } else {
            return 15;
        }
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)Z", line = 182)
    public final boolean method1850(int arg0) {
        field4215++;
        if (arg0 == 1) {
            return (this.field4217 >> 22 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(II)V", line = 197)
    public class303(int arg0, int arg1) {
        this.field4217 = arg0;
        this.field4207 = arg1;
    }
}
