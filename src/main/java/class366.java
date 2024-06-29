import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public abstract class class366 {

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "Lqg;")
    public class321 field5494;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "[I")
    public static int[] field5496 = new int[2];

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "Lvp;")
    public static class123 field5497 = new class123(43, 3);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "[I")
    public static int[] field5498;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lti;B)V")
    public static final void method2356(class303 arg0, byte arg1) {
        field5491++;
        if (arg1 != -81) {
            field5490 = -104;
        }
        int var2 = arg0.method1891(false);
        class108.field1680 = new class159[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class108.field1680[var3] = new class159();
            class108.field1680[var3].field2397 = arg0.method1891(false);
            class108.field1680[var3].field2393 = arg0.method1862((byte) -124);
        }
        class57.field827 = arg0.method1891(false);
        class244.field3529 = arg0.method1891(false);
        class14.field240 = arg0.method1891(false);
        class403.field5924 = new class507[class244.field3529 - (class57.field827 - 1)];
        for (int var4 = 0; var4 < class14.field240; var4++) {
            int var5 = arg0.method1891(false);
            class507 var6 = class403.field5924[var5] = new class507();
            var6.field7823 = arg0.method1918((byte) 105);
            var6.field7824 = arg0.method1870(-1945262512);
            var6.field7415 = class57.field827 + var5;
            var6.field7420 = arg0.method1862((byte) -119);
            var6.field7416 = arg0.method1862((byte) -128);
        }
        class494.field7202 = arg0.method1870(arg1 ^ 0x73F259FF);
        class324.field4977 = true;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIB)V")
    public abstract void method8(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public static void method2357(byte arg0) {
        field5497 = null;
        int var1 = 12 / ((-arg0 - 50) / 42);
        field5496 = null;
        field5498 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)Z")
    public abstract boolean method9(int arg0);

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
    public static final void method2358(int arg0) {
        class65.field1143 = null;
        if (arg0 <= 43) {
            field5498 = null;
        }
        class111.field1759 = null;
        field5495++;
        class55.field810 = null;
        class31.field501 = null;
        class240.field3496 = false;
        class508.field7424 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZZ)V")
    public abstract void method7(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lqg;)V")
    public class366(class321 arg0) {
        this.field5494 = arg0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILgo;B)V")
    public abstract void method6(int arg0, class440 arg1, byte arg2);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[JB[II)V")
    public static final void method2359(int arg0, long[] arg1, byte arg2, int[] arg3, int arg4) {
        if (arg2 != -122) {
            return;
        }
        field5492++;
        if (arg0 <= arg4) {
            return;
        }
        int var5 = (arg0 + arg4) / 2;
        int var6 = arg4;
        long var7 = arg1[var5];
        arg1[var5] = arg1[arg0];
        arg1[arg0] = var7;
        int var9 = arg3[var5];
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var9;
        int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
        for (int var11 = arg4; var11 < arg0; var11++) {
            if (((long) (var10 & var11) + var7) > arg1[var11]) {
                long var12 = arg1[var11];
                arg1[var11] = arg1[var6];
                arg1[var6] = var12;
                int var14 = arg3[var11];
                arg3[var11] = arg3[var6];
                arg3[var6++] = var14;
            }
        }
        arg1[arg0] = arg1[var6];
        arg1[var6] = var7;
        arg3[arg0] = arg3[var6];
        arg3[var6] = var9;
        method2359(var6 - 1, arg1, (byte) -122, arg3, arg4);
        method2359(arg0, arg1, (byte) -122, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)V")
    public abstract void method5(boolean arg0, int arg1);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
    public static final void method2360(boolean arg0) {
        field5493++;
        if (class503.field7375) {
            return;
        }
        class79.method640(class73.field1223, 118);
        if (class74.field1242 != null) {
            class79.method640(class74.field1242, -3);
        }
        class503.field7375 = arg0;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V")
    public abstract void method1(int arg0);
}
