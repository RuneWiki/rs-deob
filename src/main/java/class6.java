import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class124 {

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "Z")
    public boolean field135 = false;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "I")
    public int field147 = 2;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public int field134 = -1;

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "I")
    public int field154 = -1;

    @OriginalMember(owner = "client!ae", name = "jb", descriptor = "I")
    public int field158 = -1;

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "I")
    public int field150 = 99;

    @OriginalMember(owner = "client!ae", name = "ob", descriptor = "I")
    public int field163 = 5;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    public int field142 = -1;

    @OriginalMember(owner = "client!ae", name = "kb", descriptor = "I")
    public int field159 = -1;

    @OriginalMember(owner = "client!ae", name = "eb", descriptor = "Lpe;")
    public static class109 field153 = class141.method1120("Lade Titelbild )2 ", 0);

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "Lpe;")
    public static class109 field148 = class141.method1120("<col=00ffff>", 0);

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "Lpe;")
    public static class109 field152 = class141.method1120("Keine Antwort vom Server)3", 0);

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
    public static int field145 = 0;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "Lpe;")
    public static class109 field138 = class141.method1120("Lade Wordpack )2 ", 0);

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!ae", name = "hb", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!ae", name = "ib", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!ae", name = "mb", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ae", name = "nb", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!ae", name = "qb", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ae", name = "gb", descriptor = "Le;")
    public static class29 field155;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "[I")
    public int[] field137;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "[I")
    private int[] field143;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "[I")
    public int[] field144;

    @OriginalMember(owner = "client!ae", name = "lb", descriptor = "[I")
    private int[] field160;

    @OriginalMember(owner = "client!ae", name = "pb", descriptor = "[I")
    public int[] field164;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "[[[I")
    public static int[][][] field133;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lwb;II)Lwb;")
    public final class155 method54(class155 arg0, int arg1, int arg2) {
        field156++;
        int var4 = this.field144[arg2];
        class47 var5 = class11.method95(var4 >> 16, (byte) 23);
        int var6 = var4 & arg1;
        if (var5 == null) {
            return arg0.method1214(true);
        }
        int var7 = 0;
        class47 var8 = null;
        if (this.field143 != null && arg2 < this.field143.length) {
            int var9 = this.field143[arg2];
            var8 = class11.method95(var9 >> 16, (byte) 23);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class155 var11 = arg0.method1214(!var5.method417(var6, -1));
            var11.method1212(var5, var6);
            return var11;
        } else {
            class155 var10 = arg0.method1214(!var5.method417(var6, -1) & !var8.method417(var7, -1));
            var10.method1212(var5, var6);
            var10.method1212(var8, var7);
            return var10;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lae;IIILwb;)Lwb;")
    public final class155 method55(class6 arg0, int arg1, int arg2, int arg3, class155 arg4) {
        field141++;
        int var6 = this.field144[arg2];
        class47 var7 = class11.method95(var6 >> 16, (byte) 23);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg0.method57(arg3, (byte) 68, arg4);
        }
        int var9 = arg0.field144[arg3];
        class47 var10 = class11.method95(var9 >> 16, (byte) 23);
        if (arg1 != -2711) {
            this.field159 = -92;
        }
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class155 var12 = arg4.method1214(!var7.method417(var8, -1));
            var12.method1212(var7, var8);
            return var12;
        } else {
            class155 var13 = arg4.method1214(!var7.method417(var8, -1) & !var10.method417(var11, arg1 + 2710));
            var13.method1221(var7, var8, var10, var11, this.field160);
            return var13;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
    public static void method56(int arg0) {
        field133 = null;
        field148 = null;
        field152 = null;
        field138 = null;
        field153 = null;
        field155 = null;
        if (arg0 != -20101) {
            method63(66, -47, -7, 84, -85, -81, null, (byte) 103);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBLwb;)Lwb;")
    public final class155 method57(int arg0, byte arg1, class155 arg2) {
        int var4 = this.field144[arg0];
        field139++;
        if (arg1 != 68) {
            this.method57(-27, (byte) -20, null);
        }
        class47 var5 = class11.method95(var4 >> 16, (byte) 23);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method1214(true);
        } else {
            class155 var7 = arg2.method1214(!var5.method417(var6, -1));
            var7.method1212(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Lod;")
    public static final class101 method58(byte arg0, int arg1) {
        if (arg0 < 39) {
            return null;
        }
        field157++;
        class101 var2 = (class101) class20.field495.method93((byte) 103, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class114.field2515.method742(arg1, 20, 3);
        class101 var4 = new class101();
        if (var3 != null) {
            var4.method816(new class13(var3), (byte) -122);
        }
        class20.field495.method97((long) arg1, (byte) 126, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILwb;I)Lwb;")
    public final class155 method59(int arg0, int arg1, class155 arg2, int arg3) {
        int var5 = this.field144[arg3];
        field151++;
        class47 var6 = class11.method95(var5 >> 16, (byte) 23);
        int var7 = var5 & 0xFFFF;
        if (arg0 != 15091) {
            field148 = null;
        }
        if (var6 == null) {
            return arg2.method1214(true);
        }
        int var8 = arg1 & 0x3;
        class155 var9 = arg2.method1214(!var6.method417(var7, -1));
        if (var8 == 1) {
            var9.method1219();
        } else if (var8 == 2) {
            var9.method1203();
        } else if (var8 == 3) {
            var9.method1210();
        }
        var9.method1212(var6, var7);
        if (var8 == 1) {
            var9.method1210();
        } else if (var8 == 2) {
            var9.method1203();
        } else if (var8 == 3) {
            var9.method1219();
        }
        return var9;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILwb;)Lwb;")
    public final class155 method60(int arg0, int arg1, class155 arg2) {
        field161++;
        int var4 = this.field144[arg1];
        if (arg0 != 1824222512) {
            this.method55(null, 110, -114, -20, null);
        }
        class47 var5 = class11.method95(var4 >> 16, (byte) 23);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method1201(true);
        } else {
            class155 var7 = arg2.method1201(!var5.method417(var6, -1));
            var7.method1212(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)V")
    public final void method61(byte arg0) {
        if (this.field142 == -1) {
            if (this.field160 == null) {
                this.field142 = 0;
            } else {
                this.field142 = 2;
            }
        }
        if (this.field154 == -1) {
            if (this.field160 == null) {
                this.field154 = 0;
            } else {
                this.field154 = 2;
            }
        }
        field165++;
        if (arg0 <= 0) {
            this.method60(16, -88, null);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILna;ZLna;I)Lge;")
    public static final class47 method62(int arg0, class91 arg1, boolean arg2, class91 arg3, int arg4) {
        int[] var5 = arg1.method749(arg4, -1);
        field149++;
        boolean var6 = true;
        int var7 = 0;
        if (arg0 != 5) {
            method62(127, null, true, null, 33);
        }
        while (var7 < var5.length) {
            byte[] var8 = arg1.method764((byte) 3, var5[var7], arg4);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg2) {
                    var10 = arg3.method764((byte) 113, var9, 0);
                } else {
                    var10 = arg3.method764((byte) -71, 0, var9);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
            var7++;
        }
        if (!var6) {
            return null;
        }
        try {
            return new class47(arg1, arg3, arg4, arg2);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIILwa;B)V")
    public static final void method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class154 arg6, byte arg7) {
        if (class116.field2575) {
            class45.field954 = 32;
        } else {
            class45.field954 = 0;
        }
        if (arg7 <= 83) {
            field153 = null;
        }
        class116.field2575 = false;
        if (class19.field467 != 0) {
            if (arg1 >= arg2 && arg2 + 16 > arg1 && arg0 <= arg4 && arg4 < arg0 + 16) {
                arg6.field3417 -= 4;
                class138.method1092(0, arg6);
            } else if (arg1 >= arg2 && arg2 + 16 > arg1 && arg4 >= arg0 + arg5 - 16 && arg0 + arg5 > arg4) {
                arg6.field3417 += 4;
                class138.method1092(0, arg6);
            } else if (arg2 - class45.field954 <= arg1 && class45.field954 + arg2 + 16 > arg1 && arg4 >= arg0 + 16 && arg4 < arg0 + arg5 - 16) {
                int var8 = (arg5 - 32) * arg5 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg5 - var8 - 32;
                int var10 = arg4 - arg0 - var8 / 2 - 16;
                arg6.field3417 = (arg3 - arg5) * var10 / var9;
                class138.method1092(0, arg6);
                class116.field2575 = true;
            }
        }
        field140++;
        if (class154.field3519 == 0) {
            return;
        }
        int var11 = arg6.field3427;
        if (arg1 >= arg2 - var11 && arg4 >= arg0 && arg2 + 16 > arg1 && arg4 <= arg0 + arg5) {
            arg6.field3417 += class154.field3519 * 45;
            class138.method1092(0, arg6);
            return;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLbe;)V")
    public final void method64(byte arg0, class13 arg1) {
        while (true) {
            int var3 = arg1.method142(27467);
            if (var3 == 0) {
                int var4 = -18 % ((arg0 - 78) / 42);
                field162++;
                return;
            }
            this.method65(false, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLbe;I)V")
    private final void method65(boolean arg0, class13 arg1, int arg2) {
        if (arg0) {
            field153 = null;
        }
        if (arg2 == 1) {
            int var4 = arg1.method105(1375221240);
            this.field164 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field164[var5] = arg1.method105(1375221240);
            }
            this.field144 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field144[var6] = arg1.method105(1375221240);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field144[var7] += arg1.method105(1375221240) << 16;
            }
        } else if (arg2 == 2) {
            this.field134 = arg1.method105(1375221240);
        } else if (arg2 == 3) {
            int var8 = arg1.method142(27467);
            this.field160 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field160[var9] = arg1.method142(27467);
            }
            this.field160[var8] = 9999999;
        } else if (arg2 == 4) {
            this.field135 = true;
        } else if (arg2 == 5) {
            this.field163 = arg1.method142(27467);
        } else if (arg2 == 6) {
            this.field158 = arg1.method105(1375221240);
        } else if (arg2 == 7) {
            this.field159 = arg1.method105(1375221240);
        } else if (arg2 == 8) {
            this.field150 = arg1.method142(27467);
        } else if (arg2 == 9) {
            this.field142 = arg1.method142(27467);
        } else if (arg2 == 10) {
            this.field154 = arg1.method142(27467);
        } else if (arg2 == 11) {
            this.field147 = arg1.method142(27467);
        } else if (arg2 == 12) {
            int var12 = arg1.method142(27467);
            this.field143 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field143[var13] = arg1.method105(1375221240);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field143[var14] += arg1.method105(1375221240) << 16;
            }
        } else if (arg2 == 13) {
            int var10 = arg1.method142(27467);
            this.field137 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field137[var11] = arg1.method149(true);
            }
        }
        field136++;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)I")
    public static final int method66(int arg0) {
        if (arg0 != 1912164071) {
            field153 = null;
        }
        field146++;
        int var1 = class126.method1019(class154.field3518, class85.field1795, 1, class75.field1513);
        return var1 - class102.field2149 >= 800 || (class107.field2249[class75.field1513][class85.field1795 >> 7][class154.field3518 >> 7] & 0x4) == 0 ? 3 : class75.field1513;
    }
}
