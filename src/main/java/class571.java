import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class571 {

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "I")
    private int field8041 = -1;

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
    private int field8039 = 0;

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "Lwba;")
    private class46 field8036 = new class46();

    @OriginalMember(owner = "client!mfa", name = "m", descriptor = "Z")
    public boolean field8047 = false;

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "I")
    private int field8045;

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
    private int field8037;

    @OriginalMember(owner = "client!mfa", name = "h", descriptor = "[[I")
    private int[][] field8042;

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "[Ldl;")
    private class57[] field8040;

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "Z")
    public static boolean field8038 = false;

    @OriginalMember(owner = "client!mfa", name = "j", descriptor = "I")
    public static int field8044 = 13156520;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
    public static int field8035;

    @OriginalMember(owner = "client!mfa", name = "i", descriptor = "I")
    public static int field8043;

    @OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
    public static int field8046;

    @OriginalMember(owner = "client!mfa", name = "n", descriptor = "[Lf;")
    public static class702[] field8048;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)V", line = 16)
    public final void method3248(byte arg0) {
        for (int var2 = 0; var2 < this.field8045; var2++) {
            this.field8042[var2] = null;
        }
        field8046++;
        this.field8042 = null;
        if (arg0 <= 2) {
            this.method3248((byte) 84);
        }
        this.field8040 = null;
        this.field8036.method475(6);
        this.field8036 = null;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)[[I", line = 41)
    public final int[][] method3249(int arg0) {
        field8035++;
        if (this.field8045 != this.field8037) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field8045; var2++) {
            this.field8040[var2] = class325.field4809;
        }
        if (arg0 != -29306) {
            this.field8045 = -59;
        }
        return this.field8042;
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(III)V", line = 157)
    public class571(int arg0, int arg1, int arg2) {
        this.field8045 = arg0;
        this.field8037 = arg1;
        this.field8042 = new int[this.field8045][arg2];
        this.field8040 = new class57[this.field8037];
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(BI)[I", line = 66)
    public final int[] method3250(byte arg0, int arg1) {
        if (arg0 != 5) {
            this.method3249(108);
        }
        field8043++;
        if (this.field8045 == this.field8037) {
            this.field8047 = this.field8040[arg1] == null;
            this.field8040[arg1] = class325.field4809;
            return this.field8042[arg1];
        } else if (this.field8045 == 1) {
            this.field8047 = this.field8041 != arg1;
            this.field8041 = arg1;
            return this.field8042[0];
        } else {
            class57 var3 = this.field8040[arg1];
            if (var3 == null) {
                this.field8047 = true;
                if (this.field8039 >= this.field8045) {
                    class57 var4 = (class57) this.field8036.method471(0);
                    var3 = new class57(arg1, var4.field1099);
                    this.field8040[var4.field1098] = null;
                    var4.method3678(-1);
                } else {
                    var3 = new class57(arg1, this.field8039);
                    this.field8039++;
                }
                this.field8040[arg1] = var3;
            } else {
                this.field8047 = false;
            }
            this.field8036.method479((byte) -127, var3);
            return this.field8042[var3.field1099];
        }
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(I)V", line = 133)
    public static void method3251(int arg0) {
        if (arg0 != -23234) {
            method3251(-71);
        }
        field8048 = null;
    }
}
