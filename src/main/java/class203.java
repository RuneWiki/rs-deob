import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class203 extends class17 {

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field3326 = 0;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field3328 = 0;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "F")
    public static float field3321;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "[Laa;")
    public static class42[] field3320;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)Lmk;")
    public static final class212 method1340(int arg0, int arg1, int arg2) {
        class109 var3 = class79.field1367[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class212 var4 = var3.field1957;
            var3.field1957 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(III)I")
    public static final int method1341(int arg0, int arg1, int arg2) {
        field3327++;
        if (arg2 < 60) {
            return 53;
        }
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(BI)V")
    public static final void method1342(byte arg0, int arg1) {
        class81.field1430.method63(arg0 - 55, arg1);
        if (arg0 == 55) {
            class274.field4392.method63(0, arg1);
            field3322++;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)V")
    public static final void method1343(int arg0, int arg1) {
        class55 var2 = class62.method395(7, arg1, (byte) -66);
        var2.method341((byte) 62);
        if (arg0 != 0) {
            method1345(true);
        }
        field3323++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V")
    public static final void method1344(int arg0, byte arg1) {
        field3319++;
        if (arg1 == -115 && class110.method766(arg1 ^ 0x35AB, arg0)) {
            class178.method1183(true, class115.field2068[arg0], -1);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
    public static void method1345(boolean arg0) {
        if (arg0) {
            method1344(-80, (byte) -56);
        }
        field3320 = null;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)Lej;")
    public static final class199 method1346(int arg0, int arg1) {
        field3325++;
        class199 var2 = (class199) class67.field1115.method57((long) arg1, -90);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class10.field127.method746(class262.method1736(arg0 ^ 0xFFFFFF00, arg1), (byte) -128, class176.method1170(arg1, arg0 + 96));
        class199 var4 = new class199();
        var4.field3273 = arg1;
        if (var3 != null) {
            var4.method1331((byte) -43, new class101(var3));
        }
        var4.method1326((byte) -89);
        if (var4.field3284 != -1) {
            var4.method1332(method1346(-1, var4.field3284), method1346(-1, var4.field3257), 1);
        }
        if (var4.field3238 != arg0) {
            var4.method1328(method1346(arg0, var4.field3243), 113, method1346(-1, var4.field3238));
        }
        if (!class107.field1912 && var4.field3242) {
            var4.field3216 = class60.field1049;
            var4.field3223 = false;
            var4.field3221 = class185.field3001;
            var4.field3286 = class250.field4102;
            var4.field3285 = 0;
        }
        class67.field1115.method62(0, var4, (long) arg1);
        return var4;
    }
}
