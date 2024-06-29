import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class209 extends RuntimeException {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3146;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Ljava/lang/String;")
    public String field3149;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "J")
    public static long field3150;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Lfg;")
    public static class12 field3147;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method1342(byte arg0) {
        field3147 = null;
        if (arg0 <= 11) {
            field3147 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)Lmi;")
    public static final class266 method1343(int arg0, byte arg1) {
        field3151++;
        if (class253.field3838 && class81.field1304 <= arg0 && arg0 <= class22.field267) {
            return arg1 == -39 ? class91.field1433[arg0 - class81.field1304] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILpf;[Lmc;)V")
    public static final void method1344(int arg0, class294 arg1, class201[] arg2) {
        class281.field4201 = arg1;
        field3145++;
        class120.field1809 = arg2;
        class217.field3259 = new boolean[class120.field1809.length];
        class145.field2120.method1669(12345678);
        int var3 = class281.field4201.method1965("details", -119);
        int[] var4 = class281.field4201.method1946(0, var3);
        for (int var5 = arg0; var5 < var4.length; var5++) {
            class145.field2120.method1663((long) var4[var5], class241.method1525(false, new class248(class281.field4201.method1973(1, var3, var4[var5])), var4[var5]), -72);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1345(int arg0, Component arg1) {
        arg1.removeMouseListener(class44.field704);
        field3148++;
        arg1.removeMouseMotionListener(class44.field704);
        arg1.removeFocusListener(class44.field704);
        int var2 = -12 % ((arg0 - 28) / 58);
        class230.field3467 = 0;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class209(Throwable arg0, String arg1) {
        this.field3146 = arg0;
        this.field3149 = arg1;
    }
}
