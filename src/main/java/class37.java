import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public abstract class class37 {

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field695 = 0;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lqd;")
    private static class40 field697 = class147.method1106("", (byte) -59);

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Lqd;")
    public static class40 field698 = field697;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "[[I")
    public static int[][] field694;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V", line = 17)
    public static final void method310(int arg0, int arg1) {
        field699++;
        class177 var2 = class177.method1310(68, arg0, arg1);
        var2.method1303((byte) 104);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 32)
    public static void method312(byte arg0) {
        field697 = null;
        if (arg0 == -45) {
            field694 = (int[][]) null;
            field698 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(JIII)Z", line = 59)
    public static final boolean method314(long arg0, int arg1, int arg2, int arg3) {
        int var5 = (int) arg0 >> 14 & 0x1F;
        int var6 = ((int) arg0 & 0x3346D5) >> 20;
        field696++;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class27 var8 = class72.method540(0, var7);
            int var9 = var8.field563;
            int var10;
            int var11;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field568;
                var11 = var8.field519;
            } else {
                var10 = var8.field519;
                var11 = var8.field568;
            }
            if (var6 != 0) {
                var9 = (var9 << var6 & 0xF) + (var9 >> 4 - var6);
            }
            class170.method1263(class255.field4233.field1489[0], var11, true, 0, arg1, arg2, 2, true, var9, 0, var10, class255.field4233.field1532[0]);
        } else {
            class170.method1263(class255.field4233.field1489[0], 0, true, var6, arg1, arg2, 2, true, 0, var5 + 1, 0, class255.field4233.field1532[0]);
        }
        class274.field4545 = class62.field1171;
        class233.field3845 = 0;
        if (arg3 == -981901216) {
            class294.field4940 = 2;
            class43.field814 = class128.field2208;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method309(int arg0, Component arg1);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)I")
    public abstract int method311(int arg0);

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method313(int arg0, Component arg1);
}
