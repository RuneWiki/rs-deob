import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class class448 extends class170 {

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "Lm;")
    public class181 field6347;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "Lhc;")
    public static class368 field6348 = new class368("K", "T", "K", "K");

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "Z")
    public static boolean field6350;

    static {
        new class368("Select", "Auswählen", "Sélectionner", "Selecionar");
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)V", line = 3)
    public static void method2780(boolean arg0) {
        field6348 = null;
        if (arg0) {
            field6351 = 75;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILij;)V", line = 14)
    public static final void method2781(int arg0, class316 arg1) {
        class5.field39 = arg1;
        if (arg0 == 2) {
            field6354++;
        }
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(B)V", line = 29)
    public static final void method2782(byte arg0) {
        field6349++;
        if (arg0 != 49 || !class301.method1830(60)) {
            return;
        }
        if (class178.field2543 == null) {
            class65.method521((byte) 71);
        }
        class25.field320 = new boolean[100];
        class213.field2983 = 0;
        class334.field4532 = new int[100];
        class62.field836 = true;
        class359.field4975 = new int[100];
        class88.field1250 = new int[100];
        for (int var1 = 0; var1 < 100; var1++) {
            class88.field1250[var1] = (int) ((double) class373.field5174 * Math.random());
            class334.field4532[var1] = (int) (Math.random() * 350.0D);
            class359.field4975[var1] = (int) (Math.random() * 102.0D);
            class25.field320[var1] = Math.random() < 0.5D;
        }
        try {
            class221.field3103 = class352.field4737.getToolkit().getSystemClipboard();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILij;Lea;)V", line = 71)
    public static final void method2783(int arg0, class316 arg1, class58 arg2) {
        field6352++;
        if (class42.field563) {
            return;
        }
        arg2.method183(0);
        class300.field4105 = arg2.method199(class96.method744(arg1, class118.field1798), true);
        if (arg0 <= -120) {
            class300.field4105.method616((class373.field5174 - class300.field4105.method632()) / 2, (class396.field5493 - class300.field4105.method619()) / 2);
            class211.field2967 = arg2.method199(class96.method744(arg1, class381.field5249), true);
            class211.field2967.method616((class373.field5174 - class211.field2967.method632()) / 2, 18);
            class42.field563 = true;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lm;)V", line = 91)
    public class448(class181 arg0) {
        this.field6347 = arg0;
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method350(int arg0);

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)Z")
    public abstract boolean method352(byte arg0);
}
