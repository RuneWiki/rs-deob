import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class8 extends class255 {

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "Z")
    public boolean field85 = false;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    private int field92 = 0;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    private int field102 = -32768;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    private int field87 = 0;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public int field98;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    public int field97;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    private int field90;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "Leg;")
    private class142 field99;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field88 = 0;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "[I")
    public static int[] field91 = new int[2000];

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "Z")
    public static boolean field94 = false;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()I", line = 12)
    public final int method46() {
        field101++;
        return this.field102;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 20)
    public static void method47(int arg0) {
        field91 = null;
        if (arg0 != -1) {
            method50();
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIIIII)V", line = 197)
    public class8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field104 = arg2;
        this.field98 = arg5 + arg6;
        this.field97 = arg4;
        this.field90 = arg0;
        this.field96 = arg3;
        this.field100 = arg1;
        int var8 = class297.method2038(-98, this.field90).field674;
        if (var8 == -1) {
            this.field85 = true;
        } else {
            this.field85 = false;
            this.field99 = class139.method1084(-83, var8);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)Lhi;", line = 69)
    private final class176 method48(byte arg0) {
        field93++;
        class42 var2 = class297.method2038(-105, this.field90);
        class176 var3;
        if (this.field85) {
            var3 = var2.method316(-1, true);
        } else {
            var3 = var2.method316(this.field92, true);
        }
        if (var3 == null) {
            return null;
        } else {
            int var4 = 74 % ((-arg0 - 35) / 63);
            return var3;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIIIJ)V", line = 93)
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field86++;
        class176 var11 = this.method48((byte) -128);
        if (var11 != null) {
            var11.method49(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field102 = var11.method46();
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "()V", line = 109)
    public static final void method50() {
        for (int var0 = 0; var0 < class72.field1145; var0++) {
            class43 var1 = class98.field1785[var0];
            class31.method255(var1);
            class98.field1785[var0] = null;
        }
        class72.field1145 = 0;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V", line = 123)
    public static final void method51(int arg0, int arg1) {
        class278.field4682 = arg1;
        field89++;
        class59.field922 = -1;
        if (arg0 < 111) {
            field94 = true;
        }
        class59.field922 = -1;
        class273.method1853(87);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ)V", line = 140)
    public static final void method52(int arg0, boolean arg1) {
        if (arg0 != 0) {
            field94 = true;
        }
        field95++;
        if (class146.field2647 != arg1) {
            class146.field2647 = arg1;
            class242.method1718(-2132607698);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)V", line = 162)
    public final void method53(int arg0, byte arg1) {
        field103++;
        if (this.field85) {
            return;
        }
        this.field87 += arg0;
        while (this.field99.field2527[this.field92] < this.field87) {
            this.field87 -= this.field99.field2527[this.field92];
            this.field92++;
            if (this.field92 >= this.field99.field2522.length) {
                this.field85 = true;
                break;
            }
        }
        int var3 = -61 % ((arg1 + 8) / 35);
    }
}
