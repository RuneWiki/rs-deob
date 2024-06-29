import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class53 {

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    private int field806 = -1;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    private int field807 = 0;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "Lft;")
    private class4 field809 = new class4();

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "Z")
    public boolean field810 = false;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    private int field805;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    private int field802;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "[[I")
    private int[][] field808;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "[Lte;")
    private class419[] field800;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "Lsk;")
    public static class423 field799 = new class423("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V")
    public static void method369(boolean arg0) {
        field799 = null;
        if (!arg0) {
            field799 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public final void method370(int arg0) {
        for (int var2 = 0; var2 < this.field802; var2++) {
            this.field808[var2] = null;
        }
        field803++;
        if (arg0 <= -38) {
            this.field808 = null;
            this.field800 = null;
            this.field809.method13(false);
            this.field809 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)[[I")
    public final int[][] method371(int arg0) {
        field811++;
        if (this.field805 != this.field802) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field802; var2++) {
            this.field800[var2] = class175.field2746;
        }
        return this.field808;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IB)[I")
    public final int[] method372(int arg0, byte arg1) {
        int var3 = -41 % ((arg1 + 71) / 42);
        field801++;
        if (this.field805 == this.field802) {
            this.field810 = this.field800[arg0] == null;
            this.field800[arg0] = class175.field2746;
            return this.field808[arg0];
        } else if (this.field802 == 1) {
            this.field810 = this.field806 != arg0;
            this.field806 = arg0;
            return this.field808[0];
        } else {
            class419 var4 = this.field800[arg0];
            if (var4 == null) {
                this.field810 = true;
                if (this.field802 > this.field807) {
                    var4 = new class419(arg0, this.field807);
                    this.field807++;
                } else {
                    class419 var5 = (class419) this.field809.method9((byte) -97);
                    var4 = new class419(arg0, var5.field6033);
                    this.field800[var5.field6032] = null;
                    var5.method1121(false);
                }
                this.field800[arg0] = var4;
            } else {
                this.field810 = false;
            }
            this.field809.method11(-56, var4);
            return this.field808[var4.field6033];
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(III)V")
    public class53(int arg0, int arg1, int arg2) {
        this.field805 = arg1;
        this.field802 = arg0;
        this.field808 = new int[this.field802][arg2];
        this.field800 = new class419[this.field805];
    }
}
