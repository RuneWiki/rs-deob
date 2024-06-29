import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class79 extends class655 {

    @OriginalMember(owner = "client!dha", name = "G", descriptor = "[[B")
    private byte[][] field1082 = new byte[10][];

    @OriginalMember(owner = "client!dha", name = "I", descriptor = "Lji;")
    private class611 field1084 = new class611(null);

    @OriginalMember(owner = "client!dha", name = "P", descriptor = "Lji;")
    private class611 field1091 = new class611(null);

    @OriginalMember(owner = "client!dha", name = "H", descriptor = "I")
    private int field1083;

    @OriginalMember(owner = "client!dha", name = "N", descriptor = "Lni;")
    private class522 field1089;

    @OriginalMember(owner = "client!dha", name = "K", descriptor = "Z")
    public static boolean field1086 = false;

    @OriginalMember(owner = "client!dha", name = "O", descriptor = "I")
    public static int field1090 = 0;

    @OriginalMember(owner = "client!dha", name = "F", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!dha", name = "J", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!dha", name = "L", descriptor = "I")
    private int field1087;

    @OriginalMember(owner = "client!dha", name = "M", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!dha", name = "E", descriptor = "[I")
    private int[] field1080;

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(ILni;I)V")
    public class79(int arg0, class522 arg1, int arg2) {
        super(arg0);
        this.field1083 = arg2;
        this.field1089 = arg1;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(I[B)I")
    public final int method593(int arg0, byte[] arg1) throws IOException {
        field1085++;
        if (this.field1080 == null) {
            if (!this.field1089.method2891(0, this.field1083, -6329)) {
                return 0;
            }
            byte[] var3 = this.field1089.method2885(0, this.field1083, false);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field1091.field8529 = var3;
            this.field1091.field8520 = 0;
            int var4 = var3.length >> 1;
            this.field1080 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1080[var5] = this.field1091.method3402((byte) 127);
            }
        }
        if (this.field1080.length <= this.field1087) {
            return -1;
        }
        this.method595((byte) 44);
        this.field1091.field8520 = 0;
        this.field1091.field8529 = arg1;
        if (arg0 <= 43) {
            this.field1080 = null;
        }
        do {
            if (this.field1091.field8520 >= this.field1091.field8529.length) {
                this.field1091.field8529 = null;
                return arg1.length;
            }
            if (this.field1084.field8529 == null) {
                if (this.field1082[0] == null) {
                    this.field1091.field8529 = null;
                    return this.field1091.field8520;
                }
                this.field1084.field8529 = this.field1082[0];
            }
            int var6 = this.field1091.field8529.length - this.field1091.field8520;
            int var7 = this.field1084.field8529.length - this.field1084.field8520;
            if (var6 < var7) {
                this.field1084.method3389(this.field1091.field8529, true, var6, this.field1091.field8520);
                this.field1091.field8529 = null;
                return arg1.length;
            }
            this.field1091.method3416(this.field1084.field8529, var7, -1, this.field1084.field8520);
            this.field1084.field8529 = null;
            this.field1084.field8520 = 0;
            this.field1087++;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field1082[var8] = this.field1082[var8 + 1];
            }
            this.field1082[9] = null;
        } while (this.field1087 < this.field1080.length);
        this.field1091.field8529 = null;
        return this.field1091.field8520;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(ILni;B)Lufa;")
    public static final class680 method594(int arg0, class522 arg1, byte arg2) {
        field1088++;
        if (arg2 != -89) {
            field1086 = true;
        }
        class680 var3 = (class680) class232.field2995.method1571(-123, (long) arg0);
        if (var3 == null) {
            if (class572.field8046) {
                var3 = class21.field142.method366(class204.method1127(arg1, arg0), true);
            } else {
                var3 = class636.method3583(arg1.method2873(arg0, 58), 1);
            }
            class232.field2995.method1574((long) arg0, var3, (byte) -80);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dha", name = "e", descriptor = "(B)V")
    public final void method595(byte arg0) {
        field1081++;
        if (this.field1080 == null) {
            return;
        }
        if (arg0 != 44) {
            field1090 = -49;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1087 + var2 >= this.field1080.length) {
                return;
            }
            if (this.field1082[var2] == null && this.field1089.method2891(0, this.field1080[this.field1087 + var2], -6329)) {
                this.field1082[var2] = this.field1089.method2885(0, this.field1080[this.field1087 + var2], false);
            }
        }
    }
}
