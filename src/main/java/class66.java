import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class66 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Lr;")
    public static class118 field1501 = class153.method1136(84, "lila:");

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lr;")
    private static class118 field1502 = class153.method1136(123, "Please contact customer support)3");

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lr;")
    public static class118 field1505 = field1502;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1504 = new CRC32();

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Lr;")
    public static class118 field1507 = class153.method1136(102, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lge;")
    public static class47 field1508 = new class47(64);

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1509 = 1;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "[Lvd;")
    public static class150[] field1511;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ln;I)V")
    public static final void method572(class90 arg0, int arg1) {
        short var2 = 256;
        field1503++;
        for (int var3 = 0; var3 < class43.field1041.length; var3++) {
            class43.field1041[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * 128.0D * Math.random());
            class43.field1041[var16] = (int) (Math.random() * 256.0D);
        }
        if (arg1 >= -94) {
            method572(null, 22);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class27.field641[var15] = (class43.field1041[var15 - 128] + class43.field1041[var15 + 128] + class43.field1041[var15 - -1] + class43.field1041[var15 + -1]) / 4;
                }
            }
            int[] var13 = class43.field1041;
            class43.field1041 = class27.field641;
            class27.field641 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field2158; var7++) {
            for (int var8 = 0; var8 < arg0.field2159; var8++) {
                if (arg0.field2155[var6++] != 0) {
                    int var9 = arg0.field2157 + var8 + 16;
                    int var10 = var7 + arg0.field2154 + 16;
                    int var11 = var9 + (var10 << 7);
                    class43.field1041[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method573(int arg0) {
        field1504 = null;
        field1501 = null;
        field1508 = null;
        field1505 = null;
        field1507 = null;
        field1502 = null;
        if (arg0 <= -120) {
            field1511 = null;
        }
    }
}
