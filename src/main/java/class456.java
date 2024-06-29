import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class456 extends class189 {

    @OriginalMember(owner = "client!iga", name = "n", descriptor = "Ljava/lang/String;")
    public String field6436;

    @OriginalMember(owner = "client!iga", name = "o", descriptor = "S")
    public static short field6437 = 1;

    @OriginalMember(owner = "client!iga", name = "q", descriptor = "Lg;")
    public static class153 field6439 = new class153(4, 1);

    @OriginalMember(owner = "client!iga", name = "k", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!iga", name = "l", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!iga", name = "m", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!iga", name = "p", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!iga", name = "j", descriptor = "Lfp;")
    public static class323 field6432;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZI)V")
    public static final void method2709(boolean arg0, int arg1) {
        field6438++;
        class714 var2 = class668.field9073;
        synchronized (class668.field9073) {
            class668.field9073.method4016(arg1, (byte) -73);
        }
        class714 var3 = class90.field1079;
        synchronized (class90.field1079) {
            class90.field1079.method4016(arg1, (byte) -73);
        }
        if (!arg0) {
            field6432 = null;
        }
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(B)V")
    public static void method2710(byte arg0) {
        if (arg0 != -22) {
            field6439 = null;
        }
        field6432 = null;
        field6439 = null;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method2711(long arg0, int arg1) {
        field6435++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            if (arg1 != -2787) {
                return null;
            }
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class138.field2006[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZBLkd;)V")
    public static final void method2712(boolean arg0, byte arg1, class280 arg2) {
        field6433++;
        if (class25.field341 >= 400) {
            return;
        }
        if (class660.field9039 != arg2) {
            if (arg1 <= 106) {
                method2711(94L, 86);
            }
            String var3;
            if (arg2.field3950 == 0) {
                boolean var4 = true;
                if (class660.field9039.field3974 != -1 && arg2.field3974 != -1) {
                    int var5 = arg2.field3954 < class660.field9039.field3954 ? class660.field9039.field3954 : arg2.field3954;
                    int var6 = arg2.field3974 > class660.field9039.field3974 ? class660.field9039.field3974 : arg2.field3974;
                    int var7 = var5 * 10 / 100 + var6 + 5;
                    int var8 = class660.field9039.field3954 - arg2.field3954;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var8 > var7) {
                        var4 = false;
                    }
                }
                String var9 = class724.field10102 == class633.field8733 ? class71.field926.method588((byte) 93, class549.field7669) : class71.field924.method588((byte) 106, class549.field7669);
                if (arg2.field3954 < arg2.field3982) {
                    var3 = arg2.method1842(-105, true) + (var4 ? class414.method2546(-29507, class660.field9039.field3954, arg2.field3954) : "<col=ffffff>") + " (" + var9 + arg2.field3954 + "+" + (arg2.field3982 - arg2.field3954) + ")";
                } else {
                    var3 = arg2.method1842(-42, true) + (var4 ? class414.method2546(-29507, class660.field9039.field3954, arg2.field3954) : "<col=ffffff>") + " (" + var9 + arg2.field3954 + ")";
                }
            } else if (arg2.field3950 == -1) {
                var3 = arg2.method1842(-91, true);
            } else {
                var3 = arg2.method1842(-65, true) + " (" + class71.field925.method588((byte) 119, class549.field7669) + arg2.field3950 + ")";
            }
            if (class124.field1491 && !arg0 && (class351.field4969 & 0x8) != 0) {
                class635.method3531(false, 0, -1, class291.field4101, false, class580.field8185, true, 2, (long) arg2.field7958, (long) arg2.field7958, class701.field9774 + " -> <col=ffffff>" + var3, 0, 0);
                class67.field822++;
            }
            if (arg0) {
                class635.method3531(true, 0, 0, "<col=cccccc>" + var3, false, -1, false, -1, (long) arg2.field7958, 0L, "", 0, 0);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class393.field5577[var10] != null) {
                        short var12 = 0;
                        if (class633.field8733 == class556.field7800 && class393.field5577[var10].equalsIgnoreCase(class71.field919.method588((byte) 118, class549.field7669))) {
                            if (arg2.field3954 > class660.field9039.field3954) {
                                var12 = 2000;
                            }
                            if (class660.field9039.field3987 != 0 && arg2.field3987 != 0) {
                                if (class660.field9039.field3987 == arg2.field3987) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class67.field815[var10]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class565.field8019[var10] + var12);
                        int var14 = class349.field4947[var10] == -1 ? class405.field5738 : class349.field4947[var10];
                        class635.method3531(false, 0, -1, class393.field5577[var10], false, var14, true, var13, (long) arg2.field7958, (long) arg2.field7958, "<col=ffffff>" + var3, 0, 0);
                        class598.field8402++;
                    }
                }
            }
            if (!arg0) {
                for (class37 var11 = (class37) class215.field2820.method2765(-12261); var11 != null; var11 = (class37) class215.field2820.method2759(-15361)) {
                    if (var11.field463 == 21) {
                        var11.field467 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class124.field1491 && (class351.field4969 & 0x10) != 0) {
            class635.method3531(false, 0, -1, class291.field4101, false, class580.field8185, true, 19, (long) arg2.field7958, 0L, class701.field9774 + " -> <col=ffffff>" + class71.field933.method588((byte) 102, class549.field7669), 0, 0);
            class28.field369++;
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(IB)Z")
    public static final boolean method2713(int arg0, byte arg1) {
        if (arg1 > -84) {
            method2713(-91, (byte) -99);
        }
        field6434++;
        return arg0 == 4 || arg0 == 8 || arg0 == 11;
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "()V")
    public class456() {
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class456(String arg0, int arg1) {
        this.field6436 = arg0;
    }
}
