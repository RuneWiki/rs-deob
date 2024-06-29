import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OMGTLVPK")
public class class37 {

    @OriginalMember(owner = "client!OMGTLVPK", name = "f", descriptor = "I")
    public int field1043 = -1;

    @OriginalMember(owner = "client!OMGTLVPK", name = "g", descriptor = "Z")
    public boolean field1044 = false;

    @OriginalMember(owner = "client!OMGTLVPK", name = "h", descriptor = "Z")
    public boolean field1045 = true;

    @OriginalMember(owner = "client!OMGTLVPK", name = "b", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!OMGTLVPK", name = "e", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!OMGTLVPK", name = "i", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "client!OMGTLVPK", name = "j", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "client!OMGTLVPK", name = "k", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!OMGTLVPK", name = "l", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!OMGTLVPK", name = "m", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "client!OMGTLVPK", name = "n", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!OMGTLVPK", name = "d", descriptor = "Ljava/lang/String;")
    public String field1041;

    @OriginalMember(owner = "client!OMGTLVPK", name = "a", descriptor = "Z")
    private static boolean field1038;

    @OriginalMember(owner = "client!OMGTLVPK", name = "c", descriptor = "[LOMGTLVPK;")
    public static class37[] field1040;

    @OriginalMember(owner = "client!OMGTLVPK", name = "a", descriptor = "(BLRPFMUSNN;)V")
    public static void method381(byte arg0, class49 arg1) {
        class63 var2 = new class63((byte) -58, arg1.method414("flo.dat", null));
        field1039 = var2.method504();
        if (arg0 != -114) {
            field1038 = !field1038;
        }
        if (field1040 == null) {
            field1040 = new class37[field1039];
        }
        for (int var3 = 0; var3 < field1039; var3++) {
            if (field1040[var3] == null) {
                field1040[var3] = new class37();
            }
            field1040[var3].method382(-934, var2);
        }
    }

    @OriginalMember(owner = "client!OMGTLVPK", name = "a", descriptor = "(ILWNCFPLWV;)V")
    public void method382(int arg0, class63 arg1) {
        while (arg0 >= 0) {
            field1038 = !field1038;
        }
        while (true) {
            int var3 = arg1.method502();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1042 = arg1.method506();
                this.method383(-27076, this.field1042);
            } else if (var3 == 2) {
                this.field1043 = arg1.method502();
            } else if (var3 == 3) {
                this.field1044 = true;
            } else if (var3 == 5) {
                this.field1045 = false;
            } else if (var3 == 6) {
                this.field1041 = arg1.method509();
            } else if (var3 == 7) {
                int var4 = this.field1046;
                int var5 = this.field1047;
                int var6 = this.field1048;
                int var7 = this.field1049;
                int var8 = arg1.method506();
                this.method383(-27076, var8);
                this.field1046 = var4;
                this.field1047 = var5;
                this.field1048 = var6;
                this.field1049 = var7;
                this.field1050 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "client!OMGTLVPK", name = "a", descriptor = "(II)V")
    private void method383(int arg0, int arg1) {
        if (arg1 == 16711935) {
            arg1 = 0;
        }
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
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
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        this.field1046 = (int) (var19 * 256.0D);
        this.field1047 = (int) (var15 * 256.0D);
        this.field1048 = (int) (var17 * 256.0D);
        if (this.field1047 < 0) {
            this.field1047 = 0;
        } else if (this.field1047 > 255) {
            this.field1047 = 255;
        }
        if (this.field1048 < 0) {
            this.field1048 = 0;
        } else if (this.field1048 > 255) {
            this.field1048 = 255;
        }
        if (var17 > 0.5D) {
            this.field1050 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1050 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1050 < 1) {
            this.field1050 = 1;
        }
        this.field1049 = (int) ((double) this.field1050 * var19);
        int var21 = this.field1046 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1047 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1048 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1051 = this.method384(var21, var22, var23);
        if (arg0 == -27076) {
            ;
        }
    }

    @OriginalMember(owner = "client!OMGTLVPK", name = "a", descriptor = "(III)I")
    private final int method384(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }
}
