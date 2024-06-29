import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class223 extends class182 {

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "Lkh;")
    public static class117 field4031 = class224.method1450((byte) -90, "; Expires=");

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "Lkh;")
    public static class117 field4028 = class224.method1450((byte) -42, "labels)3dat");

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
    public int field4026;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
    public int field4027;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "I")
    public int field4032;

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "I")
    public int field4034;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "Lai;")
    public static class10 field4019;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "Lkh;")
    public class117 field4022;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "Ls;")
    public static class197 field4020;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "[I")
    public int[] field4016;

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "[I")
    public int[] field4033;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "[Lkh;")
    public class117[] field4030;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "[Lff;")
    public class62[] field4017;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "[Lah;")
    public static class9[] field4023;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public static void method1444(int arg0) {
        field4028 = null;
        if (arg0 != 16777215) {
            field4019 = null;
        }
        field4031 = null;
        field4020 = null;
        field4019 = null;
        field4023 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BIIII)V")
    public static final void method1445(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -36 / ((arg0 + 34) / 52);
        if (arg1 <= arg4) {
            for (int var6 = arg1; var6 < arg4; var6++) {
                class167.field3030[var6][arg3] = arg2;
            }
        } else {
            for (int var7 = arg4; var7 < arg1; var7++) {
                class167.field3030[var7][arg3] = arg2;
            }
        }
        field4015++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Z")
    public static final boolean method1446(int arg0, int arg1) {
        field4025++;
        if (class96.field1760[arg0]) {
            return true;
        } else if (class11.field366.method89((byte) -87, arg0)) {
            int var2 = class11.field366.method108(arg0, 0);
            if (var2 == 0) {
                class96.field1760[arg0] = true;
                return true;
            }
            if (class90.field1675[arg0] == null) {
                class90.field1675[arg0] = new class9[var2];
            }
            if (arg1 != 6) {
                field4019 = null;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class90.field1675[arg0][var3] == null) {
                    byte[] var4 = class11.field366.method104(arg1 ^ 0xFFFFFFCA, arg0, var3);
                    if (var4 != null) {
                        class90.field1675[arg0][var3] = new class9();
                        class90.field1675[arg0][var3].field218 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class90.field1675[arg0][var3].method68(new class145(var4), arg1 - 44);
                        } else {
                            class90.field1675[arg0][var3].method72(121, new class145(var4));
                        }
                    }
                }
            }
            class96.field1760[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjava/util/Random;B)I")
    public static final int method1447(int arg0, Random arg1, byte arg2) {
        field4029++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class117.method780((byte) -117, arg0)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else {
            if (arg2 != -79) {
                field4020 = null;
            }
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class60.method447(arg0, var4, true);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lkh;IZ)V")
    public static final void method1448(class117 arg0, int arg1, boolean arg2) {
        byte var3 = 4;
        field4021++;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class53.field1081.method943(arg0, 250);
        int var7 = class53.field1081.method921(arg0, 250) * 13;
        class83.method579(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var3 + var7, 0);
        class83.method586(var4 - var3, -var3 + var5, var3 + var3 + var6, var3 + var7 - -var3, 16777215);
        class53.field1081.method919(arg0, var4, var5, var6, var7, 16777215, -1, 1, arg1, 0);
        class214.method1407(var3 + var7 + var3, -var3 + var5, 18320, var3 + var6 + var3, -var3 + var4);
        if (!arg2) {
            class94.method642(var6, var4, var7, false, var5);
            return;
        }
        Canvas var8 = class85.field1608;
        try {
            Graphics var9 = var8.getGraphics();
            class23.field588.method36(0, var9, (byte) -94, 0);
        } catch (Exception var10) {
            var8.repaint();
        }
    }
}
