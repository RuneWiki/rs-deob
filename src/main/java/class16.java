import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class16 extends RuntimeException {

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Ljava/lang/String;")
    public String field287;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field284;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lo;")
    public static class84 field289 = class15.method124("Could not complete login)3", 255);

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field286 = 7759444;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "[[I")
    public static int[][] field290 = new int[104][104];

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Lo;")
    public static class84 field293 = class15.method124("@gre@Classic", 255);

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lfc;")
    public static class34 field291;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 14)
    public static final void method129(int arg0) {
        class6.field121.method742(4);
        if (arg0 != -30989) {
            field286 = -92;
        }
        field292++;
        class86.field1965.method742(4);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 30)
    public static void method130(int arg0) {
        field293 = null;
        if (arg0 < 118) {
            field290 = null;
        }
        field289 = null;
        field290 = null;
        field291 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lo;I)V", line = 57)
    public static final void method131(class84 arg0, int arg1) {
        field288++;
        if (arg0 == null || arg0.method639(120) == 0) {
            class106.field2254 = 0;
            return;
        }
        int var2 = 23 % ((76 - arg1) / 49);
        class84 var3 = arg0;
        int var4 = 0;
        class84[] var5 = new class84[100];
        while (true) {
            int var6 = var3.method652(32, 118);
            if (var6 == -1) {
                class84 var8 = var3.method648((byte) 12);
                if (var8.method639(124) > 0) {
                    var5[var4++] = var8.method666(-33);
                }
                class106.field2254 = 0;
                label47: for (int var9 = 0; var9 < class45.field946; var9++) {
                    class44 var10 = class126.method970(56, var9);
                    if (var10.field895 == -1 && var10.field921 != null) {
                        class84 var11 = var10.field921.method666(-45);
                        for (int var12 = 0; var12 < var4; var12++) {
                            if (var11.method670(var5[var12], (byte) 95) == -1) {
                                continue label47;
                            }
                        }
                        class19.field366[class106.field2254] = var11;
                        class42.field865[class106.field2254] = var9;
                        class106.field2254++;
                        if (class19.field366.length <= class106.field2254) {
                            return;
                        }
                    }
                }
                return;
            }
            class84 var7 = var3.method650(var6, -32, 0).method648((byte) 12);
            if (var7.method639(124) > 0) {
                var5[var4++] = var7.method666(-27);
            }
            var3 = var3.method655(28418, var6 + 1);
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 139)
    public class16(Throwable arg0, String arg1) {
        this.field287 = arg1;
        this.field284 = arg0;
    }
}
