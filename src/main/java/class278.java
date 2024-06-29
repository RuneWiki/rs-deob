import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class278 {

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "Z")
    public boolean field4475 = true;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public int field4471 = 0;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "Z")
    public boolean field4487 = true;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "I")
    public int field4486 = 1190717;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    public int field4479 = 16;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "Z")
    public boolean field4489 = false;

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
    public int field4484 = -1;

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
    public int field4488 = 128;

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
    public int field4490 = -1;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "I")
    public int field4485 = 8;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public static int field4480 = 0;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field4472 = 2;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "Lak;")
    public static class172 field4476;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "Lha;")
    public static class328 field4474;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "Ljava/awt/Frame;")
    public static Frame field4482;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "[[B")
    public static byte[][] field4481;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 14)
    public static final void method2010(int arg0) {
        class212.field3472.method707(0);
        int var1 = -65 % ((arg0 + 30) / 62);
        field4478++;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V", line = 30)
    public static void method2011(byte arg0) {
        field4482 = null;
        field4476 = null;
        field4481 = (byte[][]) null;
        if (arg0 > 78) {
            field4474 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V", line = 44)
    public static final void method2012(int arg0, int arg1) {
        field4491++;
        if (class5.field75 == arg0) {
            return;
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (class5.field75 == 0) {
            class279.method2027(-62);
        }
        int var3 = -10 / ((arg1 - 6) / 46);
        if (arg0 == 40) {
            class62.method420(1);
        }
        if (arg0 != 40 && class323.field5006 != null) {
            class323.field5006.method91(-63);
            class323.field5006 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class89.field1230 = 0;
            class57.field812 = 1;
            class295.field4681 = 0;
            class38.field484 = 0;
            class173.field2870 = 1;
            class115.method793(true, (byte) -34);
        }
        if (arg0 == 25 || arg0 == 10) {
            class320.method2253((byte) 101);
        }
        if (arg0 == 5) {
            class222.method1580(false, class130.field2034);
        } else {
            class243.method1748((byte) -86);
        }
        boolean var4 = class5.field75 == 5 || class5.field75 == 10 || class5.field75 == 28;
        if (var4 != var2) {
            if (var2) {
                class108.field1584 = class236.field3773;
                if (class210.field3447 == 0) {
                    class164.method1204((byte) 15, 2);
                } else {
                    class83.method560(255, 0, 2, class243.field3846, (byte) 25, class236.field3773, false);
                }
                class286.field4589.method1365(83, false);
            } else {
                class164.method1204((byte) 15, 2);
                class286.field4589.method1365(123, true);
            }
        }
        if (class232.field3690 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            class232.method1684();
        }
        class5.field75 = arg0;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBLjj;)V", line = 123)
    public final void method2013(int arg0, byte arg1, class44 arg2) {
        if (arg1 != 107) {
            method2010(61);
        }
        field4483++;
        while (true) {
            int var4 = arg2.method286((byte) -120);
            if (var4 == 0) {
                return;
            }
            this.method2014(arg0, arg2, 1, var4);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjj;II)V", line = 151)
    private final void method2014(int arg0, class44 arg1, int arg2, int arg3) {
        field4477++;
        if (arg2 == arg3) {
            this.field4471 = class53.method341(arg2 ^ 0xFF00FF01, arg1.method273(arg2 - 867673065));
        } else if (arg3 == 2) {
            this.field4490 = arg1.method286((byte) -106);
        } else if (arg3 == 3) {
            this.field4490 = arg1.method271(21081);
            if (this.field4490 == 65535) {
                this.field4490 = -1;
            }
        } else if (arg3 == 5) {
            this.field4487 = false;
        } else if (arg3 == 7) {
            this.field4484 = class53.method341(-16711936, arg1.method273(-867673064));
        } else if (arg3 == 8) {
            class341.field5308 = arg0;
        } else if (arg3 == 9) {
            this.field4488 = arg1.method271(arg2 ^ 0x5258);
        } else if (arg3 == 10) {
            this.field4475 = false;
        } else if (arg3 == 11) {
            this.field4485 = arg1.method286((byte) -113);
        } else if (arg3 == 12) {
            this.field4489 = true;
        } else if (arg3 == 13) {
            this.field4486 = arg1.method273(-867673064);
        } else if (arg3 == 14) {
            this.field4479 = arg1.method286((byte) -126);
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)Lek;", line = 236)
    public static final class220 method2015(byte arg0) {
        field4473++;
        if (arg0 <= 81) {
            return (class220) null;
        }
        int var1 = class184.field3046[0] * class102.field1489[0];
        int[] var2 = new int[var1];
        byte[] var3 = field4481[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class205.field3370[client.method767(var3[var4], 255)];
        }
        class220 var5 = new class220(class303.field4757, class243.field3832, class270.field4364[0], class51.field732[0], class102.field1489[0], class184.field3046[0], var2);
        class106.method727(true);
        return var5;
    }
}
