import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class55 {

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Lmf;")
    private class113 field1303 = new class113();

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lcd;")
    private static class23 field1290 = class54.method414("Unable to connect)3", -1);

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lcd;")
    public static class23 field1293 = field1290;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Lcd;")
    public static class23 field1294 = class54.method414("m", -1);

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Lcd;")
    public static class23 field1297 = class54.method414(" (X", -1);

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lcd;")
    public static class23 field1296 = class54.method414("sl_stars", -1);

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Lcd;")
    public static class23 field1300 = field1290;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Lcd;")
    private static class23 field1305 = class54.method414("Loaded sprites", -1);

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Lcd;")
    public static class23 field1304 = field1305;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Ld;")
    public static class28 field1301;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "[[B")
    public static byte[][] field1299;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)Lmf;")
    public final class113 method429(boolean arg0) {
        field1292++;
        class113 var2 = this.field1303.field2381;
        if (this.field1303 == var2) {
            return null;
        } else if (arg0) {
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Lmf;")
    public final class113 method430(byte arg0) {
        if (arg0 > -22) {
            field1293 = null;
        }
        field1302++;
        class113 var2 = this.field1303.field2381;
        if (this.field1303 == var2) {
            return null;
        } else {
            var2.method724(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method431(int arg0) {
        field1293 = null;
        field1304 = null;
        field1294 = null;
        field1300 = null;
        field1296 = null;
        if (arg0 > -89) {
            field1301 = null;
        }
        field1290 = null;
        field1297 = null;
        field1301 = null;
        field1299 = null;
        field1305 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lmf;I)V")
    public final void method432(class113 arg0, int arg1) {
        if (arg0.field2382 != null) {
            arg0.method724(true);
        }
        if (arg1 != -7053) {
            field1296 = null;
        }
        arg0.field2382 = this.field1303;
        arg0.field2381 = this.field1303.field2381;
        arg0.field2382.field2381 = arg0;
        field1298++;
        arg0.field2381.field2382 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLmf;)V")
    public final void method433(byte arg0, class113 arg1) {
        if (arg0 >= -79) {
            this.field1303 = null;
        }
        if (arg1.field2382 != null) {
            arg1.method724(true);
        }
        arg1.field2382 = this.field1303.field2382;
        arg1.field2381 = this.field1303;
        arg1.field2382.field2381 = arg1;
        field1291++;
        arg1.field2381.field2382 = arg1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lkh;ILkh;Lkh;Lkh;)V")
    public static final void method434(class97 arg0, int arg1, class97 arg2, class97 arg3, class97 arg4) {
        class107.field2289 = arg0;
        class170.field3383 = arg4;
        class116.field2413 = arg3;
        class34.field689 = arg2;
        class100.field2114 = new class47[class107.field2289.method648((byte) -121)][];
        field1295++;
        class129.field2678 = new boolean[class107.field2289.method648((byte) 52)];
        if (arg1 != 23223) {
            method434(null, -19, null, null, null);
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class55() {
        this.field1303.field2381 = this.field1303;
        this.field1303.field2382 = this.field1303;
    }
}
