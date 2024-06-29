import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GJDLZXKK")
public class class19 {

    @OriginalMember(owner = "client!GJDLZXKK", name = "a", descriptor = "Z")
    private boolean field848 = true;

    @OriginalMember(owner = "client!GJDLZXKK", name = "f", descriptor = "I")
    public int field853 = -1;

    @OriginalMember(owner = "client!GJDLZXKK", name = "g", descriptor = "Z")
    public boolean field854 = false;

    @OriginalMember(owner = "client!GJDLZXKK", name = "h", descriptor = "Z")
    public boolean field855 = true;

    @OriginalMember(owner = "client!GJDLZXKK", name = "b", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!GJDLZXKK", name = "e", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "client!GJDLZXKK", name = "i", descriptor = "I")
    public int field856;

    @OriginalMember(owner = "client!GJDLZXKK", name = "j", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "client!GJDLZXKK", name = "k", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "client!GJDLZXKK", name = "l", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "client!GJDLZXKK", name = "m", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "client!GJDLZXKK", name = "n", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "client!GJDLZXKK", name = "d", descriptor = "Ljava/lang/String;")
    public String field851;

    @OriginalMember(owner = "client!GJDLZXKK", name = "c", descriptor = "[LGJDLZXKK;")
    public static class19[] field850;

    @OriginalMember(owner = "client!GJDLZXKK", name = "a", descriptor = "(ZLVSQMPWOM;)V")
    public static void method311(boolean arg0, class59 arg1) {
        class3 var2 = new class3(arg1.method526("flo.dat", null), -990);
        field849 = var2.method56();
        if (field850 == null) {
            field850 = new class19[field849];
        }
        for (int var3 = 0; var3 < field849; var3++) {
            if (field850[var3] == null) {
                field850[var3] = new class19();
            }
            field850[var3].method312((byte) -11, var2);
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!GJDLZXKK", name = "a", descriptor = "(BLBFQIDHPO;)V")
    public void method312(byte arg0, class3 arg1) {
        if (arg0 != -11) {
            this.field848 = !this.field848;
        }
        while (true) {
            int var3 = arg1.method54();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field852 = arg1.method58();
                this.method313(false, this.field852);
            } else if (var3 == 2) {
                this.field853 = arg1.method54();
            } else if (var3 == 3) {
                this.field854 = true;
            } else if (var3 == 5) {
                this.field855 = false;
            } else if (var3 == 6) {
                this.field851 = arg1.method61();
            } else if (var3 == 7) {
                int var4 = this.field856;
                int var5 = this.field857;
                int var6 = this.field858;
                int var7 = this.field859;
                int var8 = arg1.method58();
                this.method313(false, var8);
                this.field856 = var4;
                this.field857 = var5;
                this.field858 = var6;
                this.field859 = var7;
                this.field860 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "client!GJDLZXKK", name = "a", descriptor = "(ZI)V")
    private void method313(boolean arg0, int arg1) {
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
        if (arg0) {
            return;
        }
        this.field856 = (int) (var19 * 256.0D);
        this.field857 = (int) (var15 * 256.0D);
        this.field858 = (int) (var17 * 256.0D);
        if (this.field857 < 0) {
            this.field857 = 0;
        } else if (this.field857 > 255) {
            this.field857 = 255;
        }
        if (this.field858 < 0) {
            this.field858 = 0;
        } else if (this.field858 > 255) {
            this.field858 = 255;
        }
        if (var17 > 0.5D) {
            this.field860 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field860 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field860 < 1) {
            this.field860 = 1;
        }
        this.field859 = (int) ((double) this.field860 * var19);
        int var21 = this.field856 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field857 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field858 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field861 = this.method314(var21, var22, var23);
    }

    @OriginalMember(owner = "client!GJDLZXKK", name = "a", descriptor = "(III)I")
    private final int method314(int arg0, int arg1, int arg2) {
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
