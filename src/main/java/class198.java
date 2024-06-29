import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class198 {

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    private int field3106 = -1;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    private int field3105 = 0;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Lgb;")
    private class149 field3104 = new class149();

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Z")
    public boolean field3118 = false;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    private int field3110;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "[Lmg;")
    private class272[] field3109;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    private int field3115;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "[[I")
    private int[][] field3116;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Z")
    public static boolean field3107 = false;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "[I")
    public static int[] field3113 = new int[32768];

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public final void method1323(int arg0) {
        field3117++;
        for (int var2 = 0; var2 < this.field3115; var2++) {
            this.field3116[var2] = null;
        }
        this.field3109 = null;
        this.field3116 = null;
        int var3 = -103 % ((56 - arg0) / 49);
        this.field3104.method1016(false);
        this.field3104 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)Lkc;")
    public static final class286 method1324(byte arg0, int arg1) {
        int var2 = 41 % ((13 - arg0) / 62);
        class286 var3 = (class286) class64.field1019.method1780((long) arg1, (byte) -118);
        field3108++;
        if (var3 != null) {
            return var3;
        }
        class286 var4 = class297.method1993(false, class51.field808, 115, arg1, class221.field3459);
        if (var4 != null) {
            class64.field1019.method1784(var4, false, (long) arg1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)[[I")
    public final int[][] method1325(int arg0) {
        field3114++;
        if (this.field3115 != this.field3110) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field3115; var2++) {
            this.field3109[var2] = class283.field4469;
        }
        return this.field3116;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
    public static void method1326(boolean arg0) {
        if (arg0) {
            field3107 = true;
        }
        field3113 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Luf;Luf;Luf;I)V")
    public static final void method1327(class176 arg0, class176 arg1, class176 arg2, int arg3) {
        class221.field3459 = arg0;
        if (arg3 != 0) {
            method1326(true);
        }
        field3112++;
        class51.field808 = arg2;
        class251.field3851 = arg1;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(BI)[I")
    public final int[] method1328(byte arg0, int arg1) {
        field3111++;
        if (arg0 != -108) {
            field3107 = true;
        }
        if (this.field3115 == this.field3110) {
            this.field3118 = this.field3109[arg1] == null;
            this.field3109[arg1] = class283.field4469;
            return this.field3116[arg1];
        } else if (this.field3115 == 1) {
            this.field3118 = this.field3106 != arg1;
            this.field3106 = arg1;
            return this.field3116[0];
        } else {
            class272 var3 = this.field3109[arg1];
            if (var3 == null) {
                this.field3118 = true;
                if (this.field3105 >= this.field3115) {
                    class272 var4 = (class272) this.field3104.method1012(-1);
                    var3 = new class272(arg1, var4.field4293);
                    this.field3109[var4.field4296] = null;
                    var4.method693(98);
                } else {
                    var3 = new class272(arg1, this.field3105);
                    this.field3105++;
                }
                this.field3109[arg1] = var3;
            } else {
                this.field3118 = false;
            }
            this.field3104.method1007((byte) 89, var3);
            return this.field3116[var3.field4293];
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(III)V")
    public class198(int arg0, int arg1, int arg2) {
        this.field3110 = arg1;
        this.field3109 = new class272[this.field3110];
        this.field3115 = arg0;
        this.field3116 = new int[this.field3115][arg2];
    }
}
