import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class481 {

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public int field7101 = -1;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Ls;")
    public static class186 field7105 = new class186(52, 2);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public int field7094;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public int field7095;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public int field7096;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public int field7098;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public int field7099;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public int field7100;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public int field7103;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public int field7104;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)[Lvg;", line = 13)
    public static final class39[] method2889(byte arg0) {
        if (class417.field6290 == null) {
            class39[] var1 = class467.method2796(class497.field7305, 555814242);
            class39[] var2 = new class39[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class39 var8 = var1[var4];
                if ((var8.field560 <= 0 || var8.field560 >= 24) && var8.field563 >= 800 && var8.field562 >= 600 && (class370.field5418 >= 96 || class133.field2236 != 0 || var8.field563 <= 1024 && var8.field562 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class39 var10 = var2[var9];
                        if (var8.field563 == var10.field563 && var8.field562 == var10.field562) {
                            if (var8.field560 > var10.field560) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class417.field6290 = new class39[var3];
            class394.method2453(var2, 0, class417.field6290, 0, var3);
            int[] var5 = new int[class417.field6290.length];
            for (int var6 = 0; var6 < class417.field6290.length; var6++) {
                class39 var7 = class417.field6290[var6];
                var5[var6] = var7.field563 * var7.field562;
            }
            class138.method1040(class417.field6290, var5, (byte) 17);
        }
        field7097++;
        if (arg0 <= 43) {
            field7105 = null;
        }
        return class417.field6290;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IJ)V", line = 97)
    public static final void method2890(int arg0, long arg1) {
        field7102++;
        class335.field5062.field4399 = 0;
        class335.field5062.method1814(class316.field4791.field2207, true);
        class335.field5062.method1826(arg1, 252);
        class335.field5062.method1814(class146.field2452, true);
        class522.field7580 = 0;
        class393.field6007 = -3;
        class210.field3355 = 1;
        class505.field7373 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 112)
    public static void method2891(int arg0) {
        if (arg0 != -3) {
            method2889((byte) -4);
        }
        field7105 = null;
    }
}
