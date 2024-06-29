import java.awt.event.ActionEvent;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class69 {

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public int field989;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method488(boolean arg0) {
        class305.field4723.method750((byte) 113);
        if (!arg0) {
            method492(89, (class254) null);
        }
        field983++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 16)
    public static final void method489(int arg0) {
        if (arg0 != -1) {
            method488(true);
        }
        class130.field2003.method752(false);
        field985++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIIIBI)V", line = 29)
    public static final void method490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field982++;
        if (arg2 == arg6 && arg1 == arg3 && arg4 == arg5 && arg0 == arg9) {
            class35.method269(arg4, arg1, arg6, true, arg9, arg7);
        } else {
            int var10 = arg6;
            int var11 = arg1;
            int var12 = arg2 * 3;
            int var13 = arg1 * 3;
            int var14 = arg6 * 3;
            int var15 = arg3 * 3;
            int var16 = arg5 * 3;
            int var17 = arg0 * 3;
            int var18 = arg4 + var12 - var16 - arg6;
            int var19 = var16 + var14 - var12 - var12;
            int var20 = var17 - var15 - (-var13 + var15);
            int var21 = var15 + arg9 - arg1 - var17;
            int var22 = var12 - var14;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var21 * var26;
                int var29 = var19 * var25;
                int var30 = var20 * var25;
                int var31 = var23 * var24;
                int var32 = var22 * var24;
                int var33 = (var28 + var30 + var31 >> 12) + arg1;
                int var34 = (var27 + var29 + var32 >> 12) + arg6;
                class35.method269(var34, var11, var10, true, var33, arg7);
                var11 = var33;
                var10 = var34;
            }
        }
        int var35 = -26 % ((arg8 - 48) / 52);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/Object;Lvl;I)V", line = 107)
    public static final void method491(Object arg0, class6 arg1, int arg2) {
        field987++;
        if (arg1.field92 == null) {
            return;
        }
        for (int var3 = arg2; var3 < 50 && arg1.field92.peekEvent() != null; var3++) {
            class324.method2252(arg2 ^ 0xFFFF9EE3, 1L);
        }
        if (arg0 != null) {
            arg1.field92.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILwm;)V", line = 132)
    public static final void method492(int arg0, class254 arg1) {
        label90: while (true) {
            if (arg1.field3866 < arg1.field3840.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1774((byte) -118) == 1) {
                    var2 = true;
                    var4 = arg1.method1774((byte) -113);
                    var3 = arg1.method1774((byte) -122);
                }
                int var5 = arg1.method1774((byte) 103);
                int var6 = arg1.method1774((byte) -99);
                int var7 = var5 * 64 - class196.field3024;
                int var8 = class176.field2822 + class229.field3494 - var6 * 64 - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && class243.field3691 > var7 + 63 && var8 < class229.field3494) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    int var11 = 0;
                    while (true) {
                        if (var11 >= 64) {
                            continue label90;
                        }
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var4 * 8) <= var11 && var11 < var4 * 8 + 8 && var12 >= (var3 * 8) && var12 < var3 * 8 + 8) {
                                byte var13 = arg1.method1733(2023893896);
                                if (var13 != 0) {
                                    if (class210.field3221[var9][var10] == null) {
                                        class210.field3221[var9][var10] = new byte[4096];
                                    }
                                    class210.field3221[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1733(2023893896);
                                    if (class158.field2408[var9][var10] == null) {
                                        class158.field2408[var9][var10] = new byte[4096];
                                    }
                                    class158.field2408[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                        var11++;
                    }
                }
                int var15 = 0;
                while (true) {
                    if ((var2 ? 64 : 4096) <= var15) {
                        continue label90;
                    }
                    byte var16 = arg1.method1733(2023893896);
                    if (var16 != 0) {
                        arg1.field3866++;
                    }
                    var15++;
                }
            }
            if (arg0 < 56) {
                return;
            }
            field986++;
            return;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lii;ILfk;)Lfn;", line = 238)
    public static final class58 method493(class250 arg0, int arg1, class299 arg2) {
        long var3 = ((long) arg2.field4608 << 56) + ((long) arg2.field4601 << 32) - (long) (-(arg2.field4593 + 1 << 16) + -arg2.field4597);
        field980++;
        class58 var5 = (class58) arg0.method1716(-1, var3);
        int var6 = 100 % ((-arg1 - 31) / 51);
        if (var5 == null) {
            var5 = new class58(arg2.field4593, (float) arg2.field4597, true, false, arg2.field4601);
            arg0.method1708(var3, (byte) -79, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 259)
    public static final String method494(long arg0, int arg1) {
        class115.field1813.setTime(new Date(arg0));
        int var3 = class115.field1813.get(7);
        field984++;
        if (arg1 != 0) {
            field990 = 26;
        }
        int var4 = class115.field1813.get(5);
        int var5 = class115.field1813.get(2);
        int var6 = class115.field1813.get(1);
        int var7 = class115.field1813.get(11);
        int var8 = class115.field1813.get(12);
        int var9 = class115.field1813.get(13);
        return class61.field823[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class203.field3115[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V", line = 288)
    public static final void method495(boolean arg0, int arg1) {
        field991++;
        if (arg0 == class278.field4323) {
            return;
        }
        if (arg1 != 14104) {
            field990 = 122;
        }
        class278.field4323 = arg0;
        class67.method479(0);
    }
}
