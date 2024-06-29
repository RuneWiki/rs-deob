import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class95 {

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public int field1467 = 128;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public int field1468 = -1;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "Z")
    public boolean field1473 = true;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    private int field1477 = 0;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "Laa;")
    public static class76 field1472;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public int field1466;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public int field1470;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "Laf;")
    public static class122 field1478;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "[Lvo;")
    public static class355[] field1476;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lok;ZLok;Lrl;Lok;)Z")
    public static final boolean method742(class74 arg0, boolean arg1, class74 arg2, class524 arg3, class74 arg4) {
        class210.field3031 = arg4;
        field1479++;
        class335.field5177 = arg2;
        if (arg1) {
            field1478 = null;
        }
        class111.field1697 = arg3;
        class497.field7366 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V")
    private final void method743(int arg0, int arg1) {
        field1469++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 & arg1 >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var19 = var13 / 6.0D;
        this.field1470 = (int) (var15 * 256.0D);
        this.field1475 = (int) (var17 * 256.0D);
        if (this.field1470 < 0) {
            this.field1470 = 0;
        } else if (this.field1470 > 255) {
            this.field1470 = 255;
        }
        if (var17 > 0.5D) {
            this.field1466 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1466 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1475 < 0) {
            this.field1475 = 0;
        } else if (this.field1475 > 255) {
            this.field1475 = 255;
        }
        if (this.field1466 < 1) {
            this.field1466 = 1;
        }
        this.field1464 = (int) ((double) this.field1466 * var19);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public static void method744(byte arg0) {
        field1472 = null;
        field1476 = null;
        if (arg0 == -111) {
            field1478 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)Z")
    public static final boolean method745(byte arg0, int arg1) {
        field1471++;
        if (arg0 != -114) {
            field1478 = null;
        }
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZLgk;)V")
    public final void method746(boolean arg0, class468 arg1) {
        if (!arg0) {
            return;
        }
        field1465++;
        while (true) {
            int var3 = arg1.method2765(72);
            if (var3 == 0) {
                return;
            }
            this.method747(var3, arg1, -91);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILgk;I)V")
    private final void method747(int arg0, class468 arg1, int arg2) {
        if (arg0 == 1) {
            this.field1477 = arg1.method2759(1919914864);
            this.method743(255, this.field1477);
        } else if (arg0 == 2) {
            this.field1468 = arg1.method2727((byte) 43);
            if (this.field1468 == 65535) {
                this.field1468 = -1;
            }
        } else if (arg0 == 3) {
            this.field1467 = arg1.method2727((byte) 43) << 0;
        } else if (arg0 == 4) {
            this.field1473 = false;
        }
        if (arg2 <= -66) {
            field1463++;
        }
    }

    static {
        new class347("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field1472 = new class76(60, -1);
    }
}
