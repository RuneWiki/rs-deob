import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class111 {

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "S")
    public short field1359;

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "Z")
    public boolean field1361;

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "S")
    public short field1363;

    @OriginalMember(owner = "client!iaa", name = "j", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "client!iaa", name = "h", descriptor = "B")
    public byte field1366;

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "S")
    public short field1362;

    @OriginalMember(owner = "client!iaa", name = "g", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!iaa", name = "f", descriptor = "B")
    public byte field1364;

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "Lus;")
    public static class328 field1360 = new class328(76, 7);

    @OriginalMember(owner = "client!iaa", name = "k", descriptor = "I")
    public static int field1369 = 0;

    @OriginalMember(owner = "client!iaa", name = "l", descriptor = "I")
    public static int field1370 = 0;

    @OriginalMember(owner = "client!iaa", name = "m", descriptor = "I")
    public static int field1371 = 0;

    @OriginalMember(owner = "client!iaa", name = "i", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!iaa", name = "o", descriptor = "Ltba;")
    public static class56 field1373;

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "[I")
    public static int[] field1372;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V")
    public static void method754(int arg0) {
        field1360 = null;
        if (arg0 == 0) {
            field1373 = null;
            field1372 = null;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IB)V")
    public static final void method755(int arg0, byte arg1) {
        class703.field9905 = arg0;
        field1367++;
        class114 var2 = class626.field8729;
        synchronized (class626.field8729) {
            class626.field8729.method776((byte) 62);
        }
        if (arg1 == 40) {
            class114 var3 = class124.field1474;
            synchronized (class124.field1474) {
                class124.field1474.method776((byte) 64);
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
    public class111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field1359 = (short) arg5;
        this.field1361 = arg9;
        this.field1363 = (short) arg4;
        this.field1368 = arg0;
        this.field1366 = (byte) arg8;
        this.field1362 = (short) arg6;
        this.field1365 = arg10;
        this.field1364 = (byte) arg7;
    }
}
