import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class208 {

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public int field3738;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Lka;")
    public static class157 field3730 = new class157(32);

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "Lsg;")
    public static class30 field3748 = class167.method1221((byte) 33, "<col=80ff00>");

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public static int field3745 = 0;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "F")
    public static float field3749;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public int field3734;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public int field3739;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public int field3750;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "Lfh;")
    public class163 field3736;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "[I")
    public int[] field3728;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "[I")
    public int[] field3729;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "[I")
    public int[] field3731;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "[I")
    public int[] field3735;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "[I")
    public int[] field3741;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "[I")
    public int[] field3743;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "[I")
    public static int[] field3746;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "[Lfh;")
    public class163[] field3742;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "[[I")
    public int[][] field3732;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "[[I")
    public int[][] field3733;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z[B)V")
    private final void method1476(boolean arg0, byte[] arg1) {
        class8 var3 = new class8(class43.method445(arg1, arg0));
        int var4 = var3.method63((byte) 87);
        field3740++;
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field3739 = var3.method70(65280);
        } else {
            this.field3739 = 0;
        }
        int var5 = var3.method63((byte) 53);
        int var6 = 0;
        int var7 = -1;
        this.field3750 = var3.method65((byte) 124);
        this.field3741 = new int[this.field3750];
        for (int var8 = 0; var8 < this.field3750; var8++) {
            this.field3741[var8] = var6 += var3.method65((byte) 116);
            if (var7 < this.field3741[var8]) {
                var7 = this.field3741[var8];
            }
        }
        this.field3734 = var7 + 1;
        this.field3729 = new int[this.field3734];
        this.field3735 = new int[this.field3734];
        this.field3728 = new int[this.field3734];
        this.field3732 = new int[this.field3734][];
        this.field3731 = new int[this.field3734];
        if (var5 != 0) {
            this.field3743 = new int[this.field3734];
            for (int var9 = 0; var9 < this.field3734; var9++) {
                this.field3743[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3750; var10++) {
                this.field3743[this.field3741[var10]] = var3.method70(65280);
            }
            this.field3736 = new class163(this.field3743);
        }
        for (int var11 = 0; var11 < this.field3750; var11++) {
            this.field3731[this.field3741[var11]] = var3.method70(65280);
        }
        for (int var12 = 0; var12 < this.field3750; var12++) {
            this.field3729[this.field3741[var12]] = var3.method70(65280);
        }
        for (int var13 = 0; var13 < this.field3750; var13++) {
            this.field3735[this.field3741[var13]] = var3.method65((byte) 125);
        }
        for (int var14 = 0; var14 < this.field3750; var14++) {
            int var21 = 0;
            int var22 = this.field3741[var14];
            int var23 = this.field3735[var22];
            int var24 = -1;
            this.field3732[var22] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field3732[var22][var25] = var21 += var3.method65((byte) 114);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field3728[var22] = var24 + 1;
            if (var24 + 1 == var23) {
                this.field3732[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field3742 = new class163[var7 + 1];
        this.field3733 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field3750; var15++) {
            int var16 = this.field3741[var15];
            int var17 = this.field3735[var16];
            this.field3733[var16] = new int[this.field3728[var16]];
            for (int var18 = 0; var18 < this.field3728[var16]; var18++) {
                this.field3733[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field3732[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field3732[var16][var19];
                }
                this.field3733[var16][var20] = var3.method70(65280);
            }
            this.field3742[var16] = new class163(this.field3733[var16]);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lva;IIZ)V")
    public static final void method1477(class120 arg0, int arg1, int arg2, boolean arg3) {
        field3737++;
        if (!arg3) {
            return;
        }
        if (arg0.field1364 == arg1 && arg1 != -1) {
            class138 var4 = class193.method1396(-30590, arg1);
            int var5 = var4.field2709;
            if (var5 == 1) {
                arg0.field1356 = 0;
                arg0.field1381 = 0;
                arg0.field1386 = arg2;
                arg0.field1402 = 0;
                class53.method518(arg0.field1360, arg0.field1336, -127, arg0.field1402, var4, class247.field4394 == arg0);
            }
            if (var5 == 2) {
                arg0.field1356 = 0;
                return;
            }
        } else if (arg1 == -1 || arg0.field1364 == -1 || class193.method1396(-30590, arg1).field2698 >= class193.method1396(-30590, arg0.field1364).field2698) {
            arg0.field1368 = arg0.field1388;
            arg0.field1356 = 0;
            arg0.field1402 = 0;
            arg0.field1381 = 0;
            arg0.field1364 = arg1;
            arg0.field1386 = arg2;
            if (arg0.field1364 != -1) {
                class53.method518(arg0.field1360, arg0.field1336, -127, arg0.field1402, class193.method1396(-30590, arg0.field1364), class247.field4394 == arg0);
                return;
            }
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public static void method1478(byte arg0) {
        field3730 = null;
        field3748 = null;
        if (arg0 == -111) {
            field3746 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "([BI)V")
    public class208(byte[] arg0, int arg1) {
        this.field3738 = class185.method1334(112, arg0.length, arg0);
        if (this.field3738 != arg1) {
            throw new RuntimeException();
        }
        this.method1476(true, arg0);
    }
}
