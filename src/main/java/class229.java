import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class229 {

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    private int field3728 = -1;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Z")
    private boolean field3729 = true;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    private int field3730;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "[Lmc;")
    private class90[] field3735;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    private int field3722;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    private int field3725;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    private int field3737;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "[Lmc;")
    private class90[] field3727;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "Lmc;")
    private class90 field3736;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "[I")
    public static int[] field3733 = new int[3];

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field3739 = 0;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lak;")
    public static class234 field3720 = new class234(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    private int field3721;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    private int field3724;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Ll;")
    private class16 field3731;

    static {
        new class234("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIILya;BIIII)V", line = 6)
    public final void method1618(int arg0, int arg1, int arg2, int arg3, class38 arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg1 + arg3 & 0x3FFF;
        field3738++;
        if (this.field3730 == -1) {
            arg4.method284(arg8, arg2, arg7, arg0, arg9, 0);
        } else {
            class281 var12 = class172.field2560.method584(true, this.field3730);
            if (this.field3731 == null && class172.field2560.method579(this.field3730, true)) {
                int[] var13 = var12.field4274 ? class172.field2560.method583(this.field3724, this.field3724, this.field3730, 0.7F, (byte) -125, false) : class172.field2560.method581(this.field3730, false, this.field3724, -38, this.field3724, 0.7F);
                this.field3731 = arg4.method350(var13, 0, this.field3724, this.field3724, this.field3724);
            }
            if (!var12.field4274) {
                arg4.method284(arg8, arg2, arg7, arg0, arg9, 0);
            }
            if (this.field3731 != null) {
                int var14 = var12.field4274 ? 0 : 1;
                int var15 = arg0 * arg6 / -4096;
                int var16;
                for (var16 = arg0 * var11 / 4096 + (arg7 - arg0) / 2; var16 > arg0; var16 -= arg0) {
                }
                while (var15 > arg0) {
                    var15 -= arg0;
                }
                while (var16 < 0) {
                    var16 += arg0;
                }
                while (var15 < 0) {
                    var15 += arg0;
                }
                for (int var17 = var16 - arg0; var17 < arg7; var17 += arg0) {
                    for (int var18 = var15 - arg0; var18 < arg0; var18 += arg0) {
                        this.field3731.method135(arg8 + var17, var18 - -arg2, arg0, arg0, 1, 0, var14);
                    }
                }
            }
        }
        if (arg5 <= -98) {
            for (int var19 = this.field3721 - 1; var19 >= 0; var19--) {
                this.field3727[var19].method736(arg4, arg8, arg2, arg7, arg0, arg6, var11);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLya;I)Z", line = 82)
    public final boolean method1619(byte arg0, class38 arg1, int arg2) {
        if (this.field3728 != arg2) {
            this.field3728 = arg2;
            int var4 = class396.method2493((byte) 66, arg2);
            if (arg2 < var4) {
                var4 = class324.method2059((byte) 120, arg2);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field3724 != var4) {
                this.field3731 = null;
                this.field3724 = var4;
            }
            if (this.field3735 != null) {
                this.field3721 = 0;
                int[] var5 = new int[this.field3735.length];
                for (int var6 = 0; var6 < this.field3735.length; var6++) {
                    class90 var7 = this.field3735[var6];
                    if (var7.method733(this.field3737, this.field3722, this.field3725, this.field3728)) {
                        var5[this.field3721] = var7.field1291;
                        this.field3727[this.field3721++] = var7;
                    }
                }
                class18.method152(this.field3721 - 1, 0, this.field3727, var5, (byte) -44);
            }
            this.field3729 = true;
        }
        field3726++;
        if (arg0 <= 26) {
            return true;
        }
        boolean var8 = false;
        if (this.field3729) {
            this.field3729 = false;
            for (int var9 = this.field3721 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field3727[var9].method740(arg1, this.field3736);
                var8 |= var10;
                this.field3729 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 160)
    public static final void method1620(int arg0) {
        field3723++;
        class219.field3587 = class380.field5735.field5150 + class380.field5735.field5137 + 2;
        class238.field3820 = new String[500];
        class232.field3752 = class401.field5963.field5150 + class401.field5963.field5137 + 2;
        for (int var1 = arg0; var1 < class238.field3820.length; var1++) {
            class238.field3820[var1] = "";
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V", line = 185)
    public static final void method1621(int arg0, int arg1, int arg2) {
        boolean var3 = client.field3311[0][arg1][arg2] != null && client.field3311[0][arg1][arg2].field2101 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (client.field3311[var4][arg1][arg2] == null) {
                class138 var5 = client.field3311[var4][arg1][arg2] = new class138(var4, arg1, arg2);
                if (var3) {
                    var5.field2119++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(I[Lmc;IIII)V", line = 252)
    public class229(int arg0, class90[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3730 = arg0;
        this.field3735 = arg1;
        this.field3722 = arg4;
        this.field3725 = arg5;
        this.field3737 = arg3;
        if (arg1 == null) {
            this.field3736 = null;
            this.field3727 = null;
        } else {
            this.field3727 = new class90[arg1.length];
            this.field3736 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V", line = 212)
    public static void method1622(int arg0) {
        field3720 = null;
        int var1 = 58 % ((arg0 - 42) / 63);
        field3733 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Z", line = 222)
    public static final boolean method1623(int arg0, int arg1) {
        if (arg1 != 49) {
            return true;
        }
        field3734++;
        if (arg0 == 47 || arg0 == 48 || arg0 == 49 || arg0 == 57 || arg0 == 1010) {
            return true;
        } else {
            return arg0 == 18 || arg0 == 1004;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V", line = 276)
    public final void method1624(boolean arg0) {
        if (this.field3735 != null) {
            for (int var2 = 0; var2 < this.field3735.length; var2++) {
                this.field3735[var2].method734();
            }
        }
        field3732++;
        if (arg0) {
            this.field3731 = null;
        }
    }
}
