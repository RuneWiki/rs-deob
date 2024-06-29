import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class63 extends class200 {

    @OriginalMember(owner = "client!qc", name = "db", descriptor = "Z")
    public boolean field1066 = true;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "Loa;")
    private static class99 field1063 = class221.method1463(2844, "skill: ");

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "Loa;")
    public static class99 field1061 = class221.method1463(2844, " )2>");

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "Lli;")
    public static class291 field1064 = null;

    @OriginalMember(owner = "client!qc", name = "eb", descriptor = "Loa;")
    public static class99 field1067 = field1063;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "Lng;")
    public static class76 field1065 = new class76();

    @OriginalMember(owner = "client!qc", name = "fb", descriptor = "Loa;")
    public static class99 field1068 = class221.method1463(2844, "(U0a )2 in: ");

    @OriginalMember(owner = "client!qc", name = "ib", descriptor = "Loa;")
    public static class99 field1071 = class221.method1463(2844, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!qc", name = "gb", descriptor = "Loa;")
    public static class99 field1069 = class221.method1463(2844, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!qc", name = "jb", descriptor = "Z")
    public static boolean field1072 = true;

    @OriginalMember(owner = "client!qc", name = "kb", descriptor = "Z")
    public static boolean field1073 = false;

    @OriginalMember(owner = "client!qc", name = "hb", descriptor = "I")
    public static int field1070 = 1;

    @OriginalMember(owner = "client!qc", name = "lb", descriptor = "Loa;")
    public static class99 field1074 = null;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "Lbh;")
    public static class7 field1047;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "[I")
    private int[] field1051;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "[I")
    public int[] field1058;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "[Loa;")
    private class99[] field1054;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "[[I")
    private int[][] field1052;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V")
    public static void method409(int arg0) {
        if (arg0 <= 116) {
            method409(-13);
        }
        field1071 = null;
        field1047 = null;
        field1069 = null;
        field1065 = null;
        field1074 = null;
        field1063 = null;
        field1067 = null;
        field1061 = null;
        field1068 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lik;B)V")
    public final void method410(class261 arg0, byte arg1) {
        if (arg1 != -102) {
            this.field1066 = false;
        }
        while (true) {
            int var3 = arg0.method1693((byte) 90);
            if (var3 == 0) {
                field1055++;
                return;
            }
            this.method417((byte) 109, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)V")
    public static final void method411(byte arg0) {
        if (arg0 != -12) {
            method415(82, false);
        }
        field1046++;
        class262.field4629.method1813(-1);
        class267.field4707.method1813(arg0 ^ 0xB);
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(B)Loa;")
    public final class99 method412(byte arg0) {
        field1043++;
        class99 var2 = class28.method237(80, 0);
        if (this.field1054 == null) {
            return class138.field2439;
        }
        var2.method664(-1, this.field1054[0]);
        int var3 = 1;
        if (arg0 != 101) {
            return null;
        }
        while (this.field1054.length > var3) {
            var2.method664(-1, class186.field3297);
            var2.method664(-1, this.field1054[var3]);
            var3++;
        }
        return var2.method670(19541);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBI)I")
    public final int method413(int arg0, byte arg1, int arg2) {
        int var4 = 105 / ((arg1 + 32) / 37);
        field1060++;
        if (this.field1051 == null || arg2 < 0 || arg2 > this.field1051.length) {
            return -1;
        } else if (this.field1052[arg2] == null || arg0 < 0 || arg0 > this.field1052[arg2].length) {
            return -1;
        } else {
            return this.field1052[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lik;I[I)V")
    public final void method414(class261 arg0, int arg1, int[] arg2) {
        field1059++;
        if (this.field1051 == null) {
            return;
        }
        if (arg1 >= -66) {
            field1068 = null;
        }
        for (int var4 = 0; var4 < this.field1051.length; var4++) {
            if (arg2.length <= var4) {
                return;
            }
            int var5 = class2.field19[this.method416(var4, (byte) 84)];
            if (var5 > 0) {
                arg0.method1707(false, (long) arg2[var4], var5);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ)V")
    public static final void method415(int arg0, boolean arg1) {
        field1056++;
        if (!arg1) {
            class250.field4315.method1809(arg0, (byte) 118);
            class237.field4100.method1809(arg0, (byte) -36);
            class116.field2053.method1809(arg0, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)I")
    public final int method416(int arg0, byte arg1) {
        if (arg1 != 84) {
            field1067 = null;
        }
        field1045++;
        return this.field1051 == null || arg0 < 0 || this.field1051.length < arg0 ? -1 : this.field1051[arg0];
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLik;I)V")
    private final void method417(byte arg0, class261 arg1, int arg2) {
        int var4 = 41 / ((20 - arg0) / 47);
        if (arg2 == 1) {
            this.field1054 = arg1.method1705(125).method699(60, 59);
        } else if (arg2 == 2) {
            int var9 = arg1.method1693((byte) -81);
            this.field1058 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1058[var10] = arg1.method1740((byte) 83);
            }
        } else if (arg2 == 3) {
            int var5 = arg1.method1693((byte) -118);
            this.field1052 = new int[var5][];
            this.field1051 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg1.method1740((byte) 118);
                this.field1051[var6] = var7;
                this.field1052[var6] = new int[class276.field4861[var7]];
                for (int var8 = 0; var8 < class276.field4861[var7]; var8++) {
                    this.field1052[var6][var8] = arg1.method1740((byte) 119);
                }
            }
        } else if (arg2 == 4) {
            this.field1066 = false;
        }
        field1044++;
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(B)V")
    public final void method418(byte arg0) {
        if (this.field1058 != null) {
            for (int var2 = 0; var2 < this.field1058.length; var2++) {
                this.field1058[var2] = class179.method1194(this.field1058[var2], 32768);
            }
        }
        field1062++;
        if (arg0 >= -49) {
            field1067 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILik;)Loa;")
    public final class99 method419(int arg0, class261 arg1) {
        if (arg0 != 60) {
            field1047 = null;
        }
        class99 var3 = class28.method237(80, 0);
        if (this.field1051 != null) {
            for (int var4 = 0; var4 < this.field1051.length; var4++) {
                var3.method664(-1, this.field1054[var4]);
                var3.method664(-1, class212.method1418(this.field1052[var4], this.field1051[var4], arg1.method1720((byte) -121, class20.field221[this.field1051[var4]]), arg0 - 55));
            }
        }
        var3.method664(arg0 - 61, this.field1054[this.field1054.length - 1]);
        field1053++;
        return var3.method670(arg0 + 19481);
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)I")
    public final int method420(int arg0) {
        int var2 = 75 % ((-arg0 - 47) / 63);
        field1049++;
        return this.field1051 == null ? 0 : this.field1051.length;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(ILik;)Lrg;")
    public static final class229 method421(int arg0, class261 arg1) {
        if (arg0 <= 111) {
            return null;
        }
        class229 var2 = new class229(arg1.method1705(-106), arg1.method1705(-125), arg1.method1740((byte) 75), arg1.method1740((byte) 54), arg1.method1712(-4), arg1.method1693((byte) -90) == 1);
        int var3 = arg1.method1693((byte) 106);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field3969.method536(new class123(arg1.method1740((byte) 124), arg1.method1740((byte) 52), arg1.method1740((byte) 125), arg1.method1740((byte) 108)), (byte) -85);
        }
        field1057++;
        var2.method1503(97);
        return var2;
    }
}
