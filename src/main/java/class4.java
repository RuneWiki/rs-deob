import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class88 {

    @OriginalMember(owner = "client!ft", name = "J", descriptor = "[[B")
    private byte[][] field47 = new byte[10][];

    @OriginalMember(owner = "client!ft", name = "F", descriptor = "Lfca;")
    private class93 field43 = new class93(null);

    @OriginalMember(owner = "client!ft", name = "O", descriptor = "Lfca;")
    private class93 field52 = new class93(null);

    @OriginalMember(owner = "client!ft", name = "M", descriptor = "I")
    private int field50;

    @OriginalMember(owner = "client!ft", name = "N", descriptor = "Lgj;")
    private class662 field51;

    @OriginalMember(owner = "client!ft", name = "G", descriptor = "Lvl;")
    public static class15 field44 = new class15(73, 7);

    @OriginalMember(owner = "client!ft", name = "D", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ft", name = "E", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ft", name = "H", descriptor = "I")
    private int field45;

    @OriginalMember(owner = "client!ft", name = "I", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ft", name = "L", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ft", name = "K", descriptor = "[I")
    private int[] field48;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "(I)V")
    public final void method21(int arg0) {
        field49++;
        if (this.field48 == null) {
            return;
        }
        for (int var2 = arg0; var2 < 10; var2++) {
            if (this.field48.length <= (this.field45 + var2)) {
                return;
            }
            if (this.field47[var2] == null && this.field51.method3720(this.field48[this.field45 + var2], 0, 0)) {
                this.field47[var2] = this.field51.method3732(0, 8906, this.field48[this.field45 + var2]);
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(ILgj;I)V")
    public class4(int arg0, class662 arg1, int arg2) {
        super(arg0);
        this.field50 = arg2;
        this.field51 = arg1;
    }

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "(I)V")
    public static void method22(int arg0) {
        if (arg0 != 0) {
            method22(-20);
        }
        field44 = null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZI)Z")
    public static final boolean method23(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return true;
        }
        field42++;
        if (class263.method1721(arg2, 9, arg0)) {
            return (arg0 & 0xB000) != 0 | class528.method3002(-28825, arg0, arg2) | class164.method1281(arg0, -128, arg2) ? true : (class787.method4289(arg0, arg2, (byte) 108) | class752.method4170(64964, arg2, arg0)) & (arg2 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I[B)I")
    public final int method24(int arg0, byte[] arg1) throws IOException {
        field46++;
        if (arg0 != -31626) {
            return -95;
        }
        if (this.field48 == null) {
            if (!this.field51.method3720(this.field50, 0, 0)) {
                return 0;
            }
            byte[] var3 = this.field51.method3732(0, arg0 ^ 0xFFFFA6BC, this.field50);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field52.field1413 = var3;
            this.field52.field1442 = 0;
            int var4 = var3.length >> 1;
            this.field48 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field48[var5] = this.field52.method763(-119);
            }
        }
        if (this.field48.length <= this.field45) {
            return -1;
        }
        this.method21(0);
        this.field52.field1442 = 0;
        this.field52.field1413 = arg1;
        do {
            if (this.field52.field1413.length <= this.field52.field1442) {
                this.field52.field1413 = null;
                return arg1.length;
            }
            if (this.field43.field1413 == null) {
                if (this.field47[0] == null) {
                    this.field52.field1413 = null;
                    return this.field52.field1442;
                }
                this.field43.field1413 = this.field47[0];
            }
            int var6 = this.field52.field1413.length - this.field52.field1442;
            int var7 = this.field43.field1413.length - this.field43.field1442;
            if (var6 < var7) {
                this.field43.method737(-32768, this.field52.field1413, this.field52.field1442, var6);
                this.field52.field1413 = null;
                return arg1.length;
            }
            this.field52.method743(this.field43.field1442, var7, this.field43.field1413, true);
            this.field45++;
            this.field43.field1442 = 0;
            this.field43.field1413 = null;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field47[var8] = this.field47[var8 + 1];
            }
            this.field47[9] = null;
        } while (this.field48.length > this.field45);
        this.field52.field1413 = null;
        return this.field52.field1442;
    }
}
