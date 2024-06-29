import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class252 extends class212 {

    @OriginalMember(owner = "client!db", name = "M", descriptor = "Lqe;")
    public static class168 field4352 = class66.method448("RuneScape wird geladen )2 bitte warten)3)3)3", 40);

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "Lqe;")
    public static class168 field4366 = class66.method448("<col=00ffff>", 122);

    @OriginalMember(owner = "client!db", name = "db", descriptor = "[Luc;")
    public static class169[] field4369 = new class169[5000];

    @OriginalMember(owner = "client!db", name = "S", descriptor = "Lqe;")
    public static class168 field4358 = class66.method448(":tradereq:", 14);

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "Lqe;")
    public static class168 field4364 = class66.method448("::fpson", 46);

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
    public static int field4370 = 0;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "Lqe;")
    public class168 field4356;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "[I")
    public int[] field4349;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "[I")
    public int[] field4350;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "[I")
    public int[] field4361;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "[I")
    public int[] field4365;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "[[[B")
    public static byte[][][] field4362;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
    public static final void method1658(byte arg0) {
        field4359++;
        if (!class84.field1277) {
            return;
        }
        if (arg0 != 86) {
            method1663(-23);
        }
        class129 var1 = class58.method404(class96.field1520, false, class116.field1901);
        if (var1 != null && var1.field2192 != null) {
            class147 var2 = new class147();
            var2.field2552 = var1;
            var2.field2566 = var1.field2192;
            class82.method545(var2, (byte) 106);
        }
        class84.field1277 = false;
        class65.method443(var1, 0);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4357++;
        class23 var10 = null;
        class23 var11 = (class23) class194.field3386.method315(-31594);
        if (arg1 != 0) {
            field4358 = null;
        }
        while (var11 != null) {
            if (var11.field259 == arg3 && var11.field270 == arg7 && var11.field260 == arg0 && var11.field268 == arg8) {
                var10 = var11;
                break;
            }
            var11 = (class23) class194.field3386.method312(1012);
        }
        if (var10 == null) {
            var10 = new class23();
            var10.field260 = arg0;
            var10.field270 = arg7;
            var10.field268 = arg8;
            var10.field259 = arg3;
            class243.method1596(438014688, var10);
            class194.field3386.method311((byte) 16, var10);
        }
        var10.field266 = arg5;
        var10.field272 = arg9;
        var10.field271 = arg4;
        var10.field261 = arg2;
        var10.field262 = arg6;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)I")
    public final int method1660(int arg0, int arg1) {
        field4360++;
        if (this.field4349 == null) {
            return -1;
        }
        if (arg1 > -12) {
            this.field4356 = null;
        }
        for (int var3 = 0; var3 < this.field4349.length; var3++) {
            if (this.field4361[var3] == arg0) {
                return this.field4349[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILqe;)Z")
    public static final boolean method1661(int arg0, class168 arg1) {
        field4354++;
        if (arg0 >= -122) {
            return true;
        } else if (arg1 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class103.field1662; var2++) {
                if (arg1.method1106(-122, class32.field382[var2])) {
                    return true;
                }
            }
            return arg1.method1106(-122, class7.field85.field2000);
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)I")
    public static final int method1662(byte arg0) {
        field4363++;
        if (arg0 != -88) {
            method1663(-88);
        }
        return 2;
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
    public static void method1663(int arg0) {
        field4366 = null;
        field4369 = null;
        field4352 = null;
        if (arg0 != -1) {
            field4369 = null;
        }
        field4358 = null;
        field4362 = null;
        field4364 = null;
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
    public final void method1664(int arg0) {
        if (this.field4349 != null) {
            for (int var2 = 0; var2 < this.field4349.length; var2++) {
                this.field4349[var2] = class102.method675(this.field4349[var2], 32768);
            }
        }
        if (this.field4365 != null) {
            for (int var3 = 0; var3 < this.field4365.length; var3++) {
                this.field4365[var3] = class102.method675(this.field4365[var3], 32768);
            }
        }
        int var4 = 93 / ((-arg0 - 44) / 45);
        field4368++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILnh;I)V")
    private final void method1665(int arg0, class112 arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        if (arg0 == 1) {
            this.field4356 = arg1.method751((byte) -78);
        } else if (arg0 == 2) {
            int var7 = arg1.method758(true);
            this.field4350 = new int[var7];
            this.field4365 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4365[var8] = arg1.method731(false);
                int var9 = arg1.method758(true);
                if (var9 == 0) {
                    this.field4350[var8] = -1;
                } else {
                    this.field4350[var8] = var9;
                }
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method758(true);
            this.field4361 = new int[var4];
            this.field4349 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4349[var5] = arg1.method731(false);
                int var6 = arg1.method758(true);
                if (var6 == 0) {
                    this.field4361[var5] = -1;
                } else {
                    this.field4361[var5] = var6;
                }
            }
        }
        field4348++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lnh;B)V")
    public final void method1666(class112 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method758(true);
            if (var3 == 0) {
                field4355++;
                if (arg1 < 93) {
                    this.method1660(-102, -54);
                    return;
                }
                return;
            }
            this.method1665(var3, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(II)I")
    public final int method1667(int arg0, int arg1) {
        field4351++;
        if (this.field4365 == null) {
            return -1;
        } else if (arg1 == -1) {
            for (int var3 = 0; var3 < this.field4365.length; var3++) {
                if (this.field4350[var3] == arg0) {
                    return this.field4365[var3];
                }
            }
            return -1;
        } else {
            return -19;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)Lf;")
    public static final class182 method1668(int arg0, byte arg1) {
        field4367++;
        class182 var2 = (class182) class131.field2313.method1499(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class142.field2500.method1712(0, arg0, -1);
        if (var3 == null) {
            return null;
        }
        class182 var4 = new class182();
        class112 var5 = new class112(var3);
        var5.field1821 = var5.field1780.length - 2;
        int var6 = var5.method731(false);
        int var7 = var5.field1780.length - var6 - 2 - 12;
        var5.field1821 = var7;
        int var8 = var5.method769((byte) -86);
        var4.field3232 = var5.method731(false);
        var4.field3233 = var5.method731(false);
        var4.field3231 = var5.method731(false);
        var4.field3227 = var5.method731(false);
        if (arg1 != -56) {
            method1668(43, (byte) 24);
        }
        int var9 = var5.method758(true);
        if (var9 > 0) {
            var4.field3230 = new class236[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method731(false);
                class236 var12 = new class236(class98.method644((byte) 86, var11));
                var4.field3230[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method769((byte) -86);
                    int var14 = var5.method769((byte) -86);
                    var12.method1533((long) var13, -120, new class172(var14));
                }
            }
        }
        int var15 = 0;
        var5.field1821 = 0;
        var4.field3229 = var5.method724((byte) -87);
        var4.field3235 = new int[var8];
        var4.field3234 = new class168[var8];
        var4.field3228 = new int[var8];
        while (var7 > var5.field1821) {
            int var16 = var5.method731(false);
            if (var16 == 3) {
                var4.field3234[var15] = var5.method751((byte) -126);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field3228[var15] = var5.method758(true);
            } else {
                var4.field3228[var15] = var5.method769((byte) -86);
            }
            var4.field3235[var15++] = var16;
        }
        class131.field2313.method1502((byte) -18, var4, (long) arg0);
        return var4;
    }
}
