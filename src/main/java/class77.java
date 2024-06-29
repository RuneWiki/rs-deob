import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class77 {

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
    public int field1044 = 16777215;

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
    public int field1046 = 8;

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "Lim;")
    public static class353 field1045 = new class353(101, 7);

    @OriginalMember(owner = "client!haa", name = "n", descriptor = "[I")
    public static int[] field1056 = new int[13];

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!haa", name = "l", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!haa", name = "m", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!haa", name = "o", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "Lgaa;")
    public static class279 field1048;

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "Z")
    public boolean field1050;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lge;B)V")
    public final void method441(class551 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method3045(-126);
            if (var3 == 0) {
                if (arg1 < 121) {
                    method442(-44);
                }
                field1047++;
                return;
            }
            this.method443((byte) -11, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
    public static void method442(int arg0) {
        field1056 = null;
        field1045 = null;
        if (arg0 <= -108) {
            field1048 = null;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BLge;I)V")
    private final void method443(byte arg0, class551 arg1, int arg2) {
        if (arg2 == 1) {
            this.field1046 = arg1.method3090(-86);
        } else if (arg2 == 2) {
            this.field1050 = true;
        } else if (arg2 == 3) {
            this.field1051 = arg1.method3087(true);
            this.field1052 = arg1.method3087(true);
            this.field1049 = arg1.method3087(true);
        } else if (arg2 == 4) {
            this.field1043 = arg1.method3045(-127);
        } else if (arg2 == 5) {
            this.field1055 = arg1.method3090(-93);
        } else if (arg2 == 6) {
            this.field1044 = arg1.method3043((byte) 49);
        }
        field1053++;
        if (arg0 > -3) {
            this.method441(null, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)V")
    public static final void method444(int arg0) {
        field1054++;
        try {
            if (class463.field6597 == 1) {
                int var1 = class115.field1466.method2108(arg0 + 120);
                if (var1 > 0 && class115.field1466.method2089((byte) 115)) {
                    int var2 = var1 - class148.field1924;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class115.field1466.method2099((byte) -100, var2);
                    return;
                }
                class115.field1466.method2098((byte) 127);
                class115.field1466.method2113(arg0 ^ 0xFFFFFF81);
                class449.field6352 = null;
                if (class217.field2773 == null) {
                    class463.field6597 = 0;
                } else {
                    class463.field6597 = 2;
                }
                class387.field5386 = null;
            }
            if (arg0 != 0) {
                field1057 = -47;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class115.field1466.method2098((byte) 124);
            class387.field5386 = null;
            class463.field6597 = 0;
            class217.field2773 = null;
            class449.field6352 = null;
        }
    }
}
