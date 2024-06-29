import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class328 extends class354 {

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    public static int field4538 = 0;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "Z")
    public static boolean field4537 = true;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "Lbj;")
    public static class131 field4540 = new class131(64);

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "[I")
    public static int[] field4545 = new int[256];

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!nl", name = "U", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!nl", name = "V", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!nl", name = "W", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!nl", name = "S", descriptor = "Lnq;")
    public static class268 field4544;

    @OriginalMember(owner = "client!nl", name = "Y", descriptor = "Lnq;")
    public static class268 field4550;

    @OriginalMember(owner = "client!nl", name = "X", descriptor = "[[[Ljd;")
    public static class125[][][] field4549;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)V", line = 6)
    public static final void method2112(int arg0, int arg1, int arg2, int arg3) {
        field4543++;
        if (field4549 == null) {
            return;
        }
        long var4 = (long) (arg2 << 14 | arg1 << 28 | arg3);
        class107 var6 = (class107) class367.field5182.method886(var4, 25651);
        if (var6 == null) {
            class272.method1778(arg1, arg3, arg2);
            return;
        }
        if (arg0 != -1) {
            field4538 = -40;
        }
        class388 var7 = (class388) var6.field1478.method646(arg0 ^ 0xFFFFFFCF);
        if (var7 == null) {
            class272.method1778(arg1, arg3, arg2);
            return;
        }
        class195 var8 = (class195) class272.method1778(arg1, arg3, arg2);
        if (var8 == null) {
            var8 = new class195();
        } else {
            var8.field2690 = var8.field2686 = -1;
        }
        var8.field2678 = var7.field5569;
        var8.field2693 = var7.field5574;
        label48: while (true) {
            class388 var9 = (class388) var6.field1478.method641(false);
            if (var9 == null) {
                break;
            }
            if (var8.field2678 != var9.field5569) {
                var8.field2689 = var9.field5574;
                var8.field2690 = var9.field5569;
                while (true) {
                    class388 var10 = (class388) var6.field1478.method641(false);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field2678 != var10.field5569 && var8.field2690 != var10.field5569) {
                        var8.field2686 = var10.field5569;
                        var8.field2683 = var10.field5574;
                    }
                }
            }
        }
        int var11 = class285.method1858((arg3 << 7) + 64, arg1, (arg2 << 7) + 64, -116);
        class90.method638(arg1, arg3, arg2, var11, var8);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)Lbe;", line = 84)
    public static final class25 method2113(int arg0, byte arg1) {
        field4539++;
        class25 var2 = (class25) class286.field4032.method904(false, (long) arg0);
        if (arg1 != -125) {
            method2112(104, 108, -23, -6);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class69.field1020.method1745(arg0, (byte) -126, 36);
        class25 var4 = new class25();
        var4.field420 = arg0;
        if (var3 != null) {
            var4.method290(true, new class11(var3));
        }
        var4.method297(Integer.MIN_VALUE);
        class286.field4032.method902((long) arg0, (byte) 112, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(II)V", line = 116)
    public static final void method2114(int arg0, int arg1) {
        field4541++;
        class239 var2 = class436.method2740(arg1, arg0, arg1 ^ 0xECBB0CEE);
        var2.method1628(arg1 + 14464);
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V", line = 126)
    public static void method2115(int arg0) {
        field4540 = null;
        if (arg0 != -1) {
            field4544 = null;
        }
        field4549 = null;
        field4545 = null;
        field4544 = null;
        field4550 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)V", line = 140)
    public static final void method2116(int arg0, boolean arg1) {
        field4536++;
        class242.field3437 = arg0;
        class131 var2 = class67.field1004;
        synchronized (class67.field1004) {
            if (arg1) {
                class67.field1004.method905((byte) 42);
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(IB)V", line = 154)
    public static final void method2117(int arg0, byte arg1) {
        class395.field5658 = arg0;
        field4542++;
        class131 var2 = class113.field1633;
        synchronized (class113.field1633) {
            if (arg1 >= -80) {
                return;
            }
            class113.field1633.method905((byte) 55);
        }
        class131 var3 = class206.field2830;
        synchronized (class206.field2830) {
            class206.field2830.method905((byte) 100);
        }
    }
}
