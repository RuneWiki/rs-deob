import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class226 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    private int field4110 = 128;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    private int field4111 = 0;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    private int field4119 = 0;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    private int field4115 = 0;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Z")
    public boolean field4116 = false;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public int field4122 = -1;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    private int field4129 = 128;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "Lcc;")
    public static class209 field4125 = class95.method669(87, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "Lcc;")
    public static class209 field4128 = class95.method669(113, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "Lud;")
    public static class2 field4117 = new class2();

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public int field4114;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    private int field4127;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "[S")
    private short[] field4118;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "[S")
    private short[] field4120;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "[S")
    private short[] field4121;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "[S")
    private short[] field4123;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILtf;B)V")
    private final void method1587(int arg0, class106 arg1, byte arg2) {
        field4126++;
        if (arg2 != -29) {
            method1590(-82);
        }
        if (arg0 == 1) {
            this.field4127 = arg1.method736(125);
        } else if (arg0 == 2) {
            this.field4122 = arg1.method736(122);
        } else if (arg0 == 4) {
            this.field4129 = arg1.method736(123);
        } else if (arg0 == 5) {
            this.field4110 = arg1.method736(125);
        } else if (arg0 == 6) {
            this.field4119 = arg1.method736(126);
        } else if (arg0 == 7) {
            this.field4111 = arg1.method774((byte) 87);
        } else if (arg0 == 8) {
            this.field4115 = arg1.method774((byte) 106);
        } else if (arg0 == 9) {
            this.field4116 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method774((byte) 121);
            this.field4120 = new short[var6];
            this.field4121 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4121[var7] = (short) arg1.method736(126);
                this.field4120[var7] = (short) arg1.method736(arg2 + 155);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method774((byte) 73);
            this.field4118 = new short[var4];
            this.field4123 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4123[var5] = (short) arg1.method736(126);
                this.field4118[var5] = (short) arg1.method736(121);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ltf;I)V")
    public final void method1588(class106 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method774((byte) 90);
            if (var3 == 0) {
                field4113++;
                if (arg1 != 14937) {
                    this.method1588((class106) null, 86);
                    return;
                }
                return;
            }
            this.method1587(var3, arg0, (byte) -29);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)Lvc;")
    public final class189 method1589(int arg0, byte arg1) {
        if (arg1 != -102) {
            method1590(118);
        }
        field4112++;
        class189 var3 = (class189) class235.field4224.method670((byte) -65, (long) this.field4114);
        if (var3 == null) {
            class208 var4 = class208.method1429(class70.field1328, this.field4127, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field4121 != null) {
                for (int var5 = 0; var5 < this.field4121.length; var5++) {
                    var4.method1440(this.field4121[var5], this.field4120[var5]);
                }
            }
            if (this.field4123 != null) {
                for (int var6 = 0; var6 < this.field4123.length; var6++) {
                    var4.method1434(this.field4123[var6], this.field4118[var6]);
                }
            }
            var3 = var4.method1413(this.field4111 + 64, 850 - -this.field4115, -30, -50, -30);
            class235.field4224.method673((long) this.field4114, -5087, var3);
        }
        class189 var7;
        if (this.field4122 == -1 || arg0 == -1) {
            var7 = var3.method425(true, true);
        } else {
            var7 = class245.method1706(this.field4122, (byte) 118).method1670(var3, arg0, arg1 + 94);
        }
        if (this.field4129 != 128 || this.field4110 != 128) {
            var7.method406(this.field4129, this.field4110, this.field4129);
        }
        if (this.field4119 != 0) {
            if (this.field4119 == 90) {
                var7.method412();
            }
            if (this.field4119 == 180) {
                var7.method435();
            }
            if (this.field4119 == 270) {
                var7.method408();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static void method1590(int arg0) {
        field4117 = null;
        if (arg0 == -31317) {
            field4125 = null;
            field4128 = null;
        }
    }
}
