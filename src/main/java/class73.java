import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class class73 extends class175 {

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "Z")
    public volatile boolean field998 = true;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field1001 = 0;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "Leg;")
    public static class272 field996 = new class272(50);

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "[[[I")
    public static int[][][] field1004 = new int[2][][];

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "Ljj;")
    public static class134 field995;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "Z")
    public boolean field993;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "Z")
    public boolean field999;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Loj;")
    public static final class294 method560(int arg0, int arg1) {
        field1000++;
        if (arg1 != 2) {
            return null;
        }
        class294 var2 = (class294) class87.field1187.method1839((byte) 126, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class193.field3091.method940((byte) 79, class18.method124(false, arg0), class263.method1727((byte) 115, arg0));
        class294 var4 = new class294();
        if (var3 != null) {
            var4.method1969((byte) 101, new class264(var3));
        }
        class87.field1187.method1830((long) arg0, -58, var4);
        return var4;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
    public static void method561(byte arg0) {
        field995 = null;
        if (arg0 <= 97) {
            method562(87, (class235) null);
        }
        field996 = null;
        field1004 = null;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)I")
    public abstract int method2(byte arg0);

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)[B")
    public abstract byte[] method7(byte arg0);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILfi;)V")
    public static final void method562(int arg0, class235 arg1) {
        field997++;
        class54 var2 = (class54) class189.field3018.method457(class238.method1570(arg1.field3735, (byte) 79), (byte) -115);
        if (var2 == null) {
            class142.method963(arg1.field610[0], arg1.field692[0], (class94) null, 0, class28.field336, (class275) null, 128, arg1);
        } else {
            var2.method419((byte) -97);
        }
        if (arg0 != -15079) {
            method560(57, 19);
        }
    }
}
