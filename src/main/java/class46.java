import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class46 extends class130 {

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
    private int field1079 = 0;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
    private int field1077 = 128;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    public int field1076 = -1;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    private int field1087 = 0;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    private int field1088 = 128;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
    private int field1086 = 0;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
    public static int field1094 = 0;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
    private int field1082;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "Lab;")
    public static class3 field1093;

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "[S")
    private short[] field1081;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "[S")
    private short[] field1085;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "[S")
    private short[] field1091;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "[S")
    private short[] field1092;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIII)Z")
    public static final boolean method458(int arg0, int arg1, int arg2, int arg3) {
        if (class121.method932(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class94.method824(var4 + 1, class97.field2310[arg0][arg1][arg2] + arg3, var5 + 1) && class94.method824(var4 + 128 - 1, class97.field2310[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class94.method824(var4 + 128 - 1, class97.field2310[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class94.method824(var4 + 1, class97.field2310[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[Lff;Z)V")
    public static final void method459(int arg0, class54[] arg1, boolean arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class54 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field1432 == 0) {
                    if (var4.field1368 != null) {
                        method459(arg0, var4.field1368, true);
                    }
                    class132 var5 = (class132) class133.field2885.method694(-23979, (long) var4.field1323);
                    if (var5 != null) {
                        class103.method853((byte) -26, var5.field2865, arg0);
                    }
                }
                if (arg0 == 0 && var4.field1402 != null) {
                    class131 var6 = new class131();
                    var6.field2853 = var4.field1402;
                    var6.field2862 = var4;
                    class130.method963(var6, (byte) -48);
                }
                if (arg0 == 1 && var4.field1427 != null) {
                    if (var4.field1408 >= 0) {
                        class54 var7 = class59.method555(var4.field1323, 32173);
                        if (var7 == null || var7.field1368 == null || var4.field1408 >= var7.field1368.length || var7.field1368[var4.field1408] != var4) {
                            continue;
                        }
                    }
                    class131 var8 = new class131();
                    var8.field2862 = var4;
                    var8.field2853 = var4.field1427;
                    class130.method963(var8, (byte) -117);
                }
            }
        }
        if (arg2) {
            field1080++;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILjc;)V")
    public static final void method460(int arg0, class85 arg1) {
        class75.field1842 = arg1;
        field1089++;
        if (arg0 != 0) {
            field1094 = 91;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lab;I)V")
    public final void method461(class3 arg0, int arg1) {
        if (arg1 != -13087) {
            this.field1077 = 2;
        }
        while (true) {
            int var3 = arg0.method64(31790);
            if (var3 == 0) {
                field1083++;
                return;
            }
            this.method463(arg1 + 9644, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
    public static void method462(byte arg0) {
        field1093 = null;
        int var1 = 40 % (arg0 / 38);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILab;)V")
    private final void method463(int arg0, int arg1, class3 arg2) {
        if (arg1 == 1) {
            this.field1082 = arg2.method46((byte) 65);
        } else if (arg1 == 2) {
            this.field1076 = arg2.method46((byte) 65);
        } else if (arg1 == 4) {
            this.field1088 = arg2.method46((byte) 65);
        } else if (arg1 == 5) {
            this.field1077 = arg2.method46((byte) 65);
        } else if (arg1 == 6) {
            this.field1079 = arg2.method46((byte) 65);
        } else if (arg1 == 7) {
            this.field1086 = arg2.method64(31790);
        } else if (arg1 == 8) {
            this.field1087 = arg2.method64(31790);
        } else if (arg1 == 40) {
            int var6 = arg2.method64(31790);
            this.field1092 = new short[var6];
            this.field1085 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1085[var7] = (short) arg2.method46((byte) 65);
                this.field1092[var7] = (short) arg2.method46((byte) 65);
            }
        } else if (arg1 == 41) {
            int var4 = arg2.method64(arg0 + 35233);
            this.field1091 = new short[var4];
            this.field1081 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1091[var5] = (short) arg2.method46((byte) 65);
                this.field1081[var5] = (short) arg2.method46((byte) 65);
            }
        }
        if (arg0 != -3443) {
            method460(54, null);
        }
        field1090++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Ldf;")
    public final class36 method464(int arg0, int arg1) {
        class36 var3 = (class36) class49.field1192.method289((long) this.field1078, -130079263);
        field1084++;
        if (var3 == null) {
            class92 var4 = class92.method784(class94.field2258, this.field1082, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field1085 != null) {
                for (int var5 = 0; var5 < this.field1085.length; var5++) {
                    var4.method785(this.field1085[var5], this.field1092[var5]);
                }
            }
            if (this.field1091 != null) {
                for (int var6 = 0; var6 < this.field1091.length; var6++) {
                    var4.method791(this.field1091[var6], this.field1081[var6]);
                }
            }
            var3 = var4.method798(this.field1086 + 64, this.field1087 + 850, -30, -50, -30, true, true);
            class49.field1192.method293(false, (long) this.field1078, var3);
        }
        class36 var7;
        if (this.field1076 == -1 || arg1 == -1) {
            var7 = var3.method332(true);
        } else {
            var7 = class49.method480(1000, this.field1076).method129(var3, -32535, arg1);
        }
        if (~this.field1088 != arg0 || this.field1077 != 128) {
            var7.method327(this.field1088, this.field1077, this.field1088);
        }
        if (this.field1079 != 0) {
            if (this.field1079 == 90) {
                var7.method333();
            }
            if (this.field1079 == 180) {
                var7.method333();
                var7.method333();
            }
            if (this.field1079 == 270) {
                var7.method333();
                var7.method333();
                var7.method333();
            }
        }
        return var7;
    }
}
