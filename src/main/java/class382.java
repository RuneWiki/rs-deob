import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class382 {

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "Lbg;")
    private class275 field5740 = new class275();

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    private int field5741;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    private int field5742;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "Lmt;")
    private class517 field5744;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    public static int field5746 = 0;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field5733 = 0;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "Lok;")
    public static class74 field5743;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)I", line = 3)
    public final int method2282(boolean arg0) {
        if (!arg0) {
            field5733 = -65;
        }
        field5734++;
        int var2 = 0;
        for (class213 var3 = (class213) this.field5740.method1713(105); var3 != null; var3 = (class213) this.field5740.method1711(68)) {
            if (!var3.method463((byte) 104)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)V", line = 28)
    public static void method2283(boolean arg0) {
        field5743 = null;
        if (!arg0) {
            method2295(-94, -117, (byte) 0, 45, 103, -95);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)I", line = 39)
    public final int method2284(int arg0) {
        field5750++;
        return arg0 == 0 ? this.field5741 : -121;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZLhd;)V", line = 52)
    private final void method2285(boolean arg0, class213 arg1) {
        if (!arg0) {
            return;
        }
        if (arg1 != null) {
            arg1.method876((byte) -96);
            arg1.method2440(-80);
            this.field5742 += arg1.field3044;
        }
        field5739++;
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(Z)Ljava/lang/Object;", line = 71)
    public final Object method2286(boolean arg0) {
        field5747++;
        if (arg0) {
            return null;
        }
        class213 var2 = (class213) this.field5744.method3061(-16817);
        while (var2 != null) {
            Object var3 = var2.method462(29793);
            if (var3 != null) {
                return var3;
            }
            class213 var4 = var2;
            var2 = (class213) this.field5744.method3066((byte) 122);
            var4.method876((byte) -96);
            var4.method2440(-64);
            this.field5742 += var2.field3044;
        }
        return null;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V", line = 104)
    public final void method2287(int arg0) {
        if (arg0 <= 64) {
            return;
        }
        field5749++;
        for (class213 var2 = (class213) this.field5740.method1713(105); var2 != null; var2 = (class213) this.field5740.method1711(127)) {
            if (var2.method463((byte) 88)) {
                var2.method876((byte) -96);
                var2.method2440(-72);
                this.field5742 += var2.field3044;
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(JI)Ljava/lang/Object;", line = 131)
    public final Object method2288(long arg0, int arg1) {
        field5735++;
        class213 var4 = (class213) this.field5744.method3059(64, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method462(arg1 + 29793);
        if (arg1 != 0) {
            this.field5742 = -100;
        }
        if (var5 == null) {
            var4.method876((byte) -96);
            var4.method2440(-50);
            this.field5742 += var4.field3044;
            return null;
        }
        if (var4.method463((byte) 108)) {
            class390 var6 = new class390(var5, var4.field3044);
            this.field5744.method3055(0, var4.field1739, var6);
            this.field5740.method1708((byte) -8, var6);
            var6.field6102 = 0L;
            var4.method876((byte) -96);
            var4.method2440(-125);
        } else {
            this.field5740.method1708((byte) -8, var4);
            var4.field6102 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(Z)Ljava/lang/Object;", line = 177)
    public final Object method2289(boolean arg0) {
        field5748++;
        if (!arg0) {
            this.method2291(85L, -64, null, false);
        }
        class213 var2 = (class213) this.field5744.method3066((byte) 122);
        while (var2 != null) {
            Object var3 = var2.method462(29793);
            if (var3 != null) {
                return var3;
            }
            class213 var4 = var2;
            var2 = (class213) this.field5744.method3066((byte) 127);
            var4.method876((byte) -96);
            var4.method2440(-37);
            this.field5742 += var2.field3044;
        }
        return null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(JLjava/lang/Object;I)V", line = 208)
    public final void method2290(long arg0, Object arg1, int arg2) {
        if (arg2 <= 97) {
            this.method2296((byte) -104, -45L);
        }
        field5737++;
        this.method2291(arg0, 1, arg1, true);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(JILjava/lang/Object;Z)V", line = 221)
    private final void method2291(long arg0, int arg1, Object arg2, boolean arg3) {
        field5730++;
        if (this.field5741 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        this.method2296((byte) 69, arg0);
        this.field5742 -= arg1;
        while (this.field5742 < 0) {
            class213 var7 = (class213) this.field5740.method1718((byte) -110);
            this.method2285(true, var7);
        }
        class390 var6 = new class390(arg2, arg1);
        if (!arg3) {
            field5733 = -91;
        }
        this.field5744.method3055(0, arg0, var6);
        this.field5740.method1708((byte) -8, var6);
        var6.field6102 = 0L;
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)I", line = 254)
    public final int method2292(int arg0) {
        field5731++;
        if (arg0 != 0) {
            this.field5744 = null;
        }
        return this.field5742;
    }

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "(Z)V", line = 266)
    public final void method2293(boolean arg0) {
        field5745++;
        this.field5740.method1709((byte) 112);
        this.field5744.method3056(true);
        this.field5742 = this.field5741;
        if (arg0) {
            this.method2284(20);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZ)V", line = 281)
    public final void method2294(int arg0, boolean arg1) {
        field5732++;
        if (class85.field1343 != null) {
            for (class213 var3 = (class213) this.field5740.method1713(105); var3 != null; var3 = (class213) this.field5740.method1711(27)) {
                if (var3.method463((byte) -49)) {
                    if (var3.method462(29793) == null) {
                        var3.method876((byte) -96);
                        var3.method2440(-128);
                        this.field5742++;
                    }
                } else if (++var3.field6102 > (long) arg0) {
                    class213 var4 = class85.field1343.method766(var3, -125);
                    this.field5744.method3055(0, var3.field1739, var4);
                    class481.method2870(var4, !arg1, var3);
                    var3.method876((byte) -96);
                    var3.method2440(-125);
                }
            }
        }
        if (!arg1) {
            field5733 = 6;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIBIII)V", line = 328)
    public static final void method2295(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field5736++;
        int var6 = arg1 - arg5;
        int var7 = arg4 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class267.method1663(arg0, 0, arg1, arg5, arg3);
            }
        } else if (var6 == 0) {
            class522.method3095(arg5, -58, arg3, arg4, arg0);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg3;
                arg3 = arg5;
                int var10 = arg4;
                arg4 = arg1;
                arg5 = var9;
                arg1 = var10;
            }
            if (arg2 == -96) {
                if (arg4 < arg3) {
                    int var11 = arg3;
                    arg3 = arg4;
                    int var12 = arg5;
                    arg5 = arg1;
                    arg4 = var11;
                    arg1 = var12;
                }
                int var13 = arg5;
                int var14 = arg4 - arg3;
                int var15 = arg1 - arg5;
                int var16 = -(var14 >> 1);
                if (var15 < 0) {
                    var15 = -var15;
                }
                int var17 = arg1 <= arg5 ? -1 : 1;
                if (var8) {
                    for (int var18 = arg3; var18 <= arg4; var18++) {
                        var16 += var15;
                        class306.field4574[var18][var13] = arg0;
                        if (var16 > 0) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                } else {
                    for (int var19 = arg3; var19 <= arg4; var19++) {
                        class306.field4574[var13][var19] = arg0;
                        var16 += var15;
                        if (var16 > 0) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BJ)V", line = 448)
    private final void method2296(byte arg0, long arg1) {
        field5738++;
        int var4 = 5 % ((arg0 + 64) / 37);
        class213 var5 = (class213) this.field5744.method3059(125, arg1);
        this.method2285(true, var5);
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(I)V", line = 468)
    public class382(int arg0) {
        this.field5741 = arg0;
        this.field5742 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field5744 = new class517(var2);
    }
}
