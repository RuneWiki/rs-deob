import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public class class13 {

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "Lna;")
    public static class26 field188 = class30.method205((byte) 122, "Guide");

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "I")
    public static int field190 = -1;

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "Lt;")
    public static class36 field189 = new class36();

    @OriginalMember(owner = "mapview!ga", name = "i", descriptor = "Lna;")
    public static class26 field196 = class30.method205((byte) 63, "details)3dat");

    @OriginalMember(owner = "mapview!ga", name = "k", descriptor = "Lna;")
    public static class26 field198 = class30.method205((byte) 58, "Hair Dressers");

    @OriginalMember(owner = "mapview!ga", name = "l", descriptor = "Lna;")
    public static class26 field199 = class30.method205((byte) 50, "Jewellery");

    @OriginalMember(owner = "mapview!ga", name = "j", descriptor = "Lna;")
    public static class26 field197 = class30.method205((byte) 21, "Platebody Shop");

    @OriginalMember(owner = "mapview!ga", name = "g", descriptor = "Lna;")
    public static class26 field194 = class30.method205((byte) 69, "world");

    @OriginalMember(owner = "mapview!ga", name = "f", descriptor = "Lna;")
    public static class26 field193 = class30.method205((byte) 52, "underlay)3dat");

    @OriginalMember(owner = "mapview!ga", name = "o", descriptor = "Lna;")
    public static class26 field202 = class30.method205((byte) 40, "overlay)3dat");

    @OriginalMember(owner = "mapview!ga", name = "m", descriptor = "Lna;")
    public static class26 field200 = class30.method205((byte) 58, "Magic Shop");

    @OriginalMember(owner = "mapview!ga", name = "n", descriptor = "Lna;")
    public static class26 field201 = class30.method205((byte) 103, "Find");

    @OriginalMember(owner = "mapview!ga", name = "h", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "mapview!ga", name = "d", descriptor = "Lv;")
    public static class40 field191;

    @OriginalMember(owner = "mapview!ga", name = "e", descriptor = "[I")
    public static int[] field192;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "([BII)I", line = 5)
    public static final int method83(byte[] arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method85(-72);
        }
        return class37.method235(1482781864, arg0, 0, arg2);
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 19)
    public static final void method84(Component arg0, byte arg1) {
        arg0.removeKeyListener(class15.field204);
        arg0.removeFocusListener(class15.field204);
        class4.field131 = -1;
        if (arg1 > -10) {
            method83(null, 41, 100);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(I)J", line = 50)
    public static final synchronized long method85(int arg0) {
        int var1 = -1 % ((arg0 - 49) / 43);
        long var2 = System.currentTimeMillis();
        if (var2 < class4.field136) {
            class35.field454 += class4.field136 - var2;
        }
        class4.field136 = var2;
        return class35.field454 + var2;
    }

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "(I)V", line = 87)
    public static void method86(int arg0) {
        field192 = null;
        if (arg0 != -23039) {
            return;
        }
        field202 = null;
        field188 = null;
        field189 = null;
        field196 = null;
        field191 = null;
        field200 = null;
        field199 = null;
        field198 = null;
        field197 = null;
        field194 = null;
        field193 = null;
        field201 = null;
    }
}
