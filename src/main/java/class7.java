import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {

    @OriginalMember(owner = "client!il", name = "i", descriptor = "Lgi;")
    public class488 field46 = new class488();

    @OriginalMember(owner = "client!il", name = "j", descriptor = "[I")
    public static int[] field47 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!il", name = "n", descriptor = "[I")
    public static int[] field51;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "Ljk;")
    public static class456 field53;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "Lgi;")
    private class488 field50;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "[Laa;")
    public static class343[] field40;

    static {
        new class44("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field51 = new int[2];
        field52 = 0;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 4)
    public static void method21(int arg0) {
        field51 = null;
        field47 = null;
        field40 = null;
        if (arg0 != 0) {
            field52 = 37;
        }
        field53 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILgi;)V", line = 18)
    public final void method22(int arg0, class488 arg1) {
        if (arg0 != 1) {
            method27(-110, -80, -81, 28, -122, 5);
        }
        if (arg1.field7058 != null) {
            arg1.method2870(118);
        }
        field42++;
        arg1.field7056 = this.field46;
        arg1.field7058 = this.field46.field7058;
        arg1.field7058.field7056 = arg1;
        arg1.field7056.field7058 = arg1;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V", line = 36)
    public static final void method23(int arg0) {
        class511 var1 = class190.field2779;
        synchronized (class190.field2779) {
            class190.field2779.method2980(-182819096);
        }
        field45++;
        class511 var2 = class502.field7245;
        synchronized (class502.field7245) {
            class502.field7245.method2980(-182819096);
        }
        if (arg0 <= 51) {
            field40 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 55)
    public final void method24(byte arg0) {
        field39++;
        while (true) {
            class488 var2 = this.field46.field7056;
            if (this.field46 == var2) {
                this.field50 = null;
                if (arg0 > -26) {
                    this.method24((byte) 74);
                    return;
                } else {
                    return;
                }
            }
            var2.method2870(86);
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V", line = 82)
    public static final void method25(int arg0) {
        class251.field3738 = 0;
        field38++;
        int var1 = class336.field4966.method3076(0);
        int var2 = class336.field4966.method3064(-2);
        int var3 = class336.field4966.method3064(arg0 - 296132234);
        boolean var4 = class336.field4966.method3072((byte) -127) == 1;
        class492.method2889(-32768);
        class358.method2218(true, var1);
        int var5 = (class305.field4527 - class336.field4966.field7558) / 16;
        class185.field2731 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class185.field2731[var6][var10] = class336.field4966.method3053(-129);
            }
        }
        class259.field3837 = new byte[var5][];
        class213.field3209 = new int[var5];
        class433.field6206 = new byte[var5][];
        class299.field4461 = null;
        if (arg0 != 296132232) {
            method25(-38);
        }
        class25.field363 = new byte[var5][];
        class475.field6929 = new int[var5];
        class511.field7430 = null;
        class333.field4938 = new int[var5];
        class502.field7247 = new byte[var5][];
        class457.field6639 = new int[var5];
        class452.field6602 = new int[var5];
        int var7 = 0;
        for (int var8 = (var2 - (class69.field1139 >> 4)) / 8; var8 <= (((class69.field1139 >> 4) + var2) / 8); var8++) {
            for (int var9 = (var3 - (class255.field3763 >> 4)) / 8; var9 <= ((class255.field3763 >> 4) + var3) / 8; var9++) {
                class475.field6929[var7] = (var8 << 8) + var9;
                class213.field3209[var7] = class76.field1243.method2043((byte) -71, "m" + var8 + "_" + var9);
                class333.field4938[var7] = class76.field1243.method2043((byte) 86, "l" + var8 + "_" + var9);
                class457.field6639[var7] = class76.field1243.method2043((byte) 54, "um" + var8 + "_" + var9);
                class452.field6602[var7] = class76.field1243.method2043((byte) -97, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class349.method2200(0, var2, var3, 10, var4);
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)Lgi;", line = 158)
    public final class488 method26(int arg0) {
        if (arg0 != 1) {
            this.method28(24);
        }
        field41++;
        class488 var2 = this.field50;
        if (this.field46 == var2) {
            this.field50 = null;
            return null;
        } else {
            this.field50 = var2.field7056;
            return var2;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIII)Z", line = 180)
    public static final boolean method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class121.field1894[arg0][var8][var14] == -class226.field3411) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class322.field4795) + 1;
            int var10 = (arg3 << class322.field4795) + 2;
            int var11 = class146.field2262[arg0].method156(arg1, arg3) + arg5;
            if (!class544.method3193(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class322.field4795) - 1;
            if (!class544.method3193(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class322.field4795) - 1;
            if (!class544.method3193(var9, var11, var13)) {
                return false;
            } else if (class544.method3193(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class526.method3116(arg0, arg1, arg3)) {
            int var6 = arg1 << class322.field4795;
            int var7 = arg3 << class322.field4795;
            return class544.method3193(var6 + 1, class146.field2262[arg0].method156(arg1, arg3) + arg5, var7 + 1) && class544.method3193(class291.field4317 + var6 - 1, class146.field2262[arg0].method156(arg1 + 1, arg3) + arg5, var7 + 1) && class544.method3193(class291.field4317 + var6 - 1, class146.field2262[arg0].method156(arg1 + 1, arg3 + 1) + arg5, class291.field4317 + var7 - 1) && class544.method3193(var6 + 1, class146.field2262[arg0].method156(arg1, arg3 + 1) + arg5, class291.field4317 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)I", line = 240)
    public final int method28(int arg0) {
        field44++;
        if (arg0 != -21544) {
            return -22;
        }
        int var2 = 0;
        for (class488 var3 = this.field46.field7056; var3 != this.field46; var3 = var3.field7056) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(FFIF)I", line = 265)
    public static final int method29(float arg0, float arg1, int arg2, float arg3) {
        field48++;
        if (arg2 != 1) {
            field53 = null;
        }
        float var4 = (arg1 < 0.0F) ? -arg1 : arg1;
        float var5 = (arg0 < 0.0F) ? -arg0 : arg0;
        float var6 = arg3 < 0.0F ? -arg3 : arg3;
        if (var4 < var5 && var6 < var5) {
            return (arg0 > 0.0F) ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return (arg3 > 0.0F) ? 2 : 3;
        } else if ((arg1 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)Lgi;", line = 308)
    public final class488 method30(byte arg0) {
        if (arg0 != -126) {
            return null;
        }
        field49++;
        class488 var2 = this.field46.field7056;
        if (this.field46 == var2) {
            this.field50 = null;
            return null;
        } else {
            this.field50 = var2.field7056;
            return var2;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BIII)V", line = 328)
    public static final void method31(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 << 3;
        field43++;
        int var5 = arg2 << 3;
        int var6 = arg3 << 3;
        class508.field7354 = var6;
        if (class294.field4381 == 2) {
            class39.field835 = var5;
            class171.field2548 = var6;
            class254.field3756 = var4;
        }
        class524.field7655 = var4;
        if (arg0 != 20) {
            field52 = 54;
        }
        class289.method1849(-786433);
        class472.field6873 = true;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V", line = 359)
    public class7() {
        this.field46.field7056 = this.field46;
        this.field46.field7058 = this.field46;
    }
}
