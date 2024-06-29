import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class88 extends class361 {

    @OriginalMember(owner = "client!hu", name = "M", descriptor = "Z")
    public boolean field1108 = true;

    @OriginalMember(owner = "client!hu", name = "L", descriptor = "Leh;")
    public static class246 field1107 = new class246(112, 6);

    @OriginalMember(owner = "client!hu", name = "w", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!hu", name = "y", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!hu", name = "C", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!hu", name = "D", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!hu", name = "F", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!hu", name = "H", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!hu", name = "K", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!hu", name = "N", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!hu", name = "P", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!hu", name = "Q", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!hu", name = "x", descriptor = "Lal;")
    public class67 field1094;

    @OriginalMember(owner = "client!hu", name = "A", descriptor = "[I")
    public int[] field1097;

    @OriginalMember(owner = "client!hu", name = "G", descriptor = "[I")
    private int[] field1103;

    @OriginalMember(owner = "client!hu", name = "E", descriptor = "[Ljava/lang/String;")
    private String[] field1101;

    @OriginalMember(owner = "client!hu", name = "B", descriptor = "[[I")
    private int[][] field1098;

    @OriginalMember(owner = "client!hu", name = "J", descriptor = "[[Lhm;")
    public static class150[][] field1105;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBI)I", line = 6)
    public final int method632(int arg0, byte arg1, int arg2) {
        if (arg1 > -54) {
            this.method639((byte) -93);
        }
        field1106++;
        if (this.field1103 == null || arg0 < 0 || arg0 > this.field1103.length) {
            return -1;
        } else if (this.field1098[arg0] == null || arg2 < 0 || arg2 > this.field1098[arg0].length) {
            return -1;
        } else {
            return this.field1098[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lwm;II)V", line = 26)
    private final void method633(class403 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return;
        }
        field1095++;
        if (arg2 == 1) {
            this.field1101 = class177.method1103('<', arg0.method2356(arg1 ^ 0xFFFF9DA6), 0);
        } else if (arg2 == 2) {
            int var9 = arg0.method2357((byte) 124);
            this.field1097 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1097[var10] = arg0.method2338(0);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method2357((byte) 111);
            this.field1098 = new int[var4][];
            this.field1103 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method2338(0);
                class276 var7 = class377.method2196(true, var6);
                if (var7 != null) {
                    this.field1103[var5] = var6;
                    this.field1098[var5] = new int[var7.field4101];
                    for (int var8 = 0; var8 < var7.field4101; var8++) {
                        this.field1098[var5][var8] = arg0.method2338(0);
                    }
                }
            }
        } else if (arg2 == 4) {
            this.field1108 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "([ILwm;B)V", line = 100)
    public final void method634(int[] arg0, class403 arg1, byte arg2) {
        field1099++;
        if (this.field1103 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field1103.length && var4 < arg0.length; var4++) {
            int var5 = this.method637(0, var4).field4105;
            if (var5 > 0) {
                arg1.method2335(var5, -128, (long) arg0[var4]);
            }
        }
        if (arg2 > -79) {
            this.field1108 = false;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "([SB[Ljava/lang/String;)V", line = 130)
    public static final void method635(short[] arg0, byte arg1, String[] arg2) {
        int var3 = 73 / ((-arg1 - 38) / 61);
        class78.method597(0, arg2, arg0, (byte) -26, arg2.length - 1);
        field1093++;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V", line = 140)
    public final void method636(byte arg0) {
        if (this.field1097 != null) {
            for (int var2 = 0; var2 < this.field1097.length; var2++) {
                this.field1097[var2] = class170.method1067(this.field1097[var2], 32768);
            }
        }
        if (arg0 < 90) {
            this.method639((byte) -7);
        }
        field1109++;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)Lmt;", line = 163)
    public final class276 method637(int arg0, int arg1) {
        field1111++;
        if (this.field1103 == null || arg1 < 0 || this.field1103.length < arg1) {
            return null;
        } else {
            if (arg0 != 0) {
                this.field1097 = null;
            }
            return class377.method2196(true, this.field1103[arg1]);
        }
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)Ljava/lang/String;", line = 178)
    public final String method638(byte arg0) {
        field1100++;
        StringBuffer var2 = new StringBuffer(80);
        if (arg0 > -26) {
            method635(null, (byte) 126, null);
        }
        if (this.field1101 == null) {
            return "";
        }
        var2.append(this.field1101[0]);
        for (int var3 = 1; var3 < this.field1101.length; var3++) {
            var2.append("...");
            var2.append(this.field1101[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(B)I", line = 208)
    public final int method639(byte arg0) {
        field1104++;
        if (arg0 == -121) {
            return this.field1103 == null ? 0 : this.field1103.length;
        } else {
            return -72;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lwm;I)V", line = 227)
    public final void method640(class403 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2357((byte) 116);
            if (var3 == 0) {
                if (arg1 <= 126) {
                    this.field1108 = false;
                }
                field1110++;
                return;
            }
            this.method633(arg0, 0, var3);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(BLwm;)Ljava/lang/String;", line = 251)
    public final String method641(byte arg0, class403 arg1) {
        field1102++;
        if (arg0 > -71) {
            this.method638((byte) 8);
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field1103 != null) {
            for (int var4 = 0; var4 < this.field1103.length; var4++) {
                var3.append(this.field1101[var4]);
                var3.append(this.field1094.method528(this.field1098[var4], this.method637(0, var4), arg1.method2332(class377.method2196(true, this.field1103[var4]).field4103, 255), 99));
            }
        }
        var3.append(this.field1101[this.field1101.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "(B)V", line = 291)
    public static void method642(byte arg0) {
        field1105 = null;
        field1107 = null;
        if (arg0 != -126) {
            method642((byte) 109);
        }
    }
}
