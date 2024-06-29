import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class11 extends RuntimeException {

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "Ljava/lang/Throwable;")
    public Throwable field147;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "Ljava/lang/String;")
    public String field139;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field142 = 0;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "[I")
    public static int[] field141 = new int[1];

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field143 = 0;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)I", line = 3)
    public static final int method70(int arg0, int arg1) {
        field150++;
        if (arg1 < 106) {
            method72(-48, 76, 19);
        }
        return (arg0 & 0x3FFEC) >> 11;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIB)Lvb;", line = 17)
    public static final class130 method71(int arg0, int arg1, byte arg2) {
        field138++;
        class130 var3 = new class130();
        var3.field2009 = -1;
        var3.field2021 = -1;
        int var4 = -108 % ((arg2 - 47) / 63);
        var3.field2005 = arg0 + 5 + 1;
        var3.field2014 = arg1 + 6;
        var3.field2008 = new int[var3.field2005][var3.field2014];
        var3.method863(-92);
        return var3;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)B", line = 37)
    public static final byte method72(int arg0, int arg1, int arg2) {
        field145++;
        if (arg0 <= 103) {
            return -71;
        } else if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V", line = 57)
    public static final void method73(boolean arg0) {
        class33.field346.method1540(0);
        if (!arg0) {
            method72(-103, -85, -78);
        }
        field149++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V", line = 71)
    public static void method74(byte arg0) {
        if (arg0 >= 48) {
            field141 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 92)
    public class11(Throwable arg0, String arg1) {
        this.field147 = arg0;
        this.field139 = arg1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 101)
    public static final void method75(int arg0) {
        if (class24.field262 < 1024.0F) {
            class24.field262 = 1024.0F;
        }
        field146++;
        if (class24.field262 > 3072.0F) {
            class24.field262 = 3072.0F;
        }
        while (class382.field5792 >= 16384.0F) {
            class382.field5792 -= 16384.0F;
        }
        while (class382.field5792 < 0.0F) {
            class382.field5792 += 16384.0F;
        }
        int var1 = class48.field774 >> 7;
        int var2 = class366.field5598 >> 7;
        int var3 = class377.method2316(class366.field5598, false, class48.field774, class79.field1192);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && class30.field323 - 4 > var1 && var2 < (class182.field2661 - 4)) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class79.field1192;
                    if (var7 < 3 && class57.method347(var6, var5, true)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class489.field7212.field3584 != null && class489.field7212.field3584[var7] != null) {
                        var8 = (class489.field7212.field3584[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 - (class86.field1324[var7].method201(var5, var6) - var3);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        if (arg0 > -32) {
            method70(-104, 82);
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class378.field5767) {
            class378.field5767 += (var10 - class378.field5767) / 24;
        } else if (class378.field5767 > var10) {
            class378.field5767 += (var10 - class378.field5767) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZI)V", line = 190)
    public static final void method76(boolean arg0, int arg1) {
        field140++;
        if (class193.field2832 == arg1) {
            return;
        }
        if (class193.field2832 == 0) {
            class239.method1623((byte) 92);
        }
        if (arg1 == 40) {
            class104.method642(1);
        }
        if (arg1 != 40 && class500.field7361 != null) {
            class500.field7361.method2312(false);
            class500.field7361 = null;
        }
        if (class193.field2832 == 25 || class193.field2832 == 28) {
            class434.field6497.field7271 = 2;
            class434.field6498.field7271 = 2;
            class267.field3907.field7271 = 2;
            class159.field2353.field7271 = 2;
            class423.field6356.field7271 = 2;
            class495.field7325.field7271 = 2;
            client.field2847.field7271 = 2;
        }
        if (arg1 == 25 || arg1 == 28) {
            class119.field1797 = 0;
            class282.field4034 = 1;
            class37.field395 = 0;
            field143 = 0;
            class418.field6282 = 1;
            class307.method1935(true, -123);
            class434.field6497.field7271 = 1;
            class434.field6498.field7271 = 1;
            class267.field3907.field7271 = 1;
            class159.field2353.field7271 = 1;
            class423.field6356.field7271 = 1;
            class495.field7325.field7271 = 1;
            client.field2847.field7271 = 1;
        }
        if (arg1 == 25 || arg1 == 10) {
            class490.method2917(true);
        }
        if (arg1 == 5) {
            class437.method2630(-21330, class348.field5015, class6.field81);
        } else {
            class62.method367(false);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        boolean var3 = class193.field2832 == 5 || class193.field2832 == 10 || class193.field2832 == 28;
        if (var2 != var3) {
            if (var2) {
                class386.field5852 = class374.field5696;
                if (class426.field6401.field1018 == 0) {
                    class13.method84(false, 2);
                } else {
                    class211.method1480(1, 2, 0, class465.field6881, class426.field6401.field1018, class374.field5696, false);
                }
                class62.field949.method269((byte) 102, false);
            } else {
                class13.method84(false, 2);
                class62.field949.method269((byte) 89, true);
            }
        }
        if (arg0) {
            method72(-126, -123, 3);
        }
        if (arg1 == 25 || arg1 == 28 || arg1 == 40) {
            class348.field5015.method1054();
        }
        class193.field2832 = arg1;
    }
}
