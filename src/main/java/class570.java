import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public abstract class class570 {

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
    public int field8297;

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "I")
    public int field8296;

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "I")
    public int field8298;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "Lsb;")
    public static class266 field8295 = new class266(38, 7);

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "[Las;")
    public static class138[] field8299 = new class138[14];

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(III)V")
    public abstract void method280(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Z)V")
    public static void method3287(boolean arg0) {
        field8295 = null;
        if (arg0) {
            field8299 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIB)V")
    public abstract void method279(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IZI)V")
    public abstract void method282(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(III)V")
    public class570(int arg0, int arg1, int arg2) {
        this.field8297 = arg2;
        this.field8296 = arg0;
        this.field8298 = arg1;
    }
}
