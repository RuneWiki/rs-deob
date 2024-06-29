import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class21 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    private int field375 = -1;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    private int field380 = 0;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Lwn;")
    private class30 field376 = new class30();

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Z")
    public boolean field388 = false;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "[[I")
    private int[][] field381;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "[Ljn;")
    private class133[] field386;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "S")
    public static short field382 = 256;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "[Lee;")
    public static class296[] field383 = new class296[29];

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field385 = 0;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)[[I", line = 10)
    public final int[][] method212(byte arg0) {
        if (arg0 != 90) {
            this.method215(15, -23);
        }
        field373++;
        if (this.field384 != this.field379) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field384; var2++) {
            this.field386[var2] = class328.field5136;
        }
        return this.field381;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V", line = 32)
    public final void method213(byte arg0) {
        field378++;
        if (arg0 <= 3) {
            method214((byte) 45, (class120) null, -89);
        }
        for (int var2 = 0; var2 < this.field384; var2++) {
            this.field381[var2] = null;
        }
        this.field386 = null;
        this.field381 = (int[][]) null;
        this.field376.method266(-20840);
        this.field376 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLpk;I)Lme;", line = 55)
    public static final class200 method214(byte arg0, class120 arg1, int arg2) {
        field387++;
        int var3 = 8 / ((65 - arg0) / 34);
        return class75.method592(arg1, -92, arg2) ? class183.method1330((byte) 19) : null;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(III)V", line = 192)
    public class21(int arg0, int arg1, int arg2) {
        this.field384 = arg0;
        this.field381 = new int[this.field384][arg2];
        this.field379 = arg1;
        this.field386 = new class133[this.field379];
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[I", line = 78)
    public final int[] method215(int arg0, int arg1) {
        field374++;
        if (arg1 != 19142) {
            return (int[]) null;
        } else if (this.field384 == this.field379) {
            this.field388 = this.field386[arg0] == null;
            this.field386[arg0] = class328.field5136;
            return this.field381[arg0];
        } else if (this.field384 == 1) {
            this.field388 = this.field375 != arg0;
            this.field375 = arg0;
            return this.field381[0];
        } else {
            class133 var3 = this.field386[arg0];
            if (var3 == null) {
                this.field388 = true;
                if (this.field380 >= this.field384) {
                    class133 var4 = (class133) this.field376.method269((byte) 42);
                    var3 = new class133(arg0, var4.field2111);
                    this.field386[var4.field2113] = null;
                    var4.method489(false);
                } else {
                    var3 = new class133(arg0, this.field380);
                    this.field380++;
                }
                this.field386[arg0] = var3;
            } else {
                this.field388 = false;
            }
            this.field376.method274(arg1 ^ 0x4AC7, var3);
            return this.field381[var3.field2111];
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lpk;B)V", line = 144)
    public static final void method216(class120 arg0, byte arg1) {
        class31.field489 = arg0;
        if (arg1 <= -102) {
            field377++;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V", line = 161)
    public static void method217(byte arg0) {
        if (arg0 == -1) {
            field383 = null;
        }
    }
}
