import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class303 {

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    private int field4419 = 0;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    private int field4427 = -1;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "Lam;")
    private class455 field4421 = new class455();

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "Z")
    public boolean field4431 = false;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    private int field4420;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
    private int field4425;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "[Lpn;")
    private class534[] field4424;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "[[[I")
    private int[][][] field4423;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field4422 = 0;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "[B")
    public static byte[] field4428 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1847(int arg0) {
        class315.method1896(false, 64);
        field4430++;
        if (arg0 >= -45) {
            method1847(50);
        }
        if (class86.field1072 >= 0 && class86.field1072 != 0) {
            class192.method1221((byte) -87, class86.field1072);
            class86.field1072 = -1;
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(III)V", line = 181)
    public class303(int arg0, int arg1, int arg2) {
        this.field4420 = arg0;
        this.field4425 = arg1;
        this.field4424 = new class534[this.field4425];
        this.field4423 = new int[this.field4420][3][arg2];
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V", line = 29)
    public final void method1848(int arg0) {
        for (int var2 = 0; var2 < this.field4420; var2++) {
            this.field4423[var2][0] = null;
            this.field4423[var2][1] = null;
            this.field4423[var2][2] = null;
            this.field4423[var2] = null;
        }
        if (arg0 <= 26) {
            field4422 = -82;
        }
        field4429++;
        this.field4423 = null;
        this.field4424 = null;
        this.field4421.method2656(72);
        this.field4421 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)[[[I", line = 56)
    public final int[][][] method1849(boolean arg0) {
        field4418++;
        if (this.field4425 != this.field4420) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (!arg0) {
            this.field4424 = null;
        }
        for (int var2 = 0; var2 < this.field4420; var2++) {
            this.field4424[var2] = class265.field3887;
        }
        return this.field4423;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V", line = 82)
    public static void method1850(byte arg0) {
        if (arg0 != 8) {
            method1850((byte) 43);
        }
        field4428 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)[[I", line = 94)
    public final int[][] method1851(int arg0, byte arg1) {
        if (arg1 != -56) {
            method1850((byte) 90);
        }
        field4426++;
        if (this.field4425 == this.field4420) {
            this.field4431 = this.field4424[arg0] == null;
            this.field4424[arg0] = class265.field3887;
            return this.field4423[arg0];
        } else if (this.field4420 == 1) {
            this.field4431 = this.field4427 != arg0;
            this.field4427 = arg0;
            return this.field4423[0];
        } else {
            class534 var3 = this.field4424[arg0];
            if (var3 == null) {
                this.field4431 = true;
                if (this.field4420 > this.field4419) {
                    var3 = new class534(arg0, this.field4419);
                    this.field4419++;
                } else {
                    class534 var4 = (class534) this.field4421.method2662((byte) -18);
                    var3 = new class534(arg0, var4.field7828);
                    this.field4424[var4.field7829] = null;
                    var4.method2891(arg1 ^ 0xFFFFFFB6);
                }
                this.field4424[arg0] = var3;
            } else {
                this.field4431 = false;
            }
            this.field4421.method2658(var3, false);
            return this.field4423[var3.field7828];
        }
    }
}
