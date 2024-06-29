import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class119 {

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "Z")
    public boolean field1517 = true;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "Leba;")
    public static class550 field1520 = new class550(58, 4);

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field1524 = 0;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "C")
    private char field1514;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "Ljava/lang/String;")
    public String field1522;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "[[S")
    public static short[][] field1523;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILio;)V", line = 3)
    public final void method693(int arg0, class157 arg1) {
        while (true) {
            int var3 = arg1.method930(255);
            if (var3 == 0) {
                field1519++;
                if (arg0 != 58) {
                    field1523 = null;
                    return;
                }
                return;
            }
            this.method696(arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V", line = 24)
    public static final void method694(int arg0) {
        field1512++;
        class37.field501.method1291(26878);
        class35.field492.method583((byte) 64);
        class516.field7170.method3905(64);
        class118.field1510.method3926(106);
        class440.field5847.method504(-3226);
        class87.field1058.method1404(2);
        class423.field5620.method1708(122);
        class24.field291.method2949(111);
        if (arg0 >= -125) {
            return;
        }
        class632.field8745.method2756(6221);
        class624.field8643.method2527(0);
        class159.field2282.method3592(-115);
        class291.field3852.method1016(34);
        class506.field6989.method2153(false);
        class258.field3383.method2768(false);
        class15.field198.method3459(32766);
        class579.field7919.method2377((byte) -113);
        class400.field5313.method1452((byte) -2);
        class400.field5311.method16((byte) -34);
        class130.field1802.method2427(2000);
        class554.field7565.method578(-1);
        class63.method367((byte) 102);
        class566.method3140(-2247);
        class460.method2574(32);
        class316.method1845(10384);
        class37.method209((byte) -92);
        class230.field2981.method2172(-15112);
        class436.field5815.method2172(-15112);
        class643.field8895.method2172(-15112);
        class704.field9925.method2172(-15112);
        class656.field9352.method2172(-15112);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Z", line = 64)
    public final boolean method695(byte arg0) {
        field1516++;
        int var2 = 78 % ((-arg0 - 4) / 49);
        return this.field1514 == 's';
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lio;ZI)V", line = 74)
    private final void method696(class157 arg0, boolean arg1, int arg2) {
        field1515++;
        if (arg2 == 1) {
            this.field1514 = class55.method322(arg0.method969(3), (byte) 63);
        } else if (arg2 == 2) {
            this.field1521 = arg0.method908(false);
        } else if (arg2 == 4) {
            this.field1517 = false;
        } else if (arg2 == 5) {
            this.field1522 = arg0.method925(66);
        }
        if (!arg1) {
            field1523 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V", line = 113)
    public static void method697(int arg0) {
        field1520 = null;
        field1523 = null;
        if (arg0 != 13614) {
            method694(120);
        }
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)I", line = 124)
    public static final int method698(int arg0) {
        field1518++;
        if (arg0 != 5) {
            method694(66);
        }
        return class207.method1318(false, false);
    }
}
