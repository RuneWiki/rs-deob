import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class345 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public int field5346 = 0;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public int field5350 = 0;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "Z")
    public boolean field5347 = false;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "J")
    public static volatile long field5349 = 0L;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "[Z")
    public static boolean[] field5352 = new boolean[100];

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field5354 = 0;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "Z")
    public static boolean field5355 = false;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "Lmg;")
    public class113 field5356;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field5351;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[B)Lbf;", line = 22)
    public static final class329 method2382(int arg0, byte[] arg1) {
        field5357++;
        if (arg1 == null) {
            return null;
        }
        class329 var2;
        if (class94.field1516) {
            var2 = new class159(arg1, class97.field1546, class320.field5001, class75.field1215, class73.field1201, class306.field4757);
        } else {
            var2 = new class124(arg1, class97.field1546, class320.field5001, class75.field1215, class73.field1201, class306.field4757);
        }
        class7.method56((byte) 59);
        if (arg0 != -1) {
            field5352 = (boolean[]) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 44)
    public static final void method2383(int arg0) {
        if (arg0 != 100) {
            return;
        }
        field5358++;
        if (class318.field4968 != null) {
            class224 var1 = class318.field4968;
            synchronized (class318.field4968) {
                class318.field4968 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V", line = 69)
    public static void method2384(byte arg0) {
        if (arg0 <= -1) {
            field5352 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lkh;Z)Ljg;", line = 82)
    public static final class336 method2385(class166 arg0, boolean arg1) {
        if (arg1) {
            field5355 = true;
        }
        field5348++;
        return new class336(arg0.method1166(52), arg0.method1166(52), arg0.method1166(52), arg0.method1166(52), arg0.method1156((byte) 64), arg0.method1178(0));
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I[B)[B", line = 94)
    public static final byte[] method2386(int arg0, byte[] arg1) {
        if (arg0 != 21301) {
            method2383(-43);
        }
        field5353++;
        class166 var2 = new class166(arg1);
        int var3 = var2.method1178(arg0 - 21301);
        int var4 = var2.method1137(-104);
        if (var4 < 0 || !(class313.field4860 == 0 || var4 <= class313.field4860)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1124(0, var4, var5, 3);
            return var5;
        } else {
            int var6 = var2.method1137(78);
            if (var6 < 0 || class313.field4860 != 0 && var6 > class313.field4860) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class38.method320(var7, var6, arg1, var4, 9);
            } else {
                class62.field993.method763(false, var2, var7);
            }
            return var7;
        }
    }
}
