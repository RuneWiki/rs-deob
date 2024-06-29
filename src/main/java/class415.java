import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class415 extends class35 {

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "Lct;")
    public static class285 field5985 = new class285(9, -1);

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field5987 = 0;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public int field5978;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public int field5980;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public int field5982;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public int field5983;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public int field5984;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Lje;")
    public class178 field5979;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "Lje;")
    public class178 field5990;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Lui;")
    public static class451 field5986;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "Ljava/lang/String;")
    public String field5991;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Z")
    public boolean field5977;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "[Ljava/lang/Object;")
    public Object[] field5989;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static void method2473(byte arg0) {
        field5986 = null;
        field5985 = null;
        int var1 = -105 % ((20 - arg0) / 32);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)I")
    public static final int method2474(int arg0, byte arg1) {
        field5988++;
        int var2 = -75 % ((-arg1 - 51) / 51);
        return arg0 >>> 8;
    }
}
