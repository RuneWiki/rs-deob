import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class559 extends class698 {

    @OriginalMember(owner = "client!kfa", name = "x", descriptor = "I")
    public int field7534 = (int) (class577.method3295((byte) 15) / 1000L);

    @OriginalMember(owner = "client!kfa", name = "y", descriptor = "Ljava/lang/String;")
    public String field7535;

    @OriginalMember(owner = "client!kfa", name = "A", descriptor = "S")
    public short field7537;

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "Llh;")
    public static class487 field7536 = new class487(65, 2);

    @OriginalMember(owner = "client!kfa", name = "D", descriptor = "Lpn;")
    public static class692 field7539 = new class692(1);

    @OriginalMember(owner = "client!kfa", name = "w", descriptor = "F")
    public static float field7533;

    @OriginalMember(owner = "client!kfa", name = "v", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!kfa", name = "B", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method3124(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 47) {
            field7539 = null;
        }
        for (class389 var5 = (class389) class327.field4437.method1436(28964); var5 != null; var5 = (class389) class327.field4437.method1443((byte) 6)) {
            class39.method353(arg4, arg3, arg0, 0, var5, arg2);
        }
        field7532++;
        for (class389 var6 = (class389) class552.field7451.method1436(28964); var6 != null; var6 = (class389) class552.field7451.method1443((byte) 6)) {
            byte var12 = 1;
            class67 var13 = var6.field5484.method895(-25227);
            if (var6.field5484.field1761 == -1 || var6.field5484.field1703) {
                var12 = 0;
            } else if (var6.field5484.field1761 == var13.field875 || var6.field5484.field1761 == var13.field893 || var6.field5484.field1761 == var13.field911 || var6.field5484.field1761 == var13.field874) {
                var12 = 2;
            } else if (var6.field5484.field1761 == var13.field890 || var6.field5484.field1761 == var13.field870 || var6.field5484.field1761 == var13.field886 || var6.field5484.field1761 == var13.field906) {
                var12 = 3;
            }
            if (var6.field5488 != var12) {
                int var14 = class402.method2345(var6.field5484, (byte) 95);
                class568 var15 = var6.field5484.field674;
                if (var15.field8079 != null) {
                    var15 = var15.method3259((byte) 97, class578.field8156);
                }
                if (var15 == null || var14 == -1) {
                    var6.field5488 = var12;
                    var6.field5496 = -1;
                    var6.field5483 = false;
                } else if (var6.field5496 == var14 && var6.field5483 == var15.field8030) {
                    var6.field5488 = var12;
                    var6.field5493 = var15.field8057;
                } else {
                    boolean var16 = false;
                    if (var6.field5499 == null) {
                        var16 = true;
                    } else {
                        var6.field5493 -= 512;
                        if (var6.field5493 <= 0) {
                            class61.field680.method1464(var6.field5499);
                            var16 = true;
                            var6.field5499 = null;
                        }
                    }
                    if (var16) {
                        var6.field5483 = var15.field8030;
                        var6.field5493 = var15.field8057;
                        var6.field5498 = null;
                        var6.field5490 = null;
                        var6.field5496 = var14;
                        var6.field5488 = var12;
                    }
                }
            }
            var6.field5513 = var6.field5484.field4042;
            var6.field5495 = var6.field5484.field4042 + (var6.field5484.method881(-123) << 8);
            var6.field5487 = var6.field5484.field4047;
            var6.field5485 = var6.field5484.field4047 + (var6.field5484.method881(-125) << 8);
            class39.method353(arg4, arg3, arg0, 0, var6, arg2);
        }
        for (class389 var7 = (class389) class122.field1683.method977(0); var7 != null; var7 = (class389) class122.field1683.method975(-1)) {
            byte var8 = 1;
            class67 var9 = var7.field5516.method895(-25227);
            if (var7.field5516.field1761 == -1 || var7.field5516.field1703) {
                var8 = 0;
            } else if (var7.field5516.field1761 == var9.field875 || var7.field5516.field1761 == var9.field893 || var7.field5516.field1761 == var9.field911 || var7.field5516.field1761 == var9.field874) {
                var8 = 2;
            } else if (var7.field5516.field1761 == var9.field890 || var7.field5516.field1761 == var9.field870 || var7.field5516.field1761 == var9.field886 || var7.field5516.field1761 == var9.field906) {
                var8 = 3;
            }
            if (var7.field5488 != var8) {
                int var10 = class92.method669(var7.field5516, 109);
                if (var7.field5496 == var10 && var7.field5483 == var7.field5516.field9664) {
                    var7.field5488 = var8;
                    var7.field5493 = var7.field5516.field9676;
                } else {
                    boolean var11 = false;
                    if (var7.field5499 == null) {
                        var11 = true;
                    } else {
                        var7.field5493 -= 512;
                        if (var7.field5493 <= 0) {
                            class61.field680.method1464(var7.field5499);
                            var7.field5499 = null;
                            var11 = true;
                        }
                    }
                    if (var11) {
                        var7.field5493 = var7.field5516.field9676;
                        var7.field5496 = var10;
                        var7.field5488 = var8;
                        var7.field5490 = null;
                        var7.field5498 = null;
                        var7.field5483 = var7.field5516.field9664;
                    }
                }
            }
            var7.field5513 = var7.field5516.field4042;
            var7.field5495 = var7.field5516.field4042 + (var7.field5516.method881(-119) << 8);
            var7.field5487 = var7.field5516.field4047;
            var7.field5485 = var7.field5516.field4047 + (var7.field5516.method881(-114) << 8);
            class39.method353(arg4, arg3, arg0, 0, var7, arg2);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZIII)V", line = 179)
    public static final void method3125(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            field7536 = null;
        }
        field7538++;
        if (arg3 - arg0 >= class128.field1831 && arg0 + arg3 <= class529.field7169 && class469.field6466 <= (arg4 - arg0) && class533.field7200 >= (arg0 + arg4)) {
            class595.method3365(arg0, 2, arg2, arg3, arg4);
        } else {
            class329.method1956(arg2, arg0, arg3, (byte) -67, arg4);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)V", line = 208)
    public static void method3126(int arg0) {
        if (arg0 > -113) {
            method3125(-31, true, 49, -68, 5);
        }
        field7536 = null;
        field7539 = null;
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 220)
    public class559(String arg0, int arg1) {
        this.field7535 = arg0;
        this.field7537 = (short) arg1;
    }
}
