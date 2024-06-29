import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class235 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "[I")
    public static int[] field3763 = new int[1000];

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BII)Lbl;", line = 16)
    public static final class191 method1702(byte arg0, int arg1, int arg2) {
        if (arg0 < 75) {
            field3763 = (int[]) null;
        }
        field3764++;
        class191 var3 = new class191();
        for (class291 var4 = (class291) class33.field448.method458((byte) -16); var4 != null; var4 = (class291) class33.field448.method455((byte) 65)) {
            if (var4.field4647 && var4.method2084(arg2, arg1, -72)) {
                var3.method1412(var4, (byte) -2);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V", line = 43)
    public static void method1704(boolean arg0) {
        field3763 = null;
        if (!arg0) {
            method1702((byte) 49, 50, -58);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lak;Lak;ILak;Lak;)V", line = 53)
    public static final void method1705(class172 arg0, class172 arg1, int arg2, class172 arg3, class172 arg4) {
        class193.field3157 = arg3;
        class323.field5003 = arg4;
        class338.field5274 = arg1;
        class201.field3273 = arg0;
        field3762++;
        if (arg2 != 24601) {
            field3763 = (int[]) null;
        }
        class221.field3547 = new class157[class193.field3157.method1291(5362)][];
        class149.field2300 = new boolean[class193.field3157.method1291(5362)];
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)I")
    public abstract int method1700(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method1701(byte arg0, Component arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1703(int arg0, Component arg1);
}
