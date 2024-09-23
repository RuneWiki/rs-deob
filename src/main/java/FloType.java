import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class FloType {

    @OriginalMember(owner = "fc", name = "a", descriptor = "I")
    private int field908 = 639;

    @OriginalMember(owner = "fc", name = "f", descriptor = "I")
    public int field913 = -1;

    @OriginalMember(owner = "fc", name = "g", descriptor = "Z")
    public boolean field914 = false;

    @OriginalMember(owner = "fc", name = "h", descriptor = "Z")
    public boolean field915 = true;

    @OriginalMember(owner = "fc", name = "b", descriptor = "Z")
    private static boolean field909 = true;

    @OriginalMember(owner = "fc", name = "c", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "fc", name = "e", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "fc", name = "j", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "fc", name = "k", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "fc", name = "l", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "fc", name = "m", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "fc", name = "n", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "fc", name = "i", descriptor = "Ljava/lang/String;")
    public String field916;

    @OriginalMember(owner = "fc", name = "d", descriptor = "[Lfc;")
    public static FloType[] field911;

    @OriginalMember(owner = "fc", name = "a", descriptor = "(ILub;)V")
    public static void method307(int arg0, Jagfile arg1) {
        if (arg0 < 9 || arg0 > 9) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Packet var3 = new Packet(575, arg1.method250(null, 3, "flo.dat"));
        field910 = var3.method211();
        if (field911 == null) {
            field911 = new FloType[field910];
        }
        for (int var4 = 0; var4 < field910; var4++) {
            if (field911[var4] == null) {
                field911[var4] = new FloType();
            }
            field911[var4].method308(var3, (byte) 6);
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(Lkb;B)V")
    public void method308(Packet arg0, byte arg1) {
        if (arg1 == 6) {
            boolean var3 = false;
        } else {
            field909 = !field909;
        }
        while (true) {
            int var4 = arg0.method209();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field912 = arg0.method213();
                this.method309(639, this.field912);
            } else if (var4 == 2) {
                this.field913 = arg0.method209();
            } else if (var4 == 3) {
                this.field914 = true;
            } else if (var4 == 5) {
                this.field915 = false;
            } else if (var4 == 6) {
                this.field916 = arg0.method216();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(II)V")
    private void method309(int arg0, int arg1) {
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
        if (arg0 <= 0) {
            for (int var21 = 1; var21 > 0; var21++) {
            }
        }
        this.field917 = (int) (var19 * 256.0D);
        this.field918 = (int) (var15 * 256.0D);
        this.field919 = (int) (var17 * 256.0D);
        if (this.field918 < 0) {
            this.field918 = 0;
        } else if (this.field918 > 255) {
            this.field918 = 255;
        }
        if (this.field919 < 0) {
            this.field919 = 0;
        } else if (this.field919 > 255) {
            this.field919 = 255;
        }
        if (var17 > 0.5D) {
            this.field921 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field921 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field921 < 1) {
            this.field921 = 1;
        }
        this.field920 = (int) ((double) this.field921 * var19);
    }
}
