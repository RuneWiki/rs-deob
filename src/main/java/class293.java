import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class293 extends class54 {

    @OriginalMember(owner = "client!js", name = "s", descriptor = "[Lgg;")
    public static class119[] field4306 = new class119[2048];

    @OriginalMember(owner = "client!js", name = "r", descriptor = "B")
    private byte field4305;

    @OriginalMember(owner = "client!js", name = "t", descriptor = "B")
    private byte field4307;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!js", name = "q", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!js", name = "u", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "Ljava/lang/String;")
    private String field4303;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(B)V", line = 6)
    public static void method1935(byte arg0) {
        field4306 = null;
        if (arg0 > -41) {
            method1935((byte) 83);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lag;I)V", line = 26)
    public final void method419(class459 arg0, int arg1) {
        field4308++;
        if (arg1 != -33) {
            method1935((byte) -37);
        }
        if (this.field4303 != null) {
            arg0.field6429 = this.field4305;
            arg0.field6412 = this.field4307;
        }
        arg0.field6418 = this.field4303;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lgga;B)V", line = 45)
    public final void method422(class511 arg0, byte arg1) {
        field4302++;
        this.field4303 = arg0.method2998((byte) -120);
        if (arg1 != -21) {
            this.field4305 = 102;
        }
        if (this.field4303 != null) {
            arg0.method3013(-123);
            this.field4307 = arg0.method3030(-25984);
            this.field4305 = arg0.method3030(-25984);
        }
    }
}
