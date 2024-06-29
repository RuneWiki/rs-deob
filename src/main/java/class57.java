import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class57 extends class269 {

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    private int field1064 = 0;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Laj;")
    private class46 field1047 = new class46(16);

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    private int field1073 = 0;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "Lpk;")
    private class98 field1072 = new class98();

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "J")
    private long field1077 = 0L;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "Llh;")
    private class274 field1065;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "Z")
    private boolean field1074;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "Lpk;")
    private class98 field1075;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "Llh;")
    private class274 field1052;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "Lsi;")
    private class192 field1069;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "Z")
    private boolean field1076;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lef;")
    private class205 field1046;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Lm;")
    private class114 field1043;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "[I")
    public static int[] field1048 = new int[5];

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "[S")
    public static short[] field1045 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field1057 = 0;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "Leb;")
    public static class230 field1054 = class68.method589(0, "null");

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "Loi;")
    private class79 field1050;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "Z")
    private boolean field1071;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "[B")
    private byte[] field1070;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V")
    public static final void method475(int arg0, int arg1, int arg2, int arg3) {
        class233 var4 = class53.field916[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class265 var5 = var4.field4065;
        if (var5 != null) {
            var5.field4710 = var5.field4710 * arg3 / 16;
            var5.field4707 = var5.field4707 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public final void method476(boolean arg0) {
        field1062++;
        if (this.field1075 != null) {
            if (this.method482(255) == null) {
                return;
            }
            if (this.field1074) {
                boolean var6 = true;
                for (class61 var7 = this.field1075.method839(128); var7 != null; var7 = this.field1075.method834((byte) 82)) {
                    int var9 = (int) var7.field1166;
                    if (this.field1070[var9] == 0) {
                        this.method485(var9, 1, 64);
                    }
                    if (this.field1070[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method518(83);
                    }
                }
                while (this.field1050.field1433.length > this.field1073) {
                    if (this.field1050.field1433[this.field1073] == 0) {
                        this.field1073++;
                    } else {
                        if (this.field1046.field3625 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field1070[this.field1073] == 0) {
                            this.method485(this.field1073, 1, -123);
                        }
                        if (this.field1070[this.field1073] == 0) {
                            var6 = false;
                            class61 var8 = new class61();
                            var8.field1166 = (long) this.field1073;
                            this.field1075.method843(-5, var8);
                        }
                        this.field1073++;
                    }
                }
                if (var6) {
                    this.field1074 = false;
                    this.field1073 = 0;
                }
            } else if (this.field1071) {
                boolean var2 = true;
                for (class61 var3 = this.field1075.method839(128); var3 != null; var3 = this.field1075.method834((byte) 82)) {
                    int var5 = (int) var3.field1166;
                    if (this.field1070[var5] != 1) {
                        this.method485(var5, 2, 86);
                    }
                    if (this.field1070[var5] == 1) {
                        var3.method518(125);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field1050.field1433.length > this.field1073) {
                    if (this.field1050.field1433[this.field1073] == 0) {
                        this.field1073++;
                    } else {
                        if (this.field1069.method1363(arg0)) {
                            var2 = false;
                            break;
                        }
                        if (this.field1070[this.field1073] != 1) {
                            this.method485(this.field1073, 2, 60);
                        }
                        if (this.field1070[this.field1073] != 1) {
                            var2 = false;
                            class61 var4 = new class61();
                            var4.field1166 = (long) this.field1073;
                            this.field1075.method843(-5, var4);
                        }
                        this.field1073++;
                    }
                }
                if (var2) {
                    this.field1073 = 0;
                    this.field1071 = false;
                }
            } else {
                this.field1075 = null;
            }
        }
        if (this.field1076 && class201.method1419(5) >= this.field1077) {
            for (class114 var10 = (class114) this.field1047.method392(0); var10 != null; var10 = (class114) this.field1047.method390(-1)) {
                if (!var10.field2050) {
                    if (var10.field2042) {
                        if (!var10.field2046) {
                            throw new RuntimeException();
                        }
                        var10.method518(86);
                    } else {
                        var10.field2042 = true;
                    }
                }
            }
            this.field1077 = class201.method1419(5) + 1000L;
        }
        if (arg0) {
            method489(124);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)I")
    public final int method477(int arg0) {
        field1041++;
        if (this.field1050 == null) {
            return 0;
        } else {
            if (arg0 != 2777) {
                method484(true);
            }
            return this.field1050.field1447;
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public final void method478(int arg0) {
        field1055++;
        if (this.field1075 == null || this.method482(255) == null || arg0 != -20270) {
            return;
        }
        for (class61 var2 = this.field1072.method839(128); var2 != null; var2 = this.field1072.method834((byte) 82)) {
            int var3 = (int) var2.field1166;
            if (var3 < 0 || var3 >= this.field1050.field1426 || this.field1050.field1433[var3] == 0) {
                var2.method518(arg0 + 20378);
            } else {
                if (this.field1070[var3] == 0) {
                    this.method485(var3, 1, 122);
                }
                if (this.field1070[var3] == -1) {
                    this.method485(var3, 2, 125);
                }
                if (this.field1070[var3] == 1) {
                    var2.method518(102);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(II)I")
    public static final int method479(int arg0, int arg1) {
        field1068++;
        if (arg1 != 1000) {
            method479(-1, -15);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)I")
    public final int method480(byte arg0) {
        field1044++;
        if (arg0 != 100) {
            return 14;
        } else if (this.field1050 == null) {
            return 0;
        } else if (this.field1074) {
            class61 var2 = this.field1075.method839(128);
            return var2 == null ? 0 : (int) var2.field1166;
        } else {
            return this.field1050.field1447;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)I")
    public final int method481(boolean arg0) {
        if (arg0) {
            this.field1076 = true;
        }
        field1063++;
        return this.field1064;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Loi;")
    public final class79 method482(int arg0) {
        field1053++;
        if (arg0 != 255) {
            field1054 = null;
        }
        if (this.field1050 != null) {
            return this.field1050;
        }
        if (this.field1043 == null) {
            if (this.field1069.method1368(11358)) {
                return null;
            }
            this.field1043 = this.field1069.method1375((byte) 106, (byte) 0, true, 255, this.field1049);
        }
        if (this.field1043.field2050) {
            return null;
        }
        byte[] var2 = this.field1043.method811((byte) -62);
        if (this.field1043 instanceof class95) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1050 = new class79(var2, this.field1060);
                if (this.field1050.field1424 != this.field1056) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field1050 = null;
                if (this.field1069.method1368(arg0 ^ 0x2CA1)) {
                    this.field1043 = null;
                } else {
                    this.field1043 = this.field1069.method1375((byte) 123, (byte) 0, true, 255, this.field1049);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1050 = new class79(var2, this.field1060);
            } catch (RuntimeException var4) {
                this.field1069.method1369(-124);
                this.field1050 = null;
                if (this.field1069.method1368(11358)) {
                    this.field1043 = null;
                } else {
                    this.field1043 = this.field1069.method1375((byte) 124, (byte) 0, true, 255, this.field1049);
                }
                return null;
            }
            if (this.field1052 != null) {
                this.field1046.method1438(true, this.field1049, var2, this.field1052);
            }
        }
        this.field1043 = null;
        if (this.field1065 != null) {
            this.field1064 = 0;
            this.field1070 = new byte[this.field1050.field1426];
        }
        return this.field1050;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(Z)I")
    public final int method483(boolean arg0) {
        if (!arg0) {
            this.field1074 = true;
        }
        field1042++;
        if (this.method482(255) == null) {
            return this.field1043 == null ? 0 : this.field1043.method807(false);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(Z)[Lmf;")
    public static final class10[] method484(boolean arg0) {
        field1051++;
        class10[] var1 = new class10[class194.field3434];
        for (int var2 = 0; var2 < class194.field3434; var2++) {
            byte[] var3 = class215.field3725[var2];
            int var4 = class7.field124[var2] * class273.field4806[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class263.field4676[class189.method1350(255, var3[var6])];
            }
            var1[var2] = new class10(class47.field839, class15.field346, class96.field1735[var2], class113.field2034[var2], class7.field124[var2], class273.field4806[var2], var5);
        }
        class78.method650(arg0);
        return var1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Lm;")
    private final class114 method485(int arg0, int arg1, int arg2) {
        field1061++;
        int var4 = 115 % (-arg2 / 52);
        class114 var5 = (class114) this.field1047.method394((long) arg0, -21083);
        if (var5 != null && arg1 == 0 && !var5.field2046 && var5.field2050) {
            var5.method518(90);
            var5 = null;
        }
        if (var5 == null) {
            if (arg1 == 0) {
                if (this.field1065 == null || this.field1070[arg0] == -1) {
                    if (this.field1069.method1368(11358)) {
                        return null;
                    }
                    var5 = this.field1069.method1375((byte) 117, (byte) 2, true, this.field1049, arg0);
                } else {
                    var5 = this.field1046.method1437(2, arg0, this.field1065);
                }
            } else if (arg1 == 1) {
                if (this.field1065 == null) {
                    throw new RuntimeException();
                }
                var5 = this.field1046.method1436(302, arg0, this.field1065);
            } else if (arg1 == 2) {
                if (this.field1065 == null) {
                    throw new RuntimeException();
                }
                if (this.field1070[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field1069.method1363(false)) {
                    return null;
                }
                var5 = this.field1069.method1375((byte) 101, (byte) 2, false, this.field1049, arg0);
            } else {
                throw new RuntimeException();
            }
            this.field1047.method388(-1, (long) arg0, var5);
        }
        if (var5.field2050) {
            return null;
        }
        byte[] var6 = var5.method811((byte) -26);
        if (!var5 instanceof class95) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class139.field2478.reset();
                class139.field2478.update(var6, 0, var6.length - 2);
                int var7 = (int) class139.field2478.getValue();
                if (this.field1050.field1425[arg0] != var7) {
                    throw new RuntimeException();
                }
                this.field1069.field3415 = 0;
                this.field1069.field3417 = 0;
            } catch (RuntimeException var13) {
                this.field1069.method1369(-125);
                var5.method518(83);
                if (var5.field2046 && !this.field1069.method1368(11358)) {
                    class99 var8 = this.field1069.method1375((byte) 104, (byte) 2, true, this.field1049, arg0);
                    this.field1047.method388(-1, (long) arg0, var8);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field1050.field1443[arg0] >>> 8);
            var6[var6.length - 1] = (byte) this.field1050.field1443[arg0];
            if (this.field1065 != null) {
                this.field1046.method1438(true, arg0, var6, this.field1065);
                if (this.field1070[arg0] != 1) {
                    this.field1064++;
                    this.field1070[arg0] = 1;
                }
            }
            if (!var5.field2046) {
                var5.method518(98);
            }
            return var5;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class139.field2478.reset();
            class139.field2478.update(var6, 0, var6.length - 2);
            int var9 = (int) class139.field2478.getValue();
            if (this.field1050.field1425[arg0] != var9) {
                throw new RuntimeException();
            }
            int var10 = (var6[var6.length - 2] & 0xFF << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field1050.field1443[arg0] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field1070[arg0] != 1) {
                this.field1064++;
                this.field1070[arg0] = 1;
            }
            if (!var5.field2046) {
                var5.method518(99);
            }
            return var5;
        } catch (Exception var12) {
            this.field1070[arg0] = -1;
            var5.method518(84);
            if (var5.field2046 && !this.field1069.method1368(11358)) {
                class99 var11 = this.field1069.method1375((byte) 112, (byte) 2, true, this.field1049, arg0);
                this.field1047.method388(-1, (long) arg0, var11);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)V")
    public final void method486(byte arg0, int arg1) {
        field1066++;
        if (this.field1065 == null || arg0 >= -72) {
            return;
        }
        for (class61 var3 = this.field1072.method839(128); var3 != null; var3 = this.field1072.method834((byte) 82)) {
            if ((long) arg1 == var3.field1166) {
                return;
            }
        }
        class61 var4 = new class61();
        var4.field1166 = (long) arg1;
        this.field1072.method843(-5, var4);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)Lfi;")
    public static final class108 method487(int arg0, int arg1, int arg2) {
        class233 var3 = class53.field916[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4056;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)I")
    public final int method488(int arg0, int arg1) {
        field1067++;
        if (arg1 < 115) {
            return -47;
        } else {
            class114 var3 = (class114) this.field1047.method394((long) arg0, -21083);
            return var3 == null ? 0 : var3.method807(false);
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public static void method489(int arg0) {
        if (arg0 == 100) {
            field1045 = null;
            field1054 = null;
            field1048 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[B")
    public final byte[] method490(int arg0, int arg1) {
        field1058++;
        class114 var3 = this.method485(arg1, 0, arg0 + 378);
        if (var3 == null) {
            return null;
        }
        if (arg0 != -251) {
            this.field1072 = null;
        }
        byte[] var4 = var3.method811((byte) -111);
        var3.method518(104);
        return var4;
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
    public final void method491(int arg0) {
        field1059++;
        if (this.field1065 == null) {
            return;
        }
        int var2 = 31 / ((arg0 + 17) / 42);
        this.field1071 = true;
        if (this.field1075 == null) {
            this.field1075 = new class98();
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(ILlh;Llh;Lsi;Lef;IIZ)V")
    public class57(int arg0, class274 arg1, class274 arg2, class192 arg3, class205 arg4, int arg5, int arg6, boolean arg7) {
        this.field1049 = arg0;
        this.field1065 = arg1;
        if (this.field1065 == null) {
            this.field1074 = false;
        } else {
            this.field1074 = true;
            this.field1075 = new class98();
        }
        this.field1056 = arg6;
        this.field1052 = arg2;
        this.field1069 = arg3;
        this.field1076 = arg7;
        this.field1060 = arg5;
        this.field1046 = arg4;
        if (this.field1052 != null) {
            this.field1043 = this.field1046.method1437(2, this.field1049, this.field1052);
        }
    }
}
