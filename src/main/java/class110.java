import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class110 extends class212 {

    @OriginalMember(owner = "client!v", name = "P", descriptor = "Lwc;")
    public static class232 field1763 = new class232(64);

    @OriginalMember(owner = "client!v", name = "T", descriptor = "Lqe;")
    public static class168 field1767 = class66.method448("overlay2)3dat", -108);

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public int field1757;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "Loe;")
    public static class256 field1765;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
    public static void method712(byte arg0) {
        if (arg0 != 77) {
            method716(-24, -27, 118L, false);
        }
        field1765 = null;
        field1767 = null;
        field1763 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lnh;B)V")
    public final void method713(class112 arg0, byte arg1) {
        if (arg1 != 16) {
            method712((byte) 22);
        }
        while (true) {
            int var3 = arg0.method758(true);
            if (var3 == 0) {
                field1766++;
                return;
            }
            this.method715(var3, true, arg0);
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
    public static final void method714(byte arg0) {
        field1762++;
        if (arg0 > -94) {
            method716(45, 68, 66L, false);
        }
        class112.field1815.method661(-114);
        int var1 = class112.field1815.method671(8, 7);
        if (class82.field1244 > var1) {
            for (int var2 = var1; var2 < class82.field1244; var2++) {
                class38.field518[class58.field794++] = class51.field690[var2];
            }
        }
        if (var1 > class82.field1244) {
            throw new RuntimeException("gnpov1");
        }
        class82.field1244 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class51.field690[var3];
            class222 var5 = class229.field3898[var4];
            int var6 = class112.field1815.method671(1, 7);
            if (var6 == 0) {
                class51.field690[class82.field1244++] = var4;
                var5.field165 = class133.field2326;
            } else {
                int var7 = class112.field1815.method671(2, 7);
                if (var7 == 0) {
                    class51.field690[class82.field1244++] = var4;
                    var5.field165 = class133.field2326;
                    class38.field521[class84.field1278++] = var4;
                } else if (var7 == 1) {
                    class51.field690[class82.field1244++] = var4;
                    var5.field165 = class133.field2326;
                    int var8 = class112.field1815.method671(3, 7);
                    var5.method90(var8, true, false);
                    int var9 = class112.field1815.method671(1, 7);
                    if (var9 == 1) {
                        class38.field521[class84.field1278++] = var4;
                    }
                } else if (var7 == 2) {
                    class51.field690[class82.field1244++] = var4;
                    var5.field165 = class133.field2326;
                    int var10 = class112.field1815.method671(3, 7);
                    var5.method90(var10, true, true);
                    int var11 = class112.field1815.method671(3, 7);
                    var5.method90(var11, true, true);
                    int var12 = class112.field1815.method671(1, 7);
                    if (var12 == 1) {
                        class38.field521[class84.field1278++] = var4;
                    }
                } else if (var7 == 3) {
                    class38.field518[class58.field794++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZLnh;)V")
    private final void method715(int arg0, boolean arg1, class112 arg2) {
        if (!arg1) {
            return;
        }
        field1758++;
        if (arg0 == 1) {
            this.field1764 = arg2.method731(false);
            this.field1757 = arg2.method758(true);
            this.field1759 = arg2.method758(true);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIJZ)Lqe;")
    public static final class168 method716(int arg0, int arg1, long arg2, boolean arg3) {
        field1761++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var5 = 1;
        if (arg1 != 13131) {
            return null;
        }
        long var6 = arg2 / (long) arg0;
        while (var6 != 0L) {
            var6 /= arg0;
            var5++;
        }
        int var8 = var5;
        if (arg2 < 0L || arg3) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg2 < 0L) {
            var9[0] = 45;
        } else if (arg3) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg2 % (long) arg0);
            if (var12 < 0) {
                var12 = -var12;
            }
            arg2 /= arg0;
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class168 var11 = new class168();
        var11.field2870 = var8;
        var11.field2904 = var9;
        return var11;
    }
}
