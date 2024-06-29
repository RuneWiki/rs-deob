import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public abstract class class207 {

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public volatile int field3388 = 0;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "[Ljava/lang/Object;")
    public Object[] field3389 = new Object[5000];

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public int field3386 = 0;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public int field3391 = 0;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[B")
    public byte[] field3392 = new byte[5000];

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public volatile int field3390 = 0;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "[F")
    public float[] field3393 = new float[5000];

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Lhn;")
    public static class509 field3395 = new class509(4, 8);

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Lev;")
    public static class491 field3396 = new class491();

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "F")
    public static float field3397;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public abstract void method1428(byte arg0);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lfq;I)V")
    public abstract void method1429(class138 arg0, int arg1);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method1430(int arg0) {
        field3395 = null;
        field3396 = null;
        if (arg0 < 109) {
            field3395 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
    public abstract void method1431(int arg0, int arg1);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(FZILta;I)V")
    public abstract void method1432(float arg0, boolean arg1, int arg2, class145 arg3, int arg4);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
    public static final void method1433(byte arg0) {
        for (class112 var1 = (class112) class259.field3974.method1963(217); var1 != null; var1 = (class112) class259.field3974.method1963(217)) {
            class358.method2247(var1, arg0 ^ 0xFFFFBEE1);
        }
        field3387++;
        int var2;
        int var3;
        if (class193.field3258.method938(class96.field1384, arg0 ^ 0xFFFFFFDB)) {
            var3 = 0;
            var2 = 3;
        } else {
            var2 = class61.field726;
            var3 = class61.field726;
        }
        if (arg0 != 15) {
            return;
        }
        client.method1382();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1375();
            client.method1383(var4);
            client.method1391(var4);
        }
        client.method1381();
        client.method1377();
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V")
    public abstract void method1434(int arg0, int arg1);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public abstract void method1435(int arg0);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZB)V")
    public static final void method1436(boolean arg0, byte arg1) {
        field3394++;
        class319.field4808++;
        class74.method640(arg1 - 29515, class327.field4932);
        if (arg1 != -112) {
            method1433((byte) -13);
        }
        for (class293 var2 = (class293) class70.field993.method2592(115); var2 != null; var2 = (class293) class70.field993.method2589(arg1 + 111)) {
            if (!var2.method2674(26931)) {
                var2 = (class293) class70.field993.method2592(121);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field4453 == 0) {
                class218.method1568(arg0, arg1 ^ 0x13, true, var2);
            }
        }
        if (class226.field3684 != null) {
            class262.method1747(20556, class226.field3684);
            class226.field3684 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLfq;)V")
    public abstract void method1437(byte arg0, class138 arg1);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLfq;)V")
    public abstract void method1438(boolean arg0, class138 arg1);
}
