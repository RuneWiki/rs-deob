import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class614 {

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    private int field8258 = 0;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    private int field8254 = -1;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lmba;")
    private class646 field8260 = new class646();

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Z")
    public boolean field8263 = false;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    private int field8251;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    private int field8257;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "[Lrs;")
    private class170[] field8261;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "[[I")
    private int[][] field8259;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field8262 = 0;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Ljava/util/Calendar;")
    public static Calendar field8252 = Calendar.getInstance();

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Ljava/util/Calendar;")
    public static Calendar field8255 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "[Lpia;")
    public static class57[] field8264 = new class57[14];

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field8250;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)[I", line = 3)
    public final int[] method3479(boolean arg0, int arg1) {
        field8253++;
        if (!arg0) {
            this.method3479(false, 56);
        }
        if (this.field8257 == this.field8251) {
            this.field8263 = this.field8261[arg1] == null;
            this.field8261[arg1] = class704.field9798;
            return this.field8259[arg1];
        } else if (this.field8257 == 1) {
            this.field8263 = this.field8254 != arg1;
            this.field8254 = arg1;
            return this.field8259[0];
        } else {
            class170 var3 = this.field8261[arg1];
            if (var3 == null) {
                this.field8263 = true;
                if (this.field8258 < this.field8257) {
                    var3 = new class170(arg1, this.field8258);
                    this.field8258++;
                } else {
                    class170 var4 = (class170) this.field8260.method3617((byte) 105);
                    var3 = new class170(arg1, var4.field2362);
                    this.field8261[var4.field2361] = null;
                    var4.method549(6410);
                }
                this.field8261[arg1] = var3;
            } else {
                this.field8263 = false;
            }
            this.field8260.method3614(var3, 1045);
            return this.field8259[var3.field2362];
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)[[I", line = 79)
    public final int[][] method3480(int arg0) {
        field8256++;
        if (this.field8257 != this.field8251) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field8257; var2++) {
            this.field8261[var2] = class704.field9798;
        }
        return this.field8259;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V", line = 97)
    public final void method3481(boolean arg0) {
        field8250++;
        for (int var2 = 0; var2 < this.field8257; var2++) {
            this.field8259[var2] = null;
        }
        this.field8259 = null;
        this.field8261 = null;
        this.field8260.method3615((byte) -102);
        if (!arg0) {
            this.field8260 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(III)V", line = 161)
    public class614(int arg0, int arg1, int arg2) {
        this.field8251 = arg1;
        this.field8257 = arg0;
        this.field8261 = new class170[this.field8251];
        this.field8259 = new int[this.field8257][arg2];
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V", line = 126)
    public static void method3482(int arg0) {
        field8255 = null;
        if (arg0 != 0) {
            field8264 = null;
        }
        field8264 = null;
        field8252 = null;
    }
}
