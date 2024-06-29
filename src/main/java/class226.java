import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class226 extends class71 {

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "Ltl;")
    public static class222 field3589 = new class222(64);

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "Z")
    public static boolean field3598 = true;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "Ljava/lang/String;")
    public static String field3597 = "Continue";

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
    public int field3596;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "[I")
    public int[] field3590;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "[I")
    public int[] field3595;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "[I")
    public int[] field3599;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "[Lea;")
    public class217[] field3588;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "[Lea;")
    public class217[] field3592;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "[[[B")
    public byte[][][] field3594;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V", line = 19)
    public static final void method1648(int arg0) {
        for (int var1 = -1; var1 < class24.field350; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class103.field1575[var1];
            }
            class320 var3 = class100.field1523[var2];
            if (var3 != null && var3.field2028 > 0) {
                var3.field2028--;
                if (var3.field2028 == 0) {
                    var3.field1949 = null;
                }
            }
        }
        for (int var4 = arg0; var4 < class176.field2875; var4++) {
            int var5 = class128.field1906[var4];
            class196 var6 = class297.field4657[var5];
            if (var6 != null && var6.field2028 > 0) {
                var6.field2028--;
                if (var6.field2028 == 0) {
                    var6.field1949 = null;
                }
            }
        }
        field3586++;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V", line = 74)
    public static final void method1649(int arg0) {
        field3587++;
        if (arg0 != 4) {
            field3589 = (class222) null;
        }
        class80.field1201.method1623(arg0 - 3);
        class89.field1362.method1623(1);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V", line = 93)
    public static void method1650(boolean arg0) {
        field3589 = null;
        field3597 = null;
        if (arg0) {
            field3597 = (String) null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)Luh;", line = 107)
    public static final class291 method1651(int arg0, byte arg1) {
        class291 var2 = (class291) class283.field4467.method1619((long) arg0, 115);
        field3591++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class68.field884.method250(true, 4, arg0);
        if (arg1 <= 39) {
            method1649(13);
        }
        class291 var4 = new class291();
        if (var3 != null) {
            var4.method2039(new class192(var3), arg0, 30411);
        }
        class283.field4467.method1621((long) arg0, -95, var4);
        return var4;
    }
}
