import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class461 {

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field6495 = 100;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "Ljava/lang/Thread;")
    public static Thread field6497;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2737(int arg0) {
        field6498++;
        class452.field6394.method406(((float) class557.field7812.field6510.method1695(false) * 0.1F + 0.7F) * class567.field8047);
        class452.field6394.method390(class428.field6109, class307.field4294, class544.field7589, (float) (class243.field3246 << 2), (float) (class589.field8303 << 2), (float) (class741.field10293 << 2));
        class452.field6394.method405(class279.field3943);
        if (arg0 != -5100) {
            field6497 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)Z", line = 20)
    public static final boolean method2738(int arg0, int arg1, int arg2) {
        field6496++;
        if (arg0 != 100) {
            method2739(null);
        }
        return (arg2 & 0x220) == 544 | (arg2 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lkba;)V", line = 31)
    public static final void method2739(class105 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            class105 var2 = null;
            for (class105 var3 = class710.field9861[var1]; var3 != null; var3 = var3.field1251) {
                if (arg0 == var3) {
                    if (var2 == null) {
                        class710.field9861[var1] = var3.field1251;
                    } else {
                        var2.field1251 = var3.field1251;
                    }
                    class230.field3098 = true;
                    return;
                }
                var2 = var3;
            }
            class105 var4 = null;
            for (class105 var5 = class373.field5234[var1]; var5 != null; var5 = var5.field1251) {
                if (arg0 == var5) {
                    if (var4 == null) {
                        class373.field5234[var1] = var5.field1251;
                    } else {
                        var4.field1251 = var5.field1251;
                    }
                    class230.field3098 = true;
                    return;
                }
                var4 = var5;
            }
            class105 var6 = null;
            for (class105 var7 = class321.field4433[var1]; var7 != null; var7 = var7.field1251) {
                if (arg0 == var7) {
                    if (var6 == null) {
                        class321.field4433[var1] = var7.field1251;
                    } else {
                        var6.field1251 = var7.field1251;
                    }
                    class230.field3098 = true;
                    return;
                }
                var6 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V", line = 112)
    public static void method2740(int arg0) {
        if (arg0 != 24) {
            field6497 = null;
        }
        field6497 = null;
    }
}
