import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class18 {

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    private int field336 = 0;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    private int field331 = -1;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "Lifa;")
    private class450 field334 = new class450();

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "Z")
    public boolean field341 = false;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    private int field340;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "[Lhe;")
    private class391[] field335;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "[[[I")
    private int[][][] field337;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "Lde;")
    public static class558 field342 = new class558("WTWIP", "office", "_wip", 3);

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "Z")
    public static boolean field343 = false;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method220(int arg0, byte arg1) {
        if (arg1 != -91) {
            field342 = null;
        }
        field338++;
        if (this.field340 == this.field333) {
            this.field341 = this.field335[arg0] == null;
            this.field335[arg0] = class115.field1458;
            return this.field337[arg0];
        } else if (this.field333 == 1) {
            this.field341 = this.field331 != arg0;
            this.field331 = arg0;
            return this.field337[0];
        } else {
            class391 var3 = this.field335[arg0];
            if (var3 == null) {
                this.field341 = true;
                if (this.field336 < this.field333) {
                    var3 = new class391(arg0, this.field336);
                    this.field336++;
                } else {
                    class391 var4 = (class391) this.field334.method2734(arg1 ^ 0xFFFFFFAD);
                    var3 = new class391(arg0, var4.field5072);
                    this.field335[var4.field5074] = null;
                    var4.method2219(13630);
                }
                this.field335[arg0] = var3;
            } else {
                this.field341 = false;
            }
            this.field334.method2727(var3, -98);
            return this.field337[var3.field5072];
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
    public final void method221(boolean arg0) {
        field344++;
        for (int var2 = 0; var2 < this.field333; var2++) {
            this.field337[var2][0] = null;
            this.field337[var2][1] = null;
            this.field337[var2][2] = null;
            this.field337[var2] = null;
        }
        this.field337 = null;
        if (!arg0) {
            this.field334 = null;
        }
        this.field335 = null;
        this.field334.method2729(-48);
        this.field334 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method222(int arg0) {
        field339++;
        if (this.field340 != this.field333) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field333; var2++) {
            this.field335[var2] = class115.field1458;
        }
        return this.field337;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V")
    public static void method223(boolean arg0) {
        field342 = null;
        if (!arg0) {
            field342 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)V")
    public static final void method224(byte arg0, int arg1) {
        int var2 = -44 / ((-arg0 - 57) / 58);
        field330++;
        class115.field1456 = arg1;
        class778.field10744.method1690(0);
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(III)V")
    public class18(int arg0, int arg1, int arg2) {
        this.field333 = arg0;
        this.field340 = arg1;
        this.field335 = new class391[this.field340];
        this.field337 = new int[this.field333][3][arg2];
    }
}
