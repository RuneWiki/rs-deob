import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class52 {

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public int field756 = -1;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
    private int[] field747 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Z")
    public boolean field745 = false;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static volatile int field749 = 0;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field754 = 0;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "Lcc;")
    public static class216 field765 = new class216(64);

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field766 = 0;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "[I")
    private int[] field760;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "[S")
    private short[] field748;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "[S")
    private short[] field755;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[S")
    private short[] field759;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "[S")
    private short[] field762;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
    public static void method392(boolean arg0) {
        field765 = null;
        if (!arg0) {
            method392(true);
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)Z")
    public final boolean method393(boolean arg0) {
        field744++;
        boolean var2 = arg0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field747[var3] != -1 && !class90.field1334.method650(0, this.field747[var3], -105)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Z")
    public final boolean method394(int arg0) {
        field746++;
        if (this.field760 == null) {
            return true;
        }
        if (arg0 < 57) {
            this.field759 = null;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field760.length; var3++) {
            if (!class90.field1334.method650(0, this.field760[var3], -69)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public static final void method395(int arg0) {
        field752++;
        if (arg0 != 0) {
            method392(true);
        }
        class18.field195.method1556((byte) 97);
        class150.field2441.method1556((byte) 103);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V")
    public static final void method396(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -1) {
            return;
        }
        if (arg3 < arg2) {
            for (int var5 = arg3; var5 < arg2; var5++) {
                class240.field3831[var5][arg4] = arg0;
            }
        } else {
            for (int var6 = arg2; var6 < arg3; var6++) {
                class240.field3831[var6][arg4] = arg0;
            }
        }
        field764++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lv;IB)V")
    private final void method397(class152 arg0, int arg1, byte arg2) {
        int var4 = 78 % ((arg2 + 16) / 51);
        field761++;
        if (arg1 == 1) {
            this.field756 = arg0.method1111(255);
        } else if (arg1 == 2) {
            int var5 = arg0.method1111(255);
            this.field760 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field760[var6] = arg0.method1126(false);
            }
        } else if (arg1 == 3) {
            this.field745 = true;
        } else if (arg1 == 40) {
            int var9 = arg0.method1111(255);
            this.field759 = new short[var9];
            this.field748 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field748[var10] = (short) arg0.method1126(false);
                this.field759[var10] = (short) arg0.method1126(false);
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method1111(255);
            this.field755 = new short[var7];
            this.field762 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field755[var8] = (short) arg0.method1126(false);
                this.field762[var8] = (short) arg0.method1126(false);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field747[arg1 - 60] = arg0.method1126(false);
            return;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lv;I)V")
    public final void method398(class152 arg0, int arg1) {
        int var3 = 58 % ((26 - arg1) / 36);
        field758++;
        while (true) {
            int var4 = arg0.method1111(255);
            if (var4 == 0) {
                return;
            }
            this.method397(arg0, var4, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
    public static final void method399(int arg0) {
        field757++;
        int var1 = -123 / ((-arg0 - 71) / 38);
        for (class274 var2 = (class274) class105.field1528.method1384(2); var2 != null; var2 = (class274) class105.field1528.method1388((byte) 82)) {
            if (var2.field4396 > 0) {
                var2.field4396--;
            }
            if (var2.field4396 != 0) {
                if (var2.field4393 > 0) {
                    var2.field4393--;
                }
                if (var2.field4393 == 0 && var2.field4402 >= 1 && var2.field4399 >= 1 && var2.field4402 <= 102 && var2.field4399 <= 102 && (var2.field4398 < 0 || class101.method766(var2.field4398, var2.field4397, false))) {
                    class115.method847(var2.field4391, var2.field4397, var2.field4409, (byte) -85, var2.field4398, var2.field4402, var2.field4399, var2.field4394);
                    var2.field4393 = -1;
                    if (var2.field4405 == var2.field4398 && var2.field4405 == -1) {
                        var2.method1922(-1);
                    } else if (var2.field4405 == var2.field4398 && var2.field4404 == var2.field4394 && var2.field4403 == var2.field4397) {
                        var2.method1922(-1);
                    }
                }
            } else if (var2.field4405 < 0 || class101.method766(var2.field4405, var2.field4403, false)) {
                class115.method847(var2.field4391, var2.field4403, var2.field4409, (byte) -52, var2.field4405, var2.field4402, var2.field4399, var2.field4404);
                var2.method1922(-1);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)Laa;")
    public final class173 method400(int arg0) {
        int var2 = arg0;
        field750++;
        class173[] var3 = new class173[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field747[var4] != -1) {
                var3[var2++] = class173.method1281(class90.field1334, this.field747[var4], 0);
            }
        }
        class173 var5 = new class173(var3, var2);
        if (this.field748 != null) {
            for (int var6 = 0; var6 < this.field748.length; var6++) {
                var5.method1283(this.field748[var6], this.field759[var6]);
            }
        }
        if (this.field755 != null) {
            for (int var7 = 0; var7 < this.field755.length; var7++) {
                var5.method1302(this.field755[var7], this.field762[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(Z)Laa;")
    public final class173 method401(boolean arg0) {
        field763++;
        if (this.field760 == null) {
            return null;
        }
        class173[] var2 = new class173[this.field760.length];
        for (int var3 = 0; var3 < this.field760.length; var3++) {
            var2[var3] = class173.method1281(class90.field1334, this.field760[var3], 0);
        }
        if (!arg0) {
            this.field755 = null;
        }
        class173 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class173(var2, var2.length);
        }
        if (this.field748 != null) {
            for (int var5 = 0; var5 < this.field748.length; var5++) {
                var4.method1283(this.field748[var5], this.field759[var5]);
            }
        }
        if (this.field755 != null) {
            for (int var6 = 0; var6 < this.field755.length; var6++) {
                var4.method1302(this.field755[var6], this.field762[var6]);
            }
        }
        return var4;
    }
}
