import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class191 extends class308 {

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    private int field2965 = -1;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    private int field2967 = 0;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    private int field2966;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2959 = "Loading wordpack - ";

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field2963 = 0;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public static int field2964 = 0;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "[[B")
    public static byte[][] field2968 = new byte[50][];

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V", line = 7)
    public static void method1317(byte arg0) {
        field2968 = (byte[][]) null;
        if (arg0 != -41) {
            field2964 = 11;
        }
        field2959 = null;
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)V", line = 22)
    public static final void method1318(int arg0) {
        field2962++;
        class171.method1179();
        class105.method698(-102);
        class262.method1840((byte) 29);
        class35.field533.method1547(64);
        class52.field797 = new class202();
        ((class55) class272.field4467).method396(arg0 ^ 0x1001E);
        class174.method1204();
        class254.field4039 = 0;
        class254.field4032 = new class241[255];
        class22.method161();
        class149.method1063();
        class59.method434((byte) 41);
        class183.method1270(false, -1);
        class111.method738(-106);
        class256.method1820((byte) 119);
        for (int var1 = 0; var1 < 2048; var1++) {
            class39 var2 = class130.field1984[var1];
            if (var2 != null) {
                var2.field4739 = null;
            }
        }
        if (class245.field3886) {
            class149.method1070(104, 104);
            class91.method599(class201.field3094, -13678);
            class145.method1034();
        }
        class23.method209(arg0 - 3182, class71.field1099, class69.field1073);
        class120.method776((byte) -70, class69.field1073);
        class125.field1872 = null;
        class293.field4849 = null;
        class280.field4612 = null;
        class94.field1377 = null;
        class339.field5456 = null;
        if (class346.field5553 == 5) {
            class285.method2014(arg0 ^ 0x1E, class69.field1073);
        }
        if (class346.field5553 == 10) {
            class203.method1384(-89, false);
        }
        if (~class346.field5553 == arg0) {
            class310.method2165(arg0 + 36, 25);
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V", line = 84)
    public static final void method1319(byte arg0) {
        field2958++;
        int var1 = class223.field3455;
        int var2 = class182.field2829 - class243.field3838 - var1;
        int var3 = class198.field3042;
        int var4 = class107.field1535 - var3 - class233.field3712;
        if (var3 > 0 || var4 > 0 || var1 > 0 || var2 > 0) {
            try {
                Container var5;
                if (class296.field4907 != null) {
                    var5 = class296.field4907;
                } else if (class217.field3350 == null) {
                    var5 = class96.field1382.field4515;
                } else {
                    var5 = class217.field3350;
                }
                int var6 = 0;
                int var7 = 0;
                if (class217.field3350 == var5) {
                    Insets var8 = class217.field3350.getInsets();
                    var7 = var8.top;
                    var6 = var8.left;
                }
                Graphics var9 = var5.getGraphics();
                var9.setColor(Color.black);
                if (var3 > 0) {
                    var9.fillRect(var6, var7, var3, class182.field2829);
                }
                if (var1 > 0) {
                    var9.fillRect(var6, var7, class107.field1535, var1);
                }
                if (var4 > 0) {
                    var9.fillRect(class107.field1535 + var6 - var4, var7, var4, class182.field2829);
                }
                if (var2 > 0) {
                    var9.fillRect(var6, class182.field2829 + var7 - var2, class107.field1535, var2);
                }
            } catch (Exception var11) {
            }
        }
        if (arg0 > -84) {
            method1318(22);
        }
    }

    @OriginalMember(owner = "client!dg", name = "finalize", descriptor = "()V", line = 157)
    protected final void finalize() throws Throwable {
        field2969++;
        if (this.field2965 != -1) {
            class173.method1198(this.field2965, this.field2967, this.field2966);
            this.field2965 = -1;
            this.field2967 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I)V", line = 314)
    public class191(int arg0) {
        GL var2 = class245.field3884;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field2966 = class173.field2703;
        this.field2965 = var3[0];
        class245.method1729(this.field2965);
        int var4 = class272.field4474[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class173.field2704 += var6.limit() - this.field2967;
        this.field2967 = var6.limit();
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)V", line = 194)
    public final void method1320(byte arg0) {
        field2960++;
        int var2 = class341.method2405((byte) -18);
        if ((var2 & 0x1) == 0) {
            class245.method1729(this.field2965);
        }
        if (arg0 != -89) {
            method1319((byte) -117);
        }
        if ((var2 & 0x2) == 0) {
            class245.method1721(0);
        }
        if ((var2 & 0x4) == 0) {
            class245.method1709(0);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([I[IZLod;[I)V", line = 222)
    public static final void method1321(int[] arg0, int[] arg1, boolean arg2, class233 arg3, int[] arg4) {
        field2961++;
        if (!arg2) {
            return;
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg1[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var6 != 0 && arg3.field4771.length > var9) {
                if ((var6 & 0x1) != 0) {
                    if (var8 == -1) {
                        arg3.field4771[var9] = null;
                    } else {
                        class131 var10 = class68.method476((byte) 82, var8);
                        int var11 = var10.field2004;
                        class223 var12 = arg3.field4771[var9];
                        if (var12 != null) {
                            if (var12.field3450 == var8) {
                                if (var11 == 0) {
                                    var12 = arg3.field4771[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3452 = 1;
                                    var12.field3445 = 0;
                                    var12.field3456 = 0;
                                    var12.field3451 = 0;
                                    var12.field3438 = var7;
                                    class276.method1970(var10, false, arg3.field4783, 112, arg3.field4796, 0);
                                } else if (var11 == 2) {
                                    var12.field3456 = 0;
                                }
                            } else if (var10.field2011 >= class68.method476((byte) 90, var12.field3450).field2011) {
                                var12 = arg3.field4771[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class223 var13 = arg3.field4771[var9] = new class223();
                            var13.field3450 = var8;
                            var13.field3445 = 0;
                            var13.field3456 = 0;
                            var13.field3452 = 1;
                            var13.field3438 = var7;
                            var13.field3451 = 0;
                            class276.method1970(var10, false, arg3.field4783, 80, arg3.field4796, 0);
                        }
                    }
                }
                var9++;
                var6 >>>= 0x1;
            }
        }
    }
}
