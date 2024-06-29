import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class55 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field908 = 0;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Lcf;")
    public static class93 field917 = class147.method1066("Poser", -48);

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Lcf;")
    public static class93 field922 = class147.method1066(":duelstake:", -48);

    @OriginalMember(owner = "client!df", name = "r", descriptor = "[I")
    public static int[] field924 = new int[128];

    @OriginalMember(owner = "client!df", name = "o", descriptor = "[[B")
    public static byte[][] field921 = new byte[1000][];

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)Z")
    public final boolean method305(int arg0) {
        field907++;
        int var2 = -117 % ((arg0 - 71) / 54);
        return (this.field914 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
    public static void method306(boolean arg0) {
        field924 = null;
        field917 = null;
        if (arg0) {
            field909 = -15;
        }
        field922 = null;
        field921 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBLtg;)Lcf;")
    public static final class93 method307(int arg0, byte arg1, class181 arg2) {
        if (arg1 != -20) {
            return null;
        }
        field923++;
        if (!client.method1109(arg2).method1440(arg1 - 30, arg0) && arg2.field3242 == null) {
            return null;
        } else if (arg2.field3286 == null || arg2.field3286.length <= arg0 || arg2.field3286[arg0] == null || arg2.field3286[arg0].method671(false).method666(false) == 0) {
            return class252.field4546 ? class130.method949((byte) -77, new class93[] { class242.field4372, class148.method1067(-7015, arg0) }) : null;
        } else {
            return arg2.field3286[arg0];
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static final void method308(byte arg0) {
        client.field2738 = null;
        class164.field2887 = null;
        int var1 = -24 % ((-arg0 - 39) / 52);
        class94.field1705 = null;
        class125.field2223 = null;
        class227.field4071 = null;
        field912++;
        class135.field2370 = null;
        class249.field4490 = null;
        class187.field3447 = null;
        class167.field2942 = null;
        class70.field1283 = null;
        class200.field3620 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILna;IIZ)V")
    public static final void method309(int arg0, int arg1, class31 arg2, int arg3, int arg4, boolean arg5) {
        field915++;
        if (class272.field4839 >= 50 || arg2.field470 == null || arg1 >= arg2.field470.length || arg2.field470[arg1] == null) {
            return;
        }
        int var6 = arg2.field470[arg1][0];
        int var7 = var6 >> 5 & 0x7;
        int var8 = var6 >> 8;
        if (arg2.field470[arg1].length > 1) {
            int var9 = (int) ((double) arg2.field470[arg1].length * Math.random());
            if (var9 > 0) {
                var8 = arg2.field470[arg1][var9];
            }
        }
        int var10 = var6 & 0x1F;
        if (var10 == 0) {
            if (arg5) {
                class279.method1866(var8, var7, 0, arg4 ^ 0x4441);
            }
        } else if (class143.field2480 != 0) {
            class283.field5075[class272.field4839] = var8;
            class131.field2319[class272.field4839] = var7;
            class53.field860[class272.field4839] = 0;
            class212.field3882[class272.field4839] = null;
            int var11 = (arg3 - 64) / 128;
            int var12 = (arg0 - 64) / 128;
            class4.field44[class272.field4839] = (var12 << 8) + (var11 << 16) + var10;
            class272.field4839++;
            if (arg4 != -17474) {
                field908 = 22;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static final void method310(int arg0) {
        if (class232.field4148 == null || class124.field2200 == null) {
            class232.field4148 = new int[256];
            class124.field2200 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class232.field4148[var1] = (int) (Math.sin(var2) * 4096.0D);
                class124.field2200[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 == 4096) {
            field911++;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)I")
    public static final int method311(boolean arg0) {
        if (arg0) {
            field910 = -21;
        }
        field918++;
        return 0;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)Z")
    public final boolean method312(int arg0) {
        if (arg0 == 0) {
            field916++;
            return (this.field914 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)Z")
    public final boolean method313(int arg0) {
        field926++;
        if (arg0 != 12281) {
            field924 = null;
        }
        return (this.field914 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)Z")
    public final boolean method314(int arg0) {
        if (arg0 != -936) {
            this.method305(66);
        }
        field920++;
        return (this.field914 & 0x8) != 0;
    }
}
