import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class87 {

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "Lqt;")
    public static class459 field1409 = new class459(22, -1);

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "I")
    public static int field1412 = 0;

    @OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
    public static int field1413 = 1401;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!hw", name = "o", descriptor = "[[S")
    public static short[][] field1414;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIII)Z", line = 4)
    public final boolean method648(int arg0, int arg1, int arg2, int arg3) {
        field1401++;
        int var5 = this.field1405;
        if (this.field1402 == arg1 && this.field1405 == 0) {
            return false;
        }
        if (arg0 != -2497) {
            field1413 = -57;
        }
        boolean var8;
        if (this.field1405 == 0) {
            if (arg1 > this.field1402 && (this.field1402 + arg2) >= arg1 || arg1 < this.field1402 && this.field1402 - arg2 <= arg1) {
                this.field1402 = arg1;
                return false;
            }
            var8 = true;
        } else if (this.field1405 > 0 && arg1 > this.field1402) {
            int var6 = this.field1405 * this.field1405 / (arg2 * 2);
            int var7 = this.field1402 + var6;
            if (var7 < arg1 && this.field1402 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field1405 < 0 && arg1 < this.field1402) {
            int var9 = this.field1405 * this.field1405 / (arg2 * 2);
            int var10 = this.field1402 - var9;
            if (arg1 < var10 && var10 <= this.field1402) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (arg1 <= this.field1402) {
                this.field1405 -= arg2;
                if (arg3 != 0 && (-arg3) > this.field1405) {
                    this.field1405 = -arg3;
                }
            } else {
                this.field1405 += arg2;
                if (arg3 != 0 && arg3 < this.field1405) {
                    this.field1405 = arg3;
                }
            }
            if (this.field1405 != var5) {
                int var11 = this.field1405 * this.field1405 / (arg2 * 2);
                if (this.field1402 >= arg1) {
                    if (this.field1402 > arg1 && (this.field1402 - var11) < arg1) {
                        this.field1405 = var5;
                    }
                } else if (arg1 < (this.field1402 + var11)) {
                    this.field1405 = var5;
                }
            }
        } else if (this.field1405 > 0) {
            this.field1405 -= arg2;
            if (this.field1405 < 0) {
                this.field1405 = 0;
            }
        } else {
            this.field1405 += arg2;
            if (this.field1405 > 0) {
                this.field1405 = 0;
            }
        }
        this.field1402 += this.field1405 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZ)V", line = 138)
    public final void method649(int arg0, boolean arg1) {
        if (!arg1) {
            field1409 = null;
        }
        field1400++;
        this.field1402 = arg0;
        this.field1405 = 0;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)I", line = 155)
    public final int method650(byte arg0) {
        field1403++;
        if (arg0 != -6) {
            method653(15);
        }
        return this.field1402 & 0x3FFF;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V", line = 167)
    public final void method651(int arg0) {
        field1408++;
        this.field1402 &= arg0;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZI)Z", line = 177)
    public static final boolean method652(int arg0, boolean arg1, int arg2) {
        field1406++;
        if (!arg1) {
            method655(null, 29);
        }
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V", line = 193)
    public static void method653(int arg0) {
        field1414 = null;
        field1409 = null;
        if (arg0 != -24755) {
            field1409 = null;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)Z", line = 208)
    public static final boolean method654(int arg0, int arg1, int arg2) {
        field1410++;
        if (!class248.field3714) {
            return false;
        }
        int var3 = arg1 >> 16;
        if (arg0 != -23449) {
            return true;
        }
        int var4 = arg1 & 0xFFFF;
        if (class283.field4217[var3] == null || class283.field4217[var3][var4] == null) {
            return false;
        }
        class198 var5 = class283.field4217[var3][var4];
        if (arg2 == -1 && var5.field2941 == 0) {
            for (class341 var6 = (class341) class258.field3829.method863(arg0 + 23448); var6 != null; var6 = (class341) class258.field3829.method865(-1)) {
                if (var6.field5039 == 3 || var6.field5039 == 1008 || var6.field5039 == 51 || var6.field5039 == 6 || var6.field5039 == 11) {
                    for (class198 var7 = class154.method1087(var6.field5046, 2); var7 != null; var7 = class3.method10(var7, (byte) -34)) {
                        if (var5.field3016 == var7.field3016) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class341 var8 = (class341) class258.field3829.method863(-1); var8 != null; var8 = (class341) class258.field3829.method865(-1)) {
                if (var8.field5040 == arg2 && var5.field3016 == var8.field5046 && (var8.field5039 == 3 || var8.field5039 == 1008 || var8.field5039 == 51 || var8.field5039 == 6 || var8.field5039 == 11)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lci;I)V", line = 289)
    public static final void method655(class320 arg0, int arg1) {
        class75.field1237 = arg0;
        if (arg1 <= 104) {
            field1414 = null;
        }
        field1404++;
    }
}
