import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NPCMYHWE")
public class class40 {

    @OriginalMember(owner = "NPCMYHWE", name = "b", descriptor = "Z")
    private boolean field1072 = false;

    @OriginalMember(owner = "NPCMYHWE", name = "g", descriptor = "I")
    public int field1077 = -1;

    @OriginalMember(owner = "NPCMYHWE", name = "h", descriptor = "Z")
    public boolean field1078 = false;

    @OriginalMember(owner = "NPCMYHWE", name = "i", descriptor = "Z")
    public boolean field1079 = true;

    @OriginalMember(owner = "NPCMYHWE", name = "c", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "NPCMYHWE", name = "f", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "NPCMYHWE", name = "j", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "NPCMYHWE", name = "k", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "NPCMYHWE", name = "l", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "NPCMYHWE", name = "m", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "NPCMYHWE", name = "n", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "NPCMYHWE", name = "o", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "NPCMYHWE", name = "e", descriptor = "Ljava/lang/String;")
    public String field1075;

    @OriginalMember(owner = "NPCMYHWE", name = "a", descriptor = "Z")
    private static boolean field1071;

    @OriginalMember(owner = "NPCMYHWE", name = "d", descriptor = "[LNPCMYHWE;")
    public static class40[] field1074;

    @OriginalMember(owner = "NPCMYHWE", name = "a", descriptor = "(ZLXRWUKRPO;)V")
    public static void method389(boolean arg0, class65 arg1) {
        class21 var2 = new class21(arg1.method581("flo.dat", null), -49015);
        if (arg0) {
            field1071 = !field1071;
        }
        field1073 = var2.method246();
        if (field1074 == null) {
            field1074 = new class40[field1073];
        }
        for (int var3 = 0; var3 < field1073; var3++) {
            if (field1074[var3] == null) {
                field1074[var3] = new class40();
            }
            field1074[var3].method390((byte) 8, var2);
        }
    }

    @OriginalMember(owner = "NPCMYHWE", name = "a", descriptor = "(BLGLMIQHJI;)V")
    public void method390(byte arg0, class21 arg1) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        while (true) {
            int var4 = arg1.method244();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1076 = arg1.method248();
                this.method391(this.field1076, this.field1072);
            } else if (var4 == 2) {
                this.field1077 = arg1.method244();
            } else if (var4 == 3) {
                this.field1078 = true;
            } else if (var4 == 5) {
                this.field1079 = false;
            } else if (var4 == 6) {
                this.field1075 = arg1.method251();
            } else if (var4 == 7) {
                int var5 = this.field1080;
                int var6 = this.field1081;
                int var7 = this.field1082;
                int var8 = this.field1083;
                int var9 = arg1.method248();
                this.method391(var9, this.field1072);
                this.field1080 = var5;
                this.field1081 = var6;
                this.field1082 = var7;
                this.field1083 = var8;
                this.field1084 = var8;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "NPCMYHWE", name = "a", descriptor = "(IZ)V")
    private void method391(int arg0, boolean arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        if (arg1) {
            return;
        }
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
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
        this.field1080 = (int) (var19 * 256.0D);
        this.field1081 = (int) (var15 * 256.0D);
        this.field1082 = (int) (var17 * 256.0D);
        if (this.field1081 < 0) {
            this.field1081 = 0;
        } else if (this.field1081 > 255) {
            this.field1081 = 255;
        }
        if (this.field1082 < 0) {
            this.field1082 = 0;
        } else if (this.field1082 > 255) {
            this.field1082 = 255;
        }
        if (var17 > 0.5D) {
            this.field1084 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1084 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1084 < 1) {
            this.field1084 = 1;
        }
        this.field1083 = (int) ((double) this.field1084 * var19);
        int var21 = this.field1080 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1081 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1082 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1085 = this.method392(var21, var22, var23);
    }

    @OriginalMember(owner = "NPCMYHWE", name = "a", descriptor = "(III)I")
    private final int method392(int arg0, int arg1, int arg2) {
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
