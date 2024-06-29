import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class100 extends class24 {

    @OriginalMember(owner = "client!aja", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field1455;

    @OriginalMember(owner = "client!aja", name = "H", descriptor = "[Z")
    public static boolean[] field1456 = new boolean[100];

    @OriginalMember(owner = "client!aja", name = "D", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!aja", name = "E", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!aja", name = "F", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!aja", name = "B", descriptor = "Z")
    public static boolean field1451;

    @OriginalMember(owner = "client!aja", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 3)
    public final Object method141(byte arg0) {
        field1454++;
        if (arg0 != -8) {
            this.method141((byte) -112);
        }
        return this.field1455;
    }

    @OriginalMember(owner = "client!aja", name = "f", descriptor = "(B)V", line = 17)
    public static void method783(byte arg0) {
        field1456 = null;
        if (arg0 >= -107) {
            field1451 = true;
        }
    }

    @OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(Lst;Ljava/lang/Object;I)V", line = 27)
    public class100(class457 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1455 = arg1;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ZII)I", line = 47)
    public static final int method784(boolean arg0, int arg1, int arg2) {
        field1453++;
        if (arg0) {
            return 0;
        }
        class358 var3 = class559.method3192(arg2, arg0, Integer.MIN_VALUE);
        if (var3 == null) {
            return class464.field6586.method3031(arg2, arg1).field6590;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field5210.length; var5++) {
            if (var3.field5210[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class464.field6586.method3031(arg2, arg1).field6590 - var3.field5210.length);
    }

    @OriginalMember(owner = "client!aja", name = "e", descriptor = "(B)Z", line = 80)
    public final boolean method144(byte arg0) {
        field1452++;
        if (arg0 != 30) {
            method784(true, -62, -33);
        }
        return false;
    }
}
