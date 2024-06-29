import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class140 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field1731 = 0;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field1735 = 0;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field1736 = 2;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)I")
    public static final int method858(int arg0, byte arg1) {
        field1732++;
        double var2 = (double) ((arg0 & 0xFFAB92) >> 16) / 256.0D;
        double var4 = (double) ((arg0 & 0xFF0C) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        if (arg1 != 3) {
            return -11;
        }
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return ((var20 & 0xFF) >> 2 << 10) + ((var21 >> 5 << 7) + (var22 >> 1));
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)I")
    public static final int method859(byte arg0, int arg1) {
        field1734++;
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xD0) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        if (arg0 > -83) {
            method860((byte) -111, -81);
        }
        return 0;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(BI)Lr;")
    public static final class98 method860(byte arg0, int arg1) {
        field1733++;
        if (arg0 != 68) {
            field1735 = 11;
        }
        if (arg1 == 0) {
            return new class141();
        } else if (arg1 == 1) {
            return new class144();
        } else if (arg1 == 2) {
            return new class93();
        } else if (arg1 == 3) {
            return new class73();
        } else if (arg1 == 4) {
            return new class401();
        } else if (arg1 == 5) {
            return new class102();
        } else if (arg1 == 6) {
            return new class243();
        } else if (arg1 == 7) {
            return new class65();
        } else if (arg1 == 8) {
            return new class91();
        } else if (arg1 == 9) {
            return new class165();
        } else if (arg1 == 10) {
            return new class28();
        } else if (arg1 == 11) {
            return new class86();
        } else if (arg1 == 12) {
            return new class149();
        } else if (arg1 == 13) {
            return new class188();
        } else if (arg1 == 14) {
            return new class11();
        } else if (arg1 == 15) {
            return new class143();
        } else if (arg1 == 16) {
            return new class293();
        } else if (arg1 == 17) {
            return new class273();
        } else if (arg1 == 18) {
            return new class369();
        } else if (arg1 == 19) {
            return new class384();
        } else if (arg1 == 20) {
            return new class242();
        } else if (arg1 == 21) {
            return new class305();
        } else if (arg1 == 22) {
            return new class291();
        } else if (arg1 == 23) {
            return new class399();
        } else if (arg1 == 24) {
            return new class137();
        } else if (arg1 == 25) {
            return new class207();
        } else if (arg1 == 26) {
            return new class114();
        } else if (arg1 == 27) {
            return new class275();
        } else if (arg1 == 28) {
            return new class341();
        } else if (arg1 == 29) {
            return new class217();
        } else if (arg1 == 30) {
            return new class284();
        } else if (arg1 == 31) {
            return new class312();
        } else if (arg1 == 32) {
            return new class222();
        } else if (arg1 == 33) {
            return new class125();
        } else if (arg1 == 34) {
            return new class348();
        } else if (arg1 == 35) {
            return new class434();
        } else if (arg1 == 36) {
            return new class112();
        } else if (arg1 == 37) {
            return new class405();
        } else if (arg1 == 38) {
            return new class366();
        } else if (arg1 == 39) {
            return new class123();
        } else {
            return null;
        }
    }

    static {
        new class362("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    }
}
