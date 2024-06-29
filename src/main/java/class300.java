import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class300 {

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    private int field4094 = 0;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    private int field4091 = -1;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "Lmk;")
    private class154 field4096 = new class154();

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "Z")
    public boolean field4104 = false;

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
    private int field4099;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
    private int field4097;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "[Lun;")
    private class317[] field4103;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "[[[I")
    private int[][][] field4087;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field4088 = -2;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "Z")
    public static boolean field4092 = false;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "[B")
    public static byte[] field4095 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "Luc;")
    public static class58 field4090 = new class58(16);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBI)I", line = 4)
    public static final int method1772(int arg0, byte arg1, int arg2) {
        int var3 = 26 / ((19 - arg1) / 43);
        field4100++;
        int var4 = arg0 * 57 + arg2;
        int var5 = var4 << 13 ^ var4;
        int var6 = Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589;
        return (var6 & 0x7FD7ADF) >> 19;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZI)V", line = 23)
    public static final void method1773(boolean arg0, int arg1) {
        field4086++;
        class40 var2 = class162.method872(arg1, (byte) 92, 7);
        if (!arg0) {
            method1776((byte) -77);
        }
        var2.method193(-91);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BI)[[I", line = 39)
    public final int[][] method1774(byte arg0, int arg1) {
        int var3 = -6 % ((51 - arg0) / 51);
        field4102++;
        if (this.field4099 == this.field4097) {
            this.field4104 = this.field4103[arg1] == null;
            this.field4103[arg1] = class340.field4545;
            return this.field4087[arg1];
        } else if (this.field4097 == 1) {
            this.field4104 = this.field4091 != arg1;
            this.field4091 = arg1;
            return this.field4087[0];
        } else {
            class317 var4 = this.field4103[arg1];
            if (var4 == null) {
                this.field4104 = true;
                if (this.field4097 > this.field4094) {
                    var4 = new class317(arg1, this.field4094);
                    this.field4094++;
                } else {
                    class317 var5 = (class317) this.field4096.method821((byte) 124);
                    var4 = new class317(arg1, var5.field4231);
                    this.field4103[var5.field4227] = null;
                    var5.method1967(-1);
                }
                this.field4103[arg1] = var4;
            } else {
                this.field4104 = false;
            }
            this.field4096.method820(var4, (byte) 73);
            return this.field4087[var4.field4231];
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V", line = 106)
    public final void method1775(byte arg0) {
        field4101++;
        for (int var2 = 0; var2 < this.field4097; var2++) {
            this.field4087[var2][0] = null;
            this.field4087[var2][1] = null;
            this.field4087[var2][2] = null;
            this.field4087[var2] = null;
        }
        this.field4103 = null;
        this.field4087 = null;
        this.field4096.method829(false);
        if (arg0 > -35) {
            field4092 = false;
        }
        this.field4096 = null;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V", line = 133)
    public static void method1776(byte arg0) {
        field4090 = null;
        if (arg0 > 55) {
            field4095 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(B)[[[I", line = 146)
    public final int[][][] method1777(byte arg0) {
        if (arg0 >= -63) {
            method1772(54, (byte) 46, -39);
        }
        field4098++;
        if (this.field4099 != this.field4097) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field4097; var2++) {
            this.field4103[var2] = class340.field4545;
        }
        return this.field4087;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V", line = 172)
    public static final void method1778(int arg0) {
        field4089++;
        int[] var1 = new int[class7.field65];
        int var2 = 0;
        if (arg0 != -1) {
            method1772(-69, (byte) 96, 24);
        }
        for (int var3 = 0; var3 < class7.field65; var3++) {
            class123 var5 = class65.method368(var3, arg0 ^ 0x7F);
            if (var5.field1550 >= 0 || var5.field1532 >= 0) {
                var1[var2++] = var3;
            }
        }
        class72.field801 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class72.field801[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(III)V", line = 234)
    public class300(int arg0, int arg1, int arg2) {
        this.field4099 = arg1;
        this.field4097 = arg0;
        this.field4103 = new class317[this.field4099];
        this.field4087 = new int[this.field4097][3][arg2];
    }
}
