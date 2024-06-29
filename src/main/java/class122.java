import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class122 {

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "[S")
    public static short[] field1503 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "Lar;")
    public static class47 field1504 = new class47(64);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public int field1507;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "Lhr;")
    public class122 field1511;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "Lhd;")
    public class17 field1505;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V", line = 8)
    public static void method645(byte arg0) {
        field1504 = null;
        field1503 = null;
        if (arg0 != -114) {
            method651((String) null, (class286) null, 103, false);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V", line = 20)
    public final void method646(int arg0) {
        field1502++;
        if (class119.field1488 >= 500) {
            return;
        }
        this.field1507 = 0;
        this.field1505 = null;
        if (arg0 > 38) {
            this.field1511 = class109.field1342;
            class119.field1488++;
            class109.field1342 = this;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ltq;I)Lri;", line = 42)
    public static final class97 method647(class250 arg0, int arg1) {
        field1506++;
        if (arg1 > -110) {
            field1504 = null;
        }
        class97 var2 = new class97();
        var2.field1148 = arg0.method1374(-2);
        var2.field1150 = class206.method1118(var2.field1148, 32767);
        return var2;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIIIII)V", line = 57)
    public static final void method648(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 <= 113) {
            method648(30, 102, 124, -13, -41, 71, 121, -60, 83);
        }
        field1509++;
        if (class262.method1460((byte) -123, arg2)) {
            class62.method334(arg6, class235.field3227[arg2], arg0, arg4, (byte) -100, arg5, arg3, arg8, -1, arg7);
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class321.field4290[var9] = true;
            }
        } else {
            class321.field4290[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIBI)Llo;", line = 88)
    public static final class419 method649(int arg0, int arg1, byte arg2, int arg3) {
        field1510++;
        if (arg2 >= -39) {
            return null;
        }
        class96 var4 = class176.field2209[arg3][arg1][arg0];
        if (var4 == null) {
            return null;
        }
        class419 var5 = null;
        int var6 = -1;
        for (class122 var7 = var4.field1130; var7 != null; var7 = var7.field1511) {
            class17 var8 = var7.field1505;
            if (var8 instanceof class419) {
                class419 var9 = (class419) var8;
                int var10 = (var9.method857((byte) -106) - 1) * 64 + 60;
                int var11 = var9.field152 - var10 >> 7;
                int var12 = var9.field154 - var10 >> 7;
                int var13 = var9.field152 + var10 >> 7;
                int var14 = var9.field154 + var10 >> 7;
                if (arg1 >= var11 && var12 <= arg0 && var13 >= arg1 && var14 >= arg0) {
                    int var15 = (var14 + 1 - arg0) * (var13 + 1 - arg1);
                    if (var6 < var15) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;Ltq;I)I", line = 151)
    public static final int method650(String arg0, class250 arg1, int arg2) {
        field1501++;
        int var3 = arg1.field3389;
        byte[] var4 = class172.method903((byte) 90, arg0);
        if (arg2 <= 106) {
            return -36;
        } else {
            arg1.method1377(var4.length, 2);
            arg1.field3389 += class319.field4268.method2205(var4.length, 0, true, arg1.field3406, var4, arg1.field3389);
            return arg1.field3389 - var3;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;Lam;IZ)Lpm;", line = 173)
    public static final class10 method651(String arg0, class286 arg1, int arg2, boolean arg3) {
        field1508++;
        int var4 = arg1.method1700(arg0, (byte) -70);
        if (var4 == -1) {
            return new class10(0);
        }
        int var5 = 9 % ((arg2 - 5) / 46);
        int[] var6 = arg1.method1685(0, var4);
        class10 var7 = new class10(var6.length);
        int var8 = 0;
        int var9 = 0;
        while (true) {
            while (var7.field94 > var8) {
                class250 var10 = new class250(arg1.method1687(var6[var9++], var4, 255));
                int var11 = var10.method1359(255);
                int var12 = var10.method1374(-2);
                int var13 = var10.method1350(31351);
                if (!arg3 && var13 == 1) {
                    var7.field94--;
                } else {
                    var7.field87[var8] = var11;
                    var7.field88[var8] = var12;
                    var8++;
                }
            }
            return var7;
        }
    }
}
