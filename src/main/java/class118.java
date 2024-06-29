import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class118 implements class60 {

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lwf;")
    private class70 field1402 = new class70(256);

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lra;")
    private class57 field1407;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Lra;")
    private class57 field1398;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "[Lhl;")
    private class311[] field1408;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field1404 = 0;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Len;")
    public static class174 field1400;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Lra;")
    public static class57 field1403;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1397;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "[Lkh;")
    public static class11[] field1411;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "[S")
    public static short[] field1412;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIFIIZ)[I", line = 9)
    public final int[] method373(int arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5) {
        field1395++;
        if (arg4 != 8125) {
            field1400 = null;
        }
        return this.method666(-114, arg1).method1837((double) arg2, arg0, (byte) 83, arg3, arg5, this, this.field1398, this.field1408[arg1].field4439);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZZ)Z", line = 20)
    public static boolean method663(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)Z", line = 27)
    public final boolean method369(int arg0, byte arg1) {
        if (arg1 != -100) {
            field1411 = null;
        }
        field1406++;
        class288 var3 = this.method666(32, arg0);
        return var3 != null && var3.method1831(this, 246, this.field1398);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZBIFI)[F", line = 42)
    public final float[] method370(int arg0, boolean arg1, byte arg2, int arg3, float arg4, int arg5) {
        field1396++;
        if (arg2 > -16) {
            field1412 = null;
        }
        return this.method666(-118, arg0).method1832(arg3, 0, arg5, this.field1408[arg0].field4439, this, this.field1398);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(IB)Lhl;", line = 55)
    public final class311 method371(int arg0, byte arg1) {
        if (arg1 != 96) {
            this.method370(43, true, (byte) 116, 37, -0.31088722F, -69);
        }
        field1401++;
        return this.field1408[arg0];
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILac;)V", line = 67)
    public static final void method664(int arg0, class319 arg1) {
        class132.field1814[arg0] = arg1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 71)
    public static void method665(int arg0) {
        field1400 = null;
        field1397 = null;
        field1412 = null;
        if (arg0 != 25438) {
            field1411 = null;
        }
        field1403 = null;
        field1411 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZIFI)[I", line = 85)
    public final int[] method372(int arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5) {
        field1399++;
        int var7 = -100 % ((-arg1 - 38) / 48);
        return this.method666(-99, arg3).method1833((double) arg4, arg5, arg0, this, (byte) 101, this.field1408[arg3].field4439, this.field1398);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Lva;", line = 99)
    private final class288 method666(int arg0, int arg1) {
        field1405++;
        class396 var3 = this.field1402.method410((byte) -75, (long) arg1);
        if (var3 != null) {
            return (class288) var3;
        }
        byte[] var4 = this.field1407.method348(arg1, 0);
        if (var4 == null) {
            return null;
        } else {
            class288 var5 = new class288(new class211(var4));
            this.field1402.method414(var5, (byte) 66, (long) arg1);
            int var6 = 68 % ((arg0 + 32) / 63);
            return var5;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lra;Lra;Lra;)V", line = 135)
    public class118(class57 arg0, class57 arg1, class57 arg2) {
        this.field1407 = arg1;
        this.field1398 = arg2;
        class211 var4 = new class211(arg0.method361(0, 94, 0));
        int var5 = var4.method1355(32136);
        this.field1408 = new class311[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1342((byte) -126) == 1) {
                this.field1408[var6] = new class311();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field1408[var7] != null) {
                this.field1408[var7].field4436 = var4.method1342((byte) -126) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field1408[var8] != null) {
                this.field1408[var8].field4450 = var4.method1342((byte) -127) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1408[var9] != null) {
                this.field1408[var9].field4442 = var4.method1342((byte) -126) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field1408[var10] != null) {
                this.field1408[var10].field4437 = var4.method1342((byte) -127) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field1408[var11] != null) {
                this.field1408[var11].field4454 = var4.method1373((byte) 30);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field1408[var12] != null) {
                this.field1408[var12].field4432 = var4.method1373((byte) 30);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field1408[var13] != null) {
                this.field1408[var13].field4447 = var4.method1373((byte) 30);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field1408[var14] != null) {
                this.field1408[var14].field4440 = var4.method1373((byte) 30);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field1408[var15] != null) {
                this.field1408[var15].field4451 = (short) var4.method1355(32136);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field1408[var16] != null) {
                this.field1408[var16].field4429 = var4.method1373((byte) 30);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field1408[var17] != null) {
                this.field1408[var17].field4441 = var4.method1373((byte) 30);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field1408[var18] != null) {
                this.field1408[var18].field4453 = var4.method1342((byte) -128) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field1408[var19] != null) {
                this.field1408[var19].field4439 = var4.method1342((byte) -127) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field1408[var20] != null) {
                this.field1408[var20].field4430 = var4.method1373((byte) 30);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field1408[var21] != null) {
                this.field1408[var21].field4434 = var4.method1342((byte) -126) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field1408[var22] != null) {
                this.field1408[var22].field4431 = var4.method1342((byte) -126) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field1408[var23] != null) {
                this.field1408[var23].field4443 = var4.method1342((byte) -126) == 1;
            }
        }
    }
}
