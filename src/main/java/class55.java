import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class55 {

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
    private int field674 = 0;

    @OriginalMember(owner = "client!aw", name = "o", descriptor = "I")
    private int field683 = -1;

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "Loe;")
    private class137 field672 = new class137();

    @OriginalMember(owner = "client!aw", name = "s", descriptor = "Z")
    public boolean field687 = false;

    @OriginalMember(owner = "client!aw", name = "m", descriptor = "I")
    private int field681;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
    private int field673;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "[Lro;")
    private class2[] field677;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "[[I")
    private int[][] field671;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "Lhn;")
    public static class509 field670 = new class509(92, 12);

    @OriginalMember(owner = "client!aw", name = "k", descriptor = "Lhn;")
    public static class509 field679 = new class509(48, 5);

    @OriginalMember(owner = "client!aw", name = "q", descriptor = "Z")
    public static boolean field685 = false;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!aw", name = "l", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!aw", name = "n", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!aw", name = "p", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!aw", name = "r", descriptor = "[I")
    public static int[] field686;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
    public final void method509(int arg0) {
        for (int var2 = 0; var2 < this.field681; var2++) {
            this.field671[var2] = null;
        }
        if (arg0 != -6730) {
            this.method509(29);
        }
        field680++;
        this.field677 = null;
        this.field671 = null;
        this.field672.method993(98);
        this.field672 = null;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Z)V")
    public static void method510(boolean arg0) {
        field686 = null;
        field679 = null;
        if (arg0) {
            field685 = true;
        }
        field670 = null;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)[[I")
    public final int[][] method511(int arg0) {
        field669++;
        if (this.field681 != this.field673) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field681; var2++) {
            this.field677[var2] = class19.field246;
        }
        return this.field671;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)[I")
    public final int[] method512(int arg0, int arg1) {
        field675++;
        if (arg1 != 0) {
            this.method511(-65);
        }
        if (this.field681 == this.field673) {
            this.field687 = this.field677[arg0] == null;
            this.field677[arg0] = class19.field246;
            return this.field671[arg0];
        } else if (this.field681 == 1) {
            this.field687 = this.field683 != arg0;
            this.field683 = arg0;
            return this.field671[0];
        } else {
            class2 var3 = this.field677[arg0];
            if (var3 == null) {
                this.field687 = true;
                if (this.field681 > this.field674) {
                    var3 = new class2(arg0, this.field674);
                    this.field674++;
                } else {
                    class2 var4 = (class2) this.field672.method1002((byte) 36);
                    var3 = new class2(arg0, var4.field10);
                    this.field677[var4.field14] = null;
                    var4.method2677(-22491);
                }
                this.field677[arg0] = var3;
            } else {
                this.field687 = false;
            }
            this.field672.method998(var3, 100);
            return this.field671[var3.field10];
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IZII)I")
    public static final int method513(int arg0, boolean arg1, int arg2, int arg3) {
        field676++;
        class240 var4 = class516.method3061((byte) -30, arg1, arg0);
        if (var4 == null) {
            return -1;
        } else {
            if (arg3 != -1) {
                method510(false);
            }
            return arg2 >= 0 && arg2 < var4.field3835.length ? var4.field3835[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(III)V")
    public class55(int arg0, int arg1, int arg2) {
        this.field681 = arg0;
        this.field673 = arg1;
        this.field677 = new class2[this.field673];
        this.field671 = new int[this.field681][arg2];
    }
}
