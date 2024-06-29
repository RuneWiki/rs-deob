import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class94 {

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public int field1464 = -1;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public int field1468 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
    public boolean field1460 = true;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public int field1465 = 16;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Z")
    public boolean field1461 = false;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public int field1463 = 128;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "Z")
    public boolean field1477 = true;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public int field1476 = -1;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public int field1478 = 8;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public int field1479 = 1190717;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Lce;")
    public static class126 field1472 = class206.method1445(-7923, "::fpson");

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Z")
    public static boolean field1474 = true;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "[Lsh;")
    public static class32[] field1475 = new class32[4];

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZLcc;)Lbc;", line = 8)
    public static final class150 method642(int arg0, boolean arg1, class313 arg2) {
        if (arg1) {
            byte[] var3 = arg2.method2168(arg0, (byte) 26);
            field1462++;
            return var3 == null ? null : new class150(var3);
        } else {
            return (class150) null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILbb;I)V", line = 32)
    private final void method643(int arg0, int arg1, class134 arg2, int arg3) {
        int var5 = 78 / ((-arg1 - 27) / 55);
        field1467++;
        if (arg0 == 1) {
            this.field1468 = class48.method301(8, arg2.method949(20732));
        } else if (arg0 == 2) {
            this.field1476 = arg2.method948(-121);
        } else if (arg0 == 3) {
            this.field1476 = arg2.method942(true);
            if (this.field1476 == 65535) {
                this.field1476 = -1;
            }
        } else if (arg0 == 5) {
            this.field1460 = false;
        } else if (arg0 == 7) {
            this.field1464 = class48.method301(8, arg2.method949(20732));
        } else if (arg0 == 8) {
            class19.field262 = arg3;
        } else if (arg0 == 9) {
            this.field1463 = arg2.method942(true);
        } else if (arg0 == 10) {
            this.field1477 = false;
        } else if (arg0 == 11) {
            this.field1478 = arg2.method948(-121);
        } else if (arg0 == 12) {
            this.field1461 = true;
        } else if (arg0 == 13) {
            this.field1479 = arg2.method949(20732);
        } else if (arg0 == 14) {
            this.field1465 = arg2.method948(-123);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 95)
    public static void method644(int arg0) {
        if (arg0 > -112) {
            field1472 = (class126) null;
        }
        field1475 = null;
        field1472 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)I", line = 108)
    public static final int method645(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            method647((int[]) null, 62, 20, 84, 122);
        }
        field1466++;
        return arg0 > arg2 ? arg0 : (arg3 >= arg2 ? arg2 : arg3);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILbb;I)V", line = 149)
    public final void method646(int arg0, class134 arg1, int arg2) {
        if (arg0 != 14) {
            method645(-121, 14, -79, 46);
        }
        while (true) {
            int var4 = arg1.method948(arg0 ^ 0xFFFFFF8F);
            if (var4 == 0) {
                field1473++;
                return;
            }
            this.method643(var4, 74, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([IIIII)V", line = 172)
    public static final void method647(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        arg1--;
        field1470++;
        int var11 = arg3 - 1;
        int var5 = arg2 + var11;
        while (var5 > arg1) {
            int var6 = arg1 + 1;
            arg0[var6] = arg4;
            int var7 = var6 + 1;
            arg0[var7] = arg4;
            int var8 = var7 + 1;
            arg0[var8] = arg4;
            int var9 = var8 + 1;
            arg0[var9] = arg4;
            int var10 = var9 + 1;
            arg0[var10] = arg4;
            int var12 = var10 + 1;
            arg0[var12] = arg4;
            int var13 = var12 + 1;
            arg0[var13] = arg4;
            arg1 = var13 + 1;
            arg0[arg1] = arg4;
        }
        while (arg1 < var11) {
            arg1++;
            arg0[arg1] = arg4;
        }
    }
}
