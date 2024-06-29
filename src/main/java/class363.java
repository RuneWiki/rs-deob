import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class363 {

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "I")
    private int field5151 = -1;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "I")
    private int field5150 = 0;

    @OriginalMember(owner = "client!mga", name = "k", descriptor = "Lqia;")
    private class547 field5157 = new class547();

    @OriginalMember(owner = "client!mga", name = "s", descriptor = "Z")
    public boolean field5165 = false;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
    private int field5147;

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "I")
    private int field5152;

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "[Lqo;")
    private class201[] field5148;

    @OriginalMember(owner = "client!mga", name = "o", descriptor = "[[[I")
    private int[][][] field5161;

    @OriginalMember(owner = "client!mga", name = "r", descriptor = "I")
    public static int field5164 = 0;

    @OriginalMember(owner = "client!mga", name = "n", descriptor = "[I")
    public static int[] field5160 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!mga", name = "j", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!mga", name = "l", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!mga", name = "m", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!mga", name = "p", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!mga", name = "q", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)V", line = 7)
    public static final void method2240(byte arg0) {
        if (arg0 != 49) {
            return;
        }
        field5149++;
        if (!class550.method3133(126)) {
            return;
        }
        if (class48.field701 == null) {
            class470.method2769(-2);
        }
        class418.field5954 = 0;
        class423.field6011 = true;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(II)[[I", line = 28)
    public final int[][] method2241(int arg0, int arg1) {
        if (arg0 != -1) {
            return null;
        }
        field5162++;
        if (this.field5152 == this.field5147) {
            this.field5165 = this.field5148[arg1] == null;
            this.field5148[arg1] = class595.field8263;
            return this.field5161[arg1];
        } else if (this.field5152 == 1) {
            this.field5165 = this.field5151 != arg1;
            this.field5151 = arg1;
            return this.field5161[0];
        } else {
            class201 var3 = this.field5148[arg1];
            if (var3 == null) {
                this.field5165 = true;
                if (this.field5152 <= this.field5150) {
                    class201 var4 = (class201) this.field5157.method3119(true);
                    var3 = new class201(arg1, var4.field2568);
                    this.field5148[var4.field2566] = null;
                    var4.method3426((byte) -89);
                } else {
                    var3 = new class201(arg1, this.field5150);
                    this.field5150++;
                }
                this.field5148[arg1] = var3;
            } else {
                this.field5165 = false;
            }
            this.field5157.method3109(var3, 116);
            return this.field5161[var3.field2568];
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(III[B)[B", line = 97)
    public static final byte[] method2242(int arg0, int arg1, int arg2, byte[] arg3) {
        field5159++;
        byte[] var4 = new byte[arg1];
        class617.method3389(arg3, arg2, var4, arg0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V", line = 108)
    public static void method2243(int arg0) {
        field5160 = null;
        if (arg0 <= 83) {
            method2242(66, 54, 2, null);
        }
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(III)V", line = 214)
    public class363(int arg0, int arg1, int arg2) {
        this.field5147 = arg1;
        this.field5152 = arg0;
        this.field5148 = new class201[this.field5147];
        this.field5161 = new int[this.field5152][3][arg2];
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)[[[I", line = 125)
    public final int[][][] method2244(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field5156++;
        if (this.field5152 != this.field5147) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field5152; var2++) {
            this.field5148[var2] = class595.field8263;
        }
        return this.field5161;
    }

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)V", line = 148)
    public final void method2245(int arg0) {
        field5155++;
        if (arg0 >= -115) {
            field5158 = 48;
        }
        for (int var2 = 0; var2 < this.field5152; var2++) {
            this.field5161[var2][0] = null;
            this.field5161[var2][1] = null;
            this.field5161[var2][2] = null;
            this.field5161[var2] = null;
        }
        this.field5148 = null;
        this.field5161 = null;
        this.field5157.method3114(true);
        this.field5157 = null;
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(B)I", line = 188)
    public static final int method2246(byte arg0) {
        if (arg0 != 70) {
            return 96;
        }
        field5154++;
        class114 var1 = class124.field1474;
        synchronized (class124.field1474) {
            return class124.field1474.method770(0);
        }
    }
}
