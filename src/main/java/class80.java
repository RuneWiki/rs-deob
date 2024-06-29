import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class80 extends class729 {

    @OriginalMember(owner = "client!fu", name = "M", descriptor = "B")
    public byte field1190;

    @OriginalMember(owner = "client!fu", name = "I", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!fu", name = "J", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!fu", name = "K", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!fu", name = "L", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!fu", name = "N", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!fu", name = "O", descriptor = "I")
    public int field1192;

    @OriginalMember(owner = "client!fu", name = "P", descriptor = "Lol;")
    public class431 field1193;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIILvi;)V", line = 3)
    public static final void method711(int arg0, int arg1, int arg2, int arg3, class302 arg4) {
        ++field1187;
        arg4.field4341.method2548(arg0, (byte) -128);
        arg4.field4341.method2559(arg2, 116);
        int var5 = -122 / ((arg1 - -10) / 61);
        arg4.field4341.method2572(arg3, (byte) 99);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lm;I)V", line = 16)
    public static final void method712(class554 arg0, int arg1) {
        ++field1189;
        if (arg1 == 0) {
            if (!class383.field5382) {
                arg0.method4237(-1);
                --class624.field8863;
                if (arg0.field7698) {
                    for (class551 var2 = (class551) class496.field6807.method249(18371); var2 != null; var2 = (class551) class496.field6807.method254((byte) -64)) {
                        if (var2.field7652.equals(arg0.field7690)) {
                            boolean var3 = false;
                            for (class554 var4 = (class554) var2.field7645.method249(18371); var4 != null; var4 = (class554) var2.field7645.method254((byte) -64)) {
                                if (arg0 == var4) {
                                    if (var2.method3181(false, arg0)) {
                                        class27.method226(var2, false);
                                    }
                                    var3 = true;
                                    break;
                                }
                            }
                            if (var3) {
                                return;
                            }
                        }
                    }
                } else {
                    long var5 = arg0.field7680;
                    class551 var7;
                    for (var7 = (class551) class6.field76.method4253(var5, arg1 + -1); var7 != null && !var7.field7652.equals(arg0.field7690); var7 = (class551) class6.field76.method4248(arg1 + -121)) {
                    }
                    if (var7 != null && var7.method3181(false, arg0)) {
                        class27.method226(var7, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "(I)[B", line = 96)
    public final byte[] method713(int arg0) {
        int var2 = 84 % ((arg0 - 55) / 40);
        ++field1191;
        if (!super.field10169 && ~(this.field1193.field6002.length + -this.field1190) >= ~this.field1193.field5983) {
            return this.field1193.field6002;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IB)I", line = 116)
    public static final int method714(int arg0, byte arg1) {
        ++field1188;
        int var2 = 19 % ((arg1 - 68) / 42);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)I", line = 128)
    public final int method715(int arg0) {
        ++field1186;
        if (this.field1193 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.method713(82);
            }
            return this.field1193.field5983 * 100 / (this.field1193.field6002.length + -this.field1190);
        }
    }
}
