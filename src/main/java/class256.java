import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class256 {

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Lcc;")
    private class217 field4606 = new class217();

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "[S")
    public static short[] field4603 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Llc;")
    public static class143 field4613 = class66.method374("Interfaces charg-Bes", -1);

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field4607 = 0;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Lrb;")
    public static class193 field4608;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Lcc;")
    private class217 field4617;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "[[S")
    public static short[][] field4601;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZ)I")
    public static final int method1690(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field4601 = null;
        }
        field4610++;
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLh;)V")
    public static final void method1691(byte arg0, class190 arg1) {
        int var2 = 0;
        int var3 = -88 % ((arg0 + 27) / 60);
        while (class112.field1969 > var2) {
            int var4 = arg1.method1257((byte) 125);
            int var5 = arg1.method1275(128);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class154.field2789[var4] != null) {
                class154.field2789[var4].field255 = var5;
            }
            var2++;
        }
        field4609++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I")
    public final int method1692(byte arg0) {
        field4615++;
        if (arg0 != -95) {
            this.field4606 = null;
        }
        int var2 = 0;
        class217 var3 = this.field4606.field3974;
        while (this.field4606 != var3) {
            var3 = var3.field3974;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIJI)Z")
    public static final boolean method1693(int arg0, int arg1, long arg2, int arg3) {
        if (arg3 != 1003726175) {
            return false;
        }
        int var5 = (int) arg2 >> 14 & 0x1F;
        int var6 = (int) arg2 >> 20 & 0x3;
        field4611++;
        int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class209 var8 = class34.method232(167, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field3877;
                var10 = var8.field3836;
            } else {
                var9 = var8.field3836;
                var10 = var8.field3877;
            }
            int var11 = var8.field3862;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class203.method1389((byte) -106, true, 0, 2, var10, arg0, class229.field4195.field4115[0], class229.field4195.field4148[0], var9, arg1, var11, 0);
        } else {
            class203.method1389((byte) -54, true, var5 + 1, 2, 0, arg0, class229.field4195.field4115[0], class229.field4195.field4148[0], 0, arg1, 0, var6);
        }
        class51.field1009 = class67.field1279;
        class17.field290 = class31.field499;
        class17.field301 = 2;
        class167.field2982 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILcc;)V")
    public final void method1694(int arg0, class217 arg1) {
        if (arg1.field3971 != null) {
            arg1.method1490(-28126);
        }
        arg1.field3971 = this.field4606.field3971;
        field4602++;
        arg1.field3974 = this.field4606;
        if (arg0 < 57) {
            this.method1699(21);
        }
        arg1.field3971.field3974 = arg1;
        arg1.field3974.field3971 = arg1;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
    public final void method1695(boolean arg0) {
        while (true) {
            class217 var2 = this.field4606.field3974;
            if (this.field4606 == var2) {
                field4614++;
                if (!arg0) {
                    return;
                }
                this.field4617 = null;
                return;
            }
            var2.method1490(-28126);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V")
    public static void method1696(boolean arg0) {
        if (arg0) {
            method1697((class43[]) null, 117, -68);
        }
        field4608 = null;
        field4603 = null;
        field4613 = null;
        field4601 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([Lvh;II)V")
    public static final void method1697(class43[] arg0, int arg1, int arg2) {
        field4604++;
        for (int var3 = arg2; var3 < arg0.length; var3++) {
            class43 var4 = arg0[var3];
            if (var4 != null && var4.field789 == arg1 && (!var4.field786 || !client.method1505(var4))) {
                if (var4.field769 == 0) {
                    if (!var4.field786 && client.method1505(var4) && class126.field2230 != var4) {
                        continue;
                    }
                    method1697(arg0, var4.field722, 0);
                    if (var4.field885 != null) {
                        method1697(var4.field885, var4.field722, 0);
                    }
                    class163 var5 = (class163) class212.field3942.method1824((long) var4.field722, 0);
                    if (var5 != null) {
                        class147.method946(var5.field2929, arg2 ^ 0x2A);
                    }
                }
                if (var4.field769 == 6) {
                    if (var4.field853 != -1 || var4.field758 != -1) {
                        boolean var6 = class195.method1341(var4, 124);
                        int var7;
                        if (var6) {
                            var7 = var4.field758;
                        } else {
                            var7 = var4.field853;
                        }
                        if (var7 != -1) {
                            class104 var8 = class164.method1081(var7, -21331);
                            if (var8 != null) {
                                var4.field780 += class128.field2252;
                                while (var4.field780 > var8.field1824[var4.field884]) {
                                    var4.field780 -= var8.field1824[var4.field884];
                                    var4.field884++;
                                    if (var8.field1829.length <= var4.field884) {
                                        var4.field884 -= var8.field1819;
                                        if (var4.field884 < 0 || var8.field1829.length <= var4.field884) {
                                            var4.field884 = 0;
                                        }
                                    }
                                    class141.method844((byte) -122, var4);
                                }
                            }
                        }
                    }
                    if (var4.field841 != 0 && !var4.field786) {
                        int var9 = var4.field841 >> 16;
                        int var10 = class128.field2252 * var9;
                        var4.field854 = var4.field854 + var10 & 0x7FF;
                        int var11 = var4.field841 << 16 >> 16;
                        int var12 = class128.field2252 * var11;
                        var4.field830 = var4.field830 + var12 & 0x7FF;
                        class141.method844((byte) -122, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lcc;")
    public final class217 method1698(int arg0) {
        class217 var2 = this.field4606.field3974;
        field4605++;
        if (this.field4606 == var2) {
            this.field4617 = null;
            return null;
        } else {
            this.field4617 = var2.field3974;
            return arg0 < 77 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Lcc;")
    public final class217 method1699(int arg0) {
        field4600++;
        class217 var2 = this.field4617;
        if (this.field4606 == var2) {
            this.field4617 = null;
            return null;
        }
        this.field4617 = var2.field3974;
        if (arg0 > -10) {
            method1697((class43[]) null, 6, 44);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class256() {
        this.field4606.field3971 = this.field4606;
        this.field4606.field3974 = this.field4606;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)Lcc;")
    public final class217 method1700(int arg0) {
        field4612++;
        class217 var2 = this.field4606.field3974;
        if (this.field4606 == var2) {
            return null;
        } else if (arg0 == -1) {
            var2.method1490(-28126);
            return var2;
        } else {
            return null;
        }
    }
}
