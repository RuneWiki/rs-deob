import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class93 {

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field1462 = 0;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Ljh;")
    public static class2 field1461 = new class2(260);

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field1464 = 255;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1463 = new CRC32();

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field1466 = -1;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Ljh;")
    public static class2 field1465 = new class2(30);

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Lqe;")
    public static class168 field1471 = class66.method448("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 104);

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Lqe;")
    private static class168 field1473 = class66.method448("flash1:", 35);

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lqe;")
    public static class168 field1468 = class66.method448("sl_back", 10);

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lqe;")
    private static class168 field1470 = class66.method448("K", -113);

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Lqe;")
    public static class168 field1469 = field1473;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Lqe;")
    public static class168 field1474 = field1470;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Lqe;")
    public static class168 field1475 = field1470;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lqe;")
    public static class168 field1472 = field1473;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "[[[I")
    public static int[][][] field1467;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public static void method615(boolean arg0) {
        field1470 = null;
        field1472 = null;
        field1474 = null;
        field1468 = null;
        field1465 = null;
        field1475 = null;
        field1471 = null;
        field1467 = null;
        field1473 = null;
        field1461 = null;
        if (!arg0) {
            field1463 = null;
            field1469 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZILqe;)V")
    public static final void method616(boolean arg0, int arg1, class168 arg2) {
        field1460++;
        if (arg0) {
            try {
                class46.field592.getAppletContext().showDocument(arg2.method1092(class46.field592.getCodeBase(), (byte) 38), "_blank");
            } catch (Exception var4) {
            }
        } else {
            try {
                class46.field592.getAppletContext().showDocument(arg2.method1092(class46.field592.getCodeBase(), (byte) 38), "_top");
            } catch (Exception var3) {
            }
        }
        if (arg1 < 3) {
            method616(true, 42, null);
        }
    }
}
