import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class55 {

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
    public static int field562 = -1;

    @OriginalMember(owner = "client!gda", name = "j", descriptor = "I")
    public static int field565 = 0;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "Lcm;")
    public static class729 field558 = new class729();

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "J")
    public long field556;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "Lgda;")
    public class55 field557;

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "Lgda;")
    public class55 field564;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(Z)V")
    public static void method313(boolean arg0) {
        if (!arg0) {
            field558 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)Z")
    public final boolean method314(byte arg0) {
        field563++;
        if (this.field557 == null) {
            return false;
        } else {
            if (arg0 != 78) {
                method316(null, false, true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "(I)V")
    public final void method315(int arg0) {
        if (arg0 <= 41) {
            field565 = -8;
        }
        field561++;
        if (this.field557 != null) {
            this.field557.field564 = this.field564;
            this.field564.field557 = this.field557;
            this.field557 = null;
            this.field564 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "([BZZ)V")
    public static final void method316(byte[] arg0, boolean arg1, boolean arg2) {
        field560++;
        if (arg2) {
            method316(null, false, true);
        }
        if (class559.field7873 == null) {
            class559.field7873 = new class611(20000);
        }
        class559.field7873.method3416(arg0, arg0.length, -1, 0);
        if (!arg1) {
            return;
        }
        class250.method1494(120, class559.field7873.field8529);
        class688.field9635 = new class695[class725.field10129];
        int var3 = 0;
        for (int var4 = class159.field2005; var4 <= class278.field3715; var4++) {
            class695 var5 = class539.method2965((byte) 127, var4);
            if (var5 != null) {
                class688.field9635[var3++] = var5;
            }
        }
        class331.field4463 = false;
        class146.field1882 = class538.method2963(-47);
        class559.field7873 = null;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIB)Z")
    public static final boolean method317(int arg0, int arg1, byte arg2) {
        field559++;
        if (arg2 != 85) {
            method317(43, 69, (byte) 22);
        }
        return (arg0 & 0x22) != 0;
    }
}
