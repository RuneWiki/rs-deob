import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public abstract class class194 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Lsg;")
    public static class30 field3497 = class167.method1221((byte) 33, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field3500 = 0;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lsg;")
    public static class30 field3506 = class167.method1221((byte) 33, "Liste der Welten geladen");

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "[[[I")
    public static int[][][] field3505;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
    public abstract void method1401(int arg0, int arg1);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method1402(int arg0, byte arg1);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)I")
    public abstract int method1403(byte arg0, int arg1);

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)V")
    public static final void method1404(int arg0, int arg1) {
        field3502++;
        class266 var2 = class74.field1659;
        synchronized (class74.field1659) {
            if (arg0 >= -76) {
                method1405(true, (int[]) null, -41, -17, 121);
            }
            class35.field859 = arg1;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z[IIII)V")
    public static final void method1405(boolean arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            return;
        }
        field3503++;
        arg3--;
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        while (var5 > arg3) {
            int var7 = arg3 + 1;
            arg1[var7] = arg4;
            int var8 = var7 + 1;
            arg1[var8] = arg4;
            int var9 = var8 + 1;
            arg1[var9] = arg4;
            int var10 = var9 + 1;
            arg1[var10] = arg4;
            int var11 = var10 + 1;
            arg1[var11] = arg4;
            int var12 = var11 + 1;
            arg1[var12] = arg4;
            int var13 = var12 + 1;
            arg1[var13] = arg4;
            arg3 = var13 + 1;
            arg1[arg3] = arg4;
        }
        while (var6 > arg3) {
            arg3++;
            arg1[arg3] = arg4;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lsg;II)V")
    public static final void method1406(class30 arg0, int arg1, int arg2) {
        field3499++;
        class30 var3 = arg0.method266(37).method256(arg2 - 22395);
        boolean var4 = false;
        if (arg2 != 22472) {
            field3506 = null;
        }
        for (int var5 = 0; var5 < class28.field528; var5++) {
            class120 var6 = class75.field1670[class183.field3378[var5]];
            if (var6 != null && var6.field2349 != null && var6.field2349.method285(var3, arg2 - 22472)) {
                class96.method786(var6.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var6.field1372[0]);
                var4 = true;
                if (arg1 == 1) {
                    class196.field3553.method1267(237, -9);
                    class276.field4815++;
                    class196.field3553.method71(class183.field3378[var5], 255);
                } else if (arg1 == 4) {
                    class196.field3553.method1267(42, arg2 - 22481);
                    class196.field3553.method71(class183.field3378[var5], 255);
                    class28.field519++;
                } else if (arg1 == 5) {
                    class196.field3553.method1267(177, -9);
                    class196.field3553.method97(class183.field3378[var5], (byte) -2);
                    class74.field1655++;
                } else if (arg1 == 6) {
                    class183.field3362++;
                    class196.field3553.method1267(183, arg2 - 22481);
                    class196.field3553.method87(-55174520, class183.field3378[var5]);
                } else if (arg1 == 7) {
                    class196.field3553.method1267(84, arg2 ^ 0xFFFFA83F);
                    class196.field3553.method48(class183.field3378[var5], arg2 - 22420);
                    class31.field801++;
                }
                break;
            }
        }
        if (!var4) {
            class268.method1838(0, -1, class160.method1188(new class30[] { class137.field2671, var3 }, 0), class55.field1203);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I[B)Z")
    public static final boolean method1407(int arg0, byte[] arg1) {
        field3501++;
        class8 var2 = new class8(arg1);
        int var3 = var2.method63((byte) 107);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method63((byte) 101) == 1;
        if (var4) {
            class215.method1576((byte) -38, var2);
        }
        class44.method455(76, var2);
        if (arg0 != 17915) {
            field3506 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static void method1408(byte arg0) {
        int var1 = 67 % ((-arg0 - 30) / 56);
        field3506 = null;
        field3497 = null;
        field3505 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)Ltk;")
    public abstract class208 method1409(boolean arg0);
}
