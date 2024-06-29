import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class757 {

    @OriginalMember(owner = "client!sha", name = "h", descriptor = "I")
    public int field10454 = 1;

    @OriginalMember(owner = "client!sha", name = "j", descriptor = "I")
    public static int field10456 = 0;

    @OriginalMember(owner = "client!sha", name = "i", descriptor = "[I")
    public static int[] field10455 = new int[1];

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "Lpa;")
    public static class387 field10447 = new class387(128, 4);

    @OriginalMember(owner = "client!sha", name = "d", descriptor = "C")
    public char field10450;

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "I")
    public static int field10448;

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "I")
    public static int field10449;

    @OriginalMember(owner = "client!sha", name = "e", descriptor = "I")
    public static int field10451;

    @OriginalMember(owner = "client!sha", name = "f", descriptor = "I")
    public static int field10452;

    @OriginalMember(owner = "client!sha", name = "g", descriptor = "I")
    public static int field10453;

    @OriginalMember(owner = "client!sha", name = "k", descriptor = "I")
    public static int field10457;

    @OriginalMember(owner = "client!sha", name = "l", descriptor = "I")
    public static int field10458;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(B)V", line = 4)
    public static void method4180(byte arg0) {
        field10447 = null;
        field10455 = null;
        if (arg0 != 30) {
            method4186(-84, -86, null);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(II)V", line = 15)
    public static final void method4181(int arg0, int arg1) {
        field10449++;
        class558.field7926.method2366(arg1, 107);
        class118.field1471.method2366(arg1, arg0 ^ 0xFFFFD4BE);
        class770.field10619.method2366(arg1, arg0 + 11164);
        if (arg0 != -11056) {
            method4182(-48, null);
        }
        class588.field8318.method2366(arg1, 108);
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILdd;)[I", line = 29)
    public static final int[] method4182(int arg0, class731 arg1) {
        field10451++;
        class120 var2 = new class120(518);
        int[] var3 = new int[4];
        for (int var4 = 0; var4 < 4; var4++) {
            var3[var4] = (int) (Math.random() * 9.9999999E7D);
        }
        var2.method851((byte) -2, 10);
        var2.method879((byte) 86, var3[0]);
        var2.method879((byte) -82, var3[1]);
        if (arg0 != 31035) {
            return null;
        }
        var2.method879((byte) -96, var3[2]);
        var2.method879((byte) -107, var3[3]);
        for (int var5 = 0; var5 < 10; var5++) {
            var2.method879((byte) -106, (int) (Math.random() * 9.9999999E7D));
        }
        var2.method860((int) (Math.random() * 9.9999999E7D), (byte) 114);
        var2.method852(class728.field10191, class379.field5447, true);
        arg1.field10211.method885(var2.field1556, -18983, var2.field1521, 0);
        return var3;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(Lrv;I)V", line = 66)
    public final void method4183(class120 arg0, int arg1) {
        if (arg1 > -53) {
            return;
        }
        field10448++;
        while (true) {
            int var3 = arg0.method842(2384);
            if (var3 == 0) {
                return;
            }
            this.method4184(var3, arg0, false);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILrv;Z)V", line = 89)
    private final void method4184(int arg0, class120 arg1, boolean arg2) {
        field10453++;
        if (arg0 == 1) {
            this.field10450 = class262.method1721(arg1.method877(-252), -110);
        } else if (arg0 == 2) {
            this.field10454 = 0;
        }
        if (arg2) {
            method4186(-47, 42, null);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZLli;)V", line = 110)
    public static final void method4185(boolean arg0, class449 arg1) {
        field10457++;
        if (!arg0) {
            field10458 = -122;
        }
        if (arg1 instanceof class645) {
            class645 var2 = (class645) arg1;
            if (var2.field9071 != null) {
                class380.method2343(var2, class251.field3549.field7710 != var2.field7710, 30845);
                return;
            }
        } else if ((arg1 instanceof class559)) {
            class559 var3 = (class559) arg1;
            class518.method3016(class251.field3549.field7710 != var3.field7710, 5385, var3);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(II[F)[F", line = 154)
    public static final float[] method4186(int arg0, int arg1, float[] arg2) {
        field10452++;
        float[] var3 = new float[arg0];
        class42.method286(arg2, 0, var3, 0, arg0);
        if (arg1 < 25) {
            field10455 = null;
        }
        return var3;
    }
}
