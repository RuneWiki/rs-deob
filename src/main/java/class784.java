import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class784 extends class102 {

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "[[B")
    private byte[][] field10733 = new byte[10][];

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "Lmc;")
    private class234 field10737 = new class234(null);

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "Lmc;")
    private class234 field10743 = new class234(null);

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
    private int field10729;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "Lwm;")
    private class30 field10736;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "[B")
    public static byte[] field10734 = new byte[32896];

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "Z")
    public static boolean field10739;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
    public static int field10742;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    private int field10728;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    public static int field10730;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    public static int field10732;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field10735;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    public static int field10738;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public static int field10740;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
    public static int field10741;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "[I")
    private int[] field10731;

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(ILwm;I)V")
    public class784(int arg0, class30 arg1, int arg2) {
        super(arg0);
        this.field10729 = arg2;
        this.field10736 = arg1;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(Z)V")
    public final void method4298(boolean arg0) {
        if (arg0) {
            return;
        }
        field10730++;
        if (this.field10731 == null) {
            return;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field10731.length <= var2 + this.field10728) {
                return;
            }
            if (this.field10733[var2] == null && this.field10736.method127((byte) 114, this.field10731[this.field10728 + var2], 0)) {
                this.field10733[var2] = this.field10736.method139(this.field10731[this.field10728 + var2], (byte) -94, 0);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BII)B")
    public static final byte method4299(byte arg0, int arg1, int arg2) {
        if (arg0 != -106) {
            method4302(56, -97);
        }
        field10738++;
        if (arg1 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
    public static void method4300(int arg0) {
        field10734 = null;
        if (arg0 < 124) {
            method4299((byte) 127, 23, 32);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)V")
    public static final void method4301(boolean arg0, int arg1) {
        class384.field4802.method468(class699.field9263.method880());
        field10735++;
        int[] var2 = class699.field9263.method916();
        class473.field6158 = var2[3];
        class482.field6222 = var2[2];
        class342.field4197 = var2[1];
        class369.field4522 = var2[arg1];
        if (arg0) {
            class699.field9263.method967(class271.field3570, class72.field984, class458.field5984, class1.field2);
            class589.method3168(class621.field7863, -39);
        } else {
            class699.field9263.method967(class357.field4363, class669.field8691, class696.field9015, class693.field8896);
            class589.method3168(class419.field5524, -47);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lvn;")
    public static final class446 method4302(int arg0, int arg1) {
        field10741++;
        if (arg1 <= 76) {
            field10734 = null;
        }
        return arg0 >= 0 && arg0 < 100 ? class438.field5762[arg0] : null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([BB)I")
    public final int method594(byte[] arg0, byte arg1) throws IOException {
        field10732++;
        if (this.field10731 == null) {
            if (!this.field10736.method127((byte) 104, this.field10729, 0)) {
                return 0;
            }
            byte[] var3 = this.field10736.method139(this.field10729, (byte) -94, 0);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field10743.field3133 = 0;
            this.field10743.field3193 = var3;
            int var4 = var3.length >> 1;
            this.field10731 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field10731[var5] = this.field10743.method1553((byte) 17);
            }
        }
        if (this.field10728 >= this.field10731.length) {
            return -1;
        }
        this.method4298(false);
        this.field10743.field3133 = 0;
        this.field10743.field3193 = arg0;
        if (arg1 < 2) {
            field10742 = 47;
        }
        do {
            if (this.field10743.field3193.length <= this.field10743.field3133) {
                this.field10743.field3193 = null;
                return arg0.length;
            }
            if (this.field10737.field3193 == null) {
                if (this.field10733[0] == null) {
                    this.field10743.field3193 = null;
                    return this.field10743.field3133;
                }
                this.field10737.field3193 = this.field10733[0];
            }
            int var6 = this.field10743.field3193.length - this.field10743.field3133;
            int var7 = this.field10737.field3193.length - this.field10737.field3133;
            if (var7 > var6) {
                this.field10737.method1495(var6, this.field10743.field3133, (byte) -126, this.field10743.field3193);
                this.field10743.field3193 = null;
                return arg0.length;
            }
            this.field10743.method1530(this.field10737.field3133, var7, this.field10737.field3193, 101);
            this.field10737.field3193 = null;
            this.field10737.field3133 = 0;
            this.field10728++;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field10733[var8] = this.field10733[var8 + 1];
            }
            this.field10733[9] = null;
        } while (this.field10731.length > this.field10728);
        this.field10743.field3193 = null;
        return this.field10743.field3133;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field10734[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field10739 = false;
        field10742 = 100;
    }
}
