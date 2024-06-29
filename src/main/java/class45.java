import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class45 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Z")
    public static boolean field745 = false;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field751 = 1;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "F")
    public static float field746;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
    public static final void method299(int arg0, int arg1, int arg2) {
        field749++;
        if (class241.field4284 != arg2) {
            class259.field4523 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class259.field4523[var3] = (var3 << 12) / arg2;
            }
            class1.field17 = arg2 == 64 ? 2048 : 4096;
            class241.field4284 = arg2;
            class115.field2177 = arg2 - 1;
        }
        if (class113.field2149 != arg0) {
            if (class241.field4284 == arg0) {
                class87.field1652 = class259.field4523;
            } else {
                class87.field1652 = new int[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    class87.field1652[var4] = (var4 << 12) / arg0;
                }
            }
            class231.field4015 = arg0 - 1;
            class113.field2149 = arg0;
        }
        if (arg1 != 8388) {
            method299(120, 7, 62);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(JI)V")
    public static final void method300(long arg0, int arg1) {
        field747++;
        if (arg0 == 0L) {
            return;
        }
        if (class42.field714 >= 100) {
            class155.method1136(98, class85.field1613, 0, class20.field274);
            return;
        }
        class46 var3 = class277.method1862((byte) -64, arg0).method306(true);
        for (int var4 = arg1; var4 < class42.field714; var4++) {
            if (class29.field562[var4] == arg0) {
                class155.method1136(97, class85.field1613, 0, class109.method855(0, new class46[] { var3, class180.field3221 }));
                return;
            }
        }
        for (int var5 = 0; var5 < class97.field1806; var5++) {
            if (class194.field3492[var5] == arg0) {
                class155.method1136(127, class85.field1613, 0, class109.method855(0, new class46[] { class260.field4542, var3, class116.field2196 }));
                return;
            }
        }
        if (var3.method340((byte) 117, class277.field4824.field1528)) {
            class155.method1136(106, class85.field1613, 0, class100.field1845);
            return;
        }
        class29.field562[class42.field714] = arg0;
        class221.field3891[class42.field714++] = class277.method1862((byte) -64, arg0);
        class220.field3867++;
        class14.field219 = class86.field1635;
        class58.field967.method285((byte) -90, 13);
        class58.field967.method578((byte) -127, arg0);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Z")
    public static final boolean method301(int arg0, int arg1) {
        field748++;
        if (arg0 != -27667) {
            method302((byte) -96);
        }
        return (arg1 & 0x546A0424) >> 30 != 0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static final void method302(byte arg0) {
        if (class54.field928 != null) {
            class87 var1 = class54.field928;
            synchronized (class54.field928) {
                class54.field928 = null;
            }
        }
        if (arg0 != 122) {
            method300(14L, 102);
        }
        field750++;
    }
}
