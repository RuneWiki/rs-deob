import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PNPNYEVW")
public class class42 {

    @OriginalMember(owner = "PNPNYEVW", name = "h", descriptor = "I")
    public int field1224 = -1;

    @OriginalMember(owner = "PNPNYEVW", name = "j", descriptor = "Z")
    public boolean field1226 = false;

    @OriginalMember(owner = "PNPNYEVW", name = "k", descriptor = "I")
    public int field1227 = 5;

    @OriginalMember(owner = "PNPNYEVW", name = "l", descriptor = "I")
    public int field1228 = -1;

    @OriginalMember(owner = "PNPNYEVW", name = "m", descriptor = "I")
    public int field1229 = -1;

    @OriginalMember(owner = "PNPNYEVW", name = "n", descriptor = "I")
    public int field1230 = 99;

    @OriginalMember(owner = "PNPNYEVW", name = "o", descriptor = "I")
    public int field1231 = -1;

    @OriginalMember(owner = "PNPNYEVW", name = "p", descriptor = "I")
    public int field1232 = -1;

    @OriginalMember(owner = "PNPNYEVW", name = "q", descriptor = "I")
    public int field1233 = 2;

    @OriginalMember(owner = "PNPNYEVW", name = "a", descriptor = "I")
    private static int field1217 = -44493;

    @OriginalMember(owner = "PNPNYEVW", name = "b", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "PNPNYEVW", name = "d", descriptor = "I")
    public int field1220;

    @OriginalMember(owner = "PNPNYEVW", name = "r", descriptor = "I")
    public int field1234;

    @OriginalMember(owner = "PNPNYEVW", name = "s", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "PNPNYEVW", name = "e", descriptor = "[I")
    public int[] field1221;

    @OriginalMember(owner = "PNPNYEVW", name = "f", descriptor = "[I")
    public int[] field1222;

    @OriginalMember(owner = "PNPNYEVW", name = "g", descriptor = "[I")
    private int[] field1223;

    @OriginalMember(owner = "PNPNYEVW", name = "i", descriptor = "[I")
    public int[] field1225;

    @OriginalMember(owner = "PNPNYEVW", name = "c", descriptor = "[LPNPNYEVW;")
    public static class42[] field1219;

    @OriginalMember(owner = "PNPNYEVW", name = "a", descriptor = "(ILINOFEYKQ;)V")
    public static void method426(int arg0, class21 arg1) {
        class35 var2 = new class35((byte) -103, arg1.method277("seq.dat", null));
        field1218 = var2.method351();
        if (field1219 == null) {
            field1219 = new class42[field1218];
        }
        for (int var3 = 0; var3 < field1218; var3++) {
            if (field1219[var3] == null) {
                field1219[var3] = new class42();
            }
            field1219[var3].method428(false, var2);
        }
        while (arg0 >= 0) {
            field1217 = 192;
        }
    }

    @OriginalMember(owner = "PNPNYEVW", name = "a", descriptor = "(II)I")
    public int method427(int arg0, int arg1) {
        if (arg1 < 9 || arg1 > 9) {
            return 1;
        }
        int var3 = this.field1223[arg0];
        if (var3 == 0) {
            class25 var4 = class25.method284(this.field1221[arg0]);
            if (var4 != null) {
                var3 = this.field1223[arg0] = var4.field1002;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "PNPNYEVW", name = "a", descriptor = "(ZLNHEPCMLW;)V")
    public void method428(boolean arg0, class35 arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method349();
                if (var4 == 0) {
                    if (this.field1220 == 0) {
                        this.field1220 = 1;
                        this.field1221 = new int[1];
                        this.field1221[0] = -1;
                        this.field1222 = new int[1];
                        this.field1222[0] = -1;
                        this.field1223 = new int[1];
                        this.field1223[0] = -1;
                    }
                    if (this.field1231 == -1) {
                        if (this.field1225 == null) {
                            this.field1231 = 0;
                        } else {
                            this.field1231 = 2;
                        }
                    }
                    if (this.field1232 == -1) {
                        if (this.field1225 != null) {
                            this.field1232 = 2;
                            return;
                        }
                        this.field1232 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field1220 = arg1.method349();
                    this.field1221 = new int[this.field1220];
                    this.field1222 = new int[this.field1220];
                    this.field1223 = new int[this.field1220];
                    for (int var5 = 0; var5 < this.field1220; var5++) {
                        this.field1221[var5] = arg1.method351();
                        this.field1222[var5] = arg1.method351();
                        if (this.field1222[var5] == 65535) {
                            this.field1222[var5] = -1;
                        }
                        this.field1223[var5] = arg1.method351();
                    }
                } else if (var4 == 2) {
                    this.field1224 = arg1.method351();
                } else if (var4 == 3) {
                    int var6 = arg1.method349();
                    this.field1225 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1225[var7] = arg1.method349();
                    }
                    this.field1225[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field1226 = true;
                } else if (var4 == 5) {
                    this.field1227 = arg1.method349();
                } else if (var4 == 6) {
                    this.field1228 = arg1.method351();
                } else if (var4 == 7) {
                    this.field1229 = arg1.method351();
                } else if (var4 == 8) {
                    this.field1230 = arg1.method349();
                } else if (var4 == 9) {
                    this.field1231 = arg1.method349();
                } else if (var4 == 10) {
                    this.field1232 = arg1.method349();
                } else if (var4 == 11) {
                    this.field1233 = arg1.method349();
                } else if (var4 == 12) {
                    this.field1234 = arg1.method354();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
