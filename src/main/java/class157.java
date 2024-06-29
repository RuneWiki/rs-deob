import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class157 {

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public int field2589 = -1;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Ldf;")
    public static class51 field2588 = class46.method233("::errortest", 100);

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field2595 = 0;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "[[I")
    public static int[][] field2600 = new int[104][104];

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public int field2586;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public int field2587;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public int field2590;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public int field2592;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public int field2596;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public int field2597;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public int field2599;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public int field2601;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lu;I)V")
    public static final void method1117(class111 arg0, int arg1) {
        field2591++;
        class12.field180 = arg0;
        if (arg1 != 0) {
            method1119(101, (class121) null);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILwc;)Z")
    public static final boolean method1118(int arg0, class213 arg1) {
        field2594++;
        if (arg1.field3683 == null) {
            return false;
        }
        int var2 = -4 % ((arg0 + 76) / 43);
        for (int var3 = 0; var3 < arg1.field3683.length; var3++) {
            int var4 = class139.method1009(arg1, (byte) 93, var3);
            int var5 = arg1.field3611[var3];
            if (arg1.field3683[var3] == 2) {
                if (var4 >= var5) {
                    return false;
                }
            } else if (arg1.field3683[var3] == 3) {
                if (var4 <= var5) {
                    return false;
                }
            } else if (arg1.field3683[var3] == 4) {
                if (var4 == var5) {
                    return false;
                }
            } else if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILlb;)V")
    public static final void method1119(int arg0, class121 arg1) {
        field2593++;
        byte[] var2 = new byte[24];
        if (class244.field4225 != null) {
            try {
                class244.field4225.method1785(0L, 19303);
                class244.field4225.method1786(var2, 0);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        int var5 = 53 / ((arg0 - 34) / 43);
        arg1.method920(0, var2, 24, 7521);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method1120(int arg0) {
        if (arg0 != -26823) {
            field2595 = -55;
        }
        field2600 = null;
        field2588 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILvj;Lvj;)V")
    public static final void method1121(int arg0, class107 arg1, class107 arg2) {
        field2598++;
        if (arg2.field1758 != null) {
            arg2.method764((byte) -91);
        }
        if (arg0 <= -27) {
            arg2.field1770 = arg1;
            arg2.field1758 = arg1.field1758;
            arg2.field1758.field1770 = arg2;
            arg2.field1770.field1758 = arg2;
        }
    }
}
