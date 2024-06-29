import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class56 {

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "[Z")
    public static boolean[] field1191;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "[[I")
    public static int[][] field1188;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZIIZ)V")
    public static final void method509(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        class80.field1594 = 0L;
        if (!arg1) {
            return;
        }
        field1189++;
        int var5 = class13.method86(3);
        if (arg2 == 3 || var5 == 3) {
            arg4 = true;
        }
        if (!class262.field4006.method383()) {
            arg4 = true;
        }
        class198.method1340(14333, arg4, arg3, arg2, arg0, var5);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZIIZI)V")
    public static final void method510(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1187++;
        if (class518.field7511 == null) {
            class262.field4006.method1809(arg5, arg2, -16777216, arg3, arg0, -7456);
        } else if (class15.field266.field6073 >= 0 && class15.field266.field6073 < (class339.field5099 * 128) && class15.field266.field6078 >= 0 && (class484.field7129 * 128) > class15.field266.field6078) {
            class184.field2958++;
            if (class15.field266 != null && (class15.field266.field6073 - ((class15.field266.method2241(-68) - 1) * 64) >> 7) == class127.field2172 && class15.field266.field6078 - ((class15.field266.method2241(-124) - 1) * 64) >> 7 == class205.field3284) {
                class127.field2172 = -1;
                class205.field3284 = -1;
                class174.method1202(15);
            }
            class133.method1017(-123);
            if (!arg4) {
                class289.method1822(-123);
            }
            class169.method1188(1024);
            class103.method898(92, arg1, arg0, arg2, arg5, arg3);
            int var6 = class107.field1975;
            int var7 = class460.field6858;
            int var8 = class9.field136;
            int var9 = class410.field6199;
            if (class510.field7435 == 1) {
                int var12 = (int) class113.field2041;
                if (var12 < class278.field4190 >> 8) {
                    var12 = class278.field4190 >> 8;
                }
                if (class122.field2128[4] && var12 < class218.field3418[4] + 128) {
                    var12 = class218.field3418[4] + 128;
                }
                int var13 = (int) class525.field7631 + class496.field7276 & 0x3FFF;
                class406.method2522((byte) -62, class483.method2899(class211.field3371, class15.field266.field6073, class15.field266.field6078, !arg1) - 50, var9, var13, class376.field5501, class215.field3402, (var12 >> 3) * 3 + 600 << 0, var12);
            } else if (class510.field7435 == 4) {
                int var10 = (int) class113.field2041;
                if ((class278.field4190 >> 8) > var10) {
                    var10 = class278.field4190 >> 8;
                }
                if (class122.field2128[4] && class218.field3418[4] + 128 > var10) {
                    var10 = class218.field3418[4] + 128;
                }
                int var11 = (int) class525.field7631 & 0x3FFF;
                class406.method2522((byte) -62, class483.method2899(class211.field3371, class344.field5142, class388.field5798, !arg1) - 50, var9, var11, class376.field5501, class215.field3402, (var10 >> 3) * 3 + 600 << 0, var10);
            } else if (class510.field7435 == 5) {
                class473.method2822(!arg1, var9);
            }
            int var14 = class509.field7427;
            int var15 = class428.field6406;
            int var16 = class432.field6435;
            int var17 = class41.field577;
            int var18 = class139.field2325;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class122.field2128[var19]) {
                    int var22 = (int) ((double) (-class19.field310[var19]) + Math.random() * (double) (class19.field310[var19] * 2 + 1) + Math.sin((double) class102.field1938[var19] / 100.0D * (double) class447.field6648[var19]) * (double) class218.field3418[var19]);
                    if (var19 == 3) {
                        class139.field2325 = class139.field2325 + var22 & 0x3FFF;
                    }
                    if (var19 == 0) {
                        class509.field7427 += var22;
                    }
                    if (var19 == 2) {
                        class432.field6435 += var22;
                    }
                    if (var19 == 4) {
                        class41.field577 += var22;
                        if (class41.field577 < 1024) {
                            class41.field577 = 1024;
                        } else if (class41.field577 > 3072) {
                            class41.field577 = 3072;
                        }
                    }
                    if (var19 == 1) {
                        class428.field6406 += var22;
                    }
                }
            }
            if (class509.field7427 < 0) {
                class509.field7427 = 0;
            }
            if (class509.field7427 > (class493.field7231 << 7) - 1) {
                class509.field7427 = (class493.field7231 << 7) - 1;
            }
            if (class432.field6435 < 0) {
                class432.field6435 = 0;
            }
            if ((class220.field3464 << 7) - 1 < class432.field6435) {
                class432.field6435 = (class220.field3464 << 7) - 1;
            }
            class372.method2286((byte) -123);
            class119.method965(3443);
            class262.field4006.method371(var7, var8, var6 + var7, var8 + var9);
            class262.field4006.method388();
            int var20 = class91.field1818;
            if (class299.field4519 == null) {
                class262.field4006.method294(var20);
            } else {
                class299.field4519.method2827(class262.field4006, var7, class41.field577, var9, var20, var6, var8, -54, class139.field2325, class284.field4276 << 3);
            }
            class42.method255(72);
            class123.field2143.method839(class509.field7427, class428.field6406, class432.field6435, -class41.field577 & 0x3FFF, -class139.field2325 & 0x3FFF, -class311.field4707 & 0x3FFF);
            class262.field4006.method326(class123.field2143);
            class262.field4006.method324(var6 / 2 + var7, var9 / 2 + var8, class36.field545 << 1, class36.field545 << 1);
            class244.method1590(class36.field545 << 1, var9 / 2 + var8, class36.field545 << 1, 111, var6 / 2 + var7);
            class454.method2714(!arg1, class432.field6435, class428.field6406, class509.field7427, -class311.field4707 & 0x3FFF, -class41.field577 & 0x3FFF, -class139.field2325 & 0x3FFF);
            byte var21 = class186.field2990.method1781(class133.field2236, -86) == 2 ? (byte) class184.field2958 : 1;
            class445.method2661(class262.field4006, class62.field1268, class327.field4949, class123.field2143, class509.field7427, class428.field6406, class432.field6435, class249.field3848, class50.field1008, class321.field4904, class403.field6086, class464.field6884, class322.field4925, class15.field266.field6084 + 1, var21, class15.field266.field6073 >> 7, class15.field266.field6078 >> 7, !class186.field2990.field2543);
            class42.method255(57);
            if (class466.field6932 == 9) {
                class372.method2285(256, var7, 256, var6, 123, var9, var8);
                class119.method964(256, var9, var7, var6, -118, 256, var8);
                class456.method2722(var7, 256, var6, 256, var9, var8, false);
                class246.method1596(var8, 100, var7, var6, var9);
            }
            class81.method743();
            class509.field7427 = var14;
            class432.field6435 = var16;
            class139.field2325 = var18;
            class428.field6406 = var15;
            class41.field577 = var17;
            if (class470.field6984 && class450.field6699.method1730(-104) == 0) {
                class470.field6984 = false;
            }
            if (class470.field6984) {
                class262.field4006.method1809(var8, var7, -16777216, var9, var6, -7456);
                class361.method2216((byte) -59, false, class470.field6980, class166.field2685.method1977(class146.field2452, -63));
            }
        } else {
            class262.field4006.method1809(arg5, arg2, -16777216, arg3, arg0, -7456);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Lmv;")
    public static final class255 method511(int arg0) {
        class21.field328 = 0;
        field1190++;
        if (arg0 < 24) {
            field1188 = null;
        }
        return class387.method2373(-127);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
    public static void method512(int arg0) {
        if (arg0 != 16383) {
            field1191 = null;
        }
        field1188 = null;
        field1191 = null;
    }

    static {
        new class309(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field1191 = new boolean[8];
    }
}
