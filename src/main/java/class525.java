import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class525 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "[B")
    public byte[] field7561;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "[S")
    public short[] field7559;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "[S")
    public short[] field7560;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "[S")
    public short[] field7563;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 6)
    public static final void method3121(int arg0) {
        class1.field2 = true;
        if (arg0 != -11701) {
            method3123(-51);
        }
        field7562++;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V", line = 17)
    public static final void method3122(int arg0) {
        field7558++;
        if (class478.field6940 != null) {
            for (int var1 = 0; var1 < class757.field10543; var1++) {
                class478.field6940[var1] = null;
            }
            class478.field6940 = null;
        }
        if (class666.field9463 != null) {
            for (int var2 = 0; var2 < class19.field199; var2++) {
                class666.field9463[var2] = null;
            }
            class666.field9463 = null;
        }
        if (class258.field4045 != null) {
            for (int var3 = 0; var3 < class304.field4624; var3++) {
                class258.field4045[var3] = null;
            }
            class258.field4045 = null;
        }
        class117.field1804 = null;
        class573.field8132 = null;
        class158.field2452 = null;
        int var4 = -122 / ((24 - arg0) / 58);
        class753.field10491 = -1;
        class124.field1907 = -1;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V", line = 81)
    public static final void method3123(int arg0) {
        field7564++;
        if (class18.field189) {
            return;
        }
        class285.field4394 += (24.0F - class285.field4394) / 2.0F;
        class218.field3575 = true;
        class18.field189 = true;
        if (arg0 != 5513) {
            method3123(-29);
        }
    }
}
