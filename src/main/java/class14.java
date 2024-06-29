import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public abstract class class14 {

    @OriginalMember(owner = "mapview!ga", name = "d", descriptor = "Lba;")
    public static class4 field187 = method105((byte) -119, "Axe Shop");

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "Lba;")
    public static class4 field186 = method105((byte) -121, "loc)3dat");

    @OriginalMember(owner = "mapview!ga", name = "g", descriptor = "I")
    public static int field190 = 0;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "mapview!ga", name = "f", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "mapview!ga", name = "h", descriptor = "Loa;")
    public static class29 field191;

    @OriginalMember(owner = "mapview!ga", name = "e", descriptor = "Ljava/awt/Image;")
    public Image field188;

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "[I")
    public int[] field185;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(Z)V", line = 21)
    public static void method103(boolean arg0) {
        field187 = null;
        field191 = null;
        field186 = null;
        if (arg0) {
            field187 = null;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(I)V", line = 35)
    public final void method104(int arg0) {
        if (arg0 != 0) {
            method106((byte) -103, 21, null, 35);
        }
        class37.method242(this.field185, this.field189, this.field184);
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(BLjava/lang/String;)Lba;", line = 47)
    public static final class4 method105(byte arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        class4 var5 = new class4();
        var5.field82 = new byte[var3];
        if (arg0 >= -64) {
            field186 = null;
        }
        while (var4 < var3) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var4) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field82[var5.field84++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field82[var5.field84++] = (byte) var6;
            }
        }
        var5.method43(-115);
        return var5.method34((byte) -76);
    }

    @OriginalMember(owner = "mapview!ga", name = "<init>", descriptor = "()V", line = 109)
    protected class14() {
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(BILc;I)Z", line = 121)
    public static final boolean method106(byte arg0, int arg1, class5 arg2, int arg3) {
        if (arg0 != 33) {
            method103(true);
        }
        byte[] var4 = arg2.method57(arg3, (byte) 112, arg1);
        if (var4 == null) {
            return false;
        } else {
            class5.method53(var4, (byte) -46);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method102(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method107(int arg0, int arg1, Graphics arg2, int arg3);
}
