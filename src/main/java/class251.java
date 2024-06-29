import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class251 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lh;")
    private class571 field3478 = new class571(64);

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Lh;")
    public class571 field3486 = new class571(30);

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lan;")
    private class21 field3483;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Lan;")
    public class21 field3479;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "[Lit;")
    public static class555[] field3485 = new class555[5];

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Lgm;")
    public static class105 field3489;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public int field3487;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public final void method1562(int arg0) {
        int var2 = 7 % ((arg0 - 81) / 37);
        field3477++;
        class571 var3 = this.field3478;
        synchronized (this.field3478) {
            this.field3478.method3248(0);
        }
        class571 var4 = this.field3486;
        synchronized (this.field3486) {
            this.field3486.method3248(0);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static void method1563(int arg0) {
        field3489 = null;
        field3485 = null;
        if (arg0 <= 5) {
            field3485 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lce;")
    public final class258 method1564(int arg0, int arg1) {
        field3480++;
        class571 var3 = this.field3478;
        class258 var4;
        synchronized (this.field3478) {
            var4 = (class258) this.field3478.method3252((long) arg0, (byte) 79);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field3483;
        byte[] var6;
        synchronized (this.field3483) {
            var6 = this.field3483.method240(class358.method2142((byte) 84, arg0), class472.method2745(arg0, true), (byte) -124);
        }
        class258 var7 = new class258();
        var7.field3591 = this;
        var7.field3601 = arg0;
        if (arg1 != 5) {
            this.field3487 = 62;
        }
        if (var6 != null) {
            var7.method1655(new class11(var6), 974);
        }
        class571 var8 = this.field3478;
        synchronized (this.field3478) {
            this.field3478.method3243(var7, (long) arg0, 78);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1565(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3484++;
        int var8 = class646.method3722(arg5, class264.field3687, class591.field8435, false);
        int var9 = class646.method3722(arg3, class264.field3687, class591.field8435, false);
        int var10 = class646.method3722(arg4, class326.field4387, class596.field8621, false);
        int var11 = class646.method3722(arg7, class326.field4387, class596.field8621, false);
        int var12 = class646.method3722(arg5 + arg1, class264.field3687, class591.field8435, false);
        int var13 = class646.method3722(arg3 - arg1, class264.field3687, class591.field8435, false);
        for (int var14 = var8; var14 < var12; var14++) {
            class266.method1742(26844, class182.field2580[var14], var11, arg6, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class266.method1742(26844, class182.field2580[var15], var11, arg6, var10);
        }
        int var16 = class646.method3722(arg1 + arg4, class326.field4387, class596.field8621, false);
        int var17 = class646.method3722(arg7 - arg1, class326.field4387, class596.field8621, false);
        int var18 = -57 / ((arg0 + 60) / 46);
        for (int var19 = var12; var19 <= var13; var19++) {
            int[] var20 = class182.field2580[var19];
            class266.method1742(26844, var20, var16, arg6, var10);
            class266.method1742(26844, var20, var17, arg2, var16);
            class266.method1742(26844, var20, var11, arg6, var17);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public final void method1566(byte arg0) {
        class571 var2 = this.field3478;
        synchronized (this.field3478) {
            this.field3478.method3246(false);
        }
        field3482++;
        if (arg0 != -10) {
            this.field3479 = null;
        }
        class571 var3 = this.field3486;
        synchronized (this.field3486) {
            this.field3486.method3246(false);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V")
    public final void method1567(int arg0, int arg1) {
        class571 var3 = this.field3478;
        synchronized (this.field3478) {
            this.field3478.method3253(arg0, -120);
        }
        if (arg1 != 30) {
            this.field3487 = 118;
        }
        field3488++;
        class571 var4 = this.field3486;
        synchronized (this.field3486) {
            this.field3486.method3253(arg0, arg1 - 158);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)V")
    public final void method1568(boolean arg0, int arg1) {
        field3481++;
        if (arg0) {
            field3485 = null;
        }
        this.field3487 = arg1;
        class571 var3 = this.field3486;
        synchronized (this.field3486) {
            this.field3486.method3246(arg0);
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lhu;ILan;Lan;)V")
    public class251(class111 arg0, int arg1, class21 arg2, class21 arg3) {
        this.field3483 = arg2;
        this.field3479 = arg3;
        int var5 = this.field3483.method239(-70) - 1;
        this.field3483.method231(var5, -121);
    }

    static {
        for (int var0 = 0; var0 < field3485.length; var0++) {
            field3485[var0] = new class555();
        }
        field3489 = new class105();
    }
}
