import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class591 {

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "Z")
    public static boolean field8067 = false;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "Lat;")
    public static class378 field8071 = null;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    public static int field8069 = 0;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field8066;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field8068;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public static int field8072;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    public static int field8073;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    public static int field8074;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "Luh;")
    public static class168 field8075;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "[[[B")
    public static byte[][][] field8070;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V", line = 5)
    public static void method3371(int arg0) {
        if (arg0 != 0) {
            method3372((byte) -74);
        }
        field8071 = null;
        field8070 = null;
        field8075 = null;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V", line = 30)
    public static final void method3372(byte arg0) {
        class391.field5763 = 0;
        field8072++;
        int var1 = (class58.field1147.field5922 >> 9) + class221.field3177;
        int var2 = (class58.field1147.field5933 >> 9) + class367.field5236;
        if (arg0 != 80) {
            method3372((byte) -34);
        }
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class391.field5763 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class391.field5763 = 1;
        }
        if (class391.field5763 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class391.field5763 = 0;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZB)V", line = 59)
    public static final void method3373(boolean arg0, byte arg1) {
        field8068++;
        class15.method120(false);
        if (!class511.method2997(true, class214.field3036)) {
            return;
        }
        class10.field137++;
        if (arg1 >= -118 || class10.field137 < 50 && !arg0) {
            return;
        }
        class10.field137 = 0;
        if (!class145.field2406 && class512.field7137 != null) {
            class82.field1488++;
            class564 var2 = class227.method1594(class507.field7050, class72.field1320, -106);
            class167.method1260(122, var2);
            try {
                class620.method3538(0);
            } catch (IOException var3) {
                class145.field2406 = true;
            }
        }
        class15.method120(false);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILvq;)I", line = 108)
    public static final int method3374(int arg0, class462 arg1) {
        field8066++;
        if (arg0 == -1) {
            String var2 = class7.method28(arg0 - 43, arg1);
            return class140.field2316.method3392(var2, class236.field3436, false);
        } else {
            return -42;
        }
    }
}
