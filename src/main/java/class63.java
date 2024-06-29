import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class63 extends class254 {

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "Z")
    public boolean field1143 = true;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    public static int field1138 = 0;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "Lnh;")
    public static class54 field1128 = new class54(64);

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "Lcf;")
    public static class93 field1146 = class147.method1066("::fpsoff", -48);

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "[I")
    public static int[] field1148 = new int[99];

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "Lvh;")
    public static class274 field1149;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "[I")
    private int[] field1129;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "[I")
    public int[] field1134;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "[Lcf;")
    private class93[] field1144;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "[[I")
    private int[][] field1126;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)Lli;")
    public static final class288 method402(int arg0) {
        if (arg0 == -799) {
            class31.field483 = 0;
            field1142++;
            return class273.method1812((byte) -126);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
    public final void method403(int arg0) {
        if (this.field1134 != null) {
            for (int var2 = 0; var2 < this.field1134.length; var2++) {
                this.field1134[var2] = class270.method1797(this.field1134[var2], 32768);
            }
        }
        if (arg0 > 98) {
            field1130++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILee;I)V")
    private final void method404(int arg0, class280 arg1, int arg2) {
        field1137++;
        if (arg0 == 1) {
            this.field1144 = arg1.method1889((byte) -67).method648((byte) -105, 60);
        } else if (arg0 == 2) {
            int var8 = arg1.method1907(16832);
            this.field1134 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1134[var9] = arg1.method1891(-119);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1907(16832);
            this.field1129 = new int[var4];
            this.field1126 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1891(-125);
                this.field1129[var5] = var6;
                this.field1126[var5] = new int[class32.field512[var6]];
                for (int var7 = 0; var7 < class32.field512[var6]; var7++) {
                    this.field1126[var5][var7] = arg1.method1891(-121);
                }
            }
        } else if (arg0 == 4) {
            this.field1143 = false;
        }
        int var10 = -36 / ((arg2 + 8) / 36);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BILtg;)I")
    public static final int method405(byte arg0, int arg1, class181 arg2) {
        if (arg0 < 14) {
            return -105;
        }
        field1135++;
        if (!client.method1109(arg2).method1440(-95, arg1) && arg2.field3242 == null) {
            return -1;
        } else if (arg2.field3191 == null || arg2.field3191.length <= arg1) {
            return -1;
        } else {
            return arg2.field3191[arg1];
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
    public static final int method406(byte arg0, KeyEvent arg1) {
        int var2 = 33 % ((-arg0 - 50) / 58);
        field1125++;
        int var3 = arg1.getKeyChar();
        if (var3 == 8364) {
            return 128;
        } else {
            if (var3 <= 0 || var3 >= 256) {
                var3 = -1;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lee;B)V")
    public final void method407(class280 arg0, byte arg1) {
        field1139++;
        if (arg1 > -100) {
            method406((byte) -99, (KeyEvent) null);
        }
        while (true) {
            int var3 = arg0.method1907(16832);
            if (var3 == 0) {
                return;
            }
            this.method404(var3, arg0, 109);
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(II)I")
    public final int method408(int arg0, int arg1) {
        field1147++;
        if (this.field1129 == null || arg0 < 0 || this.field1129.length < arg0) {
            return -1;
        } else {
            if (arg1 != 25335) {
                this.method410((byte) 123);
            }
            return this.field1129[arg0];
        }
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)I")
    public final int method409(int arg0) {
        if (arg0 != 0) {
            this.method414((class280) null, (int[]) null, -113);
        }
        field1141++;
        return this.field1129 == null ? 0 : this.field1129.length;
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)Lcf;")
    public final class93 method410(byte arg0) {
        field1132++;
        int var2 = -74 / ((16 - arg0) / 46);
        class93 var3 = class119.method885(80, -79);
        if (this.field1144 == null) {
            return class60.field1019;
        }
        var3.method658((byte) 101, this.field1144[0]);
        for (int var4 = 1; var4 < this.field1144.length; var4++) {
            var3.method658((byte) 115, class171.field3007);
            var3.method658((byte) 104, this.field1144[var4]);
        }
        return var3.method660(99);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)I")
    public final int method411(int arg0, int arg1, int arg2) {
        field1140++;
        if (this.field1129 == null || arg2 < 0 || arg2 > this.field1129.length) {
            return -1;
        } else {
            if (arg1 != 1) {
                field1138 = 124;
            }
            return this.field1126[arg2] == null || arg0 < 0 || this.field1126[arg2].length < arg0 ? -1 : this.field1126[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V")
    public static void method412(int arg0) {
        field1128 = null;
        field1146 = null;
        field1149 = null;
        if (arg0 != 2) {
            method405((byte) -19, 127, (class181) null);
        }
        field1148 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILee;)Lcf;")
    public final class93 method413(int arg0, class280 arg1) {
        field1127++;
        if (arg0 != 5383) {
            return null;
        }
        class93 var3 = class119.method885(80, arg0 - 5449);
        if (this.field1129 != null) {
            for (int var4 = 0; var4 < this.field1129.length; var4++) {
                var3.method658((byte) 91, this.field1144[var4]);
                var3.method658((byte) 127, class238.method1622(this.field1126[var4], this.field1129[var4], arg1.method1896(class156.field2747[this.field1129[var4]], (byte) -105), 116));
            }
        }
        var3.method658((byte) 113, this.field1144[this.field1144.length - 1]);
        return var3.method660(-95);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lee;[II)V")
    public final void method414(class280 arg0, int[] arg1, int arg2) {
        field1136++;
        if (this.field1129 == null) {
            return;
        }
        int var4 = 77 % ((-arg2 - 25) / 49);
        for (int var5 = 0; var5 < this.field1129.length; var5++) {
            if (arg1.length <= var5) {
                return;
            }
            int var6 = class82.field1505[this.method408(var5, 25335)];
            if (var6 > 0) {
                arg0.method1920((byte) 114, (long) arg1[var5], var6);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(B)V")
    public static final void method415(byte arg0) {
        class250.field4504.method1570((byte) 116);
        field1133++;
        int var1 = class250.field4504.method1569(false, 8);
        if (var1 < class72.field1299) {
            for (int var2 = var1; var2 < class72.field1299; var2++) {
                class18.field235[class276.field4938++] = class58.field995[var2];
            }
        }
        if (var1 > class72.field1299) {
            throw new RuntimeException("gnpov1");
        }
        class72.field1299 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class58.field995[var3];
            class227 var5 = class155.field2709[var4];
            int var6 = class250.field4504.method1569(false, 1);
            if (var6 == 0) {
                class58.field995[class72.field1299++] = var4;
                var5.field3793 = class275.field4921;
            } else {
                int var7 = class250.field4504.method1569(false, 2);
                if (var7 == 0) {
                    class58.field995[class72.field1299++] = var4;
                    var5.field3793 = class275.field4921;
                    class264.field4708[class138.field2407++] = var4;
                } else if (var7 == 1) {
                    class58.field995[class72.field1299++] = var4;
                    var5.field3793 = class275.field4921;
                    int var8 = class250.field4504.method1569(false, 3);
                    var5.method1489(var8, 1, 13269);
                    int var9 = class250.field4504.method1569(false, 1);
                    if (var9 == 1) {
                        class264.field4708[class138.field2407++] = var4;
                    }
                } else if (var7 == 2) {
                    class58.field995[class72.field1299++] = var4;
                    var5.field3793 = class275.field4921;
                    if (class250.field4504.method1569(false, 1) == 1) {
                        int var11 = class250.field4504.method1569(false, 3);
                        var5.method1489(var11, 2, 13269);
                        int var12 = class250.field4504.method1569(false, 3);
                        var5.method1489(var12, 2, 13269);
                    } else {
                        int var10 = class250.field4504.method1569(false, 3);
                        var5.method1489(var10, 0, 13269);
                    }
                    int var13 = class250.field4504.method1569(false, 1);
                    if (var13 == 1) {
                        class264.field4708[class138.field2407++] = var4;
                    }
                } else if (var7 == 3) {
                    class18.field235[class276.field4938++] = var4;
                }
            }
        }
        if (arg0 <= 40) {
            field1128 = null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field1148[var1] = var0 / 4;
        }
    }
}
