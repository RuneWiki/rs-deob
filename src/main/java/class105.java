import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class105 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "J")
    public long field1721 = 0L;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public int field1726;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Leh;")
    public class179 field1723;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Leh;")
    public class179 field1724;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIIB)V", line = 17)
    public static final void method845(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field1731++;
        if (arg4 < 128 || arg6 < 128 || arg4 > 13056 || arg6 > 13056) {
            class57.field866 = -1;
            class136.field2218 = -1;
            return;
        }
        int var8 = class170.method1265(arg4, arg6, class75.field1153, 1) - arg5;
        int var9 = var8 - class332.field5180;
        int var10 = arg4 - class152.field2498;
        int var11 = class40.field619[class43.field683];
        int var12 = class40.field612[class64.field943];
        int var13 = class40.field612[class43.field683];
        int var14 = arg6 - class137.field2239;
        int var15 = class40.field619[class64.field943];
        int var16 = var10 * var15 + var12 * var14 >> 16;
        int var17 = var14 * var15 - (var10 * var12) >> 16;
        int var19 = var9 * var11 - (var13 * var17) >> 16;
        int var20 = var9 * var13 + (var11 * var17) >> 16;
        if (arg7 != 57) {
            method846((String[]) null, 98, (short[]) null, -61, -34);
        }
        if (var20 < 50) {
            class136.field2218 = -1;
            class57.field866 = -1;
        } else if (class162.field2623) {
            int var22 = arg1 * 512 >> 8;
            class57.field866 = var16 * var22 / var20 + arg2;
            int var23 = arg0 * 512 >> 8;
            class136.field2218 = var19 * var23 / var20 + arg3;
        } else {
            class57.field866 = (var16 << 9) / var20 + arg2;
            class136.field2218 = (var19 << 9) / var20 + arg3;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([Ljava/lang/String;I[SII)V", line = 82)
    public static final void method846(String[] arg0, int arg1, short[] arg2, int arg3, int arg4) {
        if (arg4 < arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var8;
            for (int var9 = arg4; var9 < arg3; var9++) {
                if (var7 == null || arg0[var9] != null && (var9 & 0x1) > arg0[var9].compareTo(var7)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var8;
            method846(arg0, arg1, arg2, var6 - 1, arg4);
            method846(arg0, 2, arg2, arg3, var6 + 1);
        }
        if (arg1 == 2) {
            field1728++;
        }
    }
}
