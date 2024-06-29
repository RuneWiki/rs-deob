import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class class100 extends class352 {

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public int field1417;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "I")
    public static int field1423 = -1;

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "[Z")
    public static boolean[] field1424 = new boolean[100];

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "Lje;")
    public static class178 field1419 = null;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "Lct;")
    public static class285 field1421 = new class285(48, 16);

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!mp", name = "r", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!mp", name = "s", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!mp", name = "t", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!mp", name = "u", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!mp", name = "v", descriptor = "Ltr;")
    public static class229 field1430;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)V")
    public static final void method767(int arg0, int arg1) {
        class87 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class48 var4 = class483.field6781[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class315.field4743; var5++) {
                    for (int var6 = 0; var6 < class412.field5957; var6++) {
                        var2 = var4.method197(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class426.field6091;
                            int var8 = var5 << class426.field6091;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class48 var10 = class483.field6781[var9];
                                if (var10 != null) {
                                    int var11 = var4.method199(var6, var5) - var10.method199(var6, var5);
                                    int var12 = var4.method199(var6 + 1, var5) - var10.method199(var6 + 1, var5);
                                    int var13 = var4.method199(var6 + 1, var5 + 1) - var10.method199(var6 + 1, var5 + 1);
                                    int var14 = var4.method199(var6, var5 + 1) - var10.method199(var6, var5 + 1);
                                    var10.method207(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(B)V")
    public static void method768(byte arg0) {
        field1421 = null;
        field1430 = null;
        if (arg0 < -37) {
            field1419 = null;
            field1424 = null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "(B)Z")
    public static final boolean method769(byte arg0) {
        field1426++;
        if (arg0 != -28) {
            field1424 = null;
        }
        return class186.field2817 > 0;
    }

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "(Z)V")
    public static final void method770(boolean arg0) {
        if (class412.field5953 < 1024.0F) {
            class412.field5953 = 1024.0F;
        }
        if (!arg0) {
            return;
        }
        field1427++;
        if (class412.field5953 > 3072.0F) {
            class412.field5953 = 3072.0F;
        }
        while (class384.field5682 >= 16384.0F) {
            class384.field5682 -= 16384.0F;
        }
        while (class384.field5682 < 0.0F) {
            class384.field5682 += 16384.0F;
        }
        int var1 = class312.field4705 >> 7;
        int var2 = class379.field5641 >> 7;
        int var3 = class25.method219(48602855, class486.field6836, class379.field5641, class312.field4705);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class486.field6836;
                    if (var7 < 3 && class340.method2088(var6, (byte) -4, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class4.field80.field708 != null && class4.field80.field708[var7] != null) {
                        var8 = (class4.field80.field708[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 + var3 - class479.field6745[var7].method199(var5, var6);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class378.field5630) {
            class378.field5630 += (var10 - class378.field5630) / 24;
        } else if (var10 < class378.field5630) {
            class378.field5630 += (var10 - class378.field5630) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(IIII)V")
    public class100(int arg0, int arg1, int arg2, int arg3) {
        this.field1422 = arg2;
        this.field1425 = arg3;
        this.field1417 = arg0;
        this.field1418 = arg1;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(II)Les;")
    public static final class441 method771(int arg0, int arg1) {
        field1429++;
        class441[] var2 = class8.method96(true);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class441 var4 = var2[var3];
            if (var4.field6228 == arg0) {
                return var4;
            }
        }
        if (arg1 != 16515) {
            method773(6, -122, 17, (class47) null);
        }
        return null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIZZ)V")
    public static final void method772(int arg0, int arg1, boolean arg2, boolean arg3) {
        field1428++;
        if (!arg3) {
            field1430 = null;
        }
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class436.field6165 = arg2;
        class462.field6518 = arg1;
        class144.field2047 = arg0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIILpq;)V")
    public static final void method773(int arg0, int arg1, int arg2, class47 arg3) {
        class337 var4 = class15.method139(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field5063 = arg3;
        }
    }
}
