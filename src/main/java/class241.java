import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class241 {

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Lgb;")
    public static class149 field3722 = new class149();

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static volatile int field3728 = 0;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field3731 = 0;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "[C")
    public static char[] field3733 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public int field3719;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public int field3720;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Luf;")
    public static class176 field3729;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BILf;)V")
    private final void method1625(byte arg0, int arg1, class37 arg2) {
        if (arg1 == 1) {
            this.field3719 = arg2.method293(-119);
            this.field3721 = arg2.method333((byte) -59);
            this.field3720 = arg2.method333((byte) -59);
        }
        if (arg0 != -35) {
            field3728 = -74;
        }
        field3725++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lp;Lp;Z)V")
    public static final void method1626(class292 arg0, class292 arg1, boolean arg2) {
        if (arg1.field4596 != null) {
            arg1.method1964(12213);
        }
        arg1.field4599 = arg0.field4599;
        if (arg2) {
            method1627((byte) 125);
        }
        field3727++;
        arg1.field4596 = arg0;
        arg1.field4596.field4599 = arg1;
        arg1.field4599.field4596 = arg1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static final void method1627(byte arg0) {
        field3726++;
        class92.field1465.method1782(-124);
        if (arg0 >= -72) {
            field3728 = -20;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method1628(int arg0) {
        if (arg0 <= -89) {
            field3729 = null;
            field3722 = null;
            field3733 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static final void method1629(int arg0) {
        field3723++;
        for (int var1 = 0; var1 < class88.field1443; var1++) {
            int var10002 = class48.field786[var1]--;
            if (class48.field786[var1] >= -10) {
                class27 var3 = class163.field2482[var1];
                if (var3 == null) {
                    var3 = class27.method215(class72.field1152, class94.field1528[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class48.field786[var1] += var3.method217();
                    class163.field2482[var1] = var3;
                }
                if (class48.field786[var1] < 0) {
                    int var10;
                    if (class206.field3199[var1] == 0) {
                        var10 = class1.field15[var1] * class63.field1011 >> 8;
                    } else {
                        int var4 = (class206.field3199[var1] & 0xFF) * 128;
                        int var5 = class206.field3199[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class261.field4058.field4176;
                        int var7 = (class206.field3199[var1] & 0xFF38) >> 8;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var8 = var7 * 128 + 64 - class261.field4058.field4123;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var6 - 128;
                        if (var9 > var4) {
                            class48.field786[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class253.field3896 * class1.field15[var1] / var4 >> 8;
                    }
                    if (var10 > 0) {
                        class192 var11 = var3.method216().method1295(class140.field2156);
                        class82 var12 = class82.method671(var11, 100, var10);
                        var12.method667(class94.field1517[var1] - 1);
                        class39.field661.method722(var12);
                    }
                    class48.field786[var1] = -100;
                }
            } else {
                class88.field1443--;
                for (int var2 = var1; var2 < class88.field1443; var2++) {
                    class94.field1528[var2] = class94.field1528[var2 + 1];
                    class163.field2482[var2] = class163.field2482[var2 + 1];
                    class94.field1517[var2] = class94.field1517[var2 + 1];
                    class48.field786[var2] = class48.field786[var2 + 1];
                    class206.field3199[var2] = class206.field3199[var2 + 1];
                    class1.field15[var2] = class1.field15[var2 + 1];
                }
                var1--;
            }
        }
        if (class28.field421 && !class219.method1457(-77)) {
            if (class259.field3985 != 0 && class295.field4633 != -1) {
                class266.method1815(false, class158.field2427, 0, class295.field4633, class259.field3985, arg0 + 23441);
            }
            class28.field421 = false;
        } else if (class259.field3985 != 0 && class295.field4633 != -1 && !class219.method1457(-44)) {
            class292.field4607.method1251(7, (byte) -80);
            class121.field1861++;
            class292.field4607.method289(class295.field4633, arg0 ^ 0x3482);
            class295.field4633 = -1;
        }
        if (arg0 != -13441) {
            field3722 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([BB)[B")
    public static final byte[] method1630(byte[] arg0, byte arg1) {
        field3732++;
        class37 var2 = new class37(arg0);
        if (arg1 < 22) {
            method1626((class292) null, (class292) null, false);
        }
        int var3 = var2.method333((byte) -59);
        int var4 = var2.method307(-90);
        if (var4 < 0 || !(class267.field4262 == 0 || class267.field4262 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method290(var7, var4, 0, (byte) -113);
            return var7;
        } else {
            int var5 = var2.method307(-123);
            if (var5 < 0 || !(class267.field4262 == 0 || var5 <= class267.field4262)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class279.method1867(var6, var5, arg0, var4, 9);
            } else {
                class25.field384.method1282(var2, (byte) -104, var6);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lf;B)V")
    public final void method1631(class37 arg0, byte arg1) {
        field3724++;
        while (true) {
            int var3 = arg0.method333((byte) -59);
            if (var3 == 0) {
                if (arg1 >= -87) {
                    field3733 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method1625((byte) -35, var3, arg0);
        }
    }
}
