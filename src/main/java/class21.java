import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class21 extends class101 {

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field389 = -1;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "Ltg;")
    public static class184 field404 = class135.method812("Sie haben gerade eine andere Welt verlassen)3", 3);

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "Ltg;")
    public static class184 field391 = class135.method812(":tradereq:", 3);

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "[Lka;")
    public static class97[] field390 = new class97[2048];

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "Lbg;")
    public static class17 field394 = new class17(5000);

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "I")
    public static int field407 = 0;

    @OriginalMember(owner = "client!ca", name = "U", descriptor = "[I")
    public static int[] field408 = new int[5];

    @OriginalMember(owner = "client!ca", name = "V", descriptor = "I")
    public static int field409 = 0;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
    public int field399;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "Lvb;")
    public static class197 field397;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "Lvb;")
    public static class197 field398;

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "Lag;")
    public static class8 field406;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lka;IZ)V")
    private final void method127(class97 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field405 = -46;
        }
        field392++;
        if (arg1 == 1) {
            this.field395 = arg0.method611(arg2);
            this.field403 = arg0.method588((byte) -38);
            this.field399 = arg0.method588((byte) -105);
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(B)V")
    public static void method128(byte arg0) {
        field391 = null;
        field397 = null;
        field394 = null;
        if (arg0 > -15) {
            method131(13, -55, 112);
        }
        field408 = null;
        field406 = null;
        field404 = null;
        field398 = null;
        field390 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lfd;")
    public static final class54 method129(int arg0, int arg1) {
        field400++;
        if (arg1 != 3) {
            method128((byte) -99);
        }
        class54 var2 = (class54) class32.field554.method773((long) arg0, 1);
        if (var2 != null) {
            return var2;
        }
        class54 var3 = class193.method1230(class150.field2686, 0, arg0, class173.field3280, false);
        if (var3 != null) {
            class32.field554.method776(var3, (long) arg0, (byte) -41);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILka;)V")
    public final void method130(int arg0, class97 arg1) {
        if (arg0 != 30346) {
            return;
        }
        field393++;
        while (true) {
            int var3 = arg1.method588((byte) -67);
            if (var3 == 0) {
                return;
            }
            this.method127(arg1, var3, false);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(III)J")
    public static final long method131(int arg0, int arg1, int arg2) {
        class90 var3 = class190.field3704[arg0][arg1][arg2];
        return var3 == null || var3.field1693 == null ? 0L : var3.field1693.field923;
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(B)V")
    public static final void method132(byte arg0) {
        field401++;
        field394.method111((byte) 127);
        int var1 = field394.method115(8, arg0 + 11);
        if (var1 < class38.field711) {
            for (int var2 = var1; var2 < class38.field711; var2++) {
                class49.field910[class180.field3431++] = class97.field1782[var2];
            }
        }
        if (var1 > class38.field711) {
            throw new RuntimeException("gnpov1");
        }
        class38.field711 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class97.field1782[var3];
            class158 var5 = class52.field948[var4];
            int var6 = field394.method115(1, arg0 + 11);
            if (var6 == 0) {
                class97.field1782[class38.field711++] = var4;
                var5.field609 = class161.field2903;
            } else {
                int var7 = field394.method115(2, 104);
                if (var7 == 0) {
                    class97.field1782[class38.field711++] = var4;
                    var5.field609 = class161.field2903;
                    class103.field1881[class87.field1610++] = var4;
                } else if (var7 == 1) {
                    class97.field1782[class38.field711++] = var4;
                    var5.field609 = class161.field2903;
                    int var8 = field394.method115(3, 104);
                    var5.method208(var8, false, false);
                    int var9 = field394.method115(1, 104);
                    if (var9 == 1) {
                        class103.field1881[class87.field1610++] = var4;
                    }
                } else if (var7 == 2) {
                    class97.field1782[class38.field711++] = var4;
                    var5.field609 = class161.field2903;
                    int var10 = field394.method115(3, 104);
                    var5.method208(var10, false, true);
                    int var11 = field394.method115(3, 104);
                    var5.method208(var11, false, true);
                    int var12 = field394.method115(1, 104);
                    if (var12 == 1) {
                        class103.field1881[class87.field1610++] = var4;
                    }
                } else if (var7 == 3) {
                    class49.field910[class180.field3431++] = var4;
                }
            }
        }
        if (arg0 != 93) {
            field394 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "(B)V")
    public static final void method133(byte arg0) {
        class179.field3414 = new class69();
        if (arg0 != -105) {
            field398 = null;
        }
        field396++;
    }
}
