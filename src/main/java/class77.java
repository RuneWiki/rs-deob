import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public abstract class class77 {

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "Z")
    public static boolean field1153 = false;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    public static int field1159 = -2;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "J")
    public static long field1155;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field1161;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "[[[B")
    public static byte[][][] field1152;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIII)V", line = 8)
    public static final void method659(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1154++;
        if (arg2 != -13935) {
            field1152 = null;
        }
        if (arg3 >= arg4) {
            class396.method2436(arg2 + 12865, arg0, arg4, class186.field2697[arg1], arg3);
        } else {
            class396.method2436(arg2 ^ 0x3243, arg0, arg3, class186.field2697[arg1], arg4);
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V", line = 33)
    public static void method661(byte arg0) {
        if (arg0 >= 37) {
            field1161 = null;
            field1152 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V", line = 46)
    public static final void method662(boolean arg0) {
        class410 var1 = class107.field1569;
        synchronized (class107.field1569) {
            if (!arg0) {
                field1152 = null;
            }
            class107.field1569.method2539(62);
        }
        field1158++;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIILbe;)V", line = 61)
    public static final void method663(int arg0, int arg1, int arg2, class44 arg3) {
        if (class118.field1653[arg0][arg1][arg2] == null) {
            class263.method1695(arg0, arg1, arg2);
        }
        class118.field1653[arg0][arg1][arg2].field3124 = arg3;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lrk;I)V", line = 67)
    public static final void method664(class427 arg0, int arg1) {
        field1156++;
        class400.field5591 = arg0;
        if (arg1 != 30) {
            field1155 = -124L;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IB)Ljn;", line = 86)
    public static final class397 method665(int arg0, byte arg1) {
        if (arg1 != 91) {
            return null;
        }
        field1151++;
        class397 var2 = (class397) class284.field3805.method2537(-23, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class213.field2956.method2633(arg0, -1, 30);
        class397 var4 = new class397();
        if (var3 != null) {
            var4.method2441((byte) 69, new class289(var3), arg0);
        }
        class284.field3805.method2542(var4, (byte) -95, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBLrk;I)Lvm;", line = 113)
    public static final class323 method667(int arg0, byte arg1, class427 arg2, int arg3) {
        field1157++;
        int var4 = 3 % ((arg1 - 60) / 36);
        byte[] var5 = arg2.method2633(arg0, -1, arg3);
        return var5 == null ? null : new class323(var5);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method658(Component arg0, byte arg1);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)I")
    public abstract int method660(byte arg0);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method666(int arg0, Component arg1);
}
