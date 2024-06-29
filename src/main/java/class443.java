import jaclib.memory.Buffer;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class443 extends class401 implements class419 {

    @OriginalMember(owner = "client!baa", name = "y", descriptor = "Lvp;")
    private class160 field6113;

    @OriginalMember(owner = "client!baa", name = "x", descriptor = "Lvj;")
    public static class373 field6112 = new class373(7, 2);

    @OriginalMember(owner = "client!baa", name = "v", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!baa", name = "w", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!baa", name = "z", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!baa", name = "A", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!baa", name = "B", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!baa", name = "C", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!baa", name = "D", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!baa", name = "F", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!baa", name = "G", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!baa", name = "H", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!baa", name = "u", descriptor = "Lud;")
    public static class32 field6109;

    @OriginalMember(owner = "client!baa", name = "E", descriptor = "Ldn;")
    public static class438 field6119;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "(I)V")
    public static final void method2596(int arg0) {
        if (class588.field8527 < 1024.0F) {
            class588.field8527 = 1024.0F;
        }
        field6121++;
        if (class588.field8527 > 3072.0F) {
            class588.field8527 = 3072.0F;
        }
        while (class558.field8223 >= 16384.0F) {
            class558.field8223 -= 16384.0F;
        }
        while (class558.field8223 < 0.0F) {
            class558.field8223 += 16384.0F;
        }
        int var1 = class485.field6788 >> 7;
        int var2 = class381.field5051 >> 7;
        int var3 = class426.method2400(-1, class381.field5051, class485.field6788, class442.field6099);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && (class106.field1289 - 4) > var1 && var2 < class422.field5452 - 4) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class442.field6099;
                    if (var7 < 3 && class150.method821(var6, var5, arg0 ^ 0xFFFFE363)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class103.field1258.field6682 != null && class103.field1258.field6682[var7] != null) {
                        var8 = (class103.field1258.field6682[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 + var8 - class128.field1574[var7].method855(var5, var6);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (class87.field1049 < var10) {
            class87.field1049 += (var10 - class87.field1049) / 24;
        } else if (var10 < class87.field1049) {
            class87.field1049 += (var10 - class87.field1049) / 80;
        }
        if (arg0 != -7325) {
            method2597(null, null, (byte) 95);
        }
    }

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "(I)Z")
    public final boolean method442(int arg0) {
        field6114++;
        if (super.method442(69)) {
            return true;
        } else {
            int var2 = -67 / (-arg0 / 63);
            return false;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)V")
    public final void method644(int arg0, int arg1) {
        super.method644(30, this.field6113.field1924 * arg1);
        field6115++;
        int var3 = 96 / ((-arg0 - 49) / 60);
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Ltm;Lvp;Z)V")
    public class443(class327 arg0, class160 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field6113 = arg1;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
    public static final void method2597(Throwable arg0, String arg1, byte arg2) {
        field6117++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class503.method2905(arg0, false);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class87.method507(var3, false);
            String var4 = class565.method3296(31363, ":", "%3a", var3);
            String var5 = class565.method3296(31363, "@", "%40", var4);
            String var6 = class565.method3296(31363, "&", "%26", var5);
            String var7 = class565.method3296(31363, "#", "%23", var6);
            if (class337.field4386.field2014 != null) {
                class506 var8 = class337.field4386.method919(0, new URL(class337.field4386.field2014.getCodeBase(), "clienterror.ws?c=" + class398.field5248 + "&u=" + class157.field1917 + "&v1=" + class165.field2016 + "&v2=" + class165.field2030 + "&e=" + var7));
                while (var8.field7031 == 0) {
                    class462.method2688(1L, (byte) 110);
                }
                if (var8.field7031 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field7030;
                    var9.read();
                    var9.close();
                }
                if (arg2 <= 72) {
                    method2596(109);
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)I")
    public final int method441(int arg0) {
        if (arg0 != 16304) {
            field6122 = -32;
        }
        field6111++;
        return super.method441(16304);
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method440(int arg0, boolean arg1) {
        field6110++;
        if (arg0 > -97) {
            this.field6113 = null;
        }
        return super.method440(-119, arg1);
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)V")
    public final void method443(int arg0) {
        if (arg0 == 23678) {
            super.method443(arg0);
            field6116++;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IBIII)V")
    public static final void method2598(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 125) {
            return;
        }
        if (arg2 > arg0) {
            for (int var5 = arg0; var5 < arg2; var5++) {
                class328.field4287[var5][arg3] = arg4;
            }
        } else {
            for (int var6 = arg2; var6 < arg0; var6++) {
                class328.field4287[var6][arg3] = arg4;
            }
        }
        field6118++;
    }

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "(I)V")
    public static void method2599(int arg0) {
        field6109 = null;
        field6112 = null;
        if (arg0 != -31277) {
            field6122 = -42;
        }
        field6119 = null;
    }

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "(I)Lvp;")
    public final class160 method645(int arg0) {
        if (arg0 == 29150) {
            field6120++;
            return this.field6113;
        } else {
            return null;
        }
    }

    static {
        new class180("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
    }
}
