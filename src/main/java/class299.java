import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class299 extends class128 {

    @OriginalMember(owner = "client!j", name = "M", descriptor = "Z")
    public static boolean field4665 = false;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "Lan;")
    public static class337 field4667 = new class337();

    @OriginalMember(owner = "client!j", name = "H", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "Lqd;")
    public static class50 field4664;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "Ljava/awt/Font;")
    public static Font field4669;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "[[S")
    public static short[][] field4668;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lcc;I)Ljava/lang/String;", line = 6)
    public static final String method2112(class263 arg0, int arg1) {
        field4661++;
        if (client.method1952(arg0).method1123(37) == 0) {
            return null;
        } else if (arg0.field4029 == null || arg0.field4029.trim().length() == 0) {
            return class309.field4772 ? "Hidden-use" : null;
        } else {
            if (arg1 != 7625) {
                field4667 = (class337) null;
            }
            return arg0.field4029;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V", line = 35)
    public static void method2113(byte arg0) {
        field4667 = null;
        field4668 = (short[][]) null;
        field4664 = null;
        if (arg0 != 46) {
            method2113((byte) 64);
        }
        field4669 = null;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 47)
    public class299() {
        super(1, false);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lp;II)V", line = 51)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg2 > -85) {
            field4669 = (Font) null;
        }
        if (arg1 == 0) {
            this.field1753 = arg0.method661(-1) == 1;
        }
        field4666++;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(BI)[I", line = 68)
    public final int[] method126(byte arg0, int arg1) {
        int[] var3 = this.field1748.method902(arg1, true);
        field4663++;
        if (this.field1748.field1878) {
            int[] var4 = this.method851((byte) -56, 0, arg1);
            for (int var5 = 0; var5 < class10.field141; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return arg0 < 100 ? (int[]) null : var3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[[I", line = 106)
    public final int[][] method102(int arg0, int arg1) {
        int[][] var3 = this.field1755.method875(111, arg0);
        if (arg1 != 5110) {
            field4665 = true;
        }
        field4662++;
        if (this.field1755.field1815) {
            int[][] var4 = this.method855(-3102, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class10.field141; var11++) {
                var10[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var7[var11];
                var8[var11] = 4096 - var6[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()V", line = 149)
    public static final void method2114() {
        if (class248.field3764 != null) {
            for (int var0 = 0; var0 < class248.field3764.length; var0++) {
                for (int var1 = 0; var1 < class62.field788; var1++) {
                    for (int var2 = 0; var2 < class326.field4993; var2++) {
                        class248.field3764[var0][var1][var2] = null;
                    }
                }
            }
        }
        class281.field4365 = (class245[][]) null;
        if (class150.field2081 != null) {
            for (int var3 = 0; var3 < class150.field2081.length; var3++) {
                for (int var4 = 0; var4 < class62.field788; var4++) {
                    for (int var5 = 0; var5 < class326.field4993; var5++) {
                        class150.field2081[var3][var4][var5] = null;
                    }
                }
            }
        }
        class58.field703 = (class245[][]) null;
        class31.field390 = 0;
        if (class287.field4507 != null) {
            for (int var6 = 0; var6 < class31.field390; var6++) {
                class287.field4507[var6] = null;
            }
        }
        if (class176.field2563 != null) {
            for (int var7 = 0; var7 < class318.field4894; var7++) {
                class176.field2563[var7] = null;
            }
            class318.field4894 = 0;
        }
        if (class57.field690 != null) {
            for (int var8 = 0; var8 < class57.field690.length; var8++) {
                class57.field690[var8] = null;
            }
        }
    }
}
