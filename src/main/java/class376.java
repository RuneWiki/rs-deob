import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class376 {

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field5748 = -2;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "[B")
    public byte[] field5744;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "[S")
    public short[] field5746;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "[S")
    public short[] field5747;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "[S")
    public short[] field5749;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BLbp;)V", line = 12)
    public static final void method2338(byte arg0, class322 arg1) {
        if (arg0 != -44) {
            field5748 = -60;
        }
        field5745++;
        class119 var2 = (class119) class266.field3707.method943((long) arg1.field5254, -1);
        if (var2 == null) {
            class242.method1617(null, arg1.field5339[0], (byte) -116, arg1.field5344[0], null, 0, arg1, arg1.field2210);
        } else {
            var2.method768(-30867);
        }
    }
}
