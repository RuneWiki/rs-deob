import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class79 extends class80 {

    @OriginalMember(owner = "client!fv", name = "L", descriptor = "Los;")
    public static class309 field1573 = new class309("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!fv", name = "N", descriptor = "Lmf;")
    public static class291 field1575 = new class291();

    @OriginalMember(owner = "client!fv", name = "R", descriptor = "[Ljv;")
    public static class57[] field1579 = new class57[14];

    @OriginalMember(owner = "client!fv", name = "Q", descriptor = "I")
    public static int field1578 = -1;

    @OriginalMember(owner = "client!fv", name = "P", descriptor = "I")
    public static int field1577 = -1;

    @OriginalMember(owner = "client!fv", name = "S", descriptor = "Ls;")
    public static class186 field1580 = new class186(9, 11);

    @OriginalMember(owner = "client!fv", name = "T", descriptor = "Los;")
    public static class309 field1581 = new class309("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!fv", name = "I", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!fv", name = "J", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!fv", name = "K", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!fv", name = "M", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!fv", name = "O", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)V", line = 6)
    public static void method704(int arg0) {
        if (arg0 > -73) {
            field1577 = -84;
        }
        field1575 = null;
        field1580 = null;
        field1581 = null;
        field1579 = null;
        field1573 = null;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "()V", line = 20)
    public class79() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)[I", line = 25)
    public final int[] method25(int arg0, int arg1) {
        ++field1574;
        if (arg1 != -16828) {
            field1573 = null;
        }
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (super.field1601.field124) {
            for (int var4 = 0; ~class137.field2308 < ~var4; ++var4) {
                this.method705((byte) -100, arg0, var4);
                int[] var5 = this.method710(class212.field3377, 0, (byte) 83);
                var3[var4] = var5[class62.field1269];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IILnn;)V", line = 59)
    public final void method26(int arg0, int arg1, class289 arg2) {
        int var4 = -47 % ((arg1 - 28) / 53);
        if (arg0 == 0) {
            super.field1591 = arg2.method1858(-3256) == 1;
        }
        ++field1570;
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(II)[[I", line = 76)
    public final int[][] method29(int arg0, int arg1) {
        ++field1576;
        int[][] var3 = super.field1589.method859(arg1, 127);
        if (super.field1589.field1884) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class137.field2308; ++var7) {
                this.method705((byte) -110, arg1, var7);
                int[][] var8 = this.method713(0, -22, class212.field3377);
                var4[var7] = var8[0][class62.field1269];
                var5[var7] = var8[1][class62.field1269];
                var6[var7] = var8[2][class62.field1269];
            }
        }
        if (arg0 != 255) {
            field1575 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BII)V", line = 119)
    private final void method705(byte arg0, int arg1, int arg2) {
        ++field1572;
        int var4 = class460.field6860[arg2];
        int var5 = class44.field795[arg1];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class212.field3377 = arg1;
            class62.field1269 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class62.field1269 = arg1;
            class212.field3377 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class62.field1269 = -arg1 + class137.field2308;
            class212.field3377 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class212.field3377 = -arg1 + class278.field4199;
            class62.field1269 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class62.field1269 = -arg2 + class137.field2308;
            class212.field3377 = -arg1 + class278.field4199;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class212.field3377 = class278.field4199 - arg2;
            class62.field1269 = -arg1 + class137.field2308;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class212.field3377 = -arg2 + class278.field4199;
            class62.field1269 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class62.field1269 = -arg2 + class137.field2308;
            class212.field3377 = arg1;
        }
        class62.field1269 &= class308.field4672;
        class212.field3377 &= class359.field5269;
        if (arg0 >= -32) {
            field1573 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(II)V", line = 192)
    public static final void method706(int arg0, int arg1) {
        ++field1571;
        if (arg1 != 1) {
            field1573 = null;
        }
        if (~arg0 > -1 || ~arg0 < -3) {
            arg0 = 0;
        }
        class5.field96 = arg0;
    }
}
