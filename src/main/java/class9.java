import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class9 {

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    private int field103 = 0;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public int field95;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "[Lfaa;")
    public class424[] field98;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field100 = 0;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "J")
    private long field90;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "Lfaa;")
    private class424 field104;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Lfaa;")
    private class424 field99;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lfaa;IJ)V")
    public final void method38(class424 arg0, int arg1, long arg2) {
        if (arg0.field5497 != null) {
            arg0.method2438((byte) 123);
        }
        field86++;
        class424 var5 = this.field98[(int) ((long) (this.field95 - 1) & arg2)];
        arg0.field5500 = var5;
        arg0.field5497 = var5.field5497;
        arg0.field5497.field5500 = arg0;
        arg0.field5499 = arg2;
        arg0.field5500.field5497 = arg0;
        int var6 = 47 % ((arg1 + 60) / 35);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(JI)Lfaa;")
    public final class424 method39(long arg0, int arg1) {
        field89++;
        this.field90 = arg0;
        if (arg1 != 31750) {
            this.field95 = 54;
        }
        class424 var4 = this.field98[(int) (arg0 & (long) (this.field95 - 1))];
        for (this.field99 = var4.field5500; this.field99 != var4; this.field99 = this.field99.field5500) {
            if (this.field99.field5499 == arg0) {
                class424 var5 = this.field99;
                this.field99 = this.field99.field5500;
                return var5;
            }
        }
        this.field99 = null;
        return null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)Lfaa;")
    public final class424 method40(boolean arg0) {
        field93++;
        if (this.field103 > 0 && this.field98[this.field103 - 1] != this.field104) {
            class424 var2 = this.field104;
            this.field104 = var2.field5500;
            return var2;
        }
        while (this.field103 < this.field95) {
            class424 var3 = this.field98[this.field103++].field5500;
            if (this.field98[this.field103 - 1] != var3) {
                this.field104 = var3.field5500;
                return var3;
            }
        }
        if (arg0) {
            method44(37, null, 13, -78);
        }
        return null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public final void method41(int arg0) {
        for (int var2 = 0; var2 < this.field95; var2++) {
            class424 var3 = this.field98[var2];
            while (true) {
                class424 var4 = var3.field5500;
                if (var3 == var4) {
                    break;
                }
                var4.method2438((byte) 115);
            }
        }
        field102++;
        this.field99 = null;
        this.field104 = null;
        if (arg0 != 62) {
            this.method46(118);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Lfaa;")
    public final class424 method42(byte arg0) {
        if (arg0 < 29) {
            field100 = -121;
        }
        this.field103 = 0;
        field92++;
        return this.method40(false);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)I")
    public final int method43(byte arg0) {
        field96++;
        int var2 = 0;
        int var3 = -11 / ((-arg0 - 10) / 60);
        for (int var4 = 0; var4 < this.field95; var4++) {
            class424 var5 = this.field98[var4];
            class424 var6 = var5.field5500;
            while (var5 != var6) {
                var6 = var6.field5500;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjd;II)V")
    public static final void method44(int arg0, class559 arg1, int arg2, int arg3) {
        class287.field3714[arg2][arg3] = arg1;
        int var4 = 6 / ((arg0 + 53) / 61);
        field87++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/net/Socket;II)Lts;")
    public static final class35 method45(Socket arg0, int arg1, int arg2) throws IOException {
        if (arg1 != 1) {
            field100 = 53;
        }
        field88++;
        return new class603(arg0, arg2);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Lfaa;")
    public final class424 method46(int arg0) {
        field101++;
        if (arg0 != 0) {
            this.method47(71);
        }
        if (this.field99 == null) {
            return null;
        }
        class424 var2 = this.field98[(int) (this.field90 & (long) (this.field95 - 1))];
        while (this.field99 != var2) {
            if (this.field99.field5499 == this.field90) {
                class424 var3 = this.field99;
                this.field99 = this.field99.field5500;
                return var3;
            }
            this.field99 = this.field99.field5500;
        }
        this.field99 = null;
        return null;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I)V")
    public class9(int arg0) {
        this.field95 = arg0;
        this.field98 = new class424[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class424 var3 = this.field98[var2] = new class424();
            var3.field5500 = var3;
            var3.field5497 = var3;
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)I")
    public final int method47(int arg0) {
        if (arg0 != -1) {
            this.field98 = null;
        }
        field94++;
        return this.field95;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[Lfaa;)I")
    public final int method48(int arg0, class424[] arg1) {
        field91++;
        int var3 = 0;
        if (arg0 != 27731) {
            this.field98 = null;
        }
        for (int var4 = 0; var4 < this.field95; var4++) {
            class424 var5 = this.field98[var4];
            for (class424 var6 = var5.field5500; var6 != var5; var6 = var6.field5500) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }
}
