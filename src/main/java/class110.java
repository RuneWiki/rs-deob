import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class110 {

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "Lpca;")
    private class653 field1280 = new class653(64);

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "Ljo;")
    private class303 field1275;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "Lnq;")
    public static class420 field1273;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "[[[I")
    public static int[][][] field1270;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIB)Ldga;", line = 7)
    public static final class190 method683(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field1278++;
        long var7 = (long) arg4 * 76724863L ^ (long) arg1 * 986053L ^ (long) arg0 * 475427L ^ (long) arg5 * 97549L ^ (long) arg3 * 67481L ^ (long) arg2 * 32147369L;
        if (arg6 != 30) {
            field1270 = null;
        }
        class190 var9 = (class190) class207.field2516.method3690((byte) 122, var7);
        if (var9 == null) {
            class190 var10 = class14.field135.method365(arg3, arg5, arg0, arg1, arg2, arg4);
            class207.field2516.method3683(var10, (byte) -33, var7);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V", line = 30)
    public static void method684(byte arg0) {
        field1273 = null;
        field1270 = null;
        int var1 = 35 % ((-arg0 - 30) / 59);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V", line = 42)
    public final void method685(int arg0, int arg1) {
        field1279++;
        if (arg1 != 9) {
            field1270 = null;
        }
        class653 var3 = this.field1280;
        synchronized (this.field1280) {
            this.field1280.method3691(false, arg0);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 57)
    public final void method686(int arg0) {
        field1274++;
        class653 var2 = this.field1280;
        synchronized (this.field1280) {
            if (arg0 >= -24) {
                this.method687(false, 65);
            }
            this.field1280.method3687((byte) -10);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)Lew;", line = 70)
    public final class450 method687(boolean arg0, int arg1) {
        field1271++;
        class653 var3 = this.field1280;
        class450 var4;
        synchronized (this.field1280) {
            var4 = (class450) this.field1280.method3690((byte) 113, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class303 var5 = this.field1275;
        byte[] var6;
        synchronized (this.field1275) {
            var6 = this.field1275.method1719(arg1, 11, 4);
            if (arg0) {
                this.field1280 = null;
            }
        }
        class450 var7 = new class450();
        if (var6 != null) {
            var7.method2502(new class452(var6), 42);
        }
        class653 var8 = this.field1280;
        synchronized (this.field1280) {
            this.field1280.method3683(var7, (byte) -52, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V", line = 103)
    public final void method688(int arg0) {
        field1276++;
        class653 var2 = this.field1280;
        synchronized (this.field1280) {
            this.field1280.method3684(-17200);
            if (arg0 != 8480) {
                field1270 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V", line = 116)
    public static final void method689(int arg0) {
        field1277++;
        class466.method2647(2, 22050, 8, class601.field8530.field2840);
        class485.field7071 = new class106();
        class485.field7071.method647(9, 107, 128);
        class32.field358 = class335.method1892(class220.field2664, true, class623.field8837, 0, arg0);
        class32.field358.method717(class485.field7071, 16128);
        class183.method1064(class485.field7071, (byte) 96, class581.field8259, class639.field9069, class194.field2332);
        class600.field8522 = class335.method1892(class220.field2664, true, class623.field8837, 1, 2048);
        class424.field5641 = new class495();
        class600.field8522.method717(class424.field5641, arg0 ^ 0x6922);
        class607.field8572 = new class388(22050, class519.field7413);
        class21.field195 = class403.field5364.method1716(true, "scape main");
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Ljda;ILjo;)V", line = 158)
    public class110(class207 arg0, int arg1, class303 arg2) {
        this.field1275 = arg2;
        if (this.field1275 != null) {
            this.field1275.method1727(-77, 11);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIII)V", line = 138)
    public static final void method690(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg4; var5 < class675.field9572; var5++) {
            Rectangle var6 = class382.field5060[var5];
            if (var6.x + var6.width > arg3 && arg2 + arg3 > var6.x && var6.y + var6.height > arg1 && var6.y < (arg0 + arg1)) {
                class663.field9429[var5] = true;
            }
        }
        field1272++;
    }
}
