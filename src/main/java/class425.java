import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class425 {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    private int field6056 = -1;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    private int field6062 = 0;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Ltm;")
    private class412 field6060 = new class412();

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "Z")
    public boolean field6067 = false;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    private int field6055;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    private int field6061;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "[Llb;")
    private class569[] field6059;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[[I")
    private int[][] field6058;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Loja;")
    public static class480 field6066;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static void method2601(byte arg0) {
        field6066 = null;
        int var1 = 108 % ((arg0 - 57) / 45);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)[[I")
    public final int[][] method2602(int arg0) {
        field6057++;
        if (this.field6061 != this.field6055) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field6061; var2++) {
            this.field6059[var2] = class208.field2769;
        }
        return this.field6058;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[I")
    public final int[] method2603(int arg0, int arg1) {
        if (arg1 != -13476) {
            return null;
        }
        field6065++;
        if (this.field6061 == this.field6055) {
            this.field6067 = this.field6059[arg0] == null;
            this.field6059[arg0] = class208.field2769;
            return this.field6058[arg0];
        } else if (this.field6061 == 1) {
            this.field6067 = this.field6056 != arg0;
            this.field6056 = arg0;
            return this.field6058[0];
        } else {
            class569 var3 = this.field6059[arg0];
            if (var3 == null) {
                this.field6067 = true;
                if (this.field6061 <= this.field6062) {
                    class569 var4 = (class569) this.field6060.method2541(-81);
                    var3 = new class569(arg0, var4.field7581);
                    this.field6059[var4.field7582] = null;
                    var4.method792((byte) -107);
                } else {
                    var3 = new class569(arg0, this.field6062);
                    this.field6062++;
                }
                this.field6059[arg0] = var3;
            } else {
                this.field6067 = false;
            }
            this.field6060.method2550(0, var3);
            return this.field6058[var3.field7581];
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
    public final void method2604(byte arg0) {
        for (int var2 = 0; var2 < this.field6061; var2++) {
            this.field6058[var2] = null;
        }
        field6064++;
        this.field6059 = null;
        if (arg0 < 48) {
            method2605(-37);
        }
        this.field6058 = null;
        this.field6060.method2549(-116);
        this.field6060 = null;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)Lwr;")
    public static final class485 method2605(int arg0) {
        field6063++;
        if (arg0 > -69) {
            field6066 = null;
        }
        return class375.field5414;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(III)V")
    public class425(int arg0, int arg1, int arg2) {
        this.field6055 = arg1;
        this.field6061 = arg0;
        this.field6059 = new class569[this.field6055];
        this.field6058 = new int[this.field6061][arg2];
    }
}
