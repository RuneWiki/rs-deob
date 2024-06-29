import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class52 extends class178 {

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "Z")
    public boolean field1041 = false;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    private int field1047 = 128;

    @OriginalMember(owner = "client!eg", name = "cb", descriptor = "I")
    private int field1055 = 128;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "I")
    private int field1050 = 0;

    @OriginalMember(owner = "client!eg", name = "jb", descriptor = "I")
    public int field1062 = -1;

    @OriginalMember(owner = "client!eg", name = "ib", descriptor = "I")
    private int field1061 = 0;

    @OriginalMember(owner = "client!eg", name = "hb", descriptor = "I")
    private int field1060 = 0;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "Loc;")
    public static class151 field1043 = class137.method873(2, "b12_full");

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "Loc;")
    public static class151 field1052 = class137.method873(2, "Bitte geben Sie Ihren Benutzernamen ein)3");

    @OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
    public static int field1054 = 0;

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "Loc;")
    public static class151 field1053 = class137.method873(2, "<col=ff9040>");

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "Z")
    public static boolean field1046 = false;

    @OriginalMember(owner = "client!eg", name = "eb", descriptor = "Loc;")
    private static class151 field1057 = class137.method873(2, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "Loc;")
    public static class151 field1048 = field1057;

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!eg", name = "db", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!eg", name = "gb", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "[S")
    private short[] field1039;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "[S")
    private short[] field1040;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "[S")
    private short[] field1042;

    @OriginalMember(owner = "client!eg", name = "fb", descriptor = "[S")
    private short[] field1058;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILwa;I)V")
    private final void method357(int arg0, class229 arg1, int arg2) {
        if (arg2 <= 34) {
            field1043 = null;
        }
        field1044++;
        if (arg0 == 1) {
            this.field1049 = arg1.method1490((byte) 73);
        } else if (arg0 == 2) {
            this.field1062 = arg1.method1490((byte) 73);
        } else if (arg0 == 4) {
            this.field1047 = arg1.method1490((byte) 73);
        } else if (arg0 == 5) {
            this.field1055 = arg1.method1490((byte) 73);
        } else if (arg0 == 6) {
            this.field1050 = arg1.method1490((byte) 73);
        } else if (arg0 == 7) {
            this.field1061 = arg1.method1475(255);
        } else if (arg0 == 8) {
            this.field1060 = arg1.method1475(255);
        } else if (arg0 == 9) {
            this.field1041 = true;
        } else if (arg0 == 40) {
            int var4 = arg1.method1475(255);
            this.field1040 = new short[var4];
            this.field1042 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1042[var5] = (short) arg1.method1490((byte) 73);
                this.field1040[var5] = (short) arg1.method1490((byte) 73);
            }
            return;
        } else if (arg0 == 41) {
            int var6 = arg1.method1475(255);
            this.field1039 = new short[var6];
            this.field1058 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1039[var7] = (short) arg1.method1490((byte) 73);
                this.field1058[var7] = (short) arg1.method1490((byte) 73);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(B)V")
    public static void method358(byte arg0) {
        field1052 = null;
        field1048 = null;
        field1043 = null;
        field1053 = null;
        field1057 = null;
        int var1 = 48 / ((arg0 + 17) / 56);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZI)Lbf;")
    public final class18 method359(boolean arg0, int arg1) {
        class18 var3 = (class18) class69.field1365.method1028((long) this.field1059, arg0);
        field1038++;
        if (var3 == null) {
            class10 var4 = class10.method67(class179.field3238, this.field1049, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field1042 != null) {
                for (int var5 = 0; var5 < this.field1042.length; var5++) {
                    var4.method76(this.field1042[var5], this.field1040[var5]);
                }
            }
            if (this.field1039 != null) {
                for (int var6 = 0; var6 < this.field1039.length; var6++) {
                    var4.method66(this.field1039[var6], this.field1058[var6]);
                }
            }
            var3 = var4.method58(this.field1061 + 64, this.field1060 + 850, -30, -50, -30);
            class69.field1365.method1025(var3, false, (long) this.field1059);
        }
        class18 var7;
        if (this.field1062 == -1 || arg1 == -1) {
            var7 = var3.method147(true);
        } else {
            var7 = class197.method1233(116, this.field1062).method690(arg1, (byte) 90, var3);
        }
        if (this.field1047 != 128 || this.field1055 != 128) {
            var7.method163(this.field1047, this.field1055, this.field1047);
        }
        if (this.field1050 != 0) {
            if (this.field1050 == 90) {
                var7.method155();
            }
            if (this.field1050 == 180) {
                var7.method152();
            }
            if (this.field1050 == 270) {
                var7.method156();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILwd;BI)V")
    public static final void method360(int arg0, class232 arg1, byte arg2, int arg3) {
        field1045++;
        if (client.field693 != 0 && client.field693 != 3) {
            return;
        }
        int var4 = arg0 - arg1.field4216 / 2;
        int var5 = arg3 - arg1.field4215 / 2;
        int var6 = class94.field1761 + class121.field2178 & 0x7FF;
        int var7 = class61.field1208[var6];
        int var8 = class61.field1191[var6];
        int var9 = (class151.field2693 + 256) * var8 >> 8;
        int var10 = (class151.field2693 + 256) * var7 >> 8;
        int var11 = var4 * var9 + var5 * var10 >> 11;
        int var12 = class228.field3975.field3976 + var11 >> 7;
        int var13 = var4 * var10 - var5 * var9 >> 11;
        int var14 = class228.field3975.field4029 - var13 >> 7;
        if (arg2 != -45) {
            field1053 = null;
        }
        boolean var15 = class225.method1414(-98, 0, 0, var14, true, 0, 0, 1, var12, class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
        if (!var15) {
            return;
        }
        class48.field984.method1447(-1, var5);
        class48.field984.method1447(-1, var4);
        class48.field984.method1463(arg2 + 15, class94.field1761);
        class48.field984.method1447(-1, 57);
        class48.field984.method1447(-1, class121.field2178);
        class48.field984.method1447(-1, class151.field2693);
        class48.field984.method1447(-1, 89);
        class48.field984.method1463(arg2 ^ 0xA, class228.field3975.field3976);
        class48.field984.method1463(arg2 ^ 0x7D, class228.field3975.field4029);
        class48.field984.method1447(-1, class227.field3964);
        class48.field984.method1447(arg2 ^ 0x2C, 63);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lwa;I)V")
    public final void method361(class229 arg0, int arg1) {
        if (arg1 <= 77) {
            this.field1040 = null;
        }
        field1056++;
        while (true) {
            int var3 = arg0.method1475(255);
            if (var3 == 0) {
                return;
            }
            this.method357(var3, arg0, 66);
        }
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(B)V")
    public static final void method362(byte arg0) {
        for (int var1 = -1; var1 < class47.field961; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class159.field2866[var1];
            }
            class20 var6 = class179.field3229[var5];
            if (var6 != null && var6.field4026 > 0) {
                var6.field4026--;
                if (var6.field4026 == 0) {
                    var6.field4033 = null;
                }
            }
        }
        field1051++;
        if (arg0 >= -93) {
            return;
        }
        for (int var2 = 0; var2 < class23.field505; var2++) {
            int var3 = class81.field1553[var2];
            class203 var4 = class122.field2190[var3];
            if (var4 != null && var4.field4026 > 0) {
                var4.field4026--;
                if (var4.field4026 == 0) {
                    var4.field4033 = null;
                }
            }
        }
    }
}
