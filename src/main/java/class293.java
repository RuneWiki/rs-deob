import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class293 {

    @OriginalMember(owner = "client!tha", name = "g", descriptor = "J")
    public static long field4177 = 0L;

    @OriginalMember(owner = "client!tha", name = "m", descriptor = "Lmia;")
    public static class63 field4183 = new class63(34, 3);

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "B")
    public byte field4171;

    @OriginalMember(owner = "client!tha", name = "f", descriptor = "B")
    public byte field4176;

    @OriginalMember(owner = "client!tha", name = "i", descriptor = "B")
    public byte field4179;

    @OriginalMember(owner = "client!tha", name = "j", descriptor = "B")
    public byte field4180;

    @OriginalMember(owner = "client!tha", name = "o", descriptor = "B")
    public byte field4185;

    @OriginalMember(owner = "client!tha", name = "r", descriptor = "B")
    public byte field4188;

    @OriginalMember(owner = "client!tha", name = "w", descriptor = "B")
    public byte field4193;

    @OriginalMember(owner = "client!tha", name = "u", descriptor = "D")
    public static double field4191;

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "I")
    public int field4172;

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!tha", name = "l", descriptor = "I")
    public int field4182;

    @OriginalMember(owner = "client!tha", name = "v", descriptor = "I")
    public int field4192;

    @OriginalMember(owner = "client!tha", name = "e", descriptor = "S")
    public short field4175;

    @OriginalMember(owner = "client!tha", name = "d", descriptor = "Z")
    public boolean field4174;

    @OriginalMember(owner = "client!tha", name = "h", descriptor = "Z")
    public boolean field4178;

    @OriginalMember(owner = "client!tha", name = "k", descriptor = "Z")
    public boolean field4181;

    @OriginalMember(owner = "client!tha", name = "n", descriptor = "Z")
    public boolean field4184;

    @OriginalMember(owner = "client!tha", name = "p", descriptor = "Z")
    public boolean field4186;

    @OriginalMember(owner = "client!tha", name = "q", descriptor = "Z")
    public boolean field4187;

    @OriginalMember(owner = "client!tha", name = "s", descriptor = "Z")
    public boolean field4189;

    @OriginalMember(owner = "client!tha", name = "t", descriptor = "Z")
    public boolean field4190;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 3)
    public static final void method1863(int arg0, String arg1, int arg2) {
        field4173++;
        int var3 = -39 / ((arg0 + 70) / 40);
        int var4 = class254.field3653;
        int[] var5 = class345.field4993;
        boolean var6 = false;
        for (int var7 = 0; var7 < var4; var7++) {
            class689 var8 = class314.field4456[var5[var7]];
            if (var8 != null && class130.field1749 != var8 && var8.field9513 != null && var8.field9513.equalsIgnoreCase(arg1)) {
                var6 = true;
                if (arg2 == 1) {
                    class634.field8877++;
                    class468 var13 = class93.method734(class29.field284, class634.field8894, 8174);
                    var13.field6839.method3727(0, 10061);
                    var13.field6839.method3734(var5[var7], 501927912);
                    class120.method872((byte) 104, var13);
                } else if (arg2 == 4) {
                    class409.field6168++;
                    class468 var12 = class93.method734(class29.field284, class452.field6679, 8174);
                    var12.field6839.method3750(var5[var7], (byte) -69);
                    var12.field6839.method3727(0, 10061);
                    class120.method872((byte) 127, var12);
                } else if (arg2 == 5) {
                    class320.field4522++;
                    class468 var9 = class93.method734(class29.field284, class11.field155, 8174);
                    var9.field6839.method3697(0, 1);
                    var9.field6839.method3706((byte) 82, var5[var7]);
                    class120.method872((byte) -126, var9);
                } else if (arg2 == 6) {
                    class758.field10595++;
                    class468 var10 = class93.method734(class29.field284, class287.field4074, 8174);
                    var10.field6839.method3750(var5[var7], (byte) -69);
                    var10.field6839.method3704(true, 0);
                    class120.method872((byte) 70, var10);
                } else if (arg2 == 7) {
                    class400.field5969++;
                    class468 var11 = class93.method734(class29.field284, class432.field6443, 8174);
                    var11.field6839.method3704(true, 0);
                    var11.field6839.method3702(var5[var7], (byte) -120);
                    class120.method872((byte) 91, var11);
                }
                break;
            }
        }
        if (!var6) {
            class618.method3559(class430.field6391.method2679(class650.field9160, 97) + arg1, false, 4);
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)V", line = 95)
    public static void method1864(int arg0) {
        field4183 = null;
        if (arg0 != 11124) {
            method1864(-61);
        }
    }
}
