import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class386 {

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    private int field5862 = 0;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    private int field5868 = -1;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Lps;")
    private class63 field5863 = new class63();

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Z")
    public boolean field5870 = false;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    private int field5865;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    private int field5864;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "[[[I")
    private int[][][] field5866;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[Lvi;")
    private class382[] field5859;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public final void method2412(byte arg0) {
        if (arg0 != -111) {
            this.method2414((byte) -32, 125);
        }
        field5869++;
        for (int var2 = 0; var2 < this.field5865; var2++) {
            this.field5866[var2][0] = null;
            this.field5866[var2][1] = null;
            this.field5866[var2][2] = null;
            this.field5866[var2] = null;
        }
        this.field5866 = null;
        this.field5859 = null;
        this.field5863.method450((byte) 73);
        this.field5863 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lee;IBI)V")
    public static final void method2413(class486 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 <= -77) {
            field5861++;
            class515.field7568[arg1][arg3] = arg0;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)[[I")
    public final int[][] method2414(byte arg0, int arg1) {
        field5867++;
        if (arg0 >= -76) {
            this.method2415(-42);
        }
        if (this.field5865 == this.field5864) {
            this.field5870 = this.field5859[arg1] == null;
            this.field5859[arg1] = class8.field166;
            return this.field5866[arg1];
        } else if (this.field5865 == 1) {
            this.field5870 = this.field5868 != arg1;
            this.field5868 = arg1;
            return this.field5866[0];
        } else {
            class382 var3 = this.field5859[arg1];
            if (var3 == null) {
                this.field5870 = true;
                if (this.field5862 >= this.field5865) {
                    class382 var4 = (class382) this.field5863.method457(-2);
                    var3 = new class382(arg1, var4.field5821);
                    this.field5859[var4.field5820] = null;
                    var4.method25(-13489);
                } else {
                    var3 = new class382(arg1, this.field5862);
                    this.field5862++;
                }
                this.field5859[arg1] = var3;
            } else {
                this.field5870 = false;
            }
            this.field5863.method448(112, var3);
            return this.field5866[var3.field5821];
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method2415(int arg0) {
        field5860++;
        if (this.field5865 != this.field5864) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 < 21) {
            this.method2414((byte) -91, 40);
        }
        for (int var2 = 0; var2 < this.field5865; var2++) {
            this.field5859[var2] = class8.field166;
        }
        return this.field5866;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(III)V")
    public class386(int arg0, int arg1, int arg2) {
        this.field5865 = arg0;
        this.field5864 = arg1;
        this.field5866 = new int[this.field5865][3][arg2];
        this.field5859 = new class382[this.field5864];
    }
}
