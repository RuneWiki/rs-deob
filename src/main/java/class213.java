import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class213 extends class90 {

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "Z")
    public boolean field3067 = true;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field3055 = 0;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    public static int field3063 = 1;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
    public static int field3060 = -1;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "Lv;")
    public static class61 field3069;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "[I")
    public int[] field3057;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "[I")
    private int[] field3071;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "[Lib;")
    public static class80[] field3068;

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "[Ljava/lang/String;")
    private String[] field3066;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "[[I")
    private int[][] field3052;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([IILkl;)V")
    public final void method1353(int[] arg0, int arg1, class114 arg2) {
        field3065++;
        if (this.field3071 == null) {
            return;
        }
        for (int var4 = arg1; var4 < this.field3071.length; var4++) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = class57.field871[this.method1358(var4, 16609)];
            if (var5 > 0) {
                arg2.method739((long) arg0[var4], var5, 109);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLkl;)Ljava/lang/String;")
    public final String method1354(byte arg0, class114 arg1) {
        field3070++;
        if (arg0 <= 35) {
            field3068 = null;
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field3071 != null) {
            for (int var4 = 0; var4 < this.field3071.length; var4++) {
                var3.append(this.field3066[var4]);
                var3.append(class286.method1925(this.field3052[var4], this.field3071[var4], -118, arg1.method785(255, class233.field3498[this.field3071[var4]])));
            }
        }
        var3.append(this.field3066[this.field3066.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
    public static final void method1355(int arg0) {
        class13.field203.method257(false);
        class232.field3468.method257(false);
        int var1 = -104 / ((arg0 + 12) / 52);
        field3053++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILkl;)V")
    private final void method1356(int arg0, int arg1, class114 arg2) {
        if (~arg0 == arg1) {
            this.field3066 = class210.method1343(16777215, '<', arg2.method753(arg1 - 126));
        } else if (arg0 == 2) {
            int var8 = arg2.method760(false);
            this.field3057 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3057[var9] = arg2.method756(-29901);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method760(false);
            this.field3071 = new int[var4];
            this.field3052 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method756(-29901);
                this.field3071[var5] = var6;
                this.field3052[var5] = new int[class206.field2977[var6]];
                for (int var7 = 0; var7 < class206.field2977[var6]; var7++) {
                    this.field3052[var5][var7] = arg2.method756(-29901);
                }
            }
        } else if (arg0 == 4) {
            this.field3067 = false;
        }
        field3062++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lkl;I)V")
    public final void method1357(class114 arg0, int arg1) {
        field3064++;
        while (true) {
            int var3 = arg0.method760(false);
            if (var3 == 0) {
                if (arg1 == 903) {
                    return;
                } else {
                    field3055 = 36;
                    return;
                }
            }
            this.method1356(var3, -2, arg0);
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(II)I")
    public final int method1358(int arg0, int arg1) {
        field3051++;
        if (this.field3071 == null || arg0 < 0 || arg0 > this.field3071.length) {
            return -1;
        } else {
            if (arg1 != 16609) {
                this.method1361((byte) -68);
            }
            return this.field3071[arg0];
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BII)I")
    public final int method1359(byte arg0, int arg1, int arg2) {
        int var4 = -29 % ((arg0 - 17) / 35);
        field3059++;
        if (this.field3071 == null || arg1 < 0 || arg1 > this.field3071.length) {
            return -1;
        } else if (this.field3052[arg1] == null || arg2 < 0 || arg2 > this.field3052[arg1].length) {
            return -1;
        } else {
            return this.field3052[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static void method1360(byte arg0) {
        field3069 = null;
        field3068 = null;
        if (arg0 != -94) {
            method1355(74);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)Ljava/lang/String;")
    public final String method1361(byte arg0) {
        StringBuffer var2 = new StringBuffer(80);
        field3056++;
        if (this.field3066 == null) {
            return "";
        }
        var2.append(this.field3066[0]);
        if (arg0 > -34) {
            this.method1356(-77, 77, (class114) null);
        }
        for (int var3 = 1; var3 < this.field3066.length; var3++) {
            var2.append("...");
            var2.append(this.field3066[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V")
    public final void method1362(int arg0) {
        if (this.field3057 != null) {
            for (int var2 = 0; var2 < this.field3057.length; var2++) {
                this.field3057[var2] = class163.method1093(this.field3057[var2], 32768);
            }
        }
        field3072++;
        if (arg0 != -28977) {
            this.field3071 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)V")
    public static final void method1363(boolean arg0) {
        field3054++;
        if (!class275.field4406 || !arg0) {
            return;
        }
        class267 var1 = class22.method165(class102.field1511, !arg0, class172.field2462);
        if (var1 != null && var1.field4154 != null) {
            class234 var2 = new class234();
            var2.field3531 = var1;
            var2.field3530 = var1.field4154;
            class15.method118((byte) 57, var2);
        }
        class275.field4416 = -1;
        class275.field4406 = false;
        class217.method1396(false, var1);
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(Z)I")
    public final int method1364(boolean arg0) {
        if (!arg0) {
            this.field3066 = null;
        }
        field3058++;
        return this.field3071 == null ? 0 : this.field3071.length;
    }
}
