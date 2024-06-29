import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class443 extends class165 {

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "[I")
    private int[] field6600 = new int[this.field2492];

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "Lpu;")
    public static class179 field6604;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
    private int field6598;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
    private int field6599;

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!ws", name = "y", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "Ljava/awt/Font;")
    public static Font field6591;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "[B")
    private byte[] field6595;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "[Lgg;")
    public static class217[] field6593;

    static {
        new class179("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field6604 = new class179("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V", line = 3)
    public final void method1001(boolean arg0) {
        ++field6597;
        this.field6599 = Math.abs(this.field6599);
        if (this.field6599 >= 4096) {
            this.field6599 = 4095;
        }
        this.method2735((byte) (this.field6599 >> 4), this.field6598++, (byte) -83);
        if (!arg0) {
            this.field6599 = 0;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BIB)V", line = 20)
    public void method2735(byte arg0, int arg1, byte arg2) {
        ++field6596;
        if (arg2 < -21) {
            this.field6595[this.field6598++] = (byte) (class307.method2028(127, arg0 >> 1) + 127);
        }
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(IIIIIF)V", line = 35)
    public class443(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field2492 > var7; ++var7) {
            this.field6600[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 52)
    public final void method996(int arg0) {
        this.field6599 = 0;
        if (arg0 != -7782) {
            this.field6599 = -106;
        }
        ++field6592;
        this.field6598 = 0;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)V", line = 65)
    public final void method997(int arg0, int arg1, int arg2) {
        this.field6599 += this.field6600[arg2] * arg1 >> 12;
        ++field6602;
        if (arg0 != -10656) {
            method2737(false);
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V", line = 81)
    public static final void method2736(byte arg0) {
        ++field6601;
        class504.field7322.method291(false);
        for (class376 var1 = (class376) class154.field2370.method295((byte) -18); var1 != null; var1 = (class376) class154.field2370.method296(true)) {
            if (~var1.field5546 > -1001) {
                var1.method947((byte) 122);
                class504.field7322.method292((byte) 121, var1);
            }
        }
        class504.field7322.method290(5, class154.field2370);
        int var2 = 125 / ((arg0 - -80) / 45);
        int var3 = -1;
        class345 var4 = (class345) class277.field4347.method295((byte) -82);
        if (var4 != null) {
            var3 = var4.method1907(126);
        }
        if (!class256.field4112) {
            if (var3 == 0 && (class336.field5064 == 1 && class540.field7909 > 2 || class18.method116(-28633))) {
                var3 = 2;
            }
            if (~var3 == -3 && ~class540.field7909 < -1 && var4 != null) {
                if (class374.field5527 == null && ~class215.field3254 == -1) {
                    class6.method28(var4.method1905(true), var4.method1903(11), 127);
                } else {
                    class446.field6627 = 2;
                }
            }
            if (~var3 == -1 && ~class540.field7909 < -1) {
                class242.method1624(5989);
            }
            if (class374.field5527 == null && ~class215.field3254 == -1) {
                class112.field1674 = null;
                class446.field6627 = 0;
                return;
            }
        } else {
            if (var3 == -1) {
                int var5 = class377.field5570.method1475((byte) 121);
                int var6 = class377.field5570.method1484(-22647);
                if (class404.field5975 + -10 > var5 || class404.field5975 + class304.field4657 + 10 < var5 || var6 < class354.field5246 + -10 || var6 > class354.field5246 + class162.field2451 + 10) {
                    class173.method1238(10);
                }
            }
            if (var3 != 0) {
                return;
            }
            int var7 = class404.field5975;
            int var8 = class354.field5246;
            int var9 = class304.field4657;
            int var10 = var4.method1905(true);
            int var11 = var4.method1903(11);
            int var12 = -1;
            for (int var13 = 0; ~var13 > ~class540.field7909; ++var13) {
                if (class86.field1411) {
                    int var17 = (class540.field7909 + -1 - var13) * 16 + var8 - -33;
                    if (var10 > var7 && ~(var7 + var9) < ~var10 && ~(var17 - 13) > ~var11 && var17 + 4 > var11) {
                        var12 = var13;
                    }
                } else {
                    int var18 = (class540.field7909 + -1 + -var13) * 16 + 31 + var8;
                    if (var10 > var7 && ~var10 > ~(var7 - -var9) && ~(var18 + -13) > ~var11 && var11 < var18 - -3) {
                        var12 = var13;
                    }
                }
            }
            if (var12 != -1) {
                int var14 = 0;
                class265 var15 = new class265(class154.field2370);
                for (class376 var16 = (class376) var15.method1840(-51); var16 != null; var16 = (class376) var15.method1844(80)) {
                    if (var12 == var14) {
                        class154.method1122(var11, 0, var10, var16);
                    }
                    ++var14;
                }
            }
            class173.method1238(10);
        }
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(Z)V", line = 239)
    public static void method2737(boolean arg0) {
        field6591 = null;
        if (!arg0) {
            field6604 = null;
            field6593 = null;
        }
    }
}
