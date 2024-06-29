import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class61 {

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public int field950;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "Lbd;")
    public static class162 field940 = class17.method142(0, ")4p=");

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "Lbd;")
    public static class162 field936 = class17.method142(0, "Abbrechen");

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Lbd;")
    public static class162 field942 = class17.method142(0, "");

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Lbd;")
    public static class162 field938 = class17.method142(0, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "Lbd;")
    public static class162 field947 = class17.method142(0, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Z")
    public static boolean field939 = false;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lrg;B)V", line = 5)
    public static final void method414(class301 arg0, byte arg1) {
        arg0.field5069 = false;
        if (arg0.field5064 != -1) {
            class142 var2 = class139.method1084(-92, arg0.field5064);
            if (var2 == null || var2.field2522 == null) {
                arg0.field5064 = -1;
            } else {
                arg0.field5027++;
                if (var2.field2522.length > arg0.field5041 && arg0.field5027 > var2.field2527[arg0.field5041]) {
                    arg0.field5027 = 1;
                    arg0.field5041++;
                    class229.method1638(class122.field2215 == arg0, var2, arg0.field5041, arg0.field5047, -648569400, arg0.field5013);
                }
                if (var2.field2522.length <= arg0.field5041) {
                    arg0.field5027 = 0;
                    arg0.field5041 = 0;
                    class229.method1638(class122.field2215 == arg0, var2, arg0.field5041, arg0.field5047, -648569400, arg0.field5013);
                }
            }
        }
        if (arg0.field5029 != -1 && class90.field1598 >= arg0.field5036) {
            int var3 = class297.method2038(-126, arg0.field5029).field674;
            if (var3 == -1) {
                arg0.field5029 = -1;
            } else {
                class142 var4 = class139.method1084(-107, var3);
                if (var4 == null || var4.field2522 == null) {
                    arg0.field5029 = -1;
                } else {
                    if (arg0.field5015 < 0) {
                        arg0.field5015 = 0;
                        class229.method1638(class122.field2215 == arg0, var4, 0, arg0.field5047, -648569400, arg0.field5013);
                    }
                    arg0.field5048++;
                    if (var4.field2522.length > arg0.field5015 && var4.field2527[arg0.field5015] < arg0.field5048) {
                        arg0.field5048 = 1;
                        arg0.field5015++;
                        class229.method1638(class122.field2215 == arg0, var4, arg0.field5015, arg0.field5047, -648569400, arg0.field5013);
                    }
                    if (var4.field2522.length <= arg0.field5015) {
                        arg0.field5029 = -1;
                    }
                }
            }
        }
        if (arg1 < 76) {
            field938 = (class162) null;
        }
        field945++;
        if (arg0.field5057 != -1 && arg0.field5040 <= 1) {
            class142 var5 = class139.method1084(-86, arg0.field5057);
            if (var5.field2542 == 1 && arg0.field5022 > 0 && class90.field1598 >= arg0.field5049 && arg0.field5063 < class90.field1598) {
                arg0.field5040 = 1;
                return;
            }
        }
        if (arg0.field5057 != -1 && arg0.field5040 == 0) {
            class142 var6 = class139.method1084(-113, arg0.field5057);
            if (var6 == null || var6.field2522 == null) {
                arg0.field5057 = -1;
            } else {
                arg0.field5061++;
                if (var6.field2522.length > arg0.field5023 && var6.field2527[arg0.field5023] < arg0.field5061) {
                    arg0.field5061 = 1;
                    arg0.field5023++;
                    class229.method1638(class122.field2215 == arg0, var6, arg0.field5023, arg0.field5047, -648569400, arg0.field5013);
                }
                if (var6.field2522.length <= arg0.field5023) {
                    arg0.field5023 -= var6.field2530;
                    arg0.field5028++;
                    if (arg0.field5028 >= var6.field2523) {
                        arg0.field5057 = -1;
                    } else if (arg0.field5023 >= 0 && var6.field2522.length > arg0.field5023) {
                        class229.method1638(class122.field2215 == arg0, var6, arg0.field5023, arg0.field5047, -648569400, arg0.field5013);
                    } else {
                        arg0.field5057 = -1;
                    }
                }
                arg0.field5069 = var6.field2526;
            }
        }
        if (arg0.field5040 > 0) {
            arg0.field5040--;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLob;)Z", line = 149)
    public static final boolean method415(byte arg0, class78 arg1) {
        field937++;
        if (arg1.field1313 == 205) {
            class82.field1433 = 250;
            return true;
        } else {
            return arg0 != -68;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 179)
    public static void method416(int arg0) {
        field936 = null;
        field940 = null;
        field938 = null;
        field942 = null;
        int var1 = 79 % ((arg0 - 7) / 57);
        field947 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V", line = 192)
    public static final void method417(int arg0, int arg1) {
        field948++;
        if (arg1 == -1) {
            return;
        }
        if (arg0 != 2) {
            method416(-109);
        }
        if (!class46.field730[arg1]) {
            return;
        }
        class231.field3865.method1144(arg1, -2);
        if (class95.field1739[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class95.field1739[arg1].length; var3++) {
            if (class95.field1739[arg1][var3] != null) {
                if (class95.field1739[arg1][var3].field1231 == 2) {
                    var2 = false;
                } else {
                    class95.field1739[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class95.field1739[arg1] = null;
        }
        class46.field730[arg1] = false;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 246)
    public static final void method418(byte arg0) {
        for (int var1 = -1; var1 < class171.field2966; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class123.field2233[var1];
            }
            class39 var3 = class270.field4520[var2];
            if (var3 != null) {
                class73.method529(var3, 124, var3.method293((byte) 25));
            }
        }
        field946++;
        if (arg0 <= 74) {
            field938 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)Lob;", line = 282)
    public static final class78 method419(byte arg0, int arg1) {
        field949++;
        int var2 = arg1 & 0xFFFF;
        if (arg0 != 28) {
            return (class78) null;
        }
        int var3 = arg1 >> 16;
        if (class95.field1739[var3] == null || class95.field1739[var3][var2] == null) {
            boolean var4 = class12.method104(var3, arg0 ^ 0x220DCBCC);
            if (!var4) {
                return null;
            }
        }
        return class95.field1739[var3][var2];
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V", line = 331)
    public class61() {
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lqk;)V", line = 333)
    public class61(class61 arg0) {
        this.field941 = arg0.field941;
        this.field944 = arg0.field944;
        this.field943 = arg0.field943;
        this.field950 = arg0.field950;
    }
}
