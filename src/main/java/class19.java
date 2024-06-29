import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class19 extends class175 {

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "C")
    private char field224;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "Ljava/lang/String;")
    public String field227;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "[[[B")
    public static byte[][][] field219;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)I")
    public static final int method130(int arg0, int arg1) {
        field226++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg1 <= arg0) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILhi;I)V")
    private final void method131(int arg0, class264 arg1, int arg2) {
        if (arg2 > -26) {
            method134(27);
        }
        if (arg0 == 1) {
            this.field224 = class234.method1543(arg1.method1767(16711680), true);
        } else if (arg0 == 2) {
            this.field222 = arg1.method1765((byte) 103);
        } else if (arg0 == 5) {
            this.field227 = arg1.method1750((byte) -52);
        }
        field221++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lhi;B)V")
    public final void method132(class264 arg0, byte arg1) {
        if (arg1 != -56) {
            method134(-83);
        }
        field220++;
        while (true) {
            int var3 = arg0.method1779(-63);
            if (var3 == 0) {
                return;
            }
            this.method131(var3, arg0, -96);
        }
    }

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "(I)Z")
    public final boolean method133(int arg0) {
        if (arg0 == 27144) {
            field225++;
            return this.field224 == 's';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "(I)V")
    public static void method134(int arg0) {
        if (arg0 != -3) {
            method134(116);
        }
        field219 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)I")
    public static final int method135(int arg0, int arg1) {
        int var2 = (arg0 >>> 1 & 0xD5555555) + (arg0 & 0x55555555);
        int var3 = (var2 >>> 2 & 0xF3333333) + (var2 & 0x33333333);
        field223++;
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg1 != 1076237636) {
            method134(-128);
        }
        return var6 & 0xFF;
    }
}
