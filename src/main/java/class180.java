import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class180 extends class236 {

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "Z")
    public static boolean field3333 = false;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    public int field3335;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    public int field3336;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "[[[B")
    public static byte[][][] field3330;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V")
    public static void method1308(int arg0) {
        if (arg0 != 0) {
            field3337 = 36;
        }
        field3330 = null;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(Z)V")
    public static final void method1309(boolean arg0) {
        class266 var1 = class74.field1659;
        synchronized (class74.field1659) {
            class35.field859++;
            class122.field2413 = class28.field517;
            if (arg0) {
                method1308(-30);
            }
            class23.field440 = class77.field1683;
            class104.field2095 = class221.field3981;
            class63.field1344 = class203.field3626;
            class32.field817 = class30.field613;
            class183.field3365 = class265.field4670;
            class270.field4753 = class131.field2577;
            class203.field3626 = 0;
        }
        field3332++;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)V")
    public static final void method1310(int arg0, int arg1) {
        if (arg1 <= 30) {
            field3333 = false;
        }
        field3331++;
        class109 var2 = (class109) class208.field3730.method1168(-3, (long) arg0);
        if (var2 != null) {
            var2.method1681(false);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lmc;ILsg;)Lgh;")
    public static final class190 method1311(class151 arg0, int arg1, class30 arg2) {
        if (arg1 <= 62) {
            return null;
        }
        field3334++;
        int var3 = arg0.method1096((byte) -102, arg2);
        if (var3 == -1) {
            return new class190(0);
        }
        int[] var4 = arg0.method1097(var3, true);
        class190 var5 = new class190(var4.length);
        for (int var6 = 0; var6 < var5.field3467; var6++) {
            class8 var7 = new class8(arg0.method1115(var4[var6], (byte) -98, var3));
            var5.field3457[var6] = var7.method84(0);
            var5.field3455[var6] = var7.method98(1);
            var5.field3465[var6] = (short) var7.method65((byte) 109);
            var5.field3459[var6] = (short) var7.method65((byte) 117);
            var5.field3462[var6] = var7.method70(65280);
        }
        return var5;
    }
}
