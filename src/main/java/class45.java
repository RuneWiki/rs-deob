import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MJVHTYCA")
public class class45 {

    @OriginalMember(owner = "MJVHTYCA", name = "c", descriptor = "B")
    private byte field1185 = 3;

    @OriginalMember(owner = "MJVHTYCA", name = "j", descriptor = "I")
    public int field1192 = -1;

    @OriginalMember(owner = "MJVHTYCA", name = "l", descriptor = "Z")
    public boolean field1194 = false;

    @OriginalMember(owner = "MJVHTYCA", name = "m", descriptor = "I")
    public int field1195 = 5;

    @OriginalMember(owner = "MJVHTYCA", name = "n", descriptor = "I")
    public int field1196 = -1;

    @OriginalMember(owner = "MJVHTYCA", name = "o", descriptor = "I")
    public int field1197 = -1;

    @OriginalMember(owner = "MJVHTYCA", name = "p", descriptor = "I")
    public int field1198 = 99;

    @OriginalMember(owner = "MJVHTYCA", name = "q", descriptor = "I")
    public int field1199 = -1;

    @OriginalMember(owner = "MJVHTYCA", name = "r", descriptor = "I")
    public int field1200 = -1;

    @OriginalMember(owner = "MJVHTYCA", name = "s", descriptor = "I")
    public int field1201 = 2;

    @OriginalMember(owner = "MJVHTYCA", name = "a", descriptor = "Z")
    private static boolean field1183 = true;

    @OriginalMember(owner = "MJVHTYCA", name = "b", descriptor = "Z")
    private static boolean field1184 = true;

    @OriginalMember(owner = "MJVHTYCA", name = "d", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "MJVHTYCA", name = "f", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "MJVHTYCA", name = "t", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "MJVHTYCA", name = "u", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "MJVHTYCA", name = "g", descriptor = "[I")
    public int[] field1189;

    @OriginalMember(owner = "MJVHTYCA", name = "h", descriptor = "[I")
    public int[] field1190;

    @OriginalMember(owner = "MJVHTYCA", name = "i", descriptor = "[I")
    private int[] field1191;

    @OriginalMember(owner = "MJVHTYCA", name = "k", descriptor = "[I")
    public int[] field1193;

    @OriginalMember(owner = "MJVHTYCA", name = "e", descriptor = "[LMJVHTYCA;")
    public static class45[] field1187;

    @OriginalMember(owner = "MJVHTYCA", name = "a", descriptor = "(ZLMJLXHQTQ;)V")
    public static void method318(boolean arg0, class44 arg1) {
        class69 var2 = new class69(arg1.method317("seq.dat", null), -82);
        field1186 = var2.method467();
        if (!arg0) {
            return;
        }
        if (field1187 == null) {
            field1187 = new class45[field1186];
        }
        for (int var3 = 0; var3 < field1186; var3++) {
            if (field1187[var3] == null) {
                field1187[var3] = new class45();
            }
            field1187[var3].method320(field1183, var2);
        }
    }

    @OriginalMember(owner = "MJVHTYCA", name = "a", descriptor = "(IB)I")
    public int method319(int arg0, byte arg1) {
        int var3 = this.field1191[arg0];
        if (this.field1185 != arg1) {
            return 4;
        }
        boolean var4 = false;
        if (var3 == 0) {
            class2 var5 = class2.method10(this.field1189[arg0]);
            if (var5 != null) {
                var3 = this.field1191[arg0] = var5.field13;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "MJVHTYCA", name = "a", descriptor = "(ZLXGRGMPUQ;)V")
    public void method320(boolean arg0, class69 arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method465();
                if (var3 == 0) {
                    if (this.field1188 == 0) {
                        this.field1188 = 1;
                        this.field1189 = new int[1];
                        this.field1189[0] = -1;
                        this.field1190 = new int[1];
                        this.field1190[0] = -1;
                        this.field1191 = new int[1];
                        this.field1191[0] = -1;
                    }
                    if (this.field1199 == -1) {
                        if (this.field1193 == null) {
                            this.field1199 = 0;
                        } else {
                            this.field1199 = 2;
                        }
                    }
                    if (this.field1200 == -1) {
                        if (this.field1193 != null) {
                            this.field1200 = 2;
                            return;
                        }
                        this.field1200 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1188 = arg1.method465();
                    this.field1189 = new int[this.field1188];
                    this.field1190 = new int[this.field1188];
                    this.field1191 = new int[this.field1188];
                    for (int var4 = 0; var4 < this.field1188; var4++) {
                        this.field1189[var4] = arg1.method467();
                        this.field1190[var4] = arg1.method467();
                        if (this.field1190[var4] == 65535) {
                            this.field1190[var4] = -1;
                        }
                        this.field1191[var4] = arg1.method467();
                    }
                } else if (var3 == 2) {
                    this.field1192 = arg1.method467();
                } else if (var3 == 3) {
                    int var5 = arg1.method465();
                    this.field1193 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1193[var6] = arg1.method465();
                    }
                    this.field1193[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1194 = true;
                } else if (var3 == 5) {
                    this.field1195 = arg1.method465();
                } else if (var3 == 6) {
                    this.field1196 = arg1.method467();
                } else if (var3 == 7) {
                    this.field1197 = arg1.method467();
                } else if (var3 == 8) {
                    this.field1198 = arg1.method465();
                } else if (var3 == 9) {
                    this.field1199 = arg1.method465();
                } else if (var3 == 10) {
                    this.field1200 = arg1.method465();
                } else if (var3 == 11) {
                    this.field1201 = arg1.method465();
                } else if (var3 == 12) {
                    this.field1202 = arg1.method470();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
