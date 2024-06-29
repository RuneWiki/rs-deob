import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class92 {

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "[F")
    public static float[] field1318 = new float[16];

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "Ldi;")
    public static class83 field1325 = new class83(21, 2);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "B")
    public byte field1317;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public int field1320;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Ljava/lang/String;")
    public String field1319;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "Ljava/lang/String;")
    public String field1321;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "Ljava/lang/String;")
    public String field1323;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "Ljava/lang/String;")
    public String field1324;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public static void method683(int arg0) {
        if (arg0 > -113) {
            method683(-59);
        }
        field1318 = null;
        field1325 = null;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)I")
    public static final int method684(int arg0) {
        int var1 = 92 % ((8 - arg0) / 32);
        field1322++;
        class162 var2 = class528.field7803;
        synchronized (class528.field7803) {
            return class528.field7803.method1061(-5);
        }
    }

    static {
        new class466(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
    }
}
