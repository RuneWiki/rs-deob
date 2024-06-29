import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class636 extends class356 {

    @OriginalMember(owner = "client!sfa", name = "E", descriptor = "Lhaa;")
    public class73 field9003;

    @OriginalMember(owner = "client!sfa", name = "w", descriptor = "Lvf;")
    public class138 field8996;

    @OriginalMember(owner = "client!sfa", name = "H", descriptor = "I")
    public static int field9006 = 0;

    @OriginalMember(owner = "client!sfa", name = "u", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!sfa", name = "v", descriptor = "I")
    public int field8995;

    @OriginalMember(owner = "client!sfa", name = "x", descriptor = "I")
    public int field8997;

    @OriginalMember(owner = "client!sfa", name = "y", descriptor = "I")
    public int field8998;

    @OriginalMember(owner = "client!sfa", name = "z", descriptor = "I")
    public int field8999;

    @OriginalMember(owner = "client!sfa", name = "A", descriptor = "I")
    public static int field9000;

    @OriginalMember(owner = "client!sfa", name = "B", descriptor = "I")
    public static int field9001;

    @OriginalMember(owner = "client!sfa", name = "C", descriptor = "I")
    public int field9002;

    @OriginalMember(owner = "client!sfa", name = "G", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!sfa", name = "I", descriptor = "I")
    public static int field9007;

    @OriginalMember(owner = "client!sfa", name = "F", descriptor = "Lul;")
    public static class523 field9004;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)V")
    public static final void method3559(byte arg0) {
        field9005++;
        class145.field1625 = 0;
        class530.field7597.method3170((byte) -100);
        class530.field7597.method3164(class460.field6400, 256);
        class145.field1625++;
        if (arg0 < 45) {
            field9004 = null;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "(B)V")
    public final void method3560(byte arg0) {
        this.field9002 = this.field9003.field767;
        this.field8998 = this.field9003.field764;
        if (arg0 != -97) {
            method3562(78);
        }
        this.field8997 = this.field9003.field769;
        field9000++;
        if (this.field9003.field763 != null) {
            this.field9003.field763.method230(this.field8996.field1568, this.field8996.field1570, this.field8996.field1586, class649.field9245);
        }
        this.field8995 = class649.field9245[0];
        this.field8999 = class649.field9245[2];
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Z)V")
    public static final void method3561(boolean arg0) {
        if (!arg0) {
            return;
        }
        if (class425.field5646 == null || class277.field3512 == null) {
            class425.field5646 = new int[256];
            class277.field3512 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class425.field5646[var1] = (int) (Math.sin(var2) * 4096.0D);
                class277.field3512[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field8994++;
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)V")
    public static void method3562(int arg0) {
        if (arg0 != 7) {
            field9004 = null;
        }
        field9004 = null;
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)V")
    public static final void method3563(int arg0) {
        field9001++;
        if (arg0 != -25522) {
            field9004 = null;
        }
        if (class274.field3474 == 6) {
            class274.field3474 = 7;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lhaa;Lhm;)V")
    public class636(class73 arg0, class202 arg1) {
        this.field9003 = arg0;
        this.field8996 = this.field9003.method465(false);
        this.method3560((byte) -97);
    }
}
