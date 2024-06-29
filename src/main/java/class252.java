import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class252 extends class236 {

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    public int field4449;

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "I")
    public int field4454;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    public int field4451;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public int field4445;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field4453 = 0;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "Lsg;")
    public static class30 field4447 = class167.method1221((byte) 33, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public static int field4448 = -1;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
    public static int field4458 = 100;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "Lmc;")
    public static class151 field4452;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "Lsg;")
    public static class30 field4456;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "[[[I")
    public static int[][][] field4444;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
    public static final void method1755(int arg0) {
        field4446++;
        class109.field2197 = arg0;
        class168.field3158 = 0;
        class65.method578(-7813);
        class135.method1017(false);
        class16.method161(11);
        class138.method1047(-6347);
        for (int var1 = 0; var1 < class109.field2197; var1++) {
            int var3 = class268.field4731[var1];
            if (class133.field2617 != class75.field1670[var3].field1391) {
                if (class75.field1670[var3].field2358 > 0) {
                    class269.method1843(class75.field1670[var3], -1);
                }
                class75.field1670[var3] = null;
            }
        }
        if (class163.field3041 != class59.field1289.field146) {
            throw new RuntimeException("gpp1 pos:" + class59.field1289.field146 + " psize:" + class163.field3041);
        }
        for (int var2 = 0; var2 < class28.field528; var2++) {
            if (class75.field1670[class183.field3378[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class28.field528);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V")
    public static void method1756(int arg0) {
        if (arg0 == -28796) {
            field4452 = null;
            field4447 = null;
            field4456 = null;
            field4444 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)Z")
    public static final boolean method1757(byte arg0, int arg1) {
        if (arg0 != 39) {
            field4452 = null;
        }
        field4443++;
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IIII)V")
    public class252(int arg0, int arg1, int arg2, int arg3) {
        this.field4449 = arg0;
        this.field4454 = arg2;
        this.field4451 = arg1;
        this.field4445 = arg3;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)Z")
    public final boolean method1758(int arg0, int arg1, int arg2) {
        if (arg1 != -58) {
            field4453 = 78;
        }
        field4450++;
        return arg0 >= this.field4449 && this.field4454 >= arg0 && arg2 >= this.field4451 && arg2 <= this.field4445;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)Z")
    public static final boolean method1759(byte arg0) {
        field4457++;
        if (class269.field4739 == 0) {
            return arg0 == 102 ? class168.field3108.method640((byte) -98) : false;
        } else {
            return true;
        }
    }
}
