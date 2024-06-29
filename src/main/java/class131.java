import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class131 extends class254 {

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "Lcf;")
    private static class93 field2316 = class147.method1066("Loading config )2 ", -48);

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "[I")
    public static int[] field2319 = new int[50];

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "Lcf;")
    public static class93 field2324 = class147.method1066("Forced tweening ENABLED(Q", -48);

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "Lcf;")
    public static class93 field2322 = field2316;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    private int field2315;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public int field2320;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "Lhg;")
    public static class177 field2321;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "Lcf;")
    public class93 field2323;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)J")
    public static final long method957(int arg0, int arg1, int arg2) {
        class41 var3 = class232.field4138[arg0][arg1][arg2];
        return var3 == null || var3.field641 == null ? 0L : var3.field641.field303;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
    public static void method958(int arg0) {
        if (arg0 != 6210) {
            method963(-80, -110);
        }
        field2321 = null;
        field2322 = null;
        field2316 = null;
        field2324 = null;
        field2319 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILee;B)V")
    private final void method959(int arg0, class280 arg1, byte arg2) {
        int var4 = 71 % ((arg2 + 13) / 40);
        if (arg0 == 1) {
            this.field2315 = arg1.method1907(16832);
        } else if (arg0 == 2) {
            this.field2320 = arg1.method1872(99);
        } else if (arg0 == 5) {
            this.field2323 = arg1.method1889((byte) -67);
        }
        field2314++;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(BZ)V")
    public static final void method960(byte arg0, boolean arg1) {
        class159.field2810 = null;
        class180.field3174 = null;
        class151.field2652 = null;
        if (arg1 && class164.field2886 != null) {
            class48.field777 = class164.field2886.field2773;
        } else {
            class48.field777 = null;
        }
        class257.field4632 = null;
        field2312++;
        class89.field1579 = null;
        class212.field3896 = null;
        class69.field1263 = null;
        class37.field558 = null;
        class74.field1351 = null;
        class164.field2886 = null;
        class232.field4143 = null;
        class144.field2499 = 0;
        class5.field63.method1153((byte) -6);
        class272.field4843 = null;
        class61.field1034 = null;
        class89.field1591 = -1;
        class14.field168 = -1;
        class216.field3934 = null;
        class284.field5092 = null;
        class234.field4165 = null;
        class168.field2958 = null;
        class210.field3806 = null;
        class87.field1565 = null;
        class178.field3112 = null;
        class203.field3659 = null;
        if (arg0 != -28) {
            field2316 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILee;)V")
    public final void method961(int arg0, class280 arg1) {
        while (true) {
            int var3 = arg1.method1907(arg0 + 16830);
            if (var3 == 0) {
                field2326++;
                if (arg0 != 2) {
                    field2319 = null;
                    return;
                }
                return;
            }
            this.method959(var3, arg1, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)Z")
    public final boolean method962(byte arg0) {
        if (arg0 == -115) {
            field2325++;
            return this.field2315 == 115;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)V")
    public static final void method963(int arg0, int arg1) {
        field2313++;
        class212 var2 = class123.method905(-1205364448, 2, arg0);
        if (arg1 > -67) {
            method964(-117, false);
        }
        var2.method1502(255);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZ)Lna;")
    public static final class31 method964(int arg0, boolean arg1) {
        field2317++;
        if (!arg1) {
            return null;
        }
        class31 var2 = (class31) class11.field149.method302((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class60.field1018.method1271(class67.method459(arg0, 10077), -2154, class256.method1736(4413, arg0));
        class31 var4 = new class31();
        var4.field464 = arg0;
        if (var3 != null) {
            var4.method181(new class280(var3), 0);
        }
        var4.method183((byte) -113);
        class11.field149.method297((long) arg0, var4, 10414);
        return var4;
    }
}
