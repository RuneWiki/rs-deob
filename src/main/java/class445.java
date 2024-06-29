import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class445 {

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "Ldc;")
    private class5 field6487 = new class5(64);

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "Ldc;")
    private class5 field6496 = new class5(100);

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "Lhe;")
    private class239 field6491;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field6484 = 0;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "F")
    public static float field6494;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "Lhe;")
    public static class239 field6482;

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "Ljt;")
    public static class64 field6499;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "[[S")
    public static short[][] field6488;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public final void method2594(int arg0) {
        field6490++;
        class5 var2 = this.field6487;
        synchronized (this.field6487) {
            this.field6487.method35((byte) -1);
        }
        class5 var3 = this.field6496;
        synchronized (this.field6496) {
            this.field6496.method35((byte) -1);
            if (arg0 != 25865) {
                method2598((byte) 57);
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)Z")
    public static final boolean method2595(int arg0, int arg1) {
        if (arg1 != 12858) {
            method2599(null, -27, null);
        }
        field6493++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)V")
    public static void method2596(boolean arg0) {
        if (!arg0) {
            method2599(null, 2, null);
        }
        field6488 = null;
        field6482 = null;
        field6499 = null;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BI)V")
    public final void method2597(byte arg0, int arg1) {
        class5 var3 = this.field6487;
        synchronized (this.field6487) {
            if (arg0 >= -12) {
                this.field6487 = null;
            }
            this.field6487.method39(false, arg1);
        }
        field6485++;
        class5 var4 = this.field6496;
        synchronized (this.field6496) {
            this.field6496.method39(false, arg1);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
    public static final void method2598(byte arg0) {
        field6495++;
        if (arg0 != 35) {
            return;
        }
        if (class65.field973 <= 0) {
            class272.field3805 = "";
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class388.field5759.length; var2++) {
            if (class388.field5759[var2].startsWith("--> ")) {
                var1++;
                if (class65.field973 == var1) {
                    class272.field3805 = class388.field5759[var2].substring(4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/lang/Object;ILqn;)V")
    public static final void method2599(Object arg0, int arg1, class44 arg2) {
        field6498++;
        if (arg2.field656 == null) {
            return;
        }
        int var3 = 0;
        if (arg1 != -7105) {
            field6488 = null;
        }
        while (var3 < 50 && arg2.field656.peekEvent() != null) {
            class322.method1935(true, 1L);
            var3++;
        }
        if (arg0 != null) {
            arg2.field656.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIILso;)V")
    public static final void method2600(int arg0, int arg1, int arg2, class313 arg3) {
        if (arg3.field4215 == arg2 && arg2 != -1) {
            class168 var4 = class286.field4083.method2602(-24462, arg2);
            int var5 = var4.field2221;
            if (var5 == 1) {
                arg3.field4216 = 0;
                arg3.field4261 = 0;
                arg3.field4206 = arg0;
                arg3.field4198 = 0;
                arg3.field4221 = 1;
                class204.method1258(-1, arg3.field4216, arg3.field2959, class415.field6145 == arg3, var4, arg3.field2966, arg3.field2956);
            }
            if (var5 == 2) {
                arg3.field4198 = 0;
            }
        } else if (arg2 == -1 || arg3.field4215 == -1 || class286.field4083.method2602(-24462, arg2).field2217 >= class286.field4083.method2602(-24462, arg3.field4215).field2217) {
            arg3.field4261 = 0;
            arg3.field4216 = 0;
            arg3.field4215 = arg2;
            arg3.field4274 = arg3.field4277;
            arg3.field4198 = 0;
            arg3.field4206 = arg0;
            arg3.field4221 = 1;
            if (arg3.field4215 != -1) {
                class204.method1258(-1, arg3.field4216, arg3.field2959, class415.field6145 == arg3, class286.field4083.method2602(-24462, arg3.field4215), arg3.field2966, arg3.field2956);
            }
        }
        if (arg1 <= 9) {
            method2598((byte) -84);
        }
        field6489++;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "()V")
    public static final void method2601() {
        if (class363.field5460 != null) {
            for (int var0 = 0; var0 < class363.field5460.length; var0++) {
                for (int var1 = 0; var1 < class282.field4031; var1++) {
                    for (int var2 = 0; var2 < class98.field1339; var2++) {
                        if (class363.field5460[var0][var1][var2] != null) {
                            class363.field5460[var0][var1][var2].method2740(-106);
                        }
                        class363.field5460[var0][var1][var2] = null;
                    }
                }
            }
        }
        class363.field5460 = null;
        class459.field6685 = null;
        if (class239.field3347 != null) {
            for (int var3 = 0; var3 < class239.field3347.length; var3++) {
                for (int var4 = 0; var4 < class282.field4031; var4++) {
                    for (int var5 = 0; var5 < class98.field1339; var5++) {
                        if (class239.field3347[var3][var4][var5] != null) {
                            class239.field3347[var3][var4][var5].method2740(114);
                        }
                        class239.field3347[var3][var4][var5] = null;
                    }
                }
            }
        }
        class239.field3347 = null;
        class178.field2562 = null;
        class358.field5312 = null;
        class311.field4527 = null;
        class55.field847 = 0;
        if (class456.field6642 != null) {
            for (int var6 = 0; var6 < class55.field847; var6++) {
                class456.field6642[var6] = null;
            }
        }
        if (class451.field6573 != null) {
            for (int var7 = 0; var7 < class134.field1712; var7++) {
                class451.field6573[var7] = null;
            }
            class134.field1712 = 0;
        }
        if (class76.field1084 != null) {
            for (int var8 = 0; var8 < class387.field5731; var8++) {
                class76.field1084[var8] = null;
            }
            for (int var9 = 0; var9 < class399.field5881; var9++) {
                for (int var10 = 0; var10 < class282.field4031; var10++) {
                    for (int var11 = 0; var11 < class98.field1339; var11++) {
                        class310.field4512[var9][var10][var11] = 0L;
                    }
                }
            }
            class387.field5731 = 0;
        }
        class479.field6919 = null;
        class162.method1025(53);
        class253.field3653.method247(-14987);
        class502.field7676 = null;
        class285.field4073 = null;
        class256.field3674 = null;
        class248.field3564 = null;
        class145.field1887 = null;
        class473.field6834 = null;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)Ljl;")
    public final class168 method2602(int arg0, int arg1) {
        field6483++;
        class5 var3 = this.field6487;
        class168 var4;
        synchronized (this.field6487) {
            var4 = (class168) this.field6487.method40(arg0 + 24462, (long) arg1);
            if (arg0 != -24462) {
                field6499 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6491.method1470(arg0 ^ 0xFFFFA076, class176.method1104((byte) 15, arg1), class475.method2779(1594756519, arg1));
        class168 var6 = new class168();
        var6.field2213 = this;
        var6.field2202 = arg1;
        if (var5 != null) {
            var6.method1058((byte) 67, new class156(var5));
        }
        var6.method1057(false);
        class5 var7 = this.field6487;
        synchronized (this.field6487) {
            this.field6487.method36(-20960, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(II)Lkt;")
    public final class103 method2603(int arg0, int arg1) {
        field6486++;
        if (arg0 != -1281) {
            field6488 = null;
        }
        class5 var3 = this.field6496;
        class103 var4;
        synchronized (this.field6496) {
            var4 = (class103) this.field6496.method40(0, (long) arg1);
            if (var4 == null) {
                var4 = new class103(arg1);
                this.field6496.method36(arg0 - 19679, var4, (long) arg1);
            }
        }
        synchronized (var4) {
            return var4.method617((byte) -94) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lci;ILhe;Lhe;Lhe;)V")
    public class445(class298 arg0, int arg1, class239 arg2, class239 arg3, class239 arg4) {
        this.field6491 = arg2;
        if (this.field6491 != null) {
            int var6 = this.field6491.method1466(false) - 1;
            this.field6491.method1473(4309, var6);
        }
        class263.method1623((byte) -60, arg3, arg4);
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
    public final void method2604(int arg0) {
        field6497++;
        if (arg0 != 0) {
            return;
        }
        class5 var2 = this.field6487;
        synchronized (this.field6487) {
            this.field6487.method38((byte) -53);
        }
        class5 var3 = this.field6496;
        synchronized (this.field6496) {
            this.field6496.method38((byte) -51);
        }
    }
}
