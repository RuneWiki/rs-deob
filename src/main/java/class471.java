import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class471 {

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "Lsw;")
    private class641 field6600 = new class641(64);

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "Ldn;")
    private class438 field6595;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "Ldn;")
    public class438 field6598;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "Ldn;")
    public static class438 field6599;

    static {
        new class180("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field6601 = 0;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 4)
    public final void method2744(int arg0) {
        class641 var2 = this.field6600;
        synchronized (this.field6600) {
            this.field6600.method3694(0);
        }
        if (arg0 == 100) {
            field6594++;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BI)Lqp;", line = 18)
    public final class562 method2745(byte arg0, int arg1) {
        field6602++;
        class641 var3 = this.field6600;
        class562 var4;
        synchronized (this.field6600) {
            var4 = (class562) this.field6600.method3682(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 <= 122) {
            method2749(120);
        }
        class438 var5 = this.field6595;
        byte[] var6;
        synchronized (this.field6595) {
            var6 = this.field6595.method2558(100, arg1, 3);
        }
        class562 var7 = new class562();
        var7.field8259 = this;
        if (var6 != null) {
            var7.method3280((byte) 112, new class374(var6));
        }
        class641 var8 = this.field6600;
        synchronized (this.field6600) {
            this.field6600.method3684(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IB)V", line = 51)
    public static final void method2746(int arg0, byte arg1) {
        field6596++;
        int var2 = class335.field4358 - class87.field1047;
        if (var2 >= 100) {
            class617.field8931 = 1;
            return;
        }
        int var3 = (int) class588.field8527;
        if (class87.field1049 >> 8 > var3) {
            var3 = class87.field1049 >> 8;
        }
        if (class637.field9150[4] && (class520.field7309[4] + 128) > var3) {
            var3 = class520.field7309[4] + 128;
        }
        int var4 = (int) class558.field8223 + class330.field4305 & 0x3FFF;
        if (arg1 != 103) {
            return;
        }
        class618.method3554(var4, arg0, class485.field6788, var3, class426.method2400(-1, class103.field1265.field8652, class103.field1265.field8661, class442.field6099) - 50, class381.field5051, ((var3 >> 3) * 3) + 600 << 0, true);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class521.field7321 = (int) ((float) (class521.field7321 - class105.field1272) * var5 + (float) class105.field1272);
        class286.field3729 = (int) ((float) (class286.field3729 - class309.field3941) * var5 + (float) class309.field3941);
        class482.field6748 = (int) ((float) (class482.field6748 - class206.field2483) * var5 + (float) class206.field2483);
        class39.field303 = (int) ((float) (class39.field303 - class160.field1938) * var5 + (float) class160.field1938);
        int var6 = class168.field2055 - class560.field8242;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class168.field2055 = (int) ((float) var6 * var5 + (float) class560.field8242);
        class168.field2055 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V", line = 101)
    public final void method2747(int arg0, int arg1) {
        field6603++;
        if (arg1 >= -100) {
            this.field6600 = null;
        }
        class641 var3 = this.field6600;
        synchronized (this.field6600) {
            this.field6600.method3686((byte) 53, arg0);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)V", line = 115)
    public final void method2748(boolean arg0) {
        class641 var2 = this.field6600;
        synchronized (this.field6600) {
            this.field6600.method3687(1402);
        }
        field6597++;
        if (arg0) {
            method2749(-42);
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V", line = 137)
    public static void method2749(int arg0) {
        if (arg0 != 20468) {
            method2750(-122, -46, 74);
        }
        field6599 = null;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lre;ILdn;Ldn;)V", line = 171)
    public class471(class515 arg0, int arg1, class438 arg2, class438 arg3) {
        this.field6595 = arg2;
        this.field6598 = arg3;
        this.field6595.method2554(3, 127);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)I", line = 156)
    public static final int method2750(int arg0, int arg1, int arg2) {
        field6593++;
        if (arg1 != -3606) {
            field6599 = null;
        }
        return arg2 == 4 || arg2 == 5 ? class402.field5286[arg0 & 0x3] : 256;
    }
}
