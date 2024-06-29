import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class98 extends class329 implements class521 {

    @OriginalMember(owner = "client!me", name = "l", descriptor = "[F")
    public static float[] field1332 = new float[4];

    @OriginalMember(owner = "client!me", name = "m", descriptor = "[I")
    public static int[] field1333 = new int[5];

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Lrf;")
    public static class112 field1337 = null;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "C")
    public char field1340;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public int field1339;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "J")
    public long field1341;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)C")
    public final char method561(boolean arg0) {
        if (!arg0) {
            field1332 = null;
        }
        field1336++;
        return this.field1340;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZIILr;Lbda;I)V")
    public static final void method562(boolean arg0, int arg1, int arg2, class566 arg3, class441 arg4, int arg5) {
        field1338++;
        class542 var6 = class48.field671.method3753(arg4.field5519, (byte) 90);
        if (var6.field7239 == -1) {
            return;
        }
        int var8;
        if (arg4.field5545) {
            int var7 = arg4.field5533 + arg5;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class536 var9 = var6.method2930(arg4.field5554, arg3, var8, -103);
        if (var9 == null || !arg0) {
            return;
        }
        int var10 = arg4.field5525;
        int var11 = arg4.field5534;
        if ((var8 & 0x1) == 1) {
            var10 = arg4.field5534;
            var11 = arg4.field5525;
        }
        int var12 = var9.method160();
        int var13 = var9.method166();
        if (var6.field7245) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field7242 == 0) {
            var9.method2899(arg1, -(var11 * 4) - (-arg2 - 4), var12, var13);
        } else {
            var9.method2901(arg1, arg2 - ((var11 - 1) * 4), var12, var13, 0, var6.field7242 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)I")
    public final int method563(int arg0) {
        if (arg0 != -15194) {
            method562(true, -26, -108, null, null, -126);
        }
        field1334++;
        return this.field1339;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)J")
    public final long method564(int arg0) {
        if (arg0 != 26017) {
            method562(true, 25, -19, null, null, 112);
        }
        field1342++;
        return this.field1341;
    }

    @OriginalMember(owner = "client!me", name = "i", descriptor = "(I)V")
    public static void method565(int arg0) {
        field1337 = null;
        field1332 = null;
        if (arg0 == 4) {
            field1333 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)I")
    public final int method566(byte arg0) {
        if (arg0 > -34) {
            this.field1339 = -47;
        }
        field1343++;
        return this.field1335;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)I")
    public final int method567(int arg0) {
        if (arg0 != 22858) {
            this.method567(-65);
        }
        field1344++;
        return this.field1331;
    }
}
