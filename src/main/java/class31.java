import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class31 implements class343 {

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "Ljava/lang/String;")
    private String field393;

    @OriginalMember(owner = "client!tfa", name = "i", descriptor = "Lrg;")
    public static class596 field394 = new class596(0, 8);

    @OriginalMember(owner = "client!tfa", name = "k", descriptor = "S")
    public static short field396 = 205;

    @OriginalMember(owner = "client!tfa", name = "j", descriptor = "Lem;")
    public static class206 field395 = new class206(33, 6);

    @OriginalMember(owner = "client!tfa", name = "o", descriptor = "[Lli;")
    public static class393[] field400 = new class393[1024];

    @OriginalMember(owner = "client!tfa", name = "m", descriptor = "I")
    public static int field398 = 0;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!tfa", name = "l", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!tfa", name = "n", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!tfa", name = "p", descriptor = "Lkm;")
    public static class323 field401;

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "Z")
    private boolean field392;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)V", line = 3)
    public static final void method295(int arg0, int arg1) {
        if (arg0 != 2) {
            method300((byte) -53);
        }
        field388++;
        if (class76.field997 == 1) {
            class36.field430 = arg1;
        } else if (class76.field997 == 2 || class76.field997 == 3) {
            class422.field5942 = arg1;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 23)
    private static final int method296(String arg0, int arg1) {
        field386++;
        if (!class266.field3604.field1456) {
            return -1;
        } else if (class206.field2875.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class54.method412(arg0, (byte) 118);
            if (var2 == null) {
                return -1;
            }
            int var3 = -126 / ((57 - arg1) / 44);
            String var4 = class605.field8411 + var2;
            if (!class325.field4431.method3621(var4, 0, "")) {
                return -1;
            } else if (class325.field4431.method3625(var4, -1)) {
                byte[] var5 = class325.field4431.method3642(99, "", var4);
                Object var6 = null;
                File var7;
                try {
                    var7 = class490.method2777(var2, (byte) -127);
                } catch (RuntimeException var11) {
                    return -1;
                }
                if (var5 == null || var7 == null) {
                    return -1;
                }
                boolean var8 = true;
                byte[] var9 = class324.method1943(26610, var7);
                if (var9 != null && var5.length == var9.length) {
                    for (int var10 = 0; var10 < var9.length; var10++) {
                        if (var5[var10] != var9[var10]) {
                            var8 = false;
                            break;
                        }
                    }
                } else {
                    var8 = false;
                }
                try {
                    if (!var8) {
                        class266.field3604.method766(var7, (byte) -112, var5);
                    }
                } catch (Throwable var12) {
                    return -1;
                }
                class282.method1732(var7, arg0, (byte) -91);
                return 100;
            } else {
                return class325.field4431.method3638(false, var4);
            }
        }
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)V", line = 114)
    public static final void method297(int arg0) {
        if (arg0 < class452.field6235) {
            int var1 = 0;
            for (int var2 = 0; var2 < class61.field687.length; var2++) {
                if (class61.field687[var2].indexOf("--> ") != -1) {
                    var1++;
                    if (class452.field6235 == var1) {
                        class187.field2713 = class61.field687[var2].substring(class61.field687[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        } else {
            class187.field2713 = "";
        }
        field397++;
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)Z", line = 145)
    public final boolean method298(byte arg0) {
        field389++;
        if (arg0 != 70) {
            this.method302((byte) 31);
        }
        return this.field392;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(III)V", line = 159)
    public static final void method299(int arg0, int arg1, int arg2) {
        field391++;
        class51 var3 = class703.method3938(arg1 - 1989251486, arg2, 5);
        if (arg1 == -28098) {
            var3.method402((byte) 30);
            var3.field603 = arg0;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(B)V", line = 175)
    public static void method300(byte arg0) {
        if (arg0 != 2) {
            field396 = -22;
        }
        field395 = null;
        field400 = null;
        field394 = null;
        field401 = null;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)I", line = 189)
    public final int method301(int arg0) {
        field390++;
        int var2 = method296(this.field393, arg0 ^ 0x6D99);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        }
        if (arg0 != 28158) {
            field394 = null;
        }
        this.field392 = true;
        return 100;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B)Lmv;", line = 207)
    public final class342 method302(byte arg0) {
        if (arg0 > -88) {
            field401 = null;
        }
        field387++;
        return class342.field4588;
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 218)
    public class31(String arg0) {
        this.field393 = arg0;
    }
}
