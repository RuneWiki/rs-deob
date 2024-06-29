import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class62 {

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Z")
    public boolean field1377 = true;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public int field1381;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public int field1389;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public int field1385;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lec;")
    public static class28 field1380 = class28.method210(-46, " ");

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lec;")
    public static class28 field1376 = class28.method210(-46, "To play on this world move to a free area first");

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field1384 = 2;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "J")
    public static long field1383 = 0L;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lcc;")
    public static class16 field1379;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1392;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "[I")
    public static int[] field1382;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)Z")
    public static final boolean method500(int arg0, int arg1, int arg2) {
        field1378++;
        if (arg2 == 0 && class127.field2748 == arg1) {
            return true;
        } else if (arg2 == 1 && class72.field1599 == arg1) {
            return true;
        } else if ((arg2 == 2 || arg2 == 3) && class18.field368 == arg1) {
            return true;
        } else {
            if (arg0 < 75) {
                field1379 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
    public static void method501(boolean arg0) {
        field1376 = null;
        field1380 = null;
        field1392 = null;
        field1379 = null;
        if (arg0) {
            field1382 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1390 = arg2;
        this.field1381 = arg3;
        this.field1387 = arg4;
        this.field1389 = arg1;
        this.field1386 = arg0;
        this.field1377 = arg6;
        this.field1385 = arg5;
    }
}
