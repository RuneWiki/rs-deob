import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class344 {

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "Z")
    public boolean field4542 = false;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "Ljp;")
    private class236 field4544 = new class236(64);

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "Ljp;")
    public class236 field4556 = new class236(500);

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "Ljp;")
    public class236 field4557 = new class236(30);

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "Ljp;")
    public class236 field4558 = new class236(50);

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "Lpc;")
    public class473 field4552;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "Lpc;")
    private class473 field4538;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "Z")
    public boolean field4540;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "Lvj;")
    public static class304 field4536 = new class304(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "Lvj;")
    public static class304 field4549 = new class304("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "[[I")
    public static int[][] field4555 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public int field4559;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "Lfk;")
    public static class462 field4548;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field4551;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Lus;")
    public final class1 method1994(int arg0, int arg1) {
        field4553++;
        class236 var3 = this.field4544;
        class1 var4;
        synchronized (this.field4544) {
            var4 = (class1) this.field4544.method1456((long) arg1, arg0 + 17405);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4538.method2708(class167.method1123(arg1, false), class116.method797(arg1, arg0 + 17549), (byte) 54);
        class1 var6 = new class1();
        var6.field33 = arg1;
        var6.field49 = this;
        if (var5 != null) {
            var6.method9(-98, new class379(var5));
        }
        var6.method13(8356);
        if (!this.field4540 && var6.field5) {
            var6.field40 = null;
            var6.field73 = null;
        }
        if (var6.field32) {
            var6.field84 = 0;
            var6.field75 = false;
        }
        class236 var7 = this.field4544;
        synchronized (this.field4544) {
            this.field4544.method1462(var6, (long) arg1, arg0 ^ 0x43C4);
        }
        if (arg0 != -17294) {
            this.field4538 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)V")
    public final void method1995(int arg0, int arg1) {
        this.field4544 = new class236(arg1);
        if (arg0 != 3) {
            this.field4559 = 90;
        }
        field4547++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)V")
    public final void method1996(boolean arg0, int arg1) {
        field4546++;
        if (this.field4542 != arg0 && arg1 == 618) {
            this.field4542 = arg0;
            this.method2000((byte) -127);
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(II)V")
    public final void method1997(int arg0, int arg1) {
        this.field4559 = arg1;
        field4550++;
        class236 var3 = this.field4556;
        synchronized (this.field4556) {
            this.field4556.method1458((byte) 83);
        }
        if (arg0 != 6) {
            field4549 = null;
        }
        class236 var4 = this.field4557;
        synchronized (this.field4557) {
            this.field4557.method1458((byte) 73);
        }
        class236 var5 = this.field4558;
        synchronized (this.field4558) {
            this.field4558.method1458((byte) -114);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
    public static void method1998(int arg0) {
        int var1 = 73 / ((arg0 + 2) / 44);
        field4548 = null;
        field4549 = null;
        field4555 = null;
        field4536 = null;
        field4551 = null;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
    public final void method1999(int arg0) {
        field4543++;
        class236 var2 = this.field4544;
        synchronized (this.field4544) {
            this.field4544.method1459(19088);
        }
        class236 var3 = this.field4556;
        synchronized (this.field4556) {
            this.field4556.method1459(19088);
        }
        class236 var4 = this.field4557;
        synchronized (this.field4557) {
            this.field4557.method1459(arg0 ^ 0x4A91);
        }
        if (arg0 != 1) {
            field4555 = null;
        }
        class236 var5 = this.field4558;
        synchronized (this.field4558) {
            this.field4558.method1459(arg0 + 19087);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public final void method2000(byte arg0) {
        class236 var2 = this.field4544;
        synchronized (this.field4544) {
            this.field4544.method1458((byte) 74);
        }
        field4541++;
        if (arg0 > -68) {
            method2002(119, 92, -13, -38, -40);
        }
        class236 var3 = this.field4556;
        synchronized (this.field4556) {
            this.field4556.method1458((byte) -81);
        }
        class236 var4 = this.field4557;
        synchronized (this.field4557) {
            this.field4557.method1458((byte) -89);
        }
        class236 var5 = this.field4558;
        synchronized (this.field4558) {
            this.field4558.method1458((byte) -122);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)V")
    public final void method2001(byte arg0, int arg1) {
        class236 var3 = this.field4544;
        synchronized (this.field4544) {
            this.field4544.method1461(-5, arg1);
        }
        field4545++;
        if (arg0 >= -24) {
            this.method1997(-31, 83);
        }
        class236 var4 = this.field4556;
        synchronized (this.field4556) {
            this.field4556.method1461(-5, arg1);
        }
        class236 var5 = this.field4557;
        synchronized (this.field4557) {
            this.field4557.method1461(-5, arg1);
        }
        class236 var6 = this.field4558;
        synchronized (this.field4558) {
            this.field4558.method1461(-5, arg1);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V")
    public static final void method2002(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= arg0) {
            class427.method2465(class457.field6299[arg4], arg0, arg2, -7, arg1);
        } else {
            class427.method2465(class457.field6299[arg4], arg2, arg0, -7, arg1);
        }
        if (arg3 != 0) {
            field4548 = null;
        }
        field4554++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIZI)V")
    public static final void method2003(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg0 != 9) {
            return;
        }
        field4539++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class415.field5734 = arg1;
        class202.field2798 = arg2;
        class296.field3877 = arg3;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZB)V")
    public final void method2004(boolean arg0, byte arg1) {
        field4537++;
        if (this.field4540 == arg0) {
            return;
        }
        this.field4540 = arg0;
        this.method2000((byte) -116);
        if (arg1 >= -37) {
            this.field4540 = true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lrb;IZLpc;Lpc;)V")
    public class344(class234 arg0, int arg1, boolean arg2, class473 arg3, class473 arg4) {
        this.field4552 = arg4;
        this.field4538 = arg3;
        this.field4540 = arg2;
        if (this.field4538 != null) {
            int var6 = this.field4538.method2724(0) - 1;
            this.field4538.method2710(var6, (byte) -105);
        }
    }
}
