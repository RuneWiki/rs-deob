import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class510 extends class598 {

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "Z")
    public boolean field7206 = false;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    private int field7209 = -32768;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    private int field7212 = 0;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    private int field7221 = 0;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    private int field7214 = -1;

    @OriginalMember(owner = "client!rj", name = "db", descriptor = "I")
    private int field7231 = 0;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "I")
    private int field7226;

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "I")
    public int field7229;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    private int field7207;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "Llk;")
    private class502 field7213;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "F")
    public static float field7222;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "Lts;")
    private class455 field7219;

    @OriginalMember(owner = "client!rj", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field7219 != null) {
            this.field7219.method2654();
        }
        ++field7227;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public static final void method2933(byte arg0) {
        class532.field7483.method2806(-1);
        ++field7224;
        int var1 = class532.field7483.method2813(8, -100);
        if (~var1 > ~class474.field6637) {
            for (int var2 = var1; ~class474.field6637 < ~var2; ++var2) {
                class250.field3225[class530.field7450++] = class194.field2345[var2];
            }
        }
        if (class474.field6637 < var1) {
            throw new RuntimeException("gnpov1");
        } else {
            class474.field6637 = 0;
            for (int var3 = 0; ~var3 > ~var1; ++var3) {
                int var4 = class194.field2345[var3];
                class459 var5 = ((class415) class309.field3938.method2645((long) var4, (byte) -120)).field5390;
                int var6 = class532.field7483.method2813(1, 109);
                if (~var6 == -1) {
                    class194.field2345[class474.field6637++] = var4;
                    var5.field6417 = class335.field4358;
                } else {
                    int var7 = class532.field7483.method2813(2, 99);
                    if (var7 == 0) {
                        class194.field2345[class474.field6637++] = var4;
                        var5.field6417 = class335.field4358;
                        class85.field1039[class594.field8624++] = var4;
                    } else if (var7 == 1) {
                        class194.field2345[class474.field6637++] = var4;
                        var5.field6417 = class335.field4358;
                        int var8 = class532.field7483.method2813(3, -105);
                        var5.method2672(false, var8, 1);
                        int var9 = class532.field7483.method2813(1, -37);
                        if (var9 == 1) {
                            class85.field1039[class594.field8624++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class194.field2345[class474.field6637++] = var4;
                        var5.field6417 = class335.field4358;
                        if (class532.field7483.method2813(1, -120) == 1) {
                            int var10 = class532.field7483.method2813(3, -58);
                            var5.method2672(false, var10, 2);
                            int var11 = class532.field7483.method2813(3, -38);
                            var5.method2672(false, var11, 2);
                        } else {
                            int var12 = class532.field7483.method2813(3, -88);
                            var5.method2672(false, var12, 0);
                        }
                        int var13 = class532.field7483.method2813(1, 100);
                        if (~var13 == -2) {
                            class85.field1039[class594.field8624++] = var4;
                        }
                    } else if (var7 == 3) {
                        class250.field3225[class530.field7450++] = var4;
                    }
                }
            }
            if (arg0 > -38) {
                method2933((byte) -5);
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
    public final void method2934(byte arg0) {
        if (arg0 != -20) {
            this.field7214 = -127;
        }
        ++field7210;
        if (this.field7219 != null) {
            this.field7219.method2654();
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILqa;II)Z")
    public final boolean method318(int arg0, class206 arg1, int arg2, int arg3) {
        ++field7217;
        if (arg0 != -21851) {
            this.method326(-63, (class206) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lqa;ILr;)V")
    private final void method2935(class206 arg0, int arg1, class157 arg2) {
        ++field7220;
        class55[] var4 = arg2.method59();
        class348[] var5 = arg2.method78();
        if ((this.field7219 == null || this.field7219.field6266) && (var4 != null || var5 != null)) {
            this.field7219 = class455.method2652(class335.field4358);
        }
        if (this.field7219 != null) {
            this.field7219.method2656(arg0, (long) class335.field4358, var4, var5, false);
            this.field7219.method2662(super.field8660, super.field8653, super.field8663, super.field8650, super.field8654);
        }
        if (arg1 != 23520) {
            this.field7214 = -60;
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(ILqa;)Loj;")
    public final class318 method320(int arg0, class206 arg1) {
        ++field7216;
        class157 var3 = this.method2937(this.field7207, arg1, (~this.field7221 != arg0 ? 5 : 0) | 2048, -48);
        if (var3 == null) {
            return null;
        } else {
            if (this.field7221 != 0) {
                var3.method92(this.field7221 * 2048);
            }
            class163 var4 = arg1.method1126();
            var4.method661(super.field8661, super.field8649, super.field8652);
            if (this.field7219 != null) {
                class400 var5 = this.field7219.method2650();
                arg1.method1177(var3, var5, var4, (class517) null, 0);
            } else {
                var3.method69(var4, (class517) null, 0);
            }
            this.field7209 = var3.method74();
            this.method2935(arg1, 23520, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field7226 = arg4;
        this.field7221 = arg12;
        this.field7229 = arg2 - -arg1;
        this.field7207 = arg0;
        class356 var14 = class344.field4461.method1393(64, this.field7207);
        int var15 = var14.field4667;
        if (var15 == -1) {
            this.field7206 = true;
        } else {
            this.field7213 = class393.field5190.method770(var15, -113);
            this.field7206 = false;
        }
        if (this.field7229 == arg2) {
            class614.method3532(super.field8660, this.field7213, true, super.field8652, this.field7231, false, super.field8661);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLoe;ILqa;III)V")
    public final void method312(boolean arg0, class170 arg1, int arg2, class206 arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 13915) {
            this.field7219 = null;
        }
        ++field7230;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
    public final void method2936(int arg0, int arg1) {
        if (arg0 == -1) {
            ++field7228;
            if (!this.field7206) {
                this.field7212 += arg1;
                while (this.field7213.field6952[this.field7231] < this.field7212) {
                    this.field7212 -= this.field7213.field6952[this.field7231];
                    ++this.field7231;
                    if (this.field7213.field6944.length <= this.field7231) {
                        this.field7206 = true;
                        break;
                    }
                }
                if (!this.field7206) {
                    class614.method3532(super.field8660, this.field7213, true, super.field8652, this.field7231, false, super.field8661);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)I")
    public final int method322(int arg0) {
        if (arg0 != 64) {
            return -65;
        } else {
            ++field7223;
            return this.field7209;
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)Z")
    public final boolean method317(int arg0) {
        ++field7215;
        return arg0 != 64;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(ILqa;II)Lr;")
    private final class157 method2937(int arg0, class206 arg1, int arg2, int arg3) {
        ++field7208;
        class356 var5 = class344.field4461.method1393(64, arg0);
        class174 var6 = class90.field1114[super.field8660];
        int var7 = -100 / ((40 - arg3) / 58);
        class174 var8 = ~this.field7226 <= -4 ? null : class90.field1114[this.field7226 + 1];
        return this.field7206 ? var5.method2009(0, -122, arg1, super.field8649, class393.field5190, arg2, super.field8661, -1, var6, super.field8652, true, var8, -1) : var5.method2009(this.field7212, -121, arg1, super.field8649, class393.field5190, arg2, super.field8661, this.field7214, var6, super.field8652, true, var8, this.field7231);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILqa;)V")
    public final void method326(int arg0, class206 arg1) {
        if (arg0 != 29657) {
            this.finalize();
        }
        ++field7218;
        class157 var3 = this.method2937(this.field7207, arg1, 0, arg0 ^ 29621);
        if (var3 != null) {
            this.method2935(arg1, 23520, var3);
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V")
    public final void method314(byte arg0) {
        if (arg0 <= 23) {
            this.method314((byte) -67);
        }
        ++field7225;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(ILqa;)Lso;")
    public final class398 method328(int arg0, class206 arg1) {
        ++field7211;
        return arg0 != 12 ? null : null;
    }

    static {
        new class180("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    }
}
