import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class482 {

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Lwc;")
    private class270 field7086 = new class270();

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Lvt;")
    private class516 field7092 = new class516();

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    private int field7091;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    private int field7094;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Lbu;")
    private class407 field7093;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field7087 = -1;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field7085 = 0;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLwc;J)V", line = 30)
    public final void method2831(byte arg0, class270 arg1, long arg2) {
        if (this.field7094 == 0) {
            class270 var5 = this.field7092.method3054(-29948);
            var5.method1821((byte) -110);
            var5.method1799((byte) 113);
            if (this.field7086 == var5) {
                class270 var6 = this.field7092.method3054(-29948);
                var6.method1821((byte) -95);
                var6.method1799((byte) -68);
            }
        } else {
            this.field7094--;
        }
        field7090++;
        int var7 = 106 / ((24 - arg0) / 60);
        this.field7093.method2517(arg1, arg2, (byte) -125);
        this.field7092.method3050(arg1, 2);
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(I)V", line = 108)
    public class482(int arg0) {
        this.field7091 = arg0;
        this.field7094 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field7093 = new class407(var2);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BJ)Lwc;", line = 65)
    public final class270 method2832(byte arg0, long arg1) {
        field7088++;
        if (arg0 != 82) {
            this.field7091 = 19;
        }
        class270 var4 = (class270) this.field7093.method2516(arg1, -1);
        if (var4 != null) {
            this.field7092.method3050(var4, arg0 ^ 0x50);
        }
        return var4;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 90)
    public final void method2833(int arg0) {
        this.field7092.method3049(2);
        field7089++;
        this.field7093.method2525(0);
        this.field7086 = new class270();
        this.field7094 = this.field7091;
        int var2 = 88 % ((21 - arg0) / 61);
    }
}
