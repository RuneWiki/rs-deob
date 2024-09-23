import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KIRTNGZJ")
public class class39 {

    @OriginalMember(owner = "KIRTNGZJ", name = "b", descriptor = "I")
    private int field1193 = -49833;

    @OriginalMember(owner = "KIRTNGZJ", name = "i", descriptor = "I")
    public int field1200 = -1;

    @OriginalMember(owner = "KIRTNGZJ", name = "k", descriptor = "Z")
    public boolean field1202 = false;

    @OriginalMember(owner = "KIRTNGZJ", name = "l", descriptor = "I")
    public int field1203 = 5;

    @OriginalMember(owner = "KIRTNGZJ", name = "m", descriptor = "I")
    public int field1204 = -1;

    @OriginalMember(owner = "KIRTNGZJ", name = "n", descriptor = "I")
    public int field1205 = -1;

    @OriginalMember(owner = "KIRTNGZJ", name = "o", descriptor = "I")
    public int field1206 = 99;

    @OriginalMember(owner = "KIRTNGZJ", name = "p", descriptor = "I")
    public int field1207 = -1;

    @OriginalMember(owner = "KIRTNGZJ", name = "q", descriptor = "I")
    public int field1208 = -1;

    @OriginalMember(owner = "KIRTNGZJ", name = "r", descriptor = "I")
    public int field1209 = 2;

    @OriginalMember(owner = "KIRTNGZJ", name = "c", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "KIRTNGZJ", name = "e", descriptor = "I")
    public int field1196;

    @OriginalMember(owner = "KIRTNGZJ", name = "s", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "KIRTNGZJ", name = "t", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "KIRTNGZJ", name = "a", descriptor = "Z")
    private static boolean field1192;

    @OriginalMember(owner = "KIRTNGZJ", name = "f", descriptor = "[I")
    public int[] field1197;

    @OriginalMember(owner = "KIRTNGZJ", name = "g", descriptor = "[I")
    public int[] field1198;

    @OriginalMember(owner = "KIRTNGZJ", name = "h", descriptor = "[I")
    private int[] field1199;

    @OriginalMember(owner = "KIRTNGZJ", name = "j", descriptor = "[I")
    public int[] field1201;

    @OriginalMember(owner = "KIRTNGZJ", name = "d", descriptor = "[LKIRTNGZJ;")
    public static class39[] field1195;

    @OriginalMember(owner = "KIRTNGZJ", name = "a", descriptor = "(ZLEAXVDNXA;)V")
    public static void method444(boolean arg0, class12 arg1) {
        class5 var2 = new class5(2, arg1.method255("seq.dat", null));
        field1194 = var2.method46();
        if (!arg0) {
            field1192 = !field1192;
        }
        if (field1195 == null) {
            field1195 = new class39[field1194];
        }
        for (int var3 = 0; var3 < field1194; var3++) {
            if (field1195[var3] == null) {
                field1195[var3] = new class39();
            }
            field1195[var3].method446((byte) -18, var2);
        }
    }

    @OriginalMember(owner = "KIRTNGZJ", name = "a", descriptor = "(II)I")
    public int method445(int arg0, int arg1) {
        int var3 = 95 / arg1;
        int var4 = this.field1199[arg0];
        if (var4 == 0) {
            class14 var5 = class14.method281((byte) 7, this.field1197[arg0]);
            if (var5 != null) {
                var4 = this.field1199[arg0] = var5.field759;
            }
        }
        if (var4 == 0) {
            var4 = 1;
        }
        return var4;
    }

    @OriginalMember(owner = "KIRTNGZJ", name = "a", descriptor = "(BLCKBTFRZM;)V")
    public void method446(byte arg0, class5 arg1) {
        if (arg0 != -18) {
            this.field1193 = -161;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method44();
                if (var3 == 0) {
                    if (this.field1196 == 0) {
                        this.field1196 = 1;
                        this.field1197 = new int[1];
                        this.field1197[0] = -1;
                        this.field1198 = new int[1];
                        this.field1198[0] = -1;
                        this.field1199 = new int[1];
                        this.field1199[0] = -1;
                    }
                    if (this.field1207 == -1) {
                        if (this.field1201 == null) {
                            this.field1207 = 0;
                        } else {
                            this.field1207 = 2;
                        }
                    }
                    if (this.field1208 == -1) {
                        if (this.field1201 != null) {
                            this.field1208 = 2;
                            return;
                        }
                        this.field1208 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1196 = arg1.method44();
                    this.field1197 = new int[this.field1196];
                    this.field1198 = new int[this.field1196];
                    this.field1199 = new int[this.field1196];
                    for (int var4 = 0; var4 < this.field1196; var4++) {
                        this.field1197[var4] = arg1.method46();
                        this.field1198[var4] = arg1.method46();
                        if (this.field1198[var4] == 65535) {
                            this.field1198[var4] = -1;
                        }
                        this.field1199[var4] = arg1.method46();
                    }
                } else if (var3 == 2) {
                    this.field1200 = arg1.method46();
                } else if (var3 == 3) {
                    int var5 = arg1.method44();
                    this.field1201 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1201[var6] = arg1.method44();
                    }
                    this.field1201[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1202 = true;
                } else if (var3 == 5) {
                    this.field1203 = arg1.method44();
                } else if (var3 == 6) {
                    this.field1204 = arg1.method46();
                } else if (var3 == 7) {
                    this.field1205 = arg1.method46();
                } else if (var3 == 8) {
                    this.field1206 = arg1.method44();
                } else if (var3 == 9) {
                    this.field1207 = arg1.method44();
                } else if (var3 == 10) {
                    this.field1208 = arg1.method44();
                } else if (var3 == 11) {
                    this.field1209 = arg1.method44();
                } else if (var3 == 12) {
                    this.field1210 = arg1.method49();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
