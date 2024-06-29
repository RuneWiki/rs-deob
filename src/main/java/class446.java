import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class446 extends class529 {

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "Ljava/lang/String;")
    public String field6916;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
    public static int field6918 = 0;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "J")
    public static long field6917;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method2818(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class397.field5998++;
        class72.field1081 = 0;
        for (int var6 = class109.field1556; var6 < class297.field4675; var6++) {
            class409[][] var17 = class217.field3699[var6];
            for (int var18 = class363.field5620; var18 < class315.field4928; var18++) {
                for (int var19 = class197.field3041; var19 < class529.field7781; var19++) {
                    class409 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class357.field5543[var18 + class78.field1156 - class192.field2847][var19 + class78.field1156 - class241.field3919] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field6187 = true;
                            var20.field6191 = true;
                            if (var20.field6175 == null) {
                                var20.field6198 = false;
                            } else {
                                var20.field6198 = true;
                            }
                            class72.field1081++;
                        } else {
                            var20.field6187 = false;
                            var20.field6191 = false;
                            var20.field6177 = 0;
                            if (var18 >= class192.field2847 - 16 && var18 <= class192.field2847 + 16 && var19 >= class241.field3919 - 16 && var19 <= class241.field3919 + 16 && (var20.field6180 != null || var20.field6188 != null || var20.field6189 != null || var20.field6192 != null || var20.field6176 != null || var20.field6175 != null)) {
                                class409.field6200.method912((byte) -97, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class53.field732 == class103.field1520;
        for (int var8 = class109.field1556; var8 < class297.field4675; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class104.field1523.method1267() && var8 >= arg2 && arg1 != null) {
                int var10 = class357.field5543.length;
                if (class357.field5543.length + class363.field5620 > class252.field4075) {
                    var10 -= class357.field5543.length + class363.field5620 - class252.field4075;
                }
                int var11 = class357.field5543[0].length;
                if (class357.field5543[0].length + class197.field3041 > class131.field1773) {
                    var11 -= class357.field5543[0].length + class197.field3041 - class131.field1773;
                }
                int var12 = class435.field6558;
                while (true) {
                    if (var12 >= var10) {
                        class409.field6200.method906(var9, class53.field732[var8], (byte) 111, var8, true);
                        break;
                    }
                    int var13 = class363.field5620 + var12 - class435.field6558;
                    for (int var14 = class520.field7713; var14 < var11; var14++) {
                        class221.field3735[var12][var14] = false;
                        if (class357.field5543[var12][var14]) {
                            int var15 = class197.field3041 + var14 - class520.field7713;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class217.field3699[var16][var13][var15] != null && class217.field3699[var16][var13][var15].field6174 == var8) {
                                    class221.field3735[var12][var14] = class217.field3699[var16][var13][var15].field6187;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class409.field6200.method906(var9, class53.field732[var8], (byte) 111, var8, false);
            }
            class409.field6200.method913(0);
        }
        if (!class419.method2672(true)) {
            class419.method2672(false);
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
    public class446() {
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class446(String arg0) {
        this.field6916 = arg0;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)I")
    public static final int method2819(int arg0, int arg1) {
        int var2 = -100 / ((37 - arg0) / 50);
        field6919++;
        return arg1 >> 11 & 0x7F;
    }
}
