import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class101 {

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Lph;")
    public static class229 field1732 = class266.method1858("Clientscript error in: ", 0);

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Lph;")
    public static class229 field1733 = class266.method1858(" )2> ", 0);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public int field1728;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "J")
    public long field1730;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Lrk;")
    public class216 field1726;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Lrk;")
    public class216 field1727;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Lrk;")
    public class216 field1729;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V", line = 9)
    public static void method774(boolean arg0) {
        field1732 = null;
        if (!arg0) {
            field1733 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I", line = 23)
    public static int method775(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)I", line = 36)
    public static final int method776(int arg0, int arg1) {
        field1720++;
        if (arg0 == 16711935) {
            return -1;
        } else {
            if (arg1 != 64) {
                field1732 = (class229) null;
            }
            return class282.method1939(false, arg0);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lsi;IBI)[Lka;", line = 57)
    public static final class293[] method777(class66 arg0, int arg1, byte arg2, int arg3) {
        field1723++;
        if (class176.method1264(arg3, (byte) 93, arg0, arg1)) {
            int var4 = -40 % ((arg2 + 63) / 36);
            return class273.method1893(-125);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 71)
    public static final void method778(byte arg0) {
        field1721++;
        if (arg0 != -88) {
            field1733 = (class229) null;
        }
        class218.field3591 = true;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLgi;)V", line = 102)
    public static final void method779(boolean arg0, class306 arg1) {
        field1722++;
        if (!arg0 || arg1.field5108 == 0) {
            return;
        }
        if (arg1.field5118 != -1 && arg1.field5118 < 32768) {
            class217 var2 = class187.field3035[arg1.field5118];
            if (var2 != null) {
                int var3 = arg1.field5147 - var2.field5147;
                int var4 = arg1.field5168 - var2.field5168;
                if (var3 != 0 || var4 != 0) {
                    arg1.field5163 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field5118 >= 32768) {
            int var5 = arg1.field5118 - 32768;
            if (class145.field2354 == var5) {
                var5 = 2047;
            }
            class209 var6 = class114.field1931[var5];
            if (var6 != null) {
                int var7 = arg1.field5147 - var6.field5147;
                int var8 = arg1.field5168 - var6.field5168;
                if (var7 != 0 || var8 != 0) {
                    arg1.field5163 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field5096 != 0 || arg1.field5167 != 0) && (arg1.field5171 == 0 || arg1.field5145 > 0)) {
            int var9 = arg1.field5147 - (((arg1.field5096 - class1.field9 - class1.field9) * 64) - ((arg1.method1457(0) - 1) * 64));
            int var10 = arg1.field5168 + (arg1.method1457(0) - 1) * 64 - (-class1.field1 + arg1.field5167 - class1.field1) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field5163 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field5096 = 0;
            arg1.field5167 = 0;
        }
        int var11 = arg1.field5163 - arg1.field5122 & 0x7FF;
        if (var11 == 0) {
            arg1.field5170 = 0;
            return;
        }
        arg1.field5170++;
        if (var11 <= 1024) {
            arg1.field5122 += arg1.field5108;
            boolean var12 = true;
            if (arg1.field5108 > var11 || (2048 - arg1.field5108) < var11) {
                var12 = false;
                arg1.field5122 = arg1.field5163;
            }
            if (arg1.field5153 == arg1.field5115 && (arg1.field5170 > 25 || var12)) {
                if (arg1.field5131 == -1) {
                    arg1.field5115 = arg1.field5142;
                } else {
                    arg1.field5115 = arg1.field5131;
                }
            }
        } else {
            arg1.field5122 -= arg1.field5108;
            boolean var13 = true;
            if (var11 < arg1.field5108 || (2048 - arg1.field5108) < var11) {
                arg1.field5122 = arg1.field5163;
                var13 = false;
            }
            if (arg1.field5153 == arg1.field5115 && (arg1.field5170 > 25 || var13)) {
                if (arg1.field5114 == -1) {
                    arg1.field5115 = arg1.field5142;
                } else {
                    arg1.field5115 = arg1.field5114;
                }
            }
        }
        arg1.field5122 &= 0x7FF;
    }
}
