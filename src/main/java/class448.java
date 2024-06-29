import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class448 {

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "Z")
    public static boolean field6479 = false;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Lgj;")
    public class448 field6474;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "Lgj;")
    public class448 field6478;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)I", line = 6)
    public static final int method2641(byte arg0) {
        field6477++;
        if (arg0 <= 34) {
            field6479 = false;
        }
        if (class38.field513 == null) {
            return class106.field1440 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V", line = 26)
    public static final void method2642(byte arg0) {
        class329.field4490.method448(class378.field5319, class437.field6374.field4250 ? class238.field3272 + 256 << 0 : -1, 256);
        if (arg0 != -73) {
            field6479 = true;
        }
        field6481++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(JI)V", line = 40)
    public static final void method2643(long arg0, int arg1) {
        field6473++;
        int var3 = class127.field1740;
        int var4 = class509.field7470;
        if (class254.field3530 != var3) {
            int var5 = var3 - class254.field3530;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class254.field3530 += var6;
        }
        if (class67.field934 != var4) {
            int var7 = var4 - class67.field934;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class67.field934 += var8;
        }
        if (!class437.field6374.field4261) {
            class510.field7495 += (float) arg0 * class260.field3580 / 40.0F * 8.0F;
            class40.field553 += (float) arg0 * class401.field5582 / 40.0F * 8.0F;
        }
        class118.method746(-122);
        if (arg1 <= 121) {
            method2643(8L, -55);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lqa;IZI)V", line = 130)
    public static final void method2644(class162 arg0, int arg1, boolean arg2, int arg3) {
        class84.field1168 = new class483[arg3][arg1];
        class329.field4490 = arg0;
        if (!arg2) {
            method2643(-16L, 110);
        }
        field6475++;
        if (class157.field2233 != null) {
            class253.field3525 = class505.method2966(class157.field2233[5], class157.field2233[4], class157.field2233[1], class157.field2233[0], class157.field2233[2], class157.field2233[3], 125);
        }
        class514.field7555 = new class483();
        class120.method759((byte) 80);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 149)
    public final void method2645(int arg0) {
        if (arg0 <= 116) {
            this.field6474 = null;
        }
        field6476++;
        if (this.field6474 != null) {
            this.field6474.field6478 = this.field6478;
            this.field6478.field6474 = this.field6474;
            this.field6478 = null;
            this.field6474 = null;
        }
    }
}
