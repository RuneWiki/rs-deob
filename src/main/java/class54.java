import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class54 {

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    private int field851 = 0;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    private int field854 = -1;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Lea;")
    private class204 field856 = new class204();

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "Z")
    public boolean field863 = false;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    private int field846;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[Lcn;")
    private class267[] field849;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "[[I")
    private int[][] field855;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Z")
    public static boolean field843 = false;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[Lbl;")
    public static class312[] field848 = new class312[14];

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Lea;")
    public static class204 field852 = new class204();

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field859 = -1;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field860 = 0;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Ljava/lang/String;")
    public static String field861 = "Allocating memory";

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "F")
    public static float field862;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "[Lra;")
    public static class321[] field858;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[I", line = 17)
    public final int[] method394(int arg0, int arg1) {
        if (arg0 != 0) {
            return (int[]) null;
        }
        field853++;
        if (this.field846 == this.field845) {
            this.field863 = this.field849[arg1] == null;
            this.field849[arg1] = class203.field3192;
            return this.field855[arg1];
        } else if (this.field845 == 1) {
            this.field863 = this.field854 != arg1;
            this.field854 = arg1;
            return this.field855[0];
        } else {
            class267 var3 = this.field849[arg1];
            if (var3 == null) {
                this.field863 = true;
                if (this.field845 > this.field851) {
                    var3 = new class267(arg1, this.field851);
                    this.field851++;
                } else {
                    class267 var4 = (class267) this.field856.method1488(arg0 - 1);
                    var3 = new class267(arg1, var4.field4134);
                    this.field849[var4.field4138] = null;
                    var4.method1701(-123);
                }
                this.field849[arg1] = var3;
            } else {
                this.field863 = false;
            }
            this.field856.method1495(var3, -1);
            return this.field855[var3.field4134];
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 80)
    public static final void method395(int arg0) {
        field857++;
        if (class177.field2778 || class76.field1162 == 2) {
            return;
        }
        try {
            class49.method379(class114.field1866, (byte) 51, "tbrefresh");
        } catch (Throwable var2) {
        }
        if (arg0 > -77) {
            field843 = true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)[[I", line = 102)
    public final int[][] method396(int arg0) {
        field850++;
        if (arg0 != -14579) {
            field848 = (class312[]) null;
        }
        if (this.field846 != this.field845) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field845; var2++) {
            this.field849[var2] = class203.field3192;
        }
        return this.field855;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)I", line = 124)
    public static final int method397(byte arg0, int arg1) {
        field844++;
        if (arg0 != 18) {
            return 15;
        }
        class278 var2 = class94.method672(arg1, 0);
        int var3 = var2.field4295;
        int var4 = var2.field4299;
        int var5 = var2.field4294;
        int var6 = class61.field949[var5 - var4];
        return class278.field4304[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V", line = 151)
    public static void method398(int arg0) {
        field858 = null;
        field852 = null;
        if (arg0 == 0) {
            field861 = null;
            field848 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V", line = 165)
    public final void method399(boolean arg0) {
        if (arg0) {
            method400(-46, -46);
        }
        field842++;
        for (int var2 = 0; var2 < this.field845; var2++) {
            this.field855[var2] = null;
        }
        this.field849 = null;
        this.field855 = (int[][]) null;
        this.field856.method1489(200);
        this.field856 = null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(III)V", line = 233)
    public class54(int arg0, int arg1, int arg2) {
        this.field846 = arg1;
        this.field849 = new class267[this.field846];
        this.field845 = arg0;
        this.field855 = new int[this.field845][arg2];
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)I", line = 191)
    public static final int method400(int arg0, int arg1) {
        if (arg1 != 1023) {
            method397((byte) -97, -92);
        }
        field847++;
        return arg0 & 0x3FF;
    }
}
