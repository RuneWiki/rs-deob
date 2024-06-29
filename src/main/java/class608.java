import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class608 {

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public int field8755;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lge;")
    public static class608 field8756 = new class608(1);

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Lge;")
    public static class608 field8757 = new class608(2);

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Lge;")
    public static class608 field8758 = new class608(4);

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Lge;")
    public static class608 field8759 = new class608(1);

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Lge;")
    public static class608 field8760 = new class608(2);

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lge;")
    public static class608 field8761 = new class608(4);

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Lge;")
    public static class608 field8762 = new class608(2);

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "Lge;")
    public static class608 field8763 = new class608(4);

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field8764 = 0;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "[I")
    public static int[] field8765 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Z")
    public static boolean field8766 = false;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "F")
    public static float field8769;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "[Lsa;")
    public static class174[] field8767;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method3567(int arg0) {
        if (arg0 <= 40) {
            field8762 = null;
        }
        field8765 = null;
        field8758 = null;
        field8762 = null;
        field8760 = null;
        field8763 = null;
        field8761 = null;
        field8757 = null;
        field8767 = null;
        field8756 = null;
        field8759 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILqa;Lan;)V")
    public static final void method3568(int arg0, class207 arg1, class21 arg2) {
        field8754++;
        class38[] var3 = class38.method397(arg2, class80.field1296, 0);
        class628.field9192 = new class52[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class628.field9192[var4] = arg1.method1332(var3[var4], true);
        }
        class38[] var5 = class38.method397(arg2, class314.field4232, 0);
        class41.field805 = new class52[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class41.field805[var6] = arg1.method1332(var5[var6], true);
        }
        class38[] var7 = class38.method397(arg2, class590.field8433, 0);
        class233.field3285 = new class52[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class233.field3285[var8] = arg1.method1332(var7[var8], true);
        }
        class38[] var9 = class38.method397(arg2, class564.field7813, 0);
        class194.field2752 = new class52[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class194.field2752[var10] = arg1.method1332(var9[var10], true);
        }
        class38[] var11 = class38.method397(arg2, class529.field7408, 0);
        class69.field1171 = new class52[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class69.field1171[var12] = arg1.method1332(var11[var12], true);
        }
        class38[] var13 = class38.method397(arg2, class566.field7829, 0);
        class60.field1064 = new class52[var13.length];
        for (int var14 = arg0; var14 < var13.length; var14++) {
            class60.field1064[var14] = arg1.method1332(var13[var14], true);
        }
        class38[] var15 = class38.method397(arg2, class124.field2034, 0);
        class101.field1541 = new class52[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class101.field1541[var16] = arg1.method1332(var15[var16], true);
        }
        class38[] var17 = class38.method397(arg2, class5.field71, 0);
        class336.field4487 = new class52[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class336.field4487[var18] = arg1.method1332(var17[var18], true);
        }
        class38[] var19 = class38.method397(arg2, class318.field4316, 0);
        class228.field3257 = new class52[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class228.field3257[var20] = arg1.method1332(var19[var20], true);
        }
        class38[] var21 = class38.method397(arg2, class296.field4054, 0);
        class457.field6440 = new class52[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class457.field6440[var22] = arg1.method1332(var21[var22], true);
        }
        class38[] var23 = class38.method397(arg2, class194.field2743, 0);
        class341.field4594 = new class52[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class341.field4594[var24] = arg1.method1332(var23[var24], true);
        }
        class38[] var25 = class38.method397(arg2, class348.field4672, 0);
        class257.field3566 = new class52[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class257.field3566[var26] = arg1.method1332(var25[var26], true);
        }
        class22.field324 = arg1.method1332(class38.method399(arg2, class215.field3055, 0), true);
        class427.field6061 = arg1.method1332(class38.method399(arg2, class525.field7384, 0), true);
        class38[] var27 = class38.method397(arg2, class67.field1138, 0);
        class630.field9214 = new class52[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class630.field9214[var28] = arg1.method1332(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!ge", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8753++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
    private class608(int arg0) {
        this.field8755 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BILjava/io/File;)[B")
    public static final byte[] method3569(byte arg0, int arg1, File arg2) {
        field8752++;
        try {
            if (arg0 == -21) {
                byte[] var3 = new byte[arg1];
                class30.method316(var3, arg1, arg2, arg0 ^ 0x14);
                return var3;
            } else {
                return null;
            }
        } catch (IOException var4) {
            return null;
        }
    }
}
