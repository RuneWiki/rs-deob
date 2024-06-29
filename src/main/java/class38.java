import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class38 extends class16 {

    @OriginalMember(owner = "client!hn", name = "Q", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!hn", name = "R", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!hn", name = "S", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!hn", name = "U", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!hn", name = "V", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!hn", name = "W", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "client!hn", name = "X", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client!hn", name = "Y", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!hn", name = "Z", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!hn", name = "ab", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!hn", name = "T", descriptor = "Z")
    public static boolean field504;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(B)I", line = 8)
    public static final int method239(byte arg0) {
        field503++;
        int var1 = -81 / ((arg0 + 81) / 38);
        return ((class139.field2076 == 0 ? 0 : 1) << 22) + ((class56.field739 ? 1 : 0) << 19) + ((class238.field3766 ? 1 : 0) << 16) + ((class269.field4250 ? 1 : 0) << 13) + ((class17.field227 & 0x3) << 11) + (((class226.field3598 ? 1 : 0) << 9) + ((class39.field548 ? 1 : 0) << 5) + ((class243.field3859 ? 1 : 0) << 4) + (class91.field1404 & 0x7) - (-((class237.field3757 ? 1 : 0) << 3) - (((class175.field2791 ? 1 : 0) << 6) + ((class196.field3219 ? 1 : 0) << 7)) + -((class39.field512 ? 1 : 0) << 8) - (((class202.field3302 ? 1 : 0) << 10) - -((class63.field831 ? 1 : 0) << 15)))) + (class86.field1304 << 17) + ((class337.field5229 == 0 ? 0 : 1) << 20) + ((class13.field164 == 0 ? 0 : 1) << 21) + (class167.method1151() << 23);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lkb;Lkb;ZLkb;)V", line = 20)
    public static final void method240(class39 arg0, class39 arg1, boolean arg2, class39 arg3) {
        class79.field1189 = arg0;
        class28.field415 = arg1;
        class139.field2084 = arg3;
        field506++;
        if (arg2) {
            method242((byte) -17);
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)V", line = 40)
    private final void method241(int arg0, int arg1) {
        this.field507 = arg1 & 0xFF << 4;
        this.field508 = arg1 >> 4 & 0xFF0;
        field511++;
        if (arg0 > -105) {
            this.method52((byte) 24, (class192) null, -57);
        }
        this.field510 = (arg1 & 0xFF0000) >> 12;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)[[I", line = 58)
    public final int[][] method54(int arg0, byte arg1) {
        field502++;
        int var3 = 74 % ((40 - arg1) / 41);
        int[][] var4 = this.field197.method715(true, arg0);
        if (this.field197.field1548) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class276.field4376; var8++) {
                var5[var8] = this.field510;
                var6[var8] = this.field508;
                var7[var8] = this.field507;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V", line = 95)
    public class38() {
        this(0);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLim;I)V", line = 106)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg2 == 0) {
            this.method241(-112, arg1.method1378(false));
        }
        if (arg0 != -7) {
            this.field508 = 61;
        }
        field501++;
    }

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "(B)V", line = 127)
    public static final void method242(byte arg0) {
        if (arg0 != 29) {
            method239((byte) -67);
        }
        class218.field3503.method1623(1);
        field505++;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(I)V", line = 141)
    private class38(int arg0) {
        super(0, false);
        this.method241(-113, arg0);
    }
}
