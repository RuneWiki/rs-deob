import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class22 extends class125 {

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public int field520 = -1;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "Z")
    public boolean field527 = false;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
    public int field529 = -1;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public int field519 = -1;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public int field522 = 2;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public int field524 = 5;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
    public int field525 = 99;

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
    public int field532 = -1;

    @OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
    public int field535 = -1;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "Ljd;")
    public static class92 field517 = class202.method1325((byte) 90, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
    public static int field526 = 0;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "[I")
    public int[] field515;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "[I")
    private int[] field528;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "[I")
    public int[] field530;

    @OriginalMember(owner = "client!ca", name = "V", descriptor = "[I")
    public int[] field536;

    @OriginalMember(owner = "client!ca", name = "X", descriptor = "[I")
    private int[] field538;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILdg;II)Ldg;")
    public final class38 method135(int arg0, class38 arg1, int arg2, int arg3) {
        int var5 = this.field530[arg0];
        field516++;
        class47 var6 = class28.method175(var5 >> 16, false);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method245(true);
        }
        class38 var8 = arg1.method245(!var6.method292(var7, (byte) -112));
        int var9 = arg2 & 0x3;
        if (arg3 != -4) {
            field517 = null;
        }
        if (var9 == 1) {
            var8.method250();
        } else if (var9 == 2) {
            var8.method248();
        } else if (var9 == 3) {
            var8.method251();
        }
        var8.method244(var6, var7);
        if (var9 == 1) {
            var8.method251();
        } else if (var9 == 2) {
            var8.method248();
        } else if (var9 == 3) {
            var8.method250();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILdg;I)Ldg;")
    public final class38 method136(int arg0, class38 arg1, int arg2) {
        int var4 = this.field530[arg2];
        field518++;
        class47 var5 = class28.method175(var4 >> 16, false);
        if (arg0 <= 121) {
            this.method136(-64, null, -112);
        }
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method245(true);
        } else {
            class38 var7 = arg1.method245(!var5.method292(var6, (byte) -104));
            var7.method244(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLh;)V")
    public final void method137(boolean arg0, class70 arg1) {
        while (true) {
            int var3 = arg1.method443(255);
            if (var3 == 0) {
                field534++;
                if (!arg0) {
                    this.field520 = -121;
                    return;
                }
                return;
            }
            this.method142(-904935408, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(ILdg;I)Ldg;")
    public final class38 method138(int arg0, class38 arg1, int arg2) {
        int var4 = this.field530[arg2];
        field531++;
        class47 var5 = class28.method175(var4 >> 16, false);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method240(true);
        }
        class38 var7 = arg1.method240(!var5.method292(var6, (byte) -123));
        var7.method244(var5, var6);
        if (arg0 != 669146096) {
            method139(103);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)V")
    public static void method139(int arg0) {
        field517 = null;
        if (arg0 != 2) {
            field517 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lca;IILdg;I)Ldg;")
    public final class38 method140(class22 arg0, int arg1, int arg2, class38 arg3, int arg4) {
        int var6 = this.field530[arg2];
        field533++;
        class47 var7 = class28.method175(var6 >> 16, false);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg0.method136(124, arg3, arg4);
        }
        int var9 = arg0.field530[arg4];
        class47 var10 = class28.method175(var9 >> 16, false);
        if (arg1 != 2) {
            return null;
        }
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class38 var12 = arg3.method245(!var7.method292(var8, (byte) -116));
            var12.method244(var7, var8);
            return var12;
        } else {
            class38 var13 = arg3.method245(!var7.method292(var8, (byte) -112) & !var10.method292(var11, (byte) -104));
            var13.method249(var7, var8, var10, var11, this.field528);
            return var13;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BILdg;)Ldg;")
    public final class38 method141(byte arg0, int arg1, class38 arg2) {
        field514++;
        int var4 = this.field530[arg1];
        class47 var5 = class28.method175(var4 >> 16, false);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method245(true);
        }
        int var7 = 0;
        class47 var8 = null;
        if (this.field538 != null && this.field538.length > arg1) {
            int var9 = this.field538[arg1];
            var8 = class28.method175(var9 >> 16, false);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class38 var11 = arg2.method245(!var5.method292(var6, (byte) -122));
            var11.method244(var5, var6);
            return var11;
        }
        class38 var10 = arg2.method245(!var5.method292(var6, (byte) -109) & !var8.method292(var7, (byte) -126));
        var10.method244(var5, var6);
        var10.method244(var8, var7);
        if (arg0 < 125) {
            this.field519 = 16;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILh;I)V")
    private final void method142(int arg0, class70 arg1, int arg2) {
        if (arg0 != -904935408) {
            this.method140(null, 25, -40, null, -85);
        }
        if (arg2 == 1) {
            int var11 = arg1.method442(-21351);
            this.field515 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field515[var12] = arg1.method442(class98.method685(arg0, 904946825));
            }
            this.field530 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field530[var13] = arg1.method442(-21351);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field530[var14] = (arg1.method442(-21351) << 16) + this.field530[var14];
            }
        } else if (arg2 == 2) {
            this.field529 = arg1.method442(arg0 + 904914057);
        } else if (arg2 == 3) {
            int var4 = arg1.method443(255);
            this.field528 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field528[var5] = arg1.method443(255);
            }
            this.field528[var4] = 9999999;
        } else if (arg2 == 4) {
            this.field527 = true;
        } else if (arg2 == 5) {
            this.field524 = arg1.method443(255);
        } else if (arg2 == 6) {
            this.field535 = arg1.method442(-21351);
        } else if (arg2 == 7) {
            this.field532 = arg1.method442(-21351);
        } else if (arg2 == 8) {
            this.field525 = arg1.method443(arg0 ^ 0xCA0FC8EF);
        } else if (arg2 == 9) {
            this.field520 = arg1.method443(255);
        } else if (arg2 == 10) {
            this.field519 = arg1.method443(255);
        } else if (arg2 == 11) {
            this.field522 = arg1.method443(255);
        } else if (arg2 == 12) {
            int var8 = arg1.method443(255);
            this.field538 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field538[var9] = arg1.method442(-21351);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field538[var10] += arg1.method442(-21351) << 16;
            }
        } else if (arg2 == 13) {
            int var6 = arg1.method443(255);
            this.field536 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field536[var7] = arg1.method415(-112);
            }
        }
        field521++;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(Z)V")
    public final void method143(boolean arg0) {
        if (this.field519 == -1) {
            if (this.field528 == null) {
                this.field519 = 0;
            } else {
                this.field519 = 2;
            }
        }
        if (this.field520 == -1) {
            if (this.field528 == null) {
                this.field520 = 0;
            } else {
                this.field520 = 2;
            }
        }
        field537++;
        if (arg0) {
            field517 = null;
        }
    }
}
