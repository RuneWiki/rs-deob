import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class761 {

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "Z")
    public static boolean field10485 = false;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "[Leg;")
    public static class118[] field10484 = new class118[6];

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field10481;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field10482;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field10483;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field10486;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "[Lnf;")
    public static class604[] field10487;

    @OriginalMember(owner = "client!bo", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10486++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V")
    public static void method4210(byte arg0) {
        field10484 = null;
        field10487 = null;
        if (arg0 <= 51) {
            field10485 = true;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "([BB)[B")
    public static final byte[] method4211(byte[] arg0, byte arg1) {
        field10483++;
        class93 var2 = new class93(arg0);
        int var3 = var2.method793((byte) 47);
        int var4 = var2.method773(3);
        if (arg1 >= -109) {
            field10484 = null;
        }
        if (var4 < 0 || !(class334.field4512 == 0 || var4 <= class334.field4512)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method737(-32768, var5, 0, var4);
            return var5;
        } else {
            int var6 = var2.method773(3);
            if (var6 < 0 || class334.field4512 != 0 && class334.field4512 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class553.method3180(var7, var6, arg0, var4, 9);
            } else {
                class120 var8 = class766.field10565;
                synchronized (class766.field10565) {
                    class766.field10565.method1053(var2, (byte) -85, var7);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)I")
    public static final int method4212(boolean arg0) {
        field10482++;
        return arg0 ? 31 : class393.field5437;
    }
}
