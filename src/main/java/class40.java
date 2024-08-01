import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("di")
public class class40 extends class85 {

    @OriginalMember(owner = "di", name = "T", descriptor = "I")
    private int field843 = 20;

    @OriginalMember(owner = "di", name = "U", descriptor = "I")
    private int field844 = 0;

    @OriginalMember(owner = "di", name = "S", descriptor = "I")
    private int field842 = 1365;

    @OriginalMember(owner = "di", name = "bb", descriptor = "I")
    private int field851 = 0;

    @OriginalMember(owner = "di", name = "Q", descriptor = "Llf;")
    public static class109 field840 = class35.method275("<col=00ff00>", 2);

    @OriginalMember(owner = "di", name = "V", descriptor = "I")
    public static int field845 = 0;

    @OriginalMember(owner = "di", name = "Y", descriptor = "Llf;")
    public static class109 field848 = class35.method275("Ung-Ultiger Benutzername", 2);

    @OriginalMember(owner = "di", name = "cb", descriptor = "Llf;")
    public static class109 field852 = class35.method275("Ihr Charakter)2Profil wird in:", 2);

    @OriginalMember(owner = "di", name = "R", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "di", name = "X", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "di", name = "Z", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "di", name = "ab", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "di", name = "db", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "di", name = "eb", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "di", name = "fb", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "di", name = "W", descriptor = "[I")
    public static int[] field846;

    @OriginalMember(owner = "di", name = "gb", descriptor = "[[S")
    public static short[][] field856;

    @OriginalMember(owner = "di", name = "a", descriptor = "(BLuc;I)V")
    public static final void method292(byte arg0, class187 arg1, int arg2) {
        if (arg0 != 58) {
            field840 = null;
        }
        if (arg1.field3545 > class143.field2754) {
            class111.method823(arg1, arg0 ^ 58);
        } else if (~class143.field2754 >= ~arg1.field3553) {
            class180.method1224(-3, arg1);
        } else {
            class3.method13(arg1, (byte) -25);
        }
        ++field841;
        if (arg1.field3549 < 128 || ~arg1.field3609 > -129 || arg1.field3549 >= 13184 || arg1.field3609 >= 13184) {
            arg1.field3553 = 0;
            arg1.field3583 = -1;
            arg1.field3609 = arg1.field3567[0] * 128 - -(arg1.field3612 * 64);
            arg1.field3549 = arg1.field3547[0] * 128 - -(arg1.field3612 * 64);
            arg1.field3545 = 0;
            arg1.field3597 = -1;
            arg1.method1265(true);
        }
        if (class157.field2955 == arg1 && (arg1.field3549 < 1536 || arg1.field3609 < 1536 || arg1.field3549 >= 11776 || ~arg1.field3609 <= -11777)) {
            arg1.field3583 = -1;
            arg1.field3609 = arg1.field3567[0] * 128 + arg1.field3612 * 64;
            arg1.field3545 = 0;
            arg1.field3597 = -1;
            arg1.field3553 = 0;
            arg1.field3549 = arg1.field3547[0] * 128 + arg1.field3612 * 64;
            arg1.method1265(true);
        }
        class20.method189(true, arg1);
        class31.method263(1, arg1);
    }

