import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class349 {

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "Lbg;")
    public static class275 field5376;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "Laa;")
    public static class76 field5378;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "[I")
    public static int[] field5380;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
    public static int field5379;

    static {
        new class347("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field5376 = new class275();
        new class347("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field5378 = new class76(25, -1);
        field5380 = new int[2];
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIILoa;Loa;)V", line = 5)
    public static final void method2111(int arg0, int arg1, int arg2, class169 arg3, class169 arg4) {
        class306 var5 = class461.method2673(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field4592 = arg3;
            var5.field4586 = arg4;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V", line = 30)
    public static final void method2112(byte arg0) {
        if (arg0 > -52) {
            return;
        }
        for (int var1 = 0; var1 < class58.field797; var1++) {
            int var2 = class40.field532[var1];
            class351 var3 = class88.field1375[var2];
            int var4 = class400.field5966.method2765(109);
            if ((var4 & 0x2) != 0) {
                var4 += class400.field5966.method2765(117) << 8;
            }
            if ((var4 & 0x20) != 0) {
                var3.field5991 = class400.field5966.method2774(32);
                if (var3.field5991 == 65535) {
                    var3.field5991 = -1;
                }
            }
            if ((var4 & 0x100) != 0) {
                int var5 = class400.field5966.method2730(-1458809016);
                var3.field6046 = class400.field5966.method2765(100);
                var3.field6031 = class400.field5966.method2765(76);
                var3.field5996 = var5 & 0x7FFF;
                var3.field6052 = (var5 & 0x8000) != 0;
                var3.field5983 = class86.field1350 + var3.field5996 + var3.field6046;
            }
            if ((var4 & 0x8) != 0) {
                int var6 = class400.field5966.method2724(255);
                int var7 = class400.field5966.method2715((byte) 117);
                var3.method2418(class86.field1350, var7, 18067, var6);
                var3.field6014 = class86.field1350 + 300;
                var3.field5978 = class400.field5966.method2756((byte) -56);
            }
            if ((var4 & 0x800) != 0) {
                int var8 = class400.field5966.method2730(-1458809016);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class400.field5966.method2721(-2);
                int var10 = class400.field5966.method2765(118);
                var3.method2423(var8, var10, true, var9, (byte) 106);
            }
            if ((var4 & 0x2000) != 0) {
                var3.field5397 = class400.field5966.method2719(113738408);
                var3.field5399 = class400.field5966.method2774(32);
            }
            if ((var4 & 0x1000) != 0) {
                int var11 = class400.field5966.method2765(102);
                int[] var12 = new int[var11];
                int[] var13 = new int[var11];
                int[] var14 = new int[var11];
                for (int var15 = 0; var15 < var11; var15++) {
                    int var16 = class400.field5966.method2719(113738408);
                    if (var16 == 65535) {
                        var16 = -1;
                    }
                    var12[var15] = var16;
                    var13[var15] = class400.field5966.method2752((byte) 11);
                    var14[var15] = class400.field5966.method2719(113738408);
                }
                class498.method2964(var14, var12, var3, var13, (byte) 124);
            }
            if ((var4 & 0x400) != 0) {
                var3.field6045 = class400.field5966.method2729(true);
                var3.field5975 = class400.field5966.method2729(true);
                var3.field5990 = class400.field5966.method2714((byte) -67);
                var3.field6025 = class400.field5966.method2729(true);
                var3.field6054 = class400.field5966.method2727((byte) 43) + class86.field1350;
                var3.field6051 = class400.field5966.method2774(32) + class86.field1350;
                var3.field6032 = class400.field5966.method2756((byte) 54);
                var3.field5975 += var3.field6068[0];
                var3.field6025 += var3.field6068[0];
                var3.field6045 += var3.field6065[0];
                var3.field6064 = 0;
                var3.field5990 += var3.field6065[0];
                var3.field6066 = 1;
            }
            if ((var4 & 0x200) != 0) {
                var3.field5963 = class400.field5966.method2733(-120);
                var3.field6022 = class400.field5966.method2714((byte) -95);
                var3.field6008 = class400.field5966.method2714((byte) -86);
                var3.field5984 = (byte) class400.field5966.method2752((byte) -7);
                var3.field5976 = class86.field1350 + class400.field5966.method2774(32);
                var3.field5982 = class86.field1350 + class400.field5966.method2774(32);
            }
            if ((var4 & 0x10) != 0) {
                var3.field6007 = class400.field5966.method2770(-20459);
                var3.field6010 = 100;
            }
            if ((var4 & 0x80) != 0) {
                int var17 = class400.field5966.method2774(32);
                if (var17 == 65535) {
                    var17 = -1;
                }
                int var18 = class400.field5966.method2756((byte) -125);
                class193.method1283(var18, var3, false, var17);
            }
            if ((var4 & 0x1) != 0) {
                int var19 = class400.field5966.method2724(255);
                int var20 = class400.field5966.method2765(109);
                var3.method2418(class86.field1350, var20, 18067, var19);
            }
            if ((var4 & 0x4) != 0) {
                if (var3.field5409.method1733(-1)) {
                    class145.method1052(var3, 0);
                }
                var3.method2127(class373.field5641.method774(class400.field5966.method2730(-1458809016), -116), (byte) 97);
                var3.method2424(var3.field5409.field4128, (byte) 124);
                var3.field5971 = var3.field5409.field4196 << 3;
                if (var3.field5409.method1733(-1)) {
                    class454.method2644(0, null, var3, (byte) 38, null, var3.field7686, var3.field6065[0], var3.field6068[0]);
                }
            }
            if ((var4 & 0x40) != 0) {
                int var21 = class400.field5966.method2719(113738408);
                int var22 = class400.field5966.method2721(-2);
                if (var21 == 65535) {
                    var21 = -1;
                }
                int var23 = class400.field5966.method2756((byte) -78);
                var3.method2423(var21, var23, false, var22, (byte) -24);
            }
        }
        field5379++;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)V", line = 237)
    public static void method2113(byte arg0) {
        field5378 = null;
        field5380 = null;
        if (arg0 >= 104) {
            field5376 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIBIIII)V", line = 257)
    public static final void method2114(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field5375++;
        int var8 = class375.method2223(false, arg1, class286.field4290, class305.field4555);
        int var9 = class375.method2223(false, arg6, class286.field4290, class305.field4555);
        int var10 = class375.method2223(false, arg4, class102.field1544, class297.field4427);
        int var11 = class375.method2223(false, arg5, class102.field1544, class297.field4427);
        int var12 = class375.method2223(false, arg1 + arg2, class286.field4290, class305.field4555);
        int var13 = class375.method2223(false, arg6 - arg2, class286.field4290, class305.field4555);
        for (int var14 = var8; var14 < var12; var14++) {
            class94.method740(class306.field4574[var14], var10, var11, arg0, false);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class94.method740(class306.field4574[var15], var10, var11, arg0, false);
        }
        int var16 = class375.method2223(false, arg2 + arg4, class102.field1544, class297.field4427);
        int var17 = class375.method2223(false, arg5 - arg2, class102.field1544, class297.field4427);
        int var18 = var12;
        if (arg3 != -30) {
            method2111(29, 71, 15, null, null);
        }
        while (var13 >= var18) {
            int[] var19 = class306.field4574[var18];
            class94.method740(var19, var10, var16, arg0, false);
            class94.method740(var19, var16, var17, arg7, false);
            class94.method740(var19, var17, var11, arg0, false);
            var18++;
        }
    }
}
