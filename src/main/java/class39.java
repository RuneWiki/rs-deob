import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public abstract class class39 {

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "[I")
    public static int[] field426;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "Lqf;")
    public static class593 field425;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "Lkea;")
    public static class203 field427;

    static {
        new class474("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field426 = new int[] { 16, 32, 64, 128 };
        field425 = null;
        field422 = 0;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)V", line = 7)
    public static final void method205(int arg0, int arg1, int arg2) {
        if (class647.field9368 != arg0) {
            class601.field8779 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class601.field8779[var3] = (var3 << 12) / arg0;
            }
            class619.field8980 = arg0 - 1;
            class647.field9368 = arg0;
            class192.field2527 = arg0 * 32;
        }
        field424++;
        if (arg2 < 84) {
            field425 = null;
        }
        if (class441.field6574 == arg1) {
            return;
        }
        if (class647.field9368 == arg1) {
            class573.field8270 = class601.field8779;
        } else {
            class573.field8270 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class573.field8270[var4] = (var4 << 12) / arg1;
            }
        }
        class444.field6649 = arg1 - 1;
        class441.field6574 = arg1;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([BBIIII)Z", line = 52)
    public static final boolean method206(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -87) {
            method206(null, (byte) 38, -67, -105, 30, 89);
        }
        field421++;
        boolean var6 = true;
        class194 var7 = new class194(arg0);
        int var8 = -1;
        label74: while (true) {
            int var9 = var7.method1230((byte) 105);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class385 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method1176((byte) -51);
                                        if (var19 == 0) {
                                            continue label74;
                                        }
                                        var7.method1177(255);
                                    }
                                    int var12 = var7.method1176((byte) 127);
                                    if (var12 == 0) {
                                        continue label74;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = var10 >> 6 & 0x3F;
                                    var15 = var7.method1177(arg1 ^ 0xFFFFFF56) >> 2;
                                    var16 = arg4 + var14;
                                    var17 = var13 + arg3;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while (var16 >= (arg5 - 1));
                    } while ((arg2 - 1) <= var17);
                    var18 = class575.field8301.method1499(-7532, var8);
                } while (var15 == 22 && !class595.field8694.field6549 && var18.field5806 == 0 && var18.field5829 != 1 && !var18.field5879);
                if (!var18.method2463(121)) {
                    class97.field1141++;
                    var6 = false;
                }
                var11 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V", line = 140)
    public static void method210(int arg0) {
        field427 = null;
        field426 = null;
        field425 = null;
        if (arg0 != 0) {
            field422 = 9;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IB)V")
    public abstract void method207(int arg0, byte arg1);

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)[B")
    public abstract byte[] method208(int arg0, int arg1);

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(IB)I")
    public abstract int method209(int arg0, byte arg1);

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)Lbs;")
    public abstract class598 method211(int arg0);
}
