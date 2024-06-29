import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class151 extends class16 {

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public int field3452;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    private int field3449;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "[I")
    public int[] field3462;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "[[I")
    public int[][] field3458;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "[I")
    public static int[] field3451 = new int[1000];

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "[Z")
    public static boolean[] field3453 = new boolean[5];

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public static volatile int field3456 = -1;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "Lje;")
    public static class67 field3455 = class85.method592(255, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public static int field3454 = 0;

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "[I")
    public static int[] field3463 = new int[256];

    @OriginalMember(owner = "client!ve", name = "P", descriptor = "[I")
    public static int[] field3464 = new int[2048];

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "[[S")
    public static short[][] field3457;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
    public static final void method1154(int arg0) {
        class4.field65 = null;
        class128.field2804 = null;
        class152.field3489 = null;
        field3461++;
        class4.field61 = null;
        class69.field1409 = null;
        class85.field1888 = null;
        if (arg0 != 0) {
            method1155((byte) 27);
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
    public static void method1155(byte arg0) {
        field3463 = null;
        field3464 = null;
        field3457 = null;
        field3451 = null;
        field3453 = null;
        field3455 = null;
        if (arg0 != 67) {
            method1154(-57);
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
    public static final void method1156(int arg0) {
        for (class75 var1 = (class75) class60.field1209.method26((byte) -96); var1 != null; var1 = (class75) class60.field1209.method18((byte) -128)) {
            if (var1.field1610 != null) {
                var1.method539(-13);
            }
        }
        if (arg0 != 31382) {
            field3463 = null;
        }
        field3459++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILje;Lje;Lfd;Lfd;)Loe;")
    public static final class102 method1157(int arg0, class67 arg1, class67 arg2, class40 arg3, class40 arg4) {
        field3450++;
        int var5 = arg4.method251(0, arg1);
        int var6 = arg4.method254(arg2, 0, var5);
        return arg0 == 28098 ? class103.method812(var5, arg4, (byte) -128, arg3, var6) : null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)V")
    public static final void method1158(byte arg0, int arg1) {
        if (arg1 == -1 && !class105.field2404) {
            class64.method434(true);
        } else if (arg1 != -1 && class97.field2171 != arg1 && class99.field2203 != 0 && !class105.field2404) {
            class39.method244(false, 0, 4, class76.field1640, class99.field2203, 2, arg1);
        }
        field3460++;
        if (arg0 <= 94) {
            method1154(103);
        }
        class97.field2171 = arg1;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I[B)V")
    public class151(int arg0, byte[] arg1) {
        this.field3452 = arg0;
        class91 var3 = new class91(arg1);
        this.field3449 = var3.method649(false);
        this.field3462 = new int[this.field3449];
        this.field3458 = new int[this.field3449][];
        for (int var4 = 0; var4 < this.field3449; var4++) {
            this.field3462[var4] = var3.method649(false);
        }
        for (int var5 = 0; var5 < this.field3449; var5++) {
            this.field3458[var5] = new int[var3.method649(false)];
        }
        for (int var6 = 0; var6 < this.field3449; var6++) {
            for (int var7 = 0; var7 < this.field3458[var6].length; var7++) {
                this.field3458[var6][var7] = var3.method649(false);
            }
        }
    }
}
