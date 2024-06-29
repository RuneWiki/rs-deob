import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class20 {

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    private int field235 = 0;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    private int field243 = -1;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lea;")
    private class243 field232 = new class243();

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Z")
    public boolean field244 = false;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "[[I")
    private int[][] field233;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "[Lrj;")
    private class247[] field240;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lqj;")
    public static class196 field234 = class80.method502("::errortest", -48);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Ljava/lang/Object;")
    public static Object field230 = new Object();

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "[I")
    public static int[] field231;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)[Lqh;")
    public static final class68[] method106(int arg0) {
        field242++;
        class68[] var1 = new class68[class76.field1102];
        for (int var2 = 0; var2 < class76.field1102; var2++) {
            var1[var2] = new class68(class149.field2391, class92.field1347, class234.field4169[var2], class240.field4261[var2], class77.field1126[var2], class31.field392[var2], class203.field3645[var2], class84.field1237);
        }
        int var3 = -99 % ((arg0 - 25) / 55);
        class168.method1099(false);
        return var1;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public static void method107(int arg0) {
        field230 = null;
        field234 = null;
        field231 = null;
        if (arg0 != 0) {
            field230 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public final void method108(int arg0) {
        for (int var2 = 0; var2 < this.field239; var2++) {
            this.field233[var2] = null;
        }
        field229++;
        this.field240 = null;
        this.field233 = null;
        this.field232.method1653(-60);
        this.field232 = null;
        if (arg0 > -30) {
            method109();
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
    public static final void method109() {
        for (int var0 = 0; var0 < class39.field442; var0++) {
            for (int var5 = 0; var5 < class23.field293; var5++) {
                for (int var6 = 0; var6 < class110.field1566; var6++) {
                    class249.field4410[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class61.field814; var1++) {
            for (int var4 = 0; var4 < class61.field813[var1]; var4++) {
                class61.field811[var1][var4] = null;
            }
            class61.field813[var1] = 0;
        }
        for (int var2 = 0; var2 < class150.field2403; var2++) {
            class229.field4085[var2] = null;
        }
        class150.field2403 = 0;
        for (int var3 = 0; var3 < class211.field3792.length; var3++) {
            class211.field3792[var3] = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[I")
    public final int[] method110(int arg0, int arg1) {
        field238++;
        int var3 = -11 % ((arg1 + 40) / 56);
        if (this.field239 == this.field236) {
            this.field244 = this.field240[arg0] == null;
            this.field240[arg0] = class198.field3517;
            return this.field233[arg0];
        } else if (this.field239 == 1) {
            this.field244 = this.field243 != arg0;
            this.field243 = arg0;
            return this.field233[0];
        } else {
            class247 var4 = this.field240[arg0];
            if (var4 == null) {
                this.field244 = true;
                if (this.field239 <= this.field235) {
                    class247 var5 = (class247) this.field232.method1659((byte) 70);
                    var4 = new class247(arg0, var5.field4395);
                    this.field240[var5.field4389] = null;
                    var5.method797((byte) 104);
                } else {
                    var4 = new class247(arg0, this.field235);
                    this.field235++;
                }
                this.field240[arg0] = var4;
            } else {
                this.field244 = false;
            }
            this.field232.method1663((byte) -90, var4);
            return this.field233[var4.field4395];
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)[[I")
    public final int[][] method111(byte arg0) {
        field237++;
        if (this.field239 != this.field236) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 80) {
            method106(44);
        }
        for (int var2 = 0; var2 < this.field239; var2++) {
            this.field240[var2] = class198.field3517;
        }
        return this.field233;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(III)V")
    public class20(int arg0, int arg1, int arg2) {
        this.field236 = arg1;
        this.field239 = arg0;
        this.field233 = new int[this.field239][arg2];
        this.field240 = new class247[this.field236];
    }
}
