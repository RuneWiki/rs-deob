import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class422 extends class644 {

    @OriginalMember(owner = "client!mba", name = "t", descriptor = "Lhv;")
    public class521 field5356;

    @OriginalMember(owner = "client!mba", name = "y", descriptor = "Lkt;")
    public class160 field5361;

    @OriginalMember(owner = "client!mba", name = "r", descriptor = "I")
    public int field5354;

    @OriginalMember(owner = "client!mba", name = "s", descriptor = "I")
    public int field5355;

    @OriginalMember(owner = "client!mba", name = "u", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!mba", name = "v", descriptor = "I")
    public int field5358;

    @OriginalMember(owner = "client!mba", name = "w", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!mba", name = "z", descriptor = "I")
    public int field5362;

    @OriginalMember(owner = "client!mba", name = "A", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!mba", name = "B", descriptor = "I")
    public int field5364;

    @OriginalMember(owner = "client!mba", name = "C", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!mba", name = "E", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!mba", name = "x", descriptor = "Lpda;")
    public static class631 field5360;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lha;I)V", line = 3)
    public static final void method2348(class60 arg0, int arg1) {
        field5357++;
        int var2 = 20 % ((arg1 + 15) / 45);
        class164.field2272 = class438.method2494(class656.field9123, -113, true, arg0);
        class165.field2306 = class229.method1459(class656.field9123, arg0, -2);
        class372.field4774 = class438.method2494(class235.field3069, 13, true, arg0);
        class697.field9708 = class229.method1459(class235.field3069, arg0, -2);
        class242.field3132 = class438.method2494(class469.field6293, -59, true, arg0);
        class270.field3406 = class229.method1459(class469.field6293, arg0, -2);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIIIII)V", line = 19)
    public static final void method2349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class230.field3029 = arg3;
        client.field3990 = arg5;
        field5359++;
        class579.field8109 = arg1;
        class97.field1344 = arg0;
        class164.field2275 = arg4;
        if (arg2 != -1025) {
            field5360 = null;
        }
        if (client.field3990 >= 100) {
            int var6 = class230.field3029 * 512 + 256;
            int var7 = class579.field8109 * 512 + 256;
            int var8 = class225.method1448(class472.field6329, var6, var7, (byte) 28) - class97.field1344;
            int var9 = var6 - class450.field5953;
            int var10 = var8 - class66.field954;
            int var11 = var7 - class318.field4121;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class33.field544 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class206.field2731 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            class115.field1704 = 0;
            if (class33.field544 < 1024) {
                class33.field544 = 1024;
            }
            if (class33.field544 > 3072) {
                class33.field544 = 3072;
            }
        }
        class35.field560 = -1;
        class746.field10437 = -1;
        class650.field9023 = 2;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V", line = 69)
    public static final void method2350(String arg0, String arg1, int arg2, int arg3) {
        field5366++;
        class468.field6275 = arg2;
        class622.field8563 = arg3;
        class4.method20(false, 1, arg0, arg1);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V", line = 87)
    public final void method2351(int arg0) {
        int var2 = 19 / ((67 - arg0) / 58);
        this.field5355 = this.field5356.field7305;
        field5365++;
        this.field5362 = this.field5356.field7306;
        this.field5358 = this.field5356.field7299;
        if (this.field5356.field7300 != null) {
            this.field5356.field7300.method593(this.field5361.field2201, this.field5361.field2193, this.field5361.field2199, class547.field7659);
        }
        this.field5354 = class547.field7659[2];
        this.field5364 = class547.field7659[0];
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(B)V", line = 109)
    public static void method2352(byte arg0) {
        int var1 = 102 / ((38 - arg0) / 51);
        field5360 = null;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)V", line = 118)
    public static final void method2353(int arg0, int arg1) {
        field5363++;
        if (class525.method3039(arg0 ^ 0xFFFFFFFB, arg1)) {
            class224.method1447((byte) 37, class218.field2938[arg1], arg0);
        }
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lhv;Lod;)V", line = 131)
    public class422(class521 arg0, class509 arg1) {
        this.field5356 = arg0;
        this.field5361 = this.field5356.method3029((byte) -97);
        this.method2351(125);
    }
}
