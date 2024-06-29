import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class364 {

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Z")
    public static boolean field4813 = false;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)V")
    public static final void method2081(byte arg0, int arg1) {
        class262 var2 = class70.field759;
        synchronized (class70.field759) {
            class70.field759.method1569((byte) 62, arg1);
            if (arg0 != 118) {
                field4813 = true;
            }
        }
        field4811++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IJII)V")
    public static final void method2082(int arg0, long arg1, int arg2, int arg3) {
        field4812++;
        int var5 = ((int) arg1 & 0x7F61D) >> 14;
        int var6 = (int) arg1 >> 20 & 0x3;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (arg0 != -23) {
            return;
        }
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class556.method3152(var6, 0, 0, var5, 0, arg3, arg2, true, 0);
            return;
        }
        class685 var8 = class707.field9894.method4109(var7, (byte) 119);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field9603;
            var10 = var8.field9588;
        } else {
            var9 = var8.field9588;
            var10 = var8.field9603;
        }
        int var11 = var8.field9554;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class556.method3152(0, var11, var10, 0, 0, arg3, arg2, true, var9);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)Llu;")
    public static final class713 method2083(int arg0, byte arg1) {
        if (arg1 > -87) {
            field4815 = 88;
        }
        field4814++;
        class713 var2 = (class713) class408.field5757.method1571(-120, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class367.field4918.method2885(arg0, 0, false);
        class713 var4 = new class713();
        if (var3 != null) {
            var4.method3995((byte) 77, new class611(var3), arg0);
        }
        class408.field5757.method1574((long) arg0, var4, (byte) -80);
        return var4;
    }
}
