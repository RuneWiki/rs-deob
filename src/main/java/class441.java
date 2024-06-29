import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class441 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "S")
    public static short field6277 = 256;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field6285 = -1;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public int field6279;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public int field6280;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    private int field6283;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "J")
    public static long field6278;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Lwt;")
    public class208 field6286;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Lho;", line = 3)
    public final synchronized class104 method2593(int arg0) {
        field6284++;
        class104 var2 = (class104) this.field6286.field3164.method2982(arg0, (long) this.field6283);
        if (var2 != null) {
            return var2;
        }
        class104 var3 = class104.method767(this.field6286.field3155, this.field6283, 0);
        if (var3 != null) {
            this.field6286.field3164.method2981(var3, arg0 + 110, (long) this.field6283);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLwn;)V", line = 32)
    public final void method2594(byte arg0, class519 arg1) {
        int var3 = 74 / ((-arg0 - 22) / 40);
        while (true) {
            int var4 = arg1.method3072((byte) -125);
            if (var4 == 0) {
                field6288++;
                return;
            }
            this.method2596(0, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V", line = 53)
    public static final void method2595(int arg0, int arg1) {
        field6281++;
        class275 var2 = class213.method1433((byte) 64, arg1, arg0);
        var2.method1774((byte) -52);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILwn;)V", line = 63)
    private final void method2596(int arg0, int arg1, class519 arg2) {
        if (arg0 != 0) {
            this.field6283 = 26;
        }
        if (arg1 == 1) {
            this.field6283 = arg2.method3018(566990904);
        } else if (arg1 == 2) {
            this.field6279 = arg2.method3072((byte) -124);
            this.field6280 = arg2.method3072((byte) -121);
        }
        field6282++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lqa;Z)V", line = 86)
    public static final void method2597(class167 arg0, boolean arg1) {
        field6287++;
        if (class102.field1577 == class364.field5293.field6956 || class461.field6675 == null) {
            return;
        }
        if (arg1) {
            method2598(99);
        }
        if (class522.method3104(class364.field5293.field6956, (byte) 63, arg0)) {
            class102.field1577 = class364.field5293.field6956;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V", line = 106)
    public static final void method2598(int arg0) {
        field6276++;
        int var1 = class452.field6603;
        int[] var2 = class532.field7853;
        int var3 = -67 % ((-arg0 - 42) / 58);
        for (int var4 = 0; var4 < var1; var4++) {
            class510 var10 = class494.field7143[var2[var4]];
            if (var10 != null && var10.field306 > 0) {
                var10.field306--;
                if (var10.field306 == 0) {
                    var10.field239 = null;
                }
            }
        }
        for (int var5 = 0; var5 < class477.field6952; var5++) {
            long var6 = (long) class483.field7012[var5];
            class193 var8 = (class193) class390.field5539.method2284(true, var6);
            if (var8 != null) {
                class279 var9 = var8.field2805;
                if (var9.field306 > 0) {
                    var9.field306--;
                    if (var9.field306 == 0) {
                        var9.field239 = null;
                    }
                }
            }
        }
    }
}
