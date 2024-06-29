import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class class17 {

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "Lba;")
    public static class4 field211 = class14.method105((byte) -103, "");

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "Lba;")
    public static class4 field214 = class14.method105((byte) -89, "POH Portal");

    @OriginalMember(owner = "mapview!i", name = "f", descriptor = "J")
    public static long field216 = 0L;

    @OriginalMember(owner = "mapview!i", name = "g", descriptor = "Lba;")
    public static class4 field217 = class14.method105((byte) -65, "Fishing Shop");

    @OriginalMember(owner = "mapview!i", name = "h", descriptor = "I")
    public static int field218 = 50;

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "Lba;")
    public static class4 field213 = class14.method105((byte) -117, "Archery Shop");

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "La;")
    public static class1 field212 = new class1();

    @OriginalMember(owner = "mapview!i", name = "i", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "[[Loa;")
    public static class29[][] field215;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Lc;Lba;ILba;)[Lj;", line = 9)
    public static final class6[] method122(class5 arg0, class4 arg1, int arg2, class4 arg3) {
        int var4 = arg0.method62(arg3, -25493);
        if (arg2 != 3840) {
            field216 = 44L;
        }
        int var5 = arg0.method55(var4, (byte) -109, arg1);
        return class29.method182(arg0, var5, (byte) 108, var4);
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(II)[B", line = 29)
    public static final synchronized byte[] method123(int arg0, int arg1) {
        if (arg0 == 100 && class26.field310 > 0) {
            byte[] var2 = class15.field199[--class26.field310];
            class15.field199[class26.field310] = null;
            return var2;
        } else if (arg0 == 5000 && class23.field282 > 0) {
            byte[] var3 = class36.field447[--class23.field282];
            class36.field447[class23.field282] = null;
            return var3;
        } else if (arg1 != 0) {
            return (byte[]) null;
        } else if (arg0 == 30000 && class4.field85 > 0) {
            byte[] var4 = class31.field391[--class4.field85];
            class31.field391[class4.field85] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(B)V", line = 66)
    public static void method124(byte arg0) {
        field214 = null;
        int var1 = 56 % ((arg0 + 67) / 40);
        field213 = null;
        field217 = null;
        field215 = null;
        field211 = null;
        field212 = null;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 103)
    public static final void method125(Component arg0, boolean arg1) {
        arg0.removeMouseListener(class35.field435);
        if (arg1) {
            arg0.removeMouseMotionListener(class35.field435);
            arg0.removeFocusListener(class35.field435);
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(BLba;Lba;Lc;)Lka;", line = 136)
    public static final class21 method126(byte arg0, class4 arg1, class4 arg2, class5 arg3) {
        int var4 = arg3.method62(arg2, -25493);
        int var5 = arg3.method55(var4, (byte) -105, arg1);
        int var6 = -111 % ((arg0 - 43) / 52);
        return class12.method96(arg3, var4, var5, true);
    }
}
