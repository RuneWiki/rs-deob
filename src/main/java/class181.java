import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class class181 extends class101 {

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field2400;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field2402 = 0;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Lmga;")
    public static class739 field2397 = new class739(7, 3);

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public int field2398;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Lke;")
    public static class625 field2401;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILaj;II)Lwr;")
    public static final class485 method1256(int arg0, class333 arg1, int arg2, int arg3) {
        field2396++;
        class376 var4 = new class376(arg1.method2095(arg2, arg3, arg0 ^ 0x1));
        class485 var5 = new class485(arg2, var4.method2379((byte) 85), var4.method2379((byte) 85), var4.method2384(arg0 + 18), var4.method2384(42), var4.method2398(-1372747256) == 1, var4.method2398(-1372747256), var4.method2398(-1372747256));
        int var6 = var4.method2398(arg0 - 1372747256);
        for (int var7 = arg0; var7 < var6; var7++) {
            var5.field6705.method2545(-127, new class414(var4.method2398(arg0 ^ -1372747256), var4.method2359(-1), var4.method2359(-1), var4.method2359(-1), var4.method2359(~arg0), var4.method2359(arg0 - 1), var4.method2359(-1), var4.method2359(-1), var4.method2359(-1)));
        }
        var5.method2817(arg0 + 31208);
        return var5;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public abstract void method387(OggPacket arg0, byte arg1);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z[[[BIBIIZ)V")
    public static final void method1257(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class16.field235 = 0;
        class455.field6321 = 0;
        class423.field6044++;
        if ((arg5 & 0x2) == 0) {
            for (class167 var8 = class308.field4450[var7]; var8 != null; var8 = var8.field2252) {
                if (!class383.method2438(var8, arg0, arg1, arg2, arg3)) {
                    class237.method1535(var8);
                    if (var8.field2253 != -1) {
                        class78.field1117[class16.field235++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 0x1) == 0) {
            for (class167 var9 = class563.field7549[var7]; var9 != null; var9 = var9.field2252) {
                if (!class383.method2438(var9, arg0, arg1, arg2, arg3)) {
                    class237.method1535(var9);
                    if (var9.field2253 != -1) {
                        class122.field1784[class455.field6321++] = var9;
                    }
                }
            }
            for (class167 var10 = class503.field6961[var7]; var10 != null; var10 = var10.field2252) {
                if (!class383.method2438(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method21(0)) {
                        class237.method1535(var10);
                        if (var10.field2253 != -1) {
                            class122.field1784[class455.field6321++] = var10;
                        }
                    } else {
                        class237.method1535(var10);
                        if (var10.field2253 != -1) {
                            class78.field1117[class16.field235++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class186.field2480; var11++) {
                    if (!class383.method2438(class200.field2657[var11], arg0, arg1, arg2, arg3)) {
                        class237.method1535(class200.field2657[var11]);
                        if (class200.field2657[var11].field2253 != -1) {
                            if (class200.field2657[var11].method21(0)) {
                                class122.field1784[class455.field6321++] = class200.field2657[var11];
                            } else {
                                class78.field1117[class16.field235++] = class200.field2657[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class16.field235 > 0) {
            class647.method3614(class78.field1117, 0, class16.field235 - 1);
            for (int var12 = 0; var12 < class16.field235; var12++) {
                class198.method1357(class78.field1117[var12], true, arg6);
            }
        }
        if (class546.field7395) {
            class192.field2582.method486(0, null);
        }
        if ((arg5 & 0x2) == 0) {
            for (int var13 = class564.field7562; var13 < class315.field4541; var13++) {
                if (var13 < arg2 || arg1 == null) {
                    int var23 = class79.field1122.length;
                    if (class79.field1122.length + class402.field5850 > class405.field5875) {
                        var23 -= class79.field1122.length + class402.field5850 - class405.field5875;
                    }
                    int var24 = class79.field1122[0].length;
                    if (class79.field1122[0].length + class391.field5697 > class710.field9947) {
                        var24 -= class79.field1122[0].length + class391.field5697 - class710.field9947;
                    }
                    boolean[][] var25 = class245.field3316;
                    if (class269.field3967) {
                        if (class238.field3214) {
                            var25 = class603.field8203[var13];
                        }
                        for (int var26 = class366.field5328; var26 < var23; var26++) {
                            int var27 = class402.field5850 + var26 - class366.field5328;
                            for (int var28 = class453.field6297; var28 < var24; var28++) {
                                if (class79.field1122[var26][var28] && !class267.method1744(var27, class391.field5697 + var28 - class453.field6297, var13, 19322)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class238.field3214) {
                        if (arg4 >= 0) {
                            class528.field7227[var13].method1137(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class528.field7227[var13].method1146(0, 0, 0, null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class695.field9751; var29++) {
                            class398.field5838[var29].method3136(new class200(var13 + 1), 22951);
                        }
                    } else if (arg4 >= 0) {
                        class528.field7227[var13].method1137(class331.field4776, class76.field1102, class174.field2337, class245.field3316, true, arg4, arg5);
                    } else {
                        class528.field7227[var13].method1146(class331.field4776, class76.field1102, class174.field2337, class245.field3316, true, arg5);
                    }
                } else {
                    int var14 = class79.field1122.length;
                    if (class79.field1122.length + class402.field5850 > class405.field5875) {
                        var14 -= class79.field1122.length + class402.field5850 - class405.field5875;
                    }
                    int var15 = class79.field1122[0].length;
                    if (class79.field1122[0].length + class391.field5697 > class710.field9947) {
                        var15 -= class79.field1122[0].length + class391.field5697 - class710.field9947;
                    }
                    boolean[][] var16 = class245.field3316;
                    if (class269.field3967) {
                        if (class238.field3214) {
                            var16 = class603.field8203[var13];
                        }
                        for (int var17 = class366.field5328; var17 < var14; var17++) {
                            int var18 = class402.field5850 + var17 - class366.field5328;
                            for (int var19 = class453.field6297; var19 < var15; var19++) {
                                var16[var17][var19] = false;
                                if (class79.field1122[var17][var19]) {
                                    int var20 = class391.field5697 + var19 - class453.field6297;
                                    for (int var21 = var13; var21 >= 0; var21--) {
                                        if (class626.field8501[var21][var18][var20] != null && class626.field8501[var21][var18][var20].field3275 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class267.method1744(var18, var20, var13, 19322)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class238.field3214) {
                        if (arg4 >= 0) {
                            class528.field7227[var13].method1137(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class528.field7227[var13].method1146(0, 0, 0, null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class695.field9751; var22++) {
                            class398.field5838[var22].method3136(new class200(var13 + 1), 22951);
                        }
                    } else if (arg4 >= 0) {
                        class528.field7227[var13].method1137(class331.field4776, class76.field1102, class174.field2337, class245.field3316, false, arg4, arg5);
                    } else {
                        class528.field7227[var13].method1146(class331.field4776, class76.field1102, class174.field2337, class245.field3316, false, arg5);
                    }
                }
            }
        }
        if (class455.field6321 > 0) {
            class485.method2818(class122.field1784, 0, class455.field6321 - 1);
            for (int var30 = 0; var30 < class455.field6321; var30++) {
                class198.method1357(class122.field1784[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public abstract void method388(int arg0);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public static void method1258(boolean arg0) {
        field2397 = null;
        if (!arg0) {
            method1258(true);
        }
        field2401 = null;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class181(OggStreamState arg0) {
        this.field2400 = arg0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZLjagtheora/ogg/OggPacket;)V")
    public final void method1259(boolean arg0, OggPacket arg1) {
        field2399++;
        this.method387(arg1, (byte) -13);
        if (arg0) {
            this.field2398++;
        }
    }
}
