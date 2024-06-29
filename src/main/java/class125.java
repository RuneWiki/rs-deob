import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public abstract class class125 extends class508 {

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILar;)V", line = 4)
    public static final void method790(int arg0, class3 arg1) {
        if (arg0 != 0) {
            return;
        }
        field1720++;
        arg1.field23 = false;
        if (arg1.field20 != null) {
            arg1.field20.field2213 = 0;
        }
        for (class3 var2 = arg1.method15(); var2 != null; var2 = arg1.method16()) {
            method790(arg0, var2);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILbi;[[B)V", line = 30)
    public static final void method791(int arg0, class381 arg1, byte[][] arg2) {
        field1722++;
        if (arg0 != 64) {
            method790(47, null);
        }
        int var3 = class511.field7530.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg2[var4];
            if (var5 != null) {
                int var6 = (class194.field2507[var4] >> 8) * 64 - class35.field545;
                int var7 = (class194.field2507[var4] & 0xFF) * 64 - class336.field4299;
                class100.method679(arg0 ^ 0x4040);
                arg1.method2216(var7, var6, class512.field7538, var5, (byte) -124, class171.field2215);
            }
        }
    }
}
