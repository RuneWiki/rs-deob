import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class322 {

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public int field4593;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public int field4592;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public int field4590;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public int field4605;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "B")
    public byte field4603;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "Ldn;")
    public class322 field4599;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public static int field4597 = 0;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public int field4588;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public int field4589;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public int field4591;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public int field4594;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public int field4596;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public int field4600;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public int field4602;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public int field4607;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    public int field4608;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1992(int arg0) {
        field4604++;
        if (class159.field2079 != null) {
            class159.field2079.method243(-1);
            class159.field2079 = null;
        }
        class215.method1350(arg0 + 8108);
        class42.method318();
        for (int var1 = 0; var1 < 4; var1++) {
            class119.field1605[var1].method932((byte) -107);
        }
        class282.method1801(0, false);
        System.gc();
        class164.method1016((byte) 34, arg0);
        class280.field4128 = -1;
        class164.field2139 = false;
        class417.method2694(4, true);
        class93.field1276 = 0;
        class54.field806 = false;
        class184.field2482 = 0;
        class38.field620 = 0;
        class249.field3539 = 0;
        for (int var2 = 0; var2 < class314.field4503.length; var2++) {
            class314.field4503[var2] = null;
        }
        class191.field2662 = 0;
        class153.field2004 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class125.field1664[var3] = null;
            class165.field2155[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class23.field408[var4] = null;
        }
        class231.field3261.method952(112);
        class107.method744(0);
        class420.field6243 = 0;
        class191.method1185((byte) -9);
        class333.method2212(false);
        client.method1567(121);
        class398.method2596(true, (byte) 123);
        try {
            class67.method434(class361.field5285.field29, (byte) -100, "loggedout");
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 76)
    public static final void method1993(byte arg0) {
        field4606++;
        class232.field3279.field3915 = 0;
        class227.field3199 = -1;
        class413.field6176 = 0;
        class313.field4484 = -1;
        class84.field1166 = 0;
        class114.field1556.field3915 = 0;
        class161.field2102 = -1;
        class188.field2551 = -1;
        class127.field1688 = 0;
        class272.method1745(-122);
        class336.method2232(-57);
        for (int var1 = 0; var1 < class125.field1664.length; var1++) {
            if (class125.field1664[var1] != null) {
                class125.field1664[var1].field230 = -1;
            }
        }
        if (arg0 <= 38) {
            method1993((byte) 31);
        }
        for (int var2 = 0; var2 < class23.field408.length; var2++) {
            if (class23.field408[var2] != null) {
                class23.field408[var2].field230 = -1;
            }
        }
        class372.method2449(false);
        class5.field48 = 1;
        class199.method1251(30, (byte) 125);
        for (int var3 = 0; var3 < 100; var3++) {
            class85.field1178[var3] = true;
        }
        class106.method735(-111);
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)V", line = 155)
    public static final void method1994(byte arg0) {
        class323.field4623 = class256.method1618(8, 8, 2048, 35, 4, true, true, 0.4F);
        field4598++;
        int var1 = 88 % ((50 - arg0) / 63);
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V", line = 179)
    public static final void method1995(int arg0) {
        class360.field5280.method204((byte) 56);
        if (arg0 != -27129) {
            field4597 = -59;
        }
        field4601++;
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(IIIIB)V", line = 190)
    public class322(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field4593 = arg3;
        this.field4592 = arg1;
        this.field4590 = arg0;
        this.field4605 = arg2;
        this.field4603 = arg4;
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ldn;I)V", line = 201)
    public class322(class322 arg0, int arg1) {
        this.field4599 = arg0;
        this.field4605 = this.field4599.field4605 + arg1;
        this.field4590 = this.field4599.field4590;
        this.field4603 = this.field4599.field4603;
        this.field4593 = this.field4599.field4593 + arg1;
        this.field4592 = this.field4599.field4592 + arg1;
    }
}
