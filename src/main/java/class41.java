import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ODMBIHRM")
public class class41 {

    @OriginalMember(owner = "ODMBIHRM", name = "h", descriptor = "I")
    public int field1189 = -1;

    @OriginalMember(owner = "ODMBIHRM", name = "j", descriptor = "Z")
    public boolean field1191 = false;

    @OriginalMember(owner = "ODMBIHRM", name = "k", descriptor = "I")
    public int field1192 = 5;

    @OriginalMember(owner = "ODMBIHRM", name = "l", descriptor = "I")
    public int field1193 = -1;

    @OriginalMember(owner = "ODMBIHRM", name = "m", descriptor = "I")
    public int field1194 = -1;

    @OriginalMember(owner = "ODMBIHRM", name = "n", descriptor = "I")
    public int field1195 = 99;

    @OriginalMember(owner = "ODMBIHRM", name = "o", descriptor = "I")
    public int field1196 = -1;

    @OriginalMember(owner = "ODMBIHRM", name = "p", descriptor = "I")
    public int field1197 = -1;

    @OriginalMember(owner = "ODMBIHRM", name = "q", descriptor = "I")
    public int field1198 = 2;

    @OriginalMember(owner = "ODMBIHRM", name = "b", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "ODMBIHRM", name = "d", descriptor = "I")
    public int field1185;

    @OriginalMember(owner = "ODMBIHRM", name = "r", descriptor = "I")
    public int field1199;

    @OriginalMember(owner = "ODMBIHRM", name = "s", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "ODMBIHRM", name = "a", descriptor = "Z")
    private static boolean field1182;

    @OriginalMember(owner = "ODMBIHRM", name = "e", descriptor = "[I")
    public int[] field1186;

    @OriginalMember(owner = "ODMBIHRM", name = "f", descriptor = "[I")
    public int[] field1187;

    @OriginalMember(owner = "ODMBIHRM", name = "g", descriptor = "[I")
    private int[] field1188;

    @OriginalMember(owner = "ODMBIHRM", name = "i", descriptor = "[I")
    public int[] field1190;

    @OriginalMember(owner = "ODMBIHRM", name = "c", descriptor = "[LODMBIHRM;")
    public static class41[] field1184;

    @OriginalMember(owner = "ODMBIHRM", name = "a", descriptor = "(ILBBMKAXRK;)V")
    public static void method412(int arg0, class6 arg1) {
        class17 var2 = new class17(arg1.method30("seq.dat", null), -26583);
        field1183 = var2.method226();
        while (arg0 >= 0) {
            field1182 = !field1182;
        }
        if (field1184 == null) {
            field1184 = new class41[field1183];
        }
        for (int var3 = 0; var3 < field1183; var3++) {
            if (field1184[var3] == null) {
                field1184[var3] = new class41();
            }
            field1184[var3].method414(var2, (byte) -50);
        }
    }

    @OriginalMember(owner = "ODMBIHRM", name = "a", descriptor = "(IZ)I")
    public int method413(int arg0, boolean arg1) {
        if (arg1) {
            field1182 = !field1182;
        }
        int var3 = this.field1188[arg0];
        if (var3 == 0) {
            class25 var4 = class25.method308(this.field1186[arg0]);
            if (var4 != null) {
                var3 = this.field1188[arg0] = var4.field863;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "ODMBIHRM", name = "a", descriptor = "(LEILHLJCE;B)V")
    public void method414(class17 arg0, byte arg1) {
        if (arg1 != -50) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method224();
                if (var3 == 0) {
                    if (this.field1185 == 0) {
                        this.field1185 = 1;
                        this.field1186 = new int[1];
                        this.field1186[0] = -1;
                        this.field1187 = new int[1];
                        this.field1187[0] = -1;
                        this.field1188 = new int[1];
                        this.field1188[0] = -1;
                    }
                    if (this.field1196 == -1) {
                        if (this.field1190 == null) {
                            this.field1196 = 0;
                        } else {
                            this.field1196 = 2;
                        }
                    }
                    if (this.field1197 == -1) {
                        if (this.field1190 != null) {
                            this.field1197 = 2;
                            return;
                        }
                        this.field1197 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1185 = arg0.method224();
                    this.field1186 = new int[this.field1185];
                    this.field1187 = new int[this.field1185];
                    this.field1188 = new int[this.field1185];
                    for (int var4 = 0; var4 < this.field1185; var4++) {
                        this.field1186[var4] = arg0.method226();
                        this.field1187[var4] = arg0.method226();
                        if (this.field1187[var4] == 65535) {
                            this.field1187[var4] = -1;
                        }
                        this.field1188[var4] = arg0.method226();
                    }
                } else if (var3 == 2) {
                    this.field1189 = arg0.method226();
                } else if (var3 == 3) {
                    int var5 = arg0.method224();
                    this.field1190 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1190[var6] = arg0.method224();
                    }
                    this.field1190[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1191 = true;
                } else if (var3 == 5) {
                    this.field1192 = arg0.method224();
                } else if (var3 == 6) {
                    this.field1193 = arg0.method226();
                } else if (var3 == 7) {
                    this.field1194 = arg0.method226();
                } else if (var3 == 8) {
                    this.field1195 = arg0.method224();
                } else if (var3 == 9) {
                    this.field1196 = arg0.method224();
                } else if (var3 == 10) {
                    this.field1197 = arg0.method224();
                } else if (var3 == 11) {
                    this.field1198 = arg0.method224();
                } else if (var3 == 12) {
                    this.field1199 = arg0.method229();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
