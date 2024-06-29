import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class94 extends class178 {

    @OriginalMember(owner = "client!od", name = "l", descriptor = "[Lpe;")
    public static class262[] field1478 = new class262[29];

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field1482 = 0;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field1483 = 0;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Lpf;")
    public static class305 field1480 = new class305(32);

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field1484 = 0;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field1485 = 2;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V")
    public static void method735(byte arg0) {
        int var1 = -22 % ((5 - arg0) / 37);
        field1480 = null;
        field1478 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method736(long arg0, int arg1) {
        class169.field2560.setTime(new Date(arg0));
        field1479++;
        int var3 = class169.field2560.get(7);
        int var4 = class169.field2560.get(5);
        int var5 = class169.field2560.get(2);
        int var6 = class169.field2560.get(1);
        int var7 = class169.field2560.get(11);
        int var8 = class169.field2560.get(12);
        int var9 = 15 % ((-arg1 - 60) / 46);
        int var10 = class169.field2560.get(13);
        return class226.field3630[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class152.field2245[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }
}
