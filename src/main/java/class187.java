import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class187 {

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lgg;")
    public class51 field3000 = new class51();

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3001 = new String[8];

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Lwf;")
    public static class250 field3005 = null;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Ljl;")
    public static class332 field3003 = new class332(64);

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Lgg;")
    private class51 field3009;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[[[B")
    public static byte[][][] field2999;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Lgg;", line = 5)
    public final class51 method1465(int arg0) {
        class51 var2 = this.field3009;
        field3006++;
        if (this.field3000 == var2) {
            this.field3009 = null;
            return null;
        } else if (arg0 == 0) {
            this.field3009 = var2.field807;
            return var2;
        } else {
            return (class51) null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lgg;I)V", line = 27)
    public final void method1466(class51 arg0, int arg1) {
        if (arg0.field804 != null) {
            arg0.method395(false);
        }
        arg0.field807 = this.field3000;
        arg0.field804 = this.field3000.field804;
        if (arg1 != 0) {
            method1471();
        }
        arg0.field804.field807 = arg0;
        field3008++;
        arg0.field807.field804 = arg0;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)Lgg;", line = 51)
    public final class51 method1467(int arg0) {
        class51 var2 = this.field3000.field807;
        if (arg0 != 0) {
            return (class51) null;
        }
        field3002++;
        if (this.field3000 == var2) {
            this.field3009 = null;
            return null;
        } else {
            this.field3009 = var2.field807;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V", line = 72)
    public final void method1468(boolean arg0) {
        field3004++;
        while (true) {
            class51 var2 = this.field3000.field807;
            if (this.field3000 == var2) {
                if (arg0) {
                    this.field3000 = (class51) null;
                }
                this.field3009 = null;
                return;
            }
            var2.method395(false);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 97)
    public static final void method1469(byte arg0) {
        field3007++;
        if (class124.field2122) {
            return;
        }
        if (class336.field5314) {
            class261.field4396 = (float) ((int) class261.field4396 + 191 & 0xFFFFFF80);
        } else {
            class259.field4357 += (24.0F - class259.field4357) / 2.0F;
        }
        if (arg0 < 104) {
            field3005 = (class250) null;
        }
        class124.field2122 = true;
        class175.field2807 = true;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V", line = 131)
    public static void method1470(int arg0) {
        field3005 = null;
        field3003 = null;
        field2999 = (byte[][][]) null;
        field3001 = null;
        int var1 = -46 / ((22 - arg0) / 36);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()V", line = 149)
    public static final void method1471() {
        if (class159.field2532 != null) {
            for (int var0 = 0; var0 < class159.field2532.length; var0++) {
                for (int var1 = 0; var1 < class273.field4526; var1++) {
                    for (int var2 = 0; var2 < class162.field2574; var2++) {
                        class159.field2532[var0][var1][var2] = null;
                    }
                }
            }
        }
        class307.field4899 = (class299[][]) null;
        if (class51.field799 != null) {
            for (int var3 = 0; var3 < class51.field799.length; var3++) {
                for (int var4 = 0; var4 < class273.field4526; var4++) {
                    for (int var5 = 0; var5 < class162.field2574; var5++) {
                        class51.field799[var3][var4][var5] = null;
                    }
                }
            }
        }
        class90.field1545 = (class299[][]) null;
        class103.field1674 = 0;
        if (class44.field687 != null) {
            for (int var6 = 0; var6 < class103.field1674; var6++) {
                class44.field687[var6] = null;
            }
        }
        if (class335.field5299 != null) {
            for (int var7 = 0; var7 < class301.field4847; var7++) {
                class335.field5299[var7] = null;
            }
            class301.field4847 = 0;
        }
        if (class270.field4501 != null) {
            for (int var8 = 0; var8 < class270.field4501.length; var8++) {
                class270.field4501[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 255)
    public class187() {
        this.field3000.field807 = this.field3000;
        this.field3000.field804 = this.field3000;
    }
}
