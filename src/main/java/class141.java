import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class141 {

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Lur;")
    private class377 field1872;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public int field1871;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field1870 = -1;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!ik", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        field1869++;
        this.field1872.method2253(this.field1871, -1888158920);
        super.finalize();
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZII)V", line = 21)
    public static final void method869(boolean arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            class343.field4596 = class287.method1723(class381.field5518, class60.field701, class463.field6904, arg1, (byte) 53, class319.field4256.field4654 * 2);
        } else {
            if (arg0) {
                class343.field4596 = class287.method1723(class381.field5518, class60.field701, class463.field6904, 0, (byte) 53, 0);
                class343.field4596.method1145(0);
                class183 var3 = class123.method733(0, class365.field4985, -97, class98.field1309);
                class316 var4 = class343.field4596.method1201(var3, class491.method2976(class282.field3733, class365.field4985, 0), true);
                class31.method176(true, var4, class279.field3703.method1823(class374.field5072, (byte) -88), 111);
                class343.field4596.method1208();
                class21.method120((byte) -103);
                class343.field4596.method1724(1);
            }
            try {
                class343.field4596 = class287.method1723(class381.field5518, class60.field701, class463.field6904, arg1, (byte) 53, class319.field4256.field4654 * 2);
                if (class343.field4596.method1190()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class15 var6;
                    if (var5) {
                        var6 = class343.field4596.method1204(146800640);
                    } else {
                        var6 = class343.field4596.method1204(104857600);
                    }
                    class343.field4596.method1225(var6);
                }
            } catch (Throwable var8) {
                arg1 = 0;
                class343.field4596 = class287.method1723(class381.field5518, class60.field701, class463.field6904, 0, (byte) 53, 0);
            }
        }
        field1873++;
        class20.field183 = arg1;
        class305.method1822(0);
        if (!class343.field4596.method1154()) {
            class118.field1550 = 1;
        }
        class343.field4596.method1173(class118.field1550);
        class343.field4596.method1187(0);
        if (arg2 < 69) {
            method869(false, -53, 26);
        }
        class343.field4596.method1130(8);
        class272.field3633 = class343.field4596.method1125();
        class521.field7667 = class343.field4596.method1125();
        class207.method1312(-111);
        class343.field4596.method1166(!class319.field4256.field4659);
        if (class343.field4596.method1135()) {
            class106.method649(class319.field4256.field4685, (byte) -117);
        }
        class43.method247(5, class343.field4596, class426.field6200 >> 3, class308.field4128 >> 3);
        class451.method2797((byte) 47);
        class435.field6347 = false;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lur;II)V", line = 101)
    public class141(class377 arg0, int arg1, int arg2) {
        this.field1872 = arg0;
        this.field1871 = arg2;
    }
}
