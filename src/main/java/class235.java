import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class235 extends class282 {

    @OriginalMember(owner = "client!qm", name = "T", descriptor = "I")
    public static int field4062 = 0;

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "Lni;")
    public static class24 field4056 = new class24(100);

    @OriginalMember(owner = "client!qm", name = "X", descriptor = "Z")
    public static boolean field4066 = false;

    @OriginalMember(owner = "client!qm", name = "Z", descriptor = "[F")
    public static float[] field4068 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!qm", name = "bb", descriptor = "I")
    public static int field4070 = 0;

    @OriginalMember(owner = "client!qm", name = "db", descriptor = "Ljf;")
    public static class229 field4072 = class212.method1457((byte) 86, "Weiter");

    @OriginalMember(owner = "client!qm", name = "R", descriptor = "F")
    public static float field4060;

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!qm", name = "P", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!qm", name = "Q", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!qm", name = "S", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!qm", name = "U", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!qm", name = "V", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!qm", name = "W", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!qm", name = "Y", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!qm", name = "eb", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!qm", name = "cb", descriptor = "Lui;")
    private class268 field4071;

    @OriginalMember(owner = "client!qm", name = "ab", descriptor = "Lbb;")
    public static class92 field4069;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)V", line = 5)
    public static final void method1674(int arg0) {
        class107.field1868.method230(true);
        int var1 = 10 / ((-arg0 - 8) / 41);
        field4064++;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BJ)V", line = 16)
    public static final void method1675(byte arg0, long arg1) {
        field4073++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class169.method1150(arg1 - 1L, -53);
            class169.method1150(1L, -38);
        } else {
            class169.method1150(arg1, -38);
        }
        if (arg0 != -22) {
            method1676(-7);
        }
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)V", line = 38)
    public static void method1676(int arg0) {
        field4072 = null;
        field4056 = null;
        field4068 = null;
        field4069 = null;
        if (arg0 > -27) {
            method1677(-63, 72, (class229) null, (class229) null);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILjf;Ljf;)V", line = 52)
    public static final void method1677(int arg0, int arg1, class229 arg2, class229 arg3) {
        class71.field1369 = arg0;
        class331.field5641 = arg3;
        field4058++;
        class331.field5629 = arg2;
        if (class331.field5629.method1641((byte) -64, class331.field5638) || class331.field5641.method1641((byte) -64, class331.field5638)) {
            class4.field27 = 3;
        } else if (class3.field14 == -1) {
            class312.field5253 = 1;
            class123.field2171 = 0;
            class213.field3652 = 0;
            class4.field27 = -3;
            class14 var4 = new class14(128);
            var4.method140(10, (byte) 75);
            var4.method125(-25369, (int) (Math.random() * 99999.0D));
            var4.method125(-25369, 523);
            var4.method118(class331.field5629.method1617(123), (byte) -125);
            var4.method100((int) (Math.random() * 9.9999999E7D), 65280);
            var4.method107((byte) -21, class331.field5641);
            var4.method100((int) (Math.random() * 9.9999999E7D), 65280);
            var4.method115((byte) 23, class168.field2879, class137.field2379);
            class84.field1608.field195 = 0;
            class84.field1608.method140(199, (byte) 75);
            if (arg1 != -13352) {
                field4062 = -91;
            }
            class84.field1608.method140(var4.field195, (byte) 75);
            class84.field1608.method90(false, var4.field195, var4.field174, 0);
        } else {
            class327.method2198(arg1 + 13349);
        }
    }

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V", line = 104)
    public static final void method1678(int arg0) {
        int var1 = -114 / ((34 - arg0) / 59);
        field4059++;
        if (class217.field3720 != null) {
            class78 var2 = class217.field3720;
            synchronized (class217.field3720) {
                class217.field3720 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljf;IB)Ljf;", line = 123)
    public final class229 method1679(class229 arg0, int arg1, byte arg2) {
        if (arg2 != 1) {
            return (class229) null;
        }
        field4061++;
        if (this.field4071 == null) {
            return arg0;
        } else {
            class29 var4 = (class29) this.field4071.method1890((long) arg1, arg2 - 122);
            return var4 == null ? arg0 : var4.field515;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(III)I", line = 144)
    public final int method1680(int arg0, int arg1, int arg2) {
        field4057++;
        if (this.field4071 == null) {
            return arg2;
        }
        if (arg1 != 0) {
            method1676(53);
        }
        class93 var4 = (class93) this.field4071.method1890((long) arg0, -94);
        return var4 == null ? arg2 : var4.field1678;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILkh;)V", line = 170)
    public final void method1681(int arg0, class14 arg1) {
        while (true) {
            int var3 = arg1.method93(false);
            if (var3 == 0) {
                field4067++;
                int var4 = -95 / ((20 - arg0) / 54);
                return;
            }
            this.method1682((byte) 46, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BILkh;)V", line = 189)
    private final void method1682(byte arg0, int arg1, class14 arg2) {
        if (arg0 != 46) {
            return;
        }
        field4065++;
        if (arg1 != 249) {
            return;
        }
        int var4 = arg2.method93(false);
        if (this.field4071 == null) {
            int var5 = class5.method28(-111, var4);
            this.field4071 = new class268(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method93(false) == 1;
            int var8 = arg2.method114(0);
            class242 var9;
            if (var7) {
                var9 = new class29(arg2.method105((byte) 124));
            } else {
                var9 = new class93(arg2.method128((byte) 4));
            }
            this.field4071.method1885((long) var8, var9, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)V", line = 257)
    public static final void method1683(int arg0, int arg1) {
        class305.field5161.method231((byte) 113, arg1);
        field4063++;
        if (arg0 != -8826) {
            method1683(-79, -73);
        }
    }
}
