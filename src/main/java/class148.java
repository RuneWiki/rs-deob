import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class148 {

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    private int field2163 = 0;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
    private int field2162 = -1;

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "Lmr;")
    private class611 field2168 = new class611();

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "Z")
    public boolean field2170 = false;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    private int field2157;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
    private int field2165;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "[Laba;")
    private class651[] field2166;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "[[I")
    private int[][] field2160;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "Lgr;")
    public static class530 field2161 = new class530(0, 0);

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
    public final void method1038(int arg0) {
        for (int var2 = 0; var2 < this.field2165; var2++) {
            this.field2160[var2] = null;
        }
        field2169++;
        this.field2166 = null;
        this.field2160 = null;
        this.field2168.method3553(arg0);
        this.field2168 = null;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)V")
    public static final void method1039(int arg0, int arg1, int arg2) {
        if (class399.field5703 != arg0) {
            class604.field8580 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class604.field8580[var3] = (var3 << 12) / arg0;
            }
            class399.field5703 = arg0;
            class261.field3728 = arg0 * 32;
            class423.field6029 = arg0 - 1;
        }
        if (arg2 != -8540) {
            method1040(-118);
        }
        field2158++;
        if (class505.field7350 == arg1) {
            return;
        }
        if (class399.field5703 == arg1) {
            class19.field185 = class604.field8580;
        } else {
            class19.field185 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class19.field185[var4] = (var4 << 12) / arg1;
            }
        }
        class311.field4223 = arg1 - 1;
        class505.field7350 = arg1;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V")
    public static void method1040(int arg0) {
        field2161 = null;
        if (arg0 != -20123) {
            field2159 = -19;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)[[I")
    public final int[][] method1041(byte arg0) {
        field2164++;
        int var2 = -49 / ((5 - arg0) / 44);
        if (this.field2165 != this.field2157) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var3 = 0; var3 < this.field2165; var3++) {
            this.field2166[var3] = class357.field5265;
        }
        return this.field2160;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)[I")
    public final int[] method1042(int arg0, int arg1) {
        field2167++;
        if (arg0 != 0) {
            this.method1041((byte) 17);
        }
        if (this.field2165 == this.field2157) {
            this.field2170 = this.field2166[arg1] == null;
            this.field2166[arg1] = class357.field5265;
            return this.field2160[arg1];
        } else if (this.field2165 == 1) {
            this.field2170 = this.field2162 != arg1;
            this.field2162 = arg1;
            return this.field2160[0];
        } else {
            class651 var3 = this.field2166[arg1];
            if (var3 == null) {
                this.field2170 = true;
                if (this.field2163 >= this.field2165) {
                    class651 var4 = (class651) this.field2168.method3564((byte) -113);
                    var3 = new class651(arg1, var4.field9344);
                    this.field2166[var4.field9343] = null;
                    var4.method2656((byte) 125);
                } else {
                    var3 = new class651(arg1, this.field2163);
                    this.field2163++;
                }
                this.field2166[arg1] = var3;
            } else {
                this.field2170 = false;
            }
            this.field2168.method3558(0, var3);
            return this.field2160[var3.field9344];
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(III)V")
    public class148(int arg0, int arg1, int arg2) {
        this.field2157 = arg1;
        this.field2165 = arg0;
        this.field2166 = new class651[this.field2157];
        this.field2160 = new int[this.field2165][arg2];
    }
}
