import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public abstract class class243 {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "[B")
    public byte[] field3148 = new byte[5000];

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public int field3150 = 0;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public volatile int field3152 = 0;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public volatile int field3153 = 0;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public int field3155 = 0;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "[Ljava/lang/Object;")
    public Object[] field3149 = new Object[5000];

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(JJ)J")
    public static long method1403(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZIBIZ)I")
    public static final int method1404(boolean arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        field3151++;
        class472 var5 = class236.method1367(arg3, true, arg4);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field6581.length; var7++) {
            if (var5.field6581[var7] >= 0 && class472.field6588.field4463 > var5.field6581[var7]) {
                class537 var9 = class472.field6588.method1903(var5.field6581[var7], (byte) 63);
                int var10 = var9.method3061(class80.field854.method687(false, arg1).field6198, arg1, 850);
                if (arg0) {
                    var6 += var5.field6587[var7] * var10;
                } else {
                    var6 += var10;
                }
            }
        }
        int var8 = 79 / ((arg2 - 52) / 32);
        return var6;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public abstract void method1405(int arg0);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZLne;)V")
    public abstract void method1406(boolean arg0, class287 arg1);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V")
    public abstract void method1407(int arg0, int arg1);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILne;)V")
    public abstract void method1408(int arg0, class287 arg1);

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(ILne;)V")
    public abstract void method1409(int arg0, class287 arg1);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lmu;Lmu;I)V")
    public static final void method1410(class270 arg0, class270 arg1, int arg2) {
        field3156++;
        if (arg0.field3404 != null) {
            arg0.method1519((byte) 121);
        }
        if (arg2 != 5000) {
            method1410(null, null, -122);
        }
        arg0.field3394 = arg1;
        arg0.field3404 = arg1.field3404;
        arg0.field3404.field3394 = arg0;
        arg0.field3394.field3404 = arg0;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ld;IZI)V")
    public abstract void method1411(class137 arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
    public abstract void method1412(byte arg0);

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)V")
    public abstract void method1413(int arg0, int arg1);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method1414(int arg0, String arg1, boolean arg2) {
        field3154++;
        if (!arg2) {
            class530 var3 = class242.method1402(-62, 3, arg0);
            var3.method3025((byte) -69);
            var3.field7588 = arg1;
        }
    }
}
