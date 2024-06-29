import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class484 implements class574 {

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "Lut;")
    private class136 field6546;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
    public int field6549;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public int field6547;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "[I")
    public int[] field6541;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "Lcs;")
    private class361 field6548;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "[F")
    public float[] field6545;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public static int field6552 = 100;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)I", line = 9)
    public static final int method2765(int arg0, int arg1) {
        field6551++;
        int var2 = arg0 >>> 1;
        if (arg1 <= 16) {
            method2765(-86, 19);
        }
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZI)V", line = 29)
    public static final void method2766(boolean arg0, int arg1) {
        field6542++;
        if (arg0) {
            if (class359.field4911 != -1) {
                class657.method3694(class359.field4911, true);
            }
            for (class637 var2 = (class637) class186.field2881.method335(-29067); var2 != null; var2 = (class637) class186.field2881.method336(122)) {
                if (!var2.method1208(-109)) {
                    var2 = (class637) class186.field2881.method335(-29067);
                    if (var2 == null) {
                        break;
                    }
                }
                class305.method1954(true, var2, false, (byte) -24);
            }
            class359.field4911 = -1;
            class186.field2881 = new class46(8);
            class413.method2442((byte) 74);
            class359.field4911 = class33.field559;
            class386.method2349(0, false);
            class622.method3506(111);
            class76.method656(class359.field4911);
        }
        class753.field10403 = true;
        int var3 = -60 / ((arg1 + 11) / 56);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)I", line = 71)
    public static final int method2767(byte arg0) {
        if (arg0 < 81) {
            method2765(-26, 48);
        }
        field6550++;
        return class278.field3847 == 1 ? class256.field3597 : class547.field7439;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(IIIIIIZZ)V", line = 86)
    public final void method2768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class528.method3007(this.field6546.field2295.field5705, arg4, arg2, arg7 ? this.field6545 : null, this.field6541, arg3, arg1, false, arg7 ? this.field6546.field2336 : null, this.field6547, arg6 ? this.field6546.field2295.field5710 : null, arg0, arg5);
        field6543++;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIIZZ)V", line = 97)
    public final void method2769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field6544++;
        class528.method3007(this.field6547, arg4, arg2, arg7 ? this.field6546.field2336 : null, this.field6546.field2295.field5710, arg3, arg1, false, arg7 ? this.field6545 : null, this.field6546.field2295.field5705, arg6 ? this.field6541 : null, arg0, arg5);
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lut;Lnf;Lcs;)V", line = 111)
    public class484(class136 arg0, class604 arg1, class361 arg2) {
        this.field6546 = arg0;
        if (arg1 instanceof class75) {
            class75 var4 = (class75) arg1;
            this.field6549 = var4.field600;
            this.field6547 = var4.field606;
            this.field6541 = var4.field1072;
        } else if ((arg1 instanceof class134)) {
            class134 var5 = (class134) arg1;
            this.field6541 = var5.field2282;
            this.field6549 = var5.field600;
            this.field6547 = var5.field606;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field6548 = arg2;
            if (this.field6548.field4922 != this.field6547 || this.field6548.field4923 != this.field6549) {
                throw new RuntimeException();
            }
            this.field6545 = this.field6548.field4924;
        }
    }
}
