import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class244 {

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "Lmg;")
    private class498 field3630 = new class498();

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "F")
    public static float field3622 = 0.0F;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "Luu;")
    public static class237 field3628;

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "Lmg;")
    private class498 field3632;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)Z")
    public final boolean method1636(byte arg0) {
        if (arg0 == -17) {
            field3619++;
            return this.field3630.field6964 == this.field3630;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)V")
    public static void method1637(boolean arg0) {
        field3628 = null;
        if (arg0) {
            method1637(false);
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(Z)Lmg;")
    public final class498 method1638(boolean arg0) {
        field3621++;
        if (arg0) {
            return null;
        }
        class498 var2 = this.field3630.field6964;
        if (this.field3630 == var2) {
            this.field3632 = null;
            return null;
        } else {
            this.field3632 = var2.field6964;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)I")
    public final int method1639(byte arg0) {
        field3627++;
        int var2 = 0;
        for (class498 var3 = this.field3630.field6964; var3 != this.field3630; var3 = var3.field6964) {
            var2++;
        }
        int var4 = -18 / ((51 - arg0) / 55);
        return var2;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)Lmg;")
    public final class498 method1640(int arg0) {
        if (arg0 != 2) {
            method1637(true);
        }
        field3623++;
        class498 var2 = this.field3630.field6962;
        if (this.field3630 == var2) {
            this.field3632 = null;
            return null;
        } else {
            this.field3632 = var2.field6962;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V")
    public final void method1641(int arg0) {
        while (true) {
            class498 var2 = this.field3630.field6964;
            if (this.field3630 == var2) {
                int var3 = -54 / ((15 - arg0) / 51);
                field3624++;
                this.field3632 = null;
                return;
            }
            var2.method3012(117);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lwq;I[I[I[I)V")
    public static final void method1642(class679 arg0, int arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var5 = arg1; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg4[var5];
            int var8 = arg2[var5];
            int var9 = 0;
            while (var7 != 0 && arg0.field7151.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field7151[var9] = null;
                    } else {
                        class57 var10 = class607.field8188.method3001(arg1 ^ 0xFFFFCEE1, var6);
                        int var11 = var10.field818;
                        class597 var12 = arg0.field7151[var9];
                        if (var12 != null) {
                            if (var12.field8105 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field7151[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field8103 = 0;
                                    var12.field8106 = var8;
                                    var12.field8100 = 1;
                                    var12.field8099 = 0;
                                    var12.field8101 = 0;
                                    if (!arg0.field7134) {
                                        class123.method765(0, arg0, var10, false);
                                    }
                                } else if (var11 == 2) {
                                    var12.field8099 = 0;
                                }
                            } else if (var10.field815 >= class607.field8188.method3001(-12575, var12.field8105).field815) {
                                var12 = arg0.field7151[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class597 var13 = arg0.field7151[var9] = new class597();
                            var13.field8106 = var8;
                            var13.field8103 = 0;
                            var13.field8099 = 0;
                            var13.field8101 = 0;
                            var13.field8105 = var6;
                            var13.field8100 = 1;
                            if (!arg0.field7134) {
                                class123.method765(0, arg0, var10, false);
                            }
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field3626++;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lmg;I)V")
    public final void method1643(class498 arg0, int arg1) {
        field3631++;
        if (arg0.field6962 != null) {
            arg0.method3012(117);
        }
        arg0.field6962 = this.field3630.field6962;
        arg0.field6964 = this.field3630;
        int var3 = -74 % ((55 - arg1) / 53);
        arg0.field6962.field6964 = arg0;
        arg0.field6964.field6962 = arg0;
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)Lmg;")
    public final class498 method1644(int arg0) {
        if (arg0 != -23698) {
            this.method1643(null, 50);
        }
        field3625++;
        class498 var2 = this.field3630.field6964;
        if (this.field3630 == var2) {
            return null;
        } else {
            var2.method3012(117);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "(I)Lmg;")
    public final class498 method1645(int arg0) {
        field3629++;
        if (arg0 != 0) {
            field3620 = 101;
        }
        class498 var2 = this.field3632;
        if (this.field3630 == var2) {
            this.field3632 = null;
            return null;
        } else {
            this.field3632 = var2.field6964;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "()V")
    public class244() {
        this.field3630.field6964 = this.field3630;
        this.field3630.field6962 = this.field3630;
    }
}
