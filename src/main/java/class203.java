import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class203 {

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    private int field2429 = 0;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    private int field2434 = -1;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "Lifa;")
    private class450 field2436 = new class450();

    @OriginalMember(owner = "client!op", name = "n", descriptor = "Z")
    public boolean field2441 = false;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    private int field2431;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    private int field2437;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "[[I")
    private int[][] field2432;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "[Lhga;")
    private class186[] field2433;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "Lnh;")
    public static class778 field2438;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)[[I", line = 4)
    public final int[][] method1304(byte arg0) {
        field2435++;
        if (this.field2437 != this.field2431) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field2437; var2++) {
            this.field2433[var2] = class321.field3976;
        }
        int var3 = 119 % ((36 - arg0) / 56);
        return this.field2432;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)V", line = 28)
    public static void method1305(boolean arg0) {
        if (arg0) {
            field2438 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)Z", line = 38)
    public static final boolean method1306(int arg0, int arg1) {
        field2440++;
        if (arg0 != 25339) {
            method1306(-38, -57);
        }
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(Z)V", line = 49)
    public final void method1307(boolean arg0) {
        if (arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field2437; var2++) {
            this.field2432[var2] = null;
        }
        field2439++;
        this.field2433 = null;
        this.field2432 = null;
        this.field2436.method2729(-48);
        this.field2436 = null;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)[I", line = 70)
    public final int[] method1308(boolean arg0, int arg1) {
        if (arg0) {
            this.field2429 = 73;
        }
        field2430++;
        if (this.field2437 == this.field2431) {
            this.field2441 = this.field2433[arg1] == null;
            this.field2433[arg1] = class321.field3976;
            return this.field2432[arg1];
        } else if (this.field2437 == 1) {
            this.field2441 = this.field2434 != arg1;
            this.field2434 = arg1;
            return this.field2432[0];
        } else {
            class186 var3 = this.field2433[arg1];
            if (var3 == null) {
                this.field2441 = true;
                if (this.field2437 > this.field2429) {
                    var3 = new class186(arg1, this.field2429);
                    this.field2429++;
                } else {
                    class186 var4 = (class186) this.field2436.method2734(8);
                    var3 = new class186(arg1, var4.field2248);
                    this.field2433[var4.field2251] = null;
                    var4.method2219(13630);
                }
                this.field2433[arg1] = var3;
            } else {
                this.field2441 = false;
            }
            this.field2436.method2727(var3, -98);
            return this.field2432[var3.field2248];
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(III)V", line = 161)
    public class203(int arg0, int arg1, int arg2) {
        this.field2431 = arg1;
        this.field2437 = arg0;
        this.field2432 = new int[this.field2437][arg2];
        this.field2433 = new class186[this.field2431];
    }
}
