import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class447 extends class210 {

    @OriginalMember(owner = "client!cga", name = "F", descriptor = "Lwo;")
    public static class690 field6332 = new class690(98, -2);

    @OriginalMember(owner = "client!cga", name = "I", descriptor = "Z")
    public static boolean field6335 = true;

    @OriginalMember(owner = "client!cga", name = "B", descriptor = "B")
    public byte field6328;

    @OriginalMember(owner = "client!cga", name = "A", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!cga", name = "C", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!cga", name = "E", descriptor = "I")
    public int field6331;

    @OriginalMember(owner = "client!cga", name = "G", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!cga", name = "H", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!cga", name = "D", descriptor = "Lun;")
    public class389 field6330;

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "(I)[B")
    public final byte[] method917(int arg0) {
        if (arg0 != -27362) {
            method2639((byte) 54);
        }
        ++field6334;
        if (!super.field2557 && this.field6330.field5205.length - this.field6328 <= this.field6330.field5195) {
            return this.field6330.field5205;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "(I)I")
    public final int method921(int arg0) {
        if (arg0 != -23373) {
            field6335 = true;
        }
        ++field6329;
        return this.field6330 == null ? 0 : this.field6330.field5195 * 100 / (this.field6330.field5205.length + -this.field6328);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)V")
    public static void method2639(byte arg0) {
        if (arg0 == 122) {
            field6332 = null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "(I)V")
    public static final void method2640(int arg0) {
        ++field6333;
        try {
            if (~class505.field7053 == -2) {
                int var1 = class601.field8666.method2107((byte) 110);
                if (~var1 < -1 && class601.field8666.method2098(16)) {
                    int var2 = var1 - class42.field762;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class601.field8666.method2084(1380416688, var2);
                    return;
                }
                class601.field8666.method2096(65280);
                class601.field8666.method2094(0);
                class151.field1866 = null;
                if (class74.field1112 == null) {
                    class505.field7053 = 0;
                } else {
                    class505.field7053 = 2;
                }
                class66.field1026 = null;
            }
            int var3 = -60 % ((arg0 - -12) / 37);
            if (class505.field7053 == 3) {
                int var4 = class601.field8666.method2107((byte) 126);
                if (class511.field7473 > var4 && class601.field8666.method2098(16)) {
                    int var5 = class160.field1957 + var4;
                    if (~var5 < ~class511.field7473) {
                        var5 = class511.field7473;
                    }
                    class601.field8666.method2084(1380416688, var5);
                } else {
                    class505.field7053 = 0;
                    class160.field1957 = 0;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class601.field8666.method2096(65280);
            class74.field1112 = null;
            class66.field1026 = null;
            class548.field7959 = null;
            class505.field7053 = 0;
            class151.field1866 = null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method2641(byte arg0, byte[] arg1) {
        if (arg0 < 4) {
            return null;
        } else {
            ++field6327;
            int var2 = arg1.length;
            byte[] var3 = new byte[var2];
            class252.method1545(arg1, 0, var3, 0, var2);
            return var3;
        }
    }
}
