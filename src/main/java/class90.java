import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class90 {

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public int field1414 = -1;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "[I")
    private int[] field1424 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "Z")
    public boolean field1427 = false;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field1416 = 0;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static volatile int field1419 = -1;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1426 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "Lgk;")
    public static class159 field1429 = new class159();

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "[[S")
    public static short[][] field1431 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "[I")
    private int[] field1428;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "[I")
    public static int[] field1432;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "[S")
    private short[] field1412;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "[S")
    private short[] field1422;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "[S")
    private short[] field1425;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "[S")
    private short[] field1430;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lfl;I)V")
    public final void method577(class248 arg0, int arg1) {
        field1417++;
        if (arg1 > -32) {
            this.field1424 = null;
        }
        while (true) {
            int var3 = arg0.method1593((byte) 27);
            if (var3 == 0) {
                return;
            }
            this.method581(19422, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Lih;")
    public final class208 method578(int arg0) {
        field1420++;
        class208[] var2 = new class208[5];
        int var3 = 0;
        for (int var4 = arg0; var4 < 5; var4++) {
            if (this.field1424[var4] != -1) {
                var2[var3++] = class208.method1332(class199.field3027, this.field1424[var4], 0);
            }
        }
        class208 var5 = new class208(var2, var3);
        if (this.field1425 != null) {
            for (int var6 = 0; var6 < this.field1425.length; var6++) {
                var5.method1340(this.field1425[var6], this.field1412[var6]);
            }
        }
        if (this.field1430 != null) {
            for (int var7 = 0; var7 < this.field1430.length; var7++) {
                var5.method1318(this.field1430[var7], this.field1422[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method579(String arg0, byte arg1) {
        field1421++;
        int var2 = arg0.length();
        if (arg1 != 44) {
            field1419 = -7;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class231.method1474(arg0.charAt(var4), false) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)Lih;")
    public final class208 method580(int arg0) {
        field1411++;
        if (this.field1428 == null) {
            return null;
        }
        class208[] var2 = new class208[this.field1428.length];
        if (arg0 < 106) {
            this.field1414 = 77;
        }
        for (int var3 = 0; var3 < this.field1428.length; var3++) {
            var2[var3] = class208.method1332(class199.field3027, this.field1428[var3], 0);
        }
        class208 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class208(var2, var2.length);
        }
        if (this.field1425 != null) {
            for (int var5 = 0; var5 < this.field1425.length; var5++) {
                var4.method1340(this.field1425[var5], this.field1412[var5]);
            }
        }
        if (this.field1430 != null) {
            for (int var6 = 0; var6 < this.field1430.length; var6++) {
                var4.method1318(this.field1430[var6], this.field1422[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILfl;I)V")
    private final void method581(int arg0, class248 arg1, int arg2) {
        if (arg0 != 19422) {
            this.field1424 = null;
        }
        if (arg2 == 1) {
            this.field1414 = arg1.method1593((byte) 27);
        } else if (arg2 == 2) {
            int var4 = arg1.method1593((byte) 27);
            this.field1428 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1428[var5] = arg1.method1575(false);
            }
        } else if (arg2 == 3) {
            this.field1427 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method1593((byte) 27);
            this.field1425 = new short[var6];
            this.field1412 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1425[var7] = (short) arg1.method1575(false);
                this.field1412[var7] = (short) arg1.method1575(false);
            }
        } else if (arg2 == 41) {
            int var8 = arg1.method1593((byte) 27);
            this.field1430 = new short[var8];
            this.field1422 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1430[var9] = (short) arg1.method1575(false);
                this.field1422[var9] = (short) arg1.method1575(false);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field1424[arg2 - 60] = arg1.method1575(false);
        }
        field1423++;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)Z")
    public final boolean method582(int arg0) {
        field1415++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1424[var3] != -1 && !class199.field3027.method1969(this.field1424[var3], -116, 0)) {
                var2 = false;
            }
        }
        if (arg0 == -1506) {
            return var2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
    public static void method583(int arg0) {
        field1429 = null;
        field1431 = null;
        field1426 = null;
        field1432 = null;
        if (arg0 < 80) {
            field1419 = -35;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Z")
    public final boolean method584(byte arg0) {
        field1413++;
        if (this.field1428 == null) {
            return true;
        } else if (arg0 >= -84) {
            return false;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1428.length; var3++) {
                if (!class199.field3027.method1969(this.field1428[var3], -128, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }
}
