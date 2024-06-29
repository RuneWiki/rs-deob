import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class150 {

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public int field2517;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public int field2518;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public int field2513;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2515 = new String[100];

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field2514 = 0;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lvh;BLvh;)V")
    public static final void method1032(class108 arg0, byte arg1, class108 arg2) {
        class90.field1591 = arg0;
        class209.field3541 = arg2;
        if (arg1 == 45) {
            field2516++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method1033(byte arg0) {
        field2515 = null;
        int var1 = -1 % ((-arg0 - 43) / 48);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)V")
    public abstract void method218(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BII)V")
    public abstract void method221(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBI)V")
    public abstract void method220(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(III)V")
    public class150(int arg0, int arg1, int arg2) {
        this.field2517 = arg0;
        this.field2518 = arg1;
        this.field2513 = arg2;
    }
}