    @OriginalMember(owner = "di", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method293(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3) {
            ++field847;
            if (arg2 >= 1 && ~arg0 <= -2 && ~arg2 >= -103 && arg0 <= 102) {
                if (class181.field3420 && class72.field1405 != arg1) {
                    return;
                }
                long var8 = 0L;
                boolean var10 = true;
                boolean var11 = false;
                if (arg5 == 0) {
                    var8 = class18.method155(arg1, arg2, arg0);
                }
                boolean var12 = false;
                if (arg5 == 1) {
                    var8 = class73.method458(arg1, arg2, arg0);
                }
                if (arg5 == 2) {
                    var8 = class178.method1210(arg1, arg2, arg0);
                }
                if (arg5 == 3) {
                    var8 = class77.method483(arg1, arg2, arg0);
                }
                if (var8 != 0L) {
                    int var13 = (int) var8 >> 20 & 3;
                    int var14 = Integer.MAX_VALUE & (int) (var8 >>> 32);
                    int var15 = (int) var8 >> 14 & 31;
                    if (~arg5 == -1) {
                        class31.method264(arg1, arg2, arg0);
                        class78 var16 = class140.method1000(var14, 0);
                        if (~var16.field1511 != -1) {
                            class168.field3116[arg1].method759(var16.field1539, arg0, arg2, var13, var15, 115);
                        }
                    }
                    if (arg5 == 1) {
                        class129.method934(arg1, arg2, arg0);
                    }
                    if (~arg5 == -3) {
                        class178.method1209(arg1, arg2, arg0);
                        class78 var17 = class140.method1000(var14, 0);
                        if (var17.field1501 + arg2 > 103 || ~(var17.field1501 + arg0) < -104 || arg2 - -var17.field1498 > 103 || var17.field1498 + arg0 > 103) {
                            return;
                        }
                        if (var17.field1511 != 0) {
                            class168.field3116[arg1].method749(arg3, var13, var17.field1501, arg0, var17.field1498, var17.field1539, arg2);
                        }
                    }
                    if (~arg5 == -4) {
                        class85.method543(arg1, arg2, arg0);
                        class78 var18 = class140.method1000(var14, 0);
                        if (~var18.field1511 == -2) {
                            class168.field3116[arg1].method763(arg0, arg2, (byte) -33);
                        }
                    }
                }
                if (~arg7 <= -1) {
                    int var19 = arg1;
                    if (arg1 < 3 && ~(2 & class88.field1827[1][arg2][arg0]) == -3) {
                        var19 = arg1 + 1;
                    }
                    class210.method1368(arg7, arg6, arg4, arg0, class168.field3116[arg1], true, var19, arg2, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "di", name = "<init>", descriptor = "()V")
    public class40() {
        super(0, true);
    }

    @OriginalMember(owner = "di", name = "a", descriptor = "(ILbg;)V")
    public static final void method294(int arg0, class18 arg1) {
        if (arg0 == 11432) {
            class68.field1328 = arg1;
            ++field854;
        }
    }

    @OriginalMember(owner = "di", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        ++field855;
        int[] var3 = super.field1736.method835(-314, arg1);
        if (super.field1736.field2253) {
            for (int var4 = 0; ~var4 > ~class57.field1152; ++var4) {
                int var5 = (class47.field980[var4] << 12) / this.field842 + this.field851;
                int var6 = (class54.field1083[arg1] << 12) / this.field842 + this.field844;
                int var7 = var5;
                int var8 = var6;
                int var9 = var6;
                int var10 = var5 * var5 >> 12;
                int var11 = var5;
                int var12 = 0;
                for (int var13 = var6 * var6 >> 12; var10 + var13 < 16384 && ~this.field843 < ~var12; var13 = var9 * var9 >> 12) {
                    ++var12;
                    var9 = (var9 * var11 >> 12) * 2 - -var8;
                    var11 = var10 - var13 + var7;
                    var10 = var11 * var11 >> 12;
                }
                var3[var4] = ~var12 > ~(this.field843 - 1) ? (var12 << 12) / this.field843 : 0;
            }
        }
        return arg0 > -49 ? null : var3;
    }

    @OriginalMember(owner = "di", name = "d", descriptor = "(B)V")
    public static final void method295(byte arg0) {
        try {
            if (class118.field2333 != null) {
                byte[] var1 = class118.field2333.method513(1);
                if (var1 != null) {
                    class86 var2 = new class86(var1);
                    class63.field1209 = var2.method569(true);
                    class168.field3121 = new class55[class63.field1209];
                    for (int var3 = 0; var3 < class63.field1209; ++var3) {
                        class55 var4 = class168.field3121[var3] = new class55();
                        int var5 = var2.method569(true);
                        var4.field1111 = (32768 & var5) != 0;
                        var4.field1113 = 32767 & var5;
                        var4.field1098 = var2.method562((byte) 87);
                        var4.field1106 = var2.method577(true);
                        var4.field1104 = var3;
                        var4.field1110 = class143.method1013(var4.field1098, -95);
                    }
                    class92.method671(class157.field2961, 0, class168.field3121.length + -1, class168.field3121, arg0 ^ -107, class126.field2432);
                    class134.field2570 = true;
                    class118.field2333 = null;
                }
            } else {
                class118.field2333 = new class80(class49.field1009, class36.method279(new class109[] { class65.field1243, class174.field3309, class47.field983 }, -46).method789(arg0 + 105));
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class118.field2333 = null;
        }
        if (arg0 == -105) {
            ++field849;
        }
    }

    @OriginalMember(owner = "di", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg0 >= -120) {
            field845 = -56;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field844 = arg2.method569(true);
                    }
                } else {
                    this.field851 = arg2.method569(true);
                }
            } else {
                this.field843 = arg2.method569(true);
            }
        } else {
            this.field842 = arg2.method569(true);
        }
        ++field850;
    }

    @OriginalMember(owner = "di", name = "e", descriptor = "(B)V")
    public static void method296(byte arg0) {
        field846 = null;
        field840 = null;
        field852 = null;
        field856 = null;
        field848 = null;
        if (arg0 < 52) {
            field846 = null;
        }
    }
}
