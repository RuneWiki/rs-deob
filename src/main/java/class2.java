import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class2 extends class259 {

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "Ltb;")
    public static class246 field15 = new class246();

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
    public static int field22 = 100;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBIII)V", line = 8)
    public final void method10(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field19++;
        int var6 = this.field17 << 3;
        if (arg1 != 101) {
            this.method10(116, (byte) -60, -98, -26, 31);
        }
        int var7 = (arg3 << 4) + (var6 & 0xF);
        int var8 = this.field16 << 3;
        int var9 = (arg0 << 4) + (var8 & 0xF);
        this.method16(var6, var8, var7, var9, arg4, arg2);
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)V", line = 25)
    public static void method12(byte arg0) {
        field15 = null;
        if (arg0 > -23) {
            method15((byte) 72);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 38)
    public static final String method14(int arg0, boolean arg1) {
        field18++;
        if (arg1) {
            return class222.field3357[arg0].length() > 0 ? class29.field342[arg0] + class357.field5672 + class222.field3357[arg0] : class29.field342[arg0];
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(B)Lmd;", line = 54)
    public static final class279 method15(byte arg0) {
        if (arg0 < 66) {
            return (class279) null;
        }
        field14++;
        class279 var1 = (class279) class351.field5591.method2397((byte) -109);
        if (var1 != null) {
            var1.method1290(-10);
            var1.method1829((byte) -74);
            return var1;
        }
        class279 var2;
        do {
            var2 = (class279) class52.field609.method2397((byte) 88);
            if (var2 == null) {
                return null;
            }
            if (var2.method1990((byte) 38) > class9.method57(-14133)) {
                return null;
            }
            var2.method1290(-76);
            var2.method1829((byte) -74);
        } while ((var2.field4086 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(II)V")
    public abstract void method11(int arg0, int arg1);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
    public abstract void method13(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIII)V")
    public abstract void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(II)V")
    public abstract void method17(int arg0, int arg1);

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(II)V")
    public abstract void method18(int arg0, int arg1);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)V")
    public abstract void method19(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIII)V")
    public abstract void method20(int arg0, int arg1, int arg2, int arg3, int arg4);
}
