import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class class376 {

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field5681 = 0;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Lrr;")
    public static class199 field5677 = new class199();

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5682 = "Loaded config";

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lep;")
    public static class146 field5683 = new class146();

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method2490(byte arg0, Component arg1);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BC)Z")
    public static final boolean method2491(byte arg0, char arg1) {
        if (arg0 != 34) {
            method2491((byte) 61, '\u0006');
        }
        field5678++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class263.field3829;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method2492(int arg0) {
        field5682 = null;
        field5683 = null;
        field5677 = null;
        if (arg0 != -14600) {
            field5681 = -110;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method2493(int arg0, Component arg1);

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)I")
    public abstract int method2494(int arg0);

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
    public static final void method2495(int arg0) {
        if (arg0 != 0) {
            field5682 = null;
        }
        field5676++;
        if (class222.field3146) {
            return;
        }
        class91.field1263 = true;
        if (class329.field4714) {
            class170.field2244 = (float) ((int) class170.field2244 - 65 & 0xFFFFFF80);
        } else {
            class6.field51 += (-class6.field51 - 24.0F) / 2.0F;
        }
        class222.field3146 = true;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Lkj;")
    public static final class236 method2496(byte arg0, int arg1) {
        field5679++;
        class24 var2 = class280.field4116;
        class236 var3;
        synchronized (class280.field4116) {
            var3 = (class236) class280.field4116.method209(126, (long) arg1);
            if (var3 == null) {
                var3 = new class236(arg1);
                class280.field4116.method202(true, var3, (long) arg1);
            }
        }
        if (arg0 != -119) {
            field5681 = 82;
        }
        synchronized (var3) {
            return var3.method1444(arg0 + 120) ? var3 : null;
        }
    }
}
