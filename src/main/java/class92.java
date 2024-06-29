import java.io.IOException;
import java.io.OutputStream;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class92 extends OutputStream {

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "S")
    public static short field1205 = 205;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field1208 = 0;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "Z")
    public static boolean field1209 = false;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Lnk;")
    public static class16 field1204;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "Lnk;")
    public static class16 field1207;

    @OriginalMember(owner = "client!vl", name = "write", descriptor = "(I)V", line = 6)
    public final void write(int arg0) throws IOException {
        field1206++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 25)
    public static final void method573(int arg0) {
        int var1 = class93.field1233.method1692(class110.field1513);
        field1211++;
        for (int var2 = 0; var2 < class74.field924; var2++) {
            int var3 = class93.field1233.method1692(class2.method14(var2, true));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        int var4 = class74.field924 * 15 + 21;
        var1 += 8;
        int var5 = class190.field2851;
        if ((var4 + var5) > class95.field1307) {
            var5 = class95.field1307 - var4;
        }
        if (~var5 > arg0) {
            var5 = 0;
        }
        int var6 = class344.field5450 - (var1 / 2);
        if ((var1 + var6) > class165.field2546) {
            var6 = class165.field2546 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class302.field4708 == 1) {
            if (class78.field1026 == class344.field5450 && class327.field5237 == class190.field2851) {
                class38.field437 = true;
                class151.field2399 = var5;
                class302.field4708 = 0;
                class251.field3977 = (class161.field2481 ? 26 : 22) + class74.field924 * 15;
                class357.field5669 = var6;
                class257.field4073 = var1;
            }
        } else if (class344.field5450 == class301.field4694 && class190.field2851 == class19.field223) {
            class251.field3977 = (class161.field2481 ? 26 : 22) + class74.field924 * 15;
            class38.field437 = true;
            class151.field2399 = var5;
            class257.field4073 = var1;
            class357.field5669 = var6;
            class302.field4708 = 0;
        } else {
            class78.field1026 = class301.field4694;
            class327.field5237 = class19.field223;
            class302.field4708 = 1;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V", line = 114)
    public static final void method574(int arg0) {
        field1210++;
        if (!class101.field1371) {
            return;
        }
        class323 var1 = class291.method2078(class225.field3393, class196.field2978, 0);
        if (var1 != null && var1.field5040 != null) {
            class185 var2 = new class185();
            var2.field2793 = var1;
            var2.field2789 = var1.field5040;
            class208.method1456(arg0 ^ 0xFFFFFBF9, var2);
        }
        class101.field1371 = false;
        if (arg0 != 8180) {
            field1208 = 69;
        }
        class161.field2479 = -1;
        class107.method693(var1, 6);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III[[[BIBII)V", line = 149)
    public static final void method575(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class262.field4160++;
        class89.field1172 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class331.field5307; var12 < class196.field2973; var12++) {
            class196[][] var13 = class194.field2947[var12];
            for (int var14 = class185.field2788; var14 < class13.field133; var14++) {
                for (int var15 = class238.field3660; var15 < class294.field4629; var15++) {
                    class196 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class262.field4145[var14 + class2.field26 - class282.field4461][var15 + class2.field26 - class55.field652] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field2983 = true;
                            var16.field3000 = true;
                            if (var16.field2979 > 0) {
                                var16.field2984 = true;
                            } else {
                                var16.field2984 = false;
                            }
                            class89.field1172++;
                        } else {
                            var16.field2983 = false;
                            var16.field3000 = false;
                            var16.field3002 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field2999 != null) {
                                    class123 var17 = var16.field2999;
                                    var17.field1697.method408(0, var12, var17.field1698, var17.field1688, var17.field1695);
                                    if (var17.field1705 != null) {
                                        var17.field1705.method408(0, var12, var17.field1698, var17.field1688, var17.field1695);
                                    }
                                }
                                if (var16.field2994 != null) {
                                    class54 var18 = var16.field2994;
                                    var18.field630.method408(var18.field631, var12, var18.field625, var18.field624, var18.field622);
                                    if (var18.field632 != null) {
                                        var18.field632.method408(var18.field631, var12, var18.field625, var18.field624, var18.field622);
                                    }
                                }
                                if (var16.field3003 != null) {
                                    class360 var19 = var16.field3003;
                                    var19.field5697.method408(0, var12, var19.field5702, var19.field5698, var19.field5694);
                                }
                                if (var16.field2998 != null) {
                                    for (int var20 = 0; var20 < var16.field2979; var20++) {
                                        class44 var21 = var16.field2998[var20];
                                        var21.field494.method408(var21.field496, var12, var21.field499, var21.field503, var21.field509);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class72.field902 == class349.field5572;
        if (class272.field4317) {
            GL var23 = class272.field4310;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class182.method1255();
                class11.method69(-110, -1, 3);
                class128.field1875 = true;
                class167.method1188();
                class357.field5671 = -1;
                class311.field4881 = -1;
                for (int var24 = 0; var24 < class69.field866[0].length; var24++) {
                    class175 var25 = class69.field866[0][var24];
                    float var26 = 251.5F - (var25.field2657 ? 1.0F : 0.5F);
                    if (class357.field5671 != var25.field2637) {
                        class357.field5671 = var25.field2637;
                        class187.method1286(12506, var25.field2637);
                        class26.method196(class70.method439((byte) -70));
                    }
                    var25.method1220(class194.field2947, var26, false);
                }
                class167.method1187();
            } else {
                int var27 = class331.field5307;
                while (true) {
                    if (var27 >= class196.field2973) {
                        class195.method1369(class282.field4461, class55.field652, class194.field2947);
                        break;
                    }
                    for (int var28 = 0; var28 < class69.field866[var27].length; var28++) {
                        class175 var29 = class69.field866[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field2657 ? 1.0F : 0.5F);
                        if (var29.field2640 != -1 && class77.method497(class104.field1438.method892(21235, var29.field2640), (byte) 96) && class76.field993) {
                            class187.method1286(12506, var29.field2637);
                        }
                        var29.method1220(class194.field2947, var30, false);
                    }
                    if (var27 == 0 && class16.field164 > 0) {
                        class272.method1924(101.5F);
                        class358.method2475(class282.field4461, class55.field652, class2.field26, arg1, class262.field4145, class72.field902[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class331.field5307; var31 < class196.field2973; var31++) {
            class196[][] var32 = class194.field2947[var31];
            for (int var33 = -class2.field26; var33 <= 0; var33++) {
                int var34 = class282.field4461 + var33;
                int var35 = class282.field4461 - var33;
                if (var34 >= class185.field2788 || var35 < class13.field133) {
                    for (int var36 = -class2.field26; var36 <= 0; var36++) {
                        int var37 = class55.field652 + var36;
                        int var38 = class55.field652 - var36;
                        if (var34 >= class185.field2788) {
                            if (var37 >= class238.field3660) {
                                class196 var39 = var32[var34][var37];
                                if (var39 != null && var39.field2983) {
                                    class145.method1075(var39, true);
                                }
                            }
                            if (var38 < class294.field4629) {
                                class196 var40 = var32[var34][var38];
                                if (var40 != null && var40.field2983) {
                                    class145.method1075(var40, true);
                                }
                            }
                        }
                        if (var35 < class13.field133) {
                            if (var37 >= class238.field3660) {
                                class196 var41 = var32[var35][var37];
                                if (var41 != null && var41.field2983) {
                                    class145.method1075(var41, true);
                                }
                            }
                            if (var38 < class294.field4629) {
                                class196 var42 = var32[var35][var38];
                                if (var42 != null && var42.field2983) {
                                    class145.method1075(var42, true);
                                }
                            }
                        }
                        if (class89.field1172 == 0) {
                            if (!var22) {
                                class226.field3412 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class331.field5307; var43 < class196.field2973; var43++) {
            class196[][] var44 = class194.field2947[var43];
            for (int var45 = -class2.field26; var45 <= 0; var45++) {
                int var46 = class282.field4461 + var45;
                int var47 = class282.field4461 - var45;
                if (var46 >= class185.field2788 || var47 < class13.field133) {
                    for (int var48 = -class2.field26; var48 <= 0; var48++) {
                        int var49 = class55.field652 + var48;
                        int var50 = class55.field652 - var48;
                        if (var46 >= class185.field2788) {
                            if (var49 >= class238.field3660) {
                                class196 var51 = var44[var46][var49];
                                if (var51 != null && var51.field2983) {
                                    class145.method1075(var51, false);
                                }
                            }
                            if (var50 < class294.field4629) {
                                class196 var52 = var44[var46][var50];
                                if (var52 != null && var52.field2983) {
                                    class145.method1075(var52, false);
                                }
                            }
                        }
                        if (var47 < class13.field133) {
                            if (var49 >= class238.field3660) {
                                class196 var53 = var44[var47][var49];
                                if (var53 != null && var53.field2983) {
                                    class145.method1075(var53, false);
                                }
                            }
                            if (var50 < class294.field4629) {
                                class196 var54 = var44[var47][var50];
                                if (var54 != null && var54.field2983) {
                                    class145.method1075(var54, false);
                                }
                            }
                        }
                        if (class89.field1172 == 0) {
                            if (!var22) {
                                class226.field3412 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class226.field3412 = false;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V", line = 522)
    public static void method576(byte arg0) {
        field1207 = null;
        if (arg0 != 8) {
            method573(8);
        }
        field1204 = null;
    }
}
