import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!oa")
public class class29 {

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "[I")
    private int[] field384;

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "Lua;")
    public static class41 field382 = class16.method86("Combat Training", true);

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "Lua;")
    public static class41 field381 = class16.method86(" )2 ", true);

    @OriginalMember(owner = "mapview!oa", name = "e", descriptor = "Lua;")
    public static class41 field385 = class16.method86("Woodcutting stump", true);

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(II)I", line = 35)
    public final int method178(int arg0, int arg1) {
        int var3 = (this.field384.length >> 1) - 1;
        int var4 = -50 % ((arg0 + 8) / 42);
        int var5 = var3 & arg1;
        while (true) {
            int var6 = this.field384[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field384[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var3 & var5 + 1;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(Z)V", line = 84)
    public static void method179(boolean arg0) {
        field382 = null;
        field385 = null;
        field381 = null;
        if (!arg0) {
            method180(null, 62, null);
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(Ljava/lang/Object;ILp;)V", line = 102)
    public static final void method180(Object arg0, int arg1, class30 arg2) {
        if (arg2.field394 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field394.peekEvent() != null; var3++) {
            class42.method249(-127, 1L);
        }
        if (arg0 != null) {
            arg2.field394.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
        if (arg1 < 106) {
            field385 = null;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "<init>", descriptor = "([I)V", line = 128)
    public class29(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field384 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field384[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field384[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field384[var5 + var5] = arg0[var4];
            this.field384[var5 + var5 + 1] = var4++;
        }
    }
}
