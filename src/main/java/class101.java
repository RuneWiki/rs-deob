import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class101 extends class555 {

    @OriginalMember(owner = "client!aaa", name = "k", descriptor = "Lwo;")
    public static class445 field1211 = new class445();

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!aaa", name = "j", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!aaa", name = "l", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!aaa", name = "m", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!aaa", name = "o", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!aaa", name = "p", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!aaa", name = "n", descriptor = "Lkn;")
    public static class494 field1214;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(III)V")
    public final void method126(int arg0, int arg1, int arg2) {
        ++field1216;
        if (arg0 <= 81) {
            field1211 = null;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lot;BI)V")
    public final void method127(class222 arg0, byte arg1, int arg2) {
        if (arg1 <= -93) {
            super.field7580.method3613((byte) 94, arg0);
            ++field1213;
            super.field7580.method3676(arg2, (byte) -84);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lqq;)V")
    public class101(class651 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZZ)V")
    public final void method124(boolean arg0, boolean arg1) {
        if (arg0) {
            ++field1215;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)Z")
    public final boolean method125(int arg0) {
        if (arg0 != -20112) {
            field1208 = -62;
        }
        ++field1212;
        return false;
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)V")
    public final void method121(byte arg0) {
        if (arg0 > 45) {
            ++field1209;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZI)V")
    public final void method117(boolean arg0, int arg1) {
        ++field1210;
        if (arg1 != -13443) {
            field1214 = null;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "()V")
    public static final void method567() {
        for (int var0 = class266.field3479; var0 < class171.field2428; ++var0) {
            for (int var1 = 0; var1 < class329.field4421; ++var1) {
                for (int var2 = 0; var2 < class641.field8846; ++var2) {
                    class207 var3 = class153.field2168[var0][var1][var2];
                    if (var3 != null) {
                        class190 var4 = var3.field2768;
                        class190 var5 = var3.field2767;
                        if (var4 != null && var4.method166(0)) {
                            class55.method320(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method166(0)) {
                                class55.method320(var5, var0, var1, var2, 1, 1);
                                var5.method169(0, var4, false, 0, class377.field4985, 0, (byte) -122);
                                var5.method175((byte) 98);
                            }
                            var4.method175((byte) 63);
                        }
                        for (class634 var6 = var3.field2774; var6 != null; var6 = var6.field8764) {
                            class29 var8 = var6.field8767;
                            if (var8 != null && var8.method166(0)) {
                                class55.method320(var8, var0, var1, var2, var8.field420 - var8.field423 + 1, var8.field421 - var8.field419 + 1);
                                var8.method175((byte) 51);
                            }
                        }
                        class271 var7 = var3.field2765;
                        if (var7 != null && var7.method166(0)) {
                            class671.method3814(var7, var0, var1, var2);
                            var7.method175((byte) 27);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "(B)V")
    public static void method568(byte arg0) {
        field1211 = null;
        field1214 = null;
        if (arg0 != 125) {
            method568((byte) -22);
        }
    }
}
