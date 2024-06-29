import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class269 {

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public int field3675 = -1;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public int field3682 = -1;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "Lka;")
    public static class408 field3683 = new class408(50);

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public static int field3686 = 0;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "Lok;")
    public static class61 field3685;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "Ljava/awt/Font;")
    public static Font field3687;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "[I")
    public int[] field3681;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "[I")
    public static int[] field3688;

    static {
        new class368("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1706(int arg0) {
        field3676++;
        if (class119.field1810 != null) {
            return;
        }
        class119.field1810 = new int[65536];
        if (arg0 != -1) {
            method1712(36);
        }
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var10 = var18;
                    var9 = var8;
                } else if (var14 == 1) {
                    var10 = var8;
                    var11 = var16;
                    var9 = var17;
                } else if (var14 == 2) {
                    var10 = var8;
                    var11 = var18;
                    var9 = var16;
                } else if (var14 == 3) {
                    var11 = var8;
                    var9 = var16;
                    var10 = var17;
                } else if (var14 == 4) {
                    var10 = var16;
                    var11 = var8;
                    var9 = var18;
                } else if (var14 == 5) {
                    var11 = var17;
                    var9 = var8;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                class119.field1810[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIILjq;ZI)V", line = 125)
    public static final void method1707(int arg0, int arg1, int arg2, int arg3, class185 arg4, boolean arg5, int arg6) {
        field3677++;
        class193.method1341(arg6, arg3, arg1, arg0, 109, arg4.field44, arg2, arg4.field40, 0);
        if (!arg5) {
            method1706(75);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lrg;III)V", line = 147)
    private final void method1708(class366 arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= -111) {
            return;
        }
        field3680++;
        if (arg1 == 1) {
            this.field3682 = arg0.method2297(13352);
        } else if (arg1 == 2) {
            this.field3681 = new int[arg0.method2306((byte) 77)];
            for (int var5 = 0; var5 < this.field3681.length; var5++) {
                this.field3681[var5] = arg0.method2297(13352);
            }
        } else if (arg1 == 3) {
            this.field3675 = arg0.method2306((byte) 106);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILrg;)V", line = 181)
    public final void method1709(int arg0, int arg1, class366 arg2) {
        field3684++;
        if (arg0 != 0) {
            field3686 = -42;
        }
        while (true) {
            int var4 = arg2.method2306((byte) 113);
            if (var4 == 0) {
                return;
            }
            this.method1708(arg2, var4, -126, arg1);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V", line = 203)
    public static void method1710(byte arg0) {
        if (arg0 != -106) {
            method1706(101);
        }
        field3685 = null;
        field3688 = null;
        field3687 = null;
        field3683 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lvg;BII)V", line = 216)
    public static final void method1711(class108 arg0, byte arg1, int arg2, int arg3) {
        int var4 = 20 % ((59 - arg1) / 54);
        if (!class213.field2980) {
            for (int var5 = 9; var5 >= 5; var5--) {
                String var9 = class222.method1468(var5, false, arg0);
                if (var9 != null) {
                    class46.method379(var9, 1009, arg0.field1647, true, (long) (var5 + 1), arg0.field1631, class345.method2094(arg0, -1, var5), arg0.field1658);
                    class422.field5843++;
                }
            }
            String var6 = class166.method1184(arg0, (byte) -71);
            if (var6 != null) {
                class336.field4548++;
                class46.method379(var6, 5, arg0.field1647, true, 0L, arg0.field1631, arg0.field1609, arg0.field1658);
            }
            for (int var7 = 4; var7 >= 0; var7--) {
                String var8 = class222.method1468(var7, false, arg0);
                if (var8 != null) {
                    class46.method379(var8, 2, arg0.field1647, true, (long) (var7 + 1), arg0.field1631, class345.method2094(arg0, -1, var7), arg0.field1658);
                    class422.field5843++;
                }
            }
            if (client.method1634(arg0).method1874(1)) {
                if (arg0.field1672 == null) {
                    class46.method379(class124.field1869.method2313((byte) -107, class445.field6241), 23, arg0.field1647, true, 0L, arg0.field1631, -1, "");
                } else {
                    class46.method379(arg0.field1672, 23, arg0.field1647, true, 0L, arg0.field1631, -1, "");
                }
                class132.field1978++;
            }
        } else if (client.method1634(arg0).method1873(-1) && (class277.field3780 & 0x20) != 0) {
            class98.field1346++;
            class46.method379(class302.field4121, 6, arg0.field1647, true, 0L, arg0.field1631, class438.field6183, class119.field1816 + " -> " + arg0.field1658);
        }
        field3679++;
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V", line = 290)
    public static final void method1712(int arg0) {
        if (arg0 >= -114) {
            field3686 = -9;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class1.field3[var1] = false;
        }
        field3674++;
        class397.field5501 = -1;
        class147.field2139 = -1;
        class26.field337 = 1;
        class284.field3865 = 0;
        class46.field590 = 0;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILof;IZ)V", line = 327)
    public static final void method1713(int arg0, class423 arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return;
        }
        field3678++;
        if (arg1.field2619 == arg2 && arg2 != -1) {
            class83 var4 = class408.method2521((byte) -105, arg2);
            int var5 = var4.field1166;
            if (var5 == 1) {
                arg1.field2593 = 0;
                arg1.field2578 = 0;
                arg1.field2626 = 0;
                arg1.field2648 = 1;
                arg1.field2617 = arg0;
                class431.method2657(var4, -63, arg1.field40, class359.field4970 == arg1, arg1.field2593, arg1.field44);
            }
            if (var5 == 2) {
                arg1.field2578 = 0;
                return;
            }
        } else if (arg2 == -1 || arg1.field2619 == -1 || class408.method2521((byte) 57, arg2).field1163 >= class408.method2521((byte) 46, arg1.field2619).field1163) {
            arg1.field2666 = arg1.field2654;
            arg1.field2648 = 1;
            arg1.field2619 = arg2;
            arg1.field2593 = 0;
            arg1.field2617 = arg0;
            arg1.field2626 = 0;
            arg1.field2578 = 0;
            if (arg1.field2619 == -1) {
                return;
            }
            class431.method2657(class408.method2521((byte) 100, arg1.field2619), -63, arg1.field40, class359.field4970 == arg1, arg1.field2593, arg1.field44);
        }
    }
}
