import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class class16 implements class354 {

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    private int field754 = -1;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    private int field762 = 0;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "Ljq;")
    public class475 field765;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    private int field759;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "Z")
    private boolean field767;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    private int field757;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    private int field769;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field761;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljaggl/MapBuffer;B)Z")
    public final boolean method379(MapBuffer arg0, byte arg1) {
        if (arg1 >= -42) {
            this.field762 = -21;
        }
        field770++;
        boolean var3 = true;
        if (this.field762 != 0) {
            if (this.field754 > 0) {
                OpenGL.glBindBufferARB(this.field759, this.field754);
                if (this.field762 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field759, 0, this.field769, this.field765.field7920.getAddress());
                } else {
                    var3 = arg0.method3329();
                }
            }
            this.field762 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)V")
    public void method380(int arg0, byte arg1) {
        if (arg0 > this.field769) {
            this.method383(arg1 + 18);
            if (this.field754 <= 0) {
                this.field761 = this.field765.method3246(false, arg0, (byte) -109);
            } else {
                OpenGL.glBindBufferARB(this.field759, this.field754);
                OpenGL.glBufferDataARBub(this.field759, arg0, null, 0, this.field767 ? 35040 : 35044);
                this.field765.field8094 += arg0 - this.field769;
            }
            this.field769 = arg0;
        }
        field764++;
        if (arg1 != -17) {
            this.method390((byte) -58);
        }
        this.field757 = arg0;
    }

    @OriginalMember(owner = "client!qk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method382((byte) 76);
        field760++;
        super.finalize();
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field750++;
        int var7 = class237.field3520;
        int[] var8 = class47.field1140;
        class662.field9536 = 0;
        for (int var9 = 0; var9 < (var7 + class363.field5389); var9++) {
            class334 var32 = null;
            class604 var33;
            if (var9 >= var7) {
                var33 = ((class436) class208.field3179.method2596((long) class367.field5444[var9 - var7], arg3 + 58)).field6298;
                var32 = ((class22) var33).field880;
                if (var32.field4984 != null) {
                    var32 = var32.method2150(class113.field2038, -32224);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class59.field1341[var8[var9]];
            }
            if (var33.field8759 >= 0 && (class705.field9922 == var33.field8698 || class532.field7456.field9814 == var33.field9814)) {
                class562.method3258(-9869, arg1, arg6, arg0 >> 1, arg5 >> 1, var33.method458(133), var33);
                if (class559.field7906[0] >= 0) {
                    if (var33.field8756 != null && (var7 <= var9 || class646.field9300 == 0 || class646.field9300 == 3 || class646.field9300 == 1 && class660.method3755(((class602) var33).field8631, false)) && class662.field9536 < class198.field3088) {
                        class198.field3079[class662.field9536] = class141.field2478.method286(var33.field8756, arg3 - 5133) / 2;
                        class198.field3085[class662.field9536] = class559.field7906[0];
                        class198.field3092[class662.field9536] = class559.field7906[1];
                        class198.field3084[class662.field9536] = var33.field8732;
                        class198.field3073[class662.field9536] = var33.field8754;
                        class198.field3083[class662.field9536] = var33.field8709;
                        class198.field3091[class662.field9536] = var33.field8756;
                        class662.field9536++;
                    }
                    int var34 = class559.field7906[1] + arg2;
                    int var45;
                    if (var33.field8718 || class336.field5031 >= var33.field8730) {
                        var45 = var34 - Math.max(class141.field2478.field575, class284.field4222[0].method1785());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var7 > var9) {
                            class602 var37 = class59.field1341[var8[var9]];
                            var38 = var33.method3465(arg3 ^ 0x14).field9499;
                            if (var37.field8645) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field4960;
                            if (var38 == -1) {
                                var38 = var33.method3465(0).field9499;
                            }
                        }
                        class702[] var39 = class284.field4222;
                        if (var38 != -1) {
                            class702[] var40 = (class702[]) class206.field3155.method1900((long) var38, -71);
                            if (var40 == null) {
                                class279[] var41 = class279.method1844(class632.field9092, var38, 0);
                                if (var41 != null) {
                                    var40 = new class702[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class623.field9017.method170(var41[var42], true);
                                    }
                                    class206.field3155.method1904(var40, (long) var38, -1);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class702 var43 = var39[0];
                        class702 var44 = var39[var36];
                        var45 = var34 - Math.max(class141.field2478.field575, var43.method1785());
                        int var46 = class559.field7906[0] + arg4 - (var43.method1792() >> 1);
                        int var47 = var43.method1792() * var33.field8765 / 255;
                        if (var33.field8765 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method3914(var46, var45);
                        class623.field9017.method144(var46, var45, var46 + var47, var43.method1785() + var45);
                        var44.method3914(var46, var45);
                        class623.field9017.method142(arg4, arg2, arg0 + arg4, arg2 + arg5);
                    }
                    var45 -= 2;
                    if (!var33.field8718) {
                        if (var33.field8742 > class336.field5031) {
                            class702 var48 = class468.field6621[var33.field8689 ? 2 : 0];
                            class702 var49 = class468.field6621[var33.field8689 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class22) {
                                var51 = var32.field4936;
                                if (var51 == -1) {
                                    var51 = var33.method3465(0).field9492;
                                }
                            } else {
                                var51 = var33.method3465(0).field9492;
                            }
                            if (var51 != -1) {
                                class702[] var52 = (class702[]) class183.field2943.method1900((long) var51, arg3 + 90);
                                if (var52 == null) {
                                    class279[] var53 = class279.method1844(class632.field9092, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class702[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class623.field9017.method170(var53[var54], true);
                                        }
                                        class183.field2943.method1904(var52, (long) var51, -1);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var49 = var52[var33.field8689 ? 3 : 1];
                                    var48 = var52[var33.field8689 ? 2 : 0];
                                }
                            }
                            int var55 = var33.field8742 - class336.field5031;
                            int var58;
                            if (var55 > var33.field8746) {
                                int var56 = var55 - var33.field8746;
                                int var57 = var33.field8701 == 0 ? 0 : (var33.field8708 - var56) / var33.field8701 * var33.field8701;
                                var58 = var48.method1792() * var57 / var33.field8708;
                            } else {
                                var58 = var48.method1792();
                            }
                            int var59 = var48.method1785();
                            var45 -= var59;
                            int var60 = class559.field7906[0] + (arg4 - (var48.method1792() >> 1));
                            var48.method3914(var60, var45);
                            class623.field9017.method144(var60, var45, var60 + var58, var45 + var59);
                            var49.method3914(var60, var45);
                            class623.field9017.method142(arg4, arg2, arg0 + arg4, arg2 + arg5);
                            var45 -= 2;
                        }
                        if (var9 < var7) {
                            class602 var61 = (class602) var33;
                            if (var61.field8624 != -1) {
                                var45 -= 25;
                                class515.field7295[var61.field8624].method3914(arg4 + class559.field7906[0] - 12, var45);
                                var45 -= 2;
                            }
                            if (var61.field8641 != -1) {
                                var45 -= 25;
                                class592.field8516[var61.field8641].method3914(arg4 + class559.field7906[0] - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field4980 >= 0 && var32.field4980 < class592.field8516.length) {
                            class702 var62 = class592.field8516[var32.field4980];
                            var45 -= 25;
                            var62.method3914(class559.field7906[0] + arg4 - (var62.method1792() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var33 instanceof class602)) {
                        int var63 = 0;
                        class539[] var64 = class565.field8254;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class539 var67 = var64[var65];
                            if (var67 != null && var67.field7539 == 1 && class367.field5444[var9 - var7] == var67.field7536) {
                                class702 var68 = class513.field7239[var67.field7528];
                                if (var63 < var68.method1785()) {
                                    var63 = var68.method1785();
                                }
                                if (class336.field5031 % 20 < 10) {
                                    var68.method3914(class559.field7906[0] + arg4 - 12, -var68.method1785() + var45);
                                }
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var69 = 0;
                        class539[] var70 = class565.field8254;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class539 var73 = var70[var71];
                            if (var73 != null && var73.field7539 == 10 && var8[var9] == var73.field7536) {
                                class702 var74 = class513.field7239[var73.field7528];
                                if (var74.method1785() > var69) {
                                    var69 = var74.method1785();
                                }
                                var74.method3914(class559.field7906[0] + arg4 - 12, var45 + -var74.method1785());
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    }
                    for (int var75 = 0; var75 < 4; var75++) {
                        if (class336.field5031 < var33.field8720[var75]) {
                            int var76 = var33.method458(133) / 2;
                            class562.method3258(arg3 - 9889, arg1, arg6, arg0 >> 1, arg5 >> 1, var76, var33);
                            if (class559.field7906[0] > -1) {
                                int var77 = class47.field1141[var33.field8716[var75]].method1792();
                                if (var75 == 1) {
                                    class559.field7906[1] -= 20;
                                }
                                if (var75 == 2) {
                                    class559.field7906[0] -= var77 - 9;
                                    class559.field7906[1] -= 10;
                                }
                                if (var75 == 3) {
                                    class559.field7906[1] -= 10;
                                    class559.field7906[0] += var77 - 9;
                                }
                                class47.field1141[var33.field8716[var75]].method3914(arg4 + class559.field7906[0] - (var77 >> 1), class559.field7906[1] + -12 + arg2);
                                class542.field7569.method2559(arg2 + class559.field7906[1] + 3, 0, arg4 + class559.field7906[0] - 1, Integer.toString(var33.field8767[var75]), 23610, -1);
                            }
                        }
                    }
                }
            }
        }
        if (arg3 != 20) {
            method381(64, -35, 59, -98, 104, -37, 69);
        }
        for (int var10 = 0; var10 < class706.field9936; var10++) {
            int var28 = class368.field5456[var10];
            class604 var29;
            if (var28 >= 2048) {
                var29 = ((class436) class208.field3179.method2596((long) (var28 - 2048), arg3 + 59)).field6298;
            } else {
                var29 = class59.field1341[var28];
            }
            int var30 = class445.field6411[var10];
            class604 var31;
            if (var30 >= 2048) {
                var31 = ((class436) class208.field3179.method2596((long) (var30 - 2048), arg3 ^ 0x70)).field6298;
            } else {
                var31 = class59.field1341[var30];
            }
            class367.method2320(arg1, arg5, arg2, false, arg6, arg0, arg4, --var29.field8692, var31, var29);
        }
        int var11 = class141.field2478.field575 + class141.field2478.field564 + 2;
        for (int var12 = 0; var12 < class662.field9536; var12++) {
            int var13 = class198.field3085[var12];
            int var14 = class198.field3092[var12];
            int var15 = class198.field3079[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if (var14 + 2 > class198.field3092[var27] + -var11 && class198.field3092[var27] + 2 > var14 - var11 && class198.field3085[var27] + class198.field3079[var27] > -var15 + var13 && class198.field3085[var27] - class198.field3079[var27] < var13 - -var15 && (class198.field3092[var27] - var11) < var14) {
                        var16 = true;
                        var14 = class198.field3092[var27] - var11;
                    }
                }
            }
            class198.field3092[var12] = var14;
            String var17 = class198.field3091[var12];
            if (class389.field5682 == 0) {
                int var18 = 16776960;
                if (class198.field3084[var12] < 6) {
                    var18 = class47.field1138[class198.field3084[var12]];
                }
                if (class198.field3084[var12] == 6) {
                    var18 = class705.field9922 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class198.field3084[var12] == 7) {
                    var18 = (class705.field9922 % 20) < 10 ? 255 : 65535;
                }
                if (class198.field3084[var12] == 8) {
                    var18 = (class705.field9922 % 20) < 10 ? 45056 : 8454016;
                }
                if (class198.field3084[var12] == 9) {
                    int var19 = 150 - class198.field3083[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 * 327680 - 16384000);
                    } else if (var19 < 150) {
                        var18 = 65280 - (500 - (var19 * 5));
                    }
                }
                if (class198.field3084[var12] == 10) {
                    int var20 = 150 - class198.field3083[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 * 327680 - 16384000);
                    } else if (var20 < 150) {
                        var18 = var20 * 327680 + 500 - (var20 * 5) - 32767745;
                    }
                }
                if (class198.field3084[var12] == 11) {
                    int var21 = 150 - class198.field3083[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = var21 * 327685 + 65280 - 16384250;
                    } else if (var21 < 150) {
                        var18 = 32768000 + 16777215 - (var21 * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class198.field3073[var12] == 0) {
                    class367.field5445.method2559(arg2 + var14, -16777216, arg4 + var13, var17, arg3 ^ 0x5C2E, var22);
                }
                if (class198.field3073[var12] == 1) {
                    class367.field5445.method2553(-16777216, var22, class705.field9922, var17, -119, arg2 + var14, arg4 + var13);
                }
                if (class198.field3073[var12] == 2) {
                    class367.field5445.method2565(var22, -16777216, var17, arg2 + var14, arg4 + var13, class705.field9922, (byte) 116);
                }
                if (class198.field3073[var12] == 3) {
                    class367.field5445.method2551(arg4 + var13, arg2 - -var14, 24719, -16777216, var17, 150 - class198.field3083[var12], class705.field9922, var22);
                }
                if (class198.field3073[var12] == 4) {
                    int var23 = (150 - class198.field3083[var12]) * (class141.field2478.method286(var17, -5113) + 100) / 150;
                    class623.field9017.method144(arg4 + var13 - 50, arg2, var13 + arg4 + 50, arg2 + arg5);
                    class367.field5445.method2558(var17, arg2 + var14, var22, arg4 + var13 + 50 - var23, (byte) -126, -16777216);
                    class623.field9017.method142(arg4, arg2, arg0 + arg4, arg2 - -arg5);
                }
                if (class198.field3073[var12] == 5) {
                    int var24 = 150 - class198.field3083[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class141.field2478.field575 + class141.field2478.field564;
                    class623.field9017.method144(arg4, arg2 + var14 - var26 - 1, arg0 + arg4, arg2 + var14 + 5);
                    class367.field5445.method2559(arg2 + var14 + var25, -16777216, arg4 + var13, var17, 23610, var22);
                    class623.field9017.method142(arg4, arg2, arg0 + arg4, arg2 + arg5);
                }
            } else {
                class367.field5445.method2559(arg2 + var14, -16777216, arg4 + var13, var17, 23610, -256);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
    public void method382(byte arg0) {
        field751++;
        if (arg0 <= 63) {
            method387(109, 24, (byte) 47);
        }
        if (this.field754 > 0) {
            this.field765.method2879(this.field757, 3, this.field754);
            this.field754 = -1;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
    private final void method383(int arg0) {
        if (arg0 != 1) {
            this.method383(-76);
        }
        field766++;
        if (this.field754 >= 0) {
            return;
        }
        if (this.field765.field6833) {
            OpenGL.glGenBuffersARB(1, class269.field4002, 0);
            this.field754 = class269.field4002[0];
            OpenGL.glBindBufferARB(this.field759, this.field754);
        } else {
            this.field754 = 0;
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)Ljava/lang/String;")
    public static final String method384(byte arg0) {
        field758++;
        if (arg0 != 96) {
            method381(26, -42, -76, -6, -56, 90, -8);
        }
        return class308.field4551 || class650.field9374 == null ? "" : class650.field9374.field4469;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljaclib/memory/Source;II)Z")
    public final boolean method385(Source arg0, int arg1, int arg2) {
        field752++;
        if (this.field769 < arg2) {
            this.method383(1);
            if (this.field754 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field759, this.field754);
            OpenGL.glBufferDataARBa(this.field759, arg2, arg0.getAddress(), this.field767 ? 35040 : 35044);
            this.field765.field8094 += arg2 - this.field757;
            this.field769 = arg2;
        } else if (this.field754 > 0) {
            OpenGL.glBindBufferARB(this.field759, this.field754);
            OpenGL.glBufferSubDataARBa(this.field759, 0, this.field757, arg0.getAddress());
            this.field765.field8094 += arg2 - this.field757;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field757 = arg2;
        if (arg1 != 1) {
            this.field769 = -106;
        }
        return true;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)I")
    public int method386(int arg0) {
        if (arg0 != 0) {
            this.method390((byte) 50);
        }
        field755++;
        return this.field757;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIB)V")
    public static final void method387(int arg0, int arg1, byte arg2) {
        field753++;
        if (arg2 != -62) {
            method387(108, 84, (byte) 82);
        }
        if (class78.field1573 == class49.field1167) {
            if (!class611.method3509(arg1, 0, -2, (byte) 127, 1, false, 0, arg0, 1)) {
                class611.method3509(arg1, 0, -3, (byte) 94, 1, false, 0, arg0, 1);
            }
        } else if (!class611.method3509(arg1, 0, -3, (byte) 108, 1, false, 0, arg0, 1)) {
            class611.method3509(arg1, 0, -2, (byte) 116, 1, false, 0, arg0, 1);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLjaggl/MapBuffer;Z)Ljaclib/memory/Buffer;")
    public final Buffer method388(byte arg0, MapBuffer arg1, boolean arg2) {
        field768++;
        if (this.field762 == 0) {
            this.method383(1);
            if (this.field754 <= 0) {
                this.field762 = 2;
                return this.field761;
            }
            OpenGL.glBindBufferARB(this.field759, this.field754);
            if (arg2) {
                OpenGL.glBufferDataARBub(this.field759, this.field769, null, 0, this.field767 ? 35040 : 35044);
                if (this.field757 <= this.field765.field7920.field9037) {
                    this.field762 = 1;
                    return this.field765.field7920;
                }
            }
            if (!arg1.method3327() && arg1.method3328(this.field759, this.field757, 35001)) {
                this.field762 = 2;
                return arg1;
            }
        }
        int var4 = 8 / ((arg0 + 42) / 46);
        return null;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Ljq;IZ)V")
    public class16(class475 arg0, int arg1, boolean arg2) {
        this.field765 = arg0;
        this.field759 = arg1;
        this.field767 = arg2;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
    public final void method389(int arg0) {
        if (this.field765.field6833) {
            OpenGL.glBindBufferARB(this.field759, this.field754);
        }
        if (arg0 != 19550) {
            this.method390((byte) 105);
        }
        field756++;
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(B)J")
    public final long method390(byte arg0) {
        if (arg0 != -17) {
            this.method389(-53);
        }
        field763++;
        return this.field754 == 0 ? this.field761.getAddress() : 0L;
    }
}
