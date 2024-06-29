import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class245 {

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public int field3926 = -1;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "[I")
    private int[] field3919 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Z")
    public boolean field3928 = false;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field3920 = 0;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Z")
    public static boolean field3915 = false;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "[I")
    private int[] field3918;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "[S")
    private short[] field3914;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "[S")
    private short[] field3927;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "[S")
    private short[] field3931;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "[S")
    private short[] field3937;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "[[[B")
    public static byte[][][] field3933;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)Lmb;")
    public final class160 method1649(boolean arg0) {
        field3934++;
        if (!arg0) {
            this.method1657((byte) 25);
        }
        class160[] var2 = new class160[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3919[var4] != -1) {
                var2[var3++] = class160.method1079(class54.field740, this.field3919[var4], 0);
            }
        }
        class160 var5 = new class160(var2, var3);
        if (this.field3931 != null) {
            for (int var6 = 0; var6 < this.field3931.length; var6++) {
                var5.method1090(this.field3931[var6], this.field3914[var6]);
            }
        }
        if (this.field3927 != null) {
            for (int var7 = 0; var7 < this.field3927.length; var7++) {
                var5.method1088(this.field3927[var7], this.field3937[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)V")
    public static final void method1650(int arg0, byte arg1) {
        field3929++;
        if (class203.field3182 == arg0) {
            return;
        }
        if (class203.field3182 == 0) {
            class68.method466(false);
        }
        if (arg0 == 40) {
            class173.method1217((byte) 44);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        int var3 = 72 / ((4 - arg1) / 53);
        if (arg0 != 40 && class53.field733 != null) {
            class53.field733.method1842(false);
            class53.field733 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class94.field1453 = 0;
            class121.field1761 = 0;
            class285.field4522 = 1;
            class269.field4294 = 0;
            class54.field742 = 1;
            class195.method1353(-120, true);
        }
        if (arg0 == 25 || arg0 == 10) {
            class52.method382(false);
        }
        if (arg0 == 5) {
            class115.method768(class237.field3802, (byte) 10);
        } else {
            class202.method1391((byte) 70);
        }
        boolean var4 = class203.field3182 == 5 || class203.field3182 == 10 || class203.field3182 == 28;
        if (var2 != var4) {
            if (var2) {
                class37.field488 = field3917;
                if (class219.field3553 == 0) {
                    class140.method943((byte) 52, 2);
                } else {
                    class200.method1377(class98.field1509, true, false, field3917, 2, 255, 0);
                }
                class68.field958.method1553(false, (byte) 111);
            } else {
                class140.method943((byte) -123, 2);
                class68.field958.method1553(true, (byte) -50);
            }
        }
        class203.field3182 = arg0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILlj;I)V")
    private final void method1651(int arg0, class25 arg1, int arg2) {
        if (arg0 != -18479) {
            return;
        }
        field3936++;
        if (arg2 == 1) {
            this.field3926 = arg1.method201(255);
        } else if (arg2 == 2) {
            int var4 = arg1.method201(255);
            this.field3918 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3918[var5] = arg1.method190(-3);
            }
        } else if (arg2 == 3) {
            this.field3928 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method201(255);
            this.field3931 = new short[var6];
            this.field3914 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3931[var7] = (short) arg1.method190(arg0 + 18476);
                this.field3914[var7] = (short) arg1.method190(-3);
            }
        } else if (arg2 == 41) {
            int var8 = arg1.method201(arg0 + 18734);
            this.field3927 = new short[var8];
            this.field3937 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3927[var9] = (short) arg1.method190(-3);
                this.field3937[var9] = (short) arg1.method190(-3);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field3919[arg2 - 60] = arg1.method190(-3);
            return;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)Z")
    public final boolean method1652(boolean arg0) {
        field3930++;
        boolean var2 = true;
        if (arg0) {
            this.method1649(true);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3919[var3] != -1 && !class54.field740.method835(this.field3919[var3], 0, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static final void method1653(byte arg0) {
        field3921++;
        while (class235.field3766.method889(class179.field2793, -91) >= 27) {
            int var1 = class235.field3766.method887(true, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class100.field1566[var1] == null) {
                var2 = true;
                class100.field1566[var1] = new class56();
            }
            class56 var3 = class100.field1566[var1];
            class248.field3967[class236.field3774++] = var1;
            var3.field1210 = class111.field1684;
            if (var3.field793 != null && var3.field793.method924(true)) {
                class5.method29(var3, 25);
            }
            int var4 = class235.field3766.method887(true, 1);
            int var5 = class235.field3766.method887(true, 5);
            int var6 = class235.field3766.method887(true, 1);
            if (var6 == 1) {
                class84.field1316[class164.field2553++] = var1;
            }
            int var7 = class235.field3766.method887(true, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            var3.method411(class252.method1691(class235.field3766.method887(true, 14), (byte) -46), true);
            int var8 = class3.field36[class235.field3766.method887(true, 3)];
            if (var7 > 15) {
                var7 -= 32;
            }
            if (var2) {
                var3.field1211 = var3.field1222 = var8;
            }
            var3.method576(var3.field793.field2012, -125);
            var3.field1289 = var3.field793.field1986;
            var3.field1203 = var3.field793.field2011;
            if (var3.field1289 == 0) {
                var3.field1222 = 0;
            }
            var3.method566(true, class149.field2227.field1257[0] + var5, class149.field2227.field1272[0] + var7, var3.method565((byte) 0), var4 == 1);
            if (var3.field793.method924(true)) {
                class16.method113((class186) null, class276.field4398, var3.field1272[0], var3, 0, (class181) null, var3.field1257[0], (byte) -49);
            }
        }
        class235.field3766.method888((byte) 30);
        if (arg0 > -56) {
            method1650(122, (byte) -82);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
    public static final void method1654(int arg0, int arg1) {
        field3922++;
        field3920--;
        if (field3920 == arg1) {
            return;
        }
        if (arg0 != 5526) {
            method1650(-90, (byte) -36);
        }
        class196.method1355(class96.field1491, arg1 + 1, class96.field1491, arg1, field3920 - arg1);
        class196.method1355(class19.field225, arg1 + 1, class19.field225, arg1, field3920 - arg1);
        class196.method1354(client.field2330, arg1 + 1, client.field2330, arg1, field3920 - arg1);
        class196.method1358(class2.field21, arg1 + 1, class2.field21, arg1, field3920 - arg1);
        class196.method1360(class25.field347, arg1 + 1, class25.field347, arg1, field3920 - arg1);
        class196.method1354(class100.field1553, arg1 + 1, class100.field1553, arg1, field3920 - arg1);
        class196.method1354(class222.field3591, arg1 + 1, class222.field3591, arg1, field3920 - arg1);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)Lgk;")
    public static final class157 method1655(int arg0, int arg1) {
        field3923++;
        if (class287.field4546 && arg1 >= class45.field577 && arg1 <= class187.field2950) {
            if (arg0 != 5) {
                method1655(-26, 114);
            }
            return class80.field1164[arg1 - class45.field577];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILlj;)V")
    public final void method1656(int arg0, class25 arg1) {
        while (true) {
            int var3 = arg1.method201(255);
            if (var3 == 0) {
                if (arg0 > -121) {
                    return;
                }
                field3925++;
                return;
            }
            this.method1651(-18479, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)Lmb;")
    public final class160 method1657(byte arg0) {
        field3932++;
        if (this.field3918 == null) {
            return null;
        }
        class160[] var2 = new class160[this.field3918.length];
        int var3 = 0;
        if (arg0 <= 110) {
            method1650(-5, (byte) -78);
        }
        while (this.field3918.length > var3) {
            var2[var3] = class160.method1079(class54.field740, this.field3918[var3], 0);
            var3++;
        }
        class160 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class160(var2, var2.length);
        }
        if (this.field3931 != null) {
            for (int var5 = 0; var5 < this.field3931.length; var5++) {
                var4.method1090(this.field3931[var5], this.field3914[var5]);
            }
        }
        if (this.field3927 != null) {
            for (int var6 = 0; var6 < this.field3927.length; var6++) {
                var4.method1088(this.field3927[var6], this.field3937[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Z")
    public final boolean method1658(int arg0) {
        field3935++;
        if (this.field3918 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field3918.length; var3++) {
            if (!class54.field740.method835(this.field3918[var3], 0, 0)) {
                var2 = false;
            }
        }
        if (arg0 == -11173) {
            return var2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static void method1659(int arg0) {
        int var1 = -20 % ((54 - arg0) / 56);
        field3933 = null;
    }
}
