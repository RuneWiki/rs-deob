import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public abstract class class14 {

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "I")
    public static int field144 = -1;

    @OriginalMember(owner = "mapview!ga", name = "i", descriptor = "Ld;")
    public static class7 field152 = class38.method251((byte) 63, "Mining Shop");

    @OriginalMember(owner = "mapview!ga", name = "k", descriptor = "Ld;")
    public static class7 field154 = class38.method251((byte) -125, "mapscene");

    @OriginalMember(owner = "mapview!ga", name = "h", descriptor = "Ld;")
    public static class7 field151 = class38.method251((byte) 122, "Dairy Churn");

    @OriginalMember(owner = "mapview!ga", name = "e", descriptor = "Ld;")
    public static class7 field148 = class38.method251((byte) 123, "Tannery");

    @OriginalMember(owner = "mapview!ga", name = "g", descriptor = "I")
    public static int field150 = -1;

    @OriginalMember(owner = "mapview!ga", name = "m", descriptor = "Ld;")
    public static class7 field156 = class38.method251((byte) 98, "???");

    @OriginalMember(owner = "mapview!ga", name = "j", descriptor = "Ld;")
    public static class7 field153 = class38.method251((byte) 90, "uitext has incorrect number of strings");

    @OriginalMember(owner = "mapview!ga", name = "n", descriptor = "Ld;")
    public static class7 field157 = class38.method251((byte) 99, "Mace Shop");

    @OriginalMember(owner = "mapview!ga", name = "p", descriptor = "Ld;")
    public static class7 field159 = class38.method251((byte) -124, "Key");

    @OriginalMember(owner = "mapview!ga", name = "d", descriptor = "I")
    public int field147;

    @OriginalMember(owner = "mapview!ga", name = "l", descriptor = "I")
    public int field155;

    @OriginalMember(owner = "mapview!ga", name = "f", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field149;

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "Ljava/awt/Image;")
    public Image field146;

    @OriginalMember(owner = "mapview!ga", name = "o", descriptor = "[I")
    public int[] field158;

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "[Ld;")
    public static class7[] field145;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(I)V", line = 49)
    public static void method108(int arg0) {
        field157 = null;
        field145 = null;
        field148 = null;
        field149 = null;
        field151 = null;
        field153 = null;
        field152 = null;
        if (arg0 != 21208) {
            method113(null, -73);
        }
        field154 = null;
        field159 = null;
        field156 = null;
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(I[BIB)Ld;", line = 75)
    public static final class7 method109(int arg0, byte[] arg1, int arg2, byte arg3) {
        class7 var4 = new class7();
        var4.field75 = new byte[arg2];
        var4.field76 = 0;
        if (arg3 != -84) {
            field156 = null;
        }
        for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
            if (arg1[var5] != 0) {
                var4.field75[var4.field76++] = arg1[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(Z)V", line = 115)
    public final void method112(boolean arg0) {
        if (!arg0) {
            this.field147 = 65;
        }
        class19.method136(this.field158, this.field147, this.field155);
    }

    @OriginalMember(owner = "mapview!ga", name = "<init>", descriptor = "()V", line = 128)
    protected class14() {
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "([Ld;I)Ld;", line = 142)
    public static final class7 method113(class7[] arg0, int arg1) {
        if (arg1 != 27362) {
            return (class7) null;
        } else if (arg0.length < 2) {
            throw new IllegalArgumentException();
        } else {
            return mapview.method184(0, arg0.length, arg0, (byte) -81);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
    public abstract void method110(int arg0, Component arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method111(int arg0, int arg1, int arg2, Graphics arg3);
}
