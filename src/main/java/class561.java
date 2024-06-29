import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class561 extends class13 {

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "Lej;")
    public static class124 field7751 = new class124(83, -1);

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field7752 = -1;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public static int field7750;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "Ljava/lang/String;")
    public String field7748;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "[C")
    public char[] field7743;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "[C")
    public char[] field7749;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "[I")
    public int[] field7741;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "[I")
    public int[] field7753;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(B)V", line = 10)
    public static void method3219(byte arg0) {
        if (arg0 < 96) {
            field7752 = 45;
        }
        field7751 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILcea;)V", line = 25)
    public final void method3220(int arg0, class215 arg1) {
        int var3 = 81 / ((-arg0 - 39) / 52);
        field7744++;
        while (true) {
            int var4 = arg1.method1535(255);
            if (var4 == 0) {
                return;
            }
            this.method3226(-5847, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BC)I", line = 48)
    public final int method3221(byte arg0, char arg1) {
        field7746++;
        if (this.field7741 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg0 > -97) {
            this.method3220(126, null);
        }
        while (this.field7741.length > var3) {
            if (this.field7743[var3] == arg1) {
                return this.field7741[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "()V", line = 73)
    public static final void method3222() {
        for (int var0 = 0; var0 < class612.field8367; var0++) {
            class494 var1 = class477.field6658[var0];
            class410.method2540(var1, true);
            class477.field6658[var0] = null;
        }
        class612.field8367 = 0;
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(B)V", line = 87)
    public final void method3223(byte arg0) {
        if (this.field7741 != null) {
            for (int var2 = 0; var2 < this.field7741.length; var2++) {
                this.field7741[var2] = class418.method2577(this.field7741[var2], 32768);
            }
        }
        field7740++;
        if (this.field7753 != null) {
            for (int var3 = 0; var3 < this.field7753.length; var3++) {
                this.field7753[var3] = class418.method2577(this.field7753[var3], 32768);
            }
        }
        if (arg0 <= 102) {
            this.method3221((byte) 78, (char) 65473);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 115)
    public static final void method3224(int arg0) {
        field7750++;
        if (class693.field9368.field4461.method2473(-32350) != 2) {
            return;
        }
        byte var1 = (byte) (class448.field6342 - 4 & 0xFF);
        int var2 = class448.field6342 % class376.field5325;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class175.field2711; var18++) {
                class591.field8070[var3][var2][var18] = var1;
            }
        }
        if (class382.field5551 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class531.field7324[var4] = -1000000;
            class444.field6316[var4] = 1000000;
            class98.field1699[var4] = 0;
            class472.field6606[var4] = 1000000;
            class120.field2057[var4] = 0;
        }
        int var5 = class58.field1147.field5922;
        int var6 = class58.field1147.field5933;
        if (arg0 < 100) {
            return;
        }
        if (class438.field6252 != 1 && class44.field978 == -1) {
            int var7 = class197.method1403(class108.field1896, class382.field5551, 11219, class275.field3870);
            if (var7 - class458.field6444 < 3200 && (class607.field8331[class382.field5551][class108.field1896 >> 9][class275.field3870 >> 9] & 0x4) != 0) {
                class376.method2374(class275.field3870 >> 9, class649.field8928, class108.field1896 >> 9, 0, 1, false);
                return;
            }
            return;
        }
        if (class438.field6252 != 1) {
            var6 = class705.field9558;
            var5 = class44.field978;
        }
        if ((class607.field8331[class382.field5551][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class376.method2374(var6 >> 9, class649.field8928, var5 >> 9, 0, 0, false);
        }
        if (class634.field8721 >= 2560) {
            return;
        }
        int var8 = class108.field1896 >> 9;
        int var9 = class275.field3870 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var10 > var8) {
            var12 = var10 - var8;
        } else {
            var12 = var8 - var10;
        }
        int var13;
        if (var11 <= var9) {
            var13 = var9 - var11;
        } else {
            var13 = var11 - var9;
        }
        if ((var12 != 0 || var13 != 0) && -class376.field5325 < var12 && var12 < class376.field5325 && (-class175.field2711) < var13 && class175.field2711 > var13) {
            if (var13 >= var12) {
                int var14 = var12 * 65536 / var13;
                int var15 = 32768;
                while (var9 != var11) {
                    if (var11 > var9) {
                        var9++;
                    } else if (var9 > var11) {
                        var9--;
                    }
                    if ((class607.field8331[class382.field5551][var8][var9] & 0x4) != 0) {
                        class376.method2374(var9, class649.field8928, var8, 0, 1, false);
                        return;
                    }
                    var15 += var14;
                    if (var15 >= 65536) {
                        if (var8 < var10) {
                            var8++;
                        } else if (var10 < var8) {
                            var8--;
                        }
                        var15 -= 65536;
                        if ((class607.field8331[class382.field5551][var8][var9] & 0x4) != 0) {
                            class376.method2374(var9, class649.field8928, var8, 0, 1, false);
                            return;
                        }
                    }
                }
                return;
            }
            int var16 = var13 * 65536 / var12;
            int var17 = 32768;
            while (var8 != var10) {
                if (var8 < var10) {
                    var8++;
                } else if (var8 > var10) {
                    var8--;
                }
                if ((class607.field8331[class382.field5551][var8][var9] & 0x4) != 0) {
                    class376.method2374(var9, class649.field8928, var8, 0, 1, false);
                    return;
                }
                var17 += var16;
                if (var17 >= 65536) {
                    if (var11 > var9) {
                        var9++;
                    } else if (var11 < var9) {
                        var9--;
                    }
                    var17 -= 65536;
                    if ((class607.field8331[class382.field5551][var8][var9] & 0x4) != 0) {
                        class376.method2374(var9, class649.field8928, var8, 0, 1, false);
                        return;
                    }
                }
            }
            return;
        }
        class444.method2672("RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class221.field3177 + "," + class367.field5236, null, 15004);
        return;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(CI)I", line = 316)
    public final int method3225(char arg0, int arg1) {
        field7745++;
        if (this.field7753 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field7753.length; var3++) {
            if (this.field7749[var3] == arg0) {
                return this.field7753[var3];
            }
        }
        if (arg1 != 57249897) {
            this.method3220(-16, null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILcea;I)V", line = 341)
    private final void method3226(int arg0, class215 arg1, int arg2) {
        if (arg2 == 1) {
            this.field7748 = arg1.method1525((byte) 100);
        } else if (arg2 == 2) {
            int var4 = arg1.method1535(255);
            this.field7753 = new int[var4];
            this.field7749 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7753[var5] = arg1.method1478(842397944);
                byte var6 = arg1.method1536(-121);
                this.field7749[var5] = var6 == 0 ? 0 : class216.method1548(var6, -128);
            }
        } else if (arg2 == 3) {
            int var7 = arg1.method1535(255);
            this.field7743 = new char[var7];
            this.field7741 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field7741[var8] = arg1.method1478(842397944);
                byte var9 = arg1.method1536(-115);
                this.field7743[var8] = var9 == 0 ? 0 : class216.method1548(var9, -128);
            }
        }
        if (arg0 != -5847) {
            field7747 = 12;
        }
        field7742++;
    }
}
