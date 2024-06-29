import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class283 {

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "Lnt;")
    public static class220 field4025 = new class220();

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "Lkg;")
    public static class271 field4027 = new class271("", 11);

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "[Lkr;")
    public static class743[] field4028;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)I", line = 7)
    public static final int method1845(int arg0, int arg1) {
        field4026++;
        return arg1 == 2 ? arg0 >>> 7 : -93;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([BB)V", line = 19)
    public static final synchronized void method1846(byte[] arg0, byte arg1) {
        field4024++;
        if (arg0.length == 100 && class530.field7512 < 1000) {
            class423.field5924[class530.field7512++] = arg0;
        } else if (arg0.length == 5000 && class280.field3931 < 250) {
            class604.field8783[class280.field3931++] = arg0;
        } else {
            if (arg1 != 119) {
                method1846(null, (byte) -9);
            }
            if (arg0.length == 30000 && class128.field1936 < 50) {
                class76.field1422[class128.field1936++] = arg0;
            } else if (class679.field9566 != null) {
                for (int var2 = 0; var2 < class87.field1577.length; var2++) {
                    if (class87.field1577[var2] == arg0.length && class281.field4007[var2] < class679.field9566[var2].length) {
                        class679.field9566[var2][class281.field4007[var2]++] = arg0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 69)
    public static void method1847(int arg0) {
        field4028 = null;
        if (arg0 > -104) {
            method1845(-8, 13);
        }
        field4027 = null;
        field4025 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 81)
    public static final void method1848(String arg0, byte arg1) {
        class541.method3185("", "", arg0, 0, 0, 6642, "");
        int var2 = -94 % ((arg1 - 24) / 62);
        field4021++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)Z", line = 91)
    public static final boolean method1849(int arg0, byte arg1) {
        field4023++;
        if (arg1 >= -32) {
            field4027 = null;
        }
        return arg0 == 1 || arg0 == 3 || arg0 == 5;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BII)I", line = 108)
    public static final int method1850(byte arg0, int arg1, int arg2) {
        field4020++;
        if (arg1 == -2) {
            return 12345678;
        }
        int var3 = 104 / ((arg0 - 31) / 47);
        if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        }
        int var4 = (arg1 & 0x7F) * arg2 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg1 & 0xFF80) + var4;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)[B", line = 145)
    public static final synchronized byte[] method1851(byte arg0, int arg1) {
        field4022++;
        if (arg0 != -7) {
            return null;
        } else if (arg1 == 100 && class530.field7512 > 0) {
            byte[] var2 = class423.field5924[--class530.field7512];
            class423.field5924[class530.field7512] = null;
            return var2;
        } else if (arg1 == 5000 && class280.field3931 > 0) {
            byte[] var3 = class604.field8783[--class280.field3931];
            class604.field8783[class280.field3931] = null;
            return var3;
        } else if (arg1 == 30000 && class128.field1936 > 0) {
            byte[] var4 = class76.field1422[--class128.field1936];
            class76.field1422[class128.field1936] = null;
            return var4;
        } else {
            if (class679.field9566 != null) {
                for (int var5 = 0; var5 < class87.field1577.length; var5++) {
                    if (class87.field1577[var5] == arg1 && class281.field4007[var5] > 0) {
                        byte[] var6 = class679.field9566[var5][--class281.field4007[var5]];
                        class679.field9566[var5][class281.field4007[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }
}
