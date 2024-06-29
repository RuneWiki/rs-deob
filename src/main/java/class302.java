import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class302 {

    @OriginalMember(owner = "client!jfa", name = "n", descriptor = "B")
    public byte field4536;

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "[I")
    public int[] field4526;

    @OriginalMember(owner = "client!jfa", name = "o", descriptor = "[I")
    public int[] field4537;

    @OriginalMember(owner = "client!jfa", name = "p", descriptor = "B")
    public byte field4538;

    @OriginalMember(owner = "client!jfa", name = "j", descriptor = "[I")
    public int[] field4532;

    @OriginalMember(owner = "client!jfa", name = "q", descriptor = "S")
    public short field4539;

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "S")
    public short field4528;

    @OriginalMember(owner = "client!jfa", name = "l", descriptor = "S")
    public short field4534;

    @OriginalMember(owner = "client!jfa", name = "k", descriptor = "[S")
    public short[] field4533;

    @OriginalMember(owner = "client!jfa", name = "h", descriptor = "S")
    public short field4530;

    @OriginalMember(owner = "client!jfa", name = "i", descriptor = "[S")
    public short[] field4531;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "[S")
    public short[] field4524;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "[I")
    public static int[] field4527 = new int[50];

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!jfa", name = "m", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "[I")
    public static int[] field4523;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILrv;)Lfc;", line = 6)
    public static final class269 method2002(int arg0, class120 arg1) {
        field4525++;
        class336 var2 = class329.method2126(true)[arg1.method842(2384)];
        class185 var3 = class674.method3822(true)[arg1.method842(arg0 ^ 0xFFFFCEF0)];
        int var4 = arg1.method838(true);
        int var5 = arg1.method838(true);
        int var6 = arg1.method898((byte) -117);
        int var7 = arg1.method898((byte) -91);
        int var8 = arg1.method838(true);
        if (arg0 == -14432) {
            int var9 = arg1.method871(23995);
            int var10 = arg1.method871(arg0 + 38427);
            return new class269(var2, var3, var4, var5, var6, var7, var8, var9, var10);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V", line = 35)
    public static void method2003(int arg0) {
        field4527 = null;
        field4523 = null;
        if (arg0 != -9508) {
            method2003(-127);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIIILka;)Lpw;", line = 58)
    public static final class733 method2004(int arg0, int arg1, int arg2, int arg3, class495 arg4) {
        field4535++;
        if (arg4 == null) {
            return null;
        } else {
            if (arg2 >= -88) {
                method2002(77, null);
            }
            return new class733(arg0, arg3, arg1, arg4.method94(), arg4.method97(), arg4.method79(), arg4.method75(), arg4.method65(), arg4.method80(), arg4.method115());
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)V", line = 77)
    public static final void method2005(int arg0) {
        field4529++;
        int var1 = -101 % ((53 - arg0) / 57);
        if (class119.field1501 < 0) {
            return;
        }
        long var2 = class109.method731(60);
        class119.field1501 = (int) ((long) class119.field1501 - (var2 - class415.field5869));
        if (class119.field1501 > 0) {
            int var4 = (class119.field1501 << 8) / class585.field8270;
            int var5 = 255 - var4;
            float var6 = (float) var4 / 255.0F;
            float var7 = 1.0F - var6;
            class752.field10426 = ((class789.field10834 & 0xFF00FF) * var4 + (class709.field9998.field10057 & 0xFF00FF) * var5 & 0xFF00FF00) + ((class789.field10834 & 0xFF00) * var4 + (class709.field9998.field10057 & 0xFF00) * var5 & 0xFF0000) >>> 8;
            class788.field10828 = (class709.field9998.field10067 - class464.field6623) * var7 + class464.field6623;
            class577.field8146 = (class709.field9998.field10065 - class10.field231) * var7 + class10.field231;
            class452.field6512 = (class709.field9998.field10068 - class516.field7386) * var7 + class516.field7386;
            class566.field8014 = class502.field7179 * var4 + class709.field9998.field10069 * var5 >> 8;
            class553.field7874 = ((class223.field3201 & 0xFF00) * var4 + (class709.field9998.field10061 & 0xFF00) * var5 & 0xFF0000) + ((class223.field3201 & 0xFF00FF) * var4 + (class709.field9998.field10061 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8;
            class276.field3846 = (class709.field9998.field10062 - class61.field831) * var7 + class61.field831;
            class129.field1693 = (class709.field9998.field10059 - class52.field741) * var7 + class52.field741;
            class181.field2754 = (class709.field9998.field10058 - class461.field6591) * var7 + class461.field6591;
            if (class311.field4631 != class709.field9998.field10053) {
                class363.field5244 = class731.field10209.method507(class311.field4631, class709.field9998.field10053, var7, class363.field5244);
            }
        } else {
            class566.field8014 = class709.field9998.field10069;
            class788.field10828 = class709.field9998.field10067;
            class181.field2754 = class709.field9998.field10058;
            class363.field5244 = class709.field9998.field10053;
            class452.field6512 = class709.field9998.field10068;
            class119.field1501 = -1;
            class276.field3846 = class709.field9998.field10062;
            class129.field1693 = class709.field9998.field10059;
            class553.field7874 = class709.field9998.field10061;
            class752.field10426 = class709.field9998.field10057;
            class577.field8146 = class709.field9998.field10065;
        }
        class415.field5869 = var2;
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 137)
    public class302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field4536 = (byte) arg0;
        this.field4526 = new int[4];
        this.field4537 = new int[4];
        this.field4538 = (byte) arg1;
        this.field4532 = new int[4];
        this.field4532[3] = arg5;
        this.field4532[0] = arg2;
        this.field4532[1] = arg3;
        this.field4532[2] = arg4;
        this.field4526[3] = arg9;
        this.field4526[2] = arg8;
        this.field4526[0] = arg6;
        this.field4526[1] = arg7;
        this.field4537[1] = arg11;
        this.field4537[3] = arg13;
        this.field4539 = (short) (arg2 >> class310.field4616);
        this.field4537[2] = arg12;
        this.field4537[0] = arg10;
        this.field4528 = (short) (arg4 >> class310.field4616);
        this.field4534 = (short) (arg10 >> class310.field4616);
        this.field4533 = new short[4];
        this.field4530 = (short) (arg12 >> class310.field4616);
        this.field4531 = new short[4];
        this.field4524 = new short[4];
    }
}
