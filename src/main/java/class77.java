import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class77 {

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lph;")
    public static class229 field1283 = class266.method1858("<br>", 0);

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "Lph;")
    public static class229 field1286 = class266.method1858("settings=", 0);

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Lph;")
    public static class229 field1287 = class266.method1858("<col=ff9040>", 0);

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field1289 = 100;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public int field1284;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public int field1288;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public int field1290;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public int field1291;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 11)
    public static void method579(int arg0) {
        field1287 = null;
        if (arg0 != -2) {
            field1286 = (class229) null;
        }
        field1286 = null;
        field1283 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII)Z", line = 26)
    public static final boolean method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class316.field5370[arg0][var8][var9] == -class271.field4536) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class192.field3174[arg0][arg1][arg3] + arg5;
            if (!class61.method418(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class61.method418(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class61.method418(var10, var12, var14)) {
                return false;
            } else if (class61.method418(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class262.method1824(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class61.method418(var6 + 1, class192.field3174[arg0][arg1][arg3] + arg5, var7 + 1) && class61.method418(var6 + 128 - 1, class192.field3174[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class61.method418(var6 + 128 - 1, class192.field3174[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class61.method418(var6 + 1, class192.field3174[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILhb;)V", line = 97)
    public static final void method581(int arg0, class164 arg1) {
        field1281++;
        while (true) {
            while (arg1.field2668.length > arg1.field2670) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1178(8) == 1) {
                    var2 = true;
                    var3 = arg1.method1178(8);
                    var4 = arg1.method1178(8);
                }
                int var5 = arg1.method1178(8);
                int var6 = arg1.method1178(8);
                int var7 = var5 * 64 - class54.field786;
                int var8 = class214.field3537 - (var6 * 64 - class266.field4487) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class50.field716 > (var7 + 63) && var8 < class214.field3537) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && (var4 * 8) <= var12 && var12 < (var4 * 8 + 8)) {
                                byte var13 = arg1.method1163(864348104);
                                if (var13 != 0) {
                                    if (class5.field54[var9][var10] == null) {
                                        class5.field54[var9][var10] = new byte[4096];
                                    }
                                    class5.field54[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1163(864348104);
                                    if (class84.field1451[var9][var10] == null) {
                                        class84.field1451[var9][var10] = new byte[4096];
                                    }
                                    class84.field1451[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1163(864348104);
                        if (var16 != 0) {
                            arg1.field2670++;
                        }
                    }
                }
            }
            int var17 = -103 / ((arg0 + 23) / 60);
            return;
        }
    }
}
