import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class496 extends class101 implements class313 {

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "Ltm;")
    public static class412 field6853 = new class412();

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "C")
    public char field6863;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public int field6855;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public int field6857;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public int field6862;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "J")
    public long field6864;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)J")
    public final long method1977(int arg0) {
        field6859++;
        if (arg0 <= 36) {
            this.field6862 = 33;
        }
        return this.field6864;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V")
    public static final void method2869(byte arg0, int arg1) {
        class537.field7314 = arg1;
        int var2 = -64 / ((arg0 - 63) / 55);
        field6852++;
        class322.field4711.method1555((byte) -3);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method2870(int arg0, byte[] arg1) {
        field6860++;
        if (arg0 < 18) {
            field6853 = null;
        }
        class376 var2 = new class376(arg1);
        int var3 = var2.method2398(-1372747256);
        int var4 = var2.method2384(111);
        if (var4 < 0 || class184.field2464 != 0 && var4 > class184.field2464) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method2389(0, 689125352, var4, var5);
            return var5;
        } else {
            int var6 = var2.method2384(66);
            if (var6 < 0 || class184.field2464 != 0 && class184.field2464 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class761.method4227(var7, var6, arg1, var4, 9);
            } else {
                class129 var8 = class388.field5640;
                synchronized (class388.field5640) {
                    class388.field5640.method1042(true, var7, var2);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)I")
    public final int method1974(boolean arg0) {
        field6856++;
        if (arg0) {
            this.method1976((byte) 116);
        }
        return this.field6855;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public static void method2871(int arg0) {
        if (arg0 != -1) {
            field6853 = null;
        }
        field6853 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)I")
    public final int method1973(boolean arg0) {
        if (arg0) {
            field6861++;
            return this.field6857;
        } else {
            return -30;
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)[Ljw;")
    public static final class581[] method2872(int arg0) {
        field6858++;
        return arg0 > -26 ? null : new class581[] { class716.field9998, class722.field10054, class154.field2108, class581.field7769, class535.field7287, class737.field10193, class777.field10676, class260.field3870, class791.field10887, class581.field7773, class258.field3852, class180.field2394, class324.field4723, class268.field3950, class315.field4535, class514.field7041, class82.field1158, class620.field8354, class288.field4238, class275.field4075, class372.field5378, class39.field601, class232.field3164, class179.field2384, class159.field2193, class5.field52, class522.field7163, class293.field4274, class60.field821, class756.field10488, class408.field5901, class764.field10562, class245.field3314, class418.field6003, class773.field10643, class319.field4603, class751.field10371, class160.field2196, class270.field3985, class305.field4414, class721.field10049, class486.field6730, class471.field6511, class618.field8336, class290.field4246, class224.field3066, class500.field6892, class454.field6312, class658.field9107, class40.field629, class499.field6879, class357.field5232, class230.field3146, class763.field10533, class238.field3211, class334.field4863, class57.field798, class596.field8127, class400.field5841, class132.field1959, class42.field648, class648.field9004, class499.field6887, class154.field2109, class327.field4758, class165.field2235, class416.field5974, class424.field6054, class565.field7565, class788.field10853, class402.field5848, class429.field6108, class121.field1760, class745.field10290, class280.field4136, class62.field885, class295.field4288, class271.field3994, class498.field6875, class574.field7703, class492.field6821, class26.field386, class303.field4361, class523.field7176, class643.field8921, class406.field5884, class666.field9213, client.field4580, class310.field4463, class394.field5806, class643.field8929, class679.field9492, class74.field1097, class621.field8369, class751.field10387, class424.field6048, class400.field5840, class164.field2223, class97.field1353, class162.field2205, class607.field8244, class186.field2483, class93.field1330, class300.field4341, class733.field10164, class32.field524, class280.field4137, class348.field5106, class245.field3309, class299.field4336, class490.field6803, class428.field6090, class309.field4456, class359.field5247, class329.field4765, class314.field4520, class551.field7454, class793.field10899, class383.field5607, class611.field8306, class614.field8315, class12.field188, class384.field5618, class659.field9118, class470.field6509, class118.field1714, class97.field1355, class290.field4250, class208.field2766, class73.field1048, class339.field4909, class190.field2526, class195.field2608, class247.field3684 };
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)C")
    public final char method1976(byte arg0) {
        field6854++;
        int var2 = 13 % ((-arg0 - 79) / 35);
        return this.field6863;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)I")
    public final int method1975(int arg0) {
        field6865++;
        int var2 = -101 % ((arg0 + 28) / 46);
        return this.field6862;
    }
}
